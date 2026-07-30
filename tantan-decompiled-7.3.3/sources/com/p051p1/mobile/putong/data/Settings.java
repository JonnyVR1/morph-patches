package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.SearchPriority;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.jyb;
import p153l.nc5;
import p153l.pzi0;
import p153l.qcj;
import p153l.xi5;

/* JADX INFO: loaded from: classes12.dex */
public class Settings extends ValueObject<Settings> implements Cloneable, Serializable {
    public static final String TYPE = "settings";

    @NonNull
    @ProtobufIndex(index = 16)
    @Deprecated
    public Boolean autoAdjustSuggestRadius;

    @NonNull
    @ProtobufIndex(index = 4)
    public Double birthdate;

    @NonNull
    @ProtobufIndex(index = 12)
    @Deprecated
    public SettingsBoost boost;

    @NonNull
    @ProtobufIndex(index = 10)
    @Deprecated
    public SettingsConversations conversations;

    @NonNull
    @ProtobufIndex(index = 19)
    @Deprecated
    public String email;

    @Nullable
    @ProtobufIndex(index = 18)
    @Deprecated
    public String greeting;

    @NonNull
    @ProtobufIndex(index = 7)
    @Deprecated
    public Boolean hideContacts;

    @NonNull
    @ProtobufIndex(index = 8)
    @Deprecated
    public Boolean hideMutualContacts;

    @Nullable
    @ProtobufIndex(index = 3)
    @Deprecated
    public SettingsIntent intent;

    @NonNull
    @ProtobufIndex(index = 20)
    public PhoneNumber linkedPhoneNumber;

    @NonNull
    @ProtobufIndex(index = 2)
    @Deprecated
    public LookingFor lookingFor;

    @NonNull
    @ProtobufIndex(index = 15)
    @Deprecated
    public SettingsMoment moment;

    @NonNull
    @ProtobufIndex(index = 6)
    @Deprecated
    public SettingsNotifications notifications;

    @Nullable
    @ProtobufIndex(index = 25)
    public OmsSetting omsSetting;

    @NonNull
    @ProtobufIndex(index = 1)
    public PhoneNumber phoneNumber;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 9)
    @Deprecated
    public SearchAge searchAge;

    @NonNull
    @ProtobufIndex(index = 11)
    @Deprecated
    public MessageLocation searchLocation;

    @NonNull
    @ProtobufIndex(index = 14)
    @Deprecated
    public List<SearchPriority> searchPriorities;

    @NonNull
    @ProtobufIndex(index = 5)
    @Deprecated
    public SearchRadius searchRadius;

    @Nullable
    @ProtobufIndex(index = 21)
    public List<SettingGroups> settingGroups;

    @Nullable
    @ProtobufIndex(index = 17)
    @Deprecated
    public SettingsTbh tbh;

    @NonNull
    @ProtobufIndex(index = 13)
    public Verification verification;
    public static ProtobufAdapter<Settings> PROTOBUF_ADAPTER = new MessageNanoAdapter<Settings>() { // from class: com.p1.mobile.putong.data.Settings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Settings settings) {
            PhoneNumber phoneNumber = settings.phoneNumber;
            int iM17285l = phoneNumber != null ? CodedOutputByteBufferNano.m17285l(1, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER) : 0;
            LookingFor lookingFor = settings.lookingFor;
            if (lookingFor != null) {
                iM17285l += CodedOutputByteBufferNano.m17281h(2, lookingFor.ordinal());
            }
            SettingsIntent settingsIntent = settings.intent;
            if (settingsIntent != null) {
                iM17285l += CodedOutputByteBufferNano.m17281h(3, settingsIntent.ordinal());
            }
            Double d = settings.birthdate;
            if (d != null) {
                iM17285l += CodedOutputByteBufferNano.m17277d(4, d.doubleValue());
            }
            SearchRadius searchRadius = settings.searchRadius;
            if (searchRadius != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, searchRadius, SearchRadius.PROTOBUF_ADAPTER);
            }
            SettingsNotifications settingsNotifications = settings.notifications;
            if (settingsNotifications != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, settingsNotifications, SettingsNotifications.PROTOBUF_ADAPTER);
            }
            Boolean bool = settings.hideContacts;
            if (bool != null) {
                iM17285l += CodedOutputByteBufferNano.m17275b(7, bool.booleanValue());
            }
            Boolean bool2 = settings.hideMutualContacts;
            if (bool2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17275b(8, bool2.booleanValue());
            }
            SearchAge searchAge = settings.searchAge;
            if (searchAge != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(9, searchAge, SearchAge.PROTOBUF_ADAPTER);
            }
            SettingsConversations settingsConversations = settings.conversations;
            if (settingsConversations != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(10, settingsConversations, SettingsConversations.PROTOBUF_ADAPTER);
            }
            MessageLocation messageLocation = settings.searchLocation;
            if (messageLocation != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(11, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            SettingsBoost settingsBoost = settings.boost;
            if (settingsBoost != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(12, settingsBoost, SettingsBoost.PROTOBUF_ADAPTER);
            }
            Verification verification = settings.verification;
            if (verification != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(13, verification, Verification.PROTOBUF_ADAPTER);
            }
            List<SearchPriority> list = settings.searchPriorities;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(14, SearchPriority.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SettingsMoment settingsMoment = settings.moment;
            if (settingsMoment != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(15, settingsMoment, SettingsMoment.PROTOBUF_ADAPTER);
            }
            Boolean bool3 = settings.autoAdjustSuggestRadius;
            if (bool3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17275b(16, bool3.booleanValue());
            }
            SettingsTbh settingsTbh = settings.tbh;
            if (settingsTbh != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(17, settingsTbh, SettingsTbh.PROTOBUF_ADAPTER);
            }
            String str = settings.greeting;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(18, str);
            }
            String str2 = settings.email;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(19, str2);
            }
            PhoneNumber phoneNumber2 = settings.linkedPhoneNumber;
            if (phoneNumber2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(20, phoneNumber2, PhoneNumber.PROTOBUF_ADAPTER);
            }
            List<SettingGroups> list2 = settings.settingGroups;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(21, list2, SettingGroups.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LookingFor lookingFor2 = settings.lookingFor;
            if (lookingFor2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(22, lookingFor2, LookingFor.PROTOBUF_ADAPTER);
            }
            SettingsIntent settingsIntent2 = settings.intent;
            if (settingsIntent2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(23, settingsIntent2, SettingsIntent.PROTOBUF_ADAPTER);
            }
            List<SearchPriority> list3 = settings.searchPriorities;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(24, list3, SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OmsSetting omsSetting = settings.omsSetting;
            if (omsSetting != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(25, omsSetting, OmsSetting.PROTOBUF_ADAPTER);
            }
            settings.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Settings parse(nc5 nc5Var) throws IOException {
            Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            Settings settings = new Settings();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            List list = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (settings.lookingFor == null && numValueOf != null) {
                            settings.lookingFor = (LookingFor) LookingFor.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (settings.intent == null && numValueOf2 != null) {
                            settings.intent = (SettingsIntent) SettingsIntent.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (settings.searchPriorities == null && list != null) {
                            settings.searchPriorities = SearchPriority.oldEnumCovertList(list);
                        }
                        if (settings.phoneNumber == null) {
                            settings.phoneNumber = PhoneNumber.new_();
                        }
                        if (settings.lookingFor == null) {
                            settings.lookingFor = (LookingFor) LookingFor.JSON_ADAPTER.defaultEnum();
                        }
                        if (settings.birthdate == null) {
                            settings.birthdate = dValueOf;
                        }
                        if (settings.searchRadius == null) {
                            settings.searchRadius = SearchRadius.new_();
                        }
                        if (settings.notifications == null) {
                            settings.notifications = SettingsNotifications.new_();
                        }
                        if (settings.hideContacts == null) {
                            settings.hideContacts = Boolean.FALSE;
                        }
                        if (settings.hideMutualContacts == null) {
                            settings.hideMutualContacts = Boolean.FALSE;
                        }
                        if (settings.searchAge == null) {
                            settings.searchAge = SearchAge.new_();
                        }
                        if (settings.conversations == null) {
                            settings.conversations = SettingsConversations.new_();
                        }
                        if (settings.searchLocation == null) {
                            settings.searchLocation = MessageLocation.new_();
                        }
                        if (settings.boost == null) {
                            settings.boost = SettingsBoost.new_();
                        }
                        if (settings.verification == null) {
                            settings.verification = Verification.new_();
                        }
                        if (settings.searchPriorities == null) {
                            settings.searchPriorities = new ArrayList();
                        }
                        if (settings.moment == null) {
                            settings.moment = SettingsMoment.new_();
                        }
                        if (settings.autoAdjustSuggestRadius == null) {
                            settings.autoAdjustSuggestRadius = Boolean.FALSE;
                        }
                        if (settings.email == null) {
                            settings.email = "";
                        }
                        if (settings.linkedPhoneNumber == null) {
                            settings.linkedPhoneNumber = PhoneNumber.new_();
                        }
                        break;
                    case 10:
                        settings.phoneNumber = (PhoneNumber) nc5Var.m162488l(PhoneNumber.PROTOBUF_ADAPTER);
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 24:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 33:
                        settings.birthdate = Double.valueOf(nc5Var.m162484h());
                        continue;
                    case 42:
                        settings.searchRadius = (SearchRadius) nc5Var.m162488l(SearchRadius.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        settings.notifications = (SettingsNotifications) nc5Var.m162488l(SettingsNotifications.PROTOBUF_ADAPTER);
                        continue;
                    case 56:
                        settings.hideContacts = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 64:
                        settings.hideMutualContacts = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 74:
                        settings.searchAge = (SearchAge) nc5Var.m162488l(SearchAge.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        settings.conversations = (SettingsConversations) nc5Var.m162488l(SettingsConversations.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        settings.searchLocation = (MessageLocation) nc5Var.m162488l(MessageLocation.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        settings.boost = (SettingsBoost) nc5Var.m162488l(SettingsBoost.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        settings.verification = (Verification) nc5Var.m162488l(Verification.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        list = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        settings.moment = (SettingsMoment) nc5Var.m162488l(SettingsMoment.PROTOBUF_ADAPTER);
                        continue;
                    case 128:
                        settings.autoAdjustSuggestRadius = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        settings.tbh = (SettingsTbh) nc5Var.m162488l(SettingsTbh.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        settings.greeting = nc5Var.m162495s();
                        continue;
                    case 154:
                        settings.email = nc5Var.m162495s();
                        continue;
                    case 162:
                        settings.linkedPhoneNumber = (PhoneNumber) nc5Var.m162488l(PhoneNumber.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        settings.settingGroups = (List) nc5Var.m162488l(SettingGroups.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 178:
                        settings.lookingFor = (LookingFor) nc5Var.m162488l(LookingFor.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        settings.intent = (SettingsIntent) nc5Var.m162488l(SettingsIntent.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        settings.searchPriorities = (List) nc5Var.m162488l(SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 202:
                        settings.omsSetting = (OmsSetting) nc5Var.m162488l(OmsSetting.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (settings.lookingFor == null && numValueOf != null) {
                            settings.lookingFor = (LookingFor) LookingFor.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (settings.intent == null && numValueOf2 != null) {
                            settings.intent = (SettingsIntent) SettingsIntent.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (settings.searchPriorities == null && list != null) {
                            settings.searchPriorities = SearchPriority.oldEnumCovertList(list);
                        }
                        if (settings.phoneNumber == null) {
                            settings.phoneNumber = PhoneNumber.new_();
                        }
                        if (settings.lookingFor == null) {
                            settings.lookingFor = (LookingFor) LookingFor.JSON_ADAPTER.defaultEnum();
                        }
                        if (settings.birthdate == null) {
                            settings.birthdate = dValueOf;
                        }
                        if (settings.searchRadius == null) {
                            settings.searchRadius = SearchRadius.new_();
                        }
                        if (settings.notifications == null) {
                            settings.notifications = SettingsNotifications.new_();
                        }
                        if (settings.hideContacts == null) {
                            settings.hideContacts = Boolean.FALSE;
                        }
                        if (settings.hideMutualContacts == null) {
                            settings.hideMutualContacts = Boolean.FALSE;
                        }
                        if (settings.searchAge == null) {
                            settings.searchAge = SearchAge.new_();
                        }
                        if (settings.conversations == null) {
                            settings.conversations = SettingsConversations.new_();
                        }
                        if (settings.searchLocation == null) {
                            settings.searchLocation = MessageLocation.new_();
                        }
                        if (settings.boost == null) {
                            settings.boost = SettingsBoost.new_();
                        }
                        if (settings.verification == null) {
                            settings.verification = Verification.new_();
                        }
                        if (settings.searchPriorities == null) {
                            settings.searchPriorities = new ArrayList();
                        }
                        if (settings.moment == null) {
                            settings.moment = SettingsMoment.new_();
                        }
                        if (settings.autoAdjustSuggestRadius == null) {
                            settings.autoAdjustSuggestRadius = Boolean.FALSE;
                        }
                        if (settings.email == null) {
                            settings.email = "";
                        }
                        if (settings.linkedPhoneNumber == null) {
                            settings.linkedPhoneNumber = PhoneNumber.new_();
                            return settings;
                        }
                        break;
                }
            }
            return settings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Settings settings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PhoneNumber phoneNumber = settings.phoneNumber;
            if (phoneNumber != null) {
                codedOutputByteBufferNano.m17309K(1, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            LookingFor lookingFor = settings.lookingFor;
            if (lookingFor != null) {
                codedOutputByteBufferNano.m17305G(2, lookingFor.ordinal());
            }
            SettingsIntent settingsIntent = settings.intent;
            if (settingsIntent != null) {
                codedOutputByteBufferNano.m17305G(3, settingsIntent.ordinal());
            }
            Double d = settings.birthdate;
            if (d != null) {
                codedOutputByteBufferNano.m17301C(4, d.doubleValue());
            }
            SearchRadius searchRadius = settings.searchRadius;
            if (searchRadius != null) {
                codedOutputByteBufferNano.m17309K(5, searchRadius, SearchRadius.PROTOBUF_ADAPTER);
            }
            SettingsNotifications settingsNotifications = settings.notifications;
            if (settingsNotifications != null) {
                codedOutputByteBufferNano.m17309K(6, settingsNotifications, SettingsNotifications.PROTOBUF_ADAPTER);
            }
            Boolean bool = settings.hideContacts;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(7, bool.booleanValue());
            }
            Boolean bool2 = settings.hideMutualContacts;
            if (bool2 != null) {
                codedOutputByteBufferNano.m17299A(8, bool2.booleanValue());
            }
            SearchAge searchAge = settings.searchAge;
            if (searchAge != null) {
                codedOutputByteBufferNano.m17309K(9, searchAge, SearchAge.PROTOBUF_ADAPTER);
            }
            SettingsConversations settingsConversations = settings.conversations;
            if (settingsConversations != null) {
                codedOutputByteBufferNano.m17309K(10, settingsConversations, SettingsConversations.PROTOBUF_ADAPTER);
            }
            MessageLocation messageLocation = settings.searchLocation;
            if (messageLocation != null) {
                codedOutputByteBufferNano.m17309K(11, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            SettingsBoost settingsBoost = settings.boost;
            if (settingsBoost != null) {
                codedOutputByteBufferNano.m17309K(12, settingsBoost, SettingsBoost.PROTOBUF_ADAPTER);
            }
            Verification verification = settings.verification;
            if (verification != null) {
                codedOutputByteBufferNano.m17309K(13, verification, Verification.PROTOBUF_ADAPTER);
            }
            List<SearchPriority> list = settings.searchPriorities;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(14, SearchPriority.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SettingsMoment settingsMoment = settings.moment;
            if (settingsMoment != null) {
                codedOutputByteBufferNano.m17309K(15, settingsMoment, SettingsMoment.PROTOBUF_ADAPTER);
            }
            Boolean bool3 = settings.autoAdjustSuggestRadius;
            if (bool3 != null) {
                codedOutputByteBufferNano.m17299A(16, bool3.booleanValue());
            }
            SettingsTbh settingsTbh = settings.tbh;
            if (settingsTbh != null) {
                codedOutputByteBufferNano.m17309K(17, settingsTbh, SettingsTbh.PROTOBUF_ADAPTER);
            }
            String str = settings.greeting;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(18, str);
            }
            String str2 = settings.email;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(19, str2);
            }
            PhoneNumber phoneNumber2 = settings.linkedPhoneNumber;
            if (phoneNumber2 != null) {
                codedOutputByteBufferNano.m17309K(20, phoneNumber2, PhoneNumber.PROTOBUF_ADAPTER);
            }
            List<SettingGroups> list2 = settings.settingGroups;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(21, list2, SettingGroups.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LookingFor lookingFor2 = settings.lookingFor;
            if (lookingFor2 != null) {
                codedOutputByteBufferNano.m17309K(22, lookingFor2, LookingFor.PROTOBUF_ADAPTER);
            }
            SettingsIntent settingsIntent2 = settings.intent;
            if (settingsIntent2 != null) {
                codedOutputByteBufferNano.m17309K(23, settingsIntent2, SettingsIntent.PROTOBUF_ADAPTER);
            }
            List<SearchPriority> list3 = settings.searchPriorities;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(24, list3, SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OmsSetting omsSetting = settings.omsSetting;
            if (omsSetting != null) {
                codedOutputByteBufferNano.m17309K(25, omsSetting, OmsSetting.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Settings> JSON_ADAPTER = new ObjectJsonAdapter<Settings>() { // from class: com.p1.mobile.putong.data.Settings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Settings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Settings newInstance() {
            return new Settings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Settings settings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1866850757:
                    if (str.equals("omsSetting")) {
                        b = 0;
                    }
                    break;
                case -1846421436:
                    if (str.equals("settingGroups")) {
                        b = 1;
                    }
                    break;
                case -1484401125:
                    if (str.equals("verification")) {
                        b = 2;
                    }
                    break;
                case -1361222728:
                    if (str.equals("autoAdjustSuggestRadius")) {
                        b = 3;
                    }
                    break;
                case -1209078547:
                    if (str.equals("birthdate")) {
                        b = 4;
                    }
                    break;
                case -1192969641:
                    if (str.equals("phoneNumber")) {
                        b = 5;
                    }
                    break;
                case -1183762788:
                    if (str.equals("intent")) {
                        b = 6;
                    }
                    break;
                case -1153974006:
                    if (str.equals("searchPriorities")) {
                        b = 7;
                    }
                    break;
                case -1068531200:
                    if (str.equals("moment")) {
                        b = 8;
                    }
                    break;
                case -941809026:
                    if (str.equals("linkedPhoneNumber")) {
                        b = 9;
                    }
                    break;
                case -237485699:
                    if (str.equals("searchLocation")) {
                        b = 10;
                    }
                    break;
                case -86886807:
                    if (str.equals("hideMutualContacts")) {
                        b = 11;
                    }
                    break;
                case -5226571:
                    if (str.equals("hideContacts")) {
                        b = 12;
                    }
                    break;
                case 114618:
                    if (str.equals("tbh")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 73719898:
                    if (str.equals("searchRadius")) {
                        b = 14;
                    }
                    break;
                case 93922211:
                    if (str.equals("boost")) {
                        b = 15;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 205422649:
                    if (str.equals("greeting")) {
                        b = 17;
                    }
                    break;
                case 955247846:
                    if (str.equals(SeeTextDynamicParam.lookingFor)) {
                        b = 18;
                    }
                    break;
                case 1272354024:
                    if (str.equals(Notifications.TYPE)) {
                        b = 19;
                    }
                    break;
                case 1469953104:
                    if (str.equals(SchemeKey.conversations)) {
                        b = 20;
                    }
                    break;
                case 1778178615:
                    if (str.equals("searchAge")) {
                        b = 21;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    settings.omsSetting = OmsSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    settings.settingGroups = JsonAdapter.parseArray(jsonParser, SettingGroups.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    settings.verification = Verification.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    settings.autoAdjustSuggestRadius = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 4:
                    settings.birthdate = Converter.API_DATE_BOXED.parse(jsonParser, str2);
                    return true;
                case 5:
                    settings.phoneNumber = PhoneNumber.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    settings.intent = SettingsIntent.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 7:
                    settings.searchPriorities = JsonAdapter.parseArray(jsonParser, SearchPriority.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    settings.moment = SettingsMoment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    settings.linkedPhoneNumber = PhoneNumber.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    settings.searchLocation = MessageLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    settings.hideMutualContacts = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 12:
                    settings.hideContacts = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 13:
                    settings.tbh = SettingsTbh.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    settings.searchRadius = SearchRadius.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    settings.boost = SettingsBoost.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    settings.email = jsonParser.getValueAsString();
                    return true;
                case 17:
                    settings.greeting = jsonParser.getValueAsString();
                    return true;
                case 18:
                    settings.lookingFor = LookingFor.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 19:
                    settings.notifications = SettingsNotifications.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    settings.conversations = SettingsConversations.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    settings.searchAge = SearchAge.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Settings settings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1866850757:
                    if (str.equals("omsSetting")) {
                        b = 0;
                    }
                    break;
                case -1846421436:
                    if (str.equals("settingGroups")) {
                        b = 1;
                    }
                    break;
                case -1484401125:
                    if (str.equals("verification")) {
                        b = 2;
                    }
                    break;
                case -1361222728:
                    if (str.equals("autoAdjustSuggestRadius")) {
                        b = 3;
                    }
                    break;
                case -1209078547:
                    if (str.equals("birthdate")) {
                        b = 4;
                    }
                    break;
                case -1192969641:
                    if (str.equals("phoneNumber")) {
                        b = 5;
                    }
                    break;
                case -1183762788:
                    if (str.equals("intent")) {
                        b = 6;
                    }
                    break;
                case -1153974006:
                    if (str.equals("searchPriorities")) {
                        b = 7;
                    }
                    break;
                case -1068531200:
                    if (str.equals("moment")) {
                        b = 8;
                    }
                    break;
                case -941809026:
                    if (str.equals("linkedPhoneNumber")) {
                        b = 9;
                    }
                    break;
                case -237485699:
                    if (str.equals("searchLocation")) {
                        b = 10;
                    }
                    break;
                case -86886807:
                    if (str.equals("hideMutualContacts")) {
                        b = 11;
                    }
                    break;
                case -5226571:
                    if (str.equals("hideContacts")) {
                        b = 12;
                    }
                    break;
                case 114618:
                    if (str.equals("tbh")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 73719898:
                    if (str.equals("searchRadius")) {
                        b = 14;
                    }
                    break;
                case 93922211:
                    if (str.equals("boost")) {
                        b = 15;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 205422649:
                    if (str.equals("greeting")) {
                        b = 17;
                    }
                    break;
                case 955247846:
                    if (str.equals(SeeTextDynamicParam.lookingFor)) {
                        b = 18;
                    }
                    break;
                case 1272354024:
                    if (str.equals(Notifications.TYPE)) {
                        b = 19;
                    }
                    break;
                case 1469953104:
                    if (str.equals(SchemeKey.conversations)) {
                        b = 20;
                    }
                    break;
                case 1778178615:
                    if (str.equals("searchAge")) {
                        b = 21;
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
                    return true;
                default:
                    return super.parseFieldCheck(settings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Settings settings, JsonGenerator jsonGenerator) throws IOException {
            if (settings.phoneNumber != null) {
                jsonGenerator.writeFieldName("phoneNumber");
                PhoneNumber.JSON_ADAPTER.serialize(settings.phoneNumber, jsonGenerator, true);
            }
            if (settings.lookingFor != null) {
                jsonGenerator.writeFieldName(SeeTextDynamicParam.lookingFor);
                LookingFor.JSON_ADAPTER.serialize(settings.lookingFor, jsonGenerator, true);
            }
            if (settings.intent != null) {
                jsonGenerator.writeFieldName("intent");
                SettingsIntent.JSON_ADAPTER.serialize(settings.intent, jsonGenerator, true);
            }
            if (settings.birthdate != null) {
                jsonGenerator.writeFieldName("birthdate");
                Converter.API_DATE_BOXED.serialize(settings.birthdate, jsonGenerator, true);
            }
            if (settings.searchRadius != null) {
                jsonGenerator.writeFieldName("searchRadius");
                SearchRadius.JSON_ADAPTER.serialize(settings.searchRadius, jsonGenerator, true);
            }
            if (settings.notifications != null) {
                jsonGenerator.writeFieldName(Notifications.TYPE);
                SettingsNotifications.JSON_ADAPTER.serialize(settings.notifications, jsonGenerator, true);
            }
            Boolean bool = settings.hideContacts;
            if (bool != null) {
                jsonGenerator.writeBooleanField("hideContacts", bool.booleanValue());
            }
            Boolean bool2 = settings.hideMutualContacts;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("hideMutualContacts", bool2.booleanValue());
            }
            if (settings.searchAge != null) {
                jsonGenerator.writeFieldName("searchAge");
                SearchAge.JSON_ADAPTER.serialize(settings.searchAge, jsonGenerator, true);
            }
            if (settings.conversations != null) {
                jsonGenerator.writeFieldName(SchemeKey.conversations);
                SettingsConversations.JSON_ADAPTER.serialize(settings.conversations, jsonGenerator, true);
            }
            if (settings.searchLocation != null) {
                jsonGenerator.writeFieldName("searchLocation");
                MessageLocation.JSON_ADAPTER.serialize(settings.searchLocation, jsonGenerator, true);
            }
            if (settings.boost != null) {
                jsonGenerator.writeFieldName("boost");
                SettingsBoost.JSON_ADAPTER.serialize(settings.boost, jsonGenerator, true);
            }
            if (settings.verification != null) {
                jsonGenerator.writeFieldName("verification");
                Verification.JSON_ADAPTER.serialize(settings.verification, jsonGenerator, true);
            }
            if (settings.searchPriorities != null) {
                jsonGenerator.writeFieldName("searchPriorities");
                JsonAdapter.serializeArray(settings.searchPriorities, jsonGenerator, SearchPriority.JSON_ADAPTER);
            }
            if (settings.moment != null) {
                jsonGenerator.writeFieldName("moment");
                SettingsMoment.JSON_ADAPTER.serialize(settings.moment, jsonGenerator, true);
            }
            Boolean bool3 = settings.autoAdjustSuggestRadius;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField("autoAdjustSuggestRadius", bool3.booleanValue());
            }
            if (settings.tbh != null) {
                jsonGenerator.writeFieldName("tbh");
                SettingsTbh.JSON_ADAPTER.serialize(settings.tbh, jsonGenerator, true);
            }
            String str = settings.greeting;
            if (str != null) {
                jsonGenerator.writeStringField("greeting", str);
            }
            String str2 = settings.email;
            if (str2 != null) {
                jsonGenerator.writeStringField("email", str2);
            }
            if (settings.linkedPhoneNumber != null) {
                jsonGenerator.writeFieldName("linkedPhoneNumber");
                PhoneNumber.JSON_ADAPTER.serialize(settings.linkedPhoneNumber, jsonGenerator, true);
            }
            if (settings.settingGroups != null) {
                jsonGenerator.writeFieldName("settingGroups");
                JsonAdapter.serializeArray(settings.settingGroups, jsonGenerator, SettingGroups.JSON_ADAPTER);
            }
            if (settings.omsSetting != null) {
                jsonGenerator.writeFieldName("omsSetting");
                OmsSetting.JSON_ADAPTER.serialize(settings.omsSetting, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Settings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Settings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    List<String> purposeList = new ArrayList();
    private HashSet<String> parseFieldSet = new HashSet<>();

    public Settings() {
        checkSettingsGroup();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ SearchPriority m61268a(SearchPriority searchPriority) {
        return searchPriority;
    }

    private void clearLiveEnterEffectSetting(List<SettingGroups> list) {
        if (list.get(0) == null || list.get(0).live == null) {
            return;
        }
        list.get(0).live.closeEnterRoomMsg = null;
    }

    private double getMomentRoamingLatitude() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.vipSearch) && NullChecker.m82486a(settingGroup.vipSearch.momentRoamingLatitude)) ? settingGroup.vipSearch.momentRoamingLatitude.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    private double getMomentRoamingLongitude() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.vipSearch) && NullChecker.m82486a(settingGroup.vipSearch.momentRoamingLongitude)) ? settingGroup.vipSearch.momentRoamingLongitude.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public static Settings new_() {
        Settings settings = new Settings();
        settings.nullCheck();
        return settings;
    }

    public Boolean aiPictureEnable() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.aiPictureEnable)) ? Boolean.valueOf(TextUtils.equals(settingGroup.privacy.aiPictureEnable, "true")) : Boolean.FALSE;
    }

    public Boolean autoAdjustSuggestRadius() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search) && NullChecker.m82486a(settingGroup.search.autoAdjustRadius)) ? settingGroup.search.autoAdjustRadius : this.autoAdjustSuggestRadius;
    }

    public void checkSettingsGroup() {
        if (this.settingGroups == null) {
            this.settingGroups = new ArrayList();
        }
        if (jyb.m147479J(this.settingGroups)) {
            this.settingGroups.add(new SettingGroups());
        }
        SettingGroups settingGroup = getSettingGroup();
        if (settingGroup.search == null) {
            settingGroup.search = new UserSearchSettings();
        }
        if (settingGroup.privacy == null) {
            settingGroup.privacy = new UserPrivacySettings();
        }
        if (settingGroup.push == null) {
            settingGroup.push = new UserPushSettings();
        }
        if (settingGroup.comDiamond == null) {
            settingGroup.comDiamond = new ComDiamond();
        }
        if (settingGroup.gender == null) {
            settingGroup.gender = IntlMoreGender.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Settings mo225055clone() {
        Settings settings = new Settings();
        PhoneNumber phoneNumber = this.phoneNumber;
        if (phoneNumber != null) {
            settings.phoneNumber = phoneNumber.mo225055clone();
        }
        settings.lookingFor = this.lookingFor;
        settings.intent = this.intent;
        settings.birthdate = this.birthdate;
        SearchRadius searchRadius = this.searchRadius;
        if (searchRadius != null) {
            settings.searchRadius = searchRadius.mo225055clone();
        }
        SettingsNotifications settingsNotifications = this.notifications;
        if (settingsNotifications != null) {
            settings.notifications = settingsNotifications.mo225055clone();
        }
        settings.hideContacts = this.hideContacts;
        settings.hideMutualContacts = this.hideMutualContacts;
        SearchAge searchAge = this.searchAge;
        if (searchAge != null) {
            settings.searchAge = searchAge.mo225055clone();
        }
        SettingsConversations settingsConversations = this.conversations;
        if (settingsConversations != null) {
            settings.conversations = settingsConversations.mo225055clone();
        }
        MessageLocation messageLocation = this.searchLocation;
        if (messageLocation != null) {
            settings.searchLocation = messageLocation.mo225055clone();
        }
        SettingsBoost settingsBoost = this.boost;
        if (settingsBoost != null) {
            settings.boost = settingsBoost.mo225055clone();
        }
        Verification verification = this.verification;
        if (verification != null) {
            settings.verification = verification.mo225055clone();
        }
        List<SearchPriority> list = this.searchPriorities;
        if (list != null) {
            settings.searchPriorities = ValueObject.util_map(list, new qcj() { // from class: l.tve0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Settings.m61268a((SearchPriority) obj);
                }
            });
        }
        SettingsMoment settingsMoment = this.moment;
        if (settingsMoment != null) {
            settings.moment = settingsMoment.mo225055clone();
        }
        settings.autoAdjustSuggestRadius = this.autoAdjustSuggestRadius;
        SettingsTbh settingsTbh = this.tbh;
        if (settingsTbh != null) {
            settings.tbh = settingsTbh.mo225055clone();
        }
        settings.greeting = this.greeting;
        settings.email = this.email;
        PhoneNumber phoneNumber2 = this.linkedPhoneNumber;
        if (phoneNumber2 != null) {
            settings.linkedPhoneNumber = phoneNumber2.mo225055clone();
        }
        List<SettingGroups> list2 = this.settingGroups;
        if (list2 != null) {
            settings.settingGroups = ValueObject.util_map(list2, new qcj() { // from class: l.uve0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((SettingGroups) obj).mo225055clone();
                }
            });
        }
        OmsSetting omsSetting = this.omsSetting;
        if (omsSetting != null) {
            settings.omsSetting = omsSetting.mo225055clone();
        }
        return settings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) obj;
        return ValueObject.util_equals(this.phoneNumber, settings.phoneNumber) && ValueObject.util_equals(this.lookingFor, settings.lookingFor) && ValueObject.util_equals(this.intent, settings.intent) && ValueObject.util_equals(this.birthdate, settings.birthdate) && ValueObject.util_equals(this.searchRadius, settings.searchRadius) && ValueObject.util_equals(this.notifications, settings.notifications) && ValueObject.util_equals(this.hideContacts, settings.hideContacts) && ValueObject.util_equals(this.hideMutualContacts, settings.hideMutualContacts) && ValueObject.util_equals(this.searchAge, settings.searchAge) && ValueObject.util_equals(this.conversations, settings.conversations) && ValueObject.util_equals(this.searchLocation, settings.searchLocation) && ValueObject.util_equals(this.boost, settings.boost) && ValueObject.util_equals(this.verification, settings.verification) && ValueObject.util_equals(this.searchPriorities, settings.searchPriorities) && ValueObject.util_equals(this.moment, settings.moment) && ValueObject.util_equals(this.autoAdjustSuggestRadius, settings.autoAdjustSuggestRadius) && ValueObject.util_equals(this.tbh, settings.tbh) && ValueObject.util_equals(this.greeting, settings.greeting) && ValueObject.util_equals(this.email, settings.email) && ValueObject.util_equals(this.linkedPhoneNumber, settings.linkedPhoneNumber) && ValueObject.util_equals(this.settingGroups, settings.settingGroups) && ValueObject.util_equals(this.omsSetting, settings.omsSetting);
    }

    public String getAiPictureEnable() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.aiPictureEnable)) ? settingGroup.privacy.aiPictureEnable : "none";
    }

    public CityC getCityTopInfo() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.cityC)) {
            return settingGroup.cityC;
        }
        return null;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public DoublePair getLatitudeAndLongitude() {
        return new DoublePair(getRoamingLatitude(), getRoamingLongitude());
    }

    public LookingFor getLookingFor() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search) && NullChecker.m82486a(settingGroup.search.lookingForGender)) ? settingGroup.search.lookingForGender : this.lookingFor;
    }

    public DoublePair getMomentLatitudeAndLongitude() {
        return new DoublePair(getMomentRoamingLatitude(), getMomentRoamingLongitude());
    }

    public Boolean getOnlineReminder() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.onlineReminder)) ? settingGroup.privacy.onlineReminder : Boolean.FALSE;
    }

    public Integer getRadiusAllowedMaximum() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search)) ? settingGroup.search.radiusAllowedMaximum : this.searchRadius.allowedMaximum;
    }

    public Integer getRadiusAllowedMinimum() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search)) ? settingGroup.search.radiusAllowedMinimum : this.searchRadius.allowedMinimum;
    }

    public double getRoamingLatitude() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search) && NullChecker.m82486a(settingGroup.search.roamingLatitude)) ? settingGroup.search.roamingLatitude.doubleValue() : this.searchLocation.coordinates.first;
    }

    public double getRoamingLongitude() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search) && NullChecker.m82486a(settingGroup.search.roamingLongitude)) ? settingGroup.search.roamingLongitude.doubleValue() : this.searchLocation.coordinates.second;
    }

    public Integer getSearchAgeAllowedMaximum() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search)) ? settingGroup.search.ageAllowedMaximum : this.searchAge.allowedMaximum;
    }

    public Integer getSearchAgeAllowedMinimum() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search)) ? settingGroup.search.ageAllowedMinimum : this.searchAge.allowedMinimum;
    }

    public List<String> getSearchFriendPurpose() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search)) ? settingGroup.search.friendPurpose : this.purposeList;
    }

    public Integer getSearchInvisibleRadius() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search) && NullChecker.m82486a(settingGroup.search.invisibleRadius)) {
            return settingGroup.search.invisibleRadius;
        }
        return 0;
    }

    public Integer getSearchMaxAge() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search)) ? settingGroup.search.maxAge : this.searchAge.maximum;
    }

    public Integer getSearchMinAge() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search)) ? settingGroup.search.minAge : this.searchAge.minimum;
    }

    public List<SearchPriority> getSearchPriority() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search)) ? settingGroup.search.priorities : this.searchPriorities;
    }

    public Integer getSearchRadius() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.search) && NullChecker.m82486a(settingGroup.search.radius)) ? settingGroup.search.radius : this.searchRadius.value;
    }

    public SettingGroups getSettingGroup() {
        if (jyb.m147479J(this.settingGroups)) {
            return SettingGroups.new_();
        }
        clearLiveEnterEffectSetting(this.settingGroups);
        return this.settingGroups.get(0);
    }

    public int getSupremePartnerUserCode() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.spvip)) {
            return settingGroup.spvip.userCode;
        }
        return 0;
    }

    @Nullable
    public CharacterEvaluate getUserCharacter() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup)) {
            return settingGroup.characterEvaluate;
        }
        return null;
    }

    public Boolean hasAiPictureEnableClick() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.aiPictureEnable)) ? Boolean.valueOf(!TextUtils.equals(settingGroup.privacy.aiPictureEnable, "none")) : Boolean.FALSE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        PhoneNumber phoneNumber = this.phoneNumber;
        int iHashCode = (i2 + (phoneNumber != null ? phoneNumber.hashCode() : 0)) * 41;
        LookingFor lookingFor = this.lookingFor;
        int iHashCode2 = (iHashCode + (lookingFor != null ? lookingFor.hashCode() : 0)) * 41;
        SettingsIntent settingsIntent = this.intent;
        int iHashCode3 = (iHashCode2 + (settingsIntent != null ? settingsIntent.hashCode() : 0)) * 41;
        Double d = this.birthdate;
        int iHashCode4 = (iHashCode3 + (d != null ? d.hashCode() : 0)) * 41;
        SearchRadius searchRadius = this.searchRadius;
        int iHashCode5 = (iHashCode4 + (searchRadius != null ? searchRadius.hashCode() : 0)) * 41;
        SettingsNotifications settingsNotifications = this.notifications;
        int iHashCode6 = (iHashCode5 + (settingsNotifications != null ? settingsNotifications.hashCode() : 0)) * 41;
        Boolean bool = this.hideContacts;
        int iHashCode7 = (iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 41;
        Boolean bool2 = this.hideMutualContacts;
        int iHashCode8 = (iHashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        SearchAge searchAge = this.searchAge;
        int iHashCode9 = (iHashCode8 + (searchAge != null ? searchAge.hashCode() : 0)) * 41;
        SettingsConversations settingsConversations = this.conversations;
        int iHashCode10 = (iHashCode9 + (settingsConversations != null ? settingsConversations.hashCode() : 0)) * 41;
        MessageLocation messageLocation = this.searchLocation;
        int iHashCode11 = (iHashCode10 + (messageLocation != null ? messageLocation.hashCode() : 0)) * 41;
        SettingsBoost settingsBoost = this.boost;
        int iHashCode12 = (iHashCode11 + (settingsBoost != null ? settingsBoost.hashCode() : 0)) * 41;
        Verification verification = this.verification;
        int iHashCode13 = (iHashCode12 + (verification != null ? verification.hashCode() : 0)) * 41;
        List<SearchPriority> list = this.searchPriorities;
        int iHashCode14 = (iHashCode13 + (list != null ? list.hashCode() : 0)) * 41;
        SettingsMoment settingsMoment = this.moment;
        int iHashCode15 = (iHashCode14 + (settingsMoment != null ? settingsMoment.hashCode() : 0)) * 41;
        Boolean bool3 = this.autoAdjustSuggestRadius;
        int iHashCode16 = (iHashCode15 + (bool3 != null ? bool3.hashCode() : 0)) * 41;
        SettingsTbh settingsTbh = this.tbh;
        int iHashCode17 = (iHashCode16 + (settingsTbh != null ? settingsTbh.hashCode() : 0)) * 41;
        String str = this.greeting;
        int iHashCode18 = (iHashCode17 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.email;
        int iHashCode19 = (iHashCode18 + (str2 != null ? str2.hashCode() : 0)) * 41;
        PhoneNumber phoneNumber2 = this.linkedPhoneNumber;
        int iHashCode20 = (iHashCode19 + (phoneNumber2 != null ? phoneNumber2.hashCode() : 0)) * 41;
        List<SettingGroups> list2 = this.settingGroups;
        int iHashCode21 = (iHashCode20 + (list2 != null ? list2.hashCode() : 0)) * 41;
        OmsSetting omsSetting = this.omsSetting;
        int iHashCode22 = iHashCode21 + (omsSetting != null ? omsSetting.hashCode() : 0);
        this.hashCode = iHashCode22;
        return iHashCode22;
    }

    public Boolean heartbeatDisable() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.heartbeatDisable)) ? settingGroup.privacy.heartbeatDisable : Boolean.FALSE;
    }

    public Boolean hideAutoLike() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.moment)) ? settingGroup.moment.autoLike : Boolean.TRUE;
    }

    public Boolean hideContacts() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.hideContacts)) ? settingGroup.privacy.hideContacts : this.hideContacts;
    }

    public Boolean hideMutualContacts() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.hideMutualContacts)) ? settingGroup.privacy.hideMutualContacts : this.hideMutualContacts;
    }

    public Boolean hidePublicMoment() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy)) ? settingGroup.privacy.hidePublicMoments : this.moment.hidePublicMoments;
    }

    public boolean hideSchoolName() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.hideSchool)) {
            return settingGroup.privacy.hideSchool.booleanValue();
        }
        Boolean bool = this.verification.studies.hideSchoolName;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public Boolean hideSchoolNameNoDefaults() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy)) ? settingGroup.privacy.hideSchool : this.verification.studies.hideSchoolName;
    }

    public boolean isCityTop() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.cityC) && ((double) pzi0.m174454o()) < settingGroup.cityC.expiredTime;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isPlatinum() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.pvip)) {
            return settingGroup.pvip.isPvip;
        }
        return false;
    }

    public boolean isSupremePartner() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.spvip)) {
            return settingGroup.spvip.isSpvip;
        }
        return false;
    }

    public boolean isSupremePartnerOpenMystery() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.spvip)) {
            return settingGroup.spvip.isOpenMystery;
        }
        return false;
    }

    public Boolean justReceiveVeriUserMsg() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.verifiedUserMsg)) ? settingGroup.privacy.verifiedUserMsg : Boolean.FALSE;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(Settings settings) {
        if (!shouldMergeData() || equals(settings)) {
            return;
        }
        if (!isFieldParsed("phoneNumber")) {
            this.phoneNumber = settings.phoneNumber;
        }
        if (!isFieldParsed(SeeTextDynamicParam.lookingFor)) {
            this.lookingFor = settings.lookingFor;
        }
        if (!isFieldParsed("intent")) {
            this.intent = settings.intent;
        }
        if (!isFieldParsed("birthdate")) {
            this.birthdate = settings.birthdate;
        }
        if (!isFieldParsed("searchRadius")) {
            this.searchRadius = settings.searchRadius;
        }
        if (!isFieldParsed(Notifications.TYPE)) {
            this.notifications = settings.notifications;
        }
        if (!isFieldParsed("hideContacts")) {
            this.hideContacts = settings.hideContacts;
        }
        if (!isFieldParsed("hideMutualContacts")) {
            this.hideMutualContacts = settings.hideMutualContacts;
        }
        if (!isFieldParsed("searchAge")) {
            this.searchAge = settings.searchAge;
        }
        if (!isFieldParsed(SchemeKey.conversations)) {
            this.conversations = settings.conversations;
        }
        if (!isFieldParsed("searchLocation")) {
            this.searchLocation = settings.searchLocation;
        }
        if (!isFieldParsed("boost")) {
            this.boost = settings.boost;
        }
        if (!isFieldParsed("verification")) {
            this.verification = settings.verification;
        }
        if (!isFieldParsed("searchPriorities")) {
            this.searchPriorities = settings.searchPriorities;
        }
        if (!isFieldParsed("moment")) {
            this.moment = settings.moment;
        }
        if (!isFieldParsed("autoAdjustSuggestRadius")) {
            this.autoAdjustSuggestRadius = settings.autoAdjustSuggestRadius;
        }
        if (!isFieldParsed("tbh")) {
            this.tbh = settings.tbh;
        }
        if (!isFieldParsed("greeting")) {
            this.greeting = settings.greeting;
        }
        if (!isFieldParsed("email")) {
            this.email = settings.email;
        }
        if (!isFieldParsed("linkedPhoneNumber")) {
            this.linkedPhoneNumber = settings.linkedPhoneNumber;
        }
        if (!isFieldParsed("settingGroups")) {
            this.settingGroups = settings.settingGroups;
        }
        if (!isFieldParsed("omsSetting")) {
            this.omsSetting = settings.omsSetting;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.phoneNumber == null) {
            this.phoneNumber = PhoneNumber.new_();
        }
        if (this.lookingFor == null) {
            this.lookingFor = (LookingFor) LookingFor.JSON_ADAPTER.defaultEnum();
        }
        if (this.birthdate == null) {
            this.birthdate = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        if (this.searchRadius == null) {
            this.searchRadius = SearchRadius.new_();
        }
        if (this.notifications == null) {
            this.notifications = SettingsNotifications.new_();
        }
        if (this.hideContacts == null) {
            this.hideContacts = Boolean.FALSE;
        }
        if (this.hideMutualContacts == null) {
            this.hideMutualContacts = Boolean.FALSE;
        }
        if (this.searchAge == null) {
            this.searchAge = SearchAge.new_();
        }
        if (this.conversations == null) {
            this.conversations = SettingsConversations.new_();
        }
        if (this.searchLocation == null) {
            this.searchLocation = MessageLocation.new_();
        }
        if (this.boost == null) {
            this.boost = SettingsBoost.new_();
        }
        if (this.verification == null) {
            this.verification = Verification.new_();
        }
        if (this.searchPriorities == null) {
            this.searchPriorities = new ArrayList();
        }
        if (this.moment == null) {
            this.moment = SettingsMoment.new_();
        }
        if (this.autoAdjustSuggestRadius == null) {
            this.autoAdjustSuggestRadius = Boolean.FALSE;
        }
        if (this.email == null) {
            this.email = "";
        }
        if (this.linkedPhoneNumber == null) {
            this.linkedPhoneNumber = PhoneNumber.new_();
        }
    }

    public boolean personalizeAdsSuggest() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.adsSuggest)) {
            return settingGroup.privacy.adsSuggest.booleanValue();
        }
        return true;
    }

    public Boolean personalizeSuggest() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.personalizeSuggest)) ? settingGroup.privacy.personalizeSuggest : Boolean.TRUE;
    }

    public Boolean previewPushMessage() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push) && NullChecker.m82486a(settingGroup.push.previewMessage)) ? settingGroup.push.previewMessage : this.notifications.previewPushMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void putParsedField(String str) {
        if ("v2".equals(xi5.m211120v(this.requestUrl)) || xi5.API_VERSION_V3.equals(xi5.m211120v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    public boolean searchIntentEquals(Settings settings) {
        if (settings == this) {
            return true;
        }
        return settings != null && ValueObject.util_equals(getLookingFor(), settings.getLookingFor()) && ValueObject.util_equals(Double.valueOf(getRoamingLatitude()), Double.valueOf(settings.getRoamingLatitude())) && ValueObject.util_equals(Double.valueOf(getRoamingLongitude()), Double.valueOf(settings.getRoamingLongitude())) && ValueObject.util_equals(getSearchRadius(), settings.getSearchRadius()) && ValueObject.util_equals(getRadiusAllowedMinimum(), settings.getRadiusAllowedMinimum()) && ValueObject.util_equals(getRadiusAllowedMaximum(), settings.getRadiusAllowedMaximum()) && ValueObject.util_equals(autoAdjustSuggestRadius(), settings.autoAdjustSuggestRadius()) && ValueObject.util_equals(getSearchAgeAllowedMinimum(), settings.getSearchAgeAllowedMinimum()) && ValueObject.util_equals(getSearchAgeAllowedMaximum(), settings.getSearchAgeAllowedMaximum()) && ValueObject.util_equals(getSearchMinAge(), settings.getSearchMinAge()) && ValueObject.util_equals(getSearchMaxAge(), settings.getSearchMaxAge()) && ValueObject.util_equals(getSearchPriority(), settings.getSearchPriority()) && ValueObject.util_equals(this.birthdate, settings.birthdate) && ValueObject.util_equals(this.intent, settings.intent);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean shouldMergeData() {
        return "v2".equals(xi5.m211120v(this.requestUrl)) || xi5.API_VERSION_V3.equals(xi5.m211120v(this.requestUrl));
    }

    public Boolean showMomentLikes() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) ? settingGroup.push.showMomentLikes : Boolean.valueOf(this.conversations.showMomentLikes);
    }

    public Settings subtract(Settings settings) {
        Settings settings2 = new Settings();
        if (!ValueObject.util_equals(this.phoneNumber, settings.phoneNumber)) {
            settings2.phoneNumber = this.phoneNumber;
        }
        if (!ValueObject.util_equals(this.lookingFor, settings.lookingFor)) {
            settings2.lookingFor = this.lookingFor;
        }
        if (!ValueObject.util_equals(this.intent, settings.intent)) {
            settings2.intent = this.intent;
        }
        if (!ValueObject.util_equals(this.birthdate, settings.birthdate)) {
            settings2.birthdate = this.birthdate;
        }
        SearchRadius searchRadius = this.searchRadius;
        if (searchRadius != null) {
            settings2.searchRadius = searchRadius.subtract(settings.searchRadius);
        }
        if (!ValueObject.util_equals(this.notifications, settings.notifications)) {
            settings2.notifications = this.notifications;
        }
        if (!ValueObject.util_equals(this.hideContacts, settings.hideContacts)) {
            settings2.hideContacts = this.hideContacts;
        }
        if (!ValueObject.util_equals(this.hideMutualContacts, settings.hideMutualContacts)) {
            settings2.hideMutualContacts = this.hideMutualContacts;
        }
        SearchAge searchAge = this.searchAge;
        if (searchAge != null) {
            settings2.searchAge = searchAge.subtract(settings.searchAge);
        }
        if (!ValueObject.util_equals(this.conversations, settings.conversations)) {
            settings2.conversations = this.conversations;
        }
        if (!ValueObject.util_equals(this.searchLocation, settings.searchLocation)) {
            settings2.searchLocation = this.searchLocation;
        }
        if (!ValueObject.util_equals(this.boost, settings.boost)) {
            settings2.boost = this.boost;
        }
        if (!ValueObject.util_equals(this.verification, settings.verification)) {
            settings2.verification = this.verification;
        }
        if (!ValueObject.util_equals(this.searchPriorities, settings.searchPriorities)) {
            settings2.searchPriorities = this.searchPriorities;
        }
        if (!ValueObject.util_equals(this.moment, settings.moment)) {
            settings2.moment = this.moment;
        }
        if (!ValueObject.util_equals(this.autoAdjustSuggestRadius, settings.autoAdjustSuggestRadius)) {
            settings2.autoAdjustSuggestRadius = this.autoAdjustSuggestRadius;
        }
        if (!ValueObject.util_equals(this.tbh, settings.tbh)) {
            settings2.tbh = this.tbh;
        }
        if (!ValueObject.util_equals(this.greeting, settings.greeting)) {
            settings2.greeting = this.greeting;
        }
        if (!ValueObject.util_equals(this.email, settings.email)) {
            settings2.email = this.email;
        }
        if (!ValueObject.util_equals(this.linkedPhoneNumber, settings.linkedPhoneNumber)) {
            settings2.linkedPhoneNumber = this.linkedPhoneNumber;
        }
        if (!ValueObject.util_equals(this.settingGroups, settings.settingGroups)) {
            settings2.settingGroups = this.settingGroups;
        }
        OmsSetting omsSetting = this.omsSetting;
        if (omsSetting != null) {
            settings2.omsSetting = omsSetting.subtract(settings.omsSetting);
        }
        if (settings2.equals(new Settings())) {
            return null;
        }
        return settings2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public Boolean unrepliedReminder() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.privacy) && NullChecker.m82486a(settingGroup.privacy.unrepliedReminder)) ? settingGroup.privacy.unrepliedReminder : Boolean.TRUE;
    }

    public boolean userIsODiamond() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82487b(settingGroup.comDiamond)) {
            return settingGroup.comDiamond.isODiamond;
        }
        return false;
    }

    public Boolean userLivePushTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.livePush;
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) ? Boolean.FALSE : this.settingGroups.get(0).push.livePush;
    }

    public Boolean userMomentPushTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.momentPush;
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) ? Boolean.FALSE : this.settingGroups.get(0).push.momentPush;
    }

    public Boolean userMsgPushTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.msgPush;
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) ? Boolean.FALSE : this.settingGroups.get(0).push.msgPush;
    }

    public Boolean userPushAllEnable() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.allPush;
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) ? Boolean.FALSE : this.settingGroups.get(0).push.allPush;
    }

    public int userPushEndTimeTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.silentEndTime.intValue();
        }
        if (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) {
            return 1;
        }
        return this.settingGroups.get(0).push.silentEndTime.intValue();
    }

    public int userPushStartTimeTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.silentStartTime.intValue();
        }
        if (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) {
            return 0;
        }
        return this.settingGroups.get(0).push.silentStartTime.intValue();
    }

    public Boolean userRecommendPushTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.recommendPush;
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) ? Boolean.FALSE : this.settingGroups.get(0).push.recommendPush;
    }

    public Boolean userShareTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.share)) {
            return Boolean.valueOf(settingGroup.share.userShare);
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).share == null) ? Boolean.FALSE : Boolean.valueOf(this.settingGroups.get(0).share.userShare);
    }

    public Boolean userSilentSwitchPushTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.silentSwitch;
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) ? Boolean.FALSE : this.settingGroups.get(0).push.silentSwitch;
    }

    public Boolean userVoiceLivePushTip() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.push)) {
            return settingGroup.push.voiceLivePush;
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).push == null) ? Boolean.FALSE : this.settingGroups.get(0).push.voiceLivePush;
    }

    public String uservoiceNotification() {
        SettingGroups settingGroup = jyb.m147479J(this.settingGroups) ? null : getSettingGroup();
        if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.live)) {
            return settingGroup.live.voiceNotification;
        }
        return (jyb.m147479J(this.settingGroups) || this.settingGroups.get(0).live == null) ? "" : settingGroup.live.voiceNotification;
    }
}
