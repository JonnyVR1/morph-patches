package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ResourceTriggers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "resourcetriggers";

    @NonNull
    @ProtobufIndex(index = 4)
    public ResourceTriggersAction action;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceKey;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String resourceType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Trigger trigger;
    public static ProtobufAdapter<ResourceTriggers> PROTOBUF_ADAPTER = new MessageNanoAdapter<ResourceTriggers>() { // from class: com.p1.mobile.putong.core.data.ResourceTriggers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ResourceTriggers resourceTriggers) {
            String str = resourceTriggers.resourceKey;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = resourceTriggers.resourceType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            Trigger trigger = resourceTriggers.trigger;
            if (trigger != null) {
                iO += CodedOutputByteBufferNano.l(3, trigger, Trigger.PROTOBUF_ADAPTER);
            }
            ResourceTriggersAction resourceTriggersAction = resourceTriggers.action;
            if (resourceTriggersAction != null) {
                iO += CodedOutputByteBufferNano.l(4, resourceTriggersAction, ResourceTriggersAction.PROTOBUF_ADAPTER);
            }
            ((MessageNano) resourceTriggers).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ResourceTriggers m15427parse(nb5 nb5Var) throws IOException {
            ResourceTriggers resourceTriggers = new ResourceTriggers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (resourceTriggers.resourceKey == null) {
                        resourceTriggers.resourceKey = "";
                    }
                    if (resourceTriggers.resourceType == null) {
                        resourceTriggers.resourceType = "";
                    }
                    if (resourceTriggers.trigger == null) {
                        resourceTriggers.trigger = Trigger.new_();
                    }
                    if (resourceTriggers.action != null) {
                        break;
                    }
                    resourceTriggers.action = ResourceTriggersAction.new_();
                    break;
                }
                if (iU == 10) {
                    resourceTriggers.resourceKey = nb5Var.s();
                } else if (iU == 18) {
                    resourceTriggers.resourceType = nb5Var.s();
                } else if (iU == 26) {
                    resourceTriggers.trigger = (Trigger) nb5Var.l(Trigger.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (resourceTriggers.resourceKey == null) {
                            resourceTriggers.resourceKey = "";
                        }
                        if (resourceTriggers.resourceType == null) {
                            resourceTriggers.resourceType = "";
                        }
                        if (resourceTriggers.trigger == null) {
                            resourceTriggers.trigger = Trigger.new_();
                        }
                        if (resourceTriggers.action != null) {
                            break;
                        }
                        resourceTriggers.action = ResourceTriggersAction.new_();
                        return resourceTriggers;
                    }
                    resourceTriggers.action = (ResourceTriggersAction) nb5Var.l(ResourceTriggersAction.PROTOBUF_ADAPTER);
                }
            }
            return resourceTriggers;
        }

        public void serialize(ResourceTriggers resourceTriggers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = resourceTriggers.resourceKey;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = resourceTriggers.resourceType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            Trigger trigger = resourceTriggers.trigger;
            if (trigger != null) {
                codedOutputByteBufferNano.K(3, trigger, Trigger.PROTOBUF_ADAPTER);
            }
            ResourceTriggersAction resourceTriggersAction = resourceTriggers.action;
            if (resourceTriggersAction != null) {
                codedOutputByteBufferNano.K(4, resourceTriggersAction, ResourceTriggersAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ResourceTriggers> JSON_ADAPTER = new ObjectJsonAdapter<ResourceTriggers>() { // from class: com.p1.mobile.putong.core.data.ResourceTriggers.2
        public Class getDataClass() {
            return ResourceTriggers.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ResourceTriggers m15428newInstance() {
            return new ResourceTriggers();
        }

        public boolean parseField(ResourceTriggers resourceTriggers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    resourceTriggers.action = (ResourceTriggersAction) ResourceTriggersAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "trigger":
                    resourceTriggers.trigger = (Trigger) Trigger.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "resourceType":
                    resourceTriggers.resourceType = jsonParser.getValueAsString();
                    return true;
                case "resourceKey":
                    resourceTriggers.resourceKey = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ResourceTriggers resourceTriggers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                case "trigger":
                case "resourceType":
                case "resourceKey":
                    return true;
                default:
                    return super.parseFieldCheck(resourceTriggers, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ResourceTriggers resourceTriggers, JsonGenerator jsonGenerator) throws IOException {
            String str = resourceTriggers.resourceKey;
            if (str != null) {
                jsonGenerator.writeStringField("resourceKey", str);
            }
            String str2 = resourceTriggers.resourceType;
            if (str2 != null) {
                jsonGenerator.writeStringField("resourceType", str2);
            }
            if (resourceTriggers.trigger != null) {
                jsonGenerator.writeFieldName(Trigger.TYPE);
                Trigger.JSON_ADAPTER.serialize(resourceTriggers.trigger, jsonGenerator, true);
            }
            if (resourceTriggers.action != null) {
                jsonGenerator.writeFieldName("action");
                ResourceTriggersAction.JSON_ADAPTER.serialize(resourceTriggers.action, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ResourceTriggers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ResourceTriggers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ResourceTriggers new_() {
        ResourceTriggers resourceTriggers = new ResourceTriggers();
        resourceTriggers.nullCheck();
        return resourceTriggers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ResourceTriggers m15426clone() {
        ResourceTriggers resourceTriggers = new ResourceTriggers();
        resourceTriggers.resourceKey = this.resourceKey;
        resourceTriggers.resourceType = this.resourceType;
        Trigger trigger = this.trigger;
        if (trigger != null) {
            resourceTriggers.trigger = trigger.m16039clone();
        }
        ResourceTriggersAction resourceTriggersAction = this.action;
        if (resourceTriggersAction != null) {
            resourceTriggers.action = resourceTriggersAction.m15430clone();
        }
        return resourceTriggers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceTriggers)) {
            return false;
        }
        ResourceTriggers resourceTriggers = (ResourceTriggers) obj;
        return ValueObject.util_equals(this.resourceKey, resourceTriggers.resourceKey) && ValueObject.util_equals(this.resourceType, resourceTriggers.resourceType) && ValueObject.util_equals(this.trigger, resourceTriggers.trigger) && ValueObject.util_equals(this.action, resourceTriggers.action);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.resourceKey;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.resourceType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Trigger trigger = this.trigger;
        int iHashCode3 = (iHashCode2 + (trigger != null ? trigger.hashCode() : 0)) * 41;
        ResourceTriggersAction resourceTriggersAction = this.action;
        int iHashCode4 = iHashCode3 + (resourceTriggersAction != null ? resourceTriggersAction.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.resourceKey == null) {
            this.resourceKey = "";
        }
        if (this.resourceType == null) {
            this.resourceType = "";
        }
        if (this.trigger == null) {
            this.trigger = Trigger.new_();
        }
        if (this.action == null) {
            this.action = ResourceTriggersAction.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
