/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.api.builder.model;

import java.util.Map;

/**
 * KieModuleModel is a model allowing to programmatically define a KieModule
 * @see org.kie.api.builder.KieModule
 */
public interface KieModuleModel {

    /**
     * Creates a new KieBaseModel with the given name and adds it to this KieModuleModel
     * @param name The name of the new KieBaseModel to be created
     * @return The new KieBaseModel
     */
    KieBaseModel newKieBaseModel(String name);

    /**
     * Removes the KieBaseModel with the give name from this KieModuleModel
     * @param name The name of the KieBaseModel to be removed
     */
    void removeKieBaseModel(String name);

    /**
     * Returns all the KieBaseModel defined in this KieModuleModel mapped by their names
     */
    Map<String, KieBaseModel> getKieBaseModels();

    /**
     * Provides an XML representation of this KieModuleModel
     * @return
     */
    String toXML();
}