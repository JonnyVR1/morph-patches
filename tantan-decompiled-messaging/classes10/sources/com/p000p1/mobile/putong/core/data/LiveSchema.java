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
public class LiveSchema extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveschema";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f97id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 4)
    public String tip;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<LiveSchema> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveSchema>() { // from class: com.p1.mobile.putong.core.data.LiveSchema.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveSchema liveSchema) {
            String str = liveSchema.f97id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveSchema.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = liveSchema.schema;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = liveSchema.tip;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) liveSchema).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveSchema m13943parse(nb5 nb5Var) throws IOException {
            LiveSchema liveSchema = new LiveSchema();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveSchema.f97id == null) {
                        liveSchema.f97id = "";
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
                if (iU == 10) {
                    liveSchema.f97id = nb5Var.s();
                } else if (iU == 18) {
                    liveSchema.type = nb5Var.s();
                } else if (iU == 26) {
                    liveSchema.schema = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (liveSchema.f97id == null) {
                            liveSchema.f97id = "";
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
                    liveSchema.tip = nb5Var.s();
                }
            }
            return liveSchema;
        }

        public void serialize(LiveSchema liveSchema, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveSchema.f97id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveSchema.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = liveSchema.schema;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = liveSchema.tip;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<LiveSchema> JSON_ADAPTER = new ObjectJsonAdapter<LiveSchema>() { // from class: com.p1.mobile.putong.core.data.LiveSchema.2
        public Class getDataClass() {
            return LiveSchema.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LiveSchema m13944newInstance() {
            return new LiveSchema();
        }

        public boolean parseField(LiveSchema liveSchema, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    liveSchema.schema = jsonParser.getValueAsString();
                    return true;
                case "id":
                    liveSchema.f97id = jsonParser.getValueAsString();
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

        public void serializeFields(LiveSchema liveSchema, JsonGenerator jsonGenerator) throws IOException {
            String str = liveSchema.f97id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveSchema) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveSchema) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveSchema new_() {
        LiveSchema liveSchema = new LiveSchema();
        liveSchema.nullCheck();
        return liveSchema;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveSchema m13942clone() {
        LiveSchema liveSchema = new LiveSchema();
        liveSchema.f97id = this.f97id;
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
        return ValueObject.util_equals(this.f97id, liveSchema.f97id) && ValueObject.util_equals(this.type, liveSchema.type) && ValueObject.util_equals(this.schema, liveSchema.schema) && ValueObject.util_equals(this.tip, liveSchema.tip);
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
        String str = this.f97id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.schema;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.tip;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f97id == null) {
            this.f97id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
