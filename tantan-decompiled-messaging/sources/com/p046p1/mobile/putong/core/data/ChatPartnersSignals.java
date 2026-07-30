package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ChatPartnersSignals;
import com.p046p1.mobile.putong.data.Converter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class ChatPartnersSignals extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpartnerssignals";

    @ProtobufIndex(index = 3)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String messageValue;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<ChatPartnersSignals> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPartnersSignals>() { // from class: com.p1.mobile.putong.core.data.ChatPartnersSignals.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatPartnersSignals chatPartnersSignals) {
            String str = chatPartnersSignals.messageValue;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = chatPartnersSignals.userIds;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(3, chatPartnersSignals.createdTime);
            chatPartnersSignals.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatPartnersSignals parse(nb5 nb5Var) throws IOException {
            ChatPartnersSignals chatPartnersSignals = new ChatPartnersSignals();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatPartnersSignals.messageValue == null) {
                        chatPartnersSignals.messageValue = "";
                    }
                    if (chatPartnersSignals.userIds != null) {
                        break;
                    }
                    chatPartnersSignals.userIds = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    chatPartnersSignals.messageValue = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    chatPartnersSignals.userIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 25) {
                        if (chatPartnersSignals.messageValue == null) {
                            chatPartnersSignals.messageValue = "";
                        }
                        if (chatPartnersSignals.userIds != null) {
                            break;
                        }
                        chatPartnersSignals.userIds = new ArrayList();
                        return chatPartnersSignals;
                    }
                    chatPartnersSignals.createdTime = nb5Var.m158739h();
                }
            }
            return chatPartnersSignals;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatPartnersSignals chatPartnersSignals, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatPartnersSignals.messageValue;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = chatPartnersSignals.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17246C(3, chatPartnersSignals.createdTime);
        }
    };
    public static JsonAdapter<ChatPartnersSignals> JSON_ADAPTER = new ObjectJsonAdapter<ChatPartnersSignals>() { // from class: com.p1.mobile.putong.core.data.ChatPartnersSignals.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatPartnersSignals.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatPartnersSignals newInstance() {
            return new ChatPartnersSignals();
        }

        public boolean parseField(ChatPartnersSignals chatPartnersSignals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "messageValue":
                    chatPartnersSignals.messageValue = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    chatPartnersSignals.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPartnersSignals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPartnersSignals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35273a(String str) {
        return str;
    }

    public static ChatPartnersSignals new_() {
        ChatPartnersSignals chatPartnersSignals = new ChatPartnersSignals();
        chatPartnersSignals.nullCheck();
        return chatPartnersSignals;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatPartnersSignals mo223809clone() {
        ChatPartnersSignals chatPartnersSignals = new ChatPartnersSignals();
        chatPartnersSignals.messageValue = this.messageValue;
        List<String> list = this.userIds;
        if (list != null) {
            chatPartnersSignals.userIds = ValueObject.util_map(list, new w9j() { // from class: l.n15
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ChatPartnersSignals.m35273a((String) obj);
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
