package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.LiveActivitySummary;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
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
    public int f39616id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> ongoingLiveIds;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;
    public static ProtobufAdapter<LiveActivitySummary> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveActivitySummary>() { // from class: com.p1.mobile.putong.data.LiveActivitySummary.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveActivitySummary liveActivitySummary) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, liveActivitySummary.f39616id);
            LiveActivityDesc liveActivityDesc = liveActivitySummary.description;
            if (liveActivityDesc != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, liveActivityDesc, LiveActivityDesc.PROTOBUF_ADAPTER);
            }
            LiveActivitySummaryCounters liveActivitySummaryCounters = liveActivitySummary.counters;
            if (liveActivitySummaryCounters != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, liveActivitySummaryCounters, LiveActivitySummaryCounters.PROTOBUF_ADAPTER);
            }
            List<String> list = liveActivitySummary.ongoingLiveIds;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = liveActivitySummary.type;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str);
            }
            liveActivitySummary.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveActivitySummary parse(nc5 nc5Var) throws IOException {
            LiveActivitySummary liveActivitySummary = new LiveActivitySummary();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    liveActivitySummary.f39616id = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    liveActivitySummary.description = (LiveActivityDesc) nc5Var.m162488l(LiveActivityDesc.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    liveActivitySummary.counters = (LiveActivitySummaryCounters) nc5Var.m162488l(LiveActivitySummaryCounters.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    liveActivitySummary.ongoingLiveIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 42) {
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
                    liveActivitySummary.type = nc5Var.m162495s();
                }
            }
            return liveActivitySummary;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveActivitySummary liveActivitySummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, liveActivitySummary.f39616id);
            LiveActivityDesc liveActivityDesc = liveActivitySummary.description;
            if (liveActivityDesc != null) {
                codedOutputByteBufferNano.m17309K(2, liveActivityDesc, LiveActivityDesc.PROTOBUF_ADAPTER);
            }
            LiveActivitySummaryCounters liveActivitySummaryCounters = liveActivitySummary.counters;
            if (liveActivitySummaryCounters != null) {
                codedOutputByteBufferNano.m17309K(3, liveActivitySummaryCounters, LiveActivitySummaryCounters.PROTOBUF_ADAPTER);
            }
            List<String> list = liveActivitySummary.ongoingLiveIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = liveActivitySummary.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(5, str);
            }
        }
    };
    public static JsonAdapter<LiveActivitySummary> JSON_ADAPTER = new ObjectJsonAdapter<LiveActivitySummary>() { // from class: com.p1.mobile.putong.data.LiveActivitySummary.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveActivitySummary.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveActivitySummary newInstance() {
            return new LiveActivitySummary();
        }

        public boolean parseField(LiveActivitySummary liveActivitySummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    liveActivitySummary.description = LiveActivityDesc.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "counters":
                    liveActivitySummary.counters = LiveActivitySummaryCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    liveActivitySummary.f39616id = jsonParser.getValueAsInt();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveActivitySummary liveActivitySummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", liveActivitySummary.f39616id);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveActivitySummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveActivitySummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61014a(String str) {
        return str;
    }

    public static LiveActivitySummary new_() {
        LiveActivitySummary liveActivitySummary = new LiveActivitySummary();
        liveActivitySummary.nullCheck();
        return liveActivitySummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveActivitySummary mo225055clone() {
        LiveActivitySummary liveActivitySummary = new LiveActivitySummary();
        liveActivitySummary.f39616id = this.f39616id;
        LiveActivityDesc liveActivityDesc = this.description;
        if (liveActivityDesc != null) {
            liveActivitySummary.description = liveActivityDesc.mo225055clone();
        }
        LiveActivitySummaryCounters liveActivitySummaryCounters = this.counters;
        if (liveActivitySummaryCounters != null) {
            liveActivitySummary.counters = liveActivitySummaryCounters.mo225055clone();
        }
        List<String> list = this.ongoingLiveIds;
        if (list != null) {
            liveActivitySummary.ongoingLiveIds = ValueObject.util_map(list, new qcj() { // from class: l.iur
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveActivitySummary.m61014a((String) obj);
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
        return this.f39616id == liveActivitySummary.f39616id && ValueObject.util_equals(this.description, liveActivitySummary.description) && ValueObject.util_equals(this.counters, liveActivitySummary.counters) && ValueObject.util_equals(this.ongoingLiveIds, liveActivitySummary.ongoingLiveIds) && ValueObject.util_equals(this.type, liveActivitySummary.type);
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
        int i2 = ((i * 41) + this.f39616id) * 41;
        LiveActivityDesc liveActivityDesc = this.description;
        int iHashCode = (i2 + (liveActivityDesc != null ? liveActivityDesc.hashCode() : 0)) * 41;
        LiveActivitySummaryCounters liveActivitySummaryCounters = this.counters;
        int iHashCode2 = (iHashCode + (liveActivitySummaryCounters != null ? liveActivitySummaryCounters.hashCode() : 0)) * 41;
        List<String> list = this.ongoingLiveIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
