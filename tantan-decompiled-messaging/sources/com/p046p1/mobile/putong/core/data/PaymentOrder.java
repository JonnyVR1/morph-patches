package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class PaymentOrder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paymentorder";

    @ProtobufIndex(index = 6)
    public double amount;

    @ProtobufIndex(index = 8)
    public double createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20465id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String itemName;

    @NonNull
    @ProtobufIndex(index = 5)
    public ProductCategory productType;

    @NonNull
    @ProtobufIndex(index = 7)
    public PaymentOrderStatus status;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<PaymentOrder> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaymentOrder>() { // from class: com.p1.mobile.putong.core.data.PaymentOrder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PaymentOrder paymentOrder) {
            String str = paymentOrder.f20465id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = paymentOrder.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = paymentOrder.itemId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = paymentOrder.itemName;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            ProductCategory productCategory = paymentOrder.productType;
            if (productCategory != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(5, productCategory.ordinal());
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(6, paymentOrder.amount);
            PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
            if (paymentOrderStatus != null) {
                iM17222d += CodedOutputByteBufferNano.m17226h(7, paymentOrderStatus.ordinal());
            }
            int iM17222d2 = iM17222d + CodedOutputByteBufferNano.m17222d(8, paymentOrder.createdTime);
            ProductCategory productCategory2 = paymentOrder.productType;
            if (productCategory2 != null) {
                iM17222d2 += CodedOutputByteBufferNano.m17230l(9, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            PaymentOrderStatus paymentOrderStatus2 = paymentOrder.status;
            if (paymentOrderStatus2 != null) {
                iM17222d2 += CodedOutputByteBufferNano.m17230l(10, paymentOrderStatus2, PaymentOrderStatus.PROTOBUF_ADAPTER);
            }
            paymentOrder.cachedSize = iM17222d2;
            return iM17222d2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PaymentOrder parse(nb5 nb5Var) throws IOException {
            PaymentOrder paymentOrder = new PaymentOrder();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (paymentOrder.productType == null && numValueOf != null) {
                            paymentOrder.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (paymentOrder.status == null && numValueOf2 != null) {
                            paymentOrder.status = (PaymentOrderStatus) PaymentOrderStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (paymentOrder.f20465id == null) {
                            paymentOrder.f20465id = "";
                        }
                        if (paymentOrder.type == null) {
                            paymentOrder.type = "";
                        }
                        if (paymentOrder.itemId == null) {
                            paymentOrder.itemId = "";
                        }
                        if (paymentOrder.itemName == null) {
                            paymentOrder.itemName = "";
                        }
                        if (paymentOrder.productType == null) {
                            paymentOrder.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (paymentOrder.status == null) {
                            paymentOrder.status = (PaymentOrderStatus) PaymentOrderStatus.JSON_ADAPTER.defaultEnum();
                        }
                        break;
                    case 10:
                        paymentOrder.f20465id = nb5Var.m158750s();
                        continue;
                    case 18:
                        paymentOrder.type = nb5Var.m158750s();
                        continue;
                    case 26:
                        paymentOrder.itemId = nb5Var.m158750s();
                        continue;
                    case 34:
                        paymentOrder.itemName = nb5Var.m158750s();
                        continue;
                    case 40:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 49:
                        paymentOrder.amount = nb5Var.m158739h();
                        continue;
                    case 56:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 65:
                        paymentOrder.createdTime = nb5Var.m158739h();
                        continue;
                    case 74:
                        paymentOrder.productType = (ProductCategory) nb5Var.m158743l(ProductCategory.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        paymentOrder.status = (PaymentOrderStatus) nb5Var.m158743l(PaymentOrderStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (paymentOrder.productType == null && numValueOf != null) {
                            paymentOrder.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (paymentOrder.status == null && numValueOf2 != null) {
                            paymentOrder.status = (PaymentOrderStatus) PaymentOrderStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (paymentOrder.f20465id == null) {
                            paymentOrder.f20465id = "";
                        }
                        if (paymentOrder.type == null) {
                            paymentOrder.type = "";
                        }
                        if (paymentOrder.itemId == null) {
                            paymentOrder.itemId = "";
                        }
                        if (paymentOrder.itemName == null) {
                            paymentOrder.itemName = "";
                        }
                        if (paymentOrder.productType == null) {
                            paymentOrder.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (paymentOrder.status == null) {
                            paymentOrder.status = (PaymentOrderStatus) PaymentOrderStatus.JSON_ADAPTER.defaultEnum();
                            return paymentOrder;
                        }
                        break;
                }
            }
            return paymentOrder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PaymentOrder paymentOrder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = paymentOrder.f20465id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = paymentOrder.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = paymentOrder.itemId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = paymentOrder.itemName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            ProductCategory productCategory = paymentOrder.productType;
            if (productCategory != null) {
                codedOutputByteBufferNano.m17250G(5, productCategory.ordinal());
            }
            codedOutputByteBufferNano.m17246C(6, paymentOrder.amount);
            PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
            if (paymentOrderStatus != null) {
                codedOutputByteBufferNano.m17250G(7, paymentOrderStatus.ordinal());
            }
            codedOutputByteBufferNano.m17246C(8, paymentOrder.createdTime);
            ProductCategory productCategory2 = paymentOrder.productType;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.m17254K(9, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            PaymentOrderStatus paymentOrderStatus2 = paymentOrder.status;
            if (paymentOrderStatus2 != null) {
                codedOutputByteBufferNano.m17254K(10, paymentOrderStatus2, PaymentOrderStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PaymentOrder> JSON_ADAPTER = new ObjectJsonAdapter<PaymentOrder>() { // from class: com.p1.mobile.putong.core.data.PaymentOrder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PaymentOrder.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PaymentOrder newInstance() {
            return new PaymentOrder();
        }

        public boolean parseField(PaymentOrder paymentOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "productType":
                    paymentOrder.productType = ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "amount":
                    paymentOrder.amount = jsonParser.getValueAsDouble();
                    return true;
                case "itemId":
                    paymentOrder.itemId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    paymentOrder.status = PaymentOrderStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "createdTime":
                    paymentOrder.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    paymentOrder.f20465id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    paymentOrder.type = jsonParser.getValueAsString();
                    return true;
                case "itemName":
                    paymentOrder.itemName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PaymentOrder paymentOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "productType":
                case "amount":
                case "itemId":
                case "status":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "type":
                case "itemName":
                    return true;
                default:
                    return super.parseFieldCheck(paymentOrder, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaymentOrder paymentOrder, JsonGenerator jsonGenerator) throws IOException {
            String str = paymentOrder.f20465id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = paymentOrder.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = paymentOrder.itemId;
            if (str3 != null) {
                jsonGenerator.writeStringField("itemId", str3);
            }
            String str4 = paymentOrder.itemName;
            if (str4 != null) {
                jsonGenerator.writeStringField("itemName", str4);
            }
            if (paymentOrder.productType != null) {
                jsonGenerator.writeFieldName("productType");
                ProductCategory.JSON_ADAPTER.serialize(paymentOrder.productType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("amount", paymentOrder.amount);
            if (paymentOrder.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                PaymentOrderStatus.JSON_ADAPTER.serialize(paymentOrder.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(paymentOrder.createdTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaymentOrder new_() {
        PaymentOrder paymentOrder = new PaymentOrder();
        paymentOrder.nullCheck();
        return paymentOrder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PaymentOrder mo223809clone() {
        PaymentOrder paymentOrder = new PaymentOrder();
        paymentOrder.f20465id = this.f20465id;
        paymentOrder.type = this.type;
        paymentOrder.itemId = this.itemId;
        paymentOrder.itemName = this.itemName;
        paymentOrder.productType = this.productType;
        paymentOrder.amount = this.amount;
        paymentOrder.status = this.status;
        paymentOrder.createdTime = this.createdTime;
        return paymentOrder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentOrder)) {
            return false;
        }
        PaymentOrder paymentOrder = (PaymentOrder) obj;
        return ValueObject.util_equals(this.f20465id, paymentOrder.f20465id) && ValueObject.util_equals(this.type, paymentOrder.type) && ValueObject.util_equals(this.itemId, paymentOrder.itemId) && ValueObject.util_equals(this.itemName, paymentOrder.itemName) && ValueObject.util_equals(this.productType, paymentOrder.productType) && this.amount == paymentOrder.amount && ValueObject.util_equals(this.status, paymentOrder.status) && this.createdTime == paymentOrder.createdTime;
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
        String str = this.f20465id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.itemId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.itemName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        ProductCategory productCategory = this.productType;
        int iHashCode5 = productCategory != null ? productCategory.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i3 = (((iHashCode4 + iHashCode5) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        PaymentOrderStatus paymentOrderStatus = this.status;
        int iHashCode6 = i3 + (paymentOrderStatus != null ? paymentOrderStatus.hashCode() : 0);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.createdTime);
        int i4 = (iHashCode6 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20465id == null) {
            this.f20465id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.itemName == null) {
            this.itemName = "";
        }
        if (this.productType == null) {
            this.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.status == null) {
            this.status = (PaymentOrderStatus) PaymentOrderStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
