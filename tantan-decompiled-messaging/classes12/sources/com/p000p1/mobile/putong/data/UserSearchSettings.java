package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Purpose;
import com.p000p1.mobile.putong.data.SearchPriority;
import com.p000p1.mobile.putong.data.UserSearchSettings;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserSearchSettings userSearchSettings) {
            Boolean bool = userSearchSettings.autoAdjustRadius;
            int iB = bool != null ? CodedOutputByteBufferNano.b(1, bool.booleanValue()) : 0;
            Boolean bool2 = userSearchSettings.intelligentAvatar;
            if (bool2 != null) {
                iB += CodedOutputByteBufferNano.b(2, bool2.booleanValue());
            }
            LookingFor lookingFor = userSearchSettings.lookingForGender;
            if (lookingFor != null) {
                iB += CodedOutputByteBufferNano.h(3, lookingFor.ordinal());
            }
            Integer num = userSearchSettings.maxAge;
            if (num != null) {
                iB += CodedOutputByteBufferNano.h(4, num.intValue());
            }
            Integer num2 = userSearchSettings.minAge;
            if (num2 != null) {
                iB += CodedOutputByteBufferNano.h(5, num2.intValue());
            }
            Integer num3 = userSearchSettings.ageAllowedMinimum;
            if (num3 != null) {
                iB += CodedOutputByteBufferNano.h(6, num3.intValue());
            }
            Integer num4 = userSearchSettings.ageAllowedMaximum;
            if (num4 != null) {
                iB += CodedOutputByteBufferNano.h(7, num4.intValue());
            }
            List<SearchPriority> list = userSearchSettings.priorities;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(8, SearchPriority.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Integer num5 = userSearchSettings.radius;
            if (num5 != null) {
                iB += CodedOutputByteBufferNano.h(9, num5.intValue());
            }
            Integer num6 = userSearchSettings.radiusAllowedMinimum;
            if (num6 != null) {
                iB += CodedOutputByteBufferNano.h(10, num6.intValue());
            }
            Integer num7 = userSearchSettings.radiusAllowedMaximum;
            if (num7 != null) {
                iB += CodedOutputByteBufferNano.h(11, num7.intValue());
            }
            Double d = userSearchSettings.roamingLatitude;
            if (d != null) {
                iB += CodedOutputByteBufferNano.d(12, d.doubleValue());
            }
            Double d2 = userSearchSettings.roamingLongitude;
            if (d2 != null) {
                iB += CodedOutputByteBufferNano.d(13, d2.doubleValue());
            }
            Boolean bool3 = userSearchSettings.smartAvatar;
            if (bool3 != null) {
                iB += CodedOutputByteBufferNano.b(14, bool3.booleanValue());
            }
            Boolean bool4 = userSearchSettings.allowSmartAvatarOpen;
            if (bool4 != null) {
                iB += CodedOutputByteBufferNano.b(15, bool4.booleanValue());
            }
            Integer num8 = userSearchSettings.invisibleRadius;
            if (num8 != null) {
                iB += CodedOutputByteBufferNano.h(16, num8.intValue());
            }
            List<Purpose> list2 = userSearchSettings.purpose;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(17, Purpose.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LookingFor lookingFor2 = userSearchSettings.lookingForGender;
            if (lookingFor2 != null) {
                iB += CodedOutputByteBufferNano.l(18, lookingFor2, LookingFor.PROTOBUF_ADAPTER);
            }
            List<SearchPriority> list3 = userSearchSettings.priorities;
            if (list3 != null) {
                iB += CodedOutputByteBufferNano.l(19, list3, SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Purpose> list4 = userSearchSettings.purpose;
            if (list4 != null) {
                iB += CodedOutputByteBufferNano.l(20, list4, Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = userSearchSettings.friendPurpose;
            if (list5 != null) {
                iB += CodedOutputByteBufferNano.l(21, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) userSearchSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserSearchSettings m19220parse(nb5 nb5Var) throws IOException {
            Double dValueOf = Double.valueOf(0.0d);
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            Integer numValueOf = null;
            List list = null;
            List list2 = null;
            while (true) {
                switch (nb5Var.u()) {
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
                        userSearchSettings.autoAdjustRadius = Boolean.valueOf(nb5Var.g());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        userSearchSettings.intelligentAvatar = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 24:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        userSearchSettings.maxAge = Integer.valueOf(nb5Var.j());
                        continue;
                    case 40:
                        userSearchSettings.minAge = Integer.valueOf(nb5Var.j());
                        continue;
                    case 48:
                        userSearchSettings.ageAllowedMinimum = Integer.valueOf(nb5Var.j());
                        continue;
                    case 56:
                        userSearchSettings.ageAllowedMaximum = Integer.valueOf(nb5Var.j());
                        continue;
                    case 66:
                        list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 72:
                        userSearchSettings.radius = Integer.valueOf(nb5Var.j());
                        continue;
                    case 80:
                        userSearchSettings.radiusAllowedMinimum = Integer.valueOf(nb5Var.j());
                        continue;
                    case 88:
                        userSearchSettings.radiusAllowedMaximum = Integer.valueOf(nb5Var.j());
                        continue;
                    case 97:
                        userSearchSettings.roamingLatitude = Double.valueOf(nb5Var.h());
                        continue;
                    case 105:
                        userSearchSettings.roamingLongitude = Double.valueOf(nb5Var.h());
                        continue;
                    case 112:
                        userSearchSettings.smartAvatar = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 120:
                        userSearchSettings.allowSmartAvatarOpen = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 128:
                        userSearchSettings.invisibleRadius = Integer.valueOf(nb5Var.j());
                        continue;
                    case 138:
                        list2 = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 146:
                        userSearchSettings.lookingForGender = (LookingFor) nb5Var.l(LookingFor.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        userSearchSettings.priorities = (List) nb5Var.l(SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 162:
                        userSearchSettings.purpose = (List) nb5Var.l(Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 170:
                        userSearchSettings.friendPurpose = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
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

        public void serialize(UserSearchSettings userSearchSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userSearchSettings.autoAdjustRadius;
            if (bool != null) {
                codedOutputByteBufferNano.A(1, bool.booleanValue());
            }
            Boolean bool2 = userSearchSettings.intelligentAvatar;
            if (bool2 != null) {
                codedOutputByteBufferNano.A(2, bool2.booleanValue());
            }
            LookingFor lookingFor = userSearchSettings.lookingForGender;
            if (lookingFor != null) {
                codedOutputByteBufferNano.G(3, lookingFor.ordinal());
            }
            Integer num = userSearchSettings.maxAge;
            if (num != null) {
                codedOutputByteBufferNano.G(4, num.intValue());
            }
            Integer num2 = userSearchSettings.minAge;
            if (num2 != null) {
                codedOutputByteBufferNano.G(5, num2.intValue());
            }
            Integer num3 = userSearchSettings.ageAllowedMinimum;
            if (num3 != null) {
                codedOutputByteBufferNano.G(6, num3.intValue());
            }
            Integer num4 = userSearchSettings.ageAllowedMaximum;
            if (num4 != null) {
                codedOutputByteBufferNano.G(7, num4.intValue());
            }
            List<SearchPriority> list = userSearchSettings.priorities;
            if (list != null) {
                codedOutputByteBufferNano.K(8, SearchPriority.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Integer num5 = userSearchSettings.radius;
            if (num5 != null) {
                codedOutputByteBufferNano.G(9, num5.intValue());
            }
            Integer num6 = userSearchSettings.radiusAllowedMinimum;
            if (num6 != null) {
                codedOutputByteBufferNano.G(10, num6.intValue());
            }
            Integer num7 = userSearchSettings.radiusAllowedMaximum;
            if (num7 != null) {
                codedOutputByteBufferNano.G(11, num7.intValue());
            }
            Double d = userSearchSettings.roamingLatitude;
            if (d != null) {
                codedOutputByteBufferNano.C(12, d.doubleValue());
            }
            Double d2 = userSearchSettings.roamingLongitude;
            if (d2 != null) {
                codedOutputByteBufferNano.C(13, d2.doubleValue());
            }
            Boolean bool3 = userSearchSettings.smartAvatar;
            if (bool3 != null) {
                codedOutputByteBufferNano.A(14, bool3.booleanValue());
            }
            Boolean bool4 = userSearchSettings.allowSmartAvatarOpen;
            if (bool4 != null) {
                codedOutputByteBufferNano.A(15, bool4.booleanValue());
            }
            Integer num8 = userSearchSettings.invisibleRadius;
            if (num8 != null) {
                codedOutputByteBufferNano.G(16, num8.intValue());
            }
            List<Purpose> list2 = userSearchSettings.purpose;
            if (list2 != null) {
                codedOutputByteBufferNano.K(17, Purpose.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LookingFor lookingFor2 = userSearchSettings.lookingForGender;
            if (lookingFor2 != null) {
                codedOutputByteBufferNano.K(18, lookingFor2, LookingFor.PROTOBUF_ADAPTER);
            }
            List<SearchPriority> list3 = userSearchSettings.priorities;
            if (list3 != null) {
                codedOutputByteBufferNano.K(19, list3, SearchPriority.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Purpose> list4 = userSearchSettings.purpose;
            if (list4 != null) {
                codedOutputByteBufferNano.K(20, list4, Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = userSearchSettings.friendPurpose;
            if (list5 != null) {
                codedOutputByteBufferNano.K(21, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserSearchSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserSearchSettings>() { // from class: com.p1.mobile.putong.data.UserSearchSettings.2
        public Class getDataClass() {
            return UserSearchSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserSearchSettings mo17830newInstance() {
            return new UserSearchSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(UserSearchSettings userSearchSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2021065568:
                    if (str.equals("friendPurpose")) {
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
                    if (str.equals("radius")) {
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
                        b = 13;
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
                        b = 16;
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
                    userSearchSettings.lookingForGender = (LookingFor) LookingFor.JSON_ADAPTER.parse(jsonParser, str2);
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
                case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                    userSearchSettings.radiusAllowedMinimum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 17:
                    userSearchSettings.roamingLongitude = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Double.valueOf(jsonParser.getValueAsDouble()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserSearchSettings userSearchSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "friendPurpose":
                case "autoAdjustRadius":
                case "intelligentAvatar":
                case "maxAge":
                case "minAge":
                case "ageAllowedMaximum":
                case "smartAvatar":
                case "radius":
                case "lookingForGender":
                case "ageAllowedMinimum":
                case "purpose":
                case "roamingLatitude":
                case "invisibleRadius":
                case "priorities":
                case "allowSmartAvatarOpen":
                case "radiusAllowedMaximum":
                case "radiusAllowedMinimum":
                case "roamingLongitude":
                    return true;
                default:
                    return super.parseFieldCheck(userSearchSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeNumberField("radius", num5.intValue());
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
                jsonGenerator.writeFieldName("friendPurpose");
                JsonAdapter.serializeArray(userSearchSettings.friendPurpose, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSearchSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSearchSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1052a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SearchPriority m1053b(SearchPriority searchPriority) {
        return searchPriority;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Purpose m1054c(Purpose purpose) {
        return purpose;
    }

    public static UserSearchSettings new_() {
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        userSearchSettings.nullCheck();
        return userSearchSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserSearchSettings m19219clone() {
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
            userSearchSettings.priorities = ValueObject.util_map(list, new w9j() { // from class: l.b9k0
                public final Object call(Object obj) {
                    return UserSearchSettings.m1053b((SearchPriority) obj);
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
            userSearchSettings.purpose = ValueObject.util_map(list2, new w9j() { // from class: l.c9k0
                public final Object call(Object obj) {
                    return UserSearchSettings.m1054c((Purpose) obj);
                }
            });
        }
        List<String> list3 = this.friendPurpose;
        if (list3 != null) {
            userSearchSettings.friendPurpose = ValueObject.util_map(list3, new w9j() { // from class: l.d9k0
                public final Object call(Object obj) {
                    return UserSearchSettings.m1052a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode18;
        return iHashCode18;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

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
        if (!isFieldParsed("radius")) {
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
        if (!isFieldParsed("friendPurpose")) {
            this.friendPurpose = userSearchSettings.friendPurpose;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        Double dValueOf = Double.valueOf(0.0d);
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
