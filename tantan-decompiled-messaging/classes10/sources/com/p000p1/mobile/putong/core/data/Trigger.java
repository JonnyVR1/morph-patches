package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class Trigger extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "trigger";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public TriggerParams params;

    @NonNull
    @ProtobufIndex(index = 1)
    public String triggerKey;
    public static ProtobufAdapter<Trigger> PROTOBUF_ADAPTER = new MessageNanoAdapter<Trigger>() { // from class: com.p1.mobile.putong.core.data.Trigger.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Trigger trigger) {
            String str = trigger.triggerKey;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            TriggerParams triggerParams = trigger.params;
            if (triggerParams != null) {
                iO += CodedOutputByteBufferNano.l(2, triggerParams, TriggerParams.PROTOBUF_ADAPTER);
            }
            ((MessageNano) trigger).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Trigger m16040parse(nb5 nb5Var) throws IOException {
            Trigger trigger = new Trigger();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (trigger.triggerKey == null) {
                        trigger.triggerKey = "";
                    }
                    if (trigger.params != null) {
                        break;
                    }
                    trigger.params = TriggerParams.new_();
                    break;
                }
                if (iU == 10) {
                    trigger.triggerKey = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (trigger.triggerKey == null) {
                            trigger.triggerKey = "";
                        }
                        if (trigger.params != null) {
                            break;
                        }
                        trigger.params = TriggerParams.new_();
                        return trigger;
                    }
                    trigger.params = (TriggerParams) nb5Var.l(TriggerParams.PROTOBUF_ADAPTER);
                }
            }
            return trigger;
        }

        public void serialize(Trigger trigger, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = trigger.triggerKey;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            TriggerParams triggerParams = trigger.params;
            if (triggerParams != null) {
                codedOutputByteBufferNano.K(2, triggerParams, TriggerParams.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Trigger> JSON_ADAPTER = new ObjectJsonAdapter<Trigger>() { // from class: com.p1.mobile.putong.core.data.Trigger.2
        public Class getDataClass() {
            return Trigger.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Trigger m16041newInstance() {
            return new Trigger();
        }

        public boolean parseField(Trigger trigger, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("params")) {
                trigger.params = (TriggerParams) TriggerParams.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("triggerKey")) {
                return false;
            }
            trigger.triggerKey = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Trigger trigger, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("params") || str.equals("triggerKey")) {
                return true;
            }
            return super.parseFieldCheck(trigger, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Trigger trigger, JsonGenerator jsonGenerator) throws IOException {
            String str = trigger.triggerKey;
            if (str != null) {
                jsonGenerator.writeStringField("triggerKey", str);
            }
            if (trigger.params != null) {
                jsonGenerator.writeFieldName("params");
                TriggerParams.JSON_ADAPTER.serialize(trigger.params, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Trigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Trigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Trigger new_() {
        Trigger trigger = new Trigger();
        trigger.nullCheck();
        return trigger;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Trigger m16039clone() {
        Trigger trigger = new Trigger();
        trigger.triggerKey = this.triggerKey;
        TriggerParams triggerParams = this.params;
        if (triggerParams != null) {
            trigger.params = triggerParams.m16047clone();
        }
        return trigger;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) obj;
        return ValueObject.util_equals(this.triggerKey, trigger.triggerKey) && ValueObject.util_equals(this.params, trigger.params);
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
        String str = this.triggerKey;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        TriggerParams triggerParams = this.params;
        int iHashCode2 = iHashCode + (triggerParams != null ? triggerParams.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.triggerKey == null) {
            this.triggerKey = "";
        }
        if (this.params == null) {
            this.params = TriggerParams.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
