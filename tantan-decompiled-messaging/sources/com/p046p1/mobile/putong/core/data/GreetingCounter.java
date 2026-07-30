package com.p046p1.mobile.putong.core.data;

import com.clevertap.android.sdk.Constants;
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
public class GreetingCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingcounter";

    @ProtobufIndex(index = 2)
    public int max;

    @ProtobufIndex(index = 1)
    public int remaining;

    @ProtobufIndex(index = 3)
    public int replyThanksRemain;
    public static ProtobufAdapter<GreetingCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingCounter>() { // from class: com.p1.mobile.putong.core.data.GreetingCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingCounter greetingCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, greetingCounter.remaining) + CodedOutputByteBufferNano.m17226h(2, greetingCounter.max) + CodedOutputByteBufferNano.m17226h(3, greetingCounter.replyThanksRemain);
            greetingCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingCounter parse(nb5 nb5Var) throws IOException {
            GreetingCounter greetingCounter = new GreetingCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    greetingCounter.remaining = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    greetingCounter.max = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return greetingCounter;
                    }
                    greetingCounter.replyThanksRemain = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingCounter greetingCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, greetingCounter.remaining);
            codedOutputByteBufferNano.m17250G(2, greetingCounter.max);
            codedOutputByteBufferNano.m17250G(3, greetingCounter.replyThanksRemain);
        }
    };
    public static JsonAdapter<GreetingCounter> JSON_ADAPTER = new ObjectJsonAdapter<GreetingCounter>() { // from class: com.p1.mobile.putong.core.data.GreetingCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingCounter newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingCounter greetingCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", greetingCounter.remaining);
            jsonGenerator.writeNumberField(Constants.PRIORITY_MAX, greetingCounter.max);
            jsonGenerator.writeNumberField("replyThanksRemain", greetingCounter.replyThanksRemain);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingCounter new_() {
        GreetingCounter greetingCounter = new GreetingCounter();
        greetingCounter.nullCheck();
        return greetingCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingCounter mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.remaining) * 41) + this.max) * 41) + this.replyThanksRemain;
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
