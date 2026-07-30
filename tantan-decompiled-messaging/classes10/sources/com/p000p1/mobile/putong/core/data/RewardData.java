package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.PrivilegeReward;
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
public class RewardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rewarddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<PrivilegeReward> items;
    public static ProtobufAdapter<RewardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RewardData>() { // from class: com.p1.mobile.putong.core.data.RewardData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RewardData rewardData) {
            List<PrivilegeReward> list = rewardData.items;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, PrivilegeReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) rewardData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RewardData m15435parse(nb5 nb5Var) throws IOException {
            RewardData rewardData = new RewardData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (rewardData.items != null) {
                        break;
                    }
                    rewardData.items = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (rewardData.items != null) {
                        break;
                    }
                    rewardData.items = new ArrayList();
                    return rewardData;
                }
                rewardData.items = (List) nb5Var.l(PrivilegeReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return rewardData;
        }

        public void serialize(RewardData rewardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<PrivilegeReward> list = rewardData.items;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, PrivilegeReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RewardData> JSON_ADAPTER = new ObjectJsonAdapter<RewardData>() { // from class: com.p1.mobile.putong.core.data.RewardData.2
        public Class getDataClass() {
            return RewardData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RewardData m15436newInstance() {
            return new RewardData();
        }

        public boolean parseField(RewardData rewardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("items")) {
                return false;
            }
            rewardData.items = JsonAdapter.parseArray(jsonParser, PrivilegeReward.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RewardData rewardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("items")) {
                return true;
            }
            return super.parseFieldCheck(rewardData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RewardData rewardData, JsonGenerator jsonGenerator) throws IOException {
            if (rewardData.items != null) {
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(rewardData.items, jsonGenerator, PrivilegeReward.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RewardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RewardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RewardData new_() {
        RewardData rewardData = new RewardData();
        rewardData.nullCheck();
        return rewardData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RewardData m15434clone() {
        RewardData rewardData = new RewardData();
        List<PrivilegeReward> list = this.items;
        if (list != null) {
            rewardData.items = ValueObject.util_map(list, new w9j() { // from class: l.d0d0
                public final Object call(Object obj) {
                    return ((PrivilegeReward) obj).m14888clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<PrivilegeReward> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
