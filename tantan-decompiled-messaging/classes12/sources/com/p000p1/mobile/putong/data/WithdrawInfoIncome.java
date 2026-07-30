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
public class WithdrawInfoIncome extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "withdrawinfoincome";

    @ProtobufIndex(index = 1)
    public double available;

    @ProtobufIndex(index = 2)
    public double pending;
    public static ProtobufAdapter<WithdrawInfoIncome> PROTOBUF_ADAPTER = new MessageNanoAdapter<WithdrawInfoIncome>() { // from class: com.p1.mobile.putong.data.WithdrawInfoIncome.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WithdrawInfoIncome withdrawInfoIncome) {
            int iD = CodedOutputByteBufferNano.d(1, withdrawInfoIncome.available) + CodedOutputByteBufferNano.d(2, withdrawInfoIncome.pending);
            ((MessageNano) withdrawInfoIncome).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WithdrawInfoIncome m19386parse(nb5 nb5Var) throws IOException {
            WithdrawInfoIncome withdrawInfoIncome = new WithdrawInfoIncome();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 9) {
                    withdrawInfoIncome.available = nb5Var.h();
                } else {
                    if (iU != 17) {
                        return withdrawInfoIncome;
                    }
                    withdrawInfoIncome.pending = nb5Var.h();
                }
            }
        }

        public void serialize(WithdrawInfoIncome withdrawInfoIncome, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, withdrawInfoIncome.available);
            codedOutputByteBufferNano.C(2, withdrawInfoIncome.pending);
        }
    };
    public static JsonAdapter<WithdrawInfoIncome> JSON_ADAPTER = new ObjectJsonAdapter<WithdrawInfoIncome>() { // from class: com.p1.mobile.putong.data.WithdrawInfoIncome.2
        public Class getDataClass() {
            return WithdrawInfoIncome.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public WithdrawInfoIncome mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WithdrawInfoIncome withdrawInfoIncome, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("available", withdrawInfoIncome.available);
            jsonGenerator.writeNumberField("pending", withdrawInfoIncome.pending);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WithdrawInfoIncome) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WithdrawInfoIncome) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WithdrawInfoIncome new_() {
        WithdrawInfoIncome withdrawInfoIncome = new WithdrawInfoIncome();
        withdrawInfoIncome.nullCheck();
        return withdrawInfoIncome;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WithdrawInfoIncome m19385clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.available);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.pending);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
