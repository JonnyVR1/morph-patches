package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class RefundDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "refunddetail";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21233id;

    @ProtobufIndex(index = 2)
    public double totalRefundAmount;
    public static ProtobufAdapter<RefundDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<RefundDetail>() { // from class: com.p1.mobile.putong.core.data.RefundDetail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RefundDetail refundDetail) {
            String str = refundDetail.f21233id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17277d(2, refundDetail.totalRefundAmount);
            refundDetail.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RefundDetail parse(nc5 nc5Var) throws IOException {
            RefundDetail refundDetail = new RefundDetail();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (refundDetail.f21233id != null) {
                        break;
                    }
                    refundDetail.f21233id = "";
                    break;
                }
                if (iM162497u == 10) {
                    refundDetail.f21233id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 17) {
                        if (refundDetail.f21233id != null) {
                            break;
                        }
                        refundDetail.f21233id = "";
                        return refundDetail;
                    }
                    refundDetail.totalRefundAmount = nc5Var.m162484h();
                }
            }
            return refundDetail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RefundDetail refundDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = refundDetail.f21233id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17301C(2, refundDetail.totalRefundAmount);
        }
    };
    public static JsonAdapter<RefundDetail> JSON_ADAPTER = new ObjectJsonAdapter<RefundDetail>() { // from class: com.p1.mobile.putong.core.data.RefundDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RefundDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RefundDetail newInstance() {
            return new RefundDetail();
        }

        public boolean parseField(RefundDetail refundDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                refundDetail.f21233id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RefundDetail refundDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = refundDetail.f21233id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("totalRefundAmount", refundDetail.totalRefundAmount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RefundDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RefundDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RefundDetail new_() {
        RefundDetail refundDetail = new RefundDetail();
        refundDetail.nullCheck();
        return refundDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RefundDetail mo225055clone() {
        RefundDetail refundDetail = new RefundDetail();
        refundDetail.f21233id = this.f21233id;
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
        return ValueObject.util_equals(this.f21233id, refundDetail.f21233id) && this.totalRefundAmount == refundDetail.totalRefundAmount;
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
        String str = this.f21233id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.totalRefundAmount);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21233id == null) {
            this.f21233id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
