package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.RecentContractInfo;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class RecentContractInfosData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentcontractinfosdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<RecentContractInfo> contracts;
    public static ProtobufAdapter<RecentContractInfosData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentContractInfosData>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfosData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecentContractInfosData recentContractInfosData) {
            List<RecentContractInfo> list = recentContractInfosData.contracts;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, RecentContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) recentContractInfosData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecentContractInfosData m15305parse(nb5 nb5Var) throws IOException {
            RecentContractInfosData recentContractInfosData = new RecentContractInfosData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recentContractInfosData.contracts != null) {
                        break;
                    }
                    recentContractInfosData.contracts = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (recentContractInfosData.contracts != null) {
                        break;
                    }
                    recentContractInfosData.contracts = new ArrayList();
                    return recentContractInfosData;
                }
                recentContractInfosData.contracts = (List) nb5Var.l(RecentContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return recentContractInfosData;
        }

        public void serialize(RecentContractInfosData recentContractInfosData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<RecentContractInfo> list = recentContractInfosData.contracts;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, RecentContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecentContractInfosData> JSON_ADAPTER = new ObjectJsonAdapter<RecentContractInfosData>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfosData.2
        public Class getDataClass() {
            return RecentContractInfosData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecentContractInfosData m15306newInstance() {
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

        public void serializeFields(RecentContractInfosData recentContractInfosData, JsonGenerator jsonGenerator) throws IOException {
            if (recentContractInfosData.contracts != null) {
                jsonGenerator.writeFieldName("contracts");
                JsonAdapter.serializeArray(recentContractInfosData.contracts, jsonGenerator, RecentContractInfo.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentContractInfosData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentContractInfosData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecentContractInfosData new_() {
        RecentContractInfosData recentContractInfosData = new RecentContractInfosData();
        recentContractInfosData.nullCheck();
        return recentContractInfosData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecentContractInfosData m15304clone() {
        RecentContractInfosData recentContractInfosData = new RecentContractInfosData();
        List<RecentContractInfo> list = this.contracts;
        if (list != null) {
            recentContractInfosData.contracts = ValueObject.util_map(list, new w9j() { // from class: l.vgc0
                public final Object call(Object obj) {
                    return ((RecentContractInfo) obj).m15300clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<RecentContractInfo> list = this.contracts;
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
