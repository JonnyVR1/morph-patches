package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.DynamicSchemaMsgData;
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
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class DynamicSchemaMsgData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dynamicschemamsgdata";

    @Nullable
    @ProtobufIndex(index = 8)
    public String action;

    @Nullable
    @ProtobufIndex(index = 6)
    public String cancelRemind;

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String cancelSchema;

    @NonNull
    @ProtobufIndex(index = 11)
    public String eId;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String event;

    @Nullable
    @ProtobufIndex(index = 7)
    public Map<String, String> eventExtra;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String extra;

    @Nullable
    @ProtobufIndex(index = 4)
    public String failRemind;

    @NonNull
    @ProtobufIndex(index = 12)
    public String kId;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 9)
    public String source;

    @NonNull
    @ProtobufIndex(index = 13)
    public String type;

    @Nullable
    @ProtobufIndex(index = 1)
    public MessageView view;
    public static ProtobufAdapter<DynamicSchemaMsgData> PROTOBUF_ADAPTER = new MessageNanoAdapter<DynamicSchemaMsgData>() { // from class: com.p1.mobile.putong.core.data.DynamicSchemaMsgData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DynamicSchemaMsgData dynamicSchemaMsgData) {
            MessageView messageView = dynamicSchemaMsgData.view;
            int iL = messageView != null ? CodedOutputByteBufferNano.l(1, messageView, MessageView.PROTOBUF_ADAPTER) : 0;
            String str = dynamicSchemaMsgData.extra;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = dynamicSchemaMsgData.schema;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = dynamicSchemaMsgData.failRemind;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = dynamicSchemaMsgData.cancelSchema;
            if (str4 != null) {
                iL += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = dynamicSchemaMsgData.cancelRemind;
            if (str5 != null) {
                iL += CodedOutputByteBufferNano.o(6, str5);
            }
            Map<String, String> map = dynamicSchemaMsgData.eventExtra;
            if (map != null) {
                iL += CodedOutputByteBufferNano.l(7, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            String str6 = dynamicSchemaMsgData.action;
            if (str6 != null) {
                iL += CodedOutputByteBufferNano.o(8, str6);
            }
            String str7 = dynamicSchemaMsgData.source;
            if (str7 != null) {
                iL += CodedOutputByteBufferNano.o(9, str7);
            }
            String str8 = dynamicSchemaMsgData.event;
            if (str8 != null) {
                iL += CodedOutputByteBufferNano.o(10, str8);
            }
            String str9 = dynamicSchemaMsgData.eId;
            if (str9 != null) {
                iL += CodedOutputByteBufferNano.o(11, str9);
            }
            String str10 = dynamicSchemaMsgData.kId;
            if (str10 != null) {
                iL += CodedOutputByteBufferNano.o(12, str10);
            }
            String str11 = dynamicSchemaMsgData.type;
            if (str11 != null) {
                iL += CodedOutputByteBufferNano.o(13, str11);
            }
            ((MessageNano) dynamicSchemaMsgData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DynamicSchemaMsgData m12633parse(nb5 nb5Var) throws IOException {
            DynamicSchemaMsgData dynamicSchemaMsgData = new DynamicSchemaMsgData();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (dynamicSchemaMsgData.source == null) {
                            dynamicSchemaMsgData.source = "";
                        }
                        if (dynamicSchemaMsgData.event == null) {
                            dynamicSchemaMsgData.event = "";
                        }
                        if (dynamicSchemaMsgData.eId == null) {
                            dynamicSchemaMsgData.eId = "";
                        }
                        if (dynamicSchemaMsgData.kId == null) {
                            dynamicSchemaMsgData.kId = "";
                        }
                        if (dynamicSchemaMsgData.type == null) {
                            dynamicSchemaMsgData.type = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        dynamicSchemaMsgData.view = (MessageView) nb5Var.l(MessageView.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        dynamicSchemaMsgData.extra = nb5Var.s();
                        continue;
                    case 26:
                        dynamicSchemaMsgData.schema = nb5Var.s();
                        continue;
                    case 34:
                        dynamicSchemaMsgData.failRemind = nb5Var.s();
                        continue;
                    case 42:
                        dynamicSchemaMsgData.cancelSchema = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        dynamicSchemaMsgData.cancelRemind = nb5Var.s();
                        continue;
                    case 58:
                        dynamicSchemaMsgData.eventExtra = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                        continue;
                    case 66:
                        dynamicSchemaMsgData.action = nb5Var.s();
                        continue;
                    case 74:
                        dynamicSchemaMsgData.source = nb5Var.s();
                        continue;
                    case 82:
                        dynamicSchemaMsgData.event = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        dynamicSchemaMsgData.eId = nb5Var.s();
                        continue;
                    case 98:
                        dynamicSchemaMsgData.kId = nb5Var.s();
                        continue;
                    case 106:
                        dynamicSchemaMsgData.type = nb5Var.s();
                        continue;
                    default:
                        if (dynamicSchemaMsgData.source == null) {
                            dynamicSchemaMsgData.source = "";
                        }
                        if (dynamicSchemaMsgData.event == null) {
                            dynamicSchemaMsgData.event = "";
                        }
                        if (dynamicSchemaMsgData.eId == null) {
                            dynamicSchemaMsgData.eId = "";
                        }
                        if (dynamicSchemaMsgData.kId == null) {
                            dynamicSchemaMsgData.kId = "";
                        }
                        if (dynamicSchemaMsgData.type == null) {
                            dynamicSchemaMsgData.type = "";
                            return dynamicSchemaMsgData;
                        }
                        break;
                }
            }
            return dynamicSchemaMsgData;
        }

        public void serialize(DynamicSchemaMsgData dynamicSchemaMsgData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageView messageView = dynamicSchemaMsgData.view;
            if (messageView != null) {
                codedOutputByteBufferNano.K(1, messageView, MessageView.PROTOBUF_ADAPTER);
            }
            String str = dynamicSchemaMsgData.extra;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = dynamicSchemaMsgData.schema;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = dynamicSchemaMsgData.failRemind;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = dynamicSchemaMsgData.cancelSchema;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = dynamicSchemaMsgData.cancelRemind;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            Map<String, String> map = dynamicSchemaMsgData.eventExtra;
            if (map != null) {
                codedOutputByteBufferNano.K(7, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            String str6 = dynamicSchemaMsgData.action;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
            String str7 = dynamicSchemaMsgData.source;
            if (str7 != null) {
                codedOutputByteBufferNano.R(9, str7);
            }
            String str8 = dynamicSchemaMsgData.event;
            if (str8 != null) {
                codedOutputByteBufferNano.R(10, str8);
            }
            String str9 = dynamicSchemaMsgData.eId;
            if (str9 != null) {
                codedOutputByteBufferNano.R(11, str9);
            }
            String str10 = dynamicSchemaMsgData.kId;
            if (str10 != null) {
                codedOutputByteBufferNano.R(12, str10);
            }
            String str11 = dynamicSchemaMsgData.type;
            if (str11 != null) {
                codedOutputByteBufferNano.R(13, str11);
            }
        }
    };
    public static JsonAdapter<DynamicSchemaMsgData> JSON_ADAPTER = new ObjectJsonAdapter<DynamicSchemaMsgData>() { // from class: com.p1.mobile.putong.core.data.DynamicSchemaMsgData.2
        public Class getDataClass() {
            return DynamicSchemaMsgData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DynamicSchemaMsgData m12634newInstance() {
            return new DynamicSchemaMsgData();
        }

        public boolean parseField(DynamicSchemaMsgData dynamicSchemaMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cancelRemind":
                    dynamicSchemaMsgData.cancelRemind = jsonParser.getValueAsString();
                    return true;
                case "cancelSchema":
                    dynamicSchemaMsgData.cancelSchema = jsonParser.getValueAsString();
                    return true;
                case "action":
                    dynamicSchemaMsgData.action = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    dynamicSchemaMsgData.schema = jsonParser.getValueAsString();
                    return true;
                case "source":
                    dynamicSchemaMsgData.source = jsonParser.getValueAsString();
                    return true;
                case "eId":
                    dynamicSchemaMsgData.eId = jsonParser.getValueAsString();
                    return true;
                case "kId":
                    dynamicSchemaMsgData.kId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    dynamicSchemaMsgData.type = jsonParser.getValueAsString();
                    return true;
                case "view":
                    dynamicSchemaMsgData.view = (MessageView) MessageView.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "failRemind":
                    dynamicSchemaMsgData.failRemind = jsonParser.getValueAsString();
                    return true;
                case "event":
                    dynamicSchemaMsgData.event = jsonParser.getValueAsString();
                    return true;
                case "extra":
                    dynamicSchemaMsgData.extra = jsonParser.getValueAsString();
                    return true;
                case "eventExtra":
                    dynamicSchemaMsgData.eventExtra = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DynamicSchemaMsgData dynamicSchemaMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cancelRemind":
                case "cancelSchema":
                case "action":
                case "schema":
                case "source":
                case "eId":
                case "kId":
                case "type":
                case "view":
                case "failRemind":
                case "event":
                case "extra":
                case "eventExtra":
                    return true;
                default:
                    return super.parseFieldCheck(dynamicSchemaMsgData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(DynamicSchemaMsgData dynamicSchemaMsgData, JsonGenerator jsonGenerator) throws IOException {
            if (dynamicSchemaMsgData.view != null) {
                jsonGenerator.writeFieldName("view");
                MessageView.JSON_ADAPTER.serialize(dynamicSchemaMsgData.view, jsonGenerator, true);
            }
            String str = dynamicSchemaMsgData.extra;
            if (str != null) {
                jsonGenerator.writeStringField("extra", str);
            }
            String str2 = dynamicSchemaMsgData.schema;
            if (str2 != null) {
                jsonGenerator.writeStringField("schema", str2);
            }
            String str3 = dynamicSchemaMsgData.failRemind;
            if (str3 != null) {
                jsonGenerator.writeStringField("failRemind", str3);
            }
            String str4 = dynamicSchemaMsgData.cancelSchema;
            if (str4 != null) {
                jsonGenerator.writeStringField("cancelSchema", str4);
            }
            String str5 = dynamicSchemaMsgData.cancelRemind;
            if (str5 != null) {
                jsonGenerator.writeStringField("cancelRemind", str5);
            }
            if (dynamicSchemaMsgData.eventExtra != null) {
                jsonGenerator.writeFieldName("eventExtra");
                JsonAdapter.serializeMap(dynamicSchemaMsgData.eventExtra, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str6 = dynamicSchemaMsgData.action;
            if (str6 != null) {
                jsonGenerator.writeStringField("action", str6);
            }
            String str7 = dynamicSchemaMsgData.source;
            if (str7 != null) {
                jsonGenerator.writeStringField("source", str7);
            }
            String str8 = dynamicSchemaMsgData.event;
            if (str8 != null) {
                jsonGenerator.writeStringField("event", str8);
            }
            String str9 = dynamicSchemaMsgData.eId;
            if (str9 != null) {
                jsonGenerator.writeStringField("eId", str9);
            }
            String str10 = dynamicSchemaMsgData.kId;
            if (str10 != null) {
                jsonGenerator.writeStringField("kId", str10);
            }
            String str11 = dynamicSchemaMsgData.type;
            if (str11 != null) {
                jsonGenerator.writeStringField("type", str11);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DynamicSchemaMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DynamicSchemaMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m310a(String str) {
        return str;
    }

    public static DynamicSchemaMsgData new_() {
        DynamicSchemaMsgData dynamicSchemaMsgData = new DynamicSchemaMsgData();
        dynamicSchemaMsgData.nullCheck();
        return dynamicSchemaMsgData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DynamicSchemaMsgData m12632clone() {
        DynamicSchemaMsgData dynamicSchemaMsgData = new DynamicSchemaMsgData();
        MessageView messageView = this.view;
        if (messageView != null) {
            dynamicSchemaMsgData.view = messageView.m14298clone();
        }
        dynamicSchemaMsgData.extra = this.extra;
        dynamicSchemaMsgData.schema = this.schema;
        dynamicSchemaMsgData.failRemind = this.failRemind;
        dynamicSchemaMsgData.cancelSchema = this.cancelSchema;
        dynamicSchemaMsgData.cancelRemind = this.cancelRemind;
        Map<String, String> map = this.eventExtra;
        if (map != null) {
            dynamicSchemaMsgData.eventExtra = ValueObject.util_map(map, new w9j() { // from class: l.zhe
                public final Object call(Object obj) {
                    return DynamicSchemaMsgData.m310a((String) obj);
                }
            });
        }
        dynamicSchemaMsgData.action = this.action;
        dynamicSchemaMsgData.source = this.source;
        dynamicSchemaMsgData.event = this.event;
        dynamicSchemaMsgData.eId = this.eId;
        dynamicSchemaMsgData.kId = this.kId;
        dynamicSchemaMsgData.type = this.type;
        return dynamicSchemaMsgData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicSchemaMsgData)) {
            return false;
        }
        DynamicSchemaMsgData dynamicSchemaMsgData = (DynamicSchemaMsgData) obj;
        return ValueObject.util_equals(this.view, dynamicSchemaMsgData.view) && ValueObject.util_equals(this.extra, dynamicSchemaMsgData.extra) && ValueObject.util_equals(this.schema, dynamicSchemaMsgData.schema) && ValueObject.util_equals(this.failRemind, dynamicSchemaMsgData.failRemind) && ValueObject.util_equals(this.cancelSchema, dynamicSchemaMsgData.cancelSchema) && ValueObject.util_equals(this.cancelRemind, dynamicSchemaMsgData.cancelRemind) && ValueObject.util_equals(this.eventExtra, dynamicSchemaMsgData.eventExtra) && ValueObject.util_equals(this.action, dynamicSchemaMsgData.action) && ValueObject.util_equals(this.source, dynamicSchemaMsgData.source) && ValueObject.util_equals(this.event, dynamicSchemaMsgData.event) && ValueObject.util_equals(this.eId, dynamicSchemaMsgData.eId) && ValueObject.util_equals(this.kId, dynamicSchemaMsgData.kId) && ValueObject.util_equals(this.type, dynamicSchemaMsgData.type);
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
        MessageView messageView = this.view;
        int iHashCode = (i2 + (messageView != null ? messageView.hashCode() : 0)) * 41;
        String str = this.extra;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.schema;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.failRemind;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.cancelSchema;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.cancelRemind;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        Map<String, String> map = this.eventExtra;
        int iHashCode7 = (iHashCode6 + (map != null ? map.hashCode() : 0)) * 41;
        String str6 = this.action;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.source;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.event;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.eId;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.kId;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.type;
        int iHashCode13 = iHashCode12 + (str11 != null ? str11.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode13;
        return iHashCode13;
    }

    public void nullCheck() {
        if (this.source == null) {
            this.source = "";
        }
        if (this.event == null) {
            this.event = "";
        }
        if (this.eId == null) {
            this.eId = "";
        }
        if (this.kId == null) {
            this.kId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
