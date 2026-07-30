package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PaymentParam extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paymentparam";

    @NonNull
    @ProtobufIndex(index = 8)
    public String couponId;

    @NonNull
    @ProtobufIndex(index = 7)
    public PaymentParamExtra ext;

    @NonNull
    @ProtobufIndex(index = 1)
    public String itemId;
    public String purchaseTrackId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String receipt;

    @ProtobufIndex(index = 5)
    public boolean signAndPay;

    @NonNull
    @ProtobufIndex(index = 6)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    @ProtobufIndex(index = 4)
    public boolean useAutoDeduct;

    @ProtobufIndex(index = 9)
    public boolean useJDNew;
    public static ProtobufAdapter<PaymentParam> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaymentParam>() { // from class: com.p1.mobile.putong.data.PaymentParam.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PaymentParam paymentParam) {
            String str = paymentParam.itemId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = paymentParam.receipt;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = paymentParam.url;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, paymentParam.useAutoDeduct) + CodedOutputByteBufferNano.b(5, paymentParam.signAndPay);
            String str4 = paymentParam.tracker;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(6, str4);
            }
            PaymentParamExtra paymentParamExtra = paymentParam.ext;
            if (paymentParamExtra != null) {
                iB += CodedOutputByteBufferNano.l(7, paymentParamExtra, PaymentParamExtra.PROTOBUF_ADAPTER);
            }
            String str5 = paymentParam.couponId;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(8, str5);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(9, paymentParam.useJDNew);
            ((MessageNano) paymentParam).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PaymentParam m18780parse(nb5 nb5Var) throws IOException {
            PaymentParam paymentParam = new PaymentParam();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (paymentParam.itemId == null) {
                        paymentParam.itemId = "";
                    }
                    if (paymentParam.receipt == null) {
                        paymentParam.receipt = "";
                    }
                    if (paymentParam.url == null) {
                        paymentParam.url = "";
                    }
                    if (paymentParam.tracker == null) {
                        paymentParam.tracker = "";
                    }
                    if (paymentParam.ext == null) {
                        paymentParam.ext = PaymentParamExtra.new_();
                    }
                    if (paymentParam.couponId != null) {
                        break;
                    }
                    paymentParam.couponId = "";
                    break;
                }
                if (iU == 10) {
                    paymentParam.itemId = nb5Var.s();
                } else if (iU == 18) {
                    paymentParam.receipt = nb5Var.s();
                } else if (iU == 26) {
                    paymentParam.url = nb5Var.s();
                } else if (iU == 32) {
                    paymentParam.useAutoDeduct = nb5Var.g();
                } else if (iU == 40) {
                    paymentParam.signAndPay = nb5Var.g();
                } else if (iU == 50) {
                    paymentParam.tracker = nb5Var.s();
                } else if (iU == 58) {
                    paymentParam.ext = (PaymentParamExtra) nb5Var.l(PaymentParamExtra.PROTOBUF_ADAPTER);
                } else if (iU == 66) {
                    paymentParam.couponId = nb5Var.s();
                } else {
                    if (iU != 72) {
                        if (paymentParam.itemId == null) {
                            paymentParam.itemId = "";
                        }
                        if (paymentParam.receipt == null) {
                            paymentParam.receipt = "";
                        }
                        if (paymentParam.url == null) {
                            paymentParam.url = "";
                        }
                        if (paymentParam.tracker == null) {
                            paymentParam.tracker = "";
                        }
                        if (paymentParam.ext == null) {
                            paymentParam.ext = PaymentParamExtra.new_();
                        }
                        if (paymentParam.couponId != null) {
                            break;
                        }
                        paymentParam.couponId = "";
                        return paymentParam;
                    }
                    paymentParam.useJDNew = nb5Var.g();
                }
            }
            return paymentParam;
        }

        public void serialize(PaymentParam paymentParam, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = paymentParam.itemId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = paymentParam.receipt;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = paymentParam.url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, paymentParam.useAutoDeduct);
            codedOutputByteBufferNano.A(5, paymentParam.signAndPay);
            String str4 = paymentParam.tracker;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            PaymentParamExtra paymentParamExtra = paymentParam.ext;
            if (paymentParamExtra != null) {
                codedOutputByteBufferNano.K(7, paymentParamExtra, PaymentParamExtra.PROTOBUF_ADAPTER);
            }
            String str5 = paymentParam.couponId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            codedOutputByteBufferNano.A(9, paymentParam.useJDNew);
        }
    };
    public static JsonAdapter<PaymentParam> JSON_ADAPTER = new ObjectJsonAdapter<PaymentParam>() { // from class: com.p1.mobile.putong.data.PaymentParam.2
        public Class getDataClass() {
            return PaymentParam.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PaymentParam mo17830newInstance() {
            return new PaymentParam();
        }

        public boolean parseField(PaymentParam paymentParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "signAndPay":
                    paymentParam.signAndPay = jsonParser.getValueAsBoolean();
                    return true;
                case "itemId":
                    paymentParam.itemId = jsonParser.getValueAsString();
                    return true;
                case "tracker":
                    paymentParam.tracker = jsonParser.getValueAsString();
                    return true;
                case "couponId":
                    paymentParam.couponId = jsonParser.getValueAsString();
                    return true;
                case "useJDNew":
                    paymentParam.useJDNew = jsonParser.getValueAsBoolean();
                    return true;
                case "ext":
                    paymentParam.ext = (PaymentParamExtra) PaymentParamExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    paymentParam.url = jsonParser.getValueAsString();
                    return true;
                case "receipt":
                    paymentParam.receipt = jsonParser.getValueAsString();
                    return true;
                case "useAutoDeduct":
                    paymentParam.useAutoDeduct = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PaymentParam paymentParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "signAndPay":
                case "itemId":
                case "tracker":
                case "couponId":
                case "useJDNew":
                case "ext":
                case "url":
                case "receipt":
                case "useAutoDeduct":
                    return true;
                default:
                    return super.parseFieldCheck(paymentParam, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaymentParam paymentParam, JsonGenerator jsonGenerator) throws IOException {
            String str = paymentParam.itemId;
            if (str != null) {
                jsonGenerator.writeStringField("itemId", str);
            }
            String str2 = paymentParam.receipt;
            if (str2 != null) {
                jsonGenerator.writeStringField("receipt", str2);
            }
            String str3 = paymentParam.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeBooleanField("useAutoDeduct", paymentParam.useAutoDeduct);
            jsonGenerator.writeBooleanField("signAndPay", paymentParam.signAndPay);
            String str4 = paymentParam.tracker;
            if (str4 != null) {
                jsonGenerator.writeStringField("tracker", str4);
            }
            if (paymentParam.ext != null) {
                jsonGenerator.writeFieldName("ext");
                PaymentParamExtra.JSON_ADAPTER.serialize(paymentParam.ext, jsonGenerator, true);
            }
            String str5 = paymentParam.couponId;
            if (str5 != null) {
                jsonGenerator.writeStringField("couponId", str5);
            }
            jsonGenerator.writeBooleanField("useJDNew", paymentParam.useJDNew);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaymentParam new_() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.nullCheck();
        return paymentParam;
    }

    @Override // 
    public PaymentParam mo18779clone() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.itemId = this.itemId;
        paymentParam.receipt = this.receipt;
        paymentParam.url = this.url;
        paymentParam.useAutoDeduct = this.useAutoDeduct;
        paymentParam.signAndPay = this.signAndPay;
        paymentParam.tracker = this.tracker;
        PaymentParamExtra paymentParamExtra = this.ext;
        if (paymentParamExtra != null) {
            paymentParam.ext = paymentParamExtra.m18782clone();
        }
        paymentParam.couponId = this.couponId;
        paymentParam.useJDNew = this.useJDNew;
        return paymentParam;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentParam)) {
            return false;
        }
        PaymentParam paymentParam = (PaymentParam) obj;
        return ValueObject.util_equals(this.itemId, paymentParam.itemId) && ValueObject.util_equals(this.receipt, paymentParam.receipt) && ValueObject.util_equals(this.url, paymentParam.url) && this.useAutoDeduct == paymentParam.useAutoDeduct && this.signAndPay == paymentParam.signAndPay && ValueObject.util_equals(this.tracker, paymentParam.tracker) && ValueObject.util_equals(this.ext, paymentParam.ext) && ValueObject.util_equals(this.couponId, paymentParam.couponId) && this.useJDNew == paymentParam.useJDNew;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public String getPurchaseTrackId() {
        return this.purchaseTrackId;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.itemId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.receipt;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.useAutoDeduct ? 1231 : 1237)) * 41) + (this.signAndPay ? 1231 : 1237)) * 41;
        String str4 = this.tracker;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        PaymentParamExtra paymentParamExtra = this.ext;
        int iHashCode5 = (iHashCode4 + (paymentParamExtra != null ? paymentParamExtra.hashCode() : 0)) * 41;
        String str5 = this.couponId;
        int iHashCode6 = ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.useJDNew ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.receipt == null) {
            this.receipt = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
        if (this.ext == null) {
            this.ext = PaymentParamExtra.new_();
        }
        if (this.couponId == null) {
            this.couponId = "";
        }
    }

    public void setPurchaseTrackId(String str) {
        this.purchaseTrackId = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
