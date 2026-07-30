package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ProfileUpgradeInterest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileupgradeinterest";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f20478id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<ProfileUpgradeInterest> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileUpgradeInterest>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeInterest.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileUpgradeInterest profileUpgradeInterest) {
            String str = profileUpgradeInterest.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = profileUpgradeInterest.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = profileUpgradeInterest.f20478id;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            profileUpgradeInterest.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileUpgradeInterest parse(nb5 nb5Var) throws IOException {
            ProfileUpgradeInterest profileUpgradeInterest = new ProfileUpgradeInterest();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileUpgradeInterest.name == null) {
                        profileUpgradeInterest.name = "";
                    }
                    if (profileUpgradeInterest.url == null) {
                        profileUpgradeInterest.url = "";
                    }
                    if (profileUpgradeInterest.f20478id != null) {
                        break;
                    }
                    profileUpgradeInterest.f20478id = "";
                    break;
                }
                if (iM158752u == 10) {
                    profileUpgradeInterest.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    profileUpgradeInterest.url = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (profileUpgradeInterest.name == null) {
                            profileUpgradeInterest.name = "";
                        }
                        if (profileUpgradeInterest.url == null) {
                            profileUpgradeInterest.url = "";
                        }
                        if (profileUpgradeInterest.f20478id != null) {
                            break;
                        }
                        profileUpgradeInterest.f20478id = "";
                        return profileUpgradeInterest;
                    }
                    profileUpgradeInterest.f20478id = nb5Var.m158750s();
                }
            }
            return profileUpgradeInterest;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileUpgradeInterest profileUpgradeInterest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileUpgradeInterest.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = profileUpgradeInterest.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = profileUpgradeInterest.f20478id;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<ProfileUpgradeInterest> JSON_ADAPTER = new ObjectJsonAdapter<ProfileUpgradeInterest>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeInterest.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileUpgradeInterest.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileUpgradeInterest newInstance() {
            return new ProfileUpgradeInterest();
        }

        public boolean parseField(ProfileUpgradeInterest profileUpgradeInterest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    profileUpgradeInterest.f20478id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    profileUpgradeInterest.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    profileUpgradeInterest.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileUpgradeInterest profileUpgradeInterest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "url":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(profileUpgradeInterest, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileUpgradeInterest profileUpgradeInterest, JsonGenerator jsonGenerator) throws IOException {
            String str = profileUpgradeInterest.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = profileUpgradeInterest.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = profileUpgradeInterest.f20478id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileUpgradeInterest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileUpgradeInterest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileUpgradeInterest new_() {
        ProfileUpgradeInterest profileUpgradeInterest = new ProfileUpgradeInterest();
        profileUpgradeInterest.nullCheck();
        return profileUpgradeInterest;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileUpgradeInterest mo223809clone() {
        ProfileUpgradeInterest profileUpgradeInterest = new ProfileUpgradeInterest();
        profileUpgradeInterest.name = this.name;
        profileUpgradeInterest.url = this.url;
        profileUpgradeInterest.f20478id = this.f20478id;
        return profileUpgradeInterest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileUpgradeInterest)) {
            return false;
        }
        ProfileUpgradeInterest profileUpgradeInterest = (ProfileUpgradeInterest) obj;
        return ValueObject.util_equals(this.name, profileUpgradeInterest.name) && ValueObject.util_equals(this.url, profileUpgradeInterest.url) && ValueObject.util_equals(this.f20478id, profileUpgradeInterest.f20478id);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f20478id;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.f20478id == null) {
            this.f20478id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
