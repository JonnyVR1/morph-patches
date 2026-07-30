package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ProfileLikemeNumberConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikemenumberconfig";

    @ProtobufIndex(index = 1)
    public boolean fullswitch;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProfileLikeConfigType showgenderswitch;
    public static ProtobufAdapter<ProfileLikemeNumberConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikemeNumberConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileLikemeNumberConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileLikemeNumberConfig profileLikemeNumberConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, profileLikemeNumberConfig.fullswitch);
            ProfileLikeConfigType profileLikeConfigType = profileLikemeNumberConfig.showgenderswitch;
            if (profileLikeConfigType != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, profileLikeConfigType, ProfileLikeConfigType.PROTOBUF_ADAPTER);
            }
            profileLikemeNumberConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikemeNumberConfig parse(nc5 nc5Var) throws IOException {
            ProfileLikemeNumberConfig profileLikemeNumberConfig = new ProfileLikemeNumberConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (profileLikemeNumberConfig.showgenderswitch != null) {
                        break;
                    }
                    profileLikemeNumberConfig.showgenderswitch = (ProfileLikeConfigType) ProfileLikeConfigType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    profileLikemeNumberConfig.fullswitch = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (profileLikemeNumberConfig.showgenderswitch != null) {
                            break;
                        }
                        profileLikemeNumberConfig.showgenderswitch = (ProfileLikeConfigType) ProfileLikeConfigType.JSON_ADAPTER.defaultEnum();
                        return profileLikemeNumberConfig;
                    }
                    profileLikemeNumberConfig.showgenderswitch = (ProfileLikeConfigType) nc5Var.m162488l(ProfileLikeConfigType.PROTOBUF_ADAPTER);
                }
            }
            return profileLikemeNumberConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLikemeNumberConfig profileLikemeNumberConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, profileLikemeNumberConfig.fullswitch);
            ProfileLikeConfigType profileLikeConfigType = profileLikemeNumberConfig.showgenderswitch;
            if (profileLikeConfigType != null) {
                codedOutputByteBufferNano.m17309K(2, profileLikeConfigType, ProfileLikeConfigType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileLikemeNumberConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikemeNumberConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileLikemeNumberConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikemeNumberConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileLikemeNumberConfig newInstance() {
            return new ProfileLikemeNumberConfig();
        }

        public boolean parseField(ProfileLikemeNumberConfig profileLikemeNumberConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showgenderswitch")) {
                profileLikemeNumberConfig.showgenderswitch = ProfileLikeConfigType.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("fullswitch")) {
                return false;
            }
            profileLikemeNumberConfig.fullswitch = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ProfileLikemeNumberConfig profileLikemeNumberConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showgenderswitch") || str.equals("fullswitch")) {
                return true;
            }
            return super.parseFieldCheck(profileLikemeNumberConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLikemeNumberConfig profileLikemeNumberConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fullswitch", profileLikemeNumberConfig.fullswitch);
            if (profileLikemeNumberConfig.showgenderswitch != null) {
                jsonGenerator.writeFieldName("showgenderswitch");
                ProfileLikeConfigType.JSON_ADAPTER.serialize(profileLikemeNumberConfig.showgenderswitch, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikemeNumberConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikemeNumberConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikemeNumberConfig new_() {
        ProfileLikemeNumberConfig profileLikemeNumberConfig = new ProfileLikemeNumberConfig();
        profileLikemeNumberConfig.nullCheck();
        return profileLikemeNumberConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileLikemeNumberConfig mo225055clone() {
        ProfileLikemeNumberConfig profileLikemeNumberConfig = new ProfileLikemeNumberConfig();
        profileLikemeNumberConfig.fullswitch = this.fullswitch;
        profileLikemeNumberConfig.showgenderswitch = this.showgenderswitch;
        return profileLikemeNumberConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLikemeNumberConfig)) {
            return false;
        }
        ProfileLikemeNumberConfig profileLikemeNumberConfig = (ProfileLikemeNumberConfig) obj;
        return this.fullswitch == profileLikemeNumberConfig.fullswitch && ValueObject.util_equals(this.showgenderswitch, profileLikemeNumberConfig.showgenderswitch);
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
        int i2 = ((i * 41) + (this.fullswitch ? 1231 : 1237)) * 41;
        ProfileLikeConfigType profileLikeConfigType = this.showgenderswitch;
        int iHashCode = i2 + (profileLikeConfigType != null ? profileLikeConfigType.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showgenderswitch == null) {
            this.showgenderswitch = (ProfileLikeConfigType) ProfileLikeConfigType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
