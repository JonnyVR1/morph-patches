package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class ChatTips extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chattips";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MessageTipsContent otherShown;

    @Nullable
    @ProtobufIndex(index = 1)
    public MessageTipsContent selfShown;
    public static ProtobufAdapter<ChatTips> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatTips>() { // from class: com.p1.mobile.putong.core.data.ChatTips.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatTips chatTips) {
            MessageTipsContent messageTipsContent = chatTips.selfShown;
            int iL = messageTipsContent != null ? CodedOutputByteBufferNano.l(1, messageTipsContent, MessageTipsContent.PROTOBUF_ADAPTER) : 0;
            MessageTipsContent messageTipsContent2 = chatTips.otherShown;
            if (messageTipsContent2 != null) {
                iL += CodedOutputByteBufferNano.l(2, messageTipsContent2, MessageTipsContent.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatTips).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatTips m12157parse(nb5 nb5Var) throws IOException {
            ChatTips chatTips = new ChatTips();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    chatTips.selfShown = (MessageTipsContent) nb5Var.l(MessageTipsContent.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        return chatTips;
                    }
                    chatTips.otherShown = (MessageTipsContent) nb5Var.l(MessageTipsContent.PROTOBUF_ADAPTER);
                }
            }
        }

        public void serialize(ChatTips chatTips, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageTipsContent messageTipsContent = chatTips.selfShown;
            if (messageTipsContent != null) {
                codedOutputByteBufferNano.K(1, messageTipsContent, MessageTipsContent.PROTOBUF_ADAPTER);
            }
            MessageTipsContent messageTipsContent2 = chatTips.otherShown;
            if (messageTipsContent2 != null) {
                codedOutputByteBufferNano.K(2, messageTipsContent2, MessageTipsContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatTips> JSON_ADAPTER = new ObjectJsonAdapter<ChatTips>() { // from class: com.p1.mobile.putong.core.data.ChatTips.2
        public Class getDataClass() {
            return ChatTips.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatTips m12158newInstance() {
            return new ChatTips();
        }

        public boolean parseField(ChatTips chatTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selfShown")) {
                chatTips.selfShown = (MessageTipsContent) MessageTipsContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("otherShown")) {
                return false;
            }
            chatTips.otherShown = (MessageTipsContent) MessageTipsContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatTips chatTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selfShown") || str.equals("otherShown")) {
                return true;
            }
            return super.parseFieldCheck(chatTips, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatTips new_() {
        ChatTips chatTips = new ChatTips();
        chatTips.nullCheck();
        return chatTips;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatTips m12156clone() {
        ChatTips chatTips = new ChatTips();
        MessageTipsContent messageTipsContent = this.selfShown;
        if (messageTipsContent != null) {
            chatTips.selfShown = messageTipsContent.m14284clone();
        }
        MessageTipsContent messageTipsContent2 = this.otherShown;
        if (messageTipsContent2 != null) {
            chatTips.otherShown = messageTipsContent2.m14284clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        MessageTipsContent messageTipsContent = this.selfShown;
        int iHashCode = (i2 + (messageTipsContent != null ? messageTipsContent.hashCode() : 0)) * 41;
        MessageTipsContent messageTipsContent2 = this.otherShown;
        int iHashCode2 = iHashCode + (messageTipsContent2 != null ? messageTipsContent2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
