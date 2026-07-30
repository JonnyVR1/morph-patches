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
public class NewVisitors extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newvisitors";

    @ProtobufIndex(index = 1)
    public int totalCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Visitor> visitors;
    public static ProtobufAdapter<NewVisitors> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewVisitors>() { // from class: com.p1.mobile.putong.data.NewVisitors.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewVisitors newVisitors) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, newVisitors.totalCount);
            List<Visitor> list = newVisitors.visitors;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            newVisitors.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewVisitors parse(nc5 nc5Var) throws IOException {
            NewVisitors newVisitors = new NewVisitors();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newVisitors.visitors != null) {
                        break;
                    }
                    newVisitors.visitors = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    newVisitors.totalCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (newVisitors.visitors != null) {
                            break;
                        }
                        newVisitors.visitors = new ArrayList();
                        return newVisitors;
                    }
                    newVisitors.visitors = (List) nc5Var.m162488l(Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return newVisitors;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewVisitors newVisitors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, newVisitors.totalCount);
            List<Visitor> list = newVisitors.visitors;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NewVisitors> JSON_ADAPTER = new ObjectJsonAdapter<NewVisitors>() { // from class: com.p1.mobile.putong.data.NewVisitors.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewVisitors.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewVisitors newInstance() {
            return new NewVisitors();
        }

        public boolean parseField(NewVisitors newVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("totalCount")) {
                newVisitors.totalCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(SchemeKey.visitors)) {
                return false;
            }
            newVisitors.visitors = JsonAdapter.parseArray(jsonParser, Visitor.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewVisitors newVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("totalCount") || str.equals(SchemeKey.visitors)) {
                return true;
            }
            return super.parseFieldCheck(newVisitors, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewVisitors newVisitors, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("totalCount", newVisitors.totalCount);
            if (newVisitors.visitors != null) {
                jsonGenerator.writeFieldName(SchemeKey.visitors);
                JsonAdapter.serializeArray(newVisitors.visitors, jsonGenerator, Visitor.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewVisitors new_() {
        NewVisitors newVisitors = new NewVisitors();
        newVisitors.nullCheck();
        return newVisitors;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewVisitors mo225055clone() {
        NewVisitors newVisitors = new NewVisitors();
        newVisitors.totalCount = this.totalCount;
        List<Visitor> list = this.visitors;
        if (list != null) {
            newVisitors.visitors = ValueObject.util_map(list, new qcj() { // from class: l.pq40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Visitor) obj).mo225055clone();
                }
            });
        }
        return newVisitors;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewVisitors)) {
            return false;
        }
        NewVisitors newVisitors = (NewVisitors) obj;
        return this.totalCount == newVisitors.totalCount && ValueObject.util_equals(this.visitors, newVisitors.visitors);
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
