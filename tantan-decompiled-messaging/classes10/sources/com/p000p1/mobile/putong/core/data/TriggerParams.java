package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.TriggerParams;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class TriggerParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "triggerparams";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<String> buttons;

    @ProtobufIndex(index = 7)
    public int count;

    @NonNull
    @ProtobufIndex(index = 6)
    public String direction;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long position;

    @ProtobufIndex(index = 4)
    public int rangeInterval;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int rangeStartPosition;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<TriggerParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<TriggerParams>() { // from class: com.p1.mobile.putong.core.data.TriggerParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TriggerParams triggerParams) {
            String str = triggerParams.type;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, triggerParams.position) + CodedOutputByteBufferNano.h(3, triggerParams.rangeStartPosition) + CodedOutputByteBufferNano.h(4, triggerParams.rangeInterval);
            List<String> list = triggerParams.buttons;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = triggerParams.direction;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(6, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(7, triggerParams.count);
            ((MessageNano) triggerParams).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TriggerParams m16048parse(nb5 nb5Var) throws IOException {
            TriggerParams triggerParams = new TriggerParams();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (triggerParams.type == null) {
                        triggerParams.type = "";
                    }
                    if (triggerParams.buttons == null) {
                        triggerParams.buttons = new ArrayList();
                    }
                    if (triggerParams.direction != null) {
                        break;
                    }
                    triggerParams.direction = "";
                    break;
                }
                if (iU == 10) {
                    triggerParams.type = nb5Var.s();
                } else if (iU == 16) {
                    triggerParams.position = nb5Var.k();
                } else if (iU == 24) {
                    triggerParams.rangeStartPosition = nb5Var.j();
                } else if (iU == 32) {
                    triggerParams.rangeInterval = nb5Var.j();
                } else if (iU == 42) {
                    triggerParams.buttons = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 50) {
                    triggerParams.direction = nb5Var.s();
                } else {
                    if (iU != 56) {
                        if (triggerParams.type == null) {
                            triggerParams.type = "";
                        }
                        if (triggerParams.buttons == null) {
                            triggerParams.buttons = new ArrayList();
                        }
                        if (triggerParams.direction != null) {
                            break;
                        }
                        triggerParams.direction = "";
                        return triggerParams;
                    }
                    triggerParams.count = nb5Var.j();
                }
            }
            return triggerParams;
        }

        public void serialize(TriggerParams triggerParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = triggerParams.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, triggerParams.position);
            codedOutputByteBufferNano.G(3, triggerParams.rangeStartPosition);
            codedOutputByteBufferNano.G(4, triggerParams.rangeInterval);
            List<String> list = triggerParams.buttons;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = triggerParams.direction;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
            codedOutputByteBufferNano.G(7, triggerParams.count);
        }
    };
    public static JsonAdapter<TriggerParams> JSON_ADAPTER = new ObjectJsonAdapter<TriggerParams>() { // from class: com.p1.mobile.putong.core.data.TriggerParams.2
        public Class getDataClass() {
            return TriggerParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TriggerParams m16049newInstance() {
            return new TriggerParams();
        }

        public boolean parseField(TriggerParams triggerParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "rangeStartPosition":
                    triggerParams.rangeStartPosition = jsonParser.getValueAsInt();
                    return true;
                case "direction":
                    triggerParams.direction = jsonParser.getValueAsString();
                    return true;
                case "type":
                    triggerParams.type = jsonParser.getValueAsString();
                    return true;
                case "count":
                    triggerParams.count = jsonParser.getValueAsInt();
                    return true;
                case "rangeInterval":
                    triggerParams.rangeInterval = jsonParser.getValueAsInt();
                    return true;
                case "buttons":
                    triggerParams.buttons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "position":
                    triggerParams.position = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TriggerParams triggerParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "rangeStartPosition":
                case "direction":
                case "type":
                case "count":
                case "rangeInterval":
                case "buttons":
                case "position":
                    return true;
                default:
                    return super.parseFieldCheck(triggerParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TriggerParams triggerParams, JsonGenerator jsonGenerator) throws IOException {
            String str = triggerParams.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeNumberField("position", triggerParams.position);
            jsonGenerator.writeNumberField("rangeStartPosition", triggerParams.rangeStartPosition);
            jsonGenerator.writeNumberField("rangeInterval", triggerParams.rangeInterval);
            if (triggerParams.buttons != null) {
                jsonGenerator.writeFieldName("buttons");
                JsonAdapter.serializeArray(triggerParams.buttons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = triggerParams.direction;
            if (str2 != null) {
                jsonGenerator.writeStringField("direction", str2);
            }
            jsonGenerator.writeNumberField("count", triggerParams.count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m687a(String str) {
        return str;
    }

    public static TriggerParams new_() {
        TriggerParams triggerParams = new TriggerParams();
        triggerParams.nullCheck();
        return triggerParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TriggerParams m16047clone() {
        TriggerParams triggerParams = new TriggerParams();
        triggerParams.type = this.type;
        triggerParams.position = this.position;
        triggerParams.rangeStartPosition = this.rangeStartPosition;
        triggerParams.rangeInterval = this.rangeInterval;
        List<String> list = this.buttons;
        if (list != null) {
            triggerParams.buttons = ValueObject.util_map(list, new w9j() { // from class: l.taj0
                public final Object call(Object obj) {
                    return TriggerParams.m687a((String) obj);
                }
            });
        }
        triggerParams.direction = this.direction;
        triggerParams.count = this.count;
        return triggerParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggerParams)) {
            return false;
        }
        TriggerParams triggerParams = (TriggerParams) obj;
        return ValueObject.util_equals(this.type, triggerParams.type) && this.position == triggerParams.position && this.rangeStartPosition == triggerParams.rangeStartPosition && this.rangeInterval == triggerParams.rangeInterval && ValueObject.util_equals(this.buttons, triggerParams.buttons) && ValueObject.util_equals(this.direction, triggerParams.direction) && this.count == triggerParams.count;
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
        String str = this.type;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.position;
        int i3 = (((((((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.rangeStartPosition) * 41) + this.rangeInterval) * 41;
        List<String> list = this.buttons;
        int iHashCode2 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.direction;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.count;
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.buttons == null) {
            this.buttons = new ArrayList();
        }
        if (this.direction == null) {
            this.direction = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
