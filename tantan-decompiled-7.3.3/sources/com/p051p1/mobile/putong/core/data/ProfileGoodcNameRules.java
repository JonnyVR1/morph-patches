package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ProfileGoodcNameRules;
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
public class ProfileGoodcNameRules extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcnamerules";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> facebook;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> real_user;
    public static ProtobufAdapter<ProfileGoodcNameRules> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcNameRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcNameRules.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodcNameRules profileGoodcNameRules) {
            List<Integer> list = profileGoodcNameRules.real_user;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Integer> list2 = profileGoodcNameRules.facebook;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            profileGoodcNameRules.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcNameRules parse(nc5 nc5Var) throws IOException {
            ProfileGoodcNameRules profileGoodcNameRules = new ProfileGoodcNameRules();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (profileGoodcNameRules.real_user == null) {
                        profileGoodcNameRules.real_user = new ArrayList();
                    }
                    if (profileGoodcNameRules.facebook != null) {
                        break;
                    }
                    profileGoodcNameRules.facebook = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    profileGoodcNameRules.real_user = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (profileGoodcNameRules.real_user == null) {
                            profileGoodcNameRules.real_user = new ArrayList();
                        }
                        if (profileGoodcNameRules.facebook != null) {
                            break;
                        }
                        profileGoodcNameRules.facebook = new ArrayList();
                        return profileGoodcNameRules;
                    }
                    profileGoodcNameRules.facebook = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileGoodcNameRules;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcNameRules profileGoodcNameRules, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = profileGoodcNameRules.real_user;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = profileGoodcNameRules.facebook;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileGoodcNameRules> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcNameRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcNameRules.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcNameRules.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodcNameRules newInstance() {
            return new ProfileGoodcNameRules();
        }

        public boolean parseField(ProfileGoodcNameRules profileGoodcNameRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("real_user")) {
                profileGoodcNameRules.real_user = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("facebook")) {
                return false;
            }
            profileGoodcNameRules.facebook = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfileGoodcNameRules profileGoodcNameRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("real_user") || str.equals("facebook")) {
                return true;
            }
            return super.parseFieldCheck(profileGoodcNameRules, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileGoodcNameRules profileGoodcNameRules, JsonGenerator jsonGenerator) throws IOException {
            if (profileGoodcNameRules.real_user != null) {
                jsonGenerator.writeFieldName("real_user");
                JsonAdapter.serializeArray(profileGoodcNameRules.real_user, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (profileGoodcNameRules.facebook != null) {
                jsonGenerator.writeFieldName("facebook");
                JsonAdapter.serializeArray(profileGoodcNameRules.facebook, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcNameRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcNameRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m36765a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m36766b(Integer num) {
        return num;
    }

    public static ProfileGoodcNameRules new_() {
        ProfileGoodcNameRules profileGoodcNameRules = new ProfileGoodcNameRules();
        profileGoodcNameRules.nullCheck();
        return profileGoodcNameRules;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcNameRules mo225055clone() {
        ProfileGoodcNameRules profileGoodcNameRules = new ProfileGoodcNameRules();
        List<Integer> list = this.real_user;
        if (list != null) {
            profileGoodcNameRules.real_user = ValueObject.util_map(list, new qcj() { // from class: l.yu90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileGoodcNameRules.m36766b((Integer) obj);
                }
            });
        }
        List<Integer> list2 = this.facebook;
        if (list2 != null) {
            profileGoodcNameRules.facebook = ValueObject.util_map(list2, new qcj() { // from class: l.zu90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileGoodcNameRules.m36765a((Integer) obj);
                }
            });
        }
        return profileGoodcNameRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodcNameRules)) {
            return false;
        }
        ProfileGoodcNameRules profileGoodcNameRules = (ProfileGoodcNameRules) obj;
        return ValueObject.util_equals(this.real_user, profileGoodcNameRules.real_user) && ValueObject.util_equals(this.facebook, profileGoodcNameRules.facebook);
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
        List<Integer> list = this.real_user;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.facebook;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
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
