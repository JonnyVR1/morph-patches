package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Media;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class ChatGroupTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgrouptopic";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20365id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Media> medias;

    @NonNull
    @ProtobufIndex(index = 2)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;
    public static ProtobufAdapter<ChatGroupTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroupTopic>() { // from class: com.p1.mobile.putong.core.data.ChatGroupTopic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGroupTopic chatGroupTopic) {
            String str = chatGroupTopic.f20365id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = chatGroupTopic.owner;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = chatGroupTopic.value;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            List<Media> list = chatGroupTopic.medias;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            chatGroupTopic.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGroupTopic parse(nb5 nb5Var) throws IOException {
            ChatGroupTopic chatGroupTopic = new ChatGroupTopic();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatGroupTopic.f20365id == null) {
                        chatGroupTopic.f20365id = "";
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
                if (iM158752u == 10) {
                    chatGroupTopic.f20365id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    chatGroupTopic.owner = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    chatGroupTopic.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (chatGroupTopic.f20365id == null) {
                            chatGroupTopic.f20365id = "";
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
                    chatGroupTopic.medias = (List) nb5Var.m158743l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return chatGroupTopic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGroupTopic chatGroupTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGroupTopic.f20365id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = chatGroupTopic.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = chatGroupTopic.value;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            List<Media> list = chatGroupTopic.medias;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatGroupTopic> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupTopic>() { // from class: com.p1.mobile.putong.core.data.ChatGroupTopic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGroupTopic.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGroupTopic newInstance() {
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
                    chatGroupTopic.f20365id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGroupTopic chatGroupTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGroupTopic.f20365id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGroupTopic new_() {
        ChatGroupTopic chatGroupTopic = new ChatGroupTopic();
        chatGroupTopic.nullCheck();
        return chatGroupTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGroupTopic mo223809clone() {
        ChatGroupTopic chatGroupTopic = new ChatGroupTopic();
        chatGroupTopic.f20365id = this.f20365id;
        chatGroupTopic.owner = this.owner;
        chatGroupTopic.value = this.value;
        List<Media> list = this.medias;
        if (list != null) {
            chatGroupTopic.medias = ValueObject.util_map(list, new w9j() { // from class: l.cu4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).mo223809clone();
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
        return ValueObject.util_equals(this.f20365id, chatGroupTopic.f20365id) && ValueObject.util_equals(this.owner, chatGroupTopic.owner) && ValueObject.util_equals(this.value, chatGroupTopic.value) && ValueObject.util_equals(this.medias, chatGroupTopic.medias);
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
        String str = this.f20365id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.owner;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<Media> list = this.medias;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20365id == null) {
            this.f20365id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
