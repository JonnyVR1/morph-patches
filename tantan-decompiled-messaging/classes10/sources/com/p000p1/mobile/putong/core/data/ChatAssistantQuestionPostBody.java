package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatAssistantQuestionSelected;
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
public class ChatAssistantQuestionPostBody extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatassistantquestionpostbody";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ChatAssistantQuestionSelected> chatAssistantQuestions;
    public static ProtobufAdapter<ChatAssistantQuestionPostBody> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAssistantQuestionPostBody>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionPostBody.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatAssistantQuestionPostBody chatAssistantQuestionPostBody) {
            List<ChatAssistantQuestionSelected> list = chatAssistantQuestionPostBody.chatAssistantQuestions;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ChatAssistantQuestionSelected.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) chatAssistantQuestionPostBody).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatAssistantQuestionPostBody m11977parse(nb5 nb5Var) throws IOException {
            ChatAssistantQuestionPostBody chatAssistantQuestionPostBody = new ChatAssistantQuestionPostBody();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatAssistantQuestionPostBody.chatAssistantQuestions != null) {
                        break;
                    }
                    chatAssistantQuestionPostBody.chatAssistantQuestions = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (chatAssistantQuestionPostBody.chatAssistantQuestions != null) {
                        break;
                    }
                    chatAssistantQuestionPostBody.chatAssistantQuestions = new ArrayList();
                    return chatAssistantQuestionPostBody;
                }
                chatAssistantQuestionPostBody.chatAssistantQuestions = (List) nb5Var.l(ChatAssistantQuestionSelected.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return chatAssistantQuestionPostBody;
        }

        public void serialize(ChatAssistantQuestionPostBody chatAssistantQuestionPostBody, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ChatAssistantQuestionSelected> list = chatAssistantQuestionPostBody.chatAssistantQuestions;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ChatAssistantQuestionSelected.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatAssistantQuestionPostBody> JSON_ADAPTER = new ObjectJsonAdapter<ChatAssistantQuestionPostBody>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionPostBody.2
        public Class getDataClass() {
            return ChatAssistantQuestionPostBody.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatAssistantQuestionPostBody m11978newInstance() {
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

        public void serializeFields(ChatAssistantQuestionPostBody chatAssistantQuestionPostBody, JsonGenerator jsonGenerator) throws IOException {
            if (chatAssistantQuestionPostBody.chatAssistantQuestions != null) {
                jsonGenerator.writeFieldName("chatAssistantQuestions");
                JsonAdapter.serializeArray(chatAssistantQuestionPostBody.chatAssistantQuestions, jsonGenerator, ChatAssistantQuestionSelected.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAssistantQuestionPostBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAssistantQuestionPostBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAssistantQuestionPostBody new_() {
        ChatAssistantQuestionPostBody chatAssistantQuestionPostBody = new ChatAssistantQuestionPostBody();
        chatAssistantQuestionPostBody.nullCheck();
        return chatAssistantQuestionPostBody;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatAssistantQuestionPostBody m11976clone() {
        ChatAssistantQuestionPostBody chatAssistantQuestionPostBody = new ChatAssistantQuestionPostBody();
        List<ChatAssistantQuestionSelected> list = this.chatAssistantQuestions;
        if (list != null) {
            chatAssistantQuestionPostBody.chatAssistantQuestions = ValueObject.util_map(list, new w9j() { // from class: l.ht4
                public final Object call(Object obj) {
                    return ((ChatAssistantQuestionSelected) obj).m11980clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<ChatAssistantQuestionSelected> list = this.chatAssistantQuestions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.chatAssistantQuestions == null) {
            this.chatAssistantQuestions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
