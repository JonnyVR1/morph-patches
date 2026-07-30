package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Media;
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
public class ChatGroupTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgrouptopic";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f27id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Media> medias;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String owner;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String value;
    public static ProtobufAdapter<ChatGroupTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroupTopic>() { // from class: com.p1.mobile.putong.core.data.ChatGroupTopic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGroupTopic chatGroupTopic) {
            String str = chatGroupTopic.f27id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = chatGroupTopic.owner;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = chatGroupTopic.value;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            List<Media> list = chatGroupTopic.medias;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) chatGroupTopic).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGroupTopic m12043parse(nb5 nb5Var) throws IOException {
            ChatGroupTopic chatGroupTopic = new ChatGroupTopic();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatGroupTopic.f27id == null) {
                        chatGroupTopic.f27id = "";
                    }
                    if (chatGroupTopic.owner == null) {
                        chatGroupTopic.owner = "";
                    }
                    if (chatGroupTopic.value == null) {
                        chatGroupTopic.value = "";
                    }
                    if (chatGroupTopic.medias != null) {
                        break;
                    }
                    chatGroupTopic.medias = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    chatGroupTopic.f27id = nb5Var.s();
                } else if (iU == 18) {
                    chatGroupTopic.owner = nb5Var.s();
                } else if (iU == 26) {
                    chatGroupTopic.value = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (chatGroupTopic.f27id == null) {
                            chatGroupTopic.f27id = "";
                        }
                        if (chatGroupTopic.owner == null) {
                            chatGroupTopic.owner = "";
                        }
                        if (chatGroupTopic.value == null) {
                            chatGroupTopic.value = "";
                        }
                        if (chatGroupTopic.medias != null) {
                            break;
                        }
                        chatGroupTopic.medias = new ArrayList();
                        return chatGroupTopic;
                    }
                    chatGroupTopic.medias = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return chatGroupTopic;
        }

        public void serialize(ChatGroupTopic chatGroupTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGroupTopic.f27id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = chatGroupTopic.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = chatGroupTopic.value;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            List<Media> list = chatGroupTopic.medias;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatGroupTopic> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupTopic>() { // from class: com.p1.mobile.putong.core.data.ChatGroupTopic.2
        public Class getDataClass() {
            return ChatGroupTopic.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGroupTopic m12044newInstance() {
            return new ChatGroupTopic();
        }

        public boolean parseField(ChatGroupTopic chatGroupTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "medias":
                    chatGroupTopic.medias = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "ownerId":
                    chatGroupTopic.owner = jsonParser.getValueAsString();
                    return true;
                case "id":
                    chatGroupTopic.f27id = jsonParser.getValueAsString();
                    return false;
                case "value":
                    chatGroupTopic.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGroupTopic chatGroupTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "medias":
                case "ownerId":
                    return true;
                case "id":
                    return false;
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(chatGroupTopic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatGroupTopic chatGroupTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGroupTopic.f27id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatGroupTopic.owner;
            if (str2 != null) {
                jsonGenerator.writeStringField("ownerId", str2);
            }
            String str3 = chatGroupTopic.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            if (chatGroupTopic.medias != null) {
                jsonGenerator.writeFieldName("medias");
                JsonAdapter.serializeArray(chatGroupTopic.medias, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGroupTopic new_() {
        ChatGroupTopic chatGroupTopic = new ChatGroupTopic();
        chatGroupTopic.nullCheck();
        return chatGroupTopic;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGroupTopic m12042clone() {
        ChatGroupTopic chatGroupTopic = new ChatGroupTopic();
        chatGroupTopic.f27id = this.f27id;
        chatGroupTopic.owner = this.owner;
        chatGroupTopic.value = this.value;
        List<Media> list = this.medias;
        if (list != null) {
            chatGroupTopic.medias = ValueObject.util_map(list, new w9j() { // from class: l.cu4
                public final Object call(Object obj) {
                    return ((Media) obj).clone();
                }
            });
        }
        return chatGroupTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGroupTopic)) {
            return false;
        }
        ChatGroupTopic chatGroupTopic = (ChatGroupTopic) obj;
        return ValueObject.util_equals(this.f27id, chatGroupTopic.f27id) && ValueObject.util_equals(this.owner, chatGroupTopic.owner) && ValueObject.util_equals(this.value, chatGroupTopic.value) && ValueObject.util_equals(this.medias, chatGroupTopic.medias);
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
        String str = this.f27id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.owner;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<Media> list = this.medias;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f27id == null) {
            this.f27id = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.medias == null) {
            this.medias = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
