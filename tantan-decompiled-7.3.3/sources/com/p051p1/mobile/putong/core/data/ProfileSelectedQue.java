package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class ProfileSelectedQue extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileselectedque";

    @NonNull
    @ProtobufIndex(index = 3)
    public String answer;

    @NonNull
    @ProtobufIndex(index = 1)
    public String questionId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<ProfileSelectedQue> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileSelectedQue>() { // from class: com.p1.mobile.putong.core.data.ProfileSelectedQue.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileSelectedQue profileSelectedQue) {
            String str = profileSelectedQue.questionId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = profileSelectedQue.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = profileSelectedQue.answer;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            profileSelectedQue.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileSelectedQue parse(nc5 nc5Var) throws IOException {
            ProfileSelectedQue profileSelectedQue = new ProfileSelectedQue();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (profileSelectedQue.questionId == null) {
                        profileSelectedQue.questionId = "";
                    }
                    if (profileSelectedQue.type == null) {
                        profileSelectedQue.type = "";
                    }
                    if (profileSelectedQue.answer != null) {
                        break;
                    }
                    profileSelectedQue.answer = "";
                    break;
                }
                if (iM162497u == 10) {
                    profileSelectedQue.questionId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    profileSelectedQue.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (profileSelectedQue.questionId == null) {
                            profileSelectedQue.questionId = "";
                        }
                        if (profileSelectedQue.type == null) {
                            profileSelectedQue.type = "";
                        }
                        if (profileSelectedQue.answer != null) {
                            break;
                        }
                        profileSelectedQue.answer = "";
                        return profileSelectedQue;
                    }
                    profileSelectedQue.answer = nc5Var.m162495s();
                }
            }
            return profileSelectedQue;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileSelectedQue profileSelectedQue, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileSelectedQue.questionId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = profileSelectedQue.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = profileSelectedQue.answer;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<ProfileSelectedQue> JSON_ADAPTER = new ObjectJsonAdapter<ProfileSelectedQue>() { // from class: com.p1.mobile.putong.core.data.ProfileSelectedQue.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileSelectedQue.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileSelectedQue newInstance() {
            return new ProfileSelectedQue();
        }

        public boolean parseField(ProfileSelectedQue profileSelectedQue, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "answer":
                    profileSelectedQue.answer = jsonParser.getValueAsString();
                    return true;
                case "type":
                    profileSelectedQue.type = jsonParser.getValueAsString();
                    return true;
                case "questionId":
                    profileSelectedQue.questionId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileSelectedQue profileSelectedQue, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "answer":
                case "type":
                case "questionId":
                    return true;
                default:
                    return super.parseFieldCheck(profileSelectedQue, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileSelectedQue profileSelectedQue, JsonGenerator jsonGenerator) throws IOException {
            String str = profileSelectedQue.questionId;
            if (str != null) {
                jsonGenerator.writeStringField("questionId", str);
            }
            String str2 = profileSelectedQue.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = profileSelectedQue.answer;
            if (str3 != null) {
                jsonGenerator.writeStringField(Answer.TYPE, str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileSelectedQue) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileSelectedQue) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileSelectedQue new_() {
        ProfileSelectedQue profileSelectedQue = new ProfileSelectedQue();
        profileSelectedQue.nullCheck();
        return profileSelectedQue;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileSelectedQue mo225055clone() {
        ProfileSelectedQue profileSelectedQue = new ProfileSelectedQue();
        profileSelectedQue.questionId = this.questionId;
        profileSelectedQue.type = this.type;
        profileSelectedQue.answer = this.answer;
        return profileSelectedQue;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileSelectedQue)) {
            return false;
        }
        ProfileSelectedQue profileSelectedQue = (ProfileSelectedQue) obj;
        return ValueObject.util_equals(this.questionId, profileSelectedQue.questionId) && ValueObject.util_equals(this.type, profileSelectedQue.type) && ValueObject.util_equals(this.answer, profileSelectedQue.answer);
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
        String str = this.questionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.answer;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.questionId == null) {
            this.questionId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.answer == null) {
            this.answer = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
