package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.GPContract;
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
public class GPContractData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpcontractdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GPContract> contracts;
    public static ProtobufAdapter<GPContractData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPContractData>() { // from class: com.p1.mobile.putong.data.GPContractData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPContractData gPContractData) {
            List<GPContract> list = gPContractData.contracts;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, GPContract.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) gPContractData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPContractData m18139parse(nb5 nb5Var) throws IOException {
            GPContractData gPContractData = new GPContractData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPContractData.contracts != null) {
                        break;
                    }
                    gPContractData.contracts = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (gPContractData.contracts != null) {
                        break;
                    }
                    gPContractData.contracts = new ArrayList();
                    return gPContractData;
                }
                gPContractData.contracts = (List) nb5Var.l(GPContract.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPContractData;
        }

        public void serialize(GPContractData gPContractData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPContract> list = gPContractData.contracts;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, GPContract.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPContractData> JSON_ADAPTER = new ObjectJsonAdapter<GPContractData>() { // from class: com.p1.mobile.putong.data.GPContractData.2
        public Class getDataClass() {
            return GPContractData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GPContractData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPContractData gPContractData, JsonGenerator jsonGenerator) throws IOException {
            if (gPContractData.contracts != null) {
                jsonGenerator.writeFieldName("contracts");
                JsonAdapter.serializeArray(gPContractData.contracts, jsonGenerator, GPContract.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContractData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPContractData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPContractData new_() {
        GPContractData gPContractData = new GPContractData();
        gPContractData.nullCheck();
        return gPContractData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPContractData m18138clone() {
        GPContractData gPContractData = new GPContractData();
        List<GPContract> list = this.contracts;
        if (list != null) {
            gPContractData.contracts = ValueObject.util_map(list, new w9j() { // from class: l.udj
                public final Object call(Object obj) {
                    return ((GPContract) obj).m18132clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<GPContract> list = this.contracts;
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
