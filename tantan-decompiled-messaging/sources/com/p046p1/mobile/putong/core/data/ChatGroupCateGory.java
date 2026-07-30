package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class ChatGroupCateGory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgroupcategory";

    @NonNull
    @ProtobufIndex(index = 3)
    public String backgroundColor;

    @ProtobufIndex(index = 5)
    public boolean hidden;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20363id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String textColor;
    public static ProtobufAdapter<ChatGroupCateGory> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroupCateGory>() { // from class: com.p1.mobile.putong.core.data.ChatGroupCateGory.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGroupCateGory chatGroupCateGory) {
            String str = chatGroupCateGory.f20363id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = chatGroupCateGory.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = chatGroupCateGory.backgroundColor;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = chatGroupCateGory.textColor;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, chatGroupCateGory.hidden);
            chatGroupCateGory.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGroupCateGory parse(nb5 nb5Var) throws IOException {
            ChatGroupCateGory chatGroupCateGory = new ChatGroupCateGory();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatGroupCateGory.f20363id == null) {
                        chatGroupCateGory.f20363id = "";
                    }
                    if (chatGroupCateGory.name == null) {
                        chatGroupCateGory.name = "";
                    }
                    if (chatGroupCateGory.backgroundColor == null) {
                        chatGroupCateGory.backgroundColor = "";
                    }
                    if (chatGroupCateGory.textColor != null) {
                        break;
                    }
                    chatGroupCateGory.textColor = "";
                    break;
                }
                if (iM158752u == 10) {
                    chatGroupCateGory.f20363id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    chatGroupCateGory.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    chatGroupCateGory.backgroundColor = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    chatGroupCateGory.textColor = nb5Var.m158750s();
                } else {
                    if (iM158752u != 40) {
                        if (chatGroupCateGory.f20363id == null) {
                            chatGroupCateGory.f20363id = "";
                        }
                        if (chatGroupCateGory.name == null) {
                            chatGroupCateGory.name = "";
                        }
                        if (chatGroupCateGory.backgroundColor == null) {
                            chatGroupCateGory.backgroundColor = "";
                        }
                        if (chatGroupCateGory.textColor != null) {
                            break;
                        }
                        chatGroupCateGory.textColor = "";
                        return chatGroupCateGory;
                    }
                    chatGroupCateGory.hidden = nb5Var.m158738g();
                }
            }
            return chatGroupCateGory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGroupCateGory chatGroupCateGory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGroupCateGory.f20363id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = chatGroupCateGory.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = chatGroupCateGory.backgroundColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = chatGroupCateGory.textColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17244A(5, chatGroupCateGory.hidden);
        }
    };
    public static JsonAdapter<ChatGroupCateGory> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupCateGory>() { // from class: com.p1.mobile.putong.core.data.ChatGroupCateGory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGroupCateGory.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGroupCateGory newInstance() {
            return new ChatGroupCateGory();
        }

        public boolean parseField(ChatGroupCateGory chatGroupCateGory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hidden":
                    chatGroupCateGory.hidden = jsonParser.getValueAsBoolean();
                    return true;
                case "textColor":
                    chatGroupCateGory.textColor = jsonParser.getValueAsString();
                    return true;
                case "id":
                    chatGroupCateGory.f20363id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    chatGroupCateGory.name = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    chatGroupCateGory.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGroupCateGory chatGroupCateGory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hidden":
                case "textColor":
                    return true;
                case "id":
                    return false;
                case "name":
                case "backgroundColor":
                    return true;
                default:
                    return super.parseFieldCheck(chatGroupCateGory, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGroupCateGory chatGroupCateGory, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGroupCateGory.f20363id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatGroupCateGory.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = chatGroupCateGory.backgroundColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("backgroundColor", str3);
            }
            String str4 = chatGroupCateGory.textColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("textColor", str4);
            }
            jsonGenerator.writeBooleanField("hidden", chatGroupCateGory.hidden);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupCateGory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupCateGory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGroupCateGory new_() {
        ChatGroupCateGory chatGroupCateGory = new ChatGroupCateGory();
        chatGroupCateGory.nullCheck();
        return chatGroupCateGory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGroupCateGory mo223809clone() {
        ChatGroupCateGory chatGroupCateGory = new ChatGroupCateGory();
        chatGroupCateGory.f20363id = this.f20363id;
        chatGroupCateGory.name = this.name;
        chatGroupCateGory.backgroundColor = this.backgroundColor;
        chatGroupCateGory.textColor = this.textColor;
        chatGroupCateGory.hidden = this.hidden;
        return chatGroupCateGory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGroupCateGory)) {
            return false;
        }
        ChatGroupCateGory chatGroupCateGory = (ChatGroupCateGory) obj;
        return ValueObject.util_equals(this.f20363id, chatGroupCateGory.f20363id) && ValueObject.util_equals(this.name, chatGroupCateGory.name) && ValueObject.util_equals(this.backgroundColor, chatGroupCateGory.backgroundColor) && ValueObject.util_equals(this.textColor, chatGroupCateGory.textColor) && this.hidden == chatGroupCateGory.hidden;
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
        String str = this.f20363id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.textColor;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.hidden ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20363id == null) {
            this.f20363id = "";
        }
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
