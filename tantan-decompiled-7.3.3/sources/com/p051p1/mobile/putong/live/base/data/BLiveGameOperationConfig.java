package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveGameOperationConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGameOperationConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGameOperationConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGameOperationConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGameOperationConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGameOperationConfig newInstance() {
            return new BLiveGameOperationConfig();
        }

        public boolean parseField(BLiveGameOperationConfig bLiveGameOperationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "durTimeSec":
                    bLiveGameOperationConfig.durTimeSec = jsonParser.getValueAsInt();
                    return true;
                case "promptMethod":
                    bLiveGameOperationConfig.promptMethod = jsonParser.getValueAsString();
                    return true;
                case "isSvga":
                    bLiveGameOperationConfig.isSvga = jsonParser.getValueAsBoolean();
                    return true;
                case "startBackgroundColor":
                    bLiveGameOperationConfig.startBackgroundColor = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveGameOperationConfig.f45220id = jsonParser.getValueAsInt();
                    return false;
                case "url":
                    bLiveGameOperationConfig.url = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveGameOperationConfig.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveGameOperationConfig.name = jsonParser.getValueAsString();
                    return true;
                case "alias":
                    bLiveGameOperationConfig.alias = jsonParser.getValueAsString();
                    return true;
                case "endBackgroundColor":
                    bLiveGameOperationConfig.endBackgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGameOperationConfig bLiveGameOperationConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveGameOperationConfig.f45220id);
            String str = bLiveGameOperationConfig.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveGameOperationConfig.alias;
            if (str2 != null) {
                jsonGenerator.writeStringField("alias", str2);
            }
            String str3 = bLiveGameOperationConfig.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = bLiveGameOperationConfig.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
            String str5 = bLiveGameOperationConfig.startBackgroundColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("startBackgroundColor", str5);
            }
            String str6 = bLiveGameOperationConfig.endBackgroundColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("endBackgroundColor", str6);
            }
            String str7 = bLiveGameOperationConfig.promptMethod;
            if (str7 != null) {
                jsonGenerator.writeStringField("promptMethod", str7);
            }
            jsonGenerator.writeNumberField("durTimeSec", bLiveGameOperationConfig.durTimeSec);
            jsonGenerator.writeBooleanField("isSvga", bLiveGameOperationConfig.isSvga);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGameOperationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegameoperationconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public String alias;

    @ProtobufIndex(index = 9)
    public int durTimeSec;

    @NonNull
    @ProtobufIndex(index = 7)
    public String endBackgroundColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f45220id;

    @ProtobufIndex(index = 10)
    public boolean isSvga;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 8)
    public String promptMethod;

    @NonNull
    @ProtobufIndex(index = 6)
    public String startBackgroundColor;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;

    public static BLiveGameOperationConfig new_() {
        BLiveGameOperationConfig bLiveGameOperationConfig = new BLiveGameOperationConfig();
        bLiveGameOperationConfig.nullCheck();
        return bLiveGameOperationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGameOperationConfig mo225055clone() {
        BLiveGameOperationConfig bLiveGameOperationConfig = new BLiveGameOperationConfig();
        bLiveGameOperationConfig.f45220id = this.f45220id;
        bLiveGameOperationConfig.name = this.name;
        bLiveGameOperationConfig.alias = this.alias;
        bLiveGameOperationConfig.icon = this.icon;
        bLiveGameOperationConfig.url = this.url;
        bLiveGameOperationConfig.startBackgroundColor = this.startBackgroundColor;
        bLiveGameOperationConfig.endBackgroundColor = this.endBackgroundColor;
        bLiveGameOperationConfig.promptMethod = this.promptMethod;
        bLiveGameOperationConfig.durTimeSec = this.durTimeSec;
        bLiveGameOperationConfig.isSvga = this.isSvga;
        return bLiveGameOperationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGameOperationConfig)) {
            return false;
        }
        BLiveGameOperationConfig bLiveGameOperationConfig = (BLiveGameOperationConfig) obj;
        return this.f45220id == bLiveGameOperationConfig.f45220id && ValueObject.util_equals(this.name, bLiveGameOperationConfig.name) && ValueObject.util_equals(this.alias, bLiveGameOperationConfig.alias) && ValueObject.util_equals(this.icon, bLiveGameOperationConfig.icon) && ValueObject.util_equals(this.url, bLiveGameOperationConfig.url) && ValueObject.util_equals(this.startBackgroundColor, bLiveGameOperationConfig.startBackgroundColor) && ValueObject.util_equals(this.endBackgroundColor, bLiveGameOperationConfig.endBackgroundColor) && ValueObject.util_equals(this.promptMethod, bLiveGameOperationConfig.promptMethod) && this.durTimeSec == bLiveGameOperationConfig.durTimeSec && this.isSvga == bLiveGameOperationConfig.isSvga;
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
        int i2 = ((i * 41) + this.f45220id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.alias;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.startBackgroundColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.endBackgroundColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.promptMethod;
        int iHashCode7 = ((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41) + this.durTimeSec) * 41) + (this.isSvga ? 1231 : 1237);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.alias == null) {
            this.alias = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.startBackgroundColor == null) {
            this.startBackgroundColor = "";
        }
        if (this.endBackgroundColor == null) {
            this.endBackgroundColor = "";
        }
        if (this.promptMethod == null) {
            this.promptMethod = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
