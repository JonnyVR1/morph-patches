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
public class TriggersActionResourceData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "triggersactionresourcedata";

    @ProtobufIndex(index = 1)
    public int code;

    @NonNull
    @ProtobufIndex(index = 3)
    public ResourceData data;

    @NonNull
    @ProtobufIndex(index = 2)
    public String message;
    public static ProtobufAdapter<TriggersActionResourceData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TriggersActionResourceData>() { // from class: com.p1.mobile.putong.core.data.TriggersActionResourceData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TriggersActionResourceData triggersActionResourceData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, triggersActionResourceData.code);
            String str = triggersActionResourceData.message;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            ResourceData resourceData = triggersActionResourceData.data;
            if (resourceData != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, resourceData, ResourceData.PROTOBUF_ADAPTER);
            }
            triggersActionResourceData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TriggersActionResourceData parse(nb5 nb5Var) throws IOException {
            TriggersActionResourceData triggersActionResourceData = new TriggersActionResourceData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (triggersActionResourceData.message == null) {
                        triggersActionResourceData.message = "";
                    }
                    if (triggersActionResourceData.data != null) {
                        break;
                    }
                    triggersActionResourceData.data = ResourceData.new_();
                    break;
                }
                if (iM158752u == 8) {
                    triggersActionResourceData.code = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    triggersActionResourceData.message = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (triggersActionResourceData.message == null) {
                            triggersActionResourceData.message = "";
                        }
                        if (triggersActionResourceData.data != null) {
                            break;
                        }
                        triggersActionResourceData.data = ResourceData.new_();
                        return triggersActionResourceData;
                    }
                    triggersActionResourceData.data = (ResourceData) nb5Var.m158743l(ResourceData.PROTOBUF_ADAPTER);
                }
            }
            return triggersActionResourceData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TriggersActionResourceData triggersActionResourceData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, triggersActionResourceData.code);
            String str = triggersActionResourceData.message;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            ResourceData resourceData = triggersActionResourceData.data;
            if (resourceData != null) {
                codedOutputByteBufferNano.m17254K(3, resourceData, ResourceData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TriggersActionResourceData> JSON_ADAPTER = new ObjectJsonAdapter<TriggersActionResourceData>() { // from class: com.p1.mobile.putong.core.data.TriggersActionResourceData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TriggersActionResourceData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TriggersActionResourceData newInstance() {
            return new TriggersActionResourceData();
        }

        public boolean parseField(TriggersActionResourceData triggersActionResourceData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "code":
                    triggersActionResourceData.code = jsonParser.getValueAsInt();
                    return true;
                case "data":
                    triggersActionResourceData.data = ResourceData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "message":
                    triggersActionResourceData.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TriggersActionResourceData triggersActionResourceData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "code":
                case "data":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(triggersActionResourceData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TriggersActionResourceData triggersActionResourceData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", triggersActionResourceData.code);
            String str = triggersActionResourceData.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            if (triggersActionResourceData.data != null) {
                jsonGenerator.writeFieldName("data");
                ResourceData.JSON_ADAPTER.serialize(triggersActionResourceData.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggersActionResourceData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggersActionResourceData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TriggersActionResourceData new_() {
        TriggersActionResourceData triggersActionResourceData = new TriggersActionResourceData();
        triggersActionResourceData.nullCheck();
        return triggersActionResourceData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TriggersActionResourceData mo223809clone() {
        TriggersActionResourceData triggersActionResourceData = new TriggersActionResourceData();
        triggersActionResourceData.code = this.code;
        triggersActionResourceData.message = this.message;
        ResourceData resourceData = this.data;
        if (resourceData != null) {
            triggersActionResourceData.data = resourceData.mo223809clone();
        }
        return triggersActionResourceData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggersActionResourceData)) {
            return false;
        }
        TriggersActionResourceData triggersActionResourceData = (TriggersActionResourceData) obj;
        return this.code == triggersActionResourceData.code && ValueObject.util_equals(this.message, triggersActionResourceData.message) && ValueObject.util_equals(this.data, triggersActionResourceData.data);
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
        int i2 = ((i * 41) + this.code) * 41;
        String str = this.message;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ResourceData resourceData = this.data;
        int iHashCode2 = iHashCode + (resourceData != null ? resourceData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
        if (this.data == null) {
            this.data = ResourceData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
