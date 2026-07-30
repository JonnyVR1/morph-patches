package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Contract;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ContractData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contractdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Contract> contracts;
    public static ProtobufAdapter<ContractData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContractData>() { // from class: com.p1.mobile.putong.data.ContractData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ContractData contractData) {
            List<Contract> list = contractData.contracts;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Contract.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) contractData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ContractData m17857parse(nb5 nb5Var) throws IOException {
            ContractData contractData = new ContractData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (contractData.contracts != null) {
                        break;
                    }
                    contractData.contracts = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (contractData.contracts != null) {
                        break;
                    }
                    contractData.contracts = new ArrayList();
                    return contractData;
                }
                contractData.contracts = (List) nb5Var.l(Contract.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return contractData;
        }

        public void serialize(ContractData contractData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Contract> list = contractData.contracts;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Contract.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ContractData> JSON_ADAPTER = new ObjectJsonAdapter<ContractData>() { // from class: com.p1.mobile.putong.data.ContractData.2
        public Class getDataClass() {
            return ContractData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ContractData mo17830newInstance() {
            return new ContractData();
        }

        public boolean parseField(ContractData contractData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("contracts")) {
                return false;
            }
            contractData.contracts = JsonAdapter.parseArray(jsonParser, Contract.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ContractData contractData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("contracts")) {
                return true;
            }
            return super.parseFieldCheck(contractData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContractData contractData, JsonGenerator jsonGenerator) throws IOException {
            if (contractData.contracts != null) {
                jsonGenerator.writeFieldName("contracts");
                JsonAdapter.serializeArray(contractData.contracts, jsonGenerator, Contract.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContractData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContractData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContractData new_() {
        ContractData contractData = new ContractData();
        contractData.nullCheck();
        return contractData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ContractData m17856clone() {
        ContractData contractData = new ContractData();
        List<Contract> list = this.contracts;
        if (list != null) {
            contractData.contracts = ValueObject.util_map(list, new w9j() { // from class: l.s16
                public final Object call(Object obj) {
                    return ((Contract) obj).m17853clone();
                }
            });
        }
        return contractData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContractData) {
            return ValueObject.util_equals(this.contracts, ((ContractData) obj).contracts);
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
        List<Contract> list = this.contracts;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.contracts == null) {
            this.contracts = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
