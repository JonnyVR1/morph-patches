package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.data.FBEducation;
import com.p046p1.mobile.putong.data.FBWork;
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

/* JADX INFO: loaded from: classes12.dex */
public class FBUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbuser";

    @NonNull
    @ProtobufIndex(index = 5)
    public String about;

    @NonNull
    @ProtobufIndex(index = 3)
    public String birthday;

    @NonNull
    @ProtobufIndex(index = 12)
    public FBLikes books;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<FBEducation> education;

    @NonNull
    @ProtobufIndex(index = 4)
    public FBProfile fbPicture;

    @NonNull
    @ProtobufIndex(index = 2)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 6)
    public FBPage hometown;

    @NonNull
    @ProtobufIndex(index = 7)
    public FBPage location;

    @NonNull
    @ProtobufIndex(index = 11)
    public FBLikes movies;

    @NonNull
    @ProtobufIndex(index = 10)
    public FBLikes music;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 13)
    public FBLikes television;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<FBWork> work;
    public static ProtobufAdapter<FBUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBUser>() { // from class: com.p1.mobile.putong.data.FBUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBUser fBUser) {
            String str = fBUser.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = fBUser.gender;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = fBUser.birthday;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            FBProfile fBProfile = fBUser.fbPicture;
            if (fBProfile != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, fBProfile, FBProfile.PROTOBUF_ADAPTER);
            }
            String str4 = fBUser.about;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            FBPage fBPage = fBUser.hometown;
            if (fBPage != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBUser.location;
            if (fBPage2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(7, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            List<FBWork> list = fBUser.work;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(8, list, FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FBEducation> list2 = fBUser.education;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(9, list2, FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FBLikes fBLikes = fBUser.music;
            if (fBLikes != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(10, fBLikes, FBLikes.PROTOBUF_ADAPTER);
            }
            FBLikes fBLikes2 = fBUser.movies;
            if (fBLikes2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(11, fBLikes2, FBLikes.PROTOBUF_ADAPTER);
            }
            FBLikes fBLikes3 = fBUser.books;
            if (fBLikes3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(12, fBLikes3, FBLikes.PROTOBUF_ADAPTER);
            }
            FBLikes fBLikes4 = fBUser.television;
            if (fBLikes4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(13, fBLikes4, FBLikes.PROTOBUF_ADAPTER);
            }
            fBUser.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBUser parse(nb5 nb5Var) throws IOException {
            FBUser fBUser = new FBUser();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (fBUser.name == null) {
                            fBUser.name = "";
                        }
                        if (fBUser.gender == null) {
                            fBUser.gender = "";
                        }
                        if (fBUser.birthday == null) {
                            fBUser.birthday = "";
                        }
                        if (fBUser.fbPicture == null) {
                            fBUser.fbPicture = FBProfile.new_();
                        }
                        if (fBUser.about == null) {
                            fBUser.about = "";
                        }
                        if (fBUser.hometown == null) {
                            fBUser.hometown = FBPage.new_();
                        }
                        if (fBUser.location == null) {
                            fBUser.location = FBPage.new_();
                        }
                        if (fBUser.work == null) {
                            fBUser.work = new ArrayList();
                        }
                        if (fBUser.education == null) {
                            fBUser.education = new ArrayList();
                        }
                        if (fBUser.music == null) {
                            fBUser.music = FBLikes.new_();
                        }
                        if (fBUser.movies == null) {
                            fBUser.movies = FBLikes.new_();
                        }
                        if (fBUser.books == null) {
                            fBUser.books = FBLikes.new_();
                        }
                        if (fBUser.television == null) {
                            fBUser.television = FBLikes.new_();
                        }
                        break;
                    case 10:
                        fBUser.name = nb5Var.m158750s();
                        continue;
                    case 18:
                        fBUser.gender = nb5Var.m158750s();
                        continue;
                    case 26:
                        fBUser.birthday = nb5Var.m158750s();
                        continue;
                    case 34:
                        fBUser.fbPicture = (FBProfile) nb5Var.m158743l(FBProfile.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        fBUser.about = nb5Var.m158750s();
                        continue;
                    case 50:
                        fBUser.hometown = (FBPage) nb5Var.m158743l(FBPage.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        fBUser.location = (FBPage) nb5Var.m158743l(FBPage.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        fBUser.work = (List) nb5Var.m158743l(FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        fBUser.education = (List) nb5Var.m158743l(FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        fBUser.music = (FBLikes) nb5Var.m158743l(FBLikes.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        fBUser.movies = (FBLikes) nb5Var.m158743l(FBLikes.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        fBUser.books = (FBLikes) nb5Var.m158743l(FBLikes.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        fBUser.television = (FBLikes) nb5Var.m158743l(FBLikes.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (fBUser.name == null) {
                            fBUser.name = "";
                        }
                        if (fBUser.gender == null) {
                            fBUser.gender = "";
                        }
                        if (fBUser.birthday == null) {
                            fBUser.birthday = "";
                        }
                        if (fBUser.fbPicture == null) {
                            fBUser.fbPicture = FBProfile.new_();
                        }
                        if (fBUser.about == null) {
                            fBUser.about = "";
                        }
                        if (fBUser.hometown == null) {
                            fBUser.hometown = FBPage.new_();
                        }
                        if (fBUser.location == null) {
                            fBUser.location = FBPage.new_();
                        }
                        if (fBUser.work == null) {
                            fBUser.work = new ArrayList();
                        }
                        if (fBUser.education == null) {
                            fBUser.education = new ArrayList();
                        }
                        if (fBUser.music == null) {
                            fBUser.music = FBLikes.new_();
                        }
                        if (fBUser.movies == null) {
                            fBUser.movies = FBLikes.new_();
                        }
                        if (fBUser.books == null) {
                            fBUser.books = FBLikes.new_();
                        }
                        if (fBUser.television == null) {
                            fBUser.television = FBLikes.new_();
                            return fBUser;
                        }
                        break;
                }
            }
            return fBUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBUser fBUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBUser.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = fBUser.gender;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = fBUser.birthday;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            FBProfile fBProfile = fBUser.fbPicture;
            if (fBProfile != null) {
                codedOutputByteBufferNano.m17254K(4, fBProfile, FBProfile.PROTOBUF_ADAPTER);
            }
            String str4 = fBUser.about;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            FBPage fBPage = fBUser.hometown;
            if (fBPage != null) {
                codedOutputByteBufferNano.m17254K(6, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBUser.location;
            if (fBPage2 != null) {
                codedOutputByteBufferNano.m17254K(7, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            List<FBWork> list = fBUser.work;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(8, list, FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FBEducation> list2 = fBUser.education;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(9, list2, FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FBLikes fBLikes = fBUser.music;
            if (fBLikes != null) {
                codedOutputByteBufferNano.m17254K(10, fBLikes, FBLikes.PROTOBUF_ADAPTER);
            }
            FBLikes fBLikes2 = fBUser.movies;
            if (fBLikes2 != null) {
                codedOutputByteBufferNano.m17254K(11, fBLikes2, FBLikes.PROTOBUF_ADAPTER);
            }
            FBLikes fBLikes3 = fBUser.books;
            if (fBLikes3 != null) {
                codedOutputByteBufferNano.m17254K(12, fBLikes3, FBLikes.PROTOBUF_ADAPTER);
            }
            FBLikes fBLikes4 = fBUser.television;
            if (fBLikes4 != null) {
                codedOutputByteBufferNano.m17254K(13, fBLikes4, FBLikes.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBUser> JSON_ADAPTER = new ObjectJsonAdapter<FBUser>() { // from class: com.p1.mobile.putong.data.FBUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBUser newInstance() {
            return new FBUser();
        }

        public boolean parseField(FBUser fBUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "television":
                    fBUser.television = FBLikes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "gender":
                    fBUser.gender = jsonParser.getValueAsString();
                    return true;
                case "movies":
                    fBUser.movies = FBLikes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "picture":
                    fBUser.fbPicture = FBProfile.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hometown":
                    fBUser.hometown = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "education":
                    fBUser.education = JsonAdapter.parseArray(jsonParser, FBEducation.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    fBUser.name = jsonParser.getValueAsString();
                    return true;
                case "work":
                    fBUser.work = JsonAdapter.parseArray(jsonParser, FBWork.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "about":
                    fBUser.about = jsonParser.getValueAsString();
                    return true;
                case "books":
                    fBUser.books = FBLikes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "music":
                    fBUser.music = FBLikes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "birthday":
                    fBUser.birthday = jsonParser.getValueAsString();
                    return true;
                case "location":
                    fBUser.location = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FBUser fBUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "television":
                case "gender":
                case "movies":
                case "picture":
                case "hometown":
                case "education":
                case "name":
                case "work":
                case "about":
                case "books":
                case "music":
                case "birthday":
                case "location":
                    return true;
                default:
                    return super.parseFieldCheck(fBUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBUser fBUser, JsonGenerator jsonGenerator) throws IOException {
            String str = fBUser.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = fBUser.gender;
            if (str2 != null) {
                jsonGenerator.writeStringField("gender", str2);
            }
            String str3 = fBUser.birthday;
            if (str3 != null) {
                jsonGenerator.writeStringField("birthday", str3);
            }
            if (fBUser.fbPicture != null) {
                jsonGenerator.writeFieldName("picture");
                FBProfile.JSON_ADAPTER.serialize(fBUser.fbPicture, jsonGenerator, true);
            }
            String str4 = fBUser.about;
            if (str4 != null) {
                jsonGenerator.writeStringField("about", str4);
            }
            if (fBUser.hometown != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.hometown);
                FBPage.JSON_ADAPTER.serialize(fBUser.hometown, jsonGenerator, true);
            }
            if (fBUser.location != null) {
                jsonGenerator.writeFieldName("location");
                FBPage.JSON_ADAPTER.serialize(fBUser.location, jsonGenerator, true);
            }
            if (fBUser.work != null) {
                jsonGenerator.writeFieldName(Work.TYPE);
                JsonAdapter.serializeArray(fBUser.work, jsonGenerator, FBWork.JSON_ADAPTER);
            }
            if (fBUser.education != null) {
                jsonGenerator.writeFieldName("education");
                JsonAdapter.serializeArray(fBUser.education, jsonGenerator, FBEducation.JSON_ADAPTER);
            }
            if (fBUser.music != null) {
                jsonGenerator.writeFieldName("music");
                FBLikes.JSON_ADAPTER.serialize(fBUser.music, jsonGenerator, true);
            }
            if (fBUser.movies != null) {
                jsonGenerator.writeFieldName("movies");
                FBLikes.JSON_ADAPTER.serialize(fBUser.movies, jsonGenerator, true);
            }
            if (fBUser.books != null) {
                jsonGenerator.writeFieldName("books");
                FBLikes.JSON_ADAPTER.serialize(fBUser.books, jsonGenerator, true);
            }
            if (fBUser.television != null) {
                jsonGenerator.writeFieldName("television");
                FBLikes.JSON_ADAPTER.serialize(fBUser.television, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBUser new_() {
        FBUser fBUser = new FBUser();
        fBUser.nullCheck();
        return fBUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBUser mo223809clone() {
        FBUser fBUser = new FBUser();
        fBUser.name = this.name;
        fBUser.gender = this.gender;
        fBUser.birthday = this.birthday;
        FBProfile fBProfile = this.fbPicture;
        if (fBProfile != null) {
            fBUser.fbPicture = fBProfile.mo223809clone();
        }
        fBUser.about = this.about;
        FBPage fBPage = this.hometown;
        if (fBPage != null) {
            fBUser.hometown = fBPage.mo223809clone();
        }
        FBPage fBPage2 = this.location;
        if (fBPage2 != null) {
            fBUser.location = fBPage2.mo223809clone();
        }
        List<FBWork> list = this.work;
        if (list != null) {
            fBUser.work = ValueObject.util_map(list, new w9j() { // from class: l.grf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FBWork) obj).mo223809clone();
                }
            });
        }
        List<FBEducation> list2 = this.education;
        if (list2 != null) {
            fBUser.education = ValueObject.util_map(list2, new w9j() { // from class: l.hrf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FBEducation) obj).mo223809clone();
                }
            });
        }
        FBLikes fBLikes = this.music;
        if (fBLikes != null) {
            fBUser.music = fBLikes.mo223809clone();
        }
        FBLikes fBLikes2 = this.movies;
        if (fBLikes2 != null) {
            fBUser.movies = fBLikes2.mo223809clone();
        }
        FBLikes fBLikes3 = this.books;
        if (fBLikes3 != null) {
            fBUser.books = fBLikes3.mo223809clone();
        }
        FBLikes fBLikes4 = this.television;
        if (fBLikes4 != null) {
            fBUser.television = fBLikes4.mo223809clone();
        }
        return fBUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBUser)) {
            return false;
        }
        FBUser fBUser = (FBUser) obj;
        return ValueObject.util_equals(this.name, fBUser.name) && ValueObject.util_equals(this.gender, fBUser.gender) && ValueObject.util_equals(this.birthday, fBUser.birthday) && ValueObject.util_equals(this.fbPicture, fBUser.fbPicture) && ValueObject.util_equals(this.about, fBUser.about) && ValueObject.util_equals(this.hometown, fBUser.hometown) && ValueObject.util_equals(this.location, fBUser.location) && ValueObject.util_equals(this.work, fBUser.work) && ValueObject.util_equals(this.education, fBUser.education) && ValueObject.util_equals(this.music, fBUser.music) && ValueObject.util_equals(this.movies, fBUser.movies) && ValueObject.util_equals(this.books, fBUser.books) && ValueObject.util_equals(this.television, fBUser.television);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.gender;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.birthday;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        FBProfile fBProfile = this.fbPicture;
        int iHashCode4 = (iHashCode3 + (fBProfile != null ? fBProfile.hashCode() : 0)) * 41;
        String str4 = this.about;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        FBPage fBPage = this.hometown;
        int iHashCode6 = (iHashCode5 + (fBPage != null ? fBPage.hashCode() : 0)) * 41;
        FBPage fBPage2 = this.location;
        int iHashCode7 = (iHashCode6 + (fBPage2 != null ? fBPage2.hashCode() : 0)) * 41;
        List<FBWork> list = this.work;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        List<FBEducation> list2 = this.education;
        int iHashCode9 = (iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 41;
        FBLikes fBLikes = this.music;
        int iHashCode10 = (iHashCode9 + (fBLikes != null ? fBLikes.hashCode() : 0)) * 41;
        FBLikes fBLikes2 = this.movies;
        int iHashCode11 = (iHashCode10 + (fBLikes2 != null ? fBLikes2.hashCode() : 0)) * 41;
        FBLikes fBLikes3 = this.books;
        int iHashCode12 = (iHashCode11 + (fBLikes3 != null ? fBLikes3.hashCode() : 0)) * 41;
        FBLikes fBLikes4 = this.television;
        int iHashCode13 = iHashCode12 + (fBLikes4 != null ? fBLikes4.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.birthday == null) {
            this.birthday = "";
        }
        if (this.fbPicture == null) {
            this.fbPicture = FBProfile.new_();
        }
        if (this.about == null) {
            this.about = "";
        }
        if (this.hometown == null) {
            this.hometown = FBPage.new_();
        }
        if (this.location == null) {
            this.location = FBPage.new_();
        }
        if (this.work == null) {
            this.work = new ArrayList();
        }
        if (this.education == null) {
            this.education = new ArrayList();
        }
        if (this.music == null) {
            this.music = FBLikes.new_();
        }
        if (this.movies == null) {
            this.movies = FBLikes.new_();
        }
        if (this.books == null) {
            this.books = FBLikes.new_();
        }
        if (this.television == null) {
            this.television = FBLikes.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
