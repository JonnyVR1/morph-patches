package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecommendVisitors recommendVisitors) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, recommendVisitors._id);
            String str = recommendVisitors.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17226h = iM17228j + CodedOutputByteBufferNano.m17226h(51, recommendVisitors.totalCount);
            List<Visitor> list = recommendVisitors.visitors;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(52, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            recommendVisitors.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecommendVisitors parse(nb5 nb5Var) throws IOException {
            RecommendVisitors recommendVisitors = new RecommendVisitors();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (recommendVisitors.visitors != null) {
                        break;
                    }
                    recommendVisitors.visitors = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    recommendVisitors._id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    recommendVisitors.f56011id = nb5Var.m158750s();
                } else if (iM158752u == 408) {
                    recommendVisitors.totalCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 418) {
                        if (recommendVisitors.visitors != null) {
                            break;
                        }
                        recommendVisitors.visitors = new ArrayList();
                        return recommendVisitors;
                    }
                    recommendVisitors.visitors = (List) nb5Var.m158743l(Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return recommendVisitors;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecommendVisitors recommendVisitors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, recommendVisitors._id);
            String str = recommendVisitors.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17250G(51, recommendVisitors.totalCount);
            List<Visitor> list = recommendVisitors.visitors;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(52, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecommendVisitors> JSON_ADAPTER = new ObjectJsonAdapter<RecommendVisitors>() { // from class: com.p1.mobile.putong.data.RecommendVisitors.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecommendVisitors.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecommendVisitors newInstance() {
            return new RecommendVisitors();
        }

        public boolean parseField(RecommendVisitors recommendVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "totalCount":
                    recommendVisitors.totalCount = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    recommendVisitors.f56011id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecommendVisitors recommendVisitors, JsonGenerator jsonGenerator) throws IOException {
            String str = recommendVisitors.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("totalCount", recommendVisitors.totalCount);
            if (recommendVisitors.visitors != null) {
                jsonGenerator.writeFieldName(SchemeKey.visitors);
                JsonAdapter.serializeArray(recommendVisitors.visitors, jsonGenerator, Visitor.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecommendVisitors new_() {
        RecommendVisitors recommendVisitors = new RecommendVisitors();
        recommendVisitors.nullCheck();
        return recommendVisitors;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecommendVisitors mo223809clone() {
        RecommendVisitors recommendVisitors = new RecommendVisitors();
        recommendVisitors._id = this._id;
        recommendVisitors.f56011id = this.f56011id;
        recommendVisitors.totalCount = this.totalCount;
        List<Visitor> list = this.visitors;
        if (list != null) {
            recommendVisitors.visitors = ValueObject.util_map(list, new w9j() { // from class: l.cic0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Visitor) obj).mo223809clone();
                }
            });
        }
        return recommendVisitors;
    }

    @Override // com.tantanapp.common.data.DbObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + this.totalCount) * 41;
        List<Visitor> list = this.visitors;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.visitors == null) {
            this.visitors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
