package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.PrivilegeReward;
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
public class RewardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rewarddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<PrivilegeReward> items;
    public static ProtobufAdapter<RewardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RewardData>() { // from class: com.p1.mobile.putong.core.data.RewardData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RewardData rewardData) {
            List<PrivilegeReward> list = rewardData.items;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, PrivilegeReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            rewardData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RewardData parse(nb5 nb5Var) throws IOException {
            RewardData rewardData = new RewardData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (rewardData.items != null) {
                        break;
                    }
                    rewardData.items = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (rewardData.items != null) {
                        break;
                    }
                    rewardData.items = new ArrayList();
                    return rewardData;
                }
                rewardData.items = (List) nb5Var.m158743l(PrivilegeReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return rewardData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RewardData rewardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<PrivilegeReward> list = rewardData.items;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, PrivilegeReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RewardData> JSON_ADAPTER = new ObjectJsonAdapter<RewardData>() { // from class: com.p1.mobile.putong.core.data.RewardData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RewardData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RewardData newInstance() {
            return new RewardData();
        }

        public boolean parseField(RewardData rewardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(FirebaseAnalytics.Param.ITEMS)) {
                return false;
            }
            rewardData.items = JsonAdapter.parseArray(jsonParser, PrivilegeReward.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RewardData rewardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.ITEMS)) {
                return true;
            }
            return super.parseFieldCheck(rewardData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RewardData rewardData, JsonGenerator jsonGenerator) throws IOException {
            if (rewardData.items != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.ITEMS);
                JsonAdapter.serializeArray(rewardData.items, jsonGenerator, PrivilegeReward.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RewardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RewardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RewardData new_() {
        RewardData rewardData = new RewardData();
        rewardData.nullCheck();
        return rewardData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RewardData mo223809clone() {
        RewardData rewardData = new RewardData();
        List<PrivilegeReward> list = this.items;
        if (list != null) {
            rewardData.items = ValueObject.util_map(list, new w9j() { // from class: l.d0d0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PrivilegeReward) obj).mo223809clone();
                }
            });
        }
        return rewardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RewardData) {
            return ValueObject.util_equals(this.items, ((RewardData) obj).items);
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
        List<PrivilegeReward> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
