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
public class ChatGroupTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgrouptag";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String textColor;
    public static ProtobufAdapter<ChatGroupTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroupTag>() { // from class: com.p1.mobile.putong.core.data.ChatGroupTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGroupTag chatGroupTag) {
            String str = chatGroupTag.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = chatGroupTag.backgroundColor;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = chatGroupTag.textColor;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) chatGroupTag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGroupTag m12039parse(nb5 nb5Var) throws IOException {
            ChatGroupTag chatGroupTag = new ChatGroupTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatGroupTag.name == null) {
                        chatGroupTag.name = "";
                    }
                    if (chatGroupTag.backgroundColor == null) {
                        chatGroupTag.backgroundColor = "";
                    }
                    if (chatGroupTag.textColor != null) {
                        break;
                    }
                    chatGroupTag.textColor = "";
                    break;
                }
                if (iU == 10) {
                    chatGroupTag.name = nb5Var.s();
                } else if (iU == 18) {
                    chatGroupTag.backgroundColor = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (chatGroupTag.name == null) {
                            chatGroupTag.name = "";
                        }
                        if (chatGroupTag.backgroundColor == null) {
                            chatGroupTag.backgroundColor = "";
                        }
                        if (chatGroupTag.textColor != null) {
                            break;
                        }
                        chatGroupTag.textColor = "";
                        return chatGroupTag;
                    }
                    chatGroupTag.textColor = nb5Var.s();
                }
            }
            return chatGroupTag;
        }

        public void serialize(ChatGroupTag chatGroupTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGroupTag.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = chatGroupTag.backgroundColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = chatGroupTag.textColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<ChatGroupTag> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupTag>() { // from class: com.p1.mobile.putong.core.data.ChatGroupTag.2
        public Class getDataClass() {
            return ChatGroupTag.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGroupTag m12040newInstance() {
            return new ChatGroupTag();
        }

        public boolean parseField(ChatGroupTag chatGroupTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textColor":
                    chatGroupTag.textColor = jsonParser.getValueAsString();
                    return true;
                case "name":
                    chatGroupTag.name = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    chatGroupTag.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGroupTag chatGroupTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "textColor":
                case "name":
                case "backgroundColor":
                    return true;
                default:
                    return super.parseFieldCheck(chatGroupTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatGroupTag chatGroupTag, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGroupTag.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = chatGroupTag.backgroundColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundColor", str2);
            }
            String str3 = chatGroupTag.textColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("textColor", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGroupTag new_() {
        ChatGroupTag chatGroupTag = new ChatGroupTag();
        chatGroupTag.nullCheck();
        return chatGroupTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGroupTag m12038clone() {
        ChatGroupTag chatGroupTag = new ChatGroupTag();
        chatGroupTag.name = this.name;
        chatGroupTag.backgroundColor = this.backgroundColor;
        chatGroupTag.textColor = this.textColor;
        return chatGroupTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGroupTag)) {
            return false;
        }
        ChatGroupTag chatGroupTag = (ChatGroupTag) obj;
        return ValueObject.util_equals(this.name, chatGroupTag.name) && ValueObject.util_equals(this.backgroundColor, chatGroupTag.backgroundColor) && ValueObject.util_equals(this.textColor, chatGroupTag.textColor);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.textColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
