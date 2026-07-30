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
public class ChatGameInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgameinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String link;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<ChatGameInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGameInfo>() { // from class: com.p1.mobile.putong.core.data.ChatGameInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGameInfo chatGameInfo) {
            String str = chatGameInfo.name;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, chatGameInfo.enable);
            String str2 = chatGameInfo.link;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = chatGameInfo.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) chatGameInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGameInfo m12003parse(nb5 nb5Var) throws IOException {
            ChatGameInfo chatGameInfo = new ChatGameInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatGameInfo.name == null) {
                        chatGameInfo.name = "";
                    }
                    if (chatGameInfo.link == null) {
                        chatGameInfo.link = "";
                    }
                    if (chatGameInfo.icon != null) {
                        break;
                    }
                    chatGameInfo.icon = "";
                    break;
                }
                if (iU == 10) {
                    chatGameInfo.name = nb5Var.s();
                } else if (iU == 16) {
                    chatGameInfo.enable = nb5Var.g();
                } else if (iU == 26) {
                    chatGameInfo.link = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (chatGameInfo.name == null) {
                            chatGameInfo.name = "";
                        }
                        if (chatGameInfo.link == null) {
                            chatGameInfo.link = "";
                        }
                        if (chatGameInfo.icon != null) {
                            break;
                        }
                        chatGameInfo.icon = "";
                        return chatGameInfo;
                    }
                    chatGameInfo.icon = nb5Var.s();
                }
            }
            return chatGameInfo;
        }

        public void serialize(ChatGameInfo chatGameInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGameInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, chatGameInfo.enable);
            String str2 = chatGameInfo.link;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = chatGameInfo.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<ChatGameInfo> JSON_ADAPTER = new ObjectJsonAdapter<ChatGameInfo>() { // from class: com.p1.mobile.putong.core.data.ChatGameInfo.2
        public Class getDataClass() {
            return ChatGameInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGameInfo m12004newInstance() {
            return new ChatGameInfo();
        }

        public boolean parseField(ChatGameInfo chatGameInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    chatGameInfo.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "icon":
                    chatGameInfo.icon = jsonParser.getValueAsString();
                    return true;
                case "link":
                    chatGameInfo.link = jsonParser.getValueAsString();
                    return true;
                case "name":
                    chatGameInfo.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGameInfo chatGameInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "icon":
                case "link":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(chatGameInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatGameInfo chatGameInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGameInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            jsonGenerator.writeBooleanField("enable", chatGameInfo.enable);
            String str2 = chatGameInfo.link;
            if (str2 != null) {
                jsonGenerator.writeStringField("link", str2);
            }
            String str3 = chatGameInfo.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGameInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGameInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGameInfo new_() {
        ChatGameInfo chatGameInfo = new ChatGameInfo();
        chatGameInfo.nullCheck();
        return chatGameInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGameInfo m12002clone() {
        ChatGameInfo chatGameInfo = new ChatGameInfo();
        chatGameInfo.name = this.name;
        chatGameInfo.enable = this.enable;
        chatGameInfo.link = this.link;
        chatGameInfo.icon = this.icon;
        return chatGameInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGameInfo)) {
            return false;
        }
        ChatGameInfo chatGameInfo = (ChatGameInfo) obj;
        return ValueObject.util_equals(this.name, chatGameInfo.name) && this.enable == chatGameInfo.enable && ValueObject.util_equals(this.link, chatGameInfo.link) && ValueObject.util_equals(this.icon, chatGameInfo.icon);
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.link == null) {
            this.link = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
