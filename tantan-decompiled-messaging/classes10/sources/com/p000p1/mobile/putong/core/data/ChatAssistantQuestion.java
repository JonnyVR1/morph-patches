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
public class ChatAssistantQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatassistantquestion";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int f22id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String question;

    @ProtobufIndex(index = 4)
    public int questionId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<ChatAssistantQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAssistantQuestion>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatAssistantQuestion chatAssistantQuestion) {
            String str = chatAssistantQuestion.question;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = chatAssistantQuestion.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, chatAssistantQuestion.f22id) + CodedOutputByteBufferNano.h(4, chatAssistantQuestion.questionId);
            ((MessageNano) chatAssistantQuestion).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatAssistantQuestion m11973parse(nb5 nb5Var) throws IOException {
            ChatAssistantQuestion chatAssistantQuestion = new ChatAssistantQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatAssistantQuestion.question == null) {
                        chatAssistantQuestion.question = "";
                    }
                    if (chatAssistantQuestion.type != null) {
                        break;
                    }
                    chatAssistantQuestion.type = "";
                    break;
                }
                if (iU == 10) {
                    chatAssistantQuestion.question = nb5Var.s();
                } else if (iU == 18) {
                    chatAssistantQuestion.type = nb5Var.s();
                } else if (iU == 24) {
                    chatAssistantQuestion.f22id = nb5Var.j();
                } else {
                    if (iU != 32) {
                        if (chatAssistantQuestion.question == null) {
                            chatAssistantQuestion.question = "";
                        }
                        if (chatAssistantQuestion.type != null) {
                            break;
                        }
                        chatAssistantQuestion.type = "";
                        return chatAssistantQuestion;
                    }
                    chatAssistantQuestion.questionId = nb5Var.j();
                }
            }
            return chatAssistantQuestion;
        }

        public void serialize(ChatAssistantQuestion chatAssistantQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatAssistantQuestion.question;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = chatAssistantQuestion.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, chatAssistantQuestion.f22id);
            codedOutputByteBufferNano.G(4, chatAssistantQuestion.questionId);
        }
    };
    public static JsonAdapter<ChatAssistantQuestion> JSON_ADAPTER = new ObjectJsonAdapter<ChatAssistantQuestion>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestion.2
        public Class getDataClass() {
            return ChatAssistantQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatAssistantQuestion m11974newInstance() {
            return new ChatAssistantQuestion();
        }

        public boolean parseField(ChatAssistantQuestion chatAssistantQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "question":
                    chatAssistantQuestion.question = jsonParser.getValueAsString();
                    return true;
                case "id":
                    chatAssistantQuestion.f22id = jsonParser.getValueAsInt();
                    return false;
                case "type":
                    chatAssistantQuestion.type = jsonParser.getValueAsString();
                    return true;
                case "questionId":
                    chatAssistantQuestion.questionId = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatAssistantQuestion chatAssistantQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "question":
                    return true;
                case "id":
                    return false;
                case "type":
                case "questionId":
                    return true;
                default:
                    return super.parseFieldCheck(chatAssistantQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatAssistantQuestion chatAssistantQuestion, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", chatAssistantQuestion.f22id);
            jsonGenerator.writeNumberField("questionId", chatAssistantQuestion.questionId);
            String str = chatAssistantQuestion.question;
            if (str != null) {
                jsonGenerator.writeStringField("question", str);
            }
            String str2 = chatAssistantQuestion.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAssistantQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAssistantQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAssistantQuestion new_() {
        ChatAssistantQuestion chatAssistantQuestion = new ChatAssistantQuestion();
        chatAssistantQuestion.nullCheck();
        return chatAssistantQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatAssistantQuestion m11972clone() {
        ChatAssistantQuestion chatAssistantQuestion = new ChatAssistantQuestion();
        chatAssistantQuestion.f22id = this.f22id;
        chatAssistantQuestion.questionId = this.questionId;
        chatAssistantQuestion.question = this.question;
        chatAssistantQuestion.type = this.type;
        return chatAssistantQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatAssistantQuestion)) {
            return false;
        }
        ChatAssistantQuestion chatAssistantQuestion = (ChatAssistantQuestion) obj;
        return this.f22id == chatAssistantQuestion.f22id && this.questionId == chatAssistantQuestion.questionId && ValueObject.util_equals(this.question, chatAssistantQuestion.question) && ValueObject.util_equals(this.type, chatAssistantQuestion.type);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.f22id) * 41) + this.questionId) * 41;
        String str = this.question;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.question == null) {
            this.question = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
