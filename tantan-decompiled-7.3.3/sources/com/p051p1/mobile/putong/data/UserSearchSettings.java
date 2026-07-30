package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.SearchPriority;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.HashSet;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class UserSearchSettings extends ValueObject<UserSearchSettings> implements Cloneable, Serializable {
    public static final String TYPE = "usersearchsettings";

    @NonNull
    @ProtobufIndex(index = 7)
    public Integer ageAllowedMaximum;

    @NonNull
    @ProtobufIndex(index = 6)
    public Integer ageAllowedMinimum;

    @Nullable
    @ProtobufIndex(index = 15)
    public Boolean allowSmartAvatarOpen;

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean autoAdjustRadius;

    @NonNull
    @ProtobufIndex(index = 21)
    public List<String> friendPurpose;

    @NonNull
    @ProtobufIndex(index = 2)
    public Boolean intelligentAvatar;

    @NonNull
    @ProtobufIndex(index = 16)
    public Integer invisibleRadius;

    @NonNull
    @ProtobufIndex(index = 3)
    public LookingFor lookingForGender;

    @NonNull
    @ProtobufIndex(index = 4)
    public Integer maxAge;

    @NonNull
    @ProtobufIndex(index = 5)
    public Integer minAge;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = 8)
    public List<SearchPriority> priorities;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<Purpose> purpose;

    @NonNull
    @ProtobufIndex(index = 9)
    public Integer radius;

    @NonNull
    @ProtobufIndex(index = 11)
    public Integer radiusAllowedMaximum;

    @NonNull
    @ProtobufIndex(index = 10)
    public Integer radiusAllowedMinimum;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 12)
    public Double roamingLatitude;

    @NonNull
    @ProtobufIndex(index = 13)
    public Double roamingLongitude;

    @NonNull
    @ProtobufIndex(index = 14)
    public Boolean smartAvatar;
    public static ProtobufAdapter<UserSearchSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSearchSettings>() { // from class: com.p1.mobile.putong.data.UserSearchSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserSearchSettings userSearchSettings) {
            Boolean bool = userSearchSettings.autoAdjustRadius;
            int iM17275b = bool != null ? CodedOutputByteBufferNano.m17275b(1, bool.booleanValue()) : 0;
            Boolean bool2 = userSearchSettings.intelligentAvatar;
            if (bool2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(2, bool2.booleanValue());
            }
            LookingFor lookingFor = userSearchSettings.lookingForGender;
            if (lookingFor != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(3, lookingFor.ordinal());
            }
            Integer num = userSearchSettings.maxAge;
            if (num != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(4, num.intValue());
            }
            Integer num2 = userSearchSettings.minAge;
            if (num2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(5, num2.intValue());
            }
            Integer num3 = userSearchSettings.ageAllowedMinimum;
            if (num3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(6, num3.intValue());
            }
            Integer num4 = userSearchSettings.ageAllowedMaximum;
            if (num4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(7, num4.intValue());
            }
            List<SearchPriority> list = userSearchSettings.priorities;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(8, SearchPriority.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Integer num5 = userSearchSettings.radius;
            if (num5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(9, num5.intValue());
            }
            Integer num6 = userSearchSettings.radiusAllowedMinimum;
            if (num6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(10, num6.intValue());
            }
            Integer num7 = userSearchSettings.radiusAllowedMaximum;
            if (num7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(11, num7.intValue());
            }
            Double d = userSearchSettings.roamingLatitude;
            if (d != null) {
                iM17275b += CodedOutputByteBufferNano.m17277d(12, d.doubleValue());
            }
            Double d2 = userSearchSettings.roamingLongitude;
            if (d2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17277d(13, d2.doubleValue());
            }
            Boolean bool3 = userSearchSettings.smartAvatar;
            if (bool3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(14, bool3.booleanValue());
            }
            Boolean bool4 = userSearchSettings.allowSmartAvatarOpen;
            if (bool4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17275b(15, bool4.booleanValue());
            }
            Integer num8 = userSearchSettings.invisibleRadius;
            if (num8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(16, num8.intValue());
            }
            List<Purpose> list2 = userSearchSettings.purpose;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(17, Purpose.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LookingFor lookingFor2 = userSearchSettings.lookingForGender;
            if (lookingFor2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(18, lookingFor2, LookingFor.PROTOBUF_ADAPTER);
            }
            List<SearchPriority> list3 = userSearchSettings.priorities;
            if (list3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(19, list3, SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Purpose> list4 = userSearchSettings.purpose;
            if (list4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(20, list4, Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = userSearchSettings.friendPurpose;
            if (list5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(21, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            userSearchSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserSearchSettings parse(nc5 nc5Var) throws IOException {
            Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            Integer numValueOf = null;
            List list = null;
            List list2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (userSearchSettings.lookingForGender == null && numValueOf != null) {
                            userSearchSettings.lookingForGender = (LookingFor) LookingFor.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (userSearchSettings.priorities == null && list != null) {
                            userSearchSettings.priorities = SearchPriority.oldEnumCovertList(list);
                        }
                        if (userSearchSettings.purpose == null && list2 != null) {
                            userSearchSettings.purpose = Purpose.oldEnumCovertList(list2);
                        }
                        if (userSearchSettings.autoAdjustRadius == null) {
                            userSearchSettings.autoAdjustRadius = Boolean.FALSE;
                        }
                        if (userSearchSettings.intelligentAvatar == null) {
                            userSearchSettings.intelligentAvatar = Boolean.FALSE;
                        }
                        if (userSearchSettings.lookingForGender == null) {
                            userSearchSettings.lookingForGender = (LookingFor) LookingFor.JSON_ADAPTER.defaultEnum();
                        }
                        if (userSearchSettings.maxAge == null) {
                            userSearchSettings.maxAge = 0;
                        }
                        if (userSearchSettings.minAge == null) {
                            userSearchSettings.minAge = 0;
                        }
                        if (userSearchSettings.ageAllowedMinimum == null) {
                            userSearchSettings.ageAllowedMinimum = 0;
                        }
                        if (userSearchSettings.ageAllowedMaximum == null) {
                            userSearchSettings.ageAllowedMaximum = 0;
                        }
                        if (userSearchSettings.priorities == null) {
                            userSearchSettings.priorities = new ArrayList();
                        }
                        if (userSearchSettings.radius == null) {
                            userSearchSettings.radius = 0;
                        }
                        if (userSearchSettings.radiusAllowedMinimum == null) {
                            userSearchSettings.radiusAllowedMinimum = 0;
                        }
                        if (userSearchSettings.radiusAllowedMaximum == null) {
                            userSearchSettings.radiusAllowedMaximum = 0;
                        }
                        if (userSearchSettings.roamingLatitude == null) {
                            userSearchSettings.roamingLatitude = dValueOf;
                        }
                        if (userSearchSettings.roamingLongitude == null) {
                            userSearchSettings.roamingLongitude = dValueOf;
                        }
                        if (userSearchSettings.smartAvatar == null) {
                            userSearchSettings.smartAvatar = Boolean.FALSE;
                        }
                        if (userSearchSettings.invisibleRadius == null) {
                            userSearchSettings.invisibleRadius = 0;
                        }
                        if (userSearchSettings.purpose == null) {
                            userSearchSettings.purpose = new ArrayList();
                        }
                        if (userSearchSettings.friendPurpose == null) {
                            userSearchSettings.friendPurpose = new ArrayList();
                        }
                        break;
                    case 8:
                        userSearchSettings.autoAdjustRadius = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 16:
                        userSearchSettings.intelligentAvatar = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 24:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 32:
                        userSearchSettings.maxAge = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 40:
                        userSearchSettings.minAge = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 48:
                        userSearchSettings.ageAllowedMinimum = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 56:
                        userSearchSettings.ageAllowedMaximum = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 66:
                        list = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 72:
                        userSearchSettings.radius = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 80:
                        userSearchSettings.radiusAllowedMinimum = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 88:
                        userSearchSettings.radiusAllowedMaximum = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        userSearchSettings.roamingLatitude = Double.valueOf(nc5Var.m162484h());
                        continue;
                    case 105:
                        userSearchSettings.roamingLongitude = Double.valueOf(nc5Var.m162484h());
                        continue;
                    case 112:
                        userSearchSettings.smartAvatar = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 120:
                        userSearchSettings.allowSmartAvatarOpen = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 128:
                        userSearchSettings.invisibleRadius = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        list2 = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        userSearchSettings.lookingForGender = (LookingFor) nc5Var.m162488l(LookingFor.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        userSearchSettings.priorities = (List) nc5Var.m162488l(SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 162:
                        userSearchSettings.purpose = (List) nc5Var.m162488l(Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        userSearchSettings.friendPurpose = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (userSearchSettings.lookingForGender == null && numValueOf != null) {
                            userSearchSettings.lookingForGender = (LookingFor) LookingFor.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (userSearchSettings.priorities == null && list != null) {
                            userSearchSettings.priorities = SearchPriority.oldEnumCovertList(list);
                        }
                        if (userSearchSettings.purpose == null && list2 != null) {
                            userSearchSettings.purpose = Purpose.oldEnumCovertList(list2);
                        }
                        if (userSearchSettings.autoAdjustRadius == null) {
                            userSearchSettings.autoAdjustRadius = Boolean.FALSE;
                        }
                        if (userSearchSettings.intelligentAvatar == null) {
                            userSearchSettings.intelligentAvatar = Boolean.FALSE;
                        }
                        if (userSearchSettings.lookingForGender == null) {
                            userSearchSettings.lookingForGender = (LookingFor) LookingFor.JSON_ADAPTER.defaultEnum();
                        }
                        if (userSearchSettings.maxAge == null) {
                            userSearchSettings.maxAge = 0;
                        }
                        if (userSearchSettings.minAge == null) {
                            userSearchSettings.minAge = 0;
                        }
                        if (userSearchSettings.ageAllowedMinimum == null) {
                            userSearchSettings.ageAllowedMinimum = 0;
                        }
                        if (userSearchSettings.ageAllowedMaximum == null) {
                            userSearchSettings.ageAllowedMaximum = 0;
                        }
                        if (userSearchSettings.priorities == null) {
                            userSearchSettings.priorities = new ArrayList();
                        }
                        if (userSearchSettings.radius == null) {
                            userSearchSettings.radius = 0;
                        }
                        if (userSearchSettings.radiusAllowedMinimum == null) {
                            userSearchSettings.radiusAllowedMinimum = 0;
                        }
                        if (userSearchSettings.radiusAllowedMaximum == null) {
                            userSearchSettings.radiusAllowedMaximum = 0;
                        }
                        if (userSearchSettings.roamingLatitude == null) {
                            userSearchSettings.roamingLatitude = dValueOf;
                        }
                        if (userSearchSettings.roamingLongitude == null) {
                            userSearchSettings.roamingLongitude = dValueOf;
                        }
                        if (userSearchSettings.smartAvatar == null) {
                            userSearchSettings.smartAvatar = Boolean.FALSE;
                        }
                        if (userSearchSettings.invisibleRadius == null) {
                            userSearchSettings.invisibleRadius = 0;
                        }
                        if (userSearchSettings.purpose == null) {
                            userSearchSettings.purpose = new ArrayList();
                        }
                        if (userSearchSettings.friendPurpose == null) {
                            userSearchSettings.friendPurpose = new ArrayList();
                            return userSearchSettings;
                        }
                        break;
                }
            }
            return userSearchSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserSearchSettings userSearchSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userSearchSettings.autoAdjustRadius;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(1, bool.booleanValue());
            }
            Boolean bool2 = userSearchSettings.intelligentAvatar;
            if (bool2 != null) {
                codedOutputByteBufferNano.m17299A(2, bool2.booleanValue());
            }
            LookingFor lookingFor = userSearchSettings.lookingForGender;
            if (lookingFor != null) {
                codedOutputByteBufferNano.m17305G(3, lookingFor.ordinal());
            }
            Integer num = userSearchSettings.maxAge;
            if (num != null) {
                codedOutputByteBufferNano.m17305G(4, num.intValue());
            }
            Integer num2 = userSearchSettings.minAge;
            if (num2 != null) {
                codedOutputByteBufferNano.m17305G(5, num2.intValue());
            }
            Integer num3 = userSearchSettings.ageAllowedMinimum;
            if (num3 != null) {
                codedOutputByteBufferNano.m17305G(6, num3.intValue());
            }
            Integer num4 = userSearchSettings.ageAllowedMaximum;
            if (num4 != null) {
                codedOutputByteBufferNano.m17305G(7, num4.intValue());
            }
            List<SearchPriority> list = userSearchSettings.priorities;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(8, SearchPriority.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Integer num5 = userSearchSettings.radius;
            if (num5 != null) {
                codedOutputByteBufferNano.m17305G(9, num5.intValue());
            }
            Integer num6 = userSearchSettings.radiusAllowedMinimum;
            if (num6 != null) {
                codedOutputByteBufferNano.m17305G(10, num6.intValue());
            }
            Integer num7 = userSearchSettings.radiusAllowedMaximum;
            if (num7 != null) {
                codedOutputByteBufferNano.m17305G(11, num7.intValue());
            }
            Double d = userSearchSettings.roamingLatitude;
            if (d != null) {
                codedOutputByteBufferNano.m17301C(12, d.doubleValue());
            }
            Double d2 = userSearchSettings.roamingLongitude;
            if (d2 != null) {
                codedOutputByteBufferNano.m17301C(13, d2.doubleValue());
            }
            Boolean bool3 = userSearchSettings.smartAvatar;
            if (bool3 != null) {
                codedOutputByteBufferNano.m17299A(14, bool3.booleanValue());
            }
            Boolean bool4 = userSearchSettings.allowSmartAvatarOpen;
            if (bool4 != null) {
                codedOutputByteBufferNano.m17299A(15, bool4.booleanValue());
            }
            Integer num8 = userSearchSettings.invisibleRadius;
            if (num8 != null) {
                codedOutputByteBufferNano.m17305G(16, num8.intValue());
            }
            List<Purpose> list2 = userSearchSettings.purpose;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(17, Purpose.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LookingFor lookingFor2 = userSearchSettings.lookingForGender;
            if (lookingFor2 != null) {
                codedOutputByteBufferNano.m17309K(18, lookingFor2, LookingFor.PROTOBUF_ADAPTER);
            }
            List<SearchPriority> list3 = userSearchSettings.priorities;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(19, list3, SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Purpose> list4 = userSearchSettings.purpose;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(20, list4, Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = userSearchSettings.friendPurpose;
            if (list5 != null) {
                codedOutputByteBufferNano.m17309K(21, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserSearchSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserSearchSettings>() { // from class: com.p1.mobile.putong.data.UserSearchSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserSearchSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserSearchSettings newInstance() {
            return new UserSearchSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(UserSearchSettings userSearchSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2021065568:
                    if (str.equals(ProfileLikeCategoryType.friendPurpose)) {
                        b = 0;
                    }
                    break;
                case -2014737328:
                    if (str.equals("autoAdjustRadius")) {
                        b = 1;
                    }
                    break;
                case -1618737488:
                    if (str.equals("intelligentAvatar")) {
                        b = 2;
                    }
                    break;
                case -1081167621:
                    if (str.equals("maxAge")) {
                        b = 3;
                    }
                    break;
                case -1074077363:
                    if (str.equals("minAge")) {
                        b = 4;
                    }
                    break;
                case -1023690185:
                    if (str.equals("ageAllowedMaximum")) {
                        b = 5;
                    }
                    break;
                case -1004533630:
                    if (str.equals("smartAvatar")) {
                        b = 6;
                    }
                    break;
                case -938578798:
                    if (str.equals(Constants.KEY_RADIUS)) {
                        b = 7;
                    }
                    break;
                case -837613753:
                    if (str.equals("lookingForGender")) {
                        b = 8;
                    }
                    break;
                case -803892187:
                    if (str.equals("ageAllowedMinimum")) {
                        b = 9;
                    }
                    break;
                case -220463842:
                    if (str.equals("purpose")) {
                        b = 10;
                    }
                    break;
                case -132955227:
                    if (str.equals("roamingLatitude")) {
                        b = 11;
                    }
                    break;
                case 451076767:
                    if (str.equals("invisibleRadius")) {
                        b = 12;
                    }
                    break;
                case 978350402:
                    if (str.equals("priorities")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 988842851:
                    if (str.equals("allowSmartAvatarOpen")) {
                        b = 14;
                    }
                    break;
                case 1692496010:
                    if (str.equals("radiusAllowedMaximum")) {
                        b = 15;
                    }
                    break;
                case 1912294008:
                    if (str.equals("radiusAllowedMinimum")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 2000378262:
                    if (str.equals("roamingLongitude")) {
                        b = 17;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    userSearchSettings.friendPurpose = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    userSearchSettings.autoAdjustRadius = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 2:
                    userSearchSettings.intelligentAvatar = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 3:
                    userSearchSettings.maxAge = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 4:
                    userSearchSettings.minAge = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 5:
                    userSearchSettings.ageAllowedMaximum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 6:
                    userSearchSettings.smartAvatar = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 7:
                    userSearchSettings.radius = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 8:
                    userSearchSettings.lookingForGender = LookingFor.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 9:
                    userSearchSettings.ageAllowedMinimum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 10:
                    userSearchSettings.purpose = JsonAdapter.parseArray(jsonParser, Purpose.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    userSearchSettings.roamingLatitude = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Double.valueOf(jsonParser.getValueAsDouble()) : null;
                    return true;
                case 12:
                    userSearchSettings.invisibleRadius = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 13:
                    userSearchSettings.priorities = JsonAdapter.parseArray(jsonParser, SearchPriority.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    userSearchSettings.allowSmartAvatarOpen = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 15:
                    userSearchSettings.radiusAllowedMaximum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 16:
                    userSearchSettings.radiusAllowedMinimum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 17:
                    userSearchSettings.roamingLongitude = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Double.valueOf(jsonParser.getValueAsDouble()) : null;
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(UserSearchSettings userSearchSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2021065568:
                    if (str.equals(ProfileLikeCategoryType.friendPurpose)) {
                        b = 0;
                    }
                    break;
                case -2014737328:
                    if (str.equals("autoAdjustRadius")) {
                        b = 1;
                    }
                    break;
                case -1618737488:
                    if (str.equals("intelligentAvatar")) {
                        b = 2;
                    }
                    break;
                case -1081167621:
                    if (str.equals("maxAge")) {
                        b = 3;
                    }
                    break;
                case -1074077363:
                    if (str.equals("minAge")) {
                        b = 4;
                    }
                    break;
                case -1023690185:
                    if (str.equals("ageAllowedMaximum")) {
                        b = 5;
                    }
                    break;
                case -1004533630:
                    if (str.equals("smartAvatar")) {
                        b = 6;
                    }
                    break;
                case -938578798:
                    if (str.equals(Constants.KEY_RADIUS)) {
                        b = 7;
                    }
                    break;
                case -837613753:
                    if (str.equals("lookingForGender")) {
                        b = 8;
                    }
                    break;
                case -803892187:
                    if (str.equals("ageAllowedMinimum")) {
                        b = 9;
                    }
                    break;
                case -220463842:
                    if (str.equals("purpose")) {
                        b = 10;
                    }
                    break;
                case -132955227:
                    if (str.equals("roamingLatitude")) {
                        b = 11;
                    }
                    break;
                case 451076767:
                    if (str.equals("invisibleRadius")) {
                        b = 12;
                    }
                    break;
                case 978350402:
                    if (str.equals("priorities")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 988842851:
                    if (str.equals("allowSmartAvatarOpen")) {
                        b = 14;
                    }
                    break;
                case 1692496010:
                    if (str.equals("radiusAllowedMaximum")) {
                        b = 15;
                    }
                    break;
                case 1912294008:
                    if (str.equals("radiusAllowedMinimum")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 2000378262:
                    if (str.equals("roamingLongitude")) {
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
                    return super.parseFieldCheck(userSearchSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserSearchSettings userSearchSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userSearchSettings.autoAdjustRadius;
            if (bool != null) {
                jsonGenerator.writeBooleanField("autoAdjustRadius", bool.booleanValue());
            }
            Boolean bool2 = userSearchSettings.intelligentAvatar;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("intelligentAvatar", bool2.booleanValue());
            }
            if (userSearchSettings.lookingForGender != null) {
                jsonGenerator.writeFieldName("lookingForGender");
                LookingFor.JSON_ADAPTER.serialize(userSearchSettings.lookingForGender, jsonGenerator, true);
            }
            Integer num = userSearchSettings.maxAge;
            if (num != null) {
                jsonGenerator.writeNumberField("maxAge", num.intValue());
            }
            Integer num2 = userSearchSettings.minAge;
            if (num2 != null) {
                jsonGenerator.writeNumberField("minAge", num2.intValue());
            }
            Integer num3 = userSearchSettings.ageAllowedMinimum;
            if (num3 != null) {
                jsonGenerator.writeNumberField("ageAllowedMinimum", num3.intValue());
            }
            Integer num4 = userSearchSettings.ageAllowedMaximum;
            if (num4 != null) {
                jsonGenerator.writeNumberField("ageAllowedMaximum", num4.intValue());
            }
            if (userSearchSettings.priorities != null) {
                jsonGenerator.writeFieldName("priorities");
                JsonAdapter.serializeArray(userSearchSettings.priorities, jsonGenerator, SearchPriority.JSON_ADAPTER);
            }
            Integer num5 = userSearchSettings.radius;
            if (num5 != null) {
                jsonGenerator.writeNumberField(Constants.KEY_RADIUS, num5.intValue());
            }
            Integer num6 = userSearchSettings.radiusAllowedMinimum;
            if (num6 != null) {
                jsonGenerator.writeNumberField("radiusAllowedMinimum", num6.intValue());
            }
            Integer num7 = userSearchSettings.radiusAllowedMaximum;
            if (num7 != null) {
                jsonGenerator.writeNumberField("radiusAllowedMaximum", num7.intValue());
            }
            Double d = userSearchSettings.roamingLatitude;
            if (d != null) {
                jsonGenerator.writeNumberField("roamingLatitude", d.doubleValue());
            }
            Double d2 = userSearchSettings.roamingLongitude;
            if (d2 != null) {
                jsonGenerator.writeNumberField("roamingLongitude", d2.doubleValue());
            }
            Boolean bool3 = userSearchSettings.smartAvatar;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField("smartAvatar", bool3.booleanValue());
            }
            Boolean bool4 = userSearchSettings.allowSmartAvatarOpen;
            if (bool4 != null) {
                jsonGenerator.writeBooleanField("allowSmartAvatarOpen", bool4.booleanValue());
            }
            Integer num8 = userSearchSettings.invisibleRadius;
            if (num8 != null) {
                jsonGenerator.writeNumberField("invisibleRadius", num8.intValue());
            }
            if (userSearchSettings.purpose != null) {
                jsonGenerator.writeFieldName("purpose");
                JsonAdapter.serializeArray(userSearchSettings.purpose, jsonGenerator, Purpose.JSON_ADAPTER);
            }
            if (userSearchSettings.friendPurpose != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.friendPurpose);
                JsonAdapter.serializeArray(userSearchSettings.friendPurpose, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSearchSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSearchSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61318a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SearchPriority m61319b(SearchPriority searchPriority) {
        return searchPriority;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Purpose m61320c(Purpose purpose) {
        return purpose;
    }

    public static UserSearchSettings new_() {
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        userSearchSettings.nullCheck();
        return userSearchSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserSearchSettings mo225055clone() {
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        userSearchSettings.autoAdjustRadius = this.autoAdjustRadius;
        userSearchSettings.intelligentAvatar = this.intelligentAvatar;
        userSearchSettings.lookingForGender = this.lookingForGender;
        userSearchSettings.maxAge = this.maxAge;
        userSearchSettings.minAge = this.minAge;
        userSearchSettings.ageAllowedMinimum = this.ageAllowedMinimum;
        userSearchSettings.ageAllowedMaximum = this.ageAllowedMaximum;
        List<SearchPriority> list = this.priorities;
        if (list != null) {
            userSearchSettings.priorities = ValueObject.util_map(list, new qcj() { // from class: l.hik0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserSearchSettings.m61319b((SearchPriority) obj);
                }
            });
        }
        userSearchSettings.radius = this.radius;
        userSearchSettings.radiusAllowedMinimum = this.radiusAllowedMinimum;
        userSearchSettings.radiusAllowedMaximum = this.radiusAllowedMaximum;
        userSearchSettings.roamingLatitude = this.roamingLatitude;
        userSearchSettings.roamingLongitude = this.roamingLongitude;
        userSearchSettings.smartAvatar = this.smartAvatar;
        userSearchSettings.allowSmartAvatarOpen = this.allowSmartAvatarOpen;
        userSearchSettings.invisibleRadius = this.invisibleRadius;
        List<Purpose> list2 = this.purpose;
        if (list2 != null) {
            userSearchSettings.purpose = ValueObject.util_map(list2, new qcj() { // from class: l.iik0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserSearchSettings.m61320c((Purpose) obj);
                }
            });
        }
        List<String> list3 = this.friendPurpose;
        if (list3 != null) {
            userSearchSettings.friendPurpose = ValueObject.util_map(list3, new qcj() { // from class: l.jik0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserSearchSettings.m61318a((String) obj);
                }
            });
        }
        return userSearchSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserSearchSettings)) {
            return false;
        }
        UserSearchSettings userSearchSettings = (UserSearchSettings) obj;
        return ValueObject.util_equals(this.autoAdjustRadius, userSearchSettings.autoAdjustRadius) && ValueObject.util_equals(this.intelligentAvatar, userSearchSettings.intelligentAvatar) && ValueObject.util_equals(this.lookingForGender, userSearchSettings.lookingForGender) && ValueObject.util_equals(this.maxAge, userSearchSettings.maxAge) && ValueObject.util_equals(this.minAge, userSearchSettings.minAge) && ValueObject.util_equals(this.ageAllowedMinimum, userSearchSettings.ageAllowedMinimum) && ValueObject.util_equals(this.ageAllowedMaximum, userSearchSettings.ageAllowedMaximum) && ValueObject.util_equals(this.priorities, userSearchSettings.priorities) && ValueObject.util_equals(this.radius, userSearchSettings.radius) && ValueObject.util_equals(this.radiusAllowedMinimum, userSearchSettings.radiusAllowedMinimum) && ValueObject.util_equals(this.radiusAllowedMaximum, userSearchSettings.radiusAllowedMaximum) && ValueObject.util_equals(this.roamingLatitude, userSearchSettings.roamingLatitude) && ValueObject.util_equals(this.roamingLongitude, userSearchSettings.roamingLongitude) && ValueObject.util_equals(this.smartAvatar, userSearchSettings.smartAvatar) && ValueObject.util_equals(this.allowSmartAvatarOpen, userSearchSettings.allowSmartAvatarOpen) && ValueObject.util_equals(this.invisibleRadius, userSearchSettings.invisibleRadius) && ValueObject.util_equals(this.purpose, userSearchSettings.purpose) && ValueObject.util_equals(this.friendPurpose, userSearchSettings.friendPurpose);
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
        Boolean bool = this.autoAdjustRadius;
        int iHashCode = (i2 + (bool != null ? bool.hashCode() : 0)) * 41;
        Boolean bool2 = this.intelligentAvatar;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        LookingFor lookingFor = this.lookingForGender;
        int iHashCode3 = (iHashCode2 + (lookingFor != null ? lookingFor.hashCode() : 0)) * 41;
        Integer num = this.maxAge;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 41;
        Integer num2 = this.minAge;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 41;
        Integer num3 = this.ageAllowedMinimum;
        int iHashCode6 = (iHashCode5 + (num3 != null ? num3.hashCode() : 0)) * 41;
        Integer num4 = this.ageAllowedMaximum;
        int iHashCode7 = (iHashCode6 + (num4 != null ? num4.hashCode() : 0)) * 41;
        List<SearchPriority> list = this.priorities;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        Integer num5 = this.radius;
        int iHashCode9 = (iHashCode8 + (num5 != null ? num5.hashCode() : 0)) * 41;
        Integer num6 = this.radiusAllowedMinimum;
        int iHashCode10 = (iHashCode9 + (num6 != null ? num6.hashCode() : 0)) * 41;
        Integer num7 = this.radiusAllowedMaximum;
        int iHashCode11 = (iHashCode10 + (num7 != null ? num7.hashCode() : 0)) * 41;
        Double d = this.roamingLatitude;
        int iHashCode12 = (iHashCode11 + (d != null ? d.hashCode() : 0)) * 41;
        Double d2 = this.roamingLongitude;
        int iHashCode13 = (iHashCode12 + (d2 != null ? d2.hashCode() : 0)) * 41;
        Boolean bool3 = this.smartAvatar;
        int iHashCode14 = (iHashCode13 + (bool3 != null ? bool3.hashCode() : 0)) * 41;
        Boolean bool4 = this.allowSmartAvatarOpen;
        int iHashCode15 = (iHashCode14 + (bool4 != null ? bool4.hashCode() : 0)) * 41;
        Integer num8 = this.invisibleRadius;
        int iHashCode16 = (iHashCode15 + (num8 != null ? num8.hashCode() : 0)) * 41;
        List<Purpose> list2 = this.purpose;
        int iHashCode17 = (iHashCode16 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.friendPurpose;
        int iHashCode18 = iHashCode17 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode18;
        return iHashCode18;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(UserSearchSettings userSearchSettings) {
        if (!shouldMergeData() || equals(userSearchSettings)) {
            return;
        }
        if (!isFieldParsed("autoAdjustRadius")) {
            this.autoAdjustRadius = userSearchSettings.autoAdjustRadius;
        }
        if (!isFieldParsed("intelligentAvatar")) {
            this.intelligentAvatar = userSearchSettings.intelligentAvatar;
        }
        if (!isFieldParsed("lookingForGender")) {
            this.lookingForGender = userSearchSettings.lookingForGender;
        }
        if (!isFieldParsed("maxAge")) {
            this.maxAge = userSearchSettings.maxAge;
        }
        if (!isFieldParsed("minAge")) {
            this.minAge = userSearchSettings.minAge;
        }
        if (!isFieldParsed("ageAllowedMinimum")) {
            this.ageAllowedMinimum = userSearchSettings.ageAllowedMinimum;
        }
        if (!isFieldParsed("ageAllowedMaximum")) {
            this.ageAllowedMaximum = userSearchSettings.ageAllowedMaximum;
        }
        if (!isFieldParsed("priorities")) {
            this.priorities = userSearchSettings.priorities;
        }
        if (!isFieldParsed(Constants.KEY_RADIUS)) {
            this.radius = userSearchSettings.radius;
        }
        if (!isFieldParsed("radiusAllowedMinimum")) {
            this.radiusAllowedMinimum = userSearchSettings.radiusAllowedMinimum;
        }
        if (!isFieldParsed("radiusAllowedMaximum")) {
            this.radiusAllowedMaximum = userSearchSettings.radiusAllowedMaximum;
        }
        if (!isFieldParsed("roamingLatitude")) {
            this.roamingLatitude = userSearchSettings.roamingLatitude;
        }
        if (!isFieldParsed("roamingLongitude")) {
            this.roamingLongitude = userSearchSettings.roamingLongitude;
        }
        if (!isFieldParsed("smartAvatar")) {
            this.smartAvatar = userSearchSettings.smartAvatar;
        }
        if (!isFieldParsed("allowSmartAvatarOpen")) {
            this.allowSmartAvatarOpen = userSearchSettings.allowSmartAvatarOpen;
        }
        if (!isFieldParsed("invisibleRadius")) {
            this.invisibleRadius = userSearchSettings.invisibleRadius;
        }
        if (!isFieldParsed("purpose")) {
            this.purpose = userSearchSettings.purpose;
        }
        if (!isFieldParsed(ProfileLikeCategoryType.friendPurpose)) {
            this.friendPurpose = userSearchSettings.friendPurpose;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        if (this.autoAdjustRadius == null) {
            this.autoAdjustRadius = Boolean.FALSE;
        }
        if (this.intelligentAvatar == null) {
            this.intelligentAvatar = Boolean.FALSE;
        }
        if (this.lookingForGender == null) {
            this.lookingForGender = (LookingFor) LookingFor.JSON_ADAPTER.defaultEnum();
        }
        if (this.maxAge == null) {
            this.maxAge = 0;
        }
        if (this.minAge == null) {
            this.minAge = 0;
        }
        if (this.ageAllowedMinimum == null) {
            this.ageAllowedMinimum = 0;
        }
        if (this.ageAllowedMaximum == null) {
            this.ageAllowedMaximum = 0;
        }
        if (this.priorities == null) {
            this.priorities = new ArrayList();
        }
        if (this.radius == null) {
            this.radius = 0;
        }
        if (this.radiusAllowedMinimum == null) {
            this.radiusAllowedMinimum = 0;
        }
        if (this.radiusAllowedMaximum == null) {
            this.radiusAllowedMaximum = 0;
        }
        if (this.roamingLatitude == null) {
            this.roamingLatitude = dValueOf;
        }
        if (this.roamingLongitude == null) {
            this.roamingLongitude = dValueOf;
        }
        if (this.smartAvatar == null) {
            this.smartAvatar = Boolean.FALSE;
        }
        if (this.invisibleRadius == null) {
            this.invisibleRadius = 0;
        }
        if (this.purpose == null) {
            this.purpose = new ArrayList();
        }
        if (this.friendPurpose == null) {
            this.friendPurpose = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public UserSearchSettings subtract(UserSearchSettings userSearchSettings) {
        UserSearchSettings userSearchSettings2 = new UserSearchSettings();
        if (!ValueObject.util_equals(this.autoAdjustRadius, userSearchSettings.autoAdjustRadius)) {
            userSearchSettings2.autoAdjustRadius = this.autoAdjustRadius;
        }
        if (!ValueObject.util_equals(this.intelligentAvatar, userSearchSettings.intelligentAvatar)) {
            userSearchSettings2.intelligentAvatar = this.intelligentAvatar;
        }
        if (!ValueObject.util_equals(this.lookingForGender, userSearchSettings.lookingForGender)) {
            userSearchSettings2.lookingForGender = this.lookingForGender;
        }
        if (!ValueObject.util_equals(this.maxAge, userSearchSettings.maxAge)) {
            userSearchSettings2.maxAge = this.maxAge;
        }
        if (!ValueObject.util_equals(this.minAge, userSearchSettings.minAge)) {
            userSearchSettings2.minAge = this.minAge;
        }
        if (!ValueObject.util_equals(this.priorities, userSearchSettings.priorities)) {
            userSearchSettings2.priorities = this.priorities;
        }
        if (!ValueObject.util_equals(this.radius, userSearchSettings.radius)) {
            userSearchSettings2.radius = this.radius;
        }
        if (!ValueObject.util_equals(this.roamingLatitude, userSearchSettings.roamingLatitude)) {
            userSearchSettings2.roamingLatitude = this.roamingLatitude;
        }
        if (!ValueObject.util_equals(this.roamingLongitude, userSearchSettings.roamingLongitude)) {
            userSearchSettings2.roamingLongitude = this.roamingLongitude;
        }
        if (!ValueObject.util_equals(this.smartAvatar, userSearchSettings.smartAvatar)) {
            userSearchSettings2.smartAvatar = this.smartAvatar;
        }
        if (!ValueObject.util_equals(this.allowSmartAvatarOpen, userSearchSettings.allowSmartAvatarOpen)) {
            userSearchSettings2.allowSmartAvatarOpen = this.allowSmartAvatarOpen;
        }
        if (!ValueObject.util_equals(this.invisibleRadius, userSearchSettings.invisibleRadius)) {
            userSearchSettings2.invisibleRadius = this.invisibleRadius;
        }
        if (!ValueObject.util_equals(this.purpose, userSearchSettings.purpose)) {
            userSearchSettings2.purpose = this.purpose;
        }
        if (!ValueObject.util_equals(this.friendPurpose, userSearchSettings.friendPurpose)) {
            userSearchSettings2.friendPurpose = this.friendPurpose;
        }
        if (userSearchSettings2.equals(new UserSearchSettings())) {
            return null;
        }
        return userSearchSettings2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
