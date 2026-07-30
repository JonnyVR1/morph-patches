package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem;
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
public class BLiveGuardAnchorRankInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGuardAnchorRankInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGuardAnchorRankInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGuardAnchorRankInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGuardAnchorRankInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGuardAnchorRankInfo newInstance() {
            return new BLiveGuardAnchorRankInfo();
        }

        public boolean parseField(BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guardScore":
                    bLiveGuardAnchorRankInfo.guardScore = jsonParser.getValueAsLong();
                    return true;
                case "cherishGuardNums":
                    bLiveGuardAnchorRankInfo.cherishGuardNums = jsonParser.getValueAsLong();
                    return true;
                case "gapGuardScore":
                    bLiveGuardAnchorRankInfo.gapGuardScore = jsonParser.getValueAsLong();
                    return true;
                case "currentRank":
                    bLiveGuardAnchorRankInfo.currentRank = jsonParser.getValueAsLong();
                    return true;
                case "topScoreRewardInfos":
                    bLiveGuardAnchorRankInfo.topScoreRewardInfos = JsonAdapter.parseArray(jsonParser, BLiveKnightsPrivilegeItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "heartbeatGuardNums":
                    bLiveGuardAnchorRankInfo.heartbeatGuardNums = jsonParser.getValueAsLong();
                    return true;
                case "topScoreRewardInfosOpen":
                    bLiveGuardAnchorRankInfo.topScoreRewardInfosOpen = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("currentRank", bLiveGuardAnchorRankInfo.currentRank);
            jsonGenerator.writeNumberField("guardScore", bLiveGuardAnchorRankInfo.guardScore);
            jsonGenerator.writeNumberField("gapGuardScore", bLiveGuardAnchorRankInfo.gapGuardScore);
            if (bLiveGuardAnchorRankInfo.topScoreRewardInfos != null) {
                jsonGenerator.writeFieldName("topScoreRewardInfos");
                JsonAdapter.serializeArray(bLiveGuardAnchorRankInfo.topScoreRewardInfos, jsonGenerator, BLiveKnightsPrivilegeItem.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("cherishGuardNums", bLiveGuardAnchorRankInfo.cherishGuardNums);
            jsonGenerator.writeNumberField("heartbeatGuardNums", bLiveGuardAnchorRankInfo.heartbeatGuardNums);
            jsonGenerator.writeBooleanField("topScoreRewardInfosOpen", bLiveGuardAnchorRankInfo.topScoreRewardInfosOpen);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGuardAnchorRankInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveguardanchorrankinfo";

    @ProtobufIndex(index = 5)
    public long cherishGuardNums;

    @ProtobufIndex(index = 1)
    public long currentRank;

    @ProtobufIndex(index = 3)
    public long gapGuardScore;

    @ProtobufIndex(index = 2)
    public long guardScore;

    @ProtobufIndex(index = 6)
    public long heartbeatGuardNums;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveKnightsPrivilegeItem> topScoreRewardInfos;

    @ProtobufIndex(index = 7)
    public boolean topScoreRewardInfosOpen;

    public static BLiveGuardAnchorRankInfo new_() {
        BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo = new BLiveGuardAnchorRankInfo();
        bLiveGuardAnchorRankInfo.nullCheck();
        return bLiveGuardAnchorRankInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGuardAnchorRankInfo mo223809clone() {
        BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo = new BLiveGuardAnchorRankInfo();
        bLiveGuardAnchorRankInfo.currentRank = this.currentRank;
        bLiveGuardAnchorRankInfo.guardScore = this.guardScore;
        bLiveGuardAnchorRankInfo.gapGuardScore = this.gapGuardScore;
        List<BLiveKnightsPrivilegeItem> list = this.topScoreRewardInfos;
        if (list != null) {
            bLiveGuardAnchorRankInfo.topScoreRewardInfos = ValueObject.util_map(list, new w9j() { // from class: l.d12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveKnightsPrivilegeItem) obj).mo223809clone();
                }
            });
        }
        bLiveGuardAnchorRankInfo.cherishGuardNums = this.cherishGuardNums;
        bLiveGuardAnchorRankInfo.heartbeatGuardNums = this.heartbeatGuardNums;
        bLiveGuardAnchorRankInfo.topScoreRewardInfosOpen = this.topScoreRewardInfosOpen;
        return bLiveGuardAnchorRankInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGuardAnchorRankInfo)) {
            return false;
        }
        BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo = (BLiveGuardAnchorRankInfo) obj;
        return this.currentRank == bLiveGuardAnchorRankInfo.currentRank && this.guardScore == bLiveGuardAnchorRankInfo.guardScore && this.gapGuardScore == bLiveGuardAnchorRankInfo.gapGuardScore && ValueObject.util_equals(this.topScoreRewardInfos, bLiveGuardAnchorRankInfo.topScoreRewardInfos) && this.cherishGuardNums == bLiveGuardAnchorRankInfo.cherishGuardNums && this.heartbeatGuardNums == bLiveGuardAnchorRankInfo.heartbeatGuardNums && this.topScoreRewardInfosOpen == bLiveGuardAnchorRankInfo.topScoreRewardInfosOpen;
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
        long j = this.currentRank;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.guardScore;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.gapGuardScore;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        List<BLiveKnightsPrivilegeItem> list = this.topScoreRewardInfos;
        int iHashCode = (i4 + (list != null ? list.hashCode() : 0)) * 41;
        long j4 = this.cherishGuardNums;
        int i5 = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        long j5 = this.heartbeatGuardNums;
        int i6 = ((i5 + ((int) (j5 ^ (j5 >>> 32)))) * 41) + (this.topScoreRewardInfosOpen ? 1231 : 1237);
        this.hashCode = i6;
        return i6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.topScoreRewardInfos == null) {
            this.topScoreRewardInfos = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
