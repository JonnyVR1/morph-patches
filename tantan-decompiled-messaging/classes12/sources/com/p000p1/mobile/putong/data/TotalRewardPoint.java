package com.p000p1.mobile.putong.data;

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
public class TotalRewardPoint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "totalrewardpoint";

    @ProtobufIndex(index = 1)
    public double amount;
    public static ProtobufAdapter<TotalRewardPoint> PROTOBUF_ADAPTER = new MessageNanoAdapter<TotalRewardPoint>() { // from class: com.p1.mobile.putong.data.TotalRewardPoint.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TotalRewardPoint totalRewardPoint) {
            int iD = CodedOutputByteBufferNano.d(1, totalRewardPoint.amount);
            ((MessageNano) totalRewardPoint).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TotalRewardPoint m19112parse(nb5 nb5Var) throws IOException {
            TotalRewardPoint totalRewardPoint = new TotalRewardPoint();
            while (nb5Var.u() == 9) {
                totalRewardPoint.amount = nb5Var.h();
            }
            return totalRewardPoint;
        }

        public void serialize(TotalRewardPoint totalRewardPoint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, totalRewardPoint.amount);
        }
    };
    public static JsonAdapter<TotalRewardPoint> JSON_ADAPTER = new ObjectJsonAdapter<TotalRewardPoint>() { // from class: com.p1.mobile.putong.data.TotalRewardPoint.2
        public Class getDataClass() {
            return TotalRewardPoint.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TotalRewardPoint mo17830newInstance() {
            return new TotalRewardPoint();
        }

        public boolean parseField(TotalRewardPoint totalRewardPoint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("amount")) {
                return false;
            }
            totalRewardPoint.amount = jsonParser.getValueAsDouble();
            return true;
        }

        public boolean parseFieldCheck(TotalRewardPoint totalRewardPoint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("amount")) {
                return true;
            }
            return super.parseFieldCheck(totalRewardPoint, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TotalRewardPoint totalRewardPoint, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("amount", totalRewardPoint.amount);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TotalRewardPoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TotalRewardPoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TotalRewardPoint new_() {
        TotalRewardPoint totalRewardPoint = new TotalRewardPoint();
        totalRewardPoint.nullCheck();
        return totalRewardPoint;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TotalRewardPoint m19111clone() {
        TotalRewardPoint totalRewardPoint = new TotalRewardPoint();
        totalRewardPoint.amount = this.amount;
        return totalRewardPoint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TotalRewardPoint) && this.amount == ((TotalRewardPoint) obj).amount;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
