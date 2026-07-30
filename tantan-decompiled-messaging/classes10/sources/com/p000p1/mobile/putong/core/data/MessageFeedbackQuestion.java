package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MessageFeedbackAnswers;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageFeedbackQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagefeedbackquestion";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String answer;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<MessageFeedbackAnswers> answers;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<MessageFeedbackQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageFeedbackQuestion>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageFeedbackQuestion messageFeedbackQuestion) {
            String str = messageFeedbackQuestion.text;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<MessageFeedbackAnswers> list = messageFeedbackQuestion.answers;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, MessageFeedbackAnswers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = messageFeedbackQuestion.answer;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) messageFeedbackQuestion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageFeedbackQuestion m14197parse(nb5 nb5Var) throws IOException {
            MessageFeedbackQuestion messageFeedbackQuestion = new MessageFeedbackQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    messageFeedbackQuestion.text = nb5Var.s();
                } else if (iU == 18) {
                    messageFeedbackQuestion.answers = (List) nb5Var.l(MessageFeedbackAnswers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
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
                    messageFeedbackQuestion.answer = nb5Var.s();
                }
            }
            return messageFeedbackQuestion;
        }

        public void serialize(MessageFeedbackQuestion messageFeedbackQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageFeedbackQuestion.text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<MessageFeedbackAnswers> list = messageFeedbackQuestion.answers;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, MessageFeedbackAnswers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = messageFeedbackQuestion.answer;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<MessageFeedbackQuestion> JSON_ADAPTER = new ObjectJsonAdapter<MessageFeedbackQuestion>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackQuestion.2
        public Class getDataClass() {
            return MessageFeedbackQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageFeedbackQuestion m14198newInstance() {
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

        public void serializeFields(MessageFeedbackQuestion messageFeedbackQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = messageFeedbackQuestion.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = messageFeedbackQuestion.answer;
            if (str2 != null) {
                jsonGenerator.writeStringField("answer", str2);
            }
            if (messageFeedbackQuestion.answers != null) {
                jsonGenerator.writeFieldName("answers");
                JsonAdapter.serializeArray(messageFeedbackQuestion.answers, jsonGenerator, MessageFeedbackAnswers.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageFeedbackQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageFeedbackQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageFeedbackQuestion new_() {
        MessageFeedbackQuestion messageFeedbackQuestion = new MessageFeedbackQuestion();
        messageFeedbackQuestion.nullCheck();
        return messageFeedbackQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageFeedbackQuestion m14196clone() {
        MessageFeedbackQuestion messageFeedbackQuestion = new MessageFeedbackQuestion();
        messageFeedbackQuestion.text = this.text;
        messageFeedbackQuestion.answer = this.answer;
        List<MessageFeedbackAnswers> list = this.answers;
        if (list != null) {
            messageFeedbackQuestion.answers = ValueObject.util_map(list, new w9j() { // from class: l.f4z
                public final Object call(Object obj) {
                    return ((MessageFeedbackAnswers) obj).m14192clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
