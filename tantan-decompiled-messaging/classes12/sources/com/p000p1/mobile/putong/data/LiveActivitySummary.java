package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.LiveActivitySummary;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveActivitySummary extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveactivitysummary";

    @Nullable
    @ProtobufIndex(index = 3)
    public LiveActivitySummaryCounters counters;

    @NonNull
    @ProtobufIndex(index = 2)
    public LiveActivityDesc description;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f229id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> ongoingLiveIds;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;
    public static ProtobufAdapter<LiveActivitySummary> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveActivitySummary>() { // from class: com.p1.mobile.putong.data.LiveActivitySummary.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveActivitySummary liveActivitySummary) {
            int iH = CodedOutputByteBufferNano.h(1, liveActivitySummary.f229id);
            LiveActivityDesc liveActivityDesc = liveActivitySummary.description;
            if (liveActivityDesc != null) {
                iH += CodedOutputByteBufferNano.l(2, liveActivityDesc, LiveActivityDesc.PROTOBUF_ADAPTER);
            }
            LiveActivitySummaryCounters liveActivitySummaryCounters = liveActivitySummary.counters;
            if (liveActivitySummaryCounters != null) {
                iH += CodedOutputByteBufferNano.l(3, liveActivitySummaryCounters, LiveActivitySummaryCounters.PROTOBUF_ADAPTER);
            }
            List<String> list = liveActivitySummary.ongoingLiveIds;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = liveActivitySummary.type;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(5, str);
            }
            ((MessageNano) liveActivitySummary).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveActivitySummary m18316parse(nb5 nb5Var) throws IOException {
            LiveActivitySummary liveActivitySummary = new LiveActivitySummary();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveActivitySummary.description == null) {
                        liveActivitySummary.description = LiveActivityDesc.new_();
                    }
                    if (liveActivitySummary.ongoingLiveIds == null) {
                        liveActivitySummary.ongoingLiveIds = new ArrayList();
                    }
                    if (liveActivitySummary.type != null) {
                        break;
                    }
                    liveActivitySummary.type = "";
                    break;
                }
                if (iU == 8) {
                    liveActivitySummary.f229id = nb5Var.j();
                } else if (iU == 18) {
                    liveActivitySummary.description = (LiveActivityDesc) nb5Var.l(LiveActivityDesc.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    liveActivitySummary.counters = (LiveActivitySummaryCounters) nb5Var.l(LiveActivitySummaryCounters.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    liveActivitySummary.ongoingLiveIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 42) {
                        if (liveActivitySummary.description == null) {
                            liveActivitySummary.description = LiveActivityDesc.new_();
                        }
                        if (liveActivitySummary.ongoingLiveIds == null) {
                            liveActivitySummary.ongoingLiveIds = new ArrayList();
                        }
                        if (liveActivitySummary.type != null) {
                            break;
                        }
                        liveActivitySummary.type = "";
                        return liveActivitySummary;
                    }
                    liveActivitySummary.type = nb5Var.s();
                }
            }
            return liveActivitySummary;
        }

        public void serialize(LiveActivitySummary liveActivitySummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, liveActivitySummary.f229id);
            LiveActivityDesc liveActivityDesc = liveActivitySummary.description;
            if (liveActivityDesc != null) {
                codedOutputByteBufferNano.K(2, liveActivityDesc, LiveActivityDesc.PROTOBUF_ADAPTER);
            }
            LiveActivitySummaryCounters liveActivitySummaryCounters = liveActivitySummary.counters;
            if (liveActivitySummaryCounters != null) {
                codedOutputByteBufferNano.K(3, liveActivitySummaryCounters, LiveActivitySummaryCounters.PROTOBUF_ADAPTER);
            }
            List<String> list = liveActivitySummary.ongoingLiveIds;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = liveActivitySummary.type;
            if (str != null) {
                codedOutputByteBufferNano.R(5, str);
            }
        }
    };
    public static JsonAdapter<LiveActivitySummary> JSON_ADAPTER = new ObjectJsonAdapter<LiveActivitySummary>() { // from class: com.p1.mobile.putong.data.LiveActivitySummary.2
        public Class getDataClass() {
            return LiveActivitySummary.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveActivitySummary mo17830newInstance() {
            return new LiveActivitySummary();
        }

        public boolean parseField(LiveActivitySummary liveActivitySummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    liveActivitySummary.description = (LiveActivityDesc) LiveActivityDesc.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "counters":
                    liveActivitySummary.counters = (LiveActivitySummaryCounters) LiveActivitySummaryCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    liveActivitySummary.f229id = jsonParser.getValueAsInt();
                    return false;
                case "type":
                    liveActivitySummary.type = jsonParser.getValueAsString();
                    return true;
                case "ongoingLiveIds":
                    liveActivitySummary.ongoingLiveIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveActivitySummary liveActivitySummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "counters":
                    return true;
                case "id":
                    return false;
                case "type":
                case "ongoingLiveIds":
                    return true;
                default:
                    return super.parseFieldCheck(liveActivitySummary, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveActivitySummary liveActivitySummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", liveActivitySummary.f229id);
            if (liveActivitySummary.description != null) {
                jsonGenerator.writeFieldName("description");
                LiveActivityDesc.JSON_ADAPTER.serialize(liveActivitySummary.description, jsonGenerator, true);
            }
            if (liveActivitySummary.counters != null) {
                jsonGenerator.writeFieldName("counters");
                LiveActivitySummaryCounters.JSON_ADAPTER.serialize(liveActivitySummary.counters, jsonGenerator, true);
            }
            if (liveActivitySummary.ongoingLiveIds != null) {
                jsonGenerator.writeFieldName("ongoingLiveIds");
                JsonAdapter.serializeArray(liveActivitySummary.ongoingLiveIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = liveActivitySummary.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveActivitySummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveActivitySummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m748a(String str) {
        return str;
    }

    public static LiveActivitySummary new_() {
        LiveActivitySummary liveActivitySummary = new LiveActivitySummary();
        liveActivitySummary.nullCheck();
        return liveActivitySummary;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveActivitySummary m18315clone() {
        LiveActivitySummary liveActivitySummary = new LiveActivitySummary();
        liveActivitySummary.f229id = this.f229id;
        LiveActivityDesc liveActivityDesc = this.description;
        if (liveActivityDesc != null) {
            liveActivitySummary.description = liveActivityDesc.m18312clone();
        }
        LiveActivitySummaryCounters liveActivitySummaryCounters = this.counters;
        if (liveActivitySummaryCounters != null) {
            liveActivitySummary.counters = liveActivitySummaryCounters.m18318clone();
        }
        List<String> list = this.ongoingLiveIds;
        if (list != null) {
            liveActivitySummary.ongoingLiveIds = ValueObject.util_map(list, new w9j() { // from class: l.hsr
                public final Object call(Object obj) {
                    return LiveActivitySummary.m748a((String) obj);
                }
            });
        }
        liveActivitySummary.type = this.type;
        return liveActivitySummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveActivitySummary)) {
            return false;
        }
        LiveActivitySummary liveActivitySummary = (LiveActivitySummary) obj;
        return this.f229id == liveActivitySummary.f229id && ValueObject.util_equals(this.description, liveActivitySummary.description) && ValueObject.util_equals(this.counters, liveActivitySummary.counters) && ValueObject.util_equals(this.ongoingLiveIds, liveActivitySummary.ongoingLiveIds) && ValueObject.util_equals(this.type, liveActivitySummary.type);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f229id) * 41;
        LiveActivityDesc liveActivityDesc = this.description;
        int iHashCode = (i2 + (liveActivityDesc != null ? liveActivityDesc.hashCode() : 0)) * 41;
        LiveActivitySummaryCounters liveActivitySummaryCounters = this.counters;
        int iHashCode2 = (iHashCode + (liveActivitySummaryCounters != null ? liveActivitySummaryCounters.hashCode() : 0)) * 41;
        List<String> list = this.ongoingLiveIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.description == null) {
            this.description = LiveActivityDesc.new_();
        }
        if (this.ongoingLiveIds == null) {
            this.ongoingLiveIds = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
