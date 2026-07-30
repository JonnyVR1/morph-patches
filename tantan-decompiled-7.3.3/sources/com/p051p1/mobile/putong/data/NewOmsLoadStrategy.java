package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewOmsLoadStrategy newOmsLoadStrategy) {
            LoadStrategy loadStrategy = newOmsLoadStrategy.strategy;
            int iM17281h = (loadStrategy != null ? CodedOutputByteBufferNano.m17281h(1, loadStrategy.ordinal()) : 0) + CodedOutputByteBufferNano.m17283j(2, newOmsLoadStrategy.pullSec) + CodedOutputByteBufferNano.m17283j(3, newOmsLoadStrategy.hotIntervalSec);
            LoadStrategy loadStrategy2 = newOmsLoadStrategy.strategy;
            if (loadStrategy2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, loadStrategy2, LoadStrategy.PROTOBUF_ADAPTER);
            }
            int iM17283j = iM17281h + CodedOutputByteBufferNano.m17283j(5, newOmsLoadStrategy.waitMilSecAfterRequest);
            Boolean bool = newOmsLoadStrategy.pushBoost;
            if (bool != null) {
                iM17283j += CodedOutputByteBufferNano.m17275b(6, bool.booleanValue());
            }
            int iM17283j2 = iM17283j + CodedOutputByteBufferNano.m17283j(7, newOmsLoadStrategy.timerIntervalSec) + CodedOutputByteBufferNano.m17283j(8, newOmsLoadStrategy.adUpdateMode);
            newOmsLoadStrategy.cachedSize = iM17283j2;
            return iM17283j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewOmsLoadStrategy parse(nc5 nc5Var) throws IOException {
            NewOmsLoadStrategy newOmsLoadStrategy = new NewOmsLoadStrategy();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newOmsLoadStrategy.strategy == null && numValueOf != null) {
                        newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (newOmsLoadStrategy.strategy != null) {
                        break;
                    }
                    newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 16) {
                    newOmsLoadStrategy.pullSec = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    newOmsLoadStrategy.hotIntervalSec = nc5Var.m162487k();
                } else if (iM162497u == 34) {
                    newOmsLoadStrategy.strategy = (LoadStrategy) nc5Var.m162488l(LoadStrategy.PROTOBUF_ADAPTER);
                } else if (iM162497u == 40) {
                    newOmsLoadStrategy.waitMilSecAfterRequest = nc5Var.m162487k();
                } else if (iM162497u == 48) {
                    newOmsLoadStrategy.pushBoost = Boolean.valueOf(nc5Var.m162483g());
                } else if (iM162497u == 56) {
                    newOmsLoadStrategy.timerIntervalSec = nc5Var.m162487k();
                } else {
                    if (iM162497u != 64) {
                        if (newOmsLoadStrategy.strategy == null && numValueOf != null) {
                            newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (newOmsLoadStrategy.strategy != null) {
                            break;
                        }
                        newOmsLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
                        return newOmsLoadStrategy;
                    }
                    newOmsLoadStrategy.adUpdateMode = nc5Var.m162487k();
                }
            }
            return newOmsLoadStrategy;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewOmsLoadStrategy newOmsLoadStrategy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LoadStrategy loadStrategy = newOmsLoadStrategy.strategy;
            if (loadStrategy != null) {
                codedOutputByteBufferNano.m17305G(1, loadStrategy.ordinal());
            }
            codedOutputByteBufferNano.m17307I(2, newOmsLoadStrategy.pullSec);
            codedOutputByteBufferNano.m17307I(3, newOmsLoadStrategy.hotIntervalSec);
            LoadStrategy loadStrategy2 = newOmsLoadStrategy.strategy;
            if (loadStrategy2 != null) {
                codedOutputByteBufferNano.m17309K(4, loadStrategy2, LoadStrategy.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17307I(5, newOmsLoadStrategy.waitMilSecAfterRequest);
            Boolean bool = newOmsLoadStrategy.pushBoost;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(6, bool.booleanValue());
            }
            codedOutputByteBufferNano.m17307I(7, newOmsLoadStrategy.timerIntervalSec);
            codedOutputByteBufferNano.m17307I(8, newOmsLoadStrategy.adUpdateMode);
        }
    };
    public static JsonAdapter<NewOmsLoadStrategy> JSON_ADAPTER = new ObjectJsonAdapter<NewOmsLoadStrategy>() { // from class: com.p1.mobile.putong.data.NewOmsLoadStrategy.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewOmsLoadStrategy.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewOmsLoadStrategy newInstance() {
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
                    newOmsLoadStrategy.strategy = LoadStrategy.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewOmsLoadStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewOmsLoadStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewOmsLoadStrategy new_() {
        NewOmsLoadStrategy newOmsLoadStrategy = new NewOmsLoadStrategy();
        newOmsLoadStrategy.nullCheck();
        return newOmsLoadStrategy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewOmsLoadStrategy mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = i7;
        return i7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.strategy == null) {
            this.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
