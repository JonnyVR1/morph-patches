package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class TriggerEvent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "triggerevent";

    @NonNull
    @ProtobufIndex(index = 3)
    public String dsl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String eventID;

    @NonNull
    @ProtobufIndex(index = 2)
    public TriggerProperty properties;
    public static ProtobufAdapter<TriggerEvent> PROTOBUF_ADAPTER = new MessageNanoAdapter<TriggerEvent>() { // from class: com.p1.mobile.putong.data.TriggerEvent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TriggerEvent triggerEvent) {
            String str = triggerEvent.eventID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            TriggerProperty triggerProperty = triggerEvent.properties;
            if (triggerProperty != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, triggerProperty, TriggerProperty.PROTOBUF_ADAPTER);
            }
            String str2 = triggerEvent.dsl;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            triggerEvent.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TriggerEvent parse(nc5 nc5Var) throws IOException {
            TriggerEvent triggerEvent = new TriggerEvent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (triggerEvent.eventID == null) {
                        triggerEvent.eventID = "";
                    }
                    if (triggerEvent.properties == null) {
                        triggerEvent.properties = TriggerProperty.new_();
                    }
                    if (triggerEvent.dsl != null) {
                        break;
                    }
                    triggerEvent.dsl = "";
                    break;
                }
                if (iM162497u == 10) {
                    triggerEvent.eventID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    triggerEvent.properties = (TriggerProperty) nc5Var.m162488l(TriggerProperty.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
                        if (triggerEvent.eventID == null) {
                            triggerEvent.eventID = "";
                        }
                        if (triggerEvent.properties == null) {
                            triggerEvent.properties = TriggerProperty.new_();
                        }
                        if (triggerEvent.dsl != null) {
                            break;
                        }
                        triggerEvent.dsl = "";
                        return triggerEvent;
                    }
                    triggerEvent.dsl = nc5Var.m162495s();
                }
            }
            return triggerEvent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TriggerEvent triggerEvent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = triggerEvent.eventID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            TriggerProperty triggerProperty = triggerEvent.properties;
            if (triggerProperty != null) {
                codedOutputByteBufferNano.m17309K(2, triggerProperty, TriggerProperty.PROTOBUF_ADAPTER);
            }
            String str2 = triggerEvent.dsl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<TriggerEvent> JSON_ADAPTER = new ObjectJsonAdapter<TriggerEvent>() { // from class: com.p1.mobile.putong.data.TriggerEvent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TriggerEvent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TriggerEvent newInstance() {
            return new TriggerEvent();
        }

        public boolean parseField(TriggerEvent triggerEvent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "eventID":
                    triggerEvent.eventID = jsonParser.getValueAsString();
                    return true;
                case "properties":
                    triggerEvent.properties = TriggerProperty.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "dsl":
                    triggerEvent.dsl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TriggerEvent triggerEvent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "eventID":
                case "properties":
                case "dsl":
                    return true;
                default:
                    return super.parseFieldCheck(triggerEvent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TriggerEvent triggerEvent, JsonGenerator jsonGenerator) throws IOException {
            String str = triggerEvent.eventID;
            if (str != null) {
                jsonGenerator.writeStringField("eventID", str);
            }
            if (triggerEvent.properties != null) {
                jsonGenerator.writeFieldName("properties");
                TriggerProperty.JSON_ADAPTER.serialize(triggerEvent.properties, jsonGenerator, true);
            }
            String str2 = triggerEvent.dsl;
            if (str2 != null) {
                jsonGenerator.writeStringField("dsl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerEvent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerEvent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TriggerEvent new_() {
        TriggerEvent triggerEvent = new TriggerEvent();
        triggerEvent.nullCheck();
        return triggerEvent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TriggerEvent mo225055clone() {
        TriggerEvent triggerEvent = new TriggerEvent();
        triggerEvent.eventID = this.eventID;
        TriggerProperty triggerProperty = this.properties;
        if (triggerProperty != null) {
            triggerEvent.properties = triggerProperty.mo225055clone();
        }
        triggerEvent.dsl = this.dsl;
        return triggerEvent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggerEvent)) {
            return false;
        }
        TriggerEvent triggerEvent = (TriggerEvent) obj;
        return ValueObject.util_equals(this.eventID, triggerEvent.eventID) && ValueObject.util_equals(this.properties, triggerEvent.properties) && ValueObject.util_equals(this.dsl, triggerEvent.dsl);
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
        String str = this.eventID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        TriggerProperty triggerProperty = this.properties;
        int iHashCode2 = (iHashCode + (triggerProperty != null ? triggerProperty.hashCode() : 0)) * 41;
        String str2 = this.dsl;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.eventID == null) {
            this.eventID = "";
        }
        if (this.properties == null) {
            this.properties = TriggerProperty.new_();
        }
        if (this.dsl == null) {
            this.dsl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
