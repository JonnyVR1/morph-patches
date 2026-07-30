package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ProfileGoodcCatagoryTestGroup extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodccatagorytestgroup";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int goodc_test_max;

    @ProtobufIndex(index = 1)
    public int goodc_test_min;
    public static ProtobufAdapter<ProfileGoodcCatagoryTestGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcCatagoryTestGroup>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup) {
            int iH = CodedOutputByteBufferNano.h(1, profileGoodcCatagoryTestGroup.goodc_test_min) + CodedOutputByteBufferNano.h(2, profileGoodcCatagoryTestGroup.goodc_test_max);
            ((MessageNano) profileGoodcCatagoryTestGroup).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcCatagoryTestGroup m14945parse(nb5 nb5Var) throws IOException {
            ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup = new ProfileGoodcCatagoryTestGroup();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    profileGoodcCatagoryTestGroup.goodc_test_min = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return profileGoodcCatagoryTestGroup;
                    }
                    profileGoodcCatagoryTestGroup.goodc_test_max = nb5Var.j();
                }
            }
        }

        public void serialize(ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, profileGoodcCatagoryTestGroup.goodc_test_min);
            codedOutputByteBufferNano.G(2, profileGoodcCatagoryTestGroup.goodc_test_max);
        }
    };
    public static JsonAdapter<ProfileGoodcCatagoryTestGroup> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcCatagoryTestGroup>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup.2
        public Class getDataClass() {
            return ProfileGoodcCatagoryTestGroup.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcCatagoryTestGroup m14946newInstance() {
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

        public void serializeFields(ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("goodc_test_min", profileGoodcCatagoryTestGroup.goodc_test_min);
            jsonGenerator.writeNumberField("goodc_test_max", profileGoodcCatagoryTestGroup.goodc_test_max);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcCatagoryTestGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcCatagoryTestGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodcCatagoryTestGroup new_() {
        ProfileGoodcCatagoryTestGroup profileGoodcCatagoryTestGroup = new ProfileGoodcCatagoryTestGroup();
        profileGoodcCatagoryTestGroup.nullCheck();
        return profileGoodcCatagoryTestGroup;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileGoodcCatagoryTestGroup m14944clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.goodc_test_min) * 41) + this.goodc_test_max;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
