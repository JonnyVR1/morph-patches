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
public class MessageContact extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagecontact";

    @ProtobufIndex(index = 1)
    public boolean hide;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<MessageContact> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageContact>() { // from class: com.p1.mobile.putong.core.data.MessageContact.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageContact messageContact) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, messageContact.hide);
            String str = messageContact.type;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            messageContact.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageContact parse(nb5 nb5Var) throws IOException {
            MessageContact messageContact = new MessageContact();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageContact.type != null) {
                        break;
                    }
                    messageContact.type = "";
                    break;
                }
                if (iM158752u == 8) {
                    messageContact.hide = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (messageContact.type != null) {
                            break;
                        }
                        messageContact.type = "";
                        return messageContact;
                    }
                    messageContact.type = nb5Var.m158750s();
                }
            }
            return messageContact;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageContact messageContact, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, messageContact.hide);
            String str = messageContact.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<MessageContact> JSON_ADAPTER = new ObjectJsonAdapter<MessageContact>() { // from class: com.p1.mobile.putong.core.data.MessageContact.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageContact.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageContact newInstance() {
            return new MessageContact();
        }

        public boolean parseField(MessageContact messageContact, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("hide")) {
                messageContact.hide = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            messageContact.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageContact messageContact, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("hide") || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(messageContact, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageContact messageContact, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hide", messageContact.hide);
            String str = messageContact.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageContact) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageContact) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageContact new_() {
        MessageContact messageContact = new MessageContact();
        messageContact.nullCheck();
        return messageContact;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageContact mo223809clone() {
        MessageContact messageContact = new MessageContact();
        messageContact.hide = this.hide;
        messageContact.type = this.type;
        return messageContact;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageContact)) {
            return false;
        }
        MessageContact messageContact = (MessageContact) obj;
        return this.hide == messageContact.hide && ValueObject.util_equals(this.type, messageContact.type);
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
        int i2 = ((i * 41) + (this.hide ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
