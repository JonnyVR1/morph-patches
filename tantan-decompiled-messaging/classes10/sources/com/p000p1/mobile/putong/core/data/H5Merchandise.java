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
public class H5Merchandise extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5merchandise";

    @NonNull
    @ProtobufIndex(index = 4)
    public ProductCategory category;

    @NonNull
    @ProtobufIndex(index = 7)
    public H5StockKeepUnit defaultStockKeepUnit;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f72id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String payment;

    @NonNull
    @ProtobufIndex(index = 6)
    public ProductType productType;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int quantity;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String tracker;
    public static ProtobufAdapter<H5Merchandise> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5Merchandise>() { // from class: com.p1.mobile.putong.core.data.H5Merchandise.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5Merchandise h5Merchandise) {
            String str = h5Merchandise.f72id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = h5Merchandise.payment;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = h5Merchandise.tracker;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ProductCategory productCategory = h5Merchandise.category;
            if (productCategory != null) {
                iO += CodedOutputByteBufferNano.l(4, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, h5Merchandise.quantity);
            ProductType productType = h5Merchandise.productType;
            if (productType != null) {
                iH += CodedOutputByteBufferNano.l(6, productType, ProductType.PROTOBUF_ADAPTER);
            }
            H5StockKeepUnit h5StockKeepUnit = h5Merchandise.defaultStockKeepUnit;
            if (h5StockKeepUnit != null) {
                iH += CodedOutputByteBufferNano.l(7, h5StockKeepUnit, H5StockKeepUnit.PROTOBUF_ADAPTER);
            }
            ((MessageNano) h5Merchandise).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5Merchandise m13181parse(nb5 nb5Var) throws IOException {
            H5Merchandise h5Merchandise = new H5Merchandise();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (h5Merchandise.f72id == null) {
                        h5Merchandise.f72id = "";
                    }
                    if (h5Merchandise.payment == null) {
                        h5Merchandise.payment = "";
                    }
                    if (h5Merchandise.tracker == null) {
                        h5Merchandise.tracker = "";
                    }
                    if (h5Merchandise.category == null) {
                        h5Merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    }
                    if (h5Merchandise.productType == null) {
                        h5Merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
                    }
                    if (h5Merchandise.defaultStockKeepUnit != null) {
                        break;
                    }
                    h5Merchandise.defaultStockKeepUnit = H5StockKeepUnit.new_();
                    break;
                }
                if (iU == 10) {
                    h5Merchandise.f72id = nb5Var.s();
                } else if (iU == 18) {
                    h5Merchandise.payment = nb5Var.s();
                } else if (iU == 26) {
                    h5Merchandise.tracker = nb5Var.s();
                } else if (iU == 34) {
                    h5Merchandise.category = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
                } else if (iU == 40) {
                    h5Merchandise.quantity = nb5Var.j();
                } else if (iU == 50) {
                    h5Merchandise.productType = (ProductType) nb5Var.l(ProductType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 58) {
                        if (h5Merchandise.f72id == null) {
                            h5Merchandise.f72id = "";
                        }
                        if (h5Merchandise.payment == null) {
                            h5Merchandise.payment = "";
                        }
                        if (h5Merchandise.tracker == null) {
                            h5Merchandise.tracker = "";
                        }
                        if (h5Merchandise.category == null) {
                            h5Merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (h5Merchandise.productType == null) {
                            h5Merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
                        }
                        if (h5Merchandise.defaultStockKeepUnit != null) {
                            break;
                        }
                        h5Merchandise.defaultStockKeepUnit = H5StockKeepUnit.new_();
                        return h5Merchandise;
                    }
                    h5Merchandise.defaultStockKeepUnit = (H5StockKeepUnit) nb5Var.l(H5StockKeepUnit.PROTOBUF_ADAPTER);
                }
            }
            return h5Merchandise;
        }

        public void serialize(H5Merchandise h5Merchandise, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5Merchandise.f72id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = h5Merchandise.payment;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = h5Merchandise.tracker;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            ProductCategory productCategory = h5Merchandise.category;
            if (productCategory != null) {
                codedOutputByteBufferNano.K(4, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(5, h5Merchandise.quantity);
            ProductType productType = h5Merchandise.productType;
            if (productType != null) {
                codedOutputByteBufferNano.K(6, productType, ProductType.PROTOBUF_ADAPTER);
            }
            H5StockKeepUnit h5StockKeepUnit = h5Merchandise.defaultStockKeepUnit;
            if (h5StockKeepUnit != null) {
                codedOutputByteBufferNano.K(7, h5StockKeepUnit, H5StockKeepUnit.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<H5Merchandise> JSON_ADAPTER = new ObjectJsonAdapter<H5Merchandise>() { // from class: com.p1.mobile.putong.core.data.H5Merchandise.2
        public Class getDataClass() {
            return H5Merchandise.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5Merchandise m13182newInstance() {
            return new H5Merchandise();
        }

        public boolean parseField(H5Merchandise h5Merchandise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "productType":
                    h5Merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "defaultStockKeepUnit":
                    h5Merchandise.defaultStockKeepUnit = (H5StockKeepUnit) H5StockKeepUnit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quantity":
                    h5Merchandise.quantity = jsonParser.getValueAsInt();
                    return true;
                case "tracker":
                    h5Merchandise.tracker = jsonParser.getValueAsString();
                    return true;
                case "payment":
                    h5Merchandise.payment = jsonParser.getValueAsString();
                    return true;
                case "id":
                    h5Merchandise.f72id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    h5Merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(H5Merchandise h5Merchandise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "productType":
                case "defaultStockKeepUnit":
                case "quantity":
                case "tracker":
                case "payment":
                    return true;
                case "id":
                    return false;
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(h5Merchandise, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(H5Merchandise h5Merchandise, JsonGenerator jsonGenerator) throws IOException {
            String str = h5Merchandise.f72id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = h5Merchandise.payment;
            if (str2 != null) {
                jsonGenerator.writeStringField("payment", str2);
            }
            String str3 = h5Merchandise.tracker;
            if (str3 != null) {
                jsonGenerator.writeStringField("tracker", str3);
            }
            if (h5Merchandise.category != null) {
                jsonGenerator.writeFieldName("category");
                ProductCategory.JSON_ADAPTER.serialize(h5Merchandise.category, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("quantity", h5Merchandise.quantity);
            if (h5Merchandise.productType != null) {
                jsonGenerator.writeFieldName("productType");
                ProductType.JSON_ADAPTER.serialize(h5Merchandise.productType, jsonGenerator, true);
            }
            if (h5Merchandise.defaultStockKeepUnit != null) {
                jsonGenerator.writeFieldName("defaultStockKeepUnit");
                H5StockKeepUnit.JSON_ADAPTER.serialize(h5Merchandise.defaultStockKeepUnit, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5Merchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5Merchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5Merchandise new_() {
        H5Merchandise h5Merchandise = new H5Merchandise();
        h5Merchandise.nullCheck();
        return h5Merchandise;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5Merchandise m13180clone() {
        H5Merchandise h5Merchandise = new H5Merchandise();
        h5Merchandise.f72id = this.f72id;
        h5Merchandise.payment = this.payment;
        h5Merchandise.tracker = this.tracker;
        h5Merchandise.category = this.category;
        h5Merchandise.quantity = this.quantity;
        h5Merchandise.productType = this.productType;
        H5StockKeepUnit h5StockKeepUnit = this.defaultStockKeepUnit;
        if (h5StockKeepUnit != null) {
            h5Merchandise.defaultStockKeepUnit = h5StockKeepUnit.m13214clone();
        }
        return h5Merchandise;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H5Merchandise)) {
            return false;
        }
        H5Merchandise h5Merchandise = (H5Merchandise) obj;
        return ValueObject.util_equals(this.f72id, h5Merchandise.f72id) && ValueObject.util_equals(this.payment, h5Merchandise.payment) && ValueObject.util_equals(this.tracker, h5Merchandise.tracker) && ValueObject.util_equals(this.category, h5Merchandise.category) && this.quantity == h5Merchandise.quantity && ValueObject.util_equals(this.productType, h5Merchandise.productType) && ValueObject.util_equals(this.defaultStockKeepUnit, h5Merchandise.defaultStockKeepUnit);
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
        String str = this.f72id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.payment;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tracker;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        ProductCategory productCategory = this.category;
        int iHashCode4 = (((iHashCode3 + (productCategory != null ? productCategory.hashCode() : 0)) * 41) + this.quantity) * 41;
        ProductType productType = this.productType;
        int iHashCode5 = (iHashCode4 + (productType != null ? productType.hashCode() : 0)) * 41;
        H5StockKeepUnit h5StockKeepUnit = this.defaultStockKeepUnit;
        int iHashCode6 = iHashCode5 + (h5StockKeepUnit != null ? h5StockKeepUnit.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.f72id == null) {
            this.f72id = "";
        }
        if (this.payment == null) {
            this.payment = "";
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
        if (this.category == null) {
            this.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.productType == null) {
            this.productType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
        }
        if (this.defaultStockKeepUnit == null) {
            this.defaultStockKeepUnit = H5StockKeepUnit.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
