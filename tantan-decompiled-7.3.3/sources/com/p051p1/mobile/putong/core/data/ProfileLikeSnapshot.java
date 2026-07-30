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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileLikeSnapshot extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikesnapshot";

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    @ProtobufIndex(index = 4)
    public boolean hasComment;

    @NonNull
    @ProtobufIndex(index = 2)
    public String picture;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<ProfileLikeSnapshot> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikeSnapshot>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeSnapshot.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileLikeSnapshot profileLikeSnapshot) {
            String str = profileLikeSnapshot.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = profileLikeSnapshot.picture;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = profileLikeSnapshot.desc;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, profileLikeSnapshot.hasComment);
            profileLikeSnapshot.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikeSnapshot parse(nc5 nc5Var) throws IOException {
            ProfileLikeSnapshot profileLikeSnapshot = new ProfileLikeSnapshot();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (profileLikeSnapshot.title == null) {
                        profileLikeSnapshot.title = "";
                    }
                    if (profileLikeSnapshot.picture == null) {
                        profileLikeSnapshot.picture = "";
                    }
                    if (profileLikeSnapshot.desc != null) {
                        break;
                    }
                    profileLikeSnapshot.desc = "";
                    break;
                }
                if (iM162497u == 10) {
                    profileLikeSnapshot.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    profileLikeSnapshot.picture = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    profileLikeSnapshot.desc = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
                        if (profileLikeSnapshot.title == null) {
                            profileLikeSnapshot.title = "";
                        }
                        if (profileLikeSnapshot.picture == null) {
                            profileLikeSnapshot.picture = "";
                        }
                        if (profileLikeSnapshot.desc != null) {
                            break;
                        }
                        profileLikeSnapshot.desc = "";
                        return profileLikeSnapshot;
                    }
                    profileLikeSnapshot.hasComment = nc5Var.m162483g();
                }
            }
            return profileLikeSnapshot;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLikeSnapshot profileLikeSnapshot, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikeSnapshot.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = profileLikeSnapshot.picture;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = profileLikeSnapshot.desc;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17299A(4, profileLikeSnapshot.hasComment);
        }
    };
    public static JsonAdapter<ProfileLikeSnapshot> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikeSnapshot>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeSnapshot.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikeSnapshot.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileLikeSnapshot newInstance() {
            return new ProfileLikeSnapshot();
        }

        public boolean parseField(ProfileLikeSnapshot profileLikeSnapshot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hasComment":
                    profileLikeSnapshot.hasComment = jsonParser.getValueAsBoolean();
                    return true;
                case "picture":
                    profileLikeSnapshot.picture = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    profileLikeSnapshot.desc = jsonParser.getValueAsString();
                    return true;
                case "title":
                    profileLikeSnapshot.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileLikeSnapshot profileLikeSnapshot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hasComment":
                case "picture":
                case "desc":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(profileLikeSnapshot, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLikeSnapshot profileLikeSnapshot, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikeSnapshot.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = profileLikeSnapshot.picture;
            if (str2 != null) {
                jsonGenerator.writeStringField("picture", str2);
            }
            String str3 = profileLikeSnapshot.desc;
            if (str3 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str3);
            }
            jsonGenerator.writeBooleanField("hasComment", profileLikeSnapshot.hasComment);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikeSnapshot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikeSnapshot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikeSnapshot new_() {
        ProfileLikeSnapshot profileLikeSnapshot = new ProfileLikeSnapshot();
        profileLikeSnapshot.nullCheck();
        return profileLikeSnapshot;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileLikeSnapshot mo225055clone() {
        ProfileLikeSnapshot profileLikeSnapshot = new ProfileLikeSnapshot();
        profileLikeSnapshot.title = this.title;
        profileLikeSnapshot.picture = this.picture;
        profileLikeSnapshot.desc = this.desc;
        profileLikeSnapshot.hasComment = this.hasComment;
        return profileLikeSnapshot;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLikeSnapshot)) {
            return false;
        }
        ProfileLikeSnapshot profileLikeSnapshot = (ProfileLikeSnapshot) obj;
        return ValueObject.util_equals(this.title, profileLikeSnapshot.title) && ValueObject.util_equals(this.picture, profileLikeSnapshot.picture) && ValueObject.util_equals(this.desc, profileLikeSnapshot.desc) && this.hasComment == profileLikeSnapshot.hasComment;
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.picture;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.desc;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.hasComment ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.picture == null) {
            this.picture = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
