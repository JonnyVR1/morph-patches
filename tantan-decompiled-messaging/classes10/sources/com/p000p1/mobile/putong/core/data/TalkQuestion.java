package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Gender;
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
public class TalkQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talkquestion";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Gender gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f178id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<TalkQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkQuestion>() { // from class: com.p1.mobile.putong.core.data.TalkQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TalkQuestion talkQuestion) {
            String str = talkQuestion.f178id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = talkQuestion.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            Gender gender = talkQuestion.gender;
            if (gender != null) {
                iO += CodedOutputByteBufferNano.h(3, gender.ordinal());
            }
            Gender gender2 = talkQuestion.gender;
            if (gender2 != null) {
                iO += CodedOutputByteBufferNano.l(4, gender2, Gender.PROTOBUF_ADAPTER);
            }
            ((MessageNano) talkQuestion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TalkQuestion m15918parse(nb5 nb5Var) throws IOException {
            TalkQuestion talkQuestion = new TalkQuestion();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (talkQuestion.gender == null && numValueOf != null) {
                        talkQuestion.gender = Gender.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (talkQuestion.f178id == null) {
                        talkQuestion.f178id = "";
                    }
                    if (talkQuestion.value == null) {
                        talkQuestion.value = "";
                    }
                    if (talkQuestion.gender != null) {
                        break;
                    }
                    talkQuestion.gender = Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    talkQuestion.f178id = nb5Var.s();
                } else if (iU == 18) {
                    talkQuestion.value = nb5Var.s();
                } else if (iU == 24) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 34) {
                        if (talkQuestion.gender == null && numValueOf != null) {
                            talkQuestion.gender = Gender.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (talkQuestion.f178id == null) {
                            talkQuestion.f178id = "";
                        }
                        if (talkQuestion.value == null) {
                            talkQuestion.value = "";
                        }
                        if (talkQuestion.gender != null) {
                            break;
                        }
                        talkQuestion.gender = Gender.JSON_ADAPTER.defaultEnum();
                        return talkQuestion;
                    }
                    talkQuestion.gender = (Gender) nb5Var.l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return talkQuestion;
        }

        public void serialize(TalkQuestion talkQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkQuestion.f178id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = talkQuestion.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            Gender gender = talkQuestion.gender;
            if (gender != null) {
                codedOutputByteBufferNano.G(3, gender.ordinal());
            }
            Gender gender2 = talkQuestion.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.K(4, gender2, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TalkQuestion> JSON_ADAPTER = new ObjectJsonAdapter<TalkQuestion>() { // from class: com.p1.mobile.putong.core.data.TalkQuestion.2
        public Class getDataClass() {
            return TalkQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TalkQuestion m15919newInstance() {
            return new TalkQuestion();
        }

        public boolean parseField(TalkQuestion talkQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    talkQuestion.gender = (Gender) Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    talkQuestion.f178id = jsonParser.getValueAsString();
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

        public void serializeFields(TalkQuestion talkQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = talkQuestion.f178id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkQuestion new_() {
        TalkQuestion talkQuestion = new TalkQuestion();
        talkQuestion.nullCheck();
        return talkQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TalkQuestion m15917clone() {
        TalkQuestion talkQuestion = new TalkQuestion();
        talkQuestion.f178id = this.f178id;
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
        return ValueObject.util_equals(this.f178id, talkQuestion.f178id) && ValueObject.util_equals(this.value, talkQuestion.value) && ValueObject.util_equals(this.gender, talkQuestion.gender);
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
        String str = this.f178id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode3 = iHashCode2 + (gender != null ? gender.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f178id == null) {
            this.f178id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.gender == null) {
            this.gender = Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
