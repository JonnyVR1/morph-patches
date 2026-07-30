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
public class StockKeepUnit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "stockkeepunit";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public AffiliateProducts affiliateProducts;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f169id;

    @NonNull
    @ProtobufIndex(index = 4)
    public Prices prices;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<StockKeepUnit> PROTOBUF_ADAPTER = new MessageNanoAdapter<StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.StockKeepUnit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StockKeepUnit stockKeepUnit) {
            String str = stockKeepUnit.f169id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = stockKeepUnit.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            AffiliateProducts affiliateProducts = stockKeepUnit.affiliateProducts;
            if (affiliateProducts != null) {
                iO += CodedOutputByteBufferNano.l(3, affiliateProducts, AffiliateProducts.PROTOBUF_ADAPTER);
            }
            Prices prices = stockKeepUnit.prices;
            if (prices != null) {
                iO += CodedOutputByteBufferNano.l(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = stockKeepUnit.tracker;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) stockKeepUnit).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StockKeepUnit m15788parse(nb5 nb5Var) throws IOException {
            StockKeepUnit stockKeepUnit = new StockKeepUnit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stockKeepUnit.f169id == null) {
                        stockKeepUnit.f169id = "";
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
                if (iU == 10) {
                    stockKeepUnit.f169id = nb5Var.s();
                } else if (iU == 18) {
                    stockKeepUnit.type = nb5Var.s();
                } else if (iU == 26) {
                    stockKeepUnit.affiliateProducts = (AffiliateProducts) nb5Var.l(AffiliateProducts.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    stockKeepUnit.prices = (Prices) nb5Var.l(Prices.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (stockKeepUnit.f169id == null) {
                            stockKeepUnit.f169id = "";
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
                    stockKeepUnit.tracker = nb5Var.s();
                }
            }
            return stockKeepUnit;
        }

        public void serialize(StockKeepUnit stockKeepUnit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stockKeepUnit.f169id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = stockKeepUnit.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            AffiliateProducts affiliateProducts = stockKeepUnit.affiliateProducts;
            if (affiliateProducts != null) {
                codedOutputByteBufferNano.K(3, affiliateProducts, AffiliateProducts.PROTOBUF_ADAPTER);
            }
            Prices prices = stockKeepUnit.prices;
            if (prices != null) {
                codedOutputByteBufferNano.K(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = stockKeepUnit.tracker;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<StockKeepUnit> JSON_ADAPTER = new ObjectJsonAdapter<StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.StockKeepUnit.2
        public Class getDataClass() {
            return StockKeepUnit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public StockKeepUnit m15789newInstance() {
            return new StockKeepUnit();
        }

        public boolean parseField(StockKeepUnit stockKeepUnit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    stockKeepUnit.tracker = jsonParser.getValueAsString();
                    return true;
                case "prices":
                    stockKeepUnit.prices = (Prices) Prices.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    stockKeepUnit.f169id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    stockKeepUnit.type = jsonParser.getValueAsString();
                    return true;
                case "affiliateProducts":
                    stockKeepUnit.affiliateProducts = (AffiliateProducts) AffiliateProducts.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(StockKeepUnit stockKeepUnit, JsonGenerator jsonGenerator) throws IOException {
            String str = stockKeepUnit.f169id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StockKeepUnit new_() {
        StockKeepUnit stockKeepUnit = new StockKeepUnit();
        stockKeepUnit.nullCheck();
        return stockKeepUnit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StockKeepUnit m15787clone() {
        StockKeepUnit stockKeepUnit = new StockKeepUnit();
        stockKeepUnit.f169id = this.f169id;
        stockKeepUnit.type = this.type;
        AffiliateProducts affiliateProducts = this.affiliateProducts;
        if (affiliateProducts != null) {
            stockKeepUnit.affiliateProducts = affiliateProducts.m11548clone();
        }
        Prices prices = this.prices;
        if (prices != null) {
            stockKeepUnit.prices = prices.m14844clone();
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
        return ValueObject.util_equals(this.f169id, stockKeepUnit.f169id) && ValueObject.util_equals(this.type, stockKeepUnit.type) && ValueObject.util_equals(this.affiliateProducts, stockKeepUnit.affiliateProducts) && ValueObject.util_equals(this.prices, stockKeepUnit.prices) && ValueObject.util_equals(this.tracker, stockKeepUnit.tracker);
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
        String str = this.f169id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        AffiliateProducts affiliateProducts = this.affiliateProducts;
        int iHashCode3 = (iHashCode2 + (affiliateProducts != null ? affiliateProducts.hashCode() : 0)) * 41;
        Prices prices = this.prices;
        int iHashCode4 = (iHashCode3 + (prices != null ? prices.hashCode() : 0)) * 41;
        String str3 = this.tracker;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f169id == null) {
            this.f169id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
