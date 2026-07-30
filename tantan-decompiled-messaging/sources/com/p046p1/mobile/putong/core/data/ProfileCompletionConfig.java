package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ProfileCompletionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilecompletionconfig";

    @ProtobufIndex(index = 1)
    public int self_introduction_picture_num;

    @NonNull
    @ProtobufIndex(index = 2)
    public DatingPurpose weight;
    public static ProtobufAdapter<ProfileCompletionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileCompletionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileCompletionConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileCompletionConfig profileCompletionConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, profileCompletionConfig.self_introduction_picture_num);
            DatingPurpose datingPurpose = profileCompletionConfig.weight;
            if (datingPurpose != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, datingPurpose, DatingPurpose.PROTOBUF_ADAPTER);
            }
            profileCompletionConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileCompletionConfig parse(nb5 nb5Var) throws IOException {
            ProfileCompletionConfig profileCompletionConfig = new ProfileCompletionConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileCompletionConfig.weight != null) {
                        break;
                    }
                    profileCompletionConfig.weight = DatingPurpose.new_();
                    break;
                }
                if (iM158752u == 8) {
                    profileCompletionConfig.self_introduction_picture_num = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (profileCompletionConfig.weight != null) {
                            break;
                        }
                        profileCompletionConfig.weight = DatingPurpose.new_();
                        return profileCompletionConfig;
                    }
                    profileCompletionConfig.weight = (DatingPurpose) nb5Var.m158743l(DatingPurpose.PROTOBUF_ADAPTER);
                }
            }
            return profileCompletionConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileCompletionConfig profileCompletionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, profileCompletionConfig.self_introduction_picture_num);
            DatingPurpose datingPurpose = profileCompletionConfig.weight;
            if (datingPurpose != null) {
                codedOutputByteBufferNano.m17254K(2, datingPurpose, DatingPurpose.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileCompletionConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfileCompletionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileCompletionConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileCompletionConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileCompletionConfig newInstance() {
            return new ProfileCompletionConfig();
        }

        public boolean parseField(ProfileCompletionConfig profileCompletionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("weight")) {
                profileCompletionConfig.weight = DatingPurpose.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("self_introduction_picture_num")) {
                return false;
            }
            profileCompletionConfig.self_introduction_picture_num = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ProfileCompletionConfig profileCompletionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("weight") || str.equals("self_introduction_picture_num")) {
                return true;
            }
            return super.parseFieldCheck(profileCompletionConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileCompletionConfig profileCompletionConfig, JsonGenerator jsonGenerator) throws IOException {
            if (profileCompletionConfig.weight != null) {
                jsonGenerator.writeFieldName("weight");
                DatingPurpose.JSON_ADAPTER.serialize(profileCompletionConfig.weight, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("self_introduction_picture_num", profileCompletionConfig.self_introduction_picture_num);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileCompletionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileCompletionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileCompletionConfig new_() {
        ProfileCompletionConfig profileCompletionConfig = new ProfileCompletionConfig();
        profileCompletionConfig.nullCheck();
        return profileCompletionConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileCompletionConfig mo223809clone() {
        ProfileCompletionConfig profileCompletionConfig = new ProfileCompletionConfig();
        DatingPurpose datingPurpose = this.weight;
        if (datingPurpose != null) {
            profileCompletionConfig.weight = datingPurpose.mo223809clone();
        }
        profileCompletionConfig.self_introduction_picture_num = this.self_introduction_picture_num;
        return profileCompletionConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileCompletionConfig)) {
            return false;
        }
        ProfileCompletionConfig profileCompletionConfig = (ProfileCompletionConfig) obj;
        return ValueObject.util_equals(this.weight, profileCompletionConfig.weight) && this.self_introduction_picture_num == profileCompletionConfig.self_introduction_picture_num;
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
        DatingPurpose datingPurpose = this.weight;
        int iHashCode = ((i2 + (datingPurpose != null ? datingPurpose.hashCode() : 0)) * 41) + this.self_introduction_picture_num;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.weight == null) {
            this.weight = DatingPurpose.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
