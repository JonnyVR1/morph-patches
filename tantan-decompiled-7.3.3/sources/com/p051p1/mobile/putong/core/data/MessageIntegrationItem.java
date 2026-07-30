package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MessageIntegrationItem;
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

/* JADX INFO: loaded from: classes10.dex */
public class MessageIntegrationItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageintegrationitem";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageIntegrationItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageIntegrationItem>() { // from class: com.p1.mobile.putong.core.data.MessageIntegrationItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageIntegrationItem messageIntegrationItem) {
            String str = messageIntegrationItem.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = messageIntegrationItem.text;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            messageIntegrationItem.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageIntegrationItem parse(nc5 nc5Var) throws IOException {
            MessageIntegrationItem messageIntegrationItem = new MessageIntegrationItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageIntegrationItem.type == null) {
                        messageIntegrationItem.type = "";
                    }
                    if (messageIntegrationItem.text != null) {
                        break;
                    }
                    messageIntegrationItem.text = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    messageIntegrationItem.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (messageIntegrationItem.type == null) {
                            messageIntegrationItem.type = "";
                        }
                        if (messageIntegrationItem.text != null) {
                            break;
                        }
                        messageIntegrationItem.text = new ArrayList();
                        return messageIntegrationItem;
                    }
                    messageIntegrationItem.text = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return messageIntegrationItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageIntegrationItem messageIntegrationItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageIntegrationItem.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = messageIntegrationItem.text;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MessageIntegrationItem> JSON_ADAPTER = new ObjectJsonAdapter<MessageIntegrationItem>() { // from class: com.p1.mobile.putong.core.data.MessageIntegrationItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageIntegrationItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageIntegrationItem newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageIntegrationItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageIntegrationItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36687a(String str) {
        return str;
    }

    public static MessageIntegrationItem new_() {
        MessageIntegrationItem messageIntegrationItem = new MessageIntegrationItem();
        messageIntegrationItem.nullCheck();
        return messageIntegrationItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageIntegrationItem mo225055clone() {
        MessageIntegrationItem messageIntegrationItem = new MessageIntegrationItem();
        messageIntegrationItem.type = this.type;
        List<String> list = this.text;
        if (list != null) {
            messageIntegrationItem.text = ValueObject.util_map(list, new qcj() { // from class: l.gez
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MessageIntegrationItem.m36687a((String) obj);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.text;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
