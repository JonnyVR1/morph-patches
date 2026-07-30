package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class FollowshipCounters extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "followshipcounters";

    @NonNull
    @ProtobufIndex(index = 1)
    public FollowshipCounter counters;
    public static ProtobufAdapter<FollowshipCounters> PROTOBUF_ADAPTER = new MessageNanoAdapter<FollowshipCounters>() { // from class: com.p1.mobile.putong.data.FollowshipCounters.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FollowshipCounters followshipCounters) {
            FollowshipCounter followshipCounter = followshipCounters.counters;
            int iL = followshipCounter != null ? CodedOutputByteBufferNano.l(1, followshipCounter, FollowshipCounter.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) followshipCounters).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FollowshipCounters m18109parse(nb5 nb5Var) throws IOException {
            FollowshipCounters followshipCounters = new FollowshipCounters();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (followshipCounters.counters != null) {
                        break;
                    }
                    followshipCounters.counters = FollowshipCounter.new_();
                    break;
                }
                if (iU != 10) {
                    if (followshipCounters.counters != null) {
                        break;
                    }
                    followshipCounters.counters = FollowshipCounter.new_();
                    return followshipCounters;
                }
                followshipCounters.counters = (FollowshipCounter) nb5Var.l(FollowshipCounter.PROTOBUF_ADAPTER);
            }
            return followshipCounters;
        }

        public void serialize(FollowshipCounters followshipCounters, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FollowshipCounter followshipCounter = followshipCounters.counters;
            if (followshipCounter != null) {
                codedOutputByteBufferNano.K(1, followshipCounter, FollowshipCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FollowshipCounters> JSON_ADAPTER = new ObjectJsonAdapter<FollowshipCounters>() { // from class: com.p1.mobile.putong.data.FollowshipCounters.2
        public Class getDataClass() {
            return FollowshipCounters.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FollowshipCounters mo17830newInstance() {
            return new FollowshipCounters();
        }

        public boolean parseField(FollowshipCounters followshipCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("counters")) {
                return false;
            }
            followshipCounters.counters = (FollowshipCounter) FollowshipCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FollowshipCounters followshipCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("counters")) {
                return true;
            }
            return super.parseFieldCheck(followshipCounters, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FollowshipCounters followshipCounters, JsonGenerator jsonGenerator) throws IOException {
            if (followshipCounters.counters != null) {
                jsonGenerator.writeFieldName("counters");
                FollowshipCounter.JSON_ADAPTER.serialize(followshipCounters.counters, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FollowshipCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FollowshipCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FollowshipCounters new_() {
        FollowshipCounters followshipCounters = new FollowshipCounters();
        followshipCounters.nullCheck();
        return followshipCounters;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FollowshipCounters m18108clone() {
        FollowshipCounters followshipCounters = new FollowshipCounters();
        FollowshipCounter followshipCounter = this.counters;
        if (followshipCounter != null) {
            followshipCounters.counters = followshipCounter.m18105clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        FollowshipCounter followshipCounter = this.counters;
        int iHashCode = i2 + (followshipCounter != null ? followshipCounter.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.counters == null) {
            this.counters = FollowshipCounter.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
