package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkBoardUser;
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
public class BLiveMultiPkLeaderboard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiPkLeaderboard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiPkLeaderboard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiPkLeaderboard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiPkLeaderboard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiPkLeaderboard newInstance() {
            return new BLiveMultiPkLeaderboard();
        }

        public boolean parseField(BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "allLeaderboards":
                    bLiveMultiPkLeaderboard.allLeaderboards = JsonAdapter.parseArray(jsonParser, BLiveMultiPkBoardUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "anchorName":
                    bLiveMultiPkLeaderboard.anchorName = jsonParser.getValueAsString();
                    return true;
                case "fanbaseId":
                    bLiveMultiPkLeaderboard.fanbaseId = jsonParser.getValueAsString();
                    return true;
                case "contributorNum":
                    bLiveMultiPkLeaderboard.contributorNum = jsonParser.getValueAsInt();
                    return true;
                case "gap":
                    bLiveMultiPkLeaderboard.gap = jsonParser.getValueAsInt();
                    return true;
                case "rank":
                    bLiveMultiPkLeaderboard.rank = jsonParser.getValueAsInt();
                    return true;
                case "currentLeaderboard":
                    bLiveMultiPkLeaderboard.currentLeaderboard = BLiveMultiPkBoardUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiPkLeaderboard.anchorName;
            if (str != null) {
                jsonGenerator.writeStringField("anchorName", str);
            }
            jsonGenerator.writeNumberField("contributorNum", bLiveMultiPkLeaderboard.contributorNum);
            if (bLiveMultiPkLeaderboard.currentLeaderboard != null) {
                jsonGenerator.writeFieldName("currentLeaderboard");
                BLiveMultiPkBoardUser.JSON_ADAPTER.serialize(bLiveMultiPkLeaderboard.currentLeaderboard, jsonGenerator, true);
            }
            if (bLiveMultiPkLeaderboard.allLeaderboards != null) {
                jsonGenerator.writeFieldName("allLeaderboards");
                JsonAdapter.serializeArray(bLiveMultiPkLeaderboard.allLeaderboards, jsonGenerator, BLiveMultiPkBoardUser.JSON_ADAPTER);
            }
            String str2 = bLiveMultiPkLeaderboard.fanbaseId;
            if (str2 != null) {
                jsonGenerator.writeStringField("fanbaseId", str2);
            }
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveMultiPkLeaderboard.rank);
            jsonGenerator.writeNumberField("gap", bLiveMultiPkLeaderboard.gap);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiPkLeaderboard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemultipkleaderboard";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveMultiPkBoardUser> allLeaderboards;

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorName;

    @ProtobufIndex(index = 2)
    public int contributorNum;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveMultiPkBoardUser currentLeaderboard;

    @NonNull
    @ProtobufIndex(index = 5)
    public String fanbaseId;

    @ProtobufIndex(index = 7)
    public int gap;

    @ProtobufIndex(index = 6)
    public int rank;

    public static BLiveMultiPkLeaderboard new_() {
        BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard = new BLiveMultiPkLeaderboard();
        bLiveMultiPkLeaderboard.nullCheck();
        return bLiveMultiPkLeaderboard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiPkLeaderboard mo225055clone() {
        BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard = new BLiveMultiPkLeaderboard();
        bLiveMultiPkLeaderboard.anchorName = this.anchorName;
        bLiveMultiPkLeaderboard.contributorNum = this.contributorNum;
        BLiveMultiPkBoardUser bLiveMultiPkBoardUser = this.currentLeaderboard;
        if (bLiveMultiPkBoardUser != null) {
            bLiveMultiPkLeaderboard.currentLeaderboard = bLiveMultiPkBoardUser.mo225055clone();
        }
        List<BLiveMultiPkBoardUser> list = this.allLeaderboards;
        if (list != null) {
            bLiveMultiPkLeaderboard.allLeaderboards = ValueObject.util_map(list, new qcj() { // from class: l.h32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMultiPkBoardUser) obj).mo225055clone();
                }
            });
        }
        bLiveMultiPkLeaderboard.fanbaseId = this.fanbaseId;
        bLiveMultiPkLeaderboard.rank = this.rank;
        bLiveMultiPkLeaderboard.gap = this.gap;
        return bLiveMultiPkLeaderboard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiPkLeaderboard)) {
            return false;
        }
        BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard = (BLiveMultiPkLeaderboard) obj;
        return ValueObject.util_equals(this.anchorName, bLiveMultiPkLeaderboard.anchorName) && this.contributorNum == bLiveMultiPkLeaderboard.contributorNum && ValueObject.util_equals(this.currentLeaderboard, bLiveMultiPkLeaderboard.currentLeaderboard) && ValueObject.util_equals(this.allLeaderboards, bLiveMultiPkLeaderboard.allLeaderboards) && ValueObject.util_equals(this.fanbaseId, bLiveMultiPkLeaderboard.fanbaseId) && this.rank == bLiveMultiPkLeaderboard.rank && this.gap == bLiveMultiPkLeaderboard.gap;
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
        String str = this.anchorName;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.contributorNum) * 41;
        BLiveMultiPkBoardUser bLiveMultiPkBoardUser = this.currentLeaderboard;
        int iHashCode2 = (iHashCode + (bLiveMultiPkBoardUser != null ? bLiveMultiPkBoardUser.hashCode() : 0)) * 41;
        List<BLiveMultiPkBoardUser> list = this.allLeaderboards;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.fanbaseId;
        int iHashCode4 = ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.rank) * 41) + this.gap;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.currentLeaderboard == null) {
            this.currentLeaderboard = BLiveMultiPkBoardUser.new_();
        }
        if (this.allLeaderboards == null) {
            this.allLeaderboards = new ArrayList();
        }
        if (this.fanbaseId == null) {
            this.fanbaseId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
