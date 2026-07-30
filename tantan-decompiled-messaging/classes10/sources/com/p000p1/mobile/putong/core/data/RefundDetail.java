package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class RefundDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "refunddetail";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f153id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double totalRefundAmount;
    public static ProtobufAdapter<RefundDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<RefundDetail>() { // from class: com.p1.mobile.putong.core.data.RefundDetail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RefundDetail refundDetail) {
            String str = refundDetail.f153id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, refundDetail.totalRefundAmount);
            ((MessageNano) refundDetail).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RefundDetail m15359parse(nb5 nb5Var) throws IOException {
            RefundDetail refundDetail = new RefundDetail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (refundDetail.f153id != null) {
                        break;
                    }
                    refundDetail.f153id = "";
                    break;
                }
                if (iU == 10) {
                    refundDetail.f153id = nb5Var.s();
                } else {
                    if (iU != 17) {
                        if (refundDetail.f153id != null) {
                            break;
                        }
                        refundDetail.f153id = "";
                        return refundDetail;
                    }
                    refundDetail.totalRefundAmount = nb5Var.h();
                }
            }
            return refundDetail;
        }

        public void serialize(RefundDetail refundDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = refundDetail.f153id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, refundDetail.totalRefundAmount);
        }
    };
    public static JsonAdapter<RefundDetail> JSON_ADAPTER = new ObjectJsonAdapter<RefundDetail>() { // from class: com.p1.mobile.putong.core.data.RefundDetail.2
        public Class getDataClass() {
            return RefundDetail.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RefundDetail m15360newInstance() {
            return new RefundDetail();
        }

        public boolean parseField(RefundDetail refundDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                refundDetail.f153id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("totalRefundAmount")) {
                return false;
            }
            refundDetail.totalRefundAmount = jsonParser.getValueAsDouble();
            return true;
        }

        public boolean parseFieldCheck(RefundDetail refundDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("totalRefundAmount")) {
                return true;
            }
            return super.parseFieldCheck(refundDetail, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RefundDetail refundDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = refundDetail.f153id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("totalRefundAmount", refundDetail.totalRefundAmount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RefundDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RefundDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RefundDetail new_() {
        RefundDetail refundDetail = new RefundDetail();
        refundDetail.nullCheck();
        return refundDetail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RefundDetail m15358clone() {
        RefundDetail refundDetail = new RefundDetail();
        refundDetail.f153id = this.f153id;
        refundDetail.totalRefundAmount = this.totalRefundAmount;
        return refundDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefundDetail)) {
            return false;
        }
        RefundDetail refundDetail = (RefundDetail) obj;
        return ValueObject.util_equals(this.f153id, refundDetail.f153id) && this.totalRefundAmount == refundDetail.totalRefundAmount;
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
        String str = this.f153id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.totalRefundAmount);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f153id == null) {
            this.f153id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
