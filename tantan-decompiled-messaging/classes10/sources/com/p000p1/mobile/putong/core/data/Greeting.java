package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.IdBoxed;
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
public class Greeting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greeting";

    @NonNull
    @ProtobufIndex(index = 7)
    public String actorUserId;

    @NonNull
    @ProtobufIndex(index = 15)
    public Channel channel;

    @ProtobufIndex(index = 17)
    public double clearedTime;

    @NonNull
    @ProtobufIndex(index = 16)
    public String clearedUntil;

    @ProtobufIndex(index = 11)
    public double createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f63id;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public IdBoxed kankan;

    @ProtobufIndex(index = 12)
    public double latestTime;

    @ProtobufIndex(index = 18)
    public boolean localIsUnread;

    @NonNull
    @ProtobufIndex(index = 4)
    public GreetingMessages messages;

    /* JADX INFO: renamed from: mm */
    @ProtobufIndex(index = 8)
    public int f64mm;

    @NonNull
    @ProtobufIndex(index = 14)
    public IdBoxed moment;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String otherUser;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String owner;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String readUntil;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;

    @ProtobufIndex(index = 13)
    public double updatedTime;

    @ProtobufIndex(index = 9)
    public int userMessageCount;
    public static ProtobufAdapter<Greeting> PROTOBUF_ADAPTER = new MessageNanoAdapter<Greeting>() { // from class: com.p1.mobile.putong.core.data.Greeting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Greeting greeting) {
            String str = greeting.f63id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = greeting.owner;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = greeting.otherUser;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            GreetingMessages greetingMessages = greeting.messages;
            if (greetingMessages != null) {
                iO += CodedOutputByteBufferNano.l(4, greetingMessages, GreetingMessages.PROTOBUF_ADAPTER);
            }
            String str4 = greeting.readUntil;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = greeting.status;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            String str6 = greeting.actorUserId;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(7, str6);
            }
            int iH = iO + CodedOutputByteBufferNano.h(8, greeting.f64mm) + CodedOutputByteBufferNano.h(9, greeting.userMessageCount);
            IdBoxed idBoxed = greeting.kankan;
            if (idBoxed != null) {
                iH += CodedOutputByteBufferNano.l(10, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            int iD = iH + CodedOutputByteBufferNano.d(11, greeting.createdTime) + CodedOutputByteBufferNano.d(12, greeting.latestTime) + CodedOutputByteBufferNano.d(13, greeting.updatedTime);
            IdBoxed idBoxed2 = greeting.moment;
            if (idBoxed2 != null) {
                iD += CodedOutputByteBufferNano.l(14, idBoxed2, IdBoxed.PROTOBUF_ADAPTER);
            }
            Channel channel = greeting.channel;
            if (channel != null) {
                iD += CodedOutputByteBufferNano.l(15, channel, Channel.PROTOBUF_ADAPTER);
            }
            String str7 = greeting.clearedUntil;
            if (str7 != null) {
                iD += CodedOutputByteBufferNano.o(16, str7);
            }
            int iD2 = iD + CodedOutputByteBufferNano.d(17, greeting.clearedTime) + CodedOutputByteBufferNano.b(18, greeting.localIsUnread);
            ((MessageNano) greeting).cachedSize = iD2;
            return iD2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Greeting m13013parse(nb5 nb5Var) throws IOException {
            Greeting greeting = new Greeting();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (greeting.f63id == null) {
                            greeting.f63id = "";
                        }
                        if (greeting.owner == null) {
                            greeting.owner = "";
                        }
                        if (greeting.otherUser == null) {
                            greeting.otherUser = "";
                        }
                        if (greeting.messages == null) {
                            greeting.messages = GreetingMessages.new_();
                        }
                        if (greeting.readUntil == null) {
                            greeting.readUntil = "";
                        }
                        if (greeting.status == null) {
                            greeting.status = "";
                        }
                        if (greeting.actorUserId == null) {
                            greeting.actorUserId = "";
                        }
                        if (greeting.kankan == null) {
                            greeting.kankan = IdBoxed.new_();
                        }
                        if (greeting.moment == null) {
                            greeting.moment = IdBoxed.new_();
                        }
                        if (greeting.channel == null) {
                            greeting.channel = Channel.JSON_ADAPTER.defaultEnum();
                        }
                        if (greeting.clearedUntil == null) {
                            greeting.clearedUntil = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        greeting.f63id = nb5Var.s();
                        continue;
                    case 18:
                        greeting.owner = nb5Var.s();
                        continue;
                    case 26:
                        greeting.otherUser = nb5Var.s();
                        continue;
                    case 34:
                        greeting.messages = (GreetingMessages) nb5Var.l(GreetingMessages.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        greeting.readUntil = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        greeting.status = nb5Var.s();
                        continue;
                    case 58:
                        greeting.actorUserId = nb5Var.s();
                        continue;
                    case 64:
                        greeting.f64mm = nb5Var.j();
                        continue;
                    case 72:
                        greeting.userMessageCount = nb5Var.j();
                        continue;
                    case 82:
                        greeting.kankan = (IdBoxed) nb5Var.l(IdBoxed.PROTOBUF_ADAPTER);
                        continue;
                    case 89:
                        greeting.createdTime = nb5Var.h();
                        continue;
                    case 97:
                        greeting.latestTime = nb5Var.h();
                        continue;
                    case 105:
                        greeting.updatedTime = nb5Var.h();
                        continue;
                    case 114:
                        greeting.moment = (IdBoxed) nb5Var.l(IdBoxed.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        greeting.channel = (Channel) nb5Var.l(Channel.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        greeting.clearedUntil = nb5Var.s();
                        continue;
                    case 137:
                        greeting.clearedTime = nb5Var.h();
                        continue;
                    case 144:
                        greeting.localIsUnread = nb5Var.g();
                        continue;
                    default:
                        if (greeting.f63id == null) {
                            greeting.f63id = "";
                        }
                        if (greeting.owner == null) {
                            greeting.owner = "";
                        }
                        if (greeting.otherUser == null) {
                            greeting.otherUser = "";
                        }
                        if (greeting.messages == null) {
                            greeting.messages = GreetingMessages.new_();
                        }
                        if (greeting.readUntil == null) {
                            greeting.readUntil = "";
                        }
                        if (greeting.status == null) {
                            greeting.status = "";
                        }
                        if (greeting.actorUserId == null) {
                            greeting.actorUserId = "";
                        }
                        if (greeting.kankan == null) {
                            greeting.kankan = IdBoxed.new_();
                        }
                        if (greeting.moment == null) {
                            greeting.moment = IdBoxed.new_();
                        }
                        if (greeting.channel == null) {
                            greeting.channel = Channel.JSON_ADAPTER.defaultEnum();
                        }
                        if (greeting.clearedUntil == null) {
                            greeting.clearedUntil = "";
                            return greeting;
                        }
                        break;
                }
            }
            return greeting;
        }

        public void serialize(Greeting greeting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greeting.f63id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = greeting.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = greeting.otherUser;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            GreetingMessages greetingMessages = greeting.messages;
            if (greetingMessages != null) {
                codedOutputByteBufferNano.K(4, greetingMessages, GreetingMessages.PROTOBUF_ADAPTER);
            }
            String str4 = greeting.readUntil;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = greeting.status;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            String str6 = greeting.actorUserId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(7, str6);
            }
            codedOutputByteBufferNano.G(8, greeting.f64mm);
            codedOutputByteBufferNano.G(9, greeting.userMessageCount);
            IdBoxed idBoxed = greeting.kankan;
            if (idBoxed != null) {
                codedOutputByteBufferNano.K(10, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(11, greeting.createdTime);
            codedOutputByteBufferNano.C(12, greeting.latestTime);
            codedOutputByteBufferNano.C(13, greeting.updatedTime);
            IdBoxed idBoxed2 = greeting.moment;
            if (idBoxed2 != null) {
                codedOutputByteBufferNano.K(14, idBoxed2, IdBoxed.PROTOBUF_ADAPTER);
            }
            Channel channel = greeting.channel;
            if (channel != null) {
                codedOutputByteBufferNano.K(15, channel, Channel.PROTOBUF_ADAPTER);
            }
            String str7 = greeting.clearedUntil;
            if (str7 != null) {
                codedOutputByteBufferNano.R(16, str7);
            }
            codedOutputByteBufferNano.C(17, greeting.clearedTime);
            codedOutputByteBufferNano.A(18, greeting.localIsUnread);
        }
    };
    public static JsonAdapter<Greeting> JSON_ADAPTER = new ObjectJsonAdapter<Greeting>() { // from class: com.p1.mobile.putong.core.data.Greeting.2
        public Class getDataClass() {
            return Greeting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Greeting m13014newInstance() {
            return new Greeting();
        }

        public boolean parseField(Greeting greeting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userMessageCount":
                    greeting.userMessageCount = jsonParser.getValueAsInt();
                    return true;
                case "otherUser":
                    greeting.otherUser = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "kankan":
                    greeting.kankan = (IdBoxed) IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "readUntil":
                    greeting.readUntil = jsonParser.getValueAsString();
                    return true;
                case "clearedTime":
                    greeting.clearedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "moment":
                    greeting.moment = (IdBoxed) IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    greeting.status = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    greeting.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "createdTime":
                    greeting.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "messages":
                    greeting.messages = (GreetingMessages) GreetingMessages.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "latestTime":
                    greeting.latestTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    greeting.f63id = jsonParser.getValueAsString();
                    return false;
                case "mm":
                    greeting.f64mm = jsonParser.getValueAsInt();
                    return true;
                case "owner":
                    greeting.owner = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "clearedUntil":
                    greeting.clearedUntil = jsonParser.getValueAsString();
                    return true;
                case "channel":
                    greeting.channel = (Channel) Channel.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "actorUserId":
                    greeting.actorUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Greeting greeting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userMessageCount":
                case "otherUser":
                case "kankan":
                case "readUntil":
                case "clearedTime":
                case "moment":
                case "status":
                case "updatedTime":
                case "createdTime":
                case "messages":
                case "latestTime":
                    return true;
                case "id":
                    return false;
                case "mm":
                case "owner":
                case "clearedUntil":
                case "channel":
                case "actorUserId":
                    return true;
                default:
                    return super.parseFieldCheck(greeting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Greeting greeting, JsonGenerator jsonGenerator) throws IOException {
            String str = greeting.f63id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (greeting.owner != null) {
                jsonGenerator.writeFieldName("owner");
                Converter.USER_ID.serialize(greeting.owner, jsonGenerator, true);
            }
            if (greeting.otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                Converter.USER_ID.serialize(greeting.otherUser, jsonGenerator, true);
            }
            if (greeting.messages != null) {
                jsonGenerator.writeFieldName("messages");
                GreetingMessages.JSON_ADAPTER.serialize(greeting.messages, jsonGenerator, true);
            }
            String str2 = greeting.readUntil;
            if (str2 != null) {
                jsonGenerator.writeStringField("readUntil", str2);
            }
            String str3 = greeting.status;
            if (str3 != null) {
                jsonGenerator.writeStringField("status", str3);
            }
            String str4 = greeting.actorUserId;
            if (str4 != null) {
                jsonGenerator.writeStringField("actorUserId", str4);
            }
            jsonGenerator.writeNumberField("mm", greeting.f64mm);
            jsonGenerator.writeNumberField("userMessageCount", greeting.userMessageCount);
            if (greeting.kankan != null) {
                jsonGenerator.writeFieldName("kankan");
                IdBoxed.JSON_ADAPTER.serialize(greeting.kankan, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(greeting.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("latestTime");
            jsonAdapter.serialize(Double.valueOf(greeting.latestTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("updatedTime");
            jsonAdapter.serialize(Double.valueOf(greeting.updatedTime), jsonGenerator, true);
            if (greeting.moment != null) {
                jsonGenerator.writeFieldName("moment");
                IdBoxed.JSON_ADAPTER.serialize(greeting.moment, jsonGenerator, true);
            }
            if (greeting.channel != null) {
                jsonGenerator.writeFieldName("channel");
                Channel.JSON_ADAPTER.serialize(greeting.channel, jsonGenerator, true);
            }
            String str5 = greeting.clearedUntil;
            if (str5 != null) {
                jsonGenerator.writeStringField("clearedUntil", str5);
            }
            jsonGenerator.writeFieldName("clearedTime");
            jsonAdapter.serialize(Double.valueOf(greeting.clearedTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Greeting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Greeting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Greeting new_() {
        Greeting greeting = new Greeting();
        greeting.nullCheck();
        return greeting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Greeting m13012clone() {
        Greeting greeting = new Greeting();
        greeting.f63id = this.f63id;
        greeting.owner = this.owner;
        greeting.otherUser = this.otherUser;
        GreetingMessages greetingMessages = this.messages;
        if (greetingMessages != null) {
            greeting.messages = greetingMessages.m13036clone();
        }
        greeting.readUntil = this.readUntil;
        greeting.status = this.status;
        greeting.actorUserId = this.actorUserId;
        greeting.f64mm = this.f64mm;
        greeting.userMessageCount = this.userMessageCount;
        IdBoxed idBoxed = this.kankan;
        if (idBoxed != null) {
            greeting.kankan = idBoxed.clone();
        }
        greeting.createdTime = this.createdTime;
        greeting.latestTime = this.latestTime;
        greeting.updatedTime = this.updatedTime;
        IdBoxed idBoxed2 = this.moment;
        if (idBoxed2 != null) {
            greeting.moment = idBoxed2.clone();
        }
        greeting.channel = this.channel;
        greeting.clearedUntil = this.clearedUntil;
        greeting.clearedTime = this.clearedTime;
        greeting.localIsUnread = this.localIsUnread;
        return greeting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Greeting)) {
            return false;
        }
        Greeting greeting = (Greeting) obj;
        return ValueObject.util_equals(this.f63id, greeting.f63id) && ValueObject.util_equals(this.owner, greeting.owner) && ValueObject.util_equals(this.otherUser, greeting.otherUser) && ValueObject.util_equals(this.messages, greeting.messages) && ValueObject.util_equals(this.readUntil, greeting.readUntil) && ValueObject.util_equals(this.status, greeting.status) && ValueObject.util_equals(this.actorUserId, greeting.actorUserId) && this.f64mm == greeting.f64mm && this.userMessageCount == greeting.userMessageCount && ValueObject.util_equals(this.kankan, greeting.kankan) && this.createdTime == greeting.createdTime && this.latestTime == greeting.latestTime && this.updatedTime == greeting.updatedTime && ValueObject.util_equals(this.moment, greeting.moment) && ValueObject.util_equals(this.channel, greeting.channel) && ValueObject.util_equals(this.clearedUntil, greeting.clearedUntil) && this.clearedTime == greeting.clearedTime && this.localIsUnread == greeting.localIsUnread;
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
        String str = this.f63id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.owner;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherUser;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        GreetingMessages greetingMessages = this.messages;
        int iHashCode4 = (iHashCode3 + (greetingMessages != null ? greetingMessages.hashCode() : 0)) * 41;
        String str4 = this.readUntil;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.actorUserId;
        int iHashCode7 = (((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.f64mm) * 41) + this.userMessageCount) * 41;
        IdBoxed idBoxed = this.kankan;
        int iHashCode8 = idBoxed != null ? idBoxed.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode7 + iHashCode8) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.latestTime);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.updatedTime);
        int i5 = ((i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        IdBoxed idBoxed2 = this.moment;
        int iHashCode9 = (i5 + (idBoxed2 != null ? idBoxed2.hashCode() : 0)) * 41;
        Channel channel = this.channel;
        int iHashCode10 = (iHashCode9 + (channel != null ? channel.hashCode() : 0)) * 41;
        String str7 = this.clearedUntil;
        int iHashCode11 = iHashCode10 + (str7 != null ? str7.hashCode() : 0);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.clearedTime);
        int i6 = (((iHashCode11 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41) + (this.localIsUnread ? 1231 : 1237);
        ((ValueObject) this).hashCode = i6;
        return i6;
    }

    public void nullCheck() {
        if (this.f63id == null) {
            this.f63id = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.otherUser == null) {
            this.otherUser = "";
        }
        if (this.messages == null) {
            this.messages = GreetingMessages.new_();
        }
        if (this.readUntil == null) {
            this.readUntil = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.actorUserId == null) {
            this.actorUserId = "";
        }
        if (this.kankan == null) {
            this.kankan = IdBoxed.new_();
        }
        if (this.moment == null) {
            this.moment = IdBoxed.new_();
        }
        if (this.channel == null) {
            this.channel = Channel.JSON_ADAPTER.defaultEnum();
        }
        if (this.clearedUntil == null) {
            this.clearedUntil = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
