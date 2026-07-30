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
public class ChatPhotoInteraction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatphotointeraction";

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<ChatPhotoInteraction> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPhotoInteraction>() { // from class: com.p1.mobile.putong.core.data.ChatPhotoInteraction.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatPhotoInteraction chatPhotoInteraction) {
            int iB = CodedOutputByteBufferNano.b(1, chatPhotoInteraction.enable);
            ((MessageNano) chatPhotoInteraction).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatPhotoInteraction m12129parse(nb5 nb5Var) throws IOException {
            ChatPhotoInteraction chatPhotoInteraction = new ChatPhotoInteraction();
            while (nb5Var.u() == 8) {
                chatPhotoInteraction.enable = nb5Var.g();
            }
            return chatPhotoInteraction;
        }

        public void serialize(ChatPhotoInteraction chatPhotoInteraction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatPhotoInteraction.enable);
        }
    };
    public static JsonAdapter<ChatPhotoInteraction> JSON_ADAPTER = new ObjectJsonAdapter<ChatPhotoInteraction>() { // from class: com.p1.mobile.putong.core.data.ChatPhotoInteraction.2
        public Class getDataClass() {
            return ChatPhotoInteraction.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatPhotoInteraction m12130newInstance() {
            return new ChatPhotoInteraction();
        }

        public boolean parseField(ChatPhotoInteraction chatPhotoInteraction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("enable")) {
                return false;
            }
            chatPhotoInteraction.enable = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ChatPhotoInteraction chatPhotoInteraction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable")) {
                return true;
            }
            return super.parseFieldCheck(chatPhotoInteraction, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChatPhotoInteraction chatPhotoInteraction, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", chatPhotoInteraction.enable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPhotoInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPhotoInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatPhotoInteraction new_() {
        ChatPhotoInteraction chatPhotoInteraction = new ChatPhotoInteraction();
        chatPhotoInteraction.nullCheck();
        return chatPhotoInteraction;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatPhotoInteraction m12128clone() {
        ChatPhotoInteraction chatPhotoInteraction = new ChatPhotoInteraction();
        chatPhotoInteraction.enable = this.enable;
        return chatPhotoInteraction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ChatPhotoInteraction) && this.enable == ((ChatPhotoInteraction) obj).enable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.enable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
