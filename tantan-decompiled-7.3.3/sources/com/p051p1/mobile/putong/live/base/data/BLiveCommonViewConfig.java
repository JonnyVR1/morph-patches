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
public class BLiveCommonViewConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCommonViewConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCommonViewConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCommonViewConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCommonViewConfig newInstance() {
            return new BLiveCommonViewConfig();
        }

        public boolean parseField(BLiveCommonViewConfig bLiveCommonViewConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    bLiveCommonViewConfig.schema = jsonParser.getValueAsString();
                    return true;
                case "scheme":
                    bLiveCommonViewConfig.scheme = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveCommonViewConfig.icon = jsonParser.getValueAsString();
                    return true;
                case "size":
                    bLiveCommonViewConfig.size = jsonParser.getValueAsInt();
                    return true;
                case "text":
                    bLiveCommonViewConfig.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveCommonViewConfig.type = jsonParser.getValueAsString();
                    return true;
                case "color":
                    bLiveCommonViewConfig.color = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveCommonViewConfig.state = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCommonViewConfig bLiveCommonViewConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCommonViewConfig.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveCommonViewConfig.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = bLiveCommonViewConfig.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = bLiveCommonViewConfig.color;
            if (str4 != null) {
                jsonGenerator.writeStringField("color", str4);
            }
            jsonGenerator.writeNumberField("size", bLiveCommonViewConfig.size);
            String str5 = bLiveCommonViewConfig.scheme;
            if (str5 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str5);
            }
            String str6 = bLiveCommonViewConfig.state;
            if (str6 != null) {
                jsonGenerator.writeStringField("state", str6);
            }
            String str7 = bLiveCommonViewConfig.schema;
            if (str7 != null) {
                jsonGenerator.writeStringField("schema", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCommonViewConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecommonviewconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public String color;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 8)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 6)
    public String scheme;

    @ProtobufIndex(index = 5)
    public int size;

    @NonNull
    @ProtobufIndex(index = 7)
    public String state;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveCommonViewConfig new_() {
        BLiveCommonViewConfig bLiveCommonViewConfig = new BLiveCommonViewConfig();
        bLiveCommonViewConfig.nullCheck();
        return bLiveCommonViewConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCommonViewConfig mo225055clone() {
        BLiveCommonViewConfig bLiveCommonViewConfig = new BLiveCommonViewConfig();
        bLiveCommonViewConfig.type = this.type;
        bLiveCommonViewConfig.text = this.text;
        bLiveCommonViewConfig.icon = this.icon;
        bLiveCommonViewConfig.color = this.color;
        bLiveCommonViewConfig.size = this.size;
        bLiveCommonViewConfig.scheme = this.scheme;
        bLiveCommonViewConfig.state = this.state;
        bLiveCommonViewConfig.schema = this.schema;
        return bLiveCommonViewConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCommonViewConfig)) {
            return false;
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = (BLiveCommonViewConfig) obj;
        return ValueObject.util_equals(this.type, bLiveCommonViewConfig.type) && ValueObject.util_equals(this.text, bLiveCommonViewConfig.text) && ValueObject.util_equals(this.icon, bLiveCommonViewConfig.icon) && ValueObject.util_equals(this.color, bLiveCommonViewConfig.color) && this.size == bLiveCommonViewConfig.size && ValueObject.util_equals(this.scheme, bLiveCommonViewConfig.scheme) && ValueObject.util_equals(this.state, bLiveCommonViewConfig.state) && ValueObject.util_equals(this.schema, bLiveCommonViewConfig.schema);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.color;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.size) * 41;
        String str5 = this.scheme;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.state;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.schema;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
        if (this.state == null) {
            this.state = "";
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
