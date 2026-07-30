package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatPartnersSignals;
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
public class ChatPartnersSignals extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpartnerssignals";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String messageValue;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> userIds;
    public static ProtobufAdapter<ChatPartnersSignals> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPartnersSignals>() { // from class: com.p1.mobile.putong.core.data.ChatPartnersSignals.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatPartnersSignals chatPartnersSignals) {
            String str = chatPartnersSignals.messageValue;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = chatPartnersSignals.userIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, chatPartnersSignals.createdTime);
            ((MessageNano) chatPartnersSignals).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatPartnersSignals m12125parse(nb5 nb5Var) throws IOException {
            ChatPartnersSignals chatPartnersSignals = new ChatPartnersSignals();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatPartnersSignals.messageValue == null) {
                        chatPartnersSignals.messageValue = "";
                    }
                    if (chatPartnersSignals.userIds != null) {
                        break;
                    }
                    chatPartnersSignals.userIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    chatPartnersSignals.messageValue = nb5Var.s();
                } else if (iU == 18) {
                    chatPartnersSignals.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 25) {
                        if (chatPartnersSignals.messageValue == null) {
                            chatPartnersSignals.messageValue = "";
                        }
                        if (chatPartnersSignals.userIds != null) {
                            break;
                        }
                        chatPartnersSignals.userIds = new ArrayList();
                        return chatPartnersSignals;
                    }
                    chatPartnersSignals.createdTime = nb5Var.h();
                }
            }
            return chatPartnersSignals;
        }

        public void serialize(ChatPartnersSignals chatPartnersSignals, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatPartnersSignals.messageValue;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = chatPartnersSignals.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.C(3, chatPartnersSignals.createdTime);
        }
    };
    public static JsonAdapter<ChatPartnersSignals> JSON_ADAPTER = new ObjectJsonAdapter<ChatPartnersSignals>() { // from class: com.p1.mobile.putong.core.data.ChatPartnersSignals.2
        public Class getDataClass() {
            return ChatPartnersSignals.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatPartnersSignals m12126newInstance() {
            return new ChatPartnersSignals();
        }

        public boolean parseField(ChatPartnersSignals chatPartnersSignals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "messageValue":
                    chatPartnersSignals.messageValue = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    chatPartnersSignals.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "userIds":
                    chatPartnersSignals.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatPartnersSignals chatPartnersSignals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "messageValue":
                case "createdTime":
                case "userIds":
                    return true;
                default:
                    return super.parseFieldCheck(chatPartnersSignals, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatPartnersSignals chatPartnersSignals, JsonGenerator jsonGenerator) throws IOException {
            String str = chatPartnersSignals.messageValue;
            if (str != null) {
                jsonGenerator.writeStringField("messageValue", str);
            }
            if (chatPartnersSignals.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(chatPartnersSignals.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(chatPartnersSignals.createdTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPartnersSignals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPartnersSignals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m75a(String str) {
        return str;
    }

    public static ChatPartnersSignals new_() {
        ChatPartnersSignals chatPartnersSignals = new ChatPartnersSignals();
        chatPartnersSignals.nullCheck();
        return chatPartnersSignals;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatPartnersSignals m12124clone() {
        ChatPartnersSignals chatPartnersSignals = new ChatPartnersSignals();
        chatPartnersSignals.messageValue = this.messageValue;
        List<String> list = this.userIds;
        if (list != null) {
            chatPartnersSignals.userIds = ValueObject.util_map(list, new w9j() { // from class: l.n15
                public final Object call(Object obj) {
                    return ChatPartnersSignals.m75a((String) obj);
                }
            });
        }
        chatPartnersSignals.createdTime = this.createdTime;
        return chatPartnersSignals;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatPartnersSignals)) {
            return false;
        }
        ChatPartnersSignals chatPartnersSignals = (ChatPartnersSignals) obj;
        return ValueObject.util_equals(this.messageValue, chatPartnersSignals.messageValue) && ValueObject.util_equals(this.userIds, chatPartnersSignals.userIds) && this.createdTime == chatPartnersSignals.createdTime;
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
