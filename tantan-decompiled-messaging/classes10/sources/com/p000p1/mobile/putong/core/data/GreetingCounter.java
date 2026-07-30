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
public class GreetingCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingcounter";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int max;

    @ProtobufIndex(index = 1)
    public int remaining;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int replyThanksRemain;
    public static ProtobufAdapter<GreetingCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingCounter>() { // from class: com.p1.mobile.putong.core.data.GreetingCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingCounter greetingCounter) {
            int iH = CodedOutputByteBufferNano.h(1, greetingCounter.remaining) + CodedOutputByteBufferNano.h(2, greetingCounter.max) + CodedOutputByteBufferNano.h(3, greetingCounter.replyThanksRemain);
            ((MessageNano) greetingCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingCounter m13021parse(nb5 nb5Var) throws IOException {
            GreetingCounter greetingCounter = new GreetingCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    greetingCounter.remaining = nb5Var.j();
                } else if (iU == 16) {
                    greetingCounter.max = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return greetingCounter;
                    }
                    greetingCounter.replyThanksRemain = nb5Var.j();
                }
            }
        }

        public void serialize(GreetingCounter greetingCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, greetingCounter.remaining);
            codedOutputByteBufferNano.G(2, greetingCounter.max);
            codedOutputByteBufferNano.G(3, greetingCounter.replyThanksRemain);
        }
    };
    public static JsonAdapter<GreetingCounter> JSON_ADAPTER = new ObjectJsonAdapter<GreetingCounter>() { // from class: com.p1.mobile.putong.core.data.GreetingCounter.2
        public Class getDataClass() {
            return GreetingCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingCounter m13022newInstance() {
            return new GreetingCounter();
        }

        public boolean parseField(GreetingCounter greetingCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "max":
                    greetingCounter.max = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    greetingCounter.remaining = jsonParser.getValueAsInt();
                    return true;
                case "replyThanksRemain":
                    greetingCounter.replyThanksRemain = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GreetingCounter greetingCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "max":
                case "remaining":
                case "replyThanksRemain":
                    return true;
                default:
                    return super.parseFieldCheck(greetingCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GreetingCounter greetingCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", greetingCounter.remaining);
            jsonGenerator.writeNumberField("max", greetingCounter.max);
            jsonGenerator.writeNumberField("replyThanksRemain", greetingCounter.replyThanksRemain);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingCounter new_() {
        GreetingCounter greetingCounter = new GreetingCounter();
        greetingCounter.nullCheck();
        return greetingCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingCounter m13020clone() {
        GreetingCounter greetingCounter = new GreetingCounter();
        greetingCounter.remaining = this.remaining;
        greetingCounter.max = this.max;
        greetingCounter.replyThanksRemain = this.replyThanksRemain;
        return greetingCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingCounter)) {
            return false;
        }
        GreetingCounter greetingCounter = (GreetingCounter) obj;
        return this.remaining == greetingCounter.remaining && this.max == greetingCounter.max && this.replyThanksRemain == greetingCounter.replyThanksRemain;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.remaining) * 41) + this.max) * 41) + this.replyThanksRemain;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
