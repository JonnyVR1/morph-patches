package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceBackGroundPics extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceBackGroundPics> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceBackGroundPics>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceBackGroundPics.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceBackGroundPics newInstance() {
            return new BLiveVoiceBackGroundPics();
        }

        public boolean parseField(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    bLiveVoiceBackGroundPics.expireTime = jsonParser.getValueAsInt();
                    return true;
                case "priceGradient":
                    bLiveVoiceBackGroundPics.priceGradient = JsonAdapter.parseArray(jsonParser, BLiveVoiceBackgroundPriceGradient.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "picName":
                    bLiveVoiceBackGroundPics.picName = jsonParser.getValueAsString();
                    return true;
                case "picType":
                    bLiveVoiceBackGroundPics.picType = jsonParser.getValueAsString();
                    return true;
                case "thumbnailUrl":
                    bLiveVoiceBackGroundPics.thumbnailUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceBackGroundPics.f45331id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    bLiveVoiceBackGroundPics.url = jsonParser.getValueAsString();
                    return true;
                case "free":
                    bLiveVoiceBackGroundPics.free = jsonParser.getValueAsBoolean();
                    return true;
                case "check":
                    bLiveVoiceBackGroundPics.check = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceBackGroundPics.f45331id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceBackGroundPics.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = bLiveVoiceBackGroundPics.thumbnailUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("thumbnailUrl", str3);
            }
            String str4 = bLiveVoiceBackGroundPics.picName;
            if (str4 != null) {
                jsonGenerator.writeStringField("picName", str4);
            }
            jsonGenerator.writeBooleanField("check", bLiveVoiceBackGroundPics.check);
            String str5 = bLiveVoiceBackGroundPics.picType;
            if (str5 != null) {
                jsonGenerator.writeStringField("picType", str5);
            }
            if (bLiveVoiceBackGroundPics.priceGradient != null) {
                jsonGenerator.writeFieldName("priceGradient");
                JsonAdapter.serializeArray(bLiveVoiceBackGroundPics.priceGradient, jsonGenerator, BLiveVoiceBackgroundPriceGradient.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("expireTime", bLiveVoiceBackGroundPics.expireTime);
            jsonGenerator.writeBooleanField("free", bLiveVoiceBackGroundPics.free);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceBackGroundPics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicebackgroundpics";

    @ProtobufIndex(index = 5)
    public boolean check;

    @ProtobufIndex(index = 8)
    public int expireTime;

    @ProtobufIndex(index = 9)
    public boolean free;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45331id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String picName;

    @NonNull
    @ProtobufIndex(index = 6)
    public String picType;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveVoiceBackgroundPriceGradient> priceGradient;

    @NonNull
    @ProtobufIndex(index = 3)
    public String thumbnailUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    public static BLiveVoiceBackGroundPics new_() {
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics = new BLiveVoiceBackGroundPics();
        bLiveVoiceBackGroundPics.nullCheck();
        return bLiveVoiceBackGroundPics;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceBackGroundPics mo225055clone() {
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics = new BLiveVoiceBackGroundPics();
        bLiveVoiceBackGroundPics.f45331id = this.f45331id;
        bLiveVoiceBackGroundPics.url = this.url;
        bLiveVoiceBackGroundPics.thumbnailUrl = this.thumbnailUrl;
        bLiveVoiceBackGroundPics.picName = this.picName;
        bLiveVoiceBackGroundPics.check = this.check;
        bLiveVoiceBackGroundPics.picType = this.picType;
        List<BLiveVoiceBackgroundPriceGradient> list = this.priceGradient;
        if (list != null) {
            bLiveVoiceBackGroundPics.priceGradient = ValueObject.util_map(list, new qcj() { // from class: l.i82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceBackgroundPriceGradient) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceBackGroundPics.expireTime = this.expireTime;
        bLiveVoiceBackGroundPics.free = this.free;
        return bLiveVoiceBackGroundPics;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceBackGroundPics)) {
            return false;
        }
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics = (BLiveVoiceBackGroundPics) obj;
        return ValueObject.util_equals(this.f45331id, bLiveVoiceBackGroundPics.f45331id) && ValueObject.util_equals(this.url, bLiveVoiceBackGroundPics.url) && ValueObject.util_equals(this.thumbnailUrl, bLiveVoiceBackGroundPics.thumbnailUrl) && ValueObject.util_equals(this.picName, bLiveVoiceBackGroundPics.picName) && this.check == bLiveVoiceBackGroundPics.check && ValueObject.util_equals(this.picType, bLiveVoiceBackGroundPics.picType) && ValueObject.util_equals(this.priceGradient, bLiveVoiceBackGroundPics.priceGradient) && this.expireTime == bLiveVoiceBackGroundPics.expireTime && this.free == bLiveVoiceBackGroundPics.free;
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
        String str = this.f45331id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.thumbnailUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.picName;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.check ? 1231 : 1237)) * 41;
        String str5 = this.picType;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<BLiveVoiceBackgroundPriceGradient> list = this.priceGradient;
        int iHashCode6 = ((((iHashCode5 + (list != null ? list.hashCode() : 0)) * 41) + this.expireTime) * 41) + (this.free ? 1231 : 1237);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45331id == null) {
            this.f45331id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.thumbnailUrl == null) {
            this.thumbnailUrl = "";
        }
        if (this.picName == null) {
            this.picName = "";
        }
        if (this.picType == null) {
            this.picType = "";
        }
        if (this.priceGradient == null) {
            this.priceGradient = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
