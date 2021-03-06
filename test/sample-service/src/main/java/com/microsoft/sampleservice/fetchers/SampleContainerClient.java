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
package com.microsoft.sampleservice.fetchers;

import com.microsoft.sampleservice.*;
import com.microsoft.services.orc.core.*;

/**
 * The type SampleContainerClient.
 */
public class SampleContainerClient extends BaseOrcContainer {

     /**
     * Instantiates a new SampleContainerClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public SampleContainerClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public SampleContainerClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public SampleContainerClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

     /**
     * Gets SampleEntity.
     *
     * @return the SampleEntity
     */
    public OrcCollectionFetcher<SampleEntity, SampleEntityFetcher, SampleEntityCollectionOperations> getServices() {
        return new OrcCollectionFetcher<SampleEntity, SampleEntityFetcher, SampleEntityCollectionOperations>("services", this, SampleEntity.class,SampleEntityCollectionOperations.class);
    }
     /**
     * Gets Me.
     *
     * @return the Me
     */
    public SampleEntityFetcher getMe() {
        return new SampleEntityFetcher("Me", this);
    }
}