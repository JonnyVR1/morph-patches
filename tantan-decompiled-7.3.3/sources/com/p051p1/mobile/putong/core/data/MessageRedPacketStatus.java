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
public class MessageRedPacketStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageredpacketstatus";

    @ProtobufIndex(index = 4)
    public long expireTime;

    @ProtobufIndex(index = 6)
    public boolean localIsRedPacketOpen;

    @Nullable
    @ProtobufIndex(index = 5)
    public String localRedPacketStatus;

    @Nullable
    @ProtobufIndex(index = 2)
    public String redPacketId;

    @Nullable
    @ProtobufIndex(index = 3)
    public String redPacketSplitType;

    @Nullable
    @ProtobufIndex(index = 1)
    public String redPacketTitle;
    public static ProtobufAdapter<MessageRedPacketStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRedPacketStatus>() { // from class: com.p1.mobile.putong.core.data.MessageRedPacketStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageRedPacketStatus messageRedPacketStatus) {
            String str = messageRedPacketStatus.redPacketTitle;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageRedPacketStatus.redPacketId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = messageRedPacketStatus.redPacketSplitType;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(4, messageRedPacketStatus.expireTime);
            String str4 = messageRedPacketStatus.localRedPacketStatus;
            if (str4 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            int iM17275b = iM17283j + CodedOutputByteBufferNano.m17275b(6, messageRedPacketStatus.localIsRedPacketOpen);
            messageRedPacketStatus.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageRedPacketStatus parse(nc5 nc5Var) throws IOException {
            MessageRedPacketStatus messageRedPacketStatus = new MessageRedPacketStatus();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    messageRedPacketStatus.redPacketTitle = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    messageRedPacketStatus.redPacketId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    messageRedPacketStatus.redPacketSplitType = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    messageRedPacketStatus.expireTime = nc5Var.m162487k();
                } else if (iM162497u == 42) {
                    messageRedPacketStatus.localRedPacketStatus = nc5Var.m162495s();
                } else {
                    if (iM162497u != 48) {
                        return messageRedPacketStatus;
                    }
                    messageRedPacketStatus.localIsRedPacketOpen = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageRedPacketStatus messageRedPacketStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageRedPacketStatus.redPacketTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageRedPacketStatus.redPacketId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = messageRedPacketStatus.redPacketSplitType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17307I(4, messageRedPacketStatus.expireTime);
            String str4 = messageRedPacketStatus.localRedPacketStatus;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            codedOutputByteBufferNano.m17299A(6, messageRedPacketStatus.localIsRedPacketOpen);
        }
    };
    public static JsonAdapter<MessageRedPacketStatus> JSON_ADAPTER = new ObjectJsonAdapter<MessageRedPacketStatus>() { // from class: com.p1.mobile.putong.core.data.MessageRedPacketStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageRedPacketStatus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageRedPacketStatus newInstance() {
            return new MessageRedPacketStatus();
        }

        public boolean parseField(MessageRedPacketStatus messageRedPacketStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    messageRedPacketStatus.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "localIsRedPacketOpen":
                    messageRedPacketStatus.localIsRedPacketOpen = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    messageRedPacketStatus.redPacketId = jsonParser.getValueAsString();
                    return false;
                case "title":
                    messageRedPacketStatus.redPacketTitle = jsonParser.getValueAsString();
                    return true;
                case "splitType":
                    messageRedPacketStatus.redPacketSplitType = jsonParser.getValueAsString();
                    return true;
                case "localRedPacketStatus":
                    messageRedPacketStatus.localRedPacketStatus = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageRedPacketStatus messageRedPacketStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireTime":
                case "localIsRedPacketOpen":
                    return true;
                case "id":
                    return false;
                case "title":
                case "splitType":
                case "localRedPacketStatus":
                    return true;
                default:
                    return super.parseFieldCheck(messageRedPacketStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageRedPacketStatus messageRedPacketStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = messageRedPacketStatus.redPacketTitle;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = messageRedPacketStatus.redPacketId;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = messageRedPacketStatus.redPacketSplitType;
            if (str3 != null) {
                jsonGenerator.writeStringField("splitType", str3);
            }
            jsonGenerator.writeNumberField("expireTime", messageRedPacketStatus.expireTime);
            String str4 = messageRedPacketStatus.localRedPacketStatus;
            if (str4 != null) {
                jsonGenerator.writeStringField("localRedPacketStatus", str4);
            }
            jsonGenerator.writeBooleanField("localIsRedPacketOpen", messageRedPacketStatus.localIsRedPacketOpen);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRedPacketStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRedPacketStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRedPacketStatus new_() {
        MessageRedPacketStatus messageRedPacketStatus = new MessageRedPacketStatus();
        messageRedPacketStatus.nullCheck();
        return messageRedPacketStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageRedPacketStatus mo225055clone() {
        MessageRedPacketStatus messageRedPacketStatus = new MessageRedPacketStatus();
        messageRedPacketStatus.redPacketTitle = this.redPacketTitle;
        messageRedPacketStatus.redPacketId = this.redPacketId;
        messageRedPacketStatus.redPacketSplitType = this.redPacketSplitType;
        messageRedPacketStatus.expireTime = this.expireTime;
        messageRedPacketStatus.localRedPacketStatus = this.localRedPacketStatus;
        messageRedPacketStatus.localIsRedPacketOpen = this.localIsRedPacketOpen;
        return messageRedPacketStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageRedPacketStatus)) {
            return false;
        }
        MessageRedPacketStatus messageRedPacketStatus = (MessageRedPacketStatus) obj;
        return ValueObject.util_equals(this.redPacketTitle, messageRedPacketStatus.redPacketTitle) && ValueObject.util_equals(this.redPacketId, messageRedPacketStatus.redPacketId) && ValueObject.util_equals(this.redPacketSplitType, messageRedPacketStatus.redPacketSplitType) && this.expireTime == messageRedPacketStatus.expireTime && ValueObject.util_equals(this.localRedPacketStatus, messageRedPacketStatus.localRedPacketStatus) && this.localIsRedPacketOpen == messageRedPacketStatus.localIsRedPacketOpen;
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
        String str = this.redPacketTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.redPacketId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.redPacketSplitType;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.localRedPacketStatus;
        int iHashCode4 = ((i3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.localIsRedPacketOpen ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
