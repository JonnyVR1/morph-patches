package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class MessageItemButton extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageitembutton";

    @NonNull
    @ProtobufIndex(index = 2)
    public String shows;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<MessageItemButton> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageItemButton>() { // from class: com.p1.mobile.putong.core.data.MessageItemButton.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageItemButton messageItemButton) {
            String str = messageItemButton.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageItemButton.shows;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            messageItemButton.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageItemButton parse(nb5 nb5Var) throws IOException {
            MessageItemButton messageItemButton = new MessageItemButton();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageItemButton.title == null) {
                        messageItemButton.title = "";
                    }
                    if (messageItemButton.shows != null) {
                        break;
                    }
                    messageItemButton.shows = "";
                    break;
                }
                if (iM158752u == 10) {
                    messageItemButton.title = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (messageItemButton.title == null) {
                            messageItemButton.title = "";
                        }
                        if (messageItemButton.shows != null) {
                            break;
                        }
                        messageItemButton.shows = "";
                        return messageItemButton;
                    }
                    messageItemButton.shows = nb5Var.m158750s();
                }
            }
            return messageItemButton;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageItemButton messageItemButton, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageItemButton.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageItemButton.shows;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<MessageItemButton> JSON_ADAPTER = new ObjectJsonAdapter<MessageItemButton>() { // from class: com.p1.mobile.putong.core.data.MessageItemButton.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageItemButton.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageItemButton newInstance() {
            return new MessageItemButton();
        }

        public boolean parseField(MessageItemButton messageItemButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("shows")) {
                messageItemButton.shows = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            messageItemButton.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageItemButton messageItemButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("shows") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(messageItemButton, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageItemButton messageItemButton, JsonGenerator jsonGenerator) throws IOException {
            String str = messageItemButton.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = messageItemButton.shows;
            if (str2 != null) {
                jsonGenerator.writeStringField("shows", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageItemButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageItemButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageItemButton new_() {
        MessageItemButton messageItemButton = new MessageItemButton();
        messageItemButton.nullCheck();
        return messageItemButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageItemButton mo223809clone() {
        MessageItemButton messageItemButton = new MessageItemButton();
        messageItemButton.title = this.title;
        messageItemButton.shows = this.shows;
        return messageItemButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageItemButton)) {
            return false;
        }
        MessageItemButton messageItemButton = (MessageItemButton) obj;
        return ValueObject.util_equals(this.title, messageItemButton.title) && ValueObject.util_equals(this.shows, messageItemButton.shows);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.shows;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.shows == null) {
            this.shows = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
