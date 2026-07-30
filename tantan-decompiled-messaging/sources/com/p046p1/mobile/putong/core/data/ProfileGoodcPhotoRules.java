package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ProfileGoodcPhotoRules;
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
public class ProfileGoodcPhotoRules extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcphotorules";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Integer> facebook;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> real_user;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> vip;
    public static ProtobufAdapter<ProfileGoodcPhotoRules> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcPhotoRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcPhotoRules.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodcPhotoRules profileGoodcPhotoRules) {
            List<Integer> list = profileGoodcPhotoRules.vip;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Integer> list2 = profileGoodcPhotoRules.real_user;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list3 = profileGoodcPhotoRules.facebook;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            profileGoodcPhotoRules.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcPhotoRules parse(nb5 nb5Var) throws IOException {
            ProfileGoodcPhotoRules profileGoodcPhotoRules = new ProfileGoodcPhotoRules();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileGoodcPhotoRules.vip == null) {
                        profileGoodcPhotoRules.vip = new ArrayList();
                    }
                    if (profileGoodcPhotoRules.real_user == null) {
                        profileGoodcPhotoRules.real_user = new ArrayList();
                    }
                    if (profileGoodcPhotoRules.facebook != null) {
                        break;
                    }
                    profileGoodcPhotoRules.facebook = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    profileGoodcPhotoRules.vip = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    profileGoodcPhotoRules.real_user = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (profileGoodcPhotoRules.vip == null) {
                            profileGoodcPhotoRules.vip = new ArrayList();
                        }
                        if (profileGoodcPhotoRules.real_user == null) {
                            profileGoodcPhotoRules.real_user = new ArrayList();
                        }
                        if (profileGoodcPhotoRules.facebook != null) {
                            break;
                        }
                        profileGoodcPhotoRules.facebook = new ArrayList();
                        return profileGoodcPhotoRules;
                    }
                    profileGoodcPhotoRules.facebook = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileGoodcPhotoRules;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcPhotoRules profileGoodcPhotoRules, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = profileGoodcPhotoRules.vip;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = profileGoodcPhotoRules.real_user;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list3 = profileGoodcPhotoRules.facebook;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileGoodcPhotoRules> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcPhotoRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcPhotoRules.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcPhotoRules.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodcPhotoRules newInstance() {
            return new ProfileGoodcPhotoRules();
        }

        public boolean parseField(ProfileGoodcPhotoRules profileGoodcPhotoRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "real_user":
                    profileGoodcPhotoRules.real_user = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "vip":
                    profileGoodcPhotoRules.vip = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "facebook":
                    profileGoodcPhotoRules.facebook = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileGoodcPhotoRules profileGoodcPhotoRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "real_user":
                case "vip":
                case "facebook":
                    return true;
                default:
                    return super.parseFieldCheck(profileGoodcPhotoRules, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileGoodcPhotoRules profileGoodcPhotoRules, JsonGenerator jsonGenerator) throws IOException {
            if (profileGoodcPhotoRules.vip != null) {
                jsonGenerator.writeFieldName("vip");
                JsonAdapter.serializeArray(profileGoodcPhotoRules.vip, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (profileGoodcPhotoRules.real_user != null) {
                jsonGenerator.writeFieldName("real_user");
                JsonAdapter.serializeArray(profileGoodcPhotoRules.real_user, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (profileGoodcPhotoRules.facebook != null) {
                jsonGenerator.writeFieldName("facebook");
                JsonAdapter.serializeArray(profileGoodcPhotoRules.facebook, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcPhotoRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcPhotoRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m35764a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m35765b(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m35766c(Integer num) {
        return num;
    }

    public static ProfileGoodcPhotoRules new_() {
        ProfileGoodcPhotoRules profileGoodcPhotoRules = new ProfileGoodcPhotoRules();
        profileGoodcPhotoRules.nullCheck();
        return profileGoodcPhotoRules;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcPhotoRules mo223809clone() {
        ProfileGoodcPhotoRules profileGoodcPhotoRules = new ProfileGoodcPhotoRules();
        List<Integer> list = this.vip;
        if (list != null) {
            profileGoodcPhotoRules.vip = ValueObject.util_map(list, new w9j() { // from class: l.wm90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileGoodcPhotoRules.m35765b((Integer) obj);
                }
            });
        }
        List<Integer> list2 = this.real_user;
        if (list2 != null) {
            profileGoodcPhotoRules.real_user = ValueObject.util_map(list2, new w9j() { // from class: l.xm90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileGoodcPhotoRules.m35766c((Integer) obj);
                }
            });
        }
        List<Integer> list3 = this.facebook;
        if (list3 != null) {
            profileGoodcPhotoRules.facebook = ValueObject.util_map(list3, new w9j() { // from class: l.ym90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileGoodcPhotoRules.m35764a((Integer) obj);
                }
            });
        }
        return profileGoodcPhotoRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodcPhotoRules)) {
            return false;
        }
        ProfileGoodcPhotoRules profileGoodcPhotoRules = (ProfileGoodcPhotoRules) obj;
        return ValueObject.util_equals(this.vip, profileGoodcPhotoRules.vip) && ValueObject.util_equals(this.real_user, profileGoodcPhotoRules.real_user) && ValueObject.util_equals(this.facebook, profileGoodcPhotoRules.facebook);
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
        List<Integer> list = this.vip;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.real_user;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Integer> list3 = this.facebook;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.vip == null) {
            this.vip = new ArrayList();
        }
        if (this.real_user == null) {
            this.real_user = new ArrayList();
        }
        if (this.facebook == null) {
            this.facebook = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
