package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionLeader;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceAuction extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceAuction> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceAuction>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceAuction.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceAuction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceAuction newInstance() {
            return new BLiveVoiceAuction();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceAuction bLiveVoiceAuction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2039177499:
                    if (str.equals("myLeaderboardGap")) {
                        b = 0;
                    }
                    break;
                case -1786361505:
                    if (str.equals("auctionRelation")) {
                        b = 1;
                    }
                    break;
                case -1483017116:
                    if (str.equals("panelBgId")) {
                        b = 2;
                    }
                    break;
                case -1348630378:
                    if (str.equals("leaderboards")) {
                        b = 3;
                    }
                    break;
                case -1254849020:
                    if (str.equals("currentUserQueueState")) {
                        b = 4;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 5;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 6;
                    }
                    break;
                case -888151613:
                    if (str.equals("guestUser")) {
                        b = 7;
                    }
                    break;
                case -797073047:
                    if (str.equals("panelBg")) {
                        b = 8;
                    }
                    break;
                case -784356895:
                    if (str.equals("tagImage")) {
                        b = 9;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 10;
                    }
                    break;
                case 102865796:
                    if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                        b = 11;
                    }
                    break;
                case 109757182:
                    if (str.equals("stage")) {
                        b = 12;
                    }
                    break;
                case 113319054:
                    if (str.equals("worth")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 698454739:
                    if (str.equals("isChoosingPledgeRelation")) {
                        b = 14;
                    }
                    break;
                case 795843258:
                    if (str.equals("worthBubble")) {
                        b = 15;
                    }
                    break;
                case 1221662550:
                    if (str.equals("updateTimeInSec")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1856776362:
                    if (str.equals("winnerUser")) {
                        b = 17;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceAuction.myLeaderboardGap = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    bLiveVoiceAuction.auctionRelation = BLiveAuctionRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveVoiceAuction.panelBgId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceAuction.leaderboards = JsonAdapter.parseArray(jsonParser, BLiveAuctionLeader.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveVoiceAuction.currentUserQueueState = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveVoiceAuction.liveId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoiceAuction.roomId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoiceAuction.guestUser = BLiveAuctionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveVoiceAuction.panelBg = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveVoiceAuction.tagImage = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveVoiceAuction.f44482id = jsonParser.getValueAsString();
                    return false;
                case 11:
                    bLiveVoiceAuction.level = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    bLiveVoiceAuction.stage = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceAuction.worth = jsonParser.getValueAsLong();
                    return true;
                case 14:
                    bLiveVoiceAuction.isChoosingPledgeRelation = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    bLiveVoiceAuction.worthBubble = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveVoiceAuction.updateTimeInSec = jsonParser.getValueAsLong();
                    return true;
                case 17:
                    bLiveVoiceAuction.winnerUser = BLiveAuctionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceAuction bLiveVoiceAuction, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceAuction.f44482id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceAuction.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = bLiveVoiceAuction.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            jsonGenerator.writeNumberField("worth", bLiveVoiceAuction.worth);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveVoiceAuction.level);
            String str4 = bLiveVoiceAuction.panelBg;
            if (str4 != null) {
                jsonGenerator.writeStringField("panelBg", str4);
            }
            String str5 = bLiveVoiceAuction.currentUserQueueState;
            if (str5 != null) {
                jsonGenerator.writeStringField("currentUserQueueState", str5);
            }
            String str6 = bLiveVoiceAuction.stage;
            if (str6 != null) {
                jsonGenerator.writeStringField("stage", str6);
            }
            if (bLiveVoiceAuction.auctionRelation != null) {
                jsonGenerator.writeFieldName("auctionRelation");
                BLiveAuctionRelation.JSON_ADAPTER.serialize(bLiveVoiceAuction.auctionRelation, jsonGenerator, true);
            }
            if (bLiveVoiceAuction.guestUser != null) {
                jsonGenerator.writeFieldName("guestUser");
                BLiveAuctionUserInfo.JSON_ADAPTER.serialize(bLiveVoiceAuction.guestUser, jsonGenerator, true);
            }
            if (bLiveVoiceAuction.winnerUser != null) {
                jsonGenerator.writeFieldName("winnerUser");
                BLiveAuctionUserInfo.JSON_ADAPTER.serialize(bLiveVoiceAuction.winnerUser, jsonGenerator, true);
            }
            if (bLiveVoiceAuction.leaderboards != null) {
                jsonGenerator.writeFieldName("leaderboards");
                JsonAdapter.serializeArray(bLiveVoiceAuction.leaderboards, jsonGenerator, BLiveAuctionLeader.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("updateTimeInSec", bLiveVoiceAuction.updateTimeInSec);
            String str7 = bLiveVoiceAuction.panelBgId;
            if (str7 != null) {
                jsonGenerator.writeStringField("panelBgId", str7);
            }
            jsonGenerator.writeNumberField("myLeaderboardGap", bLiveVoiceAuction.myLeaderboardGap);
            String str8 = bLiveVoiceAuction.worthBubble;
            if (str8 != null) {
                jsonGenerator.writeStringField("worthBubble", str8);
            }
            jsonGenerator.writeBooleanField("isChoosingPledgeRelation", bLiveVoiceAuction.isChoosingPledgeRelation);
            String str9 = bLiveVoiceAuction.tagImage;
            if (str9 != null) {
                jsonGenerator.writeStringField("tagImage", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceAuction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceauction";

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveAuctionRelation auctionRelation;

    @NonNull
    @ProtobufIndex(index = 9)
    public String currentUserQueueState;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLiveAuctionUserInfo guestUser;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44482id;

    @ProtobufIndex(index = 17)
    public boolean isChoosingPledgeRelation;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveAuctionLeader> leaderboards;

    @ProtobufIndex(index = 7)
    public int level;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @ProtobufIndex(index = 15)
    public long myLeaderboardGap;

    @NonNull
    @ProtobufIndex(index = 8)
    public String panelBg;

    @NonNull
    @ProtobufIndex(index = 14)
    public String panelBgId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String stage;

    @NonNull
    @ProtobufIndex(index = 18)
    public String tagImage;

    @ProtobufIndex(index = 13)
    public long updateTimeInSec;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveAuctionUserInfo winnerUser;

    @ProtobufIndex(index = 6)
    public long worth;

    @NonNull
    @ProtobufIndex(index = 16)
    public String worthBubble;

    public static BLiveVoiceAuction new_() {
        BLiveVoiceAuction bLiveVoiceAuction = new BLiveVoiceAuction();
        bLiveVoiceAuction.nullCheck();
        return bLiveVoiceAuction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceAuction mo223809clone() {
        BLiveVoiceAuction bLiveVoiceAuction = new BLiveVoiceAuction();
        bLiveVoiceAuction.f44482id = this.f44482id;
        bLiveVoiceAuction.liveId = this.liveId;
        bLiveVoiceAuction.roomId = this.roomId;
        bLiveVoiceAuction.worth = this.worth;
        bLiveVoiceAuction.level = this.level;
        bLiveVoiceAuction.panelBg = this.panelBg;
        bLiveVoiceAuction.currentUserQueueState = this.currentUserQueueState;
        bLiveVoiceAuction.stage = this.stage;
        BLiveAuctionRelation bLiveAuctionRelation = this.auctionRelation;
        if (bLiveAuctionRelation != null) {
            bLiveVoiceAuction.auctionRelation = bLiveAuctionRelation.mo223809clone();
        }
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.guestUser;
        if (bLiveAuctionUserInfo != null) {
            bLiveVoiceAuction.guestUser = bLiveAuctionUserInfo.mo223809clone();
        }
        BLiveAuctionUserInfo bLiveAuctionUserInfo2 = this.winnerUser;
        if (bLiveAuctionUserInfo2 != null) {
            bLiveVoiceAuction.winnerUser = bLiveAuctionUserInfo2.mo223809clone();
        }
        List<BLiveAuctionLeader> list = this.leaderboards;
        if (list != null) {
            bLiveVoiceAuction.leaderboards = ValueObject.util_map(list, new w9j() { // from class: l.z72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveAuctionLeader) obj).mo223809clone();
                }
            });
        }
        bLiveVoiceAuction.updateTimeInSec = this.updateTimeInSec;
        bLiveVoiceAuction.panelBgId = this.panelBgId;
        bLiveVoiceAuction.myLeaderboardGap = this.myLeaderboardGap;
        bLiveVoiceAuction.worthBubble = this.worthBubble;
        bLiveVoiceAuction.isChoosingPledgeRelation = this.isChoosingPledgeRelation;
        bLiveVoiceAuction.tagImage = this.tagImage;
        return bLiveVoiceAuction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceAuction)) {
            return false;
        }
        BLiveVoiceAuction bLiveVoiceAuction = (BLiveVoiceAuction) obj;
        return ValueObject.util_equals(this.f44482id, bLiveVoiceAuction.f44482id) && ValueObject.util_equals(this.liveId, bLiveVoiceAuction.liveId) && ValueObject.util_equals(this.roomId, bLiveVoiceAuction.roomId) && this.worth == bLiveVoiceAuction.worth && this.level == bLiveVoiceAuction.level && ValueObject.util_equals(this.panelBg, bLiveVoiceAuction.panelBg) && ValueObject.util_equals(this.currentUserQueueState, bLiveVoiceAuction.currentUserQueueState) && ValueObject.util_equals(this.stage, bLiveVoiceAuction.stage) && ValueObject.util_equals(this.auctionRelation, bLiveVoiceAuction.auctionRelation) && ValueObject.util_equals(this.guestUser, bLiveVoiceAuction.guestUser) && ValueObject.util_equals(this.winnerUser, bLiveVoiceAuction.winnerUser) && ValueObject.util_equals(this.leaderboards, bLiveVoiceAuction.leaderboards) && this.updateTimeInSec == bLiveVoiceAuction.updateTimeInSec && ValueObject.util_equals(this.panelBgId, bLiveVoiceAuction.panelBgId) && this.myLeaderboardGap == bLiveVoiceAuction.myLeaderboardGap && ValueObject.util_equals(this.worthBubble, bLiveVoiceAuction.worthBubble) && this.isChoosingPledgeRelation == bLiveVoiceAuction.isChoosingPledgeRelation && ValueObject.util_equals(this.tagImage, bLiveVoiceAuction.tagImage);
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
        String str = this.f44482id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.worth;
        int i3 = (((((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.level) * 41;
        String str4 = this.panelBg;
        int iHashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.currentUserQueueState;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.stage;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveAuctionRelation bLiveAuctionRelation = this.auctionRelation;
        int iHashCode7 = (iHashCode6 + (bLiveAuctionRelation != null ? bLiveAuctionRelation.hashCode() : 0)) * 41;
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.guestUser;
        int iHashCode8 = (iHashCode7 + (bLiveAuctionUserInfo != null ? bLiveAuctionUserInfo.hashCode() : 0)) * 41;
        BLiveAuctionUserInfo bLiveAuctionUserInfo2 = this.winnerUser;
        int iHashCode9 = (iHashCode8 + (bLiveAuctionUserInfo2 != null ? bLiveAuctionUserInfo2.hashCode() : 0)) * 41;
        List<BLiveAuctionLeader> list = this.leaderboards;
        int iHashCode10 = (iHashCode9 + (list != null ? list.hashCode() : 0)) * 41;
        long j2 = this.updateTimeInSec;
        int i4 = (iHashCode10 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str7 = this.panelBgId;
        int iHashCode11 = (i4 + (str7 != null ? str7.hashCode() : 0)) * 41;
        long j3 = this.myLeaderboardGap;
        int i5 = (iHashCode11 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str8 = this.worthBubble;
        int iHashCode12 = (((i5 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.isChoosingPledgeRelation ? 1231 : 1237)) * 41;
        String str9 = this.tagImage;
        int iHashCode13 = iHashCode12 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44482id == null) {
            this.f44482id = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.panelBg == null) {
            this.panelBg = "";
        }
        if (this.currentUserQueueState == null) {
            this.currentUserQueueState = "";
        }
        if (this.stage == null) {
            this.stage = "";
        }
        if (this.auctionRelation == null) {
            this.auctionRelation = BLiveAuctionRelation.new_();
        }
        if (this.guestUser == null) {
            this.guestUser = BLiveAuctionUserInfo.new_();
        }
        if (this.winnerUser == null) {
            this.winnerUser = BLiveAuctionUserInfo.new_();
        }
        if (this.leaderboards == null) {
            this.leaderboards = new ArrayList();
        }
        if (this.panelBgId == null) {
            this.panelBgId = "";
        }
        if (this.worthBubble == null) {
            this.worthBubble = "";
        }
        if (this.tagImage == null) {
            this.tagImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
