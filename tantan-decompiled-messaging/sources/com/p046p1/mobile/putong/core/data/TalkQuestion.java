package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Gender;
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
public class TalkQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talkquestion";

    @NonNull
    @ProtobufIndex(index = 3)
    public Gender gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20516id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<TalkQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkQuestion>() { // from class: com.p1.mobile.putong.core.data.TalkQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TalkQuestion talkQuestion) {
            String str = talkQuestion.f20516id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = talkQuestion.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            Gender gender = talkQuestion.gender;
            if (gender != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, gender.ordinal());
            }
            Gender gender2 = talkQuestion.gender;
            if (gender2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, gender2, Gender.PROTOBUF_ADAPTER);
            }
            talkQuestion.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TalkQuestion parse(nb5 nb5Var) throws IOException {
            TalkQuestion talkQuestion = new TalkQuestion();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (talkQuestion.gender == null && numValueOf != null) {
                        talkQuestion.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (talkQuestion.f20516id == null) {
                        talkQuestion.f20516id = "";
                    }
                    if (talkQuestion.value == null) {
                        talkQuestion.value = "";
                    }
                    if (talkQuestion.gender != null) {
                        break;
                    }
                    talkQuestion.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    talkQuestion.f20516id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    talkQuestion.value = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else {
                    if (iM158752u != 34) {
                        if (talkQuestion.gender == null && numValueOf != null) {
                            talkQuestion.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (talkQuestion.f20516id == null) {
                            talkQuestion.f20516id = "";
                        }
                        if (talkQuestion.value == null) {
                            talkQuestion.value = "";
                        }
                        if (talkQuestion.gender != null) {
                            break;
                        }
                        talkQuestion.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        return talkQuestion;
                    }
                    talkQuestion.gender = (Gender) nb5Var.m158743l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return talkQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TalkQuestion talkQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkQuestion.f20516id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = talkQuestion.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            Gender gender = talkQuestion.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17250G(3, gender.ordinal());
            }
            Gender gender2 = talkQuestion.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.m17254K(4, gender2, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TalkQuestion> JSON_ADAPTER = new ObjectJsonAdapter<TalkQuestion>() { // from class: com.p1.mobile.putong.core.data.TalkQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TalkQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TalkQuestion newInstance() {
            return new TalkQuestion();
        }

        public boolean parseField(TalkQuestion talkQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    talkQuestion.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    talkQuestion.f20516id = jsonParser.getValueAsString();
                    return false;
                case "value":
                    talkQuestion.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TalkQuestion talkQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gender":
                    return true;
                case "id":
                    return false;
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(talkQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TalkQuestion talkQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = talkQuestion.f20516id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = talkQuestion.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            if (talkQuestion.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(talkQuestion.gender, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkQuestion new_() {
        TalkQuestion talkQuestion = new TalkQuestion();
        talkQuestion.nullCheck();
        return talkQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TalkQuestion mo223809clone() {
        TalkQuestion talkQuestion = new TalkQuestion();
        talkQuestion.f20516id = this.f20516id;
        talkQuestion.value = this.value;
        talkQuestion.gender = this.gender;
        return talkQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TalkQuestion)) {
            return false;
        }
        TalkQuestion talkQuestion = (TalkQuestion) obj;
        return ValueObject.util_equals(this.f20516id, talkQuestion.f20516id) && ValueObject.util_equals(this.value, talkQuestion.value) && ValueObject.util_equals(this.gender, talkQuestion.gender);
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
        String str = this.f20516id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode3 = iHashCode2 + (gender != null ? gender.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20516id == null) {
            this.f20516id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.gender == null) {
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
