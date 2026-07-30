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
public class UserPrivacySettings extends ValueObject<UserPrivacySettings> implements Cloneable, Serializable {
    public static final String TYPE = "userprivacysettings";

    @NonNull
    @ProtobufIndex(index = 9)
    public Boolean adsSuggest;

    @NonNull
    @ProtobufIndex(index = 12)
    public String aiPictureEnable;

    @NonNull
    @ProtobufIndex(index = 8)
    public Boolean heartbeatDisable;

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean hideActivityTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public Boolean hideContacts;

    @NonNull
    @ProtobufIndex(index = 3)
    public Boolean hideMutualContacts;

    @NonNull
    @ProtobufIndex(index = 4)
    public Boolean hidePublicMoments;

    @NonNull
    @ProtobufIndex(index = 5)
    public Boolean hideSchool;

    @NonNull
    @ProtobufIndex(index = 6)
    public Boolean hideVIP;

    @NonNull
    @ProtobufIndex(index = 10)
    public Boolean onlineReminder;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = 7)
    public Boolean personalizeSuggest;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 11)
    public Boolean unrepliedReminder;

    @NonNull
    @ProtobufIndex(index = 13)
    public Boolean verifiedUserMsg;
    public static ProtobufAdapter<UserPrivacySettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPrivacySettings>() { // from class: com.p1.mobile.putong.data.UserPrivacySettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserPrivacySettings userPrivacySettings) {
            Boolean bool = userPrivacySettings.hideActivityTime;
            int iB = bool != null ? CodedOutputByteBufferNano.b(1, bool.booleanValue()) : 0;
            Boolean bool2 = userPrivacySettings.hideContacts;
            if (bool2 != null) {
                iB += CodedOutputByteBufferNano.b(2, bool2.booleanValue());
            }
            Boolean bool3 = userPrivacySettings.hideMutualContacts;
            if (bool3 != null) {
                iB += CodedOutputByteBufferNano.b(3, bool3.booleanValue());
            }
            Boolean bool4 = userPrivacySettings.hidePublicMoments;
            if (bool4 != null) {
                iB += CodedOutputByteBufferNano.b(4, bool4.booleanValue());
            }
            Boolean bool5 = userPrivacySettings.hideSchool;
            if (bool5 != null) {
                iB += CodedOutputByteBufferNano.b(5, bool5.booleanValue());
            }
            Boolean bool6 = userPrivacySettings.hideVIP;
            if (bool6 != null) {
                iB += CodedOutputByteBufferNano.b(6, bool6.booleanValue());
            }
            Boolean bool7 = userPrivacySettings.personalizeSuggest;
            if (bool7 != null) {
                iB += CodedOutputByteBufferNano.b(7, bool7.booleanValue());
            }
            Boolean bool8 = userPrivacySettings.heartbeatDisable;
            if (bool8 != null) {
                iB += CodedOutputByteBufferNano.b(8, bool8.booleanValue());
            }
            Boolean bool9 = userPrivacySettings.adsSuggest;
            if (bool9 != null) {
                iB += CodedOutputByteBufferNano.b(9, bool9.booleanValue());
            }
            Boolean bool10 = userPrivacySettings.onlineReminder;
            if (bool10 != null) {
                iB += CodedOutputByteBufferNano.b(10, bool10.booleanValue());
            }
            Boolean bool11 = userPrivacySettings.unrepliedReminder;
            if (bool11 != null) {
                iB += CodedOutputByteBufferNano.b(11, bool11.booleanValue());
            }
            String str = userPrivacySettings.aiPictureEnable;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(12, str);
            }
            Boolean bool12 = userPrivacySettings.verifiedUserMsg;
            if (bool12 != null) {
                iB += CodedOutputByteBufferNano.b(13, bool12.booleanValue());
            }
            ((MessageNano) userPrivacySettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserPrivacySettings m19205parse(nb5 nb5Var) throws IOException {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (userPrivacySettings.hideActivityTime == null) {
                            userPrivacySettings.hideActivityTime = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hideContacts == null) {
                            userPrivacySettings.hideContacts = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hideMutualContacts == null) {
                            userPrivacySettings.hideMutualContacts = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hidePublicMoments == null) {
                            userPrivacySettings.hidePublicMoments = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hideSchool == null) {
                            userPrivacySettings.hideSchool = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hideVIP == null) {
                            userPrivacySettings.hideVIP = Boolean.FALSE;
                        }
                        if (userPrivacySettings.personalizeSuggest == null) {
                            userPrivacySettings.personalizeSuggest = Boolean.FALSE;
                        }
                        if (userPrivacySettings.heartbeatDisable == null) {
                            userPrivacySettings.heartbeatDisable = Boolean.FALSE;
                        }
                        if (userPrivacySettings.adsSuggest == null) {
                            userPrivacySettings.adsSuggest = Boolean.FALSE;
                        }
                        if (userPrivacySettings.onlineReminder == null) {
                            userPrivacySettings.onlineReminder = Boolean.FALSE;
                        }
                        if (userPrivacySettings.unrepliedReminder == null) {
                            userPrivacySettings.unrepliedReminder = Boolean.FALSE;
                        }
                        if (userPrivacySettings.aiPictureEnable == null) {
                            userPrivacySettings.aiPictureEnable = "";
                        }
                        if (userPrivacySettings.verifiedUserMsg == null) {
                            userPrivacySettings.verifiedUserMsg = Boolean.FALSE;
                        }
                        break;
                    case 8:
                        userPrivacySettings.hideActivityTime = Boolean.valueOf(nb5Var.g());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        userPrivacySettings.hideContacts = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 24:
                        userPrivacySettings.hideMutualContacts = Boolean.valueOf(nb5Var.g());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        userPrivacySettings.hidePublicMoments = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 40:
                        userPrivacySettings.hideSchool = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 48:
                        userPrivacySettings.hideVIP = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 56:
                        userPrivacySettings.personalizeSuggest = Boolean.valueOf(nb5Var.g());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        userPrivacySettings.heartbeatDisable = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 72:
                        userPrivacySettings.adsSuggest = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 80:
                        userPrivacySettings.onlineReminder = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 88:
                        userPrivacySettings.unrepliedReminder = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 98:
                        userPrivacySettings.aiPictureEnable = nb5Var.s();
                        continue;
                    case 104:
                        userPrivacySettings.verifiedUserMsg = Boolean.valueOf(nb5Var.g());
                        continue;
                    default:
                        if (userPrivacySettings.hideActivityTime == null) {
                            userPrivacySettings.hideActivityTime = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hideContacts == null) {
                            userPrivacySettings.hideContacts = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hideMutualContacts == null) {
                            userPrivacySettings.hideMutualContacts = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hidePublicMoments == null) {
                            userPrivacySettings.hidePublicMoments = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hideSchool == null) {
                            userPrivacySettings.hideSchool = Boolean.FALSE;
                        }
                        if (userPrivacySettings.hideVIP == null) {
                            userPrivacySettings.hideVIP = Boolean.FALSE;
                        }
                        if (userPrivacySettings.personalizeSuggest == null) {
                            userPrivacySettings.personalizeSuggest = Boolean.FALSE;
                        }
                        if (userPrivacySettings.heartbeatDisable == null) {
                            userPrivacySettings.heartbeatDisable = Boolean.FALSE;
                        }
                        if (userPrivacySettings.adsSuggest == null) {
                            userPrivacySettings.adsSuggest = Boolean.FALSE;
                        }
                        if (userPrivacySettings.onlineReminder == null) {
                            userPrivacySettings.onlineReminder = Boolean.FALSE;
                        }
                        if (userPrivacySettings.unrepliedReminder == null) {
                            userPrivacySettings.unrepliedReminder = Boolean.FALSE;
                        }
                        if (userPrivacySettings.aiPictureEnable == null) {
                            userPrivacySettings.aiPictureEnable = "";
                        }
                        if (userPrivacySettings.verifiedUserMsg == null) {
                            userPrivacySettings.verifiedUserMsg = Boolean.FALSE;
                            return userPrivacySettings;
                        }
                        break;
                }
            }
            return userPrivacySettings;
        }

        public void serialize(UserPrivacySettings userPrivacySettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userPrivacySettings.hideActivityTime;
            if (bool != null) {
                codedOutputByteBufferNano.A(1, bool.booleanValue());
            }
            Boolean bool2 = userPrivacySettings.hideContacts;
            if (bool2 != null) {
                codedOutputByteBufferNano.A(2, bool2.booleanValue());
            }
            Boolean bool3 = userPrivacySettings.hideMutualContacts;
            if (bool3 != null) {
                codedOutputByteBufferNano.A(3, bool3.booleanValue());
            }
            Boolean bool4 = userPrivacySettings.hidePublicMoments;
            if (bool4 != null) {
                codedOutputByteBufferNano.A(4, bool4.booleanValue());
            }
            Boolean bool5 = userPrivacySettings.hideSchool;
            if (bool5 != null) {
                codedOutputByteBufferNano.A(5, bool5.booleanValue());
            }
            Boolean bool6 = userPrivacySettings.hideVIP;
            if (bool6 != null) {
                codedOutputByteBufferNano.A(6, bool6.booleanValue());
            }
            Boolean bool7 = userPrivacySettings.personalizeSuggest;
            if (bool7 != null) {
                codedOutputByteBufferNano.A(7, bool7.booleanValue());
            }
            Boolean bool8 = userPrivacySettings.heartbeatDisable;
            if (bool8 != null) {
                codedOutputByteBufferNano.A(8, bool8.booleanValue());
            }
            Boolean bool9 = userPrivacySettings.adsSuggest;
            if (bool9 != null) {
                codedOutputByteBufferNano.A(9, bool9.booleanValue());
            }
            Boolean bool10 = userPrivacySettings.onlineReminder;
            if (bool10 != null) {
                codedOutputByteBufferNano.A(10, bool10.booleanValue());
            }
            Boolean bool11 = userPrivacySettings.unrepliedReminder;
            if (bool11 != null) {
                codedOutputByteBufferNano.A(11, bool11.booleanValue());
            }
            String str = userPrivacySettings.aiPictureEnable;
            if (str != null) {
                codedOutputByteBufferNano.R(12, str);
            }
            Boolean bool12 = userPrivacySettings.verifiedUserMsg;
            if (bool12 != null) {
                codedOutputByteBufferNano.A(13, bool12.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserPrivacySettings> JSON_ADAPTER = new ObjectJsonAdapter<UserPrivacySettings>() { // from class: com.p1.mobile.putong.data.UserPrivacySettings.2
        public Class getDataClass() {
            return UserPrivacySettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserPrivacySettings mo17830newInstance() {
            return new UserPrivacySettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(UserPrivacySettings userPrivacySettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1806017072:
                    if (str.equals("personalizeSuggest")) {
                        b = 0;
                    }
                    break;
                case -985810734:
                    if (str.equals("unrepliedReminder")) {
                        b = 1;
                    }
                    break;
                case -972589492:
                    if (str.equals("heartbeatDisable")) {
                        b = 2;
                    }
                    break;
                case -662670386:
                    if (str.equals("verifiedUserMsg")) {
                        b = 3;
                    }
                    break;
                case -86886807:
                    if (str.equals("hideMutualContacts")) {
                        b = 4;
                    }
                    break;
                case -5226571:
                    if (str.equals("hideContacts")) {
                        b = 5;
                    }
                    break;
                case 117333209:
                    if (str.equals("aiPictureEnable")) {
                        b = 6;
                    }
                    break;
                case 335063894:
                    if (str.equals("hideSchool")) {
                        b = 7;
                    }
                    break;
                case 397793253:
                    if (str.equals("onlineReminder")) {
                        b = 8;
                    }
                    break;
                case 417228980:
                    if (str.equals("adsSuggest")) {
                        b = 9;
                    }
                    break;
                case 912609147:
                    if (str.equals("hideVIP")) {
                        b = 10;
                    }
                    break;
                case 1031141598:
                    if (str.equals("hideActivityTime")) {
                        b = 11;
                    }
                    break;
                case 1152793000:
                    if (str.equals("hidePublicMoments")) {
                        b = 12;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    userPrivacySettings.personalizeSuggest = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 1:
                    userPrivacySettings.unrepliedReminder = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 2:
                    userPrivacySettings.heartbeatDisable = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 3:
                    userPrivacySettings.verifiedUserMsg = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 4:
                    userPrivacySettings.hideMutualContacts = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 5:
                    userPrivacySettings.hideContacts = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 6:
                    userPrivacySettings.aiPictureEnable = jsonParser.getValueAsString();
                    return true;
                case 7:
                    userPrivacySettings.hideSchool = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 8:
                    userPrivacySettings.onlineReminder = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 9:
                    userPrivacySettings.adsSuggest = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 10:
                    userPrivacySettings.hideVIP = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 11:
                    userPrivacySettings.hideActivityTime = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 12:
                    userPrivacySettings.hidePublicMoments = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserPrivacySettings userPrivacySettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "personalizeSuggest":
                case "unrepliedReminder":
                case "heartbeatDisable":
                case "verifiedUserMsg":
                case "hideMutualContacts":
                case "hideContacts":
                case "aiPictureEnable":
                case "hideSchool":
                case "onlineReminder":
                case "adsSuggest":
                case "hideVIP":
                case "hideActivityTime":
                case "hidePublicMoments":
                    return true;
                default:
                    return super.parseFieldCheck(userPrivacySettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserPrivacySettings userPrivacySettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userPrivacySettings.hideActivityTime;
            if (bool != null) {
                jsonGenerator.writeBooleanField("hideActivityTime", bool.booleanValue());
            }
            Boolean bool2 = userPrivacySettings.hideContacts;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("hideContacts", bool2.booleanValue());
            }
            Boolean bool3 = userPrivacySettings.hideMutualContacts;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField("hideMutualContacts", bool3.booleanValue());
            }
            Boolean bool4 = userPrivacySettings.hidePublicMoments;
            if (bool4 != null) {
                jsonGenerator.writeBooleanField("hidePublicMoments", bool4.booleanValue());
            }
            Boolean bool5 = userPrivacySettings.hideSchool;
            if (bool5 != null) {
                jsonGenerator.writeBooleanField("hideSchool", bool5.booleanValue());
            }
            Boolean bool6 = userPrivacySettings.hideVIP;
            if (bool6 != null) {
                jsonGenerator.writeBooleanField("hideVIP", bool6.booleanValue());
            }
            Boolean bool7 = userPrivacySettings.personalizeSuggest;
            if (bool7 != null) {
                jsonGenerator.writeBooleanField("personalizeSuggest", bool7.booleanValue());
            }
            Boolean bool8 = userPrivacySettings.heartbeatDisable;
            if (bool8 != null) {
                jsonGenerator.writeBooleanField("heartbeatDisable", bool8.booleanValue());
            }
            Boolean bool9 = userPrivacySettings.adsSuggest;
            if (bool9 != null) {
                jsonGenerator.writeBooleanField("adsSuggest", bool9.booleanValue());
            }
            Boolean bool10 = userPrivacySettings.onlineReminder;
            if (bool10 != null) {
                jsonGenerator.writeBooleanField("onlineReminder", bool10.booleanValue());
            }
            Boolean bool11 = userPrivacySettings.unrepliedReminder;
            if (bool11 != null) {
                jsonGenerator.writeBooleanField("unrepliedReminder", bool11.booleanValue());
            }
            String str = userPrivacySettings.aiPictureEnable;
            if (str != null) {
                jsonGenerator.writeStringField("aiPictureEnable", str);
            }
            Boolean bool12 = userPrivacySettings.verifiedUserMsg;
            if (bool12 != null) {
                jsonGenerator.writeBooleanField("verifiedUserMsg", bool12.booleanValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPrivacySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPrivacySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserPrivacySettings new_() {
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        userPrivacySettings.nullCheck();
        return userPrivacySettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserPrivacySettings m19204clone() {
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        userPrivacySettings.hideActivityTime = this.hideActivityTime;
        userPrivacySettings.hideContacts = this.hideContacts;
        userPrivacySettings.hideMutualContacts = this.hideMutualContacts;
        userPrivacySettings.hidePublicMoments = this.hidePublicMoments;
        userPrivacySettings.hideSchool = this.hideSchool;
        userPrivacySettings.hideVIP = this.hideVIP;
        userPrivacySettings.personalizeSuggest = this.personalizeSuggest;
        userPrivacySettings.heartbeatDisable = this.heartbeatDisable;
        userPrivacySettings.adsSuggest = this.adsSuggest;
        userPrivacySettings.onlineReminder = this.onlineReminder;
        userPrivacySettings.unrepliedReminder = this.unrepliedReminder;
        userPrivacySettings.aiPictureEnable = this.aiPictureEnable;
        userPrivacySettings.verifiedUserMsg = this.verifiedUserMsg;
        return userPrivacySettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserPrivacySettings)) {
            return false;
        }
        UserPrivacySettings userPrivacySettings = (UserPrivacySettings) obj;
        return ValueObject.util_equals(this.hideActivityTime, userPrivacySettings.hideActivityTime) && ValueObject.util_equals(this.hideContacts, userPrivacySettings.hideContacts) && ValueObject.util_equals(this.hideMutualContacts, userPrivacySettings.hideMutualContacts) && ValueObject.util_equals(this.hidePublicMoments, userPrivacySettings.hidePublicMoments) && ValueObject.util_equals(this.hideSchool, userPrivacySettings.hideSchool) && ValueObject.util_equals(this.hideVIP, userPrivacySettings.hideVIP) && ValueObject.util_equals(this.personalizeSuggest, userPrivacySettings.personalizeSuggest) && ValueObject.util_equals(this.heartbeatDisable, userPrivacySettings.heartbeatDisable) && ValueObject.util_equals(this.adsSuggest, userPrivacySettings.adsSuggest) && ValueObject.util_equals(this.onlineReminder, userPrivacySettings.onlineReminder) && ValueObject.util_equals(this.unrepliedReminder, userPrivacySettings.unrepliedReminder) && ValueObject.util_equals(this.aiPictureEnable, userPrivacySettings.aiPictureEnable) && ValueObject.util_equals(this.verifiedUserMsg, userPrivacySettings.verifiedUserMsg);
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
        Boolean bool = this.hideActivityTime;
        int iHashCode = (i2 + (bool != null ? bool.hashCode() : 0)) * 41;
        Boolean bool2 = this.hideContacts;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        Boolean bool3 = this.hideMutualContacts;
        int iHashCode3 = (iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 41;
        Boolean bool4 = this.hidePublicMoments;
        int iHashCode4 = (iHashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 41;
        Boolean bool5 = this.hideSchool;
        int iHashCode5 = (iHashCode4 + (bool5 != null ? bool5.hashCode() : 0)) * 41;
        Boolean bool6 = this.hideVIP;
        int iHashCode6 = (iHashCode5 + (bool6 != null ? bool6.hashCode() : 0)) * 41;
        Boolean bool7 = this.personalizeSuggest;
        int iHashCode7 = (iHashCode6 + (bool7 != null ? bool7.hashCode() : 0)) * 41;
        Boolean bool8 = this.heartbeatDisable;
        int iHashCode8 = (iHashCode7 + (bool8 != null ? bool8.hashCode() : 0)) * 41;
        Boolean bool9 = this.adsSuggest;
        int iHashCode9 = (iHashCode8 + (bool9 != null ? bool9.hashCode() : 0)) * 41;
        Boolean bool10 = this.onlineReminder;
        int iHashCode10 = (iHashCode9 + (bool10 != null ? bool10.hashCode() : 0)) * 41;
        Boolean bool11 = this.unrepliedReminder;
        int iHashCode11 = (iHashCode10 + (bool11 != null ? bool11.hashCode() : 0)) * 41;
        String str = this.aiPictureEnable;
        int iHashCode12 = (iHashCode11 + (str != null ? str.hashCode() : 0)) * 41;
        Boolean bool12 = this.verifiedUserMsg;
        int iHashCode13 = iHashCode12 + (bool12 != null ? bool12.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode13;
        return iHashCode13;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(UserPrivacySettings userPrivacySettings) {
        if (!shouldMergeData() || equals(userPrivacySettings)) {
            return;
        }
        if (!isFieldParsed("hideActivityTime")) {
            this.hideActivityTime = userPrivacySettings.hideActivityTime;
        }
        if (!isFieldParsed("hideContacts")) {
            this.hideContacts = userPrivacySettings.hideContacts;
        }
        if (!isFieldParsed("hideMutualContacts")) {
            this.hideMutualContacts = userPrivacySettings.hideMutualContacts;
        }
        if (!isFieldParsed("hidePublicMoments")) {
            this.hidePublicMoments = userPrivacySettings.hidePublicMoments;
        }
        if (!isFieldParsed("hideSchool")) {
            this.hideSchool = userPrivacySettings.hideSchool;
        }
        if (!isFieldParsed("hideVIP")) {
            this.hideVIP = userPrivacySettings.hideVIP;
        }
        if (!isFieldParsed("personalizeSuggest")) {
            this.personalizeSuggest = userPrivacySettings.personalizeSuggest;
        }
        if (!isFieldParsed("heartbeatDisable")) {
            this.heartbeatDisable = userPrivacySettings.heartbeatDisable;
        }
        if (!isFieldParsed("adsSuggest")) {
            this.adsSuggest = userPrivacySettings.adsSuggest;
        }
        if (!isFieldParsed("onlineReminder")) {
            this.onlineReminder = userPrivacySettings.onlineReminder;
        }
        if (!isFieldParsed("unrepliedReminder")) {
            this.unrepliedReminder = userPrivacySettings.unrepliedReminder;
        }
        if (!isFieldParsed("aiPictureEnable")) {
            this.aiPictureEnable = userPrivacySettings.aiPictureEnable;
        }
        if (!isFieldParsed("verifiedUserMsg")) {
            this.verifiedUserMsg = userPrivacySettings.verifiedUserMsg;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        if (this.hideActivityTime == null) {
            this.hideActivityTime = Boolean.FALSE;
        }
        if (this.hideContacts == null) {
            this.hideContacts = Boolean.FALSE;
        }
        if (this.hideMutualContacts == null) {
            this.hideMutualContacts = Boolean.FALSE;
        }
        if (this.hidePublicMoments == null) {
            this.hidePublicMoments = Boolean.FALSE;
        }
        if (this.hideSchool == null) {
            this.hideSchool = Boolean.FALSE;
        }
        if (this.hideVIP == null) {
            this.hideVIP = Boolean.FALSE;
        }
        if (this.personalizeSuggest == null) {
            this.personalizeSuggest = Boolean.FALSE;
        }
        if (this.heartbeatDisable == null) {
            this.heartbeatDisable = Boolean.FALSE;
        }
        if (this.adsSuggest == null) {
            this.adsSuggest = Boolean.FALSE;
        }
        if (this.onlineReminder == null) {
            this.onlineReminder = Boolean.FALSE;
        }
        if (this.unrepliedReminder == null) {
            this.unrepliedReminder = Boolean.FALSE;
        }
        if (this.aiPictureEnable == null) {
            this.aiPictureEnable = "";
        }
        if (this.verifiedUserMsg == null) {
            this.verifiedUserMsg = Boolean.FALSE;
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public UserPrivacySettings subtract(UserPrivacySettings userPrivacySettings) {
        UserPrivacySettings userPrivacySettings2 = new UserPrivacySettings();
        if (!ValueObject.util_equals(this.hideActivityTime, userPrivacySettings.hideActivityTime)) {
            userPrivacySettings2.hideActivityTime = this.hideActivityTime;
        }
        if (!ValueObject.util_equals(this.hideContacts, userPrivacySettings.hideContacts)) {
            userPrivacySettings2.hideContacts = this.hideContacts;
        }
        if (!ValueObject.util_equals(this.hideMutualContacts, userPrivacySettings.hideMutualContacts)) {
            userPrivacySettings2.hideMutualContacts = this.hideMutualContacts;
        }
        if (!ValueObject.util_equals(this.hidePublicMoments, userPrivacySettings.hidePublicMoments)) {
            userPrivacySettings2.hidePublicMoments = this.hidePublicMoments;
        }
        if (!ValueObject.util_equals(this.hideSchool, userPrivacySettings.hideSchool)) {
            userPrivacySettings2.hideSchool = this.hideSchool;
        }
        if (!ValueObject.util_equals(this.hideVIP, userPrivacySettings.hideVIP)) {
            userPrivacySettings2.hideVIP = this.hideVIP;
        }
        if (!ValueObject.util_equals(this.personalizeSuggest, userPrivacySettings.personalizeSuggest)) {
            userPrivacySettings2.personalizeSuggest = this.personalizeSuggest;
        }
        if (!ValueObject.util_equals(this.heartbeatDisable, userPrivacySettings.heartbeatDisable)) {
            userPrivacySettings2.heartbeatDisable = this.heartbeatDisable;
        }
        if (!ValueObject.util_equals(this.adsSuggest, userPrivacySettings.adsSuggest)) {
            userPrivacySettings2.adsSuggest = this.adsSuggest;
        }
        if (!ValueObject.util_equals(this.onlineReminder, userPrivacySettings.onlineReminder)) {
            userPrivacySettings2.onlineReminder = this.onlineReminder;
        }
        if (!ValueObject.util_equals(this.unrepliedReminder, userPrivacySettings.unrepliedReminder)) {
            userPrivacySettings2.unrepliedReminder = this.unrepliedReminder;
        }
        if (!ValueObject.util_equals(this.aiPictureEnable, userPrivacySettings.aiPictureEnable)) {
            userPrivacySettings2.aiPictureEnable = this.aiPictureEnable;
        }
        if (!ValueObject.util_equals(this.verifiedUserMsg, userPrivacySettings.verifiedUserMsg)) {
            userPrivacySettings2.verifiedUserMsg = this.verifiedUserMsg;
        }
        if (userPrivacySettings2.equals(new UserPrivacySettings())) {
            return null;
        }
        return userPrivacySettings2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
