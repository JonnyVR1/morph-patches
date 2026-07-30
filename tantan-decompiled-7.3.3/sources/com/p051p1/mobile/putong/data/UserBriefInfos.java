package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.data.UserBriefInfos;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class UserBriefInfos extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userbriefinfos";

    @ProtobufIndex(index = 5)
    public int age;

    @NonNull
    @ProtobufIndex(index = 9)
    public Map<String, List<String>> department;

    @NonNull
    @ProtobufIndex(index = 4)
    public Gender gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39678id;

    @ProtobufIndex(index = 6)
    public boolean isVip;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 8)
    public String occupation;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    @NonNull
    @ProtobufIndex(index = 7)
    public ProfileZodiac zodiac;
    public static ProtobufAdapter<UserBriefInfos> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserBriefInfos>() { // from class: com.p1.mobile.putong.data.UserBriefInfos.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserBriefInfos userBriefInfos) {
            String str = userBriefInfos.f39678id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = userBriefInfos.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = userBriefInfos.url;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            Gender gender = userBriefInfos.gender;
            if (gender != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(4, gender.ordinal());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(5, userBriefInfos.age) + CodedOutputByteBufferNano.m17275b(6, userBriefInfos.isVip);
            ProfileZodiac profileZodiac = userBriefInfos.zodiac;
            if (profileZodiac != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(7, profileZodiac.ordinal());
            }
            String str4 = userBriefInfos.occupation;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str4);
            }
            Map<String, List<String>> map = userBriefInfos.department;
            if (map != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(9, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            Gender gender2 = userBriefInfos.gender;
            if (gender2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(10, gender2, Gender.PROTOBUF_ADAPTER);
            }
            ProfileZodiac profileZodiac2 = userBriefInfos.zodiac;
            if (profileZodiac2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(11, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
            userBriefInfos.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserBriefInfos parse(nc5 nc5Var) throws IOException {
            UserBriefInfos userBriefInfos = new UserBriefInfos();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (userBriefInfos.gender == null && numValueOf != null) {
                            userBriefInfos.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (userBriefInfos.zodiac == null && numValueOf2 != null) {
                            userBriefInfos.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (userBriefInfos.f39678id == null) {
                            userBriefInfos.f39678id = "";
                        }
                        if (userBriefInfos.name == null) {
                            userBriefInfos.name = "";
                        }
                        if (userBriefInfos.url == null) {
                            userBriefInfos.url = "";
                        }
                        if (userBriefInfos.gender == null) {
                            userBriefInfos.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (userBriefInfos.zodiac == null) {
                            userBriefInfos.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
                        }
                        if (userBriefInfos.occupation == null) {
                            userBriefInfos.occupation = "";
                        }
                        if (userBriefInfos.department == null) {
                            userBriefInfos.department = Collections.EMPTY_MAP;
                        }
                        break;
                    case 10:
                        userBriefInfos.f39678id = nc5Var.m162495s();
                        continue;
                    case 18:
                        userBriefInfos.name = nc5Var.m162495s();
                        continue;
                    case 26:
                        userBriefInfos.url = nc5Var.m162495s();
                        continue;
                    case 32:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 40:
                        userBriefInfos.age = nc5Var.m162486j();
                        continue;
                    case 48:
                        userBriefInfos.isVip = nc5Var.m162483g();
                        continue;
                    case 56:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 66:
                        userBriefInfos.occupation = nc5Var.m162495s();
                        continue;
                    case 74:
                        userBriefInfos.department = (Map) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        userBriefInfos.gender = (Gender) nc5Var.m162488l(Gender.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        userBriefInfos.zodiac = (ProfileZodiac) nc5Var.m162488l(ProfileZodiac.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (userBriefInfos.gender == null && numValueOf != null) {
                            userBriefInfos.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (userBriefInfos.zodiac == null && numValueOf2 != null) {
                            userBriefInfos.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (userBriefInfos.f39678id == null) {
                            userBriefInfos.f39678id = "";
                        }
                        if (userBriefInfos.name == null) {
                            userBriefInfos.name = "";
                        }
                        if (userBriefInfos.url == null) {
                            userBriefInfos.url = "";
                        }
                        if (userBriefInfos.gender == null) {
                            userBriefInfos.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (userBriefInfos.zodiac == null) {
                            userBriefInfos.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
                        }
                        if (userBriefInfos.occupation == null) {
                            userBriefInfos.occupation = "";
                        }
                        if (userBriefInfos.department == null) {
                            userBriefInfos.department = Collections.EMPTY_MAP;
                            return userBriefInfos;
                        }
                        break;
                }
            }
            return userBriefInfos;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserBriefInfos userBriefInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userBriefInfos.f39678id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = userBriefInfos.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = userBriefInfos.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            Gender gender = userBriefInfos.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17305G(4, gender.ordinal());
            }
            codedOutputByteBufferNano.m17305G(5, userBriefInfos.age);
            codedOutputByteBufferNano.m17299A(6, userBriefInfos.isVip);
            ProfileZodiac profileZodiac = userBriefInfos.zodiac;
            if (profileZodiac != null) {
                codedOutputByteBufferNano.m17305G(7, profileZodiac.ordinal());
            }
            String str4 = userBriefInfos.occupation;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(8, str4);
            }
            Map<String, List<String>> map = userBriefInfos.department;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(9, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            Gender gender2 = userBriefInfos.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.m17309K(10, gender2, Gender.PROTOBUF_ADAPTER);
            }
            ProfileZodiac profileZodiac2 = userBriefInfos.zodiac;
            if (profileZodiac2 != null) {
                codedOutputByteBufferNano.m17309K(11, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserBriefInfos> JSON_ADAPTER = new ObjectJsonAdapter<UserBriefInfos>() { // from class: com.p1.mobile.putong.data.UserBriefInfos.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserBriefInfos.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserBriefInfos newInstance() {
            return new UserBriefInfos();
        }

        public boolean parseField(UserBriefInfos userBriefInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    userBriefInfos.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "zodiac":
                    userBriefInfos.zodiac = ProfileZodiac.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    userBriefInfos.f39678id = jsonParser.getValueAsString();
                    return false;
                case "age":
                    userBriefInfos.age = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    userBriefInfos.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    userBriefInfos.name = jsonParser.getValueAsString();
                    return true;
                case "isVip":
                    userBriefInfos.isVip = jsonParser.getValueAsBoolean();
                    return true;
                case "department":
                    userBriefInfos.department = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER(), str2);
                    return true;
                case "occupation":
                    userBriefInfos.occupation = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserBriefInfos userBriefInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gender":
                case "zodiac":
                    return true;
                case "id":
                    return false;
                case "age":
                case "url":
                case "name":
                case "isVip":
                case "department":
                case "occupation":
                    return true;
                default:
                    return super.parseFieldCheck(userBriefInfos, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserBriefInfos userBriefInfos, JsonGenerator jsonGenerator) throws IOException {
            String str = userBriefInfos.f39678id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = userBriefInfos.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = userBriefInfos.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            if (userBriefInfos.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(userBriefInfos.gender, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, userBriefInfos.age);
            jsonGenerator.writeBooleanField("isVip", userBriefInfos.isVip);
            if (userBriefInfos.zodiac != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.zodiac);
                ProfileZodiac.JSON_ADAPTER.serialize(userBriefInfos.zodiac, jsonGenerator, true);
            }
            String str4 = userBriefInfos.occupation;
            if (str4 != null) {
                jsonGenerator.writeStringField("occupation", str4);
            }
            if (userBriefInfos.department != null) {
                jsonGenerator.writeFieldName("department");
                JsonAdapter.serializeMap(userBriefInfos.department, jsonGenerator, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserBriefInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserBriefInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m61311b(String str) {
        return str;
    }

    public static UserBriefInfos new_() {
        UserBriefInfos userBriefInfos = new UserBriefInfos();
        userBriefInfos.nullCheck();
        return userBriefInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserBriefInfos mo225055clone() {
        UserBriefInfos userBriefInfos = new UserBriefInfos();
        userBriefInfos.f39678id = this.f39678id;
        userBriefInfos.name = this.name;
        userBriefInfos.url = this.url;
        userBriefInfos.gender = this.gender;
        userBriefInfos.age = this.age;
        userBriefInfos.isVip = this.isVip;
        userBriefInfos.zodiac = this.zodiac;
        userBriefInfos.occupation = this.occupation;
        Map<String, List<String>> map = this.department;
        if (map != null) {
            userBriefInfos.department = ValueObject.util_map(map, new qcj() { // from class: l.a7k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ValueObject.util_map((List) obj, new qcj() { // from class: l.z6k0
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return UserBriefInfos.m61311b((String) obj2);
                        }
                    });
                }
            });
        }
        return userBriefInfos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserBriefInfos)) {
            return false;
        }
        UserBriefInfos userBriefInfos = (UserBriefInfos) obj;
        return ValueObject.util_equals(this.f39678id, userBriefInfos.f39678id) && ValueObject.util_equals(this.name, userBriefInfos.name) && ValueObject.util_equals(this.url, userBriefInfos.url) && ValueObject.util_equals(this.gender, userBriefInfos.gender) && this.age == userBriefInfos.age && this.isVip == userBriefInfos.isVip && ValueObject.util_equals(this.zodiac, userBriefInfos.zodiac) && ValueObject.util_equals(this.occupation, userBriefInfos.occupation) && ValueObject.util_equals(this.department, userBriefInfos.department);
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
        String str = this.f39678id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode4 = (((((iHashCode3 + (gender != null ? gender.hashCode() : 0)) * 41) + this.age) * 41) + (this.isVip ? 1231 : 1237)) * 41;
        ProfileZodiac profileZodiac = this.zodiac;
        int iHashCode5 = (iHashCode4 + (profileZodiac != null ? profileZodiac.hashCode() : 0)) * 41;
        String str4 = this.occupation;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        Map<String, List<String>> map = this.department;
        int iHashCode7 = iHashCode6 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39678id == null) {
            this.f39678id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.gender == null) {
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
        if (this.zodiac == null) {
            this.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
        }
        if (this.occupation == null) {
            this.occupation = "";
        }
        if (this.department == null) {
            this.department = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
