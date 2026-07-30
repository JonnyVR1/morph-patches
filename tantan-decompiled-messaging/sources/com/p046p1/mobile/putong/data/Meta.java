package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MetaError;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class Meta extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "meta";

    @ProtobufIndex(index = 1)
    public int code;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<MetaError> errors;

    @Nullable
    @ProtobufIndex(index = 3)
    public String message;

    @ProtobufIndex(index = 4)
    public int subCode;

    @NonNull
    @ProtobufIndex(index = 5)
    public String subMsg;
    public static ProtobufAdapter<Meta> PROTOBUF_ADAPTER = new MessageNanoAdapter<Meta>() { // from class: com.p1.mobile.putong.data.Meta.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Meta meta) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, meta.code);
            List<MetaError> list = meta.errors;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, MetaError.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = meta.message;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(4, meta.subCode);
            String str2 = meta.subMsg;
            if (str2 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            meta.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Meta parse(nb5 nb5Var) throws IOException {
            Meta meta = new Meta();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (meta.subMsg != null) {
                        break;
                    }
                    meta.subMsg = "";
                    break;
                }
                if (iM158752u == 8) {
                    meta.code = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    meta.errors = (List) nb5Var.m158743l(MetaError.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    meta.message = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    meta.subCode = nb5Var.m158741j();
                } else {
                    if (iM158752u != 42) {
                        if (meta.subMsg != null) {
                            break;
                        }
                        meta.subMsg = "";
                        return meta;
                    }
                    meta.subMsg = nb5Var.m158750s();
                }
            }
            return meta;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Meta meta, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, meta.code);
            List<MetaError> list = meta.errors;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, MetaError.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = meta.message;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
            codedOutputByteBufferNano.m17250G(4, meta.subCode);
            String str2 = meta.subMsg;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
        }
    };
    public static JsonAdapter<Meta> JSON_ADAPTER = new ObjectJsonAdapter<Meta>() { // from class: com.p1.mobile.putong.data.Meta.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Meta.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Meta newInstance() {
            return new Meta();
        }

        public boolean parseField(Meta meta, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subCode":
                    meta.subCode = jsonParser.getValueAsInt();
                    return true;
                case "errors":
                    meta.errors = JsonAdapter.parseArray(jsonParser, MetaError.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "subMsg":
                    meta.subMsg = jsonParser.getValueAsString();
                    return true;
                case "code":
                    meta.code = jsonParser.getValueAsInt();
                    return true;
                case "message":
                    meta.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Meta meta, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subCode":
                case "errors":
                case "subMsg":
                case "code":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(meta, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Meta meta, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", meta.code);
            if (meta.errors != null) {
                jsonGenerator.writeFieldName("errors");
                JsonAdapter.serializeArray(meta.errors, jsonGenerator, MetaError.JSON_ADAPTER);
            }
            String str = meta.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            jsonGenerator.writeNumberField("subCode", meta.subCode);
            String str2 = meta.subMsg;
            if (str2 != null) {
                jsonGenerator.writeStringField("subMsg", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Meta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Meta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Meta new_() {
        Meta meta = new Meta();
        meta.nullCheck();
        return meta;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Meta mo223809clone() {
        Meta meta = new Meta();
        meta.code = this.code;
        List<MetaError> list = this.errors;
        if (list != null) {
            meta.errors = ValueObject.util_map(list, new w9j() { // from class: l.x000
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MetaError) obj).mo223809clone();
                }
            });
        }
        meta.message = this.message;
        meta.subCode = this.subCode;
        meta.subMsg = this.subMsg;
        return meta;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        return this.code == meta.code && ValueObject.util_equals(this.errors, meta.errors) && ValueObject.util_equals(this.message, meta.message) && this.subCode == meta.subCode && ValueObject.util_equals(this.subMsg, meta.subMsg);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "meta";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.code) * 41;
        List<MetaError> list = this.errors;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.message;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.subCode) * 41;
        String str2 = this.subMsg;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.subMsg == null) {
            this.subMsg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
