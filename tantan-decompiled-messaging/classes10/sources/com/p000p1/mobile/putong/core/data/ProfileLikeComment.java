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
public class ProfileLikeComment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikecomment";

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String comment;

    @ProtobufIndex(index = 6)
    public double createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f137id;

    @NonNull
    @ProtobufIndex(index = 7)
    public String identifier;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String module;

    @NonNull
    @ProtobufIndex(index = 8)
    public String snapshot;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;
    public static ProtobufAdapter<ProfileLikeComment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikeComment>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeComment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLikeComment profileLikeComment) {
            String str = profileLikeComment.f137id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileLikeComment.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = profileLikeComment.module;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = profileLikeComment.category;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = profileLikeComment.comment;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iD = iO + CodedOutputByteBufferNano.d(6, profileLikeComment.createdTime);
            String str6 = profileLikeComment.identifier;
            if (str6 != null) {
                iD += CodedOutputByteBufferNano.o(7, str6);
            }
            String str7 = profileLikeComment.snapshot;
            if (str7 != null) {
                iD += CodedOutputByteBufferNano.o(8, str7);
            }
            ((MessageNano) profileLikeComment).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLikeComment m14983parse(nb5 nb5Var) throws IOException {
            ProfileLikeComment profileLikeComment = new ProfileLikeComment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileLikeComment.f137id == null) {
                        profileLikeComment.f137id = "";
                    }
                    if (profileLikeComment.userId == null) {
                        profileLikeComment.userId = "";
                    }
                    if (profileLikeComment.module == null) {
                        profileLikeComment.module = "";
                    }
                    if (profileLikeComment.category == null) {
                        profileLikeComment.category = "";
                    }
                    if (profileLikeComment.identifier == null) {
                        profileLikeComment.identifier = "";
                    }
                    if (profileLikeComment.snapshot == null) {
                        profileLikeComment.snapshot = "";
                    }
                    if (profileLikeComment.comment != null) {
                        break;
                    }
                    profileLikeComment.comment = "";
                    break;
                }
                if (iU == 10) {
                    profileLikeComment.f137id = nb5Var.s();
                } else if (iU == 18) {
                    profileLikeComment.userId = nb5Var.s();
                } else if (iU == 26) {
                    profileLikeComment.module = nb5Var.s();
                } else if (iU == 34) {
                    profileLikeComment.category = nb5Var.s();
                } else if (iU == 42) {
                    profileLikeComment.comment = nb5Var.s();
                } else if (iU == 49) {
                    profileLikeComment.createdTime = nb5Var.h();
                } else if (iU == 58) {
                    profileLikeComment.identifier = nb5Var.s();
                } else {
                    if (iU != 66) {
                        if (profileLikeComment.f137id == null) {
                            profileLikeComment.f137id = "";
                        }
                        if (profileLikeComment.userId == null) {
                            profileLikeComment.userId = "";
                        }
                        if (profileLikeComment.module == null) {
                            profileLikeComment.module = "";
                        }
                        if (profileLikeComment.category == null) {
                            profileLikeComment.category = "";
                        }
                        if (profileLikeComment.identifier == null) {
                            profileLikeComment.identifier = "";
                        }
                        if (profileLikeComment.snapshot == null) {
                            profileLikeComment.snapshot = "";
                        }
                        if (profileLikeComment.comment != null) {
                            break;
                        }
                        profileLikeComment.comment = "";
                        return profileLikeComment;
                    }
                    profileLikeComment.snapshot = nb5Var.s();
                }
            }
            return profileLikeComment;
        }

        public void serialize(ProfileLikeComment profileLikeComment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikeComment.f137id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileLikeComment.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = profileLikeComment.module;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = profileLikeComment.category;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = profileLikeComment.comment;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.C(6, profileLikeComment.createdTime);
            String str6 = profileLikeComment.identifier;
            if (str6 != null) {
                codedOutputByteBufferNano.R(7, str6);
            }
            String str7 = profileLikeComment.snapshot;
            if (str7 != null) {
                codedOutputByteBufferNano.R(8, str7);
            }
        }
    };
    public static JsonAdapter<ProfileLikeComment> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikeComment>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeComment.2
        public Class getDataClass() {
            return ProfileLikeComment.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileLikeComment m14984newInstance() {
            return new ProfileLikeComment();
        }

        public boolean parseField(ProfileLikeComment profileLikeComment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    profileLikeComment.identifier = jsonParser.getValueAsString();
                    return true;
                case "module":
                    profileLikeComment.module = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    profileLikeComment.userId = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    profileLikeComment.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    profileLikeComment.f137id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    profileLikeComment.category = jsonParser.getValueAsString();
                    return true;
                case "snapshot":
                    profileLikeComment.snapshot = jsonParser.getValueAsString();
                    return true;
                case "comment":
                    profileLikeComment.comment = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileLikeComment profileLikeComment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "module":
                case "userId":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "category":
                case "snapshot":
                case "comment":
                    return true;
                default:
                    return super.parseFieldCheck(profileLikeComment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ProfileLikeComment profileLikeComment, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikeComment.f137id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = profileLikeComment.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = profileLikeComment.module;
            if (str3 != null) {
                jsonGenerator.writeStringField("module", str3);
            }
            String str4 = profileLikeComment.category;
            if (str4 != null) {
                jsonGenerator.writeStringField("category", str4);
            }
            String str5 = profileLikeComment.identifier;
            if (str5 != null) {
                jsonGenerator.writeStringField("identifier", str5);
            }
            String str6 = profileLikeComment.snapshot;
            if (str6 != null) {
                jsonGenerator.writeStringField("snapshot", str6);
            }
            String str7 = profileLikeComment.comment;
            if (str7 != null) {
                jsonGenerator.writeStringField(MomentAction.comment, str7);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(profileLikeComment.createdTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikeComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikeComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikeComment new_() {
        ProfileLikeComment profileLikeComment = new ProfileLikeComment();
        profileLikeComment.nullCheck();
        return profileLikeComment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLikeComment m14982clone() {
        ProfileLikeComment profileLikeComment = new ProfileLikeComment();
        profileLikeComment.f137id = this.f137id;
        profileLikeComment.userId = this.userId;
        profileLikeComment.module = this.module;
        profileLikeComment.category = this.category;
        profileLikeComment.identifier = this.identifier;
        profileLikeComment.snapshot = this.snapshot;
        profileLikeComment.comment = this.comment;
        profileLikeComment.createdTime = this.createdTime;
        return profileLikeComment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLikeComment)) {
            return false;
        }
        ProfileLikeComment profileLikeComment = (ProfileLikeComment) obj;
        return ValueObject.util_equals(this.f137id, profileLikeComment.f137id) && ValueObject.util_equals(this.userId, profileLikeComment.userId) && ValueObject.util_equals(this.module, profileLikeComment.module) && ValueObject.util_equals(this.category, profileLikeComment.category) && ValueObject.util_equals(this.identifier, profileLikeComment.identifier) && ValueObject.util_equals(this.snapshot, profileLikeComment.snapshot) && ValueObject.util_equals(this.comment, profileLikeComment.comment) && this.createdTime == profileLikeComment.createdTime;
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
        String str = this.f137id;
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
        int i3 = ((iHashCode6 + iHashCode7) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f137id == null) {
            this.f137id = "";
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
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
