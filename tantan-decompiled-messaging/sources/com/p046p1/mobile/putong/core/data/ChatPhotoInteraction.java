package com.p046p1.mobile.putong.core.data;

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
public class ChatPhotoInteraction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatphotointeraction";

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<ChatPhotoInteraction> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPhotoInteraction>() { // from class: com.p1.mobile.putong.core.data.ChatPhotoInteraction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatPhotoInteraction chatPhotoInteraction) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, chatPhotoInteraction.enable);
            chatPhotoInteraction.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatPhotoInteraction parse(nb5 nb5Var) throws IOException {
            ChatPhotoInteraction chatPhotoInteraction = new ChatPhotoInteraction();
            while (nb5Var.m158752u() == 8) {
                chatPhotoInteraction.enable = nb5Var.m158738g();
            }
            return chatPhotoInteraction;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatPhotoInteraction chatPhotoInteraction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, chatPhotoInteraction.enable);
        }
    };
    public static JsonAdapter<ChatPhotoInteraction> JSON_ADAPTER = new ObjectJsonAdapter<ChatPhotoInteraction>() { // from class: com.p1.mobile.putong.core.data.ChatPhotoInteraction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatPhotoInteraction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatPhotoInteraction newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatPhotoInteraction chatPhotoInteraction, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", chatPhotoInteraction.enable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPhotoInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPhotoInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatPhotoInteraction new_() {
        ChatPhotoInteraction chatPhotoInteraction = new ChatPhotoInteraction();
        chatPhotoInteraction.nullCheck();
        return chatPhotoInteraction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatPhotoInteraction mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.enable ? 1231 : 1237);
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
