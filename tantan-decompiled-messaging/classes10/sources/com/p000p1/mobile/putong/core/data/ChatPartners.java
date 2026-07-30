package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatPartnerText;
import com.p1.mobile.putong.data.User;
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
public class ChatPartners extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpartners";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int remainSignalCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ChatPartnerText> texts;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<User> users;
    public static ProtobufAdapter<ChatPartners> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPartners>() { // from class: com.p1.mobile.putong.core.data.ChatPartners.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatPartners chatPartners) {
            List<ChatPartnerText> list = chatPartners.texts;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ChatPartnerText.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<User> list2 = chatPartners.users;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iL + CodedOutputByteBufferNano.h(3, chatPartners.remainSignalCount);
            ((MessageNano) chatPartners).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatPartners m12117parse(nb5 nb5Var) throws IOException {
            ChatPartners chatPartners = new ChatPartners();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatPartners.texts == null) {
                        chatPartners.texts = new ArrayList();
                    }
                    if (chatPartners.users != null) {
                        break;
                    }
                    chatPartners.users = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    chatPartners.texts = (List) nb5Var.l(ChatPartnerText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    chatPartners.users = (List) nb5Var.l(User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 24) {
                        if (chatPartners.texts == null) {
                            chatPartners.texts = new ArrayList();
                        }
                        if (chatPartners.users != null) {
                            break;
                        }
                        chatPartners.users = new ArrayList();
                        return chatPartners;
                    }
                    chatPartners.remainSignalCount = nb5Var.j();
                }
            }
            return chatPartners;
        }

        public void serialize(ChatPartners chatPartners, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ChatPartnerText> list = chatPartners.texts;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ChatPartnerText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<User> list2 = chatPartners.users;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(3, chatPartners.remainSignalCount);
        }
    };
    public static JsonAdapter<ChatPartners> JSON_ADAPTER = new ObjectJsonAdapter<ChatPartners>() { // from class: com.p1.mobile.putong.core.data.ChatPartners.2
        public Class getDataClass() {
            return ChatPartners.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatPartners m12118newInstance() {
            return new ChatPartners();
        }

        public boolean parseField(ChatPartners chatPartners, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "texts":
                    chatPartners.texts = JsonAdapter.parseArray(jsonParser, ChatPartnerText.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "users":
                    chatPartners.users = JsonAdapter.parseArray(jsonParser, User.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "remainSignalCount":
                    chatPartners.remainSignalCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatPartners chatPartners, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "texts":
                case "users":
                case "remainSignalCount":
                    return true;
                default:
                    return super.parseFieldCheck(chatPartners, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatPartners chatPartners, JsonGenerator jsonGenerator) throws IOException {
            if (chatPartners.texts != null) {
                jsonGenerator.writeFieldName("texts");
                JsonAdapter.serializeArray(chatPartners.texts, jsonGenerator, ChatPartnerText.JSON_ADAPTER);
            }
            if (chatPartners.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(chatPartners.users, jsonGenerator, User.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("remainSignalCount", chatPartners.remainSignalCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPartners) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPartners) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatPartners new_() {
        ChatPartners chatPartners = new ChatPartners();
        chatPartners.nullCheck();
        return chatPartners;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatPartners m12116clone() {
        ChatPartners chatPartners = new ChatPartners();
        List<ChatPartnerText> list = this.texts;
        if (list != null) {
            chatPartners.texts = ValueObject.util_map(list, new w9j() { // from class: l.k15
                public final Object call(Object obj) {
                    return ((ChatPartnerText) obj).m12112clone();
                }
            });
        }
        List<User> list2 = this.users;
        if (list2 != null) {
            chatPartners.users = ValueObject.util_map(list2, new w9j() { // from class: l.l15
                public final Object call(Object obj) {
                    return ((User) obj).clone();
                }
            });
        }
        chatPartners.remainSignalCount = this.remainSignalCount;
        return chatPartners;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatPartners)) {
            return false;
        }
        ChatPartners chatPartners = (ChatPartners) obj;
        return ValueObject.util_equals(this.texts, chatPartners.texts) && ValueObject.util_equals(this.users, chatPartners.users) && this.remainSignalCount == chatPartners.remainSignalCount;
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
        List<ChatPartnerText> list = this.texts;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<User> list2 = this.users;
        int iHashCode2 = ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + this.remainSignalCount;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.texts == null) {
            this.texts = new ArrayList();
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
