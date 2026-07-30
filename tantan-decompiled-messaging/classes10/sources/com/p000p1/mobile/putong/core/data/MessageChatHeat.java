package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageChatHeat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagechatheat";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String actorID;

    @ProtobufIndex(index = 7)
    public int exclusiveChatDuration;

    @ProtobufIndex(index = 6)
    public double exclusiveChatEndTime;

    @ProtobufIndex(index = 4)
    public double exclusiveChatInviteExpireTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double exclusiveChatInviteTime;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public double exclusiveChatStartTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f105id;
    public static ProtobufAdapter<MessageChatHeat> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageChatHeat>() { // from class: com.p1.mobile.putong.core.data.MessageChatHeat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageChatHeat messageChatHeat) {
            String str = messageChatHeat.f105id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageChatHeat.actorID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, messageChatHeat.exclusiveChatInviteTime) + CodedOutputByteBufferNano.d(4, messageChatHeat.exclusiveChatInviteExpireTime) + CodedOutputByteBufferNano.d(5, messageChatHeat.exclusiveChatStartTime) + CodedOutputByteBufferNano.d(6, messageChatHeat.exclusiveChatEndTime) + CodedOutputByteBufferNano.h(7, messageChatHeat.exclusiveChatDuration);
            ((MessageNano) messageChatHeat).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageChatHeat m14181parse(nb5 nb5Var) throws IOException {
            MessageChatHeat messageChatHeat = new MessageChatHeat();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageChatHeat.f105id == null) {
                        messageChatHeat.f105id = "";
                    }
                    if (messageChatHeat.actorID != null) {
                        break;
                    }
                    messageChatHeat.actorID = "";
                    break;
                }
                if (iU == 10) {
                    messageChatHeat.f105id = nb5Var.s();
                } else if (iU == 18) {
                    messageChatHeat.actorID = nb5Var.s();
                } else if (iU == 25) {
                    messageChatHeat.exclusiveChatInviteTime = nb5Var.h();
                } else if (iU == 33) {
                    messageChatHeat.exclusiveChatInviteExpireTime = nb5Var.h();
                } else if (iU == 41) {
                    messageChatHeat.exclusiveChatStartTime = nb5Var.h();
                } else if (iU == 49) {
                    messageChatHeat.exclusiveChatEndTime = nb5Var.h();
                } else {
                    if (iU != 56) {
                        if (messageChatHeat.f105id == null) {
                            messageChatHeat.f105id = "";
                        }
                        if (messageChatHeat.actorID != null) {
                            break;
                        }
                        messageChatHeat.actorID = "";
                        return messageChatHeat;
                    }
                    messageChatHeat.exclusiveChatDuration = nb5Var.j();
                }
            }
            return messageChatHeat;
        }

        public void serialize(MessageChatHeat messageChatHeat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageChatHeat.f105id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageChatHeat.actorID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, messageChatHeat.exclusiveChatInviteTime);
            codedOutputByteBufferNano.C(4, messageChatHeat.exclusiveChatInviteExpireTime);
            codedOutputByteBufferNano.C(5, messageChatHeat.exclusiveChatStartTime);
            codedOutputByteBufferNano.C(6, messageChatHeat.exclusiveChatEndTime);
            codedOutputByteBufferNano.G(7, messageChatHeat.exclusiveChatDuration);
        }
    };
    public static JsonAdapter<MessageChatHeat> JSON_ADAPTER = new ObjectJsonAdapter<MessageChatHeat>() { // from class: com.p1.mobile.putong.core.data.MessageChatHeat.2
        public Class getDataClass() {
            return MessageChatHeat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageChatHeat m14182newInstance() {
            return new MessageChatHeat();
        }

        public boolean parseField(MessageChatHeat messageChatHeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "actorID":
                    messageChatHeat.actorID = jsonParser.getValueAsString();
                    return true;
                case "exclusiveChatInviteExpireTime":
                    messageChatHeat.exclusiveChatInviteExpireTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "exclusiveChatInviteTime":
                    messageChatHeat.exclusiveChatInviteTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    messageChatHeat.f105id = jsonParser.getValueAsString();
                    return false;
                case "exclusiveChatDuration":
                    messageChatHeat.exclusiveChatDuration = jsonParser.getValueAsInt();
                    return true;
                case "exclusiveChatStartTime":
                    messageChatHeat.exclusiveChatStartTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "exclusiveChatEndTime":
                    messageChatHeat.exclusiveChatEndTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public void serializeFields(MessageChatHeat messageChatHeat, JsonGenerator jsonGenerator) throws IOException {
            String str = messageChatHeat.f105id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = messageChatHeat.actorID;
            if (str2 != null) {
                jsonGenerator.writeStringField("actorID", str2);
            }
            jsonGenerator.writeFieldName("exclusiveChatInviteTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(messageChatHeat.exclusiveChatInviteTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatInviteExpireTime");
            jsonAdapter.serialize(Double.valueOf(messageChatHeat.exclusiveChatInviteExpireTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatStartTime");
            jsonAdapter.serialize(Double.valueOf(messageChatHeat.exclusiveChatStartTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatEndTime");
            jsonAdapter.serialize(Double.valueOf(messageChatHeat.exclusiveChatEndTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("exclusiveChatDuration", messageChatHeat.exclusiveChatDuration);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageChatHeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageChatHeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageChatHeat new_() {
        MessageChatHeat messageChatHeat = new MessageChatHeat();
        messageChatHeat.nullCheck();
        return messageChatHeat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageChatHeat m14180clone() {
        MessageChatHeat messageChatHeat = new MessageChatHeat();
        messageChatHeat.f105id = this.f105id;
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
        return ValueObject.util_equals(this.f105id, messageChatHeat.f105id) && ValueObject.util_equals(this.actorID, messageChatHeat.actorID) && this.exclusiveChatInviteTime == messageChatHeat.exclusiveChatInviteTime && this.exclusiveChatInviteExpireTime == messageChatHeat.exclusiveChatInviteExpireTime && this.exclusiveChatStartTime == messageChatHeat.exclusiveChatStartTime && this.exclusiveChatEndTime == messageChatHeat.exclusiveChatEndTime && this.exclusiveChatDuration == messageChatHeat.exclusiveChatDuration;
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
        String str = this.f105id;
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
        ((ValueObject) this).hashCode = i6;
        return i6;
    }

    public void nullCheck() {
        if (this.f105id == null) {
            this.f105id = "";
        }
        if (this.actorID == null) {
            this.actorID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
