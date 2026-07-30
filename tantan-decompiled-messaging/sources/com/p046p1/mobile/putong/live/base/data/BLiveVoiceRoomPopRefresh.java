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
public class BLiveVoiceRoomPopRefresh extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomPopRefresh> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomPopRefresh>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomPopRefresh.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomPopRefresh.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomPopRefresh newInstance() {
            return new BLiveVoiceRoomPopRefresh();
        }

        public boolean parseField(BLiveVoiceRoomPopRefresh bLiveVoiceRoomPopRefresh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roomAmountRefreshInterval":
                    bLiveVoiceRoomPopRefresh.roomAmountRefreshInterval = jsonParser.getValueAsInt();
                    return true;
                case "leaderboardRefreshInterval":
                    bLiveVoiceRoomPopRefresh.leaderboardRefreshInterval = jsonParser.getValueAsInt();
                    return true;
                case "isCanLeaderboardRefresh":
                    bLiveVoiceRoomPopRefresh.isCanLeaderboardRefresh = jsonParser.getValueAsBoolean();
                    return true;
                case "isCanAmountRefresh":
                    bLiveVoiceRoomPopRefresh.isCanAmountRefresh = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomPopRefresh bLiveVoiceRoomPopRefresh, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isCanLeaderboardRefresh", bLiveVoiceRoomPopRefresh.isCanLeaderboardRefresh);
            jsonGenerator.writeBooleanField("isCanAmountRefresh", bLiveVoiceRoomPopRefresh.isCanAmountRefresh);
            jsonGenerator.writeNumberField("leaderboardRefreshInterval", bLiveVoiceRoomPopRefresh.leaderboardRefreshInterval);
            jsonGenerator.writeNumberField("roomAmountRefreshInterval", bLiveVoiceRoomPopRefresh.roomAmountRefreshInterval);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomPopRefresh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroompoprefresh";

    @ProtobufIndex(index = 2)
    public boolean isCanAmountRefresh;

    @ProtobufIndex(index = 1)
    public boolean isCanLeaderboardRefresh;

    @ProtobufIndex(index = 3)
    public int leaderboardRefreshInterval;

    @ProtobufIndex(index = 4)
    public int roomAmountRefreshInterval;

    public static BLiveVoiceRoomPopRefresh new_() {
        BLiveVoiceRoomPopRefresh bLiveVoiceRoomPopRefresh = new BLiveVoiceRoomPopRefresh();
        bLiveVoiceRoomPopRefresh.nullCheck();
        return bLiveVoiceRoomPopRefresh;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomPopRefresh mo223809clone() {
        BLiveVoiceRoomPopRefresh bLiveVoiceRoomPopRefresh = new BLiveVoiceRoomPopRefresh();
        bLiveVoiceRoomPopRefresh.isCanLeaderboardRefresh = this.isCanLeaderboardRefresh;
        bLiveVoiceRoomPopRefresh.isCanAmountRefresh = this.isCanAmountRefresh;
        bLiveVoiceRoomPopRefresh.leaderboardRefreshInterval = this.leaderboardRefreshInterval;
        bLiveVoiceRoomPopRefresh.roomAmountRefreshInterval = this.roomAmountRefreshInterval;
        return bLiveVoiceRoomPopRefresh;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomPopRefresh)) {
            return false;
        }
        BLiveVoiceRoomPopRefresh bLiveVoiceRoomPopRefresh = (BLiveVoiceRoomPopRefresh) obj;
        return this.isCanLeaderboardRefresh == bLiveVoiceRoomPopRefresh.isCanLeaderboardRefresh && this.isCanAmountRefresh == bLiveVoiceRoomPopRefresh.isCanAmountRefresh && this.leaderboardRefreshInterval == bLiveVoiceRoomPopRefresh.leaderboardRefreshInterval && this.roomAmountRefreshInterval == bLiveVoiceRoomPopRefresh.roomAmountRefreshInterval;
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
        int i2 = (((((((i * 41) + (this.isCanLeaderboardRefresh ? 1231 : 1237)) * 41) + (this.isCanAmountRefresh ? 1231 : 1237)) * 41) + this.leaderboardRefreshInterval) * 41) + this.roomAmountRefreshInterval;
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
