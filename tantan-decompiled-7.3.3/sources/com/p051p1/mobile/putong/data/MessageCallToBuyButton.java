package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class MessageCallToBuyButton extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagecalltobuybutton";

    @NonNull
    @ProtobufIndex(index = 2)
    public String href;

    @NonNull
    @ProtobufIndex(index = 3)
    public String redirect;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<MessageCallToBuyButton> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageCallToBuyButton>() { // from class: com.p1.mobile.putong.data.MessageCallToBuyButton.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageCallToBuyButton messageCallToBuyButton) {
            String str = messageCallToBuyButton.text;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageCallToBuyButton.href;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = messageCallToBuyButton.redirect;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            messageCallToBuyButton.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageCallToBuyButton parse(nc5 nc5Var) throws IOException {
            MessageCallToBuyButton messageCallToBuyButton = new MessageCallToBuyButton();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageCallToBuyButton.text == null) {
                        messageCallToBuyButton.text = "";
                    }
                    if (messageCallToBuyButton.href == null) {
                        messageCallToBuyButton.href = "";
                    }
                    if (messageCallToBuyButton.redirect != null) {
                        break;
                    }
                    messageCallToBuyButton.redirect = "";
                    break;
                }
                if (iM162497u == 10) {
                    messageCallToBuyButton.text = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    messageCallToBuyButton.href = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (messageCallToBuyButton.text == null) {
                            messageCallToBuyButton.text = "";
                        }
                        if (messageCallToBuyButton.href == null) {
                            messageCallToBuyButton.href = "";
                        }
                        if (messageCallToBuyButton.redirect != null) {
                            break;
                        }
                        messageCallToBuyButton.redirect = "";
                        return messageCallToBuyButton;
                    }
                    messageCallToBuyButton.redirect = nc5Var.m162495s();
                }
            }
            return messageCallToBuyButton;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageCallToBuyButton messageCallToBuyButton, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageCallToBuyButton.text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageCallToBuyButton.href;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = messageCallToBuyButton.redirect;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<MessageCallToBuyButton> JSON_ADAPTER = new ObjectJsonAdapter<MessageCallToBuyButton>() { // from class: com.p1.mobile.putong.data.MessageCallToBuyButton.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageCallToBuyButton.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageCallToBuyButton newInstance() {
            return new MessageCallToBuyButton();
        }

        public boolean parseField(MessageCallToBuyButton messageCallToBuyButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "redirect":
                    messageCallToBuyButton.redirect = jsonParser.getValueAsString();
                    return true;
                case "href":
                    messageCallToBuyButton.href = jsonParser.getValueAsString();
                    return true;
                case "text":
                    messageCallToBuyButton.text = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageCallToBuyButton messageCallToBuyButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "redirect":
                case "href":
                case "text":
                    return true;
                default:
                    return super.parseFieldCheck(messageCallToBuyButton, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageCallToBuyButton messageCallToBuyButton, JsonGenerator jsonGenerator) throws IOException {
            String str = messageCallToBuyButton.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = messageCallToBuyButton.href;
            if (str2 != null) {
                jsonGenerator.writeStringField("href", str2);
            }
            String str3 = messageCallToBuyButton.redirect;
            if (str3 != null) {
                jsonGenerator.writeStringField("redirect", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageCallToBuyButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageCallToBuyButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageCallToBuyButton new_() {
        MessageCallToBuyButton messageCallToBuyButton = new MessageCallToBuyButton();
        messageCallToBuyButton.nullCheck();
        return messageCallToBuyButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageCallToBuyButton mo225055clone() {
        MessageCallToBuyButton messageCallToBuyButton = new MessageCallToBuyButton();
        messageCallToBuyButton.text = this.text;
        messageCallToBuyButton.href = this.href;
        messageCallToBuyButton.redirect = this.redirect;
        return messageCallToBuyButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageCallToBuyButton)) {
            return false;
        }
        MessageCallToBuyButton messageCallToBuyButton = (MessageCallToBuyButton) obj;
        return ValueObject.util_equals(this.text, messageCallToBuyButton.text) && ValueObject.util_equals(this.href, messageCallToBuyButton.href) && ValueObject.util_equals(this.redirect, messageCallToBuyButton.redirect);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.href;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.redirect;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.href == null) {
            this.href = "";
        }
        if (this.redirect == null) {
            this.redirect = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
