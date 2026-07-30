package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class CounterSuperlikeAndUndoLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "countersuperlikeandundolimit";

    @ProtobufIndex(index = 7)
    public int count;

    @ProtobufIndex(index = 8)
    public int limit;

    @ProtobufIndex(index = 4)
    public int quota;

    @ProtobufIndex(index = 1)
    public int remaining;

    @ProtobufIndex(index = 5)
    public int reset;

    @ProtobufIndex(index = 6)
    public int resetShare;

    @ProtobufIndex(index = 2)
    public int rewardForInvite;

    @ProtobufIndex(index = 3)
    public int rewardForShare;
    public static ProtobufAdapter<CounterSuperlikeAndUndoLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterSuperlikeAndUndoLimit>() { // from class: com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterSuperlikeAndUndoLimit.remaining) + CodedOutputByteBufferNano.m17226h(2, counterSuperlikeAndUndoLimit.rewardForInvite) + CodedOutputByteBufferNano.m17226h(3, counterSuperlikeAndUndoLimit.rewardForShare) + CodedOutputByteBufferNano.m17226h(4, counterSuperlikeAndUndoLimit.quota) + CodedOutputByteBufferNano.m17226h(5, counterSuperlikeAndUndoLimit.reset) + CodedOutputByteBufferNano.m17226h(6, counterSuperlikeAndUndoLimit.resetShare) + CodedOutputByteBufferNano.m17226h(7, counterSuperlikeAndUndoLimit.count) + CodedOutputByteBufferNano.m17226h(8, counterSuperlikeAndUndoLimit.limit);
            counterSuperlikeAndUndoLimit.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterSuperlikeAndUndoLimit parse(nb5 nb5Var) throws IOException {
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = new CounterSuperlikeAndUndoLimit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    counterSuperlikeAndUndoLimit.remaining = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    counterSuperlikeAndUndoLimit.rewardForInvite = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    counterSuperlikeAndUndoLimit.rewardForShare = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    counterSuperlikeAndUndoLimit.quota = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    counterSuperlikeAndUndoLimit.reset = nb5Var.m158741j();
                } else if (iM158752u == 48) {
                    counterSuperlikeAndUndoLimit.resetShare = nb5Var.m158741j();
                } else if (iM158752u == 56) {
                    counterSuperlikeAndUndoLimit.count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 64) {
                        return counterSuperlikeAndUndoLimit;
                    }
                    counterSuperlikeAndUndoLimit.limit = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterSuperlikeAndUndoLimit.remaining);
            codedOutputByteBufferNano.m17250G(2, counterSuperlikeAndUndoLimit.rewardForInvite);
            codedOutputByteBufferNano.m17250G(3, counterSuperlikeAndUndoLimit.rewardForShare);
            codedOutputByteBufferNano.m17250G(4, counterSuperlikeAndUndoLimit.quota);
            codedOutputByteBufferNano.m17250G(5, counterSuperlikeAndUndoLimit.reset);
            codedOutputByteBufferNano.m17250G(6, counterSuperlikeAndUndoLimit.resetShare);
            codedOutputByteBufferNano.m17250G(7, counterSuperlikeAndUndoLimit.count);
            codedOutputByteBufferNano.m17250G(8, counterSuperlikeAndUndoLimit.limit);
        }
    };
    public static JsonAdapter<CounterSuperlikeAndUndoLimit> JSON_ADAPTER = new ObjectJsonAdapter<CounterSuperlikeAndUndoLimit>() { // from class: com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterSuperlikeAndUndoLimit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterSuperlikeAndUndoLimit newInstance() {
            return new CounterSuperlikeAndUndoLimit();
        }

        public boolean parseField(CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resetShare":
                    counterSuperlikeAndUndoLimit.resetShare = jsonParser.getValueAsInt();
                    return true;
                case "count":
                    counterSuperlikeAndUndoLimit.count = jsonParser.getValueAsInt();
                    return true;
                case "limit":
                    counterSuperlikeAndUndoLimit.limit = jsonParser.getValueAsInt();
                    return true;
                case "quota":
                    counterSuperlikeAndUndoLimit.quota = jsonParser.getValueAsInt();
                    return true;
                case "reset":
                    counterSuperlikeAndUndoLimit.reset = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    counterSuperlikeAndUndoLimit.remaining = jsonParser.getValueAsInt();
                    return true;
                case "rewardForInvite":
                    counterSuperlikeAndUndoLimit.rewardForInvite = jsonParser.getValueAsInt();
                    return true;
                case "rewardForShare":
                    counterSuperlikeAndUndoLimit.rewardForShare = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "resetShare":
                case "count":
                case "limit":
                case "quota":
                case "reset":
                case "remaining":
                case "rewardForInvite":
                case "rewardForShare":
                    return true;
                default:
                    return super.parseFieldCheck(counterSuperlikeAndUndoLimit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", counterSuperlikeAndUndoLimit.remaining);
            jsonGenerator.writeNumberField("rewardForInvite", counterSuperlikeAndUndoLimit.rewardForInvite);
            jsonGenerator.writeNumberField("rewardForShare", counterSuperlikeAndUndoLimit.rewardForShare);
            jsonGenerator.writeNumberField("quota", counterSuperlikeAndUndoLimit.quota);
            jsonGenerator.writeNumberField("reset", counterSuperlikeAndUndoLimit.reset);
            jsonGenerator.writeNumberField("resetShare", counterSuperlikeAndUndoLimit.resetShare);
            jsonGenerator.writeNumberField("count", counterSuperlikeAndUndoLimit.count);
            jsonGenerator.writeNumberField(Constants.KEY_LIMIT, counterSuperlikeAndUndoLimit.limit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterSuperlikeAndUndoLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterSuperlikeAndUndoLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterSuperlikeAndUndoLimit new_() {
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = new CounterSuperlikeAndUndoLimit();
        counterSuperlikeAndUndoLimit.nullCheck();
        return counterSuperlikeAndUndoLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterSuperlikeAndUndoLimit mo223809clone() {
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = new CounterSuperlikeAndUndoLimit();
        counterSuperlikeAndUndoLimit.remaining = this.remaining;
        counterSuperlikeAndUndoLimit.rewardForInvite = this.rewardForInvite;
        counterSuperlikeAndUndoLimit.rewardForShare = this.rewardForShare;
        counterSuperlikeAndUndoLimit.quota = this.quota;
        counterSuperlikeAndUndoLimit.reset = this.reset;
        counterSuperlikeAndUndoLimit.resetShare = this.resetShare;
        counterSuperlikeAndUndoLimit.count = this.count;
        counterSuperlikeAndUndoLimit.limit = this.limit;
        return counterSuperlikeAndUndoLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterSuperlikeAndUndoLimit)) {
            return false;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = (CounterSuperlikeAndUndoLimit) obj;
        return this.remaining == counterSuperlikeAndUndoLimit.remaining && this.rewardForInvite == counterSuperlikeAndUndoLimit.rewardForInvite && this.rewardForShare == counterSuperlikeAndUndoLimit.rewardForShare && this.quota == counterSuperlikeAndUndoLimit.quota && this.reset == counterSuperlikeAndUndoLimit.reset && this.resetShare == counterSuperlikeAndUndoLimit.resetShare && this.count == counterSuperlikeAndUndoLimit.count && this.limit == counterSuperlikeAndUndoLimit.limit;
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
        int i2 = (((((((((((((((i * 41) + this.remaining) * 41) + this.rewardForInvite) * 41) + this.rewardForShare) * 41) + this.quota) * 41) + this.reset) * 41) + this.resetShare) * 41) + this.count) * 41) + this.limit;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    public int remainAll() {
        return this.remaining;
    }

    public int remainToday() {
        return Math.min(this.remaining, this.limit - this.count);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
