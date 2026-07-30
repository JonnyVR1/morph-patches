package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLivePrices extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePrices> JSON_ADAPTER = new ObjectJsonAdapter<BLivePrices>() { // from class: com.p1.mobile.putong.live.base.data.BLivePrices.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePrices.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePrices newInstance() {
            return new BLivePrices();
        }

        public boolean parseField(BLivePrices bLivePrices, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "noneRenewalPrice":
                    bLivePrices.noneRenewalPrice = jsonParser.getValueAsDouble();
                    return true;
                case "unitPrice":
                    bLivePrices.unitPrice = jsonParser.getValueAsDouble();
                    return true;
                case "currencySymbol":
                    bLivePrices.currencySymbol = jsonParser.getValueAsString();
                    return true;
                case "price":
                    bLivePrices.price = jsonParser.getValueAsDouble();
                    return true;
                case "originalUnitPrice":
                    bLivePrices.originalUnitPrice = jsonParser.getValueAsDouble();
                    return true;
                case "currencyCode":
                    bLivePrices.currencyCode = jsonParser.getValueAsString();
                    return true;
                case "noneRenewalUnitPrice":
                    bLivePrices.noneRenewalUnitPrice = jsonParser.getValueAsDouble();
                    return true;
                case "originalPrice":
                    bLivePrices.originalPrice = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePrices bLivePrices, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePrices.currencyCode;
            if (str != null) {
                jsonGenerator.writeStringField(AppsFlyerProperties.CURRENCY_CODE, str);
            }
            String str2 = bLivePrices.currencySymbol;
            if (str2 != null) {
                jsonGenerator.writeStringField("currencySymbol", str2);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, bLivePrices.price);
            jsonGenerator.writeNumberField("unitPrice", bLivePrices.unitPrice);
            jsonGenerator.writeNumberField("originalPrice", bLivePrices.originalPrice);
            jsonGenerator.writeNumberField("originalUnitPrice", bLivePrices.originalUnitPrice);
            jsonGenerator.writeNumberField("noneRenewalPrice", bLivePrices.noneRenewalPrice);
            jsonGenerator.writeNumberField("noneRenewalUnitPrice", bLivePrices.noneRenewalUnitPrice);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePrices) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveprices";

    @NonNull
    @ProtobufIndex(index = 1)
    public String currencyCode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String currencySymbol;

    @ProtobufIndex(index = 7)
    public double noneRenewalPrice;

    @ProtobufIndex(index = 8)
    public double noneRenewalUnitPrice;

    @ProtobufIndex(index = 5)
    public double originalPrice;

    @ProtobufIndex(index = 6)
    public double originalUnitPrice;

    @ProtobufIndex(index = 3)
    public double price;

    @ProtobufIndex(index = 4)
    public double unitPrice;

    public static BLivePrices new_() {
        BLivePrices bLivePrices = new BLivePrices();
        bLivePrices.nullCheck();
        return bLivePrices;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePrices mo225055clone() {
        BLivePrices bLivePrices = new BLivePrices();
        bLivePrices.currencyCode = this.currencyCode;
        bLivePrices.currencySymbol = this.currencySymbol;
        bLivePrices.price = this.price;
        bLivePrices.unitPrice = this.unitPrice;
        bLivePrices.originalPrice = this.originalPrice;
        bLivePrices.originalUnitPrice = this.originalUnitPrice;
        bLivePrices.noneRenewalPrice = this.noneRenewalPrice;
        bLivePrices.noneRenewalUnitPrice = this.noneRenewalUnitPrice;
        return bLivePrices;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePrices)) {
            return false;
        }
        BLivePrices bLivePrices = (BLivePrices) obj;
        return ValueObject.util_equals(this.currencyCode, bLivePrices.currencyCode) && ValueObject.util_equals(this.currencySymbol, bLivePrices.currencySymbol) && this.price == bLivePrices.price && this.unitPrice == bLivePrices.unitPrice && this.originalPrice == bLivePrices.originalPrice && this.originalUnitPrice == bLivePrices.originalUnitPrice && this.noneRenewalPrice == bLivePrices.noneRenewalPrice && this.noneRenewalUnitPrice == bLivePrices.noneRenewalUnitPrice;
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
        String str = this.currencyCode;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.currencySymbol;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.price);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.unitPrice);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.originalPrice);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.originalUnitPrice);
        int i6 = (i5 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.noneRenewalPrice);
        int i7 = (i6 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.noneRenewalUnitPrice);
        int i8 = (i7 * 41) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        this.hashCode = i8;
        return i8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currencyCode == null) {
            this.currencyCode = "";
        }
        if (this.currencySymbol == null) {
            this.currencySymbol = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
