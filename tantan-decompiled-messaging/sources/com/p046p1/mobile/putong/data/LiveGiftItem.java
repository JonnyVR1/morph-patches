package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveGiftItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livegiftitem";

    @NonNull
    @ProtobufIndex(index = 14)
    public String animationType;

    @NonNull
    @ProtobufIndex(index = 16)
    public String animationUrl;

    @ProtobufIndex(index = 12)
    public long combosDuration;
    public List<Double> detailInset;
    public String detailUrl;

    @NonNull
    @ProtobufIndex(index = 18)
    public String endTagColor;

    @ProtobufIndex(index = 23)
    public long expiredTime;

    @ProtobufIndex(index = 13)
    public int fastGiftNum;

    @ProtobufIndex(index = 11)
    public int giftLevel;

    @ProtobufIndex(index = 21)
    public int giftSource;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftType;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f38772id;

    @NonNull
    @ProtobufIndex(index = 4)
    public LangModel localName;

    @Nullable
    @ProtobufIndex(index = 10)
    public LangModel localTag;

    @ProtobufIndex(index = 24)
    public boolean mobileVibration;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;
    public String packageId;
    public int position;

    @ProtobufIndex(index = 7)
    public double purchasePrice;

    @ProtobufIndex(index = 22)
    public int remain;

    @NonNull
    @ProtobufIndex(index = 17)
    public String startTagColor;

    @NonNull
    @ProtobufIndex(index = 8)
    public String status;
    public String subtitle;

    @Nullable
    @ProtobufIndex(index = 9)
    public String tag;

    @NonNull
    @ProtobufIndex(index = 19)
    public String tagTextColor;
    public String title;

    @ProtobufIndex(index = 20)
    public long trayDuration;

    @ProtobufIndex(index = 6)
    public double unitPrice;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;

    @ProtobufIndex(index = 15)
    public long version;
    public static ProtobufAdapter<LiveGiftItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveGiftItem>() { // from class: com.p1.mobile.putong.data.LiveGiftItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveGiftItem liveGiftItem) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, liveGiftItem.f38772id);
            String str = liveGiftItem.giftType;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = liveGiftItem.name;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            LangModel langModel = liveGiftItem.localName;
            if (langModel != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(4, langModel, LangModel.PROTOBUF_ADAPTER);
            }
            String str3 = liveGiftItem.url;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            int iM17222d = iM17226h + CodedOutputByteBufferNano.m17222d(6, liveGiftItem.unitPrice) + CodedOutputByteBufferNano.m17222d(7, liveGiftItem.purchasePrice);
            String str4 = liveGiftItem.status;
            if (str4 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(8, str4);
            }
            String str5 = liveGiftItem.tag;
            if (str5 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(9, str5);
            }
            LangModel langModel2 = liveGiftItem.localTag;
            if (langModel2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(10, langModel2, LangModel.PROTOBUF_ADAPTER);
            }
            int iM17226h2 = iM17222d + CodedOutputByteBufferNano.m17226h(11, liveGiftItem.giftLevel) + CodedOutputByteBufferNano.m17228j(12, liveGiftItem.combosDuration) + CodedOutputByteBufferNano.m17226h(13, liveGiftItem.fastGiftNum);
            String str6 = liveGiftItem.animationType;
            if (str6 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(14, str6);
            }
            int iM17228j = iM17226h2 + CodedOutputByteBufferNano.m17228j(15, liveGiftItem.version);
            String str7 = liveGiftItem.animationUrl;
            if (str7 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(16, str7);
            }
            String str8 = liveGiftItem.startTagColor;
            if (str8 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(17, str8);
            }
            String str9 = liveGiftItem.endTagColor;
            if (str9 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(18, str9);
            }
            String str10 = liveGiftItem.tagTextColor;
            if (str10 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(19, str10);
            }
            int iM17228j2 = iM17228j + CodedOutputByteBufferNano.m17228j(20, liveGiftItem.trayDuration) + CodedOutputByteBufferNano.m17226h(21, liveGiftItem.giftSource) + CodedOutputByteBufferNano.m17226h(22, liveGiftItem.remain) + CodedOutputByteBufferNano.m17228j(23, liveGiftItem.expiredTime) + CodedOutputByteBufferNano.m17220b(24, liveGiftItem.mobileVibration);
            liveGiftItem.cachedSize = iM17228j2;
            return iM17228j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveGiftItem parse(nb5 nb5Var) throws IOException {
            LiveGiftItem liveGiftItem = new LiveGiftItem();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (liveGiftItem.giftType == null) {
                            liveGiftItem.giftType = "";
                        }
                        if (liveGiftItem.name == null) {
                            liveGiftItem.name = "";
                        }
                        if (liveGiftItem.localName == null) {
                            liveGiftItem.localName = LangModel.new_();
                        }
                        if (liveGiftItem.url == null) {
                            liveGiftItem.url = "";
                        }
                        if (liveGiftItem.status == null) {
                            liveGiftItem.status = "";
                        }
                        if (liveGiftItem.animationType == null) {
                            liveGiftItem.animationType = "";
                        }
                        if (liveGiftItem.animationUrl == null) {
                            liveGiftItem.animationUrl = "";
                        }
                        if (liveGiftItem.startTagColor == null) {
                            liveGiftItem.startTagColor = "";
                        }
                        if (liveGiftItem.endTagColor == null) {
                            liveGiftItem.endTagColor = "";
                        }
                        if (liveGiftItem.tagTextColor == null) {
                            liveGiftItem.tagTextColor = "";
                        }
                        break;
                    case 8:
                        liveGiftItem.f38772id = nb5Var.m158741j();
                        continue;
                    case 18:
                        liveGiftItem.giftType = nb5Var.m158750s();
                        continue;
                    case 26:
                        liveGiftItem.name = nb5Var.m158750s();
                        continue;
                    case 34:
                        liveGiftItem.localName = (LangModel) nb5Var.m158743l(LangModel.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        liveGiftItem.url = nb5Var.m158750s();
                        continue;
                    case 49:
                        liveGiftItem.unitPrice = nb5Var.m158739h();
                        continue;
                    case 57:
                        liveGiftItem.purchasePrice = nb5Var.m158739h();
                        continue;
                    case 66:
                        liveGiftItem.status = nb5Var.m158750s();
                        continue;
                    case 74:
                        liveGiftItem.tag = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        liveGiftItem.localTag = (LangModel) nb5Var.m158743l(LangModel.PROTOBUF_ADAPTER);
                        continue;
                    case 88:
                        liveGiftItem.giftLevel = nb5Var.m158741j();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        liveGiftItem.combosDuration = nb5Var.m158742k();
                        continue;
                    case 104:
                        liveGiftItem.fastGiftNum = nb5Var.m158741j();
                        continue;
                    case 114:
                        liveGiftItem.animationType = nb5Var.m158750s();
                        continue;
                    case 120:
                        liveGiftItem.version = nb5Var.m158742k();
                        continue;
                    case 130:
                        liveGiftItem.animationUrl = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        liveGiftItem.startTagColor = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        liveGiftItem.endTagColor = nb5Var.m158750s();
                        continue;
                    case 154:
                        liveGiftItem.tagTextColor = nb5Var.m158750s();
                        continue;
                    case 160:
                        liveGiftItem.trayDuration = nb5Var.m158742k();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                        liveGiftItem.giftSource = nb5Var.m158741j();
                        continue;
                    case 176:
                        liveGiftItem.remain = nb5Var.m158741j();
                        continue;
                    case 184:
                        liveGiftItem.expiredTime = nb5Var.m158742k();
                        continue;
                    case 192:
                        liveGiftItem.mobileVibration = nb5Var.m158738g();
                        continue;
                    default:
                        if (liveGiftItem.giftType == null) {
                            liveGiftItem.giftType = "";
                        }
                        if (liveGiftItem.name == null) {
                            liveGiftItem.name = "";
                        }
                        if (liveGiftItem.localName == null) {
                            liveGiftItem.localName = LangModel.new_();
                        }
                        if (liveGiftItem.url == null) {
                            liveGiftItem.url = "";
                        }
                        if (liveGiftItem.status == null) {
                            liveGiftItem.status = "";
                        }
                        if (liveGiftItem.animationType == null) {
                            liveGiftItem.animationType = "";
                        }
                        if (liveGiftItem.animationUrl == null) {
                            liveGiftItem.animationUrl = "";
                        }
                        if (liveGiftItem.startTagColor == null) {
                            liveGiftItem.startTagColor = "";
                        }
                        if (liveGiftItem.endTagColor == null) {
                            liveGiftItem.endTagColor = "";
                        }
                        if (liveGiftItem.tagTextColor == null) {
                            liveGiftItem.tagTextColor = "";
                            return liveGiftItem;
                        }
                        break;
                }
            }
            return liveGiftItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveGiftItem liveGiftItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, liveGiftItem.f38772id);
            String str = liveGiftItem.giftType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = liveGiftItem.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            LangModel langModel = liveGiftItem.localName;
            if (langModel != null) {
                codedOutputByteBufferNano.m17254K(4, langModel, LangModel.PROTOBUF_ADAPTER);
            }
            String str3 = liveGiftItem.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            codedOutputByteBufferNano.m17246C(6, liveGiftItem.unitPrice);
            codedOutputByteBufferNano.m17246C(7, liveGiftItem.purchasePrice);
            String str4 = liveGiftItem.status;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(8, str4);
            }
            String str5 = liveGiftItem.tag;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(9, str5);
            }
            LangModel langModel2 = liveGiftItem.localTag;
            if (langModel2 != null) {
                codedOutputByteBufferNano.m17254K(10, langModel2, LangModel.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(11, liveGiftItem.giftLevel);
            codedOutputByteBufferNano.m17252I(12, liveGiftItem.combosDuration);
            codedOutputByteBufferNano.m17250G(13, liveGiftItem.fastGiftNum);
            String str6 = liveGiftItem.animationType;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(14, str6);
            }
            codedOutputByteBufferNano.m17252I(15, liveGiftItem.version);
            String str7 = liveGiftItem.animationUrl;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(16, str7);
            }
            String str8 = liveGiftItem.startTagColor;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(17, str8);
            }
            String str9 = liveGiftItem.endTagColor;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(18, str9);
            }
            String str10 = liveGiftItem.tagTextColor;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(19, str10);
            }
            codedOutputByteBufferNano.m17252I(20, liveGiftItem.trayDuration);
            codedOutputByteBufferNano.m17250G(21, liveGiftItem.giftSource);
            codedOutputByteBufferNano.m17250G(22, liveGiftItem.remain);
            codedOutputByteBufferNano.m17252I(23, liveGiftItem.expiredTime);
            codedOutputByteBufferNano.m17244A(24, liveGiftItem.mobileVibration);
        }
    };
    public static JsonAdapter<LiveGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<LiveGiftItem>() { // from class: com.p1.mobile.putong.data.LiveGiftItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveGiftItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveGiftItem newInstance() {
            return new LiveGiftItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(LiveGiftItem liveGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1337740088:
                    if (str.equals("purchasePrice")) {
                        b = 0;
                    }
                    break;
                case -1205395306:
                    if (str.equals("localName")) {
                        b = 1;
                    }
                    break;
                case -934624660:
                    if (str.equals("remain")) {
                        b = 2;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 3;
                    }
                    break;
                case -662710677:
                    if (str.equals("startTagColor")) {
                        b = 4;
                    }
                    break;
                case -486196699:
                    if (str.equals("unitPrice")) {
                        b = 5;
                    }
                    break;
                case -191636422:
                    if (str.equals("fastGiftNum")) {
                        b = 6;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = 7;
                    }
                    break;
                case -73298198:
                    if (str.equals("trayDuration")) {
                        b = 8;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 9;
                    }
                    break;
                case 114586:
                    if (str.equals("tag")) {
                        b = 10;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 11;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 12;
                    }
                    break;
                case 161356139:
                    if (str.equals("giftSource")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 14;
                    }
                    break;
                case 494484825:
                    if (str.equals("combosDuration")) {
                        b = 15;
                    }
                    break;
                case 552632372:
                    if (str.equals("giftLevel")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 849368202:
                    if (str.equals("giftType")) {
                        b = 17;
                    }
                    break;
                case 1173902155:
                    if (str.equals("animationUrl")) {
                        b = 18;
                    }
                    break;
                case 1268914192:
                    if (str.equals("mobileVibration")) {
                        b = 19;
                    }
                    break;
                case 1757445052:
                    if (str.equals("tagTextColor")) {
                        b = 20;
                    }
                    break;
                case 1900784687:
                    if (str.equals("localTag")) {
                        b = 21;
                    }
                    break;
                case 1967854052:
                    if (str.equals("endTagColor")) {
                        b = 22;
                    }
                    break;
                case 2031205598:
                    if (str.equals("animationType")) {
                        b = 23;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    liveGiftItem.purchasePrice = jsonParser.getValueAsDouble();
                    return true;
                case 1:
                    liveGiftItem.localName = LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    liveGiftItem.remain = jsonParser.getValueAsInt();
                    return true;
                case 3:
                    liveGiftItem.status = jsonParser.getValueAsString();
                    return true;
                case 4:
                    liveGiftItem.startTagColor = jsonParser.getValueAsString();
                    return true;
                case 5:
                    liveGiftItem.unitPrice = jsonParser.getValueAsDouble();
                    return true;
                case 6:
                    liveGiftItem.fastGiftNum = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    liveGiftItem.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case 8:
                    liveGiftItem.trayDuration = jsonParser.getValueAsLong();
                    return true;
                case 9:
                    liveGiftItem.f38772id = jsonParser.getValueAsInt();
                    return false;
                case 10:
                    liveGiftItem.tag = jsonParser.getValueAsString();
                    return true;
                case 11:
                    liveGiftItem.url = jsonParser.getValueAsString();
                    return true;
                case 12:
                    liveGiftItem.name = jsonParser.getValueAsString();
                    return true;
                case 13:
                    liveGiftItem.giftSource = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    liveGiftItem.version = jsonParser.getValueAsLong();
                    return true;
                case 15:
                    liveGiftItem.combosDuration = jsonParser.getValueAsLong();
                    return true;
                case 16:
                    liveGiftItem.giftLevel = jsonParser.getValueAsInt();
                    return true;
                case 17:
                    liveGiftItem.giftType = jsonParser.getValueAsString();
                    return true;
                case 18:
                    liveGiftItem.animationUrl = jsonParser.getValueAsString();
                    return true;
                case 19:
                    liveGiftItem.mobileVibration = jsonParser.getValueAsBoolean();
                    return true;
                case 20:
                    liveGiftItem.tagTextColor = jsonParser.getValueAsString();
                    return true;
                case 21:
                    liveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    liveGiftItem.endTagColor = jsonParser.getValueAsString();
                    return true;
                case 23:
                    liveGiftItem.animationType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(LiveGiftItem liveGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1337740088:
                    if (str.equals("purchasePrice")) {
                        b = 0;
                    }
                    break;
                case -1205395306:
                    if (str.equals("localName")) {
                        b = 1;
                    }
                    break;
                case -934624660:
                    if (str.equals("remain")) {
                        b = 2;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 3;
                    }
                    break;
                case -662710677:
                    if (str.equals("startTagColor")) {
                        b = 4;
                    }
                    break;
                case -486196699:
                    if (str.equals("unitPrice")) {
                        b = 5;
                    }
                    break;
                case -191636422:
                    if (str.equals("fastGiftNum")) {
                        b = 6;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = 7;
                    }
                    break;
                case -73298198:
                    if (str.equals("trayDuration")) {
                        b = 8;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 9;
                    }
                    break;
                case 114586:
                    if (str.equals("tag")) {
                        b = 10;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 11;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 12;
                    }
                    break;
                case 161356139:
                    if (str.equals("giftSource")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 14;
                    }
                    break;
                case 494484825:
                    if (str.equals("combosDuration")) {
                        b = 15;
                    }
                    break;
                case 552632372:
                    if (str.equals("giftLevel")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 849368202:
                    if (str.equals("giftType")) {
                        b = 17;
                    }
                    break;
                case 1173902155:
                    if (str.equals("animationUrl")) {
                        b = 18;
                    }
                    break;
                case 1268914192:
                    if (str.equals("mobileVibration")) {
                        b = 19;
                    }
                    break;
                case 1757445052:
                    if (str.equals("tagTextColor")) {
                        b = 20;
                    }
                    break;
                case 1900784687:
                    if (str.equals("localTag")) {
                        b = 21;
                    }
                    break;
                case 1967854052:
                    if (str.equals("endTagColor")) {
                        b = 22;
                    }
                    break;
                case 2031205598:
                    if (str.equals("animationType")) {
                        b = 23;
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
                    return true;
                case 9:
                    return false;
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
                case 23:
                    return true;
                default:
                    return super.parseFieldCheck(liveGiftItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveGiftItem liveGiftItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", liveGiftItem.f38772id);
            String str = liveGiftItem.giftType;
            if (str != null) {
                jsonGenerator.writeStringField("giftType", str);
            }
            String str2 = liveGiftItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (liveGiftItem.localName != null) {
                jsonGenerator.writeFieldName("localName");
                LangModel.JSON_ADAPTER.serialize(liveGiftItem.localName, jsonGenerator, true);
            }
            String str3 = liveGiftItem.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeNumberField("unitPrice", liveGiftItem.unitPrice);
            jsonGenerator.writeNumberField("purchasePrice", liveGiftItem.purchasePrice);
            String str4 = liveGiftItem.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
            String str5 = liveGiftItem.tag;
            if (str5 != null) {
                jsonGenerator.writeStringField("tag", str5);
            }
            if (liveGiftItem.localTag != null) {
                jsonGenerator.writeFieldName("localTag");
                LangModel.JSON_ADAPTER.serialize(liveGiftItem.localTag, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("giftLevel", liveGiftItem.giftLevel);
            jsonGenerator.writeNumberField("combosDuration", liveGiftItem.combosDuration);
            jsonGenerator.writeNumberField("fastGiftNum", liveGiftItem.fastGiftNum);
            String str6 = liveGiftItem.animationType;
            if (str6 != null) {
                jsonGenerator.writeStringField("animationType", str6);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, liveGiftItem.version);
            String str7 = liveGiftItem.animationUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("animationUrl", str7);
            }
            String str8 = liveGiftItem.startTagColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("startTagColor", str8);
            }
            String str9 = liveGiftItem.endTagColor;
            if (str9 != null) {
                jsonGenerator.writeStringField("endTagColor", str9);
            }
            String str10 = liveGiftItem.tagTextColor;
            if (str10 != null) {
                jsonGenerator.writeStringField("tagTextColor", str10);
            }
            jsonGenerator.writeNumberField("trayDuration", liveGiftItem.trayDuration);
            jsonGenerator.writeNumberField("giftSource", liveGiftItem.giftSource);
            jsonGenerator.writeNumberField("remain", liveGiftItem.remain);
            jsonGenerator.writeNumberField("expiredTime", liveGiftItem.expiredTime);
            jsonGenerator.writeBooleanField("mobileVibration", liveGiftItem.mobileVibration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveGiftItem new_() {
        LiveGiftItem liveGiftItem = new LiveGiftItem();
        liveGiftItem.nullCheck();
        return liveGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveGiftItem mo223809clone() {
        LiveGiftItem liveGiftItem = new LiveGiftItem();
        liveGiftItem.f38772id = this.f38772id;
        liveGiftItem.giftType = this.giftType;
        liveGiftItem.name = this.name;
        LangModel langModel = this.localName;
        if (langModel != null) {
            liveGiftItem.localName = langModel.mo223809clone();
        }
        liveGiftItem.url = this.url;
        liveGiftItem.unitPrice = this.unitPrice;
        liveGiftItem.purchasePrice = this.purchasePrice;
        liveGiftItem.status = this.status;
        liveGiftItem.tag = this.tag;
        LangModel langModel2 = this.localTag;
        if (langModel2 != null) {
            liveGiftItem.localTag = langModel2.mo223809clone();
        }
        liveGiftItem.giftLevel = this.giftLevel;
        liveGiftItem.combosDuration = this.combosDuration;
        liveGiftItem.fastGiftNum = this.fastGiftNum;
        liveGiftItem.animationType = this.animationType;
        liveGiftItem.version = this.version;
        liveGiftItem.animationUrl = this.animationUrl;
        liveGiftItem.startTagColor = this.startTagColor;
        liveGiftItem.endTagColor = this.endTagColor;
        liveGiftItem.tagTextColor = this.tagTextColor;
        liveGiftItem.trayDuration = this.trayDuration;
        liveGiftItem.giftSource = this.giftSource;
        liveGiftItem.remain = this.remain;
        liveGiftItem.expiredTime = this.expiredTime;
        liveGiftItem.mobileVibration = this.mobileVibration;
        return liveGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveGiftItem)) {
            return false;
        }
        LiveGiftItem liveGiftItem = (LiveGiftItem) obj;
        return this.f38772id == liveGiftItem.f38772id && ValueObject.util_equals(this.giftType, liveGiftItem.giftType) && ValueObject.util_equals(this.name, liveGiftItem.name) && ValueObject.util_equals(this.localName, liveGiftItem.localName) && ValueObject.util_equals(this.url, liveGiftItem.url) && this.unitPrice == liveGiftItem.unitPrice && this.purchasePrice == liveGiftItem.purchasePrice && ValueObject.util_equals(this.status, liveGiftItem.status) && ValueObject.util_equals(this.tag, liveGiftItem.tag) && ValueObject.util_equals(this.localTag, liveGiftItem.localTag) && this.giftLevel == liveGiftItem.giftLevel && this.combosDuration == liveGiftItem.combosDuration && this.fastGiftNum == liveGiftItem.fastGiftNum && ValueObject.util_equals(this.animationType, liveGiftItem.animationType) && this.version == liveGiftItem.version && ValueObject.util_equals(this.animationUrl, liveGiftItem.animationUrl) && ValueObject.util_equals(this.startTagColor, liveGiftItem.startTagColor) && ValueObject.util_equals(this.endTagColor, liveGiftItem.endTagColor) && ValueObject.util_equals(this.tagTextColor, liveGiftItem.tagTextColor) && this.trayDuration == liveGiftItem.trayDuration && this.giftSource == liveGiftItem.giftSource && this.remain == liveGiftItem.remain && this.expiredTime == liveGiftItem.expiredTime && this.mobileVibration == liveGiftItem.mobileVibration;
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
        int i2 = ((i * 41) + this.f38772id) * 41;
        String str = this.giftType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        LangModel langModel = this.localName;
        int iHashCode3 = (iHashCode2 + (langModel != null ? langModel.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.unitPrice);
        int i3 = ((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.purchasePrice);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str4 = this.status;
        int iHashCode5 = (i4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.tag;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        LangModel langModel2 = this.localTag;
        int iHashCode7 = (((iHashCode6 + (langModel2 != null ? langModel2.hashCode() : 0)) * 41) + this.giftLevel) * 41;
        long j = this.combosDuration;
        int i5 = (((iHashCode7 + ((int) (j ^ (j >>> 32)))) * 41) + this.fastGiftNum) * 41;
        String str6 = this.animationType;
        int iHashCode8 = (i5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        long j2 = this.version;
        int i6 = (iHashCode8 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str7 = this.animationUrl;
        int iHashCode9 = (i6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.startTagColor;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.endTagColor;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.tagTextColor;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 41;
        long j3 = this.trayDuration;
        int i7 = (((((iHashCode12 + ((int) (j3 ^ (j3 >>> 32)))) * 41) + this.giftSource) * 41) + this.remain) * 41;
        long j4 = this.expiredTime;
        int i8 = ((i7 + ((int) (j4 ^ (j4 >>> 32)))) * 41) + (this.mobileVibration ? 1231 : 1237);
        this.hashCode = i8;
        return i8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftType == null) {
            this.giftType = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.localName == null) {
            this.localName = LangModel.new_();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.animationType == null) {
            this.animationType = "";
        }
        if (this.animationUrl == null) {
            this.animationUrl = "";
        }
        if (this.startTagColor == null) {
            this.startTagColor = "";
        }
        if (this.endTagColor == null) {
            this.endTagColor = "";
        }
        if (this.tagTextColor == null) {
            this.tagTextColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
