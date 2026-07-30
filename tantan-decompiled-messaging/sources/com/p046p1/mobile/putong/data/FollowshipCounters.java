package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class FollowshipCounters extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "followshipcounters";

    @NonNull
    @ProtobufIndex(index = 1)
    public FollowshipCounter counters;
    public static ProtobufAdapter<FollowshipCounters> PROTOBUF_ADAPTER = new MessageNanoAdapter<FollowshipCounters>() { // from class: com.p1.mobile.putong.data.FollowshipCounters.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FollowshipCounters followshipCounters) {
            FollowshipCounter followshipCounter = followshipCounters.counters;
            int iM17230l = followshipCounter != null ? CodedOutputByteBufferNano.m17230l(1, followshipCounter, FollowshipCounter.PROTOBUF_ADAPTER) : 0;
            followshipCounters.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FollowshipCounters parse(nb5 nb5Var) throws IOException {
            FollowshipCounters followshipCounters = new FollowshipCounters();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (followshipCounters.counters != null) {
                        break;
                    }
                    followshipCounters.counters = FollowshipCounter.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (followshipCounters.counters != null) {
                        break;
                    }
                    followshipCounters.counters = FollowshipCounter.new_();
                    return followshipCounters;
                }
                followshipCounters.counters = (FollowshipCounter) nb5Var.m158743l(FollowshipCounter.PROTOBUF_ADAPTER);
            }
            return followshipCounters;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FollowshipCounters followshipCounters, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FollowshipCounter followshipCounter = followshipCounters.counters;
            if (followshipCounter != null) {
                codedOutputByteBufferNano.m17254K(1, followshipCounter, FollowshipCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FollowshipCounters> JSON_ADAPTER = new ObjectJsonAdapter<FollowshipCounters>() { // from class: com.p1.mobile.putong.data.FollowshipCounters.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FollowshipCounters.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FollowshipCounters newInstance() {
            return new FollowshipCounters();
        }

        public boolean parseField(FollowshipCounters followshipCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("counters")) {
                return false;
            }
            followshipCounters.counters = FollowshipCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FollowshipCounters followshipCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("counters")) {
                return true;
            }
            return super.parseFieldCheck(followshipCounters, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FollowshipCounters followshipCounters, JsonGenerator jsonGenerator) throws IOException {
            if (followshipCounters.counters != null) {
                jsonGenerator.writeFieldName("counters");
                FollowshipCounter.JSON_ADAPTER.serialize(followshipCounters.counters, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FollowshipCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FollowshipCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FollowshipCounters new_() {
        FollowshipCounters followshipCounters = new FollowshipCounters();
        followshipCounters.nullCheck();
        return followshipCounters;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FollowshipCounters mo223809clone() {
        FollowshipCounters followshipCounters = new FollowshipCounters();
        FollowshipCounter followshipCounter = this.counters;
        if (followshipCounter != null) {
            followshipCounters.counters = followshipCounter.mo223809clone();
        }
        return followshipCounters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FollowshipCounters) {
            return ValueObject.util_equals(this.counters, ((FollowshipCounters) obj).counters);
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
        FollowshipCounter followshipCounter = this.counters;
        int iHashCode = i2 + (followshipCounter != null ? followshipCounter.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.counters == null) {
            this.counters = FollowshipCounter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
