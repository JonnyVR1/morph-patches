package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileGoodcCatagoryTestGroup extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodccatagorytestgroup";

    @ProtobufIndex(index = 2)
    public int goodc_test_max;

    @ProtobufIndex(index = 1)
    public int goodc_test_min;
    public static ProtobufAdapter<ProfileGoodcCatagoryTestGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcCatagoryTestGroup>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, profileGoodcCatagoryTestGroup.goodc_test_min) + CodedOutputByteBufferNano.m17281h(2, profileGoodcCatagoryTestGroup.goodc_test_max);
            profileGoodcCatagoryTestGroup.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcCatagoryTestGroup parse(nc5 nc5Var) throws IOException {
            ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup = new ProfileGoodcCatagoryTestGroup();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    profileGoodcCatagoryTestGroup.goodc_test_min = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return profileGoodcCatagoryTestGroup;
                    }
                    profileGoodcCatagoryTestGroup.goodc_test_max = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, profileGoodcCatagoryTestGroup.goodc_test_min);
            codedOutputByteBufferNano.m17305G(2, profileGoodcCatagoryTestGroup.goodc_test_max);
        }
    };
    public static JsonAdapter<ProfileGoodcCatagoryTestGroup> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcCatagoryTestGroup>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcCatagoryTestGroup.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodcCatagoryTestGroup newInstance() {
            return new ProfileGoodcCatagoryTestGroup();
        }

        public boolean parseField(ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("goodc_test_max")) {
                profileGoodcCatagoryTestGroup.goodc_test_max = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("goodc_test_min")) {
                return false;
            }
            profileGoodcCatagoryTestGroup.goodc_test_min = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("goodc_test_max") || str.equals("goodc_test_min")) {
                return true;
            }
            return super.parseFieldCheck(profileGoodcCatagoryTestGroup, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("goodc_test_min", profileGoodcCatagoryTestGroup.goodc_test_min);
            jsonGenerator.writeNumberField("goodc_test_max", profileGoodcCatagoryTestGroup.goodc_test_max);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcCatagoryTestGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcCatagoryTestGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodcCatagoryTestGroup new_() {
        ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup = new ProfileGoodcCatagoryTestGroup();
        profileGoodcCatagoryTestGroup.nullCheck();
        return profileGoodcCatagoryTestGroup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcCatagoryTestGroup mo225055clone() {
        ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup = new ProfileGoodcCatagoryTestGroup();
        profileGoodcCatagoryTestGroup.goodc_test_min = this.goodc_test_min;
        profileGoodcCatagoryTestGroup.goodc_test_max = this.goodc_test_max;
        return profileGoodcCatagoryTestGroup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodcCatagoryTestGroup)) {
            return false;
        }
        ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup = (ProfileGoodcCatagoryTestGroup) obj;
        return this.goodc_test_min == profileGoodcCatagoryTestGroup.goodc_test_min && this.goodc_test_max == profileGoodcCatagoryTestGroup.goodc_test_max;
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
        int i2 = (((i * 41) + this.goodc_test_min) * 41) + this.goodc_test_max;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
