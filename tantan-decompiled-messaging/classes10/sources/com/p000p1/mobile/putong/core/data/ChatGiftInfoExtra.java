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
public class ChatGiftInfoExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgiftinfoextra";

    @ProtobufIndex(index = 4)
    public boolean beThanked;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftRecordId;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isOpened;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean needOpen;
    public static ProtobufAdapter<ChatGiftInfoExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGiftInfoExtra>() { // from class: com.p1.mobile.putong.core.data.ChatGiftInfoExtra.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGiftInfoExtra chatGiftInfoExtra) {
            String str = chatGiftInfoExtra.giftRecordId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, chatGiftInfoExtra.isOpened) + CodedOutputByteBufferNano.b(3, chatGiftInfoExtra.needOpen) + CodedOutputByteBufferNano.b(4, chatGiftInfoExtra.beThanked);
            ((MessageNano) chatGiftInfoExtra).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGiftInfoExtra m12011parse(nb5 nb5Var) throws IOException {
            ChatGiftInfoExtra chatGiftInfoExtra = new ChatGiftInfoExtra();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatGiftInfoExtra.giftRecordId != null) {
                        break;
                    }
                    chatGiftInfoExtra.giftRecordId = "";
                    break;
                }
                if (iU == 10) {
                    chatGiftInfoExtra.giftRecordId = nb5Var.s();
                } else if (iU == 16) {
                    chatGiftInfoExtra.isOpened = nb5Var.g();
                } else if (iU == 24) {
                    chatGiftInfoExtra.needOpen = nb5Var.g();
                } else {
                    if (iU != 32) {
                        if (chatGiftInfoExtra.giftRecordId != null) {
                            break;
                        }
                        chatGiftInfoExtra.giftRecordId = "";
                        return chatGiftInfoExtra;
                    }
                    chatGiftInfoExtra.beThanked = nb5Var.g();
                }
            }
            return chatGiftInfoExtra;
        }

        public void serialize(ChatGiftInfoExtra chatGiftInfoExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGiftInfoExtra.giftRecordId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, chatGiftInfoExtra.isOpened);
            codedOutputByteBufferNano.A(3, chatGiftInfoExtra.needOpen);
            codedOutputByteBufferNano.A(4, chatGiftInfoExtra.beThanked);
        }
    };
    public static JsonAdapter<ChatGiftInfoExtra> JSON_ADAPTER = new ObjectJsonAdapter<ChatGiftInfoExtra>() { // from class: com.p1.mobile.putong.core.data.ChatGiftInfoExtra.2
        public Class getDataClass() {
            return ChatGiftInfoExtra.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGiftInfoExtra m12012newInstance() {
            return new ChatGiftInfoExtra();
        }

        public boolean parseField(ChatGiftInfoExtra chatGiftInfoExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftRecordId":
                    chatGiftInfoExtra.giftRecordId = jsonParser.getValueAsString();
                    return true;
                case "beThanked":
                    chatGiftInfoExtra.beThanked = jsonParser.getValueAsBoolean();
                    return true;
                case "isOpened":
                    chatGiftInfoExtra.isOpened = jsonParser.getValueAsBoolean();
                    return true;
                case "needOpen":
                    chatGiftInfoExtra.needOpen = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGiftInfoExtra chatGiftInfoExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "giftRecordId":
                case "beThanked":
                case "isOpened":
                case "needOpen":
                    return true;
                default:
                    return super.parseFieldCheck(chatGiftInfoExtra, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatGiftInfoExtra chatGiftInfoExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGiftInfoExtra.giftRecordId;
            if (str != null) {
                jsonGenerator.writeStringField("giftRecordId", str);
            }
            jsonGenerator.writeBooleanField("isOpened", chatGiftInfoExtra.isOpened);
            jsonGenerator.writeBooleanField("needOpen", chatGiftInfoExtra.needOpen);
            jsonGenerator.writeBooleanField("beThanked", chatGiftInfoExtra.beThanked);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGiftInfoExtra new_() {
        ChatGiftInfoExtra chatGiftInfoExtra = new ChatGiftInfoExtra();
        chatGiftInfoExtra.nullCheck();
        return chatGiftInfoExtra;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGiftInfoExtra m12010clone() {
        ChatGiftInfoExtra chatGiftInfoExtra = new ChatGiftInfoExtra();
        chatGiftInfoExtra.giftRecordId = this.giftRecordId;
        chatGiftInfoExtra.isOpened = this.isOpened;
        chatGiftInfoExtra.needOpen = this.needOpen;
        chatGiftInfoExtra.beThanked = this.beThanked;
        return chatGiftInfoExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGiftInfoExtra)) {
            return false;
        }
        ChatGiftInfoExtra chatGiftInfoExtra = (ChatGiftInfoExtra) obj;
        return ValueObject.util_equals(this.giftRecordId, chatGiftInfoExtra.giftRecordId) && this.isOpened == chatGiftInfoExtra.isOpened && this.needOpen == chatGiftInfoExtra.needOpen && this.beThanked == chatGiftInfoExtra.beThanked;
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
        String str = this.giftRecordId;
        int iHashCode = ((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isOpened ? 1231 : 1237)) * 41) + (this.needOpen ? 1231 : 1237)) * 41) + (this.beThanked ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.giftRecordId == null) {
            this.giftRecordId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
