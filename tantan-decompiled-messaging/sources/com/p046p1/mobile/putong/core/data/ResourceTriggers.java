package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ResourceTriggers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "resourcetriggers";

    @NonNull
    @ProtobufIndex(index = 4)
    public ResourceTriggersAction action;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceKey;

    @NonNull
    @ProtobufIndex(index = 2)
    public String resourceType;

    @NonNull
    @ProtobufIndex(index = 3)
    public Trigger trigger;
    public static ProtobufAdapter<ResourceTriggers> PROTOBUF_ADAPTER = new MessageNanoAdapter<ResourceTriggers>() { // from class: com.p1.mobile.putong.core.data.ResourceTriggers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ResourceTriggers resourceTriggers) {
            String str = resourceTriggers.resourceKey;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = resourceTriggers.resourceType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            Trigger trigger = resourceTriggers.trigger;
            if (trigger != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, trigger, Trigger.PROTOBUF_ADAPTER);
            }
            ResourceTriggersAction resourceTriggersAction = resourceTriggers.action;
            if (resourceTriggersAction != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, resourceTriggersAction, ResourceTriggersAction.PROTOBUF_ADAPTER);
            }
            resourceTriggers.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ResourceTriggers parse(nb5 nb5Var) throws IOException {
            ResourceTriggers resourceTriggers = new ResourceTriggers();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    resourceTriggers.resourceKey = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    resourceTriggers.resourceType = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    resourceTriggers.trigger = (Trigger) nb5Var.m158743l(Trigger.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 34) {
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
                    resourceTriggers.action = (ResourceTriggersAction) nb5Var.m158743l(ResourceTriggersAction.PROTOBUF_ADAPTER);
                }
            }
            return resourceTriggers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ResourceTriggers resourceTriggers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = resourceTriggers.resourceKey;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = resourceTriggers.resourceType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            Trigger trigger = resourceTriggers.trigger;
            if (trigger != null) {
                codedOutputByteBufferNano.m17254K(3, trigger, Trigger.PROTOBUF_ADAPTER);
            }
            ResourceTriggersAction resourceTriggersAction = resourceTriggers.action;
            if (resourceTriggersAction != null) {
                codedOutputByteBufferNano.m17254K(4, resourceTriggersAction, ResourceTriggersAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ResourceTriggers> JSON_ADAPTER = new ObjectJsonAdapter<ResourceTriggers>() { // from class: com.p1.mobile.putong.core.data.ResourceTriggers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ResourceTriggers.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ResourceTriggers newInstance() {
            return new ResourceTriggers();
        }

        public boolean parseField(ResourceTriggers resourceTriggers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    resourceTriggers.action = ResourceTriggersAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "trigger":
                    resourceTriggers.trigger = Trigger.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ResourceTriggers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ResourceTriggers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ResourceTriggers new_() {
        ResourceTriggers resourceTriggers = new ResourceTriggers();
        resourceTriggers.nullCheck();
        return resourceTriggers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ResourceTriggers mo223809clone() {
        ResourceTriggers resourceTriggers = new ResourceTriggers();
        resourceTriggers.resourceKey = this.resourceKey;
        resourceTriggers.resourceType = this.resourceType;
        Trigger trigger = this.trigger;
        if (trigger != null) {
            resourceTriggers.trigger = trigger.mo223809clone();
        }
        ResourceTriggersAction resourceTriggersAction = this.action;
        if (resourceTriggersAction != null) {
            resourceTriggers.action = resourceTriggersAction.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
