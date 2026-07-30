package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class StockKeepUnit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "stockkeepunit";

    @NonNull
    @ProtobufIndex(index = 3)
    public AffiliateProducts affiliateProducts;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20507id;

    @NonNull
    @ProtobufIndex(index = 4)
    public Prices prices;

    @NonNull
    @ProtobufIndex(index = 5)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<StockKeepUnit> PROTOBUF_ADAPTER = new MessageNanoAdapter<StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.StockKeepUnit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StockKeepUnit stockKeepUnit) {
            String str = stockKeepUnit.f20507id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = stockKeepUnit.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            AffiliateProducts affiliateProducts = stockKeepUnit.affiliateProducts;
            if (affiliateProducts != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, affiliateProducts, AffiliateProducts.PROTOBUF_ADAPTER);
            }
            Prices prices = stockKeepUnit.prices;
            if (prices != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = stockKeepUnit.tracker;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            stockKeepUnit.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StockKeepUnit parse(nb5 nb5Var) throws IOException {
            StockKeepUnit stockKeepUnit = new StockKeepUnit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (stockKeepUnit.f20507id == null) {
                        stockKeepUnit.f20507id = "";
                    }
                    if (stockKeepUnit.type == null) {
                        stockKeepUnit.type = "";
                    }
                    if (stockKeepUnit.affiliateProducts == null) {
                        stockKeepUnit.affiliateProducts = AffiliateProducts.new_();
                    }
                    if (stockKeepUnit.prices == null) {
                        stockKeepUnit.prices = Prices.new_();
                    }
                    if (stockKeepUnit.tracker != null) {
                        break;
                    }
                    stockKeepUnit.tracker = "";
                    break;
                }
                if (iM158752u == 10) {
                    stockKeepUnit.f20507id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    stockKeepUnit.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    stockKeepUnit.affiliateProducts = (AffiliateProducts) nb5Var.m158743l(AffiliateProducts.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    stockKeepUnit.prices = (Prices) nb5Var.m158743l(Prices.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (stockKeepUnit.f20507id == null) {
                            stockKeepUnit.f20507id = "";
                        }
                        if (stockKeepUnit.type == null) {
                            stockKeepUnit.type = "";
                        }
                        if (stockKeepUnit.affiliateProducts == null) {
                            stockKeepUnit.affiliateProducts = AffiliateProducts.new_();
                        }
                        if (stockKeepUnit.prices == null) {
                            stockKeepUnit.prices = Prices.new_();
                        }
                        if (stockKeepUnit.tracker != null) {
                            break;
                        }
                        stockKeepUnit.tracker = "";
                        return stockKeepUnit;
                    }
                    stockKeepUnit.tracker = nb5Var.m158750s();
                }
            }
            return stockKeepUnit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StockKeepUnit stockKeepUnit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stockKeepUnit.f20507id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = stockKeepUnit.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            AffiliateProducts affiliateProducts = stockKeepUnit.affiliateProducts;
            if (affiliateProducts != null) {
                codedOutputByteBufferNano.m17254K(3, affiliateProducts, AffiliateProducts.PROTOBUF_ADAPTER);
            }
            Prices prices = stockKeepUnit.prices;
            if (prices != null) {
                codedOutputByteBufferNano.m17254K(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = stockKeepUnit.tracker;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
        }
    };
    public static JsonAdapter<StockKeepUnit> JSON_ADAPTER = new ObjectJsonAdapter<StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.StockKeepUnit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StockKeepUnit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StockKeepUnit newInstance() {
            return new StockKeepUnit();
        }

        public boolean parseField(StockKeepUnit stockKeepUnit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    stockKeepUnit.tracker = jsonParser.getValueAsString();
                    return true;
                case "prices":
                    stockKeepUnit.prices = Prices.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    stockKeepUnit.f20507id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    stockKeepUnit.type = jsonParser.getValueAsString();
                    return true;
                case "affiliateProducts":
                    stockKeepUnit.affiliateProducts = AffiliateProducts.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StockKeepUnit stockKeepUnit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tracker":
                case "prices":
                    return true;
                case "id":
                    return false;
                case "type":
                case "affiliateProducts":
                    return true;
                default:
                    return super.parseFieldCheck(stockKeepUnit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StockKeepUnit stockKeepUnit, JsonGenerator jsonGenerator) throws IOException {
            String str = stockKeepUnit.f20507id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = stockKeepUnit.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (stockKeepUnit.affiliateProducts != null) {
                jsonGenerator.writeFieldName("affiliateProducts");
                AffiliateProducts.JSON_ADAPTER.serialize(stockKeepUnit.affiliateProducts, jsonGenerator, true);
            }
            if (stockKeepUnit.prices != null) {
                jsonGenerator.writeFieldName(Prices.TYPE);
                Prices.JSON_ADAPTER.serialize(stockKeepUnit.prices, jsonGenerator, true);
            }
            String str3 = stockKeepUnit.tracker;
            if (str3 != null) {
                jsonGenerator.writeStringField("tracker", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StockKeepUnit new_() {
        StockKeepUnit stockKeepUnit = new StockKeepUnit();
        stockKeepUnit.nullCheck();
        return stockKeepUnit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StockKeepUnit mo223809clone() {
        StockKeepUnit stockKeepUnit = new StockKeepUnit();
        stockKeepUnit.f20507id = this.f20507id;
        stockKeepUnit.type = this.type;
        AffiliateProducts affiliateProducts = this.affiliateProducts;
        if (affiliateProducts != null) {
            stockKeepUnit.affiliateProducts = affiliateProducts.mo223809clone();
        }
        Prices prices = this.prices;
        if (prices != null) {
            stockKeepUnit.prices = prices.mo223809clone();
        }
        stockKeepUnit.tracker = this.tracker;
        return stockKeepUnit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StockKeepUnit)) {
            return false;
        }
        StockKeepUnit stockKeepUnit = (StockKeepUnit) obj;
        return ValueObject.util_equals(this.f20507id, stockKeepUnit.f20507id) && ValueObject.util_equals(this.type, stockKeepUnit.type) && ValueObject.util_equals(this.affiliateProducts, stockKeepUnit.affiliateProducts) && ValueObject.util_equals(this.prices, stockKeepUnit.prices) && ValueObject.util_equals(this.tracker, stockKeepUnit.tracker);
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
        String str = this.f20507id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        AffiliateProducts affiliateProducts = this.affiliateProducts;
        int iHashCode3 = (iHashCode2 + (affiliateProducts != null ? affiliateProducts.hashCode() : 0)) * 41;
        Prices prices = this.prices;
        int iHashCode4 = (iHashCode3 + (prices != null ? prices.hashCode() : 0)) * 41;
        String str3 = this.tracker;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20507id == null) {
            this.f20507id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.affiliateProducts == null) {
            this.affiliateProducts = AffiliateProducts.new_();
        }
        if (this.prices == null) {
            this.prices = Prices.new_();
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
