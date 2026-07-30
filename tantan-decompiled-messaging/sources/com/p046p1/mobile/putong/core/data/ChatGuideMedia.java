package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ChatGuideMedia;
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
public class ChatGuideMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatguidemedia";

    @NonNull
    @ProtobufIndex(index = 6)
    public String confirmButton;

    @NonNull
    @ProtobufIndex(index = 2)
    public String guideType;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f20366id;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<Media> medias;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> subTitles;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;
    public static ProtobufAdapter<ChatGuideMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGuideMedia>() { // from class: com.p1.mobile.putong.core.data.ChatGuideMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGuideMedia chatGuideMedia) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, chatGuideMedia.f20366id);
            String str = chatGuideMedia.guideType;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = chatGuideMedia.title;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            List<String> list = chatGuideMedia.subTitles;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list2 = chatGuideMedia.medias;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, list2, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGuideMedia.confirmButton;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            chatGuideMedia.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGuideMedia parse(nb5 nb5Var) throws IOException {
            ChatGuideMedia chatGuideMedia = new ChatGuideMedia();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatGuideMedia.guideType == null) {
                        chatGuideMedia.guideType = "";
                    }
                    if (chatGuideMedia.title == null) {
                        chatGuideMedia.title = "";
                    }
                    if (chatGuideMedia.subTitles == null) {
                        chatGuideMedia.subTitles = new ArrayList();
                    }
                    if (chatGuideMedia.medias == null) {
                        chatGuideMedia.medias = new ArrayList();
                    }
                    if (chatGuideMedia.confirmButton != null) {
                        break;
                    }
                    chatGuideMedia.confirmButton = "";
                    break;
                }
                if (iM158752u == 8) {
                    chatGuideMedia.f20366id = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    chatGuideMedia.guideType = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    chatGuideMedia.title = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    chatGuideMedia.subTitles = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    chatGuideMedia.medias = (List) nb5Var.m158743l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 50) {
                        if (chatGuideMedia.guideType == null) {
                            chatGuideMedia.guideType = "";
                        }
                        if (chatGuideMedia.title == null) {
                            chatGuideMedia.title = "";
                        }
                        if (chatGuideMedia.subTitles == null) {
                            chatGuideMedia.subTitles = new ArrayList();
                        }
                        if (chatGuideMedia.medias == null) {
                            chatGuideMedia.medias = new ArrayList();
                        }
                        if (chatGuideMedia.confirmButton != null) {
                            break;
                        }
                        chatGuideMedia.confirmButton = "";
                        return chatGuideMedia;
                    }
                    chatGuideMedia.confirmButton = nb5Var.m158750s();
                }
            }
            return chatGuideMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGuideMedia chatGuideMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, chatGuideMedia.f20366id);
            String str = chatGuideMedia.guideType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = chatGuideMedia.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            List<String> list = chatGuideMedia.subTitles;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list2 = chatGuideMedia.medias;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(5, list2, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGuideMedia.confirmButton;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
        }
    };
    public static JsonAdapter<ChatGuideMedia> JSON_ADAPTER = new ObjectJsonAdapter<ChatGuideMedia>() { // from class: com.p1.mobile.putong.core.data.ChatGuideMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGuideMedia.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGuideMedia newInstance() {
            return new ChatGuideMedia();
        }

        public boolean parseField(ChatGuideMedia chatGuideMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guideType":
                    chatGuideMedia.guideType = jsonParser.getValueAsString();
                    return true;
                case "medias":
                    chatGuideMedia.medias = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "subTitles":
                    chatGuideMedia.subTitles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "confirmButton":
                    chatGuideMedia.confirmButton = jsonParser.getValueAsString();
                    return true;
                case "id":
                    chatGuideMedia.f20366id = jsonParser.getValueAsInt();
                    return false;
                case "title":
                    chatGuideMedia.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGuideMedia chatGuideMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "guideType":
                case "medias":
                case "subTitles":
                case "confirmButton":
                    return true;
                case "id":
                    return false;
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(chatGuideMedia, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGuideMedia chatGuideMedia, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", chatGuideMedia.f20366id);
            String str = chatGuideMedia.guideType;
            if (str != null) {
                jsonGenerator.writeStringField("guideType", str);
            }
            String str2 = chatGuideMedia.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            if (chatGuideMedia.subTitles != null) {
                jsonGenerator.writeFieldName("subTitles");
                JsonAdapter.serializeArray(chatGuideMedia.subTitles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (chatGuideMedia.medias != null) {
                jsonGenerator.writeFieldName("medias");
                JsonAdapter.serializeArray(chatGuideMedia.medias, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str3 = chatGuideMedia.confirmButton;
            if (str3 != null) {
                jsonGenerator.writeStringField("confirmButton", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGuideMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGuideMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35265b(String str) {
        return str;
    }

    public static ChatGuideMedia new_() {
        ChatGuideMedia chatGuideMedia = new ChatGuideMedia();
        chatGuideMedia.nullCheck();
        return chatGuideMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGuideMedia mo223809clone() {
        ChatGuideMedia chatGuideMedia = new ChatGuideMedia();
        chatGuideMedia.f20366id = this.f20366id;
        chatGuideMedia.guideType = this.guideType;
        chatGuideMedia.title = this.title;
        List<String> list = this.subTitles;
        if (list != null) {
            chatGuideMedia.subTitles = ValueObject.util_map(list, new w9j() { // from class: l.du4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ChatGuideMedia.m35265b((String) obj);
                }
            });
        }
        List<Media> list2 = this.medias;
        if (list2 != null) {
            chatGuideMedia.medias = ValueObject.util_map(list2, new w9j() { // from class: l.eu4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).mo223809clone();
                }
            });
        }
        chatGuideMedia.confirmButton = this.confirmButton;
        return chatGuideMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGuideMedia)) {
            return false;
        }
        ChatGuideMedia chatGuideMedia = (ChatGuideMedia) obj;
        return this.f20366id == chatGuideMedia.f20366id && ValueObject.util_equals(this.guideType, chatGuideMedia.guideType) && ValueObject.util_equals(this.title, chatGuideMedia.title) && ValueObject.util_equals(this.subTitles, chatGuideMedia.subTitles) && ValueObject.util_equals(this.medias, chatGuideMedia.medias) && ValueObject.util_equals(this.confirmButton, chatGuideMedia.confirmButton);
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
        int i2 = ((i * 41) + this.f20366id) * 41;
        String str = this.guideType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.subTitles;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Media> list2 = this.medias;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str3 = this.confirmButton;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guideType == null) {
            this.guideType = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitles == null) {
            this.subTitles = new ArrayList();
        }
        if (this.medias == null) {
            this.medias = new ArrayList();
        }
        if (this.confirmButton == null) {
            this.confirmButton = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
