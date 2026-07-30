package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class ChatAssistantQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatassistantquestion";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 3)
    public int f20360id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String question;

    @ProtobufIndex(index = 4)
    public int questionId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<ChatAssistantQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAssistantQuestion>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatAssistantQuestion chatAssistantQuestion) {
            String str = chatAssistantQuestion.question;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = chatAssistantQuestion.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, chatAssistantQuestion.f20360id) + CodedOutputByteBufferNano.m17226h(4, chatAssistantQuestion.questionId);
            chatAssistantQuestion.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatAssistantQuestion parse(nb5 nb5Var) throws IOException {
            ChatAssistantQuestion chatAssistantQuestion = new ChatAssistantQuestion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatAssistantQuestion.question == null) {
                        chatAssistantQuestion.question = "";
                    }
                    if (chatAssistantQuestion.type != null) {
                        break;
                    }
                    chatAssistantQuestion.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    chatAssistantQuestion.question = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    chatAssistantQuestion.type = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    chatAssistantQuestion.f20360id = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        if (chatAssistantQuestion.question == null) {
                            chatAssistantQuestion.question = "";
                        }
                        if (chatAssistantQuestion.type != null) {
                            break;
                        }
                        chatAssistantQuestion.type = "";
                        return chatAssistantQuestion;
                    }
                    chatAssistantQuestion.questionId = nb5Var.m158741j();
                }
            }
            return chatAssistantQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatAssistantQuestion chatAssistantQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatAssistantQuestion.question;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = chatAssistantQuestion.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, chatAssistantQuestion.f20360id);
            codedOutputByteBufferNano.m17250G(4, chatAssistantQuestion.questionId);
        }
    };
    public static JsonAdapter<ChatAssistantQuestion> JSON_ADAPTER = new ObjectJsonAdapter<ChatAssistantQuestion>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatAssistantQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatAssistantQuestion newInstance() {
            return new ChatAssistantQuestion();
        }

        public boolean parseField(ChatAssistantQuestion chatAssistantQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "question":
                    chatAssistantQuestion.question = jsonParser.getValueAsString();
                    return true;
                case "id":
                    chatAssistantQuestion.f20360id = jsonParser.getValueAsInt();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatAssistantQuestion chatAssistantQuestion, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", chatAssistantQuestion.f20360id);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAssistantQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAssistantQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAssistantQuestion new_() {
        ChatAssistantQuestion chatAssistantQuestion = new ChatAssistantQuestion();
        chatAssistantQuestion.nullCheck();
        return chatAssistantQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatAssistantQuestion mo223809clone() {
        ChatAssistantQuestion chatAssistantQuestion = new ChatAssistantQuestion();
        chatAssistantQuestion.f20360id = this.f20360id;
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
        return this.f20360id == chatAssistantQuestion.f20360id && this.questionId == chatAssistantQuestion.questionId && ValueObject.util_equals(this.question, chatAssistantQuestion.question) && ValueObject.util_equals(this.type, chatAssistantQuestion.type);
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
        int i2 = ((((i * 41) + this.f20360id) * 41) + this.questionId) * 41;
        String str = this.question;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.question == null) {
            this.question = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
