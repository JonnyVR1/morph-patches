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
public class BLiveAnchorLeaderboard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAnchorLeaderboard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchorLeaderboard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAnchorLeaderboard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchorLeaderboard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchorLeaderboard newInstance() {
            return new BLiveAnchorLeaderboard();
        }

        public boolean parseField(BLiveAnchorLeaderboard bLiveAnchorLeaderboard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "leaderboards":
                    bLiveAnchorLeaderboard.leaderboards = JsonAdapter.parseArray(jsonParser, BLiveHourLeaderBoardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "currentLeaderboard":
                    bLiveAnchorLeaderboard.currentLeaderboard = BLiveHourLeaderBoardItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "notices":
                    bLiveAnchorLeaderboard.notices = JsonAdapter.parseArray(jsonParser, BLiveCurrentHourNotices.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchorLeaderboard bLiveAnchorLeaderboard, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveAnchorLeaderboard.currentLeaderboard != null) {
                jsonGenerator.writeFieldName("currentLeaderboard");
                BLiveHourLeaderBoardItem.JSON_ADAPTER.serialize(bLiveAnchorLeaderboard.currentLeaderboard, jsonGenerator, true);
            }
            if (bLiveAnchorLeaderboard.leaderboards != null) {
                jsonGenerator.writeFieldName("leaderboards");
                JsonAdapter.serializeArray(bLiveAnchorLeaderboard.leaderboards, jsonGenerator, BLiveHourLeaderBoardItem.JSON_ADAPTER);
            }
            if (bLiveAnchorLeaderboard.notices != null) {
                jsonGenerator.writeFieldName("notices");
                JsonAdapter.serializeArray(bLiveAnchorLeaderboard.notices, jsonGenerator, BLiveCurrentHourNotices.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchorLeaderboard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveanchorleaderboard";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveHourLeaderBoardItem currentLeaderboard;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveHourLeaderBoardItem> leaderboards;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveCurrentHourNotices> notices;

    public static BLiveAnchorLeaderboard new_() {
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = new BLiveAnchorLeaderboard();
        bLiveAnchorLeaderboard.nullCheck();
        return bLiveAnchorLeaderboard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchorLeaderboard mo223809clone() {
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = new BLiveAnchorLeaderboard();
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.currentLeaderboard;
        if (bLiveHourLeaderBoardItem != null) {
            bLiveAnchorLeaderboard.currentLeaderboard = bLiveHourLeaderBoardItem.mo223809clone();
        }
        List<BLiveHourLeaderBoardItem> list = this.leaderboards;
        if (list != null) {
            bLiveAnchorLeaderboard.leaderboards = ValueObject.util_map(list, new w9j() { // from class: l.dr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveHourLeaderBoardItem) obj).mo223809clone();
                }
            });
        }
        List<BLiveCurrentHourNotices> list2 = this.notices;
        if (list2 != null) {
            bLiveAnchorLeaderboard.notices = ValueObject.util_map(list2, new w9j() { // from class: l.er1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveCurrentHourNotices) obj).mo223809clone();
                }
            });
        }
        return bLiveAnchorLeaderboard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchorLeaderboard)) {
            return false;
        }
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = (BLiveAnchorLeaderboard) obj;
        return ValueObject.util_equals(this.currentLeaderboard, bLiveAnchorLeaderboard.currentLeaderboard) && ValueObject.util_equals(this.leaderboards, bLiveAnchorLeaderboard.leaderboards) && ValueObject.util_equals(this.notices, bLiveAnchorLeaderboard.notices);
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
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = this.currentLeaderboard;
        int iHashCode = (i2 + (bLiveHourLeaderBoardItem != null ? bLiveHourLeaderBoardItem.hashCode() : 0)) * 41;
        List<BLiveHourLeaderBoardItem> list = this.leaderboards;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveCurrentHourNotices> list2 = this.notices;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currentLeaderboard == null) {
            this.currentLeaderboard = BLiveHourLeaderBoardItem.new_();
        }
        if (this.leaderboards == null) {
            this.leaderboards = new ArrayList();
        }
        if (this.notices == null) {
            this.notices = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
