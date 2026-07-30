package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PaymentParamExtra;
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
public class SignPaymentParam extends PaymentParam implements Cloneable, Serializable {
    public static final String TYPE = "signpaymentparam";

    @ProtobufIndex(index = 51)
    public boolean addHuaZhi;

    @NonNull
    @ProtobufIndex(index = 52)
    public String contractId;

    @ProtobufIndex(index = 53)
    public boolean delayCharge;

    @ProtobufIndex(index = 54)
    public boolean reSignAfterFail;
    public static ProtobufAdapter<SignPaymentParam> PROTOBUF_ADAPTER = new MessageNanoAdapter<SignPaymentParam>() { // from class: com.p1.mobile.putong.core.data.SignPaymentParam.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SignPaymentParam signPaymentParam) {
            String str = ((PaymentParam) signPaymentParam).itemId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = ((PaymentParam) signPaymentParam).receipt;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = ((PaymentParam) signPaymentParam).url;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, ((PaymentParam) signPaymentParam).useAutoDeduct) + CodedOutputByteBufferNano.b(5, ((PaymentParam) signPaymentParam).signAndPay);
            String str4 = ((PaymentParam) signPaymentParam).tracker;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(6, str4);
            }
            PaymentParamExtra paymentParamExtra = ((PaymentParam) signPaymentParam).ext;
            if (paymentParamExtra != null) {
                iB += CodedOutputByteBufferNano.l(7, paymentParamExtra, PaymentParamExtra.PROTOBUF_ADAPTER);
            }
            String str5 = ((PaymentParam) signPaymentParam).couponId;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(8, str5);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(51, signPaymentParam.addHuaZhi);
            String str6 = signPaymentParam.contractId;
            if (str6 != null) {
                iB2 += CodedOutputByteBufferNano.o(52, str6);
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(53, signPaymentParam.delayCharge) + CodedOutputByteBufferNano.b(54, signPaymentParam.reSignAfterFail);
            ((MessageNano) signPaymentParam).cachedSize = iB3;
            return iB3;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SignPaymentParam m15616parse(nb5 nb5Var) throws IOException {
            SignPaymentParam signPaymentParam = new SignPaymentParam();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (((PaymentParam) signPaymentParam).itemId == null) {
                            ((PaymentParam) signPaymentParam).itemId = "";
                        }
                        if (((PaymentParam) signPaymentParam).receipt == null) {
                            ((PaymentParam) signPaymentParam).receipt = "";
                        }
                        if (((PaymentParam) signPaymentParam).url == null) {
                            ((PaymentParam) signPaymentParam).url = "";
                        }
                        if (((PaymentParam) signPaymentParam).tracker == null) {
                            ((PaymentParam) signPaymentParam).tracker = "";
                        }
                        if (((PaymentParam) signPaymentParam).ext == null) {
                            ((PaymentParam) signPaymentParam).ext = PaymentParamExtra.new_();
                        }
                        if (((PaymentParam) signPaymentParam).couponId == null) {
                            ((PaymentParam) signPaymentParam).couponId = "";
                        }
                        if (signPaymentParam.contractId == null) {
                            signPaymentParam.contractId = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        ((PaymentParam) signPaymentParam).itemId = nb5Var.s();
                        continue;
                    case 18:
                        ((PaymentParam) signPaymentParam).receipt = nb5Var.s();
                        continue;
                    case 26:
                        ((PaymentParam) signPaymentParam).url = nb5Var.s();
                        continue;
                    case 32:
                        ((PaymentParam) signPaymentParam).useAutoDeduct = nb5Var.g();
                        continue;
                    case 40:
                        ((PaymentParam) signPaymentParam).signAndPay = nb5Var.g();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        ((PaymentParam) signPaymentParam).tracker = nb5Var.s();
                        continue;
                    case 58:
                        ((PaymentParam) signPaymentParam).ext = (PaymentParamExtra) nb5Var.l(PaymentParamExtra.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        ((PaymentParam) signPaymentParam).couponId = nb5Var.s();
                        continue;
                    case 408:
                        signPaymentParam.addHuaZhi = nb5Var.g();
                        continue;
                    case 418:
                        signPaymentParam.contractId = nb5Var.s();
                        continue;
                    case 424:
                        signPaymentParam.delayCharge = nb5Var.g();
                        continue;
                    case 432:
                        signPaymentParam.reSignAfterFail = nb5Var.g();
                        continue;
                    default:
                        if (((PaymentParam) signPaymentParam).itemId == null) {
                            ((PaymentParam) signPaymentParam).itemId = "";
                        }
                        if (((PaymentParam) signPaymentParam).receipt == null) {
                            ((PaymentParam) signPaymentParam).receipt = "";
                        }
                        if (((PaymentParam) signPaymentParam).url == null) {
                            ((PaymentParam) signPaymentParam).url = "";
                        }
                        if (((PaymentParam) signPaymentParam).tracker == null) {
                            ((PaymentParam) signPaymentParam).tracker = "";
                        }
                        if (((PaymentParam) signPaymentParam).ext == null) {
                            ((PaymentParam) signPaymentParam).ext = PaymentParamExtra.new_();
                        }
                        if (((PaymentParam) signPaymentParam).couponId == null) {
                            ((PaymentParam) signPaymentParam).couponId = "";
                        }
                        if (signPaymentParam.contractId == null) {
                            signPaymentParam.contractId = "";
                            return signPaymentParam;
                        }
                        break;
                }
            }
            return signPaymentParam;
        }

        public void serialize(SignPaymentParam signPaymentParam, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = ((PaymentParam) signPaymentParam).itemId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = ((PaymentParam) signPaymentParam).receipt;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = ((PaymentParam) signPaymentParam).url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, ((PaymentParam) signPaymentParam).useAutoDeduct);
            codedOutputByteBufferNano.A(5, ((PaymentParam) signPaymentParam).signAndPay);
            String str4 = ((PaymentParam) signPaymentParam).tracker;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            PaymentParamExtra paymentParamExtra = ((PaymentParam) signPaymentParam).ext;
            if (paymentParamExtra != null) {
                codedOutputByteBufferNano.K(7, paymentParamExtra, PaymentParamExtra.PROTOBUF_ADAPTER);
            }
            String str5 = ((PaymentParam) signPaymentParam).couponId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            codedOutputByteBufferNano.A(51, signPaymentParam.addHuaZhi);
            String str6 = signPaymentParam.contractId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(52, str6);
            }
            codedOutputByteBufferNano.A(53, signPaymentParam.delayCharge);
            codedOutputByteBufferNano.A(54, signPaymentParam.reSignAfterFail);
        }
    };
    public static JsonAdapter<SignPaymentParam> JSON_ADAPTER = new ObjectJsonAdapter<SignPaymentParam>() { // from class: com.p1.mobile.putong.core.data.SignPaymentParam.2
        public Class getDataClass() {
            return SignPaymentParam.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SignPaymentParam m15617newInstance() {
            return new SignPaymentParam();
        }

        public boolean parseField(SignPaymentParam signPaymentParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "signAndPay":
                    ((PaymentParam) signPaymentParam).signAndPay = jsonParser.getValueAsBoolean();
                    return true;
                case "itemId":
                    ((PaymentParam) signPaymentParam).itemId = jsonParser.getValueAsString();
                    return true;
                case "tracker":
                    ((PaymentParam) signPaymentParam).tracker = jsonParser.getValueAsString();
                    return true;
                case "couponId":
                    ((PaymentParam) signPaymentParam).couponId = jsonParser.getValueAsString();
                    return true;
                case "delayCharge":
                    signPaymentParam.delayCharge = jsonParser.getValueAsBoolean();
                    return true;
                case "addHuaZhi":
                    signPaymentParam.addHuaZhi = jsonParser.getValueAsBoolean();
                    return true;
                case "ext":
                    ((PaymentParam) signPaymentParam).ext = (PaymentParamExtra) PaymentParamExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    ((PaymentParam) signPaymentParam).url = jsonParser.getValueAsString();
                    return true;
                case "contractId":
                    signPaymentParam.contractId = jsonParser.getValueAsString();
                    return true;
                case "reSignAfterFail":
                    signPaymentParam.reSignAfterFail = jsonParser.getValueAsBoolean();
                    return true;
                case "receipt":
                    ((PaymentParam) signPaymentParam).receipt = jsonParser.getValueAsString();
                    return true;
                case "useAutoDeduct":
                    ((PaymentParam) signPaymentParam).useAutoDeduct = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SignPaymentParam signPaymentParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "signAndPay":
                case "itemId":
                case "tracker":
                case "couponId":
                case "delayCharge":
                case "addHuaZhi":
                case "ext":
                case "url":
                case "contractId":
                case "reSignAfterFail":
                case "receipt":
                case "useAutoDeduct":
                    return true;
                default:
                    return super.parseFieldCheck(signPaymentParam, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SignPaymentParam signPaymentParam, JsonGenerator jsonGenerator) throws IOException {
            String str = ((PaymentParam) signPaymentParam).itemId;
            if (str != null) {
                jsonGenerator.writeStringField("itemId", str);
            }
            String str2 = ((PaymentParam) signPaymentParam).receipt;
            if (str2 != null) {
                jsonGenerator.writeStringField("receipt", str2);
            }
            String str3 = ((PaymentParam) signPaymentParam).url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeBooleanField("useAutoDeduct", ((PaymentParam) signPaymentParam).useAutoDeduct);
            jsonGenerator.writeBooleanField("signAndPay", ((PaymentParam) signPaymentParam).signAndPay);
            String str4 = ((PaymentParam) signPaymentParam).tracker;
            if (str4 != null) {
                jsonGenerator.writeStringField("tracker", str4);
            }
            if (((PaymentParam) signPaymentParam).ext != null) {
                jsonGenerator.writeFieldName("ext");
                PaymentParamExtra.JSON_ADAPTER.serialize(((PaymentParam) signPaymentParam).ext, jsonGenerator, true);
            }
            String str5 = ((PaymentParam) signPaymentParam).couponId;
            if (str5 != null) {
                jsonGenerator.writeStringField("couponId", str5);
            }
            jsonGenerator.writeBooleanField("addHuaZhi", signPaymentParam.addHuaZhi);
            String str6 = signPaymentParam.contractId;
            if (str6 != null) {
                jsonGenerator.writeStringField("contractId", str6);
            }
            jsonGenerator.writeBooleanField("delayCharge", signPaymentParam.delayCharge);
            jsonGenerator.writeBooleanField("reSignAfterFail", signPaymentParam.reSignAfterFail);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SignPaymentParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SignPaymentParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SignPaymentParam new_() {
        SignPaymentParam signPaymentParam = new SignPaymentParam();
        signPaymentParam.nullCheck();
        return signPaymentParam;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SignPaymentParam m15615clone() {
        SignPaymentParam signPaymentParam = new SignPaymentParam();
        ((PaymentParam) signPaymentParam).itemId = ((PaymentParam) this).itemId;
        ((PaymentParam) signPaymentParam).receipt = ((PaymentParam) this).receipt;
        ((PaymentParam) signPaymentParam).url = ((PaymentParam) this).url;
        ((PaymentParam) signPaymentParam).useAutoDeduct = ((PaymentParam) this).useAutoDeduct;
        ((PaymentParam) signPaymentParam).signAndPay = ((PaymentParam) this).signAndPay;
        ((PaymentParam) signPaymentParam).tracker = ((PaymentParam) this).tracker;
        PaymentParamExtra paymentParamExtra = ((PaymentParam) this).ext;
        if (paymentParamExtra != null) {
            ((PaymentParam) signPaymentParam).ext = paymentParamExtra.clone();
        }
        ((PaymentParam) signPaymentParam).couponId = ((PaymentParam) this).couponId;
        signPaymentParam.addHuaZhi = this.addHuaZhi;
        signPaymentParam.contractId = this.contractId;
        signPaymentParam.delayCharge = this.delayCharge;
        signPaymentParam.reSignAfterFail = this.reSignAfterFail;
        return signPaymentParam;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignPaymentParam)) {
            return false;
        }
        SignPaymentParam signPaymentParam = (SignPaymentParam) obj;
        return super.equals(obj) && this.addHuaZhi == signPaymentParam.addHuaZhi && ValueObject.util_equals(this.contractId, signPaymentParam.contractId) && this.delayCharge == signPaymentParam.delayCharge && this.reSignAfterFail == signPaymentParam.reSignAfterFail;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + (this.addHuaZhi ? 1231 : 1237)) * 41;
        String str = this.contractId;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + (this.delayCharge ? 1231 : 1237)) * 41) + (this.reSignAfterFail ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        super.nullCheck();
        if (this.contractId == null) {
            this.contractId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
