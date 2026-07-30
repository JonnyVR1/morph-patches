package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestionSelected;
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
public class ChatAssistantQuestionPostBody extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatassistantquestionpostbody";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ChatAssistantQuestionSelected> chatAssistantQuestions;
    public static ProtobufAdapter<ChatAssistantQuestionPostBody> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAssistantQuestionPostBody>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionPostBody.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatAssistantQuestionPostBody chatAssistantQuestionPostBody) {
            List<ChatAssistantQuestionSelected> list = chatAssistantQuestionPostBody.chatAssistantQuestions;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ChatAssistantQuestionSelected.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            chatAssistantQuestionPostBody.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatAssistantQuestionPostBody parse(nb5 nb5Var) throws IOException {
            ChatAssistantQuestionPostBody chatAssistantQuestionPostBody = new ChatAssistantQuestionPostBody();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatAssistantQuestionPostBody.chatAssistantQuestions != null) {
                        break;
                    }
                    chatAssistantQuestionPostBody.chatAssistantQuestions = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (chatAssistantQuestionPostBody.chatAssistantQuestions != null) {
                        break;
                    }
                    chatAssistantQuestionPostBody.chatAssistantQuestions = new ArrayList();
                    return chatAssistantQuestionPostBody;
                }
                chatAssistantQuestionPostBody.chatAssistantQuestions = (List) nb5Var.m158743l(ChatAssistantQuestionSelected.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return chatAssistantQuestionPostBody;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatAssistantQuestionPostBody chatAssistantQuestionPostBody, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ChatAssistantQuestionSelected> list = chatAssistantQuestionPostBody.chatAssistantQuestions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ChatAssistantQuestionSelected.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatAssistantQuestionPostBody> JSON_ADAPTER = new ObjectJsonAdapter<ChatAssistantQuestionPostBody>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionPostBody.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatAssistantQuestionPostBody.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatAssistantQuestionPostBody newInstance() {
            return new ChatAssistantQuestionPostBody();
        }

        public boolean parseField(ChatAssistantQuestionPostBody chatAssistantQuestionPostBody, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("chatAssistantQuestions")) {
                return false;
            }
            chatAssistantQuestionPostBody.chatAssistantQuestions = JsonAdapter.parseArray(jsonParser, ChatAssistantQuestionSelected.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatAssistantQuestionPostBody chatAssistantQuestionPostBody, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("chatAssistantQuestions")) {
                return true;
            }
            return super.parseFieldCheck(chatAssistantQuestionPostBody, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatAssistantQuestionPostBody chatAssistantQuestionPostBody, JsonGenerator jsonGenerator) throws IOException {
            if (chatAssistantQuestionPostBody.chatAssistantQuestions != null) {
                jsonGenerator.writeFieldName("chatAssistantQuestions");
                JsonAdapter.serializeArray(chatAssistantQuestionPostBody.chatAssistantQuestions, jsonGenerator, ChatAssistantQuestionSelected.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAssistantQuestionPostBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAssistantQuestionPostBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAssistantQuestionPostBody new_() {
        ChatAssistantQuestionPostBody chatAssistantQuestionPostBody = new ChatAssistantQuestionPostBody();
        chatAssistantQuestionPostBody.nullCheck();
        return chatAssistantQuestionPostBody;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatAssistantQuestionPostBody mo223809clone() {
        ChatAssistantQuestionPostBody chatAssistantQuestionPostBody = new ChatAssistantQuestionPostBody();
        List<ChatAssistantQuestionSelected> list = this.chatAssistantQuestions;
        if (list != null) {
            chatAssistantQuestionPostBody.chatAssistantQuestions = ValueObject.util_map(list, new w9j() { // from class: l.ht4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatAssistantQuestionSelected) obj).mo223809clone();
                }
            });
        }
        return chatAssistantQuestionPostBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChatAssistantQuestionPostBody) {
            return ValueObject.util_equals(this.chatAssistantQuestions, ((ChatAssistantQuestionPostBody) obj).chatAssistantQuestions);
        }
        return false;
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
        List<ChatAssistantQuestionSelected> list = this.chatAssistantQuestions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.chatAssistantQuestions == null) {
            this.chatAssistantQuestions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
