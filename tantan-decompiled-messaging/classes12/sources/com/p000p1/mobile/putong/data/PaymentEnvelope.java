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
public class PaymentEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paymentenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public PaymentData data;
    public static ProtobufAdapter<PaymentEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaymentEnvelope>() { // from class: com.p1.mobile.putong.data.PaymentEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PaymentEnvelope paymentEnvelope) {
            PaymentData paymentData = paymentEnvelope.data;
            int iL = paymentData != null ? CodedOutputByteBufferNano.l(1, paymentData, PaymentData.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) paymentEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PaymentEnvelope m18777parse(nb5 nb5Var) throws IOException {
            PaymentEnvelope paymentEnvelope = new PaymentEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (paymentEnvelope.data != null) {
                        break;
                    }
                    paymentEnvelope.data = PaymentData.new_();
                    break;
                }
                if (iU != 10) {
                    if (paymentEnvelope.data != null) {
                        break;
                    }
                    paymentEnvelope.data = PaymentData.new_();
                    return paymentEnvelope;
                }
                paymentEnvelope.data = (PaymentData) nb5Var.l(PaymentData.PROTOBUF_ADAPTER);
            }
            return paymentEnvelope;
        }

        public void serialize(PaymentEnvelope paymentEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PaymentData paymentData = paymentEnvelope.data;
            if (paymentData != null) {
                codedOutputByteBufferNano.K(1, paymentData, PaymentData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PaymentEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<PaymentEnvelope>() { // from class: com.p1.mobile.putong.data.PaymentEnvelope.2
        public Class getDataClass() {
            return PaymentEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PaymentEnvelope mo17830newInstance() {
            return new PaymentEnvelope();
        }

        public boolean parseField(PaymentEnvelope paymentEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Data.TYPE)) {
                return false;
            }
            paymentEnvelope.data = (PaymentData) PaymentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PaymentEnvelope paymentEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(paymentEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaymentEnvelope paymentEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (paymentEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                PaymentData.JSON_ADAPTER.serialize(paymentEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaymentEnvelope new_() {
        PaymentEnvelope paymentEnvelope = new PaymentEnvelope();
        paymentEnvelope.nullCheck();
        return paymentEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PaymentEnvelope m18776clone() {
        PaymentEnvelope paymentEnvelope = new PaymentEnvelope();
        PaymentData paymentData = this.data;
        if (paymentData != null) {
            paymentEnvelope.data = paymentData.m18773clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        PaymentData paymentData = this.data;
        int iHashCode = i2 + (paymentData != null ? paymentData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = PaymentData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
