package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
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
public class BLiveAuctionRelationCard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionRelationCard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionRelationCard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionRelationCard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionRelationCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionRelationCard newInstance() {
            return new BLiveAuctionRelationCard();
        }

        public boolean parseField(BLiveAuctionRelationCard bLiveAuctionRelationCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remainSeconds":
                    bLiveAuctionRelationCard.remainSeconds = jsonParser.getValueAsInt();
                    return true;
                case "startTime":
                    bLiveAuctionRelationCard.startTime = jsonParser.getValueAsInt();
                    return true;
                case "endTime":
                    bLiveAuctionRelationCard.endTime = jsonParser.getValueAsInt();
                    return true;
                case "otherUserInfo":
                    bLiveAuctionRelationCard.otherUserInfo = BLiveAuctionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userInfo":
                    bLiveAuctionRelationCard.userInfo = BLiveAuctionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveAuctionRelationCard.f44334id = jsonParser.getValueAsString();
                    return false;
                case "level":
                    bLiveAuctionRelationCard.level = jsonParser.getValueAsInt();
                    return true;
                case "worth":
                    bLiveAuctionRelationCard.worth = jsonParser.getValueAsInt();
                    return true;
                case "relationDetail":
                    bLiveAuctionRelationCard.relationDetail = BLiveAuctionRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionRelationCard bLiveAuctionRelationCard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveAuctionRelationCard.level);
            jsonGenerator.writeNumberField("worth", bLiveAuctionRelationCard.worth);
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, bLiveAuctionRelationCard.startTime);
            jsonGenerator.writeNumberField("endTime", bLiveAuctionRelationCard.endTime);
            jsonGenerator.writeNumberField("remainSeconds", bLiveAuctionRelationCard.remainSeconds);
            if (bLiveAuctionRelationCard.relationDetail != null) {
                jsonGenerator.writeFieldName("relationDetail");
                BLiveAuctionRelation.JSON_ADAPTER.serialize(bLiveAuctionRelationCard.relationDetail, jsonGenerator, true);
            }
            if (bLiveAuctionRelationCard.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                BLiveAuctionUserInfo.JSON_ADAPTER.serialize(bLiveAuctionRelationCard.userInfo, jsonGenerator, true);
            }
            if (bLiveAuctionRelationCard.otherUserInfo != null) {
                jsonGenerator.writeFieldName("otherUserInfo");
                BLiveAuctionUserInfo.JSON_ADAPTER.serialize(bLiveAuctionRelationCard.otherUserInfo, jsonGenerator, true);
            }
            String str = bLiveAuctionRelationCard.f44334id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionRelationCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionrelationcard";

    @ProtobufIndex(index = 4)
    public int endTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 9)
    public String f44334id;

    @ProtobufIndex(index = 1)
    public int level;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveAuctionUserInfo otherUserInfo;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveAuctionRelation relationDetail;

    @ProtobufIndex(index = 5)
    public int remainSeconds;

    @ProtobufIndex(index = 3)
    public int startTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveAuctionUserInfo userInfo;

    @ProtobufIndex(index = 2)
    public int worth;

    public static BLiveAuctionRelationCard new_() {
        BLiveAuctionRelationCard bLiveAuctionRelationCard = new BLiveAuctionRelationCard();
        bLiveAuctionRelationCard.nullCheck();
        return bLiveAuctionRelationCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionRelationCard mo223809clone() {
        BLiveAuctionRelationCard bLiveAuctionRelationCard = new BLiveAuctionRelationCard();
        bLiveAuctionRelationCard.level = this.level;
        bLiveAuctionRelationCard.worth = this.worth;
        bLiveAuctionRelationCard.startTime = this.startTime;
        bLiveAuctionRelationCard.endTime = this.endTime;
        bLiveAuctionRelationCard.remainSeconds = this.remainSeconds;
        BLiveAuctionRelation bLiveAuctionRelation = this.relationDetail;
        if (bLiveAuctionRelation != null) {
            bLiveAuctionRelationCard.relationDetail = bLiveAuctionRelation.mo223809clone();
        }
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.userInfo;
        if (bLiveAuctionUserInfo != null) {
            bLiveAuctionRelationCard.userInfo = bLiveAuctionUserInfo.mo223809clone();
        }
        BLiveAuctionUserInfo bLiveAuctionUserInfo2 = this.otherUserInfo;
        if (bLiveAuctionUserInfo2 != null) {
            bLiveAuctionRelationCard.otherUserInfo = bLiveAuctionUserInfo2.mo223809clone();
        }
        bLiveAuctionRelationCard.f44334id = this.f44334id;
        return bLiveAuctionRelationCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionRelationCard)) {
            return false;
        }
        BLiveAuctionRelationCard bLiveAuctionRelationCard = (BLiveAuctionRelationCard) obj;
        return this.level == bLiveAuctionRelationCard.level && this.worth == bLiveAuctionRelationCard.worth && this.startTime == bLiveAuctionRelationCard.startTime && this.endTime == bLiveAuctionRelationCard.endTime && this.remainSeconds == bLiveAuctionRelationCard.remainSeconds && ValueObject.util_equals(this.relationDetail, bLiveAuctionRelationCard.relationDetail) && ValueObject.util_equals(this.userInfo, bLiveAuctionRelationCard.userInfo) && ValueObject.util_equals(this.otherUserInfo, bLiveAuctionRelationCard.otherUserInfo) && ValueObject.util_equals(this.f44334id, bLiveAuctionRelationCard.f44334id);
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
        int i2 = ((((((((((i * 41) + this.level) * 41) + this.worth) * 41) + this.startTime) * 41) + this.endTime) * 41) + this.remainSeconds) * 41;
        BLiveAuctionRelation bLiveAuctionRelation = this.relationDetail;
        int iHashCode = (i2 + (bLiveAuctionRelation != null ? bLiveAuctionRelation.hashCode() : 0)) * 41;
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.userInfo;
        int iHashCode2 = (iHashCode + (bLiveAuctionUserInfo != null ? bLiveAuctionUserInfo.hashCode() : 0)) * 41;
        BLiveAuctionUserInfo bLiveAuctionUserInfo2 = this.otherUserInfo;
        int iHashCode3 = (iHashCode2 + (bLiveAuctionUserInfo2 != null ? bLiveAuctionUserInfo2.hashCode() : 0)) * 41;
        String str = this.f44334id;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
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
        if (this.f44334id == null) {
            this.f44334id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
