package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class CounterVerification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterverification";

    @ProtobufIndex(index = 4)
    public double lastVerifyTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double latestUpdatedTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean needSync;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public double nextVerifyTime;

    @ProtobufIndex(index = 6)
    public boolean syncAll;

    @ProtobufIndex(index = 1)
    public int total;
    public static ProtobufAdapter<CounterVerification> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterVerification>() { // from class: com.p1.mobile.putong.core.data.CounterVerification.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterVerification counterVerification) {
            int iH = CodedOutputByteBufferNano.h(1, counterVerification.total) + CodedOutputByteBufferNano.b(2, counterVerification.needSync) + CodedOutputByteBufferNano.d(3, counterVerification.latestUpdatedTime) + CodedOutputByteBufferNano.d(4, counterVerification.lastVerifyTime) + CodedOutputByteBufferNano.d(5, counterVerification.nextVerifyTime) + CodedOutputByteBufferNano.b(6, counterVerification.syncAll);
            ((MessageNano) counterVerification).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterVerification m12533parse(nb5 nb5Var) throws IOException {
            CounterVerification counterVerification = new CounterVerification();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    counterVerification.total = nb5Var.j();
                } else if (iU == 16) {
                    counterVerification.needSync = nb5Var.g();
                } else if (iU == 25) {
                    counterVerification.latestUpdatedTime = nb5Var.h();
                } else if (iU == 33) {
                    counterVerification.lastVerifyTime = nb5Var.h();
                } else if (iU == 41) {
                    counterVerification.nextVerifyTime = nb5Var.h();
                } else {
                    if (iU != 48) {
                        return counterVerification;
                    }
                    counterVerification.syncAll = nb5Var.g();
                }
            }
        }

        public void serialize(CounterVerification counterVerification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterVerification.total);
            codedOutputByteBufferNano.A(2, counterVerification.needSync);
            codedOutputByteBufferNano.C(3, counterVerification.latestUpdatedTime);
            codedOutputByteBufferNano.C(4, counterVerification.lastVerifyTime);
            codedOutputByteBufferNano.C(5, counterVerification.nextVerifyTime);
            codedOutputByteBufferNano.A(6, counterVerification.syncAll);
        }
    };
    public static JsonAdapter<CounterVerification> JSON_ADAPTER = new ObjectJsonAdapter<CounterVerification>() { // from class: com.p1.mobile.putong.core.data.CounterVerification.2
        public Class getDataClass() {
            return CounterVerification.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CounterVerification m12534newInstance() {
            return new CounterVerification();
        }

        public boolean parseField(CounterVerification counterVerification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "syncAll":
                    counterVerification.syncAll = jsonParser.getValueAsBoolean();
                    return true;
                case "lastVerifyTime":
                    counterVerification.lastVerifyTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "total":
                    counterVerification.total = jsonParser.getValueAsInt();
                    return true;
                case "needSync":
                    counterVerification.needSync = jsonParser.getValueAsBoolean();
                    return true;
                case "latestUpdatedTime":
                    counterVerification.latestUpdatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "nextVerifyTime":
                    counterVerification.nextVerifyTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterVerification counterVerification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "syncAll":
                case "lastVerifyTime":
                case "total":
                case "needSync":
                case "latestUpdatedTime":
                case "nextVerifyTime":
                    return true;
                default:
                    return super.parseFieldCheck(counterVerification, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CounterVerification counterVerification, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", counterVerification.total);
            jsonGenerator.writeBooleanField("needSync", counterVerification.needSync);
            jsonGenerator.writeFieldName("latestUpdatedTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(counterVerification.latestUpdatedTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("lastVerifyTime");
            jsonAdapter.serialize(Double.valueOf(counterVerification.lastVerifyTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("nextVerifyTime");
            jsonAdapter.serialize(Double.valueOf(counterVerification.nextVerifyTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("syncAll", counterVerification.syncAll);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterVerification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterVerification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterVerification new_() {
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.nullCheck();
        return counterVerification;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterVerification m12532clone() {
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.total = this.total;
        counterVerification.needSync = this.needSync;
        counterVerification.latestUpdatedTime = this.latestUpdatedTime;
        counterVerification.lastVerifyTime = this.lastVerifyTime;
        counterVerification.nextVerifyTime = this.nextVerifyTime;
        counterVerification.syncAll = this.syncAll;
        return counterVerification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterVerification)) {
            return false;
        }
        CounterVerification counterVerification = (CounterVerification) obj;
        return this.total == counterVerification.total && this.needSync == counterVerification.needSync && this.latestUpdatedTime == counterVerification.latestUpdatedTime && this.lastVerifyTime == counterVerification.lastVerifyTime && this.nextVerifyTime == counterVerification.nextVerifyTime && this.syncAll == counterVerification.syncAll;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.total) * 41;
        int i3 = this.needSync ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestUpdatedTime);
        int i4 = ((i2 + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.lastVerifyTime);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.nextVerifyTime);
        int i6 = (((i5 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41) + (this.syncAll ? 1231 : 1237);
        ((ValueObject) this).hashCode = i6;
        return i6;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
