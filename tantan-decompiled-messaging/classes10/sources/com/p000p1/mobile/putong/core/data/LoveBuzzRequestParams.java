package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LoveBuzzRequestParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovebuzzrequestparams";

    @NonNull
    @ProtobufIndex(index = 4)
    public String buzzToken;

    @NonNull
    @ProtobufIndex(index = 6)
    public String channelToken;

    @NonNull
    @ProtobufIndex(index = 22)
    public String consumeType;

    @NonNull
    @ProtobufIndex(index = 14)
    public String conversationId;

    @NonNull
    @ProtobufIndex(index = 13)
    public BuzzDeviceInfo deviceInfo;

    @ProtobufIndex(index = 8)
    public int duration;

    @ProtobufIndex(index = 23)
    public int errorCode;

    @ProtobufIndex(index = 15)
    public long expire;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int mcc;

    @ProtobufIndex(index = 18)
    public boolean memojiBuzzToggle;

    @NonNull
    @ProtobufIndex(index = 9)
    public String mode;

    @ProtobufIndex(index = 20)
    public boolean noFace;

    @ProtobufIndex(index = 21)
    public boolean noVocal;

    @ProtobufIndex(index = 17)
    public boolean notBlur;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String otherUserId;

    @ProtobufIndex(index = 19)
    public int preferredMcc;

    @ProtobufIndex(index = 16)
    public boolean prolonged;

    @NonNull
    @ProtobufIndex(index = 7)
    public String scene;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean textBuzzToggle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 12)
    public BuzzUserInfo userInfo;

    @ProtobufIndex(index = 11)
    public boolean videoBuzzToggle;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public boolean voiceBuzzToggle;
    public static ProtobufAdapter<LoveBuzzRequestParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveBuzzRequestParams>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzRequestParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LoveBuzzRequestParams loveBuzzRequestParams) {
            String str = loveBuzzRequestParams.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, loveBuzzRequestParams.mcc) + CodedOutputByteBufferNano.b(3, loveBuzzRequestParams.textBuzzToggle);
            String str2 = loveBuzzRequestParams.buzzToken;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = loveBuzzRequestParams.otherUserId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = loveBuzzRequestParams.channelToken;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = loveBuzzRequestParams.scene;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(7, str5);
            }
            int iH = iO + CodedOutputByteBufferNano.h(8, loveBuzzRequestParams.duration);
            String str6 = loveBuzzRequestParams.mode;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(9, str6);
            }
            int iB = iH + CodedOutputByteBufferNano.b(10, loveBuzzRequestParams.voiceBuzzToggle) + CodedOutputByteBufferNano.b(11, loveBuzzRequestParams.videoBuzzToggle);
            BuzzUserInfo buzzUserInfo = loveBuzzRequestParams.userInfo;
            if (buzzUserInfo != null) {
                iB += CodedOutputByteBufferNano.l(12, buzzUserInfo, BuzzUserInfo.PROTOBUF_ADAPTER);
            }
            BuzzDeviceInfo buzzDeviceInfo = loveBuzzRequestParams.deviceInfo;
            if (buzzDeviceInfo != null) {
                iB += CodedOutputByteBufferNano.l(13, buzzDeviceInfo, BuzzDeviceInfo.PROTOBUF_ADAPTER);
            }
            String str7 = loveBuzzRequestParams.conversationId;
            if (str7 != null) {
                iB += CodedOutputByteBufferNano.o(14, str7);
            }
            int iJ = iB + CodedOutputByteBufferNano.j(15, loveBuzzRequestParams.expire) + CodedOutputByteBufferNano.b(16, loveBuzzRequestParams.prolonged) + CodedOutputByteBufferNano.b(17, loveBuzzRequestParams.notBlur) + CodedOutputByteBufferNano.b(18, loveBuzzRequestParams.memojiBuzzToggle) + CodedOutputByteBufferNano.h(19, loveBuzzRequestParams.preferredMcc) + CodedOutputByteBufferNano.b(20, loveBuzzRequestParams.noFace) + CodedOutputByteBufferNano.b(21, loveBuzzRequestParams.noVocal);
            String str8 = loveBuzzRequestParams.consumeType;
            if (str8 != null) {
                iJ += CodedOutputByteBufferNano.o(22, str8);
            }
            int iH2 = iJ + CodedOutputByteBufferNano.h(23, loveBuzzRequestParams.errorCode);
            ((MessageNano) loveBuzzRequestParams).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LoveBuzzRequestParams m13989parse(nb5 nb5Var) throws IOException {
            LoveBuzzRequestParams loveBuzzRequestParams = new LoveBuzzRequestParams();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (loveBuzzRequestParams.userId == null) {
                            loveBuzzRequestParams.userId = "";
                        }
                        if (loveBuzzRequestParams.buzzToken == null) {
                            loveBuzzRequestParams.buzzToken = "";
                        }
                        if (loveBuzzRequestParams.otherUserId == null) {
                            loveBuzzRequestParams.otherUserId = "";
                        }
                        if (loveBuzzRequestParams.channelToken == null) {
                            loveBuzzRequestParams.channelToken = "";
                        }
                        if (loveBuzzRequestParams.scene == null) {
                            loveBuzzRequestParams.scene = "";
                        }
                        if (loveBuzzRequestParams.mode == null) {
                            loveBuzzRequestParams.mode = "";
                        }
                        if (loveBuzzRequestParams.userInfo == null) {
                            loveBuzzRequestParams.userInfo = BuzzUserInfo.new_();
                        }
                        if (loveBuzzRequestParams.deviceInfo == null) {
                            loveBuzzRequestParams.deviceInfo = BuzzDeviceInfo.new_();
                        }
                        if (loveBuzzRequestParams.conversationId == null) {
                            loveBuzzRequestParams.conversationId = "";
                        }
                        if (loveBuzzRequestParams.consumeType == null) {
                            loveBuzzRequestParams.consumeType = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        loveBuzzRequestParams.userId = nb5Var.s();
                        continue;
                    case 16:
                        loveBuzzRequestParams.mcc = nb5Var.j();
                        continue;
                    case 24:
                        loveBuzzRequestParams.textBuzzToggle = nb5Var.g();
                        continue;
                    case 34:
                        loveBuzzRequestParams.buzzToken = nb5Var.s();
                        continue;
                    case 42:
                        loveBuzzRequestParams.otherUserId = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        loveBuzzRequestParams.channelToken = nb5Var.s();
                        continue;
                    case 58:
                        loveBuzzRequestParams.scene = nb5Var.s();
                        continue;
                    case 64:
                        loveBuzzRequestParams.duration = nb5Var.j();
                        continue;
                    case 74:
                        loveBuzzRequestParams.mode = nb5Var.s();
                        continue;
                    case 80:
                        loveBuzzRequestParams.voiceBuzzToggle = nb5Var.g();
                        continue;
                    case 88:
                        loveBuzzRequestParams.videoBuzzToggle = nb5Var.g();
                        continue;
                    case 98:
                        loveBuzzRequestParams.userInfo = (BuzzUserInfo) nb5Var.l(BuzzUserInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        loveBuzzRequestParams.deviceInfo = (BuzzDeviceInfo) nb5Var.l(BuzzDeviceInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        loveBuzzRequestParams.conversationId = nb5Var.s();
                        continue;
                    case 120:
                        loveBuzzRequestParams.expire = nb5Var.k();
                        continue;
                    case 128:
                        loveBuzzRequestParams.prolonged = nb5Var.g();
                        continue;
                    case 136:
                        loveBuzzRequestParams.notBlur = nb5Var.g();
                        continue;
                    case 144:
                        loveBuzzRequestParams.memojiBuzzToggle = nb5Var.g();
                        continue;
                    case 152:
                        loveBuzzRequestParams.preferredMcc = nb5Var.j();
                        continue;
                    case 160:
                        loveBuzzRequestParams.noFace = nb5Var.g();
                        continue;
                    case 168:
                        loveBuzzRequestParams.noVocal = nb5Var.g();
                        continue;
                    case 178:
                        loveBuzzRequestParams.consumeType = nb5Var.s();
                        continue;
                    case 184:
                        loveBuzzRequestParams.errorCode = nb5Var.j();
                        continue;
                    default:
                        if (loveBuzzRequestParams.userId == null) {
                            loveBuzzRequestParams.userId = "";
                        }
                        if (loveBuzzRequestParams.buzzToken == null) {
                            loveBuzzRequestParams.buzzToken = "";
                        }
                        if (loveBuzzRequestParams.otherUserId == null) {
                            loveBuzzRequestParams.otherUserId = "";
                        }
                        if (loveBuzzRequestParams.channelToken == null) {
                            loveBuzzRequestParams.channelToken = "";
                        }
                        if (loveBuzzRequestParams.scene == null) {
                            loveBuzzRequestParams.scene = "";
                        }
                        if (loveBuzzRequestParams.mode == null) {
                            loveBuzzRequestParams.mode = "";
                        }
                        if (loveBuzzRequestParams.userInfo == null) {
                            loveBuzzRequestParams.userInfo = BuzzUserInfo.new_();
                        }
                        if (loveBuzzRequestParams.deviceInfo == null) {
                            loveBuzzRequestParams.deviceInfo = BuzzDeviceInfo.new_();
                        }
                        if (loveBuzzRequestParams.conversationId == null) {
                            loveBuzzRequestParams.conversationId = "";
                        }
                        if (loveBuzzRequestParams.consumeType == null) {
                            loveBuzzRequestParams.consumeType = "";
                            return loveBuzzRequestParams;
                        }
                        break;
                }
            }
            return loveBuzzRequestParams;
        }

        public void serialize(LoveBuzzRequestParams loveBuzzRequestParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = loveBuzzRequestParams.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, loveBuzzRequestParams.mcc);
            codedOutputByteBufferNano.A(3, loveBuzzRequestParams.textBuzzToggle);
            String str2 = loveBuzzRequestParams.buzzToken;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = loveBuzzRequestParams.otherUserId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = loveBuzzRequestParams.channelToken;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = loveBuzzRequestParams.scene;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            codedOutputByteBufferNano.G(8, loveBuzzRequestParams.duration);
            String str6 = loveBuzzRequestParams.mode;
            if (str6 != null) {
                codedOutputByteBufferNano.R(9, str6);
            }
            codedOutputByteBufferNano.A(10, loveBuzzRequestParams.voiceBuzzToggle);
            codedOutputByteBufferNano.A(11, loveBuzzRequestParams.videoBuzzToggle);
            BuzzUserInfo buzzUserInfo = loveBuzzRequestParams.userInfo;
            if (buzzUserInfo != null) {
                codedOutputByteBufferNano.K(12, buzzUserInfo, BuzzUserInfo.PROTOBUF_ADAPTER);
            }
            BuzzDeviceInfo buzzDeviceInfo = loveBuzzRequestParams.deviceInfo;
            if (buzzDeviceInfo != null) {
                codedOutputByteBufferNano.K(13, buzzDeviceInfo, BuzzDeviceInfo.PROTOBUF_ADAPTER);
            }
            String str7 = loveBuzzRequestParams.conversationId;
            if (str7 != null) {
                codedOutputByteBufferNano.R(14, str7);
            }
            codedOutputByteBufferNano.I(15, loveBuzzRequestParams.expire);
            codedOutputByteBufferNano.A(16, loveBuzzRequestParams.prolonged);
            codedOutputByteBufferNano.A(17, loveBuzzRequestParams.notBlur);
            codedOutputByteBufferNano.A(18, loveBuzzRequestParams.memojiBuzzToggle);
            codedOutputByteBufferNano.G(19, loveBuzzRequestParams.preferredMcc);
            codedOutputByteBufferNano.A(20, loveBuzzRequestParams.noFace);
            codedOutputByteBufferNano.A(21, loveBuzzRequestParams.noVocal);
            String str8 = loveBuzzRequestParams.consumeType;
            if (str8 != null) {
                codedOutputByteBufferNano.R(22, str8);
            }
            codedOutputByteBufferNano.G(23, loveBuzzRequestParams.errorCode);
        }
    };
    public static JsonAdapter<LoveBuzzRequestParams> JSON_ADAPTER = new ObjectJsonAdapter<LoveBuzzRequestParams>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzRequestParams.2
        public Class getDataClass() {
            return LoveBuzzRequestParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LoveBuzzRequestParams m13990newInstance() {
            return new LoveBuzzRequestParams();
        }

        public boolean parseField(LoveBuzzRequestParams loveBuzzRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    loveBuzzRequestParams.duration = jsonParser.getValueAsInt();
                    return true;
                case "textBuzzToggle":
                    loveBuzzRequestParams.textBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case "conversationId":
                    loveBuzzRequestParams.conversationId = jsonParser.getValueAsString();
                    return true;
                case "otherUserId":
                    loveBuzzRequestParams.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "expire":
                    loveBuzzRequestParams.expire = jsonParser.getValueAsLong();
                    return true;
                case "noFace":
                    loveBuzzRequestParams.noFace = jsonParser.getValueAsBoolean();
                    return true;
                case "consumeType":
                    loveBuzzRequestParams.consumeType = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    loveBuzzRequestParams.userId = jsonParser.getValueAsString();
                    return true;
                case "prolonged":
                    loveBuzzRequestParams.prolonged = jsonParser.getValueAsBoolean();
                    return true;
                case "videoBuzzToggle":
                    loveBuzzRequestParams.videoBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case "userInfo":
                    loveBuzzRequestParams.userInfo = (BuzzUserInfo) BuzzUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voiceBuzzToggle":
                    loveBuzzRequestParams.voiceBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case "channelToken":
                    loveBuzzRequestParams.channelToken = jsonParser.getValueAsString();
                    return true;
                case "mcc":
                    loveBuzzRequestParams.mcc = jsonParser.getValueAsInt();
                    return true;
                case "mode":
                    loveBuzzRequestParams.mode = jsonParser.getValueAsString();
                    return true;
                case "scene":
                    loveBuzzRequestParams.scene = jsonParser.getValueAsString();
                    return true;
                case "errorCode":
                    loveBuzzRequestParams.errorCode = jsonParser.getValueAsInt();
                    return true;
                case "deviceInfo":
                    loveBuzzRequestParams.deviceInfo = (BuzzDeviceInfo) BuzzDeviceInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "buzzToken":
                    loveBuzzRequestParams.buzzToken = jsonParser.getValueAsString();
                    return true;
                case "memojiBuzzToggle":
                    loveBuzzRequestParams.memojiBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case "preferredMcc":
                    loveBuzzRequestParams.preferredMcc = jsonParser.getValueAsInt();
                    return true;
                case "noVocal":
                    loveBuzzRequestParams.noVocal = jsonParser.getValueAsBoolean();
                    return true;
                case "notBlur":
                    loveBuzzRequestParams.notBlur = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LoveBuzzRequestParams loveBuzzRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "textBuzzToggle":
                case "conversationId":
                case "otherUserId":
                case "expire":
                case "noFace":
                case "consumeType":
                case "userId":
                case "prolonged":
                case "videoBuzzToggle":
                case "userInfo":
                case "voiceBuzzToggle":
                case "channelToken":
                case "mcc":
                case "mode":
                case "scene":
                case "errorCode":
                case "deviceInfo":
                case "buzzToken":
                case "memojiBuzzToggle":
                case "preferredMcc":
                case "noVocal":
                case "notBlur":
                    return true;
                default:
                    return super.parseFieldCheck(loveBuzzRequestParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LoveBuzzRequestParams loveBuzzRequestParams, JsonGenerator jsonGenerator) throws IOException {
            String str = loveBuzzRequestParams.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("mcc", loveBuzzRequestParams.mcc);
            jsonGenerator.writeBooleanField("textBuzzToggle", loveBuzzRequestParams.textBuzzToggle);
            String str2 = loveBuzzRequestParams.buzzToken;
            if (str2 != null) {
                jsonGenerator.writeStringField("buzzToken", str2);
            }
            String str3 = loveBuzzRequestParams.otherUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("otherUserId", str3);
            }
            String str4 = loveBuzzRequestParams.channelToken;
            if (str4 != null) {
                jsonGenerator.writeStringField("channelToken", str4);
            }
            String str5 = loveBuzzRequestParams.scene;
            if (str5 != null) {
                jsonGenerator.writeStringField("scene", str5);
            }
            jsonGenerator.writeNumberField("duration", loveBuzzRequestParams.duration);
            String str6 = loveBuzzRequestParams.mode;
            if (str6 != null) {
                jsonGenerator.writeStringField("mode", str6);
            }
            jsonGenerator.writeBooleanField("voiceBuzzToggle", loveBuzzRequestParams.voiceBuzzToggle);
            jsonGenerator.writeBooleanField("videoBuzzToggle", loveBuzzRequestParams.videoBuzzToggle);
            if (loveBuzzRequestParams.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                BuzzUserInfo.JSON_ADAPTER.serialize(loveBuzzRequestParams.userInfo, jsonGenerator, true);
            }
            if (loveBuzzRequestParams.deviceInfo != null) {
                jsonGenerator.writeFieldName("deviceInfo");
                BuzzDeviceInfo.JSON_ADAPTER.serialize(loveBuzzRequestParams.deviceInfo, jsonGenerator, true);
            }
            String str7 = loveBuzzRequestParams.conversationId;
            if (str7 != null) {
                jsonGenerator.writeStringField("conversationId", str7);
            }
            jsonGenerator.writeNumberField("expire", loveBuzzRequestParams.expire);
            jsonGenerator.writeBooleanField("prolonged", loveBuzzRequestParams.prolonged);
            jsonGenerator.writeBooleanField("notBlur", loveBuzzRequestParams.notBlur);
            jsonGenerator.writeBooleanField("memojiBuzzToggle", loveBuzzRequestParams.memojiBuzzToggle);
            jsonGenerator.writeNumberField("preferredMcc", loveBuzzRequestParams.preferredMcc);
            jsonGenerator.writeBooleanField("noFace", loveBuzzRequestParams.noFace);
            jsonGenerator.writeBooleanField("noVocal", loveBuzzRequestParams.noVocal);
            String str8 = loveBuzzRequestParams.consumeType;
            if (str8 != null) {
                jsonGenerator.writeStringField("consumeType", str8);
            }
            jsonGenerator.writeNumberField("errorCode", loveBuzzRequestParams.errorCode);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveBuzzRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveBuzzRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveBuzzRequestParams new_() {
        LoveBuzzRequestParams loveBuzzRequestParams = new LoveBuzzRequestParams();
        loveBuzzRequestParams.nullCheck();
        return loveBuzzRequestParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LoveBuzzRequestParams m13988clone() {
        LoveBuzzRequestParams loveBuzzRequestParams = new LoveBuzzRequestParams();
        loveBuzzRequestParams.userId = this.userId;
        loveBuzzRequestParams.mcc = this.mcc;
        loveBuzzRequestParams.textBuzzToggle = this.textBuzzToggle;
        loveBuzzRequestParams.buzzToken = this.buzzToken;
        loveBuzzRequestParams.otherUserId = this.otherUserId;
        loveBuzzRequestParams.channelToken = this.channelToken;
        loveBuzzRequestParams.scene = this.scene;
        loveBuzzRequestParams.duration = this.duration;
        loveBuzzRequestParams.mode = this.mode;
        loveBuzzRequestParams.voiceBuzzToggle = this.voiceBuzzToggle;
        loveBuzzRequestParams.videoBuzzToggle = this.videoBuzzToggle;
        BuzzUserInfo buzzUserInfo = this.userInfo;
        if (buzzUserInfo != null) {
            loveBuzzRequestParams.userInfo = buzzUserInfo.m11846clone();
        }
        BuzzDeviceInfo buzzDeviceInfo = this.deviceInfo;
        if (buzzDeviceInfo != null) {
            loveBuzzRequestParams.deviceInfo = buzzDeviceInfo.m11830clone();
        }
        loveBuzzRequestParams.conversationId = this.conversationId;
        loveBuzzRequestParams.expire = this.expire;
        loveBuzzRequestParams.prolonged = this.prolonged;
        loveBuzzRequestParams.notBlur = this.notBlur;
        loveBuzzRequestParams.memojiBuzzToggle = this.memojiBuzzToggle;
        loveBuzzRequestParams.preferredMcc = this.preferredMcc;
        loveBuzzRequestParams.noFace = this.noFace;
        loveBuzzRequestParams.noVocal = this.noVocal;
        loveBuzzRequestParams.consumeType = this.consumeType;
        loveBuzzRequestParams.errorCode = this.errorCode;
        return loveBuzzRequestParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveBuzzRequestParams)) {
            return false;
        }
        LoveBuzzRequestParams loveBuzzRequestParams = (LoveBuzzRequestParams) obj;
        return ValueObject.util_equals(this.userId, loveBuzzRequestParams.userId) && this.mcc == loveBuzzRequestParams.mcc && this.textBuzzToggle == loveBuzzRequestParams.textBuzzToggle && ValueObject.util_equals(this.buzzToken, loveBuzzRequestParams.buzzToken) && ValueObject.util_equals(this.otherUserId, loveBuzzRequestParams.otherUserId) && ValueObject.util_equals(this.channelToken, loveBuzzRequestParams.channelToken) && ValueObject.util_equals(this.scene, loveBuzzRequestParams.scene) && this.duration == loveBuzzRequestParams.duration && ValueObject.util_equals(this.mode, loveBuzzRequestParams.mode) && this.voiceBuzzToggle == loveBuzzRequestParams.voiceBuzzToggle && this.videoBuzzToggle == loveBuzzRequestParams.videoBuzzToggle && ValueObject.util_equals(this.userInfo, loveBuzzRequestParams.userInfo) && ValueObject.util_equals(this.deviceInfo, loveBuzzRequestParams.deviceInfo) && ValueObject.util_equals(this.conversationId, loveBuzzRequestParams.conversationId) && this.expire == loveBuzzRequestParams.expire && this.prolonged == loveBuzzRequestParams.prolonged && this.notBlur == loveBuzzRequestParams.notBlur && this.memojiBuzzToggle == loveBuzzRequestParams.memojiBuzzToggle && this.preferredMcc == loveBuzzRequestParams.preferredMcc && this.noFace == loveBuzzRequestParams.noFace && this.noVocal == loveBuzzRequestParams.noVocal && ValueObject.util_equals(this.consumeType, loveBuzzRequestParams.consumeType) && this.errorCode == loveBuzzRequestParams.errorCode;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.mcc) * 41) + (this.textBuzzToggle ? 1231 : 1237)) * 41;
        String str2 = this.buzzToken;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.channelToken;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.scene;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.duration) * 41;
        String str6 = this.mode;
        int iHashCode6 = (((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.voiceBuzzToggle ? 1231 : 1237)) * 41) + (this.videoBuzzToggle ? 1231 : 1237)) * 41;
        BuzzUserInfo buzzUserInfo = this.userInfo;
        int iHashCode7 = (iHashCode6 + (buzzUserInfo != null ? buzzUserInfo.hashCode() : 0)) * 41;
        BuzzDeviceInfo buzzDeviceInfo = this.deviceInfo;
        int iHashCode8 = (iHashCode7 + (buzzDeviceInfo != null ? buzzDeviceInfo.hashCode() : 0)) * 41;
        String str7 = this.conversationId;
        int iHashCode9 = str7 != null ? str7.hashCode() : 0;
        long j = this.expire;
        int i3 = (((((((((((((((iHashCode8 + iHashCode9) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.prolonged ? 1231 : 1237)) * 41) + (this.notBlur ? 1231 : 1237)) * 41) + (this.memojiBuzzToggle ? 1231 : 1237)) * 41) + this.preferredMcc) * 41) + (this.noFace ? 1231 : 1237)) * 41) + (this.noVocal ? 1231 : 1237)) * 41;
        String str8 = this.consumeType;
        int iHashCode10 = ((i3 + (str8 != null ? str8.hashCode() : 0)) * 41) + this.errorCode;
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.buzzToken == null) {
            this.buzzToken = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.channelToken == null) {
            this.channelToken = "";
        }
        if (this.scene == null) {
            this.scene = "";
        }
        if (this.mode == null) {
            this.mode = "";
        }
        if (this.userInfo == null) {
            this.userInfo = BuzzUserInfo.new_();
        }
        if (this.deviceInfo == null) {
            this.deviceInfo = BuzzDeviceInfo.new_();
        }
        if (this.conversationId == null) {
            this.conversationId = "";
        }
        if (this.consumeType == null) {
            this.consumeType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
