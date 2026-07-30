package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Prices extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prices";

    @NonNull
    @ProtobufIndex(index = 1)
    public String currencyCode;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String currencySymbol;

    @ProtobufIndex(index = 7)
    public double noneRenewalPrice;

    @ProtobufIndex(index = 8)
    public double noneRenewalUnitPrice;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public double originalPrice;

    @ProtobufIndex(index = 6)
    public double originalUnitPrice;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double price;

    @ProtobufIndex(index = 4)
    public double unitPrice;
    public static ProtobufAdapter<Prices> PROTOBUF_ADAPTER = new MessageNanoAdapter<Prices>() { // from class: com.p1.mobile.putong.core.data.Prices.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Prices prices) {
            String str = prices.currencyCode;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = prices.currencySymbol;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, prices.price) + CodedOutputByteBufferNano.d(4, prices.unitPrice) + CodedOutputByteBufferNano.d(5, prices.originalPrice) + CodedOutputByteBufferNano.d(6, prices.originalUnitPrice) + CodedOutputByteBufferNano.d(7, prices.noneRenewalPrice) + CodedOutputByteBufferNano.d(8, prices.noneRenewalUnitPrice);
            ((MessageNano) prices).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Prices m14845parse(nb5 nb5Var) throws IOException {
            Prices prices = new Prices();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (prices.currencyCode == null) {
                        prices.currencyCode = "";
                    }
                    if (prices.currencySymbol != null) {
                        break;
                    }
                    prices.currencySymbol = "";
                    break;
                }
                if (iU == 10) {
                    prices.currencyCode = nb5Var.s();
                } else if (iU == 18) {
                    prices.currencySymbol = nb5Var.s();
                } else if (iU == 25) {
                    prices.price = nb5Var.h();
                } else if (iU == 33) {
                    prices.unitPrice = nb5Var.h();
                } else if (iU == 41) {
                    prices.originalPrice = nb5Var.h();
                } else if (iU == 49) {
                    prices.originalUnitPrice = nb5Var.h();
                } else if (iU == 57) {
                    prices.noneRenewalPrice = nb5Var.h();
                } else {
                    if (iU != 65) {
                        if (prices.currencyCode == null) {
                            prices.currencyCode = "";
                        }
                        if (prices.currencySymbol != null) {
                            break;
                        }
                        prices.currencySymbol = "";
                        return prices;
                    }
                    prices.noneRenewalUnitPrice = nb5Var.h();
                }
            }
            return prices;
        }

        public void serialize(Prices prices, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = prices.currencyCode;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = prices.currencySymbol;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, prices.price);
            codedOutputByteBufferNano.C(4, prices.unitPrice);
            codedOutputByteBufferNano.C(5, prices.originalPrice);
            codedOutputByteBufferNano.C(6, prices.originalUnitPrice);
            codedOutputByteBufferNano.C(7, prices.noneRenewalPrice);
            codedOutputByteBufferNano.C(8, prices.noneRenewalUnitPrice);
        }
    };
    public static JsonAdapter<Prices> JSON_ADAPTER = new ObjectJsonAdapter<Prices>() { // from class: com.p1.mobile.putong.core.data.Prices.2
        public Class getDataClass() {
            return Prices.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Prices m14846newInstance() {
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

        public void serializeFields(Prices prices, JsonGenerator jsonGenerator) throws IOException {
            String str = prices.currencyCode;
            if (str != null) {
                jsonGenerator.writeStringField("currencyCode", str);
            }
            String str2 = prices.currencySymbol;
            if (str2 != null) {
                jsonGenerator.writeStringField("currencySymbol", str2);
            }
            jsonGenerator.writeNumberField("price", prices.price);
            jsonGenerator.writeNumberField("unitPrice", prices.unitPrice);
            jsonGenerator.writeNumberField("originalPrice", prices.originalPrice);
            jsonGenerator.writeNumberField("originalUnitPrice", prices.originalUnitPrice);
            jsonGenerator.writeNumberField("noneRenewalPrice", prices.noneRenewalPrice);
            jsonGenerator.writeNumberField("noneRenewalUnitPrice", prices.noneRenewalUnitPrice);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Prices) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Prices) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Prices new_() {
        Prices prices = new Prices();
        prices.nullCheck();
        return prices;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Prices m14844clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i8;
        return i8;
    }

    public void nullCheck() {
        if (this.currencyCode == null) {
            this.currencyCode = "";
        }
        if (this.currencySymbol == null) {
            this.currencySymbol = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
