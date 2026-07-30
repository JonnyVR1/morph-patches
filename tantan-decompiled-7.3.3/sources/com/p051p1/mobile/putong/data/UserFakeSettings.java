package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class UserFakeSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userfakesettings";

    @NonNull
    @ProtobufIndex(index = 3)
    public Boolean dailyReportPush;

    @NonNull
    @ProtobufIndex(index = 9)
    public SettingsIntent intent;

    @NonNull
    @ProtobufIndex(index = 8)
    public String locationAddress;

    @NonNull
    @ProtobufIndex(index = 7)
    public String locationName;

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean momentPush;

    @NonNull
    @ProtobufIndex(index = 5)
    public NotificationNoDisturb noDisturb;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sound;

    @NonNull
    @ProtobufIndex(index = 6)
    public Boolean syncMoment;

    @NonNull
    @ProtobufIndex(index = 4)
    public Boolean weeklyReportPush;
    public static ProtobufAdapter<UserFakeSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserFakeSettings>() { // from class: com.p1.mobile.putong.data.UserFakeSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserFakeSettings userFakeSettings) {
            Boolean bool = userFakeSettings.momentPush;
            int iM17275b = bool != null ? CodedOutputByteBufferNano.m17275b(1, bool.booleanValue()) : 0;
            String str = userFakeSettings.sound;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            Boolean bool2 = userFakeSettings.dailyReportPush;
            if (bool2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(3, bool2.booleanValue());
            }
            Boolean bool3 = userFakeSettings.weeklyReportPush;
            if (bool3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(4, bool3.booleanValue());
            }
            NotificationNoDisturb notificationNoDisturb = userFakeSettings.noDisturb;
            if (notificationNoDisturb != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, notificationNoDisturb, NotificationNoDisturb.PROTOBUF_ADAPTER);
            }
            Boolean bool4 = userFakeSettings.syncMoment;
            if (bool4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(6, bool4.booleanValue());
            }
            String str2 = userFakeSettings.locationName;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str2);
            }
            String str3 = userFakeSettings.locationAddress;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str3);
            }
            SettingsIntent settingsIntent = userFakeSettings.intent;
            if (settingsIntent != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(9, settingsIntent.ordinal());
            }
            SettingsIntent settingsIntent2 = userFakeSettings.intent;
            if (settingsIntent2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(10, settingsIntent2, SettingsIntent.PROTOBUF_ADAPTER);
            }
            userFakeSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserFakeSettings parse(nc5 nc5Var) throws IOException {
            UserFakeSettings userFakeSettings = new UserFakeSettings();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (userFakeSettings.intent == null && numValueOf != null) {
                            userFakeSettings.intent = (SettingsIntent) SettingsIntent.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (userFakeSettings.momentPush == null) {
                            userFakeSettings.momentPush = Boolean.FALSE;
                        }
                        if (userFakeSettings.sound == null) {
                            userFakeSettings.sound = "";
                        }
                        if (userFakeSettings.dailyReportPush == null) {
                            userFakeSettings.dailyReportPush = Boolean.FALSE;
                        }
                        if (userFakeSettings.weeklyReportPush == null) {
                            userFakeSettings.weeklyReportPush = Boolean.FALSE;
                        }
                        if (userFakeSettings.noDisturb == null) {
                            userFakeSettings.noDisturb = NotificationNoDisturb.new_();
                        }
                        if (userFakeSettings.syncMoment == null) {
                            userFakeSettings.syncMoment = Boolean.FALSE;
                        }
                        if (userFakeSettings.locationName == null) {
                            userFakeSettings.locationName = "";
                        }
                        if (userFakeSettings.locationAddress == null) {
                            userFakeSettings.locationAddress = "";
                        }
                        if (userFakeSettings.intent == null) {
                            userFakeSettings.intent = (SettingsIntent) SettingsIntent.JSON_ADAPTER.defaultEnum();
                        }
                        break;
                    case 8:
                        userFakeSettings.momentPush = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 18:
                        userFakeSettings.sound = nc5Var.m162495s();
                        continue;
                    case 24:
                        userFakeSettings.dailyReportPush = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 32:
                        userFakeSettings.weeklyReportPush = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 42:
                        userFakeSettings.noDisturb = (NotificationNoDisturb) nc5Var.m162488l(NotificationNoDisturb.PROTOBUF_ADAPTER);
                        continue;
                    case 48:
                        userFakeSettings.syncMoment = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 58:
                        userFakeSettings.locationName = nc5Var.m162495s();
                        continue;
                    case 66:
                        userFakeSettings.locationAddress = nc5Var.m162495s();
                        continue;
                    case 72:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        userFakeSettings.intent = (SettingsIntent) nc5Var.m162488l(SettingsIntent.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (userFakeSettings.intent == null && numValueOf != null) {
                            userFakeSettings.intent = (SettingsIntent) SettingsIntent.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (userFakeSettings.momentPush == null) {
                            userFakeSettings.momentPush = Boolean.FALSE;
                        }
                        if (userFakeSettings.sound == null) {
                            userFakeSettings.sound = "";
                        }
                        if (userFakeSettings.dailyReportPush == null) {
                            userFakeSettings.dailyReportPush = Boolean.FALSE;
                        }
                        if (userFakeSettings.weeklyReportPush == null) {
                            userFakeSettings.weeklyReportPush = Boolean.FALSE;
                        }
                        if (userFakeSettings.noDisturb == null) {
                            userFakeSettings.noDisturb = NotificationNoDisturb.new_();
                        }
                        if (userFakeSettings.syncMoment == null) {
                            userFakeSettings.syncMoment = Boolean.FALSE;
                        }
                        if (userFakeSettings.locationName == null) {
                            userFakeSettings.locationName = "";
                        }
                        if (userFakeSettings.locationAddress == null) {
                            userFakeSettings.locationAddress = "";
                        }
                        if (userFakeSettings.intent == null) {
                            userFakeSettings.intent = (SettingsIntent) SettingsIntent.JSON_ADAPTER.defaultEnum();
                            return userFakeSettings;
                        }
                        break;
                }
            }
            return userFakeSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserFakeSettings userFakeSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userFakeSettings.momentPush;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(1, bool.booleanValue());
            }
            String str = userFakeSettings.sound;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            Boolean bool2 = userFakeSettings.dailyReportPush;
            if (bool2 != null) {
                codedOutputByteBufferNano.m17299A(3, bool2.booleanValue());
            }
            Boolean bool3 = userFakeSettings.weeklyReportPush;
            if (bool3 != null) {
                codedOutputByteBufferNano.m17299A(4, bool3.booleanValue());
            }
            NotificationNoDisturb notificationNoDisturb = userFakeSettings.noDisturb;
            if (notificationNoDisturb != null) {
                codedOutputByteBufferNano.m17309K(5, notificationNoDisturb, NotificationNoDisturb.PROTOBUF_ADAPTER);
            }
            Boolean bool4 = userFakeSettings.syncMoment;
            if (bool4 != null) {
                codedOutputByteBufferNano.m17299A(6, bool4.booleanValue());
            }
            String str2 = userFakeSettings.locationName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(7, str2);
            }
            String str3 = userFakeSettings.locationAddress;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(8, str3);
            }
            SettingsIntent settingsIntent = userFakeSettings.intent;
            if (settingsIntent != null) {
                codedOutputByteBufferNano.m17305G(9, settingsIntent.ordinal());
            }
            SettingsIntent settingsIntent2 = userFakeSettings.intent;
            if (settingsIntent2 != null) {
                codedOutputByteBufferNano.m17309K(10, settingsIntent2, SettingsIntent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserFakeSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserFakeSettings>() { // from class: com.p1.mobile.putong.data.UserFakeSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserFakeSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserFakeSettings newInstance() {
            return new UserFakeSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(UserFakeSettings userFakeSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2031497986:
                    if (str.equals("noDisturb")) {
                        b = 0;
                    }
                    break;
                case -1533268529:
                    if (str.equals("weeklyReportPush")) {
                        b = 1;
                    }
                    break;
                case -1280020865:
                    if (str.equals("locationAddress")) {
                        b = 2;
                    }
                    break;
                case -1183762788:
                    if (str.equals("intent")) {
                        b = 3;
                    }
                    break;
                case -58479648:
                    if (str.equals("locationName")) {
                        b = 4;
                    }
                    break;
                case 109627663:
                    if (str.equals("sound")) {
                        b = 5;
                    }
                    break;
                case 192245095:
                    if (str.equals("dailyReportPush")) {
                        b = 6;
                    }
                    break;
                case 686073146:
                    if (str.equals("momentPush")) {
                        b = 7;
                    }
                    break;
                case 1926555771:
                    if (str.equals("syncMoment")) {
                        b = 8;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    userFakeSettings.noDisturb = NotificationNoDisturb.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    userFakeSettings.weeklyReportPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 2:
                    userFakeSettings.locationAddress = jsonParser.getValueAsString();
                    return true;
                case 3:
                    userFakeSettings.intent = SettingsIntent.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 4:
                    userFakeSettings.locationName = jsonParser.getValueAsString();
                    return true;
                case 5:
                    userFakeSettings.sound = jsonParser.getValueAsString();
                    return true;
                case 6:
                    userFakeSettings.dailyReportPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 7:
                    userFakeSettings.momentPush = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 8:
                    userFakeSettings.syncMoment = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserFakeSettings userFakeSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "noDisturb":
                case "weeklyReportPush":
                case "locationAddress":
                case "intent":
                case "locationName":
                case "sound":
                case "dailyReportPush":
                case "momentPush":
                case "syncMoment":
                    return true;
                default:
                    return super.parseFieldCheck(userFakeSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserFakeSettings userFakeSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userFakeSettings.momentPush;
            if (bool != null) {
                jsonGenerator.writeBooleanField("momentPush", bool.booleanValue());
            }
            String str = userFakeSettings.sound;
            if (str != null) {
                jsonGenerator.writeStringField("sound", str);
            }
            Boolean bool2 = userFakeSettings.dailyReportPush;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("dailyReportPush", bool2.booleanValue());
            }
            Boolean bool3 = userFakeSettings.weeklyReportPush;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField("weeklyReportPush", bool3.booleanValue());
            }
            if (userFakeSettings.noDisturb != null) {
                jsonGenerator.writeFieldName("noDisturb");
                NotificationNoDisturb.JSON_ADAPTER.serialize(userFakeSettings.noDisturb, jsonGenerator, true);
            }
            Boolean bool4 = userFakeSettings.syncMoment;
            if (bool4 != null) {
                jsonGenerator.writeBooleanField("syncMoment", bool4.booleanValue());
            }
            String str2 = userFakeSettings.locationName;
            if (str2 != null) {
                jsonGenerator.writeStringField("locationName", str2);
            }
            String str3 = userFakeSettings.locationAddress;
            if (str3 != null) {
                jsonGenerator.writeStringField("locationAddress", str3);
            }
            if (userFakeSettings.intent != null) {
                jsonGenerator.writeFieldName("intent");
                SettingsIntent.JSON_ADAPTER.serialize(userFakeSettings.intent, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserFakeSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserFakeSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserFakeSettings new_() {
        UserFakeSettings userFakeSettings = new UserFakeSettings();
        userFakeSettings.nullCheck();
        return userFakeSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserFakeSettings mo225055clone() {
        UserFakeSettings userFakeSettings = new UserFakeSettings();
        userFakeSettings.momentPush = this.momentPush;
        userFakeSettings.sound = this.sound;
        userFakeSettings.dailyReportPush = this.dailyReportPush;
        userFakeSettings.weeklyReportPush = this.weeklyReportPush;
        NotificationNoDisturb notificationNoDisturb = this.noDisturb;
        if (notificationNoDisturb != null) {
            userFakeSettings.noDisturb = notificationNoDisturb.mo225055clone();
        }
        userFakeSettings.syncMoment = this.syncMoment;
        userFakeSettings.locationName = this.locationName;
        userFakeSettings.locationAddress = this.locationAddress;
        userFakeSettings.intent = this.intent;
        return userFakeSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserFakeSettings)) {
            return false;
        }
        UserFakeSettings userFakeSettings = (UserFakeSettings) obj;
        return ValueObject.util_equals(this.momentPush, userFakeSettings.momentPush) && ValueObject.util_equals(this.sound, userFakeSettings.sound) && ValueObject.util_equals(this.dailyReportPush, userFakeSettings.dailyReportPush) && ValueObject.util_equals(this.weeklyReportPush, userFakeSettings.weeklyReportPush) && ValueObject.util_equals(this.noDisturb, userFakeSettings.noDisturb) && ValueObject.util_equals(this.syncMoment, userFakeSettings.syncMoment) && ValueObject.util_equals(this.locationName, userFakeSettings.locationName) && ValueObject.util_equals(this.locationAddress, userFakeSettings.locationAddress) && ValueObject.util_equals(this.intent, userFakeSettings.intent);
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
        Boolean bool = this.momentPush;
        int iHashCode = (i2 + (bool != null ? bool.hashCode() : 0)) * 41;
        String str = this.sound;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        Boolean bool2 = this.dailyReportPush;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        Boolean bool3 = this.weeklyReportPush;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 41;
        NotificationNoDisturb notificationNoDisturb = this.noDisturb;
        int iHashCode5 = (iHashCode4 + (notificationNoDisturb != null ? notificationNoDisturb.hashCode() : 0)) * 41;
        Boolean bool4 = this.syncMoment;
        int iHashCode6 = (iHashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 41;
        String str2 = this.locationName;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.locationAddress;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 41;
        SettingsIntent settingsIntent = this.intent;
        int iHashCode9 = iHashCode8 + (settingsIntent != null ? settingsIntent.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.momentPush == null) {
            this.momentPush = Boolean.FALSE;
        }
        if (this.sound == null) {
            this.sound = "";
        }
        if (this.dailyReportPush == null) {
            this.dailyReportPush = Boolean.FALSE;
        }
        if (this.weeklyReportPush == null) {
            this.weeklyReportPush = Boolean.FALSE;
        }
        if (this.noDisturb == null) {
            this.noDisturb = NotificationNoDisturb.new_();
        }
        if (this.syncMoment == null) {
            this.syncMoment = Boolean.FALSE;
        }
        if (this.locationName == null) {
            this.locationName = "";
        }
        if (this.locationAddress == null) {
            this.locationAddress = "";
        }
        if (this.intent == null) {
            this.intent = (SettingsIntent) SettingsIntent.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
