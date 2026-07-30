package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MessageIntegrationItem;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageIntegrationItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageintegrationitem";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageIntegrationItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageIntegrationItem>() { // from class: com.p1.mobile.putong.core.data.MessageIntegrationItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageIntegrationItem messageIntegrationItem) {
            String str = messageIntegrationItem.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = messageIntegrationItem.text;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) messageIntegrationItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageIntegrationItem m14213parse(nb5 nb5Var) throws IOException {
            MessageIntegrationItem messageIntegrationItem = new MessageIntegrationItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageIntegrationItem.type == null) {
                        messageIntegrationItem.type = "";
                    }
                    if (messageIntegrationItem.text != null) {
                        break;
                    }
                    messageIntegrationItem.text = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    messageIntegrationItem.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (messageIntegrationItem.type == null) {
                            messageIntegrationItem.type = "";
                        }
                        if (messageIntegrationItem.text != null) {
                            break;
                        }
                        messageIntegrationItem.text = new ArrayList();
                        return messageIntegrationItem;
                    }
                    messageIntegrationItem.text = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return messageIntegrationItem;
        }

        public void serialize(MessageIntegrationItem messageIntegrationItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageIntegrationItem.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = messageIntegrationItem.text;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MessageIntegrationItem> JSON_ADAPTER = new ObjectJsonAdapter<MessageIntegrationItem>() { // from class: com.p1.mobile.putong.core.data.MessageIntegrationItem.2
        public Class getDataClass() {
            return MessageIntegrationItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageIntegrationItem m14214newInstance() {
            return new MessageIntegrationItem();
        }

        public boolean parseField(MessageIntegrationItem messageIntegrationItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                messageIntegrationItem.text = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            messageIntegrationItem.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageIntegrationItem messageIntegrationItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(messageIntegrationItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageIntegrationItem messageIntegrationItem, JsonGenerator jsonGenerator) throws IOException {
            String str = messageIntegrationItem.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (messageIntegrationItem.text != null) {
                jsonGenerator.writeFieldName("text");
                JsonAdapter.serializeArray(messageIntegrationItem.text, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageIntegrationItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageIntegrationItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m486a(String str) {
        return str;
    }

    public static MessageIntegrationItem new_() {
        MessageIntegrationItem messageIntegrationItem = new MessageIntegrationItem();
        messageIntegrationItem.nullCheck();
        return messageIntegrationItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageIntegrationItem m14212clone() {
        MessageIntegrationItem messageIntegrationItem = new MessageIntegrationItem();
        messageIntegrationItem.type = this.type;
        List<String> list = this.text;
        if (list != null) {
            messageIntegrationItem.text = ValueObject.util_map(list, new w9j() { // from class: l.j5z
                public final Object call(Object obj) {
                    return MessageIntegrationItem.m486a((String) obj);
                }
            });
        }
        return messageIntegrationItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageIntegrationItem)) {
            return false;
        }
        MessageIntegrationItem messageIntegrationItem = (MessageIntegrationItem) obj;
        return ValueObject.util_equals(this.type, messageIntegrationItem.type) && ValueObject.util_equals(this.text, messageIntegrationItem.text);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.text;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
