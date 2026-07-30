package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class CoreFeedStateCounters extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "corefeedstatecounters";

    @NonNull
    @ProtobufIndex(index = 1)
    public CoreFeedStateCounter states;
    public static ProtobufAdapter<CoreFeedStateCounters> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreFeedStateCounters>() { // from class: com.p1.mobile.putong.core.data.CoreFeedStateCounters.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreFeedStateCounters coreFeedStateCounters) {
            CoreFeedStateCounter coreFeedStateCounter = coreFeedStateCounters.states;
            int iM17285l = coreFeedStateCounter != null ? CodedOutputByteBufferNano.m17285l(1, coreFeedStateCounter, CoreFeedStateCounter.PROTOBUF_ADAPTER) : 0;
            coreFeedStateCounters.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreFeedStateCounters parse(nc5 nc5Var) throws IOException {
            CoreFeedStateCounters coreFeedStateCounters = new CoreFeedStateCounters();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (coreFeedStateCounters.states != null) {
                        break;
                    }
                    coreFeedStateCounters.states = CoreFeedStateCounter.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (coreFeedStateCounters.states != null) {
                        break;
                    }
                    coreFeedStateCounters.states = CoreFeedStateCounter.new_();
                    return coreFeedStateCounters;
                }
                coreFeedStateCounters.states = (CoreFeedStateCounter) nc5Var.m162488l(CoreFeedStateCounter.PROTOBUF_ADAPTER);
            }
            return coreFeedStateCounters;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreFeedStateCounters coreFeedStateCounters, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            CoreFeedStateCounter coreFeedStateCounter = coreFeedStateCounters.states;
            if (coreFeedStateCounter != null) {
                codedOutputByteBufferNano.m17309K(1, coreFeedStateCounter, CoreFeedStateCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CoreFeedStateCounters> JSON_ADAPTER = new ObjectJsonAdapter<CoreFeedStateCounters>() { // from class: com.p1.mobile.putong.core.data.CoreFeedStateCounters.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreFeedStateCounters.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreFeedStateCounters newInstance() {
            return new CoreFeedStateCounters();
        }

        public boolean parseField(CoreFeedStateCounters coreFeedStateCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("states")) {
                return false;
            }
            coreFeedStateCounters.states = CoreFeedStateCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CoreFeedStateCounters coreFeedStateCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("states")) {
                return true;
            }
            return super.parseFieldCheck(coreFeedStateCounters, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreFeedStateCounters coreFeedStateCounters, JsonGenerator jsonGenerator) throws IOException {
            if (coreFeedStateCounters.states != null) {
                jsonGenerator.writeFieldName("states");
                CoreFeedStateCounter.JSON_ADAPTER.serialize(coreFeedStateCounters.states, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreFeedStateCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreFeedStateCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreFeedStateCounters new_() {
        CoreFeedStateCounters coreFeedStateCounters = new CoreFeedStateCounters();
        coreFeedStateCounters.nullCheck();
        return coreFeedStateCounters;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreFeedStateCounters mo225055clone() {
        CoreFeedStateCounters coreFeedStateCounters = new CoreFeedStateCounters();
        CoreFeedStateCounter coreFeedStateCounter = this.states;
        if (coreFeedStateCounter != null) {
            coreFeedStateCounters.states = coreFeedStateCounter.mo225055clone();
        }
        return coreFeedStateCounters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CoreFeedStateCounters) {
            return ValueObject.util_equals(this.states, ((CoreFeedStateCounters) obj).states);
        }
        return false;
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
        CoreFeedStateCounter coreFeedStateCounter = this.states;
        int iHashCode = i2 + (coreFeedStateCounter != null ? coreFeedStateCounter.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.states == null) {
            this.states = CoreFeedStateCounter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
