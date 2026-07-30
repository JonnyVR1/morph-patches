package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceUserHeartbeatRewardList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserHeartbeatRewardList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserHeartbeatRewardList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserHeartbeatRewardList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserHeartbeatRewardList.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserHeartbeatRewardList newInstance() {
            return new BLiveVoiceUserHeartbeatRewardList();
        }

        public boolean parseField(BLiveVoiceUserHeartbeatRewardList bLiveVoiceUserHeartbeatRewardList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("heartbeatRewardPointsTotal")) {
                bLiveVoiceUserHeartbeatRewardList.heartbeatRewardPointsTotal = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("userRecordList")) {
                return false;
            }
            bLiveVoiceUserHeartbeatRewardList.userRecordList = JsonAdapter.parseArray(jsonParser, BLiveVoiceUserRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserHeartbeatRewardList bLiveVoiceUserHeartbeatRewardList, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceUserHeartbeatRewardList.heartbeatRewardPointsTotal;
            if (str != null) {
                jsonGenerator.writeStringField("heartbeatRewardPointsTotal", str);
            }
            if (bLiveVoiceUserHeartbeatRewardList.userRecordList != null) {
                jsonGenerator.writeFieldName("userRecordList");
                JsonAdapter.serializeArray(bLiveVoiceUserHeartbeatRewardList.userRecordList, jsonGenerator, BLiveVoiceUserRecord.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserHeartbeatRewardList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceuserheartbeatrewardlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public String heartbeatRewardPointsTotal;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveVoiceUserRecord> userRecordList;

    public static BLiveVoiceUserHeartbeatRewardList new_() {
        BLiveVoiceUserHeartbeatRewardList bLiveVoiceUserHeartbeatRewardList = new BLiveVoiceUserHeartbeatRewardList();
        bLiveVoiceUserHeartbeatRewardList.nullCheck();
        return bLiveVoiceUserHeartbeatRewardList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserHeartbeatRewardList mo223809clone() {
        BLiveVoiceUserHeartbeatRewardList bLiveVoiceUserHeartbeatRewardList = new BLiveVoiceUserHeartbeatRewardList();
        bLiveVoiceUserHeartbeatRewardList.heartbeatRewardPointsTotal = this.heartbeatRewardPointsTotal;
        List<BLiveVoiceUserRecord> list = this.userRecordList;
        if (list != null) {
            bLiveVoiceUserHeartbeatRewardList.userRecordList = ValueObject.util_map(list, new w9j() { // from class: l.y92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceUserRecord) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceUserHeartbeatRewardList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserHeartbeatRewardList)) {
            return false;
        }
        BLiveVoiceUserHeartbeatRewardList bLiveVoiceUserHeartbeatRewardList = (BLiveVoiceUserHeartbeatRewardList) obj;
        return ValueObject.util_equals(this.heartbeatRewardPointsTotal, bLiveVoiceUserHeartbeatRewardList.heartbeatRewardPointsTotal) && ValueObject.util_equals(this.userRecordList, bLiveVoiceUserHeartbeatRewardList.userRecordList);
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
        String str = this.heartbeatRewardPointsTotal;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveVoiceUserRecord> list = this.userRecordList;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.heartbeatRewardPointsTotal == null) {
            this.heartbeatRewardPointsTotal = "";
        }
        if (this.userRecordList == null) {
            this.userRecordList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
