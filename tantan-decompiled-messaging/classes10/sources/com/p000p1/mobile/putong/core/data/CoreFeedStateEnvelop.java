package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class CoreFeedStateEnvelop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "corefeedstateenvelop";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public CoreFeedStateCounters counters;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<CoreFeedStateEnvelop> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreFeedStateEnvelop>() { // from class: com.p1.mobile.putong.core.data.CoreFeedStateEnvelop.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreFeedStateEnvelop coreFeedStateEnvelop) {
            Meta meta = coreFeedStateEnvelop.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            CoreFeedStateCounters coreFeedStateCounters = coreFeedStateEnvelop.counters;
            if (coreFeedStateCounters != null) {
                iL += CodedOutputByteBufferNano.l(2, coreFeedStateCounters, CoreFeedStateCounters.PROTOBUF_ADAPTER);
            }
            ((MessageNano) coreFeedStateEnvelop).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreFeedStateEnvelop m12477parse(nb5 nb5Var) throws IOException {
            CoreFeedStateEnvelop coreFeedStateEnvelop = new CoreFeedStateEnvelop();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (coreFeedStateEnvelop.meta == null) {
                        coreFeedStateEnvelop.meta = Meta.new_();
                    }
                    if (coreFeedStateEnvelop.counters != null) {
                        break;
                    }
                    coreFeedStateEnvelop.counters = CoreFeedStateCounters.new_();
                    break;
                }
                if (iU == 10) {
                    coreFeedStateEnvelop.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (coreFeedStateEnvelop.meta == null) {
                            coreFeedStateEnvelop.meta = Meta.new_();
                        }
                        if (coreFeedStateEnvelop.counters != null) {
                            break;
                        }
                        coreFeedStateEnvelop.counters = CoreFeedStateCounters.new_();
                        return coreFeedStateEnvelop;
                    }
                    coreFeedStateEnvelop.counters = (CoreFeedStateCounters) nb5Var.l(CoreFeedStateCounters.PROTOBUF_ADAPTER);
                }
            }
            return coreFeedStateEnvelop;
        }

        public void serialize(CoreFeedStateEnvelop coreFeedStateEnvelop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = coreFeedStateEnvelop.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            CoreFeedStateCounters coreFeedStateCounters = coreFeedStateEnvelop.counters;
            if (coreFeedStateCounters != null) {
                codedOutputByteBufferNano.K(2, coreFeedStateCounters, CoreFeedStateCounters.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CoreFeedStateEnvelop> JSON_ADAPTER = new ObjectJsonAdapter<CoreFeedStateEnvelop>() { // from class: com.p1.mobile.putong.core.data.CoreFeedStateEnvelop.2
        public Class getDataClass() {
            return CoreFeedStateEnvelop.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreFeedStateEnvelop m12478newInstance() {
            return new CoreFeedStateEnvelop();
        }

        public boolean parseField(CoreFeedStateEnvelop coreFeedStateEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("counters")) {
                coreFeedStateEnvelop.counters = (CoreFeedStateCounters) CoreFeedStateCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            coreFeedStateEnvelop.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CoreFeedStateEnvelop coreFeedStateEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("counters") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(coreFeedStateEnvelop, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CoreFeedStateEnvelop coreFeedStateEnvelop, JsonGenerator jsonGenerator) throws IOException {
            if (coreFeedStateEnvelop.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(coreFeedStateEnvelop.meta, jsonGenerator, true);
            }
            if (coreFeedStateEnvelop.counters != null) {
                jsonGenerator.writeFieldName("counters");
                CoreFeedStateCounters.JSON_ADAPTER.serialize(coreFeedStateEnvelop.counters, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreFeedStateEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreFeedStateEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreFeedStateEnvelop new_() {
        CoreFeedStateEnvelop coreFeedStateEnvelop = new CoreFeedStateEnvelop();
        coreFeedStateEnvelop.nullCheck();
        return coreFeedStateEnvelop;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreFeedStateEnvelop m12476clone() {
        CoreFeedStateEnvelop coreFeedStateEnvelop = new CoreFeedStateEnvelop();
        Meta meta = this.meta;
        if (meta != null) {
            coreFeedStateEnvelop.meta = meta.clone();
        }
        CoreFeedStateCounters coreFeedStateCounters = this.counters;
        if (coreFeedStateCounters != null) {
            coreFeedStateEnvelop.counters = coreFeedStateCounters.m12472clone();
        }
        return coreFeedStateEnvelop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreFeedStateEnvelop)) {
            return false;
        }
        CoreFeedStateEnvelop coreFeedStateEnvelop = (CoreFeedStateEnvelop) obj;
        return ValueObject.util_equals(this.meta, coreFeedStateEnvelop.meta) && ValueObject.util_equals(this.counters, coreFeedStateEnvelop.counters);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        CoreFeedStateCounters coreFeedStateCounters = this.counters;
        int iHashCode2 = iHashCode + (coreFeedStateCounters != null ? coreFeedStateCounters.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.counters == null) {
            this.counters = CoreFeedStateCounters.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
