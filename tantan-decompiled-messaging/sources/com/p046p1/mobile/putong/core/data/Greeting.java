package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
import com.p046p1.mobile.putong.data.Owner;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
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
    public String f20401id;

    @NonNull
    @ProtobufIndex(index = 10)
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
    public int f20402mm;

    @NonNull
    @ProtobufIndex(index = 14)
    public IdBoxed moment;

    @NonNull
    @ProtobufIndex(index = 3)
    public String otherUser;

    @NonNull
    @ProtobufIndex(index = 2)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 5)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Greeting greeting) {
            String str = greeting.f20401id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = greeting.owner;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = greeting.otherUser;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            GreetingMessages greetingMessages = greeting.messages;
            if (greetingMessages != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, greetingMessages, GreetingMessages.PROTOBUF_ADAPTER);
            }
            String str4 = greeting.readUntil;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = greeting.status;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            String str6 = greeting.actorUserId;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str6);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(8, greeting.f20402mm) + CodedOutputByteBufferNano.m17226h(9, greeting.userMessageCount);
            IdBoxed idBoxed = greeting.kankan;
            if (idBoxed != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(10, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            int iM17222d = iM17226h + CodedOutputByteBufferNano.m17222d(11, greeting.createdTime) + CodedOutputByteBufferNano.m17222d(12, greeting.latestTime) + CodedOutputByteBufferNano.m17222d(13, greeting.updatedTime);
            IdBoxed idBoxed2 = greeting.moment;
            if (idBoxed2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(14, idBoxed2, IdBoxed.PROTOBUF_ADAPTER);
            }
            Channel channel = greeting.channel;
            if (channel != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(15, channel, Channel.PROTOBUF_ADAPTER);
            }
            String str7 = greeting.clearedUntil;
            if (str7 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(16, str7);
            }
            int iM17222d2 = iM17222d + CodedOutputByteBufferNano.m17222d(17, greeting.clearedTime) + CodedOutputByteBufferNano.m17220b(18, greeting.localIsUnread);
            greeting.cachedSize = iM17222d2;
            return iM17222d2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Greeting parse(nb5 nb5Var) throws IOException {
            Greeting greeting = new Greeting();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (greeting.f20401id == null) {
                            greeting.f20401id = "";
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
                            greeting.channel = (Channel) Channel.JSON_ADAPTER.defaultEnum();
                        }
                        if (greeting.clearedUntil == null) {
                            greeting.clearedUntil = "";
                        }
                        break;
                    case 10:
                        greeting.f20401id = nb5Var.m158750s();
                        continue;
                    case 18:
                        greeting.owner = nb5Var.m158750s();
                        continue;
                    case 26:
                        greeting.otherUser = nb5Var.m158750s();
                        continue;
                    case 34:
                        greeting.messages = (GreetingMessages) nb5Var.m158743l(GreetingMessages.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        greeting.readUntil = nb5Var.m158750s();
                        continue;
                    case 50:
                        greeting.status = nb5Var.m158750s();
                        continue;
                    case 58:
                        greeting.actorUserId = nb5Var.m158750s();
                        continue;
                    case 64:
                        greeting.f20402mm = nb5Var.m158741j();
                        continue;
                    case 72:
                        greeting.userMessageCount = nb5Var.m158741j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        greeting.kankan = (IdBoxed) nb5Var.m158743l(IdBoxed.PROTOBUF_ADAPTER);
                        continue;
                    case 89:
                        greeting.createdTime = nb5Var.m158739h();
                        continue;
                    case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        greeting.latestTime = nb5Var.m158739h();
                        continue;
                    case 105:
                        greeting.updatedTime = nb5Var.m158739h();
                        continue;
                    case 114:
                        greeting.moment = (IdBoxed) nb5Var.m158743l(IdBoxed.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        greeting.channel = (Channel) nb5Var.m158743l(Channel.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        greeting.clearedUntil = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                        greeting.clearedTime = nb5Var.m158739h();
                        continue;
                    case 144:
                        greeting.localIsUnread = nb5Var.m158738g();
                        continue;
                    default:
                        if (greeting.f20401id == null) {
                            greeting.f20401id = "";
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
                            greeting.channel = (Channel) Channel.JSON_ADAPTER.defaultEnum();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Greeting greeting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greeting.f20401id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = greeting.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = greeting.otherUser;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            GreetingMessages greetingMessages = greeting.messages;
            if (greetingMessages != null) {
                codedOutputByteBufferNano.m17254K(4, greetingMessages, GreetingMessages.PROTOBUF_ADAPTER);
            }
            String str4 = greeting.readUntil;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = greeting.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            String str6 = greeting.actorUserId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(7, str6);
            }
            codedOutputByteBufferNano.m17250G(8, greeting.f20402mm);
            codedOutputByteBufferNano.m17250G(9, greeting.userMessageCount);
            IdBoxed idBoxed = greeting.kankan;
            if (idBoxed != null) {
                codedOutputByteBufferNano.m17254K(10, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17246C(11, greeting.createdTime);
            codedOutputByteBufferNano.m17246C(12, greeting.latestTime);
            codedOutputByteBufferNano.m17246C(13, greeting.updatedTime);
            IdBoxed idBoxed2 = greeting.moment;
            if (idBoxed2 != null) {
                codedOutputByteBufferNano.m17254K(14, idBoxed2, IdBoxed.PROTOBUF_ADAPTER);
            }
            Channel channel = greeting.channel;
            if (channel != null) {
                codedOutputByteBufferNano.m17254K(15, channel, Channel.PROTOBUF_ADAPTER);
            }
            String str7 = greeting.clearedUntil;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(16, str7);
            }
            codedOutputByteBufferNano.m17246C(17, greeting.clearedTime);
            codedOutputByteBufferNano.m17244A(18, greeting.localIsUnread);
        }
    };
    public static JsonAdapter<Greeting> JSON_ADAPTER = new ObjectJsonAdapter<Greeting>() { // from class: com.p1.mobile.putong.core.data.Greeting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Greeting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Greeting newInstance() {
            return new Greeting();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Greeting greeting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2085931853:
                    if (str.equals("userMessageCount")) {
                        b = 0;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 1;
                    }
                    break;
                case -1138683648:
                    if (str.equals("kankan")) {
                        b = 2;
                    }
                    break;
                case -1122843800:
                    if (str.equals("readUntil")) {
                        b = 3;
                    }
                    break;
                case -1085836135:
                    if (str.equals("clearedTime")) {
                        b = 4;
                    }
                    break;
                case -1068531200:
                    if (str.equals("moment")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 7;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 8;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 9;
                    }
                    break;
                case -124830988:
                    if (str.equals("latestTime")) {
                        b = 10;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 11;
                    }
                    break;
                case 3488:
                    if (str.equals("mm")) {
                        b = 12;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 699897618:
                    if (str.equals("clearedUntil")) {
                        b = 14;
                    }
                    break;
                case 738950403:
                    if (str.equals("channel")) {
                        b = 15;
                    }
                    break;
                case 1120516251:
                    if (str.equals("actorUserId")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    greeting.userMessageCount = jsonParser.getValueAsInt();
                    return true;
                case 1:
                    greeting.otherUser = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 2:
                    greeting.kankan = IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    greeting.readUntil = jsonParser.getValueAsString();
                    return true;
                case 4:
                    greeting.clearedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 5:
                    greeting.moment = IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    greeting.status = jsonParser.getValueAsString();
                    return true;
                case 7:
                    greeting.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 8:
                    greeting.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 9:
                    greeting.messages = GreetingMessages.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    greeting.latestTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 11:
                    greeting.f20401id = jsonParser.getValueAsString();
                    return false;
                case 12:
                    greeting.f20402mm = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    greeting.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 14:
                    greeting.clearedUntil = jsonParser.getValueAsString();
                    return true;
                case 15:
                    greeting.channel = Channel.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 16:
                    greeting.actorUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Greeting greeting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2085931853:
                    if (str.equals("userMessageCount")) {
                        b = 0;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 1;
                    }
                    break;
                case -1138683648:
                    if (str.equals("kankan")) {
                        b = 2;
                    }
                    break;
                case -1122843800:
                    if (str.equals("readUntil")) {
                        b = 3;
                    }
                    break;
                case -1085836135:
                    if (str.equals("clearedTime")) {
                        b = 4;
                    }
                    break;
                case -1068531200:
                    if (str.equals("moment")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 7;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 8;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 9;
                    }
                    break;
                case -124830988:
                    if (str.equals("latestTime")) {
                        b = 10;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 11;
                    }
                    break;
                case 3488:
                    if (str.equals("mm")) {
                        b = 12;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 699897618:
                    if (str.equals("clearedUntil")) {
                        b = 14;
                    }
                    break;
                case 738950403:
                    if (str.equals("channel")) {
                        b = 15;
                    }
                    break;
                case 1120516251:
                    if (str.equals("actorUserId")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return true;
                case 11:
                    return false;
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return super.parseFieldCheck(greeting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Greeting greeting, JsonGenerator jsonGenerator) throws IOException {
            String str = greeting.f20401id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (greeting.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
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
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str3);
            }
            String str4 = greeting.actorUserId;
            if (str4 != null) {
                jsonGenerator.writeStringField("actorUserId", str4);
            }
            jsonGenerator.writeNumberField("mm", greeting.f20402mm);
            jsonGenerator.writeNumberField("userMessageCount", greeting.userMessageCount);
            if (greeting.kankan != null) {
                jsonGenerator.writeFieldName("kankan");
                IdBoxed.JSON_ADAPTER.serialize(greeting.kankan, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(greeting.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("latestTime");
            jsonAdapter.serialize(Double.valueOf(greeting.latestTime), jsonGenerator, true);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Greeting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Greeting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Greeting new_() {
        Greeting greeting = new Greeting();
        greeting.nullCheck();
        return greeting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Greeting mo223809clone() {
        Greeting greeting = new Greeting();
        greeting.f20401id = this.f20401id;
        greeting.owner = this.owner;
        greeting.otherUser = this.otherUser;
        GreetingMessages greetingMessages = this.messages;
        if (greetingMessages != null) {
            greeting.messages = greetingMessages.mo223809clone();
        }
        greeting.readUntil = this.readUntil;
        greeting.status = this.status;
        greeting.actorUserId = this.actorUserId;
        greeting.f20402mm = this.f20402mm;
        greeting.userMessageCount = this.userMessageCount;
        IdBoxed idBoxed = this.kankan;
        if (idBoxed != null) {
            greeting.kankan = idBoxed.mo223809clone();
        }
        greeting.createdTime = this.createdTime;
        greeting.latestTime = this.latestTime;
        greeting.updatedTime = this.updatedTime;
        IdBoxed idBoxed2 = this.moment;
        if (idBoxed2 != null) {
            greeting.moment = idBoxed2.mo223809clone();
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
        return ValueObject.util_equals(this.f20401id, greeting.f20401id) && ValueObject.util_equals(this.owner, greeting.owner) && ValueObject.util_equals(this.otherUser, greeting.otherUser) && ValueObject.util_equals(this.messages, greeting.messages) && ValueObject.util_equals(this.readUntil, greeting.readUntil) && ValueObject.util_equals(this.status, greeting.status) && ValueObject.util_equals(this.actorUserId, greeting.actorUserId) && this.f20402mm == greeting.f20402mm && this.userMessageCount == greeting.userMessageCount && ValueObject.util_equals(this.kankan, greeting.kankan) && this.createdTime == greeting.createdTime && this.latestTime == greeting.latestTime && this.updatedTime == greeting.updatedTime && ValueObject.util_equals(this.moment, greeting.moment) && ValueObject.util_equals(this.channel, greeting.channel) && ValueObject.util_equals(this.clearedUntil, greeting.clearedUntil) && this.clearedTime == greeting.clearedTime && this.localIsUnread == greeting.localIsUnread;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "greeting";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f20401id;
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
        int iHashCode7 = (((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.f20402mm) * 41) + this.userMessageCount) * 41;
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
        this.hashCode = i6;
        return i6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20401id == null) {
            this.f20401id = "";
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
            this.channel = (Channel) Channel.JSON_ADAPTER.defaultEnum();
        }
        if (this.clearedUntil == null) {
            this.clearedUntil = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
