/*
 * Classname:   BEnumTest
 *
 * Version:     1.0
 *
 * Date:        5/15/2021
 *
 * Copyright (c) 2021 PHOENIX CONTACT
 */

package com.pxccn.AutoAdder.testModule;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * TODO Description
 *
 * @author songyantao@phoenixcontact.com.cn
 * @version 1.0
 * @since 5/15/2021
 */

@NiagaraEnum
        (
                range = {
                        @Range("val1"),
                        @Range("val2")
                },
                defaultValue = "val1"
        )
@NiagaraType
public final class BEnumTest extends BFrozenEnum {
    //region Slotomatic   
    
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.pxccn.AutoAdder.testModule.BEnumTest(3394046341)1.0$ @*/
/* Generated Sat May 15 16:55:24 CST 2021 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for val1. */
  public static final int VAL_1 = 0;
  /** Ordinal value for val2. */
  public static final int VAL_2 = 1;
  
  /** BEnumTest constant for val1. */
  public static final BEnumTest val1 = new BEnumTest(VAL_1);
  /** BEnumTest constant for val2. */
  public static final BEnumTest val2 = new BEnumTest(VAL_2);
  
  /** Factory method with ordinal. */
  public static BEnumTest make(int ordinal)
  {
    return (BEnumTest)val1.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BEnumTest make(String tag)
  {
    return (BEnumTest)val1.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BEnumTest(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BEnumTest DEFAULT = val1;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BEnumTest.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    //endregion Slotomatic
}