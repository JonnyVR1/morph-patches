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
public class BLiveBottomTabBarConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBottomTabBarConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBottomTabBarConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBottomTabBarConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBottomTabBarConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBottomTabBarConfig newInstance() {
            return new BLiveBottomTabBarConfig();
        }

        public boolean parseField(BLiveBottomTabBarConfig bLiveBottomTabBarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "jumpUrl":
                    bLiveBottomTabBarConfig.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "unClickPictureUrl":
                    bLiveBottomTabBarConfig.unClickPictureUrl = jsonParser.getValueAsString();
                    return true;
                case "clickPictureUrl":
                    bLiveBottomTabBarConfig.clickPictureUrl = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveBottomTabBarConfig.content = BLiveBottomTabBarContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBottomTabBarConfig bLiveBottomTabBarConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBottomTabBarConfig.jumpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("jumpUrl", str);
            }
            String str2 = bLiveBottomTabBarConfig.clickPictureUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("clickPictureUrl", str2);
            }
            String str3 = bLiveBottomTabBarConfig.unClickPictureUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("unClickPictureUrl", str3);
            }
            if (bLiveBottomTabBarConfig.content != null) {
                jsonGenerator.writeFieldName("content");
                BLiveBottomTabBarContent.JSON_ADAPTER.serialize(bLiveBottomTabBarConfig.content, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBottomTabBarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebottomtabbarconfig";

    @Nullable
    @ProtobufIndex(index = 2)
    public String clickPictureUrl;

    @Nullable
    @ProtobufIndex(index = 4)
    public BLiveBottomTabBarContent content;

    @Nullable
    @ProtobufIndex(index = 1)
    public String jumpUrl;

    @Nullable
    @ProtobufIndex(index = 3)
    public String unClickPictureUrl;

    public static BLiveBottomTabBarConfig new_() {
        BLiveBottomTabBarConfig bLiveBottomTabBarConfig = new BLiveBottomTabBarConfig();
        bLiveBottomTabBarConfig.nullCheck();
        return bLiveBottomTabBarConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBottomTabBarConfig mo223809clone() {
        BLiveBottomTabBarConfig bLiveBottomTabBarConfig = new BLiveBottomTabBarConfig();
        bLiveBottomTabBarConfig.jumpUrl = this.jumpUrl;
        bLiveBottomTabBarConfig.clickPictureUrl = this.clickPictureUrl;
        bLiveBottomTabBarConfig.unClickPictureUrl = this.unClickPictureUrl;
        BLiveBottomTabBarContent bLiveBottomTabBarContent = this.content;
        if (bLiveBottomTabBarContent != null) {
            bLiveBottomTabBarConfig.content = bLiveBottomTabBarContent.mo223809clone();
        }
        return bLiveBottomTabBarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBottomTabBarConfig)) {
            return false;
        }
        BLiveBottomTabBarConfig bLiveBottomTabBarConfig = (BLiveBottomTabBarConfig) obj;
        return ValueObject.util_equals(this.jumpUrl, bLiveBottomTabBarConfig.jumpUrl) && ValueObject.util_equals(this.clickPictureUrl, bLiveBottomTabBarConfig.clickPictureUrl) && ValueObject.util_equals(this.unClickPictureUrl, bLiveBottomTabBarConfig.unClickPictureUrl) && ValueObject.util_equals(this.content, bLiveBottomTabBarConfig.content);
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
        String str = this.jumpUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.clickPictureUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.unClickPictureUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveBottomTabBarContent bLiveBottomTabBarContent = this.content;
        int iHashCode4 = iHashCode3 + (bLiveBottomTabBarContent != null ? bLiveBottomTabBarContent.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
