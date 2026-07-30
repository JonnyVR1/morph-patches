package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCall extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCall.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCall.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCall newInstance() {
            return new BLiveCall();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveCall bLiveCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1866195887:
                    if (str.equals("videoInviteTime")) {
                        b = 0;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 1;
                    }
                    break;
                case -1281925296:
                    if (str.equals("fakeId")) {
                        b = 2;
                    }
                    break;
                case -1279636688:
                    if (str.equals("opState")) {
                        b = 3;
                    }
                    break;
                case -1180647624:
                    if (str.equals("isAway")) {
                        b = 4;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 5;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 6;
                    }
                    break;
                case -879608141:
                    if (str.equals("userPicture")) {
                        b = 7;
                    }
                    break;
                case -673588592:
                    if (str.equals("userRecvRewardPoint")) {
                        b = 8;
                    }
                    break;
                case -421991506:
                    if (str.equals("userSendRewardPoint")) {
                        b = 9;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 10;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 11;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        b = 12;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 324507767:
                    if (str.equals("mutedByAnchor")) {
                        b = 14;
                    }
                    break;
                case 631413252:
                    if (str.equals("inviteId")) {
                        b = 15;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1291627657:
                    if (str.equals("anchorPicture")) {
                        b = 17;
                    }
                    break;
                case 1462389261:
                    if (str.equals("mutedByUser")) {
                        b = 18;
                    }
                    break;
                case 1513626417:
                    if (str.equals("hangupReason")) {
                        b = 19;
                    }
                    break;
                case 1840572373:
                    if (str.equals("intendPosition")) {
                        b = 20;
                    }
                    break;
                case 1849204427:
                    if (str.equals("anchorUserName")) {
                        b = 21;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveCall.videoInviteTime = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    bLiveCall.anchor = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 2:
                    bLiveCall.fakeId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveCall.opState = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveCall.isAway = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveCall.liveId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveCall.source = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveCall.userPicture = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveCall.userRecvRewardPoint = jsonParser.getValueAsLong();
                    return true;
                case 9:
                    bLiveCall.userSendRewardPoint = jsonParser.getValueAsLong();
                    return true;
                case 10:
                    bLiveCall.userName = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveCall.f45190id = jsonParser.getValueAsString();
                    return false;
                case 12:
                    bLiveCall.user = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 13:
                    bLiveCall.state = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveCall.mutedByAnchor = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    bLiveCall.inviteId = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveCall.position = jsonParser.getValueAsInt();
                    return true;
                case 17:
                    bLiveCall.anchorPicture = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveCall.mutedByUser = jsonParser.getValueAsBoolean();
                    return true;
                case 19:
                    bLiveCall.hangupReason = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveCall.intendPosition = jsonParser.getValueAsInt();
                    return true;
                case 21:
                    bLiveCall.anchorUserName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCall bLiveCall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCall.f45190id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveCall.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = bLiveCall.state;
            if (str3 != null) {
                jsonGenerator.writeStringField("state", str3);
            }
            String str4 = bLiveCall.opState;
            if (str4 != null) {
                jsonGenerator.writeStringField("opState", str4);
            }
            String str5 = bLiveCall.source;
            if (str5 != null) {
                jsonGenerator.writeStringField("source", str5);
            }
            if (bLiveCall.user != null) {
                jsonGenerator.writeFieldName("user");
                Converter.USER_ID.serialize(bLiveCall.user, jsonGenerator, true);
            }
            if (bLiveCall.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                Converter.USER_ID.serialize(bLiveCall.anchor, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("userSendRewardPoint", bLiveCall.userSendRewardPoint);
            jsonGenerator.writeNumberField("userRecvRewardPoint", bLiveCall.userRecvRewardPoint);
            jsonGenerator.writeNumberField("intendPosition", bLiveCall.intendPosition);
            jsonGenerator.writeNumberField("position", bLiveCall.position);
            jsonGenerator.writeBooleanField("mutedByUser", bLiveCall.mutedByUser);
            jsonGenerator.writeBooleanField("mutedByAnchor", bLiveCall.mutedByAnchor);
            jsonGenerator.writeBooleanField("isAway", bLiveCall.isAway);
            String str6 = bLiveCall.inviteId;
            if (str6 != null) {
                jsonGenerator.writeStringField("inviteId", str6);
            }
            String str7 = bLiveCall.userName;
            if (str7 != null) {
                jsonGenerator.writeStringField("userName", str7);
            }
            String str8 = bLiveCall.anchorUserName;
            if (str8 != null) {
                jsonGenerator.writeStringField("anchorUserName", str8);
            }
            String str9 = bLiveCall.userPicture;
            if (str9 != null) {
                jsonGenerator.writeStringField("userPicture", str9);
            }
            String str10 = bLiveCall.anchorPicture;
            if (str10 != null) {
                jsonGenerator.writeStringField("anchorPicture", str10);
            }
            jsonGenerator.writeNumberField("videoInviteTime", bLiveCall.videoInviteTime);
            String str11 = bLiveCall.hangupReason;
            if (str11 != null) {
                jsonGenerator.writeStringField("hangupReason", str11);
            }
            String str12 = bLiveCall.fakeId;
            if (str12 != null) {
                jsonGenerator.writeStringField("fakeId", str12);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecall";

    @NonNull
    @ProtobufIndex(index = 7)
    public String anchor;

    @NonNull
    @ProtobufIndex(index = 19)
    public String anchorPicture;

    @NonNull
    @ProtobufIndex(index = 17)
    public String anchorUserName;

    @NonNull
    @ProtobufIndex(index = 22)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 21)
    public String hangupReason;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45190id;

    @ProtobufIndex(index = 10)
    public int intendPosition;

    @NonNull
    @ProtobufIndex(index = 15)
    public String inviteId;

    @ProtobufIndex(index = 14)
    public boolean isAway;
    public boolean isSpeak;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveId;

    @ProtobufIndex(index = 13)
    public boolean mutedByAnchor;

    @ProtobufIndex(index = 12)
    public boolean mutedByUser;

    @NonNull
    @ProtobufIndex(index = 4)
    public String opState;

    @ProtobufIndex(index = 11)
    public int position;

    @NonNull
    @ProtobufIndex(index = 5)
    public String source;

    @NonNull
    @ProtobufIndex(index = 3)
    public String state;

    @NonNull
    @ProtobufIndex(index = 6)
    public String user;

    @NonNull
    @ProtobufIndex(index = 16)
    public String userName;

    @NonNull
    @ProtobufIndex(index = 18)
    public String userPicture;

    @ProtobufIndex(index = 9)
    public long userRecvRewardPoint;

    @ProtobufIndex(index = 8)
    public long userSendRewardPoint;

    @ProtobufIndex(index = 20)
    public long videoInviteTime;
    public float volume;

    public static BLiveCall new_() {
        BLiveCall bLiveCall = new BLiveCall();
        bLiveCall.nullCheck();
        return bLiveCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCall mo225055clone() {
        BLiveCall bLiveCall = new BLiveCall();
        bLiveCall.f45190id = this.f45190id;
        bLiveCall.liveId = this.liveId;
        bLiveCall.state = this.state;
        bLiveCall.opState = this.opState;
        bLiveCall.source = this.source;
        bLiveCall.user = this.user;
        bLiveCall.anchor = this.anchor;
        bLiveCall.userSendRewardPoint = this.userSendRewardPoint;
        bLiveCall.userRecvRewardPoint = this.userRecvRewardPoint;
        bLiveCall.intendPosition = this.intendPosition;
        bLiveCall.position = this.position;
        bLiveCall.mutedByUser = this.mutedByUser;
        bLiveCall.mutedByAnchor = this.mutedByAnchor;
        bLiveCall.isAway = this.isAway;
        bLiveCall.inviteId = this.inviteId;
        bLiveCall.userName = this.userName;
        bLiveCall.anchorUserName = this.anchorUserName;
        bLiveCall.userPicture = this.userPicture;
        bLiveCall.anchorPicture = this.anchorPicture;
        bLiveCall.videoInviteTime = this.videoInviteTime;
        bLiveCall.hangupReason = this.hangupReason;
        bLiveCall.fakeId = this.fakeId;
        return bLiveCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCall)) {
            return false;
        }
        BLiveCall bLiveCall = (BLiveCall) obj;
        return ValueObject.util_equals(this.f45190id, bLiveCall.f45190id) && ValueObject.util_equals(this.liveId, bLiveCall.liveId) && ValueObject.util_equals(this.state, bLiveCall.state) && ValueObject.util_equals(this.opState, bLiveCall.opState) && ValueObject.util_equals(this.source, bLiveCall.source) && ValueObject.util_equals(this.user, bLiveCall.user) && ValueObject.util_equals(this.anchor, bLiveCall.anchor) && this.userSendRewardPoint == bLiveCall.userSendRewardPoint && this.userRecvRewardPoint == bLiveCall.userRecvRewardPoint && this.intendPosition == bLiveCall.intendPosition && this.position == bLiveCall.position && this.mutedByUser == bLiveCall.mutedByUser && this.mutedByAnchor == bLiveCall.mutedByAnchor && this.isAway == bLiveCall.isAway && ValueObject.util_equals(this.inviteId, bLiveCall.inviteId) && ValueObject.util_equals(this.userName, bLiveCall.userName) && ValueObject.util_equals(this.anchorUserName, bLiveCall.anchorUserName) && ValueObject.util_equals(this.userPicture, bLiveCall.userPicture) && ValueObject.util_equals(this.anchorPicture, bLiveCall.anchorPicture) && this.videoInviteTime == bLiveCall.videoInviteTime && ValueObject.util_equals(this.hangupReason, bLiveCall.hangupReason) && ValueObject.util_equals(this.fakeId, bLiveCall.fakeId);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int getDeputyViewPos() {
        return this.position - 1;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f45190id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.state;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.opState;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.source;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.user;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.anchor;
        int iHashCode7 = str7 != null ? str7.hashCode() : 0;
        long j = this.userSendRewardPoint;
        int i3 = (((iHashCode6 + iHashCode7) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.userRecvRewardPoint;
        int i4 = (((((((((((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.intendPosition) * 41) + this.position) * 41) + (this.mutedByUser ? 1231 : 1237)) * 41) + (this.mutedByAnchor ? 1231 : 1237)) * 41) + (this.isAway ? 1231 : 1237)) * 41;
        String str8 = this.inviteId;
        int iHashCode8 = (i4 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.userName;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.anchorUserName;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.userPicture;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.anchorPicture;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        long j3 = this.videoInviteTime;
        int i5 = (iHashCode12 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str13 = this.hangupReason;
        int iHashCode13 = (i5 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.fakeId;
        int iHashCode14 = iHashCode13 + (str14 != null ? str14.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45190id == null) {
            this.f45190id = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.opState == null) {
            this.opState = "";
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.user == null) {
            this.user = "";
        }
        if (this.anchor == null) {
            this.anchor = "";
        }
        if (this.inviteId == null) {
            this.inviteId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.anchorUserName == null) {
            this.anchorUserName = "";
        }
        if (this.userPicture == null) {
            this.userPicture = "";
        }
        if (this.anchorPicture == null) {
            this.anchorPicture = "";
        }
        if (this.hangupReason == null) {
            this.hangupReason = "";
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
