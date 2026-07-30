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
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, conversationQuickChat.bell) + CodedOutputByteBufferNano.m17275b(3, conversationQuickChat.speed) + CodedOutputByteBufferNano.m17275b(4, conversationQuickChat.oneside);
            QuickChatBiz quickChatBiz = conversationQuickChat.biz;
            if (quickChatBiz != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(6, conversationQuickChat.bellPrivilegeIntercept);
            String str2 = conversationQuickChat.bellType;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str2);
            }
            String str3 = conversationQuickChat.clearAvatar;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str3);
            }
            conversationQuickChat.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationQuickChat parse(nc5 nc5Var) throws IOException {
            ConversationQuickChat conversationQuickChat = new ConversationQuickChat();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    conversationQuickChat.category = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    conversationQuickChat.bell = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    conversationQuickChat.speed = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    conversationQuickChat.oneside = nc5Var.m162483g();
                } else if (iM162497u == 42) {
                    conversationQuickChat.biz = (QuickChatBiz) nc5Var.m162488l(QuickChatBiz.PROTOBUF_ADAPTER);
                } else if (iM162497u == 48) {
                    conversationQuickChat.bellPrivilegeIntercept = nc5Var.m162483g();
                } else if (iM162497u == 58) {
                    conversationQuickChat.bellType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
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
                    conversationQuickChat.clearAvatar = nc5Var.m162495s();
                }
            }
            return conversationQuickChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationQuickChat conversationQuickChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationQuickChat.category;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, conversationQuickChat.bell);
            codedOutputByteBufferNano.m17299A(3, conversationQuickChat.speed);
            codedOutputByteBufferNano.m17299A(4, conversationQuickChat.oneside);
            QuickChatBiz quickChatBiz = conversationQuickChat.biz;
            if (quickChatBiz != null) {
                codedOutputByteBufferNano.m17309K(5, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(6, conversationQuickChat.bellPrivilegeIntercept);
            String str2 = conversationQuickChat.bellType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(7, str2);
            }
            String str3 = conversationQuickChat.clearAvatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(8, str3);
            }
        }
    };
    public static JsonAdapter<ConversationQuickChat> JSON_ADAPTER = new ObjectJsonAdapter<ConversationQuickChat>() { // from class: com.p1.mobile.putong.core.data.ConversationQuickChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationQuickChat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationQuickChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ConversationQuickChat mo225055clone() {
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
