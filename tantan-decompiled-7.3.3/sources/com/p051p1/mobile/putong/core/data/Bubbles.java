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
public class Bubbles extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bubbles";

    @NonNull
    @ProtobufIndex(index = 9)
    public ChatRoomBubble chatRoom;

    @NonNull
    @ProtobufIndex(index = 6)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f21098id;

    @NonNull
    @ProtobufIndex(index = 7)
    public String photoURL;

    @NonNull
    @ProtobufIndex(index = 8)
    public QuickChatBubble quickChat;

    @NonNull
    @ProtobufIndex(index = 1)
    public Ref ref;

    @NonNull
    @ProtobufIndex(index = 4)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userID;
    public static ProtobufAdapter<Bubbles> PROTOBUF_ADAPTER = new MessageNanoAdapter<Bubbles>() { // from class: com.p1.mobile.putong.core.data.Bubbles.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Bubbles bubbles) {
            Ref ref = bubbles.ref;
            int iM17285l = ref != null ? CodedOutputByteBufferNano.m17285l(1, ref, Ref.PROTOBUF_ADAPTER) : 0;
            String str = bubbles.type;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = bubbles.f21098id;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = bubbles.tracker;
            if (str3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = bubbles.userID;
            if (str4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = bubbles.content;
            if (str5 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            String str6 = bubbles.photoURL;
            if (str6 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            QuickChatBubble quickChatBubble = bubbles.quickChat;
            if (quickChatBubble != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(8, quickChatBubble, QuickChatBubble.PROTOBUF_ADAPTER);
            }
            ChatRoomBubble chatRoomBubble = bubbles.chatRoom;
            if (chatRoomBubble != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(9, chatRoomBubble, ChatRoomBubble.PROTOBUF_ADAPTER);
            }
            bubbles.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Bubbles parse(nc5 nc5Var) throws IOException {
            Bubbles bubbles = new Bubbles();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bubbles.type == null) {
                        bubbles.type = "";
                    }
                    if (bubbles.ref == null) {
                        bubbles.ref = Ref.new_();
                    }
                    if (bubbles.f21098id == null) {
                        bubbles.f21098id = "";
                    }
                    if (bubbles.tracker == null) {
                        bubbles.tracker = "";
                    }
                    if (bubbles.userID == null) {
                        bubbles.userID = "";
                    }
                    if (bubbles.photoURL == null) {
                        bubbles.photoURL = "";
                    }
                    if (bubbles.content == null) {
                        bubbles.content = "";
                    }
                    if (bubbles.quickChat == null) {
                        bubbles.quickChat = QuickChatBubble.new_();
                    }
                    if (bubbles.chatRoom != null) {
                        break;
                    }
                    bubbles.chatRoom = ChatRoomBubble.new_();
                    break;
                }
                if (iM162497u == 10) {
                    bubbles.ref = (Ref) nc5Var.m162488l(Ref.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    bubbles.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bubbles.f21098id = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    bubbles.tracker = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    bubbles.userID = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    bubbles.content = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    bubbles.photoURL = nc5Var.m162495s();
                } else if (iM162497u == 66) {
                    bubbles.quickChat = (QuickChatBubble) nc5Var.m162488l(QuickChatBubble.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 74) {
                        if (bubbles.type == null) {
                            bubbles.type = "";
                        }
                        if (bubbles.ref == null) {
                            bubbles.ref = Ref.new_();
                        }
                        if (bubbles.f21098id == null) {
                            bubbles.f21098id = "";
                        }
                        if (bubbles.tracker == null) {
                            bubbles.tracker = "";
                        }
                        if (bubbles.userID == null) {
                            bubbles.userID = "";
                        }
                        if (bubbles.photoURL == null) {
                            bubbles.photoURL = "";
                        }
                        if (bubbles.content == null) {
                            bubbles.content = "";
                        }
                        if (bubbles.quickChat == null) {
                            bubbles.quickChat = QuickChatBubble.new_();
                        }
                        if (bubbles.chatRoom != null) {
                            break;
                        }
                        bubbles.chatRoom = ChatRoomBubble.new_();
                        return bubbles;
                    }
                    bubbles.chatRoom = (ChatRoomBubble) nc5Var.m162488l(ChatRoomBubble.PROTOBUF_ADAPTER);
                }
            }
            return bubbles;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Bubbles bubbles, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Ref ref = bubbles.ref;
            if (ref != null) {
                codedOutputByteBufferNano.m17309K(1, ref, Ref.PROTOBUF_ADAPTER);
            }
            String str = bubbles.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = bubbles.f21098id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = bubbles.tracker;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = bubbles.userID;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = bubbles.content;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            String str6 = bubbles.photoURL;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
            QuickChatBubble quickChatBubble = bubbles.quickChat;
            if (quickChatBubble != null) {
                codedOutputByteBufferNano.m17309K(8, quickChatBubble, QuickChatBubble.PROTOBUF_ADAPTER);
            }
            ChatRoomBubble chatRoomBubble = bubbles.chatRoom;
            if (chatRoomBubble != null) {
                codedOutputByteBufferNano.m17309K(9, chatRoomBubble, ChatRoomBubble.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Bubbles> JSON_ADAPTER = new ObjectJsonAdapter<Bubbles>() { // from class: com.p1.mobile.putong.core.data.Bubbles.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Bubbles.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Bubbles newInstance() {
            return new Bubbles();
        }

        public boolean parseField(Bubbles bubbles, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "photoURL":
                    bubbles.photoURL = jsonParser.getValueAsString();
                    return true;
                case "tracker":
                    bubbles.tracker = jsonParser.getValueAsString();
                    return true;
                case "userID":
                    bubbles.userID = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bubbles.f21098id = jsonParser.getValueAsString();
                    return false;
                case "ref":
                    bubbles.ref = Ref.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bubbles.type = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bubbles.content = jsonParser.getValueAsString();
                    return true;
                case "quickChat":
                    bubbles.quickChat = QuickChatBubble.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatRoom":
                    bubbles.chatRoom = ChatRoomBubble.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Bubbles bubbles, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "photoURL":
                case "tracker":
                case "userID":
                    return true;
                case "id":
                    return false;
                case "ref":
                case "type":
                case "content":
                case "quickChat":
                case "chatRoom":
                    return true;
                default:
                    return super.parseFieldCheck(bubbles, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Bubbles bubbles, JsonGenerator jsonGenerator) throws IOException {
            String str = bubbles.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (bubbles.ref != null) {
                jsonGenerator.writeFieldName(Ref.TYPE);
                Ref.JSON_ADAPTER.serialize(bubbles.ref, jsonGenerator, true);
            }
            String str2 = bubbles.f21098id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = bubbles.tracker;
            if (str3 != null) {
                jsonGenerator.writeStringField("tracker", str3);
            }
            String str4 = bubbles.userID;
            if (str4 != null) {
                jsonGenerator.writeStringField("userID", str4);
            }
            String str5 = bubbles.photoURL;
            if (str5 != null) {
                jsonGenerator.writeStringField("photoURL", str5);
            }
            String str6 = bubbles.content;
            if (str6 != null) {
                jsonGenerator.writeStringField("content", str6);
            }
            if (bubbles.quickChat != null) {
                jsonGenerator.writeFieldName("quickChat");
                QuickChatBubble.JSON_ADAPTER.serialize(bubbles.quickChat, jsonGenerator, true);
            }
            if (bubbles.chatRoom != null) {
                jsonGenerator.writeFieldName("chatRoom");
                ChatRoomBubble.JSON_ADAPTER.serialize(bubbles.chatRoom, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Bubbles) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Bubbles) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Bubbles new_() {
        Bubbles bubbles = new Bubbles();
        bubbles.nullCheck();
        return bubbles;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Bubbles mo225055clone() {
        Bubbles bubbles = new Bubbles();
        bubbles.type = this.type;
        Ref ref = this.ref;
        if (ref != null) {
            bubbles.ref = ref.mo225055clone();
        }
        bubbles.f21098id = this.f21098id;
        bubbles.tracker = this.tracker;
        bubbles.userID = this.userID;
        bubbles.photoURL = this.photoURL;
        bubbles.content = this.content;
        QuickChatBubble quickChatBubble = this.quickChat;
        if (quickChatBubble != null) {
            bubbles.quickChat = quickChatBubble.mo225055clone();
        }
        ChatRoomBubble chatRoomBubble = this.chatRoom;
        if (chatRoomBubble != null) {
            bubbles.chatRoom = chatRoomBubble.mo225055clone();
        }
        return bubbles;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bubbles)) {
            return false;
        }
        Bubbles bubbles = (Bubbles) obj;
        return ValueObject.util_equals(this.type, bubbles.type) && ValueObject.util_equals(this.ref, bubbles.ref) && ValueObject.util_equals(this.f21098id, bubbles.f21098id) && ValueObject.util_equals(this.tracker, bubbles.tracker) && ValueObject.util_equals(this.userID, bubbles.userID) && ValueObject.util_equals(this.photoURL, bubbles.photoURL) && ValueObject.util_equals(this.content, bubbles.content) && ValueObject.util_equals(this.quickChat, bubbles.quickChat) && ValueObject.util_equals(this.chatRoom, bubbles.chatRoom);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Ref ref = this.ref;
        int iHashCode2 = (iHashCode + (ref != null ? ref.hashCode() : 0)) * 41;
        String str2 = this.f21098id;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tracker;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userID;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.photoURL;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.content;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        QuickChatBubble quickChatBubble = this.quickChat;
        int iHashCode8 = (iHashCode7 + (quickChatBubble != null ? quickChatBubble.hashCode() : 0)) * 41;
        ChatRoomBubble chatRoomBubble = this.chatRoom;
        int iHashCode9 = iHashCode8 + (chatRoomBubble != null ? chatRoomBubble.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.ref == null) {
            this.ref = Ref.new_();
        }
        if (this.f21098id == null) {
            this.f21098id = "";
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.photoURL == null) {
            this.photoURL = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.quickChat == null) {
            this.quickChat = QuickChatBubble.new_();
        }
        if (this.chatRoom == null) {
            this.chatRoom = ChatRoomBubble.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
