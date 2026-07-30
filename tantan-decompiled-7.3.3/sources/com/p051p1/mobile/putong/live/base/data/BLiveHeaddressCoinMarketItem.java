package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveHeaddressCoinMarketItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHeaddressCoinMarketItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHeaddressCoinMarketItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHeaddressCoinMarketItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHeaddressCoinMarketItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHeaddressCoinMarketItem newInstance() {
            return new BLiveHeaddressCoinMarketItem();
        }

        public boolean parseField(BLiveHeaddressCoinMarketItem bLiveHeaddressCoinMarketItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "staticUrl":
                    bLiveHeaddressCoinMarketItem.staticUrl = jsonParser.getValueAsString();
                    return true;
                case "dynamicUrl":
                    bLiveHeaddressCoinMarketItem.dynamicUrl = jsonParser.getValueAsString();
                    return true;
                case "expiredDays":
                    bLiveHeaddressCoinMarketItem.expiredDays = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    bLiveHeaddressCoinMarketItem.f45234id = jsonParser.getValueAsString();
                    return false;
                case "coin":
                    bLiveHeaddressCoinMarketItem.coin = jsonParser.getValueAsLong();
                    return true;
                case "name":
                    bLiveHeaddressCoinMarketItem.name = jsonParser.getValueAsString();
                    return true;
                case "userAvatar":
                    bLiveHeaddressCoinMarketItem.userAvatar = jsonParser.getValueAsString();
                    return true;
                case "purchaseDetail":
                    bLiveHeaddressCoinMarketItem.purchaseDetail = BLiveHeaddressPurchaseDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHeaddressCoinMarketItem bLiveHeaddressCoinMarketItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveHeaddressCoinMarketItem.f45234id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveHeaddressCoinMarketItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveHeaddressCoinMarketItem.staticUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("staticUrl", str3);
            }
            String str4 = bLiveHeaddressCoinMarketItem.dynamicUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("dynamicUrl", str4);
            }
            String str5 = bLiveHeaddressCoinMarketItem.userAvatar;
            if (str5 != null) {
                jsonGenerator.writeStringField("userAvatar", str5);
            }
            jsonGenerator.writeNumberField("expiredDays", bLiveHeaddressCoinMarketItem.expiredDays);
            jsonGenerator.writeNumberField("coin", bLiveHeaddressCoinMarketItem.coin);
            if (bLiveHeaddressCoinMarketItem.purchaseDetail != null) {
                jsonGenerator.writeFieldName("purchaseDetail");
                BLiveHeaddressPurchaseDetail.JSON_ADAPTER.serialize(bLiveHeaddressCoinMarketItem.purchaseDetail, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHeaddressCoinMarketItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveheaddresscoinmarketitem";

    @ProtobufIndex(index = 6)
    public long coin;

    @NonNull
    @ProtobufIndex(index = 8)
    public String dynamicUrl;

    @ProtobufIndex(index = 5)
    public long expiredDays;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45234id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveHeaddressPurchaseDetail purchaseDetail;

    @NonNull
    @ProtobufIndex(index = 3)
    public String staticUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userAvatar;

    public static BLiveHeaddressCoinMarketItem new_() {
        BLiveHeaddressCoinMarketItem bLiveHeaddressCoinMarketItem = new BLiveHeaddressCoinMarketItem();
        bLiveHeaddressCoinMarketItem.nullCheck();
        return bLiveHeaddressCoinMarketItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHeaddressCoinMarketItem mo225055clone() {
        BLiveHeaddressCoinMarketItem bLiveHeaddressCoinMarketItem = new BLiveHeaddressCoinMarketItem();
        bLiveHeaddressCoinMarketItem.f45234id = this.f45234id;
        bLiveHeaddressCoinMarketItem.name = this.name;
        bLiveHeaddressCoinMarketItem.staticUrl = this.staticUrl;
        bLiveHeaddressCoinMarketItem.dynamicUrl = this.dynamicUrl;
        bLiveHeaddressCoinMarketItem.userAvatar = this.userAvatar;
        bLiveHeaddressCoinMarketItem.expiredDays = this.expiredDays;
        bLiveHeaddressCoinMarketItem.coin = this.coin;
        BLiveHeaddressPurchaseDetail bLiveHeaddressPurchaseDetail = this.purchaseDetail;
        if (bLiveHeaddressPurchaseDetail != null) {
            bLiveHeaddressCoinMarketItem.purchaseDetail = bLiveHeaddressPurchaseDetail.mo225055clone();
        }
        return bLiveHeaddressCoinMarketItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHeaddressCoinMarketItem)) {
            return false;
        }
        BLiveHeaddressCoinMarketItem bLiveHeaddressCoinMarketItem = (BLiveHeaddressCoinMarketItem) obj;
        return ValueObject.util_equals(this.f45234id, bLiveHeaddressCoinMarketItem.f45234id) && ValueObject.util_equals(this.name, bLiveHeaddressCoinMarketItem.name) && ValueObject.util_equals(this.staticUrl, bLiveHeaddressCoinMarketItem.staticUrl) && ValueObject.util_equals(this.dynamicUrl, bLiveHeaddressCoinMarketItem.dynamicUrl) && ValueObject.util_equals(this.userAvatar, bLiveHeaddressCoinMarketItem.userAvatar) && this.expiredDays == bLiveHeaddressCoinMarketItem.expiredDays && this.coin == bLiveHeaddressCoinMarketItem.coin && ValueObject.util_equals(this.purchaseDetail, bLiveHeaddressCoinMarketItem.purchaseDetail);
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
        String str = this.f45234id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.staticUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.dynamicUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userAvatar;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        long j = this.expiredDays;
        int i3 = (((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.coin;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        BLiveHeaddressPurchaseDetail bLiveHeaddressPurchaseDetail = this.purchaseDetail;
        int iHashCode6 = i4 + (bLiveHeaddressPurchaseDetail != null ? bLiveHeaddressPurchaseDetail.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45234id == null) {
            this.f45234id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.staticUrl == null) {
            this.staticUrl = "";
        }
        if (this.dynamicUrl == null) {
            this.dynamicUrl = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.purchaseDetail == null) {
            this.purchaseDetail = BLiveHeaddressPurchaseDetail.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
