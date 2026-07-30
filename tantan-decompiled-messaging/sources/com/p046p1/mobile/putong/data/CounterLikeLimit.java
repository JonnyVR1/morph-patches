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
import p149l.qib0;

/* JADX INFO: loaded from: classes12.dex */
public class CounterLikeLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterlikelimit";

    @ProtobufIndex(index = 5)
    public int count;

    @ProtobufIndex(index = 1)
    public int remaining;

    @ProtobufIndex(index = 3)
    public int reset;

    @ProtobufIndex(index = 4)
    public long serverTime;

    @ProtobufIndex(index = 2)
    public int total;

    @ProtobufIndex(index = 7)
    public int tribeRemaining;

    @ProtobufIndex(index = 6)
    public int tribeTotalCount;
    public static ProtobufAdapter<CounterLikeLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterLikeLimit>() { // from class: com.p1.mobile.putong.data.CounterLikeLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterLikeLimit counterLikeLimit) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterLikeLimit.remaining) + CodedOutputByteBufferNano.m17226h(2, counterLikeLimit.total) + CodedOutputByteBufferNano.m17226h(3, counterLikeLimit.reset) + CodedOutputByteBufferNano.m17228j(4, counterLikeLimit.serverTime) + CodedOutputByteBufferNano.m17226h(5, counterLikeLimit.count) + CodedOutputByteBufferNano.m17226h(6, counterLikeLimit.tribeTotalCount) + CodedOutputByteBufferNano.m17226h(7, counterLikeLimit.tribeRemaining);
            counterLikeLimit.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterLikeLimit parse(nb5 nb5Var) throws IOException {
            CounterLikeLimit counterLikeLimit = new CounterLikeLimit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    counterLikeLimit.remaining = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    counterLikeLimit.total = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    counterLikeLimit.reset = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    counterLikeLimit.serverTime = nb5Var.m158742k();
                } else if (iM158752u == 40) {
                    counterLikeLimit.count = nb5Var.m158741j();
                } else if (iM158752u == 48) {
                    counterLikeLimit.tribeTotalCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 56) {
                        return counterLikeLimit;
                    }
                    counterLikeLimit.tribeRemaining = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterLikeLimit counterLikeLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterLikeLimit.remaining);
            codedOutputByteBufferNano.m17250G(2, counterLikeLimit.total);
            codedOutputByteBufferNano.m17250G(3, counterLikeLimit.reset);
            codedOutputByteBufferNano.m17252I(4, counterLikeLimit.serverTime);
            codedOutputByteBufferNano.m17250G(5, counterLikeLimit.count);
            codedOutputByteBufferNano.m17250G(6, counterLikeLimit.tribeTotalCount);
            codedOutputByteBufferNano.m17250G(7, counterLikeLimit.tribeRemaining);
        }
    };
    public static JsonAdapter<CounterLikeLimit> JSON_ADAPTER = new ObjectJsonAdapter<CounterLikeLimit>() { // from class: com.p1.mobile.putong.data.CounterLikeLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterLikeLimit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterLikeLimit newInstance() {
            return new CounterLikeLimit();
        }

        public boolean parseField(CounterLikeLimit counterLikeLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tribeRemaining":
                    counterLikeLimit.tribeRemaining = jsonParser.getValueAsInt();
                    return true;
                case "count":
                    counterLikeLimit.count = jsonParser.getValueAsInt();
                    return true;
                case "reset":
                    counterLikeLimit.reset = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    counterLikeLimit.total = jsonParser.getValueAsInt();
                    return true;
                case "tribeTotalCount":
                    counterLikeLimit.tribeTotalCount = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    counterLikeLimit.remaining = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterLikeLimit counterLikeLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tribeRemaining":
                case "count":
                case "reset":
                case "total":
                case "tribeTotalCount":
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(counterLikeLimit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterLikeLimit counterLikeLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", counterLikeLimit.remaining);
            jsonGenerator.writeNumberField("total", counterLikeLimit.total);
            jsonGenerator.writeNumberField("reset", counterLikeLimit.reset);
            jsonGenerator.writeNumberField("count", counterLikeLimit.count);
            jsonGenerator.writeNumberField("tribeTotalCount", counterLikeLimit.tribeTotalCount);
            jsonGenerator.writeNumberField("tribeRemaining", counterLikeLimit.tribeRemaining);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterLikeLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterLikeLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterLikeLimit new_() {
        CounterLikeLimit counterLikeLimit = new CounterLikeLimit();
        counterLikeLimit.nullCheck();
        return counterLikeLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterLikeLimit mo223809clone() {
        CounterLikeLimit counterLikeLimit = new CounterLikeLimit();
        counterLikeLimit.remaining = this.remaining;
        counterLikeLimit.total = this.total;
        counterLikeLimit.reset = this.reset;
        counterLikeLimit.serverTime = this.serverTime;
        counterLikeLimit.count = this.count;
        counterLikeLimit.tribeTotalCount = this.tribeTotalCount;
        counterLikeLimit.tribeRemaining = this.tribeRemaining;
        return counterLikeLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterLikeLimit)) {
            return false;
        }
        CounterLikeLimit counterLikeLimit = (CounterLikeLimit) obj;
        return this.remaining == counterLikeLimit.remaining && this.total == counterLikeLimit.total && this.reset == counterLikeLimit.reset && this.serverTime == counterLikeLimit.serverTime && this.count == counterLikeLimit.count && this.tribeTotalCount == counterLikeLimit.tribeTotalCount && this.tribeRemaining == counterLikeLimit.tribeRemaining;
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
        int i2 = ((((((i * 41) + this.remaining) * 41) + this.total) * 41) + this.reset) * 41;
        long j = this.serverTime;
        int i3 = ((((((i2 + ((int) (j ^ (j >>> 32)))) * 41) + this.count) * 41) + this.tribeTotalCount) * 41) + this.tribeRemaining;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        this.serverTime = qib0.f154693H.guessedCurrentServerTime();
    }

    public long resetNowMillis() {
        return (((long) (this.reset * 1000)) + this.serverTime) - qib0.f154693H.guessedCurrentServerTime();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
