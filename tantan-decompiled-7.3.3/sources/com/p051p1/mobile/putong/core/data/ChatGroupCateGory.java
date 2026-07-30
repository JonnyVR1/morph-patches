package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
    public String f21105id;

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
            String str = chatGroupCateGory.f21105id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = chatGroupCateGory.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = chatGroupCateGory.backgroundColor;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = chatGroupCateGory.textColor;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, chatGroupCateGory.hidden);
            chatGroupCateGory.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGroupCateGory parse(nc5 nc5Var) throws IOException {
            ChatGroupCateGory chatGroupCateGory = new ChatGroupCateGory();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatGroupCateGory.f21105id == null) {
                        chatGroupCateGory.f21105id = "";
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
                if (iM162497u == 10) {
                    chatGroupCateGory.f21105id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    chatGroupCateGory.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    chatGroupCateGory.backgroundColor = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    chatGroupCateGory.textColor = nc5Var.m162495s();
                } else {
                    if (iM162497u != 40) {
                        if (chatGroupCateGory.f21105id == null) {
                            chatGroupCateGory.f21105id = "";
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
                    chatGroupCateGory.hidden = nc5Var.m162483g();
                }
            }
            return chatGroupCateGory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGroupCateGory chatGroupCateGory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGroupCateGory.f21105id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = chatGroupCateGory.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = chatGroupCateGory.backgroundColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = chatGroupCateGory.textColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17299A(5, chatGroupCateGory.hidden);
        }
    };
    public static JsonAdapter<ChatGroupCateGory> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupCateGory>() { // from class: com.p1.mobile.putong.core.data.ChatGroupCateGory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGroupCateGory.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    chatGroupCateGory.f21105id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGroupCateGory chatGroupCateGory, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGroupCateGory.f21105id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupCateGory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ChatGroupCateGory mo225055clone() {
        ChatGroupCateGory chatGroupCateGory = new ChatGroupCateGory();
        chatGroupCateGory.f21105id = this.f21105id;
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
        return ValueObject.util_equals(this.f21105id, chatGroupCateGory.f21105id) && ValueObject.util_equals(this.name, chatGroupCateGory.name) && ValueObject.util_equals(this.backgroundColor, chatGroupCateGory.backgroundColor) && ValueObject.util_equals(this.textColor, chatGroupCateGory.textColor) && this.hidden == chatGroupCateGory.hidden;
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
        String str = this.f21105id;
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
        if (this.f21105id == null) {
            this.f21105id = "";
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
