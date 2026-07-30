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
public class PaymentEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paymentenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public PaymentData data;
    public static ProtobufAdapter<PaymentEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaymentEnvelope>() { // from class: com.p1.mobile.putong.data.PaymentEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PaymentEnvelope paymentEnvelope) {
            PaymentData paymentData = paymentEnvelope.data;
            int iM17285l = paymentData != null ? CodedOutputByteBufferNano.m17285l(1, paymentData, PaymentData.PROTOBUF_ADAPTER) : 0;
            paymentEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PaymentEnvelope parse(nc5 nc5Var) throws IOException {
            PaymentEnvelope paymentEnvelope = new PaymentEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (paymentEnvelope.data != null) {
                        break;
                    }
                    paymentEnvelope.data = PaymentData.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (paymentEnvelope.data != null) {
                        break;
                    }
                    paymentEnvelope.data = PaymentData.new_();
                    return paymentEnvelope;
                }
                paymentEnvelope.data = (PaymentData) nc5Var.m162488l(PaymentData.PROTOBUF_ADAPTER);
            }
            return paymentEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PaymentEnvelope paymentEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PaymentData paymentData = paymentEnvelope.data;
            if (paymentData != null) {
                codedOutputByteBufferNano.m17309K(1, paymentData, PaymentData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PaymentEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<PaymentEnvelope>() { // from class: com.p1.mobile.putong.data.PaymentEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PaymentEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PaymentEnvelope newInstance() {
            return new PaymentEnvelope();
        }

        public boolean parseField(PaymentEnvelope paymentEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            paymentEnvelope.data = PaymentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PaymentEnvelope paymentEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(paymentEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaymentEnvelope paymentEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (paymentEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                PaymentData.JSON_ADAPTER.serialize(paymentEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaymentEnvelope new_() {
        PaymentEnvelope paymentEnvelope = new PaymentEnvelope();
        paymentEnvelope.nullCheck();
        return paymentEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PaymentEnvelope mo225055clone() {
        PaymentEnvelope paymentEnvelope = new PaymentEnvelope();
        PaymentData paymentData = this.data;
        if (paymentData != null) {
            paymentEnvelope.data = paymentData.mo225055clone();
        }
        return paymentEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaymentEnvelope) {
            return ValueObject.util_equals(this.data, ((PaymentEnvelope) obj).data);
        }
        return false;
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
        PaymentData paymentData = this.data;
        int iHashCode = i2 + (paymentData != null ? paymentData.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = PaymentData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
