package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageContact extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagecontact";

    @ProtobufIndex(index = 1)
    public boolean hide;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<MessageContact> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageContact>() { // from class: com.p1.mobile.putong.core.data.MessageContact.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageContact messageContact) {
            int iB = CodedOutputByteBufferNano.b(1, messageContact.hide);
            String str = messageContact.type;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) messageContact).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageContact m14185parse(nb5 nb5Var) throws IOException {
            MessageContact messageContact = new MessageContact();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageContact.type != null) {
                        break;
                    }
                    messageContact.type = "";
                    break;
                }
                if (iU == 8) {
                    messageContact.hide = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (messageContact.type != null) {
                            break;
                        }
                        messageContact.type = "";
                        return messageContact;
                    }
                    messageContact.type = nb5Var.s();
                }
            }
            return messageContact;
        }

        public void serialize(MessageContact messageContact, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, messageContact.hide);
            String str = messageContact.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<MessageContact> JSON_ADAPTER = new ObjectJsonAdapter<MessageContact>() { // from class: com.p1.mobile.putong.core.data.MessageContact.2
        public Class getDataClass() {
            return MessageContact.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageContact m14186newInstance() {
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

        public void serializeFields(MessageContact messageContact, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hide", messageContact.hide);
            String str = messageContact.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageContact) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageContact) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageContact new_() {
        MessageContact messageContact = new MessageContact();
        messageContact.nullCheck();
        return messageContact;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageContact m14184clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.hide ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
