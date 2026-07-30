package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class AssistantMessageClear extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "assistantmessageclear";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = 2)
    public int limit_days;
    public static ProtobufAdapter<AssistantMessageClear> PROTOBUF_ADAPTER = new MessageNanoAdapter<AssistantMessageClear>() { // from class: com.p1.mobile.putong.core.data.AssistantMessageClear.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AssistantMessageClear assistantMessageClear) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, assistantMessageClear.enabled) + CodedOutputByteBufferNano.m17226h(2, assistantMessageClear.limit_days);
            assistantMessageClear.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AssistantMessageClear parse(nb5 nb5Var) throws IOException {
            AssistantMessageClear assistantMessageClear = new AssistantMessageClear();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    assistantMessageClear.enabled = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return assistantMessageClear;
                    }
                    assistantMessageClear.limit_days = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AssistantMessageClear assistantMessageClear, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, assistantMessageClear.enabled);
            codedOutputByteBufferNano.m17250G(2, assistantMessageClear.limit_days);
        }
    };
    public static JsonAdapter<AssistantMessageClear> JSON_ADAPTER = new ObjectJsonAdapter<AssistantMessageClear>() { // from class: com.p1.mobile.putong.core.data.AssistantMessageClear.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AssistantMessageClear.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AssistantMessageClear newInstance() {
            return new AssistantMessageClear();
        }

        public boolean parseField(AssistantMessageClear assistantMessageClear, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("limit_days")) {
                assistantMessageClear.limit_days = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("enabled")) {
                return false;
            }
            assistantMessageClear.enabled = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(AssistantMessageClear assistantMessageClear, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("limit_days") || str.equals("enabled")) {
                return true;
            }
            return super.parseFieldCheck(assistantMessageClear, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AssistantMessageClear assistantMessageClear, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", assistantMessageClear.enabled);
            jsonGenerator.writeNumberField("limit_days", assistantMessageClear.limit_days);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AssistantMessageClear) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AssistantMessageClear) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AssistantMessageClear new_() {
        AssistantMessageClear assistantMessageClear = new AssistantMessageClear();
        assistantMessageClear.nullCheck();
        return assistantMessageClear;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AssistantMessageClear mo223809clone() {
        AssistantMessageClear assistantMessageClear = new AssistantMessageClear();
        assistantMessageClear.enabled = this.enabled;
        assistantMessageClear.limit_days = this.limit_days;
        return assistantMessageClear;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AssistantMessageClear)) {
            return false;
        }
        AssistantMessageClear assistantMessageClear = (AssistantMessageClear) obj;
        return this.enabled == assistantMessageClear.enabled && this.limit_days == assistantMessageClear.limit_days;
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
        int i2 = (((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + this.limit_days;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
