package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
public class ConversationAdditionalQuickChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionalquickchat";

    @ProtobufIndex(index = 1)
    public boolean avatarBlurred;

    @NonNull
    @ProtobufIndex(index = 2)
    public QuickChatBell bell;

    @ProtobufIndex(index = 3)
    public double expire;

    @ProtobufIndex(index = 5)
    public boolean guideFakeToGood;

    @ProtobufIndex(index = 4)
    public int progress;
    public static ProtobufAdapter<ConversationAdditionalQuickChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalQuickChat>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalQuickChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationAdditionalQuickChat conversationAdditionalQuickChat) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, conversationAdditionalQuickChat.avatarBlurred);
            QuickChatBell quickChatBell = conversationAdditionalQuickChat.bell;
            if (quickChatBell != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, quickChatBell, QuickChatBell.PROTOBUF_ADAPTER);
            }
            int iM17222d = iM17220b + CodedOutputByteBufferNano.m17222d(3, conversationAdditionalQuickChat.expire) + CodedOutputByteBufferNano.m17226h(4, conversationAdditionalQuickChat.progress) + CodedOutputByteBufferNano.m17220b(5, conversationAdditionalQuickChat.guideFakeToGood);
            conversationAdditionalQuickChat.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationAdditionalQuickChat parse(nb5 nb5Var) throws IOException {
            ConversationAdditionalQuickChat conversationAdditionalQuickChat = new ConversationAdditionalQuickChat();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationAdditionalQuickChat.bell != null) {
                        break;
                    }
                    conversationAdditionalQuickChat.bell = QuickChatBell.new_();
                    break;
                }
                if (iM158752u == 8) {
                    conversationAdditionalQuickChat.avatarBlurred = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    conversationAdditionalQuickChat.bell = (QuickChatBell) nb5Var.m158743l(QuickChatBell.PROTOBUF_ADAPTER);
                } else if (iM158752u == 25) {
                    conversationAdditionalQuickChat.expire = nb5Var.m158739h();
                } else if (iM158752u == 32) {
                    conversationAdditionalQuickChat.progress = nb5Var.m158741j();
                } else {
                    if (iM158752u != 40) {
                        if (conversationAdditionalQuickChat.bell != null) {
                            break;
                        }
                        conversationAdditionalQuickChat.bell = QuickChatBell.new_();
                        return conversationAdditionalQuickChat;
                    }
                    conversationAdditionalQuickChat.guideFakeToGood = nb5Var.m158738g();
                }
            }
            return conversationAdditionalQuickChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationAdditionalQuickChat conversationAdditionalQuickChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, conversationAdditionalQuickChat.avatarBlurred);
            QuickChatBell quickChatBell = conversationAdditionalQuickChat.bell;
            if (quickChatBell != null) {
                codedOutputByteBufferNano.m17254K(2, quickChatBell, QuickChatBell.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17246C(3, conversationAdditionalQuickChat.expire);
            codedOutputByteBufferNano.m17250G(4, conversationAdditionalQuickChat.progress);
            codedOutputByteBufferNano.m17244A(5, conversationAdditionalQuickChat.guideFakeToGood);
        }
    };
    public static JsonAdapter<ConversationAdditionalQuickChat> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalQuickChat>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalQuickChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationAdditionalQuickChat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationAdditionalQuickChat newInstance() {
            return new ConversationAdditionalQuickChat();
        }

        public boolean parseField(ConversationAdditionalQuickChat conversationAdditionalQuickChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expire":
                    conversationAdditionalQuickChat.expire = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "progress":
                    conversationAdditionalQuickChat.progress = jsonParser.getValueAsInt();
                    return true;
                case "guideFakeToGood":
                    conversationAdditionalQuickChat.guideFakeToGood = jsonParser.getValueAsBoolean();
                    return true;
                case "avatarBlurred":
                    conversationAdditionalQuickChat.avatarBlurred = jsonParser.getValueAsBoolean();
                    return true;
                case "bell":
                    conversationAdditionalQuickChat.bell = QuickChatBell.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationAdditionalQuickChat conversationAdditionalQuickChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expire":
                case "progress":
                case "guideFakeToGood":
                case "avatarBlurred":
                case "bell":
                    return true;
                default:
                    return super.parseFieldCheck(conversationAdditionalQuickChat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationAdditionalQuickChat conversationAdditionalQuickChat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("avatarBlurred", conversationAdditionalQuickChat.avatarBlurred);
            if (conversationAdditionalQuickChat.bell != null) {
                jsonGenerator.writeFieldName("bell");
                QuickChatBell.JSON_ADAPTER.serialize(conversationAdditionalQuickChat.bell, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("expire");
            Converter.API_TIME.serialize(Double.valueOf(conversationAdditionalQuickChat.expire), jsonGenerator, true);
            jsonGenerator.writeNumberField("progress", conversationAdditionalQuickChat.progress);
            jsonGenerator.writeBooleanField("guideFakeToGood", conversationAdditionalQuickChat.guideFakeToGood);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalQuickChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalQuickChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalQuickChat new_() {
        ConversationAdditionalQuickChat conversationAdditionalQuickChat = new ConversationAdditionalQuickChat();
        conversationAdditionalQuickChat.nullCheck();
        return conversationAdditionalQuickChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationAdditionalQuickChat mo223809clone() {
        ConversationAdditionalQuickChat conversationAdditionalQuickChat = new ConversationAdditionalQuickChat();
        conversationAdditionalQuickChat.avatarBlurred = this.avatarBlurred;
        QuickChatBell quickChatBell = this.bell;
        if (quickChatBell != null) {
            conversationAdditionalQuickChat.bell = quickChatBell.mo223809clone();
        }
        conversationAdditionalQuickChat.expire = this.expire;
        conversationAdditionalQuickChat.progress = this.progress;
        conversationAdditionalQuickChat.guideFakeToGood = this.guideFakeToGood;
        return conversationAdditionalQuickChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationAdditionalQuickChat)) {
            return false;
        }
        ConversationAdditionalQuickChat conversationAdditionalQuickChat = (ConversationAdditionalQuickChat) obj;
        return this.avatarBlurred == conversationAdditionalQuickChat.avatarBlurred && ValueObject.util_equals(this.bell, conversationAdditionalQuickChat.bell) && this.expire == conversationAdditionalQuickChat.expire && this.progress == conversationAdditionalQuickChat.progress && this.guideFakeToGood == conversationAdditionalQuickChat.guideFakeToGood;
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
        int i2 = ((i * 41) + (this.avatarBlurred ? 1231 : 1237)) * 41;
        QuickChatBell quickChatBell = this.bell;
        int iHashCode = quickChatBell != null ? quickChatBell.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expire);
        int i3 = ((((((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.progress) * 41) + (this.guideFakeToGood ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.bell == null) {
            this.bell = QuickChatBell.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
