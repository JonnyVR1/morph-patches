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
public class ProfileLikesSnapshot extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikessnapshot";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String answer;

    @NonNull
    @ProtobufIndex(index = 4)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f139id;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String imageIdentifier;

    @NonNull
    @ProtobufIndex(index = 8)
    public String index;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String question;

    @NonNull
    @ProtobufIndex(index = 7)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String title;
    public static ProtobufAdapter<ProfileLikesSnapshot> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikesSnapshot>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesSnapshot.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLikesSnapshot profileLikesSnapshot) {
            String str = profileLikesSnapshot.f139id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileLikesSnapshot.question;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = profileLikesSnapshot.answer;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = profileLikesSnapshot.content;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = profileLikesSnapshot.imageIdentifier;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = profileLikesSnapshot.title;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = profileLikesSnapshot.subtitle;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = profileLikesSnapshot.index;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            ((MessageNano) profileLikesSnapshot).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLikesSnapshot m15017parse(nb5 nb5Var) throws IOException {
            ProfileLikesSnapshot profileLikesSnapshot = new ProfileLikesSnapshot();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileLikesSnapshot.f139id == null) {
                        profileLikesSnapshot.f139id = "";
                    }
                    if (profileLikesSnapshot.question == null) {
                        profileLikesSnapshot.question = "";
                    }
                    if (profileLikesSnapshot.answer == null) {
                        profileLikesSnapshot.answer = "";
                    }
                    if (profileLikesSnapshot.content == null) {
                        profileLikesSnapshot.content = "";
                    }
                    if (profileLikesSnapshot.imageIdentifier == null) {
                        profileLikesSnapshot.imageIdentifier = "";
                    }
                    if (profileLikesSnapshot.title == null) {
                        profileLikesSnapshot.title = "";
                    }
                    if (profileLikesSnapshot.subtitle == null) {
                        profileLikesSnapshot.subtitle = "";
                    }
                    if (profileLikesSnapshot.index != null) {
                        break;
                    }
                    profileLikesSnapshot.index = "";
                    break;
                }
                if (iU == 10) {
                    profileLikesSnapshot.f139id = nb5Var.s();
                } else if (iU == 18) {
                    profileLikesSnapshot.question = nb5Var.s();
                } else if (iU == 26) {
                    profileLikesSnapshot.answer = nb5Var.s();
                } else if (iU == 34) {
                    profileLikesSnapshot.content = nb5Var.s();
                } else if (iU == 42) {
                    profileLikesSnapshot.imageIdentifier = nb5Var.s();
                } else if (iU == 50) {
                    profileLikesSnapshot.title = nb5Var.s();
                } else if (iU == 58) {
                    profileLikesSnapshot.subtitle = nb5Var.s();
                } else {
                    if (iU != 66) {
                        if (profileLikesSnapshot.f139id == null) {
                            profileLikesSnapshot.f139id = "";
                        }
                        if (profileLikesSnapshot.question == null) {
                            profileLikesSnapshot.question = "";
                        }
                        if (profileLikesSnapshot.answer == null) {
                            profileLikesSnapshot.answer = "";
                        }
                        if (profileLikesSnapshot.content == null) {
                            profileLikesSnapshot.content = "";
                        }
                        if (profileLikesSnapshot.imageIdentifier == null) {
                            profileLikesSnapshot.imageIdentifier = "";
                        }
                        if (profileLikesSnapshot.title == null) {
                            profileLikesSnapshot.title = "";
                        }
                        if (profileLikesSnapshot.subtitle == null) {
                            profileLikesSnapshot.subtitle = "";
                        }
                        if (profileLikesSnapshot.index != null) {
                            break;
                        }
                        profileLikesSnapshot.index = "";
                        return profileLikesSnapshot;
                    }
                    profileLikesSnapshot.index = nb5Var.s();
                }
            }
            return profileLikesSnapshot;
        }

        public void serialize(ProfileLikesSnapshot profileLikesSnapshot, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikesSnapshot.f139id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileLikesSnapshot.question;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = profileLikesSnapshot.answer;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = profileLikesSnapshot.content;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = profileLikesSnapshot.imageIdentifier;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = profileLikesSnapshot.title;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = profileLikesSnapshot.subtitle;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = profileLikesSnapshot.index;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
        }
    };
    public static JsonAdapter<ProfileLikesSnapshot> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikesSnapshot>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesSnapshot.2
        public Class getDataClass() {
            return ProfileLikesSnapshot.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileLikesSnapshot m15018newInstance() {
            return new ProfileLikesSnapshot();
        }

        public boolean parseField(ProfileLikesSnapshot profileLikesSnapshot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    profileLikesSnapshot.subtitle = jsonParser.getValueAsString();
                    return true;
                case "answer":
                    profileLikesSnapshot.answer = jsonParser.getValueAsString();
                    return true;
                case "question":
                    profileLikesSnapshot.question = jsonParser.getValueAsString();
                    return true;
                case "id":
                    profileLikesSnapshot.f139id = jsonParser.getValueAsString();
                    return false;
                case "index":
                    profileLikesSnapshot.index = jsonParser.getValueAsString();
                    return true;
                case "title":
                    profileLikesSnapshot.title = jsonParser.getValueAsString();
                    return true;
                case "content":
                    profileLikesSnapshot.content = jsonParser.getValueAsString();
                    return true;
                case "imageIdentifier":
                    profileLikesSnapshot.imageIdentifier = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileLikesSnapshot profileLikesSnapshot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "answer":
                case "question":
                    return true;
                case "id":
                    return false;
                case "index":
                case "title":
                case "content":
                case "imageIdentifier":
                    return true;
                default:
                    return super.parseFieldCheck(profileLikesSnapshot, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ProfileLikesSnapshot profileLikesSnapshot, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikesSnapshot.f139id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = profileLikesSnapshot.question;
            if (str2 != null) {
                jsonGenerator.writeStringField("question", str2);
            }
            String str3 = profileLikesSnapshot.answer;
            if (str3 != null) {
                jsonGenerator.writeStringField("answer", str3);
            }
            String str4 = profileLikesSnapshot.content;
            if (str4 != null) {
                jsonGenerator.writeStringField(Content.TYPE, str4);
            }
            String str5 = profileLikesSnapshot.imageIdentifier;
            if (str5 != null) {
                jsonGenerator.writeStringField("imageIdentifier", str5);
            }
            String str6 = profileLikesSnapshot.title;
            if (str6 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str6);
            }
            String str7 = profileLikesSnapshot.subtitle;
            if (str7 != null) {
                jsonGenerator.writeStringField("subtitle", str7);
            }
            String str8 = profileLikesSnapshot.index;
            if (str8 != null) {
                jsonGenerator.writeStringField("index", str8);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikesSnapshot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikesSnapshot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikesSnapshot new_() {
        ProfileLikesSnapshot profileLikesSnapshot = new ProfileLikesSnapshot();
        profileLikesSnapshot.nullCheck();
        return profileLikesSnapshot;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLikesSnapshot m15016clone() {
        ProfileLikesSnapshot profileLikesSnapshot = new ProfileLikesSnapshot();
        profileLikesSnapshot.f139id = this.f139id;
        profileLikesSnapshot.question = this.question;
        profileLikesSnapshot.answer = this.answer;
        profileLikesSnapshot.content = this.content;
        profileLikesSnapshot.imageIdentifier = this.imageIdentifier;
        profileLikesSnapshot.title = this.title;
        profileLikesSnapshot.subtitle = this.subtitle;
        profileLikesSnapshot.index = this.index;
        return profileLikesSnapshot;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLikesSnapshot)) {
            return false;
        }
        ProfileLikesSnapshot profileLikesSnapshot = (ProfileLikesSnapshot) obj;
        return ValueObject.util_equals(this.f139id, profileLikesSnapshot.f139id) && ValueObject.util_equals(this.question, profileLikesSnapshot.question) && ValueObject.util_equals(this.answer, profileLikesSnapshot.answer) && ValueObject.util_equals(this.content, profileLikesSnapshot.content) && ValueObject.util_equals(this.imageIdentifier, profileLikesSnapshot.imageIdentifier) && ValueObject.util_equals(this.title, profileLikesSnapshot.title) && ValueObject.util_equals(this.subtitle, profileLikesSnapshot.subtitle) && ValueObject.util_equals(this.index, profileLikesSnapshot.index);
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
        String str = this.f139id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.question;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.answer;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.content;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.imageIdentifier;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.title;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.subtitle;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.index;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.f139id == null) {
            this.f139id = "";
        }
        if (this.question == null) {
            this.question = "";
        }
        if (this.answer == null) {
            this.answer = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.imageIdentifier == null) {
            this.imageIdentifier = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.index == null) {
            this.index = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
