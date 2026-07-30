package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.GPContract;
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
public class GPContractData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpcontractdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GPContract> contracts;
    public static ProtobufAdapter<GPContractData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPContractData>() { // from class: com.p1.mobile.putong.data.GPContractData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPContractData gPContractData) {
            List<GPContract> list = gPContractData.contracts;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, GPContract.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            gPContractData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPContractData parse(nc5 nc5Var) throws IOException {
            GPContractData gPContractData = new GPContractData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPContractData.contracts != null) {
                        break;
                    }
                    gPContractData.contracts = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (gPContractData.contracts != null) {
                        break;
                    }
                    gPContractData.contracts = new ArrayList();
                    return gPContractData;
                }
                gPContractData.contracts = (List) nc5Var.m162488l(GPContract.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPContractData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPContractData gPContractData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPContract> list = gPContractData.contracts;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, GPContract.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPContractData> JSON_ADAPTER = new ObjectJsonAdapter<GPContractData>() { // from class: com.p1.mobile.putong.data.GPContractData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPContractData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPContractData newInstance() {
            return new GPContractData();
        }

        public boolean parseField(GPContractData gPContractData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("contracts")) {
                return false;
            }
            gPContractData.contracts = JsonAdapter.parseArray(jsonParser, GPContract.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPContractData gPContractData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("contracts")) {
                return true;
            }
            return super.parseFieldCheck(gPContractData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPContractData gPContractData, JsonGenerator jsonGenerator) throws IOException {
            if (gPContractData.contracts != null) {
                jsonGenerator.writeFieldName("contracts");
                JsonAdapter.serializeArray(gPContractData.contracts, jsonGenerator, GPContract.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContractData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPContractData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPContractData new_() {
        GPContractData gPContractData = new GPContractData();
        gPContractData.nullCheck();
        return gPContractData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPContractData mo225055clone() {
        GPContractData gPContractData = new GPContractData();
        List<GPContract> list = this.contracts;
        if (list != null) {
            gPContractData.contracts = ValueObject.util_map(list, new qcj() { // from class: l.ogj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GPContract) obj).mo225055clone();
                }
            });
        }
        return gPContractData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GPContractData) {
            return ValueObject.util_equals(this.contracts, ((GPContractData) obj).contracts);
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
        List<GPContract> list = this.contracts;
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
