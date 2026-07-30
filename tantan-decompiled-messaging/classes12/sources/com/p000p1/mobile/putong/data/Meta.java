package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.MetaError;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Meta meta) {
            int iH = CodedOutputByteBufferNano.h(1, meta.code);
            List<MetaError> list = meta.errors;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, MetaError.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = meta.message;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(4, meta.subCode);
            String str2 = meta.subMsg;
            if (str2 != null) {
                iH2 += CodedOutputByteBufferNano.o(5, str2);
            }
            ((MessageNano) meta).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Meta m18462parse(nb5 nb5Var) throws IOException {
            Meta meta = new Meta();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (meta.subMsg != null) {
                        break;
                    }
                    meta.subMsg = "";
                    break;
                }
                if (iU == 8) {
                    meta.code = nb5Var.j();
                } else if (iU == 18) {
                    meta.errors = (List) nb5Var.l(MetaError.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    meta.message = nb5Var.s();
                } else if (iU == 32) {
                    meta.subCode = nb5Var.j();
                } else {
                    if (iU != 42) {
                        if (meta.subMsg != null) {
                            break;
                        }
                        meta.subMsg = "";
                        return meta;
                    }
                    meta.subMsg = nb5Var.s();
                }
            }
            return meta;
        }

        public void serialize(Meta meta, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, meta.code);
            List<MetaError> list = meta.errors;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, MetaError.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = meta.message;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            codedOutputByteBufferNano.G(4, meta.subCode);
            String str2 = meta.subMsg;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
        }
    };
    public static JsonAdapter<Meta> JSON_ADAPTER = new ObjectJsonAdapter<Meta>() { // from class: com.p1.mobile.putong.data.Meta.2
        public Class getDataClass() {
            return Meta.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Meta mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Meta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Meta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Meta new_() {
        Meta meta = new Meta();
        meta.nullCheck();
        return meta;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Meta m18461clone() {
        Meta meta = new Meta();
        meta.code = this.code;
        List<MetaError> list = this.errors;
        if (list != null) {
            meta.errors = ValueObject.util_map(list, new w9j() { // from class: l.x000
                public final Object call(Object obj) {
                    return ((MetaError) obj).m18464clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.subMsg == null) {
            this.subMsg = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
