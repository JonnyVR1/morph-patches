package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatUser;
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
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVideoChat extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChat> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChat>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChat.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChat newInstance() {
            return new BLiveVideoChat();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVideoChat bLiveVideoChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1741794777:
                    if (str.equals("endTipMessage")) {
                        b = 0;
                    }
                    break;
                case -1607227723:
                    if (str.equals("endType")) {
                        b = 1;
                    }
                    break;
                case -1446021330:
                    if (str.equals("anchorCallId")) {
                        b = 2;
                    }
                    break;
                case -1367775363:
                    if (str.equals("called")) {
                        b = 3;
                    }
                    break;
                case -1366499602:
                    if (str.equals("startedTime")) {
                        b = 4;
                    }
                    break;
                case -1246042517:
                    if (str.equals("giftId")) {
                        b = 5;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 6;
                    }
                    break;
                case -971181392:
                    if (str.equals("anchorId")) {
                        b = 7;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 8;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 9;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 10;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 11;
                    }
                    break;
                case -493567566:
                    if (str.equals("players")) {
                        b = 12;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 14;
                    }
                    break;
                case 115171:
                    if (str.equals("ttc")) {
                        b = 15;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        b = 17;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVideoChat.endTipMessage = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVideoChat.endType = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVideoChat.anchorCallId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVideoChat.called = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    bLiveVideoChat.startedTime = jsonParser.getValueAsLong();
                    return true;
                case 5:
                    bLiveVideoChat.giftId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVideoChat.liveId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVideoChat.anchorId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVideoChat.roomId = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveVideoChat.source = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveVideoChat.status = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVideoChat.userId = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVideoChat.players = JsonAdapter.parseArray(jsonParser, BLiveVideoChatUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLiveVideoChat.createdTime = jsonParser.getValueAsLong();
                    return true;
                case 14:
                    bLiveVideoChat.f45322id = jsonParser.getValueAsString();
                    return false;
                case 15:
                    bLiveVideoChat.ttc = jsonParser.getValueAsLong();
                    return true;
                case 16:
                    bLiveVideoChat.category = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveVideoChat.media = BLiveVideoQualityConf.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChat bLiveVideoChat, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVideoChat.f45322id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVideoChat.anchorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorId", str2);
            }
            String str3 = bLiveVideoChat.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveVideoChat.liveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveId", str4);
            }
            String str5 = bLiveVideoChat.roomId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomId", str5);
            }
            String str6 = bLiveVideoChat.status;
            if (str6 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str6);
            }
            jsonGenerator.writeNumberField("startedTime", bLiveVideoChat.startedTime);
            jsonGenerator.writeNumberField("createdTime", bLiveVideoChat.createdTime);
            if (bLiveVideoChat.media != null) {
                jsonGenerator.writeFieldName("media");
                BLiveVideoQualityConf.JSON_ADAPTER.serialize(bLiveVideoChat.media, jsonGenerator, true);
            }
            String str7 = bLiveVideoChat.giftId;
            if (str7 != null) {
                jsonGenerator.writeStringField("giftId", str7);
            }
            jsonGenerator.writeNumberField("ttc", bLiveVideoChat.ttc);
            if (bLiveVideoChat.players != null) {
                jsonGenerator.writeFieldName("players");
                JsonAdapter.serializeArray(bLiveVideoChat.players, jsonGenerator, BLiveVideoChatUser.JSON_ADAPTER);
            }
            String str8 = bLiveVideoChat.endType;
            if (str8 != null) {
                jsonGenerator.writeStringField("endType", str8);
            }
            jsonGenerator.writeBooleanField("called", bLiveVideoChat.called);
            String str9 = bLiveVideoChat.endTipMessage;
            if (str9 != null) {
                jsonGenerator.writeStringField("endTipMessage", str9);
            }
            String str10 = bLiveVideoChat.anchorCallId;
            if (str10 != null) {
                jsonGenerator.writeStringField("anchorCallId", str10);
            }
            String str11 = bLiveVideoChat.source;
            if (str11 != null) {
                jsonGenerator.writeStringField("source", str11);
            }
            String str12 = bLiveVideoChat.category;
            if (str12 != null) {
                jsonGenerator.writeStringField("category", str12);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochat";

    @NonNull
    @ProtobufIndex(index = 16)
    public String anchorCallId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorId;

    @ProtobufIndex(index = 14)
    public boolean called;

    @NonNull
    @ProtobufIndex(index = 18)
    public String category;

    @ProtobufIndex(index = 8)
    public long createdTime;

    @NonNull
    @ProtobufIndex(index = 15)
    public String endTipMessage;

    @NonNull
    @ProtobufIndex(index = 13)
    public String endType;

    @NonNull
    @ProtobufIndex(index = 10)
    public String giftId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45322id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLiveVideoQualityConf media;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<BLiveVideoChatUser> players;

    @NonNull
    @ProtobufIndex(index = 5)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 17)
    public String source;

    @ProtobufIndex(index = 7)
    public long startedTime;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;

    @ProtobufIndex(index = 11)
    public long ttc;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$getAnchor$0(BLiveVideoChatUser bLiveVideoChatUser) {
        return Boolean.valueOf(TextUtils.equals(bLiveVideoChatUser.userId, this.anchorId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$getAttendee$1(BLiveVideoChatUser bLiveVideoChatUser) {
        return Boolean.valueOf(!TextUtils.equals(bLiveVideoChatUser.userId, this.anchorId));
    }

    public static BLiveVideoChat new_() {
        BLiveVideoChat bLiveVideoChat = new BLiveVideoChat();
        bLiveVideoChat.nullCheck();
        return bLiveVideoChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChat mo225055clone() {
        BLiveVideoChat bLiveVideoChat = new BLiveVideoChat();
        bLiveVideoChat.f45322id = this.f45322id;
        bLiveVideoChat.anchorId = this.anchorId;
        bLiveVideoChat.userId = this.userId;
        bLiveVideoChat.liveId = this.liveId;
        bLiveVideoChat.roomId = this.roomId;
        bLiveVideoChat.status = this.status;
        bLiveVideoChat.startedTime = this.startedTime;
        bLiveVideoChat.createdTime = this.createdTime;
        BLiveVideoQualityConf bLiveVideoQualityConf = this.media;
        if (bLiveVideoQualityConf != null) {
            bLiveVideoChat.media = bLiveVideoQualityConf.mo225055clone();
        }
        bLiveVideoChat.giftId = this.giftId;
        bLiveVideoChat.ttc = this.ttc;
        List<BLiveVideoChatUser> list = this.players;
        if (list != null) {
            bLiveVideoChat.players = ValueObject.util_map(list, new qcj() { // from class: l.c82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVideoChatUser) obj).mo225055clone();
                }
            });
        }
        bLiveVideoChat.endType = this.endType;
        bLiveVideoChat.called = this.called;
        bLiveVideoChat.endTipMessage = this.endTipMessage;
        bLiveVideoChat.anchorCallId = this.anchorCallId;
        bLiveVideoChat.source = this.source;
        bLiveVideoChat.category = this.category;
        return bLiveVideoChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChat)) {
            return false;
        }
        BLiveVideoChat bLiveVideoChat = (BLiveVideoChat) obj;
        return ValueObject.util_equals(this.f45322id, bLiveVideoChat.f45322id) && ValueObject.util_equals(this.anchorId, bLiveVideoChat.anchorId) && ValueObject.util_equals(this.userId, bLiveVideoChat.userId) && ValueObject.util_equals(this.liveId, bLiveVideoChat.liveId) && ValueObject.util_equals(this.roomId, bLiveVideoChat.roomId) && ValueObject.util_equals(this.status, bLiveVideoChat.status) && this.startedTime == bLiveVideoChat.startedTime && this.createdTime == bLiveVideoChat.createdTime && ValueObject.util_equals(this.media, bLiveVideoChat.media) && ValueObject.util_equals(this.giftId, bLiveVideoChat.giftId) && this.ttc == bLiveVideoChat.ttc && ValueObject.util_equals(this.players, bLiveVideoChat.players) && ValueObject.util_equals(this.endType, bLiveVideoChat.endType) && this.called == bLiveVideoChat.called && ValueObject.util_equals(this.endTipMessage, bLiveVideoChat.endTipMessage) && ValueObject.util_equals(this.anchorCallId, bLiveVideoChat.anchorCallId) && ValueObject.util_equals(this.source, bLiveVideoChat.source) && ValueObject.util_equals(this.category, bLiveVideoChat.category);
    }

    public BLiveVideoChatUser getAnchor() {
        if (jyb.m147479J(this.players)) {
            return BLiveVideoChatUser.new_();
        }
        BLiveVideoChatUser bLiveVideoChatUser = (BLiveVideoChatUser) jyb.m147529r(this.players, new qcj() { // from class: l.a82
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68883a.lambda$getAnchor$0((BLiveVideoChatUser) obj);
            }
        });
        return bLiveVideoChatUser == null ? BLiveVideoChatUser.new_() : bLiveVideoChatUser;
    }

    public BLiveVideoChatUser getAttendee() {
        if (jyb.m147479J(this.players)) {
            return BLiveVideoChatUser.new_();
        }
        BLiveVideoChatUser bLiveVideoChatUser = (BLiveVideoChatUser) jyb.m147529r(this.players, new qcj() { // from class: l.b82
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f75394a.lambda$getAttendee$1((BLiveVideoChatUser) obj);
            }
        });
        return bLiveVideoChatUser == null ? BLiveVideoChatUser.new_() : bLiveVideoChatUser;
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
        String str = this.f45322id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.roomId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.status;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        long j = this.startedTime;
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.createdTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        BLiveVideoQualityConf bLiveVideoQualityConf = this.media;
        int iHashCode7 = (i4 + (bLiveVideoQualityConf != null ? bLiveVideoQualityConf.hashCode() : 0)) * 41;
        String str7 = this.giftId;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        long j3 = this.ttc;
        int i5 = (iHashCode8 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        List<BLiveVideoChatUser> list = this.players;
        int iHashCode9 = (i5 + (list != null ? list.hashCode() : 0)) * 41;
        String str8 = this.endType;
        int iHashCode10 = (((iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.called ? 1231 : 1237)) * 41;
        String str9 = this.endTipMessage;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.anchorCallId;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.source;
        int iHashCode13 = (iHashCode12 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.category;
        int iHashCode14 = iHashCode13 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45322id == null) {
            this.f45322id = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.media == null) {
            this.media = BLiveVideoQualityConf.new_();
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.players == null) {
            this.players = new ArrayList();
        }
        if (this.endType == null) {
            this.endType = "";
        }
        if (this.endTipMessage == null) {
            this.endTipMessage = "";
        }
        if (this.anchorCallId == null) {
            this.anchorCallId = "";
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
