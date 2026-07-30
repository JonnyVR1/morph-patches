package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceUserLeaderBoard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserLeaderBoard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserLeaderBoard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserLeaderBoard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserLeaderBoard newInstance() {
            return new BLiveVoiceUserLeaderBoard();
        }

        public boolean parseField(BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "helperPageUrl":
                    bLiveVoiceUserLeaderBoard.helperPageUrl = jsonParser.getValueAsString();
                    return true;
                case "leaderboards":
                    bLiveVoiceUserLeaderBoard.leaderboards = JsonAdapter.parseArray(jsonParser, BLiveVoiceHourLeaderBoardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "myLeaderboard":
                    bLiveVoiceUserLeaderBoard.myLeaderboard = BLiveVoiceHourLeaderBoardItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceUserLeaderBoard.leaderboards != null) {
                jsonGenerator.writeFieldName("leaderboards");
                JsonAdapter.serializeArray(bLiveVoiceUserLeaderBoard.leaderboards, jsonGenerator, BLiveVoiceHourLeaderBoardItem.JSON_ADAPTER);
            }
            if (bLiveVoiceUserLeaderBoard.myLeaderboard != null) {
                jsonGenerator.writeFieldName("myLeaderboard");
                BLiveVoiceHourLeaderBoardItem.JSON_ADAPTER.serialize(bLiveVoiceUserLeaderBoard.myLeaderboard, jsonGenerator, true);
            }
            String str = bLiveVoiceUserLeaderBoard.helperPageUrl;
            if (str != null) {
                jsonGenerator.writeStringField("helperPageUrl", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserLeaderBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceuserleaderboard";

    @NonNull
    @ProtobufIndex(index = 3)
    public String helperPageUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoiceHourLeaderBoardItem> leaderboards;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceHourLeaderBoardItem myLeaderboard;

    public static BLiveVoiceUserLeaderBoard new_() {
        BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard = new BLiveVoiceUserLeaderBoard();
        bLiveVoiceUserLeaderBoard.nullCheck();
        return bLiveVoiceUserLeaderBoard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserLeaderBoard mo225055clone() {
        BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard = new BLiveVoiceUserLeaderBoard();
        List<BLiveVoiceHourLeaderBoardItem> list = this.leaderboards;
        if (list != null) {
            bLiveVoiceUserLeaderBoard.leaderboards = ValueObject.util_map(list, new qcj() { // from class: l.ga2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceHourLeaderBoardItem) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = this.myLeaderboard;
        if (bLiveVoiceHourLeaderBoardItem != null) {
            bLiveVoiceUserLeaderBoard.myLeaderboard = bLiveVoiceHourLeaderBoardItem.mo225055clone();
        }
        bLiveVoiceUserLeaderBoard.helperPageUrl = this.helperPageUrl;
        return bLiveVoiceUserLeaderBoard;
    }

    public BLiveVoiceHourLeaderBoard conversionType() {
        BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoardNew_ = BLiveVoiceHourLeaderBoard.new_();
        bLiveVoiceHourLeaderBoardNew_.myLeaderboard = this.myLeaderboard;
        bLiveVoiceHourLeaderBoardNew_.helperPageUrl = this.helperPageUrl;
        bLiveVoiceHourLeaderBoardNew_.leaderboards = this.leaderboards;
        return bLiveVoiceHourLeaderBoardNew_;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserLeaderBoard)) {
            return false;
        }
        BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard = (BLiveVoiceUserLeaderBoard) obj;
        return ValueObject.util_equals(this.leaderboards, bLiveVoiceUserLeaderBoard.leaderboards) && ValueObject.util_equals(this.myLeaderboard, bLiveVoiceUserLeaderBoard.myLeaderboard) && ValueObject.util_equals(this.helperPageUrl, bLiveVoiceUserLeaderBoard.helperPageUrl);
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
        if (this.myLeaderboard == null) {
            this.myLeaderboard = BLiveVoiceHourLeaderBoardItem.new_();
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
