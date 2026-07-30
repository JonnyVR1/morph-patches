package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MessageFeedbackAnswers;
import com.p046p1.mobile.putong.data.Answer;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class MessageFeedbackQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagefeedbackquestion";

    @NonNull
    @ProtobufIndex(index = 3)
    public String answer;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<MessageFeedbackAnswers> answers;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<MessageFeedbackQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageFeedbackQuestion>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageFeedbackQuestion messageFeedbackQuestion) {
            String str = messageFeedbackQuestion.text;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<MessageFeedbackAnswers> list = messageFeedbackQuestion.answers;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, MessageFeedbackAnswers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = messageFeedbackQuestion.answer;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            messageFeedbackQuestion.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageFeedbackQuestion parse(nb5 nb5Var) throws IOException {
            MessageFeedbackQuestion messageFeedbackQuestion = new MessageFeedbackQuestion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageFeedbackQuestion.text == null) {
                        messageFeedbackQuestion.text = "";
                    }
                    if (messageFeedbackQuestion.answer == null) {
                        messageFeedbackQuestion.answer = "";
                    }
                    if (messageFeedbackQuestion.answers != null) {
                        break;
                    }
                    messageFeedbackQuestion.answers = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    messageFeedbackQuestion.text = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    messageFeedbackQuestion.answers = (List) nb5Var.m158743l(MessageFeedbackAnswers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (messageFeedbackQuestion.text == null) {
                            messageFeedbackQuestion.text = "";
                        }
                        if (messageFeedbackQuestion.answer == null) {
                            messageFeedbackQuestion.answer = "";
                        }
                        if (messageFeedbackQuestion.answers != null) {
                            break;
                        }
                        messageFeedbackQuestion.answers = new ArrayList();
                        return messageFeedbackQuestion;
                    }
                    messageFeedbackQuestion.answer = nb5Var.m158750s();
                }
            }
            return messageFeedbackQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageFeedbackQuestion messageFeedbackQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageFeedbackQuestion.text;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<MessageFeedbackAnswers> list = messageFeedbackQuestion.answers;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, MessageFeedbackAnswers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = messageFeedbackQuestion.answer;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<MessageFeedbackQuestion> JSON_ADAPTER = new ObjectJsonAdapter<MessageFeedbackQuestion>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageFeedbackQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageFeedbackQuestion newInstance() {
            return new MessageFeedbackQuestion();
        }

        public boolean parseField(MessageFeedbackQuestion messageFeedbackQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "answer":
                    messageFeedbackQuestion.answer = jsonParser.getValueAsString();
                    return true;
                case "answers":
                    messageFeedbackQuestion.answers = JsonAdapter.parseArray(jsonParser, MessageFeedbackAnswers.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "text":
                    messageFeedbackQuestion.text = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageFeedbackQuestion messageFeedbackQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "answer":
                case "answers":
                case "text":
                    return true;
                default:
                    return super.parseFieldCheck(messageFeedbackQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageFeedbackQuestion messageFeedbackQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = messageFeedbackQuestion.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = messageFeedbackQuestion.answer;
            if (str2 != null) {
                jsonGenerator.writeStringField(Answer.TYPE, str2);
            }
            if (messageFeedbackQuestion.answers != null) {
                jsonGenerator.writeFieldName("answers");
                JsonAdapter.serializeArray(messageFeedbackQuestion.answers, jsonGenerator, MessageFeedbackAnswers.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageFeedbackQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageFeedbackQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageFeedbackQuestion new_() {
        MessageFeedbackQuestion messageFeedbackQuestion = new MessageFeedbackQuestion();
        messageFeedbackQuestion.nullCheck();
        return messageFeedbackQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageFeedbackQuestion mo223809clone() {
        MessageFeedbackQuestion messageFeedbackQuestion = new MessageFeedbackQuestion();
        messageFeedbackQuestion.text = this.text;
        messageFeedbackQuestion.answer = this.answer;
        List<MessageFeedbackAnswers> list = this.answers;
        if (list != null) {
            messageFeedbackQuestion.answers = ValueObject.util_map(list, new w9j() { // from class: l.f4z
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MessageFeedbackAnswers) obj).mo223809clone();
                }
            });
        }
        return messageFeedbackQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageFeedbackQuestion)) {
            return false;
        }
        MessageFeedbackQuestion messageFeedbackQuestion = (MessageFeedbackQuestion) obj;
        return ValueObject.util_equals(this.text, messageFeedbackQuestion.text) && ValueObject.util_equals(this.answer, messageFeedbackQuestion.answer) && ValueObject.util_equals(this.answers, messageFeedbackQuestion.answers);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.answer;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<MessageFeedbackAnswers> list = this.answers;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.answer == null) {
            this.answer = "";
        }
        if (this.answers == null) {
            this.answers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
