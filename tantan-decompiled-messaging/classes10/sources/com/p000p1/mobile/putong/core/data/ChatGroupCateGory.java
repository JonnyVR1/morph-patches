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
public class ChatGroupCateGory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgroupcategory";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String backgroundColor;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean hidden;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f25id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String textColor;
    public static ProtobufAdapter<ChatGroupCateGory> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroupCateGory>() { // from class: com.p1.mobile.putong.core.data.ChatGroupCateGory.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGroupCateGory chatGroupCateGory) {
            String str = chatGroupCateGory.f25id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = chatGroupCateGory.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = chatGroupCateGory.backgroundColor;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = chatGroupCateGory.textColor;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, chatGroupCateGory.hidden);
            ((MessageNano) chatGroupCateGory).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGroupCateGory m12021parse(nb5 nb5Var) throws IOException {
            ChatGroupCateGory chatGroupCateGory = new ChatGroupCateGory();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatGroupCateGory.f25id == null) {
                        chatGroupCateGory.f25id = "";
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
                if (iU == 10) {
                    chatGroupCateGory.f25id = nb5Var.s();
                } else if (iU == 18) {
                    chatGroupCateGory.name = nb5Var.s();
                } else if (iU == 26) {
                    chatGroupCateGory.backgroundColor = nb5Var.s();
                } else if (iU == 34) {
                    chatGroupCateGory.textColor = nb5Var.s();
                } else {
                    if (iU != 40) {
                        if (chatGroupCateGory.f25id == null) {
                            chatGroupCateGory.f25id = "";
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
                    chatGroupCateGory.hidden = nb5Var.g();
                }
            }
            return chatGroupCateGory;
        }

        public void serialize(ChatGroupCateGory chatGroupCateGory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGroupCateGory.f25id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = chatGroupCateGory.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = chatGroupCateGory.backgroundColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = chatGroupCateGory.textColor;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.A(5, chatGroupCateGory.hidden);
        }
    };
    public static JsonAdapter<ChatGroupCateGory> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupCateGory>() { // from class: com.p1.mobile.putong.core.data.ChatGroupCateGory.2
        public Class getDataClass() {
            return ChatGroupCateGory.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGroupCateGory m12022newInstance() {
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
                    chatGroupCateGory.f25id = jsonParser.getValueAsString();
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

        public void serializeFields(ChatGroupCateGory chatGroupCateGory, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGroupCateGory.f25id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatGroupCateGory.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = chatGroupCateGory.backgroundColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("backgroundColor", str3);
            }
            String str4 = chatGroupCateGory.textColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("textColor", str4);
            }
            jsonGenerator.writeBooleanField(MyVisitorsShowType.hidden, chatGroupCateGory.hidden);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupCateGory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupCateGory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGroupCateGory new_() {
        ChatGroupCateGory chatGroupCateGory = new ChatGroupCateGory();
        chatGroupCateGory.nullCheck();
        return chatGroupCateGory;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGroupCateGory m12020clone() {
        ChatGroupCateGory chatGroupCateGory = new ChatGroupCateGory();
        chatGroupCateGory.f25id = this.f25id;
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
        return ValueObject.util_equals(this.f25id, chatGroupCateGory.f25id) && ValueObject.util_equals(this.name, chatGroupCateGory.name) && ValueObject.util_equals(this.backgroundColor, chatGroupCateGory.backgroundColor) && ValueObject.util_equals(this.textColor, chatGroupCateGory.textColor) && this.hidden == chatGroupCateGory.hidden;
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
        String str = this.f25id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.textColor;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.hidden ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f25id == null) {
            this.f25id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
