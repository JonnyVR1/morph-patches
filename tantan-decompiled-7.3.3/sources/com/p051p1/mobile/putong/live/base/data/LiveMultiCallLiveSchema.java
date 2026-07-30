package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class LiveMultiCallLiveSchema extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<LiveMultiCallLiveSchema> JSON_ADAPTER = new ObjectJsonAdapter<LiveMultiCallLiveSchema>() { // from class: com.p1.mobile.putong.live.base.data.LiveMultiCallLiveSchema.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveMultiCallLiveSchema.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveMultiCallLiveSchema newInstance() {
            return new LiveMultiCallLiveSchema();
        }

        public boolean parseField(LiveMultiCallLiveSchema liveMultiCallLiveSchema, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    liveMultiCallLiveSchema.schema = jsonParser.getValueAsString();
                    return true;
                case "id":
                    liveMultiCallLiveSchema.f45366id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    liveMultiCallLiveSchema.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveMultiCallLiveSchema liveMultiCallLiveSchema, JsonGenerator jsonGenerator) throws IOException {
            String str = liveMultiCallLiveSchema.f45366id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveMultiCallLiveSchema.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = liveMultiCallLiveSchema.schema;
            if (str3 != null) {
                jsonGenerator.writeStringField("schema", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveMultiCallLiveSchema) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "livemulticallliveschema";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45366id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static LiveMultiCallLiveSchema new_() {
        LiveMultiCallLiveSchema liveMultiCallLiveSchema = new LiveMultiCallLiveSchema();
        liveMultiCallLiveSchema.nullCheck();
        return liveMultiCallLiveSchema;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveMultiCallLiveSchema mo225055clone() {
        LiveMultiCallLiveSchema liveMultiCallLiveSchema = new LiveMultiCallLiveSchema();
        liveMultiCallLiveSchema.f45366id = this.f45366id;
        liveMultiCallLiveSchema.type = this.type;
        liveMultiCallLiveSchema.schema = this.schema;
        return liveMultiCallLiveSchema;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveMultiCallLiveSchema)) {
            return false;
        }
        LiveMultiCallLiveSchema liveMultiCallLiveSchema = (LiveMultiCallLiveSchema) obj;
        return ValueObject.util_equals(this.f45366id, liveMultiCallLiveSchema.f45366id) && ValueObject.util_equals(this.type, liveMultiCallLiveSchema.type) && ValueObject.util_equals(this.schema, liveMultiCallLiveSchema.schema);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "livemulticallliveschema";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f45366id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.schema;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45366id == null) {
            this.f45366id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
