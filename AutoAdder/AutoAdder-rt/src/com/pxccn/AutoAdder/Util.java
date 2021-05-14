package com.pxccn.AutoAdder;

import com.tridium.sys.Nre;
import com.tridium.sys.module.NModule;

import javax.baja.nre.platform.RuntimeProfile;
import javax.baja.sys.BValue;
import java.util.HashMap;
import java.util.Map;

public class Util {
    static Map<String, NModule> moduleMap = new HashMap<>();

    /**
     * 获取Module
     *
     * @param m
     * @return
     */
    public static NModule getRtModule(String m) {
        if (moduleMap.containsKey(m)) {
            return moduleMap.get(m);
        }
        NModule[] ret = Nre.getModuleManager().loadModuleParts(m);
        NModule rtModule = null;
        for (NModule module : ret) {
            if (module.getRuntimeProfile() == RuntimeProfile.rt) {
                rtModule = module;
            }
        }
        moduleMap.put(m, rtModule);
        return rtModule;
    }
    
    public static BValue getNewBValueInstance(String m,String t){
        NModule rtModule = Util.getRtModule(m);
        return (BValue)rtModule.getType(t).getInstance();
    } 
    
}
