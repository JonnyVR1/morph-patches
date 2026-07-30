package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
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
public class ProfilePhoto extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilephoto";

    @NonNull
    @ProtobufIndex(index = 3)
    public String label;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<ProfilePhoto> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfilePhoto>() { // from class: com.p1.mobile.putong.core.data.ProfilePhoto.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfilePhoto profilePhoto) {
            String str = profilePhoto.url;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = profilePhoto.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = profilePhoto.label;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            profilePhoto.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfilePhoto parse(nb5 nb5Var) throws IOException {
            ProfilePhoto profilePhoto = new ProfilePhoto();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profilePhoto.type == null) {
                        profilePhoto.type = "";
                    }
                    if (profilePhoto.label == null) {
                        profilePhoto.label = "";
                    }
                    if (profilePhoto.url != null) {
                        break;
                    }
                    profilePhoto.url = "";
                    break;
                }
                if (iM158752u == 10) {
                    profilePhoto.url = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    profilePhoto.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (profilePhoto.type == null) {
                            profilePhoto.type = "";
                        }
                        if (profilePhoto.label == null) {
                            profilePhoto.label = "";
                        }
                        if (profilePhoto.url != null) {
                            break;
                        }
                        profilePhoto.url = "";
                        return profilePhoto;
                    }
                    profilePhoto.label = nb5Var.m158750s();
                }
            }
            return profilePhoto;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfilePhoto profilePhoto, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profilePhoto.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = profilePhoto.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = profilePhoto.label;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<ProfilePhoto> JSON_ADAPTER = new ObjectJsonAdapter<ProfilePhoto>() { // from class: com.p1.mobile.putong.core.data.ProfilePhoto.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfilePhoto.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfilePhoto newInstance() {
            return new ProfilePhoto();
        }

        public boolean parseField(ProfilePhoto profilePhoto, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "url":
                    profilePhoto.url = jsonParser.getValueAsString();
                    return true;
                case "type":
                    profilePhoto.type = jsonParser.getValueAsString();
                    return true;
                case "label":
                    profilePhoto.label = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfilePhoto profilePhoto, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "url":
                case "type":
                case "label":
                    return true;
                default:
                    return super.parseFieldCheck(profilePhoto, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfilePhoto profilePhoto, JsonGenerator jsonGenerator) throws IOException {
            String str = profilePhoto.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = profilePhoto.label;
            if (str2 != null) {
                jsonGenerator.writeStringField(Constants.ScionAnalytics.PARAM_LABEL, str2);
            }
            String str3 = profilePhoto.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfilePhoto) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfilePhoto) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfilePhoto new_() {
        ProfilePhoto profilePhoto = new ProfilePhoto();
        profilePhoto.nullCheck();
        return profilePhoto;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfilePhoto mo223809clone() {
        ProfilePhoto profilePhoto = new ProfilePhoto();
        profilePhoto.type = this.type;
        profilePhoto.label = this.label;
        profilePhoto.url = this.url;
        return profilePhoto;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfilePhoto)) {
            return false;
        }
        ProfilePhoto profilePhoto = (ProfilePhoto) obj;
        return ValueObject.util_equals(this.type, profilePhoto.type) && ValueObject.util_equals(this.label, profilePhoto.label) && ValueObject.util_equals(this.url, profilePhoto.url);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.label;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.label == null) {
            this.label = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
