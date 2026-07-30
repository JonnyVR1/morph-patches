package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class NewQuestionAnswer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newquestionanswer";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String actorId;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int answerOrder;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f118id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String myAnswerId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String receiverId;

    @Nullable
    @ProtobufIndex(index = 6)
    public String roundId;
    public static ProtobufAdapter<NewQuestionAnswer> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewQuestionAnswer>() { // from class: com.p1.mobile.putong.core.data.NewQuestionAnswer.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewQuestionAnswer newQuestionAnswer) {
            String str = newQuestionAnswer.f118id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = newQuestionAnswer.actorId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = newQuestionAnswer.receiverId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = newQuestionAnswer.myAnswerId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, newQuestionAnswer.answerOrder);
            String str5 = newQuestionAnswer.roundId;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(6, str5);
            }
            ((MessageNano) newQuestionAnswer).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewQuestionAnswer m14535parse(nb5 nb5Var) throws IOException {
            NewQuestionAnswer newQuestionAnswer = new NewQuestionAnswer();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newQuestionAnswer.f118id == null) {
                        newQuestionAnswer.f118id = "";
                    }
                    if (newQuestionAnswer.actorId == null) {
                        newQuestionAnswer.actorId = "";
                    }
                    if (newQuestionAnswer.receiverId == null) {
                        newQuestionAnswer.receiverId = "";
                    }
                    if (newQuestionAnswer.myAnswerId != null) {
                        break;
                    }
                    newQuestionAnswer.myAnswerId = "";
                    break;
                }
                if (iU == 10) {
                    newQuestionAnswer.f118id = nb5Var.s();
                } else if (iU == 18) {
                    newQuestionAnswer.actorId = nb5Var.s();
                } else if (iU == 26) {
                    newQuestionAnswer.receiverId = nb5Var.s();
                } else if (iU == 34) {
                    newQuestionAnswer.myAnswerId = nb5Var.s();
                } else if (iU == 40) {
                    newQuestionAnswer.answerOrder = nb5Var.j();
                } else {
                    if (iU != 50) {
                        if (newQuestionAnswer.f118id == null) {
                            newQuestionAnswer.f118id = "";
                        }
                        if (newQuestionAnswer.actorId == null) {
                            newQuestionAnswer.actorId = "";
                        }
                        if (newQuestionAnswer.receiverId == null) {
                            newQuestionAnswer.receiverId = "";
                        }
                        if (newQuestionAnswer.myAnswerId != null) {
                            break;
                        }
                        newQuestionAnswer.myAnswerId = "";
                        return newQuestionAnswer;
                    }
                    newQuestionAnswer.roundId = nb5Var.s();
                }
            }
            return newQuestionAnswer;
        }

        public void serialize(NewQuestionAnswer newQuestionAnswer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newQuestionAnswer.f118id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = newQuestionAnswer.actorId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = newQuestionAnswer.receiverId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = newQuestionAnswer.myAnswerId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.G(5, newQuestionAnswer.answerOrder);
            String str5 = newQuestionAnswer.roundId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
        }
    };
    public static JsonAdapter<NewQuestionAnswer> JSON_ADAPTER = new ObjectJsonAdapter<NewQuestionAnswer>() { // from class: com.p1.mobile.putong.core.data.NewQuestionAnswer.2
        public Class getDataClass() {
            return NewQuestionAnswer.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewQuestionAnswer m14536newInstance() {
            return new NewQuestionAnswer();
        }

        public boolean parseField(NewQuestionAnswer newQuestionAnswer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "actorId":
                    newQuestionAnswer.actorId = jsonParser.getValueAsString();
                    return true;
                case "answerOrder":
                    newQuestionAnswer.answerOrder = jsonParser.getValueAsInt();
                    return true;
                case "myAnswerId":
                    newQuestionAnswer.myAnswerId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    newQuestionAnswer.f118id = jsonParser.getValueAsString();
                    return false;
                case "receiverId":
                    newQuestionAnswer.receiverId = jsonParser.getValueAsString();
                    return true;
                case "roundId":
                    newQuestionAnswer.roundId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewQuestionAnswer newQuestionAnswer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "actorId":
                case "answerOrder":
                case "myAnswerId":
                    return true;
                case "id":
                    return false;
                case "receiverId":
                case "roundId":
                    return true;
                default:
                    return super.parseFieldCheck(newQuestionAnswer, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(NewQuestionAnswer newQuestionAnswer, JsonGenerator jsonGenerator) throws IOException {
            String str = newQuestionAnswer.f118id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = newQuestionAnswer.actorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("actorId", str2);
            }
            String str3 = newQuestionAnswer.receiverId;
            if (str3 != null) {
                jsonGenerator.writeStringField("receiverId", str3);
            }
            String str4 = newQuestionAnswer.myAnswerId;
            if (str4 != null) {
                jsonGenerator.writeStringField("myAnswerId", str4);
            }
            jsonGenerator.writeNumberField("answerOrder", newQuestionAnswer.answerOrder);
            String str5 = newQuestionAnswer.roundId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roundId", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewQuestionAnswer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewQuestionAnswer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewQuestionAnswer new_() {
        NewQuestionAnswer newQuestionAnswer = new NewQuestionAnswer();
        newQuestionAnswer.nullCheck();
        return newQuestionAnswer;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewQuestionAnswer m14534clone() {
        NewQuestionAnswer newQuestionAnswer = new NewQuestionAnswer();
        newQuestionAnswer.f118id = this.f118id;
        newQuestionAnswer.actorId = this.actorId;
        newQuestionAnswer.receiverId = this.receiverId;
        newQuestionAnswer.myAnswerId = this.myAnswerId;
        newQuestionAnswer.answerOrder = this.answerOrder;
        newQuestionAnswer.roundId = this.roundId;
        return newQuestionAnswer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewQuestionAnswer)) {
            return false;
        }
        NewQuestionAnswer newQuestionAnswer = (NewQuestionAnswer) obj;
        return ValueObject.util_equals(this.f118id, newQuestionAnswer.f118id) && ValueObject.util_equals(this.actorId, newQuestionAnswer.actorId) && ValueObject.util_equals(this.receiverId, newQuestionAnswer.receiverId) && ValueObject.util_equals(this.myAnswerId, newQuestionAnswer.myAnswerId) && this.answerOrder == newQuestionAnswer.answerOrder && ValueObject.util_equals(this.roundId, newQuestionAnswer.roundId);
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
        String str = this.f118id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.actorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.receiverId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.myAnswerId;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.answerOrder) * 41;
        String str5 = this.roundId;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f118id == null) {
            this.f118id = "";
        }
        if (this.actorId == null) {
            this.actorId = "";
        }
        if (this.receiverId == null) {
            this.receiverId = "";
        }
        if (this.myAnswerId == null) {
            this.myAnswerId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
