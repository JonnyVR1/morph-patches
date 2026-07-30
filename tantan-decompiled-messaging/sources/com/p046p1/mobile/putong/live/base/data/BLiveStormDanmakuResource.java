package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResource;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveStormDanmakuResource extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStormDanmakuResource> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStormDanmakuResource>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStormDanmakuResource.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStormDanmakuResource.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStormDanmakuResource newInstance() {
            return new BLiveStormDanmakuResource();
        }

        public boolean parseField(BLiveStormDanmakuResource bLiveStormDanmakuResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resources":
                    bLiveStormDanmakuResource.resources = JsonAdapter.parseArray(jsonParser, BLiveStormDanmakuGiftResource.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveStormDanmakuResource.f44447id = jsonParser.getValueAsString();
                    return false;
                case "bgUrl":
                    bLiveStormDanmakuResource.bgUrl = jsonParser.getValueAsString();
                    return true;
                case "price":
                    bLiveStormDanmakuResource.price = jsonParser.getValueAsString();
                    return true;
                case "placeholderText":
                    bLiveStormDanmakuResource.placeholderText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStormDanmakuResource bLiveStormDanmakuResource, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStormDanmakuResource.f44447id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveStormDanmakuResource.bgUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("bgUrl", str2);
            }
            if (bLiveStormDanmakuResource.resources != null) {
                jsonGenerator.writeFieldName("resources");
                JsonAdapter.serializeArray(bLiveStormDanmakuResource.resources, jsonGenerator, BLiveStormDanmakuGiftResource.JSON_ADAPTER);
            }
            String str3 = bLiveStormDanmakuResource.placeholderText;
            if (str3 != null) {
                jsonGenerator.writeStringField("placeholderText", str3);
            }
            String str4 = bLiveStormDanmakuResource.price;
            if (str4 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.PRICE, str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStormDanmakuResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestormdanmakuresource";

    @NonNull
    @ProtobufIndex(index = 2)
    public String bgUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44447id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String placeholderText;

    @NonNull
    @ProtobufIndex(index = 5)
    public String price;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveStormDanmakuGiftResource> resources;

    public static BLiveStormDanmakuResource new_() {
        BLiveStormDanmakuResource bLiveStormDanmakuResource = new BLiveStormDanmakuResource();
        bLiveStormDanmakuResource.nullCheck();
        return bLiveStormDanmakuResource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStormDanmakuResource mo223809clone() {
        BLiveStormDanmakuResource bLiveStormDanmakuResource = new BLiveStormDanmakuResource();
        bLiveStormDanmakuResource.f44447id = this.f44447id;
        bLiveStormDanmakuResource.bgUrl = this.bgUrl;
        List<BLiveStormDanmakuGiftResource> list = this.resources;
        if (list != null) {
            bLiveStormDanmakuResource.resources = ValueObject.util_map(list, new w9j() { // from class: l.g62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveStormDanmakuGiftResource) obj).mo223809clone();
                }
            });
        }
        bLiveStormDanmakuResource.placeholderText = this.placeholderText;
        bLiveStormDanmakuResource.price = this.price;
        return bLiveStormDanmakuResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStormDanmakuResource)) {
            return false;
        }
        BLiveStormDanmakuResource bLiveStormDanmakuResource = (BLiveStormDanmakuResource) obj;
        return ValueObject.util_equals(this.f44447id, bLiveStormDanmakuResource.f44447id) && ValueObject.util_equals(this.bgUrl, bLiveStormDanmakuResource.bgUrl) && ValueObject.util_equals(this.resources, bLiveStormDanmakuResource.resources) && ValueObject.util_equals(this.placeholderText, bLiveStormDanmakuResource.placeholderText) && ValueObject.util_equals(this.price, bLiveStormDanmakuResource.price);
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
        String str = this.f44447id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bgUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveStormDanmakuGiftResource> list = this.resources;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.placeholderText;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.price;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44447id == null) {
            this.f44447id = "";
        }
        if (this.bgUrl == null) {
            this.bgUrl = "";
        }
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
        if (this.placeholderText == null) {
            this.placeholderText = "";
        }
        if (this.price == null) {
            this.price = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
