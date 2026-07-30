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
public class BLiveBottomTabBarContent extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBottomTabBarContent> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBottomTabBarContent>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBottomTabBarContent.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBottomTabBarContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBottomTabBarContent newInstance() {
            return new BLiveBottomTabBarContent();
        }

        public boolean parseField(BLiveBottomTabBarContent bLiveBottomTabBarContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unClickColor":
                    bLiveBottomTabBarContent.unClickColor = jsonParser.getValueAsString();
                    return true;
                case "clickColor":
                    bLiveBottomTabBarContent.clickColor = jsonParser.getValueAsString();
                    return true;
                case "size":
                    bLiveBottomTabBarContent.size = jsonParser.getValueAsInt();
                    return true;
                case "text":
                    bLiveBottomTabBarContent.text = jsonParser.getValueAsString();
                    return true;
                case "animation":
                    bLiveBottomTabBarContent.animation = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBottomTabBarContent bLiveBottomTabBarContent, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBottomTabBarContent.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = bLiveBottomTabBarContent.unClickColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("unClickColor", str2);
            }
            String str3 = bLiveBottomTabBarContent.clickColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("clickColor", str3);
            }
            jsonGenerator.writeNumberField("size", bLiveBottomTabBarContent.size);
            jsonGenerator.writeBooleanField("animation", bLiveBottomTabBarContent.animation);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBottomTabBarContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebottomtabbarcontent";

    @ProtobufIndex(index = 5)
    public boolean animation;

    @NonNull
    @ProtobufIndex(index = 3)
    public String clickColor;

    @ProtobufIndex(index = 4)
    public int size;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String unClickColor;

    public static BLiveBottomTabBarContent new_() {
        BLiveBottomTabBarContent bLiveBottomTabBarContent = new BLiveBottomTabBarContent();
        bLiveBottomTabBarContent.nullCheck();
        return bLiveBottomTabBarContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBottomTabBarContent mo223809clone() {
        BLiveBottomTabBarContent bLiveBottomTabBarContent = new BLiveBottomTabBarContent();
        bLiveBottomTabBarContent.text = this.text;
        bLiveBottomTabBarContent.unClickColor = this.unClickColor;
        bLiveBottomTabBarContent.clickColor = this.clickColor;
        bLiveBottomTabBarContent.size = this.size;
        bLiveBottomTabBarContent.animation = this.animation;
        return bLiveBottomTabBarContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBottomTabBarContent)) {
            return false;
        }
        BLiveBottomTabBarContent bLiveBottomTabBarContent = (BLiveBottomTabBarContent) obj;
        return ValueObject.util_equals(this.text, bLiveBottomTabBarContent.text) && ValueObject.util_equals(this.unClickColor, bLiveBottomTabBarContent.unClickColor) && ValueObject.util_equals(this.clickColor, bLiveBottomTabBarContent.clickColor) && this.size == bLiveBottomTabBarContent.size && this.animation == bLiveBottomTabBarContent.animation;
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.unClickColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.clickColor;
        int iHashCode3 = ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.size) * 41) + (this.animation ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.unClickColor == null) {
            this.unClickColor = "";
        }
        if (this.clickColor == null) {
            this.clickColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
