package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CategoriesDetail;
import com.p051p1.mobile.putong.core.data.ProfileLikesComment;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

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
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, profileLikes.total);
            List<ProfileLikesComment> list = profileLikes.comments;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CategoriesDetail> list2 = profileLikes.categories;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list2, CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            profileLikes.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikes parse(nc5 nc5Var) throws IOException {
            ProfileLikes profileLikes = new ProfileLikes();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    profileLikes.module = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    profileLikes.total = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    profileLikes.comments = (List) nc5Var.m162488l(ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 34) {
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
                    profileLikes.categories = (List) nc5Var.m162488l(CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileLikes;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLikes profileLikes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikes.module;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, profileLikes.total);
            List<ProfileLikesComment> list = profileLikes.comments;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CategoriesDetail> list2 = profileLikes.categories;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(4, list2, CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileLikes> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikes>() { // from class: com.p1.mobile.putong.core.data.ProfileLikes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikes.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ProfileLikes mo225055clone() {
        ProfileLikes profileLikes = new ProfileLikes();
        profileLikes.module = this.module;
        profileLikes.total = this.total;
        List<ProfileLikesComment> list = this.comments;
        if (list != null) {
            profileLikes.comments = ValueObject.util_map(list, new qcj() { // from class: l.l1a0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ProfileLikesComment) obj).mo225055clone();
                }
            });
        }
        List<CategoriesDetail> list2 = this.categories;
        if (list2 != null) {
            profileLikes.categories = ValueObject.util_map(list2, new qcj() { // from class: l.m1a0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CategoriesDetail) obj).mo225055clone();
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
