package com.p046p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveReward extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveReward> JSON_ADAPTER = new ObjectJsonAdapter<BLiveReward>() { // from class: com.p1.mobile.putong.live.base.data.BLiveReward.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveReward.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveReward newInstance() {
            return new BLiveReward();
        }

        public boolean parseField(BLiveReward bLiveReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("recentRewardPoint")) {
                return false;
            }
            bLiveReward.recentRewardPoint = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveReward bLiveReward, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("recentRewardPoint", bLiveReward.recentRewardPoint);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivereward";

    @ProtobufIndex(index = 1)
    public long recentRewardPoint;

    public static BLiveReward new_() {
        BLiveReward bLiveReward = new BLiveReward();
        bLiveReward.nullCheck();
        return bLiveReward;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveReward mo223809clone() {
        BLiveReward bLiveReward = new BLiveReward();
        bLiveReward.recentRewardPoint = this.recentRewardPoint;
        return bLiveReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveReward) && this.recentRewardPoint == ((BLiveReward) obj).recentRewardPoint;
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
        long j = this.recentRewardPoint;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
