package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ProfileInputOrder;
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
public class ProfileInputOrder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileinputorder";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> normal;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> student;
    public static ProtobufAdapter<ProfileInputOrder> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileInputOrder>() { // from class: com.p1.mobile.putong.core.data.ProfileInputOrder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileInputOrder profileInputOrder) {
            List<String> list = profileInputOrder.student;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = profileInputOrder.normal;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            profileInputOrder.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileInputOrder parse(nb5 nb5Var) throws IOException {
            ProfileInputOrder profileInputOrder = new ProfileInputOrder();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileInputOrder.student == null) {
                        profileInputOrder.student = new ArrayList();
                    }
                    if (profileInputOrder.normal != null) {
                        break;
                    }
                    profileInputOrder.normal = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    profileInputOrder.student = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (profileInputOrder.student == null) {
                            profileInputOrder.student = new ArrayList();
                        }
                        if (profileInputOrder.normal != null) {
                            break;
                        }
                        profileInputOrder.normal = new ArrayList();
                        return profileInputOrder;
                    }
                    profileInputOrder.normal = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileInputOrder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileInputOrder profileInputOrder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = profileInputOrder.student;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = profileInputOrder.normal;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileInputOrder> JSON_ADAPTER = new ObjectJsonAdapter<ProfileInputOrder>() { // from class: com.p1.mobile.putong.core.data.ProfileInputOrder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileInputOrder.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileInputOrder newInstance() {
            return new ProfileInputOrder();
        }

        public boolean parseField(ProfileInputOrder profileInputOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("student")) {
                profileInputOrder.student = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("normal")) {
                return false;
            }
            profileInputOrder.normal = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfileInputOrder profileInputOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("student") || str.equals("normal")) {
                return true;
            }
            return super.parseFieldCheck(profileInputOrder, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileInputOrder profileInputOrder, JsonGenerator jsonGenerator) throws IOException {
            if (profileInputOrder.student != null) {
                jsonGenerator.writeFieldName("student");
                JsonAdapter.serializeArray(profileInputOrder.student, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileInputOrder.normal != null) {
                jsonGenerator.writeFieldName("normal");
                JsonAdapter.serializeArray(profileInputOrder.normal, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileInputOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileInputOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35768a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35769b(String str) {
        return str;
    }

    public static ProfileInputOrder new_() {
        ProfileInputOrder profileInputOrder = new ProfileInputOrder();
        profileInputOrder.nullCheck();
        return profileInputOrder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileInputOrder mo223809clone() {
        ProfileInputOrder profileInputOrder = new ProfileInputOrder();
        List<String> list = this.student;
        if (list != null) {
            profileInputOrder.student = ValueObject.util_map(list, new w9j() { // from class: l.dq90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileInputOrder.m35769b((String) obj);
                }
            });
        }
        List<String> list2 = this.normal;
        if (list2 != null) {
            profileInputOrder.normal = ValueObject.util_map(list2, new w9j() { // from class: l.eq90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileInputOrder.m35768a((String) obj);
                }
            });
        }
        return profileInputOrder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileInputOrder)) {
            return false;
        }
        ProfileInputOrder profileInputOrder = (ProfileInputOrder) obj;
        return ValueObject.util_equals(this.student, profileInputOrder.student) && ValueObject.util_equals(this.normal, profileInputOrder.normal);
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
        List<String> list = this.student;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.normal;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.student == null) {
            this.student = new ArrayList();
        }
        if (this.normal == null) {
            this.normal = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
