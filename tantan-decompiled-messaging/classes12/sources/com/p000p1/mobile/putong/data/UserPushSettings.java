package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import java.util.HashSet;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UserPushSettings extends ValueObject<UserPushSettings> implements Cloneable, Serializable {
    public static final String TYPE = "userpushsettings";

    @NonNull
    @ProtobufIndex(index = 23)
    public Boolean allPush;

    @NonNull
    @ProtobufIndex(index = 1)
    @Deprecated
    public Boolean anchorRecommendPush;

    @NonNull
    @ProtobufIndex(index = 2)
    @Deprecated
    public Boolean anchorShowPush;

    @NonNull
    @ProtobufIndex(index = 3)
    @Deprecated
    public Boolean friendNewMomentPush;

    @NonNull
    @ProtobufIndex(index = 17)
    public Boolean livePush;

    @NonNull
    @ProtobufIndex(index = 4)
    public Boolean messagePush;

    @NonNull
    @ProtobufIndex(index = 5)
    @Deprecated
    public Boolean momentCommentPush;

    @NonNull
    @ProtobufIndex(index = 6)
    @Deprecated
    public Boolean momentFollowPush;

    @NonNull
    @ProtobufIndex(index = 7)
    @Deprecated
    public Boolean momentLikePush;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public Boolean momentPush;

    @NonNull
    @ProtobufIndex(index = 14)
    public Boolean msgPush;

    @NonNull
    @ProtobufIndex(index = 8)
    public Boolean newMatchPush;

    @NonNull
    @ProtobufIndex(index = 9)
    public Boolean officialPush;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = 10)
    public Boolean previewMessage;

    @NonNull
    @ProtobufIndex(index = 15)
    public Boolean recommendPush;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 11)
    public Boolean showMomentLikes;

    @NonNull
    @ProtobufIndex(index = 21)
    public Integer silentEndTime;

    @NonNull
    @ProtobufIndex(index = 22)
    public Integer silentStartTime;

    @NonNull
    @ProtobufIndex(index = 19)
    public Boolean silentSwitch;

    @NonNull
    @ProtobufIndex(index = 12)
    @Deprecated
    public Boolean soundPush;

    @NonNull
    @ProtobufIndex(index = 13)
    public Boolean superLikePush;

    @NonNull
    @ProtobufIndex(index = 18)
    public Boolean systemPush;

    @NonNull
    @ProtobufIndex(index = 20)
    public Boolean voiceLivePush;
    public static ProtobufAdapter<UserPushSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPushSettings>() { // from class: com.p1.mobile.putong.data.UserPushSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserPushSettings userPushSettings) {
            Boolean bool = userPushSettings.anchorRecommendPush;
            int iB = bool != null ? CodedOutputByteBufferNano.b(1, bool.booleanValue()) : 0;
            Boolean bool2 = userPushSettings.anchorShowPush;
            if (bool2 != null) {
                iB += CodedOutputByteBufferNano.b(2, bool2.booleanValue());
            }
            Boolean bool3 = userPushSettings.friendNewMomentPush;
            if (bool3 != null) {
                iB += CodedOutputByteBufferNano.b(3, bool3.booleanValue());
            }
            Boolean bool4 = userPushSettings.messagePush;
            if (bool4 != null) {
                iB += CodedOutputByteBufferNano.b(4, bool4.booleanValue());
            }
            Boolean bool5 = userPushSettings.momentCommentPush;
            if (bool5 != null) {
                iB += CodedOutputByteBufferNano.b(5, bool5.booleanValue());
            }
            Boolean bool6 = userPushSettings.momentFollowPush;
            if (bool6 != null) {
                iB += CodedOutputByteBufferNano.b(6, bool6.booleanValue());
            }
            Boolean bool7 = userPushSettings.momentLikePush;
            if (bool7 != null) {
                iB += CodedOutputByteBufferNano.b(7, bool7.booleanValue());
            }
            Boolean bool8 = userPushSettings.newMatchPush;
            if (bool8 != null) {
                iB += CodedOutputByteBufferNano.b(8, bool8.booleanValue());
            }
            Boolean bool9 = userPushSettings.officialPush;
            if (bool9 != null) {
                iB += CodedOutputByteBufferNano.b(9, bool9.booleanValue());
            }
            Boolean bool10 = userPushSettings.previewMessage;
            if (bool10 != null) {
                iB += CodedOutputByteBufferNano.b(10, bool10.booleanValue());
            }
            Boolean bool11 = userPushSettings.showMomentLikes;
            if (bool11 != null) {
                iB += CodedOutputByteBufferNano.b(11, bool11.booleanValue());
            }
            Boolean bool12 = userPushSettings.soundPush;
            if (bool12 != null) {
                iB += CodedOutputByteBufferNano.b(12, bool12.booleanValue());
            }
            Boolean bool13 = userPushSettings.superLikePush;
            if (bool13 != null) {
                iB += CodedOutputByteBufferNano.b(13, bool13.booleanValue());
            }
            Boolean bool14 = userPushSettings.msgPush;
            if (bool14 != null) {
                iB += CodedOutputByteBufferNano.b(14, bool14.booleanValue());
            }
            Boolean bool15 = userPushSettings.recommendPush;
            if (bool15 != null) {
                iB += CodedOutputByteBufferNano.b(15, bool15.booleanValue());
            }
            Boolean bool16 = userPushSettings.momentPush;
            if (bool16 != null) {
                iB += CodedOutputByteBufferNano.b(16, bool16.booleanValue());
            }
            Boolean bool17 = userPushSettings.livePush;
            if (bool17 != null) {
                iB += CodedOutputByteBufferNano.b(17, bool17.booleanValue());
            }
            Boolean bool18 = userPushSettings.systemPush;
            if (bool18 != null) {
                iB += CodedOutputByteBufferNano.b(18, bool18.booleanValue());
            }
            Boolean bool19 = userPushSettings.silentSwitch;
            if (bool19 != null) {
                iB += CodedOutputByteBufferNano.b(19, bool19.booleanValue());
            }
            Boolean bool20 = userPushSettings.voiceLivePush;
            if (bool20 != null) {
                iB += CodedOutputByteBufferNano.b(20, bool20.booleanValue());
            }
            Integer num = userPushSettings.silentEndTime;
            if (num != null) {
                iB += CodedOutputByteBufferNano.h(21, num.intValue());
            }
            Integer num2 = userPushSettings.silentStartTime;
            if (num2 != null) {
                iB += CodedOutputByteBufferNano.h(22, num2.intValue());
            }
            Boolean bool21 = userPushSettings.allPush;
            if (bool21 != null) {
                iB += CodedOutputByteBufferNano.b(23, bool21.booleanValue());
            }
            ((MessageNano) userPushSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserPushSettings m19211parse(nb5 nb5Var) throws IOException {
            UserPushSettings userPushSettings = new UserPushSettings();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (userPushSettings.anchorRecommendPush == null) {
                            userPushSettings.anchorRecommendPush = Boolean.FALSE;
                        }
                        if (userPushSettings.anchorShowPush == null) {
                            userPushSettings.anchorShowPush = Boolean.FALSE;
                        }
                        if (userPushSettings.friendNewMomentPush == null) {
                            userPushSettings.friendNewMomentPush = Boolean.FALSE;
                        }
                        if (userPushSettings.messagePush == null) {
                            userPushSettings.messagePush = Boolean.FALSE;
                        }
                        if (userPushSettings.momentCommentPush == null) {
                            userPushSettings.momentCommentPush = Boolean.FALSE;
                        }
                        if (userPushSettings.momentFollowPush == null) {
                            userPushSettings.momentFollowPush = Boolean.FALSE;
                        }
                        if (userPushSettings.momentLikePush == null) {
                            userPushSettings.momentLikePush = Boolean.FALSE;
                        }
                        if (userPushSettings.newMatchPush == null) {
                            userPushSettings.newMatchPush = Boolean.FALSE;
                        }
                        if (userPushSettings.officialPush == null) {
                            userPushSettings.officialPush = Boolean.FALSE;
                        }
                        if (userPushSettings.previewMessage == null) {
                            userPushSettings.previewMessage = Boolean.FALSE;
                        }
                        if (userPushSettings.showMomentLikes == null) {
                            userPushSettings.showMomentLikes = Boolean.FALSE;
                        }
                        if (userPushSettings.soundPush == null) {
                            userPushSettings.soundPush = Boolean.FALSE;
                        }
                        if (userPushSettings.superLikePush == null) {
                            userPushSettings.superLikePush = Boolean.FALSE;
                        }
                        if (userPushSettings.msgPush == null) {
                            userPushSettings.msgPush = Boolean.FALSE;
                        }
                        if (userPushSettings.recommendPush == null) {
                            userPushSettings.recommendPush = Boolean.FALSE;
                        }
                        if (userPushSettings.momentPush == null) {
                            userPushSettings.momentPush = Boolean.FALSE;
                        }
                        if (userPushSettings.livePush == null) {
                            userPushSettings.livePush = Boolean.FALSE;
                        }
                        if (userPushSettings.systemPush == null) {
                            userPushSettings.systemPush = Boolean.FALSE;
                        }
                        if (userPushSettings.silentSwitch == null) {
                            userPushSettings.silentSwitch = Boolean.FALSE;
                        }
                        if (userPushSettings.voiceLivePush == null) {
                            userPushSettings.voiceLivePush = Boolean.FALSE;
                        }
                        if (userPushSettings.silentEndTime == null) {
                            userPushSettings.silentEndTime = 0;
                        }
                        if (userPushSettings.silentStartTime == null) {
                            userPushSettings.silentStartTime = 0;
                        }
                        if (userPushSettings.allPush == null) {
                            userPushSettings.allPush = Boolean.FALSE;
                        }
                        break;
                    case 8:
                        userPushSettings.anchorRecommendPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        userPushSettings.anchorShowPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 24:
                        userPushSettings.friendNewMomentPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        userPushSettings.messagePush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 40:
                        userPushSettings.momentCommentPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 48:
                        userPushSettings.momentFollowPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 56:
                        userPushSettings.momentLikePush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        userPushSettings.newMatchPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 72:
                        userPushSettings.officialPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 80:
                        userPushSettings.previewMessage = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 88:
                        userPushSettings.showMomentLikes = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 96:
                        userPushSettings.soundPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 104:
                        userPushSettings.superLikePush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 112:
                        userPushSettings.msgPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 120:
                        userPushSettings.recommendPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 128:
                        userPushSettings.momentPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 136:
                        userPushSettings.livePush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 144:
                        userPushSettings.systemPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 152:
                        userPushSettings.silentSwitch = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 160:
                        userPushSettings.voiceLivePush = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 168:
                        userPushSettings.silentEndTime = Integer.valueOf(nb5Var.j());
                        continue;
                    case 176:
                        userPushSettings.silentStartTime = Integer.valueOf(nb5Var.j());
                        continue;
                    case 184:
                        userPushSettings.allPush = Boolean.valueOf(nb5Var.g());
                        continue;
                    default:
                        if (userPushSettings.anchorRecommendPush == null) {
                            userPushSettings.anchorRecommendPush = Boolean.FALSE;
                        }
                        if (userPushSettings.anchorShowPush == null) {
                            userPushSettings.anchorShowPush = Boolean.FALSE;
                        }
                        if (userPushSettings.friendNewMomentPush == null) {
                            userPushSettings.friendNewMomentPush = Boolean.FALSE;
                        }
                        if (userPushSettings.messagePush == null) {
                            userPushSettings.messagePush = Boolean.FALSE;
                        }
                        if (userPushSettings.momentCommentPush == null) {
                            userPushSettings.momentCommentPush = Boolean.FALSE;
                        }
                        if (userPushSettings.momentFollowPush == null) {
                            userPushSettings.momentFollowPush = Boolean.FALSE;
                        }
                        if (userPushSettings.momentLikePush == null) {
                            userPushSettings.momentLikePush = Boolean.FALSE;
                        }
                        if (userPushSettings.newMatchPush == null) {
                            userPushSettings.newMatchPush = Boolean.FALSE;
                        }
                        if (userPushSettings.officialPush == null) {
                            userPushSettings.officialPush = Boolean.FALSE;
                        }
                        if (userPushSettings.previewMessage == null) {
                            userPushSettings.previewMessage = Boolean.FALSE;
                        }
                        if (userPushSettings.showMomentLikes == null) {
                            userPushSettings.showMomentLikes = Boolean.FALSE;
                        }
                        if (userPushSettings.soundPush == null) {
                            userPushSettings.soundPush = Boolean.FALSE;
                        }
                        if (userPushSettings.superLikePush == null) {
                            userPushSettings.superLikePush = Boolean.FALSE;
                        }
                        if (userPushSettings.msgPush == null) {
                            userPushSettings.msgPush = Boolean.FALSE;
                        }
                        if (userPushSettings.recommendPush == null) {
                            userPushSettings.recommendPush = Boolean.FALSE;
                        }
                        if (userPushSettings.momentPush == null) {
                            userPushSettings.momentPush = Boolean.FALSE;
                        }
                        if (userPushSettings.livePush == null) {
                            userPushSettings.livePush = Boolean.FALSE;
                        }
                        if (userPushSettings.systemPush == null) {
                            userPushSettings.systemPush = Boolean.FALSE;
                        }
                        if (userPushSettings.silentSwitch == null) {
                            userPushSettings.silentSwitch = Boolean.FALSE;
                        }
                        if (userPushSettings.voiceLivePush == null) {
                            userPushSettings.voiceLivePush = Boolean.FALSE;
                        }
                        if (userPushSettings.silentEndTime == null) {
                            userPushSettings.silentEndTime = 0;
                        }
                        if (userPushSettings.silentStartTime == null) {
                            userPushSettings.silentStartTime = 0;
                        }
                        if (userPushSettings.allPush == null) {
                            userPushSettings.allPush = Boolean.FALSE;
                            return userPushSettings;
                        }
                        break;
                }
            }
            return userPushSettings;
        }

        public void serialize(UserPushSettings userPushSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userPushSettings.anchorRecommendPush;
            if (bool != null) {
                codedOutputByteBufferNano.A(1, bool.booleanValue());
            }
            Boolean bool2 = userPushSettings.anchorShowPush;
            if (bool2 != null) {
                codedOutputByteBufferNano.A(2, bool2.booleanValue());
            }
            Boolean bool3 = userPushSettings.friendNewMomentPush;
            if (bool3 != null) {
                codedOutputByteBufferNano.A(3, bool3.booleanValue());
            }
            Boolean bool4 = userPushSettings.messagePush;
            if (bool4 != null) {
                codedOutputByteBufferNano.A(4, bool4.booleanValue());
            }
            Boolean bool5 = userPushSettings.momentCommentPush;
            if (bool5 != null) {
                codedOutputByteBufferNano.A(5, bool5.booleanValue());
            }
            Boolean bool6 = userPushSettings.momentFollowPush;
            if (bool6 != null) {
                codedOutputByteBufferNano.A(6, bool6.booleanValue());
            }
            Boolean bool7 = userPushSettings.momentLikePush;
            if (bool7 != null) {
                codedOutputByteBufferNano.A(7, bool7.booleanValue());
            }
            Boolean bool8 = userPushSettings.newMatchPush;
            if (bool8 != null) {
                codedOutputByteBufferNano.A(8, bool8.booleanValue());
            }
            Boolean bool9 = userPushSettings.officialPush;
            if (bool9 != null) {
                codedOutputByteBufferNano.A(9, bool9.booleanValue());
            }
            Boolean bool10 = userPushSettings.previewMessage;
            if (bool10 != null) {
                codedOutputByteBufferNano.A(10, bool10.booleanValue());
            }
            Boolean bool11 = userPushSettings.showMomentLikes;
            if (bool11 != null) {
                codedOutputByteBufferNano.A(11, bool11.booleanValue());
            }
            Boolean bool12 = userPushSettings.soundPush;
            if (bool12 != null) {
                codedOutputByteBufferNano.A(12, bool12.booleanValue());
            }
            Boolean bool13 = userPushSettings.superLikePush;
            if (bool13 != null) {
                codedOutputByteBufferNano.A(13, bool13.booleanValue());
            }
            Boolean bool14 = userPushSettings.msgPush;
            if (bool14 != null) {
                codedOutputByteBufferNano.A(14, bool14.booleanValue());
            }
            Boolean bool15 = userPushSettings.recommendPush;
            if (bool15 != null) {
                codedOutputByteBufferNano.A(15, bool15.booleanValue());
            }
            Boolean bool16 = userPushSettings.momentPush;
            if (bool16 != null) {
                codedOutputByteBufferNano.A(16, bool16.booleanValue());
            }
            Boolean bool17 = userPushSettings.livePush;
            if (bool17 != null) {
                codedOutputByteBufferNano.A(17, bool17.booleanValue());
            }
            Boolean bool18 = userPushSettings.systemPush;
            if (bool18 != null) {
                codedOutputByteBufferNano.A(18, bool18.booleanValue());
            }
            Boolean bool19 = userPushSettings.silentSwitch;
            if (bool19 != null) {
                codedOutputByteBufferNano.A(19, bool19.booleanValue());
            }
            Boolean bool20 = userPushSettings.voiceLivePush;
            if (bool20 != null) {
                codedOutputByteBufferNano.A(20, bool20.booleanValue());
            }
            Integer num = userPushSettings.silentEndTime;
            if (num != null) {
                codedOutputByteBufferNano.G(21, num.intValue());
            }
            Integer num2 = userPushSettings.silentStartTime;
            if (num2 != null) {
                codedOutputByteBufferNano.G(22, num2.intValue());
            }
            Boolean bool21 = userPushSettings.allPush;
            if (bool21 != null) {
                codedOutputByteBufferNano.A(23, bool21.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserPushSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserPushSettings>() { // from class: com.p1.mobile.putong.data.UserPushSettings.2
        public Class getDataClass() {
            return UserPushSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserPushSettings mo17830newInstance() {
            return new UserPushSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(UserPushSettings userPushSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1812607799:
                    if (str.equals("soundPush")) {
                        b = 0;
                    }
                    break;
                case -1476890248:
                    if (str.equals("voiceLivePush")) {
                        b = 1;
                    }
                    break;
                case -1348161215:
                    if (str.equals("anchorRecommendPush")) {
                        b = 2;
                    }
                    break;
                case -1142065674:
                    if (str.equals("recommendPush")) {
                        b = 3;
                    }
                    break;
                case -912268197:
                    if (str.equals("allPush")) {
                        b = 4;
                    }
                    break;
                case -873216063:
                    if (str.equals("messagePush")) {
                        b = 5;
                    }
                    break;
                case -251365124:
                    if (str.equals("friendNewMomentPush")) {
                        b = 6;
                    }
                    break;
                case 121705841:
                    if (str.equals("momentLikePush")) {
                        b = 7;
                    }
                    break;
                case 173210763:
                    if (str.equals("momentFollowPush")) {
                        b = 8;
                    }
                    break;
                case 642770409:
                    if (str.equals("systemPush")) {
                        b = 9;
                    }
                    break;
                case 686073146:
                    if (str.equals("momentPush")) {
                        b = 10;
                    }
                    break;
                case 918346943:
                    if (str.equals("newMatchPush")) {
                        b = 11;
                    }
                    break;
                case 1141564393:
                    if (str.equals("silentSwitch")) {
                        b = 12;
                    }
                    break;
                case 1221616415:
                    if (str.equals("previewMessage")) {
                        b = 13;
                    }
                    break;
                case 1225380915:
                    if (str.equals("silentEndTime")) {
                        b = 14;
                    }
                    break;
                case 1308173690:
                    if (str.equals("silentStartTime")) {
                        b = 15;
                    }
                    break;
                case 1343627835:
                    if (str.equals("msgPush")) {
                        b = 16;
                    }
                    break;
                case 1417575974:
                    if (str.equals("livePush")) {
                        b = 17;
                    }
                    break;
                case 1486573733:
                    if (str.equals("officialPush")) {
                        b = 18;
                    }
                    break;
                case 1595191289:
                    if (str.equals("momentCommentPush")) {
                        b = 19;
                    }
                    break;
                case 1776933260:
                    if (str.equals("anchorShowPush")) {
                        b = 20;
                    }
                    break;
                case 1961496159:
                    if (str.equals("showMomentLikes")) {
                        b = 21;
                    }
                    break;
                case 2049005548:
                    if (str.equals("superLikePush")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    userPushSettings.soundPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 1:
                    userPushSettings.voiceLivePush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 2:
                    userPushSettings.anchorRecommendPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 3:
                    userPushSettings.recommendPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 4:
                    userPushSettings.allPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 5:
                    userPushSettings.messagePush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 6:
                    userPushSettings.friendNewMomentPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 7:
                    userPushSettings.momentLikePush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 8:
                    userPushSettings.momentFollowPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 9:
                    userPushSettings.systemPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 10:
                    userPushSettings.momentPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 11:
                    userPushSettings.newMatchPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 12:
                    userPushSettings.silentSwitch = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 13:
                    userPushSettings.previewMessage = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 14:
                    userPushSettings.silentEndTime = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 15:
                    userPushSettings.silentStartTime = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                    userPushSettings.msgPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 17:
                    userPushSettings.livePush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 18:
                    userPushSettings.officialPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 19:
                    userPushSettings.momentCommentPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 20:
                    userPushSettings.anchorShowPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 21:
                    userPushSettings.showMomentLikes = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 22:
                    userPushSettings.superLikePush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserPushSettings userPushSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "soundPush":
                case "voiceLivePush":
                case "anchorRecommendPush":
                case "recommendPush":
                case "allPush":
                case "messagePush":
                case "friendNewMomentPush":
                case "momentLikePush":
                case "momentFollowPush":
                case "systemPush":
                case "momentPush":
                case "newMatchPush":
                case "silentSwitch":
                case "previewMessage":
                case "silentEndTime":
                case "silentStartTime":
                case "msgPush":
                case "livePush":
                case "officialPush":
                case "momentCommentPush":
                case "anchorShowPush":
                case "showMomentLikes":
                case "superLikePush":
                    return true;
                default:
                    return super.parseFieldCheck(userPushSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserPushSettings userPushSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userPushSettings.anchorRecommendPush;
            if (bool != null) {
                jsonGenerator.writeBooleanField("anchorRecommendPush", bool.booleanValue());
            }
            Boolean bool2 = userPushSettings.anchorShowPush;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("anchorShowPush", bool2.booleanValue());
            }
            Boolean bool3 = userPushSettings.friendNewMomentPush;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField("friendNewMomentPush", bool3.booleanValue());
            }
            Boolean bool4 = userPushSettings.messagePush;
            if (bool4 != null) {
                jsonGenerator.writeBooleanField("messagePush", bool4.booleanValue());
            }
            Boolean bool5 = userPushSettings.momentCommentPush;
            if (bool5 != null) {
                jsonGenerator.writeBooleanField("momentCommentPush", bool5.booleanValue());
            }
            Boolean bool6 = userPushSettings.momentFollowPush;
            if (bool6 != null) {
                jsonGenerator.writeBooleanField("momentFollowPush", bool6.booleanValue());
            }
            Boolean bool7 = userPushSettings.momentLikePush;
            if (bool7 != null) {
                jsonGenerator.writeBooleanField("momentLikePush", bool7.booleanValue());
            }
            Boolean bool8 = userPushSettings.newMatchPush;
            if (bool8 != null) {
                jsonGenerator.writeBooleanField("newMatchPush", bool8.booleanValue());
            }
            Boolean bool9 = userPushSettings.officialPush;
            if (bool9 != null) {
                jsonGenerator.writeBooleanField("officialPush", bool9.booleanValue());
            }
            Boolean bool10 = userPushSettings.previewMessage;
            if (bool10 != null) {
                jsonGenerator.writeBooleanField("previewMessage", bool10.booleanValue());
            }
            Boolean bool11 = userPushSettings.showMomentLikes;
            if (bool11 != null) {
                jsonGenerator.writeBooleanField("showMomentLikes", bool11.booleanValue());
            }
            Boolean bool12 = userPushSettings.soundPush;
            if (bool12 != null) {
                jsonGenerator.writeBooleanField("soundPush", bool12.booleanValue());
            }
            Boolean bool13 = userPushSettings.superLikePush;
            if (bool13 != null) {
                jsonGenerator.writeBooleanField("superLikePush", bool13.booleanValue());
            }
            Boolean bool14 = userPushSettings.msgPush;
            if (bool14 != null) {
                jsonGenerator.writeBooleanField("msgPush", bool14.booleanValue());
            }
            Boolean bool15 = userPushSettings.recommendPush;
            if (bool15 != null) {
                jsonGenerator.writeBooleanField("recommendPush", bool15.booleanValue());
            }
            Boolean bool16 = userPushSettings.momentPush;
            if (bool16 != null) {
                jsonGenerator.writeBooleanField("momentPush", bool16.booleanValue());
            }
            Boolean bool17 = userPushSettings.livePush;
            if (bool17 != null) {
                jsonGenerator.writeBooleanField("livePush", bool17.booleanValue());
            }
            Boolean bool18 = userPushSettings.systemPush;
            if (bool18 != null) {
                jsonGenerator.writeBooleanField("systemPush", bool18.booleanValue());
            }
            Boolean bool19 = userPushSettings.silentSwitch;
            if (bool19 != null) {
                jsonGenerator.writeBooleanField("silentSwitch", bool19.booleanValue());
            }
            Boolean bool20 = userPushSettings.voiceLivePush;
            if (bool20 != null) {
                jsonGenerator.writeBooleanField("voiceLivePush", bool20.booleanValue());
            }
            Integer num = userPushSettings.silentEndTime;
            if (num != null) {
                jsonGenerator.writeNumberField("silentEndTime", num.intValue());
            }
            Integer num2 = userPushSettings.silentStartTime;
            if (num2 != null) {
                jsonGenerator.writeNumberField("silentStartTime", num2.intValue());
            }
            Boolean bool21 = userPushSettings.allPush;
            if (bool21 != null) {
                jsonGenerator.writeBooleanField("allPush", bool21.booleanValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPushSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPushSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserPushSettings new_() {
        UserPushSettings userPushSettings = new UserPushSettings();
        userPushSettings.nullCheck();
        return userPushSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserPushSettings m19210clone() {
        UserPushSettings userPushSettings = new UserPushSettings();
        userPushSettings.anchorRecommendPush = this.anchorRecommendPush;
        userPushSettings.anchorShowPush = this.anchorShowPush;
        userPushSettings.friendNewMomentPush = this.friendNewMomentPush;
        userPushSettings.messagePush = this.messagePush;
        userPushSettings.momentCommentPush = this.momentCommentPush;
        userPushSettings.momentFollowPush = this.momentFollowPush;
        userPushSettings.momentLikePush = this.momentLikePush;
        userPushSettings.newMatchPush = this.newMatchPush;
        userPushSettings.officialPush = this.officialPush;
        userPushSettings.previewMessage = this.previewMessage;
        userPushSettings.showMomentLikes = this.showMomentLikes;
        userPushSettings.soundPush = this.soundPush;
        userPushSettings.superLikePush = this.superLikePush;
        userPushSettings.msgPush = this.msgPush;
        userPushSettings.recommendPush = this.recommendPush;
        userPushSettings.momentPush = this.momentPush;
        userPushSettings.livePush = this.livePush;
        userPushSettings.systemPush = this.systemPush;
        userPushSettings.silentSwitch = this.silentSwitch;
        userPushSettings.voiceLivePush = this.voiceLivePush;
        userPushSettings.silentEndTime = this.silentEndTime;
        userPushSettings.silentStartTime = this.silentStartTime;
        userPushSettings.allPush = this.allPush;
        return userPushSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserPushSettings)) {
            return false;
        }
        UserPushSettings userPushSettings = (UserPushSettings) obj;
        return ValueObject.util_equals(this.anchorRecommendPush, userPushSettings.anchorRecommendPush) && ValueObject.util_equals(this.anchorShowPush, userPushSettings.anchorShowPush) && ValueObject.util_equals(this.friendNewMomentPush, userPushSettings.friendNewMomentPush) && ValueObject.util_equals(this.messagePush, userPushSettings.messagePush) && ValueObject.util_equals(this.momentCommentPush, userPushSettings.momentCommentPush) && ValueObject.util_equals(this.momentFollowPush, userPushSettings.momentFollowPush) && ValueObject.util_equals(this.momentLikePush, userPushSettings.momentLikePush) && ValueObject.util_equals(this.newMatchPush, userPushSettings.newMatchPush) && ValueObject.util_equals(this.officialPush, userPushSettings.officialPush) && ValueObject.util_equals(this.previewMessage, userPushSettings.previewMessage) && ValueObject.util_equals(this.showMomentLikes, userPushSettings.showMomentLikes) && ValueObject.util_equals(this.soundPush, userPushSettings.soundPush) && ValueObject.util_equals(this.superLikePush, userPushSettings.superLikePush) && ValueObject.util_equals(this.msgPush, userPushSettings.msgPush) && ValueObject.util_equals(this.recommendPush, userPushSettings.recommendPush) && ValueObject.util_equals(this.momentPush, userPushSettings.momentPush) && ValueObject.util_equals(this.livePush, userPushSettings.livePush) && ValueObject.util_equals(this.systemPush, userPushSettings.systemPush) && ValueObject.util_equals(this.silentSwitch, userPushSettings.silentSwitch) && ValueObject.util_equals(this.voiceLivePush, userPushSettings.voiceLivePush) && ValueObject.util_equals(this.silentEndTime, userPushSettings.silentEndTime) && ValueObject.util_equals(this.silentStartTime, userPushSettings.silentStartTime) && ValueObject.util_equals(this.allPush, userPushSettings.allPush);
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
        Boolean bool = this.anchorRecommendPush;
        int iHashCode = (i2 + (bool != null ? bool.hashCode() : 0)) * 41;
        Boolean bool2 = this.anchorShowPush;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        Boolean bool3 = this.friendNewMomentPush;
        int iHashCode3 = (iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 41;
        Boolean bool4 = this.messagePush;
        int iHashCode4 = (iHashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 41;
        Boolean bool5 = this.momentCommentPush;
        int iHashCode5 = (iHashCode4 + (bool5 != null ? bool5.hashCode() : 0)) * 41;
        Boolean bool6 = this.momentFollowPush;
        int iHashCode6 = (iHashCode5 + (bool6 != null ? bool6.hashCode() : 0)) * 41;
        Boolean bool7 = this.momentLikePush;
        int iHashCode7 = (iHashCode6 + (bool7 != null ? bool7.hashCode() : 0)) * 41;
        Boolean bool8 = this.newMatchPush;
        int iHashCode8 = (iHashCode7 + (bool8 != null ? bool8.hashCode() : 0)) * 41;
        Boolean bool9 = this.officialPush;
        int iHashCode9 = (iHashCode8 + (bool9 != null ? bool9.hashCode() : 0)) * 41;
        Boolean bool10 = this.previewMessage;
        int iHashCode10 = (iHashCode9 + (bool10 != null ? bool10.hashCode() : 0)) * 41;
        Boolean bool11 = this.showMomentLikes;
        int iHashCode11 = (iHashCode10 + (bool11 != null ? bool11.hashCode() : 0)) * 41;
        Boolean bool12 = this.soundPush;
        int iHashCode12 = (iHashCode11 + (bool12 != null ? bool12.hashCode() : 0)) * 41;
        Boolean bool13 = this.superLikePush;
        int iHashCode13 = (iHashCode12 + (bool13 != null ? bool13.hashCode() : 0)) * 41;
        Boolean bool14 = this.msgPush;
        int iHashCode14 = (iHashCode13 + (bool14 != null ? bool14.hashCode() : 0)) * 41;
        Boolean bool15 = this.recommendPush;
        int iHashCode15 = (iHashCode14 + (bool15 != null ? bool15.hashCode() : 0)) * 41;
        Boolean bool16 = this.momentPush;
        int iHashCode16 = (iHashCode15 + (bool16 != null ? bool16.hashCode() : 0)) * 41;
        Boolean bool17 = this.livePush;
        int iHashCode17 = (iHashCode16 + (bool17 != null ? bool17.hashCode() : 0)) * 41;
        Boolean bool18 = this.systemPush;
        int iHashCode18 = (iHashCode17 + (bool18 != null ? bool18.hashCode() : 0)) * 41;
        Boolean bool19 = this.silentSwitch;
        int iHashCode19 = (iHashCode18 + (bool19 != null ? bool19.hashCode() : 0)) * 41;
        Boolean bool20 = this.voiceLivePush;
        int iHashCode20 = (iHashCode19 + (bool20 != null ? bool20.hashCode() : 0)) * 41;
        Integer num = this.silentEndTime;
        int iHashCode21 = (iHashCode20 + (num != null ? num.hashCode() : 0)) * 41;
        Integer num2 = this.silentStartTime;
        int iHashCode22 = (iHashCode21 + (num2 != null ? num2.hashCode() : 0)) * 41;
        Boolean bool21 = this.allPush;
        int iHashCode23 = iHashCode22 + (bool21 != null ? bool21.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode23;
        return iHashCode23;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(UserPushSettings userPushSettings) {
        if (!shouldMergeData() || equals(userPushSettings)) {
            return;
        }
        if (!isFieldParsed("anchorRecommendPush")) {
            this.anchorRecommendPush = userPushSettings.anchorRecommendPush;
        }
        if (!isFieldParsed("anchorShowPush")) {
            this.anchorShowPush = userPushSettings.anchorShowPush;
        }
        if (!isFieldParsed("friendNewMomentPush")) {
            this.friendNewMomentPush = userPushSettings.friendNewMomentPush;
        }
        if (!isFieldParsed("messagePush")) {
            this.messagePush = userPushSettings.messagePush;
        }
        if (!isFieldParsed("momentCommentPush")) {
            this.momentCommentPush = userPushSettings.momentCommentPush;
        }
        if (!isFieldParsed("momentFollowPush")) {
            this.momentFollowPush = userPushSettings.momentFollowPush;
        }
        if (!isFieldParsed("momentLikePush")) {
            this.momentLikePush = userPushSettings.momentLikePush;
        }
        if (!isFieldParsed("newMatchPush")) {
            this.newMatchPush = userPushSettings.newMatchPush;
        }
        if (!isFieldParsed("officialPush")) {
            this.officialPush = userPushSettings.officialPush;
        }
        if (!isFieldParsed("previewMessage")) {
            this.previewMessage = userPushSettings.previewMessage;
        }
        if (!isFieldParsed("showMomentLikes")) {
            this.showMomentLikes = userPushSettings.showMomentLikes;
        }
        if (!isFieldParsed("soundPush")) {
            this.soundPush = userPushSettings.soundPush;
        }
        if (!isFieldParsed("superLikePush")) {
            this.superLikePush = userPushSettings.superLikePush;
        }
        if (!isFieldParsed("msgPush")) {
            this.msgPush = userPushSettings.msgPush;
        }
        if (!isFieldParsed("recommendPush")) {
            this.recommendPush = userPushSettings.recommendPush;
        }
        if (!isFieldParsed("momentPush")) {
            this.momentPush = userPushSettings.momentPush;
        }
        if (!isFieldParsed("livePush")) {
            this.livePush = userPushSettings.livePush;
        }
        if (!isFieldParsed("systemPush")) {
            this.systemPush = userPushSettings.systemPush;
        }
        if (!isFieldParsed("silentSwitch")) {
            this.silentSwitch = userPushSettings.silentSwitch;
        }
        if (!isFieldParsed("voiceLivePush")) {
            this.voiceLivePush = userPushSettings.voiceLivePush;
        }
        if (!isFieldParsed("silentEndTime")) {
            this.silentEndTime = userPushSettings.silentEndTime;
        }
        if (!isFieldParsed("silentStartTime")) {
            this.silentStartTime = userPushSettings.silentStartTime;
        }
        if (!isFieldParsed("allPush")) {
            this.allPush = userPushSettings.allPush;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        if (this.anchorRecommendPush == null) {
            this.anchorRecommendPush = Boolean.FALSE;
        }
        if (this.anchorShowPush == null) {
            this.anchorShowPush = Boolean.FALSE;
        }
        if (this.friendNewMomentPush == null) {
            this.friendNewMomentPush = Boolean.FALSE;
        }
        if (this.messagePush == null) {
            this.messagePush = Boolean.FALSE;
        }
        if (this.momentCommentPush == null) {
            this.momentCommentPush = Boolean.FALSE;
        }
        if (this.momentFollowPush == null) {
            this.momentFollowPush = Boolean.FALSE;
        }
        if (this.momentLikePush == null) {
            this.momentLikePush = Boolean.FALSE;
        }
        if (this.newMatchPush == null) {
            this.newMatchPush = Boolean.FALSE;
        }
        if (this.officialPush == null) {
            this.officialPush = Boolean.FALSE;
        }
        if (this.previewMessage == null) {
            this.previewMessage = Boolean.FALSE;
        }
        if (this.showMomentLikes == null) {
            this.showMomentLikes = Boolean.FALSE;
        }
        if (this.soundPush == null) {
            this.soundPush = Boolean.FALSE;
        }
        if (this.superLikePush == null) {
            this.superLikePush = Boolean.FALSE;
        }
        if (this.msgPush == null) {
            this.msgPush = Boolean.FALSE;
        }
        if (this.recommendPush == null) {
            this.recommendPush = Boolean.FALSE;
        }
        if (this.momentPush == null) {
            this.momentPush = Boolean.FALSE;
        }
        if (this.livePush == null) {
            this.livePush = Boolean.FALSE;
        }
        if (this.systemPush == null) {
            this.systemPush = Boolean.FALSE;
        }
        if (this.silentSwitch == null) {
            this.silentSwitch = Boolean.FALSE;
        }
        if (this.voiceLivePush == null) {
            this.voiceLivePush = Boolean.FALSE;
        }
        if (this.silentEndTime == null) {
            this.silentEndTime = 0;
        }
        if (this.silentStartTime == null) {
            this.silentStartTime = 0;
        }
        if (this.allPush == null) {
            this.allPush = Boolean.FALSE;
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public UserPushSettings subtract(UserPushSettings userPushSettings) {
        UserPushSettings userPushSettings2 = new UserPushSettings();
        if (!ValueObject.util_equals(this.anchorRecommendPush, userPushSettings.anchorRecommendPush)) {
            userPushSettings2.anchorRecommendPush = this.anchorRecommendPush;
        }
        if (!ValueObject.util_equals(this.anchorShowPush, userPushSettings.anchorShowPush)) {
            userPushSettings2.anchorShowPush = this.anchorShowPush;
        }
        if (!ValueObject.util_equals(this.friendNewMomentPush, userPushSettings.friendNewMomentPush)) {
            userPushSettings2.friendNewMomentPush = this.friendNewMomentPush;
        }
        if (!ValueObject.util_equals(this.messagePush, userPushSettings.messagePush)) {
            userPushSettings2.messagePush = this.messagePush;
        }
        if (!ValueObject.util_equals(this.momentCommentPush, userPushSettings.momentCommentPush)) {
            userPushSettings2.momentCommentPush = this.momentCommentPush;
        }
        if (!ValueObject.util_equals(this.momentFollowPush, userPushSettings.momentFollowPush)) {
            userPushSettings2.momentFollowPush = this.momentFollowPush;
        }
        if (!ValueObject.util_equals(this.momentLikePush, userPushSettings.momentLikePush)) {
            userPushSettings2.momentLikePush = this.momentLikePush;
        }
        if (!ValueObject.util_equals(this.newMatchPush, userPushSettings.newMatchPush)) {
            userPushSettings2.newMatchPush = this.newMatchPush;
        }
        if (!ValueObject.util_equals(this.officialPush, userPushSettings.officialPush)) {
            userPushSettings2.officialPush = this.officialPush;
        }
        if (!ValueObject.util_equals(this.previewMessage, userPushSettings.previewMessage)) {
            userPushSettings2.previewMessage = this.previewMessage;
        }
        if (!ValueObject.util_equals(this.showMomentLikes, userPushSettings.showMomentLikes)) {
            userPushSettings2.showMomentLikes = this.showMomentLikes;
        }
        if (!ValueObject.util_equals(this.soundPush, userPushSettings.soundPush)) {
            userPushSettings2.soundPush = this.soundPush;
        }
        if (!ValueObject.util_equals(this.superLikePush, userPushSettings.superLikePush)) {
            userPushSettings2.superLikePush = this.superLikePush;
        }
        if (!ValueObject.util_equals(this.msgPush, userPushSettings.msgPush)) {
            userPushSettings2.msgPush = this.msgPush;
        }
        if (!ValueObject.util_equals(this.recommendPush, userPushSettings.recommendPush)) {
            userPushSettings2.recommendPush = this.recommendPush;
        }
        if (!ValueObject.util_equals(this.momentPush, userPushSettings.momentPush)) {
            userPushSettings2.momentPush = this.momentPush;
        }
        if (!ValueObject.util_equals(this.livePush, userPushSettings.livePush)) {
            userPushSettings2.livePush = this.livePush;
        }
        if (!ValueObject.util_equals(this.systemPush, userPushSettings.systemPush)) {
            userPushSettings2.systemPush = this.systemPush;
        }
        if (!ValueObject.util_equals(this.silentSwitch, userPushSettings.silentSwitch)) {
            userPushSettings2.silentSwitch = this.silentSwitch;
        }
        if (!ValueObject.util_equals(this.voiceLivePush, userPushSettings.voiceLivePush)) {
            userPushSettings2.voiceLivePush = this.voiceLivePush;
        }
        if (!ValueObject.util_equals(this.silentEndTime, userPushSettings.silentEndTime)) {
            userPushSettings2.silentEndTime = this.silentEndTime;
        }
        if (!ValueObject.util_equals(this.silentStartTime, userPushSettings.silentStartTime)) {
            userPushSettings2.silentStartTime = this.silentStartTime;
        }
        if (!ValueObject.util_equals(this.allPush, userPushSettings.allPush)) {
            userPushSettings2.allPush = this.allPush;
        }
        if (userPushSettings2.equals(new UserPushSettings())) {
            return null;
        }
        return userPushSettings2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
