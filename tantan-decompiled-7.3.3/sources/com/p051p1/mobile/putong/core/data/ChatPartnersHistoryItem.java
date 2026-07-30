package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p051p1.mobile.putong.data.Converter;
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
public class ChatPartnersHistoryItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpartnershistoryitem";

    @ProtobufIndex(index = 3)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String messageValue;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<ChatPartnersHistoryItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPartnersHistoryItem>() { // from class: com.p1.mobile.putong.core.data.ChatPartnersHistoryItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatPartnersHistoryItem chatPartnersHistoryItem) {
            String str = chatPartnersHistoryItem.messageValue;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = chatPartnersHistoryItem.userIds;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(3, chatPartnersHistoryItem.createdTime);
            chatPartnersHistoryItem.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatPartnersHistoryItem parse(nc5 nc5Var) throws IOException {
            ChatPartnersHistoryItem chatPartnersHistoryItem = new ChatPartnersHistoryItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatPartnersHistoryItem.messageValue == null) {
                        chatPartnersHistoryItem.messageValue = "";
                    }
                    if (chatPartnersHistoryItem.userIds != null) {
                        break;
                    }
                    chatPartnersHistoryItem.userIds = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    chatPartnersHistoryItem.messageValue = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    chatPartnersHistoryItem.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 25) {
                        if (chatPartnersHistoryItem.messageValue == null) {
                            chatPartnersHistoryItem.messageValue = "";
                        }
                        if (chatPartnersHistoryItem.userIds != null) {
                            break;
                        }
                        chatPartnersHistoryItem.userIds = new ArrayList();
                        return chatPartnersHistoryItem;
                    }
                    chatPartnersHistoryItem.createdTime = nc5Var.m162484h();
                }
            }
            return chatPartnersHistoryItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatPartnersHistoryItem chatPartnersHistoryItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatPartnersHistoryItem.messageValue;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = chatPartnersHistoryItem.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(3, chatPartnersHistoryItem.createdTime);
        }
    };
    public static JsonAdapter<ChatPartnersHistoryItem> JSON_ADAPTER = new ObjectJsonAdapter<ChatPartnersHistoryItem>() { // from class: com.p1.mobile.putong.core.data.ChatPartnersHistoryItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatPartnersHistoryItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatPartnersHistoryItem newInstance() {
            return new ChatPartnersHistoryItem();
        }

        public boolean parseField(ChatPartnersHistoryItem chatPartnersHistoryItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "messageValue":
                    chatPartnersHistoryItem.messageValue = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    chatPartnersHistoryItem.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "userIds":
                    chatPartnersHistoryItem.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatPartnersHistoryItem chatPartnersHistoryItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "messageValue":
                case "createdTime":
                case "userIds":
                    return true;
                default:
                    return super.parseFieldCheck(chatPartnersHistoryItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatPartnersHistoryItem chatPartnersHistoryItem, JsonGenerator jsonGenerator) throws IOException {
            String str = chatPartnersHistoryItem.messageValue;
            if (str != null) {
                jsonGenerator.writeStringField("messageValue", str);
            }
            if (chatPartnersHistoryItem.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(chatPartnersHistoryItem.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(chatPartnersHistoryItem.createdTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPartnersHistoryItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPartnersHistoryItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36275a(String str) {
        return str;
    }

    public static ChatPartnersHistoryItem new_() {
        ChatPartnersHistoryItem chatPartnersHistoryItem = new ChatPartnersHistoryItem();
        chatPartnersHistoryItem.nullCheck();
        return chatPartnersHistoryItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatPartnersHistoryItem mo225055clone() {
        ChatPartnersHistoryItem chatPartnersHistoryItem = new ChatPartnersHistoryItem();
        chatPartnersHistoryItem.messageValue = this.messageValue;
        List<String> list = this.userIds;
        if (list != null) {
            chatPartnersHistoryItem.userIds = ValueObject.util_map(list, new qcj() { // from class: l.l25
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ChatPartnersHistoryItem.m36275a((String) obj);
                }
            });
        }
        chatPartnersHistoryItem.createdTime = this.createdTime;
        return chatPartnersHistoryItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatPartnersHistoryItem)) {
            return false;
        }
        ChatPartnersHistoryItem chatPartnersHistoryItem = (ChatPartnersHistoryItem) obj;
        return ValueObject.util_equals(this.messageValue, chatPartnersHistoryItem.messageValue) && ValueObject.util_equals(this.userIds, chatPartnersHistoryItem.userIds) && this.createdTime == chatPartnersHistoryItem.createdTime;
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
        String str = this.messageValue;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.messageValue == null) {
            this.messageValue = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
