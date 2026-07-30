package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class CounterSecretCrushLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "countersecretcrushlimit";

    @ProtobufIndex(index = 3)
    public int received;

    @ProtobufIndex(index = 1)
    public int remaining;

    @ProtobufIndex(index = 2)
    public int total;
    public static ProtobufAdapter<CounterSecretCrushLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterSecretCrushLimit>() { // from class: com.p1.mobile.putong.data.CounterSecretCrushLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterSecretCrushLimit counterSecretCrushLimit) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterSecretCrushLimit.remaining) + CodedOutputByteBufferNano.m17226h(2, counterSecretCrushLimit.total) + CodedOutputByteBufferNano.m17226h(3, counterSecretCrushLimit.received);
            counterSecretCrushLimit.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterSecretCrushLimit parse(nb5 nb5Var) throws IOException {
            CounterSecretCrushLimit counterSecretCrushLimit = new CounterSecretCrushLimit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    counterSecretCrushLimit.remaining = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    counterSecretCrushLimit.total = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return counterSecretCrushLimit;
                    }
                    counterSecretCrushLimit.received = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterSecretCrushLimit counterSecretCrushLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterSecretCrushLimit.remaining);
            codedOutputByteBufferNano.m17250G(2, counterSecretCrushLimit.total);
            codedOutputByteBufferNano.m17250G(3, counterSecretCrushLimit.received);
        }
    };
    public static JsonAdapter<CounterSecretCrushLimit> JSON_ADAPTER = new ObjectJsonAdapter<CounterSecretCrushLimit>() { // from class: com.p1.mobile.putong.data.CounterSecretCrushLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterSecretCrushLimit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterSecretCrushLimit newInstance() {
            return new CounterSecretCrushLimit();
        }

        public boolean parseField(CounterSecretCrushLimit counterSecretCrushLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "received":
                    counterSecretCrushLimit.received = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    counterSecretCrushLimit.total = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    counterSecretCrushLimit.remaining = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterSecretCrushLimit counterSecretCrushLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "received":
                case "total":
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(counterSecretCrushLimit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterSecretCrushLimit counterSecretCrushLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", counterSecretCrushLimit.remaining);
            jsonGenerator.writeNumberField("total", counterSecretCrushLimit.total);
            jsonGenerator.writeNumberField("received", counterSecretCrushLimit.received);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterSecretCrushLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterSecretCrushLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterSecretCrushLimit new_() {
        CounterSecretCrushLimit counterSecretCrushLimit = new CounterSecretCrushLimit();
        counterSecretCrushLimit.nullCheck();
        return counterSecretCrushLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterSecretCrushLimit mo223809clone() {
        CounterSecretCrushLimit counterSecretCrushLimit = new CounterSecretCrushLimit();
        counterSecretCrushLimit.remaining = this.remaining;
        counterSecretCrushLimit.total = this.total;
        counterSecretCrushLimit.received = this.received;
        return counterSecretCrushLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterSecretCrushLimit)) {
            return false;
        }
        CounterSecretCrushLimit counterSecretCrushLimit = (CounterSecretCrushLimit) obj;
        return this.remaining == counterSecretCrushLimit.remaining && this.total == counterSecretCrushLimit.total && this.received == counterSecretCrushLimit.received;
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
        int i2 = (((((i * 41) + this.remaining) * 41) + this.total) * 41) + this.received;
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
