package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ProfileLikemeNumberConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikemenumberconfig";

    @ProtobufIndex(index = 1)
    public boolean fullswitch;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ProfileLikeConfigType showgenderswitch;
    public static ProtobufAdapter<ProfileLikemeNumberConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikemeNumberConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileLikemeNumberConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLikemeNumberConfig profileLikemeNumberConfig) {
            int iB = CodedOutputByteBufferNano.b(1, profileLikemeNumberConfig.fullswitch);
            ProfileLikeConfigType profileLikeConfigType = profileLikemeNumberConfig.showgenderswitch;
            if (profileLikeConfigType != null) {
                iB += CodedOutputByteBufferNano.l(2, profileLikeConfigType, ProfileLikeConfigType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) profileLikemeNumberConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLikemeNumberConfig m15005parse(nb5 nb5Var) throws IOException {
            ProfileLikemeNumberConfig profileLikemeNumberConfig = new ProfileLikemeNumberConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileLikemeNumberConfig.showgenderswitch != null) {
                        break;
                    }
                    profileLikemeNumberConfig.showgenderswitch = (ProfileLikeConfigType) ProfileLikeConfigType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    profileLikemeNumberConfig.fullswitch = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (profileLikemeNumberConfig.showgenderswitch != null) {
                            break;
                        }
                        profileLikemeNumberConfig.showgenderswitch = (ProfileLikeConfigType) ProfileLikeConfigType.JSON_ADAPTER.defaultEnum();
                        return profileLikemeNumberConfig;
                    }
                    profileLikemeNumberConfig.showgenderswitch = (ProfileLikeConfigType) nb5Var.l(ProfileLikeConfigType.PROTOBUF_ADAPTER);
                }
            }
            return profileLikemeNumberConfig;
        }

        public void serialize(ProfileLikemeNumberConfig profileLikemeNumberConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, profileLikemeNumberConfig.fullswitch);
            ProfileLikeConfigType profileLikeConfigType = profileLikemeNumberConfig.showgenderswitch;
            if (profileLikeConfigType != null) {
                codedOutputByteBufferNano.K(2, profileLikeConfigType, ProfileLikeConfigType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileLikemeNumberConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikemeNumberConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileLikemeNumberConfig.2
        public Class getDataClass() {
            return ProfileLikemeNumberConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileLikemeNumberConfig m15006newInstance() {
            return new ProfileLikemeNumberConfig();
        }

        public boolean parseField(ProfileLikemeNumberConfig profileLikemeNumberConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showgenderswitch")) {
                profileLikemeNumberConfig.showgenderswitch = (ProfileLikeConfigType) ProfileLikeConfigType.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(ProfileLikemeNumberConfig profileLikemeNumberConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fullswitch", profileLikemeNumberConfig.fullswitch);
            if (profileLikemeNumberConfig.showgenderswitch != null) {
                jsonGenerator.writeFieldName("showgenderswitch");
                ProfileLikeConfigType.JSON_ADAPTER.serialize(profileLikemeNumberConfig.showgenderswitch, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikemeNumberConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikemeNumberConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikemeNumberConfig new_() {
        ProfileLikemeNumberConfig profileLikemeNumberConfig = new ProfileLikemeNumberConfig();
        profileLikemeNumberConfig.nullCheck();
        return profileLikemeNumberConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLikemeNumberConfig m15004clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.fullswitch ? 1231 : 1237)) * 41;
        ProfileLikeConfigType profileLikeConfigType = this.showgenderswitch;
        int iHashCode = i2 + (profileLikeConfigType != null ? profileLikeConfigType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.showgenderswitch == null) {
            this.showgenderswitch = (ProfileLikeConfigType) ProfileLikeConfigType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
