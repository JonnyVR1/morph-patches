package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class MessageIntegration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageintegration";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<MessageIntegrationItem> items;

    @ProtobufIndex(index = 2)
    public int limit;
    public static ProtobufAdapter<MessageIntegration> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageIntegration>() { // from class: com.p1.mobile.putong.core.data.MessageIntegration.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageIntegration messageIntegration) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, messageIntegration.enable) + CodedOutputByteBufferNano.m17281h(2, messageIntegration.limit);
            List<MessageIntegrationItem> list = messageIntegration.items;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, list, MessageIntegrationItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            messageIntegration.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageIntegration parse(nc5 nc5Var) throws IOException {
            MessageIntegration messageIntegration = new MessageIntegration();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageIntegration.items != null) {
                        break;
                    }
                    messageIntegration.items = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    messageIntegration.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    messageIntegration.limit = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (messageIntegration.items != null) {
                            break;
                        }
                        messageIntegration.items = new ArrayList();
                        return messageIntegration;
                    }
                    messageIntegration.items = (List) nc5Var.m162488l(MessageIntegrationItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return messageIntegration;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageIntegration messageIntegration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, messageIntegration.enable);
            codedOutputByteBufferNano.m17305G(2, messageIntegration.limit);
            List<MessageIntegrationItem> list = messageIntegration.items;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, MessageIntegrationItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MessageIntegration> JSON_ADAPTER = new ObjectJsonAdapter<MessageIntegration>() { // from class: com.p1.mobile.putong.core.data.MessageIntegration.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageIntegration.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageIntegration newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageIntegration messageIntegration, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", messageIntegration.enable);
            jsonGenerator.writeNumberField(Constants.KEY_LIMIT, messageIntegration.limit);
            if (messageIntegration.items != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.ITEMS);
                JsonAdapter.serializeArray(messageIntegration.items, jsonGenerator, MessageIntegrationItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageIntegration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageIntegration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageIntegration new_() {
        MessageIntegration messageIntegration = new MessageIntegration();
        messageIntegration.nullCheck();
        return messageIntegration;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageIntegration mo225055clone() {
        MessageIntegration messageIntegration = new MessageIntegration();
        messageIntegration.enable = this.enable;
        messageIntegration.limit = this.limit;
        List<MessageIntegrationItem> list = this.items;
        if (list != null) {
            messageIntegration.items = ValueObject.util_map(list, new qcj() { // from class: l.fez
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MessageIntegrationItem) obj).mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.limit) * 41;
        List<MessageIntegrationItem> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
