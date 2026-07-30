package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.CategoriesDetail;
import com.p046p1.mobile.putong.core.data.ProfileLikesComment;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileLikes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikes";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<CategoriesDetail> categories;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<ProfileLikesComment> comments;

    @NonNull
    @ProtobufIndex(index = 1)
    public String module;

    @ProtobufIndex(index = 2)
    public int total;
    public static ProtobufAdapter<ProfileLikes> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikes>() { // from class: com.p1.mobile.putong.core.data.ProfileLikes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileLikes profileLikes) {
            String str = profileLikes.module;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, profileLikes.total);
            List<ProfileLikesComment> list = profileLikes.comments;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CategoriesDetail> list2 = profileLikes.categories;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list2, CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            profileLikes.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikes parse(nb5 nb5Var) throws IOException {
            ProfileLikes profileLikes = new ProfileLikes();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileLikes.module == null) {
                        profileLikes.module = "";
                    }
                    if (profileLikes.comments == null) {
                        profileLikes.comments = new ArrayList();
                    }
                    if (profileLikes.categories != null) {
                        break;
                    }
                    profileLikes.categories = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    profileLikes.module = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    profileLikes.total = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    profileLikes.comments = (List) nb5Var.m158743l(ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 34) {
                        if (profileLikes.module == null) {
                            profileLikes.module = "";
                        }
                        if (profileLikes.comments == null) {
                            profileLikes.comments = new ArrayList();
                        }
                        if (profileLikes.categories != null) {
                            break;
                        }
                        profileLikes.categories = new ArrayList();
                        return profileLikes;
                    }
                    profileLikes.categories = (List) nb5Var.m158743l(CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileLikes;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLikes profileLikes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikes.module;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, profileLikes.total);
            List<ProfileLikesComment> list = profileLikes.comments;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CategoriesDetail> list2 = profileLikes.categories;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(4, list2, CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileLikes> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikes>() { // from class: com.p1.mobile.putong.core.data.ProfileLikes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikes.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileLikes newInstance() {
            return new ProfileLikes();
        }

        public boolean parseField(ProfileLikes profileLikes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "module":
                    profileLikes.module = jsonParser.getValueAsString();
                    return true;
                case "comments":
                    profileLikes.comments = JsonAdapter.parseArray(jsonParser, ProfileLikesComment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "total":
                    profileLikes.total = jsonParser.getValueAsInt();
                    return true;
                case "categories":
                    profileLikes.categories = JsonAdapter.parseArray(jsonParser, CategoriesDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileLikes profileLikes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "module":
                case "comments":
                case "total":
                case "categories":
                    return true;
                default:
                    return super.parseFieldCheck(profileLikes, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLikes profileLikes, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikes.module;
            if (str != null) {
                jsonGenerator.writeStringField("module", str);
            }
            jsonGenerator.writeNumberField("total", profileLikes.total);
            if (profileLikes.comments != null) {
                jsonGenerator.writeFieldName("comments");
                JsonAdapter.serializeArray(profileLikes.comments, jsonGenerator, ProfileLikesComment.JSON_ADAPTER);
            }
            if (profileLikes.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(profileLikes.categories, jsonGenerator, CategoriesDetail.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikes new_() {
        ProfileLikes profileLikes = new ProfileLikes();
        profileLikes.nullCheck();
        return profileLikes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileLikes mo223809clone() {
        ProfileLikes profileLikes = new ProfileLikes();
        profileLikes.module = this.module;
        profileLikes.total = this.total;
        List<ProfileLikesComment> list = this.comments;
        if (list != null) {
            profileLikes.comments = ValueObject.util_map(list, new w9j() { // from class: l.ht90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ProfileLikesComment) obj).mo223809clone();
                }
            });
        }
        List<CategoriesDetail> list2 = this.categories;
        if (list2 != null) {
            profileLikes.categories = ValueObject.util_map(list2, new w9j() { // from class: l.it90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CategoriesDetail) obj).mo223809clone();
                }
            });
        }
        return profileLikes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLikes)) {
            return false;
        }
        ProfileLikes profileLikes = (ProfileLikes) obj;
        return ValueObject.util_equals(this.module, profileLikes.module) && this.total == profileLikes.total && ValueObject.util_equals(this.comments, profileLikes.comments) && ValueObject.util_equals(this.categories, profileLikes.categories);
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
        String str = this.module;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.total) * 41;
        List<ProfileLikesComment> list = this.comments;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<CategoriesDetail> list2 = this.categories;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.module == null) {
            this.module = "";
        }
        if (this.comments == null) {
            this.comments = new ArrayList();
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
