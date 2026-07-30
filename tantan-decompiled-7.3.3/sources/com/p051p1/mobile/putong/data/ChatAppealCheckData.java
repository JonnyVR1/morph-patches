package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class ChatAppealCheckData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatappealcheckdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String appeal_type;

    @NonNull
    @ProtobufIndex(index = 1)
    public String ticketId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String token;

    @NonNull
    @ProtobufIndex(index = 3)
    public String uuid;
    public static ProtobufAdapter<ChatAppealCheckData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAppealCheckData>() { // from class: com.p1.mobile.putong.data.ChatAppealCheckData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatAppealCheckData chatAppealCheckData) {
            String str = chatAppealCheckData.ticketId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = chatAppealCheckData.appeal_type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = chatAppealCheckData.uuid;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = chatAppealCheckData.token;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            chatAppealCheckData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatAppealCheckData parse(nc5 nc5Var) throws IOException {
            ChatAppealCheckData chatAppealCheckData = new ChatAppealCheckData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatAppealCheckData.ticketId == null) {
                        chatAppealCheckData.ticketId = "";
                    }
                    if (chatAppealCheckData.appeal_type == null) {
                        chatAppealCheckData.appeal_type = "";
                    }
                    if (chatAppealCheckData.uuid == null) {
                        chatAppealCheckData.uuid = "";
                    }
                    if (chatAppealCheckData.token != null) {
                        break;
                    }
                    chatAppealCheckData.token = "";
                    break;
                }
                if (iM162497u == 10) {
                    chatAppealCheckData.ticketId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    chatAppealCheckData.appeal_type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    chatAppealCheckData.uuid = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (chatAppealCheckData.ticketId == null) {
                            chatAppealCheckData.ticketId = "";
                        }
                        if (chatAppealCheckData.appeal_type == null) {
                            chatAppealCheckData.appeal_type = "";
                        }
                        if (chatAppealCheckData.uuid == null) {
                            chatAppealCheckData.uuid = "";
                        }
                        if (chatAppealCheckData.token != null) {
                            break;
                        }
                        chatAppealCheckData.token = "";
                        return chatAppealCheckData;
                    }
                    chatAppealCheckData.token = nc5Var.m162495s();
                }
            }
            return chatAppealCheckData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatAppealCheckData chatAppealCheckData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatAppealCheckData.ticketId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = chatAppealCheckData.appeal_type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = chatAppealCheckData.uuid;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = chatAppealCheckData.token;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<ChatAppealCheckData> JSON_ADAPTER = new ObjectJsonAdapter<ChatAppealCheckData>() { // from class: com.p1.mobile.putong.data.ChatAppealCheckData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatAppealCheckData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatAppealCheckData newInstance() {
            return new ChatAppealCheckData();
        }

        public boolean parseField(ChatAppealCheckData chatAppealCheckData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "appeal_type":
                    chatAppealCheckData.appeal_type = jsonParser.getValueAsString();
                    return true;
                case "uuid":
                    chatAppealCheckData.uuid = jsonParser.getValueAsString();
                    return true;
                case "token":
                    chatAppealCheckData.token = jsonParser.getValueAsString();
                    return true;
                case "ticketId":
                    chatAppealCheckData.ticketId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatAppealCheckData chatAppealCheckData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "appeal_type":
                case "uuid":
                case "token":
                case "ticketId":
                    return true;
                default:
                    return super.parseFieldCheck(chatAppealCheckData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatAppealCheckData chatAppealCheckData, JsonGenerator jsonGenerator) throws IOException {
            String str = chatAppealCheckData.ticketId;
            if (str != null) {
                jsonGenerator.writeStringField("ticketId", str);
            }
            String str2 = chatAppealCheckData.appeal_type;
            if (str2 != null) {
                jsonGenerator.writeStringField("appeal_type", str2);
            }
            String str3 = chatAppealCheckData.uuid;
            if (str3 != null) {
                jsonGenerator.writeStringField("uuid", str3);
            }
            String str4 = chatAppealCheckData.token;
            if (str4 != null) {
                jsonGenerator.writeStringField("token", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAppealCheckData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAppealCheckData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAppealCheckData new_() {
        ChatAppealCheckData chatAppealCheckData = new ChatAppealCheckData();
        chatAppealCheckData.nullCheck();
        return chatAppealCheckData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatAppealCheckData mo225055clone() {
        ChatAppealCheckData chatAppealCheckData = new ChatAppealCheckData();
        chatAppealCheckData.ticketId = this.ticketId;
        chatAppealCheckData.appeal_type = this.appeal_type;
        chatAppealCheckData.uuid = this.uuid;
        chatAppealCheckData.token = this.token;
        return chatAppealCheckData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatAppealCheckData)) {
            return false;
        }
        ChatAppealCheckData chatAppealCheckData = (ChatAppealCheckData) obj;
        return ValueObject.util_equals(this.ticketId, chatAppealCheckData.ticketId) && ValueObject.util_equals(this.appeal_type, chatAppealCheckData.appeal_type) && ValueObject.util_equals(this.uuid, chatAppealCheckData.uuid) && ValueObject.util_equals(this.token, chatAppealCheckData.token);
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
        String str = this.ticketId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.appeal_type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.uuid;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.token;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ticketId == null) {
            this.ticketId = "";
        }
        if (this.appeal_type == null) {
            this.appeal_type = "";
        }
        if (this.uuid == null) {
            this.uuid = "";
        }
        if (this.token == null) {
            this.token = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
