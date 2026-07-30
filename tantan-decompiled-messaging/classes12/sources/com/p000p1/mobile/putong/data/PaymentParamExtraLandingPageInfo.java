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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo) {
            String str = paymentParamExtraLandingPageInfo.category;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = paymentParamExtraLandingPageInfo.targetUserId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, paymentParamExtraLandingPageInfo.enablePush);
            ((MessageNano) paymentParamExtraLandingPageInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PaymentParamExtraLandingPageInfo m18786parse(nb5 nb5Var) throws IOException {
            PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo = new PaymentParamExtraLandingPageInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (paymentParamExtraLandingPageInfo.category == null) {
                        paymentParamExtraLandingPageInfo.category = "";
                    }
                    if (paymentParamExtraLandingPageInfo.targetUserId != null) {
                        break;
                    }
                    paymentParamExtraLandingPageInfo.targetUserId = "";
                    break;
                }
                if (iU == 10) {
                    paymentParamExtraLandingPageInfo.category = nb5Var.s();
                } else if (iU == 18) {
                    paymentParamExtraLandingPageInfo.targetUserId = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (paymentParamExtraLandingPageInfo.category == null) {
                            paymentParamExtraLandingPageInfo.category = "";
                        }
                        if (paymentParamExtraLandingPageInfo.targetUserId != null) {
                            break;
                        }
                        paymentParamExtraLandingPageInfo.targetUserId = "";
                        return paymentParamExtraLandingPageInfo;
                    }
                    paymentParamExtraLandingPageInfo.enablePush = nb5Var.g();
                }
            }
            return paymentParamExtraLandingPageInfo;
        }

        public void serialize(PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = paymentParamExtraLandingPageInfo.category;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = paymentParamExtraLandingPageInfo.targetUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, paymentParamExtraLandingPageInfo.enablePush);
        }
    };
    public static JsonAdapter<PaymentParamExtraLandingPageInfo> JSON_ADAPTER = new ObjectJsonAdapter<PaymentParamExtraLandingPageInfo>() { // from class: com.p1.mobile.putong.data.PaymentParamExtraLandingPageInfo.2
        public Class getDataClass() {
            return PaymentParamExtraLandingPageInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PaymentParamExtraLandingPageInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentParamExtraLandingPageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentParamExtraLandingPageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaymentParamExtraLandingPageInfo new_() {
        PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfo = new PaymentParamExtraLandingPageInfo();
        paymentParamExtraLandingPageInfo.nullCheck();
        return paymentParamExtraLandingPageInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PaymentParamExtraLandingPageInfo m18785clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.targetUserId;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.enablePush ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.targetUserId == null) {
            this.targetUserId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
