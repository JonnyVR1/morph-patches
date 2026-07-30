package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class ContractEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contractenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public ContractData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<ContractEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContractEnvelope>() { // from class: com.p1.mobile.putong.data.ContractEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContractEnvelope contractEnvelope) {
            Meta meta = contractEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            ContractData contractData = contractEnvelope.data;
            if (contractData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, contractData, ContractData.PROTOBUF_ADAPTER);
            }
            contractEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContractEnvelope parse(nb5 nb5Var) throws IOException {
            ContractEnvelope contractEnvelope = new ContractEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (contractEnvelope.meta == null) {
                        contractEnvelope.meta = Meta.new_();
                    }
                    if (contractEnvelope.data != null) {
                        break;
                    }
                    contractEnvelope.data = ContractData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    contractEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (contractEnvelope.meta == null) {
                            contractEnvelope.meta = Meta.new_();
                        }
                        if (contractEnvelope.data != null) {
                            break;
                        }
                        contractEnvelope.data = ContractData.new_();
                        return contractEnvelope;
                    }
                    contractEnvelope.data = (ContractData) nb5Var.m158743l(ContractData.PROTOBUF_ADAPTER);
                }
            }
            return contractEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContractEnvelope contractEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = contractEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            ContractData contractData = contractEnvelope.data;
            if (contractData != null) {
                codedOutputByteBufferNano.m17254K(2, contractData, ContractData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ContractEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<ContractEnvelope>() { // from class: com.p1.mobile.putong.data.ContractEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContractEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContractEnvelope newInstance() {
            return new ContractEnvelope();
        }

        public boolean parseField(ContractEnvelope contractEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                contractEnvelope.data = ContractData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            contractEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ContractEnvelope contractEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(contractEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContractEnvelope contractEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (contractEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(contractEnvelope.meta, jsonGenerator, true);
            }
            if (contractEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                ContractData.JSON_ADAPTER.serialize(contractEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContractEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContractEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContractEnvelope new_() {
        ContractEnvelope contractEnvelope = new ContractEnvelope();
        contractEnvelope.nullCheck();
        return contractEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContractEnvelope mo223809clone() {
        ContractEnvelope contractEnvelope = new ContractEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            contractEnvelope.meta = meta.mo223809clone();
        }
        ContractData contractData = this.data;
        if (contractData != null) {
            contractEnvelope.data = contractData.mo223809clone();
        }
        return contractEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContractEnvelope)) {
            return false;
        }
        ContractEnvelope contractEnvelope = (ContractEnvelope) obj;
        return ValueObject.util_equals(this.meta, contractEnvelope.meta) && ValueObject.util_equals(this.data, contractEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        ContractData contractData = this.data;
        int iHashCode2 = iHashCode + (contractData != null ? contractData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = ContractData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
