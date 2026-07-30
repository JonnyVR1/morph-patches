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
public class ConversationInstantChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationinstantchat";

    @ProtobufIndex(index = 1)
    public int userType;
    public static ProtobufAdapter<ConversationInstantChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationInstantChat>() { // from class: com.p1.mobile.putong.core.data.ConversationInstantChat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationInstantChat conversationInstantChat) {
            int iH = CodedOutputByteBufferNano.h(1, conversationInstantChat.userType);
            ((MessageNano) conversationInstantChat).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationInstantChat m12377parse(nb5 nb5Var) throws IOException {
            ConversationInstantChat conversationInstantChat = new ConversationInstantChat();
            while (nb5Var.u() == 8) {
                conversationInstantChat.userType = nb5Var.j();
            }
            return conversationInstantChat;
        }

        public void serialize(ConversationInstantChat conversationInstantChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, conversationInstantChat.userType);
        }
    };
    public static JsonAdapter<ConversationInstantChat> JSON_ADAPTER = new ObjectJsonAdapter<ConversationInstantChat>() { // from class: com.p1.mobile.putong.core.data.ConversationInstantChat.2
        public Class getDataClass() {
            return ConversationInstantChat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationInstantChat m12378newInstance() {
            return new ConversationInstantChat();
        }

        public boolean parseField(ConversationInstantChat conversationInstantChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userType")) {
                return false;
            }
            conversationInstantChat.userType = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ConversationInstantChat conversationInstantChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userType")) {
                return true;
            }
            return super.parseFieldCheck(conversationInstantChat, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ConversationInstantChat conversationInstantChat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("userType", conversationInstantChat.userType);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationInstantChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationInstantChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationInstantChat new_() {
        ConversationInstantChat conversationInstantChat = new ConversationInstantChat();
        conversationInstantChat.nullCheck();
        return conversationInstantChat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationInstantChat m12376clone() {
        ConversationInstantChat conversationInstantChat = new ConversationInstantChat();
        conversationInstantChat.userType = this.userType;
        return conversationInstantChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ConversationInstantChat) && this.userType == ((ConversationInstantChat) obj).userType;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.userType;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
