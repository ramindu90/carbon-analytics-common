/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.analytics.permissions.bean;

import org.wso2.carbon.analytics.permissions.internal.impl.DefaultPermissionProvider;
import org.wso2.carbon.config.annotation.Configuration;
import org.wso2.carbon.config.annotation.Element;
import org.wso2.carbon.database.query.manager.config.Queries;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration bean class.
 */
@Configuration(namespace = "wso2.analytics.permissions", description = "WSO2 Analytics Permission Provider")
public class PermissionConfig {

    @Element(description = "Permission provider implementation class")
    private String permissionProvider = DefaultPermissionProvider.class.getName();

    @Element(description = "Permission provider datasource name")
    private String datasourceName = "WSO2_PERMISSIONS_DB";

    @Element(description = "Boolean for permission provider enable or disable")
    private boolean isPermissionDisabled = false;

    @Element(description = "Database queries template array list.")
    List<Queries> queries = new ArrayList<>();

    /**
     * Get permission provider.
     *
     * @return
     */
    public String getPermissionProvider() {
        return permissionProvider;
    }

    /**
     * Set permission provider.
     *
     * @param permissionProvider
     */
    public void setPermissionProvider(String permissionProvider) {
        this.permissionProvider = permissionProvider;
    }

    /**
     * Get datasource name.
     *
     * @return
     */
    public String getDatasourceName() {
        return datasourceName;
    }

    /**
     * Set datasource name.
     *
     * @param datasourceName
     */
    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    /**
     * Get database queries.
     *
     * @return
     */
    public List<Queries> getQueries() {
        return queries;
    }

    /**
     * set permission disabled flag.
     *
     * @return isPemissionDisabled
     */
    public boolean isPermissionDisabled() {
        return isPermissionDisabled;
    }

    /**
     * get permission disabled flag.
     *
     * @param isPermissionDisabled
     */
    public void setPermissionDisabled(boolean isPermissionDisabled) {
        this.isPermissionDisabled = isPermissionDisabled;
    }
}
