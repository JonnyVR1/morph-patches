package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.PaymentParam;
import com.p051p1.mobile.putong.data.PaymentParamExtra;
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
import org.eclipse.jetty.http.HttpStatus;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SignPaymentParam signPaymentParam) {
            String str = signPaymentParam.itemId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = signPaymentParam.receipt;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = signPaymentParam.url;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, signPaymentParam.useAutoDeduct) + CodedOutputByteBufferNano.m17275b(5, signPaymentParam.signAndPay);
            String str4 = signPaymentParam.tracker;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            PaymentParamExtra paymentParamExtra = signPaymentParam.ext;
            if (paymentParamExtra != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(7, paymentParamExtra, PaymentParamExtra.PROTOBUF_ADAPTER);
            }
            String str5 = signPaymentParam.couponId;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str5);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(51, signPaymentParam.addHuaZhi);
            String str6 = signPaymentParam.contractId;
            if (str6 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(52, str6);
            }
            int iM17275b3 = iM17275b2 + CodedOutputByteBufferNano.m17275b(53, signPaymentParam.delayCharge) + CodedOutputByteBufferNano.m17275b(54, signPaymentParam.reSignAfterFail);
            signPaymentParam.cachedSize = iM17275b3;
            return iM17275b3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SignPaymentParam parse(nc5 nc5Var) throws IOException {
            SignPaymentParam signPaymentParam = new SignPaymentParam();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (signPaymentParam.itemId == null) {
                            signPaymentParam.itemId = "";
                        }
                        if (signPaymentParam.receipt == null) {
                            signPaymentParam.receipt = "";
                        }
                        if (signPaymentParam.url == null) {
                            signPaymentParam.url = "";
                        }
                        if (signPaymentParam.tracker == null) {
                            signPaymentParam.tracker = "";
                        }
                        if (signPaymentParam.ext == null) {
                            signPaymentParam.ext = PaymentParamExtra.new_();
                        }
                        if (signPaymentParam.couponId == null) {
                            signPaymentParam.couponId = "";
                        }
                        if (signPaymentParam.contractId == null) {
                            signPaymentParam.contractId = "";
                        }
                        break;
                    case 10:
                        signPaymentParam.itemId = nc5Var.m162495s();
                        continue;
                    case 18:
                        signPaymentParam.receipt = nc5Var.m162495s();
                        continue;
                    case 26:
                        signPaymentParam.url = nc5Var.m162495s();
                        continue;
                    case 32:
                        signPaymentParam.useAutoDeduct = nc5Var.m162483g();
                        continue;
                    case 40:
                        signPaymentParam.signAndPay = nc5Var.m162483g();
                        continue;
                    case 50:
                        signPaymentParam.tracker = nc5Var.m162495s();
                        continue;
                    case 58:
                        signPaymentParam.ext = (PaymentParamExtra) nc5Var.m162488l(PaymentParamExtra.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        signPaymentParam.couponId = nc5Var.m162495s();
                        continue;
                    case HttpStatus.REQUEST_TIMEOUT_408 /* 408 */:
                        signPaymentParam.addHuaZhi = nc5Var.m162483g();
                        continue;
                    case 418:
                        signPaymentParam.contractId = nc5Var.m162495s();
                        continue;
                    case HttpStatus.FAILED_DEPENDENCY_424 /* 424 */:
                        signPaymentParam.delayCharge = nc5Var.m162483g();
                        continue;
                    case 432:
                        signPaymentParam.reSignAfterFail = nc5Var.m162483g();
                        continue;
                    default:
                        if (signPaymentParam.itemId == null) {
                            signPaymentParam.itemId = "";
                        }
                        if (signPaymentParam.receipt == null) {
                            signPaymentParam.receipt = "";
                        }
                        if (signPaymentParam.url == null) {
                            signPaymentParam.url = "";
                        }
                        if (signPaymentParam.tracker == null) {
                            signPaymentParam.tracker = "";
                        }
                        if (signPaymentParam.ext == null) {
                            signPaymentParam.ext = PaymentParamExtra.new_();
                        }
                        if (signPaymentParam.couponId == null) {
                            signPaymentParam.couponId = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SignPaymentParam signPaymentParam, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = signPaymentParam.itemId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = signPaymentParam.receipt;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = signPaymentParam.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17299A(4, signPaymentParam.useAutoDeduct);
            codedOutputByteBufferNano.m17299A(5, signPaymentParam.signAndPay);
            String str4 = signPaymentParam.tracker;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            PaymentParamExtra paymentParamExtra = signPaymentParam.ext;
            if (paymentParamExtra != null) {
                codedOutputByteBufferNano.m17309K(7, paymentParamExtra, PaymentParamExtra.PROTOBUF_ADAPTER);
            }
            String str5 = signPaymentParam.couponId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(8, str5);
            }
            codedOutputByteBufferNano.m17299A(51, signPaymentParam.addHuaZhi);
            String str6 = signPaymentParam.contractId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(52, str6);
            }
            codedOutputByteBufferNano.m17299A(53, signPaymentParam.delayCharge);
            codedOutputByteBufferNano.m17299A(54, signPaymentParam.reSignAfterFail);
        }
    };
    public static JsonAdapter<SignPaymentParam> JSON_ADAPTER = new ObjectJsonAdapter<SignPaymentParam>() { // from class: com.p1.mobile.putong.core.data.SignPaymentParam.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SignPaymentParam.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SignPaymentParam newInstance() {
            return new SignPaymentParam();
        }

        public boolean parseField(SignPaymentParam signPaymentParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "signAndPay":
                    signPaymentParam.signAndPay = jsonParser.getValueAsBoolean();
                    return true;
                case "itemId":
                    signPaymentParam.itemId = jsonParser.getValueAsString();
                    return true;
                case "tracker":
                    signPaymentParam.tracker = jsonParser.getValueAsString();
                    return true;
                case "couponId":
                    signPaymentParam.couponId = jsonParser.getValueAsString();
                    return true;
                case "delayCharge":
                    signPaymentParam.delayCharge = jsonParser.getValueAsBoolean();
                    return true;
                case "addHuaZhi":
                    signPaymentParam.addHuaZhi = jsonParser.getValueAsBoolean();
                    return true;
                case "ext":
                    signPaymentParam.ext = PaymentParamExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    signPaymentParam.url = jsonParser.getValueAsString();
                    return true;
                case "contractId":
                    signPaymentParam.contractId = jsonParser.getValueAsString();
                    return true;
                case "reSignAfterFail":
                    signPaymentParam.reSignAfterFail = jsonParser.getValueAsBoolean();
                    return true;
                case "receipt":
                    signPaymentParam.receipt = jsonParser.getValueAsString();
                    return true;
                case "useAutoDeduct":
                    signPaymentParam.useAutoDeduct = jsonParser.getValueAsBoolean();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SignPaymentParam signPaymentParam, JsonGenerator jsonGenerator) throws IOException {
            String str = signPaymentParam.itemId;
            if (str != null) {
                jsonGenerator.writeStringField("itemId", str);
            }
            String str2 = signPaymentParam.receipt;
            if (str2 != null) {
                jsonGenerator.writeStringField("receipt", str2);
            }
            String str3 = signPaymentParam.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeBooleanField("useAutoDeduct", signPaymentParam.useAutoDeduct);
            jsonGenerator.writeBooleanField("signAndPay", signPaymentParam.signAndPay);
            String str4 = signPaymentParam.tracker;
            if (str4 != null) {
                jsonGenerator.writeStringField("tracker", str4);
            }
            if (signPaymentParam.ext != null) {
                jsonGenerator.writeFieldName(BaseSei.EXT);
                PaymentParamExtra.JSON_ADAPTER.serialize(signPaymentParam.ext, jsonGenerator, true);
            }
            String str5 = signPaymentParam.couponId;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SignPaymentParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SignPaymentParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SignPaymentParam new_() {
        SignPaymentParam signPaymentParam = new SignPaymentParam();
        signPaymentParam.nullCheck();
        return signPaymentParam;
    }

    @Override // com.p051p1.mobile.putong.data.PaymentParam, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SignPaymentParam mo225055clone() {
        SignPaymentParam signPaymentParam = new SignPaymentParam();
        signPaymentParam.itemId = this.itemId;
        signPaymentParam.receipt = this.receipt;
        signPaymentParam.url = this.url;
        signPaymentParam.useAutoDeduct = this.useAutoDeduct;
        signPaymentParam.signAndPay = this.signAndPay;
        signPaymentParam.tracker = this.tracker;
        PaymentParamExtra paymentParamExtra = this.ext;
        if (paymentParamExtra != null) {
            signPaymentParam.ext = paymentParamExtra.mo225055clone();
        }
        signPaymentParam.couponId = this.couponId;
        signPaymentParam.addHuaZhi = this.addHuaZhi;
        signPaymentParam.contractId = this.contractId;
        signPaymentParam.delayCharge = this.delayCharge;
        signPaymentParam.reSignAfterFail = this.reSignAfterFail;
        return signPaymentParam;
    }

    @Override // com.p051p1.mobile.putong.data.PaymentParam
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

    @Override // com.p051p1.mobile.putong.data.PaymentParam, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.p051p1.mobile.putong.data.PaymentParam
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + (this.addHuaZhi ? 1231 : 1237)) * 41;
        String str = this.contractId;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + (this.delayCharge ? 1231 : 1237)) * 41) + (this.reSignAfterFail ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.p051p1.mobile.putong.data.PaymentParam, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.contractId == null) {
            this.contractId = "";
        }
    }

    @Override // com.p051p1.mobile.putong.data.PaymentParam, com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
