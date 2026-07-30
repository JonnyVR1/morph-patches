package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CategoriesDetail;
import com.p000p1.mobile.putong.core.data.ProfileLikesComment;
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
public class ProfileLikes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikes";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<CategoriesDetail> categories;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<ProfileLikesComment> comments;

    @NonNull
    @ProtobufIndex(index = 1)
    public String module;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int total;
    public static ProtobufAdapter<ProfileLikes> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikes>() { // from class: com.p1.mobile.putong.core.data.ProfileLikes.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLikes profileLikes) {
            String str = profileLikes.module;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, profileLikes.total);
            List<ProfileLikesComment> list = profileLikes.comments;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CategoriesDetail> list2 = profileLikes.categories;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(4, list2, CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileLikes).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLikes m15009parse(nb5 nb5Var) throws IOException {
            ProfileLikes profileLikes = new ProfileLikes();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    profileLikes.module = nb5Var.s();
                } else if (iU == 16) {
                    profileLikes.total = nb5Var.j();
                } else if (iU == 26) {
                    profileLikes.comments = (List) nb5Var.l(ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 34) {
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
                    profileLikes.categories = (List) nb5Var.l(CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileLikes;
        }

        public void serialize(ProfileLikes profileLikes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikes.module;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, profileLikes.total);
            List<ProfileLikesComment> list = profileLikes.comments;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProfileLikesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CategoriesDetail> list2 = profileLikes.categories;
            if (list2 != null) {
                codedOutputByteBufferNano.K(4, list2, CategoriesDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileLikes> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikes>() { // from class: com.p1.mobile.putong.core.data.ProfileLikes.2
        public Class getDataClass() {
            return ProfileLikes.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileLikes m15010newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikes new_() {
        ProfileLikes profileLikes = new ProfileLikes();
        profileLikes.nullCheck();
        return profileLikes;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLikes m15008clone() {
        ProfileLikes profileLikes = new ProfileLikes();
        profileLikes.module = this.module;
        profileLikes.total = this.total;
        List<ProfileLikesComment> list = this.comments;
        if (list != null) {
            profileLikes.comments = ValueObject.util_map(list, new w9j() { // from class: l.ht90
                public final Object call(Object obj) {
                    return ((ProfileLikesComment) obj).m15012clone();
                }
            });
        }
        List<CategoriesDetail> list2 = this.categories;
        if (list2 != null) {
            profileLikes.categories = ValueObject.util_map(list2, new w9j() { // from class: l.it90
                public final Object call(Object obj) {
                    return ((CategoriesDetail) obj).m11926clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
