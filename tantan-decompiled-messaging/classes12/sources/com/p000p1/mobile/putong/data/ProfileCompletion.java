package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.ProfileCompletion;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ProfileCompletion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilecompletion";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> briefIntroduction;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> progress;
    public static ProtobufAdapter<ProfileCompletion> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileCompletion>() { // from class: com.p1.mobile.putong.data.ProfileCompletion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileCompletion profileCompletion) {
            List<String> list = profileCompletion.briefIntroduction;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = profileCompletion.progress;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileCompletion).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileCompletion m18838parse(nb5 nb5Var) throws IOException {
            ProfileCompletion profileCompletion = new ProfileCompletion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileCompletion.briefIntroduction == null) {
                        profileCompletion.briefIntroduction = new ArrayList();
                    }
                    if (profileCompletion.progress != null) {
                        break;
                    }
                    profileCompletion.progress = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    profileCompletion.briefIntroduction = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (profileCompletion.briefIntroduction == null) {
                            profileCompletion.briefIntroduction = new ArrayList();
                        }
                        if (profileCompletion.progress != null) {
                            break;
                        }
                        profileCompletion.progress = new ArrayList();
                        return profileCompletion;
                    }
                    profileCompletion.progress = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileCompletion;
        }

        public void serialize(ProfileCompletion profileCompletion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = profileCompletion.briefIntroduction;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = profileCompletion.progress;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileCompletion> JSON_ADAPTER = new ObjectJsonAdapter<ProfileCompletion>() { // from class: com.p1.mobile.putong.data.ProfileCompletion.2
        public Class getDataClass() {
            return ProfileCompletion.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ProfileCompletion mo17830newInstance() {
            return new ProfileCompletion();
        }

        public boolean parseField(ProfileCompletion profileCompletion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("briefIntroduction")) {
                profileCompletion.briefIntroduction = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("progress")) {
                return false;
            }
            profileCompletion.progress = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfileCompletion profileCompletion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("briefIntroduction") || str.equals("progress")) {
                return true;
            }
            return super.parseFieldCheck(profileCompletion, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileCompletion profileCompletion, JsonGenerator jsonGenerator) throws IOException {
            if (profileCompletion.briefIntroduction != null) {
                jsonGenerator.writeFieldName("briefIntroduction");
                JsonAdapter.serializeArray(profileCompletion.briefIntroduction, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileCompletion.progress != null) {
                jsonGenerator.writeFieldName("progress");
                JsonAdapter.serializeArray(profileCompletion.progress, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileCompletion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileCompletion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m924a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m925b(String str) {
        return str;
    }

    public static ProfileCompletion new_() {
        ProfileCompletion profileCompletion = new ProfileCompletion();
        profileCompletion.nullCheck();
        return profileCompletion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileCompletion m18837clone() {
        ProfileCompletion profileCompletion = new ProfileCompletion();
        List<String> list = this.briefIntroduction;
        if (list != null) {
            profileCompletion.briefIntroduction = ValueObject.util_map(list, new w9j() { // from class: l.oi90
                public final Object call(Object obj) {
                    return ProfileCompletion.m925b((String) obj);
                }
            });
        }
        List<String> list2 = this.progress;
        if (list2 != null) {
            profileCompletion.progress = ValueObject.util_map(list2, new w9j() { // from class: l.pi90
                public final Object call(Object obj) {
                    return ProfileCompletion.m924a((String) obj);
                }
            });
        }
        return profileCompletion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileCompletion)) {
            return false;
        }
        ProfileCompletion profileCompletion = (ProfileCompletion) obj;
        return ValueObject.util_equals(this.briefIntroduction, profileCompletion.briefIntroduction) && ValueObject.util_equals(this.progress, profileCompletion.progress);
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
        List<String> list = this.briefIntroduction;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.progress;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.briefIntroduction == null) {
            this.briefIntroduction = new ArrayList();
        }
        if (this.progress == null) {
            this.progress = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
