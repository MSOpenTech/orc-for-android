/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.sampleservice;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Sample Complex Type.
*/
public class SampleComplexType extends ODataBaseEntity {

    public SampleComplexType(){
        setODataType("#Microsoft.SampleService.SampleComplexType");
    }

    private String Name;

    /**
    * Gets the Name.
    *
    * @return the String
    */
    public String getName() {
        return this.Name; 
    }

    /**
    * Sets the Name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.Name = value;
        valueChanged("Name", value);

    }

    private String AnotherProperty;

    /**
    * Gets the Another Property.
    *
    * @return the String
    */
    public String getAnotherProperty() {
        return this.AnotherProperty; 
    }

    /**
    * Sets the Another Property.
    *
    * @param value the String
    */
    public void setAnotherProperty(String value) { 
        this.AnotherProperty = value;
        valueChanged("AnotherProperty", value);

    }
}
