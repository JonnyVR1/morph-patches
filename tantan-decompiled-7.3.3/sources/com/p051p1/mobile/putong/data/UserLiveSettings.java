package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class UserLiveSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userlivesettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean closeEnterRoomMsg;

    @NonNull
    @ProtobufIndex(index = 2)
    public Boolean closeSmallWindow;

    @NonNull
    @ProtobufIndex(index = 7)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 15)
    public Boolean hideDiamondTag;

    @NonNull
    @ProtobufIndex(index = 11)
    public Boolean hideMomentsWealthTag;

    @NonNull
    @ProtobufIndex(index = 12)
    public Boolean hideProfileWealthTag;

    @NonNull
    @ProtobufIndex(index = 8)
    public Boolean hideStoppedRoom;

    @NonNull
    @ProtobufIndex(index = 13)
    public Boolean hideSwipeWealthTag;

    @NonNull
    @ProtobufIndex(index = 9)
    public Boolean hideVoiceOnCall;

    @NonNull
    @ProtobufIndex(index = 4)
    public Boolean intlAdUser;

    @NonNull
    @ProtobufIndex(index = 14)
    public Boolean isDiamondVIP;

    @NonNull
    @ProtobufIndex(index = 16)
    public String pureModeGroup;

    @NonNull
    @ProtobufIndex(index = 5)
    public String regionTag;

    @NonNull
    @ProtobufIndex(index = 17)
    public String showVoiceStatus;

    @NonNull
    @ProtobufIndex(index = 3)
    public Boolean teenModeEnable;

    @NonNull
    @ProtobufIndex(index = 18)
    public String voiceNotification;

    @NonNull
    @ProtobufIndex(index = 6)
    public Boolean voiceWindowEnable;

    @ProtobufIndex(index = 10)
    public int wealthGrade;
    public static ProtobufAdapter<UserLiveSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveSettings>() { // from class: com.p1.mobile.putong.data.UserLiveSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserLiveSettings userLiveSettings) {
            Boolean bool = userLiveSettings.closeEnterRoomMsg;
            int iM17275b = bool != null ? CodedOutputByteBufferNano.m17275b(1, bool.booleanValue()) : 0;
            Boolean bool2 = userLiveSettings.closeSmallWindow;
            if (bool2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(2, bool2.booleanValue());
            }
            Boolean bool3 = userLiveSettings.teenModeEnable;
            if (bool3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(3, bool3.booleanValue());
            }
            Boolean bool4 = userLiveSettings.intlAdUser;
            if (bool4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(4, bool4.booleanValue());
            }
            String str = userLiveSettings.regionTag;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(5, str);
            }
            Boolean bool5 = userLiveSettings.voiceWindowEnable;
            if (bool5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(6, bool5.booleanValue());
            }
            String str2 = userLiveSettings.fakeId;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str2);
            }
            Boolean bool6 = userLiveSettings.hideStoppedRoom;
            if (bool6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(8, bool6.booleanValue());
            }
            Boolean bool7 = userLiveSettings.hideVoiceOnCall;
            if (bool7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(9, bool7.booleanValue());
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(10, userLiveSettings.wealthGrade);
            Boolean bool8 = userLiveSettings.hideMomentsWealthTag;
            if (bool8 != null) {
                iM17281h += CodedOutputByteBufferNano.m17275b(11, bool8.booleanValue());
            }
            Boolean bool9 = userLiveSettings.hideProfileWealthTag;
            if (bool9 != null) {
                iM17281h += CodedOutputByteBufferNano.m17275b(12, bool9.booleanValue());
            }
            Boolean bool10 = userLiveSettings.hideSwipeWealthTag;
            if (bool10 != null) {
                iM17281h += CodedOutputByteBufferNano.m17275b(13, bool10.booleanValue());
            }
            Boolean bool11 = userLiveSettings.isDiamondVIP;
            if (bool11 != null) {
                iM17281h += CodedOutputByteBufferNano.m17275b(14, bool11.booleanValue());
            }
            Boolean bool12 = userLiveSettings.hideDiamondTag;
            if (bool12 != null) {
                iM17281h += CodedOutputByteBufferNano.m17275b(15, bool12.booleanValue());
            }
            String str3 = userLiveSettings.pureModeGroup;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(16, str3);
            }
            String str4 = userLiveSettings.showVoiceStatus;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(17, str4);
            }
            String str5 = userLiveSettings.voiceNotification;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(18, str5);
            }
            userLiveSettings.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserLiveSettings parse(nc5 nc5Var) throws IOException {
            UserLiveSettings userLiveSettings = new UserLiveSettings();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (userLiveSettings.closeEnterRoomMsg == null) {
                            userLiveSettings.closeEnterRoomMsg = Boolean.FALSE;
                        }
                        if (userLiveSettings.closeSmallWindow == null) {
                            userLiveSettings.closeSmallWindow = Boolean.FALSE;
                        }
                        if (userLiveSettings.teenModeEnable == null) {
                            userLiveSettings.teenModeEnable = Boolean.FALSE;
                        }
                        if (userLiveSettings.intlAdUser == null) {
                            userLiveSettings.intlAdUser = Boolean.FALSE;
                        }
                        if (userLiveSettings.regionTag == null) {
                            userLiveSettings.regionTag = "";
                        }
                        if (userLiveSettings.voiceWindowEnable == null) {
                            userLiveSettings.voiceWindowEnable = Boolean.FALSE;
                        }
                        if (userLiveSettings.fakeId == null) {
                            userLiveSettings.fakeId = "";
                        }
                        if (userLiveSettings.hideStoppedRoom == null) {
                            userLiveSettings.hideStoppedRoom = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideVoiceOnCall == null) {
                            userLiveSettings.hideVoiceOnCall = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideMomentsWealthTag == null) {
                            userLiveSettings.hideMomentsWealthTag = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideProfileWealthTag == null) {
                            userLiveSettings.hideProfileWealthTag = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideSwipeWealthTag == null) {
                            userLiveSettings.hideSwipeWealthTag = Boolean.FALSE;
                        }
                        if (userLiveSettings.isDiamondVIP == null) {
                            userLiveSettings.isDiamondVIP = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideDiamondTag == null) {
                            userLiveSettings.hideDiamondTag = Boolean.FALSE;
                        }
                        if (userLiveSettings.pureModeGroup == null) {
                            userLiveSettings.pureModeGroup = "";
                        }
                        if (userLiveSettings.showVoiceStatus == null) {
                            userLiveSettings.showVoiceStatus = "";
                        }
                        if (userLiveSettings.voiceNotification == null) {
                            userLiveSettings.voiceNotification = "";
                        }
                        break;
                    case 8:
                        userLiveSettings.closeEnterRoomMsg = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 16:
                        userLiveSettings.closeSmallWindow = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 24:
                        userLiveSettings.teenModeEnable = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 32:
                        userLiveSettings.intlAdUser = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 42:
                        userLiveSettings.regionTag = nc5Var.m162495s();
                        continue;
                    case 48:
                        userLiveSettings.voiceWindowEnable = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 58:
                        userLiveSettings.fakeId = nc5Var.m162495s();
                        continue;
                    case 64:
                        userLiveSettings.hideStoppedRoom = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 72:
                        userLiveSettings.hideVoiceOnCall = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 80:
                        userLiveSettings.wealthGrade = nc5Var.m162486j();
                        continue;
                    case 88:
                        userLiveSettings.hideMomentsWealthTag = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case Opcodes.IADD /* 96 */:
                        userLiveSettings.hideProfileWealthTag = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 104:
                        userLiveSettings.hideSwipeWealthTag = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 112:
                        userLiveSettings.isDiamondVIP = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 120:
                        userLiveSettings.hideDiamondTag = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 130:
                        userLiveSettings.pureModeGroup = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        userLiveSettings.showVoiceStatus = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        userLiveSettings.voiceNotification = nc5Var.m162495s();
                        continue;
                    default:
                        if (userLiveSettings.closeEnterRoomMsg == null) {
                            userLiveSettings.closeEnterRoomMsg = Boolean.FALSE;
                        }
                        if (userLiveSettings.closeSmallWindow == null) {
                            userLiveSettings.closeSmallWindow = Boolean.FALSE;
                        }
                        if (userLiveSettings.teenModeEnable == null) {
                            userLiveSettings.teenModeEnable = Boolean.FALSE;
                        }
                        if (userLiveSettings.intlAdUser == null) {
                            userLiveSettings.intlAdUser = Boolean.FALSE;
                        }
                        if (userLiveSettings.regionTag == null) {
                            userLiveSettings.regionTag = "";
                        }
                        if (userLiveSettings.voiceWindowEnable == null) {
                            userLiveSettings.voiceWindowEnable = Boolean.FALSE;
                        }
                        if (userLiveSettings.fakeId == null) {
                            userLiveSettings.fakeId = "";
                        }
                        if (userLiveSettings.hideStoppedRoom == null) {
                            userLiveSettings.hideStoppedRoom = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideVoiceOnCall == null) {
                            userLiveSettings.hideVoiceOnCall = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideMomentsWealthTag == null) {
                            userLiveSettings.hideMomentsWealthTag = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideProfileWealthTag == null) {
                            userLiveSettings.hideProfileWealthTag = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideSwipeWealthTag == null) {
                            userLiveSettings.hideSwipeWealthTag = Boolean.FALSE;
                        }
                        if (userLiveSettings.isDiamondVIP == null) {
                            userLiveSettings.isDiamondVIP = Boolean.FALSE;
                        }
                        if (userLiveSettings.hideDiamondTag == null) {
                            userLiveSettings.hideDiamondTag = Boolean.FALSE;
                        }
                        if (userLiveSettings.pureModeGroup == null) {
                            userLiveSettings.pureModeGroup = "";
                        }
                        if (userLiveSettings.showVoiceStatus == null) {
                            userLiveSettings.showVoiceStatus = "";
                        }
                        if (userLiveSettings.voiceNotification == null) {
                            userLiveSettings.voiceNotification = "";
                            return userLiveSettings;
                        }
                        break;
                }
            }
            return userLiveSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserLiveSettings userLiveSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userLiveSettings.closeEnterRoomMsg;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(1, bool.booleanValue());
            }
            Boolean bool2 = userLiveSettings.closeSmallWindow;
            if (bool2 != null) {
                codedOutputByteBufferNano.m17299A(2, bool2.booleanValue());
            }
            Boolean bool3 = userLiveSettings.teenModeEnable;
            if (bool3 != null) {
                codedOutputByteBufferNano.m17299A(3, bool3.booleanValue());
            }
            Boolean bool4 = userLiveSettings.intlAdUser;
            if (bool4 != null) {
                codedOutputByteBufferNano.m17299A(4, bool4.booleanValue());
            }
            String str = userLiveSettings.regionTag;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(5, str);
            }
            Boolean bool5 = userLiveSettings.voiceWindowEnable;
            if (bool5 != null) {
                codedOutputByteBufferNano.m17299A(6, bool5.booleanValue());
            }
            String str2 = userLiveSettings.fakeId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(7, str2);
            }
            Boolean bool6 = userLiveSettings.hideStoppedRoom;
            if (bool6 != null) {
                codedOutputByteBufferNano.m17299A(8, bool6.booleanValue());
            }
            Boolean bool7 = userLiveSettings.hideVoiceOnCall;
            if (bool7 != null) {
                codedOutputByteBufferNano.m17299A(9, bool7.booleanValue());
            }
            codedOutputByteBufferNano.m17305G(10, userLiveSettings.wealthGrade);
            Boolean bool8 = userLiveSettings.hideMomentsWealthTag;
            if (bool8 != null) {
                codedOutputByteBufferNano.m17299A(11, bool8.booleanValue());
            }
            Boolean bool9 = userLiveSettings.hideProfileWealthTag;
            if (bool9 != null) {
                codedOutputByteBufferNano.m17299A(12, bool9.booleanValue());
            }
            Boolean bool10 = userLiveSettings.hideSwipeWealthTag;
            if (bool10 != null) {
                codedOutputByteBufferNano.m17299A(13, bool10.booleanValue());
            }
            Boolean bool11 = userLiveSettings.isDiamondVIP;
            if (bool11 != null) {
                codedOutputByteBufferNano.m17299A(14, bool11.booleanValue());
            }
            Boolean bool12 = userLiveSettings.hideDiamondTag;
            if (bool12 != null) {
                codedOutputByteBufferNano.m17299A(15, bool12.booleanValue());
            }
            String str3 = userLiveSettings.pureModeGroup;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(16, str3);
            }
            String str4 = userLiveSettings.showVoiceStatus;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(17, str4);
            }
            String str5 = userLiveSettings.voiceNotification;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(18, str5);
            }
        }
    };
    public static JsonAdapter<UserLiveSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveSettings>() { // from class: com.p1.mobile.putong.data.UserLiveSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserLiveSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserLiveSettings newInstance() {
            return new UserLiveSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(UserLiveSettings userLiveSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1980554620:
                    if (str.equals("pureModeGroup")) {
                        b = 0;
                    }
                    break;
                case -1358281592:
                    if (str.equals("hideDiamondTag")) {
                        b = 1;
                    }
                    break;
                case -1308368371:
                    if (str.equals("hideVoiceOnCall")) {
                        b = 2;
                    }
                    break;
                case -1281925296:
                    if (str.equals("fakeId")) {
                        b = 3;
                    }
                    break;
                case -1085998261:
                    if (str.equals("intlAdUser")) {
                        b = 4;
                    }
                    break;
                case -789796644:
                    if (str.equals("hideMomentsWealthTag")) {
                        b = 5;
                    }
                    break;
                case -474471002:
                    if (str.equals("hideStoppedRoom")) {
                        b = 6;
                    }
                    break;
                case -115788827:
                    if (str.equals("voiceWindowEnable")) {
                        b = 7;
                    }
                    break;
                case 74337286:
                    if (str.equals("regionTag")) {
                        b = 8;
                    }
                    break;
                case 198253158:
                    if (str.equals("hideProfileWealthTag")) {
                        b = 9;
                    }
                    break;
                case 383510726:
                    if (str.equals("closeEnterRoomMsg")) {
                        b = 10;
                    }
                    break;
                case 672406400:
                    if (str.equals("teenModeEnable")) {
                        b = 11;
                    }
                    break;
                case 1176395818:
                    if (str.equals("wealthGrade")) {
                        b = 12;
                    }
                    break;
                case 1680652019:
                    if (str.equals("isDiamondVIP")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1902381173:
                    if (str.equals("hideSwipeWealthTag")) {
                        b = 14;
                    }
                    break;
                case 1996495551:
                    if (str.equals("closeSmallWindow")) {
                        b = 15;
                    }
                    break;
                case 2001109821:
                    if (str.equals("voiceNotification")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 2112384135:
                    if (str.equals("showVoiceStatus")) {
                        b = 17;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    userLiveSettings.pureModeGroup = jsonParser.getValueAsString();
                    return true;
                case 1:
                    userLiveSettings.hideDiamondTag = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 2:
                    userLiveSettings.hideVoiceOnCall = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 3:
                    userLiveSettings.fakeId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    userLiveSettings.intlAdUser = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 5:
                    userLiveSettings.hideMomentsWealthTag = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 6:
                    userLiveSettings.hideStoppedRoom = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 7:
                    userLiveSettings.voiceWindowEnable = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 8:
                    userLiveSettings.regionTag = jsonParser.getValueAsString();
                    return true;
                case 9:
                    userLiveSettings.hideProfileWealthTag = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 10:
                    userLiveSettings.closeEnterRoomMsg = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 11:
                    userLiveSettings.teenModeEnable = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 12:
                    userLiveSettings.wealthGrade = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    userLiveSettings.isDiamondVIP = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 14:
                    userLiveSettings.hideSwipeWealthTag = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 15:
                    userLiveSettings.closeSmallWindow = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 16:
                    userLiveSettings.voiceNotification = jsonParser.getValueAsString();
                    return true;
                case 17:
                    userLiveSettings.showVoiceStatus = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(UserLiveSettings userLiveSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1980554620:
                    if (str.equals("pureModeGroup")) {
                        b = 0;
                    }
                    break;
                case -1358281592:
                    if (str.equals("hideDiamondTag")) {
                        b = 1;
                    }
                    break;
                case -1308368371:
                    if (str.equals("hideVoiceOnCall")) {
                        b = 2;
                    }
                    break;
                case -1281925296:
                    if (str.equals("fakeId")) {
                        b = 3;
                    }
                    break;
                case -1085998261:
                    if (str.equals("intlAdUser")) {
                        b = 4;
                    }
                    break;
                case -789796644:
                    if (str.equals("hideMomentsWealthTag")) {
                        b = 5;
                    }
                    break;
                case -474471002:
                    if (str.equals("hideStoppedRoom")) {
                        b = 6;
                    }
                    break;
                case -115788827:
                    if (str.equals("voiceWindowEnable")) {
                        b = 7;
                    }
                    break;
                case 74337286:
                    if (str.equals("regionTag")) {
                        b = 8;
                    }
                    break;
                case 198253158:
                    if (str.equals("hideProfileWealthTag")) {
                        b = 9;
                    }
                    break;
                case 383510726:
                    if (str.equals("closeEnterRoomMsg")) {
                        b = 10;
                    }
                    break;
                case 672406400:
                    if (str.equals("teenModeEnable")) {
                        b = 11;
                    }
                    break;
                case 1176395818:
                    if (str.equals("wealthGrade")) {
                        b = 12;
                    }
                    break;
                case 1680652019:
                    if (str.equals("isDiamondVIP")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1902381173:
                    if (str.equals("hideSwipeWealthTag")) {
                        b = 14;
                    }
                    break;
                case 1996495551:
                    if (str.equals("closeSmallWindow")) {
                        b = 15;
                    }
                    break;
                case 2001109821:
                    if (str.equals("voiceNotification")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 2112384135:
                    if (str.equals("showVoiceStatus")) {
                        b = 17;
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
                    return true;
                default:
                    return super.parseFieldCheck(userLiveSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserLiveSettings userLiveSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userLiveSettings.closeEnterRoomMsg;
            if (bool != null) {
                jsonGenerator.writeBooleanField("closeEnterRoomMsg", bool.booleanValue());
            }
            Boolean bool2 = userLiveSettings.closeSmallWindow;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("closeSmallWindow", bool2.booleanValue());
            }
            Boolean bool3 = userLiveSettings.teenModeEnable;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField("teenModeEnable", bool3.booleanValue());
            }
            Boolean bool4 = userLiveSettings.intlAdUser;
            if (bool4 != null) {
                jsonGenerator.writeBooleanField("intlAdUser", bool4.booleanValue());
            }
            String str = userLiveSettings.regionTag;
            if (str != null) {
                jsonGenerator.writeStringField("regionTag", str);
            }
            Boolean bool5 = userLiveSettings.voiceWindowEnable;
            if (bool5 != null) {
                jsonGenerator.writeBooleanField("voiceWindowEnable", bool5.booleanValue());
            }
            String str2 = userLiveSettings.fakeId;
            if (str2 != null) {
                jsonGenerator.writeStringField("fakeId", str2);
            }
            Boolean bool6 = userLiveSettings.hideStoppedRoom;
            if (bool6 != null) {
                jsonGenerator.writeBooleanField("hideStoppedRoom", bool6.booleanValue());
            }
            Boolean bool7 = userLiveSettings.hideVoiceOnCall;
            if (bool7 != null) {
                jsonGenerator.writeBooleanField("hideVoiceOnCall", bool7.booleanValue());
            }
            jsonGenerator.writeNumberField("wealthGrade", userLiveSettings.wealthGrade);
            Boolean bool8 = userLiveSettings.hideMomentsWealthTag;
            if (bool8 != null) {
                jsonGenerator.writeBooleanField("hideMomentsWealthTag", bool8.booleanValue());
            }
            Boolean bool9 = userLiveSettings.hideProfileWealthTag;
            if (bool9 != null) {
                jsonGenerator.writeBooleanField("hideProfileWealthTag", bool9.booleanValue());
            }
            Boolean bool10 = userLiveSettings.hideSwipeWealthTag;
            if (bool10 != null) {
                jsonGenerator.writeBooleanField("hideSwipeWealthTag", bool10.booleanValue());
            }
            Boolean bool11 = userLiveSettings.isDiamondVIP;
            if (bool11 != null) {
                jsonGenerator.writeBooleanField("isDiamondVIP", bool11.booleanValue());
            }
            Boolean bool12 = userLiveSettings.hideDiamondTag;
            if (bool12 != null) {
                jsonGenerator.writeBooleanField("hideDiamondTag", bool12.booleanValue());
            }
            String str3 = userLiveSettings.pureModeGroup;
            if (str3 != null) {
                jsonGenerator.writeStringField("pureModeGroup", str3);
            }
            String str4 = userLiveSettings.showVoiceStatus;
            if (str4 != null) {
                jsonGenerator.writeStringField("showVoiceStatus", str4);
            }
            String str5 = userLiveSettings.voiceNotification;
            if (str5 != null) {
                jsonGenerator.writeStringField("voiceNotification", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveSettings new_() {
        UserLiveSettings userLiveSettings = new UserLiveSettings();
        userLiveSettings.nullCheck();
        return userLiveSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserLiveSettings mo225055clone() {
        UserLiveSettings userLiveSettings = new UserLiveSettings();
        userLiveSettings.closeEnterRoomMsg = this.closeEnterRoomMsg;
        userLiveSettings.closeSmallWindow = this.closeSmallWindow;
        userLiveSettings.teenModeEnable = this.teenModeEnable;
        userLiveSettings.intlAdUser = this.intlAdUser;
        userLiveSettings.regionTag = this.regionTag;
        userLiveSettings.voiceWindowEnable = this.voiceWindowEnable;
        userLiveSettings.fakeId = this.fakeId;
        userLiveSettings.hideStoppedRoom = this.hideStoppedRoom;
        userLiveSettings.hideVoiceOnCall = this.hideVoiceOnCall;
        userLiveSettings.wealthGrade = this.wealthGrade;
        userLiveSettings.hideMomentsWealthTag = this.hideMomentsWealthTag;
        userLiveSettings.hideProfileWealthTag = this.hideProfileWealthTag;
        userLiveSettings.hideSwipeWealthTag = this.hideSwipeWealthTag;
        userLiveSettings.isDiamondVIP = this.isDiamondVIP;
        userLiveSettings.hideDiamondTag = this.hideDiamondTag;
        userLiveSettings.pureModeGroup = this.pureModeGroup;
        userLiveSettings.showVoiceStatus = this.showVoiceStatus;
        userLiveSettings.voiceNotification = this.voiceNotification;
        return userLiveSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLiveSettings)) {
            return false;
        }
        UserLiveSettings userLiveSettings = (UserLiveSettings) obj;
        return ValueObject.util_equals(this.closeEnterRoomMsg, userLiveSettings.closeEnterRoomMsg) && ValueObject.util_equals(this.closeSmallWindow, userLiveSettings.closeSmallWindow) && ValueObject.util_equals(this.teenModeEnable, userLiveSettings.teenModeEnable) && ValueObject.util_equals(this.intlAdUser, userLiveSettings.intlAdUser) && ValueObject.util_equals(this.regionTag, userLiveSettings.regionTag) && ValueObject.util_equals(this.voiceWindowEnable, userLiveSettings.voiceWindowEnable) && ValueObject.util_equals(this.fakeId, userLiveSettings.fakeId) && ValueObject.util_equals(this.hideStoppedRoom, userLiveSettings.hideStoppedRoom) && ValueObject.util_equals(this.hideVoiceOnCall, userLiveSettings.hideVoiceOnCall) && this.wealthGrade == userLiveSettings.wealthGrade && ValueObject.util_equals(this.hideMomentsWealthTag, userLiveSettings.hideMomentsWealthTag) && ValueObject.util_equals(this.hideProfileWealthTag, userLiveSettings.hideProfileWealthTag) && ValueObject.util_equals(this.hideSwipeWealthTag, userLiveSettings.hideSwipeWealthTag) && ValueObject.util_equals(this.isDiamondVIP, userLiveSettings.isDiamondVIP) && ValueObject.util_equals(this.hideDiamondTag, userLiveSettings.hideDiamondTag) && ValueObject.util_equals(this.pureModeGroup, userLiveSettings.pureModeGroup) && ValueObject.util_equals(this.showVoiceStatus, userLiveSettings.showVoiceStatus) && ValueObject.util_equals(this.voiceNotification, userLiveSettings.voiceNotification);
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
        Boolean bool = this.closeEnterRoomMsg;
        int iHashCode = (i2 + (bool != null ? bool.hashCode() : 0)) * 41;
        Boolean bool2 = this.closeSmallWindow;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        Boolean bool3 = this.teenModeEnable;
        int iHashCode3 = (iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 41;
        Boolean bool4 = this.intlAdUser;
        int iHashCode4 = (iHashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 41;
        String str = this.regionTag;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 41;
        Boolean bool5 = this.voiceWindowEnable;
        int iHashCode6 = (iHashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 41;
        String str2 = this.fakeId;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 41;
        Boolean bool6 = this.hideStoppedRoom;
        int iHashCode8 = (iHashCode7 + (bool6 != null ? bool6.hashCode() : 0)) * 41;
        Boolean bool7 = this.hideVoiceOnCall;
        int iHashCode9 = (((iHashCode8 + (bool7 != null ? bool7.hashCode() : 0)) * 41) + this.wealthGrade) * 41;
        Boolean bool8 = this.hideMomentsWealthTag;
        int iHashCode10 = (iHashCode9 + (bool8 != null ? bool8.hashCode() : 0)) * 41;
        Boolean bool9 = this.hideProfileWealthTag;
        int iHashCode11 = (iHashCode10 + (bool9 != null ? bool9.hashCode() : 0)) * 41;
        Boolean bool10 = this.hideSwipeWealthTag;
        int iHashCode12 = (iHashCode11 + (bool10 != null ? bool10.hashCode() : 0)) * 41;
        Boolean bool11 = this.isDiamondVIP;
        int iHashCode13 = (iHashCode12 + (bool11 != null ? bool11.hashCode() : 0)) * 41;
        Boolean bool12 = this.hideDiamondTag;
        int iHashCode14 = (iHashCode13 + (bool12 != null ? bool12.hashCode() : 0)) * 41;
        String str3 = this.pureModeGroup;
        int iHashCode15 = (iHashCode14 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.showVoiceStatus;
        int iHashCode16 = (iHashCode15 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.voiceNotification;
        int iHashCode17 = iHashCode16 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.closeEnterRoomMsg == null) {
            this.closeEnterRoomMsg = Boolean.FALSE;
        }
        if (this.closeSmallWindow == null) {
            this.closeSmallWindow = Boolean.FALSE;
        }
        if (this.teenModeEnable == null) {
            this.teenModeEnable = Boolean.FALSE;
        }
        if (this.intlAdUser == null) {
            this.intlAdUser = Boolean.FALSE;
        }
        if (this.regionTag == null) {
            this.regionTag = "";
        }
        if (this.voiceWindowEnable == null) {
            this.voiceWindowEnable = Boolean.FALSE;
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
        if (this.hideStoppedRoom == null) {
            this.hideStoppedRoom = Boolean.FALSE;
        }
        if (this.hideVoiceOnCall == null) {
            this.hideVoiceOnCall = Boolean.FALSE;
        }
        if (this.hideMomentsWealthTag == null) {
            this.hideMomentsWealthTag = Boolean.FALSE;
        }
        if (this.hideProfileWealthTag == null) {
            this.hideProfileWealthTag = Boolean.FALSE;
        }
        if (this.hideSwipeWealthTag == null) {
            this.hideSwipeWealthTag = Boolean.FALSE;
        }
        if (this.isDiamondVIP == null) {
            this.isDiamondVIP = Boolean.FALSE;
        }
        if (this.hideDiamondTag == null) {
            this.hideDiamondTag = Boolean.FALSE;
        }
        if (this.pureModeGroup == null) {
            this.pureModeGroup = "";
        }
        if (this.showVoiceStatus == null) {
            this.showVoiceStatus = "";
        }
        if (this.voiceNotification == null) {
            this.voiceNotification = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
