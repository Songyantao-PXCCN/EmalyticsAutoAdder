package com.pxccn.AutoAdder;/*
 * Classname:   com.pxccn.AutoAdder.BXML_Adder
 *
 * Version:     1.0
 *
 * Date:        5/14/2021
 *
 * Copyright (c) 2021 PHOENIX CONTACT
 */

import com.tridium.nre.util.IElement;

import javax.baja.nre.annotations.Facet;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import javax.baja.xml.XElem;
import javax.baja.xml.XException;
import javax.baja.xml.XParser;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * TODO Description
 *
 * @author songyantao@phoenixcontact.com.cn
 * @version 1.0
 * @since 5/14/2021
 */

@NiagaraType
@NiagaraAction(name = "test", defaultValue = "BString.DEFAULT", parameterType = "BString", facets = {@Facet(name = "BFacets.MULTI_LINE", value = "BBoolean.TRUE")})
public class BXML_Adder extends BComponent {


    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.pxccn.AutoAdder.BXML_Adder(1713428973)1.0$ @*/
    /* Generated Fri May 14 14:17:02 CST 2021 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Action "test"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code test} action.
     *
     * @see #test(BString parameter)
     */
    public static final Action test = newAction(0, BString.DEFAULT, BFacets.make(BFacets.MULTI_LINE, BBoolean.TRUE));

    /**
     * Invoke the {@code test} action.
     *
     * @see #test
     */
    public void test(BString parameter) {
        invoke(test, parameter, null);
    }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() {
        return TYPE;
    }

    public static final Type TYPE = Sys.loadType(BXML_Adder.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


    public void doTest(BString v) throws Exception {
        OperateDecoder decoder =new OperateDecoder(v.toString());
        decoder.readHeader();
        decoder.doIt(getRootComponent());
    }

    BComponent getRootComponent() {
        return (BComponent) this.getParent();
    }

    private Logger log = Logger.getLogger(getClass().getSimpleName());

    public BXML_Adder() {
    }

    public static final String VERSION = "0.01";

    public static class OperateDecoder {
        private OperateElement root;

        public OperateDecoder(String xml) throws Exception {
            this.root = OperateElement.make(XParser.make(xml).parse());
        }

        public void readHeader() throws Exception {
            if (!this.root.name().equals("EmalyticsAutoWorker")) {
                throw new RuntimeException("Root element must be \"EmalyticsAutoWorker\"");
            }
            String ver = this.root.get("version");
            if (!ver.equals(VERSION)) {
                throw new RuntimeException("Unsupported version (" + ver + "): supported version is " + VERSION);
            }
        }

        public void doIt(BComponent rootComponent) {
            for (OperateElement n : this.root.nextDeepOperateElements()) {
                doProcess(rootComponent, n);
            }
        }

        static void doProcess(BValue currentCursor, OperateElement element) {
            Op.valueOf(element.getOpCode()).doIt.Process(currentCursor, element);
        }

        static void goNext(BValue currentCursor, OperateElement element) {
            for (OperateElement n : element.nextDeepOperateElements()) {
                doProcess(currentCursor, n);
            }
        }

        enum Op {
            createComponent((currentCursor, element) -> {
                CreateComponentElement e = CreateComponentElement.make(element);
                BValue instance = Util.getNewBValueInstance(e.moduleName, e.typeName);
                goNext(instance, element);
                ((BComponent) currentCursor).add(e.slotName, instance, e.flag);
            });

            final Handler doIt;
            Op(Handler doIt) {
                this.doIt = doIt;
            }
        }

        interface Handler {
            void Process(BValue currentCursor, OperateElement element);
        }

    }

    public static class CreateComponentElement extends OperateElement {

        private CreateComponentElement(XElem elem) {
            super(elem);
            this.moduleName = this.get("m");
            this.typeName = this.get("t");
            this.slotName = this.get("n");
            this.flag = this.geti("f",0);
        }

        public static CreateComponentElement make(OperateElement elem) {
            return elem == null ? null : new CreateComponentElement(elem.getXmlElement());
        }

        public final String moduleName;
        public final String typeName;
        public final String slotName;
        public final int flag;
    }

    public static class OperateElement implements IElement {
        private final XElem elem;

        private OperateElement(XElem elem) {
            this.elem = elem;
        }

        public static OperateElement make(XElem elem) {
            return elem == null ? null : new OperateElement(elem);
        }

        public String getOpCode() {
            return this.name();
        }

        public List<OperateElement> nextDeepOperateElements() {
            List<OperateElement> ret = new ArrayList<>();
            for (XElem e : this.elem.elems()) {
                ret.add(OperateElement.make(e));
            }
            return ret;
        }


        public String name() {
            return this.elem.name();
        }

        public String get(String attrName) {
            return this.elem.get(attrName);
        }

        public String get(String attrName, String def) {
            return this.elem.get(attrName, def);
        }

        public int geti(String attrName) {
            return this.elem.geti(attrName);
        }

        public int geti(String attrName, int def) {
            return this.elem.geti(attrName, def);
        }

        public double getd(String attrName) {
            return this.elem.getd(attrName);
        }

        public double getd(String attrName, double def) {
            return this.elem.getd(attrName, def);
        }

        public float getf(String attrName) {
            return this.elem.getf(attrName);
        }

        public float getf(String attrName, float def) {
            return this.elem.getf(attrName, def);
        }

        public long getl(String attrName) {
            return this.elem.getl(attrName);
        }

        public long getl(String attrName, long def) {
            return this.elem.getl(attrName, def);
        }

        public int attrSize() {
            return this.elem.attrSize();
        }

        public String attrName(int index) {
            return this.elem.attrName(index);
        }

        public String attrValue(int index) {
            return this.elem.attrValue(index);
        }

        public IElement copy() {
            return make(this.elem.copy());
        }

        public String toString() {
            return this.elem.toString();
        }

        public XElem getXmlElement() {
            return this.elem;
        }
    }


}