package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageRedPacketNotificationStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageredpacketnotificationstatus";

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String msg;

    @Nullable
    @ProtobufIndex(index = 1)
    public String ownerId;

    @Nullable
    @ProtobufIndex(index = 4)
    public String ownerMsg;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String receiverId;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String receiverMsg;
    public static ProtobufAdapter<MessageRedPacketNotificationStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRedPacketNotificationStatus>() { // from class: com.p1.mobile.putong.core.data.MessageRedPacketNotificationStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageRedPacketNotificationStatus messageRedPacketNotificationStatus) {
            String str = messageRedPacketNotificationStatus.ownerId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageRedPacketNotificationStatus.receiverId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = messageRedPacketNotificationStatus.receiverMsg;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = messageRedPacketNotificationStatus.ownerMsg;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = messageRedPacketNotificationStatus.msg;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) messageRedPacketNotificationStatus).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageRedPacketNotificationStatus m14245parse(nb5 nb5Var) throws IOException {
            MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = new MessageRedPacketNotificationStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    messageRedPacketNotificationStatus.ownerId = nb5Var.s();
                } else if (iU == 18) {
                    messageRedPacketNotificationStatus.receiverId = nb5Var.s();
                } else if (iU == 26) {
                    messageRedPacketNotificationStatus.receiverMsg = nb5Var.s();
                } else if (iU == 34) {
                    messageRedPacketNotificationStatus.ownerMsg = nb5Var.s();
                } else {
                    if (iU != 42) {
                        return messageRedPacketNotificationStatus;
                    }
                    messageRedPacketNotificationStatus.msg = nb5Var.s();
                }
            }
        }

        public void serialize(MessageRedPacketNotificationStatus messageRedPacketNotificationStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageRedPacketNotificationStatus.ownerId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageRedPacketNotificationStatus.receiverId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = messageRedPacketNotificationStatus.receiverMsg;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = messageRedPacketNotificationStatus.ownerMsg;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = messageRedPacketNotificationStatus.msg;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<MessageRedPacketNotificationStatus> JSON_ADAPTER = new ObjectJsonAdapter<MessageRedPacketNotificationStatus>() { // from class: com.p1.mobile.putong.core.data.MessageRedPacketNotificationStatus.2
        public Class getDataClass() {
            return MessageRedPacketNotificationStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageRedPacketNotificationStatus m14246newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRedPacketNotificationStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRedPacketNotificationStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRedPacketNotificationStatus new_() {
        MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = new MessageRedPacketNotificationStatus();
        messageRedPacketNotificationStatus.nullCheck();
        return messageRedPacketNotificationStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageRedPacketNotificationStatus m14244clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
