// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class InventoryConfiguration extends TeaModel {
    @NameInMap("Destination")
    public InventoryDestination destination;

    @NameInMap("Filter")
    public InventoryFilter filter;

    /**
     * <strong>example:</strong>
     * <p>report1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>Current</p>
     */
    @NameInMap("IncludedObjectVersions")
    public String includedObjectVersions;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("OptionalFields")
    public OptionalFields optionalFields;

    @NameInMap("Schedule")
    public InventorySchedule schedule;

    public static InventoryConfiguration build(java.util.Map<String, ?> map) throws Exception {
        InventoryConfiguration self = new InventoryConfiguration();
        return TeaModel.build(map, self);
    }

    public InventoryConfiguration setDestination(InventoryDestination destination) {
        this.destination = destination;
        return this;
    }
    public InventoryDestination getDestination() {
        return this.destination;
    }

    public InventoryConfiguration setFilter(InventoryFilter filter) {
        this.filter = filter;
        return this;
    }
    public InventoryFilter getFilter() {
        return this.filter;
    }

    public InventoryConfiguration setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public InventoryConfiguration setIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
        return this;
    }
    public String getIncludedObjectVersions() {
        return this.includedObjectVersions;
    }

    public InventoryConfiguration setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public InventoryConfiguration setOptionalFields(OptionalFields optionalFields) {
        this.optionalFields = optionalFields;
        return this;
    }
    public OptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    public InventoryConfiguration setSchedule(InventorySchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public InventorySchedule getSchedule() {
        return this.schedule;
    }

    public static class OptionalFields extends TeaModel {
        @NameInMap("Field")
        public java.util.List<String> fields;

        public static OptionalFields build(java.util.Map<String, ?> map) throws Exception {
            OptionalFields self = new OptionalFields();
            return TeaModel.build(map, self);
        }

        public OptionalFields setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

    }

}
