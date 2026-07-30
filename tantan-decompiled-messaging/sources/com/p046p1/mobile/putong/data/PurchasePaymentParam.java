package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.immomo.momomediaext.sei.BaseSei;
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
import org.eclipse.jetty.http.HttpStatus;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class PurchasePaymentParam extends PaymentParam implements Cloneable, Serializable {
    public static final String TYPE = "purchasepaymentparam";

    @ProtobufIndex(index = 54)
    public boolean jsBridge;

    @NonNull
    @ProtobufIndex(index = 51)
    public String orderId;

    @ProtobufIndex(index = 52)
    public int quantity;

    @ProtobufIndex(index = 53)
    public boolean useHuaBei;
    public static ProtobufAdapter<PurchasePaymentParam> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchasePaymentParam>() { // from class: com.p1.mobile.putong.data.PurchasePaymentParam.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PurchasePaymentParam purchasePaymentParam) {
            String str = purchasePaymentParam.itemId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = purchasePaymentParam.receipt;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = purchasePaymentParam.url;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(4, purchasePaymentParam.useAutoDeduct) + CodedOutputByteBufferNano.m17220b(5, purchasePaymentParam.signAndPay);
            String str4 = purchasePaymentParam.tracker;
            if (str4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            PaymentParamExtra paymentParamExtra = purchasePaymentParam.ext;
            if (paymentParamExtra != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(7, paymentParamExtra, PaymentParamExtra.PROTOBUF_ADAPTER);
            }
            String str5 = purchasePaymentParam.couponId;
            if (str5 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(8, str5);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(9, purchasePaymentParam.useJDNew);
            String str6 = purchasePaymentParam.orderId;
            if (str6 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(51, str6);
            }
            int iM17226h = iM17220b2 + CodedOutputByteBufferNano.m17226h(52, purchasePaymentParam.quantity) + CodedOutputByteBufferNano.m17220b(53, purchasePaymentParam.useHuaBei) + CodedOutputByteBufferNano.m17220b(54, purchasePaymentParam.jsBridge);
            purchasePaymentParam.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PurchasePaymentParam parse(nb5 nb5Var) throws IOException {
            PurchasePaymentParam purchasePaymentParam = new PurchasePaymentParam();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (purchasePaymentParam.itemId == null) {
                            purchasePaymentParam.itemId = "";
                        }
                        if (purchasePaymentParam.receipt == null) {
                            purchasePaymentParam.receipt = "";
                        }
                        if (purchasePaymentParam.url == null) {
                            purchasePaymentParam.url = "";
                        }
                        if (purchasePaymentParam.tracker == null) {
                            purchasePaymentParam.tracker = "";
                        }
                        if (purchasePaymentParam.ext == null) {
                            purchasePaymentParam.ext = PaymentParamExtra.new_();
                        }
                        if (purchasePaymentParam.couponId == null) {
                            purchasePaymentParam.couponId = "";
                        }
                        if (purchasePaymentParam.orderId == null) {
                            purchasePaymentParam.orderId = "";
                        }
                        break;
                    case 10:
                        purchasePaymentParam.itemId = nb5Var.m158750s();
                        continue;
                    case 18:
                        purchasePaymentParam.receipt = nb5Var.m158750s();
                        continue;
                    case 26:
                        purchasePaymentParam.url = nb5Var.m158750s();
                        continue;
                    case 32:
                        purchasePaymentParam.useAutoDeduct = nb5Var.m158738g();
                        continue;
                    case 40:
                        purchasePaymentParam.signAndPay = nb5Var.m158738g();
                        continue;
                    case 50:
                        purchasePaymentParam.tracker = nb5Var.m158750s();
                        continue;
                    case 58:
                        purchasePaymentParam.ext = (PaymentParamExtra) nb5Var.m158743l(PaymentParamExtra.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        purchasePaymentParam.couponId = nb5Var.m158750s();
                        continue;
                    case 72:
                        purchasePaymentParam.useJDNew = nb5Var.m158738g();
                        continue;
                    case 410:
                        purchasePaymentParam.orderId = nb5Var.m158750s();
                        continue;
                    case HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416 /* 416 */:
                        purchasePaymentParam.quantity = nb5Var.m158741j();
                        continue;
                    case HttpStatus.FAILED_DEPENDENCY_424 /* 424 */:
                        purchasePaymentParam.useHuaBei = nb5Var.m158738g();
                        continue;
                    case 432:
                        purchasePaymentParam.jsBridge = nb5Var.m158738g();
                        continue;
                    default:
                        if (purchasePaymentParam.itemId == null) {
                            purchasePaymentParam.itemId = "";
                        }
                        if (purchasePaymentParam.receipt == null) {
                            purchasePaymentParam.receipt = "";
                        }
                        if (purchasePaymentParam.url == null) {
                            purchasePaymentParam.url = "";
                        }
                        if (purchasePaymentParam.tracker == null) {
                            purchasePaymentParam.tracker = "";
                        }
                        if (purchasePaymentParam.ext == null) {
                            purchasePaymentParam.ext = PaymentParamExtra.new_();
                        }
                        if (purchasePaymentParam.couponId == null) {
                            purchasePaymentParam.couponId = "";
                        }
                        if (purchasePaymentParam.orderId == null) {
                            purchasePaymentParam.orderId = "";
                            return purchasePaymentParam;
                        }
                        break;
                }
            }
            return purchasePaymentParam;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PurchasePaymentParam purchasePaymentParam, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = purchasePaymentParam.itemId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = purchasePaymentParam.receipt;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = purchasePaymentParam.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17244A(4, purchasePaymentParam.useAutoDeduct);
            codedOutputByteBufferNano.m17244A(5, purchasePaymentParam.signAndPay);
            String str4 = purchasePaymentParam.tracker;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
            PaymentParamExtra paymentParamExtra = purchasePaymentParam.ext;
            if (paymentParamExtra != null) {
                codedOutputByteBufferNano.m17254K(7, paymentParamExtra, PaymentParamExtra.PROTOBUF_ADAPTER);
            }
            String str5 = purchasePaymentParam.couponId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(8, str5);
            }
            codedOutputByteBufferNano.m17244A(9, purchasePaymentParam.useJDNew);
            String str6 = purchasePaymentParam.orderId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(51, str6);
            }
            codedOutputByteBufferNano.m17250G(52, purchasePaymentParam.quantity);
            codedOutputByteBufferNano.m17244A(53, purchasePaymentParam.useHuaBei);
            codedOutputByteBufferNano.m17244A(54, purchasePaymentParam.jsBridge);
        }
    };
    public static JsonAdapter<PurchasePaymentParam> JSON_ADAPTER = new ObjectJsonAdapter<PurchasePaymentParam>() { // from class: com.p1.mobile.putong.data.PurchasePaymentParam.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PurchasePaymentParam.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PurchasePaymentParam newInstance() {
            return new PurchasePaymentParam();
        }

        public boolean parseField(PurchasePaymentParam purchasePaymentParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "signAndPay":
                    purchasePaymentParam.signAndPay = jsonParser.getValueAsBoolean();
                    return true;
                case "quantity":
                    purchasePaymentParam.quantity = jsonParser.getValueAsInt();
                    return true;
                case "orderId":
                    purchasePaymentParam.orderId = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    purchasePaymentParam.itemId = jsonParser.getValueAsString();
                    return true;
                case "tracker":
                    purchasePaymentParam.tracker = jsonParser.getValueAsString();
                    return true;
                case "useHuaBei":
                    purchasePaymentParam.useHuaBei = jsonParser.getValueAsBoolean();
                    return true;
                case "couponId":
                    purchasePaymentParam.couponId = jsonParser.getValueAsString();
                    return true;
                case "useJDNew":
                    purchasePaymentParam.useJDNew = jsonParser.getValueAsBoolean();
                    return true;
                case "ext":
                    purchasePaymentParam.ext = PaymentParamExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    purchasePaymentParam.url = jsonParser.getValueAsString();
                    return true;
                case "jsBridge":
                    purchasePaymentParam.jsBridge = jsonParser.getValueAsBoolean();
                    return true;
                case "receipt":
                    purchasePaymentParam.receipt = jsonParser.getValueAsString();
                    return true;
                case "useAutoDeduct":
                    purchasePaymentParam.useAutoDeduct = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PurchasePaymentParam purchasePaymentParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "signAndPay":
                case "quantity":
                case "orderId":
                case "itemId":
                case "tracker":
                case "useHuaBei":
                case "couponId":
                case "useJDNew":
                case "ext":
                case "url":
                case "jsBridge":
                case "receipt":
                case "useAutoDeduct":
                    return true;
                default:
                    return super.parseFieldCheck(purchasePaymentParam, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PurchasePaymentParam purchasePaymentParam, JsonGenerator jsonGenerator) throws IOException {
            String str = purchasePaymentParam.itemId;
            if (str != null) {
                jsonGenerator.writeStringField("itemId", str);
            }
            String str2 = purchasePaymentParam.receipt;
            if (str2 != null) {
                jsonGenerator.writeStringField("receipt", str2);
            }
            String str3 = purchasePaymentParam.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeBooleanField("useAutoDeduct", purchasePaymentParam.useAutoDeduct);
            jsonGenerator.writeBooleanField("signAndPay", purchasePaymentParam.signAndPay);
            String str4 = purchasePaymentParam.tracker;
            if (str4 != null) {
                jsonGenerator.writeStringField("tracker", str4);
            }
            if (purchasePaymentParam.ext != null) {
                jsonGenerator.writeFieldName(BaseSei.EXT);
                PaymentParamExtra.JSON_ADAPTER.serialize(purchasePaymentParam.ext, jsonGenerator, true);
            }
            String str5 = purchasePaymentParam.couponId;
            if (str5 != null) {
                jsonGenerator.writeStringField("couponId", str5);
            }
            jsonGenerator.writeBooleanField("useJDNew", purchasePaymentParam.useJDNew);
            String str6 = purchasePaymentParam.orderId;
            if (str6 != null) {
                jsonGenerator.writeStringField("orderId", str6);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.QUANTITY, purchasePaymentParam.quantity);
            jsonGenerator.writeBooleanField("useHuaBei", purchasePaymentParam.useHuaBei);
            jsonGenerator.writeBooleanField("jsBridge", purchasePaymentParam.jsBridge);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchasePaymentParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchasePaymentParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurchasePaymentParam new_() {
        PurchasePaymentParam purchasePaymentParam = new PurchasePaymentParam();
        purchasePaymentParam.nullCheck();
        return purchasePaymentParam;
    }

    @Override // com.p046p1.mobile.putong.data.PaymentParam, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PurchasePaymentParam mo223809clone() {
        PurchasePaymentParam purchasePaymentParam = new PurchasePaymentParam();
        purchasePaymentParam.itemId = this.itemId;
        purchasePaymentParam.receipt = this.receipt;
        purchasePaymentParam.url = this.url;
        purchasePaymentParam.useAutoDeduct = this.useAutoDeduct;
        purchasePaymentParam.signAndPay = this.signAndPay;
        purchasePaymentParam.tracker = this.tracker;
        PaymentParamExtra paymentParamExtra = this.ext;
        if (paymentParamExtra != null) {
            purchasePaymentParam.ext = paymentParamExtra.mo223809clone();
        }
        purchasePaymentParam.couponId = this.couponId;
        purchasePaymentParam.useJDNew = this.useJDNew;
        purchasePaymentParam.orderId = this.orderId;
        purchasePaymentParam.quantity = this.quantity;
        purchasePaymentParam.useHuaBei = this.useHuaBei;
        purchasePaymentParam.jsBridge = this.jsBridge;
        return purchasePaymentParam;
    }

    @Override // com.p046p1.mobile.putong.data.PaymentParam
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurchasePaymentParam)) {
            return false;
        }
        PurchasePaymentParam purchasePaymentParam = (PurchasePaymentParam) obj;
        return super.equals(obj) && ValueObject.util_equals(this.orderId, purchasePaymentParam.orderId) && this.quantity == purchasePaymentParam.quantity && this.useHuaBei == purchasePaymentParam.useHuaBei && this.jsBridge == purchasePaymentParam.jsBridge;
    }

    @Override // com.p046p1.mobile.putong.data.PaymentParam, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.p046p1.mobile.putong.data.PaymentParam
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.orderId;
        int iHashCode2 = ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.quantity) * 41) + (this.useHuaBei ? 1231 : 1237)) * 41) + (this.jsBridge ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.p046p1.mobile.putong.data.PaymentParam, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.orderId == null) {
            this.orderId = "";
        }
    }

    @Override // com.p046p1.mobile.putong.data.PaymentParam, com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
