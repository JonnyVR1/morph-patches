package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class IntlContractdData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcontractddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public IntlContractInfo contract;
    public static ProtobufAdapter<IntlContractdData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlContractdData>() { // from class: com.p1.mobile.putong.core.data.IntlContractdData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlContractdData intlContractdData) {
            IntlContractInfo intlContractInfo = intlContractdData.contract;
            int iM17230l = intlContractInfo != null ? CodedOutputByteBufferNano.m17230l(1, intlContractInfo, IntlContractInfo.PROTOBUF_ADAPTER) : 0;
            intlContractdData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlContractdData parse(nb5 nb5Var) throws IOException {
            IntlContractdData intlContractdData = new IntlContractdData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlContractdData.contract != null) {
                        break;
                    }
                    intlContractdData.contract = IntlContractInfo.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (intlContractdData.contract != null) {
                        break;
                    }
                    intlContractdData.contract = IntlContractInfo.new_();
                    return intlContractdData;
                }
                intlContractdData.contract = (IntlContractInfo) nb5Var.m158743l(IntlContractInfo.PROTOBUF_ADAPTER);
            }
            return intlContractdData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlContractdData intlContractdData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlContractInfo intlContractInfo = intlContractdData.contract;
            if (intlContractInfo != null) {
                codedOutputByteBufferNano.m17254K(1, intlContractInfo, IntlContractInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlContractdData> JSON_ADAPTER = new ObjectJsonAdapter<IntlContractdData>() { // from class: com.p1.mobile.putong.core.data.IntlContractdData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlContractdData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlContractdData newInstance() {
            return new IntlContractdData();
        }

        public boolean parseField(IntlContractdData intlContractdData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("contract")) {
                return false;
            }
            intlContractdData.contract = IntlContractInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlContractdData intlContractdData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("contract")) {
                return true;
            }
            return super.parseFieldCheck(intlContractdData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlContractdData intlContractdData, JsonGenerator jsonGenerator) throws IOException {
            if (intlContractdData.contract != null) {
                jsonGenerator.writeFieldName("contract");
                IntlContractInfo.JSON_ADAPTER.serialize(intlContractdData.contract, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlContractdData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlContractdData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlContractdData new_() {
        IntlContractdData intlContractdData = new IntlContractdData();
        intlContractdData.nullCheck();
        return intlContractdData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlContractdData mo223809clone() {
        IntlContractdData intlContractdData = new IntlContractdData();
        IntlContractInfo intlContractInfo = this.contract;
        if (intlContractInfo != null) {
            intlContractdData.contract = intlContractInfo.mo223809clone();
        }
        return intlContractdData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntlContractdData) {
            return ValueObject.util_equals(this.contract, ((IntlContractdData) obj).contract);
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
        IntlContractInfo intlContractInfo = this.contract;
        int iHashCode = i2 + (intlContractInfo != null ? intlContractInfo.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.contract == null) {
            this.contract = IntlContractInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
