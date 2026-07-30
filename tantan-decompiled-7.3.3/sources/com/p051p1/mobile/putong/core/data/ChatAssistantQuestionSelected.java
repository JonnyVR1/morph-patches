package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ChatAssistantQuestionSelected extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatassistantquestionselected";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherUserId;

    @ProtobufIndex(index = 4)
    public int questionId;

    @ProtobufIndex(index = 1)
    public boolean send;
    public static ProtobufAdapter<ChatAssistantQuestionSelected> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAssistantQuestionSelected>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionSelected.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatAssistantQuestionSelected chatAssistantQuestionSelected) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, chatAssistantQuestionSelected.send);
            String str = chatAssistantQuestionSelected.otherUserId;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = chatAssistantQuestionSelected.category;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(4, chatAssistantQuestionSelected.questionId);
            chatAssistantQuestionSelected.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatAssistantQuestionSelected parse(nc5 nc5Var) throws IOException {
            ChatAssistantQuestionSelected chatAssistantQuestionSelected = new ChatAssistantQuestionSelected();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatAssistantQuestionSelected.otherUserId == null) {
                        chatAssistantQuestionSelected.otherUserId = "";
                    }
                    if (chatAssistantQuestionSelected.category != null) {
                        break;
                    }
                    chatAssistantQuestionSelected.category = "";
                    break;
                }
                if (iM162497u == 8) {
                    chatAssistantQuestionSelected.send = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    chatAssistantQuestionSelected.otherUserId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    chatAssistantQuestionSelected.category = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
                        if (chatAssistantQuestionSelected.otherUserId == null) {
                            chatAssistantQuestionSelected.otherUserId = "";
                        }
                        if (chatAssistantQuestionSelected.category != null) {
                            break;
                        }
                        chatAssistantQuestionSelected.category = "";
                        return chatAssistantQuestionSelected;
                    }
                    chatAssistantQuestionSelected.questionId = nc5Var.m162486j();
                }
            }
            return chatAssistantQuestionSelected;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatAssistantQuestionSelected chatAssistantQuestionSelected, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, chatAssistantQuestionSelected.send);
            String str = chatAssistantQuestionSelected.otherUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = chatAssistantQuestionSelected.category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17305G(4, chatAssistantQuestionSelected.questionId);
        }
    };
    public static JsonAdapter<ChatAssistantQuestionSelected> JSON_ADAPTER = new ObjectJsonAdapter<ChatAssistantQuestionSelected>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionSelected.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatAssistantQuestionSelected.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatAssistantQuestionSelected newInstance() {
            return new ChatAssistantQuestionSelected();
        }

        public boolean parseField(ChatAssistantQuestionSelected chatAssistantQuestionSelected, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    chatAssistantQuestionSelected.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "send":
                    chatAssistantQuestionSelected.send = jsonParser.getValueAsBoolean();
                    return true;
                case "category":
                    chatAssistantQuestionSelected.category = jsonParser.getValueAsString();
                    return true;
                case "questionId":
                    chatAssistantQuestionSelected.questionId = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatAssistantQuestionSelected chatAssistantQuestionSelected, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserId":
                case "send":
                case "category":
                case "questionId":
                    return true;
                default:
                    return super.parseFieldCheck(chatAssistantQuestionSelected, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatAssistantQuestionSelected chatAssistantQuestionSelected, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("questionId", chatAssistantQuestionSelected.questionId);
            jsonGenerator.writeBooleanField("send", chatAssistantQuestionSelected.send);
            String str = chatAssistantQuestionSelected.otherUserId;
            if (str != null) {
                jsonGenerator.writeStringField("otherUserId", str);
            }
            String str2 = chatAssistantQuestionSelected.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAssistantQuestionSelected) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAssistantQuestionSelected) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAssistantQuestionSelected new_() {
        ChatAssistantQuestionSelected chatAssistantQuestionSelected = new ChatAssistantQuestionSelected();
        chatAssistantQuestionSelected.nullCheck();
        return chatAssistantQuestionSelected;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatAssistantQuestionSelected mo225055clone() {
        ChatAssistantQuestionSelected chatAssistantQuestionSelected = new ChatAssistantQuestionSelected();
        chatAssistantQuestionSelected.questionId = this.questionId;
        chatAssistantQuestionSelected.send = this.send;
        chatAssistantQuestionSelected.otherUserId = this.otherUserId;
        chatAssistantQuestionSelected.category = this.category;
        return chatAssistantQuestionSelected;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatAssistantQuestionSelected)) {
            return false;
        }
        ChatAssistantQuestionSelected chatAssistantQuestionSelected = (ChatAssistantQuestionSelected) obj;
        return this.questionId == chatAssistantQuestionSelected.questionId && this.send == chatAssistantQuestionSelected.send && ValueObject.util_equals(this.otherUserId, chatAssistantQuestionSelected.otherUserId) && ValueObject.util_equals(this.category, chatAssistantQuestionSelected.category);
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
        int i2 = ((((i * 41) + this.questionId) * 41) + (this.send ? 1231 : 1237)) * 41;
        String str = this.otherUserId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
