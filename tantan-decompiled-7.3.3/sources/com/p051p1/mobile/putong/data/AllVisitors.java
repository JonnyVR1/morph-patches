package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Visitor;
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
public class AllVisitors extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "allvisitors";

    @ProtobufIndex(index = 1)
    public int totalCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Visitor> visitors;
    public static ProtobufAdapter<AllVisitors> PROTOBUF_ADAPTER = new MessageNanoAdapter<AllVisitors>() { // from class: com.p1.mobile.putong.data.AllVisitors.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AllVisitors allVisitors) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, allVisitors.totalCount);
            List<Visitor> list = allVisitors.visitors;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            allVisitors.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AllVisitors parse(nc5 nc5Var) throws IOException {
            AllVisitors allVisitors = new AllVisitors();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (allVisitors.visitors != null) {
                        break;
                    }
                    allVisitors.visitors = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    allVisitors.totalCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (allVisitors.visitors != null) {
                            break;
                        }
                        allVisitors.visitors = new ArrayList();
                        return allVisitors;
                    }
                    allVisitors.visitors = (List) nc5Var.m162488l(Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return allVisitors;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AllVisitors allVisitors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, allVisitors.totalCount);
            List<Visitor> list = allVisitors.visitors;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AllVisitors> JSON_ADAPTER = new ObjectJsonAdapter<AllVisitors>() { // from class: com.p1.mobile.putong.data.AllVisitors.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AllVisitors.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AllVisitors newInstance() {
            return new AllVisitors();
        }

        public boolean parseField(AllVisitors allVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("totalCount")) {
                allVisitors.totalCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(SchemeKey.visitors)) {
                return false;
            }
            allVisitors.visitors = JsonAdapter.parseArray(jsonParser, Visitor.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AllVisitors allVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("totalCount") || str.equals(SchemeKey.visitors)) {
                return true;
            }
            return super.parseFieldCheck(allVisitors, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AllVisitors allVisitors, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("totalCount", allVisitors.totalCount);
            if (allVisitors.visitors != null) {
                jsonGenerator.writeFieldName(SchemeKey.visitors);
                JsonAdapter.serializeArray(allVisitors.visitors, jsonGenerator, Visitor.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AllVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AllVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AllVisitors new_() {
        AllVisitors allVisitors = new AllVisitors();
        allVisitors.nullCheck();
        return allVisitors;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AllVisitors mo225055clone() {
        AllVisitors allVisitors = new AllVisitors();
        allVisitors.totalCount = this.totalCount;
        List<Visitor> list = this.visitors;
        if (list != null) {
            allVisitors.visitors = ValueObject.util_map(list, new qcj() { // from class: l.mj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Visitor) obj).mo225055clone();
                }
            });
        }
        return allVisitors;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllVisitors)) {
            return false;
        }
        AllVisitors allVisitors = (AllVisitors) obj;
        return this.totalCount == allVisitors.totalCount && ValueObject.util_equals(this.visitors, allVisitors.visitors);
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
        int i2 = ((i * 41) + this.totalCount) * 41;
        List<Visitor> list = this.visitors;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.visitors == null) {
            this.visitors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
