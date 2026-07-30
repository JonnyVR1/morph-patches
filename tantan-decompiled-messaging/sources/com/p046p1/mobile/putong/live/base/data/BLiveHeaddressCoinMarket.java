package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveHeaddressCoinMarketItem;
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
public class BLiveHeaddressCoinMarket extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHeaddressCoinMarket> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHeaddressCoinMarket>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHeaddressCoinMarket.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHeaddressCoinMarket.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHeaddressCoinMarket newInstance() {
            return new BLiveHeaddressCoinMarket();
        }

        public boolean parseField(BLiveHeaddressCoinMarket bLiveHeaddressCoinMarket, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "purchaseRecordUrl":
                    bLiveHeaddressCoinMarket.purchaseRecordUrl = jsonParser.getValueAsString();
                    return true;
                case "flameCoinBalance":
                    bLiveHeaddressCoinMarket.flameCoinBalance = jsonParser.getValueAsLong();
                    return true;
                case "products":
                    bLiveHeaddressCoinMarket.products = JsonAdapter.parseArray(jsonParser, BLiveHeaddressCoinMarketItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "currentTime":
                    bLiveHeaddressCoinMarket.currentTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHeaddressCoinMarket bLiveHeaddressCoinMarket, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("currentTime", bLiveHeaddressCoinMarket.currentTime);
            jsonGenerator.writeNumberField("flameCoinBalance", bLiveHeaddressCoinMarket.flameCoinBalance);
            String str = bLiveHeaddressCoinMarket.purchaseRecordUrl;
            if (str != null) {
                jsonGenerator.writeStringField("purchaseRecordUrl", str);
            }
            if (bLiveHeaddressCoinMarket.products != null) {
                jsonGenerator.writeFieldName("products");
                JsonAdapter.serializeArray(bLiveHeaddressCoinMarket.products, jsonGenerator, BLiveHeaddressCoinMarketItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHeaddressCoinMarket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveheaddresscoinmarket";

    @ProtobufIndex(index = 1)
    public long currentTime;

    @ProtobufIndex(index = 2)
    public long flameCoinBalance;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveHeaddressCoinMarketItem> products;

    @NonNull
    @ProtobufIndex(index = 4)
    public String purchaseRecordUrl;

    public static BLiveHeaddressCoinMarket new_() {
        BLiveHeaddressCoinMarket bLiveHeaddressCoinMarket = new BLiveHeaddressCoinMarket();
        bLiveHeaddressCoinMarket.nullCheck();
        return bLiveHeaddressCoinMarket;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHeaddressCoinMarket mo223809clone() {
        BLiveHeaddressCoinMarket bLiveHeaddressCoinMarket = new BLiveHeaddressCoinMarket();
        bLiveHeaddressCoinMarket.currentTime = this.currentTime;
        bLiveHeaddressCoinMarket.flameCoinBalance = this.flameCoinBalance;
        bLiveHeaddressCoinMarket.purchaseRecordUrl = this.purchaseRecordUrl;
        List<BLiveHeaddressCoinMarketItem> list = this.products;
        if (list != null) {
            bLiveHeaddressCoinMarket.products = ValueObject.util_map(list, new w9j() { // from class: l.e12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveHeaddressCoinMarketItem) obj).mo223809clone();
                }
            });
        }
        return bLiveHeaddressCoinMarket;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHeaddressCoinMarket)) {
            return false;
        }
        BLiveHeaddressCoinMarket bLiveHeaddressCoinMarket = (BLiveHeaddressCoinMarket) obj;
        return this.currentTime == bLiveHeaddressCoinMarket.currentTime && this.flameCoinBalance == bLiveHeaddressCoinMarket.flameCoinBalance && ValueObject.util_equals(this.purchaseRecordUrl, bLiveHeaddressCoinMarket.purchaseRecordUrl) && ValueObject.util_equals(this.products, bLiveHeaddressCoinMarket.products);
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
        long j = this.currentTime;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.flameCoinBalance;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.purchaseRecordUrl;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveHeaddressCoinMarketItem> list = this.products;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.purchaseRecordUrl == null) {
            this.purchaseRecordUrl = "";
        }
        if (this.products == null) {
            this.products = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
