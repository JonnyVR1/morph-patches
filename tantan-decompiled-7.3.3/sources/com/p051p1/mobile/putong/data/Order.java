package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class Order extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "order";

    @Nullable
    @ProtobufIndex(index = 9)
    public GPAffiliateTransaction affiliateTransaction;

    @NonNull
    @ProtobufIndex(index = 6)
    public String contractId;

    @NonNull
    @ProtobufIndex(index = 7)
    public BundleStatus contractStatus;

    @NonNull
    @ProtobufIndex(index = 2)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = 4)
    public BundleStatus orderStatus;

    @NonNull
    @ProtobufIndex(index = 3)
    public PayMethod payMethod;

    @NonNull
    @ProtobufIndex(index = 5)
    public String paymentRequest;

    @NonNull
    @ProtobufIndex(index = 10)
    public String signAndPayRequest;

    @NonNull
    @ProtobufIndex(index = 8)
    public String signRequest;
    public static ProtobufAdapter<Order> PROTOBUF_ADAPTER = new MessageNanoAdapter<Order>() { // from class: com.p1.mobile.putong.data.Order.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Order order) {
            String str = order.orderId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = order.itemId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            PayMethod payMethod = order.payMethod;
            if (payMethod != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(3, payMethod.ordinal());
            }
            BundleStatus bundleStatus = order.orderStatus;
            if (bundleStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(4, bundleStatus.ordinal());
            }
            String str3 = order.paymentRequest;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = order.contractId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            BundleStatus bundleStatus2 = order.contractStatus;
            if (bundleStatus2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(7, bundleStatus2.ordinal());
            }
            String str5 = order.signRequest;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str5);
            }
            GPAffiliateTransaction gPAffiliateTransaction = order.affiliateTransaction;
            if (gPAffiliateTransaction != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(9, gPAffiliateTransaction, GPAffiliateTransaction.PROTOBUF_ADAPTER);
            }
            String str6 = order.signAndPayRequest;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str6);
            }
            PayMethod payMethod2 = order.payMethod;
            if (payMethod2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(11, payMethod2, PayMethod.PROTOBUF_ADAPTER);
            }
            BundleStatus bundleStatus3 = order.orderStatus;
            if (bundleStatus3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(12, bundleStatus3, BundleStatus.PROTOBUF_ADAPTER);
            }
            BundleStatus bundleStatus4 = order.contractStatus;
            if (bundleStatus4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(13, bundleStatus4, BundleStatus.PROTOBUF_ADAPTER);
            }
            order.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Order parse(nc5 nc5Var) throws IOException {
            Order order = new Order();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (order.payMethod == null && numValueOf != null) {
                            order.payMethod = (PayMethod) PayMethod.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (order.orderStatus == null && numValueOf2 != null) {
                            order.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (order.contractStatus == null && numValueOf3 != null) {
                            order.contractStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (order.orderId == null) {
                            order.orderId = "";
                        }
                        if (order.itemId == null) {
                            order.itemId = "";
                        }
                        if (order.payMethod == null) {
                            order.payMethod = (PayMethod) PayMethod.JSON_ADAPTER.defaultEnum();
                        }
                        if (order.orderStatus == null) {
                            order.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (order.paymentRequest == null) {
                            order.paymentRequest = "";
                        }
                        if (order.contractId == null) {
                            order.contractId = "";
                        }
                        if (order.contractStatus == null) {
                            order.contractStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (order.signRequest == null) {
                            order.signRequest = "";
                        }
                        if (order.signAndPayRequest == null) {
                            order.signAndPayRequest = "";
                        }
                        break;
                    case 10:
                        order.orderId = nc5Var.m162495s();
                        continue;
                    case 18:
                        order.itemId = nc5Var.m162495s();
                        continue;
                    case 24:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 32:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 42:
                        order.paymentRequest = nc5Var.m162495s();
                        continue;
                    case 50:
                        order.contractId = nc5Var.m162495s();
                        continue;
                    case 56:
                        numValueOf3 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 66:
                        order.signRequest = nc5Var.m162495s();
                        continue;
                    case 74:
                        order.affiliateTransaction = (GPAffiliateTransaction) nc5Var.m162488l(GPAffiliateTransaction.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        order.signAndPayRequest = nc5Var.m162495s();
                        continue;
                    case 90:
                        order.payMethod = (PayMethod) nc5Var.m162488l(PayMethod.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        order.orderStatus = (BundleStatus) nc5Var.m162488l(BundleStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        order.contractStatus = (BundleStatus) nc5Var.m162488l(BundleStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (order.payMethod == null && numValueOf != null) {
                            order.payMethod = (PayMethod) PayMethod.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (order.orderStatus == null && numValueOf2 != null) {
                            order.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (order.contractStatus == null && numValueOf3 != null) {
                            order.contractStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (order.orderId == null) {
                            order.orderId = "";
                        }
                        if (order.itemId == null) {
                            order.itemId = "";
                        }
                        if (order.payMethod == null) {
                            order.payMethod = (PayMethod) PayMethod.JSON_ADAPTER.defaultEnum();
                        }
                        if (order.orderStatus == null) {
                            order.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (order.paymentRequest == null) {
                            order.paymentRequest = "";
                        }
                        if (order.contractId == null) {
                            order.contractId = "";
                        }
                        if (order.contractStatus == null) {
                            order.contractStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (order.signRequest == null) {
                            order.signRequest = "";
                        }
                        if (order.signAndPayRequest == null) {
                            order.signAndPayRequest = "";
                            return order;
                        }
                        break;
                }
            }
            return order;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Order order, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = order.orderId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = order.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            PayMethod payMethod = order.payMethod;
            if (payMethod != null) {
                codedOutputByteBufferNano.m17305G(3, payMethod.ordinal());
            }
            BundleStatus bundleStatus = order.orderStatus;
            if (bundleStatus != null) {
                codedOutputByteBufferNano.m17305G(4, bundleStatus.ordinal());
            }
            String str3 = order.paymentRequest;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = order.contractId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            BundleStatus bundleStatus2 = order.contractStatus;
            if (bundleStatus2 != null) {
                codedOutputByteBufferNano.m17305G(7, bundleStatus2.ordinal());
            }
            String str5 = order.signRequest;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(8, str5);
            }
            GPAffiliateTransaction gPAffiliateTransaction = order.affiliateTransaction;
            if (gPAffiliateTransaction != null) {
                codedOutputByteBufferNano.m17309K(9, gPAffiliateTransaction, GPAffiliateTransaction.PROTOBUF_ADAPTER);
            }
            String str6 = order.signAndPayRequest;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(10, str6);
            }
            PayMethod payMethod2 = order.payMethod;
            if (payMethod2 != null) {
                codedOutputByteBufferNano.m17309K(11, payMethod2, PayMethod.PROTOBUF_ADAPTER);
            }
            BundleStatus bundleStatus3 = order.orderStatus;
            if (bundleStatus3 != null) {
                codedOutputByteBufferNano.m17309K(12, bundleStatus3, BundleStatus.PROTOBUF_ADAPTER);
            }
            BundleStatus bundleStatus4 = order.contractStatus;
            if (bundleStatus4 != null) {
                codedOutputByteBufferNano.m17309K(13, bundleStatus4, BundleStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Order> JSON_ADAPTER = new ObjectJsonAdapter<Order>() { // from class: com.p1.mobile.putong.data.Order.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Order.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Order newInstance() {
            return new Order();
        }

        public boolean parseField(Order order, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "affiliateTransaction":
                    order.affiliateTransaction = GPAffiliateTransaction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "orderId":
                    order.orderId = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    order.itemId = jsonParser.getValueAsString();
                    return true;
                case "payMethod":
                    order.payMethod = PayMethod.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "signRequest":
                    order.signRequest = jsonParser.getValueAsString();
                    return true;
                case "paymentRequest":
                    order.paymentRequest = jsonParser.getValueAsString();
                    return true;
                case "contractId":
                    order.contractId = jsonParser.getValueAsString();
                    return true;
                case "contractStatus":
                    order.contractStatus = BundleStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "signAndPayRequest":
                    order.signAndPayRequest = jsonParser.getValueAsString();
                    return true;
                case "orderStatus":
                    order.orderStatus = BundleStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Order order, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "affiliateTransaction":
                case "orderId":
                case "itemId":
                case "payMethod":
                case "signRequest":
                case "paymentRequest":
                case "contractId":
                case "contractStatus":
                case "signAndPayRequest":
                case "orderStatus":
                    return true;
                default:
                    return super.parseFieldCheck(order, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Order order, JsonGenerator jsonGenerator) throws IOException {
            String str = order.orderId;
            if (str != null) {
                jsonGenerator.writeStringField("orderId", str);
            }
            String str2 = order.itemId;
            if (str2 != null) {
                jsonGenerator.writeStringField("itemId", str2);
            }
            if (order.payMethod != null) {
                jsonGenerator.writeFieldName("payMethod");
                PayMethod.JSON_ADAPTER.serialize(order.payMethod, jsonGenerator, true);
            }
            if (order.orderStatus != null) {
                jsonGenerator.writeFieldName("orderStatus");
                BundleStatus.JSON_ADAPTER.serialize(order.orderStatus, jsonGenerator, true);
            }
            String str3 = order.paymentRequest;
            if (str3 != null) {
                jsonGenerator.writeStringField("paymentRequest", str3);
            }
            String str4 = order.contractId;
            if (str4 != null) {
                jsonGenerator.writeStringField("contractId", str4);
            }
            if (order.contractStatus != null) {
                jsonGenerator.writeFieldName("contractStatus");
                BundleStatus.JSON_ADAPTER.serialize(order.contractStatus, jsonGenerator, true);
            }
            String str5 = order.signRequest;
            if (str5 != null) {
                jsonGenerator.writeStringField("signRequest", str5);
            }
            if (order.affiliateTransaction != null) {
                jsonGenerator.writeFieldName("affiliateTransaction");
                GPAffiliateTransaction.JSON_ADAPTER.serialize(order.affiliateTransaction, jsonGenerator, true);
            }
            String str6 = order.signAndPayRequest;
            if (str6 != null) {
                jsonGenerator.writeStringField("signAndPayRequest", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Order) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Order) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Order new_() {
        Order order = new Order();
        order.nullCheck();
        return order;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Order mo225055clone() {
        Order order = new Order();
        order.orderId = this.orderId;
        order.itemId = this.itemId;
        order.payMethod = this.payMethod;
        order.orderStatus = this.orderStatus;
        order.paymentRequest = this.paymentRequest;
        order.contractId = this.contractId;
        order.contractStatus = this.contractStatus;
        order.signRequest = this.signRequest;
        GPAffiliateTransaction gPAffiliateTransaction = this.affiliateTransaction;
        if (gPAffiliateTransaction != null) {
            order.affiliateTransaction = gPAffiliateTransaction.mo225055clone();
        }
        order.signAndPayRequest = this.signAndPayRequest;
        return order;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order order = (Order) obj;
        return ValueObject.util_equals(this.orderId, order.orderId) && ValueObject.util_equals(this.itemId, order.itemId) && ValueObject.util_equals(this.payMethod, order.payMethod) && ValueObject.util_equals(this.orderStatus, order.orderStatus) && ValueObject.util_equals(this.paymentRequest, order.paymentRequest) && ValueObject.util_equals(this.contractId, order.contractId) && ValueObject.util_equals(this.contractStatus, order.contractStatus) && ValueObject.util_equals(this.signRequest, order.signRequest) && ValueObject.util_equals(this.affiliateTransaction, order.affiliateTransaction) && ValueObject.util_equals(this.signAndPayRequest, order.signAndPayRequest);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "order";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.orderId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.itemId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        PayMethod payMethod = this.payMethod;
        int iHashCode3 = (iHashCode2 + (payMethod != null ? payMethod.hashCode() : 0)) * 41;
        BundleStatus bundleStatus = this.orderStatus;
        int iHashCode4 = (iHashCode3 + (bundleStatus != null ? bundleStatus.hashCode() : 0)) * 41;
        String str3 = this.paymentRequest;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.contractId;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BundleStatus bundleStatus2 = this.contractStatus;
        int iHashCode7 = (iHashCode6 + (bundleStatus2 != null ? bundleStatus2.hashCode() : 0)) * 41;
        String str5 = this.signRequest;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        GPAffiliateTransaction gPAffiliateTransaction = this.affiliateTransaction;
        int iHashCode9 = (iHashCode8 + (gPAffiliateTransaction != null ? gPAffiliateTransaction.hashCode() : 0)) * 41;
        String str6 = this.signAndPayRequest;
        int iHashCode10 = iHashCode9 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.orderId == null) {
            this.orderId = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.payMethod == null) {
            this.payMethod = (PayMethod) PayMethod.JSON_ADAPTER.defaultEnum();
        }
        if (this.orderStatus == null) {
            this.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.paymentRequest == null) {
            this.paymentRequest = "";
        }
        if (this.contractId == null) {
            this.contractId = "";
        }
        if (this.contractStatus == null) {
            this.contractStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.signRequest == null) {
            this.signRequest = "";
        }
        if (this.signAndPayRequest == null) {
            this.signAndPayRequest = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
