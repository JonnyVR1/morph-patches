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
public class ConversationQuickChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationquickchat";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean bell;

    @ProtobufIndex(index = 6)
    public boolean bellPrivilegeIntercept;

    @NonNull
    @ProtobufIndex(index = 7)
    public String bellType;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public QuickChatBiz biz;

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    @NonNull
    @ProtobufIndex(index = 8)
    public String clearAvatar;

    @ProtobufIndex(index = 4)
    public boolean oneside;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean speed;
    public static ProtobufAdapter<ConversationQuickChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationQuickChat>() { // from class: com.p1.mobile.putong.core.data.ConversationQuickChat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationQuickChat conversationQuickChat) {
            String str = conversationQuickChat.category;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, conversationQuickChat.bell) + CodedOutputByteBufferNano.b(3, conversationQuickChat.speed) + CodedOutputByteBufferNano.b(4, conversationQuickChat.oneside);
            QuickChatBiz quickChatBiz = conversationQuickChat.biz;
            if (quickChatBiz != null) {
                iO += CodedOutputByteBufferNano.l(5, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(6, conversationQuickChat.bellPrivilegeIntercept);
            String str2 = conversationQuickChat.bellType;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(7, str2);
            }
            String str3 = conversationQuickChat.clearAvatar;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(8, str3);
            }
            ((MessageNano) conversationQuickChat).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationQuickChat m12417parse(nb5 nb5Var) throws IOException {
            ConversationQuickChat conversationQuickChat = new ConversationQuickChat();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    conversationQuickChat.category = nb5Var.s();
                } else if (iU == 16) {
                    conversationQuickChat.bell = nb5Var.g();
                } else if (iU == 24) {
                    conversationQuickChat.speed = nb5Var.g();
                } else if (iU == 32) {
                    conversationQuickChat.oneside = nb5Var.g();
                } else if (iU == 42) {
                    conversationQuickChat.biz = (QuickChatBiz) nb5Var.l(QuickChatBiz.PROTOBUF_ADAPTER);
                } else if (iU == 48) {
                    conversationQuickChat.bellPrivilegeIntercept = nb5Var.g();
                } else if (iU == 58) {
                    conversationQuickChat.bellType = nb5Var.s();
                } else {
                    if (iU != 66) {
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
                    conversationQuickChat.clearAvatar = nb5Var.s();
                }
            }
            return conversationQuickChat;
        }

        public void serialize(ConversationQuickChat conversationQuickChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationQuickChat.category;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, conversationQuickChat.bell);
            codedOutputByteBufferNano.A(3, conversationQuickChat.speed);
            codedOutputByteBufferNano.A(4, conversationQuickChat.oneside);
            QuickChatBiz quickChatBiz = conversationQuickChat.biz;
            if (quickChatBiz != null) {
                codedOutputByteBufferNano.K(5, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(6, conversationQuickChat.bellPrivilegeIntercept);
            String str2 = conversationQuickChat.bellType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(7, str2);
            }
            String str3 = conversationQuickChat.clearAvatar;
            if (str3 != null) {
                codedOutputByteBufferNano.R(8, str3);
            }
        }
    };
    public static JsonAdapter<ConversationQuickChat> JSON_ADAPTER = new ObjectJsonAdapter<ConversationQuickChat>() { // from class: com.p1.mobile.putong.core.data.ConversationQuickChat.2
        public Class getDataClass() {
            return ConversationQuickChat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationQuickChat m12418newInstance() {
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
                    conversationQuickChat.biz = (QuickChatBiz) QuickChatBiz.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationQuickChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationQuickChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationQuickChat new_() {
        ConversationQuickChat conversationQuickChat = new ConversationQuickChat();
        conversationQuickChat.nullCheck();
        return conversationQuickChat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationQuickChat m12416clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
