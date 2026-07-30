package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ProfileGoodcCatagory;
import com.p046p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup;
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
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, profileGoodcCatagory.enabled) + CodedOutputByteBufferNano.m17226h(2, profileGoodcCatagory.divisor);
            List<ProfileGoodcCatagoryTestGroup> list = profileGoodcCatagory.goodc_test_group;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(3, list, ProfileGoodcCatagoryTestGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = profileGoodcCatagory.goodc_num_config;
            if (list2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17220b + CodedOutputByteBufferNano.m17226h(5, profileGoodcCatagory.goodc_total_num);
            profileGoodcCatagory.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcCatagory parse(nb5 nb5Var) throws IOException {
            ProfileGoodcCatagory profileGoodcCatagory = new ProfileGoodcCatagory();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileGoodcCatagory.goodc_test_group == null) {
                        profileGoodcCatagory.goodc_test_group = new ArrayList();
                    }
                    if (profileGoodcCatagory.goodc_num_config != null) {
                        break;
                    }
                    profileGoodcCatagory.goodc_num_config = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    profileGoodcCatagory.enabled = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    profileGoodcCatagory.divisor = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    profileGoodcCatagory.goodc_test_group = (List) nb5Var.m158743l(ProfileGoodcCatagoryTestGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    profileGoodcCatagory.goodc_num_config = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 40) {
                        if (profileGoodcCatagory.goodc_test_group == null) {
                            profileGoodcCatagory.goodc_test_group = new ArrayList();
                        }
                        if (profileGoodcCatagory.goodc_num_config != null) {
                            break;
                        }
                        profileGoodcCatagory.goodc_num_config = new ArrayList();
                        return profileGoodcCatagory;
                    }
                    profileGoodcCatagory.goodc_total_num = nb5Var.m158741j();
                }
            }
            return profileGoodcCatagory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcCatagory profileGoodcCatagory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, profileGoodcCatagory.enabled);
            codedOutputByteBufferNano.m17250G(2, profileGoodcCatagory.divisor);
            List<ProfileGoodcCatagoryTestGroup> list = profileGoodcCatagory.goodc_test_group;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProfileGoodcCatagoryTestGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = profileGoodcCatagory.goodc_num_config;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(4, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(5, profileGoodcCatagory.goodc_total_num);
        }
    };
    public static JsonAdapter<ProfileGoodcCatagory> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcCatagory>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcCatagory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcCatagory.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcCatagory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcCatagory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m35761b(Integer num) {
        return num;
    }

    public static ProfileGoodcCatagory new_() {
        ProfileGoodcCatagory profileGoodcCatagory = new ProfileGoodcCatagory();
        profileGoodcCatagory.nullCheck();
        return profileGoodcCatagory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcCatagory mo223809clone() {
        ProfileGoodcCatagory profileGoodcCatagory = new ProfileGoodcCatagory();
        profileGoodcCatagory.enabled = this.enabled;
        profileGoodcCatagory.divisor = this.divisor;
        List<ProfileGoodcCatagoryTestGroup> list = this.goodc_test_group;
        if (list != null) {
            profileGoodcCatagory.goodc_test_group = ValueObject.util_map(list, new w9j() { // from class: l.qm90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ProfileGoodcCatagoryTestGroup) obj).mo223809clone();
                }
            });
        }
        List<Integer> list2 = this.goodc_num_config;
        if (list2 != null) {
            profileGoodcCatagory.goodc_num_config = ValueObject.util_map(list2, new w9j() { // from class: l.rm90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileGoodcCatagory.m35761b((Integer) obj);
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
