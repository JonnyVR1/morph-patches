package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
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
public class BLiveVoiceHourLeaderBoard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceHourLeaderBoard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceHourLeaderBoard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceHourLeaderBoard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceHourLeaderBoard newInstance() {
            return new BLiveVoiceHourLeaderBoard();
        }

        public boolean parseField(BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "helperPageUrl":
                    bLiveVoiceHourLeaderBoard.helperPageUrl = jsonParser.getValueAsString();
                    return true;
                case "leaderboards":
                    bLiveVoiceHourLeaderBoard.leaderboards = JsonAdapter.parseArray(jsonParser, BLiveVoiceHourLeaderBoardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "myLeaderboard":
                    bLiveVoiceHourLeaderBoard.myLeaderboard = BLiveVoiceHourLeaderBoardItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceHourLeaderBoard.leaderboards != null) {
                jsonGenerator.writeFieldName("leaderboards");
                JsonAdapter.serializeArray(bLiveVoiceHourLeaderBoard.leaderboards, jsonGenerator, BLiveVoiceHourLeaderBoardItem.JSON_ADAPTER);
            }
            if (bLiveVoiceHourLeaderBoard.myLeaderboard != null) {
                jsonGenerator.writeFieldName("myLeaderboard");
                BLiveVoiceHourLeaderBoardItem.JSON_ADAPTER.serialize(bLiveVoiceHourLeaderBoard.myLeaderboard, jsonGenerator, true);
            }
            String str = bLiveVoiceHourLeaderBoard.helperPageUrl;
            if (str != null) {
                jsonGenerator.writeStringField("helperPageUrl", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceHourLeaderBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicehourleaderboard";

    @NonNull
    @ProtobufIndex(index = 3)
    public String helperPageUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoiceHourLeaderBoardItem> leaderboards;

    @Nullable
    @ProtobufIndex(index = 2)
    public BLiveVoiceHourLeaderBoardItem myLeaderboard;

    public static BLiveVoiceHourLeaderBoard new_() {
        BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard = new BLiveVoiceHourLeaderBoard();
        bLiveVoiceHourLeaderBoard.nullCheck();
        return bLiveVoiceHourLeaderBoard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceHourLeaderBoard mo223809clone() {
        BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard = new BLiveVoiceHourLeaderBoard();
        List<BLiveVoiceHourLeaderBoardItem> list = this.leaderboards;
        if (list != null) {
            bLiveVoiceHourLeaderBoard.leaderboards = ValueObject.util_map(list, new w9j() { // from class: l.y82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceHourLeaderBoardItem) obj).mo223809clone();
                }
            });
        }
        BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = this.myLeaderboard;
        if (bLiveVoiceHourLeaderBoardItem != null) {
            bLiveVoiceHourLeaderBoard.myLeaderboard = bLiveVoiceHourLeaderBoardItem.mo223809clone();
        }
        bLiveVoiceHourLeaderBoard.helperPageUrl = this.helperPageUrl;
        return bLiveVoiceHourLeaderBoard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceHourLeaderBoard)) {
            return false;
        }
        BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard = (BLiveVoiceHourLeaderBoard) obj;
        return ValueObject.util_equals(this.leaderboards, bLiveVoiceHourLeaderBoard.leaderboards) && ValueObject.util_equals(this.myLeaderboard, bLiveVoiceHourLeaderBoard.myLeaderboard) && ValueObject.util_equals(this.helperPageUrl, bLiveVoiceHourLeaderBoard.helperPageUrl);
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
        List<BLiveVoiceHourLeaderBoardItem> list = this.leaderboards;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = this.myLeaderboard;
        int iHashCode2 = (iHashCode + (bLiveVoiceHourLeaderBoardItem != null ? bLiveVoiceHourLeaderBoardItem.hashCode() : 0)) * 41;
        String str = this.helperPageUrl;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.leaderboards == null) {
            this.leaderboards = new ArrayList();
        }
        if (this.helperPageUrl == null) {
            this.helperPageUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
