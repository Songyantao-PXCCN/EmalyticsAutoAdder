/*
 * Classname:   BTest1
 *
 * Version:     1.0
 *
 * Date:        5/14/2021
 *
 * Copyright (c) 2021 PHOENIX CONTACT
 */

package com.pxccn.AutoAdder.testModule;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.util.logging.Logger;

/**
 * TODO Description
 *
 * @author songyantao@phoenixcontact.com.cn
 * @version 1.0
 * @since 5/14/2021
 */

@NiagaraType
@NiagaraProperty(name = "boolField", type = "boolean", defaultValue = "false")
@NiagaraProperty(name = "strField", type = "String", defaultValue = "")
@NiagaraProperty(name = "intField", type = "int", defaultValue = "0")
public class BTest1 extends BComponent {
    
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.pxccn.AutoAdder.testModule.BTest1(2905170715)1.0$ @*/
/* Generated Fri May 14 21:45:49 CST 2021 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "boolField"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code boolField} property.
   * @see #getBoolField
   * @see #setBoolField
   */
  public static final Property boolField = newProperty(0, false, null);
  
  /**
   * Get the {@code boolField} property.
   * @see #boolField
   */
  public boolean getBoolField() { return getBoolean(boolField); }
  
  /**
   * Set the {@code boolField} property.
   * @see #boolField
   */
  public void setBoolField(boolean v) { setBoolean(boolField, v, null); }

////////////////////////////////////////////////////////////////
// Property "strField"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code strField} property.
   * @see #getStrField
   * @see #setStrField
   */
  public static final Property strField = newProperty(0, "", null);
  
  /**
   * Get the {@code strField} property.
   * @see #strField
   */
  public String getStrField() { return getString(strField); }
  
  /**
   * Set the {@code strField} property.
   * @see #strField
   */
  public void setStrField(String v) { setString(strField, v, null); }

////////////////////////////////////////////////////////////////
// Property "intField"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code intField} property.
   * @see #getIntField
   * @see #setIntField
   */
  public static final Property intField = newProperty(0, 0, null);
  
  /**
   * Get the {@code intField} property.
   * @see #intField
   */
  public int getIntField() { return getInt(intField); }
  
  /**
   * Set the {@code intField} property.
   * @see #intField
   */
  public void setIntField(int v) { setInt(intField, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTest1.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    @Override
    public void started() throws Exception {
        super.started();
    }

    @Override
    public void changed(Property property, Context context) {
        if (!this.isRunning()) {
            return;
        }
    }


    private Logger log = Logger.getLogger(getClass().getSimpleName());

    public BTest1() {
    }
}