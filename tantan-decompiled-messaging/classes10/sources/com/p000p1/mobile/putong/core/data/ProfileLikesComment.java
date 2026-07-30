package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class ProfileLikesComment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikescomment";

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
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
    public String f138id;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String identifier;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String module;

    @NonNull
    @ProtobufIndex(index = 6)
    public String snapshot;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;
    public static ProtobufAdapter<ProfileLikesComment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikesComment>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesComment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLikesComment profileLikesComment) {
            String str = profileLikesComment.f138id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileLikesComment.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = profileLikesComment.module;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = profileLikesComment.category;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = profileLikesComment.identifier;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = profileLikesComment.snapshot;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = profileLikesComment.comment;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            int iD = iO + CodedOutputByteBufferNano.d(8, profileLikesComment.createdTime);
            String str8 = profileLikesComment.consumeType;
            if (str8 != null) {
                iD += CodedOutputByteBufferNano.o(9, str8);
            }
            String str9 = profileLikesComment.coinSign;
            if (str9 != null) {
                iD += CodedOutputByteBufferNano.o(10, str9);
            }
            ((MessageNano) profileLikesComment).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLikesComment m15013parse(nb5 nb5Var) throws IOException {
            ProfileLikesComment profileLikesComment = new ProfileLikesComment();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (profileLikesComment.f138id == null) {
                            profileLikesComment.f138id = "";
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
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        profileLikesComment.f138id = nb5Var.s();
                        continue;
                    case 18:
                        profileLikesComment.userId = nb5Var.s();
                        continue;
                    case 26:
                        profileLikesComment.module = nb5Var.s();
                        continue;
                    case 34:
                        profileLikesComment.category = nb5Var.s();
                        continue;
                    case 42:
                        profileLikesComment.identifier = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        profileLikesComment.snapshot = nb5Var.s();
                        continue;
                    case 58:
                        profileLikesComment.comment = nb5Var.s();
                        continue;
                    case 65:
                        profileLikesComment.createdTime = nb5Var.h();
                        continue;
                    case 74:
                        profileLikesComment.consumeType = nb5Var.s();
                        continue;
                    case 82:
                        profileLikesComment.coinSign = nb5Var.s();
                        continue;
                    default:
                        if (profileLikesComment.f138id == null) {
                            profileLikesComment.f138id = "";
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

        public void serialize(ProfileLikesComment profileLikesComment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikesComment.f138id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileLikesComment.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = profileLikesComment.module;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = profileLikesComment.category;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = profileLikesComment.identifier;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = profileLikesComment.snapshot;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = profileLikesComment.comment;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            codedOutputByteBufferNano.C(8, profileLikesComment.createdTime);
            String str8 = profileLikesComment.consumeType;
            if (str8 != null) {
                codedOutputByteBufferNano.R(9, str8);
            }
            String str9 = profileLikesComment.coinSign;
            if (str9 != null) {
                codedOutputByteBufferNano.R(10, str9);
            }
        }
    };
    public static JsonAdapter<ProfileLikesComment> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikesComment>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesComment.2
        public Class getDataClass() {
            return ProfileLikesComment.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileLikesComment m15014newInstance() {
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
                    profileLikesComment.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    profileLikesComment.f138id = jsonParser.getValueAsString();
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

        public void serializeFields(ProfileLikesComment profileLikesComment, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikesComment.f138id;
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
                jsonGenerator.writeStringField(MomentAction.comment, str7);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikesComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikesComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikesComment new_() {
        ProfileLikesComment profileLikesComment = new ProfileLikesComment();
        profileLikesComment.nullCheck();
        return profileLikesComment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLikesComment m15012clone() {
        ProfileLikesComment profileLikesComment = new ProfileLikesComment();
        profileLikesComment.f138id = this.f138id;
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
        return ValueObject.util_equals(this.f138id, profileLikesComment.f138id) && ValueObject.util_equals(this.userId, profileLikesComment.userId) && ValueObject.util_equals(this.module, profileLikesComment.module) && ValueObject.util_equals(this.category, profileLikesComment.category) && ValueObject.util_equals(this.identifier, profileLikesComment.identifier) && ValueObject.util_equals(this.snapshot, profileLikesComment.snapshot) && ValueObject.util_equals(this.comment, profileLikesComment.comment) && this.createdTime == profileLikesComment.createdTime && ValueObject.util_equals(this.consumeType, profileLikesComment.consumeType) && ValueObject.util_equals(this.coinSign, profileLikesComment.coinSign);
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
        String str = this.f138id;
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
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.f138id == null) {
            this.f138id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
