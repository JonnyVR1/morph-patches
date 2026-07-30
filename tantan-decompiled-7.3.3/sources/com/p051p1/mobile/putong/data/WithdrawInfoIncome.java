package com.p051p1.mobile.putong.data;

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
public class WithdrawInfoIncome extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "withdrawinfoincome";

    @ProtobufIndex(index = 1)
    public double available;

    @ProtobufIndex(index = 2)
    public double pending;
    public static ProtobufAdapter<WithdrawInfoIncome> PROTOBUF_ADAPTER = new MessageNanoAdapter<WithdrawInfoIncome>() { // from class: com.p1.mobile.putong.data.WithdrawInfoIncome.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WithdrawInfoIncome withdrawInfoIncome) {
            int iM17277d = CodedOutputByteBufferNano.m17277d(1, withdrawInfoIncome.available) + CodedOutputByteBufferNano.m17277d(2, withdrawInfoIncome.pending);
            withdrawInfoIncome.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WithdrawInfoIncome parse(nc5 nc5Var) throws IOException {
            WithdrawInfoIncome withdrawInfoIncome = new WithdrawInfoIncome();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 9) {
                    withdrawInfoIncome.available = nc5Var.m162484h();
                } else {
                    if (iM162497u != 17) {
                        return withdrawInfoIncome;
                    }
                    withdrawInfoIncome.pending = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WithdrawInfoIncome withdrawInfoIncome, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17301C(1, withdrawInfoIncome.available);
            codedOutputByteBufferNano.m17301C(2, withdrawInfoIncome.pending);
        }
    };
    public static JsonAdapter<WithdrawInfoIncome> JSON_ADAPTER = new ObjectJsonAdapter<WithdrawInfoIncome>() { // from class: com.p1.mobile.putong.data.WithdrawInfoIncome.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WithdrawInfoIncome.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WithdrawInfoIncome newInstance() {
            return new WithdrawInfoIncome();
        }

        public boolean parseField(WithdrawInfoIncome withdrawInfoIncome, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("available")) {
                withdrawInfoIncome.available = jsonParser.getValueAsDouble();
                return true;
            }
            if (!str.equals("pending")) {
                return false;
            }
            withdrawInfoIncome.pending = jsonParser.getValueAsDouble();
            return true;
        }

        public boolean parseFieldCheck(WithdrawInfoIncome withdrawInfoIncome, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("available") || str.equals("pending")) {
                return true;
            }
            return super.parseFieldCheck(withdrawInfoIncome, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WithdrawInfoIncome withdrawInfoIncome, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("available", withdrawInfoIncome.available);
            jsonGenerator.writeNumberField("pending", withdrawInfoIncome.pending);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WithdrawInfoIncome) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WithdrawInfoIncome) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WithdrawInfoIncome new_() {
        WithdrawInfoIncome withdrawInfoIncome = new WithdrawInfoIncome();
        withdrawInfoIncome.nullCheck();
        return withdrawInfoIncome;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WithdrawInfoIncome mo225055clone() {
        WithdrawInfoIncome withdrawInfoIncome = new WithdrawInfoIncome();
        withdrawInfoIncome.available = this.available;
        withdrawInfoIncome.pending = this.pending;
        return withdrawInfoIncome;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WithdrawInfoIncome)) {
            return false;
        }
        WithdrawInfoIncome withdrawInfoIncome = (WithdrawInfoIncome) obj;
        return this.available == withdrawInfoIncome.available && this.pending == withdrawInfoIncome.pending;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.available);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.pending);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
