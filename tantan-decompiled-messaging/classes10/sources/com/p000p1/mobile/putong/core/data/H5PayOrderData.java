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
public class H5PayOrderData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5payorderdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = 4)
    public H5PaymentOrderStatus orderStatus;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ProductCategory platform;
    public static ProtobufAdapter<H5PayOrderData> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PayOrderData>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5PayOrderData h5PayOrderData) {
            String str = h5PayOrderData.orderId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ProductCategory productCategory = h5PayOrderData.platform;
            if (productCategory != null) {
                iO += CodedOutputByteBufferNano.l(2, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            String str2 = h5PayOrderData.itemId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            H5PaymentOrderStatus h5PaymentOrderStatus = h5PayOrderData.orderStatus;
            if (h5PaymentOrderStatus != null) {
                iO += CodedOutputByteBufferNano.l(4, h5PaymentOrderStatus, H5PaymentOrderStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) h5PayOrderData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5PayOrderData m13197parse(nb5 nb5Var) throws IOException {
            H5PayOrderData h5PayOrderData = new H5PayOrderData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    h5PayOrderData.orderId = nb5Var.s();
                } else if (iU == 18) {
                    h5PayOrderData.platform = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    h5PayOrderData.itemId = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    h5PayOrderData.orderStatus = (H5PaymentOrderStatus) nb5Var.l(H5PaymentOrderStatus.PROTOBUF_ADAPTER);
                }
            }
            return h5PayOrderData;
        }

        public void serialize(H5PayOrderData h5PayOrderData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5PayOrderData.orderId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            ProductCategory productCategory = h5PayOrderData.platform;
            if (productCategory != null) {
                codedOutputByteBufferNano.K(2, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            String str2 = h5PayOrderData.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            H5PaymentOrderStatus h5PaymentOrderStatus = h5PayOrderData.orderStatus;
            if (h5PaymentOrderStatus != null) {
                codedOutputByteBufferNano.K(4, h5PaymentOrderStatus, H5PaymentOrderStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<H5PayOrderData> JSON_ADAPTER = new ObjectJsonAdapter<H5PayOrderData>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderData.2
        public Class getDataClass() {
            return H5PayOrderData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5PayOrderData m13198newInstance() {
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
                    h5PayOrderData.orderStatus = (H5PaymentOrderStatus) H5PaymentOrderStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "platform":
                    h5PayOrderData.platform = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PayOrderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PayOrderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5PayOrderData new_() {
        H5PayOrderData h5PayOrderData = new H5PayOrderData();
        h5PayOrderData.nullCheck();
        return h5PayOrderData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5PayOrderData m13196clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
