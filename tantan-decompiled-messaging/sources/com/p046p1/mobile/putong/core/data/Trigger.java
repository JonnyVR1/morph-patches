package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.heytap.mcssdk.mode.CommandMessage;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class Trigger extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "trigger";

    @NonNull
    @ProtobufIndex(index = 2)
    public TriggerParams params;

    @NonNull
    @ProtobufIndex(index = 1)
    public String triggerKey;
    public static ProtobufAdapter<Trigger> PROTOBUF_ADAPTER = new MessageNanoAdapter<Trigger>() { // from class: com.p1.mobile.putong.core.data.Trigger.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Trigger trigger) {
            String str = trigger.triggerKey;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            TriggerParams triggerParams = trigger.params;
            if (triggerParams != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, triggerParams, TriggerParams.PROTOBUF_ADAPTER);
            }
            trigger.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Trigger parse(nb5 nb5Var) throws IOException {
            Trigger trigger = new Trigger();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (trigger.triggerKey == null) {
                        trigger.triggerKey = "";
                    }
                    if (trigger.params != null) {
                        break;
                    }
                    trigger.params = TriggerParams.new_();
                    break;
                }
                if (iM158752u == 10) {
                    trigger.triggerKey = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (trigger.triggerKey == null) {
                            trigger.triggerKey = "";
                        }
                        if (trigger.params != null) {
                            break;
                        }
                        trigger.params = TriggerParams.new_();
                        return trigger;
                    }
                    trigger.params = (TriggerParams) nb5Var.m158743l(TriggerParams.PROTOBUF_ADAPTER);
                }
            }
            return trigger;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Trigger trigger, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = trigger.triggerKey;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            TriggerParams triggerParams = trigger.params;
            if (triggerParams != null) {
                codedOutputByteBufferNano.m17254K(2, triggerParams, TriggerParams.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Trigger> JSON_ADAPTER = new ObjectJsonAdapter<Trigger>() { // from class: com.p1.mobile.putong.core.data.Trigger.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Trigger.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Trigger newInstance() {
            return new Trigger();
        }

        public boolean parseField(Trigger trigger, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(CommandMessage.PARAMS)) {
                trigger.params = TriggerParams.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
            if (str.equals(CommandMessage.PARAMS) || str.equals("triggerKey")) {
                return true;
            }
            return super.parseFieldCheck(trigger, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Trigger trigger, JsonGenerator jsonGenerator) throws IOException {
            String str = trigger.triggerKey;
            if (str != null) {
                jsonGenerator.writeStringField("triggerKey", str);
            }
            if (trigger.params != null) {
                jsonGenerator.writeFieldName(CommandMessage.PARAMS);
                TriggerParams.JSON_ADAPTER.serialize(trigger.params, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Trigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Trigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Trigger new_() {
        Trigger trigger = new Trigger();
        trigger.nullCheck();
        return trigger;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Trigger mo223809clone() {
        Trigger trigger = new Trigger();
        trigger.triggerKey = this.triggerKey;
        TriggerParams triggerParams = this.params;
        if (triggerParams != null) {
            trigger.params = triggerParams.mo223809clone();
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
        String str = this.triggerKey;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        TriggerParams triggerParams = this.params;
        int iHashCode2 = iHashCode + (triggerParams != null ? triggerParams.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.triggerKey == null) {
            this.triggerKey = "";
        }
        if (this.params == null) {
            this.params = TriggerParams.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
