package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.PushMessage;
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
import java.util.Collections;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class PushMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushmessage";

    @NonNull
    @ProtobufIndex(index = 11)
    public PushMessageContent content;

    @ProtobufIndex(index = 4)
    public int counter;

    @ProtobufIndex(index = 12)
    public double createdTime;

    @Nullable
    @ProtobufIndex(index = 13)
    public String gid;

    @NonNull
    @ProtobufIndex(index = 5)
    public String intent;

    @ProtobufIndex(index = 19)
    public boolean isShow;

    @Nullable
    @ProtobufIndex(index = 16)
    public String link;

    @ProtobufIndex(index = 18)
    public int longLinkMessageType;

    @NonNull
    @ProtobufIndex(index = 14)
    public PushMessageCustom messageCustom;

    @NonNull
    @ProtobufIndex(index = 21)
    public Map<String, String> messageCustomMap;

    @Nullable
    @ProtobufIndex(index = 10)
    public String primaryPicture;

    @ProtobufIndex(index = 7)
    public int priority;

    @NonNull
    @ProtobufIndex(index = 20)
    public String pushChannel;

    @Nullable
    @ProtobufIndex(index = 17)
    public String pushName;

    @Nullable
    @ProtobufIndex(index = 15)
    public String reqId;

    @ProtobufIndex(index = 9)
    public boolean silent;

    @ProtobufIndex(index = 6)
    public boolean silentAggregation;

    @ProtobufIndex(index = 8)
    public int stackId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String ticker;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public User user;

    @NonNull
    @ProtobufIndex(index = 3)
    public CharSequence value;
    public static ProtobufAdapter<PushMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushMessage>() { // from class: com.p1.mobile.putong.data.PushMessage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PushMessage pushMessage) {
            String str = pushMessage.ticker;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = pushMessage.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            CharSequence charSequence = pushMessage.value;
            if (charSequence != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, charSequence.toString());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(4, pushMessage.counter);
            String str3 = pushMessage.intent;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(6, pushMessage.silentAggregation) + CodedOutputByteBufferNano.m17281h(7, pushMessage.priority) + CodedOutputByteBufferNano.m17281h(8, pushMessage.stackId) + CodedOutputByteBufferNano.m17275b(9, pushMessage.silent);
            String str4 = pushMessage.primaryPicture;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(10, str4);
            }
            PushMessageContent pushMessageContent = pushMessage.content;
            if (pushMessageContent != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(11, pushMessageContent, PushMessageContent.PROTOBUF_ADAPTER);
            }
            int iM17277d = iM17275b + CodedOutputByteBufferNano.m17277d(12, pushMessage.createdTime);
            String str5 = pushMessage.gid;
            if (str5 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(13, str5);
            }
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            if (pushMessageCustom != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(14, pushMessageCustom, PushMessageCustom.PROTOBUF_ADAPTER);
            }
            String str6 = pushMessage.reqId;
            if (str6 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(15, str6);
            }
            String str7 = pushMessage.link;
            if (str7 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(16, str7);
            }
            String str8 = pushMessage.pushName;
            if (str8 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(17, str8);
            }
            int iM17281h2 = iM17277d + CodedOutputByteBufferNano.m17281h(18, pushMessage.longLinkMessageType) + CodedOutputByteBufferNano.m17275b(19, pushMessage.isShow);
            String str9 = pushMessage.pushChannel;
            if (str9 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(20, str9);
            }
            Map<String, String> map = pushMessage.messageCustomMap;
            if (map != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17285l(21, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            pushMessage.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PushMessage parse(nc5 nc5Var) throws IOException {
            PushMessage pushMessage = new PushMessage();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (pushMessage.ticker == null) {
                            pushMessage.ticker = "";
                        }
                        if (pushMessage.title == null) {
                            pushMessage.title = "";
                        }
                        if (pushMessage.value == null) {
                            pushMessage.value = "";
                        }
                        if (pushMessage.intent == null) {
                            pushMessage.intent = "";
                        }
                        if (pushMessage.content == null) {
                            pushMessage.content = PushMessageContent.new_();
                        }
                        if (pushMessage.messageCustom == null) {
                            pushMessage.messageCustom = PushMessageCustom.new_();
                        }
                        if (pushMessage.pushChannel == null) {
                            pushMessage.pushChannel = "";
                        }
                        if (pushMessage.messageCustomMap == null) {
                            pushMessage.messageCustomMap = Collections.EMPTY_MAP;
                        }
                        break;
                    case 10:
                        pushMessage.ticker = nc5Var.m162495s();
                        continue;
                    case 18:
                        pushMessage.title = nc5Var.m162495s();
                        continue;
                    case 26:
                        pushMessage.value = nc5Var.m162495s();
                        continue;
                    case 32:
                        pushMessage.counter = nc5Var.m162486j();
                        continue;
                    case 42:
                        pushMessage.intent = nc5Var.m162495s();
                        continue;
                    case 48:
                        pushMessage.silentAggregation = nc5Var.m162483g();
                        continue;
                    case 56:
                        pushMessage.priority = nc5Var.m162486j();
                        continue;
                    case 64:
                        pushMessage.stackId = nc5Var.m162486j();
                        continue;
                    case 72:
                        pushMessage.silent = nc5Var.m162483g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        pushMessage.primaryPicture = nc5Var.m162495s();
                        continue;
                    case 90:
                        pushMessage.content = (PushMessageContent) nc5Var.m162488l(PushMessageContent.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        pushMessage.createdTime = nc5Var.m162484h();
                        continue;
                    case 106:
                        pushMessage.gid = nc5Var.m162495s();
                        continue;
                    case 114:
                        pushMessage.messageCustom = (PushMessageCustom) nc5Var.m162488l(PushMessageCustom.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        pushMessage.reqId = nc5Var.m162495s();
                        continue;
                    case 130:
                        pushMessage.link = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        pushMessage.pushName = nc5Var.m162495s();
                        continue;
                    case 144:
                        pushMessage.longLinkMessageType = nc5Var.m162486j();
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                        pushMessage.isShow = nc5Var.m162483g();
                        continue;
                    case 162:
                        pushMessage.pushChannel = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        pushMessage.messageCustomMap = (Map) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                        continue;
                    default:
                        if (pushMessage.ticker == null) {
                            pushMessage.ticker = "";
                        }
                        if (pushMessage.title == null) {
                            pushMessage.title = "";
                        }
                        if (pushMessage.value == null) {
                            pushMessage.value = "";
                        }
                        if (pushMessage.intent == null) {
                            pushMessage.intent = "";
                        }
                        if (pushMessage.content == null) {
                            pushMessage.content = PushMessageContent.new_();
                        }
                        if (pushMessage.messageCustom == null) {
                            pushMessage.messageCustom = PushMessageCustom.new_();
                        }
                        if (pushMessage.pushChannel == null) {
                            pushMessage.pushChannel = "";
                        }
                        if (pushMessage.messageCustomMap == null) {
                            pushMessage.messageCustomMap = Collections.EMPTY_MAP;
                            return pushMessage;
                        }
                        break;
                }
            }
            return pushMessage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PushMessage pushMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pushMessage.ticker;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = pushMessage.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            CharSequence charSequence = pushMessage.value;
            if (charSequence != null) {
                codedOutputByteBufferNano.m17316R(3, charSequence.toString());
            }
            codedOutputByteBufferNano.m17305G(4, pushMessage.counter);
            String str3 = pushMessage.intent;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            codedOutputByteBufferNano.m17299A(6, pushMessage.silentAggregation);
            codedOutputByteBufferNano.m17305G(7, pushMessage.priority);
            codedOutputByteBufferNano.m17305G(8, pushMessage.stackId);
            codedOutputByteBufferNano.m17299A(9, pushMessage.silent);
            String str4 = pushMessage.primaryPicture;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(10, str4);
            }
            PushMessageContent pushMessageContent = pushMessage.content;
            if (pushMessageContent != null) {
                codedOutputByteBufferNano.m17309K(11, pushMessageContent, PushMessageContent.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17301C(12, pushMessage.createdTime);
            String str5 = pushMessage.gid;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(13, str5);
            }
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            if (pushMessageCustom != null) {
                codedOutputByteBufferNano.m17309K(14, pushMessageCustom, PushMessageCustom.PROTOBUF_ADAPTER);
            }
            String str6 = pushMessage.reqId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(15, str6);
            }
            String str7 = pushMessage.link;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(16, str7);
            }
            String str8 = pushMessage.pushName;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(17, str8);
            }
            codedOutputByteBufferNano.m17305G(18, pushMessage.longLinkMessageType);
            codedOutputByteBufferNano.m17299A(19, pushMessage.isShow);
            String str9 = pushMessage.pushChannel;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(20, str9);
            }
            Map<String, String> map = pushMessage.messageCustomMap;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(21, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PushMessage> JSON_ADAPTER = new ObjectJsonAdapter<PushMessage>() { // from class: com.p1.mobile.putong.data.PushMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PushMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PushMessage newInstance() {
            return new PushMessage();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(PushMessage pushMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2061336420:
                    if (str.equals("primaryPicture")) {
                        b = 0;
                    }
                    break;
                case -2014177704:
                    if (str.equals("messageCustom")) {
                        b = 1;
                    }
                    break;
                case -1897641533:
                    if (str.equals("stackId")) {
                        b = 2;
                    }
                    break;
                case -1646827157:
                    if (str.equals("longLinkMessageType")) {
                        b = 3;
                    }
                    break;
                case -1183762788:
                    if (str.equals("intent")) {
                        b = 4;
                    }
                    break;
                case -1180125369:
                    if (str.equals("isShow")) {
                        b = 5;
                    }
                    break;
                case -1165461084:
                    if (str.equals("priority")) {
                        b = 6;
                    }
                    break;
                case -902327211:
                    if (str.equals(NotificationCompat.GROUP_KEY_SILENT)) {
                        b = 7;
                    }
                    break;
                case -873960694:
                    if (str.equals("ticker")) {
                        b = 8;
                    }
                    break;
                case -806056034:
                    if (str.equals("messageCustomOrigin")) {
                        b = 9;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 10;
                    }
                    break;
                case 102338:
                    if (str.equals("gid")) {
                        b = 11;
                    }
                    break;
                case 3321850:
                    if (str.equals(Link.TYPE)) {
                        b = 12;
                    }
                    break;
                case 108401241:
                    if (str.equals("reqId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 14;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 15;
                    }
                    break;
                case 656086153:
                    if (str.equals("pushChannel")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = 17;
                    }
                    break;
                case 957830652:
                    if (str.equals(Counter.TYPE)) {
                        b = 18;
                    }
                    break;
                case 1418863437:
                    if (str.equals("silentAggregation")) {
                        b = 19;
                    }
                    break;
                case 1775796421:
                    if (str.equals("pushName")) {
                        b = 20;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    pushMessage.primaryPicture = jsonParser.getValueAsString();
                    return true;
                case 1:
                    pushMessage.messageCustomMap = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case 2:
                    pushMessage.stackId = jsonParser.getValueAsInt();
                    return true;
                case 3:
                    pushMessage.longLinkMessageType = jsonParser.getValueAsInt();
                    return true;
                case 4:
                    pushMessage.intent = jsonParser.getValueAsString();
                    return true;
                case 5:
                    pushMessage.isShow = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    pushMessage.priority = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    pushMessage.silent = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    pushMessage.ticker = jsonParser.getValueAsString();
                    return true;
                case 9:
                    pushMessage.messageCustom = PushMessageCustom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    pushMessage.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 11:
                    pushMessage.gid = jsonParser.getValueAsString();
                    return true;
                case 12:
                    pushMessage.link = jsonParser.getValueAsString();
                    return true;
                case 13:
                    pushMessage.reqId = jsonParser.getValueAsString();
                    return true;
                case 14:
                    pushMessage.title = jsonParser.getValueAsString();
                    return true;
                case 15:
                    pushMessage.value = jsonParser.getValueAsString();
                    return true;
                case 16:
                    pushMessage.pushChannel = jsonParser.getValueAsString();
                    return true;
                case 17:
                    pushMessage.content = PushMessageContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    pushMessage.counter = jsonParser.getValueAsInt();
                    return true;
                case 19:
                    pushMessage.silentAggregation = jsonParser.getValueAsBoolean();
                    return true;
                case 20:
                    pushMessage.pushName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(PushMessage pushMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2061336420:
                    if (str.equals("primaryPicture")) {
                        b = 0;
                    }
                    break;
                case -2014177704:
                    if (str.equals("messageCustom")) {
                        b = 1;
                    }
                    break;
                case -1897641533:
                    if (str.equals("stackId")) {
                        b = 2;
                    }
                    break;
                case -1646827157:
                    if (str.equals("longLinkMessageType")) {
                        b = 3;
                    }
                    break;
                case -1183762788:
                    if (str.equals("intent")) {
                        b = 4;
                    }
                    break;
                case -1180125369:
                    if (str.equals("isShow")) {
                        b = 5;
                    }
                    break;
                case -1165461084:
                    if (str.equals("priority")) {
                        b = 6;
                    }
                    break;
                case -902327211:
                    if (str.equals(NotificationCompat.GROUP_KEY_SILENT)) {
                        b = 7;
                    }
                    break;
                case -873960694:
                    if (str.equals("ticker")) {
                        b = 8;
                    }
                    break;
                case -806056034:
                    if (str.equals("messageCustomOrigin")) {
                        b = 9;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 10;
                    }
                    break;
                case 102338:
                    if (str.equals("gid")) {
                        b = 11;
                    }
                    break;
                case 3321850:
                    if (str.equals(Link.TYPE)) {
                        b = 12;
                    }
                    break;
                case 108401241:
                    if (str.equals("reqId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 14;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 15;
                    }
                    break;
                case 656086153:
                    if (str.equals("pushChannel")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = 17;
                    }
                    break;
                case 957830652:
                    if (str.equals(Counter.TYPE)) {
                        b = 18;
                    }
                    break;
                case 1418863437:
                    if (str.equals("silentAggregation")) {
                        b = 19;
                    }
                    break;
                case 1775796421:
                    if (str.equals("pushName")) {
                        b = 20;
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
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    return true;
                default:
                    return super.parseFieldCheck(pushMessage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PushMessage pushMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = pushMessage.ticker;
            if (str != null) {
                jsonGenerator.writeStringField("ticker", str);
            }
            String str2 = pushMessage.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            CharSequence charSequence = pushMessage.value;
            if (charSequence != null) {
                jsonGenerator.writeStringField("value", charSequence.toString());
            }
            jsonGenerator.writeNumberField(Counter.TYPE, pushMessage.counter);
            String str3 = pushMessage.intent;
            if (str3 != null) {
                jsonGenerator.writeStringField("intent", str3);
            }
            jsonGenerator.writeBooleanField("silentAggregation", pushMessage.silentAggregation);
            jsonGenerator.writeNumberField("priority", pushMessage.priority);
            jsonGenerator.writeNumberField("stackId", pushMessage.stackId);
            jsonGenerator.writeBooleanField(NotificationCompat.GROUP_KEY_SILENT, pushMessage.silent);
            String str4 = pushMessage.primaryPicture;
            if (str4 != null) {
                jsonGenerator.writeStringField("primaryPicture", str4);
            }
            if (pushMessage.content != null) {
                jsonGenerator.writeFieldName("content");
                PushMessageContent.JSON_ADAPTER.serialize(pushMessage.content, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(pushMessage.createdTime), jsonGenerator, true);
            String str5 = pushMessage.gid;
            if (str5 != null) {
                jsonGenerator.writeStringField("gid", str5);
            }
            if (pushMessage.messageCustom != null) {
                jsonGenerator.writeFieldName("messageCustomOrigin");
                PushMessageCustom.JSON_ADAPTER.serialize(pushMessage.messageCustom, jsonGenerator, true);
            }
            String str6 = pushMessage.reqId;
            if (str6 != null) {
                jsonGenerator.writeStringField("reqId", str6);
            }
            String str7 = pushMessage.link;
            if (str7 != null) {
                jsonGenerator.writeStringField(Link.TYPE, str7);
            }
            String str8 = pushMessage.pushName;
            if (str8 != null) {
                jsonGenerator.writeStringField("pushName", str8);
            }
            jsonGenerator.writeNumberField("longLinkMessageType", pushMessage.longLinkMessageType);
            jsonGenerator.writeBooleanField("isShow", pushMessage.isShow);
            String str9 = pushMessage.pushChannel;
            if (str9 != null) {
                jsonGenerator.writeStringField("pushChannel", str9);
            }
            if (pushMessage.messageCustomMap != null) {
                jsonGenerator.writeFieldName("messageCustom");
                JsonAdapter.serializeMap(pushMessage.messageCustomMap, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public boolean isNewUiCustom = false;
    public boolean isGroup = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61238a(String str) {
        return str;
    }

    public static PushMessage new_() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.nullCheck();
        return pushMessage;
    }

    public PushMessage checkCustomOrigin() {
        Map<String, String> map;
        String json = new Gson().toJson(this.messageCustomMap);
        if (PushMessageCustom.new_().equals(this.messageCustom) && !TextUtils.isEmpty(json) && (map = this.messageCustomMap) != null && !map.isEmpty()) {
            try {
                this.messageCustom = PushMessageCustom.JSON_ADAPTER.parse(json);
                return this;
            } catch (IOException unused) {
                this.messageCustom = PushMessageCustom.new_();
            }
        }
        return this;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PushMessage mo225055clone() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.ticker = this.ticker;
        pushMessage.title = this.title;
        pushMessage.value = this.value;
        pushMessage.counter = this.counter;
        pushMessage.intent = this.intent;
        pushMessage.silentAggregation = this.silentAggregation;
        pushMessage.priority = this.priority;
        pushMessage.stackId = this.stackId;
        pushMessage.silent = this.silent;
        pushMessage.primaryPicture = this.primaryPicture;
        PushMessageContent pushMessageContent = this.content;
        if (pushMessageContent != null) {
            pushMessage.content = pushMessageContent.mo225055clone();
        }
        pushMessage.createdTime = this.createdTime;
        pushMessage.gid = this.gid;
        PushMessageCustom pushMessageCustom = this.messageCustom;
        if (pushMessageCustom != null) {
            pushMessage.messageCustom = pushMessageCustom.mo225055clone();
        }
        pushMessage.reqId = this.reqId;
        pushMessage.link = this.link;
        pushMessage.pushName = this.pushName;
        pushMessage.longLinkMessageType = this.longLinkMessageType;
        pushMessage.isShow = this.isShow;
        pushMessage.pushChannel = this.pushChannel;
        Map<String, String> map = this.messageCustomMap;
        if (map != null) {
            pushMessage.messageCustomMap = ValueObject.util_map(map, new qcj() { // from class: l.pmb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PushMessage.m61238a((String) obj);
                }
            });
        }
        return pushMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushMessage)) {
            return false;
        }
        PushMessage pushMessage = (PushMessage) obj;
        return ValueObject.util_equals(this.ticker, pushMessage.ticker) && ValueObject.util_equals(this.title, pushMessage.title) && ValueObject.util_equals(this.value, pushMessage.value) && this.counter == pushMessage.counter && ValueObject.util_equals(this.intent, pushMessage.intent) && this.silentAggregation == pushMessage.silentAggregation && this.priority == pushMessage.priority && this.stackId == pushMessage.stackId && this.silent == pushMessage.silent && ValueObject.util_equals(this.primaryPicture, pushMessage.primaryPicture) && ValueObject.util_equals(this.content, pushMessage.content) && this.createdTime == pushMessage.createdTime && ValueObject.util_equals(this.gid, pushMessage.gid) && ValueObject.util_equals(this.messageCustom, pushMessage.messageCustom) && ValueObject.util_equals(this.reqId, pushMessage.reqId) && ValueObject.util_equals(this.link, pushMessage.link) && ValueObject.util_equals(this.pushName, pushMessage.pushName) && this.longLinkMessageType == pushMessage.longLinkMessageType && this.isShow == pushMessage.isShow && ValueObject.util_equals(this.pushChannel, pushMessage.pushChannel) && ValueObject.util_equals(this.messageCustomMap, pushMessage.messageCustomMap);
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
        String str = this.ticker;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        CharSequence charSequence = this.value;
        int iHashCode3 = (((iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 41) + this.counter) * 41;
        String str3 = this.intent;
        int iHashCode4 = (((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.silentAggregation ? 1231 : 1237)) * 41) + this.priority) * 41) + this.stackId) * 41) + (this.silent ? 1231 : 1237)) * 41;
        String str4 = this.primaryPicture;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        PushMessageContent pushMessageContent = this.content;
        int iHashCode6 = pushMessageContent != null ? pushMessageContent.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str5 = this.gid;
        int iHashCode7 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 41;
        PushMessageCustom pushMessageCustom = this.messageCustom;
        int iHashCode8 = (iHashCode7 + (pushMessageCustom != null ? pushMessageCustom.hashCode() : 0)) * 41;
        String str6 = this.reqId;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.link;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.pushName;
        int iHashCode11 = (((((iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 41) + this.longLinkMessageType) * 41) + (this.isShow ? 1231 : 1237)) * 41;
        String str9 = this.pushChannel;
        int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 41;
        Map<String, String> map = this.messageCustomMap;
        int iHashCode13 = iHashCode12 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ticker == null) {
            this.ticker = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.intent == null) {
            this.intent = "";
        }
        if (this.content == null) {
            this.content = PushMessageContent.new_();
        }
        if (this.messageCustom == null) {
            this.messageCustom = PushMessageCustom.new_();
        }
        if (this.pushChannel == null) {
            this.pushChannel = "";
        }
        if (this.messageCustomMap == null) {
            this.messageCustomMap = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
