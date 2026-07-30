package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewOmsLoadStrategy extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newomsloadstrategy";

    @ProtobufIndex(index = 8)
    public long adUpdateMode;

    @ProtobufIndex(index = 3)
    public long hotIntervalSec;

    @ProtobufIndex(index = 2)
    public long pullSec;

    @Nullable
    @ProtobufIndex(index = 6)
    public Boolean pushBoost;

    @NonNull
    @ProtobufIndex(index = 1)
    public LoadStrategy strategy;

    @ProtobufIndex(index = 7)
    public long timerIntervalSec;

    @ProtobufIndex(index = 5)
    public long waitMilSecAfterRequest;
    public static ProtobufAdapter<NewOmsLoadStrategy> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewOmsLoadStrategy>() { // from class: com.p1.mobile.putong.data.NewOmsLoadStrategy.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewOmsLoadStrategy newOmsLoadStrategy) {
            LoadStrategy loadStrategy = newOmsLoadStrategy.strategy;
            int iH = (loadStrategy != null ? CodedOutputByteBufferNano.h(1, loadStrategy.ordinal()) : 0) + CodedOutputByteBufferNano.j(2, newOmsLoadStrategy.pullSec) + CodedOutputByteBufferNano.j(3, newOmsLoadStrategy.hotIntervalSec);
            LoadStrategy loadStrategy2 = newOmsLoadStrategy.strategy;
            if (loadStrategy2 != null) {
                iH += CodedOutputByteBufferNano.l(4, loadStrategy2, LoadStrategy.PROTOBUF_ADAPTER);
            }
            int iJ = iH + CodedOutputByteBufferNano.j(5, newOmsLoadStrategy.waitMilSecAfterRequest);
            Boolean bool = newOmsLoadStrategy.pushBoost;
            if (bool != null) {
                iJ += CodedOutputByteBufferNano.b(6, bool.booleanValue());
            }
            int iJ2 = iJ + CodedOutputByteBufferNano.j(7, newOmsLoadStrategy.timerIntervalSec) + CodedOutputByteBufferNano.j(8, newOmsLoadStrategy.adUpdateMode);
            ((MessageNano) newOmsLoadStrategy).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewOmsLoadStrategy m18540parse(nb5 nb5Var) throws IOException {
            NewOmsLoadStrategy newOmsLoadStrategy = new NewOmsLoadStrategy();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newOmsLoadStrategy.strategy == null && numValueOf != null) {
                        newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (newOmsLoadStrategy.strategy != null) {
                        break;
                    }
                    newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    newOmsLoadStrategy.pullSec = nb5Var.k();
                } else if (iU == 24) {
                    newOmsLoadStrategy.hotIntervalSec = nb5Var.k();
                } else if (iU == 34) {
                    newOmsLoadStrategy.strategy = (LoadStrategy) nb5Var.l(LoadStrategy.PROTOBUF_ADAPTER);
                } else if (iU == 40) {
                    newOmsLoadStrategy.waitMilSecAfterRequest = nb5Var.k();
                } else if (iU == 48) {
                    newOmsLoadStrategy.pushBoost = Boolean.valueOf(nb5Var.g());
                } else if (iU == 56) {
                    newOmsLoadStrategy.timerIntervalSec = nb5Var.k();
                } else {
                    if (iU != 64) {
                        if (newOmsLoadStrategy.strategy == null && numValueOf != null) {
                            newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (newOmsLoadStrategy.strategy != null) {
                            break;
                        }
                        newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
                        return newOmsLoadStrategy;
                    }
                    newOmsLoadStrategy.adUpdateMode = nb5Var.k();
                }
            }
            return newOmsLoadStrategy;
        }

        public void serialize(NewOmsLoadStrategy newOmsLoadStrategy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LoadStrategy loadStrategy = newOmsLoadStrategy.strategy;
            if (loadStrategy != null) {
                codedOutputByteBufferNano.G(1, loadStrategy.ordinal());
            }
            codedOutputByteBufferNano.I(2, newOmsLoadStrategy.pullSec);
            codedOutputByteBufferNano.I(3, newOmsLoadStrategy.hotIntervalSec);
            LoadStrategy loadStrategy2 = newOmsLoadStrategy.strategy;
            if (loadStrategy2 != null) {
                codedOutputByteBufferNano.K(4, loadStrategy2, LoadStrategy.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.I(5, newOmsLoadStrategy.waitMilSecAfterRequest);
            Boolean bool = newOmsLoadStrategy.pushBoost;
            if (bool != null) {
                codedOutputByteBufferNano.A(6, bool.booleanValue());
            }
            codedOutputByteBufferNano.I(7, newOmsLoadStrategy.timerIntervalSec);
            codedOutputByteBufferNano.I(8, newOmsLoadStrategy.adUpdateMode);
        }
    };
    public static JsonAdapter<NewOmsLoadStrategy> JSON_ADAPTER = new ObjectJsonAdapter<NewOmsLoadStrategy>() { // from class: com.p1.mobile.putong.data.NewOmsLoadStrategy.2
        public Class getDataClass() {
            return NewOmsLoadStrategy.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NewOmsLoadStrategy mo17830newInstance() {
            return new NewOmsLoadStrategy();
        }

        public boolean parseField(NewOmsLoadStrategy newOmsLoadStrategy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hotIntervalSec":
                    newOmsLoadStrategy.hotIntervalSec = jsonParser.getValueAsLong();
                    return true;
                case "timerIntervalSec":
                    newOmsLoadStrategy.timerIntervalSec = jsonParser.getValueAsLong();
                    return true;
                case "waitMilSecAfterRequest":
                    newOmsLoadStrategy.waitMilSecAfterRequest = jsonParser.getValueAsLong();
                    return true;
                case "pushBoost":
                    newOmsLoadStrategy.pushBoost = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case "pullSec":
                    newOmsLoadStrategy.pullSec = jsonParser.getValueAsLong();
                    return true;
                case "strategy":
                    newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "adUpdateMode":
                    newOmsLoadStrategy.adUpdateMode = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewOmsLoadStrategy newOmsLoadStrategy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hotIntervalSec":
                case "timerIntervalSec":
                case "waitMilSecAfterRequest":
                case "pushBoost":
                case "pullSec":
                case "strategy":
                case "adUpdateMode":
                    return true;
                default:
                    return super.parseFieldCheck(newOmsLoadStrategy, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewOmsLoadStrategy newOmsLoadStrategy, JsonGenerator jsonGenerator) throws IOException {
            if (newOmsLoadStrategy.strategy != null) {
                jsonGenerator.writeFieldName("strategy");
                LoadStrategy.JSON_ADAPTER.serialize(newOmsLoadStrategy.strategy, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("pullSec", newOmsLoadStrategy.pullSec);
            jsonGenerator.writeNumberField("hotIntervalSec", newOmsLoadStrategy.hotIntervalSec);
            jsonGenerator.writeNumberField("waitMilSecAfterRequest", newOmsLoadStrategy.waitMilSecAfterRequest);
            Boolean bool = newOmsLoadStrategy.pushBoost;
            if (bool != null) {
                jsonGenerator.writeBooleanField("pushBoost", bool.booleanValue());
            }
            jsonGenerator.writeNumberField("timerIntervalSec", newOmsLoadStrategy.timerIntervalSec);
            jsonGenerator.writeNumberField("adUpdateMode", newOmsLoadStrategy.adUpdateMode);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewOmsLoadStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewOmsLoadStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewOmsLoadStrategy new_() {
        NewOmsLoadStrategy newOmsLoadStrategy = new NewOmsLoadStrategy();
        newOmsLoadStrategy.nullCheck();
        return newOmsLoadStrategy;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewOmsLoadStrategy m18539clone() {
        NewOmsLoadStrategy newOmsLoadStrategy = new NewOmsLoadStrategy();
        newOmsLoadStrategy.strategy = this.strategy;
        newOmsLoadStrategy.pullSec = this.pullSec;
        newOmsLoadStrategy.hotIntervalSec = this.hotIntervalSec;
        newOmsLoadStrategy.waitMilSecAfterRequest = this.waitMilSecAfterRequest;
        newOmsLoadStrategy.pushBoost = this.pushBoost;
        newOmsLoadStrategy.timerIntervalSec = this.timerIntervalSec;
        newOmsLoadStrategy.adUpdateMode = this.adUpdateMode;
        return newOmsLoadStrategy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewOmsLoadStrategy)) {
            return false;
        }
        NewOmsLoadStrategy newOmsLoadStrategy = (NewOmsLoadStrategy) obj;
        return ValueObject.util_equals(this.strategy, newOmsLoadStrategy.strategy) && this.pullSec == newOmsLoadStrategy.pullSec && this.hotIntervalSec == newOmsLoadStrategy.hotIntervalSec && this.waitMilSecAfterRequest == newOmsLoadStrategy.waitMilSecAfterRequest && ValueObject.util_equals(this.pushBoost, newOmsLoadStrategy.pushBoost) && this.timerIntervalSec == newOmsLoadStrategy.timerIntervalSec && this.adUpdateMode == newOmsLoadStrategy.adUpdateMode;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        LoadStrategy loadStrategy = this.strategy;
        int iHashCode = loadStrategy != null ? loadStrategy.hashCode() : 0;
        long j = this.pullSec;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.hotIntervalSec;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.waitMilSecAfterRequest;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        Boolean bool = this.pushBoost;
        int iHashCode2 = (i5 + (bool != null ? bool.hashCode() : 0)) * 41;
        long j4 = this.timerIntervalSec;
        int i6 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        long j5 = this.adUpdateMode;
        int i7 = i6 + ((int) (j5 ^ (j5 >>> 32)));
        ((ValueObject) this).hashCode = i7;
        return i7;
    }

    public void nullCheck() {
        if (this.strategy == null) {
            this.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
