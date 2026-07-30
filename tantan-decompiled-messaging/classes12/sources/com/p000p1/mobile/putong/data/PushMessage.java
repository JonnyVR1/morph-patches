package com.p000p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.PushMessage;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PushMessage pushMessage) {
            String str = pushMessage.ticker;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = pushMessage.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            CharSequence charSequence = pushMessage.value;
            if (charSequence != null) {
                iO += CodedOutputByteBufferNano.o(3, charSequence.toString());
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, pushMessage.counter);
            String str3 = pushMessage.intent;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            int iB = iH + CodedOutputByteBufferNano.b(6, pushMessage.silentAggregation) + CodedOutputByteBufferNano.h(7, pushMessage.priority) + CodedOutputByteBufferNano.h(8, pushMessage.stackId) + CodedOutputByteBufferNano.b(9, pushMessage.silent);
            String str4 = pushMessage.primaryPicture;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(10, str4);
            }
            PushMessageContent pushMessageContent = pushMessage.content;
            if (pushMessageContent != null) {
                iB += CodedOutputByteBufferNano.l(11, pushMessageContent, PushMessageContent.PROTOBUF_ADAPTER);
            }
            int iD = iB + CodedOutputByteBufferNano.d(12, pushMessage.createdTime);
            String str5 = pushMessage.gid;
            if (str5 != null) {
                iD += CodedOutputByteBufferNano.o(13, str5);
            }
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            if (pushMessageCustom != null) {
                iD += CodedOutputByteBufferNano.l(14, pushMessageCustom, PushMessageCustom.PROTOBUF_ADAPTER);
            }
            String str6 = pushMessage.reqId;
            if (str6 != null) {
                iD += CodedOutputByteBufferNano.o(15, str6);
            }
            String str7 = pushMessage.link;
            if (str7 != null) {
                iD += CodedOutputByteBufferNano.o(16, str7);
            }
            String str8 = pushMessage.pushName;
            if (str8 != null) {
                iD += CodedOutputByteBufferNano.o(17, str8);
            }
            int iH2 = iD + CodedOutputByteBufferNano.h(18, pushMessage.longLinkMessageType) + CodedOutputByteBufferNano.b(19, pushMessage.isShow);
            String str9 = pushMessage.pushChannel;
            if (str9 != null) {
                iH2 += CodedOutputByteBufferNano.o(20, str9);
            }
            Map<String, String> map = pushMessage.messageCustomMap;
            if (map != null) {
                iH2 += CodedOutputByteBufferNano.l(21, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            ((MessageNano) pushMessage).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PushMessage m18860parse(nb5 nb5Var) throws IOException {
            PushMessage pushMessage = new PushMessage();
            while (true) {
                switch (nb5Var.u()) {
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
                        pushMessage.ticker = nb5Var.s();
                        continue;
                    case 18:
                        pushMessage.title = nb5Var.s();
                        continue;
                    case 26:
                        pushMessage.value = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        pushMessage.counter = nb5Var.j();
                        continue;
                    case 42:
                        pushMessage.intent = nb5Var.s();
                        continue;
                    case 48:
                        pushMessage.silentAggregation = nb5Var.g();
                        continue;
                    case 56:
                        pushMessage.priority = nb5Var.j();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        pushMessage.stackId = nb5Var.j();
                        continue;
                    case 72:
                        pushMessage.silent = nb5Var.g();
                        continue;
                    case 82:
                        pushMessage.primaryPicture = nb5Var.s();
                        continue;
                    case 90:
                        pushMessage.content = (PushMessageContent) nb5Var.l(PushMessageContent.PROTOBUF_ADAPTER);
                        continue;
                    case 97:
                        pushMessage.createdTime = nb5Var.h();
                        continue;
                    case 106:
                        pushMessage.gid = nb5Var.s();
                        continue;
                    case 114:
                        pushMessage.messageCustom = (PushMessageCustom) nb5Var.l(PushMessageCustom.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        pushMessage.reqId = nb5Var.s();
                        continue;
                    case 130:
                        pushMessage.link = nb5Var.s();
                        continue;
                    case 138:
                        pushMessage.pushName = nb5Var.s();
                        continue;
                    case 144:
                        pushMessage.longLinkMessageType = nb5Var.j();
                        continue;
                    case 152:
                        pushMessage.isShow = nb5Var.g();
                        continue;
                    case 162:
                        pushMessage.pushChannel = nb5Var.s();
                        continue;
                    case 170:
                        pushMessage.messageCustomMap = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
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

        public void serialize(PushMessage pushMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pushMessage.ticker;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = pushMessage.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            CharSequence charSequence = pushMessage.value;
            if (charSequence != null) {
                codedOutputByteBufferNano.R(3, charSequence.toString());
            }
            codedOutputByteBufferNano.G(4, pushMessage.counter);
            String str3 = pushMessage.intent;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            codedOutputByteBufferNano.A(6, pushMessage.silentAggregation);
            codedOutputByteBufferNano.G(7, pushMessage.priority);
            codedOutputByteBufferNano.G(8, pushMessage.stackId);
            codedOutputByteBufferNano.A(9, pushMessage.silent);
            String str4 = pushMessage.primaryPicture;
            if (str4 != null) {
                codedOutputByteBufferNano.R(10, str4);
            }
            PushMessageContent pushMessageContent = pushMessage.content;
            if (pushMessageContent != null) {
                codedOutputByteBufferNano.K(11, pushMessageContent, PushMessageContent.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(12, pushMessage.createdTime);
            String str5 = pushMessage.gid;
            if (str5 != null) {
                codedOutputByteBufferNano.R(13, str5);
            }
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            if (pushMessageCustom != null) {
                codedOutputByteBufferNano.K(14, pushMessageCustom, PushMessageCustom.PROTOBUF_ADAPTER);
            }
            String str6 = pushMessage.reqId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(15, str6);
            }
            String str7 = pushMessage.link;
            if (str7 != null) {
                codedOutputByteBufferNano.R(16, str7);
            }
            String str8 = pushMessage.pushName;
            if (str8 != null) {
                codedOutputByteBufferNano.R(17, str8);
            }
            codedOutputByteBufferNano.G(18, pushMessage.longLinkMessageType);
            codedOutputByteBufferNano.A(19, pushMessage.isShow);
            String str9 = pushMessage.pushChannel;
            if (str9 != null) {
                codedOutputByteBufferNano.R(20, str9);
            }
            Map<String, String> map = pushMessage.messageCustomMap;
            if (map != null) {
                codedOutputByteBufferNano.K(21, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PushMessage> JSON_ADAPTER = new ObjectJsonAdapter<PushMessage>() { // from class: com.p1.mobile.putong.data.PushMessage.2
        public Class getDataClass() {
            return PushMessage.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PushMessage mo17830newInstance() {
            return new PushMessage();
        }

        public boolean parseField(PushMessage pushMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "primaryPicture":
                    pushMessage.primaryPicture = jsonParser.getValueAsString();
                    return true;
                case "messageCustom":
                    pushMessage.messageCustomMap = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case "stackId":
                    pushMessage.stackId = jsonParser.getValueAsInt();
                    return true;
                case "longLinkMessageType":
                    pushMessage.longLinkMessageType = jsonParser.getValueAsInt();
                    return true;
                case "intent":
                    pushMessage.intent = jsonParser.getValueAsString();
                    return true;
                case "isShow":
                    pushMessage.isShow = jsonParser.getValueAsBoolean();
                    return true;
                case "priority":
                    pushMessage.priority = jsonParser.getValueAsInt();
                    return true;
                case "silent":
                    pushMessage.silent = jsonParser.getValueAsBoolean();
                    return true;
                case "ticker":
                    pushMessage.ticker = jsonParser.getValueAsString();
                    return true;
                case "messageCustomOrigin":
                    pushMessage.messageCustom = (PushMessageCustom) PushMessageCustom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "createdTime":
                    pushMessage.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "gid":
                    pushMessage.gid = jsonParser.getValueAsString();
                    return true;
                case "link":
                    pushMessage.link = jsonParser.getValueAsString();
                    return true;
                case "reqId":
                    pushMessage.reqId = jsonParser.getValueAsString();
                    return true;
                case "title":
                    pushMessage.title = jsonParser.getValueAsString();
                    return true;
                case "value":
                    pushMessage.value = jsonParser.getValueAsString();
                    return true;
                case "pushChannel":
                    pushMessage.pushChannel = jsonParser.getValueAsString();
                    return true;
                case "content":
                    pushMessage.content = (PushMessageContent) PushMessageContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "counter":
                    pushMessage.counter = jsonParser.getValueAsInt();
                    return true;
                case "silentAggregation":
                    pushMessage.silentAggregation = jsonParser.getValueAsBoolean();
                    return true;
                case "pushName":
                    pushMessage.pushName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PushMessage pushMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "primaryPicture":
                case "messageCustom":
                case "stackId":
                case "longLinkMessageType":
                case "intent":
                case "isShow":
                case "priority":
                case "silent":
                case "ticker":
                case "messageCustomOrigin":
                case "createdTime":
                case "gid":
                case "link":
                case "reqId":
                case "title":
                case "value":
                case "pushChannel":
                case "content":
                case "counter":
                case "silentAggregation":
                case "pushName":
                    return true;
                default:
                    return super.parseFieldCheck(pushMessage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            jsonGenerator.writeBooleanField("silent", pushMessage.silent);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public boolean isNewUiCustom = false;
    public boolean isGroup = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m972a(String str) {
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
                this.messageCustom = (PushMessageCustom) PushMessageCustom.JSON_ADAPTER.parse(json);
                return this;
            } catch (IOException unused) {
                this.messageCustom = PushMessageCustom.new_();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PushMessage m18859clone() {
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
            pushMessage.content = pushMessageContent.m18862clone();
        }
        pushMessage.createdTime = this.createdTime;
        pushMessage.gid = this.gid;
        PushMessageCustom pushMessageCustom = this.messageCustom;
        if (pushMessageCustom != null) {
            pushMessage.messageCustom = pushMessageCustom.m18865clone();
        }
        pushMessage.reqId = this.reqId;
        pushMessage.link = this.link;
        pushMessage.pushName = this.pushName;
        pushMessage.longLinkMessageType = this.longLinkMessageType;
        pushMessage.isShow = this.isShow;
        pushMessage.pushChannel = this.pushChannel;
        Map<String, String> map = this.messageCustomMap;
        if (map != null) {
            pushMessage.messageCustomMap = ValueObject.util_map(map, new w9j() { // from class: l.leb0
                public final Object call(Object obj) {
                    return PushMessage.m972a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode13;
        return iHashCode13;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
