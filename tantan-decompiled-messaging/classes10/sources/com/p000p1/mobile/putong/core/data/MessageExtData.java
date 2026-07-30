package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class MessageExtData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageextdata";

    @Nullable
    @ProtobufIndex(index = 4)
    public ChatTips chatTips;

    @NonNull
    @ProtobufIndex(index = 1)
    public String extra;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String extra2;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MessageTips greetingTips;

    @NonNull
    @ProtobufIndex(index = 6)
    public String msgSource;

    @NonNull
    @ProtobufIndex(index = 7)
    public String recallText;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public MessageSource source;
    public static ProtobufAdapter<MessageExtData> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageExtData>() { // from class: com.p1.mobile.putong.core.data.MessageExtData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageExtData messageExtData) {
            String str = messageExtData.extra;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            MessageTips messageTips = messageExtData.greetingTips;
            if (messageTips != null) {
                iO += CodedOutputByteBufferNano.l(2, messageTips, MessageTips.PROTOBUF_ADAPTER);
            }
            MessageSource messageSource = messageExtData.source;
            if (messageSource != null) {
                iO += CodedOutputByteBufferNano.l(3, messageSource, MessageSource.PROTOBUF_ADAPTER);
            }
            ChatTips chatTips = messageExtData.chatTips;
            if (chatTips != null) {
                iO += CodedOutputByteBufferNano.l(4, chatTips, ChatTips.PROTOBUF_ADAPTER);
            }
            String str2 = messageExtData.extra2;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(5, str2);
            }
            String str3 = messageExtData.msgSource;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(6, str3);
            }
            String str4 = messageExtData.recallText;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(7, str4);
            }
            ((MessageNano) messageExtData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageExtData m14189parse(nb5 nb5Var) throws IOException {
            MessageExtData messageExtData = new MessageExtData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageExtData.extra == null) {
                        messageExtData.extra = "";
                    }
                    if (messageExtData.extra2 == null) {
                        messageExtData.extra2 = "";
                    }
                    if (messageExtData.msgSource == null) {
                        messageExtData.msgSource = "";
                    }
                    if (messageExtData.recallText != null) {
                        break;
                    }
                    messageExtData.recallText = "";
                    break;
                }
                if (iU == 10) {
                    messageExtData.extra = nb5Var.s();
                } else if (iU == 18) {
                    messageExtData.greetingTips = (MessageTips) nb5Var.l(MessageTips.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    messageExtData.source = (MessageSource) nb5Var.l(MessageSource.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    messageExtData.chatTips = (ChatTips) nb5Var.l(ChatTips.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    messageExtData.extra2 = nb5Var.s();
                } else if (iU == 50) {
                    messageExtData.msgSource = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (messageExtData.extra == null) {
                            messageExtData.extra = "";
                        }
                        if (messageExtData.extra2 == null) {
                            messageExtData.extra2 = "";
                        }
                        if (messageExtData.msgSource == null) {
                            messageExtData.msgSource = "";
                        }
                        if (messageExtData.recallText != null) {
                            break;
                        }
                        messageExtData.recallText = "";
                        return messageExtData;
                    }
                    messageExtData.recallText = nb5Var.s();
                }
            }
            return messageExtData;
        }

        public void serialize(MessageExtData messageExtData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageExtData.extra;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            MessageTips messageTips = messageExtData.greetingTips;
            if (messageTips != null) {
                codedOutputByteBufferNano.K(2, messageTips, MessageTips.PROTOBUF_ADAPTER);
            }
            MessageSource messageSource = messageExtData.source;
            if (messageSource != null) {
                codedOutputByteBufferNano.K(3, messageSource, MessageSource.PROTOBUF_ADAPTER);
            }
            ChatTips chatTips = messageExtData.chatTips;
            if (chatTips != null) {
                codedOutputByteBufferNano.K(4, chatTips, ChatTips.PROTOBUF_ADAPTER);
            }
            String str2 = messageExtData.extra2;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            String str3 = messageExtData.msgSource;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            String str4 = messageExtData.recallText;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
        }
    };
    public static JsonAdapter<MessageExtData> JSON_ADAPTER = new ObjectJsonAdapter<MessageExtData>() { // from class: com.p1.mobile.putong.core.data.MessageExtData.2
        public Class getDataClass() {
            return MessageExtData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageExtData m14190newInstance() {
            return new MessageExtData();
        }

        public boolean parseField(MessageExtData messageExtData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "msgSource":
                    messageExtData.msgSource = jsonParser.getValueAsString();
                    return true;
                case "extra2":
                    messageExtData.extra2 = jsonParser.getValueAsString();
                    return true;
                case "source":
                    messageExtData.source = (MessageSource) MessageSource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "greetingTips":
                    messageExtData.greetingTips = (MessageTips) MessageTips.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "extra":
                    messageExtData.extra = jsonParser.getValueAsString();
                    return true;
                case "recallText":
                    messageExtData.recallText = jsonParser.getValueAsString();
                    return true;
                case "chatTips":
                    messageExtData.chatTips = (ChatTips) ChatTips.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageExtData messageExtData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "msgSource":
                case "extra2":
                case "source":
                case "greetingTips":
                case "extra":
                case "recallText":
                case "chatTips":
                    return true;
                default:
                    return super.parseFieldCheck(messageExtData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MessageExtData messageExtData, JsonGenerator jsonGenerator) throws IOException {
            String str = messageExtData.extra;
            if (str != null) {
                jsonGenerator.writeStringField("extra", str);
            }
            if (messageExtData.greetingTips != null) {
                jsonGenerator.writeFieldName("greetingTips");
                MessageTips.JSON_ADAPTER.serialize(messageExtData.greetingTips, jsonGenerator, true);
            }
            if (messageExtData.source != null) {
                jsonGenerator.writeFieldName("source");
                MessageSource.JSON_ADAPTER.serialize(messageExtData.source, jsonGenerator, true);
            }
            if (messageExtData.chatTips != null) {
                jsonGenerator.writeFieldName("chatTips");
                ChatTips.JSON_ADAPTER.serialize(messageExtData.chatTips, jsonGenerator, true);
            }
            String str2 = messageExtData.extra2;
            if (str2 != null) {
                jsonGenerator.writeStringField("extra2", str2);
            }
            String str3 = messageExtData.msgSource;
            if (str3 != null) {
                jsonGenerator.writeStringField("msgSource", str3);
            }
            String str4 = messageExtData.recallText;
            if (str4 != null) {
                jsonGenerator.writeStringField("recallText", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageExtData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageExtData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageExtData new_() {
        MessageExtData messageExtData = new MessageExtData();
        messageExtData.nullCheck();
        return messageExtData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageExtData m14188clone() {
        MessageExtData messageExtData = new MessageExtData();
        messageExtData.extra = this.extra;
        MessageTips messageTips = this.greetingTips;
        if (messageTips != null) {
            messageExtData.greetingTips = messageTips.m14280clone();
        }
        MessageSource messageSource = this.source;
        if (messageSource != null) {
            messageExtData.source = messageSource.m14270clone();
        }
        ChatTips chatTips = this.chatTips;
        if (chatTips != null) {
            messageExtData.chatTips = chatTips.m12156clone();
        }
        messageExtData.extra2 = this.extra2;
        messageExtData.msgSource = this.msgSource;
        messageExtData.recallText = this.recallText;
        return messageExtData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageExtData)) {
            return false;
        }
        MessageExtData messageExtData = (MessageExtData) obj;
        return ValueObject.util_equals(this.extra, messageExtData.extra) && ValueObject.util_equals(this.greetingTips, messageExtData.greetingTips) && ValueObject.util_equals(this.source, messageExtData.source) && ValueObject.util_equals(this.chatTips, messageExtData.chatTips) && ValueObject.util_equals(this.extra2, messageExtData.extra2) && ValueObject.util_equals(this.msgSource, messageExtData.msgSource) && ValueObject.util_equals(this.recallText, messageExtData.recallText);
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
        String str = this.extra;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        MessageTips messageTips = this.greetingTips;
        int iHashCode2 = (iHashCode + (messageTips != null ? messageTips.hashCode() : 0)) * 41;
        MessageSource messageSource = this.source;
        int iHashCode3 = (iHashCode2 + (messageSource != null ? messageSource.hashCode() : 0)) * 41;
        ChatTips chatTips = this.chatTips;
        int iHashCode4 = (iHashCode3 + (chatTips != null ? chatTips.hashCode() : 0)) * 41;
        String str2 = this.extra2;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.msgSource;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.recallText;
        int iHashCode7 = iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.extra == null) {
            this.extra = "";
        }
        if (this.extra2 == null) {
            this.extra2 = "";
        }
        if (this.msgSource == null) {
            this.msgSource = "";
        }
        if (this.recallText == null) {
            this.recallText = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
