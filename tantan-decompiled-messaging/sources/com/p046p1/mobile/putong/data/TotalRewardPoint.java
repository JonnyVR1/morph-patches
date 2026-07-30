package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class TotalRewardPoint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "totalrewardpoint";

    @ProtobufIndex(index = 1)
    public double amount;
    public static ProtobufAdapter<TotalRewardPoint> PROTOBUF_ADAPTER = new MessageNanoAdapter<TotalRewardPoint>() { // from class: com.p1.mobile.putong.data.TotalRewardPoint.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TotalRewardPoint totalRewardPoint) {
            int iM17222d = CodedOutputByteBufferNano.m17222d(1, totalRewardPoint.amount);
            totalRewardPoint.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TotalRewardPoint parse(nb5 nb5Var) throws IOException {
            TotalRewardPoint totalRewardPoint = new TotalRewardPoint();
            while (nb5Var.m158752u() == 9) {
                totalRewardPoint.amount = nb5Var.m158739h();
            }
            return totalRewardPoint;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TotalRewardPoint totalRewardPoint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17246C(1, totalRewardPoint.amount);
        }
    };
    public static JsonAdapter<TotalRewardPoint> JSON_ADAPTER = new ObjectJsonAdapter<TotalRewardPoint>() { // from class: com.p1.mobile.putong.data.TotalRewardPoint.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TotalRewardPoint.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TotalRewardPoint newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TotalRewardPoint totalRewardPoint, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("amount", totalRewardPoint.amount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TotalRewardPoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TotalRewardPoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TotalRewardPoint new_() {
        TotalRewardPoint totalRewardPoint = new TotalRewardPoint();
        totalRewardPoint.nullCheck();
        return totalRewardPoint;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TotalRewardPoint mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
