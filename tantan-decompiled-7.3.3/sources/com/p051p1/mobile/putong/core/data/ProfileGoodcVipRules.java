package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ProfileGoodcVipRules;
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
public class ProfileGoodcVipRules extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcviprules";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> vip;
    public static ProtobufAdapter<ProfileGoodcVipRules> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcVipRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcVipRules.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodcVipRules profileGoodcVipRules) {
            List<Integer> list = profileGoodcVipRules.vip;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            profileGoodcVipRules.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcVipRules parse(nc5 nc5Var) throws IOException {
            ProfileGoodcVipRules profileGoodcVipRules = new ProfileGoodcVipRules();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (profileGoodcVipRules.vip != null) {
                        break;
                    }
                    profileGoodcVipRules.vip = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (profileGoodcVipRules.vip != null) {
                        break;
                    }
                    profileGoodcVipRules.vip = new ArrayList();
                    return profileGoodcVipRules;
                }
                profileGoodcVipRules.vip = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            return profileGoodcVipRules;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcVipRules profileGoodcVipRules, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = profileGoodcVipRules.vip;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileGoodcVipRules> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcVipRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcVipRules.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcVipRules.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodcVipRules newInstance() {
            return new ProfileGoodcVipRules();
        }

        public boolean parseField(ProfileGoodcVipRules profileGoodcVipRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("vip")) {
                return false;
            }
            profileGoodcVipRules.vip = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfileGoodcVipRules profileGoodcVipRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("vip")) {
                return true;
            }
            return super.parseFieldCheck(profileGoodcVipRules, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileGoodcVipRules profileGoodcVipRules, JsonGenerator jsonGenerator) throws IOException {
            if (profileGoodcVipRules.vip != null) {
                jsonGenerator.writeFieldName("vip");
                JsonAdapter.serializeArray(profileGoodcVipRules.vip, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcVipRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcVipRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m36770a(Integer num) {
        return num;
    }

    public static ProfileGoodcVipRules new_() {
        ProfileGoodcVipRules profileGoodcVipRules = new ProfileGoodcVipRules();
        profileGoodcVipRules.nullCheck();
        return profileGoodcVipRules;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcVipRules mo225055clone() {
        ProfileGoodcVipRules profileGoodcVipRules = new ProfileGoodcVipRules();
        List<Integer> list = this.vip;
        if (list != null) {
            profileGoodcVipRules.vip = ValueObject.util_map(list, new qcj() { // from class: l.dv90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileGoodcVipRules.m36770a((Integer) obj);
                }
            });
        }
        return profileGoodcVipRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProfileGoodcVipRules) {
            return ValueObject.util_equals(this.vip, ((ProfileGoodcVipRules) obj).vip);
        }
        return false;
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
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.vip == null) {
            this.vip = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
