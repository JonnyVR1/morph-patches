package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Contract;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class ContractData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contractdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Contract> contracts;
    public static ProtobufAdapter<ContractData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContractData>() { // from class: com.p1.mobile.putong.data.ContractData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContractData contractData) {
            List<Contract> list = contractData.contracts;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Contract.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            contractData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContractData parse(nb5 nb5Var) throws IOException {
            ContractData contractData = new ContractData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (contractData.contracts != null) {
                        break;
                    }
                    contractData.contracts = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (contractData.contracts != null) {
                        break;
                    }
                    contractData.contracts = new ArrayList();
                    return contractData;
                }
                contractData.contracts = (List) nb5Var.m158743l(Contract.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return contractData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContractData contractData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Contract> list = contractData.contracts;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Contract.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ContractData> JSON_ADAPTER = new ObjectJsonAdapter<ContractData>() { // from class: com.p1.mobile.putong.data.ContractData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContractData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContractData newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContractData contractData, JsonGenerator jsonGenerator) throws IOException {
            if (contractData.contracts != null) {
                jsonGenerator.writeFieldName("contracts");
                JsonAdapter.serializeArray(contractData.contracts, jsonGenerator, Contract.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContractData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContractData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContractData new_() {
        ContractData contractData = new ContractData();
        contractData.nullCheck();
        return contractData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContractData mo223809clone() {
        ContractData contractData = new ContractData();
        List<Contract> list = this.contracts;
        if (list != null) {
            contractData.contracts = ValueObject.util_map(list, new w9j() { // from class: l.s16
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Contract) obj).mo223809clone();
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
        List<Contract> list = this.contracts;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.contracts == null) {
            this.contracts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
