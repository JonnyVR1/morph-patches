package com.p051p1.mobile.putong.core.data;

import com.clevertap.android.sdk.Constants;
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
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, greetingCounter.remaining) + CodedOutputByteBufferNano.m17281h(2, greetingCounter.max) + CodedOutputByteBufferNano.m17281h(3, greetingCounter.replyThanksRemain);
            greetingCounter.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingCounter parse(nc5 nc5Var) throws IOException {
            GreetingCounter greetingCounter = new GreetingCounter();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    greetingCounter.remaining = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    greetingCounter.max = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return greetingCounter;
                    }
                    greetingCounter.replyThanksRemain = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingCounter greetingCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, greetingCounter.remaining);
            codedOutputByteBufferNano.m17305G(2, greetingCounter.max);
            codedOutputByteBufferNano.m17305G(3, greetingCounter.replyThanksRemain);
        }
    };
    public static JsonAdapter<GreetingCounter> JSON_ADAPTER = new ObjectJsonAdapter<GreetingCounter>() { // from class: com.p1.mobile.putong.core.data.GreetingCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingCounter greetingCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", greetingCounter.remaining);
            jsonGenerator.writeNumberField(Constants.PRIORITY_MAX, greetingCounter.max);
            jsonGenerator.writeNumberField("replyThanksRemain", greetingCounter.replyThanksRemain);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public GreetingCounter mo225055clone() {
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
