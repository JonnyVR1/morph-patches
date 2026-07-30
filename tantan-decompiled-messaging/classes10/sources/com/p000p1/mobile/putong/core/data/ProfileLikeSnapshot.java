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
public class ProfileLikeSnapshot extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikesnapshot";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String desc;

    @ProtobufIndex(index = 4)
    public boolean hasComment;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String picture;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<ProfileLikeSnapshot> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikeSnapshot>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeSnapshot.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLikeSnapshot profileLikeSnapshot) {
            String str = profileLikeSnapshot.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileLikeSnapshot.picture;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = profileLikeSnapshot.desc;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, profileLikeSnapshot.hasComment);
            ((MessageNano) profileLikeSnapshot).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLikeSnapshot m14999parse(nb5 nb5Var) throws IOException {
            ProfileLikeSnapshot profileLikeSnapshot = new ProfileLikeSnapshot();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    profileLikeSnapshot.title = nb5Var.s();
                } else if (iU == 18) {
                    profileLikeSnapshot.picture = nb5Var.s();
                } else if (iU == 26) {
                    profileLikeSnapshot.desc = nb5Var.s();
                } else {
                    if (iU != 32) {
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
                    profileLikeSnapshot.hasComment = nb5Var.g();
                }
            }
            return profileLikeSnapshot;
        }

        public void serialize(ProfileLikeSnapshot profileLikeSnapshot, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikeSnapshot.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileLikeSnapshot.picture;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = profileLikeSnapshot.desc;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, profileLikeSnapshot.hasComment);
        }
    };
    public static JsonAdapter<ProfileLikeSnapshot> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikeSnapshot>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeSnapshot.2
        public Class getDataClass() {
            return ProfileLikeSnapshot.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileLikeSnapshot m15000newInstance() {
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

        public void serializeFields(ProfileLikeSnapshot profileLikeSnapshot, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikeSnapshot.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = profileLikeSnapshot.picture;
            if (str2 != null) {
                jsonGenerator.writeStringField("picture", str2);
            }
            String str3 = profileLikeSnapshot.desc;
            if (str3 != null) {
                jsonGenerator.writeStringField("desc", str3);
            }
            jsonGenerator.writeBooleanField("hasComment", profileLikeSnapshot.hasComment);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikeSnapshot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikeSnapshot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikeSnapshot new_() {
        ProfileLikeSnapshot profileLikeSnapshot = new ProfileLikeSnapshot();
        profileLikeSnapshot.nullCheck();
        return profileLikeSnapshot;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLikeSnapshot m14998clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
