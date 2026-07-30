package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveAuctionLeaderboardItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionLeaderboardItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionLeaderboardItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionLeaderboardItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionLeaderboardItem newInstance() {
            return new BLiveAuctionLeaderboardItem();
        }

        public boolean parseField(BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserInfo":
                    bLiveAuctionLeaderboardItem.otherUserInfo = BLiveAuctionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "auctionTime":
                    bLiveAuctionLeaderboardItem.auctionTime = jsonParser.getValueAsLong();
                    return true;
                case "userInfo":
                    bLiveAuctionLeaderboardItem.userInfo = BLiveAuctionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "rank":
                    bLiveAuctionLeaderboardItem.rank = jsonParser.getValueAsInt();
                    return true;
                case "level":
                    bLiveAuctionLeaderboardItem.level = jsonParser.getValueAsInt();
                    return true;
                case "worth":
                    bLiveAuctionLeaderboardItem.worth = jsonParser.getValueAsInt();
                    return true;
                case "relationDetail":
                    bLiveAuctionLeaderboardItem.relationDetail = BLiveAuctionRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveAuctionLeaderboardItem.rank);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveAuctionLeaderboardItem.level);
            jsonGenerator.writeNumberField("auctionTime", bLiveAuctionLeaderboardItem.auctionTime);
            jsonGenerator.writeNumberField("worth", bLiveAuctionLeaderboardItem.worth);
            if (bLiveAuctionLeaderboardItem.relationDetail != null) {
                jsonGenerator.writeFieldName("relationDetail");
                BLiveAuctionRelation.JSON_ADAPTER.serialize(bLiveAuctionLeaderboardItem.relationDetail, jsonGenerator, true);
            }
            if (bLiveAuctionLeaderboardItem.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                BLiveAuctionUserInfo.JSON_ADAPTER.serialize(bLiveAuctionLeaderboardItem.userInfo, jsonGenerator, true);
            }
            if (bLiveAuctionLeaderboardItem.otherUserInfo != null) {
                jsonGenerator.writeFieldName("otherUserInfo");
                BLiveAuctionUserInfo.JSON_ADAPTER.serialize(bLiveAuctionLeaderboardItem.otherUserInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionLeaderboardItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionleaderboarditem";

    @ProtobufIndex(index = 3)
    public long auctionTime;

    @ProtobufIndex(index = 2)
    public int level;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveAuctionUserInfo otherUserInfo;

    @ProtobufIndex(index = 1)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveAuctionRelation relationDetail;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveAuctionUserInfo userInfo;

    @ProtobufIndex(index = 4)
    public int worth;

    public static BLiveAuctionLeaderboardItem new_() {
        BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem = new BLiveAuctionLeaderboardItem();
        bLiveAuctionLeaderboardItem.nullCheck();
        return bLiveAuctionLeaderboardItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionLeaderboardItem mo223809clone() {
        BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem = new BLiveAuctionLeaderboardItem();
        bLiveAuctionLeaderboardItem.rank = this.rank;
        bLiveAuctionLeaderboardItem.level = this.level;
        bLiveAuctionLeaderboardItem.auctionTime = this.auctionTime;
        bLiveAuctionLeaderboardItem.worth = this.worth;
        BLiveAuctionRelation bLiveAuctionRelation = this.relationDetail;
        if (bLiveAuctionRelation != null) {
            bLiveAuctionLeaderboardItem.relationDetail = bLiveAuctionRelation.mo223809clone();
        }
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.userInfo;
        if (bLiveAuctionUserInfo != null) {
            bLiveAuctionLeaderboardItem.userInfo = bLiveAuctionUserInfo.mo223809clone();
        }
        BLiveAuctionUserInfo bLiveAuctionUserInfo2 = this.otherUserInfo;
        if (bLiveAuctionUserInfo2 != null) {
            bLiveAuctionLeaderboardItem.otherUserInfo = bLiveAuctionUserInfo2.mo223809clone();
        }
        return bLiveAuctionLeaderboardItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionLeaderboardItem)) {
            return false;
        }
        BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem = (BLiveAuctionLeaderboardItem) obj;
        return this.rank == bLiveAuctionLeaderboardItem.rank && this.level == bLiveAuctionLeaderboardItem.level && this.auctionTime == bLiveAuctionLeaderboardItem.auctionTime && this.worth == bLiveAuctionLeaderboardItem.worth && ValueObject.util_equals(this.relationDetail, bLiveAuctionLeaderboardItem.relationDetail) && ValueObject.util_equals(this.userInfo, bLiveAuctionLeaderboardItem.userInfo) && ValueObject.util_equals(this.otherUserInfo, bLiveAuctionLeaderboardItem.otherUserInfo);
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
        int i2 = ((((i * 41) + this.rank) * 41) + this.level) * 41;
        long j = this.auctionTime;
        int i3 = (((i2 + ((int) (j ^ (j >>> 32)))) * 41) + this.worth) * 41;
        BLiveAuctionRelation bLiveAuctionRelation = this.relationDetail;
        int iHashCode = (i3 + (bLiveAuctionRelation != null ? bLiveAuctionRelation.hashCode() : 0)) * 41;
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.userInfo;
        int iHashCode2 = (iHashCode + (bLiveAuctionUserInfo != null ? bLiveAuctionUserInfo.hashCode() : 0)) * 41;
        BLiveAuctionUserInfo bLiveAuctionUserInfo2 = this.otherUserInfo;
        int iHashCode3 = iHashCode2 + (bLiveAuctionUserInfo2 != null ? bLiveAuctionUserInfo2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.relationDetail == null) {
            this.relationDetail = BLiveAuctionRelation.new_();
        }
        if (this.userInfo == null) {
            this.userInfo = BLiveAuctionUserInfo.new_();
        }
        if (this.otherUserInfo == null) {
            this.otherUserInfo = BLiveAuctionUserInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
