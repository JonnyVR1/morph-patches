package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class NewQuestionAnswer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newquestionanswer";

    @NonNull
    @ProtobufIndex(index = 2)
    public String actorId;

    @ProtobufIndex(index = 5)
    public int answerOrder;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21198id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String myAnswerId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String receiverId;

    @Nullable
    @ProtobufIndex(index = 6)
    public String roundId;
    public static ProtobufAdapter<NewQuestionAnswer> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewQuestionAnswer>() { // from class: com.p1.mobile.putong.core.data.NewQuestionAnswer.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewQuestionAnswer newQuestionAnswer) {
            String str = newQuestionAnswer.f21198id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = newQuestionAnswer.actorId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = newQuestionAnswer.receiverId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = newQuestionAnswer.myAnswerId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(5, newQuestionAnswer.answerOrder);
            String str5 = newQuestionAnswer.roundId;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            newQuestionAnswer.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewQuestionAnswer parse(nc5 nc5Var) throws IOException {
            NewQuestionAnswer newQuestionAnswer = new NewQuestionAnswer();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newQuestionAnswer.f21198id == null) {
                        newQuestionAnswer.f21198id = "";
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
                if (iM162497u == 10) {
                    newQuestionAnswer.f21198id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    newQuestionAnswer.actorId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    newQuestionAnswer.receiverId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    newQuestionAnswer.myAnswerId = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    newQuestionAnswer.answerOrder = nc5Var.m162486j();
                } else {
                    if (iM162497u != 50) {
                        if (newQuestionAnswer.f21198id == null) {
                            newQuestionAnswer.f21198id = "";
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
                    newQuestionAnswer.roundId = nc5Var.m162495s();
                }
            }
            return newQuestionAnswer;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewQuestionAnswer newQuestionAnswer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newQuestionAnswer.f21198id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = newQuestionAnswer.actorId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = newQuestionAnswer.receiverId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = newQuestionAnswer.myAnswerId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17305G(5, newQuestionAnswer.answerOrder);
            String str5 = newQuestionAnswer.roundId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
        }
    };
    public static JsonAdapter<NewQuestionAnswer> JSON_ADAPTER = new ObjectJsonAdapter<NewQuestionAnswer>() { // from class: com.p1.mobile.putong.core.data.NewQuestionAnswer.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewQuestionAnswer.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewQuestionAnswer newInstance() {
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
                    newQuestionAnswer.f21198id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewQuestionAnswer newQuestionAnswer, JsonGenerator jsonGenerator) throws IOException {
            String str = newQuestionAnswer.f21198id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewQuestionAnswer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewQuestionAnswer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewQuestionAnswer new_() {
        NewQuestionAnswer newQuestionAnswer = new NewQuestionAnswer();
        newQuestionAnswer.nullCheck();
        return newQuestionAnswer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewQuestionAnswer mo225055clone() {
        NewQuestionAnswer newQuestionAnswer = new NewQuestionAnswer();
        newQuestionAnswer.f21198id = this.f21198id;
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
        return ValueObject.util_equals(this.f21198id, newQuestionAnswer.f21198id) && ValueObject.util_equals(this.actorId, newQuestionAnswer.actorId) && ValueObject.util_equals(this.receiverId, newQuestionAnswer.receiverId) && ValueObject.util_equals(this.myAnswerId, newQuestionAnswer.myAnswerId) && this.answerOrder == newQuestionAnswer.answerOrder && ValueObject.util_equals(this.roundId, newQuestionAnswer.roundId);
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
        String str = this.f21198id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.actorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.receiverId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.myAnswerId;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.answerOrder) * 41;
        String str5 = this.roundId;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21198id == null) {
            this.f21198id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
