package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class ChatTips extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chattips";

    @Nullable
    @ProtobufIndex(index = 2)
    public MessageTipsContent otherShown;

    @Nullable
    @ProtobufIndex(index = 1)
    public MessageTipsContent selfShown;
    public static ProtobufAdapter<ChatTips> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatTips>() { // from class: com.p1.mobile.putong.core.data.ChatTips.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatTips chatTips) {
            MessageTipsContent messageTipsContent = chatTips.selfShown;
            int iM17285l = messageTipsContent != null ? CodedOutputByteBufferNano.m17285l(1, messageTipsContent, MessageTipsContent.PROTOBUF_ADAPTER) : 0;
            MessageTipsContent messageTipsContent2 = chatTips.otherShown;
            if (messageTipsContent2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, messageTipsContent2, MessageTipsContent.PROTOBUF_ADAPTER);
            }
            chatTips.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatTips parse(nc5 nc5Var) throws IOException {
            ChatTips chatTips = new ChatTips();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    chatTips.selfShown = (MessageTipsContent) nc5Var.m162488l(MessageTipsContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        return chatTips;
                    }
                    chatTips.otherShown = (MessageTipsContent) nc5Var.m162488l(MessageTipsContent.PROTOBUF_ADAPTER);
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatTips chatTips, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageTipsContent messageTipsContent = chatTips.selfShown;
            if (messageTipsContent != null) {
                codedOutputByteBufferNano.m17309K(1, messageTipsContent, MessageTipsContent.PROTOBUF_ADAPTER);
            }
            MessageTipsContent messageTipsContent2 = chatTips.otherShown;
            if (messageTipsContent2 != null) {
                codedOutputByteBufferNano.m17309K(2, messageTipsContent2, MessageTipsContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatTips> JSON_ADAPTER = new ObjectJsonAdapter<ChatTips>() { // from class: com.p1.mobile.putong.core.data.ChatTips.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatTips.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatTips newInstance() {
            return new ChatTips();
        }

        public boolean parseField(ChatTips chatTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selfShown")) {
                chatTips.selfShown = MessageTipsContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("otherShown")) {
                return false;
            }
            chatTips.otherShown = MessageTipsContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatTips chatTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selfShown") || str.equals("otherShown")) {
                return true;
            }
            return super.parseFieldCheck(chatTips, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatTips chatTips, JsonGenerator jsonGenerator) throws IOException {
            if (chatTips.selfShown != null) {
                jsonGenerator.writeFieldName("selfShown");
                MessageTipsContent.JSON_ADAPTER.serialize(chatTips.selfShown, jsonGenerator, true);
            }
            if (chatTips.otherShown != null) {
                jsonGenerator.writeFieldName("otherShown");
                MessageTipsContent.JSON_ADAPTER.serialize(chatTips.otherShown, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatTips new_() {
        ChatTips chatTips = new ChatTips();
        chatTips.nullCheck();
        return chatTips;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatTips mo225055clone() {
        ChatTips chatTips = new ChatTips();
        MessageTipsContent messageTipsContent = this.selfShown;
        if (messageTipsContent != null) {
            chatTips.selfShown = messageTipsContent.mo225055clone();
        }
        MessageTipsContent messageTipsContent2 = this.otherShown;
        if (messageTipsContent2 != null) {
            chatTips.otherShown = messageTipsContent2.mo225055clone();
        }
        return chatTips;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatTips)) {
            return false;
        }
        ChatTips chatTips = (ChatTips) obj;
        return ValueObject.util_equals(this.selfShown, chatTips.selfShown) && ValueObject.util_equals(this.otherShown, chatTips.otherShown);
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
        MessageTipsContent messageTipsContent = this.selfShown;
        int iHashCode = (i2 + (messageTipsContent != null ? messageTipsContent.hashCode() : 0)) * 41;
        MessageTipsContent messageTipsContent2 = this.otherShown;
        int iHashCode2 = iHashCode + (messageTipsContent2 != null ? messageTipsContent2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
