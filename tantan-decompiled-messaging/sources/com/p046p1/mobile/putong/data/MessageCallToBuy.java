package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MessageCallToBuyMedia;
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

/* JADX INFO: loaded from: classes12.dex */
public class MessageCallToBuy extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagecalltobuy";

    @NonNull
    @ProtobufIndex(index = 3)
    public MessageCallToBuyButton button;

    @NonNull
    @ProtobufIndex(index = 1)
    public String cardVersion;

    @NonNull
    @ProtobufIndex(index = 5)
    public String imageWaterMark;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<MessageCallToBuyMedia> medias;

    @NonNull
    @ProtobufIndex(index = 2)
    public String previewText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;
    public static ProtobufAdapter<MessageCallToBuy> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageCallToBuy>() { // from class: com.p1.mobile.putong.data.MessageCallToBuy.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageCallToBuy messageCallToBuy) {
            String str = messageCallToBuy.cardVersion;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageCallToBuy.previewText;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            MessageCallToBuyButton messageCallToBuyButton = messageCallToBuy.button;
            if (messageCallToBuyButton != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, messageCallToBuyButton, MessageCallToBuyButton.PROTOBUF_ADAPTER);
            }
            String str3 = messageCallToBuy.text;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = messageCallToBuy.imageWaterMark;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            List<MessageCallToBuyMedia> list = messageCallToBuy.medias;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, list, MessageCallToBuyMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            messageCallToBuy.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageCallToBuy parse(nb5 nb5Var) throws IOException {
            MessageCallToBuy messageCallToBuy = new MessageCallToBuy();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageCallToBuy.cardVersion == null) {
                        messageCallToBuy.cardVersion = "";
                    }
                    if (messageCallToBuy.previewText == null) {
                        messageCallToBuy.previewText = "";
                    }
                    if (messageCallToBuy.button == null) {
                        messageCallToBuy.button = MessageCallToBuyButton.new_();
                    }
                    if (messageCallToBuy.text == null) {
                        messageCallToBuy.text = "";
                    }
                    if (messageCallToBuy.imageWaterMark == null) {
                        messageCallToBuy.imageWaterMark = "";
                    }
                    if (messageCallToBuy.medias != null) {
                        break;
                    }
                    messageCallToBuy.medias = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    messageCallToBuy.cardVersion = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    messageCallToBuy.previewText = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    messageCallToBuy.button = (MessageCallToBuyButton) nb5Var.m158743l(MessageCallToBuyButton.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    messageCallToBuy.text = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    messageCallToBuy.imageWaterMark = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
                        if (messageCallToBuy.cardVersion == null) {
                            messageCallToBuy.cardVersion = "";
                        }
                        if (messageCallToBuy.previewText == null) {
                            messageCallToBuy.previewText = "";
                        }
                        if (messageCallToBuy.button == null) {
                            messageCallToBuy.button = MessageCallToBuyButton.new_();
                        }
                        if (messageCallToBuy.text == null) {
                            messageCallToBuy.text = "";
                        }
                        if (messageCallToBuy.imageWaterMark == null) {
                            messageCallToBuy.imageWaterMark = "";
                        }
                        if (messageCallToBuy.medias != null) {
                            break;
                        }
                        messageCallToBuy.medias = new ArrayList();
                        return messageCallToBuy;
                    }
                    messageCallToBuy.medias = (List) nb5Var.m158743l(MessageCallToBuyMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return messageCallToBuy;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageCallToBuy messageCallToBuy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageCallToBuy.cardVersion;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageCallToBuy.previewText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            MessageCallToBuyButton messageCallToBuyButton = messageCallToBuy.button;
            if (messageCallToBuyButton != null) {
                codedOutputByteBufferNano.m17254K(3, messageCallToBuyButton, MessageCallToBuyButton.PROTOBUF_ADAPTER);
            }
            String str3 = messageCallToBuy.text;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = messageCallToBuy.imageWaterMark;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            List<MessageCallToBuyMedia> list = messageCallToBuy.medias;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, MessageCallToBuyMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MessageCallToBuy> JSON_ADAPTER = new ObjectJsonAdapter<MessageCallToBuy>() { // from class: com.p1.mobile.putong.data.MessageCallToBuy.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageCallToBuy.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageCallToBuy newInstance() {
            return new MessageCallToBuy();
        }

        public boolean parseField(MessageCallToBuy messageCallToBuy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "button":
                    messageCallToBuy.button = MessageCallToBuyButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "previewText":
                    messageCallToBuy.previewText = jsonParser.getValueAsString();
                    return true;
                case "medias":
                    messageCallToBuy.medias = JsonAdapter.parseArray(jsonParser, MessageCallToBuyMedia.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "imageWaterMark":
                    messageCallToBuy.imageWaterMark = jsonParser.getValueAsString();
                    return true;
                case "text":
                    messageCallToBuy.text = jsonParser.getValueAsString();
                    return true;
                case "cardVersion":
                    messageCallToBuy.cardVersion = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageCallToBuy messageCallToBuy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "button":
                case "previewText":
                case "medias":
                case "imageWaterMark":
                case "text":
                case "cardVersion":
                    return true;
                default:
                    return super.parseFieldCheck(messageCallToBuy, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageCallToBuy messageCallToBuy, JsonGenerator jsonGenerator) throws IOException {
            String str = messageCallToBuy.cardVersion;
            if (str != null) {
                jsonGenerator.writeStringField("cardVersion", str);
            }
            String str2 = messageCallToBuy.previewText;
            if (str2 != null) {
                jsonGenerator.writeStringField("previewText", str2);
            }
            if (messageCallToBuy.button != null) {
                jsonGenerator.writeFieldName("button");
                MessageCallToBuyButton.JSON_ADAPTER.serialize(messageCallToBuy.button, jsonGenerator, true);
            }
            String str3 = messageCallToBuy.text;
            if (str3 != null) {
                jsonGenerator.writeStringField("text", str3);
            }
            String str4 = messageCallToBuy.imageWaterMark;
            if (str4 != null) {
                jsonGenerator.writeStringField("imageWaterMark", str4);
            }
            if (messageCallToBuy.medias != null) {
                jsonGenerator.writeFieldName("medias");
                JsonAdapter.serializeArray(messageCallToBuy.medias, jsonGenerator, MessageCallToBuyMedia.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageCallToBuy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageCallToBuy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageCallToBuy new_() {
        MessageCallToBuy messageCallToBuy = new MessageCallToBuy();
        messageCallToBuy.nullCheck();
        return messageCallToBuy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageCallToBuy mo223809clone() {
        MessageCallToBuy messageCallToBuy = new MessageCallToBuy();
        messageCallToBuy.cardVersion = this.cardVersion;
        messageCallToBuy.previewText = this.previewText;
        MessageCallToBuyButton messageCallToBuyButton = this.button;
        if (messageCallToBuyButton != null) {
            messageCallToBuy.button = messageCallToBuyButton.mo223809clone();
        }
        messageCallToBuy.text = this.text;
        messageCallToBuy.imageWaterMark = this.imageWaterMark;
        List<MessageCallToBuyMedia> list = this.medias;
        if (list != null) {
            messageCallToBuy.medias = ValueObject.util_map(list, new w9j() { // from class: l.suy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MessageCallToBuyMedia) obj).mo223809clone();
                }
            });
        }
        return messageCallToBuy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageCallToBuy)) {
            return false;
        }
        MessageCallToBuy messageCallToBuy = (MessageCallToBuy) obj;
        return ValueObject.util_equals(this.cardVersion, messageCallToBuy.cardVersion) && ValueObject.util_equals(this.previewText, messageCallToBuy.previewText) && ValueObject.util_equals(this.button, messageCallToBuy.button) && ValueObject.util_equals(this.text, messageCallToBuy.text) && ValueObject.util_equals(this.imageWaterMark, messageCallToBuy.imageWaterMark) && ValueObject.util_equals(this.medias, messageCallToBuy.medias);
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
        String str = this.cardVersion;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.previewText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        MessageCallToBuyButton messageCallToBuyButton = this.button;
        int iHashCode3 = (iHashCode2 + (messageCallToBuyButton != null ? messageCallToBuyButton.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.imageWaterMark;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<MessageCallToBuyMedia> list = this.medias;
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cardVersion == null) {
            this.cardVersion = "";
        }
        if (this.previewText == null) {
            this.previewText = "";
        }
        if (this.button == null) {
            this.button = MessageCallToBuyButton.new_();
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.imageWaterMark == null) {
            this.imageWaterMark = "";
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
