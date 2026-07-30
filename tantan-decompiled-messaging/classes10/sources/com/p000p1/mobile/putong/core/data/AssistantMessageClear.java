package com.p000p1.mobile.putong.core.data;

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
public class AssistantMessageClear extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "assistantmessageclear";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int limit_days;
    public static ProtobufAdapter<AssistantMessageClear> PROTOBUF_ADAPTER = new MessageNanoAdapter<AssistantMessageClear>() { // from class: com.p1.mobile.putong.core.data.AssistantMessageClear.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AssistantMessageClear assistantMessageClear) {
            int iB = CodedOutputByteBufferNano.b(1, assistantMessageClear.enabled) + CodedOutputByteBufferNano.h(2, assistantMessageClear.limit_days);
            ((MessageNano) assistantMessageClear).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AssistantMessageClear m11657parse(nb5 nb5Var) throws IOException {
            AssistantMessageClear assistantMessageClear = new AssistantMessageClear();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    assistantMessageClear.enabled = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return assistantMessageClear;
                    }
                    assistantMessageClear.limit_days = nb5Var.j();
                }
            }
        }

        public void serialize(AssistantMessageClear assistantMessageClear, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, assistantMessageClear.enabled);
            codedOutputByteBufferNano.G(2, assistantMessageClear.limit_days);
        }
    };
    public static JsonAdapter<AssistantMessageClear> JSON_ADAPTER = new ObjectJsonAdapter<AssistantMessageClear>() { // from class: com.p1.mobile.putong.core.data.AssistantMessageClear.2
        public Class getDataClass() {
            return AssistantMessageClear.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AssistantMessageClear m11658newInstance() {
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

        public void serializeFields(AssistantMessageClear assistantMessageClear, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", assistantMessageClear.enabled);
            jsonGenerator.writeNumberField("limit_days", assistantMessageClear.limit_days);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AssistantMessageClear) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AssistantMessageClear) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AssistantMessageClear new_() {
        AssistantMessageClear assistantMessageClear = new AssistantMessageClear();
        assistantMessageClear.nullCheck();
        return assistantMessageClear;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AssistantMessageClear m11656clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + this.limit_days;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
