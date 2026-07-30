package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Media;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class ChatGuidePopUp extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatguidepopup";

    @NonNull
    @ProtobufIndex(index = 6)
    public String cancelButton;

    @NonNull
    @ProtobufIndex(index = 5)
    public String confirmButton;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f39581id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Media> medias;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<ChatGuidePopUp> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGuidePopUp>() { // from class: com.p1.mobile.putong.data.ChatGuidePopUp.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGuidePopUp chatGuidePopUp) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, chatGuidePopUp.f39581id);
            String str = chatGuidePopUp.title;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = chatGuidePopUp.subTitle;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            List<Media> list = chatGuidePopUp.medias;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGuidePopUp.confirmButton;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = chatGuidePopUp.cancelButton;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            chatGuidePopUp.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGuidePopUp parse(nc5 nc5Var) throws IOException {
            ChatGuidePopUp chatGuidePopUp = new ChatGuidePopUp();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatGuidePopUp.title == null) {
                        chatGuidePopUp.title = "";
                    }
                    if (chatGuidePopUp.subTitle == null) {
                        chatGuidePopUp.subTitle = "";
                    }
                    if (chatGuidePopUp.medias == null) {
                        chatGuidePopUp.medias = new ArrayList();
                    }
                    if (chatGuidePopUp.confirmButton == null) {
                        chatGuidePopUp.confirmButton = "";
                    }
                    if (chatGuidePopUp.cancelButton != null) {
                        break;
                    }
                    chatGuidePopUp.cancelButton = "";
                    break;
                }
                if (iM162497u == 8) {
                    chatGuidePopUp.f39581id = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    chatGuidePopUp.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    chatGuidePopUp.subTitle = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    chatGuidePopUp.medias = (List) nc5Var.m162488l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    chatGuidePopUp.confirmButton = nc5Var.m162495s();
                } else {
                    if (iM162497u != 50) {
                        if (chatGuidePopUp.title == null) {
                            chatGuidePopUp.title = "";
                        }
                        if (chatGuidePopUp.subTitle == null) {
                            chatGuidePopUp.subTitle = "";
                        }
                        if (chatGuidePopUp.medias == null) {
                            chatGuidePopUp.medias = new ArrayList();
                        }
                        if (chatGuidePopUp.confirmButton == null) {
                            chatGuidePopUp.confirmButton = "";
                        }
                        if (chatGuidePopUp.cancelButton != null) {
                            break;
                        }
                        chatGuidePopUp.cancelButton = "";
                        return chatGuidePopUp;
                    }
                    chatGuidePopUp.cancelButton = nc5Var.m162495s();
                }
            }
            return chatGuidePopUp;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGuidePopUp chatGuidePopUp, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, chatGuidePopUp.f39581id);
            String str = chatGuidePopUp.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = chatGuidePopUp.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            List<Media> list = chatGuidePopUp.medias;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGuidePopUp.confirmButton;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = chatGuidePopUp.cancelButton;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
        }
    };
    public static JsonAdapter<ChatGuidePopUp> JSON_ADAPTER = new ObjectJsonAdapter<ChatGuidePopUp>() { // from class: com.p1.mobile.putong.data.ChatGuidePopUp.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGuidePopUp.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGuidePopUp newInstance() {
            return new ChatGuidePopUp();
        }

        public boolean parseField(ChatGuidePopUp chatGuidePopUp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    chatGuidePopUp.subTitle = jsonParser.getValueAsString();
                    return true;
                case "medias":
                    chatGuidePopUp.medias = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "confirmButton":
                    chatGuidePopUp.confirmButton = jsonParser.getValueAsString();
                    return true;
                case "id":
                    chatGuidePopUp.f39581id = jsonParser.getValueAsInt();
                    return false;
                case "title":
                    chatGuidePopUp.title = jsonParser.getValueAsString();
                    return true;
                case "cancelButton":
                    chatGuidePopUp.cancelButton = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGuidePopUp chatGuidePopUp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "medias":
                case "confirmButton":
                    return true;
                case "id":
                    return false;
                case "title":
                case "cancelButton":
                    return true;
                default:
                    return super.parseFieldCheck(chatGuidePopUp, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGuidePopUp chatGuidePopUp, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", chatGuidePopUp.f39581id);
            String str = chatGuidePopUp.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = chatGuidePopUp.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            if (chatGuidePopUp.medias != null) {
                jsonGenerator.writeFieldName("medias");
                JsonAdapter.serializeArray(chatGuidePopUp.medias, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str3 = chatGuidePopUp.confirmButton;
            if (str3 != null) {
                jsonGenerator.writeStringField("confirmButton", str3);
            }
            String str4 = chatGuidePopUp.cancelButton;
            if (str4 != null) {
                jsonGenerator.writeStringField("cancelButton", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGuidePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGuidePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGuidePopUp new_() {
        ChatGuidePopUp chatGuidePopUp = new ChatGuidePopUp();
        chatGuidePopUp.nullCheck();
        return chatGuidePopUp;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGuidePopUp mo225055clone() {
        ChatGuidePopUp chatGuidePopUp = new ChatGuidePopUp();
        chatGuidePopUp.f39581id = this.f39581id;
        chatGuidePopUp.title = this.title;
        chatGuidePopUp.subTitle = this.subTitle;
        List<Media> list = this.medias;
        if (list != null) {
            chatGuidePopUp.medias = ValueObject.util_map(list, new qcj() { // from class: l.ev4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).mo225055clone();
                }
            });
        }
        chatGuidePopUp.confirmButton = this.confirmButton;
        chatGuidePopUp.cancelButton = this.cancelButton;
        return chatGuidePopUp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGuidePopUp)) {
            return false;
        }
        ChatGuidePopUp chatGuidePopUp = (ChatGuidePopUp) obj;
        return this.f39581id == chatGuidePopUp.f39581id && ValueObject.util_equals(this.title, chatGuidePopUp.title) && ValueObject.util_equals(this.subTitle, chatGuidePopUp.subTitle) && ValueObject.util_equals(this.medias, chatGuidePopUp.medias) && ValueObject.util_equals(this.confirmButton, chatGuidePopUp.confirmButton) && ValueObject.util_equals(this.cancelButton, chatGuidePopUp.cancelButton);
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
        int i2 = ((i * 41) + this.f39581id) * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Media> list = this.medias;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.confirmButton;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.cancelButton;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.medias == null) {
            this.medias = new ArrayList();
        }
        if (this.confirmButton == null) {
            this.confirmButton = "";
        }
        if (this.cancelButton == null) {
            this.cancelButton = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
