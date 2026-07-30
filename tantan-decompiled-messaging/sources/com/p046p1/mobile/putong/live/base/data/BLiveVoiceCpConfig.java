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
public class BLiveVoiceCpConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCpConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCpConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCpConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCpConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCpConfig newInstance() {
            return new BLiveVoiceCpConfig();
        }

        public boolean parseField(BLiveVoiceCpConfig bLiveVoiceCpConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isShow":
                    bLiveVoiceCpConfig.isShow = jsonParser.getValueAsBoolean();
                    return true;
                case "iconType":
                    bLiveVoiceCpConfig.iconType = jsonParser.getValueAsString();
                    return true;
                case "url":
                    bLiveVoiceCpConfig.url = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveVoiceCpConfig.icon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCpConfig bLiveVoiceCpConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCpConfig.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = bLiveVoiceCpConfig.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveVoiceCpConfig.iconType;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconType", str3);
            }
            jsonGenerator.writeBooleanField("isShow", bLiveVoiceCpConfig.isShow);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecpconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String iconType;

    @ProtobufIndex(index = 4)
    public boolean isShow;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    public static BLiveVoiceCpConfig new_() {
        BLiveVoiceCpConfig bLiveVoiceCpConfig = new BLiveVoiceCpConfig();
        bLiveVoiceCpConfig.nullCheck();
        return bLiveVoiceCpConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCpConfig mo223809clone() {
        BLiveVoiceCpConfig bLiveVoiceCpConfig = new BLiveVoiceCpConfig();
        bLiveVoiceCpConfig.url = this.url;
        bLiveVoiceCpConfig.icon = this.icon;
        bLiveVoiceCpConfig.iconType = this.iconType;
        bLiveVoiceCpConfig.isShow = this.isShow;
        return bLiveVoiceCpConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCpConfig)) {
            return false;
        }
        BLiveVoiceCpConfig bLiveVoiceCpConfig = (BLiveVoiceCpConfig) obj;
        return ValueObject.util_equals(this.url, bLiveVoiceCpConfig.url) && ValueObject.util_equals(this.icon, bLiveVoiceCpConfig.icon) && ValueObject.util_equals(this.iconType, bLiveVoiceCpConfig.iconType) && this.isShow == bLiveVoiceCpConfig.isShow;
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.iconType;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isShow ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.iconType == null) {
            this.iconType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
