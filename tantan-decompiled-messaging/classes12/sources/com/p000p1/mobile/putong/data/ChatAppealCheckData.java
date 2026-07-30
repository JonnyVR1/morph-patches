package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatAppealCheckData chatAppealCheckData) {
            String str = chatAppealCheckData.ticketId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = chatAppealCheckData.appeal_type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = chatAppealCheckData.uuid;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = chatAppealCheckData.token;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) chatAppealCheckData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatAppealCheckData m17808parse(nb5 nb5Var) throws IOException {
            ChatAppealCheckData chatAppealCheckData = new ChatAppealCheckData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    chatAppealCheckData.ticketId = nb5Var.s();
                } else if (iU == 18) {
                    chatAppealCheckData.appeal_type = nb5Var.s();
                } else if (iU == 26) {
                    chatAppealCheckData.uuid = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    chatAppealCheckData.token = nb5Var.s();
                }
            }
            return chatAppealCheckData;
        }

        public void serialize(ChatAppealCheckData chatAppealCheckData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatAppealCheckData.ticketId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = chatAppealCheckData.appeal_type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = chatAppealCheckData.uuid;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = chatAppealCheckData.token;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<ChatAppealCheckData> JSON_ADAPTER = new ObjectJsonAdapter<ChatAppealCheckData>() { // from class: com.p1.mobile.putong.data.ChatAppealCheckData.2
        public Class getDataClass() {
            return ChatAppealCheckData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ChatAppealCheckData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField(Device.UUID, str3);
            }
            String str4 = chatAppealCheckData.token;
            if (str4 != null) {
                jsonGenerator.writeStringField(Token.TYPE, str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAppealCheckData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAppealCheckData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAppealCheckData new_() {
        ChatAppealCheckData chatAppealCheckData = new ChatAppealCheckData();
        chatAppealCheckData.nullCheck();
        return chatAppealCheckData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatAppealCheckData m17807clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
