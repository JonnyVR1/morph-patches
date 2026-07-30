package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.ProfileCompletion;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileCompletion profileCompletion) {
            List<String> list = profileCompletion.briefIntroduction;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = profileCompletion.progress;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            profileCompletion.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileCompletion parse(nb5 nb5Var) throws IOException {
            ProfileCompletion profileCompletion = new ProfileCompletion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileCompletion.briefIntroduction == null) {
                        profileCompletion.briefIntroduction = new ArrayList();
                    }
                    if (profileCompletion.progress != null) {
                        break;
                    }
                    profileCompletion.progress = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    profileCompletion.briefIntroduction = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (profileCompletion.briefIntroduction == null) {
                            profileCompletion.briefIntroduction = new ArrayList();
                        }
                        if (profileCompletion.progress != null) {
                            break;
                        }
                        profileCompletion.progress = new ArrayList();
                        return profileCompletion;
                    }
                    profileCompletion.progress = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileCompletion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileCompletion profileCompletion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = profileCompletion.briefIntroduction;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = profileCompletion.progress;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileCompletion> JSON_ADAPTER = new ObjectJsonAdapter<ProfileCompletion>() { // from class: com.p1.mobile.putong.data.ProfileCompletion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileCompletion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileCompletion newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileCompletion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileCompletion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60006a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60007b(String str) {
        return str;
    }

    public static ProfileCompletion new_() {
        ProfileCompletion profileCompletion = new ProfileCompletion();
        profileCompletion.nullCheck();
        return profileCompletion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileCompletion mo223809clone() {
        ProfileCompletion profileCompletion = new ProfileCompletion();
        List<String> list = this.briefIntroduction;
        if (list != null) {
            profileCompletion.briefIntroduction = ValueObject.util_map(list, new w9j() { // from class: l.oi90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileCompletion.m60007b((String) obj);
                }
            });
        }
        List<String> list2 = this.progress;
        if (list2 != null) {
            profileCompletion.progress = ValueObject.util_map(list2, new w9j() { // from class: l.pi90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileCompletion.m60006a((String) obj);
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
        List<String> list = this.briefIntroduction;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.progress;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.briefIntroduction == null) {
            this.briefIntroduction = new ArrayList();
        }
        if (this.progress == null) {
            this.progress = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
