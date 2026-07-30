package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.RecommendPrefetch;
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
public class RecommendPrefetch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recommendprefetch";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> abGroups;

    @ProtobufIndex(index = 1)
    public long prefetch;
    public static ProtobufAdapter<RecommendPrefetch> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecommendPrefetch>() { // from class: com.p1.mobile.putong.data.RecommendPrefetch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecommendPrefetch recommendPrefetch) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, recommendPrefetch.prefetch);
            List<String> list = recommendPrefetch.abGroups;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            recommendPrefetch.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecommendPrefetch parse(nc5 nc5Var) throws IOException {
            RecommendPrefetch recommendPrefetch = new RecommendPrefetch();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (recommendPrefetch.abGroups != null) {
                        break;
                    }
                    recommendPrefetch.abGroups = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    recommendPrefetch.prefetch = nc5Var.m162487k();
                } else {
                    if (iM162497u != 18) {
                        if (recommendPrefetch.abGroups != null) {
                            break;
                        }
                        recommendPrefetch.abGroups = new ArrayList();
                        return recommendPrefetch;
                    }
                    recommendPrefetch.abGroups = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return recommendPrefetch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecommendPrefetch recommendPrefetch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, recommendPrefetch.prefetch);
            List<String> list = recommendPrefetch.abGroups;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecommendPrefetch> JSON_ADAPTER = new ObjectJsonAdapter<RecommendPrefetch>() { // from class: com.p1.mobile.putong.data.RecommendPrefetch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecommendPrefetch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecommendPrefetch newInstance() {
            return new RecommendPrefetch();
        }

        public boolean parseField(RecommendPrefetch recommendPrefetch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("prefetch")) {
                recommendPrefetch.prefetch = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("abGroups")) {
                return false;
            }
            recommendPrefetch.abGroups = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RecommendPrefetch recommendPrefetch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("prefetch") || str.equals("abGroups")) {
                return true;
            }
            return super.parseFieldCheck(recommendPrefetch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecommendPrefetch recommendPrefetch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("prefetch", recommendPrefetch.prefetch);
            if (recommendPrefetch.abGroups != null) {
                jsonGenerator.writeFieldName("abGroups");
                JsonAdapter.serializeArray(recommendPrefetch.abGroups, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendPrefetch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendPrefetch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61245a(String str) {
        return str;
    }

    public static RecommendPrefetch new_() {
        RecommendPrefetch recommendPrefetch = new RecommendPrefetch();
        recommendPrefetch.nullCheck();
        return recommendPrefetch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecommendPrefetch mo225055clone() {
        RecommendPrefetch recommendPrefetch = new RecommendPrefetch();
        recommendPrefetch.prefetch = this.prefetch;
        List<String> list = this.abGroups;
        if (list != null) {
            recommendPrefetch.abGroups = ValueObject.util_map(list, new qcj() { // from class: l.cqc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return RecommendPrefetch.m61245a((String) obj);
                }
            });
        }
        return recommendPrefetch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecommendPrefetch)) {
            return false;
        }
        RecommendPrefetch recommendPrefetch = (RecommendPrefetch) obj;
        return this.prefetch == recommendPrefetch.prefetch && ValueObject.util_equals(this.abGroups, recommendPrefetch.abGroups);
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
        long j = this.prefetch;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        List<String> list = this.abGroups;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.abGroups == null) {
            this.abGroups = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
