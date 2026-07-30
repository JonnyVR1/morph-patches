package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p1.mobile.putong.data.Converter;
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
public class ChatPartnersHistoryItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpartnershistoryitem";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String messageValue;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> userIds;
    public static ProtobufAdapter<ChatPartnersHistoryItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPartnersHistoryItem>() { // from class: com.p1.mobile.putong.core.data.ChatPartnersHistoryItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatPartnersHistoryItem chatPartnersHistoryItem) {
            String str = chatPartnersHistoryItem.messageValue;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = chatPartnersHistoryItem.userIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, chatPartnersHistoryItem.createdTime);
            ((MessageNano) chatPartnersHistoryItem).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatPartnersHistoryItem m12121parse(nb5 nb5Var) throws IOException {
            ChatPartnersHistoryItem chatPartnersHistoryItem = new ChatPartnersHistoryItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatPartnersHistoryItem.messageValue == null) {
                        chatPartnersHistoryItem.messageValue = "";
                    }
                    if (chatPartnersHistoryItem.userIds != null) {
                        break;
                    }
                    chatPartnersHistoryItem.userIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    chatPartnersHistoryItem.messageValue = nb5Var.s();
                } else if (iU == 18) {
                    chatPartnersHistoryItem.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 25) {
                        if (chatPartnersHistoryItem.messageValue == null) {
                            chatPartnersHistoryItem.messageValue = "";
                        }
                        if (chatPartnersHistoryItem.userIds != null) {
                            break;
                        }
                        chatPartnersHistoryItem.userIds = new ArrayList();
                        return chatPartnersHistoryItem;
                    }
                    chatPartnersHistoryItem.createdTime = nb5Var.h();
                }
            }
            return chatPartnersHistoryItem;
        }

        public void serialize(ChatPartnersHistoryItem chatPartnersHistoryItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatPartnersHistoryItem.messageValue;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = chatPartnersHistoryItem.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.C(3, chatPartnersHistoryItem.createdTime);
        }
    };
    public static JsonAdapter<ChatPartnersHistoryItem> JSON_ADAPTER = new ObjectJsonAdapter<ChatPartnersHistoryItem>() { // from class: com.p1.mobile.putong.core.data.ChatPartnersHistoryItem.2
        public Class getDataClass() {
            return ChatPartnersHistoryItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatPartnersHistoryItem m12122newInstance() {
            return new ChatPartnersHistoryItem();
        }

        public boolean parseField(ChatPartnersHistoryItem chatPartnersHistoryItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "messageValue":
                    chatPartnersHistoryItem.messageValue = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    chatPartnersHistoryItem.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPartnersHistoryItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPartnersHistoryItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m74a(String str) {
        return str;
    }

    public static ChatPartnersHistoryItem new_() {
        ChatPartnersHistoryItem chatPartnersHistoryItem = new ChatPartnersHistoryItem();
        chatPartnersHistoryItem.nullCheck();
        return chatPartnersHistoryItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatPartnersHistoryItem m12120clone() {
        ChatPartnersHistoryItem chatPartnersHistoryItem = new ChatPartnersHistoryItem();
        chatPartnersHistoryItem.messageValue = this.messageValue;
        List<String> list = this.userIds;
        if (list != null) {
            chatPartnersHistoryItem.userIds = ValueObject.util_map(list, new w9j() { // from class: l.m15
                public final Object call(Object obj) {
                    return ChatPartnersHistoryItem.m74a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.messageValue == null) {
            this.messageValue = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
