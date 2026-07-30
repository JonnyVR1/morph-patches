package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.RecentContractInfo;
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

/* JADX INFO: loaded from: classes10.dex */
public class RecentContractInfosData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentcontractinfosdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<RecentContractInfo> contracts;
    public static ProtobufAdapter<RecentContractInfosData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentContractInfosData>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfosData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecentContractInfosData recentContractInfosData) {
            List<RecentContractInfo> list = recentContractInfosData.contracts;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, RecentContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            recentContractInfosData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecentContractInfosData parse(nb5 nb5Var) throws IOException {
            RecentContractInfosData recentContractInfosData = new RecentContractInfosData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (recentContractInfosData.contracts != null) {
                        break;
                    }
                    recentContractInfosData.contracts = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (recentContractInfosData.contracts != null) {
                        break;
                    }
                    recentContractInfosData.contracts = new ArrayList();
                    return recentContractInfosData;
                }
                recentContractInfosData.contracts = (List) nb5Var.m158743l(RecentContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return recentContractInfosData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecentContractInfosData recentContractInfosData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<RecentContractInfo> list = recentContractInfosData.contracts;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, RecentContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecentContractInfosData> JSON_ADAPTER = new ObjectJsonAdapter<RecentContractInfosData>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfosData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecentContractInfosData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecentContractInfosData newInstance() {
            return new RecentContractInfosData();
        }

        public boolean parseField(RecentContractInfosData recentContractInfosData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("contracts")) {
                return false;
            }
            recentContractInfosData.contracts = JsonAdapter.parseArray(jsonParser, RecentContractInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RecentContractInfosData recentContractInfosData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("contracts")) {
                return true;
            }
            return super.parseFieldCheck(recentContractInfosData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecentContractInfosData recentContractInfosData, JsonGenerator jsonGenerator) throws IOException {
            if (recentContractInfosData.contracts != null) {
                jsonGenerator.writeFieldName("contracts");
                JsonAdapter.serializeArray(recentContractInfosData.contracts, jsonGenerator, RecentContractInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentContractInfosData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentContractInfosData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecentContractInfosData new_() {
        RecentContractInfosData recentContractInfosData = new RecentContractInfosData();
        recentContractInfosData.nullCheck();
        return recentContractInfosData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecentContractInfosData mo223809clone() {
        RecentContractInfosData recentContractInfosData = new RecentContractInfosData();
        List<RecentContractInfo> list = this.contracts;
        if (list != null) {
            recentContractInfosData.contracts = ValueObject.util_map(list, new w9j() { // from class: l.vgc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RecentContractInfo) obj).mo223809clone();
                }
            });
        }
        return recentContractInfosData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecentContractInfosData) {
            return ValueObject.util_equals(this.contracts, ((RecentContractInfosData) obj).contracts);
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
        List<RecentContractInfo> list = this.contracts;
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
