package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class Prices extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prices";

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
    public static ProtobufAdapter<Prices> PROTOBUF_ADAPTER = new MessageNanoAdapter<Prices>() { // from class: com.p1.mobile.putong.core.data.Prices.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Prices prices) {
            String str = prices.currencyCode;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = prices.currencySymbol;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(3, prices.price) + CodedOutputByteBufferNano.m17277d(4, prices.unitPrice) + CodedOutputByteBufferNano.m17277d(5, prices.originalPrice) + CodedOutputByteBufferNano.m17277d(6, prices.originalUnitPrice) + CodedOutputByteBufferNano.m17277d(7, prices.noneRenewalPrice) + CodedOutputByteBufferNano.m17277d(8, prices.noneRenewalUnitPrice);
            prices.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Prices parse(nc5 nc5Var) throws IOException {
            Prices prices = new Prices();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (prices.currencyCode == null) {
                        prices.currencyCode = "";
                    }
                    if (prices.currencySymbol != null) {
                        break;
                    }
                    prices.currencySymbol = "";
                    break;
                }
                if (iM162497u == 10) {
                    prices.currencyCode = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    prices.currencySymbol = nc5Var.m162495s();
                } else if (iM162497u == 25) {
                    prices.price = nc5Var.m162484h();
                } else if (iM162497u == 33) {
                    prices.unitPrice = nc5Var.m162484h();
                } else if (iM162497u == 41) {
                    prices.originalPrice = nc5Var.m162484h();
                } else if (iM162497u == 49) {
                    prices.originalUnitPrice = nc5Var.m162484h();
                } else if (iM162497u == 57) {
                    prices.noneRenewalPrice = nc5Var.m162484h();
                } else {
                    if (iM162497u != 65) {
                        if (prices.currencyCode == null) {
                            prices.currencyCode = "";
                        }
                        if (prices.currencySymbol != null) {
                            break;
                        }
                        prices.currencySymbol = "";
                        return prices;
                    }
                    prices.noneRenewalUnitPrice = nc5Var.m162484h();
                }
            }
            return prices;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Prices prices, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = prices.currencyCode;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = prices.currencySymbol;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17301C(3, prices.price);
            codedOutputByteBufferNano.m17301C(4, prices.unitPrice);
            codedOutputByteBufferNano.m17301C(5, prices.originalPrice);
            codedOutputByteBufferNano.m17301C(6, prices.originalUnitPrice);
            codedOutputByteBufferNano.m17301C(7, prices.noneRenewalPrice);
            codedOutputByteBufferNano.m17301C(8, prices.noneRenewalUnitPrice);
        }
    };
    public static JsonAdapter<Prices> JSON_ADAPTER = new ObjectJsonAdapter<Prices>() { // from class: com.p1.mobile.putong.core.data.Prices.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Prices.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Prices newInstance() {
            return new Prices();
        }

        public boolean parseField(Prices prices, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "noneRenewalPrice":
                    prices.noneRenewalPrice = jsonParser.getValueAsDouble();
                    return true;
                case "unitPrice":
                    prices.unitPrice = jsonParser.getValueAsDouble();
                    return true;
                case "currencySymbol":
                    prices.currencySymbol = jsonParser.getValueAsString();
                    return true;
                case "price":
                    prices.price = jsonParser.getValueAsDouble();
                    return true;
                case "originalUnitPrice":
                    prices.originalUnitPrice = jsonParser.getValueAsDouble();
                    return true;
                case "currencyCode":
                    prices.currencyCode = jsonParser.getValueAsString();
                    return true;
                case "noneRenewalUnitPrice":
                    prices.noneRenewalUnitPrice = jsonParser.getValueAsDouble();
                    return true;
                case "originalPrice":
                    prices.originalPrice = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Prices prices, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "noneRenewalPrice":
                case "unitPrice":
                case "currencySymbol":
                case "price":
                case "originalUnitPrice":
                case "currencyCode":
                case "noneRenewalUnitPrice":
                case "originalPrice":
                    return true;
                default:
                    return super.parseFieldCheck(prices, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Prices prices, JsonGenerator jsonGenerator) throws IOException {
            String str = prices.currencyCode;
            if (str != null) {
                jsonGenerator.writeStringField(AppsFlyerProperties.CURRENCY_CODE, str);
            }
            String str2 = prices.currencySymbol;
            if (str2 != null) {
                jsonGenerator.writeStringField("currencySymbol", str2);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, prices.price);
            jsonGenerator.writeNumberField("unitPrice", prices.unitPrice);
            jsonGenerator.writeNumberField("originalPrice", prices.originalPrice);
            jsonGenerator.writeNumberField("originalUnitPrice", prices.originalUnitPrice);
            jsonGenerator.writeNumberField("noneRenewalPrice", prices.noneRenewalPrice);
            jsonGenerator.writeNumberField("noneRenewalUnitPrice", prices.noneRenewalUnitPrice);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Prices) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Prices) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Prices new_() {
        Prices prices = new Prices();
        prices.nullCheck();
        return prices;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Prices mo225055clone() {
        Prices prices = new Prices();
        prices.currencyCode = this.currencyCode;
        prices.currencySymbol = this.currencySymbol;
        prices.price = this.price;
        prices.unitPrice = this.unitPrice;
        prices.originalPrice = this.originalPrice;
        prices.originalUnitPrice = this.originalUnitPrice;
        prices.noneRenewalPrice = this.noneRenewalPrice;
        prices.noneRenewalUnitPrice = this.noneRenewalUnitPrice;
        return prices;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Prices)) {
            return false;
        }
        Prices prices = (Prices) obj;
        return ValueObject.util_equals(this.currencyCode, prices.currencyCode) && ValueObject.util_equals(this.currencySymbol, prices.currencySymbol) && this.price == prices.price && this.unitPrice == prices.unitPrice && this.originalPrice == prices.originalPrice && this.originalUnitPrice == prices.originalUnitPrice && this.noneRenewalPrice == prices.noneRenewalPrice && this.noneRenewalUnitPrice == prices.noneRenewalUnitPrice;
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
