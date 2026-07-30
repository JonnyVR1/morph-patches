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
public class ResourceTriggersAction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "resourcetriggersaction";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ActionParams params;
    public static ProtobufAdapter<ResourceTriggersAction> PROTOBUF_ADAPTER = new MessageNanoAdapter<ResourceTriggersAction>() { // from class: com.p1.mobile.putong.core.data.ResourceTriggersAction.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ResourceTriggersAction resourceTriggersAction) {
            String str = resourceTriggersAction.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ActionParams actionParams = resourceTriggersAction.params;
            if (actionParams != null) {
                iO += CodedOutputByteBufferNano.l(2, actionParams, ActionParams.PROTOBUF_ADAPTER);
            }
            ((MessageNano) resourceTriggersAction).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ResourceTriggersAction m15431parse(nb5 nb5Var) throws IOException {
            ResourceTriggersAction resourceTriggersAction = new ResourceTriggersAction();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (resourceTriggersAction.name == null) {
                        resourceTriggersAction.name = "";
                    }
                    if (resourceTriggersAction.params != null) {
                        break;
                    }
                    resourceTriggersAction.params = ActionParams.new_();
                    break;
                }
                if (iU == 10) {
                    resourceTriggersAction.name = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (resourceTriggersAction.name == null) {
                            resourceTriggersAction.name = "";
                        }
                        if (resourceTriggersAction.params != null) {
                            break;
                        }
                        resourceTriggersAction.params = ActionParams.new_();
                        return resourceTriggersAction;
                    }
                    resourceTriggersAction.params = (ActionParams) nb5Var.l(ActionParams.PROTOBUF_ADAPTER);
                }
            }
            return resourceTriggersAction;
        }

        public void serialize(ResourceTriggersAction resourceTriggersAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = resourceTriggersAction.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            ActionParams actionParams = resourceTriggersAction.params;
            if (actionParams != null) {
                codedOutputByteBufferNano.K(2, actionParams, ActionParams.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ResourceTriggersAction> JSON_ADAPTER = new ObjectJsonAdapter<ResourceTriggersAction>() { // from class: com.p1.mobile.putong.core.data.ResourceTriggersAction.2
        public Class getDataClass() {
            return ResourceTriggersAction.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ResourceTriggersAction m15432newInstance() {
            return new ResourceTriggersAction();
        }

        public boolean parseField(ResourceTriggersAction resourceTriggersAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("params")) {
                resourceTriggersAction.params = (ActionParams) ActionParams.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("name")) {
                return false;
            }
            resourceTriggersAction.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ResourceTriggersAction resourceTriggersAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("params") || str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(resourceTriggersAction, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ResourceTriggersAction resourceTriggersAction, JsonGenerator jsonGenerator) throws IOException {
            String str = resourceTriggersAction.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            if (resourceTriggersAction.params != null) {
                jsonGenerator.writeFieldName("params");
                ActionParams.JSON_ADAPTER.serialize(resourceTriggersAction.params, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ResourceTriggersAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ResourceTriggersAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ResourceTriggersAction new_() {
        ResourceTriggersAction resourceTriggersAction = new ResourceTriggersAction();
        resourceTriggersAction.nullCheck();
        return resourceTriggersAction;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ResourceTriggersAction m15430clone() {
        ResourceTriggersAction resourceTriggersAction = new ResourceTriggersAction();
        resourceTriggersAction.name = this.name;
        ActionParams actionParams = this.params;
        if (actionParams != null) {
            resourceTriggersAction.params = actionParams.m11508clone();
        }
        return resourceTriggersAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceTriggersAction)) {
            return false;
        }
        ResourceTriggersAction resourceTriggersAction = (ResourceTriggersAction) obj;
        return ValueObject.util_equals(this.name, resourceTriggersAction.name) && ValueObject.util_equals(this.params, resourceTriggersAction.params);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ActionParams actionParams = this.params;
        int iHashCode2 = iHashCode + (actionParams != null ? actionParams.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.params == null) {
            this.params = ActionParams.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
