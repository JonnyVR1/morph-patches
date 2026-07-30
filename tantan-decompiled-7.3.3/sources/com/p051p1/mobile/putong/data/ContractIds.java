package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.ContractIds;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class ContractIds extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contractids";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> ids;
    public static ProtobufAdapter<ContractIds> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContractIds>() { // from class: com.p1.mobile.putong.data.ContractIds.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContractIds contractIds) {
            List<String> list = contractIds.ids;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            contractIds.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContractIds parse(nc5 nc5Var) throws IOException {
            ContractIds contractIds = new ContractIds();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (contractIds.ids != null) {
                        break;
                    }
                    contractIds.ids = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (contractIds.ids != null) {
                        break;
                    }
                    contractIds.ids = new ArrayList();
                    return contractIds;
                }
                contractIds.ids = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return contractIds;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContractIds contractIds, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = contractIds.ids;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ContractIds> JSON_ADAPTER = new ObjectJsonAdapter<ContractIds>() { // from class: com.p1.mobile.putong.data.ContractIds.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContractIds.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContractIds newInstance() {
            return new ContractIds();
        }

        public boolean parseField(ContractIds contractIds, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("ids")) {
                return false;
            }
            contractIds.ids = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ContractIds contractIds, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ids")) {
                return true;
            }
            return super.parseFieldCheck(contractIds, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContractIds contractIds, JsonGenerator jsonGenerator) throws IOException {
            if (contractIds.ids != null) {
                jsonGenerator.writeFieldName("ids");
                JsonAdapter.serializeArray(contractIds.ids, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContractIds) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContractIds) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60907a(String str) {
        return str;
    }

    public static ContractIds new_() {
        ContractIds contractIds = new ContractIds();
        contractIds.nullCheck();
        return contractIds;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContractIds mo225055clone() {
        ContractIds contractIds = new ContractIds();
        List<String> list = this.ids;
        if (list != null) {
            contractIds.ids = ValueObject.util_map(list, new qcj() { // from class: l.y26
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ContractIds.m60907a((String) obj);
                }
            });
        }
        return contractIds;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContractIds) {
            return ValueObject.util_equals(this.ids, ((ContractIds) obj).ids);
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
        List<String> list = this.ids;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ids == null) {
            this.ids = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
