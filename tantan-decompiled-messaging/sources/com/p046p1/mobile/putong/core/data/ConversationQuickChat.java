package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ConversationQuickChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationquickchat";

    @ProtobufIndex(index = 2)
    public boolean bell;

    @ProtobufIndex(index = 6)
    public boolean bellPrivilegeIntercept;

    @NonNull
    @ProtobufIndex(index = 7)
    public String bellType;

    @NonNull
    @ProtobufIndex(index = 5)
    public QuickChatBiz biz;

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    @NonNull
    @ProtobufIndex(index = 8)
    public String clearAvatar;

    @ProtobufIndex(index = 4)
    public boolean oneside;

    @ProtobufIndex(index = 3)
    public boolean speed;
    public static ProtobufAdapter<ConversationQuickChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationQuickChat>() { // from class: com.p1.mobile.putong.core.data.ConversationQuickChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationQuickChat conversationQuickChat) {
            String str = conversationQuickChat.category;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, conversationQuickChat.bell) + CodedOutputByteBufferNano.m17220b(3, conversationQuickChat.speed) + CodedOutputByteBufferNano.m17220b(4, conversationQuickChat.oneside);
            QuickChatBiz quickChatBiz = conversationQuickChat.biz;
            if (quickChatBiz != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(6, conversationQuickChat.bellPrivilegeIntercept);
            String str2 = conversationQuickChat.bellType;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(7, str2);
            }
            String str3 = conversationQuickChat.clearAvatar;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(8, str3);
            }
            conversationQuickChat.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationQuickChat parse(nb5 nb5Var) throws IOException {
            ConversationQuickChat conversationQuickChat = new ConversationQuickChat();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationQuickChat.category == null) {
                        conversationQuickChat.category = "";
                    }
                    if (conversationQuickChat.biz == null) {
                        conversationQuickChat.biz = (QuickChatBiz) QuickChatBiz.JSON_ADAPTER.defaultEnum();
                    }
                    if (conversationQuickChat.bellType == null) {
                        conversationQuickChat.bellType = "";
                    }
                    if (conversationQuickChat.clearAvatar != null) {
                        break;
                    }
                    conversationQuickChat.clearAvatar = "";
                    break;
                }
                if (iM158752u == 10) {
                    conversationQuickChat.category = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    conversationQuickChat.bell = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    conversationQuickChat.speed = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    conversationQuickChat.oneside = nb5Var.m158738g();
                } else if (iM158752u == 42) {
                    conversationQuickChat.biz = (QuickChatBiz) nb5Var.m158743l(QuickChatBiz.PROTOBUF_ADAPTER);
                } else if (iM158752u == 48) {
                    conversationQuickChat.bellPrivilegeIntercept = nb5Var.m158738g();
                } else if (iM158752u == 58) {
                    conversationQuickChat.bellType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 66) {
                        if (conversationQuickChat.category == null) {
                            conversationQuickChat.category = "";
                        }
                        if (conversationQuickChat.biz == null) {
                            conversationQuickChat.biz = (QuickChatBiz) QuickChatBiz.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversationQuickChat.bellType == null) {
                            conversationQuickChat.bellType = "";
                        }
                        if (conversationQuickChat.clearAvatar != null) {
                            break;
                        }
                        conversationQuickChat.clearAvatar = "";
                        return conversationQuickChat;
                    }
                    conversationQuickChat.clearAvatar = nb5Var.m158750s();
                }
            }
            return conversationQuickChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationQuickChat conversationQuickChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationQuickChat.category;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, conversationQuickChat.bell);
            codedOutputByteBufferNano.m17244A(3, conversationQuickChat.speed);
            codedOutputByteBufferNano.m17244A(4, conversationQuickChat.oneside);
            QuickChatBiz quickChatBiz = conversationQuickChat.biz;
            if (quickChatBiz != null) {
                codedOutputByteBufferNano.m17254K(5, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(6, conversationQuickChat.bellPrivilegeIntercept);
            String str2 = conversationQuickChat.bellType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(7, str2);
            }
            String str3 = conversationQuickChat.clearAvatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(8, str3);
            }
        }
    };
    public static JsonAdapter<ConversationQuickChat> JSON_ADAPTER = new ObjectJsonAdapter<ConversationQuickChat>() { // from class: com.p1.mobile.putong.core.data.ConversationQuickChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationQuickChat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationQuickChat newInstance() {
            return new ConversationQuickChat();
        }

        public boolean parseField(ConversationQuickChat conversationQuickChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "clearAvatar":
                    conversationQuickChat.clearAvatar = jsonParser.getValueAsString();
                    return true;
                case "oneside":
                    conversationQuickChat.oneside = jsonParser.getValueAsBoolean();
                    return true;
                case "biz":
                    conversationQuickChat.biz = QuickChatBiz.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "bell":
                    conversationQuickChat.bell = jsonParser.getValueAsBoolean();
                    return true;
                case "category":
                    conversationQuickChat.category = jsonParser.getValueAsString();
                    return true;
                case "speed":
                    conversationQuickChat.speed = jsonParser.getValueAsBoolean();
                    return true;
                case "bellType":
                    conversationQuickChat.bellType = jsonParser.getValueAsString();
                    return true;
                case "bellPrivilegeIntercept":
                    conversationQuickChat.bellPrivilegeIntercept = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationQuickChat conversationQuickChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "clearAvatar":
                case "oneside":
                case "biz":
                case "bell":
                case "category":
                case "speed":
                case "bellType":
                case "bellPrivilegeIntercept":
                    return true;
                default:
                    return super.parseFieldCheck(conversationQuickChat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationQuickChat conversationQuickChat, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationQuickChat.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            jsonGenerator.writeBooleanField("bell", conversationQuickChat.bell);
            jsonGenerator.writeBooleanField("speed", conversationQuickChat.speed);
            jsonGenerator.writeBooleanField(ConversationAdditionalTagType.oneside, conversationQuickChat.oneside);
            if (conversationQuickChat.biz != null) {
                jsonGenerator.writeFieldName("biz");
                QuickChatBiz.JSON_ADAPTER.serialize(conversationQuickChat.biz, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("bellPrivilegeIntercept", conversationQuickChat.bellPrivilegeIntercept);
            String str2 = conversationQuickChat.bellType;
            if (str2 != null) {
                jsonGenerator.writeStringField("bellType", str2);
            }
            String str3 = conversationQuickChat.clearAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("clearAvatar", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationQuickChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationQuickChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationQuickChat new_() {
        ConversationQuickChat conversationQuickChat = new ConversationQuickChat();
        conversationQuickChat.nullCheck();
        return conversationQuickChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationQuickChat mo223809clone() {
        ConversationQuickChat conversationQuickChat = new ConversationQuickChat();
        conversationQuickChat.category = this.category;
        conversationQuickChat.bell = this.bell;
        conversationQuickChat.speed = this.speed;
        conversationQuickChat.oneside = this.oneside;
        conversationQuickChat.biz = this.biz;
        conversationQuickChat.bellPrivilegeIntercept = this.bellPrivilegeIntercept;
        conversationQuickChat.bellType = this.bellType;
        conversationQuickChat.clearAvatar = this.clearAvatar;
        return conversationQuickChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationQuickChat)) {
            return false;
        }
        ConversationQuickChat conversationQuickChat = (ConversationQuickChat) obj;
        return ValueObject.util_equals(this.category, conversationQuickChat.category) && this.bell == conversationQuickChat.bell && this.speed == conversationQuickChat.speed && this.oneside == conversationQuickChat.oneside && ValueObject.util_equals(this.biz, conversationQuickChat.biz) && this.bellPrivilegeIntercept == conversationQuickChat.bellPrivilegeIntercept && ValueObject.util_equals(this.bellType, conversationQuickChat.bellType) && ValueObject.util_equals(this.clearAvatar, conversationQuickChat.clearAvatar);
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
        String str = this.category;
        int iHashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.bell ? 1231 : 1237)) * 41) + (this.speed ? 1231 : 1237)) * 41) + (this.oneside ? 1231 : 1237)) * 41;
        QuickChatBiz quickChatBiz = this.biz;
        int iHashCode2 = (((iHashCode + (quickChatBiz != null ? quickChatBiz.hashCode() : 0)) * 41) + (this.bellPrivilegeIntercept ? 1231 : 1237)) * 41;
        String str2 = this.bellType;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.clearAvatar;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.biz == null) {
            this.biz = (QuickChatBiz) QuickChatBiz.JSON_ADAPTER.defaultEnum();
        }
        if (this.bellType == null) {
            this.bellType = "";
        }
        if (this.clearAvatar == null) {
            this.clearAvatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
