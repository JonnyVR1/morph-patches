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
public class NewVisitors extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newvisitors";

    @ProtobufIndex(index = 1)
    public int totalCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Visitor> visitors;
    public static ProtobufAdapter<NewVisitors> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewVisitors>() { // from class: com.p1.mobile.putong.data.NewVisitors.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewVisitors newVisitors) {
            int iH = CodedOutputByteBufferNano.h(1, newVisitors.totalCount);
            List<Visitor> list = newVisitors.visitors;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) newVisitors).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewVisitors m18543parse(nb5 nb5Var) throws IOException {
            NewVisitors newVisitors = new NewVisitors();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newVisitors.visitors != null) {
                        break;
                    }
                    newVisitors.visitors = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    newVisitors.totalCount = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (newVisitors.visitors != null) {
                            break;
                        }
                        newVisitors.visitors = new ArrayList();
                        return newVisitors;
                    }
                    newVisitors.visitors = (List) nb5Var.l(Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return newVisitors;
        }

        public void serialize(NewVisitors newVisitors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, newVisitors.totalCount);
            List<Visitor> list = newVisitors.visitors;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Visitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NewVisitors> JSON_ADAPTER = new ObjectJsonAdapter<NewVisitors>() { // from class: com.p1.mobile.putong.data.NewVisitors.2
        public Class getDataClass() {
            return NewVisitors.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NewVisitors mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewVisitors newVisitors, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("totalCount", newVisitors.totalCount);
            if (newVisitors.visitors != null) {
                jsonGenerator.writeFieldName(SchemeKey.visitors);
                JsonAdapter.serializeArray(newVisitors.visitors, jsonGenerator, Visitor.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewVisitors new_() {
        NewVisitors newVisitors = new NewVisitors();
        newVisitors.nullCheck();
        return newVisitors;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewVisitors m18542clone() {
        NewVisitors newVisitors = new NewVisitors();
        newVisitors.totalCount = this.totalCount;
        List<Visitor> list = this.visitors;
        if (list != null) {
            newVisitors.visitors = ValueObject.util_map(list, new w9j() { // from class: l.bi40
                public final Object call(Object obj) {
                    return ((Visitor) obj).m19328clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.totalCount) * 41;
        List<Visitor> list = this.visitors;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.visitors == null) {
            this.visitors = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
