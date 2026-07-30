package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ProfileGoodcNameRules;
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
public class ProfileGoodcNameRules extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcnamerules";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Integer> facebook;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> real_user;
    public static ProtobufAdapter<ProfileGoodcNameRules> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcNameRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcNameRules.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileGoodcNameRules profileGoodcNameRules) {
            List<Integer> list = profileGoodcNameRules.real_user;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Integer> list2 = profileGoodcNameRules.facebook;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileGoodcNameRules).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcNameRules m14957parse(nb5 nb5Var) throws IOException {
            ProfileGoodcNameRules profileGoodcNameRules = new ProfileGoodcNameRules();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileGoodcNameRules.real_user == null) {
                        profileGoodcNameRules.real_user = new ArrayList();
                    }
                    if (profileGoodcNameRules.facebook != null) {
                        break;
                    }
                    profileGoodcNameRules.facebook = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    profileGoodcNameRules.real_user = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (profileGoodcNameRules.real_user == null) {
                            profileGoodcNameRules.real_user = new ArrayList();
                        }
                        if (profileGoodcNameRules.facebook != null) {
                            break;
                        }
                        profileGoodcNameRules.facebook = new ArrayList();
                        return profileGoodcNameRules;
                    }
                    profileGoodcNameRules.facebook = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileGoodcNameRules;
        }

        public void serialize(ProfileGoodcNameRules profileGoodcNameRules, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = profileGoodcNameRules.real_user;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = profileGoodcNameRules.facebook;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileGoodcNameRules> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcNameRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcNameRules.2
        public Class getDataClass() {
            return ProfileGoodcNameRules.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcNameRules m14958newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcNameRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcNameRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m564a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m565b(Integer num) {
        return num;
    }

    public static ProfileGoodcNameRules new_() {
        ProfileGoodcNameRules profileGoodcNameRules = new ProfileGoodcNameRules();
        profileGoodcNameRules.nullCheck();
        return profileGoodcNameRules;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileGoodcNameRules m14956clone() {
        ProfileGoodcNameRules profileGoodcNameRules = new ProfileGoodcNameRules();
        List<Integer> list = this.real_user;
        if (list != null) {
            profileGoodcNameRules.real_user = ValueObject.util_map(list, new w9j() { // from class: l.um90
                public final Object call(Object obj) {
                    return ProfileGoodcNameRules.m565b((Integer) obj);
                }
            });
        }
        List<Integer> list2 = this.facebook;
        if (list2 != null) {
            profileGoodcNameRules.facebook = ValueObject.util_map(list2, new w9j() { // from class: l.vm90
                public final Object call(Object obj) {
                    return ProfileGoodcNameRules.m564a((Integer) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Integer> list = this.real_user;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.facebook;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.real_user == null) {
            this.real_user = new ArrayList();
        }
        if (this.facebook == null) {
            this.facebook = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
