package com.p000p1.mobile.putong.core.data;

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
public class ConversationAdditionalChatAssistantQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionalchatassistantquestion";

    @ProtobufIndex(index = 1)
    public boolean isReply;
    public static ProtobufAdapter<ConversationAdditionalChatAssistantQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalChatAssistantQuestion>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalChatAssistantQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion) {
            int iB = CodedOutputByteBufferNano.b(1, conversationAdditionalChatAssistantQuestion.isReply);
            ((MessageNano) conversationAdditionalChatAssistantQuestion).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationAdditionalChatAssistantQuestion m12323parse(nb5 nb5Var) throws IOException {
            ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = new ConversationAdditionalChatAssistantQuestion();
            while (nb5Var.u() == 8) {
                conversationAdditionalChatAssistantQuestion.isReply = nb5Var.g();
            }
            return conversationAdditionalChatAssistantQuestion;
        }

        public void serialize(ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, conversationAdditionalChatAssistantQuestion.isReply);
        }
    };
    public static JsonAdapter<ConversationAdditionalChatAssistantQuestion> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalChatAssistantQuestion>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalChatAssistantQuestion.2
        public Class getDataClass() {
            return ConversationAdditionalChatAssistantQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationAdditionalChatAssistantQuestion m12324newInstance() {
            return new ConversationAdditionalChatAssistantQuestion();
        }

        public boolean parseField(ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isReply")) {
                return false;
            }
            conversationAdditionalChatAssistantQuestion.isReply = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isReply")) {
                return true;
            }
            return super.parseFieldCheck(conversationAdditionalChatAssistantQuestion, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isReply", conversationAdditionalChatAssistantQuestion.isReply);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalChatAssistantQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalChatAssistantQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalChatAssistantQuestion new_() {
        ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = new ConversationAdditionalChatAssistantQuestion();
        conversationAdditionalChatAssistantQuestion.nullCheck();
        return conversationAdditionalChatAssistantQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationAdditionalChatAssistantQuestion m12322clone() {
        ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = new ConversationAdditionalChatAssistantQuestion();
        conversationAdditionalChatAssistantQuestion.isReply = this.isReply;
        return conversationAdditionalChatAssistantQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ConversationAdditionalChatAssistantQuestion) && this.isReply == ((ConversationAdditionalChatAssistantQuestion) obj).isReply;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isReply ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
