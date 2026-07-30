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
public class IntlContractdData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcontractddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public IntlContractInfo contract;
    public static ProtobufAdapter<IntlContractdData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlContractdData>() { // from class: com.p1.mobile.putong.core.data.IntlContractdData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlContractdData intlContractdData) {
            IntlContractInfo intlContractInfo = intlContractdData.contract;
            int iL = intlContractInfo != null ? CodedOutputByteBufferNano.l(1, intlContractInfo, IntlContractInfo.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) intlContractdData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlContractdData m13543parse(nb5 nb5Var) throws IOException {
            IntlContractdData intlContractdData = new IntlContractdData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlContractdData.contract != null) {
                        break;
                    }
                    intlContractdData.contract = IntlContractInfo.new_();
                    break;
                }
                if (iU != 10) {
                    if (intlContractdData.contract != null) {
                        break;
                    }
                    intlContractdData.contract = IntlContractInfo.new_();
                    return intlContractdData;
                }
                intlContractdData.contract = (IntlContractInfo) nb5Var.l(IntlContractInfo.PROTOBUF_ADAPTER);
            }
            return intlContractdData;
        }

        public void serialize(IntlContractdData intlContractdData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlContractInfo intlContractInfo = intlContractdData.contract;
            if (intlContractInfo != null) {
                codedOutputByteBufferNano.K(1, intlContractInfo, IntlContractInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlContractdData> JSON_ADAPTER = new ObjectJsonAdapter<IntlContractdData>() { // from class: com.p1.mobile.putong.core.data.IntlContractdData.2
        public Class getDataClass() {
            return IntlContractdData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlContractdData m13544newInstance() {
            return new IntlContractdData();
        }

        public boolean parseField(IntlContractdData intlContractdData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(IntlPayQueryType.contract)) {
                return false;
            }
            intlContractdData.contract = (IntlContractInfo) IntlContractInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlContractdData intlContractdData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(IntlPayQueryType.contract)) {
                return true;
            }
            return super.parseFieldCheck(intlContractdData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlContractdData intlContractdData, JsonGenerator jsonGenerator) throws IOException {
            if (intlContractdData.contract != null) {
                jsonGenerator.writeFieldName(IntlPayQueryType.contract);
                IntlContractInfo.JSON_ADAPTER.serialize(intlContractdData.contract, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlContractdData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlContractdData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlContractdData new_() {
        IntlContractdData intlContractdData = new IntlContractdData();
        intlContractdData.nullCheck();
        return intlContractdData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlContractdData m13542clone() {
        IntlContractdData intlContractdData = new IntlContractdData();
        IntlContractInfo intlContractInfo = this.contract;
        if (intlContractInfo != null) {
            intlContractdData.contract = intlContractInfo.m13534clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        IntlContractInfo intlContractInfo = this.contract;
        int iHashCode = i2 + (intlContractInfo != null ? intlContractInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.contract == null) {
            this.contract = IntlContractInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
