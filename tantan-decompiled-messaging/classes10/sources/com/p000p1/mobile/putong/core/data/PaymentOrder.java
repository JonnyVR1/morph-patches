package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class PaymentOrder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paymentorder";

    @ProtobufIndex(index = 6)
    public double amount;

    @ProtobufIndex(index = 8)
    public double createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f127id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String itemName;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public ProductCategory productType;

    @NonNull
    @ProtobufIndex(index = 7)
    public PaymentOrderStatus status;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<PaymentOrder> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaymentOrder>() { // from class: com.p1.mobile.putong.core.data.PaymentOrder.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PaymentOrder paymentOrder) {
            String str = paymentOrder.f127id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = paymentOrder.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = paymentOrder.itemId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = paymentOrder.itemName;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ProductCategory productCategory = paymentOrder.productType;
            if (productCategory != null) {
                iO += CodedOutputByteBufferNano.h(5, productCategory.ordinal());
            }
            int iD = iO + CodedOutputByteBufferNano.d(6, paymentOrder.amount);
            PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
            if (paymentOrderStatus != null) {
                iD += CodedOutputByteBufferNano.h(7, paymentOrderStatus.ordinal());
            }
            int iD2 = iD + CodedOutputByteBufferNano.d(8, paymentOrder.createdTime);
            ProductCategory productCategory2 = paymentOrder.productType;
            if (productCategory2 != null) {
                iD2 += CodedOutputByteBufferNano.l(9, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            PaymentOrderStatus paymentOrderStatus2 = paymentOrder.status;
            if (paymentOrderStatus2 != null) {
                iD2 += CodedOutputByteBufferNano.l(10, paymentOrderStatus2, PaymentOrderStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) paymentOrder).cachedSize = iD2;
            return iD2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PaymentOrder m14731parse(nb5 nb5Var) throws IOException {
            PaymentOrder paymentOrder = new PaymentOrder();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (paymentOrder.productType == null && numValueOf != null) {
                            paymentOrder.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (paymentOrder.status == null && numValueOf2 != null) {
                            paymentOrder.status = (PaymentOrderStatus) PaymentOrderStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (paymentOrder.f127id == null) {
                            paymentOrder.f127id = "";
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
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        paymentOrder.f127id = nb5Var.s();
                        continue;
                    case 18:
                        paymentOrder.type = nb5Var.s();
                        continue;
                    case 26:
                        paymentOrder.itemId = nb5Var.s();
                        continue;
                    case 34:
                        paymentOrder.itemName = nb5Var.s();
                        continue;
                    case 40:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 49:
                        paymentOrder.amount = nb5Var.h();
                        continue;
                    case 56:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 65:
                        paymentOrder.createdTime = nb5Var.h();
                        continue;
                    case 74:
                        paymentOrder.productType = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        paymentOrder.status = (PaymentOrderStatus) nb5Var.l(PaymentOrderStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (paymentOrder.productType == null && numValueOf != null) {
                            paymentOrder.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (paymentOrder.status == null && numValueOf2 != null) {
                            paymentOrder.status = (PaymentOrderStatus) PaymentOrderStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (paymentOrder.f127id == null) {
                            paymentOrder.f127id = "";
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

        public void serialize(PaymentOrder paymentOrder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = paymentOrder.f127id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = paymentOrder.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = paymentOrder.itemId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = paymentOrder.itemName;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            ProductCategory productCategory = paymentOrder.productType;
            if (productCategory != null) {
                codedOutputByteBufferNano.G(5, productCategory.ordinal());
            }
            codedOutputByteBufferNano.C(6, paymentOrder.amount);
            PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
            if (paymentOrderStatus != null) {
                codedOutputByteBufferNano.G(7, paymentOrderStatus.ordinal());
            }
            codedOutputByteBufferNano.C(8, paymentOrder.createdTime);
            ProductCategory productCategory2 = paymentOrder.productType;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.K(9, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            PaymentOrderStatus paymentOrderStatus2 = paymentOrder.status;
            if (paymentOrderStatus2 != null) {
                codedOutputByteBufferNano.K(10, paymentOrderStatus2, PaymentOrderStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PaymentOrder> JSON_ADAPTER = new ObjectJsonAdapter<PaymentOrder>() { // from class: com.p1.mobile.putong.core.data.PaymentOrder.2
        public Class getDataClass() {
            return PaymentOrder.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PaymentOrder m14732newInstance() {
            return new PaymentOrder();
        }

        public boolean parseField(PaymentOrder paymentOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "productType":
                    paymentOrder.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "amount":
                    paymentOrder.amount = jsonParser.getValueAsDouble();
                    return true;
                case "itemId":
                    paymentOrder.itemId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    paymentOrder.status = (PaymentOrderStatus) PaymentOrderStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "createdTime":
                    paymentOrder.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    paymentOrder.f127id = jsonParser.getValueAsString();
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

        public void serializeFields(PaymentOrder paymentOrder, JsonGenerator jsonGenerator) throws IOException {
            String str = paymentOrder.f127id;
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
                jsonGenerator.writeFieldName("status");
                PaymentOrderStatus.JSON_ADAPTER.serialize(paymentOrder.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(paymentOrder.createdTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaymentOrder new_() {
        PaymentOrder paymentOrder = new PaymentOrder();
        paymentOrder.nullCheck();
        return paymentOrder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PaymentOrder m14730clone() {
        PaymentOrder paymentOrder = new PaymentOrder();
        paymentOrder.f127id = this.f127id;
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
        return ValueObject.util_equals(this.f127id, paymentOrder.f127id) && ValueObject.util_equals(this.type, paymentOrder.type) && ValueObject.util_equals(this.itemId, paymentOrder.itemId) && ValueObject.util_equals(this.itemName, paymentOrder.itemName) && ValueObject.util_equals(this.productType, paymentOrder.productType) && this.amount == paymentOrder.amount && ValueObject.util_equals(this.status, paymentOrder.status) && this.createdTime == paymentOrder.createdTime;
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
        String str = this.f127id;
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
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
        if (this.f127id == null) {
            this.f127id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
