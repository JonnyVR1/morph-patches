package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
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

    @ProtobufIndex(index = 2)
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
    @ProtobufIndex(index = 5)
    public String otherUserId;

    @ProtobufIndex(index = 19)
    public int preferredMcc;

    @ProtobufIndex(index = 16)
    public boolean prolonged;

    @NonNull
    @ProtobufIndex(index = 7)
    public String scene;

    @ProtobufIndex(index = 3)
    public boolean textBuzzToggle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 12)
    public BuzzUserInfo userInfo;

    @ProtobufIndex(index = 11)
    public boolean videoBuzzToggle;

    @ProtobufIndex(index = 10)
    public boolean voiceBuzzToggle;
    public static ProtobufAdapter<LoveBuzzRequestParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveBuzzRequestParams>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzRequestParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveBuzzRequestParams loveBuzzRequestParams) {
            String str = loveBuzzRequestParams.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, loveBuzzRequestParams.mcc) + CodedOutputByteBufferNano.m17220b(3, loveBuzzRequestParams.textBuzzToggle);
            String str2 = loveBuzzRequestParams.buzzToken;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            String str3 = loveBuzzRequestParams.otherUserId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            String str4 = loveBuzzRequestParams.channelToken;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            String str5 = loveBuzzRequestParams.scene;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(8, loveBuzzRequestParams.duration);
            String str6 = loveBuzzRequestParams.mode;
            if (str6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(9, str6);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(10, loveBuzzRequestParams.voiceBuzzToggle) + CodedOutputByteBufferNano.m17220b(11, loveBuzzRequestParams.videoBuzzToggle);
            BuzzUserInfo buzzUserInfo = loveBuzzRequestParams.userInfo;
            if (buzzUserInfo != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(12, buzzUserInfo, BuzzUserInfo.PROTOBUF_ADAPTER);
            }
            BuzzDeviceInfo buzzDeviceInfo = loveBuzzRequestParams.deviceInfo;
            if (buzzDeviceInfo != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(13, buzzDeviceInfo, BuzzDeviceInfo.PROTOBUF_ADAPTER);
            }
            String str7 = loveBuzzRequestParams.conversationId;
            if (str7 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(14, str7);
            }
            int iM17228j = iM17220b + CodedOutputByteBufferNano.m17228j(15, loveBuzzRequestParams.expire) + CodedOutputByteBufferNano.m17220b(16, loveBuzzRequestParams.prolonged) + CodedOutputByteBufferNano.m17220b(17, loveBuzzRequestParams.notBlur) + CodedOutputByteBufferNano.m17220b(18, loveBuzzRequestParams.memojiBuzzToggle) + CodedOutputByteBufferNano.m17226h(19, loveBuzzRequestParams.preferredMcc) + CodedOutputByteBufferNano.m17220b(20, loveBuzzRequestParams.noFace) + CodedOutputByteBufferNano.m17220b(21, loveBuzzRequestParams.noVocal);
            String str8 = loveBuzzRequestParams.consumeType;
            if (str8 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(22, str8);
            }
            int iM17226h2 = iM17228j + CodedOutputByteBufferNano.m17226h(23, loveBuzzRequestParams.errorCode);
            loveBuzzRequestParams.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveBuzzRequestParams parse(nb5 nb5Var) throws IOException {
            LoveBuzzRequestParams loveBuzzRequestParams = new LoveBuzzRequestParams();
            while (true) {
                switch (nb5Var.m158752u()) {
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
                    case 10:
                        loveBuzzRequestParams.userId = nb5Var.m158750s();
                        continue;
                    case 16:
                        loveBuzzRequestParams.mcc = nb5Var.m158741j();
                        continue;
                    case 24:
                        loveBuzzRequestParams.textBuzzToggle = nb5Var.m158738g();
                        continue;
                    case 34:
                        loveBuzzRequestParams.buzzToken = nb5Var.m158750s();
                        continue;
                    case 42:
                        loveBuzzRequestParams.otherUserId = nb5Var.m158750s();
                        continue;
                    case 50:
                        loveBuzzRequestParams.channelToken = nb5Var.m158750s();
                        continue;
                    case 58:
                        loveBuzzRequestParams.scene = nb5Var.m158750s();
                        continue;
                    case 64:
                        loveBuzzRequestParams.duration = nb5Var.m158741j();
                        continue;
                    case 74:
                        loveBuzzRequestParams.mode = nb5Var.m158750s();
                        continue;
                    case 80:
                        loveBuzzRequestParams.voiceBuzzToggle = nb5Var.m158738g();
                        continue;
                    case 88:
                        loveBuzzRequestParams.videoBuzzToggle = nb5Var.m158738g();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        loveBuzzRequestParams.userInfo = (BuzzUserInfo) nb5Var.m158743l(BuzzUserInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        loveBuzzRequestParams.deviceInfo = (BuzzDeviceInfo) nb5Var.m158743l(BuzzDeviceInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        loveBuzzRequestParams.conversationId = nb5Var.m158750s();
                        continue;
                    case 120:
                        loveBuzzRequestParams.expire = nb5Var.m158742k();
                        continue;
                    case 128:
                        loveBuzzRequestParams.prolonged = nb5Var.m158738g();
                        continue;
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                        loveBuzzRequestParams.notBlur = nb5Var.m158738g();
                        continue;
                    case 144:
                        loveBuzzRequestParams.memojiBuzzToggle = nb5Var.m158738g();
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                        loveBuzzRequestParams.preferredMcc = nb5Var.m158741j();
                        continue;
                    case 160:
                        loveBuzzRequestParams.noFace = nb5Var.m158738g();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                        loveBuzzRequestParams.noVocal = nb5Var.m158738g();
                        continue;
                    case 178:
                        loveBuzzRequestParams.consumeType = nb5Var.m158750s();
                        continue;
                    case 184:
                        loveBuzzRequestParams.errorCode = nb5Var.m158741j();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveBuzzRequestParams loveBuzzRequestParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = loveBuzzRequestParams.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, loveBuzzRequestParams.mcc);
            codedOutputByteBufferNano.m17244A(3, loveBuzzRequestParams.textBuzzToggle);
            String str2 = loveBuzzRequestParams.buzzToken;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            String str3 = loveBuzzRequestParams.otherUserId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            String str4 = loveBuzzRequestParams.channelToken;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
            String str5 = loveBuzzRequestParams.scene;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            codedOutputByteBufferNano.m17250G(8, loveBuzzRequestParams.duration);
            String str6 = loveBuzzRequestParams.mode;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(9, str6);
            }
            codedOutputByteBufferNano.m17244A(10, loveBuzzRequestParams.voiceBuzzToggle);
            codedOutputByteBufferNano.m17244A(11, loveBuzzRequestParams.videoBuzzToggle);
            BuzzUserInfo buzzUserInfo = loveBuzzRequestParams.userInfo;
            if (buzzUserInfo != null) {
                codedOutputByteBufferNano.m17254K(12, buzzUserInfo, BuzzUserInfo.PROTOBUF_ADAPTER);
            }
            BuzzDeviceInfo buzzDeviceInfo = loveBuzzRequestParams.deviceInfo;
            if (buzzDeviceInfo != null) {
                codedOutputByteBufferNano.m17254K(13, buzzDeviceInfo, BuzzDeviceInfo.PROTOBUF_ADAPTER);
            }
            String str7 = loveBuzzRequestParams.conversationId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(14, str7);
            }
            codedOutputByteBufferNano.m17252I(15, loveBuzzRequestParams.expire);
            codedOutputByteBufferNano.m17244A(16, loveBuzzRequestParams.prolonged);
            codedOutputByteBufferNano.m17244A(17, loveBuzzRequestParams.notBlur);
            codedOutputByteBufferNano.m17244A(18, loveBuzzRequestParams.memojiBuzzToggle);
            codedOutputByteBufferNano.m17250G(19, loveBuzzRequestParams.preferredMcc);
            codedOutputByteBufferNano.m17244A(20, loveBuzzRequestParams.noFace);
            codedOutputByteBufferNano.m17244A(21, loveBuzzRequestParams.noVocal);
            String str8 = loveBuzzRequestParams.consumeType;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(22, str8);
            }
            codedOutputByteBufferNano.m17250G(23, loveBuzzRequestParams.errorCode);
        }
    };
    public static JsonAdapter<LoveBuzzRequestParams> JSON_ADAPTER = new ObjectJsonAdapter<LoveBuzzRequestParams>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzRequestParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveBuzzRequestParams.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveBuzzRequestParams newInstance() {
            return new LoveBuzzRequestParams();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(LoveBuzzRequestParams loveBuzzRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 0;
                    }
                    break;
                case -1879532268:
                    if (str.equals("textBuzzToggle")) {
                        b = 1;
                    }
                    break;
                case -1676095234:
                    if (str.equals("conversationId")) {
                        b = 2;
                    }
                    break;
                case -1641345674:
                    if (str.equals("otherUserId")) {
                        b = 3;
                    }
                    break;
                case -1289159393:
                    if (str.equals("expire")) {
                        b = 4;
                    }
                    break;
                case -1041068098:
                    if (str.equals("noFace")) {
                        b = 5;
                    }
                    break;
                case -859266730:
                    if (str.equals("consumeType")) {
                        b = 6;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 7;
                    }
                    break;
                case -828022520:
                    if (str.equals("prolonged")) {
                        b = 8;
                    }
                    break;
                case -580246814:
                    if (str.equals("videoBuzzToggle")) {
                        b = 9;
                    }
                    break;
                case -266803431:
                    if (str.equals("userInfo")) {
                        b = 10;
                    }
                    break;
                case -254167335:
                    if (str.equals("voiceBuzzToggle")) {
                        b = 11;
                    }
                    break;
                case -91425098:
                    if (str.equals("channelToken")) {
                        b = 12;
                    }
                    break;
                case 107917:
                    if (str.equals("mcc")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3357091:
                    if (str.equals("mode")) {
                        b = 14;
                    }
                    break;
                case 109254796:
                    if (str.equals("scene")) {
                        b = 15;
                    }
                    break;
                case 329035797:
                    if (str.equals("errorCode")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 780852260:
                    if (str.equals("deviceInfo")) {
                        b = 17;
                    }
                    break;
                case 1188512486:
                    if (str.equals("buzzToken")) {
                        b = 18;
                    }
                    break;
                case 1630012640:
                    if (str.equals("memojiBuzzToggle")) {
                        b = 19;
                    }
                    break;
                case 1920025932:
                    if (str.equals("preferredMcc")) {
                        b = 20;
                    }
                    break;
                case 2101820724:
                    if (str.equals("noVocal")) {
                        b = 21;
                    }
                    break;
                case 2128195034:
                    if (str.equals("notBlur")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    loveBuzzRequestParams.duration = jsonParser.getValueAsInt();
                    return true;
                case 1:
                    loveBuzzRequestParams.textBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case 2:
                    loveBuzzRequestParams.conversationId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    loveBuzzRequestParams.otherUserId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    loveBuzzRequestParams.expire = jsonParser.getValueAsLong();
                    return true;
                case 5:
                    loveBuzzRequestParams.noFace = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    loveBuzzRequestParams.consumeType = jsonParser.getValueAsString();
                    return true;
                case 7:
                    loveBuzzRequestParams.userId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    loveBuzzRequestParams.prolonged = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    loveBuzzRequestParams.videoBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    loveBuzzRequestParams.userInfo = BuzzUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    loveBuzzRequestParams.voiceBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    loveBuzzRequestParams.channelToken = jsonParser.getValueAsString();
                    return true;
                case 13:
                    loveBuzzRequestParams.mcc = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    loveBuzzRequestParams.mode = jsonParser.getValueAsString();
                    return true;
                case 15:
                    loveBuzzRequestParams.scene = jsonParser.getValueAsString();
                    return true;
                case 16:
                    loveBuzzRequestParams.errorCode = jsonParser.getValueAsInt();
                    return true;
                case 17:
                    loveBuzzRequestParams.deviceInfo = BuzzDeviceInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    loveBuzzRequestParams.buzzToken = jsonParser.getValueAsString();
                    return true;
                case 19:
                    loveBuzzRequestParams.memojiBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case 20:
                    loveBuzzRequestParams.preferredMcc = jsonParser.getValueAsInt();
                    return true;
                case 21:
                    loveBuzzRequestParams.noVocal = jsonParser.getValueAsBoolean();
                    return true;
                case 22:
                    loveBuzzRequestParams.notBlur = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(LoveBuzzRequestParams loveBuzzRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 0;
                    }
                    break;
                case -1879532268:
                    if (str.equals("textBuzzToggle")) {
                        b = 1;
                    }
                    break;
                case -1676095234:
                    if (str.equals("conversationId")) {
                        b = 2;
                    }
                    break;
                case -1641345674:
                    if (str.equals("otherUserId")) {
                        b = 3;
                    }
                    break;
                case -1289159393:
                    if (str.equals("expire")) {
                        b = 4;
                    }
                    break;
                case -1041068098:
                    if (str.equals("noFace")) {
                        b = 5;
                    }
                    break;
                case -859266730:
                    if (str.equals("consumeType")) {
                        b = 6;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 7;
                    }
                    break;
                case -828022520:
                    if (str.equals("prolonged")) {
                        b = 8;
                    }
                    break;
                case -580246814:
                    if (str.equals("videoBuzzToggle")) {
                        b = 9;
                    }
                    break;
                case -266803431:
                    if (str.equals("userInfo")) {
                        b = 10;
                    }
                    break;
                case -254167335:
                    if (str.equals("voiceBuzzToggle")) {
                        b = 11;
                    }
                    break;
                case -91425098:
                    if (str.equals("channelToken")) {
                        b = 12;
                    }
                    break;
                case 107917:
                    if (str.equals("mcc")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3357091:
                    if (str.equals("mode")) {
                        b = 14;
                    }
                    break;
                case 109254796:
                    if (str.equals("scene")) {
                        b = 15;
                    }
                    break;
                case 329035797:
                    if (str.equals("errorCode")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 780852260:
                    if (str.equals("deviceInfo")) {
                        b = 17;
                    }
                    break;
                case 1188512486:
                    if (str.equals("buzzToken")) {
                        b = 18;
                    }
                    break;
                case 1630012640:
                    if (str.equals("memojiBuzzToggle")) {
                        b = 19;
                    }
                    break;
                case 1920025932:
                    if (str.equals("preferredMcc")) {
                        b = 20;
                    }
                    break;
                case 2101820724:
                    if (str.equals("noVocal")) {
                        b = 21;
                    }
                    break;
                case 2128195034:
                    if (str.equals("notBlur")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    return true;
                default:
                    return super.parseFieldCheck(loveBuzzRequestParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, loveBuzzRequestParams.duration);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveBuzzRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveBuzzRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveBuzzRequestParams new_() {
        LoveBuzzRequestParams loveBuzzRequestParams = new LoveBuzzRequestParams();
        loveBuzzRequestParams.nullCheck();
        return loveBuzzRequestParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveBuzzRequestParams mo223809clone() {
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
            loveBuzzRequestParams.userInfo = buzzUserInfo.mo223809clone();
        }
        BuzzDeviceInfo buzzDeviceInfo = this.deviceInfo;
        if (buzzDeviceInfo != null) {
            loveBuzzRequestParams.deviceInfo = buzzDeviceInfo.mo223809clone();
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
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
