package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Answer;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileLikesSnapshot extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikessnapshot";

    @NonNull
    @ProtobufIndex(index = 3)
    public String answer;

    @NonNull
    @ProtobufIndex(index = 4)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21219id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String imageIdentifier;

    @NonNull
    @ProtobufIndex(index = 8)
    public String index;

    @NonNull
    @ProtobufIndex(index = 2)
    public String question;

    @NonNull
    @ProtobufIndex(index = 7)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String title;
    public static ProtobufAdapter<ProfileLikesSnapshot> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikesSnapshot>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesSnapshot.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileLikesSnapshot profileLikesSnapshot) {
            String str = profileLikesSnapshot.f21219id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = profileLikesSnapshot.question;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = profileLikesSnapshot.answer;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = profileLikesSnapshot.content;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = profileLikesSnapshot.imageIdentifier;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = profileLikesSnapshot.title;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = profileLikesSnapshot.subtitle;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            String str8 = profileLikesSnapshot.index;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str8);
            }
            profileLikesSnapshot.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikesSnapshot parse(nc5 nc5Var) throws IOException {
            ProfileLikesSnapshot profileLikesSnapshot = new ProfileLikesSnapshot();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (profileLikesSnapshot.f21219id == null) {
                        profileLikesSnapshot.f21219id = "";
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
                if (iM162497u == 10) {
                    profileLikesSnapshot.f21219id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    profileLikesSnapshot.question = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    profileLikesSnapshot.answer = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    profileLikesSnapshot.content = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    profileLikesSnapshot.imageIdentifier = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    profileLikesSnapshot.title = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    profileLikesSnapshot.subtitle = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (profileLikesSnapshot.f21219id == null) {
                            profileLikesSnapshot.f21219id = "";
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
                    profileLikesSnapshot.index = nc5Var.m162495s();
                }
            }
            return profileLikesSnapshot;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLikesSnapshot profileLikesSnapshot, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileLikesSnapshot.f21219id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = profileLikesSnapshot.question;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = profileLikesSnapshot.answer;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = profileLikesSnapshot.content;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = profileLikesSnapshot.imageIdentifier;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = profileLikesSnapshot.title;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = profileLikesSnapshot.subtitle;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            String str8 = profileLikesSnapshot.index;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(8, str8);
            }
        }
    };
    public static JsonAdapter<ProfileLikesSnapshot> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikesSnapshot>() { // from class: com.p1.mobile.putong.core.data.ProfileLikesSnapshot.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikesSnapshot.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileLikesSnapshot newInstance() {
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
                    profileLikesSnapshot.f21219id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLikesSnapshot profileLikesSnapshot, JsonGenerator jsonGenerator) throws IOException {
            String str = profileLikesSnapshot.f21219id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = profileLikesSnapshot.question;
            if (str2 != null) {
                jsonGenerator.writeStringField("question", str2);
            }
            String str3 = profileLikesSnapshot.answer;
            if (str3 != null) {
                jsonGenerator.writeStringField(Answer.TYPE, str3);
            }
            String str4 = profileLikesSnapshot.content;
            if (str4 != null) {
                jsonGenerator.writeStringField("content", str4);
            }
            String str5 = profileLikesSnapshot.imageIdentifier;
            if (str5 != null) {
                jsonGenerator.writeStringField("imageIdentifier", str5);
            }
            String str6 = profileLikesSnapshot.title;
            if (str6 != null) {
                jsonGenerator.writeStringField("title", str6);
            }
            String str7 = profileLikesSnapshot.subtitle;
            if (str7 != null) {
                jsonGenerator.writeStringField("subtitle", str7);
            }
            String str8 = profileLikesSnapshot.index;
            if (str8 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.INDEX, str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikesSnapshot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikesSnapshot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikesSnapshot new_() {
        ProfileLikesSnapshot profileLikesSnapshot = new ProfileLikesSnapshot();
        profileLikesSnapshot.nullCheck();
        return profileLikesSnapshot;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileLikesSnapshot mo225055clone() {
        ProfileLikesSnapshot profileLikesSnapshot = new ProfileLikesSnapshot();
        profileLikesSnapshot.f21219id = this.f21219id;
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
        return ValueObject.util_equals(this.f21219id, profileLikesSnapshot.f21219id) && ValueObject.util_equals(this.question, profileLikesSnapshot.question) && ValueObject.util_equals(this.answer, profileLikesSnapshot.answer) && ValueObject.util_equals(this.content, profileLikesSnapshot.content) && ValueObject.util_equals(this.imageIdentifier, profileLikesSnapshot.imageIdentifier) && ValueObject.util_equals(this.title, profileLikesSnapshot.title) && ValueObject.util_equals(this.subtitle, profileLikesSnapshot.subtitle) && ValueObject.util_equals(this.index, profileLikesSnapshot.index);
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
        String str = this.f21219id;
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
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21219id == null) {
            this.f21219id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
