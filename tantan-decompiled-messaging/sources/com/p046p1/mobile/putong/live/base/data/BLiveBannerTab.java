package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Media;
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
public class BLiveBannerTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBannerTab> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBannerTab>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBannerTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBannerTab.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBannerTab newInstance() {
            return new BLiveBannerTab();
        }

        public boolean parseField(BLiveBannerTab bLiveBannerTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "jumpUrl":
                    bLiveBannerTab.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "bannerType":
                    bLiveBannerTab.bannerType = jsonParser.getValueAsString();
                    return true;
                case "media":
                    bLiveBannerTab.media = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case "title":
                    bLiveBannerTab.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBannerTab bLiveBannerTab, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveBannerTab.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(bLiveBannerTab.media, jsonGenerator, true);
            }
            String str = bLiveBannerTab.jumpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("jumpUrl", str);
            }
            String str2 = bLiveBannerTab.bannerType;
            if (str2 != null) {
                jsonGenerator.writeStringField("bannerType", str2);
            }
            String str3 = bLiveBannerTab.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBannerTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebannertab";

    @NonNull
    @ProtobufIndex(index = 3)
    public String bannerType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String jumpUrl;

    @Nullable
    @ProtobufIndex(index = 1)
    public Media media;

    @Nullable
    @ProtobufIndex(index = 4)
    public String title;

    public static BLiveBannerTab new_() {
        BLiveBannerTab bLiveBannerTab = new BLiveBannerTab();
        bLiveBannerTab.nullCheck();
        return bLiveBannerTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBannerTab mo223809clone() {
        BLiveBannerTab bLiveBannerTab = new BLiveBannerTab();
        Media media = this.media;
        if (media != null) {
            bLiveBannerTab.media = media.mo223809clone();
        }
        bLiveBannerTab.jumpUrl = this.jumpUrl;
        bLiveBannerTab.bannerType = this.bannerType;
        bLiveBannerTab.title = this.title;
        return bLiveBannerTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBannerTab)) {
            return false;
        }
        BLiveBannerTab bLiveBannerTab = (BLiveBannerTab) obj;
        return ValueObject.util_equals(this.media, bLiveBannerTab.media) && ValueObject.util_equals(this.jumpUrl, bLiveBannerTab.jumpUrl) && ValueObject.util_equals(this.bannerType, bLiveBannerTab.bannerType) && ValueObject.util_equals(this.title, bLiveBannerTab.title);
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
        Media media = this.media;
        int iHashCode = (i2 + (media != null ? media.hashCode() : 0)) * 41;
        String str = this.jumpUrl;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bannerType;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
        if (this.bannerType == null) {
            this.bannerType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
