package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
    public int f194id;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGuidePopUp chatGuidePopUp) {
            int iH = CodedOutputByteBufferNano.h(1, chatGuidePopUp.f194id);
            String str = chatGuidePopUp.title;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = chatGuidePopUp.subTitle;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            List<Media> list = chatGuidePopUp.medias;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGuidePopUp.confirmButton;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = chatGuidePopUp.cancelButton;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(6, str4);
            }
            ((MessageNano) chatGuidePopUp).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGuidePopUp m17811parse(nb5 nb5Var) throws IOException {
            ChatGuidePopUp chatGuidePopUp = new ChatGuidePopUp();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    chatGuidePopUp.f194id = nb5Var.j();
                } else if (iU == 18) {
                    chatGuidePopUp.title = nb5Var.s();
                } else if (iU == 26) {
                    chatGuidePopUp.subTitle = nb5Var.s();
                } else if (iU == 34) {
                    chatGuidePopUp.medias = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    chatGuidePopUp.confirmButton = nb5Var.s();
                } else {
                    if (iU != 50) {
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
                    chatGuidePopUp.cancelButton = nb5Var.s();
                }
            }
            return chatGuidePopUp;
        }

        public void serialize(ChatGuidePopUp chatGuidePopUp, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, chatGuidePopUp.f194id);
            String str = chatGuidePopUp.title;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = chatGuidePopUp.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            List<Media> list = chatGuidePopUp.medias;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGuidePopUp.confirmButton;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = chatGuidePopUp.cancelButton;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
        }
    };
    public static JsonAdapter<ChatGuidePopUp> JSON_ADAPTER = new ObjectJsonAdapter<ChatGuidePopUp>() { // from class: com.p1.mobile.putong.data.ChatGuidePopUp.2
        public Class getDataClass() {
            return ChatGuidePopUp.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ChatGuidePopUp mo17830newInstance() {
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
                    chatGuidePopUp.f194id = jsonParser.getValueAsInt();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGuidePopUp chatGuidePopUp, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", chatGuidePopUp.f194id);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGuidePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGuidePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGuidePopUp new_() {
        ChatGuidePopUp chatGuidePopUp = new ChatGuidePopUp();
        chatGuidePopUp.nullCheck();
        return chatGuidePopUp;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGuidePopUp m17810clone() {
        ChatGuidePopUp chatGuidePopUp = new ChatGuidePopUp();
        chatGuidePopUp.f194id = this.f194id;
        chatGuidePopUp.title = this.title;
        chatGuidePopUp.subTitle = this.subTitle;
        List<Media> list = this.medias;
        if (list != null) {
            chatGuidePopUp.medias = ValueObject.util_map(list, new w9j() { // from class: l.fu4
                public final Object call(Object obj) {
                    return ((Media) obj).mo17714clone();
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
        return this.f194id == chatGuidePopUp.f194id && ValueObject.util_equals(this.title, chatGuidePopUp.title) && ValueObject.util_equals(this.subTitle, chatGuidePopUp.subTitle) && ValueObject.util_equals(this.medias, chatGuidePopUp.medias) && ValueObject.util_equals(this.confirmButton, chatGuidePopUp.confirmButton) && ValueObject.util_equals(this.cancelButton, chatGuidePopUp.cancelButton);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f194id) * 41;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
