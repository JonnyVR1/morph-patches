package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
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
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterLikeLimit counterLikeLimit) {
            int iH = CodedOutputByteBufferNano.h(1, counterLikeLimit.remaining) + CodedOutputByteBufferNano.h(2, counterLikeLimit.total) + CodedOutputByteBufferNano.h(3, counterLikeLimit.reset) + CodedOutputByteBufferNano.j(4, counterLikeLimit.serverTime) + CodedOutputByteBufferNano.h(5, counterLikeLimit.count) + CodedOutputByteBufferNano.h(6, counterLikeLimit.tribeTotalCount) + CodedOutputByteBufferNano.h(7, counterLikeLimit.tribeRemaining);
            ((MessageNano) counterLikeLimit).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterLikeLimit m17893parse(nb5 nb5Var) throws IOException {
            CounterLikeLimit counterLikeLimit = new CounterLikeLimit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    counterLikeLimit.remaining = nb5Var.j();
                } else if (iU == 16) {
                    counterLikeLimit.total = nb5Var.j();
                } else if (iU == 24) {
                    counterLikeLimit.reset = nb5Var.j();
                } else if (iU == 32) {
                    counterLikeLimit.serverTime = nb5Var.k();
                } else if (iU == 40) {
                    counterLikeLimit.count = nb5Var.j();
                } else if (iU == 48) {
                    counterLikeLimit.tribeTotalCount = nb5Var.j();
                } else {
                    if (iU != 56) {
                        return counterLikeLimit;
                    }
                    counterLikeLimit.tribeRemaining = nb5Var.j();
                }
            }
        }

        public void serialize(CounterLikeLimit counterLikeLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterLikeLimit.remaining);
            codedOutputByteBufferNano.G(2, counterLikeLimit.total);
            codedOutputByteBufferNano.G(3, counterLikeLimit.reset);
            codedOutputByteBufferNano.I(4, counterLikeLimit.serverTime);
            codedOutputByteBufferNano.G(5, counterLikeLimit.count);
            codedOutputByteBufferNano.G(6, counterLikeLimit.tribeTotalCount);
            codedOutputByteBufferNano.G(7, counterLikeLimit.tribeRemaining);
        }
    };
    public static JsonAdapter<CounterLikeLimit> JSON_ADAPTER = new ObjectJsonAdapter<CounterLikeLimit>() { // from class: com.p1.mobile.putong.data.CounterLikeLimit.2
        public Class getDataClass() {
            return CounterLikeLimit.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterLikeLimit mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterLikeLimit counterLikeLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", counterLikeLimit.remaining);
            jsonGenerator.writeNumberField("total", counterLikeLimit.total);
            jsonGenerator.writeNumberField("reset", counterLikeLimit.reset);
            jsonGenerator.writeNumberField("count", counterLikeLimit.count);
            jsonGenerator.writeNumberField("tribeTotalCount", counterLikeLimit.tribeTotalCount);
            jsonGenerator.writeNumberField("tribeRemaining", counterLikeLimit.tribeRemaining);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterLikeLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterLikeLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterLikeLimit new_() {
        CounterLikeLimit counterLikeLimit = new CounterLikeLimit();
        counterLikeLimit.nullCheck();
        return counterLikeLimit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterLikeLimit m17892clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.remaining) * 41) + this.total) * 41) + this.reset) * 41;
        long j = this.serverTime;
        int i3 = ((((((i2 + ((int) (j ^ (j >>> 32)))) * 41) + this.count) * 41) + this.tribeTotalCount) * 41) + this.tribeRemaining;
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public void onApiParseComplete() {
        this.serverTime = qib0.H.guessedCurrentServerTime();
    }

    public long resetNowMillis() {
        return (((long) (this.reset * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)) + this.serverTime) - qib0.H.guessedCurrentServerTime();
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
