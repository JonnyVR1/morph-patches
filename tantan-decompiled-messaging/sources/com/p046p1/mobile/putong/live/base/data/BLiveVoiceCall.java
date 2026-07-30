package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
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
public class BLiveVoiceCall extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCall.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCall.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCall newInstance() {
            return new BLiveVoiceCall();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceCall bLiveVoiceCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -2023617739:
                    if (str.equals("popularity")) {
                        b = 1;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 2;
                    }
                    break;
                case -1180647624:
                    if (str.equals("isAway")) {
                        b = 3;
                    }
                    break;
                case -1180446222:
                    if (str.equals("isHost")) {
                        b = 4;
                    }
                    break;
                case -1016963242:
                    if (str.equals("userNameGradientColors")) {
                        b = 5;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 6;
                    }
                    break;
                case -891467845:
                    if (str.equals("inAction")) {
                        b = 7;
                    }
                    break;
                case -879608141:
                    if (str.equals("userPicture")) {
                        b = 8;
                    }
                    break;
                case -673588592:
                    if (str.equals("userRecvRewardPoint")) {
                        b = 9;
                    }
                    break;
                case -421991506:
                    if (str.equals("userSendRewardPoint")) {
                        b = 10;
                    }
                    break;
                case -269693191:
                    if (str.equals("voiceLiveId")) {
                        b = 11;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 12;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3506294:
                    if (str.equals("role")) {
                        b = 14;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 15;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 17;
                    }
                    break;
                case 324507767:
                    if (str.equals("mutedByAnchor")) {
                        b = 18;
                    }
                    break;
                case 631413252:
                    if (str.equals("inviteId")) {
                        b = 19;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = 20;
                    }
                    break;
                case 1174430095:
                    if (str.equals("callEffect")) {
                        b = 21;
                    }
                    break;
                case 1291627657:
                    if (str.equals("anchorPicture")) {
                        b = 22;
                    }
                    break;
                case 1375970320:
                    if (str.equals("contribution")) {
                        b = 23;
                    }
                    break;
                case 1462389261:
                    if (str.equals("mutedByUser")) {
                        b = 24;
                    }
                    break;
                case 1513626417:
                    if (str.equals("hangupReason")) {
                        b = 25;
                    }
                    break;
                case 1785853650:
                    if (str.equals("awayReason")) {
                        b = 26;
                    }
                    break;
                case 1840572373:
                    if (str.equals("intendPosition")) {
                        b = 27;
                    }
                    break;
                case 1849204427:
                    if (str.equals("anchorUserName")) {
                        b = 28;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceCall.startTime = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceCall.popularity = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    bLiveVoiceCall.anchor = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 3:
                    bLiveVoiceCall.isAway = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    bLiveVoiceCall.isHost = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveVoiceCall.userNameGradientColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveVoiceCall.source = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoiceCall.inAction = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVoiceCall.userPicture = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveVoiceCall.userRecvRewardPoint = jsonParser.getValueAsLong();
                    return true;
                case 10:
                    bLiveVoiceCall.userSendRewardPoint = jsonParser.getValueAsLong();
                    return true;
                case 11:
                    bLiveVoiceCall.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoiceCall.userName = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceCall.f44485id = jsonParser.getValueAsString();
                    return false;
                case 14:
                    bLiveVoiceCall.role = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveVoiceCall.type = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveVoiceCall.user = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 17:
                    bLiveVoiceCall.state = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveVoiceCall.mutedByAnchor = jsonParser.getValueAsBoolean();
                    return true;
                case 19:
                    bLiveVoiceCall.inviteId = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveVoiceCall.position = jsonParser.getValueAsInt();
                    return true;
                case 21:
                    bLiveVoiceCall.callEffect = BLiveCallEffectConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveVoiceCall.anchorPicture = jsonParser.getValueAsString();
                    return true;
                case 23:
                    bLiveVoiceCall.contribution = jsonParser.getValueAsLong();
                    return true;
                case 24:
                    bLiveVoiceCall.mutedByUser = jsonParser.getValueAsBoolean();
                    return true;
                case 25:
                    bLiveVoiceCall.hangupReason = jsonParser.getValueAsString();
                    return true;
                case 26:
                    bLiveVoiceCall.awayReason = jsonParser.getValueAsString();
                    return true;
                case 27:
                    bLiveVoiceCall.intendPosition = jsonParser.getValueAsInt();
                    return true;
                case 28:
                    bLiveVoiceCall.anchorUserName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCall bLiveVoiceCall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCall.f44485id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceCall.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveVoiceCall.voiceLiveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str3);
            }
            String str4 = bLiveVoiceCall.state;
            if (str4 != null) {
                jsonGenerator.writeStringField("state", str4);
            }
            String str5 = bLiveVoiceCall.source;
            if (str5 != null) {
                jsonGenerator.writeStringField("source", str5);
            }
            if (bLiveVoiceCall.user != null) {
                jsonGenerator.writeFieldName("user");
                Converter.USER_ID.serialize(bLiveVoiceCall.user, jsonGenerator, true);
            }
            if (bLiveVoiceCall.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                Converter.USER_ID.serialize(bLiveVoiceCall.anchor, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("userSendRewardPoint", bLiveVoiceCall.userSendRewardPoint);
            jsonGenerator.writeNumberField("userRecvRewardPoint", bLiveVoiceCall.userRecvRewardPoint);
            jsonGenerator.writeNumberField("intendPosition", bLiveVoiceCall.intendPosition);
            jsonGenerator.writeNumberField("position", bLiveVoiceCall.position);
            jsonGenerator.writeBooleanField("mutedByUser", bLiveVoiceCall.mutedByUser);
            jsonGenerator.writeBooleanField("mutedByAnchor", bLiveVoiceCall.mutedByAnchor);
            jsonGenerator.writeBooleanField("isAway", bLiveVoiceCall.isAway);
            String str6 = bLiveVoiceCall.inviteId;
            if (str6 != null) {
                jsonGenerator.writeStringField("inviteId", str6);
            }
            String str7 = bLiveVoiceCall.userName;
            if (str7 != null) {
                jsonGenerator.writeStringField("userName", str7);
            }
            String str8 = bLiveVoiceCall.anchorUserName;
            if (str8 != null) {
                jsonGenerator.writeStringField("anchorUserName", str8);
            }
            String str9 = bLiveVoiceCall.userPicture;
            if (str9 != null) {
                jsonGenerator.writeStringField("userPicture", str9);
            }
            String str10 = bLiveVoiceCall.anchorPicture;
            if (str10 != null) {
                jsonGenerator.writeStringField("anchorPicture", str10);
            }
            String str11 = bLiveVoiceCall.hangupReason;
            if (str11 != null) {
                jsonGenerator.writeStringField("hangupReason", str11);
            }
            String str12 = bLiveVoiceCall.role;
            if (str12 != null) {
                jsonGenerator.writeStringField("role", str12);
            }
            String str13 = bLiveVoiceCall.awayReason;
            if (str13 != null) {
                jsonGenerator.writeStringField("awayReason", str13);
            }
            String str14 = bLiveVoiceCall.startTime;
            if (str14 != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.startTime, str14);
            }
            String str15 = bLiveVoiceCall.inAction;
            if (str15 != null) {
                jsonGenerator.writeStringField("inAction", str15);
            }
            jsonGenerator.writeNumberField("popularity", bLiveVoiceCall.popularity);
            jsonGenerator.writeNumberField("contribution", bLiveVoiceCall.contribution);
            jsonGenerator.writeBooleanField("isHost", bLiveVoiceCall.isHost);
            if (bLiveVoiceCall.callEffect != null) {
                jsonGenerator.writeFieldName("callEffect");
                BLiveCallEffectConfig.JSON_ADAPTER.serialize(bLiveVoiceCall.callEffect, jsonGenerator, true);
            }
            if (bLiveVoiceCall.userNameGradientColors != null) {
                jsonGenerator.writeFieldName("userNameGradientColors");
                JsonAdapter.serializeArray(bLiveVoiceCall.userNameGradientColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecall";

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
    public String awayReason;

    @Nullable
    @ProtobufIndex(index = 28)
    public BLiveCallEffectConfig callEffect;

    @ProtobufIndex(index = 26)
    public long contribution;

    @NonNull
    @ProtobufIndex(index = 20)
    public String hangupReason;
    public BLiveVoiceCallHatInfo hatInfo;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44485id;

    @NonNull
    @ProtobufIndex(index = 24)
    public String inAction;

    @ProtobufIndex(index = 10)
    public int intendPosition;

    @NonNull
    @ProtobufIndex(index = 15)
    public String inviteId;

    @ProtobufIndex(index = 14)
    public boolean isAway;

    @ProtobufIndex(index = 27)
    public boolean isHost;
    public boolean isSpeak;
    public boolean isVoiceGaming;

    @ProtobufIndex(index = 13)
    public boolean mutedByAnchor;

    @ProtobufIndex(index = 12)
    public boolean mutedByUser;
    public BLiveVoicePkCallInfo pkCallInfo;
    public BLiveKtvPlayInfoStatus playInfoStatus = BLiveKtvPlayInfoStatus.get("unknown_");
    public String pointType;

    @ProtobufIndex(index = 25)
    public long popularity;

    @ProtobufIndex(index = 11)
    public int position;

    @NonNull
    @ProtobufIndex(index = 21)
    public String role;

    @NonNull
    @ProtobufIndex(index = 5)
    public String source;

    @NonNull
    @ProtobufIndex(index = 23)
    public String startTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String state;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 6)
    public String user;

    @NonNull
    @ProtobufIndex(index = 16)
    public String userName;

    @NonNull
    @ProtobufIndex(index = 29)
    public List<String> userNameGradientColors;

    @NonNull
    @ProtobufIndex(index = 18)
    public String userPicture;

    @ProtobufIndex(index = 9)
    public long userRecvRewardPoint;

    @ProtobufIndex(index = 8)
    public long userSendRewardPoint;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceLiveId;
    public float volume;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68346a(String str) {
        return str;
    }

    public static BLiveVoiceCall newInstance(String str, String str2, String str3, int i, String str4) {
        BLiveVoiceCall bLiveVoiceCallNew_ = new_();
        bLiveVoiceCallNew_.voiceLiveId = str;
        bLiveVoiceCallNew_.inviteId = str2;
        bLiveVoiceCallNew_.source = str3;
        bLiveVoiceCallNew_.intendPosition = i;
        bLiveVoiceCallNew_.role = str4;
        return bLiveVoiceCallNew_;
    }

    public static BLiveVoiceCall new_() {
        BLiveVoiceCall bLiveVoiceCall = new BLiveVoiceCall();
        bLiveVoiceCall.nullCheck();
        return bLiveVoiceCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCall mo223809clone() {
        BLiveVoiceCall bLiveVoiceCall = new BLiveVoiceCall();
        bLiveVoiceCall.f44485id = this.f44485id;
        bLiveVoiceCall.type = this.type;
        bLiveVoiceCall.voiceLiveId = this.voiceLiveId;
        bLiveVoiceCall.state = this.state;
        bLiveVoiceCall.source = this.source;
        bLiveVoiceCall.user = this.user;
        bLiveVoiceCall.anchor = this.anchor;
        bLiveVoiceCall.userSendRewardPoint = this.userSendRewardPoint;
        bLiveVoiceCall.userRecvRewardPoint = this.userRecvRewardPoint;
        bLiveVoiceCall.intendPosition = this.intendPosition;
        bLiveVoiceCall.position = this.position;
        bLiveVoiceCall.mutedByUser = this.mutedByUser;
        bLiveVoiceCall.mutedByAnchor = this.mutedByAnchor;
        bLiveVoiceCall.isAway = this.isAway;
        bLiveVoiceCall.inviteId = this.inviteId;
        bLiveVoiceCall.userName = this.userName;
        bLiveVoiceCall.anchorUserName = this.anchorUserName;
        bLiveVoiceCall.userPicture = this.userPicture;
        bLiveVoiceCall.anchorPicture = this.anchorPicture;
        bLiveVoiceCall.hangupReason = this.hangupReason;
        bLiveVoiceCall.role = this.role;
        bLiveVoiceCall.awayReason = this.awayReason;
        bLiveVoiceCall.startTime = this.startTime;
        bLiveVoiceCall.inAction = this.inAction;
        bLiveVoiceCall.popularity = this.popularity;
        bLiveVoiceCall.contribution = this.contribution;
        bLiveVoiceCall.isHost = this.isHost;
        BLiveCallEffectConfig bLiveCallEffectConfig = this.callEffect;
        if (bLiveCallEffectConfig != null) {
            bLiveVoiceCall.callEffect = bLiveCallEffectConfig.mo223809clone();
        }
        List<String> list = this.userNameGradientColors;
        if (list != null) {
            bLiveVoiceCall.userNameGradientColors = ValueObject.util_map(list, new w9j() { // from class: l.d82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceCall.m68346a((String) obj);
                }
            });
        }
        return bLiveVoiceCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCall)) {
            return false;
        }
        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
        return ValueObject.util_equals(this.f44485id, bLiveVoiceCall.f44485id) && ValueObject.util_equals(this.type, bLiveVoiceCall.type) && ValueObject.util_equals(this.voiceLiveId, bLiveVoiceCall.voiceLiveId) && ValueObject.util_equals(this.state, bLiveVoiceCall.state) && ValueObject.util_equals(this.source, bLiveVoiceCall.source) && ValueObject.util_equals(this.user, bLiveVoiceCall.user) && ValueObject.util_equals(this.anchor, bLiveVoiceCall.anchor) && this.userSendRewardPoint == bLiveVoiceCall.userSendRewardPoint && this.userRecvRewardPoint == bLiveVoiceCall.userRecvRewardPoint && this.intendPosition == bLiveVoiceCall.intendPosition && this.position == bLiveVoiceCall.position && this.mutedByUser == bLiveVoiceCall.mutedByUser && this.mutedByAnchor == bLiveVoiceCall.mutedByAnchor && this.isAway == bLiveVoiceCall.isAway && ValueObject.util_equals(this.inviteId, bLiveVoiceCall.inviteId) && ValueObject.util_equals(this.userName, bLiveVoiceCall.userName) && ValueObject.util_equals(this.anchorUserName, bLiveVoiceCall.anchorUserName) && ValueObject.util_equals(this.userPicture, bLiveVoiceCall.userPicture) && ValueObject.util_equals(this.anchorPicture, bLiveVoiceCall.anchorPicture) && ValueObject.util_equals(this.hangupReason, bLiveVoiceCall.hangupReason) && ValueObject.util_equals(this.role, bLiveVoiceCall.role) && ValueObject.util_equals(this.awayReason, bLiveVoiceCall.awayReason) && ValueObject.util_equals(this.startTime, bLiveVoiceCall.startTime) && ValueObject.util_equals(this.inAction, bLiveVoiceCall.inAction) && this.popularity == bLiveVoiceCall.popularity && this.contribution == bLiveVoiceCall.contribution && this.isHost == bLiveVoiceCall.isHost && ValueObject.util_equals(this.callEffect, bLiveVoiceCall.callEffect) && ValueObject.util_equals(this.userNameGradientColors, bLiveVoiceCall.userNameGradientColors);
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
        String str = this.f44485id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceLiveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.state;
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
        String str13 = this.hangupReason;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.role;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.awayReason;
        int iHashCode15 = (iHashCode14 + (str15 != null ? str15.hashCode() : 0)) * 41;
        String str16 = this.startTime;
        int iHashCode16 = (iHashCode15 + (str16 != null ? str16.hashCode() : 0)) * 41;
        String str17 = this.inAction;
        int iHashCode17 = str17 != null ? str17.hashCode() : 0;
        long j3 = this.popularity;
        int i5 = (((iHashCode16 + iHashCode17) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.contribution;
        int i6 = (((i5 + ((int) (j4 ^ (j4 >>> 32)))) * 41) + (this.isHost ? 1231 : 1237)) * 41;
        BLiveCallEffectConfig bLiveCallEffectConfig = this.callEffect;
        int iHashCode18 = (i6 + (bLiveCallEffectConfig != null ? bLiveCallEffectConfig.hashCode() : 0)) * 41;
        List<String> list = this.userNameGradientColors;
        int iHashCode19 = iHashCode18 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44485id == null) {
            this.f44485id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.state == null) {
            this.state = "";
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
        if (this.role == null) {
            this.role = "";
        }
        if (this.awayReason == null) {
            this.awayReason = "";
        }
        if (this.startTime == null) {
            this.startTime = "";
        }
        if (this.inAction == null) {
            this.inAction = "";
        }
        if (this.userNameGradientColors == null) {
            this.userNameGradientColors = new ArrayList();
        }
    }

    public BLiveVoiceCall setGrabHatGameInfo(BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo) {
        this.hatInfo = bLiveVoiceCallHatInfo;
        return this;
    }

    public BLiveVoiceCall setPointType(String str) {
        this.pointType = str;
        return this;
    }

    public BLiveVoiceCall setVoiceGameStatus(boolean z) {
        this.isVoiceGaming = z;
        return this;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
