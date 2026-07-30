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
public class NewQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newquestion";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String actorId;

    @ProtobufIndex(index = 7)
    public boolean fallback;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f117id;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int index;

    @NonNull
    @ProtobufIndex(index = 4)
    public String questionId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String receiverId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String roundId;
    public static ProtobufAdapter<NewQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewQuestion>() { // from class: com.p1.mobile.putong.core.data.NewQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewQuestion newQuestion) {
            String str = newQuestion.f117id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = newQuestion.actorId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = newQuestion.receiverId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = newQuestion.questionId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, newQuestion.index);
            String str5 = newQuestion.roundId;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(6, str5);
            }
            int iB = iH + CodedOutputByteBufferNano.b(7, newQuestion.fallback);
            ((MessageNano) newQuestion).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewQuestion m14531parse(nb5 nb5Var) throws IOException {
            NewQuestion newQuestion = new NewQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newQuestion.f117id == null) {
                        newQuestion.f117id = "";
                    }
                    if (newQuestion.actorId == null) {
                        newQuestion.actorId = "";
                    }
                    if (newQuestion.receiverId == null) {
                        newQuestion.receiverId = "";
                    }
                    if (newQuestion.questionId == null) {
                        newQuestion.questionId = "";
                    }
                    if (newQuestion.roundId != null) {
                        break;
                    }
                    newQuestion.roundId = "";
                    break;
                }
                if (iU == 10) {
                    newQuestion.f117id = nb5Var.s();
                } else if (iU == 18) {
                    newQuestion.actorId = nb5Var.s();
                } else if (iU == 26) {
                    newQuestion.receiverId = nb5Var.s();
                } else if (iU == 34) {
                    newQuestion.questionId = nb5Var.s();
                } else if (iU == 40) {
                    newQuestion.index = nb5Var.j();
                } else if (iU == 50) {
                    newQuestion.roundId = nb5Var.s();
                } else {
                    if (iU != 56) {
                        if (newQuestion.f117id == null) {
                            newQuestion.f117id = "";
                        }
                        if (newQuestion.actorId == null) {
                            newQuestion.actorId = "";
                        }
                        if (newQuestion.receiverId == null) {
                            newQuestion.receiverId = "";
                        }
                        if (newQuestion.questionId == null) {
                            newQuestion.questionId = "";
                        }
                        if (newQuestion.roundId != null) {
                            break;
                        }
                        newQuestion.roundId = "";
                        return newQuestion;
                    }
                    newQuestion.fallback = nb5Var.g();
                }
            }
            return newQuestion;
        }

        public void serialize(NewQuestion newQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newQuestion.f117id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = newQuestion.actorId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = newQuestion.receiverId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = newQuestion.questionId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.G(5, newQuestion.index);
            String str5 = newQuestion.roundId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            codedOutputByteBufferNano.A(7, newQuestion.fallback);
        }
    };
    public static JsonAdapter<NewQuestion> JSON_ADAPTER = new ObjectJsonAdapter<NewQuestion>() { // from class: com.p1.mobile.putong.core.data.NewQuestion.2
        public Class getDataClass() {
            return NewQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewQuestion m14532newInstance() {
            return new NewQuestion();
        }

        public boolean parseField(NewQuestion newQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "actorId":
                    newQuestion.actorId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    newQuestion.f117id = jsonParser.getValueAsString();
                    return false;
                case "index":
                    newQuestion.index = jsonParser.getValueAsInt();
                    return true;
                case "receiverId":
                    newQuestion.receiverId = jsonParser.getValueAsString();
                    return true;
                case "questionId":
                    newQuestion.questionId = jsonParser.getValueAsString();
                    return true;
                case "fallback":
                    newQuestion.fallback = jsonParser.getValueAsBoolean();
                    return true;
                case "roundId":
                    newQuestion.roundId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewQuestion newQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "actorId":
                    return true;
                case "id":
                    return false;
                case "index":
                case "receiverId":
                case "questionId":
                case "fallback":
                case "roundId":
                    return true;
                default:
                    return super.parseFieldCheck(newQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(NewQuestion newQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = newQuestion.f117id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = newQuestion.actorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("actorId", str2);
            }
            String str3 = newQuestion.receiverId;
            if (str3 != null) {
                jsonGenerator.writeStringField("receiverId", str3);
            }
            String str4 = newQuestion.questionId;
            if (str4 != null) {
                jsonGenerator.writeStringField("questionId", str4);
            }
            jsonGenerator.writeNumberField("index", newQuestion.index);
            String str5 = newQuestion.roundId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roundId", str5);
            }
            jsonGenerator.writeBooleanField("fallback", newQuestion.fallback);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewQuestion new_() {
        NewQuestion newQuestion = new NewQuestion();
        newQuestion.nullCheck();
        return newQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewQuestion m14530clone() {
        NewQuestion newQuestion = new NewQuestion();
        newQuestion.f117id = this.f117id;
        newQuestion.actorId = this.actorId;
        newQuestion.receiverId = this.receiverId;
        newQuestion.questionId = this.questionId;
        newQuestion.index = this.index;
        newQuestion.roundId = this.roundId;
        newQuestion.fallback = this.fallback;
        return newQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewQuestion)) {
            return false;
        }
        NewQuestion newQuestion = (NewQuestion) obj;
        return ValueObject.util_equals(this.f117id, newQuestion.f117id) && ValueObject.util_equals(this.actorId, newQuestion.actorId) && ValueObject.util_equals(this.receiverId, newQuestion.receiverId) && ValueObject.util_equals(this.questionId, newQuestion.questionId) && this.index == newQuestion.index && ValueObject.util_equals(this.roundId, newQuestion.roundId) && this.fallback == newQuestion.fallback;
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
        String str = this.f117id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.actorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.receiverId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.questionId;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.index) * 41;
        String str5 = this.roundId;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.fallback ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f117id == null) {
            this.f117id = "";
        }
        if (this.actorId == null) {
            this.actorId = "";
        }
        if (this.receiverId == null) {
            this.receiverId = "";
        }
        if (this.questionId == null) {
            this.questionId = "";
        }
        if (this.roundId == null) {
            this.roundId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
