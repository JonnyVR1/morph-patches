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
public class H5PayOrderData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5payorderdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = 4)
    public H5PaymentOrderStatus orderStatus;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProductCategory platform;
    public static ProtobufAdapter<H5PayOrderData> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PayOrderData>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5PayOrderData h5PayOrderData) {
            String str = h5PayOrderData.orderId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            ProductCategory productCategory = h5PayOrderData.platform;
            if (productCategory != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            String str2 = h5PayOrderData.itemId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            H5PaymentOrderStatus h5PaymentOrderStatus = h5PayOrderData.orderStatus;
            if (h5PaymentOrderStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, h5PaymentOrderStatus, H5PaymentOrderStatus.PROTOBUF_ADAPTER);
            }
            h5PayOrderData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5PayOrderData parse(nc5 nc5Var) throws IOException {
            H5PayOrderData h5PayOrderData = new H5PayOrderData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (h5PayOrderData.orderId == null) {
                        h5PayOrderData.orderId = "";
                    }
                    if (h5PayOrderData.platform == null) {
                        h5PayOrderData.platform = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    }
                    if (h5PayOrderData.itemId == null) {
                        h5PayOrderData.itemId = "";
                    }
                    if (h5PayOrderData.orderStatus != null) {
                        break;
                    }
                    h5PayOrderData.orderStatus = (H5PaymentOrderStatus) H5PaymentOrderStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    h5PayOrderData.orderId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    h5PayOrderData.platform = (ProductCategory) nc5Var.m162488l(ProductCategory.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    h5PayOrderData.itemId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (h5PayOrderData.orderId == null) {
                            h5PayOrderData.orderId = "";
                        }
                        if (h5PayOrderData.platform == null) {
                            h5PayOrderData.platform = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (h5PayOrderData.itemId == null) {
                            h5PayOrderData.itemId = "";
                        }
                        if (h5PayOrderData.orderStatus != null) {
                            break;
                        }
                        h5PayOrderData.orderStatus = (H5PaymentOrderStatus) H5PaymentOrderStatus.JSON_ADAPTER.defaultEnum();
                        return h5PayOrderData;
                    }
                    h5PayOrderData.orderStatus = (H5PaymentOrderStatus) nc5Var.m162488l(H5PaymentOrderStatus.PROTOBUF_ADAPTER);
                }
            }
            return h5PayOrderData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5PayOrderData h5PayOrderData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5PayOrderData.orderId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            ProductCategory productCategory = h5PayOrderData.platform;
            if (productCategory != null) {
                codedOutputByteBufferNano.m17309K(2, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            String str2 = h5PayOrderData.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            H5PaymentOrderStatus h5PaymentOrderStatus = h5PayOrderData.orderStatus;
            if (h5PaymentOrderStatus != null) {
                codedOutputByteBufferNano.m17309K(4, h5PaymentOrderStatus, H5PaymentOrderStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<H5PayOrderData> JSON_ADAPTER = new ObjectJsonAdapter<H5PayOrderData>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5PayOrderData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5PayOrderData newInstance() {
            return new H5PayOrderData();
        }

        public boolean parseField(H5PayOrderData h5PayOrderData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "orderId":
                    h5PayOrderData.orderId = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    h5PayOrderData.itemId = jsonParser.getValueAsString();
                    return true;
                case "orderStatus":
                    h5PayOrderData.orderStatus = H5PaymentOrderStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "platform":
                    h5PayOrderData.platform = ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(H5PayOrderData h5PayOrderData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "orderId":
                case "itemId":
                case "orderStatus":
                case "platform":
                    return true;
                default:
                    return super.parseFieldCheck(h5PayOrderData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5PayOrderData h5PayOrderData, JsonGenerator jsonGenerator) throws IOException {
            String str = h5PayOrderData.orderId;
            if (str != null) {
                jsonGenerator.writeStringField("orderId", str);
            }
            if (h5PayOrderData.platform != null) {
                jsonGenerator.writeFieldName("platform");
                ProductCategory.JSON_ADAPTER.serialize(h5PayOrderData.platform, jsonGenerator, true);
            }
            String str2 = h5PayOrderData.itemId;
            if (str2 != null) {
                jsonGenerator.writeStringField("itemId", str2);
            }
            if (h5PayOrderData.orderStatus != null) {
                jsonGenerator.writeFieldName("orderStatus");
                H5PaymentOrderStatus.JSON_ADAPTER.serialize(h5PayOrderData.orderStatus, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PayOrderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PayOrderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5PayOrderData new_() {
        H5PayOrderData h5PayOrderData = new H5PayOrderData();
        h5PayOrderData.nullCheck();
        return h5PayOrderData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5PayOrderData mo225055clone() {
        H5PayOrderData h5PayOrderData = new H5PayOrderData();
        h5PayOrderData.orderId = this.orderId;
        h5PayOrderData.platform = this.platform;
        h5PayOrderData.itemId = this.itemId;
        h5PayOrderData.orderStatus = this.orderStatus;
        return h5PayOrderData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H5PayOrderData)) {
            return false;
        }
        H5PayOrderData h5PayOrderData = (H5PayOrderData) obj;
        return ValueObject.util_equals(this.orderId, h5PayOrderData.orderId) && ValueObject.util_equals(this.platform, h5PayOrderData.platform) && ValueObject.util_equals(this.itemId, h5PayOrderData.itemId) && ValueObject.util_equals(this.orderStatus, h5PayOrderData.orderStatus);
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
        String str = this.orderId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ProductCategory productCategory = this.platform;
        int iHashCode2 = (iHashCode + (productCategory != null ? productCategory.hashCode() : 0)) * 41;
        String str2 = this.itemId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        H5PaymentOrderStatus h5PaymentOrderStatus = this.orderStatus;
        int iHashCode4 = iHashCode3 + (h5PaymentOrderStatus != null ? h5PaymentOrderStatus.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.orderId == null) {
            this.orderId = "";
        }
        if (this.platform == null) {
            this.platform = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.orderStatus == null) {
            this.orderStatus = (H5PaymentOrderStatus) H5PaymentOrderStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
