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
public class BLiveVoiceBannerTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceBannerTab> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceBannerTab>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceBannerTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceBannerTab.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceBannerTab newInstance() {
            return new BLiveVoiceBannerTab();
        }

        public boolean parseField(BLiveVoiceBannerTab bLiveVoiceBannerTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cardBackgroundUrl":
                    bLiveVoiceBannerTab.cardBackgroundUrl = jsonParser.getValueAsString();
                    return true;
                case "heightRatio":
                    bLiveVoiceBannerTab.heightRatio = jsonParser.getValueAsDouble();
                    return true;
                case "cardType":
                    bLiveVoiceBannerTab.cardType = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceBannerTab.title = jsonParser.getValueAsString();
                    return true;
                case "cardLandpageUrl":
                    bLiveVoiceBannerTab.cardLandpageUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceBannerTab bLiveVoiceBannerTab, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("heightRatio", bLiveVoiceBannerTab.heightRatio);
            String str = bLiveVoiceBannerTab.cardType;
            if (str != null) {
                jsonGenerator.writeStringField("cardType", str);
            }
            String str2 = bLiveVoiceBannerTab.cardBackgroundUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("cardBackgroundUrl", str2);
            }
            String str3 = bLiveVoiceBannerTab.cardLandpageUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("cardLandpageUrl", str3);
            }
            String str4 = bLiveVoiceBannerTab.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceBannerTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicebannertab";

    @NonNull
    @ProtobufIndex(index = 3)
    public String cardBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String cardLandpageUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String cardType;

    @ProtobufIndex(index = 1)
    public double heightRatio;

    @NonNull
    @ProtobufIndex(index = 5)
    public String title;

    public static BLiveVoiceBannerTab new_() {
        BLiveVoiceBannerTab bLiveVoiceBannerTab = new BLiveVoiceBannerTab();
        bLiveVoiceBannerTab.nullCheck();
        return bLiveVoiceBannerTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceBannerTab mo225055clone() {
        BLiveVoiceBannerTab bLiveVoiceBannerTab = new BLiveVoiceBannerTab();
        bLiveVoiceBannerTab.heightRatio = this.heightRatio;
        bLiveVoiceBannerTab.cardType = this.cardType;
        bLiveVoiceBannerTab.cardBackgroundUrl = this.cardBackgroundUrl;
        bLiveVoiceBannerTab.cardLandpageUrl = this.cardLandpageUrl;
        bLiveVoiceBannerTab.title = this.title;
        return bLiveVoiceBannerTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceBannerTab)) {
            return false;
        }
        BLiveVoiceBannerTab bLiveVoiceBannerTab = (BLiveVoiceBannerTab) obj;
        return this.heightRatio == bLiveVoiceBannerTab.heightRatio && ValueObject.util_equals(this.cardType, bLiveVoiceBannerTab.cardType) && ValueObject.util_equals(this.cardBackgroundUrl, bLiveVoiceBannerTab.cardBackgroundUrl) && ValueObject.util_equals(this.cardLandpageUrl, bLiveVoiceBannerTab.cardLandpageUrl) && ValueObject.util_equals(this.title, bLiveVoiceBannerTab.title);
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.heightRatio);
        int i2 = ((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.cardType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.cardBackgroundUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cardLandpageUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cardType == null) {
            this.cardType = "";
        }
        if (this.cardBackgroundUrl == null) {
            this.cardBackgroundUrl = "";
        }
        if (this.cardLandpageUrl == null) {
            this.cardLandpageUrl = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
