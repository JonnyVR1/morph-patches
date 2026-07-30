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
public class ProfileCountInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilecountinfo";

    @ProtobufIndex(index = 2)
    public int count;

    @NonNull
    @ProtobufIndex(index = 1)
    public String profile;
    public static ProtobufAdapter<ProfileCountInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileCountInfo>() { // from class: com.p1.mobile.putong.core.data.ProfileCountInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileCountInfo profileCountInfo) {
            String str = profileCountInfo.profile;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, profileCountInfo.count);
            profileCountInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileCountInfo parse(nb5 nb5Var) throws IOException {
            ProfileCountInfo profileCountInfo = new ProfileCountInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileCountInfo.profile != null) {
                        break;
                    }
                    profileCountInfo.profile = "";
                    break;
                }
                if (iM158752u == 10) {
                    profileCountInfo.profile = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (profileCountInfo.profile != null) {
                            break;
                        }
                        profileCountInfo.profile = "";
                        return profileCountInfo;
                    }
                    profileCountInfo.count = nb5Var.m158741j();
                }
            }
            return profileCountInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileCountInfo profileCountInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileCountInfo.profile;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, profileCountInfo.count);
        }
    };
    public static JsonAdapter<ProfileCountInfo> JSON_ADAPTER = new ObjectJsonAdapter<ProfileCountInfo>() { // from class: com.p1.mobile.putong.core.data.ProfileCountInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileCountInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileCountInfo newInstance() {
            return new ProfileCountInfo();
        }

        public boolean parseField(ProfileCountInfo profileCountInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("profile")) {
                profileCountInfo.profile = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            profileCountInfo.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ProfileCountInfo profileCountInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("profile") || str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(profileCountInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileCountInfo profileCountInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = profileCountInfo.profile;
            if (str != null) {
                jsonGenerator.writeStringField("profile", str);
            }
            jsonGenerator.writeNumberField("count", profileCountInfo.count);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileCountInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileCountInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileCountInfo new_() {
        ProfileCountInfo profileCountInfo = new ProfileCountInfo();
        profileCountInfo.nullCheck();
        return profileCountInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileCountInfo mo223809clone() {
        ProfileCountInfo profileCountInfo = new ProfileCountInfo();
        profileCountInfo.profile = this.profile;
        profileCountInfo.count = this.count;
        return profileCountInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileCountInfo)) {
            return false;
        }
        ProfileCountInfo profileCountInfo = (ProfileCountInfo) obj;
        return ValueObject.util_equals(this.profile, profileCountInfo.profile) && this.count == profileCountInfo.count;
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
        String str = this.profile;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.profile == null) {
            this.profile = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
