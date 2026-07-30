package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.SchemeKey;
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
    public String f20410id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String payment;

    @NonNull
    @ProtobufIndex(index = 6)
    public ProductType productType;

    @ProtobufIndex(index = 5)
    public int quantity;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tracker;
    public static ProtobufAdapter<H5Merchandise> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5Merchandise>() { // from class: com.p1.mobile.putong.core.data.H5Merchandise.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5Merchandise h5Merchandise) {
            String str = h5Merchandise.f20410id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = h5Merchandise.payment;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = h5Merchandise.tracker;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            ProductCategory productCategory = h5Merchandise.category;
            if (productCategory != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, h5Merchandise.quantity);
            ProductType productType = h5Merchandise.productType;
            if (productType != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, productType, ProductType.PROTOBUF_ADAPTER);
            }
            H5StockKeepUnit h5StockKeepUnit = h5Merchandise.defaultStockKeepUnit;
            if (h5StockKeepUnit != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(7, h5StockKeepUnit, H5StockKeepUnit.PROTOBUF_ADAPTER);
            }
            h5Merchandise.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5Merchandise parse(nb5 nb5Var) throws IOException {
            H5Merchandise h5Merchandise = new H5Merchandise();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (h5Merchandise.f20410id == null) {
                        h5Merchandise.f20410id = "";
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
                if (iM158752u == 10) {
                    h5Merchandise.f20410id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    h5Merchandise.payment = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    h5Merchandise.tracker = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    h5Merchandise.category = (ProductCategory) nb5Var.m158743l(ProductCategory.PROTOBUF_ADAPTER);
                } else if (iM158752u == 40) {
                    h5Merchandise.quantity = nb5Var.m158741j();
                } else if (iM158752u == 50) {
                    h5Merchandise.productType = (ProductType) nb5Var.m158743l(ProductType.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 58) {
                        if (h5Merchandise.f20410id == null) {
                            h5Merchandise.f20410id = "";
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
                    h5Merchandise.defaultStockKeepUnit = (H5StockKeepUnit) nb5Var.m158743l(H5StockKeepUnit.PROTOBUF_ADAPTER);
                }
            }
            return h5Merchandise;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5Merchandise h5Merchandise, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5Merchandise.f20410id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = h5Merchandise.payment;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = h5Merchandise.tracker;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            ProductCategory productCategory = h5Merchandise.category;
            if (productCategory != null) {
                codedOutputByteBufferNano.m17254K(4, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(5, h5Merchandise.quantity);
            ProductType productType = h5Merchandise.productType;
            if (productType != null) {
                codedOutputByteBufferNano.m17254K(6, productType, ProductType.PROTOBUF_ADAPTER);
            }
            H5StockKeepUnit h5StockKeepUnit = h5Merchandise.defaultStockKeepUnit;
            if (h5StockKeepUnit != null) {
                codedOutputByteBufferNano.m17254K(7, h5StockKeepUnit, H5StockKeepUnit.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<H5Merchandise> JSON_ADAPTER = new ObjectJsonAdapter<H5Merchandise>() { // from class: com.p1.mobile.putong.core.data.H5Merchandise.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5Merchandise.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5Merchandise newInstance() {
            return new H5Merchandise();
        }

        public boolean parseField(H5Merchandise h5Merchandise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "productType":
                    h5Merchandise.productType = ProductType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "defaultStockKeepUnit":
                    h5Merchandise.defaultStockKeepUnit = H5StockKeepUnit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
                    h5Merchandise.f20410id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    h5Merchandise.category = ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5Merchandise h5Merchandise, JsonGenerator jsonGenerator) throws IOException {
            String str = h5Merchandise.f20410id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = h5Merchandise.payment;
            if (str2 != null) {
                jsonGenerator.writeStringField(SchemeKey.payment, str2);
            }
            String str3 = h5Merchandise.tracker;
            if (str3 != null) {
                jsonGenerator.writeStringField("tracker", str3);
            }
            if (h5Merchandise.category != null) {
                jsonGenerator.writeFieldName("category");
                ProductCategory.JSON_ADAPTER.serialize(h5Merchandise.category, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.QUANTITY, h5Merchandise.quantity);
            if (h5Merchandise.productType != null) {
                jsonGenerator.writeFieldName("productType");
                ProductType.JSON_ADAPTER.serialize(h5Merchandise.productType, jsonGenerator, true);
            }
            if (h5Merchandise.defaultStockKeepUnit != null) {
                jsonGenerator.writeFieldName("defaultStockKeepUnit");
                H5StockKeepUnit.JSON_ADAPTER.serialize(h5Merchandise.defaultStockKeepUnit, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5Merchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5Merchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5Merchandise new_() {
        H5Merchandise h5Merchandise = new H5Merchandise();
        h5Merchandise.nullCheck();
        return h5Merchandise;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5Merchandise mo223809clone() {
        H5Merchandise h5Merchandise = new H5Merchandise();
        h5Merchandise.f20410id = this.f20410id;
        h5Merchandise.payment = this.payment;
        h5Merchandise.tracker = this.tracker;
        h5Merchandise.category = this.category;
        h5Merchandise.quantity = this.quantity;
        h5Merchandise.productType = this.productType;
        H5StockKeepUnit h5StockKeepUnit = this.defaultStockKeepUnit;
        if (h5StockKeepUnit != null) {
            h5Merchandise.defaultStockKeepUnit = h5StockKeepUnit.mo223809clone();
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
        return ValueObject.util_equals(this.f20410id, h5Merchandise.f20410id) && ValueObject.util_equals(this.payment, h5Merchandise.payment) && ValueObject.util_equals(this.tracker, h5Merchandise.tracker) && ValueObject.util_equals(this.category, h5Merchandise.category) && this.quantity == h5Merchandise.quantity && ValueObject.util_equals(this.productType, h5Merchandise.productType) && ValueObject.util_equals(this.defaultStockKeepUnit, h5Merchandise.defaultStockKeepUnit);
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
        String str = this.f20410id;
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
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20410id == null) {
            this.f20410id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
