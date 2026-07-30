package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveLotteryGiftRedPacketGift extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLotteryGiftRedPacketGift> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLotteryGiftRedPacketGift>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketGift.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLotteryGiftRedPacketGift.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLotteryGiftRedPacketGift newInstance() {
            return new BLiveLotteryGiftRedPacketGift();
        }

        public boolean parseField(BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveLotteryGiftRedPacketGift.amount = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveLotteryGiftRedPacketGift.f44394id = jsonParser.getValueAsString();
                    return false;
                case "num":
                    bLiveLotteryGiftRedPacketGift.num = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    bLiveLotteryGiftRedPacketGift.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveLotteryGiftRedPacketGift.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLotteryGiftRedPacketGift.f44394id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveLotteryGiftRedPacketGift.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveLotteryGiftRedPacketGift.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeNumberField("num", bLiveLotteryGiftRedPacketGift.num);
            jsonGenerator.writeNumberField("amount", bLiveLotteryGiftRedPacketGift.amount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLotteryGiftRedPacketGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivelotterygiftredpacketgift";

    @ProtobufIndex(index = 5)
    public int amount;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44394id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 4)
    public int num;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    public static BLiveLotteryGiftRedPacketGift new_() {
        BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift = new BLiveLotteryGiftRedPacketGift();
        bLiveLotteryGiftRedPacketGift.nullCheck();
        return bLiveLotteryGiftRedPacketGift;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLotteryGiftRedPacketGift mo223809clone() {
        BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift = new BLiveLotteryGiftRedPacketGift();
        bLiveLotteryGiftRedPacketGift.f44394id = this.f44394id;
        bLiveLotteryGiftRedPacketGift.name = this.name;
        bLiveLotteryGiftRedPacketGift.url = this.url;
        bLiveLotteryGiftRedPacketGift.num = this.num;
        bLiveLotteryGiftRedPacketGift.amount = this.amount;
        return bLiveLotteryGiftRedPacketGift;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLotteryGiftRedPacketGift)) {
            return false;
        }
        BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift = (BLiveLotteryGiftRedPacketGift) obj;
        return ValueObject.util_equals(this.f44394id, bLiveLotteryGiftRedPacketGift.f44394id) && ValueObject.util_equals(this.name, bLiveLotteryGiftRedPacketGift.name) && ValueObject.util_equals(this.url, bLiveLotteryGiftRedPacketGift.url) && this.num == bLiveLotteryGiftRedPacketGift.num && this.amount == bLiveLotteryGiftRedPacketGift.amount;
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
        String str = this.f44394id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.num) * 41) + this.amount;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44394id == null) {
            this.f44394id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
