package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ProfileInputOrder;
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
public class ProfileInputOrder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileinputorder";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> normal;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> student;
    public static ProtobufAdapter<ProfileInputOrder> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileInputOrder>() { // from class: com.p1.mobile.putong.core.data.ProfileInputOrder.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileInputOrder profileInputOrder) {
            List<String> list = profileInputOrder.student;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = profileInputOrder.normal;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileInputOrder).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileInputOrder m14977parse(nb5 nb5Var) throws IOException {
            ProfileInputOrder profileInputOrder = new ProfileInputOrder();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileInputOrder.student == null) {
                        profileInputOrder.student = new ArrayList();
                    }
                    if (profileInputOrder.normal != null) {
                        break;
                    }
                    profileInputOrder.normal = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    profileInputOrder.student = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (profileInputOrder.student == null) {
                            profileInputOrder.student = new ArrayList();
                        }
                        if (profileInputOrder.normal != null) {
                            break;
                        }
                        profileInputOrder.normal = new ArrayList();
                        return profileInputOrder;
                    }
                    profileInputOrder.normal = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileInputOrder;
        }

        public void serialize(ProfileInputOrder profileInputOrder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = profileInputOrder.student;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = profileInputOrder.normal;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileInputOrder> JSON_ADAPTER = new ObjectJsonAdapter<ProfileInputOrder>() { // from class: com.p1.mobile.putong.core.data.ProfileInputOrder.2
        public Class getDataClass() {
            return ProfileInputOrder.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileInputOrder m14978newInstance() {
            return new ProfileInputOrder();
        }

        public boolean parseField(ProfileInputOrder profileInputOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("student")) {
                profileInputOrder.student = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(StickStatus.normal)) {
                return false;
            }
            profileInputOrder.normal = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfileInputOrder profileInputOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("student") || str.equals(StickStatus.normal)) {
                return true;
            }
            return super.parseFieldCheck(profileInputOrder, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ProfileInputOrder profileInputOrder, JsonGenerator jsonGenerator) throws IOException {
            if (profileInputOrder.student != null) {
                jsonGenerator.writeFieldName("student");
                JsonAdapter.serializeArray(profileInputOrder.student, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileInputOrder.normal != null) {
                jsonGenerator.writeFieldName(StickStatus.normal);
                JsonAdapter.serializeArray(profileInputOrder.normal, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileInputOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileInputOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m570a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m571b(String str) {
        return str;
    }

    public static ProfileInputOrder new_() {
        ProfileInputOrder profileInputOrder = new ProfileInputOrder();
        profileInputOrder.nullCheck();
        return profileInputOrder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileInputOrder m14976clone() {
        ProfileInputOrder profileInputOrder = new ProfileInputOrder();
        List<String> list = this.student;
        if (list != null) {
            profileInputOrder.student = ValueObject.util_map(list, new w9j() { // from class: l.dq90
                public final Object call(Object obj) {
                    return ProfileInputOrder.m571b((String) obj);
                }
            });
        }
        List<String> list2 = this.normal;
        if (list2 != null) {
            profileInputOrder.normal = ValueObject.util_map(list2, new w9j() { // from class: l.eq90
                public final Object call(Object obj) {
                    return ProfileInputOrder.m570a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.student;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.normal;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.student == null) {
            this.student = new ArrayList();
        }
        if (this.normal == null) {
            this.normal = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
