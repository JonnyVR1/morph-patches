package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.UnPrivilegedVisitor;
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
public class VisitorInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitorinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public AllVisitors allVisitors;

    @NonNull
    @ProtobufIndex(index = 5)
    public NewVisitors myVisitors;

    @NonNull
    @ProtobufIndex(index = 2)
    public NewVisitors newVisitors;

    @NonNull
    @ProtobufIndex(index = 6)
    public ODiamondVisitorInfo oDiamondVisitor;

    @NonNull
    @ProtobufIndex(index = 3)
    public RecommendVisitors recommendVisitors;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<UnPrivilegedVisitor> unprivilegedVisitors;
    public static ProtobufAdapter<VisitorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorInfo>() { // from class: com.p1.mobile.putong.data.VisitorInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitorInfo visitorInfo) {
            AllVisitors allVisitors = visitorInfo.allVisitors;
            int iM17285l = allVisitors != null ? CodedOutputByteBufferNano.m17285l(1, allVisitors, AllVisitors.PROTOBUF_ADAPTER) : 0;
            NewVisitors newVisitors = visitorInfo.newVisitors;
            if (newVisitors != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, newVisitors, NewVisitors.PROTOBUF_ADAPTER);
            }
            RecommendVisitors recommendVisitors = visitorInfo.recommendVisitors;
            if (recommendVisitors != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, recommendVisitors, RecommendVisitors.PROTOBUF_ADAPTER);
            }
            List<UnPrivilegedVisitor> list = visitorInfo.unprivilegedVisitors;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, list, UnPrivilegedVisitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            NewVisitors newVisitors2 = visitorInfo.myVisitors;
            if (newVisitors2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, newVisitors2, NewVisitors.PROTOBUF_ADAPTER);
            }
            ODiamondVisitorInfo oDiamondVisitorInfo = visitorInfo.oDiamondVisitor;
            if (oDiamondVisitorInfo != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, oDiamondVisitorInfo, ODiamondVisitorInfo.PROTOBUF_ADAPTER);
            }
            visitorInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitorInfo parse(nc5 nc5Var) throws IOException {
            VisitorInfo visitorInfo = new VisitorInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (visitorInfo.allVisitors == null) {
                        visitorInfo.allVisitors = AllVisitors.new_();
                    }
                    if (visitorInfo.newVisitors == null) {
                        visitorInfo.newVisitors = NewVisitors.new_();
                    }
                    if (visitorInfo.recommendVisitors == null) {
                        visitorInfo.recommendVisitors = RecommendVisitors.new_();
                    }
                    if (visitorInfo.unprivilegedVisitors == null) {
                        visitorInfo.unprivilegedVisitors = new ArrayList();
                    }
                    if (visitorInfo.myVisitors == null) {
                        visitorInfo.myVisitors = NewVisitors.new_();
                    }
                    if (visitorInfo.oDiamondVisitor != null) {
                        break;
                    }
                    visitorInfo.oDiamondVisitor = ODiamondVisitorInfo.new_();
                    break;
                }
                if (iM162497u == 10) {
                    visitorInfo.allVisitors = (AllVisitors) nc5Var.m162488l(AllVisitors.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    visitorInfo.newVisitors = (NewVisitors) nc5Var.m162488l(NewVisitors.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    visitorInfo.recommendVisitors = (RecommendVisitors) nc5Var.m162488l(RecommendVisitors.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    visitorInfo.unprivilegedVisitors = (List) nc5Var.m162488l(UnPrivilegedVisitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    visitorInfo.myVisitors = (NewVisitors) nc5Var.m162488l(NewVisitors.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 50) {
                        if (visitorInfo.allVisitors == null) {
                            visitorInfo.allVisitors = AllVisitors.new_();
                        }
                        if (visitorInfo.newVisitors == null) {
                            visitorInfo.newVisitors = NewVisitors.new_();
                        }
                        if (visitorInfo.recommendVisitors == null) {
                            visitorInfo.recommendVisitors = RecommendVisitors.new_();
                        }
                        if (visitorInfo.unprivilegedVisitors == null) {
                            visitorInfo.unprivilegedVisitors = new ArrayList();
                        }
                        if (visitorInfo.myVisitors == null) {
                            visitorInfo.myVisitors = NewVisitors.new_();
                        }
                        if (visitorInfo.oDiamondVisitor != null) {
                            break;
                        }
                        visitorInfo.oDiamondVisitor = ODiamondVisitorInfo.new_();
                        return visitorInfo;
                    }
                    visitorInfo.oDiamondVisitor = (ODiamondVisitorInfo) nc5Var.m162488l(ODiamondVisitorInfo.PROTOBUF_ADAPTER);
                }
            }
            return visitorInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitorInfo visitorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AllVisitors allVisitors = visitorInfo.allVisitors;
            if (allVisitors != null) {
                codedOutputByteBufferNano.m17309K(1, allVisitors, AllVisitors.PROTOBUF_ADAPTER);
            }
            NewVisitors newVisitors = visitorInfo.newVisitors;
            if (newVisitors != null) {
                codedOutputByteBufferNano.m17309K(2, newVisitors, NewVisitors.PROTOBUF_ADAPTER);
            }
            RecommendVisitors recommendVisitors = visitorInfo.recommendVisitors;
            if (recommendVisitors != null) {
                codedOutputByteBufferNano.m17309K(3, recommendVisitors, RecommendVisitors.PROTOBUF_ADAPTER);
            }
            List<UnPrivilegedVisitor> list = visitorInfo.unprivilegedVisitors;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, UnPrivilegedVisitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            NewVisitors newVisitors2 = visitorInfo.myVisitors;
            if (newVisitors2 != null) {
                codedOutputByteBufferNano.m17309K(5, newVisitors2, NewVisitors.PROTOBUF_ADAPTER);
            }
            ODiamondVisitorInfo oDiamondVisitorInfo = visitorInfo.oDiamondVisitor;
            if (oDiamondVisitorInfo != null) {
                codedOutputByteBufferNano.m17309K(6, oDiamondVisitorInfo, ODiamondVisitorInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VisitorInfo> JSON_ADAPTER = new ObjectJsonAdapter<VisitorInfo>() { // from class: com.p1.mobile.putong.data.VisitorInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitorInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitorInfo newInstance() {
            return new VisitorInfo();
        }

        public boolean parseField(VisitorInfo visitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "newVisitors":
                    visitorInfo.newVisitors = NewVisitors.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "oDiamondVisitor":
                    visitorInfo.oDiamondVisitor = ODiamondVisitorInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "unprivilegedVisitors":
                    visitorInfo.unprivilegedVisitors = JsonAdapter.parseArray(jsonParser, UnPrivilegedVisitor.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "allVisitors":
                    visitorInfo.allVisitors = AllVisitors.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recommendVisitors":
                    visitorInfo.recommendVisitors = RecommendVisitors.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "myVisitors":
                    visitorInfo.myVisitors = NewVisitors.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitorInfo visitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "newVisitors":
                case "oDiamondVisitor":
                case "unprivilegedVisitors":
                case "allVisitors":
                case "recommendVisitors":
                case "myVisitors":
                    return true;
                default:
                    return super.parseFieldCheck(visitorInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitorInfo visitorInfo, JsonGenerator jsonGenerator) throws IOException {
            if (visitorInfo.allVisitors != null) {
                jsonGenerator.writeFieldName("allVisitors");
                AllVisitors.JSON_ADAPTER.serialize(visitorInfo.allVisitors, jsonGenerator, true);
            }
            if (visitorInfo.newVisitors != null) {
                jsonGenerator.writeFieldName("newVisitors");
                NewVisitors.JSON_ADAPTER.serialize(visitorInfo.newVisitors, jsonGenerator, true);
            }
            if (visitorInfo.recommendVisitors != null) {
                jsonGenerator.writeFieldName("recommendVisitors");
                RecommendVisitors.JSON_ADAPTER.serialize(visitorInfo.recommendVisitors, jsonGenerator, true);
            }
            if (visitorInfo.unprivilegedVisitors != null) {
                jsonGenerator.writeFieldName("unprivilegedVisitors");
                JsonAdapter.serializeArray(visitorInfo.unprivilegedVisitors, jsonGenerator, UnPrivilegedVisitor.JSON_ADAPTER);
            }
            if (visitorInfo.myVisitors != null) {
                jsonGenerator.writeFieldName("myVisitors");
                NewVisitors.JSON_ADAPTER.serialize(visitorInfo.myVisitors, jsonGenerator, true);
            }
            if (visitorInfo.oDiamondVisitor != null) {
                jsonGenerator.writeFieldName("oDiamondVisitor");
                ODiamondVisitorInfo.JSON_ADAPTER.serialize(visitorInfo.oDiamondVisitor, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorInfo new_() {
        VisitorInfo visitorInfo = new VisitorInfo();
        visitorInfo.nullCheck();
        return visitorInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitorInfo mo225055clone() {
        VisitorInfo visitorInfo = new VisitorInfo();
        AllVisitors allVisitors = this.allVisitors;
        if (allVisitors != null) {
            visitorInfo.allVisitors = allVisitors.mo225055clone();
        }
        NewVisitors newVisitors = this.newVisitors;
        if (newVisitors != null) {
            visitorInfo.newVisitors = newVisitors.mo225055clone();
        }
        RecommendVisitors recommendVisitors = this.recommendVisitors;
        if (recommendVisitors != null) {
            visitorInfo.recommendVisitors = recommendVisitors.mo225055clone();
        }
        List<UnPrivilegedVisitor> list = this.unprivilegedVisitors;
        if (list != null) {
            visitorInfo.unprivilegedVisitors = ValueObject.util_map(list, new qcj() { // from class: l.bfm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UnPrivilegedVisitor) obj).mo225055clone();
                }
            });
        }
        NewVisitors newVisitors2 = this.myVisitors;
        if (newVisitors2 != null) {
            visitorInfo.myVisitors = newVisitors2.mo225055clone();
        }
        ODiamondVisitorInfo oDiamondVisitorInfo = this.oDiamondVisitor;
        if (oDiamondVisitorInfo != null) {
            visitorInfo.oDiamondVisitor = oDiamondVisitorInfo.mo225055clone();
        }
        return visitorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorInfo)) {
            return false;
        }
        VisitorInfo visitorInfo = (VisitorInfo) obj;
        return ValueObject.util_equals(this.allVisitors, visitorInfo.allVisitors) && ValueObject.util_equals(this.newVisitors, visitorInfo.newVisitors) && ValueObject.util_equals(this.recommendVisitors, visitorInfo.recommendVisitors) && ValueObject.util_equals(this.unprivilegedVisitors, visitorInfo.unprivilegedVisitors) && ValueObject.util_equals(this.myVisitors, visitorInfo.myVisitors) && ValueObject.util_equals(this.oDiamondVisitor, visitorInfo.oDiamondVisitor);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "visitorinfo";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        AllVisitors allVisitors = this.allVisitors;
        int iHashCode = (i2 + (allVisitors != null ? allVisitors.hashCode() : 0)) * 41;
        NewVisitors newVisitors = this.newVisitors;
        int iHashCode2 = (iHashCode + (newVisitors != null ? newVisitors.hashCode() : 0)) * 41;
        RecommendVisitors recommendVisitors = this.recommendVisitors;
        int iHashCode3 = (iHashCode2 + (recommendVisitors != null ? recommendVisitors.hashCode() : 0)) * 41;
        List<UnPrivilegedVisitor> list = this.unprivilegedVisitors;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        NewVisitors newVisitors2 = this.myVisitors;
        int iHashCode5 = (iHashCode4 + (newVisitors2 != null ? newVisitors2.hashCode() : 0)) * 41;
        ODiamondVisitorInfo oDiamondVisitorInfo = this.oDiamondVisitor;
        int iHashCode6 = iHashCode5 + (oDiamondVisitorInfo != null ? oDiamondVisitorInfo.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.allVisitors == null) {
            this.allVisitors = AllVisitors.new_();
        }
        if (this.newVisitors == null) {
            this.newVisitors = NewVisitors.new_();
        }
        if (this.recommendVisitors == null) {
            this.recommendVisitors = RecommendVisitors.new_();
        }
        if (this.unprivilegedVisitors == null) {
            this.unprivilegedVisitors = new ArrayList();
        }
        if (this.myVisitors == null) {
            this.myVisitors = NewVisitors.new_();
        }
        if (this.oDiamondVisitor == null) {
            this.oDiamondVisitor = ODiamondVisitorInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
