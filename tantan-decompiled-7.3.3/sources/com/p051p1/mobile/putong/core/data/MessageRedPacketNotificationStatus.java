package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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

/* JADX INFO: loaded from: classes10.dex */
public class MessageRedPacketNotificationStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageredpacketnotificationstatus";

    @Nullable
    @ProtobufIndex(index = 5)
    public String msg;

    @Nullable
    @ProtobufIndex(index = 1)
    public String ownerId;

    @Nullable
    @ProtobufIndex(index = 4)
    public String ownerMsg;

    @Nullable
    @ProtobufIndex(index = 2)
    public String receiverId;

    @Nullable
    @ProtobufIndex(index = 3)
    public String receiverMsg;
    public static ProtobufAdapter<MessageRedPacketNotificationStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRedPacketNotificationStatus>() { // from class: com.p1.mobile.putong.core.data.MessageRedPacketNotificationStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageRedPacketNotificationStatus messageRedPacketNotificationStatus) {
            String str = messageRedPacketNotificationStatus.ownerId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageRedPacketNotificationStatus.receiverId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = messageRedPacketNotificationStatus.receiverMsg;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = messageRedPacketNotificationStatus.ownerMsg;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = messageRedPacketNotificationStatus.msg;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            messageRedPacketNotificationStatus.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageRedPacketNotificationStatus parse(nc5 nc5Var) throws IOException {
            MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = new MessageRedPacketNotificationStatus();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    messageRedPacketNotificationStatus.ownerId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    messageRedPacketNotificationStatus.receiverId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    messageRedPacketNotificationStatus.receiverMsg = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    messageRedPacketNotificationStatus.ownerMsg = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        return messageRedPacketNotificationStatus;
                    }
                    messageRedPacketNotificationStatus.msg = nc5Var.m162495s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageRedPacketNotificationStatus messageRedPacketNotificationStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageRedPacketNotificationStatus.ownerId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageRedPacketNotificationStatus.receiverId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = messageRedPacketNotificationStatus.receiverMsg;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = messageRedPacketNotificationStatus.ownerMsg;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = messageRedPacketNotificationStatus.msg;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
        }
    };
    public static JsonAdapter<MessageRedPacketNotificationStatus> JSON_ADAPTER = new ObjectJsonAdapter<MessageRedPacketNotificationStatus>() { // from class: com.p1.mobile.putong.core.data.MessageRedPacketNotificationStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageRedPacketNotificationStatus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageRedPacketNotificationStatus newInstance() {
            return new MessageRedPacketNotificationStatus();
        }

        public boolean parseField(MessageRedPacketNotificationStatus messageRedPacketNotificationStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "receiverMsg":
                    messageRedPacketNotificationStatus.receiverMsg = jsonParser.getValueAsString();
                    return true;
                case "ownerId":
                    messageRedPacketNotificationStatus.ownerId = jsonParser.getValueAsString();
                    return true;
                case "msg":
                    messageRedPacketNotificationStatus.msg = jsonParser.getValueAsString();
                    return true;
                case "receiverId":
                    messageRedPacketNotificationStatus.receiverId = jsonParser.getValueAsString();
                    return true;
                case "ownerMsg":
                    messageRedPacketNotificationStatus.ownerMsg = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageRedPacketNotificationStatus messageRedPacketNotificationStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "receiverMsg":
                case "ownerId":
                case "msg":
                case "receiverId":
                case "ownerMsg":
                    return true;
                default:
                    return super.parseFieldCheck(messageRedPacketNotificationStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageRedPacketNotificationStatus messageRedPacketNotificationStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = messageRedPacketNotificationStatus.ownerId;
            if (str != null) {
                jsonGenerator.writeStringField("ownerId", str);
            }
            String str2 = messageRedPacketNotificationStatus.receiverId;
            if (str2 != null) {
                jsonGenerator.writeStringField("receiverId", str2);
            }
            String str3 = messageRedPacketNotificationStatus.receiverMsg;
            if (str3 != null) {
                jsonGenerator.writeStringField("receiverMsg", str3);
            }
            String str4 = messageRedPacketNotificationStatus.ownerMsg;
            if (str4 != null) {
                jsonGenerator.writeStringField("ownerMsg", str4);
            }
            String str5 = messageRedPacketNotificationStatus.msg;
            if (str5 != null) {
                jsonGenerator.writeStringField("msg", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRedPacketNotificationStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRedPacketNotificationStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRedPacketNotificationStatus new_() {
        MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = new MessageRedPacketNotificationStatus();
        messageRedPacketNotificationStatus.nullCheck();
        return messageRedPacketNotificationStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageRedPacketNotificationStatus mo225055clone() {
        MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = new MessageRedPacketNotificationStatus();
        messageRedPacketNotificationStatus.ownerId = this.ownerId;
        messageRedPacketNotificationStatus.receiverId = this.receiverId;
        messageRedPacketNotificationStatus.receiverMsg = this.receiverMsg;
        messageRedPacketNotificationStatus.ownerMsg = this.ownerMsg;
        messageRedPacketNotificationStatus.msg = this.msg;
        return messageRedPacketNotificationStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageRedPacketNotificationStatus)) {
            return false;
        }
        MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = (MessageRedPacketNotificationStatus) obj;
        return ValueObject.util_equals(this.ownerId, messageRedPacketNotificationStatus.ownerId) && ValueObject.util_equals(this.receiverId, messageRedPacketNotificationStatus.receiverId) && ValueObject.util_equals(this.receiverMsg, messageRedPacketNotificationStatus.receiverMsg) && ValueObject.util_equals(this.ownerMsg, messageRedPacketNotificationStatus.ownerMsg) && ValueObject.util_equals(this.msg, messageRedPacketNotificationStatus.msg);
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
        String str = this.ownerId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.receiverId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.receiverMsg;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.ownerMsg;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.msg;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
