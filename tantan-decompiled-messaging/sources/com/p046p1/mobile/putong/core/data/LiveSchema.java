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
public class LiveSchema extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveschema";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20435id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 4)
    public String tip;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<LiveSchema> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveSchema>() { // from class: com.p1.mobile.putong.core.data.LiveSchema.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveSchema liveSchema) {
            String str = liveSchema.f20435id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveSchema.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = liveSchema.schema;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = liveSchema.tip;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            liveSchema.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveSchema parse(nb5 nb5Var) throws IOException {
            LiveSchema liveSchema = new LiveSchema();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveSchema.f20435id == null) {
                        liveSchema.f20435id = "";
                    }
                    if (liveSchema.type == null) {
                        liveSchema.type = "";
                    }
                    if (liveSchema.schema == null) {
                        liveSchema.schema = "";
                    }
                    if (liveSchema.tip != null) {
                        break;
                    }
                    liveSchema.tip = "";
                    break;
                }
                if (iM158752u == 10) {
                    liveSchema.f20435id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    liveSchema.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    liveSchema.schema = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (liveSchema.f20435id == null) {
                            liveSchema.f20435id = "";
                        }
                        if (liveSchema.type == null) {
                            liveSchema.type = "";
                        }
                        if (liveSchema.schema == null) {
                            liveSchema.schema = "";
                        }
                        if (liveSchema.tip != null) {
                            break;
                        }
                        liveSchema.tip = "";
                        return liveSchema;
                    }
                    liveSchema.tip = nb5Var.m158750s();
                }
            }
            return liveSchema;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveSchema liveSchema, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveSchema.f20435id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveSchema.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = liveSchema.schema;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = liveSchema.tip;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<LiveSchema> JSON_ADAPTER = new ObjectJsonAdapter<LiveSchema>() { // from class: com.p1.mobile.putong.core.data.LiveSchema.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveSchema.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveSchema newInstance() {
            return new LiveSchema();
        }

        public boolean parseField(LiveSchema liveSchema, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    liveSchema.schema = jsonParser.getValueAsString();
                    return true;
                case "id":
                    liveSchema.f20435id = jsonParser.getValueAsString();
                    return false;
                case "tip":
                    liveSchema.tip = jsonParser.getValueAsString();
                    return true;
                case "type":
                    liveSchema.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveSchema liveSchema, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "schema":
                    return true;
                case "id":
                    return false;
                case "tip":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(liveSchema, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveSchema liveSchema, JsonGenerator jsonGenerator) throws IOException {
            String str = liveSchema.f20435id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveSchema.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = liveSchema.schema;
            if (str3 != null) {
                jsonGenerator.writeStringField("schema", str3);
            }
            String str4 = liveSchema.tip;
            if (str4 != null) {
                jsonGenerator.writeStringField("tip", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveSchema) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveSchema) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveSchema new_() {
        LiveSchema liveSchema = new LiveSchema();
        liveSchema.nullCheck();
        return liveSchema;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveSchema mo223809clone() {
        LiveSchema liveSchema = new LiveSchema();
        liveSchema.f20435id = this.f20435id;
        liveSchema.type = this.type;
        liveSchema.schema = this.schema;
        liveSchema.tip = this.tip;
        return liveSchema;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveSchema)) {
            return false;
        }
        LiveSchema liveSchema = (LiveSchema) obj;
        return ValueObject.util_equals(this.f20435id, liveSchema.f20435id) && ValueObject.util_equals(this.type, liveSchema.type) && ValueObject.util_equals(this.schema, liveSchema.schema) && ValueObject.util_equals(this.tip, liveSchema.tip);
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
        String str = this.f20435id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.schema;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.tip;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20435id == null) {
            this.f20435id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.tip == null) {
            this.tip = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
