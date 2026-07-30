package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatRoomBubble;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatRoomBubble extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatroombubble";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> avatars;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int chatUserNum;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String liveID;

    @NonNull
    @ProtobufIndex(index = 4)
    public String roomID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String theme;
    public static ProtobufAdapter<ChatRoomBubble> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatRoomBubble>() { // from class: com.p1.mobile.putong.core.data.ChatRoomBubble.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatRoomBubble chatRoomBubble) {
            String str = chatRoomBubble.theme;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, chatRoomBubble.chatUserNum);
            List<String> list = chatRoomBubble.avatars;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = chatRoomBubble.roomID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = chatRoomBubble.liveID;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) chatRoomBubble).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatRoomBubble m12145parse(nb5 nb5Var) throws IOException {
            ChatRoomBubble chatRoomBubble = new ChatRoomBubble();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatRoomBubble.roomID == null) {
                        chatRoomBubble.roomID = "";
                    }
                    if (chatRoomBubble.liveID == null) {
                        chatRoomBubble.liveID = "";
                    }
                    if (chatRoomBubble.theme == null) {
                        chatRoomBubble.theme = "";
                    }
                    if (chatRoomBubble.avatars != null) {
                        break;
                    }
                    chatRoomBubble.avatars = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    chatRoomBubble.theme = nb5Var.s();
                } else if (iU == 16) {
                    chatRoomBubble.chatUserNum = nb5Var.j();
                } else if (iU == 26) {
                    chatRoomBubble.avatars = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    chatRoomBubble.roomID = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (chatRoomBubble.roomID == null) {
                            chatRoomBubble.roomID = "";
                        }
                        if (chatRoomBubble.liveID == null) {
                            chatRoomBubble.liveID = "";
                        }
                        if (chatRoomBubble.theme == null) {
                            chatRoomBubble.theme = "";
                        }
                        if (chatRoomBubble.avatars != null) {
                            break;
                        }
                        chatRoomBubble.avatars = new ArrayList();
                        return chatRoomBubble;
                    }
                    chatRoomBubble.liveID = nb5Var.s();
                }
            }
            return chatRoomBubble;
        }

        public void serialize(ChatRoomBubble chatRoomBubble, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatRoomBubble.theme;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, chatRoomBubble.chatUserNum);
            List<String> list = chatRoomBubble.avatars;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = chatRoomBubble.roomID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = chatRoomBubble.liveID;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<ChatRoomBubble> JSON_ADAPTER = new ObjectJsonAdapter<ChatRoomBubble>() { // from class: com.p1.mobile.putong.core.data.ChatRoomBubble.2
        public Class getDataClass() {
            return ChatRoomBubble.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatRoomBubble m12146newInstance() {
            return new ChatRoomBubble();
        }

        public boolean parseField(ChatRoomBubble chatRoomBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveID":
                    chatRoomBubble.liveID = jsonParser.getValueAsString();
                    return true;
                case "roomID":
                    chatRoomBubble.roomID = jsonParser.getValueAsString();
                    return true;
                case "avatars":
                    chatRoomBubble.avatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "theme":
                    chatRoomBubble.theme = jsonParser.getValueAsString();
                    return true;
                case "chatUserNum":
                    chatRoomBubble.chatUserNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatRoomBubble chatRoomBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "liveID":
                case "roomID":
                case "avatars":
                case "theme":
                case "chatUserNum":
                    return true;
                default:
                    return super.parseFieldCheck(chatRoomBubble, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatRoomBubble chatRoomBubble, JsonGenerator jsonGenerator) throws IOException {
            String str = chatRoomBubble.roomID;
            if (str != null) {
                jsonGenerator.writeStringField("roomID", str);
            }
            String str2 = chatRoomBubble.liveID;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveID", str2);
            }
            String str3 = chatRoomBubble.theme;
            if (str3 != null) {
                jsonGenerator.writeStringField(IntlMarketToken.theme, str3);
            }
            jsonGenerator.writeNumberField("chatUserNum", chatRoomBubble.chatUserNum);
            if (chatRoomBubble.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(chatRoomBubble.avatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatRoomBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatRoomBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m77a(String str) {
        return str;
    }

    public static ChatRoomBubble new_() {
        ChatRoomBubble chatRoomBubble = new ChatRoomBubble();
        chatRoomBubble.nullCheck();
        return chatRoomBubble;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatRoomBubble m12144clone() {
        ChatRoomBubble chatRoomBubble = new ChatRoomBubble();
        chatRoomBubble.roomID = this.roomID;
        chatRoomBubble.liveID = this.liveID;
        chatRoomBubble.theme = this.theme;
        chatRoomBubble.chatUserNum = this.chatUserNum;
        List<String> list = this.avatars;
        if (list != null) {
            chatRoomBubble.avatars = ValueObject.util_map(list, new w9j() { // from class: l.z15
                public final Object call(Object obj) {
                    return ChatRoomBubble.m77a((String) obj);
                }
            });
        }
        return chatRoomBubble;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatRoomBubble)) {
            return false;
        }
        ChatRoomBubble chatRoomBubble = (ChatRoomBubble) obj;
        return ValueObject.util_equals(this.roomID, chatRoomBubble.roomID) && ValueObject.util_equals(this.liveID, chatRoomBubble.liveID) && ValueObject.util_equals(this.theme, chatRoomBubble.theme) && this.chatUserNum == chatRoomBubble.chatUserNum && ValueObject.util_equals(this.avatars, chatRoomBubble.avatars);
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
        String str = this.roomID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.theme;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.chatUserNum) * 41;
        List<String> list = this.avatars;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.roomID == null) {
            this.roomID = "";
        }
        if (this.liveID == null) {
            this.liveID = "";
        }
        if (this.theme == null) {
            this.theme = "";
        }
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
