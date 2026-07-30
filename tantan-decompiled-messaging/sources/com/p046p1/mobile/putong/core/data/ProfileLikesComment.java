package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileLikesComment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikescomment";

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @NonNull
    @ProtobufIndex(index = 10)
    public String coinSign;

    @NonNull
    @ProtobufIndex(index = 7)
    public String comment;

    @NonNull
    @ProtobufIndex(index = 9)
    public String consumeType;

    @ProtobufIndex(index = 8)
    public double createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20476id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String identifier;

    @NonNull
    @ProtobufIndex(index = 3)
    public String module;

    @NonNull
    @ProtobufIndex(index = 6)
    public String snapshot;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;
    public static ProtobufAdapter<ProfileLikesComment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikesComment>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesComment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileLikesComment profileLikesComment) {
            String str = profileLikesComment.f20476id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = profileLikesComment.userId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = profileLikesComment.module;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = profileLikesComment.category;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = profileLikesComment.identifier;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = profileLikesComment.snapshot;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = profileLikesComment.comment;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(8, profileLikesComment.createdTime);
            String str8 = profileLikesComment.consumeType;
            if (str8 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(9, str8);
            }
            String str9 = profileLikesComment.coinSign;
            if (str9 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(10, str9);
            }
            profileLikesComment.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikesComment parse(nb5 nb5Var) throws IOException {
            ProfileLikesComment profileLikesComment = new ProfileLikesComment();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (profileLikesComment.f20476id == null) {
                            profileLikesComment.f20476id = "";
                        }
                        if (profileLikesComment.userId == null) {
                            profileLikesComment.userId = "";
                        }
                        if (profileLikesComment.module == null) {
                            profileLikesComment.module = "";
                        }
                        if (profileLikesComment.category == null) {
                            profileLikesComment.category = "";
                        }
                        if (profileLikesComment.identifier == null) {
                            profileLikesComment.identifier = "";
                        }
                        if (profileLikesComment.snapshot == null) {
                            profileLikesComment.snapshot = "";
                        }
                        if (profileLikesComment.comment == null) {
                            profileLikesComment.comment = "";
                        }
                        if (profileLikesComment.consumeType == null) {
                            profileLikesComment.consumeType = "";
                        }
                        if (profileLikesComment.coinSign == null) {
                            profileLikesComment.coinSign = "";
                        }
                        break;
                    case 10:
                        profileLikesComment.f20476id = nb5Var.m158750s();
                        continue;
                    case 18:
                        profileLikesComment.userId = nb5Var.m158750s();
                        continue;
                    case 26:
                        profileLikesComment.module = nb5Var.m158750s();
                        continue;
                    case 34:
                        profileLikesComment.category = nb5Var.m158750s();
                        continue;
                    case 42:
                        profileLikesComment.identifier = nb5Var.m158750s();
                        continue;
                    case 50:
                        profileLikesComment.snapshot = nb5Var.m158750s();
                        continue;
                    case 58:
                        profileLikesComment.comment = nb5Var.m158750s();
                        continue;
                    case 65:
                        profileLikesComment.createdTime = nb5Var.m158739h();
                        continue;
                    case 74:
                        profileLikesComment.consumeType = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        profileLikesComment.coinSign = nb5Var.m158750s();
                        continue;
                    default:
                        if (profileLikesComment.f20476id == null) {
                            profileLikesComment.f20476id = "";
                        }
                        if (profileLikesComment.userId == null) {
                            profileLikesComment.userId = "";
                        }
                        if (profileLikesComment.module == null) {
                            profileLikesComment.module = "";
                        }
                        if (profileLikesComment.category == null) {
                            profileLikesComment.category = "";
                        }
                        if (profileLikesComment.identifier == null) {
                            profileLikesComment.identifier = "";
                        }
                        if (profileLikesComment.snapshot == null) {
                            profileLikesComment.snapshot = "";
                        }
                        if (profileLikesComment.comment == null) {
                            profileLikesComment.comment = "";
                        }
                        if (profileLikesComment.consumeType == null) {
                            profileLikesComment.consumeType = "";
                        }
                        if (profileLikesComment.coinSign == null) {
                            profileLikesComment.coinSign = "";
                            return profileLikesComment;
                        }
                        break;
                }
            }
            return profileLikesComment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLikesComment profileLikesComment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikesComment.f20476id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = profileLikesComment.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = profileLikesComment.module;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = profileLikesComment.category;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = profileLikesComment.identifier;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = profileLikesComment.snapshot;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = profileLikesComment.comment;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            codedOutputByteBufferNano.m17246C(8, profileLikesComment.createdTime);
            String str8 = profileLikesComment.consumeType;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(9, str8);
            }
            String str9 = profileLikesComment.coinSign;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(10, str9);
            }
        }
    };
    public static JsonAdapter<ProfileLikesComment> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikesComment>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesComment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikesComment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileLikesComment newInstance() {
            return new ProfileLikesComment();
        }

        public boolean parseField(ProfileLikesComment profileLikesComment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    profileLikesComment.identifier = jsonParser.getValueAsString();
                    return true;
                case "module":
                    profileLikesComment.module = jsonParser.getValueAsString();
                    return true;
                case "consumeType":
                    profileLikesComment.consumeType = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    profileLikesComment.userId = jsonParser.getValueAsString();
                    return true;
                case "coinSign":
                    profileLikesComment.coinSign = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    profileLikesComment.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    profileLikesComment.f20476id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    profileLikesComment.category = jsonParser.getValueAsString();
                    return true;
                case "snapshot":
                    profileLikesComment.snapshot = jsonParser.getValueAsString();
                    return true;
                case "comment":
                    profileLikesComment.comment = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileLikesComment profileLikesComment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "module":
                case "consumeType":
                case "userId":
                case "coinSign":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "category":
                case "snapshot":
                case "comment":
                    return true;
                default:
                    return super.parseFieldCheck(profileLikesComment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLikesComment profileLikesComment, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikesComment.f20476id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = profileLikesComment.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = profileLikesComment.module;
            if (str3 != null) {
                jsonGenerator.writeStringField("module", str3);
            }
            String str4 = profileLikesComment.category;
            if (str4 != null) {
                jsonGenerator.writeStringField("category", str4);
            }
            String str5 = profileLikesComment.identifier;
            if (str5 != null) {
                jsonGenerator.writeStringField("identifier", str5);
            }
            String str6 = profileLikesComment.snapshot;
            if (str6 != null) {
                jsonGenerator.writeStringField("snapshot", str6);
            }
            String str7 = profileLikesComment.comment;
            if (str7 != null) {
                jsonGenerator.writeStringField("comment", str7);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(profileLikesComment.createdTime), jsonGenerator, true);
            String str8 = profileLikesComment.consumeType;
            if (str8 != null) {
                jsonGenerator.writeStringField("consumeType", str8);
            }
            String str9 = profileLikesComment.coinSign;
            if (str9 != null) {
                jsonGenerator.writeStringField("coinSign", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikesComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikesComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikesComment new_() {
        ProfileLikesComment profileLikesComment = new ProfileLikesComment();
        profileLikesComment.nullCheck();
        return profileLikesComment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileLikesComment mo223809clone() {
        ProfileLikesComment profileLikesComment = new ProfileLikesComment();
        profileLikesComment.f20476id = this.f20476id;
        profileLikesComment.userId = this.userId;
        profileLikesComment.module = this.module;
        profileLikesComment.category = this.category;
        profileLikesComment.identifier = this.identifier;
        profileLikesComment.snapshot = this.snapshot;
        profileLikesComment.comment = this.comment;
        profileLikesComment.createdTime = this.createdTime;
        profileLikesComment.consumeType = this.consumeType;
        profileLikesComment.coinSign = this.coinSign;
        return profileLikesComment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLikesComment)) {
            return false;
        }
        ProfileLikesComment profileLikesComment = (ProfileLikesComment) obj;
        return ValueObject.util_equals(this.f20476id, profileLikesComment.f20476id) && ValueObject.util_equals(this.userId, profileLikesComment.userId) && ValueObject.util_equals(this.module, profileLikesComment.module) && ValueObject.util_equals(this.category, profileLikesComment.category) && ValueObject.util_equals(this.identifier, profileLikesComment.identifier) && ValueObject.util_equals(this.snapshot, profileLikesComment.snapshot) && ValueObject.util_equals(this.comment, profileLikesComment.comment) && this.createdTime == profileLikesComment.createdTime && ValueObject.util_equals(this.consumeType, profileLikesComment.consumeType) && ValueObject.util_equals(this.coinSign, profileLikesComment.coinSign);
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
        String str = this.f20476id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.module;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.category;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.identifier;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.snapshot;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.comment;
        int iHashCode7 = str7 != null ? str7.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((iHashCode6 + iHashCode7) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str8 = this.consumeType;
        int iHashCode8 = (i3 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.coinSign;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20476id == null) {
            this.f20476id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.module == null) {
            this.module = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.identifier == null) {
            this.identifier = "";
        }
        if (this.snapshot == null) {
            this.snapshot = "";
        }
        if (this.comment == null) {
            this.comment = "";
        }
        if (this.consumeType == null) {
            this.consumeType = "";
        }
        if (this.coinSign == null) {
            this.coinSign = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
