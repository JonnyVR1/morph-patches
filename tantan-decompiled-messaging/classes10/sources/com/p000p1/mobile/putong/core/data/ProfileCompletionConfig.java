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
public class ProfileCompletionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilecompletionconfig";

    @ProtobufIndex(index = 1)
    public int self_introduction_picture_num;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public DatingPurpose weight;
    public static ProtobufAdapter<ProfileCompletionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileCompletionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileCompletionConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileCompletionConfig profileCompletionConfig) {
            int iH = CodedOutputByteBufferNano.h(1, profileCompletionConfig.self_introduction_picture_num);
            DatingPurpose datingPurpose = profileCompletionConfig.weight;
            if (datingPurpose != null) {
                iH += CodedOutputByteBufferNano.l(2, datingPurpose, DatingPurpose.PROTOBUF_ADAPTER);
            }
            ((MessageNano) profileCompletionConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileCompletionConfig m14925parse(nb5 nb5Var) throws IOException {
            ProfileCompletionConfig profileCompletionConfig = new ProfileCompletionConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileCompletionConfig.weight != null) {
                        break;
                    }
                    profileCompletionConfig.weight = DatingPurpose.new_();
                    break;
                }
                if (iU == 8) {
                    profileCompletionConfig.self_introduction_picture_num = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (profileCompletionConfig.weight != null) {
                            break;
                        }
                        profileCompletionConfig.weight = DatingPurpose.new_();
                        return profileCompletionConfig;
                    }
                    profileCompletionConfig.weight = (DatingPurpose) nb5Var.l(DatingPurpose.PROTOBUF_ADAPTER);
                }
            }
            return profileCompletionConfig;
        }

        public void serialize(ProfileCompletionConfig profileCompletionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, profileCompletionConfig.self_introduction_picture_num);
            DatingPurpose datingPurpose = profileCompletionConfig.weight;
            if (datingPurpose != null) {
                codedOutputByteBufferNano.K(2, datingPurpose, DatingPurpose.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileCompletionConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfileCompletionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfileCompletionConfig.2
        public Class getDataClass() {
            return ProfileCompletionConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileCompletionConfig m14926newInstance() {
            return new ProfileCompletionConfig();
        }

        public boolean parseField(ProfileCompletionConfig profileCompletionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("weight")) {
                profileCompletionConfig.weight = (DatingPurpose) DatingPurpose.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(ProfileCompletionConfig profileCompletionConfig, JsonGenerator jsonGenerator) throws IOException {
            if (profileCompletionConfig.weight != null) {
                jsonGenerator.writeFieldName("weight");
                DatingPurpose.JSON_ADAPTER.serialize(profileCompletionConfig.weight, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("self_introduction_picture_num", profileCompletionConfig.self_introduction_picture_num);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileCompletionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileCompletionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileCompletionConfig new_() {
        ProfileCompletionConfig profileCompletionConfig = new ProfileCompletionConfig();
        profileCompletionConfig.nullCheck();
        return profileCompletionConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileCompletionConfig m14924clone() {
        ProfileCompletionConfig profileCompletionConfig = new ProfileCompletionConfig();
        DatingPurpose datingPurpose = this.weight;
        if (datingPurpose != null) {
            profileCompletionConfig.weight = datingPurpose.m12582clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        DatingPurpose datingPurpose = this.weight;
        int iHashCode = ((i2 + (datingPurpose != null ? datingPurpose.hashCode() : 0)) * 41) + this.self_introduction_picture_num;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.weight == null) {
            this.weight = DatingPurpose.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
