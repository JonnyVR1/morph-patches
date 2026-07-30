package com.p046p1.mobile.putong.core.data;

import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileUiUpgradeExpConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileuiupgradeexpconfig";

    @ProtobufIndex(index = 1)
    public boolean exp;

    @ProtobufIndex(index = 2)
    public int superlike_day_limit;
    public static ProtobufAdapter<ProfileUiUpgradeExpConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileUiUpgradeExpConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileUiUpgradeExpConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, profileUiUpgradeExpConfig.exp) + CodedOutputByteBufferNano.m17226h(2, profileUiUpgradeExpConfig.superlike_day_limit);
            profileUiUpgradeExpConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileUiUpgradeExpConfig parse(nb5 nb5Var) throws IOException {
            ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig = new ProfileUiUpgradeExpConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    profileUiUpgradeExpConfig.exp = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return profileUiUpgradeExpConfig;
                    }
                    profileUiUpgradeExpConfig.superlike_day_limit = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, profileUiUpgradeExpConfig.exp);
            codedOutputByteBufferNano.m17250G(2, profileUiUpgradeExpConfig.superlike_day_limit);
        }
    };
    public static JsonAdapter<ProfileUiUpgradeExpConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfileUiUpgradeExpConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileUiUpgradeExpConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileUiUpgradeExpConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileUiUpgradeExpConfig newInstance() {
            return new ProfileUiUpgradeExpConfig();
        }

        public boolean parseField(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_EXP)) {
                profileUiUpgradeExpConfig.exp = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("superlike_day_limit")) {
                return false;
            }
            profileUiUpgradeExpConfig.superlike_day_limit = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_EXP) || str.equals("superlike_day_limit")) {
                return true;
            }
            return super.parseFieldCheck(profileUiUpgradeExpConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(AuthenticationTokenClaims.JSON_KEY_EXP, profileUiUpgradeExpConfig.exp);
            jsonGenerator.writeNumberField("superlike_day_limit", profileUiUpgradeExpConfig.superlike_day_limit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileUiUpgradeExpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileUiUpgradeExpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileUiUpgradeExpConfig new_() {
        ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig = new ProfileUiUpgradeExpConfig();
        profileUiUpgradeExpConfig.nullCheck();
        return profileUiUpgradeExpConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileUiUpgradeExpConfig mo223809clone() {
        ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig = new ProfileUiUpgradeExpConfig();
        profileUiUpgradeExpConfig.exp = this.exp;
        profileUiUpgradeExpConfig.superlike_day_limit = this.superlike_day_limit;
        return profileUiUpgradeExpConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileUiUpgradeExpConfig)) {
            return false;
        }
        ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig = (ProfileUiUpgradeExpConfig) obj;
        return this.exp == profileUiUpgradeExpConfig.exp && this.superlike_day_limit == profileUiUpgradeExpConfig.superlike_day_limit;
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
        int i2 = (((i * 41) + (this.exp ? 1231 : 1237)) * 41) + this.superlike_day_limit;
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
