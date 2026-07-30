package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveGiftDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftDetail newInstance() {
            return new BLiveGiftDetail();
        }

        public boolean parseField(BLiveGiftDetail bLiveGiftDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveGiftDetail.f44374id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveGiftDetail.icon = jsonParser.getValueAsString();
                    return true;
                case "price":
                    bLiveGiftDetail.price = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveGiftDetail.title = jsonParser.getValueAsString();
                    return true;
                case "btnText":
                    bLiveGiftDetail.btnText = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveGiftDetail.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftDetail bLiveGiftDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftDetail.f44374id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveGiftDetail.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveGiftDetail.content;
            if (str3 != null) {
                jsonGenerator.writeStringField("content", str3);
            }
            String str4 = bLiveGiftDetail.price;
            if (str4 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.PRICE, str4);
            }
            String str5 = bLiveGiftDetail.title;
            if (str5 != null) {
                jsonGenerator.writeStringField("title", str5);
            }
            String str6 = bLiveGiftDetail.btnText;
            if (str6 != null) {
                jsonGenerator.writeStringField("btnText", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftdetail";

    @NonNull
    @ProtobufIndex(index = 6)
    public String btnText;

    @NonNull
    @ProtobufIndex(index = 3)
    public String content;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44374id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String price;

    @NonNull
    @ProtobufIndex(index = 5)
    public String title;

    public static BLiveGiftDetail new_() {
        BLiveGiftDetail bLiveGiftDetail = new BLiveGiftDetail();
        bLiveGiftDetail.nullCheck();
        return bLiveGiftDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftDetail mo223809clone() {
        BLiveGiftDetail bLiveGiftDetail = new BLiveGiftDetail();
        bLiveGiftDetail.f44374id = this.f44374id;
        bLiveGiftDetail.icon = this.icon;
        bLiveGiftDetail.content = this.content;
        bLiveGiftDetail.price = this.price;
        bLiveGiftDetail.title = this.title;
        bLiveGiftDetail.btnText = this.btnText;
        return bLiveGiftDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftDetail)) {
            return false;
        }
        BLiveGiftDetail bLiveGiftDetail = (BLiveGiftDetail) obj;
        return ValueObject.util_equals(this.f44374id, bLiveGiftDetail.f44374id) && ValueObject.util_equals(this.icon, bLiveGiftDetail.icon) && ValueObject.util_equals(this.content, bLiveGiftDetail.content) && ValueObject.util_equals(this.price, bLiveGiftDetail.price) && ValueObject.util_equals(this.title, bLiveGiftDetail.title) && ValueObject.util_equals(this.btnText, bLiveGiftDetail.btnText);
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
        String str = this.f44374id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.price;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.title;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.btnText;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44374id == null) {
            this.f44374id = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.price == null) {
            this.price = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.btnText == null) {
            this.btnText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
