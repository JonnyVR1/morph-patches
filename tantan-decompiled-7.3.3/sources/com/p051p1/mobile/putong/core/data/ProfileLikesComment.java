package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

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
    public String f21218id;

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
            String str = profileLikesComment.f21218id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = profileLikesComment.userId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = profileLikesComment.module;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = profileLikesComment.category;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = profileLikesComment.identifier;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = profileLikesComment.snapshot;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = profileLikesComment.comment;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(8, profileLikesComment.createdTime);
            String str8 = profileLikesComment.consumeType;
            if (str8 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(9, str8);
            }
            String str9 = profileLikesComment.coinSign;
            if (str9 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(10, str9);
            }
            profileLikesComment.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikesComment parse(nc5 nc5Var) throws IOException {
            ProfileLikesComment profileLikesComment = new ProfileLikesComment();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (profileLikesComment.f21218id == null) {
                            profileLikesComment.f21218id = "";
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
                        profileLikesComment.f21218id = nc5Var.m162495s();
                        continue;
                    case 18:
                        profileLikesComment.userId = nc5Var.m162495s();
                        continue;
                    case 26:
                        profileLikesComment.module = nc5Var.m162495s();
                        continue;
                    case 34:
                        profileLikesComment.category = nc5Var.m162495s();
                        continue;
                    case 42:
                        profileLikesComment.identifier = nc5Var.m162495s();
                        continue;
                    case 50:
                        profileLikesComment.snapshot = nc5Var.m162495s();
                        continue;
                    case 58:
                        profileLikesComment.comment = nc5Var.m162495s();
                        continue;
                    case 65:
                        profileLikesComment.createdTime = nc5Var.m162484h();
                        continue;
                    case 74:
                        profileLikesComment.consumeType = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        profileLikesComment.coinSign = nc5Var.m162495s();
                        continue;
                    default:
                        if (profileLikesComment.f21218id == null) {
                            profileLikesComment.f21218id = "";
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
            String str = profileLikesComment.f21218id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = profileLikesComment.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = profileLikesComment.module;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = profileLikesComment.category;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = profileLikesComment.identifier;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = profileLikesComment.snapshot;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = profileLikesComment.comment;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            codedOutputByteBufferNano.m17301C(8, profileLikesComment.createdTime);
            String str8 = profileLikesComment.consumeType;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(9, str8);
            }
            String str9 = profileLikesComment.coinSign;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(10, str9);
            }
        }
    };
    public static JsonAdapter<ProfileLikesComment> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikesComment>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesComment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikesComment.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    profileLikesComment.f21218id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLikesComment profileLikesComment, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikesComment.f21218id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikesComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ProfileLikesComment mo225055clone() {
        ProfileLikesComment profileLikesComment = new ProfileLikesComment();
        profileLikesComment.f21218id = this.f21218id;
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
        return ValueObject.util_equals(this.f21218id, profileLikesComment.f21218id) && ValueObject.util_equals(this.userId, profileLikesComment.userId) && ValueObject.util_equals(this.module, profileLikesComment.module) && ValueObject.util_equals(this.category, profileLikesComment.category) && ValueObject.util_equals(this.identifier, profileLikesComment.identifier) && ValueObject.util_equals(this.snapshot, profileLikesComment.snapshot) && ValueObject.util_equals(this.comment, profileLikesComment.comment) && this.createdTime == profileLikesComment.createdTime && ValueObject.util_equals(this.consumeType, profileLikesComment.consumeType) && ValueObject.util_equals(this.coinSign, profileLikesComment.coinSign);
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
        String str = this.f21218id;
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
        if (this.f21218id == null) {
            this.f21218id = "";
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
