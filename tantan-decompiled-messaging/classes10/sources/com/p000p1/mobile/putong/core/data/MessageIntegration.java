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
public class MessageIntegration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageintegration";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<MessageIntegrationItem> items;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int limit;
    public static ProtobufAdapter<MessageIntegration> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageIntegration>() { // from class: com.p1.mobile.putong.core.data.MessageIntegration.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageIntegration messageIntegration) {
            int iB = CodedOutputByteBufferNano.b(1, messageIntegration.enable) + CodedOutputByteBufferNano.h(2, messageIntegration.limit);
            List<MessageIntegrationItem> list = messageIntegration.items;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(3, list, MessageIntegrationItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) messageIntegration).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageIntegration m14209parse(nb5 nb5Var) throws IOException {
            MessageIntegration messageIntegration = new MessageIntegration();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageIntegration.items != null) {
                        break;
                    }
                    messageIntegration.items = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    messageIntegration.enable = nb5Var.g();
                } else if (iU == 16) {
                    messageIntegration.limit = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (messageIntegration.items != null) {
                            break;
                        }
                        messageIntegration.items = new ArrayList();
                        return messageIntegration;
                    }
                    messageIntegration.items = (List) nb5Var.l(MessageIntegrationItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return messageIntegration;
        }

        public void serialize(MessageIntegration messageIntegration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, messageIntegration.enable);
            codedOutputByteBufferNano.G(2, messageIntegration.limit);
            List<MessageIntegrationItem> list = messageIntegration.items;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, MessageIntegrationItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MessageIntegration> JSON_ADAPTER = new ObjectJsonAdapter<MessageIntegration>() { // from class: com.p1.mobile.putong.core.data.MessageIntegration.2
        public Class getDataClass() {
            return MessageIntegration.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageIntegration m14210newInstance() {
            return new MessageIntegration();
        }

        public boolean parseField(MessageIntegration messageIntegration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    messageIntegration.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "items":
                    messageIntegration.items = JsonAdapter.parseArray(jsonParser, MessageIntegrationItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "limit":
                    messageIntegration.limit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageIntegration messageIntegration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "items":
                case "limit":
                    return true;
                default:
                    return super.parseFieldCheck(messageIntegration, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MessageIntegration messageIntegration, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", messageIntegration.enable);
            jsonGenerator.writeNumberField("limit", messageIntegration.limit);
            if (messageIntegration.items != null) {
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(messageIntegration.items, jsonGenerator, MessageIntegrationItem.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageIntegration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageIntegration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageIntegration new_() {
        MessageIntegration messageIntegration = new MessageIntegration();
        messageIntegration.nullCheck();
        return messageIntegration;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageIntegration m14208clone() {
        MessageIntegration messageIntegration = new MessageIntegration();
        messageIntegration.enable = this.enable;
        messageIntegration.limit = this.limit;
        List<MessageIntegrationItem> list = this.items;
        if (list != null) {
            messageIntegration.items = ValueObject.util_map(list, new w9j() { // from class: l.i5z
                public final Object call(Object obj) {
                    return ((MessageIntegrationItem) obj).m14212clone();
                }
            });
        }
        return messageIntegration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageIntegration)) {
            return false;
        }
        MessageIntegration messageIntegration = (MessageIntegration) obj;
        return this.enable == messageIntegration.enable && this.limit == messageIntegration.limit && ValueObject.util_equals(this.items, messageIntegration.items);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.limit) * 41;
        List<MessageIntegrationItem> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
