package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Medal;
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
public class BLiveChatMessage extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatMessage> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatMessage>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatMessage.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatMessage newInstance() {
            return new BLiveChatMessage();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveChatMessage bLiveChatMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2025529933:
                    if (str.equals("preTimestamp")) {
                        b = 0;
                    }
                    break;
                case -1342675823:
                    if (str.equals("starlightHierarchy")) {
                        b = 1;
                    }
                    break;
                case -1321546630:
                    if (str.equals("template")) {
                        b = 2;
                    }
                    break;
                case -1306498449:
                    if (str.equals("extInfo")) {
                        b = 3;
                    }
                    break;
                case -1179850988:
                    if (str.equals("chatShadingConfig")) {
                        b = 4;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 5;
                    }
                    break;
                case -980129092:
                    if (str.equals("preSeq")) {
                        b = 6;
                    }
                    break;
                case -941115737:
                    if (str.equals("sharedVoiceLiveInfo")) {
                        b = 7;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 8;
                    }
                    break;
                case -903690839:
                    if (str.equals("userIdentity")) {
                        b = 9;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 10;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 11;
                    }
                    break;
                case -265713450:
                    if (str.equals("username")) {
                        b = 12;
                    }
                    break;
                case 3277:
                    if (str.equals(BLiveOperationClickAction.f45265h5)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 113759:
                    if (str.equals("seq")) {
                        b = 14;
                    }
                    break;
                case 3172656:
                    if (str.equals("gift")) {
                        b = 15;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 103771895:
                    if (str.equals(Medal.TYPE)) {
                        b = 17;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 18;
                    }
                    break;
                case 2115146293:
                    if (str.equals("hierarchy")) {
                        b = 19;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveChatMessage.preTimestamp = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    bLiveChatMessage.starlightHierarchy = BLiveStarlightHierarchy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveChatMessage.template = BLiveTemplateData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveChatMessage.extInfo = BLiveChatExtInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveChatMessage.chatShadingConfig = BLiveChatShadingConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveChatMessage.liveId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveChatMessage.preSeq = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveChatMessage.sharedVoiceLiveInfo = BLiveSharedVoiceLiveInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveChatMessage.roomId = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveChatMessage.userIdentity = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveChatMessage.userId = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveChatMessage.createdTime = jsonParser.getValueAsLong();
                    return true;
                case 12:
                    bLiveChatMessage.username = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveChatMessage.f45197h5 = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveChatMessage.seq = jsonParser.getValueAsInt();
                    return true;
                case 15:
                    bLiveChatMessage.gift = BLiveGiftMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    bLiveChatMessage.type = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveChatMessage.medal = BLiveMessageUserMedal.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    bLiveChatMessage.value = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLiveChatMessage.hierarchy = BLiveUserLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatMessage bLiveChatMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveChatMessage.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            jsonGenerator.writeNumberField("seq", bLiveChatMessage.seq);
            String str2 = bLiveChatMessage.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveChatMessage.username;
            if (str3 != null) {
                jsonGenerator.writeStringField("username", str3);
            }
            String str4 = bLiveChatMessage.value;
            if (str4 != null) {
                jsonGenerator.writeStringField("value", str4);
            }
            if (bLiveChatMessage.gift != null) {
                jsonGenerator.writeFieldName("gift");
                BLiveGiftMessage.JSON_ADAPTER.serialize(bLiveChatMessage.gift, jsonGenerator, true);
            }
            if (bLiveChatMessage.template != null) {
                jsonGenerator.writeFieldName("template");
                BLiveTemplateData.JSON_ADAPTER.serialize(bLiveChatMessage.template, jsonGenerator, true);
            }
            String str5 = bLiveChatMessage.f45197h5;
            if (str5 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.f45265h5, str5);
            }
            String str6 = bLiveChatMessage.liveId;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveId", str6);
            }
            if (bLiveChatMessage.medal != null) {
                jsonGenerator.writeFieldName(Medal.TYPE);
                BLiveMessageUserMedal.JSON_ADAPTER.serialize(bLiveChatMessage.medal, jsonGenerator, true);
            }
            if (bLiveChatMessage.hierarchy != null) {
                jsonGenerator.writeFieldName("hierarchy");
                BLiveUserLevel.JSON_ADAPTER.serialize(bLiveChatMessage.hierarchy, jsonGenerator, true);
            }
            if (bLiveChatMessage.extInfo != null) {
                jsonGenerator.writeFieldName("extInfo");
                BLiveChatExtInfo.JSON_ADAPTER.serialize(bLiveChatMessage.extInfo, jsonGenerator, true);
            }
            if (bLiveChatMessage.chatShadingConfig != null) {
                jsonGenerator.writeFieldName("chatShadingConfig");
                BLiveChatShadingConfig.JSON_ADAPTER.serialize(bLiveChatMessage.chatShadingConfig, jsonGenerator, true);
            }
            String str7 = bLiveChatMessage.type;
            if (str7 != null) {
                jsonGenerator.writeStringField("type", str7);
            }
            if (bLiveChatMessage.sharedVoiceLiveInfo != null) {
                jsonGenerator.writeFieldName("sharedVoiceLiveInfo");
                BLiveSharedVoiceLiveInfo.JSON_ADAPTER.serialize(bLiveChatMessage.sharedVoiceLiveInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("preSeq", bLiveChatMessage.preSeq);
            jsonGenerator.writeNumberField("preTimestamp", bLiveChatMessage.preTimestamp);
            jsonGenerator.writeNumberField("createdTime", bLiveChatMessage.createdTime);
            String str8 = bLiveChatMessage.userIdentity;
            if (str8 != null) {
                jsonGenerator.writeStringField("userIdentity", str8);
            }
            if (bLiveChatMessage.starlightHierarchy != null) {
                jsonGenerator.writeFieldName("starlightHierarchy");
                BLiveStarlightHierarchy.JSON_ADAPTER.serialize(bLiveChatMessage.starlightHierarchy, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatmessage";

    @NonNull
    @ProtobufIndex(index = 61)
    public BLiveChatShadingConfig chatShadingConfig;

    @ProtobufIndex(index = 65)
    public long createdTime;

    @NonNull
    @ProtobufIndex(index = 60)
    public BLiveChatExtInfo extInfo;

    @NonNull
    @ProtobufIndex(index = 56)
    public BLiveGiftMessage gift;

    /* JADX INFO: renamed from: h5 */
    @NonNull
    @ProtobufIndex(index = 58)
    public String f45197h5;

    @NonNull
    public BLiveUserLevel hierarchy;

    @NonNull
    @ProtobufIndex(index = 59)
    public String liveId;

    @NonNull
    public BLiveMessageUserMedal medal;

    @ProtobufIndex(index = 64)
    public int preSeq;

    @ProtobufIndex(index = 66)
    public long preTimestamp;

    @NonNull
    @ProtobufIndex(index = 51)
    public String roomId;

    @ProtobufIndex(index = 52)
    public int seq;

    @NonNull
    @ProtobufIndex(index = 63)
    public BLiveSharedVoiceLiveInfo sharedVoiceLiveInfo;

    @NonNull
    @ProtobufIndex(index = 68)
    public BLiveStarlightHierarchy starlightHierarchy;

    @NonNull
    @ProtobufIndex(index = 57)
    public BLiveTemplateData template;

    @NonNull
    @ProtobufIndex(index = 62)
    public String type;

    @NonNull
    @ProtobufIndex(index = 53)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 67)
    public String userIdentity;

    @NonNull
    @ProtobufIndex(index = 54)
    public String username;

    @NonNull
    @ProtobufIndex(index = 55)
    public String value;

    public static BLiveChatMessage new_() {
        BLiveChatMessage bLiveChatMessage = new BLiveChatMessage();
        bLiveChatMessage.nullCheck();
        return bLiveChatMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatMessage mo225055clone() {
        BLiveChatMessage bLiveChatMessage = new BLiveChatMessage();
        bLiveChatMessage.roomId = this.roomId;
        bLiveChatMessage.seq = this.seq;
        bLiveChatMessage.userId = this.userId;
        bLiveChatMessage.username = this.username;
        bLiveChatMessage.value = this.value;
        BLiveGiftMessage bLiveGiftMessage = this.gift;
        if (bLiveGiftMessage != null) {
            bLiveChatMessage.gift = bLiveGiftMessage.mo225055clone();
        }
        BLiveTemplateData bLiveTemplateData = this.template;
        if (bLiveTemplateData != null) {
            bLiveChatMessage.template = bLiveTemplateData.mo225055clone();
        }
        bLiveChatMessage.f45197h5 = this.f45197h5;
        bLiveChatMessage.liveId = this.liveId;
        BLiveMessageUserMedal bLiveMessageUserMedal = this.medal;
        if (bLiveMessageUserMedal != null) {
            bLiveChatMessage.medal = bLiveMessageUserMedal.mo225055clone();
        }
        BLiveUserLevel bLiveUserLevel = this.hierarchy;
        if (bLiveUserLevel != null) {
            bLiveChatMessage.hierarchy = bLiveUserLevel.mo225055clone();
        }
        BLiveChatExtInfo bLiveChatExtInfo = this.extInfo;
        if (bLiveChatExtInfo != null) {
            bLiveChatMessage.extInfo = bLiveChatExtInfo.mo225055clone();
        }
        BLiveChatShadingConfig bLiveChatShadingConfig = this.chatShadingConfig;
        if (bLiveChatShadingConfig != null) {
            bLiveChatMessage.chatShadingConfig = bLiveChatShadingConfig.mo225055clone();
        }
        bLiveChatMessage.type = this.type;
        BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo = this.sharedVoiceLiveInfo;
        if (bLiveSharedVoiceLiveInfo != null) {
            bLiveChatMessage.sharedVoiceLiveInfo = bLiveSharedVoiceLiveInfo.mo225055clone();
        }
        bLiveChatMessage.preSeq = this.preSeq;
        bLiveChatMessage.preTimestamp = this.preTimestamp;
        bLiveChatMessage.createdTime = this.createdTime;
        bLiveChatMessage.userIdentity = this.userIdentity;
        BLiveStarlightHierarchy bLiveStarlightHierarchy = this.starlightHierarchy;
        if (bLiveStarlightHierarchy != null) {
            bLiveChatMessage.starlightHierarchy = bLiveStarlightHierarchy.mo225055clone();
        }
        return bLiveChatMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatMessage)) {
            return false;
        }
        BLiveChatMessage bLiveChatMessage = (BLiveChatMessage) obj;
        return ValueObject.util_equals(this.roomId, bLiveChatMessage.roomId) && this.seq == bLiveChatMessage.seq && ValueObject.util_equals(this.userId, bLiveChatMessage.userId) && ValueObject.util_equals(this.username, bLiveChatMessage.username) && ValueObject.util_equals(this.value, bLiveChatMessage.value) && ValueObject.util_equals(this.gift, bLiveChatMessage.gift) && ValueObject.util_equals(this.template, bLiveChatMessage.template) && ValueObject.util_equals(this.f45197h5, bLiveChatMessage.f45197h5) && ValueObject.util_equals(this.liveId, bLiveChatMessage.liveId) && ValueObject.util_equals(this.medal, bLiveChatMessage.medal) && ValueObject.util_equals(this.hierarchy, bLiveChatMessage.hierarchy) && ValueObject.util_equals(this.extInfo, bLiveChatMessage.extInfo) && ValueObject.util_equals(this.chatShadingConfig, bLiveChatMessage.chatShadingConfig) && ValueObject.util_equals(this.type, bLiveChatMessage.type) && ValueObject.util_equals(this.sharedVoiceLiveInfo, bLiveChatMessage.sharedVoiceLiveInfo) && this.preSeq == bLiveChatMessage.preSeq && this.preTimestamp == bLiveChatMessage.preTimestamp && this.createdTime == bLiveChatMessage.createdTime && ValueObject.util_equals(this.userIdentity, bLiveChatMessage.userIdentity) && ValueObject.util_equals(this.starlightHierarchy, bLiveChatMessage.starlightHierarchy);
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
        String str = this.roomId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.seq) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.username;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.value;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveGiftMessage bLiveGiftMessage = this.gift;
        int iHashCode5 = (iHashCode4 + (bLiveGiftMessage != null ? bLiveGiftMessage.hashCode() : 0)) * 41;
        BLiveTemplateData bLiveTemplateData = this.template;
        int iHashCode6 = (iHashCode5 + (bLiveTemplateData != null ? bLiveTemplateData.hashCode() : 0)) * 41;
        String str5 = this.f45197h5;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.liveId;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveMessageUserMedal bLiveMessageUserMedal = this.medal;
        int iHashCode9 = (iHashCode8 + (bLiveMessageUserMedal != null ? bLiveMessageUserMedal.hashCode() : 0)) * 41;
        BLiveUserLevel bLiveUserLevel = this.hierarchy;
        int iHashCode10 = (iHashCode9 + (bLiveUserLevel != null ? bLiveUserLevel.hashCode() : 0)) * 41;
        BLiveChatExtInfo bLiveChatExtInfo = this.extInfo;
        int iHashCode11 = (iHashCode10 + (bLiveChatExtInfo != null ? bLiveChatExtInfo.hashCode() : 0)) * 41;
        BLiveChatShadingConfig bLiveChatShadingConfig = this.chatShadingConfig;
        int iHashCode12 = (iHashCode11 + (bLiveChatShadingConfig != null ? bLiveChatShadingConfig.hashCode() : 0)) * 41;
        String str7 = this.type;
        int iHashCode13 = (iHashCode12 + (str7 != null ? str7.hashCode() : 0)) * 41;
        BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo = this.sharedVoiceLiveInfo;
        int iHashCode14 = (((iHashCode13 + (bLiveSharedVoiceLiveInfo != null ? bLiveSharedVoiceLiveInfo.hashCode() : 0)) * 41) + this.preSeq) * 41;
        long j = this.preTimestamp;
        int i3 = (iHashCode14 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.createdTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str8 = this.userIdentity;
        int iHashCode15 = (i4 + (str8 != null ? str8.hashCode() : 0)) * 41;
        BLiveStarlightHierarchy bLiveStarlightHierarchy = this.starlightHierarchy;
        int iHashCode16 = iHashCode15 + (bLiveStarlightHierarchy != null ? bLiveStarlightHierarchy.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.username == null) {
            this.username = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.gift == null) {
            this.gift = BLiveGiftMessage.new_();
        }
        if (this.template == null) {
            this.template = BLiveTemplateData.new_();
        }
        if (this.f45197h5 == null) {
            this.f45197h5 = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.medal == null) {
            this.medal = BLiveMessageUserMedal.new_();
        }
        if (this.hierarchy == null) {
            this.hierarchy = BLiveUserLevel.new_();
        }
        if (this.extInfo == null) {
            this.extInfo = BLiveChatExtInfo.new_();
        }
        if (this.chatShadingConfig == null) {
            this.chatShadingConfig = BLiveChatShadingConfig.new_();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.sharedVoiceLiveInfo == null) {
            this.sharedVoiceLiveInfo = BLiveSharedVoiceLiveInfo.new_();
        }
        if (this.userIdentity == null) {
            this.userIdentity = "";
        }
        if (this.starlightHierarchy == null) {
            this.starlightHierarchy = BLiveStarlightHierarchy.new_();
        }
    }

    public BLiveChatMessage subtract(BLiveChatMessage bLiveChatMessage) {
        BLiveChatMessage bLiveChatMessage2 = new BLiveChatMessage();
        if (!ValueObject.util_equals(this.roomId, bLiveChatMessage.roomId)) {
            bLiveChatMessage2.roomId = this.roomId;
        }
        if (!ValueObject.util_equals(this.userId, bLiveChatMessage.userId)) {
            bLiveChatMessage2.userId = this.userId;
        }
        if (!ValueObject.util_equals(this.username, bLiveChatMessage.username)) {
            bLiveChatMessage2.username = this.username;
        }
        if (!ValueObject.util_equals(this.value, bLiveChatMessage.value)) {
            bLiveChatMessage2.value = this.value;
        }
        BLiveGiftMessage bLiveGiftMessage = this.gift;
        if (bLiveGiftMessage != null) {
            bLiveChatMessage2.gift = bLiveGiftMessage.subtract(bLiveChatMessage.gift);
        }
        BLiveTemplateData bLiveTemplateData = this.template;
        if (bLiveTemplateData != null) {
            bLiveChatMessage2.template = bLiveTemplateData.subtract(bLiveChatMessage.template);
        }
        if (!ValueObject.util_equals(this.f45197h5, bLiveChatMessage.f45197h5)) {
            bLiveChatMessage2.f45197h5 = this.f45197h5;
        }
        if (!ValueObject.util_equals(this.liveId, bLiveChatMessage.liveId)) {
            bLiveChatMessage2.liveId = this.liveId;
        }
        if (!ValueObject.util_equals(this.medal, bLiveChatMessage.medal)) {
            bLiveChatMessage2.medal = this.medal;
        }
        if (!ValueObject.util_equals(this.hierarchy, bLiveChatMessage.hierarchy)) {
            bLiveChatMessage2.hierarchy = this.hierarchy;
        }
        if (!ValueObject.util_equals(this.extInfo, bLiveChatMessage.extInfo)) {
            bLiveChatMessage2.extInfo = this.extInfo;
        }
        if (!ValueObject.util_equals(this.chatShadingConfig, bLiveChatMessage.chatShadingConfig)) {
            bLiveChatMessage2.chatShadingConfig = this.chatShadingConfig;
        }
        if (!ValueObject.util_equals(this.type, bLiveChatMessage.type)) {
            bLiveChatMessage2.type = this.type;
        }
        BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo = this.sharedVoiceLiveInfo;
        if (bLiveSharedVoiceLiveInfo != null) {
            bLiveChatMessage2.sharedVoiceLiveInfo = bLiveSharedVoiceLiveInfo.subtract(bLiveChatMessage.sharedVoiceLiveInfo);
        }
        if (!ValueObject.util_equals(this.userIdentity, bLiveChatMessage.userIdentity)) {
            bLiveChatMessage2.userIdentity = this.userIdentity;
        }
        if (!ValueObject.util_equals(this.starlightHierarchy, bLiveChatMessage.starlightHierarchy)) {
            bLiveChatMessage2.starlightHierarchy = this.starlightHierarchy;
        }
        if (bLiveChatMessage2.equals(new BLiveChatMessage())) {
            return null;
        }
        return bLiveChatMessage2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
