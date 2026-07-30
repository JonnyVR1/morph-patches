package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AdvancedSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "advancedsettings";

    @NonNull
    @ProtobufIndex(index = 4)
    public Boolean active;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public List<BloodType> bloodType;

    @NonNull
    @ProtobufIndex(index = 9)
    public Boolean filterReportUser;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f4id;

    @NonNull
    @ProtobufIndex(index = 13)
    public String intlFriendPurpose;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public Boolean newUser;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Boolean online;

    @NonNull
    @ProtobufIndex(index = 6)
    public Boolean popular;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Boolean realFace;

    @NonNull
    @ProtobufIndex(index = 8)
    public Boolean student;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<ProfileZodiac> zodiacs;
    public static ProtobufAdapter<AdvancedSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdvancedSettings>() { // from class: com.p1.mobile.putong.core.data.AdvancedSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdvancedSettings advancedSettings) {
            String str = advancedSettings.f4id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Boolean bool = advancedSettings.online;
            if (bool != null) {
                iO += CodedOutputByteBufferNano.b(2, bool.booleanValue());
            }
            Boolean bool2 = advancedSettings.realFace;
            if (bool2 != null) {
                iO += CodedOutputByteBufferNano.b(3, bool2.booleanValue());
            }
            Boolean bool3 = advancedSettings.active;
            if (bool3 != null) {
                iO += CodedOutputByteBufferNano.b(4, bool3.booleanValue());
            }
            Boolean bool4 = advancedSettings.newUser;
            if (bool4 != null) {
                iO += CodedOutputByteBufferNano.b(5, bool4.booleanValue());
            }
            Boolean bool5 = advancedSettings.popular;
            if (bool5 != null) {
                iO += CodedOutputByteBufferNano.b(6, bool5.booleanValue());
            }
            List<ProfileZodiac> list = advancedSettings.zodiacs;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(7, ProfileZodiac.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool6 = advancedSettings.student;
            if (bool6 != null) {
                iO += CodedOutputByteBufferNano.b(8, bool6.booleanValue());
            }
            Boolean bool7 = advancedSettings.filterReportUser;
            if (bool7 != null) {
                iO += CodedOutputByteBufferNano.b(9, bool7.booleanValue());
            }
            List<BloodType> list2 = advancedSettings.bloodType;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(10, BloodType.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileZodiac> list3 = advancedSettings.zodiacs;
            if (list3 != null) {
                iO += CodedOutputByteBufferNano.l(11, list3, ProfileZodiac.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BloodType> list4 = advancedSettings.bloodType;
            if (list4 != null) {
                iO += CodedOutputByteBufferNano.l(12, list4, BloodType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = advancedSettings.intlFriendPurpose;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(13, str2);
            }
            ((MessageNano) advancedSettings).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdvancedSettings m11545parse(nb5 nb5Var) throws IOException {
            AdvancedSettings advancedSettings = new AdvancedSettings();
            List list = null;
            List list2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (advancedSettings.zodiacs == null && list != null) {
                            advancedSettings.zodiacs = ProfileZodiac.oldEnumCovertList(list);
                        }
                        if (advancedSettings.bloodType == null && list2 != null) {
                            advancedSettings.bloodType = BloodType.oldEnumCovertList(list2);
                        }
                        if (advancedSettings.f4id == null) {
                            advancedSettings.f4id = "";
                        }
                        if (advancedSettings.online == null) {
                            advancedSettings.online = Boolean.FALSE;
                        }
                        if (advancedSettings.realFace == null) {
                            advancedSettings.realFace = Boolean.FALSE;
                        }
                        if (advancedSettings.active == null) {
                            advancedSettings.active = Boolean.FALSE;
                        }
                        if (advancedSettings.newUser == null) {
                            advancedSettings.newUser = Boolean.FALSE;
                        }
                        if (advancedSettings.popular == null) {
                            advancedSettings.popular = Boolean.FALSE;
                        }
                        if (advancedSettings.zodiacs == null) {
                            advancedSettings.zodiacs = new ArrayList();
                        }
                        if (advancedSettings.student == null) {
                            advancedSettings.student = Boolean.FALSE;
                        }
                        if (advancedSettings.filterReportUser == null) {
                            advancedSettings.filterReportUser = Boolean.FALSE;
                        }
                        if (advancedSettings.bloodType == null) {
                            advancedSettings.bloodType = new ArrayList();
                        }
                        if (advancedSettings.intlFriendPurpose == null) {
                            advancedSettings.intlFriendPurpose = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        advancedSettings.f4id = nb5Var.s();
                        continue;
                    case 16:
                        advancedSettings.online = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 24:
                        advancedSettings.realFace = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 32:
                        advancedSettings.active = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 40:
                        advancedSettings.newUser = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 48:
                        advancedSettings.popular = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 58:
                        list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 64:
                        advancedSettings.student = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 72:
                        advancedSettings.filterReportUser = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 82:
                        list2 = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        advancedSettings.zodiacs = (List) nb5Var.l(ProfileZodiac.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        advancedSettings.bloodType = (List) nb5Var.l(BloodType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        advancedSettings.intlFriendPurpose = nb5Var.s();
                        continue;
                    default:
                        if (advancedSettings.zodiacs == null && list != null) {
                            advancedSettings.zodiacs = ProfileZodiac.oldEnumCovertList(list);
                        }
                        if (advancedSettings.bloodType == null && list2 != null) {
                            advancedSettings.bloodType = BloodType.oldEnumCovertList(list2);
                        }
                        if (advancedSettings.f4id == null) {
                            advancedSettings.f4id = "";
                        }
                        if (advancedSettings.online == null) {
                            advancedSettings.online = Boolean.FALSE;
                        }
                        if (advancedSettings.realFace == null) {
                            advancedSettings.realFace = Boolean.FALSE;
                        }
                        if (advancedSettings.active == null) {
                            advancedSettings.active = Boolean.FALSE;
                        }
                        if (advancedSettings.newUser == null) {
                            advancedSettings.newUser = Boolean.FALSE;
                        }
                        if (advancedSettings.popular == null) {
                            advancedSettings.popular = Boolean.FALSE;
                        }
                        if (advancedSettings.zodiacs == null) {
                            advancedSettings.zodiacs = new ArrayList();
                        }
                        if (advancedSettings.student == null) {
                            advancedSettings.student = Boolean.FALSE;
                        }
                        if (advancedSettings.filterReportUser == null) {
                            advancedSettings.filterReportUser = Boolean.FALSE;
                        }
                        if (advancedSettings.bloodType == null) {
                            advancedSettings.bloodType = new ArrayList();
                        }
                        if (advancedSettings.intlFriendPurpose == null) {
                            advancedSettings.intlFriendPurpose = "";
                            return advancedSettings;
                        }
                        break;
                }
            }
            return advancedSettings;
        }

        public void serialize(AdvancedSettings advancedSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = advancedSettings.f4id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Boolean bool = advancedSettings.online;
            if (bool != null) {
                codedOutputByteBufferNano.A(2, bool.booleanValue());
            }
            Boolean bool2 = advancedSettings.realFace;
            if (bool2 != null) {
                codedOutputByteBufferNano.A(3, bool2.booleanValue());
            }
            Boolean bool3 = advancedSettings.active;
            if (bool3 != null) {
                codedOutputByteBufferNano.A(4, bool3.booleanValue());
            }
            Boolean bool4 = advancedSettings.newUser;
            if (bool4 != null) {
                codedOutputByteBufferNano.A(5, bool4.booleanValue());
            }
            Boolean bool5 = advancedSettings.popular;
            if (bool5 != null) {
                codedOutputByteBufferNano.A(6, bool5.booleanValue());
            }
            List<ProfileZodiac> list = advancedSettings.zodiacs;
            if (list != null) {
                codedOutputByteBufferNano.K(7, ProfileZodiac.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool6 = advancedSettings.student;
            if (bool6 != null) {
                codedOutputByteBufferNano.A(8, bool6.booleanValue());
            }
            Boolean bool7 = advancedSettings.filterReportUser;
            if (bool7 != null) {
                codedOutputByteBufferNano.A(9, bool7.booleanValue());
            }
            List<BloodType> list2 = advancedSettings.bloodType;
            if (list2 != null) {
                codedOutputByteBufferNano.K(10, BloodType.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileZodiac> list3 = advancedSettings.zodiacs;
            if (list3 != null) {
                codedOutputByteBufferNano.K(11, list3, ProfileZodiac.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BloodType> list4 = advancedSettings.bloodType;
            if (list4 != null) {
                codedOutputByteBufferNano.K(12, list4, BloodType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = advancedSettings.intlFriendPurpose;
            if (str2 != null) {
                codedOutputByteBufferNano.R(13, str2);
            }
        }
    };
    public static JsonAdapter<AdvancedSettings> JSON_ADAPTER = new ObjectJsonAdapter<AdvancedSettings>() { // from class: com.p1.mobile.putong.core.data.AdvancedSettings.2
        public Class getDataClass() {
            return AdvancedSettings.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AdvancedSettings m11546newInstance() {
            return new AdvancedSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(AdvancedSettings advancedSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1879145925:
                    if (str.equals("student")) {
                        b = 0;
                    }
                    break;
                case -1422950650:
                    if (str.equals(Active.TYPE)) {
                        b = 1;
                    }
                    break;
                case -1166097085:
                    if (str.equals("intlFriendPurpose")) {
                        b = 2;
                    }
                    break;
                case -1012222381:
                    if (str.equals("online")) {
                        b = 3;
                    }
                    break;
                case -860112247:
                    if (str.equals(VisitorSortType.realUser)) {
                        b = 4;
                    }
                    break;
                case -393940263:
                    if (str.equals("popular")) {
                        b = 5;
                    }
                    break;
                case -120288297:
                    if (str.equals("zodiacs")) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 1209547860:
                    if (str.equals("bloodType")) {
                        b = 8;
                    }
                    break;
                case 1491840183:
                    if (str.equals("filterReportUser")) {
                        b = 9;
                    }
                    break;
                case 1845246347:
                    if (str.equals("newUser")) {
                        b = 10;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    advancedSettings.student = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 1:
                    advancedSettings.active = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                    advancedSettings.intlFriendPurpose = jsonParser.getValueAsString();
                    return true;
                case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                    advancedSettings.online = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 4:
                    advancedSettings.realFace = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                    advancedSettings.popular = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 6:
                    advancedSettings.zodiacs = JsonAdapter.parseArray(jsonParser, ProfileZodiac.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    advancedSettings.f4id = jsonParser.getValueAsString();
                    return false;
                case 8:
                    advancedSettings.bloodType = JsonAdapter.parseArray(jsonParser, BloodType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    advancedSettings.filterReportUser = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                    advancedSettings.newUser = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AdvancedSettings advancedSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "student":
                case "active":
                case "intlFriendPurpose":
                case "online":
                case "realUser":
                case "popular":
                case "zodiacs":
                    return true;
                case "id":
                    return false;
                case "bloodType":
                case "filterReportUser":
                case "newUser":
                    return true;
                default:
                    return super.parseFieldCheck(advancedSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AdvancedSettings advancedSettings, JsonGenerator jsonGenerator) throws IOException {
            String str = advancedSettings.f4id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            Boolean bool = advancedSettings.online;
            if (bool != null) {
                jsonGenerator.writeBooleanField("online", bool.booleanValue());
            }
            Boolean bool2 = advancedSettings.realFace;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField(VisitorSortType.realUser, bool2.booleanValue());
            }
            Boolean bool3 = advancedSettings.active;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField(Active.TYPE, bool3.booleanValue());
            }
            Boolean bool4 = advancedSettings.newUser;
            if (bool4 != null) {
                jsonGenerator.writeBooleanField("newUser", bool4.booleanValue());
            }
            Boolean bool5 = advancedSettings.popular;
            if (bool5 != null) {
                jsonGenerator.writeBooleanField("popular", bool5.booleanValue());
            }
            if (advancedSettings.zodiacs != null) {
                jsonGenerator.writeFieldName("zodiacs");
                JsonAdapter.serializeArray(advancedSettings.zodiacs, jsonGenerator, ProfileZodiac.JSON_ADAPTER);
            }
            Boolean bool6 = advancedSettings.student;
            if (bool6 != null) {
                jsonGenerator.writeBooleanField("student", bool6.booleanValue());
            }
            Boolean bool7 = advancedSettings.filterReportUser;
            if (bool7 != null) {
                jsonGenerator.writeBooleanField("filterReportUser", bool7.booleanValue());
            }
            if (advancedSettings.bloodType != null) {
                jsonGenerator.writeFieldName("bloodType");
                JsonAdapter.serializeArray(advancedSettings.bloodType, jsonGenerator, BloodType.JSON_ADAPTER);
            }
            String str2 = advancedSettings.intlFriendPurpose;
            if (str2 != null) {
                jsonGenerator.writeStringField("intlFriendPurpose", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdvancedSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdvancedSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ProfileZodiac m10a(ProfileZodiac profileZodiac) {
        return profileZodiac;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BloodType m11b(BloodType bloodType) {
        return bloodType;
    }

    public static AdvancedSettings new_() {
        AdvancedSettings advancedSettings = new AdvancedSettings();
        advancedSettings.nullCheck();
        return advancedSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdvancedSettings m11544clone() {
        AdvancedSettings advancedSettings = new AdvancedSettings();
        advancedSettings.f4id = this.f4id;
        advancedSettings.online = this.online;
        advancedSettings.realFace = this.realFace;
        advancedSettings.active = this.active;
        advancedSettings.newUser = this.newUser;
        advancedSettings.popular = this.popular;
        List<ProfileZodiac> list = this.zodiacs;
        if (list != null) {
            advancedSettings.zodiacs = ValueObject.util_map(list, new w9j() { // from class: l.ba0
                public final Object call(Object obj) {
                    return AdvancedSettings.m10a((ProfileZodiac) obj);
                }
            });
        }
        advancedSettings.student = this.student;
        advancedSettings.filterReportUser = this.filterReportUser;
        List<BloodType> list2 = this.bloodType;
        if (list2 != null) {
            advancedSettings.bloodType = ValueObject.util_map(list2, new w9j() { // from class: l.ca0
                public final Object call(Object obj) {
                    return AdvancedSettings.m11b((BloodType) obj);
                }
            });
        }
        advancedSettings.intlFriendPurpose = this.intlFriendPurpose;
        return advancedSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdvancedSettings)) {
            return false;
        }
        AdvancedSettings advancedSettings = (AdvancedSettings) obj;
        return ValueObject.util_equals(this.f4id, advancedSettings.f4id) && ValueObject.util_equals(this.online, advancedSettings.online) && ValueObject.util_equals(this.realFace, advancedSettings.realFace) && ValueObject.util_equals(this.active, advancedSettings.active) && ValueObject.util_equals(this.newUser, advancedSettings.newUser) && ValueObject.util_equals(this.popular, advancedSettings.popular) && ValueObject.util_equals(this.zodiacs, advancedSettings.zodiacs) && ValueObject.util_equals(this.student, advancedSettings.student) && ValueObject.util_equals(this.filterReportUser, advancedSettings.filterReportUser) && ValueObject.util_equals(this.bloodType, advancedSettings.bloodType) && ValueObject.util_equals(this.intlFriendPurpose, advancedSettings.intlFriendPurpose);
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
        String str = this.f4id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Boolean bool = this.online;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 41;
        Boolean bool2 = this.realFace;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        Boolean bool3 = this.active;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 41;
        Boolean bool4 = this.newUser;
        int iHashCode5 = (iHashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 41;
        Boolean bool5 = this.popular;
        int iHashCode6 = (iHashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 41;
        List<ProfileZodiac> list = this.zodiacs;
        int iHashCode7 = (iHashCode6 + (list != null ? list.hashCode() : 0)) * 41;
        Boolean bool6 = this.student;
        int iHashCode8 = (iHashCode7 + (bool6 != null ? bool6.hashCode() : 0)) * 41;
        Boolean bool7 = this.filterReportUser;
        int iHashCode9 = (iHashCode8 + (bool7 != null ? bool7.hashCode() : 0)) * 41;
        List<BloodType> list2 = this.bloodType;
        int iHashCode10 = (iHashCode9 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str2 = this.intlFriendPurpose;
        int iHashCode11 = iHashCode10 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode11;
        return iHashCode11;
    }

    public void nullCheck() {
        if (this.f4id == null) {
            this.f4id = "";
        }
        if (this.online == null) {
            this.online = Boolean.FALSE;
        }
        if (this.realFace == null) {
            this.realFace = Boolean.FALSE;
        }
        if (this.active == null) {
            this.active = Boolean.FALSE;
        }
        if (this.newUser == null) {
            this.newUser = Boolean.FALSE;
        }
        if (this.popular == null) {
            this.popular = Boolean.FALSE;
        }
        if (this.zodiacs == null) {
            this.zodiacs = new ArrayList();
        }
        if (this.student == null) {
            this.student = Boolean.FALSE;
        }
        if (this.filterReportUser == null) {
            this.filterReportUser = Boolean.FALSE;
        }
        if (this.bloodType == null) {
            this.bloodType = new ArrayList();
        }
        if (this.intlFriendPurpose == null) {
            this.intlFriendPurpose = "";
        }
    }

    public AdvancedSettings subtract(AdvancedSettings advancedSettings) {
        AdvancedSettings advancedSettings2 = new AdvancedSettings();
        if (!ValueObject.util_equals(this.f4id, advancedSettings.f4id)) {
            advancedSettings2.f4id = this.f4id;
        }
        if (!ValueObject.util_equals(this.online, advancedSettings.online)) {
            advancedSettings2.online = this.online;
        }
        if (!ValueObject.util_equals(this.realFace, advancedSettings.realFace)) {
            advancedSettings2.realFace = this.realFace;
        }
        if (!ValueObject.util_equals(this.active, advancedSettings.active)) {
            advancedSettings2.active = this.active;
        }
        if (!ValueObject.util_equals(this.newUser, advancedSettings.newUser)) {
            advancedSettings2.newUser = this.newUser;
        }
        if (!ValueObject.util_equals(this.popular, advancedSettings.popular)) {
            advancedSettings2.popular = this.popular;
        }
        if (!ValueObject.util_equals(this.zodiacs, advancedSettings.zodiacs)) {
            advancedSettings2.zodiacs = this.zodiacs;
        }
        if (!ValueObject.util_equals(this.student, advancedSettings.student)) {
            advancedSettings2.student = this.student;
        }
        if (!ValueObject.util_equals(this.filterReportUser, advancedSettings.filterReportUser)) {
            advancedSettings2.filterReportUser = this.filterReportUser;
        }
        if (!ValueObject.util_equals(this.bloodType, advancedSettings.bloodType)) {
            advancedSettings2.bloodType = this.bloodType;
        }
        if (!ValueObject.util_equals(this.intlFriendPurpose, advancedSettings.intlFriendPurpose)) {
            advancedSettings2.intlFriendPurpose = this.intlFriendPurpose;
        }
        if (advancedSettings2.equals(new AdvancedSettings())) {
            return null;
        }
        return advancedSettings2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
