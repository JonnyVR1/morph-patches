package com.p051p1.mobile.putong.core.data;

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
public class ConversationAdditionalChatAssistantQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionalchatassistantquestion";

    @ProtobufIndex(index = 1)
    public boolean isReply;
    public static ProtobufAdapter<ConversationAdditionalChatAssistantQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalChatAssistantQuestion>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalChatAssistantQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, conversationAdditionalChatAssistantQuestion.isReply);
            conversationAdditionalChatAssistantQuestion.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationAdditionalChatAssistantQuestion parse(nc5 nc5Var) throws IOException {
            ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = new ConversationAdditionalChatAssistantQuestion();
            while (nc5Var.m162497u() == 8) {
                conversationAdditionalChatAssistantQuestion.isReply = nc5Var.m162483g();
            }
            return conversationAdditionalChatAssistantQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, conversationAdditionalChatAssistantQuestion.isReply);
        }
    };
    public static JsonAdapter<ConversationAdditionalChatAssistantQuestion> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalChatAssistantQuestion>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalChatAssistantQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationAdditionalChatAssistantQuestion.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationAdditionalChatAssistantQuestion newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isReply", conversationAdditionalChatAssistantQuestion.isReply);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalChatAssistantQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalChatAssistantQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalChatAssistantQuestion new_() {
        ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = new ConversationAdditionalChatAssistantQuestion();
        conversationAdditionalChatAssistantQuestion.nullCheck();
        return conversationAdditionalChatAssistantQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationAdditionalChatAssistantQuestion mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isReply ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
