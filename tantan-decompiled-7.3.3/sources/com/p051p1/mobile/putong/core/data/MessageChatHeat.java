package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class MessageChatHeat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagechatheat";

    @NonNull
    @ProtobufIndex(index = 2)
    public String actorID;

    @ProtobufIndex(index = 7)
    public int exclusiveChatDuration;

    @ProtobufIndex(index = 6)
    public double exclusiveChatEndTime;

    @ProtobufIndex(index = 4)
    public double exclusiveChatInviteExpireTime;

    @ProtobufIndex(index = 3)
    public double exclusiveChatInviteTime;

    @ProtobufIndex(index = 5)
    public double exclusiveChatStartTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21185id;
    public static ProtobufAdapter<MessageChatHeat> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageChatHeat>() { // from class: com.p1.mobile.putong.core.data.MessageChatHeat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageChatHeat messageChatHeat) {
            String str = messageChatHeat.f21185id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageChatHeat.actorID;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(3, messageChatHeat.exclusiveChatInviteTime) + CodedOutputByteBufferNano.m17277d(4, messageChatHeat.exclusiveChatInviteExpireTime) + CodedOutputByteBufferNano.m17277d(5, messageChatHeat.exclusiveChatStartTime) + CodedOutputByteBufferNano.m17277d(6, messageChatHeat.exclusiveChatEndTime) + CodedOutputByteBufferNano.m17281h(7, messageChatHeat.exclusiveChatDuration);
            messageChatHeat.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageChatHeat parse(nc5 nc5Var) throws IOException {
            MessageChatHeat messageChatHeat = new MessageChatHeat();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageChatHeat.f21185id == null) {
                        messageChatHeat.f21185id = "";
                    }
                    if (messageChatHeat.actorID != null) {
                        break;
                    }
                    messageChatHeat.actorID = "";
                    break;
                }
                if (iM162497u == 10) {
                    messageChatHeat.f21185id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    messageChatHeat.actorID = nc5Var.m162495s();
                } else if (iM162497u == 25) {
                    messageChatHeat.exclusiveChatInviteTime = nc5Var.m162484h();
                } else if (iM162497u == 33) {
                    messageChatHeat.exclusiveChatInviteExpireTime = nc5Var.m162484h();
                } else if (iM162497u == 41) {
                    messageChatHeat.exclusiveChatStartTime = nc5Var.m162484h();
                } else if (iM162497u == 49) {
                    messageChatHeat.exclusiveChatEndTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 56) {
                        if (messageChatHeat.f21185id == null) {
                            messageChatHeat.f21185id = "";
                        }
                        if (messageChatHeat.actorID != null) {
                            break;
                        }
                        messageChatHeat.actorID = "";
                        return messageChatHeat;
                    }
                    messageChatHeat.exclusiveChatDuration = nc5Var.m162486j();
                }
            }
            return messageChatHeat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageChatHeat messageChatHeat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageChatHeat.f21185id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageChatHeat.actorID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17301C(3, messageChatHeat.exclusiveChatInviteTime);
            codedOutputByteBufferNano.m17301C(4, messageChatHeat.exclusiveChatInviteExpireTime);
            codedOutputByteBufferNano.m17301C(5, messageChatHeat.exclusiveChatStartTime);
            codedOutputByteBufferNano.m17301C(6, messageChatHeat.exclusiveChatEndTime);
            codedOutputByteBufferNano.m17305G(7, messageChatHeat.exclusiveChatDuration);
        }
    };
    public static JsonAdapter<MessageChatHeat> JSON_ADAPTER = new ObjectJsonAdapter<MessageChatHeat>() { // from class: com.p1.mobile.putong.core.data.MessageChatHeat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageChatHeat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageChatHeat newInstance() {
            return new MessageChatHeat();
        }

        public boolean parseField(MessageChatHeat messageChatHeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "actorID":
                    messageChatHeat.actorID = jsonParser.getValueAsString();
                    return true;
                case "exclusiveChatInviteExpireTime":
                    messageChatHeat.exclusiveChatInviteExpireTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "exclusiveChatInviteTime":
                    messageChatHeat.exclusiveChatInviteTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    messageChatHeat.f21185id = jsonParser.getValueAsString();
                    return false;
                case "exclusiveChatDuration":
                    messageChatHeat.exclusiveChatDuration = jsonParser.getValueAsInt();
                    return true;
                case "exclusiveChatStartTime":
                    messageChatHeat.exclusiveChatStartTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "exclusiveChatEndTime":
                    messageChatHeat.exclusiveChatEndTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageChatHeat messageChatHeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "actorID":
                case "exclusiveChatInviteExpireTime":
                case "exclusiveChatInviteTime":
                    return true;
                case "id":
                    return false;
                case "exclusiveChatDuration":
                case "exclusiveChatStartTime":
                case "exclusiveChatEndTime":
                    return true;
                default:
                    return super.parseFieldCheck(messageChatHeat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageChatHeat messageChatHeat, JsonGenerator jsonGenerator) throws IOException {
            String str = messageChatHeat.f21185id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = messageChatHeat.actorID;
            if (str2 != null) {
                jsonGenerator.writeStringField("actorID", str2);
            }
            jsonGenerator.writeFieldName("exclusiveChatInviteTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(messageChatHeat.exclusiveChatInviteTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatInviteExpireTime");
            jsonAdapter.serialize(Double.valueOf(messageChatHeat.exclusiveChatInviteExpireTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatStartTime");
            jsonAdapter.serialize(Double.valueOf(messageChatHeat.exclusiveChatStartTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatEndTime");
            jsonAdapter.serialize(Double.valueOf(messageChatHeat.exclusiveChatEndTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("exclusiveChatDuration", messageChatHeat.exclusiveChatDuration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageChatHeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageChatHeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageChatHeat new_() {
        MessageChatHeat messageChatHeat = new MessageChatHeat();
        messageChatHeat.nullCheck();
        return messageChatHeat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageChatHeat mo225055clone() {
        MessageChatHeat messageChatHeat = new MessageChatHeat();
        messageChatHeat.f21185id = this.f21185id;
        messageChatHeat.actorID = this.actorID;
        messageChatHeat.exclusiveChatInviteTime = this.exclusiveChatInviteTime;
        messageChatHeat.exclusiveChatInviteExpireTime = this.exclusiveChatInviteExpireTime;
        messageChatHeat.exclusiveChatStartTime = this.exclusiveChatStartTime;
        messageChatHeat.exclusiveChatEndTime = this.exclusiveChatEndTime;
        messageChatHeat.exclusiveChatDuration = this.exclusiveChatDuration;
        return messageChatHeat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageChatHeat)) {
            return false;
        }
        MessageChatHeat messageChatHeat = (MessageChatHeat) obj;
        return ValueObject.util_equals(this.f21185id, messageChatHeat.f21185id) && ValueObject.util_equals(this.actorID, messageChatHeat.actorID) && this.exclusiveChatInviteTime == messageChatHeat.exclusiveChatInviteTime && this.exclusiveChatInviteExpireTime == messageChatHeat.exclusiveChatInviteExpireTime && this.exclusiveChatStartTime == messageChatHeat.exclusiveChatStartTime && this.exclusiveChatEndTime == messageChatHeat.exclusiveChatEndTime && this.exclusiveChatDuration == messageChatHeat.exclusiveChatDuration;
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
        String str = this.f21185id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.actorID;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.exclusiveChatInviteTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.exclusiveChatInviteExpireTime);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.exclusiveChatStartTime);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.exclusiveChatEndTime);
        int i6 = (((i5 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41) + this.exclusiveChatDuration;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21185id == null) {
            this.f21185id = "";
        }
        if (this.actorID == null) {
            this.actorID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
