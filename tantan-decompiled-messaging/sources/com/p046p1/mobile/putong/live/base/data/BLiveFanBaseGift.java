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
public class BLiveFanBaseGift extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseGift> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseGift>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseGift.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseGift.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseGift newInstance() {
            return new BLiveFanBaseGift();
        }

        public boolean parseField(BLiveFanBaseGift bLiveFanBaseGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftID":
                    bLiveFanBaseGift.giftID = jsonParser.getValueAsString();
                    return true;
                case "num":
                    bLiveFanBaseGift.num = jsonParser.getValueAsInt();
                    return true;
                case "giftUrl":
                    bLiveFanBaseGift.giftUrl = jsonParser.getValueAsString();
                    return true;
                case "expireDay":
                    bLiveFanBaseGift.expireDay = jsonParser.getValueAsString();
                    return true;
                case "giftName":
                    bLiveFanBaseGift.giftName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseGift bLiveFanBaseGift, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseGift.giftID;
            if (str != null) {
                jsonGenerator.writeStringField("giftID", str);
            }
            jsonGenerator.writeNumberField("num", bLiveFanBaseGift.num);
            String str2 = bLiveFanBaseGift.giftUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftUrl", str2);
            }
            String str3 = bLiveFanBaseGift.giftName;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftName", str3);
            }
            String str4 = bLiveFanBaseGift.expireDay;
            if (str4 != null) {
                jsonGenerator.writeStringField("expireDay", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasegift";

    @NonNull
    @ProtobufIndex(index = 5)
    public String expireDay;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftID;

    @NonNull
    @ProtobufIndex(index = 4)
    public String giftName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftUrl;

    @ProtobufIndex(index = 2)
    public int num;

    public static BLiveFanBaseGift new_() {
        BLiveFanBaseGift bLiveFanBaseGift = new BLiveFanBaseGift();
        bLiveFanBaseGift.nullCheck();
        return bLiveFanBaseGift;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseGift mo223809clone() {
        BLiveFanBaseGift bLiveFanBaseGift = new BLiveFanBaseGift();
        bLiveFanBaseGift.giftID = this.giftID;
        bLiveFanBaseGift.num = this.num;
        bLiveFanBaseGift.giftUrl = this.giftUrl;
        bLiveFanBaseGift.giftName = this.giftName;
        bLiveFanBaseGift.expireDay = this.expireDay;
        return bLiveFanBaseGift;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseGift)) {
            return false;
        }
        BLiveFanBaseGift bLiveFanBaseGift = (BLiveFanBaseGift) obj;
        return ValueObject.util_equals(this.giftID, bLiveFanBaseGift.giftID) && this.num == bLiveFanBaseGift.num && ValueObject.util_equals(this.giftUrl, bLiveFanBaseGift.giftUrl) && ValueObject.util_equals(this.giftName, bLiveFanBaseGift.giftName) && ValueObject.util_equals(this.expireDay, bLiveFanBaseGift.expireDay);
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
        String str = this.giftID;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.num) * 41;
        String str2 = this.giftUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.expireDay;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftID == null) {
            this.giftID = "";
        }
        if (this.giftUrl == null) {
            this.giftUrl = "";
        }
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.expireDay == null) {
            this.expireDay = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
