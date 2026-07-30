package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.TriggerParams;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class TriggerParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "triggerparams";

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> buttons;

    @ProtobufIndex(index = 7)
    public int count;

    @NonNull
    @ProtobufIndex(index = 6)
    public String direction;

    @ProtobufIndex(index = 2)
    public long position;

    @ProtobufIndex(index = 4)
    public int rangeInterval;

    @ProtobufIndex(index = 3)
    public int rangeStartPosition;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<TriggerParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<TriggerParams>() { // from class: com.p1.mobile.putong.core.data.TriggerParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TriggerParams triggerParams) {
            String str = triggerParams.type;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, triggerParams.position) + CodedOutputByteBufferNano.m17226h(3, triggerParams.rangeStartPosition) + CodedOutputByteBufferNano.m17226h(4, triggerParams.rangeInterval);
            List<String> list = triggerParams.buttons;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = triggerParams.direction;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(7, triggerParams.count);
            triggerParams.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TriggerParams parse(nb5 nb5Var) throws IOException {
            TriggerParams triggerParams = new TriggerParams();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    triggerParams.type = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    triggerParams.position = nb5Var.m158742k();
                } else if (iM158752u == 24) {
                    triggerParams.rangeStartPosition = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    triggerParams.rangeInterval = nb5Var.m158741j();
                } else if (iM158752u == 42) {
                    triggerParams.buttons = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 50) {
                    triggerParams.direction = nb5Var.m158750s();
                } else {
                    if (iM158752u != 56) {
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
                    triggerParams.count = nb5Var.m158741j();
                }
            }
            return triggerParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TriggerParams triggerParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = triggerParams.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, triggerParams.position);
            codedOutputByteBufferNano.m17250G(3, triggerParams.rangeStartPosition);
            codedOutputByteBufferNano.m17250G(4, triggerParams.rangeInterval);
            List<String> list = triggerParams.buttons;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = triggerParams.direction;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(6, str2);
            }
            codedOutputByteBufferNano.m17250G(7, triggerParams.count);
        }
    };
    public static JsonAdapter<TriggerParams> JSON_ADAPTER = new ObjectJsonAdapter<TriggerParams>() { // from class: com.p1.mobile.putong.core.data.TriggerParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TriggerParams.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TriggerParams newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TriggerParams triggerParams, JsonGenerator jsonGenerator) throws IOException {
            String str = triggerParams.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeNumberField("position", triggerParams.position);
            jsonGenerator.writeNumberField("rangeStartPosition", triggerParams.rangeStartPosition);
            jsonGenerator.writeNumberField("rangeInterval", triggerParams.rangeInterval);
            if (triggerParams.buttons != null) {
                jsonGenerator.writeFieldName(Constants.KEY_BUTTONS);
                JsonAdapter.serializeArray(triggerParams.buttons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = triggerParams.direction;
            if (str2 != null) {
                jsonGenerator.writeStringField("direction", str2);
            }
            jsonGenerator.writeNumberField("count", triggerParams.count);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35885a(String str) {
        return str;
    }

    public static TriggerParams new_() {
        TriggerParams triggerParams = new TriggerParams();
        triggerParams.nullCheck();
        return triggerParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TriggerParams mo223809clone() {
        TriggerParams triggerParams = new TriggerParams();
        triggerParams.type = this.type;
        triggerParams.position = this.position;
        triggerParams.rangeStartPosition = this.rangeStartPosition;
        triggerParams.rangeInterval = this.rangeInterval;
        List<String> list = this.buttons;
        if (list != null) {
            triggerParams.buttons = ValueObject.util_map(list, new w9j() { // from class: l.taj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TriggerParams.m35885a((String) obj);
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
        String str = this.type;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.position;
        int i3 = (((((((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.rangeStartPosition) * 41) + this.rangeInterval) * 41;
        List<String> list = this.buttons;
        int iHashCode2 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.direction;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.count;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
