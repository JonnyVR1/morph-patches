package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ProfileGoodcCatagory;
import com.p051p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup;
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
public class ProfileGoodcCatagory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodccatagory";

    @ProtobufIndex(index = 2)
    public int divisor;

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Integer> goodc_num_config;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<ProfileGoodcCatagoryTestGroup> goodc_test_group;

    @ProtobufIndex(index = 5)
    public int goodc_total_num;
    public static ProtobufAdapter<ProfileGoodcCatagory> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcCatagory>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcCatagory.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodcCatagory profileGoodcCatagory) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, profileGoodcCatagory.enabled) + CodedOutputByteBufferNano.m17281h(2, profileGoodcCatagory.divisor);
            List<ProfileGoodcCatagoryTestGroup> list = profileGoodcCatagory.goodc_test_group;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, list, ProfileGoodcCatagoryTestGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = profileGoodcCatagory.goodc_num_config;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(5, profileGoodcCatagory.goodc_total_num);
            profileGoodcCatagory.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcCatagory parse(nc5 nc5Var) throws IOException {
            ProfileGoodcCatagory profileGoodcCatagory = new ProfileGoodcCatagory();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (profileGoodcCatagory.goodc_test_group == null) {
                        profileGoodcCatagory.goodc_test_group = new ArrayList();
                    }
                    if (profileGoodcCatagory.goodc_num_config != null) {
                        break;
                    }
                    profileGoodcCatagory.goodc_num_config = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    profileGoodcCatagory.enabled = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    profileGoodcCatagory.divisor = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    profileGoodcCatagory.goodc_test_group = (List) nc5Var.m162488l(ProfileGoodcCatagoryTestGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 34) {
                    profileGoodcCatagory.goodc_num_config = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 40) {
                        if (profileGoodcCatagory.goodc_test_group == null) {
                            profileGoodcCatagory.goodc_test_group = new ArrayList();
                        }
                        if (profileGoodcCatagory.goodc_num_config != null) {
                            break;
                        }
                        profileGoodcCatagory.goodc_num_config = new ArrayList();
                        return profileGoodcCatagory;
                    }
                    profileGoodcCatagory.goodc_total_num = nc5Var.m162486j();
                }
            }
            return profileGoodcCatagory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcCatagory profileGoodcCatagory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, profileGoodcCatagory.enabled);
            codedOutputByteBufferNano.m17305G(2, profileGoodcCatagory.divisor);
            List<ProfileGoodcCatagoryTestGroup> list = profileGoodcCatagory.goodc_test_group;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProfileGoodcCatagoryTestGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = profileGoodcCatagory.goodc_num_config;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(4, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(5, profileGoodcCatagory.goodc_total_num);
        }
    };
    public static JsonAdapter<ProfileGoodcCatagory> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcCatagory>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcCatagory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcCatagory.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodcCatagory newInstance() {
            return new ProfileGoodcCatagory();
        }

        public boolean parseField(ProfileGoodcCatagory profileGoodcCatagory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "goodc_test_group":
                    profileGoodcCatagory.goodc_test_group = JsonAdapter.parseArray(jsonParser, ProfileGoodcCatagoryTestGroup.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "goodc_total_num":
                    profileGoodcCatagory.goodc_total_num = jsonParser.getValueAsInt();
                    return true;
                case "enabled":
                    profileGoodcCatagory.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "goodc_num_config":
                    profileGoodcCatagory.goodc_num_config = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "divisor":
                    profileGoodcCatagory.divisor = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileGoodcCatagory profileGoodcCatagory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "goodc_test_group":
                case "goodc_total_num":
                case "enabled":
                case "goodc_num_config":
                case "divisor":
                    return true;
                default:
                    return super.parseFieldCheck(profileGoodcCatagory, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileGoodcCatagory profileGoodcCatagory, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", profileGoodcCatagory.enabled);
            jsonGenerator.writeNumberField("divisor", profileGoodcCatagory.divisor);
            if (profileGoodcCatagory.goodc_test_group != null) {
                jsonGenerator.writeFieldName("goodc_test_group");
                JsonAdapter.serializeArray(profileGoodcCatagory.goodc_test_group, jsonGenerator, ProfileGoodcCatagoryTestGroup.JSON_ADAPTER);
            }
            if (profileGoodcCatagory.goodc_num_config != null) {
                jsonGenerator.writeFieldName("goodc_num_config");
                JsonAdapter.serializeArray(profileGoodcCatagory.goodc_num_config, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("goodc_total_num", profileGoodcCatagory.goodc_total_num);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcCatagory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcCatagory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m36764b(Integer num) {
        return num;
    }

    public static ProfileGoodcCatagory new_() {
        ProfileGoodcCatagory profileGoodcCatagory = new ProfileGoodcCatagory();
        profileGoodcCatagory.nullCheck();
        return profileGoodcCatagory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcCatagory mo225055clone() {
        ProfileGoodcCatagory profileGoodcCatagory = new ProfileGoodcCatagory();
        profileGoodcCatagory.enabled = this.enabled;
        profileGoodcCatagory.divisor = this.divisor;
        List<ProfileGoodcCatagoryTestGroup> list = this.goodc_test_group;
        if (list != null) {
            profileGoodcCatagory.goodc_test_group = ValueObject.util_map(list, new qcj() { // from class: l.uu90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ProfileGoodcCatagoryTestGroup) obj).mo225055clone();
                }
            });
        }
        List<Integer> list2 = this.goodc_num_config;
        if (list2 != null) {
            profileGoodcCatagory.goodc_num_config = ValueObject.util_map(list2, new qcj() { // from class: l.vu90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileGoodcCatagory.m36764b((Integer) obj);
                }
            });
        }
        profileGoodcCatagory.goodc_total_num = this.goodc_total_num;
        return profileGoodcCatagory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodcCatagory)) {
            return false;
        }
        ProfileGoodcCatagory profileGoodcCatagory = (ProfileGoodcCatagory) obj;
        return this.enabled == profileGoodcCatagory.enabled && this.divisor == profileGoodcCatagory.divisor && ValueObject.util_equals(this.goodc_test_group, profileGoodcCatagory.goodc_test_group) && ValueObject.util_equals(this.goodc_num_config, profileGoodcCatagory.goodc_num_config) && this.goodc_total_num == profileGoodcCatagory.goodc_total_num;
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
        int i2 = ((((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + this.divisor) * 41;
        List<ProfileGoodcCatagoryTestGroup> list = this.goodc_test_group;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.goodc_num_config;
        int iHashCode2 = ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + this.goodc_total_num;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.goodc_test_group == null) {
            this.goodc_test_group = new ArrayList();
        }
        if (this.goodc_num_config == null) {
            this.goodc_num_config = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
