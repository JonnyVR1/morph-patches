package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
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
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveMultiCall extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCall.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCall.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCall newInstance() {
            return new BLiveMultiCall();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveMultiCall bLiveMultiCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2109702805:
                    if (str.equals("mutedByUserIds")) {
                        b = 0;
                    }
                    break;
                case -1936711486:
                    if (str.equals("showSeconds")) {
                        b = 1;
                    }
                    break;
                case -1180647624:
                    if (str.equals("isAway")) {
                        b = 2;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 3;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 4;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 5;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 6;
                    }
                    break;
                case -786782583:
                    if (str.equals("pushRemainCount")) {
                        b = 7;
                    }
                    break;
                case -457114694:
                    if (str.equals("ownerLiveId")) {
                        b = 8;
                    }
                    break;
                case -279999511:
                    if (str.equals("ownerRoomId")) {
                        b = 9;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 10;
                    }
                    break;
                case -190711079:
                    if (str.equals("ownerUserId")) {
                        b = 11;
                    }
                    break;
                case -31608064:
                    if (str.equals("receivedRewardPoint")) {
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
                case 50511102:
                    if (str.equals("category")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 17;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = 18;
                    }
                    break;
                case 767175996:
                    if (str.equals("isLeadRole")) {
                        b = 19;
                    }
                    break;
                case 949810362:
                    if (str.equals("refreshPushStreamUrl")) {
                        b = 20;
                    }
                    break;
                case 1078154500:
                    if (str.equals("userAvatar")) {
                        b = 21;
                    }
                    break;
                case 1248824298:
                    if (str.equals("ownerMultiCallOrder")) {
                        b = 22;
                    }
                    break;
                case 1722551876:
                    if (str.equals("maxCallNum")) {
                        b = 23;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveMultiCall.mutedByUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveMultiCall.showSeconds = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    bLiveMultiCall.isAway = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    bLiveMultiCall.liveId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveMultiCall.roomId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveMultiCall.source = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveMultiCall.userId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveMultiCall.pushRemainCount = jsonParser.getValueAsLong();
                    return true;
                case 8:
                    bLiveMultiCall.ownerLiveId = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveMultiCall.ownerRoomId = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveMultiCall.userName = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveMultiCall.ownerUserId = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveMultiCall.receivedRewardPoint = jsonParser.getValueAsLong();
                    return true;
                case 13:
                    bLiveMultiCall.f45248id = jsonParser.getValueAsString();
                    return false;
                case 14:
                    bLiveMultiCall.role = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveMultiCall.type = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveMultiCall.category = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveMultiCall.state = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveMultiCall.position = jsonParser.getValueAsInt();
                    return true;
                case 19:
                    bLiveMultiCall.isLeadRole = jsonParser.getValueAsBoolean();
                    return true;
                case 20:
                    bLiveMultiCall.refreshPushStreamUrl = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveMultiCall.userAvatar = jsonParser.getValueAsString();
                    return true;
                case 22:
                    bLiveMultiCall.ownerMultiCallOrder = jsonParser.getValueAsString();
                    return true;
                case 23:
                    bLiveMultiCall.maxCallNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCall bLiveMultiCall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiCall.f45248id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiCall.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveMultiCall.ownerUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("ownerUserId", str3);
            }
            String str4 = bLiveMultiCall.ownerRoomId;
            if (str4 != null) {
                jsonGenerator.writeStringField("ownerRoomId", str4);
            }
            String str5 = bLiveMultiCall.ownerLiveId;
            if (str5 != null) {
                jsonGenerator.writeStringField("ownerLiveId", str5);
            }
            String str6 = bLiveMultiCall.ownerMultiCallOrder;
            if (str6 != null) {
                jsonGenerator.writeStringField("ownerMultiCallOrder", str6);
            }
            String str7 = bLiveMultiCall.userId;
            if (str7 != null) {
                jsonGenerator.writeStringField("userId", str7);
            }
            String str8 = bLiveMultiCall.userName;
            if (str8 != null) {
                jsonGenerator.writeStringField("userName", str8);
            }
            String str9 = bLiveMultiCall.userAvatar;
            if (str9 != null) {
                jsonGenerator.writeStringField("userAvatar", str9);
            }
            String str10 = bLiveMultiCall.role;
            if (str10 != null) {
                jsonGenerator.writeStringField("role", str10);
            }
            String str11 = bLiveMultiCall.roomId;
            if (str11 != null) {
                jsonGenerator.writeStringField("roomId", str11);
            }
            String str12 = bLiveMultiCall.liveId;
            if (str12 != null) {
                jsonGenerator.writeStringField("liveId", str12);
            }
            String str13 = bLiveMultiCall.category;
            if (str13 != null) {
                jsonGenerator.writeStringField("category", str13);
            }
            String str14 = bLiveMultiCall.source;
            if (str14 != null) {
                jsonGenerator.writeStringField("source", str14);
            }
            jsonGenerator.writeNumberField("position", bLiveMultiCall.position);
            String str15 = bLiveMultiCall.state;
            if (str15 != null) {
                jsonGenerator.writeStringField("state", str15);
            }
            jsonGenerator.writeNumberField("receivedRewardPoint", bLiveMultiCall.receivedRewardPoint);
            jsonGenerator.writeBooleanField("isAway", bLiveMultiCall.isAway);
            if (bLiveMultiCall.mutedByUserIds != null) {
                jsonGenerator.writeFieldName("mutedByUserIds");
                JsonAdapter.serializeArray(bLiveMultiCall.mutedByUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("showSeconds", bLiveMultiCall.showSeconds);
            jsonGenerator.writeNumberField("pushRemainCount", bLiveMultiCall.pushRemainCount);
            jsonGenerator.writeBooleanField("isLeadRole", bLiveMultiCall.isLeadRole);
            jsonGenerator.writeNumberField("maxCallNum", bLiveMultiCall.maxCallNum);
            String str16 = bLiveMultiCall.refreshPushStreamUrl;
            if (str16 != null) {
                jsonGenerator.writeStringField("refreshPushStreamUrl", str16);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticall";

    @NonNull
    @ProtobufIndex(index = 13)
    public String category;

    @Nullable
    public Followship followship;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45248id;

    @ProtobufIndex(index = 18)
    public boolean isAway;

    @ProtobufIndex(index = 22)
    public boolean isLeadRole;

    @NonNull
    @ProtobufIndex(index = 12)
    public String liveId;

    @ProtobufIndex(index = 23)
    public int maxCallNum;

    @NonNull
    @ProtobufIndex(index = 19)
    public List<String> mutedByUserIds;

    @NonNull
    @ProtobufIndex(index = 5)
    public String ownerLiveId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String ownerMultiCallOrder;

    @NonNull
    @ProtobufIndex(index = 4)
    public String ownerRoomId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String ownerUserId;

    @ProtobufIndex(index = 15)
    public int position;

    @ProtobufIndex(index = 21)
    public long pushRemainCount;

    @ProtobufIndex(index = 17)
    public long receivedRewardPoint;

    @NonNull
    @ProtobufIndex(index = 24)
    public String refreshPushStreamUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public String role;

    @NonNull
    @ProtobufIndex(index = 11)
    public String roomId;

    @ProtobufIndex(index = 20)
    public long showSeconds;

    @NonNull
    @ProtobufIndex(index = 14)
    public String source;

    @NonNull
    @ProtobufIndex(index = 16)
    public String state;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 9)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 7)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String userName;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69251a(String str) {
        return str;
    }

    public static BLiveMultiCall new_() {
        BLiveMultiCall bLiveMultiCall = new BLiveMultiCall();
        bLiveMultiCall.nullCheck();
        return bLiveMultiCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCall mo225055clone() {
        BLiveMultiCall bLiveMultiCall = new BLiveMultiCall();
        bLiveMultiCall.f45248id = this.f45248id;
        bLiveMultiCall.type = this.type;
        bLiveMultiCall.ownerUserId = this.ownerUserId;
        bLiveMultiCall.ownerRoomId = this.ownerRoomId;
        bLiveMultiCall.ownerLiveId = this.ownerLiveId;
        bLiveMultiCall.ownerMultiCallOrder = this.ownerMultiCallOrder;
        bLiveMultiCall.userId = this.userId;
        bLiveMultiCall.userName = this.userName;
        bLiveMultiCall.userAvatar = this.userAvatar;
        bLiveMultiCall.role = this.role;
        bLiveMultiCall.roomId = this.roomId;
        bLiveMultiCall.liveId = this.liveId;
        bLiveMultiCall.category = this.category;
        bLiveMultiCall.source = this.source;
        bLiveMultiCall.position = this.position;
        bLiveMultiCall.state = this.state;
        bLiveMultiCall.receivedRewardPoint = this.receivedRewardPoint;
        bLiveMultiCall.isAway = this.isAway;
        List<String> list = this.mutedByUserIds;
        if (list != null) {
            bLiveMultiCall.mutedByUserIds = ValueObject.util_map(list, new qcj() { // from class: l.d32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveMultiCall.m69251a((String) obj);
                }
            });
        }
        bLiveMultiCall.showSeconds = this.showSeconds;
        bLiveMultiCall.pushRemainCount = this.pushRemainCount;
        bLiveMultiCall.isLeadRole = this.isLeadRole;
        bLiveMultiCall.maxCallNum = this.maxCallNum;
        bLiveMultiCall.refreshPushStreamUrl = this.refreshPushStreamUrl;
        return bLiveMultiCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCall)) {
            return false;
        }
        BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) obj;
        return ValueObject.util_equals(this.f45248id, bLiveMultiCall.f45248id) && ValueObject.util_equals(this.type, bLiveMultiCall.type) && ValueObject.util_equals(this.ownerUserId, bLiveMultiCall.ownerUserId) && ValueObject.util_equals(this.ownerRoomId, bLiveMultiCall.ownerRoomId) && ValueObject.util_equals(this.ownerLiveId, bLiveMultiCall.ownerLiveId) && ValueObject.util_equals(this.ownerMultiCallOrder, bLiveMultiCall.ownerMultiCallOrder) && ValueObject.util_equals(this.userId, bLiveMultiCall.userId) && ValueObject.util_equals(this.userName, bLiveMultiCall.userName) && ValueObject.util_equals(this.userAvatar, bLiveMultiCall.userAvatar) && ValueObject.util_equals(this.role, bLiveMultiCall.role) && ValueObject.util_equals(this.roomId, bLiveMultiCall.roomId) && ValueObject.util_equals(this.liveId, bLiveMultiCall.liveId) && ValueObject.util_equals(this.category, bLiveMultiCall.category) && ValueObject.util_equals(this.source, bLiveMultiCall.source) && this.position == bLiveMultiCall.position && ValueObject.util_equals(this.state, bLiveMultiCall.state) && this.receivedRewardPoint == bLiveMultiCall.receivedRewardPoint && this.isAway == bLiveMultiCall.isAway && ValueObject.util_equals(this.mutedByUserIds, bLiveMultiCall.mutedByUserIds) && this.showSeconds == bLiveMultiCall.showSeconds && this.pushRemainCount == bLiveMultiCall.pushRemainCount && this.isLeadRole == bLiveMultiCall.isLeadRole && this.maxCallNum == bLiveMultiCall.maxCallNum && ValueObject.util_equals(this.refreshPushStreamUrl, bLiveMultiCall.refreshPushStreamUrl);
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
        String str = this.f45248id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.ownerUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.ownerRoomId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.ownerLiveId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.ownerMultiCallOrder;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.userId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.userName;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.userAvatar;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.role;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.roomId;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.liveId;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.category;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.source;
        int iHashCode14 = (((iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 41) + this.position) * 41;
        String str15 = this.state;
        int iHashCode15 = str15 != null ? str15.hashCode() : 0;
        long j = this.receivedRewardPoint;
        int i3 = (((((iHashCode14 + iHashCode15) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.isAway ? 1231 : 1237)) * 41;
        List<String> list = this.mutedByUserIds;
        int iHashCode16 = list != null ? list.hashCode() : 0;
        long j2 = this.showSeconds;
        int i4 = (((i3 + iHashCode16) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.pushRemainCount;
        int i5 = (((((i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41) + (this.isLeadRole ? 1231 : 1237)) * 41) + this.maxCallNum) * 41;
        String str16 = this.refreshPushStreamUrl;
        int iHashCode17 = i5 + (str16 != null ? str16.hashCode() : 0);
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    public boolean isMatched() {
        Followship followship = this.followship;
        return followship != null && TEnum.equals(followship.state, "matched");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45248id == null) {
            this.f45248id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.ownerUserId == null) {
            this.ownerUserId = "";
        }
        if (this.ownerRoomId == null) {
            this.ownerRoomId = "";
        }
        if (this.ownerLiveId == null) {
            this.ownerLiveId = "";
        }
        if (this.ownerMultiCallOrder == null) {
            this.ownerMultiCallOrder = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.role == null) {
            this.role = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.mutedByUserIds == null) {
            this.mutedByUserIds = new ArrayList();
        }
        if (this.refreshPushStreamUrl == null) {
            this.refreshPushStreamUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
