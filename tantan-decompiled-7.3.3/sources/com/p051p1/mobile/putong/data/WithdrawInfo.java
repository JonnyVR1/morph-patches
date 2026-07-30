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
public class WithdrawInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "withdrawinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public WithdrawInfoIncome income;
    public static ProtobufAdapter<WithdrawInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<WithdrawInfo>() { // from class: com.p1.mobile.putong.data.WithdrawInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WithdrawInfo withdrawInfo) {
            WithdrawInfoIncome withdrawInfoIncome = withdrawInfo.income;
            int iM17285l = withdrawInfoIncome != null ? CodedOutputByteBufferNano.m17285l(1, withdrawInfoIncome, WithdrawInfoIncome.PROTOBUF_ADAPTER) : 0;
            withdrawInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WithdrawInfo parse(nc5 nc5Var) throws IOException {
            WithdrawInfo withdrawInfo = new WithdrawInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (withdrawInfo.income != null) {
                        break;
                    }
                    withdrawInfo.income = WithdrawInfoIncome.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (withdrawInfo.income != null) {
                        break;
                    }
                    withdrawInfo.income = WithdrawInfoIncome.new_();
                    return withdrawInfo;
                }
                withdrawInfo.income = (WithdrawInfoIncome) nc5Var.m162488l(WithdrawInfoIncome.PROTOBUF_ADAPTER);
            }
            return withdrawInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WithdrawInfo withdrawInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            WithdrawInfoIncome withdrawInfoIncome = withdrawInfo.income;
            if (withdrawInfoIncome != null) {
                codedOutputByteBufferNano.m17309K(1, withdrawInfoIncome, WithdrawInfoIncome.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<WithdrawInfo> JSON_ADAPTER = new ObjectJsonAdapter<WithdrawInfo>() { // from class: com.p1.mobile.putong.data.WithdrawInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WithdrawInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WithdrawInfo newInstance() {
            return new WithdrawInfo();
        }

        public boolean parseField(WithdrawInfo withdrawInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("income")) {
                return false;
            }
            withdrawInfo.income = WithdrawInfoIncome.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(WithdrawInfo withdrawInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("income")) {
                return true;
            }
            return super.parseFieldCheck(withdrawInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WithdrawInfo withdrawInfo, JsonGenerator jsonGenerator) throws IOException {
            if (withdrawInfo.income != null) {
                jsonGenerator.writeFieldName("income");
                WithdrawInfoIncome.JSON_ADAPTER.serialize(withdrawInfo.income, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WithdrawInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WithdrawInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WithdrawInfo new_() {
        WithdrawInfo withdrawInfo = new WithdrawInfo();
        withdrawInfo.nullCheck();
        return withdrawInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WithdrawInfo mo225055clone() {
        WithdrawInfo withdrawInfo = new WithdrawInfo();
        WithdrawInfoIncome withdrawInfoIncome = this.income;
        if (withdrawInfoIncome != null) {
            withdrawInfo.income = withdrawInfoIncome.mo225055clone();
        }
        return withdrawInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WithdrawInfo) {
            return ValueObject.util_equals(this.income, ((WithdrawInfo) obj).income);
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
        WithdrawInfoIncome withdrawInfoIncome = this.income;
        int iHashCode = i2 + (withdrawInfoIncome != null ? withdrawInfoIncome.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.income == null) {
            this.income = WithdrawInfoIncome.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
