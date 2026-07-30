package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
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
public class BLiveHourLeaderBoard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHourLeaderBoard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHourLeaderBoard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHourLeaderBoard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHourLeaderBoard newInstance() {
            return new BLiveHourLeaderBoard();
        }

        public boolean parseField(BLiveHourLeaderBoard bLiveHourLeaderBoard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "currentRoomLeaderboards":
                    bLiveHourLeaderBoard.currentRoomLeaderboards = JsonAdapter.parseArray(jsonParser, BLiveHourLeaderBoardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "helperPageUrl":
                    bLiveHourLeaderBoard.helperPageUrl = jsonParser.getValueAsString();
                    return true;
                case "allLeaderboards":
                    bLiveHourLeaderBoard.allLeaderboards = JsonAdapter.parseArray(jsonParser, BLiveHourLeaderBoardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isOpen":
                    bLiveHourLeaderBoard.isOpen = jsonParser.getValueAsBoolean();
                    return true;
                case "hourLeaderboardBattle":
                    bLiveHourLeaderBoard.hourLeaderboardBattle = BLiveHourLeaderBoardBattle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "currentHourSuggestConfig":
                    bLiveHourLeaderBoard.currentHourSuggestConfig = BLiveCurrentHourSuggestConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "notices":
                    bLiveHourLeaderBoard.notices = JsonAdapter.parseArray(jsonParser, BLiveCurrentHourNotices.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHourLeaderBoard bLiveHourLeaderBoard, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveHourLeaderBoard.currentRoomLeaderboards != null) {
                jsonGenerator.writeFieldName("currentRoomLeaderboards");
                JsonAdapter.serializeArray(bLiveHourLeaderBoard.currentRoomLeaderboards, jsonGenerator, BLiveHourLeaderBoardItem.JSON_ADAPTER);
            }
            if (bLiveHourLeaderBoard.allLeaderboards != null) {
                jsonGenerator.writeFieldName("allLeaderboards");
                JsonAdapter.serializeArray(bLiveHourLeaderBoard.allLeaderboards, jsonGenerator, BLiveHourLeaderBoardItem.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isOpen", bLiveHourLeaderBoard.isOpen);
            if (bLiveHourLeaderBoard.notices != null) {
                jsonGenerator.writeFieldName("notices");
                JsonAdapter.serializeArray(bLiveHourLeaderBoard.notices, jsonGenerator, BLiveCurrentHourNotices.JSON_ADAPTER);
            }
            String str = bLiveHourLeaderBoard.helperPageUrl;
            if (str != null) {
                jsonGenerator.writeStringField("helperPageUrl", str);
            }
            if (bLiveHourLeaderBoard.currentHourSuggestConfig != null) {
                jsonGenerator.writeFieldName("currentHourSuggestConfig");
                BLiveCurrentHourSuggestConfig.JSON_ADAPTER.serialize(bLiveHourLeaderBoard.currentHourSuggestConfig, jsonGenerator, true);
            }
            if (bLiveHourLeaderBoard.hourLeaderboardBattle != null) {
                jsonGenerator.writeFieldName("hourLeaderboardBattle");
                BLiveHourLeaderBoardBattle.JSON_ADAPTER.serialize(bLiveHourLeaderBoard.hourLeaderboardBattle, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHourLeaderBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivehourleaderboard";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveHourLeaderBoardItem> allLeaderboards;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveCurrentHourSuggestConfig currentHourSuggestConfig;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveHourLeaderBoardItem> currentRoomLeaderboards;

    @NonNull
    @ProtobufIndex(index = 5)
    public String helperPageUrl;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveHourLeaderBoardBattle hourLeaderboardBattle;
    public boolean isFinishHeaderAnim;
    public boolean isHeaderBgAnimFinish;

    @ProtobufIndex(index = 3)
    public boolean isOpen;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveCurrentHourNotices> notices;

    public static BLiveHourLeaderBoard new_() {
        BLiveHourLeaderBoard bLiveHourLeaderBoard = new BLiveHourLeaderBoard();
        bLiveHourLeaderBoard.nullCheck();
        return bLiveHourLeaderBoard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHourLeaderBoard mo223809clone() {
        BLiveHourLeaderBoard bLiveHourLeaderBoard = new BLiveHourLeaderBoard();
        List<BLiveHourLeaderBoardItem> list = this.currentRoomLeaderboards;
        if (list != null) {
            bLiveHourLeaderBoard.currentRoomLeaderboards = ValueObject.util_map(list, new w9j() { // from class: l.h12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveHourLeaderBoardItem) obj).mo223809clone();
                }
            });
        }
        List<BLiveHourLeaderBoardItem> list2 = this.allLeaderboards;
        if (list2 != null) {
            bLiveHourLeaderBoard.allLeaderboards = ValueObject.util_map(list2, new w9j() { // from class: l.i12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveHourLeaderBoardItem) obj).mo223809clone();
                }
            });
        }
        bLiveHourLeaderBoard.isOpen = this.isOpen;
        List<BLiveCurrentHourNotices> list3 = this.notices;
        if (list3 != null) {
            bLiveHourLeaderBoard.notices = ValueObject.util_map(list3, new w9j() { // from class: l.j12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveCurrentHourNotices) obj).mo223809clone();
                }
            });
        }
        bLiveHourLeaderBoard.helperPageUrl = this.helperPageUrl;
        BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig = this.currentHourSuggestConfig;
        if (bLiveCurrentHourSuggestConfig != null) {
            bLiveHourLeaderBoard.currentHourSuggestConfig = bLiveCurrentHourSuggestConfig.mo223809clone();
        }
        BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle = this.hourLeaderboardBattle;
        if (bLiveHourLeaderBoardBattle != null) {
            bLiveHourLeaderBoard.hourLeaderboardBattle = bLiveHourLeaderBoardBattle.mo223809clone();
        }
        return bLiveHourLeaderBoard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHourLeaderBoard)) {
            return false;
        }
        BLiveHourLeaderBoard bLiveHourLeaderBoard = (BLiveHourLeaderBoard) obj;
        return ValueObject.util_equals(this.currentRoomLeaderboards, bLiveHourLeaderBoard.currentRoomLeaderboards) && ValueObject.util_equals(this.allLeaderboards, bLiveHourLeaderBoard.allLeaderboards) && this.isOpen == bLiveHourLeaderBoard.isOpen && ValueObject.util_equals(this.notices, bLiveHourLeaderBoard.notices) && ValueObject.util_equals(this.helperPageUrl, bLiveHourLeaderBoard.helperPageUrl) && ValueObject.util_equals(this.currentHourSuggestConfig, bLiveHourLeaderBoard.currentHourSuggestConfig) && ValueObject.util_equals(this.hourLeaderboardBattle, bLiveHourLeaderBoard.hourLeaderboardBattle);
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
        List<BLiveHourLeaderBoardItem> list = this.currentRoomLeaderboards;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveHourLeaderBoardItem> list2 = this.allLeaderboards;
        int iHashCode2 = (((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.isOpen ? 1231 : 1237)) * 41;
        List<BLiveCurrentHourNotices> list3 = this.notices;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str = this.helperPageUrl;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig = this.currentHourSuggestConfig;
        int iHashCode5 = (iHashCode4 + (bLiveCurrentHourSuggestConfig != null ? bLiveCurrentHourSuggestConfig.hashCode() : 0)) * 41;
        BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle = this.hourLeaderboardBattle;
        int iHashCode6 = iHashCode5 + (bLiveHourLeaderBoardBattle != null ? bLiveHourLeaderBoardBattle.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currentRoomLeaderboards == null) {
            this.currentRoomLeaderboards = new ArrayList();
        }
        if (this.allLeaderboards == null) {
            this.allLeaderboards = new ArrayList();
        }
        if (this.notices == null) {
            this.notices = new ArrayList();
        }
        if (this.helperPageUrl == null) {
            this.helperPageUrl = "";
        }
        if (this.currentHourSuggestConfig == null) {
            this.currentHourSuggestConfig = BLiveCurrentHourSuggestConfig.new_();
        }
        if (this.hourLeaderboardBattle == null) {
            this.hourLeaderboardBattle = BLiveHourLeaderBoardBattle.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
