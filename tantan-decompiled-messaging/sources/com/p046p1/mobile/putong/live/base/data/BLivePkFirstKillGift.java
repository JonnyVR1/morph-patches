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
public class BLivePkFirstKillGift extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkFirstKillGift> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkFirstKillGift>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkFirstKillGift.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkFirstKillGift.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkFirstKillGift newInstance() {
            return new BLivePkFirstKillGift();
        }

        public boolean parseField(BLivePkFirstKillGift bLivePkFirstKillGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftPicture":
                    bLivePkFirstKillGift.giftPicture = jsonParser.getValueAsString();
                    return true;
                case "giftId":
                    bLivePkFirstKillGift.giftId = jsonParser.getValueAsString();
                    return true;
                case "giftName":
                    bLivePkFirstKillGift.giftName = jsonParser.getValueAsString();
                    return true;
                case "firstKillDescription":
                    bLivePkFirstKillGift.firstKillDescription = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkFirstKillGift bLivePkFirstKillGift, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkFirstKillGift.giftName;
            if (str != null) {
                jsonGenerator.writeStringField("giftName", str);
            }
            String str2 = bLivePkFirstKillGift.giftPicture;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftPicture", str2);
            }
            String str3 = bLivePkFirstKillGift.giftId;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftId", str3);
            }
            String str4 = bLivePkFirstKillGift.firstKillDescription;
            if (str4 != null) {
                jsonGenerator.writeStringField("firstKillDescription", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkFirstKillGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkfirstkillgift";

    @NonNull
    @ProtobufIndex(index = 4)
    public String firstKillDescription;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftName;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftPicture;

    public static BLivePkFirstKillGift new_() {
        BLivePkFirstKillGift bLivePkFirstKillGift = new BLivePkFirstKillGift();
        bLivePkFirstKillGift.nullCheck();
        return bLivePkFirstKillGift;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkFirstKillGift mo223809clone() {
        BLivePkFirstKillGift bLivePkFirstKillGift = new BLivePkFirstKillGift();
        bLivePkFirstKillGift.giftName = this.giftName;
        bLivePkFirstKillGift.giftPicture = this.giftPicture;
        bLivePkFirstKillGift.giftId = this.giftId;
        bLivePkFirstKillGift.firstKillDescription = this.firstKillDescription;
        return bLivePkFirstKillGift;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkFirstKillGift)) {
            return false;
        }
        BLivePkFirstKillGift bLivePkFirstKillGift = (BLivePkFirstKillGift) obj;
        return ValueObject.util_equals(this.giftName, bLivePkFirstKillGift.giftName) && ValueObject.util_equals(this.giftPicture, bLivePkFirstKillGift.giftPicture) && ValueObject.util_equals(this.giftId, bLivePkFirstKillGift.giftId) && ValueObject.util_equals(this.firstKillDescription, bLivePkFirstKillGift.firstKillDescription);
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
        String str = this.giftName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftPicture;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.firstKillDescription;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.giftPicture == null) {
            this.giftPicture = "";
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.firstKillDescription == null) {
            this.firstKillDescription = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
