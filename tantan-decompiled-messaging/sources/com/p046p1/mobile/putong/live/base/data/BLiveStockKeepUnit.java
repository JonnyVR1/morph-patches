package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Prices;
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
public class BLiveStockKeepUnit extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStockKeepUnit> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStockKeepUnit>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStockKeepUnit.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStockKeepUnit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStockKeepUnit newInstance() {
            return new BLiveStockKeepUnit();
        }

        public boolean parseField(BLiveStockKeepUnit bLiveStockKeepUnit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    bLiveStockKeepUnit.tracker = jsonParser.getValueAsString();
                    return true;
                case "prices":
                    bLiveStockKeepUnit.prices = BLivePrices.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveStockKeepUnit.f44443id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveStockKeepUnit.type = jsonParser.getValueAsString();
                    return true;
                case "affiliateProducts":
                    bLiveStockKeepUnit.affiliateProducts = BLiveAffiliateProducts.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStockKeepUnit bLiveStockKeepUnit, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStockKeepUnit.f44443id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveStockKeepUnit.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLiveStockKeepUnit.affiliateProducts != null) {
                jsonGenerator.writeFieldName("affiliateProducts");
                BLiveAffiliateProducts.JSON_ADAPTER.serialize(bLiveStockKeepUnit.affiliateProducts, jsonGenerator, true);
            }
            if (bLiveStockKeepUnit.prices != null) {
                jsonGenerator.writeFieldName(Prices.TYPE);
                BLivePrices.JSON_ADAPTER.serialize(bLiveStockKeepUnit.prices, jsonGenerator, true);
            }
            String str3 = bLiveStockKeepUnit.tracker;
            if (str3 != null) {
                jsonGenerator.writeStringField("tracker", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestockkeepunit";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveAffiliateProducts affiliateProducts;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44443id;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLivePrices prices;

    @NonNull
    @ProtobufIndex(index = 5)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveStockKeepUnit new_() {
        BLiveStockKeepUnit bLiveStockKeepUnit = new BLiveStockKeepUnit();
        bLiveStockKeepUnit.nullCheck();
        return bLiveStockKeepUnit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStockKeepUnit mo223809clone() {
        BLiveStockKeepUnit bLiveStockKeepUnit = new BLiveStockKeepUnit();
        bLiveStockKeepUnit.f44443id = this.f44443id;
        bLiveStockKeepUnit.type = this.type;
        BLiveAffiliateProducts bLiveAffiliateProducts = this.affiliateProducts;
        if (bLiveAffiliateProducts != null) {
            bLiveStockKeepUnit.affiliateProducts = bLiveAffiliateProducts.mo223809clone();
        }
        BLivePrices bLivePrices = this.prices;
        if (bLivePrices != null) {
            bLiveStockKeepUnit.prices = bLivePrices.mo223809clone();
        }
        bLiveStockKeepUnit.tracker = this.tracker;
        return bLiveStockKeepUnit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStockKeepUnit)) {
            return false;
        }
        BLiveStockKeepUnit bLiveStockKeepUnit = (BLiveStockKeepUnit) obj;
        return ValueObject.util_equals(this.f44443id, bLiveStockKeepUnit.f44443id) && ValueObject.util_equals(this.type, bLiveStockKeepUnit.type) && ValueObject.util_equals(this.affiliateProducts, bLiveStockKeepUnit.affiliateProducts) && ValueObject.util_equals(this.prices, bLiveStockKeepUnit.prices) && ValueObject.util_equals(this.tracker, bLiveStockKeepUnit.tracker);
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
        String str = this.f44443id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveAffiliateProducts bLiveAffiliateProducts = this.affiliateProducts;
        int iHashCode3 = (iHashCode2 + (bLiveAffiliateProducts != null ? bLiveAffiliateProducts.hashCode() : 0)) * 41;
        BLivePrices bLivePrices = this.prices;
        int iHashCode4 = (iHashCode3 + (bLivePrices != null ? bLivePrices.hashCode() : 0)) * 41;
        String str3 = this.tracker;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44443id == null) {
            this.f44443id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.affiliateProducts == null) {
            this.affiliateProducts = BLiveAffiliateProducts.new_();
        }
        if (this.prices == null) {
            this.prices = BLivePrices.new_();
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
