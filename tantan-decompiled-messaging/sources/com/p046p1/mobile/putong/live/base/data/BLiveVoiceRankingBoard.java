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
public class BLiveVoiceRankingBoard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRankingBoard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRankingBoard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRankingBoard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRankingBoard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRankingBoard newInstance() {
            return new BLiveVoiceRankingBoard();
        }

        public boolean parseField(BLiveVoiceRankingBoard bLiveVoiceRankingBoard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("hourLeaderboardOpen")) {
                return false;
            }
            bLiveVoiceRankingBoard.hourLeaderboardOpen = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRankingBoard bLiveVoiceRankingBoard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hourLeaderboardOpen", bLiveVoiceRankingBoard.hourLeaderboardOpen);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRankingBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicerankingboard";

    @ProtobufIndex(index = 1)
    public boolean hourLeaderboardOpen;

    public static BLiveVoiceRankingBoard new_() {
        BLiveVoiceRankingBoard bLiveVoiceRankingBoard = new BLiveVoiceRankingBoard();
        bLiveVoiceRankingBoard.nullCheck();
        return bLiveVoiceRankingBoard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRankingBoard mo223809clone() {
        BLiveVoiceRankingBoard bLiveVoiceRankingBoard = new BLiveVoiceRankingBoard();
        bLiveVoiceRankingBoard.hourLeaderboardOpen = this.hourLeaderboardOpen;
        return bLiveVoiceRankingBoard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveVoiceRankingBoard) && this.hourLeaderboardOpen == ((BLiveVoiceRankingBoard) obj).hourLeaderboardOpen;
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
        int i2 = (i * 41) + (this.hourLeaderboardOpen ? 1231 : 1237);
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
