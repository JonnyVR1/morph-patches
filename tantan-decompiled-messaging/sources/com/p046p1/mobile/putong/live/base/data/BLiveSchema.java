package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSchema extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSchema> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSchema>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSchema.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSchema.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSchema newInstance() {
            return new BLiveSchema();
        }

        public boolean parseField(BLiveSchema bLiveSchema, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    bLiveSchema.schema = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveSchema.f44434id = jsonParser.getValueAsString();
                    return false;
                case "tip":
                    bLiveSchema.tip = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveSchema.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSchema bLiveSchema, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSchema.f44434id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveSchema.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveSchema.schema;
            if (str3 != null) {
                jsonGenerator.writeStringField("schema", str3);
            }
            String str4 = bLiveSchema.tip;
            if (str4 != null) {
                jsonGenerator.writeStringField("tip", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSchema) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveschema";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44434id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 4)
    public String tip;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveSchema new_() {
        BLiveSchema bLiveSchema = new BLiveSchema();
        bLiveSchema.nullCheck();
        return bLiveSchema;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSchema mo223809clone() {
        BLiveSchema bLiveSchema = new BLiveSchema();
        bLiveSchema.f44434id = this.f44434id;
        bLiveSchema.type = this.type;
        bLiveSchema.schema = this.schema;
        bLiveSchema.tip = this.tip;
        return bLiveSchema;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSchema)) {
            return false;
        }
        BLiveSchema bLiveSchema = (BLiveSchema) obj;
        return ValueObject.util_equals(this.f44434id, bLiveSchema.f44434id) && ValueObject.util_equals(this.type, bLiveSchema.type) && ValueObject.util_equals(this.schema, bLiveSchema.schema) && ValueObject.util_equals(this.tip, bLiveSchema.tip);
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
        String str = this.f44434id;
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
        if (this.f44434id == null) {
            this.f44434id = "";
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
