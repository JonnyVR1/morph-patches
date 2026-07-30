package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Visitor;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RecommendVisitors extends DbObject<RecommendVisitors> implements Cloneable, Serializable {
    public static final String TYPE = "recommendvisitors";
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @ProtobufIndex(index = 51)
    public int totalCount;

    @NonNull
    @ProtobufIndex(index = 52)
    public List<Visitor> visitors;
    public static ProtobufAdapter<RecommendVisitors> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecommendVisitors>() { // from class: com.p1.mobile.putong.data.RecommendVisitors.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecommendVisitors recommendVisitors) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) recommendVisitors)._id);
            String str = ((DbObject) recommendVisitors).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            int iH = iJ + CodedOutputByteBufferNano.h(51, recommendVisitors.totalCount);
            List<Visitor> list = recommendVisitors.visitors;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(52, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) recommendVisitors).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecommendVisitors m18881parse(nb5 nb5Var) throws IOException {
            RecommendVisitors recommendVisitors = new RecommendVisitors();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recommendVisitors.visitors != null) {
                        break;
                    }
                    recommendVisitors.visitors = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    ((DbObject) recommendVisitors)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) recommendVisitors).id = nb5Var.s();
                } else if (iU == 408) {
                    recommendVisitors.totalCount = nb5Var.j();
                } else {
                    if (iU != 418) {
                        if (recommendVisitors.visitors != null) {
                            break;
                        }
                        recommendVisitors.visitors = new ArrayList();
                        return recommendVisitors;
                    }
                    recommendVisitors.visitors = (List) nb5Var.l(Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return recommendVisitors;
        }

        public void serialize(RecommendVisitors recommendVisitors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) recommendVisitors)._id);
            String str = ((DbObject) recommendVisitors).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.G(51, recommendVisitors.totalCount);
            List<Visitor> list = recommendVisitors.visitors;
            if (list != null) {
                codedOutputByteBufferNano.K(52, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecommendVisitors> JSON_ADAPTER = new ObjectJsonAdapter<RecommendVisitors>() { // from class: com.p1.mobile.putong.data.RecommendVisitors.2
        public Class getDataClass() {
            return RecommendVisitors.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecommendVisitors mo17830newInstance() {
            return new RecommendVisitors();
        }

        public boolean parseField(RecommendVisitors recommendVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "totalCount":
                    recommendVisitors.totalCount = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    ((DbObject) recommendVisitors).id = jsonParser.getValueAsString();
                    return false;
                case "visitors":
                    recommendVisitors.visitors = JsonAdapter.parseArray(jsonParser, Visitor.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RecommendVisitors recommendVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "totalCount":
                    return true;
                case "id":
                    return false;
                case "visitors":
                    return true;
                default:
                    return super.parseFieldCheck(recommendVisitors, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecommendVisitors recommendVisitors, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) recommendVisitors).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("totalCount", recommendVisitors.totalCount);
            if (recommendVisitors.visitors != null) {
                jsonGenerator.writeFieldName(SchemeKey.visitors);
                JsonAdapter.serializeArray(recommendVisitors.visitors, jsonGenerator, Visitor.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecommendVisitors new_() {
        RecommendVisitors recommendVisitors = new RecommendVisitors();
        recommendVisitors.nullCheck();
        return recommendVisitors;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecommendVisitors m18880clone() {
        RecommendVisitors recommendVisitors = new RecommendVisitors();
        ((DbObject) recommendVisitors)._id = ((DbObject) this)._id;
        ((DbObject) recommendVisitors).id = ((DbObject) this).id;
        recommendVisitors.totalCount = this.totalCount;
        List<Visitor> list = this.visitors;
        if (list != null) {
            recommendVisitors.visitors = ValueObject.util_map(list, new w9j() { // from class: l.cic0
                public final Object call(Object obj) {
                    return ((Visitor) obj).m19328clone();
                }
            });
        }
        return recommendVisitors;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecommendVisitors)) {
            return false;
        }
        RecommendVisitors recommendVisitors = (RecommendVisitors) obj;
        return super.equals(obj) && this.totalCount == recommendVisitors.totalCount && ValueObject.util_equals(this.visitors, recommendVisitors.visitors);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + this.totalCount) * 41;
        List<Visitor> list = this.visitors;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(RecommendVisitors recommendVisitors) {
        if (!shouldMergeData() || equals(recommendVisitors)) {
            return;
        }
        if (!isFieldParsed("totalCount")) {
            this.totalCount = recommendVisitors.totalCount;
        }
        if (!isFieldParsed(SchemeKey.visitors)) {
            this.visitors = recommendVisitors.visitors;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.visitors == null) {
            this.visitors = new ArrayList();
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
