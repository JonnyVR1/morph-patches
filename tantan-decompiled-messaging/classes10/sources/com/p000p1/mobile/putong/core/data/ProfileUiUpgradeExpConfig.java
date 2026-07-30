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
public class ProfileUiUpgradeExpConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileuiupgradeexpconfig";

    @ProtobufIndex(index = 1)
    public boolean exp;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int superlike_day_limit;
    public static ProtobufAdapter<ProfileUiUpgradeExpConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileUiUpgradeExpConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileUiUpgradeExpConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig) {
            int iB = CodedOutputByteBufferNano.b(1, profileUiUpgradeExpConfig.exp) + CodedOutputByteBufferNano.h(2, profileUiUpgradeExpConfig.superlike_day_limit);
            ((MessageNano) profileUiUpgradeExpConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileUiUpgradeExpConfig m15029parse(nb5 nb5Var) throws IOException {
            ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig = new ProfileUiUpgradeExpConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    profileUiUpgradeExpConfig.exp = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return profileUiUpgradeExpConfig;
                    }
                    profileUiUpgradeExpConfig.superlike_day_limit = nb5Var.j();
                }
            }
        }

        public void serialize(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, profileUiUpgradeExpConfig.exp);
            codedOutputByteBufferNano.G(2, profileUiUpgradeExpConfig.superlike_day_limit);
        }
    };
    public static JsonAdapter<ProfileUiUpgradeExpConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfileUiUpgradeExpConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileUiUpgradeExpConfig.2
        public Class getDataClass() {
            return ProfileUiUpgradeExpConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileUiUpgradeExpConfig m15030newInstance() {
            return new ProfileUiUpgradeExpConfig();
        }

        public boolean parseField(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("exp")) {
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
            if (str.equals("exp") || str.equals("superlike_day_limit")) {
                return true;
            }
            return super.parseFieldCheck(profileUiUpgradeExpConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("exp", profileUiUpgradeExpConfig.exp);
            jsonGenerator.writeNumberField("superlike_day_limit", profileUiUpgradeExpConfig.superlike_day_limit);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileUiUpgradeExpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileUiUpgradeExpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileUiUpgradeExpConfig new_() {
        ProfileUiUpgradeExpConfig profileUiUpgradeExpConfig = new ProfileUiUpgradeExpConfig();
        profileUiUpgradeExpConfig.nullCheck();
        return profileUiUpgradeExpConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileUiUpgradeExpConfig m15028clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.exp ? 1231 : 1237)) * 41) + this.superlike_day_limit;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
