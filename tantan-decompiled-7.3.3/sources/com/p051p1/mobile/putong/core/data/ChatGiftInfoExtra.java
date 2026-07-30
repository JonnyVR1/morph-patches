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
public class ChatGiftInfoExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgiftinfoextra";

    @ProtobufIndex(index = 4)
    public boolean beThanked;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftRecordId;

    @ProtobufIndex(index = 2)
    public boolean isOpened;

    @ProtobufIndex(index = 3)
    public boolean needOpen;
    public static ProtobufAdapter<ChatGiftInfoExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGiftInfoExtra>() { // from class: com.p1.mobile.putong.core.data.ChatGiftInfoExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGiftInfoExtra chatGiftInfoExtra) {
            String str = chatGiftInfoExtra.giftRecordId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, chatGiftInfoExtra.isOpened) + CodedOutputByteBufferNano.m17275b(3, chatGiftInfoExtra.needOpen) + CodedOutputByteBufferNano.m17275b(4, chatGiftInfoExtra.beThanked);
            chatGiftInfoExtra.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGiftInfoExtra parse(nc5 nc5Var) throws IOException {
            ChatGiftInfoExtra chatGiftInfoExtra = new ChatGiftInfoExtra();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatGiftInfoExtra.giftRecordId != null) {
                        break;
                    }
                    chatGiftInfoExtra.giftRecordId = "";
                    break;
                }
                if (iM162497u == 10) {
                    chatGiftInfoExtra.giftRecordId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    chatGiftInfoExtra.isOpened = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    chatGiftInfoExtra.needOpen = nc5Var.m162483g();
                } else {
                    if (iM162497u != 32) {
                        if (chatGiftInfoExtra.giftRecordId != null) {
                            break;
                        }
                        chatGiftInfoExtra.giftRecordId = "";
                        return chatGiftInfoExtra;
                    }
                    chatGiftInfoExtra.beThanked = nc5Var.m162483g();
                }
            }
            return chatGiftInfoExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGiftInfoExtra chatGiftInfoExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGiftInfoExtra.giftRecordId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, chatGiftInfoExtra.isOpened);
            codedOutputByteBufferNano.m17299A(3, chatGiftInfoExtra.needOpen);
            codedOutputByteBufferNano.m17299A(4, chatGiftInfoExtra.beThanked);
        }
    };
    public static JsonAdapter<ChatGiftInfoExtra> JSON_ADAPTER = new ObjectJsonAdapter<ChatGiftInfoExtra>() { // from class: com.p1.mobile.putong.core.data.ChatGiftInfoExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGiftInfoExtra.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGiftInfoExtra newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGiftInfoExtra chatGiftInfoExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGiftInfoExtra.giftRecordId;
            if (str != null) {
                jsonGenerator.writeStringField("giftRecordId", str);
            }
            jsonGenerator.writeBooleanField("isOpened", chatGiftInfoExtra.isOpened);
            jsonGenerator.writeBooleanField("needOpen", chatGiftInfoExtra.needOpen);
            jsonGenerator.writeBooleanField("beThanked", chatGiftInfoExtra.beThanked);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGiftInfoExtra new_() {
        ChatGiftInfoExtra chatGiftInfoExtra = new ChatGiftInfoExtra();
        chatGiftInfoExtra.nullCheck();
        return chatGiftInfoExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGiftInfoExtra mo225055clone() {
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
        String str = this.giftRecordId;
        int iHashCode = ((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isOpened ? 1231 : 1237)) * 41) + (this.needOpen ? 1231 : 1237)) * 41) + (this.beThanked ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftRecordId == null) {
            this.giftRecordId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
