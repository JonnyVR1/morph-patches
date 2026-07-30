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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class PaymentParamExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paymentparamextra";

    @Nullable
    @ProtobufIndex(index = 3)
    public String discountToken;

    @NonNull
    @ProtobufIndex(index = 1)
    public String payLandPageInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public String purchaseEnv;
    public static ProtobufAdapter<PaymentParamExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaymentParamExtra>() { // from class: com.p1.mobile.putong.data.PaymentParamExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PaymentParamExtra paymentParamExtra) {
            String str = paymentParamExtra.payLandPageInfo;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = paymentParamExtra.purchaseEnv;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = paymentParamExtra.discountToken;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            paymentParamExtra.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PaymentParamExtra parse(nc5 nc5Var) throws IOException {
            PaymentParamExtra paymentParamExtra = new PaymentParamExtra();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (paymentParamExtra.payLandPageInfo == null) {
                        paymentParamExtra.payLandPageInfo = "";
                    }
                    if (paymentParamExtra.purchaseEnv != null) {
                        break;
                    }
                    paymentParamExtra.purchaseEnv = "";
                    break;
                }
                if (iM162497u == 10) {
                    paymentParamExtra.payLandPageInfo = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    paymentParamExtra.purchaseEnv = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (paymentParamExtra.payLandPageInfo == null) {
                            paymentParamExtra.payLandPageInfo = "";
                        }
                        if (paymentParamExtra.purchaseEnv != null) {
                            break;
                        }
                        paymentParamExtra.purchaseEnv = "";
                        return paymentParamExtra;
                    }
                    paymentParamExtra.discountToken = nc5Var.m162495s();
                }
            }
            return paymentParamExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PaymentParamExtra paymentParamExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = paymentParamExtra.payLandPageInfo;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = paymentParamExtra.purchaseEnv;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = paymentParamExtra.discountToken;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<PaymentParamExtra> JSON_ADAPTER = new ObjectJsonAdapter<PaymentParamExtra>() { // from class: com.p1.mobile.putong.data.PaymentParamExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PaymentParamExtra.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PaymentParamExtra newInstance() {
            return new PaymentParamExtra();
        }

        public boolean parseField(PaymentParamExtra paymentParamExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "discountToken":
                    paymentParamExtra.discountToken = jsonParser.getValueAsString();
                    return true;
                case "purchaseEnv":
                    paymentParamExtra.purchaseEnv = jsonParser.getValueAsString();
                    return true;
                case "payLandPageInfo":
                    paymentParamExtra.payLandPageInfo = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PaymentParamExtra paymentParamExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "discountToken":
                case "purchaseEnv":
                case "payLandPageInfo":
                    return true;
                default:
                    return super.parseFieldCheck(paymentParamExtra, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaymentParamExtra paymentParamExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = paymentParamExtra.payLandPageInfo;
            if (str != null) {
                jsonGenerator.writeStringField("payLandPageInfo", str);
            }
            String str2 = paymentParamExtra.purchaseEnv;
            if (str2 != null) {
                jsonGenerator.writeStringField("purchaseEnv", str2);
            }
            String str3 = paymentParamExtra.discountToken;
            if (str3 != null) {
                jsonGenerator.writeStringField("discountToken", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentParamExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentParamExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaymentParamExtra new_() {
        PaymentParamExtra paymentParamExtra = new PaymentParamExtra();
        paymentParamExtra.nullCheck();
        return paymentParamExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PaymentParamExtra mo225055clone() {
        PaymentParamExtra paymentParamExtra = new PaymentParamExtra();
        paymentParamExtra.payLandPageInfo = this.payLandPageInfo;
        paymentParamExtra.purchaseEnv = this.purchaseEnv;
        paymentParamExtra.discountToken = this.discountToken;
        return paymentParamExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentParamExtra)) {
            return false;
        }
        PaymentParamExtra paymentParamExtra = (PaymentParamExtra) obj;
        return ValueObject.util_equals(this.payLandPageInfo, paymentParamExtra.payLandPageInfo) && ValueObject.util_equals(this.purchaseEnv, paymentParamExtra.purchaseEnv) && ValueObject.util_equals(this.discountToken, paymentParamExtra.discountToken);
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
        String str = this.payLandPageInfo;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.purchaseEnv;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.discountToken;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.payLandPageInfo == null) {
            this.payLandPageInfo = "";
        }
        if (this.purchaseEnv == null) {
            this.purchaseEnv = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
