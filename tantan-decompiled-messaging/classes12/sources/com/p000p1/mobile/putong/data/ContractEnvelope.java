package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ContractEnvelope contractEnvelope) {
            Meta meta = contractEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            ContractData contractData = contractEnvelope.data;
            if (contractData != null) {
                iL += CodedOutputByteBufferNano.l(2, contractData, ContractData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) contractEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ContractEnvelope m17860parse(nb5 nb5Var) throws IOException {
            ContractEnvelope contractEnvelope = new ContractEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (contractEnvelope.meta == null) {
                        contractEnvelope.meta = Meta.new_();
                    }
                    if (contractEnvelope.data != null) {
                        break;
                    }
                    contractEnvelope.data = ContractData.new_();
                    break;
                }
                if (iU == 10) {
                    contractEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (contractEnvelope.meta == null) {
                            contractEnvelope.meta = Meta.new_();
                        }
                        if (contractEnvelope.data != null) {
                            break;
                        }
                        contractEnvelope.data = ContractData.new_();
                        return contractEnvelope;
                    }
                    contractEnvelope.data = (ContractData) nb5Var.l(ContractData.PROTOBUF_ADAPTER);
                }
            }
            return contractEnvelope;
        }

        public void serialize(ContractEnvelope contractEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = contractEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            ContractData contractData = contractEnvelope.data;
            if (contractData != null) {
                codedOutputByteBufferNano.K(2, contractData, ContractData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ContractEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<ContractEnvelope>() { // from class: com.p1.mobile.putong.data.ContractEnvelope.2
        public Class getDataClass() {
            return ContractEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ContractEnvelope mo17830newInstance() {
            return new ContractEnvelope();
        }

        public boolean parseField(ContractEnvelope contractEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                contractEnvelope.data = (ContractData) ContractData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            contractEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ContractEnvelope contractEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(contractEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContractEnvelope contractEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (contractEnvelope.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(contractEnvelope.meta, jsonGenerator, true);
            }
            if (contractEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                ContractData.JSON_ADAPTER.serialize(contractEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContractEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContractEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContractEnvelope new_() {
        ContractEnvelope contractEnvelope = new ContractEnvelope();
        contractEnvelope.nullCheck();
        return contractEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ContractEnvelope m17859clone() {
        ContractEnvelope contractEnvelope = new ContractEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            contractEnvelope.meta = meta.m18461clone();
        }
        ContractData contractData = this.data;
        if (contractData != null) {
            contractEnvelope.data = contractData.m17856clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        ContractData contractData = this.data;
        int iHashCode2 = iHashCode + (contractData != null ? contractData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = ContractData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
