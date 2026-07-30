package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ResourceTriggersAction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "resourcetriggersaction";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public ActionParams params;
    public static ProtobufAdapter<ResourceTriggersAction> PROTOBUF_ADAPTER = new MessageNanoAdapter<ResourceTriggersAction>() { // from class: com.p1.mobile.putong.core.data.ResourceTriggersAction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ResourceTriggersAction resourceTriggersAction) {
            String str = resourceTriggersAction.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            ActionParams actionParams = resourceTriggersAction.params;
            if (actionParams != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, actionParams, ActionParams.PROTOBUF_ADAPTER);
            }
            resourceTriggersAction.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ResourceTriggersAction parse(nc5 nc5Var) throws IOException {
            ResourceTriggersAction resourceTriggersAction = new ResourceTriggersAction();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (resourceTriggersAction.name == null) {
                        resourceTriggersAction.name = "";
                    }
                    if (resourceTriggersAction.params != null) {
                        break;
                    }
                    resourceTriggersAction.params = ActionParams.new_();
                    break;
                }
                if (iM162497u == 10) {
                    resourceTriggersAction.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (resourceTriggersAction.name == null) {
                            resourceTriggersAction.name = "";
                        }
                        if (resourceTriggersAction.params != null) {
                            break;
                        }
                        resourceTriggersAction.params = ActionParams.new_();
                        return resourceTriggersAction;
                    }
                    resourceTriggersAction.params = (ActionParams) nc5Var.m162488l(ActionParams.PROTOBUF_ADAPTER);
                }
            }
            return resourceTriggersAction;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ResourceTriggersAction resourceTriggersAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = resourceTriggersAction.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            ActionParams actionParams = resourceTriggersAction.params;
            if (actionParams != null) {
                codedOutputByteBufferNano.m17309K(2, actionParams, ActionParams.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ResourceTriggersAction> JSON_ADAPTER = new ObjectJsonAdapter<ResourceTriggersAction>() { // from class: com.p1.mobile.putong.core.data.ResourceTriggersAction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ResourceTriggersAction.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ResourceTriggersAction newInstance() {
            return new ResourceTriggersAction();
        }

        public boolean parseField(ResourceTriggersAction resourceTriggersAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(CommandMessage.PARAMS)) {
                resourceTriggersAction.params = ActionParams.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            resourceTriggersAction.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ResourceTriggersAction resourceTriggersAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(CommandMessage.PARAMS) || str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(resourceTriggersAction, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ResourceTriggersAction resourceTriggersAction, JsonGenerator jsonGenerator) throws IOException {
            String str = resourceTriggersAction.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (resourceTriggersAction.params != null) {
                jsonGenerator.writeFieldName(CommandMessage.PARAMS);
                ActionParams.JSON_ADAPTER.serialize(resourceTriggersAction.params, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ResourceTriggersAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ResourceTriggersAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ResourceTriggersAction new_() {
        ResourceTriggersAction resourceTriggersAction = new ResourceTriggersAction();
        resourceTriggersAction.nullCheck();
        return resourceTriggersAction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ResourceTriggersAction mo225055clone() {
        ResourceTriggersAction resourceTriggersAction = new ResourceTriggersAction();
        resourceTriggersAction.name = this.name;
        ActionParams actionParams = this.params;
        if (actionParams != null) {
            resourceTriggersAction.params = actionParams.mo225055clone();
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ActionParams actionParams = this.params;
        int iHashCode2 = iHashCode + (actionParams != null ? actionParams.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.params == null) {
            this.params = ActionParams.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
