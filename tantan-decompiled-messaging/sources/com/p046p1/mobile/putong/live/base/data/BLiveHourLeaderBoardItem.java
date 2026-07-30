package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveHourLeaderBoardItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHourLeaderBoardItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHourLeaderBoardItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHourLeaderBoardItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHourLeaderBoardItem newInstance() {
            return new BLiveHourLeaderBoardItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1893613215:
                    if (str.equals("backgroundUrl")) {
                        b = 0;
                    }
                    break;
                case -1566476766:
                    if (str.equals("anchorGrade")) {
                        b = 1;
                    }
                    break;
                case -1413853096:
                    if (str.equals("amount")) {
                        b = 2;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 3;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 4;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 5;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 6;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 7;
                    }
                    break;
                case 96511:
                    if (str.equals(SeeTextDynamicParam.age)) {
                        b = 8;
                    }
                    break;
                case 102102:
                    if (str.equals("gap")) {
                        b = 9;
                    }
                    break;
                case 3492908:
                    if (str.equals(BLivePkCategory.rank)) {
                        b = 10;
                    }
                    break;
                case 318993488:
                    if (str.equals("userImage")) {
                        b = 11;
                    }
                    break;
                case 997906181:
                    if (str.equals("liveState")) {
                        b = 12;
                    }
                    break;
                case 1343750747:
                    if (str.equals("msgType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1417629570:
                    if (str.equals("liveRole")) {
                        b = 14;
                    }
                    break;
                case 1417698886:
                    if (str.equals("liveType")) {
                        b = 15;
                    }
                    break;
                case 2105875433:
                    if (str.equals("currentHourSuggestConfig")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveHourLeaderBoardItem.backgroundUrl = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveHourLeaderBoardItem.anchorGrade = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    bLiveHourLeaderBoardItem.amount = jsonParser.getValueAsLong();
                    return true;
                case 3:
                    bLiveHourLeaderBoardItem.gender = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveHourLeaderBoardItem.liveId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveHourLeaderBoardItem.roomId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveHourLeaderBoardItem.userId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveHourLeaderBoardItem.userName = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveHourLeaderBoardItem.age = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    bLiveHourLeaderBoardItem.gap = jsonParser.getValueAsLong();
                    return true;
                case 10:
                    bLiveHourLeaderBoardItem.rank = jsonParser.getValueAsLong();
                    return true;
                case 11:
                    bLiveHourLeaderBoardItem.userImage = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveHourLeaderBoardItem.liveState = BLiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 13:
                    bLiveHourLeaderBoardItem.msgType = BLiveRankingMsgType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 14:
                    bLiveHourLeaderBoardItem.liveRole = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveHourLeaderBoardItem.liveType = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveHourLeaderBoardItem.currentHourSuggestConfig = BLiveCurrentHourSuggestConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveHourLeaderBoardItem.rank);
            String str = bLiveHourLeaderBoardItem.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveHourLeaderBoardItem.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveHourLeaderBoardItem.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            String str4 = bLiveHourLeaderBoardItem.userImage;
            if (str4 != null) {
                jsonGenerator.writeStringField("userImage", str4);
            }
            String str5 = bLiveHourLeaderBoardItem.userName;
            if (str5 != null) {
                jsonGenerator.writeStringField("userName", str5);
            }
            jsonGenerator.writeNumberField("amount", bLiveHourLeaderBoardItem.amount);
            if (bLiveHourLeaderBoardItem.liveState != null) {
                jsonGenerator.writeFieldName("liveState");
                BLiveState.JSON_ADAPTER.serialize(bLiveHourLeaderBoardItem.liveState, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("gap", bLiveHourLeaderBoardItem.gap);
            if (bLiveHourLeaderBoardItem.currentHourSuggestConfig != null) {
                jsonGenerator.writeFieldName("currentHourSuggestConfig");
                BLiveCurrentHourSuggestConfig.JSON_ADAPTER.serialize(bLiveHourLeaderBoardItem.currentHourSuggestConfig, jsonGenerator, true);
            }
            if (bLiveHourLeaderBoardItem.msgType != null) {
                jsonGenerator.writeFieldName("msgType");
                BLiveRankingMsgType.JSON_ADAPTER.serialize(bLiveHourLeaderBoardItem.msgType, jsonGenerator, true);
            }
            String str6 = bLiveHourLeaderBoardItem.liveType;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveType", str6);
            }
            String str7 = bLiveHourLeaderBoardItem.liveRole;
            if (str7 != null) {
                jsonGenerator.writeStringField("liveRole", str7);
            }
            String str8 = bLiveHourLeaderBoardItem.gender;
            if (str8 != null) {
                jsonGenerator.writeStringField("gender", str8);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, bLiveHourLeaderBoardItem.age);
            jsonGenerator.writeNumberField("anchorGrade", bLiveHourLeaderBoardItem.anchorGrade);
            String str9 = bLiveHourLeaderBoardItem.backgroundUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("backgroundUrl", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHourLeaderBoardItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivehourleaderboarditem";

    @ProtobufIndex(index = 17)
    public int age;

    @ProtobufIndex(index = 7)
    public long amount;

    @ProtobufIndex(index = 18)
    public int anchorGrade;

    @NonNull
    @ProtobufIndex(index = 19)
    public String backgroundUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveCurrentHourSuggestConfig currentHourSuggestConfig;

    @ProtobufIndex(index = 9)
    public long gap;

    @NonNull
    @ProtobufIndex(index = 16)
    public String gender;
    public boolean isFooter;
    public boolean isOpen;
    public boolean isOwn;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 15)
    public String liveRole;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveState liveState;

    @NonNull
    @ProtobufIndex(index = 14)
    public String liveType;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLiveRankingMsgType msgType;

    @ProtobufIndex(index = 1)
    public long rank;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userName;

    public static BLiveHourLeaderBoardItem new_() {
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = new BLiveHourLeaderBoardItem();
        bLiveHourLeaderBoardItem.nullCheck();
        return bLiveHourLeaderBoardItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHourLeaderBoardItem mo223809clone() {
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = new BLiveHourLeaderBoardItem();
        bLiveHourLeaderBoardItem.rank = this.rank;
        bLiveHourLeaderBoardItem.userId = this.userId;
        bLiveHourLeaderBoardItem.roomId = this.roomId;
        bLiveHourLeaderBoardItem.liveId = this.liveId;
        bLiveHourLeaderBoardItem.userImage = this.userImage;
        bLiveHourLeaderBoardItem.userName = this.userName;
        bLiveHourLeaderBoardItem.amount = this.amount;
        bLiveHourLeaderBoardItem.liveState = this.liveState;
        bLiveHourLeaderBoardItem.gap = this.gap;
        BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig = this.currentHourSuggestConfig;
        if (bLiveCurrentHourSuggestConfig != null) {
            bLiveHourLeaderBoardItem.currentHourSuggestConfig = bLiveCurrentHourSuggestConfig.mo223809clone();
        }
        bLiveHourLeaderBoardItem.msgType = this.msgType;
        bLiveHourLeaderBoardItem.liveType = this.liveType;
        bLiveHourLeaderBoardItem.liveRole = this.liveRole;
        bLiveHourLeaderBoardItem.gender = this.gender;
        bLiveHourLeaderBoardItem.age = this.age;
        bLiveHourLeaderBoardItem.anchorGrade = this.anchorGrade;
        bLiveHourLeaderBoardItem.backgroundUrl = this.backgroundUrl;
        return bLiveHourLeaderBoardItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHourLeaderBoardItem)) {
            return false;
        }
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = (BLiveHourLeaderBoardItem) obj;
        return this.rank == bLiveHourLeaderBoardItem.rank && ValueObject.util_equals(this.userId, bLiveHourLeaderBoardItem.userId) && ValueObject.util_equals(this.roomId, bLiveHourLeaderBoardItem.roomId) && ValueObject.util_equals(this.liveId, bLiveHourLeaderBoardItem.liveId) && ValueObject.util_equals(this.userImage, bLiveHourLeaderBoardItem.userImage) && ValueObject.util_equals(this.userName, bLiveHourLeaderBoardItem.userName) && this.amount == bLiveHourLeaderBoardItem.amount && ValueObject.util_equals(this.liveState, bLiveHourLeaderBoardItem.liveState) && this.gap == bLiveHourLeaderBoardItem.gap && ValueObject.util_equals(this.currentHourSuggestConfig, bLiveHourLeaderBoardItem.currentHourSuggestConfig) && ValueObject.util_equals(this.msgType, bLiveHourLeaderBoardItem.msgType) && ValueObject.util_equals(this.liveType, bLiveHourLeaderBoardItem.liveType) && ValueObject.util_equals(this.liveRole, bLiveHourLeaderBoardItem.liveRole) && ValueObject.util_equals(this.gender, bLiveHourLeaderBoardItem.gender) && this.age == bLiveHourLeaderBoardItem.age && this.anchorGrade == bLiveHourLeaderBoardItem.anchorGrade && ValueObject.util_equals(this.backgroundUrl, bLiveHourLeaderBoardItem.backgroundUrl);
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
        long j = this.rank;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userImage;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userName;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        long j2 = this.amount;
        int i3 = (((iHashCode4 + iHashCode5) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        BLiveState bLiveState = this.liveState;
        int iHashCode6 = bLiveState != null ? bLiveState.hashCode() : 0;
        long j3 = this.gap;
        int i4 = (((i3 + iHashCode6) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig = this.currentHourSuggestConfig;
        int iHashCode7 = (i4 + (bLiveCurrentHourSuggestConfig != null ? bLiveCurrentHourSuggestConfig.hashCode() : 0)) * 41;
        BLiveRankingMsgType bLiveRankingMsgType = this.msgType;
        int iHashCode8 = (iHashCode7 + (bLiveRankingMsgType != null ? bLiveRankingMsgType.hashCode() : 0)) * 41;
        String str6 = this.liveType;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.liveRole;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.gender;
        int iHashCode11 = (((((iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 41) + this.age) * 41) + this.anchorGrade) * 41;
        String str9 = this.backgroundUrl;
        int iHashCode12 = iHashCode11 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.liveState == null) {
            this.liveState = (BLiveState) BLiveState.JSON_ADAPTER.defaultEnum();
        }
        if (this.currentHourSuggestConfig == null) {
            this.currentHourSuggestConfig = BLiveCurrentHourSuggestConfig.new_();
        }
        if (this.msgType == null) {
            this.msgType = (BLiveRankingMsgType) BLiveRankingMsgType.JSON_ADAPTER.defaultEnum();
        }
        if (this.liveType == null) {
            this.liveType = "";
        }
        if (this.liveRole == null) {
            this.liveRole = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.backgroundUrl == null) {
            this.backgroundUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
