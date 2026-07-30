package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class HomeTabShowUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hometabshowuser";

    @ProtobufIndex(index = 2)
    public int age;

    @NonNull
    @ProtobufIndex(index = 10)
    public String description;

    @NonNull
    @ProtobufIndex(index = 3)
    public Gender gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20417id;

    @NonNull
    @ProtobufIndex(index = 6)
    public Location location;

    @NonNull
    @ProtobufIndex(index = 9)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Media> pictures;

    @ProtobufIndex(index = 8)
    public boolean popular;

    @NonNull
    @ProtobufIndex(index = 7)
    public Profile profile;

    @NonNull
    @ProtobufIndex(index = 5)
    public RelationshipStatus relationship;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<Tag> tags;
    public static ProtobufAdapter<HomeTabShowUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeTabShowUser>() { // from class: com.p1.mobile.putong.core.data.HomeTabShowUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HomeTabShowUser homeTabShowUser) {
            String str = homeTabShowUser.f20417id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, homeTabShowUser.age);
            Gender gender = homeTabShowUser.gender;
            if (gender != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, gender.ordinal());
            }
            List<Media> list = homeTabShowUser.pictures;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RelationshipStatus relationshipStatus = homeTabShowUser.relationship;
            if (relationshipStatus != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(5, relationshipStatus.ordinal());
            }
            Location location = homeTabShowUser.location;
            if (location != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, location, Location.PROTOBUF_ADAPTER);
            }
            Profile profile = homeTabShowUser.profile;
            if (profile != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(7, profile, Profile.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(8, homeTabShowUser.popular);
            String str2 = homeTabShowUser.name;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(9, str2);
            }
            String str3 = homeTabShowUser.description;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(10, str3);
            }
            List<Tag> list2 = homeTabShowUser.tags;
            if (list2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(11, list2, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Gender gender2 = homeTabShowUser.gender;
            if (gender2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(12, gender2, Gender.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = homeTabShowUser.relationship;
            if (relationshipStatus2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(13, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            homeTabShowUser.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HomeTabShowUser parse(nb5 nb5Var) throws IOException {
            HomeTabShowUser homeTabShowUser = new HomeTabShowUser();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (homeTabShowUser.gender == null && numValueOf != null) {
                            homeTabShowUser.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (homeTabShowUser.relationship == null && numValueOf2 != null) {
                            homeTabShowUser.relationship = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (homeTabShowUser.f20417id == null) {
                            homeTabShowUser.f20417id = "";
                        }
                        if (homeTabShowUser.gender == null) {
                            homeTabShowUser.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabShowUser.pictures == null) {
                            homeTabShowUser.pictures = new ArrayList();
                        }
                        if (homeTabShowUser.relationship == null) {
                            homeTabShowUser.relationship = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabShowUser.location == null) {
                            homeTabShowUser.location = Location.new_();
                        }
                        if (homeTabShowUser.profile == null) {
                            homeTabShowUser.profile = Profile.new_();
                        }
                        if (homeTabShowUser.name == null) {
                            homeTabShowUser.name = "";
                        }
                        if (homeTabShowUser.description == null) {
                            homeTabShowUser.description = "";
                        }
                        if (homeTabShowUser.tags == null) {
                            homeTabShowUser.tags = new ArrayList();
                        }
                        break;
                    case 10:
                        homeTabShowUser.f20417id = nb5Var.m158750s();
                        continue;
                    case 16:
                        homeTabShowUser.age = nb5Var.m158741j();
                        continue;
                    case 24:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 34:
                        homeTabShowUser.pictures = (List) nb5Var.m158743l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 40:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 50:
                        homeTabShowUser.location = (Location) nb5Var.m158743l(Location.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        homeTabShowUser.profile = (Profile) nb5Var.m158743l(Profile.PROTOBUF_ADAPTER);
                        continue;
                    case 64:
                        homeTabShowUser.popular = nb5Var.m158738g();
                        continue;
                    case 74:
                        homeTabShowUser.name = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        homeTabShowUser.description = nb5Var.m158750s();
                        continue;
                    case 90:
                        homeTabShowUser.tags = (List) nb5Var.m158743l(Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        homeTabShowUser.gender = (Gender) nb5Var.m158743l(Gender.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        homeTabShowUser.relationship = (RelationshipStatus) nb5Var.m158743l(RelationshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (homeTabShowUser.gender == null && numValueOf != null) {
                            homeTabShowUser.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (homeTabShowUser.relationship == null && numValueOf2 != null) {
                            homeTabShowUser.relationship = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (homeTabShowUser.f20417id == null) {
                            homeTabShowUser.f20417id = "";
                        }
                        if (homeTabShowUser.gender == null) {
                            homeTabShowUser.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabShowUser.pictures == null) {
                            homeTabShowUser.pictures = new ArrayList();
                        }
                        if (homeTabShowUser.relationship == null) {
                            homeTabShowUser.relationship = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabShowUser.location == null) {
                            homeTabShowUser.location = Location.new_();
                        }
                        if (homeTabShowUser.profile == null) {
                            homeTabShowUser.profile = Profile.new_();
                        }
                        if (homeTabShowUser.name == null) {
                            homeTabShowUser.name = "";
                        }
                        if (homeTabShowUser.description == null) {
                            homeTabShowUser.description = "";
                        }
                        if (homeTabShowUser.tags == null) {
                            homeTabShowUser.tags = new ArrayList();
                            return homeTabShowUser;
                        }
                        break;
                }
            }
            return homeTabShowUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HomeTabShowUser homeTabShowUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = homeTabShowUser.f20417id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, homeTabShowUser.age);
            Gender gender = homeTabShowUser.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17250G(3, gender.ordinal());
            }
            List<Media> list = homeTabShowUser.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RelationshipStatus relationshipStatus = homeTabShowUser.relationship;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17250G(5, relationshipStatus.ordinal());
            }
            Location location = homeTabShowUser.location;
            if (location != null) {
                codedOutputByteBufferNano.m17254K(6, location, Location.PROTOBUF_ADAPTER);
            }
            Profile profile = homeTabShowUser.profile;
            if (profile != null) {
                codedOutputByteBufferNano.m17254K(7, profile, Profile.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(8, homeTabShowUser.popular);
            String str2 = homeTabShowUser.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(9, str2);
            }
            String str3 = homeTabShowUser.description;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(10, str3);
            }
            List<Tag> list2 = homeTabShowUser.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(11, list2, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Gender gender2 = homeTabShowUser.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.m17254K(12, gender2, Gender.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = homeTabShowUser.relationship;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.m17254K(13, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HomeTabShowUser> JSON_ADAPTER = new ObjectJsonAdapter<HomeTabShowUser>() { // from class: com.p1.mobile.putong.core.data.HomeTabShowUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HomeTabShowUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HomeTabShowUser newInstance() {
            return new HomeTabShowUser();
        }

        public boolean parseField(HomeTabShowUser homeTabShowUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    homeTabShowUser.description = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    homeTabShowUser.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "pictures":
                    homeTabShowUser.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "popular":
                    homeTabShowUser.popular = jsonParser.getValueAsBoolean();
                    return true;
                case "profile":
                    homeTabShowUser.profile = Profile.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "relationship":
                    homeTabShowUser.relationship = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    homeTabShowUser.f20417id = jsonParser.getValueAsString();
                    return false;
                case "age":
                    homeTabShowUser.age = jsonParser.getValueAsInt();
                    return true;
                case "name":
                    homeTabShowUser.name = jsonParser.getValueAsString();
                    return true;
                case "tags":
                    homeTabShowUser.tags = JsonAdapter.parseArray(jsonParser, Tag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "location":
                    homeTabShowUser.location = Location.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HomeTabShowUser homeTabShowUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "gender":
                case "pictures":
                case "popular":
                case "profile":
                case "relationship":
                    return true;
                case "id":
                    return false;
                case "age":
                case "name":
                case "tags":
                case "location":
                    return true;
                default:
                    return super.parseFieldCheck(homeTabShowUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HomeTabShowUser homeTabShowUser, JsonGenerator jsonGenerator) throws IOException {
            String str = homeTabShowUser.f20417id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, homeTabShowUser.age);
            if (homeTabShowUser.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(homeTabShowUser.gender, jsonGenerator, true);
            }
            if (homeTabShowUser.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(homeTabShowUser.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            if (homeTabShowUser.relationship != null) {
                jsonGenerator.writeFieldName("relationship");
                RelationshipStatus.JSON_ADAPTER.serialize(homeTabShowUser.relationship, jsonGenerator, true);
            }
            if (homeTabShowUser.location != null) {
                jsonGenerator.writeFieldName("location");
                Location.JSON_ADAPTER.serialize(homeTabShowUser.location, jsonGenerator, true);
            }
            if (homeTabShowUser.profile != null) {
                jsonGenerator.writeFieldName("profile");
                Profile.JSON_ADAPTER.serialize(homeTabShowUser.profile, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField(SuperlikeReason.popular, homeTabShowUser.popular);
            String str2 = homeTabShowUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = homeTabShowUser.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            if (homeTabShowUser.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(homeTabShowUser.tags, jsonGenerator, Tag.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTabShowUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeTabShowUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeTabShowUser new_() {
        HomeTabShowUser homeTabShowUser = new HomeTabShowUser();
        homeTabShowUser.nullCheck();
        return homeTabShowUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HomeTabShowUser mo223809clone() {
        HomeTabShowUser homeTabShowUser = new HomeTabShowUser();
        homeTabShowUser.f20417id = this.f20417id;
        homeTabShowUser.age = this.age;
        homeTabShowUser.gender = this.gender;
        List<Media> list = this.pictures;
        if (list != null) {
            homeTabShowUser.pictures = ValueObject.util_map(list, new w9j() { // from class: l.e9l
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).mo223809clone();
                }
            });
        }
        homeTabShowUser.relationship = this.relationship;
        Location location = this.location;
        if (location != null) {
            homeTabShowUser.location = location.mo223809clone();
        }
        Profile profile = this.profile;
        if (profile != null) {
            homeTabShowUser.profile = profile.mo223809clone();
        }
        homeTabShowUser.popular = this.popular;
        homeTabShowUser.name = this.name;
        homeTabShowUser.description = this.description;
        List<Tag> list2 = this.tags;
        if (list2 != null) {
            homeTabShowUser.tags = ValueObject.util_map(list2, new w9j() { // from class: l.f9l
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Tag) obj).mo223809clone();
                }
            });
        }
        return homeTabShowUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeTabShowUser)) {
            return false;
        }
        HomeTabShowUser homeTabShowUser = (HomeTabShowUser) obj;
        return ValueObject.util_equals(this.f20417id, homeTabShowUser.f20417id) && this.age == homeTabShowUser.age && ValueObject.util_equals(this.gender, homeTabShowUser.gender) && ValueObject.util_equals(this.pictures, homeTabShowUser.pictures) && ValueObject.util_equals(this.relationship, homeTabShowUser.relationship) && ValueObject.util_equals(this.location, homeTabShowUser.location) && ValueObject.util_equals(this.profile, homeTabShowUser.profile) && this.popular == homeTabShowUser.popular && ValueObject.util_equals(this.name, homeTabShowUser.name) && ValueObject.util_equals(this.description, homeTabShowUser.description) && ValueObject.util_equals(this.tags, homeTabShowUser.tags);
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
        String str = this.f20417id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.age) * 41;
        Gender gender = this.gender;
        int iHashCode2 = (iHashCode + (gender != null ? gender.hashCode() : 0)) * 41;
        List<Media> list = this.pictures;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.relationship;
        int iHashCode4 = (iHashCode3 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41;
        Location location = this.location;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 41;
        Profile profile = this.profile;
        int iHashCode6 = (((iHashCode5 + (profile != null ? profile.hashCode() : 0)) * 41) + (this.popular ? 1231 : 1237)) * 41;
        String str2 = this.name;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<Tag> list2 = this.tags;
        int iHashCode9 = iHashCode8 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20417id == null) {
            this.f20417id = "";
        }
        if (this.gender == null) {
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.relationship == null) {
            this.relationship = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.location == null) {
            this.location = Location.new_();
        }
        if (this.profile == null) {
            this.profile = Profile.new_();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
