package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TriggerEvent triggerEvent) {
            String str = triggerEvent.eventID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            TriggerProperty triggerProperty = triggerEvent.properties;
            if (triggerProperty != null) {
                iO += CodedOutputByteBufferNano.l(2, triggerProperty, TriggerProperty.PROTOBUF_ADAPTER);
            }
            String str2 = triggerEvent.dsl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) triggerEvent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TriggerEvent m19118parse(nb5 nb5Var) throws IOException {
            TriggerEvent triggerEvent = new TriggerEvent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    triggerEvent.eventID = nb5Var.s();
                } else if (iU == 18) {
                    triggerEvent.properties = (TriggerProperty) nb5Var.l(TriggerProperty.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
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
                    triggerEvent.dsl = nb5Var.s();
                }
            }
            return triggerEvent;
        }

        public void serialize(TriggerEvent triggerEvent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = triggerEvent.eventID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            TriggerProperty triggerProperty = triggerEvent.properties;
            if (triggerProperty != null) {
                codedOutputByteBufferNano.K(2, triggerProperty, TriggerProperty.PROTOBUF_ADAPTER);
            }
            String str2 = triggerEvent.dsl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<TriggerEvent> JSON_ADAPTER = new ObjectJsonAdapter<TriggerEvent>() { // from class: com.p1.mobile.putong.data.TriggerEvent.2
        public Class getDataClass() {
            return TriggerEvent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TriggerEvent mo17830newInstance() {
            return new TriggerEvent();
        }

        public boolean parseField(TriggerEvent triggerEvent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "eventID":
                    triggerEvent.eventID = jsonParser.getValueAsString();
                    return true;
                case "properties":
                    triggerEvent.properties = (TriggerProperty) TriggerProperty.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerEvent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerEvent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TriggerEvent new_() {
        TriggerEvent triggerEvent = new TriggerEvent();
        triggerEvent.nullCheck();
        return triggerEvent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TriggerEvent m19117clone() {
        TriggerEvent triggerEvent = new TriggerEvent();
        triggerEvent.eventID = this.eventID;
        TriggerProperty triggerProperty = this.properties;
        if (triggerProperty != null) {
            triggerEvent.properties = triggerProperty.m19120clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
