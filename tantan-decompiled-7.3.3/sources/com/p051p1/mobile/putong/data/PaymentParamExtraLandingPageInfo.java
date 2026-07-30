package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class PaymentParamExtraLandingPageInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paymentparamextralandingpageinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    @ProtobufIndex(index = 3)
    public boolean enablePush;

    @NonNull
    @ProtobufIndex(index = 2)
    public String targetUserId;
    public static ProtobufAdapter<PaymentParamExtraLandingPageInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaymentParamExtraLandingPageInfo>() { // from class: com.p1.mobile.putong.data.PaymentParamExtraLandingPageInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo) {
            String str = paymentParamExtraLandingPageInfo.category;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = paymentParamExtraLandingPageInfo.targetUserId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, paymentParamExtraLandingPageInfo.enablePush);
            paymentParamExtraLandingPageInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PaymentParamExtraLandingPageInfo parse(nc5 nc5Var) throws IOException {
            PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo = new PaymentParamExtraLandingPageInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (paymentParamExtraLandingPageInfo.category == null) {
                        paymentParamExtraLandingPageInfo.category = "";
                    }
                    if (paymentParamExtraLandingPageInfo.targetUserId != null) {
                        break;
                    }
                    paymentParamExtraLandingPageInfo.targetUserId = "";
                    break;
                }
                if (iM162497u == 10) {
                    paymentParamExtraLandingPageInfo.category = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    paymentParamExtraLandingPageInfo.targetUserId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 24) {
                        if (paymentParamExtraLandingPageInfo.category == null) {
                            paymentParamExtraLandingPageInfo.category = "";
                        }
                        if (paymentParamExtraLandingPageInfo.targetUserId != null) {
                            break;
                        }
                        paymentParamExtraLandingPageInfo.targetUserId = "";
                        return paymentParamExtraLandingPageInfo;
                    }
                    paymentParamExtraLandingPageInfo.enablePush = nc5Var.m162483g();
                }
            }
            return paymentParamExtraLandingPageInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = paymentParamExtraLandingPageInfo.category;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = paymentParamExtraLandingPageInfo.targetUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, paymentParamExtraLandingPageInfo.enablePush);
        }
    };
    public static JsonAdapter<PaymentParamExtraLandingPageInfo> JSON_ADAPTER = new ObjectJsonAdapter<PaymentParamExtraLandingPageInfo>() { // from class: com.p1.mobile.putong.data.PaymentParamExtraLandingPageInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PaymentParamExtraLandingPageInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PaymentParamExtraLandingPageInfo newInstance() {
            return new PaymentParamExtraLandingPageInfo();
        }

        public boolean parseField(PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "targetUserId":
                    paymentParamExtraLandingPageInfo.targetUserId = jsonParser.getValueAsString();
                    return true;
                case "category":
                    paymentParamExtraLandingPageInfo.category = jsonParser.getValueAsString();
                    return true;
                case "enablePush":
                    paymentParamExtraLandingPageInfo.enablePush = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "targetUserId":
                case "category":
                case "enablePush":
                    return true;
                default:
                    return super.parseFieldCheck(paymentParamExtraLandingPageInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = paymentParamExtraLandingPageInfo.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            String str2 = paymentParamExtraLandingPageInfo.targetUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("targetUserId", str2);
            }
            jsonGenerator.writeBooleanField("enablePush", paymentParamExtraLandingPageInfo.enablePush);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentParamExtraLandingPageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentParamExtraLandingPageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaymentParamExtraLandingPageInfo new_() {
        PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo = new PaymentParamExtraLandingPageInfo();
        paymentParamExtraLandingPageInfo.nullCheck();
        return paymentParamExtraLandingPageInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PaymentParamExtraLandingPageInfo mo225055clone() {
        PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo = new PaymentParamExtraLandingPageInfo();
        paymentParamExtraLandingPageInfo.category = this.category;
        paymentParamExtraLandingPageInfo.targetUserId = this.targetUserId;
        paymentParamExtraLandingPageInfo.enablePush = this.enablePush;
        return paymentParamExtraLandingPageInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentParamExtraLandingPageInfo)) {
            return false;
        }
        PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo = (PaymentParamExtraLandingPageInfo) obj;
        return ValueObject.util_equals(this.category, paymentParamExtraLandingPageInfo.category) && ValueObject.util_equals(this.targetUserId, paymentParamExtraLandingPageInfo.targetUserId) && this.enablePush == paymentParamExtraLandingPageInfo.enablePush;
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
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.targetUserId;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.enablePush ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.targetUserId == null) {
            this.targetUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
