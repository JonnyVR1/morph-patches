package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveSearchBoxConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSearchBoxConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSearchBoxConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSearchBoxConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSearchBoxConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSearchBoxConfig newInstance() {
            return new BLiveSearchBoxConfig();
        }

        public boolean parseField(BLiveSearchBoxConfig bLiveSearchBoxConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "contentColor":
                    bLiveSearchBoxConfig.contentColor = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    bLiveSearchBoxConfig.backgroundColor = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    bLiveSearchBoxConfig.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSearchBoxConfig bLiveSearchBoxConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSearchBoxConfig.backgroundColor;
            if (str != null) {
                jsonGenerator.writeStringField("backgroundColor", str);
            }
            String str2 = bLiveSearchBoxConfig.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
            String str3 = bLiveSearchBoxConfig.contentColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("contentColor", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSearchBoxConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesearchboxconfig";

    @Nullable
    @ProtobufIndex(index = 1)
    public String backgroundColor;

    @Nullable
    @ProtobufIndex(index = 3)
    public String contentColor;

    @Nullable
    @ProtobufIndex(index = 2)
    public String iconUrl;

    public static BLiveSearchBoxConfig new_() {
        BLiveSearchBoxConfig bLiveSearchBoxConfig = new BLiveSearchBoxConfig();
        bLiveSearchBoxConfig.nullCheck();
        return bLiveSearchBoxConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSearchBoxConfig mo223809clone() {
        BLiveSearchBoxConfig bLiveSearchBoxConfig = new BLiveSearchBoxConfig();
        bLiveSearchBoxConfig.backgroundColor = this.backgroundColor;
        bLiveSearchBoxConfig.iconUrl = this.iconUrl;
        bLiveSearchBoxConfig.contentColor = this.contentColor;
        return bLiveSearchBoxConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSearchBoxConfig)) {
            return false;
        }
        BLiveSearchBoxConfig bLiveSearchBoxConfig = (BLiveSearchBoxConfig) obj;
        return ValueObject.util_equals(this.backgroundColor, bLiveSearchBoxConfig.backgroundColor) && ValueObject.util_equals(this.iconUrl, bLiveSearchBoxConfig.iconUrl) && ValueObject.util_equals(this.contentColor, bLiveSearchBoxConfig.contentColor);
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
        String str = this.backgroundColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.contentColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
