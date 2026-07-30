package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class MessageView extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageview";

    @NonNull
    @ProtobufIndex(index = 4)
    public String button;

    @NonNull
    @ProtobufIndex(index = 6)
    public String cancelText;

    @ProtobufIndex(index = 8)
    public boolean ignoreHeightLimit;

    @NonNull
    @ProtobufIndex(index = 1)
    public String image;

    @NonNull
    @ProtobufIndex(index = 7)
    public String image2;

    @NonNull
    @ProtobufIndex(index = 3)
    public String imageSize;

    @ProtobufIndex(index = 5)
    public boolean isTextOnly;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @ProtobufIndex(index = 9)
    public int uiStyle;
    public static ProtobufAdapter<MessageView> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageView>() { // from class: com.p1.mobile.putong.core.data.MessageView.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageView messageView) {
            String str = messageView.image;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageView.text;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = messageView.imageSize;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = messageView.button;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, messageView.isTextOnly);
            String str5 = messageView.cancelText;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            String str6 = messageView.image2;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(8, messageView.ignoreHeightLimit) + CodedOutputByteBufferNano.m17281h(9, messageView.uiStyle);
            messageView.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageView parse(nc5 nc5Var) throws IOException {
            MessageView messageView = new MessageView();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageView.image == null) {
                        messageView.image = "";
                    }
                    if (messageView.text == null) {
                        messageView.text = "";
                    }
                    if (messageView.imageSize == null) {
                        messageView.imageSize = "";
                    }
                    if (messageView.button == null) {
                        messageView.button = "";
                    }
                    if (messageView.cancelText == null) {
                        messageView.cancelText = "";
                    }
                    if (messageView.image2 != null) {
                        break;
                    }
                    messageView.image2 = "";
                    break;
                }
                if (iM162497u == 10) {
                    messageView.image = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    messageView.text = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    messageView.imageSize = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    messageView.button = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    messageView.isTextOnly = nc5Var.m162483g();
                } else if (iM162497u == 50) {
                    messageView.cancelText = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    messageView.image2 = nc5Var.m162495s();
                } else if (iM162497u == 64) {
                    messageView.ignoreHeightLimit = nc5Var.m162483g();
                } else {
                    if (iM162497u != 72) {
                        if (messageView.image == null) {
                            messageView.image = "";
                        }
                        if (messageView.text == null) {
                            messageView.text = "";
                        }
                        if (messageView.imageSize == null) {
                            messageView.imageSize = "";
                        }
                        if (messageView.button == null) {
                            messageView.button = "";
                        }
                        if (messageView.cancelText == null) {
                            messageView.cancelText = "";
                        }
                        if (messageView.image2 != null) {
                            break;
                        }
                        messageView.image2 = "";
                        return messageView;
                    }
                    messageView.uiStyle = nc5Var.m162486j();
                }
            }
            return messageView;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageView messageView, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageView.image;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageView.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = messageView.imageSize;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = messageView.button;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17299A(5, messageView.isTextOnly);
            String str5 = messageView.cancelText;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            String str6 = messageView.image2;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
            codedOutputByteBufferNano.m17299A(8, messageView.ignoreHeightLimit);
            codedOutputByteBufferNano.m17305G(9, messageView.uiStyle);
        }
    };
    public static JsonAdapter<MessageView> JSON_ADAPTER = new ObjectJsonAdapter<MessageView>() { // from class: com.p1.mobile.putong.core.data.MessageView.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageView.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageView newInstance() {
            return new MessageView();
        }

        public boolean parseField(MessageView messageView, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isTextOnly":
                    messageView.isTextOnly = jsonParser.getValueAsBoolean();
                    return true;
                case "button":
                    messageView.button = jsonParser.getValueAsString();
                    return true;
                case "image2":
                    messageView.image2 = jsonParser.getValueAsString();
                    return true;
                case "ignoreHeightLimit":
                    messageView.ignoreHeightLimit = jsonParser.getValueAsBoolean();
                    return true;
                case "imageSize":
                    messageView.imageSize = jsonParser.getValueAsString();
                    return true;
                case "uiStyle":
                    messageView.uiStyle = jsonParser.getValueAsInt();
                    return true;
                case "text":
                    messageView.text = jsonParser.getValueAsString();
                    return true;
                case "image":
                    messageView.image = jsonParser.getValueAsString();
                    return true;
                case "cancelText":
                    messageView.cancelText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageView messageView, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isTextOnly":
                case "button":
                case "image2":
                case "ignoreHeightLimit":
                case "imageSize":
                case "uiStyle":
                case "text":
                case "image":
                case "cancelText":
                    return true;
                default:
                    return super.parseFieldCheck(messageView, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageView messageView, JsonGenerator jsonGenerator) throws IOException {
            String str = messageView.image;
            if (str != null) {
                jsonGenerator.writeStringField("image", str);
            }
            String str2 = messageView.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = messageView.imageSize;
            if (str3 != null) {
                jsonGenerator.writeStringField("imageSize", str3);
            }
            String str4 = messageView.button;
            if (str4 != null) {
                jsonGenerator.writeStringField("button", str4);
            }
            jsonGenerator.writeBooleanField("isTextOnly", messageView.isTextOnly);
            String str5 = messageView.cancelText;
            if (str5 != null) {
                jsonGenerator.writeStringField("cancelText", str5);
            }
            String str6 = messageView.image2;
            if (str6 != null) {
                jsonGenerator.writeStringField("image2", str6);
            }
            jsonGenerator.writeBooleanField("ignoreHeightLimit", messageView.ignoreHeightLimit);
            jsonGenerator.writeNumberField("uiStyle", messageView.uiStyle);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageView) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageView) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageView new_() {
        MessageView messageView = new MessageView();
        messageView.nullCheck();
        return messageView;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageView mo225055clone() {
        MessageView messageView = new MessageView();
        messageView.image = this.image;
        messageView.text = this.text;
        messageView.imageSize = this.imageSize;
        messageView.button = this.button;
        messageView.isTextOnly = this.isTextOnly;
        messageView.cancelText = this.cancelText;
        messageView.image2 = this.image2;
        messageView.ignoreHeightLimit = this.ignoreHeightLimit;
        messageView.uiStyle = this.uiStyle;
        return messageView;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageView)) {
            return false;
        }
        MessageView messageView = (MessageView) obj;
        return ValueObject.util_equals(this.image, messageView.image) && ValueObject.util_equals(this.text, messageView.text) && ValueObject.util_equals(this.imageSize, messageView.imageSize) && ValueObject.util_equals(this.button, messageView.button) && this.isTextOnly == messageView.isTextOnly && ValueObject.util_equals(this.cancelText, messageView.cancelText) && ValueObject.util_equals(this.image2, messageView.image2) && this.ignoreHeightLimit == messageView.ignoreHeightLimit && this.uiStyle == messageView.uiStyle;
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
        String str = this.image;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.imageSize;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.button;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.isTextOnly ? 1231 : 1237)) * 41;
        String str5 = this.cancelText;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.image2;
        int iHashCode6 = ((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.ignoreHeightLimit ? 1231 : 1237)) * 41) + this.uiStyle;
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.image == null) {
            this.image = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.imageSize == null) {
            this.imageSize = "";
        }
        if (this.button == null) {
            this.button = "";
        }
        if (this.cancelText == null) {
            this.cancelText = "";
        }
        if (this.image2 == null) {
            this.image2 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
