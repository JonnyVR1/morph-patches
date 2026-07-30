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
public class BLiveOperationTextDrawerConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationTextDrawerConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationTextDrawerConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationTextDrawerConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationTextDrawerConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationTextDrawerConfig newInstance() {
            return new BLiveOperationTextDrawerConfig();
        }

        public boolean parseField(BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "transparency":
                    bLiveOperationTextDrawerConfig.transparency = jsonParser.getValueAsInt();
                    return true;
                case "startColor":
                    bLiveOperationTextDrawerConfig.startColor = jsonParser.getValueAsString();
                    return true;
                case "imageUrl":
                    bLiveOperationTextDrawerConfig.imageUrl = jsonParser.getValueAsString();
                    return true;
                case "loadingType":
                    bLiveOperationTextDrawerConfig.loadingType = BLiveOperationLoadingType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "endColor":
                    bLiveOperationTextDrawerConfig.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOperationTextDrawerConfig.startColor;
            if (str != null) {
                jsonGenerator.writeStringField("startColor", str);
            }
            String str2 = bLiveOperationTextDrawerConfig.endColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("endColor", str2);
            }
            String str3 = bLiveOperationTextDrawerConfig.imageUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("imageUrl", str3);
            }
            jsonGenerator.writeNumberField("transparency", bLiveOperationTextDrawerConfig.transparency);
            if (bLiveOperationTextDrawerConfig.loadingType != null) {
                jsonGenerator.writeFieldName("loadingType");
                BLiveOperationLoadingType.JSON_ADAPTER.serialize(bLiveOperationTextDrawerConfig.loadingType, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationTextDrawerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationtextdrawerconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String imageUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveOperationLoadingType loadingType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;

    @ProtobufIndex(index = 4)
    public int transparency;

    public static BLiveOperationTextDrawerConfig new_() {
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = new BLiveOperationTextDrawerConfig();
        bLiveOperationTextDrawerConfig.nullCheck();
        return bLiveOperationTextDrawerConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationTextDrawerConfig mo223809clone() {
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = new BLiveOperationTextDrawerConfig();
        bLiveOperationTextDrawerConfig.startColor = this.startColor;
        bLiveOperationTextDrawerConfig.endColor = this.endColor;
        bLiveOperationTextDrawerConfig.imageUrl = this.imageUrl;
        bLiveOperationTextDrawerConfig.transparency = this.transparency;
        bLiveOperationTextDrawerConfig.loadingType = this.loadingType;
        return bLiveOperationTextDrawerConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationTextDrawerConfig)) {
            return false;
        }
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = (BLiveOperationTextDrawerConfig) obj;
        return ValueObject.util_equals(this.startColor, bLiveOperationTextDrawerConfig.startColor) && ValueObject.util_equals(this.endColor, bLiveOperationTextDrawerConfig.endColor) && ValueObject.util_equals(this.imageUrl, bLiveOperationTextDrawerConfig.imageUrl) && this.transparency == bLiveOperationTextDrawerConfig.transparency && ValueObject.util_equals(this.loadingType, bLiveOperationTextDrawerConfig.loadingType);
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
        String str = this.startColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.imageUrl;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.transparency) * 41;
        BLiveOperationLoadingType bLiveOperationLoadingType = this.loadingType;
        int iHashCode4 = iHashCode3 + (bLiveOperationLoadingType != null ? bLiveOperationLoadingType.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
        if (this.loadingType == null) {
            this.loadingType = (BLiveOperationLoadingType) BLiveOperationLoadingType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
