package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class StockKeepUnit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "stockkeepunit";

    @NonNull
    @ProtobufIndex(index = 3)
    public AffiliateProducts affiliateProducts;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21249id;

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
            String str = stockKeepUnit.f21249id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = stockKeepUnit.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            AffiliateProducts affiliateProducts = stockKeepUnit.affiliateProducts;
            if (affiliateProducts != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, affiliateProducts, AffiliateProducts.PROTOBUF_ADAPTER);
            }
            Prices prices = stockKeepUnit.prices;
            if (prices != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = stockKeepUnit.tracker;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            stockKeepUnit.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StockKeepUnit parse(nc5 nc5Var) throws IOException {
            StockKeepUnit stockKeepUnit = new StockKeepUnit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (stockKeepUnit.f21249id == null) {
                        stockKeepUnit.f21249id = "";
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
                if (iM162497u == 10) {
                    stockKeepUnit.f21249id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    stockKeepUnit.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    stockKeepUnit.affiliateProducts = (AffiliateProducts) nc5Var.m162488l(AffiliateProducts.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    stockKeepUnit.prices = (Prices) nc5Var.m162488l(Prices.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
                        if (stockKeepUnit.f21249id == null) {
                            stockKeepUnit.f21249id = "";
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
                    stockKeepUnit.tracker = nc5Var.m162495s();
                }
            }
            return stockKeepUnit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StockKeepUnit stockKeepUnit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stockKeepUnit.f21249id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = stockKeepUnit.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            AffiliateProducts affiliateProducts = stockKeepUnit.affiliateProducts;
            if (affiliateProducts != null) {
                codedOutputByteBufferNano.m17309K(3, affiliateProducts, AffiliateProducts.PROTOBUF_ADAPTER);
            }
            Prices prices = stockKeepUnit.prices;
            if (prices != null) {
                codedOutputByteBufferNano.m17309K(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = stockKeepUnit.tracker;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
        }
    };
    public static JsonAdapter<StockKeepUnit> JSON_ADAPTER = new ObjectJsonAdapter<StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.StockKeepUnit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StockKeepUnit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    stockKeepUnit.f21249id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StockKeepUnit stockKeepUnit, JsonGenerator jsonGenerator) throws IOException {
            String str = stockKeepUnit.f21249id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public StockKeepUnit mo225055clone() {
        StockKeepUnit stockKeepUnit = new StockKeepUnit();
        stockKeepUnit.f21249id = this.f21249id;
        stockKeepUnit.type = this.type;
        AffiliateProducts affiliateProducts = this.affiliateProducts;
        if (affiliateProducts != null) {
            stockKeepUnit.affiliateProducts = affiliateProducts.mo225055clone();
        }
        Prices prices = this.prices;
        if (prices != null) {
            stockKeepUnit.prices = prices.mo225055clone();
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
        return ValueObject.util_equals(this.f21249id, stockKeepUnit.f21249id) && ValueObject.util_equals(this.type, stockKeepUnit.type) && ValueObject.util_equals(this.affiliateProducts, stockKeepUnit.affiliateProducts) && ValueObject.util_equals(this.prices, stockKeepUnit.prices) && ValueObject.util_equals(this.tracker, stockKeepUnit.tracker);
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
        String str = this.f21249id;
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
        if (this.f21249id == null) {
            this.f21249id = "";
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
