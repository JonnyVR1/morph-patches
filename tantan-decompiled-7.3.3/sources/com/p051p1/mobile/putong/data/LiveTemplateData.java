package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.LiveTemplateData;
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
public class LiveTemplateData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livetemplatedata";

    @NonNull
    @ProtobufIndex(index = 52)
    public List<String> fields;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 51)
    public int f39624id;
    public static ProtobufAdapter<LiveTemplateData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveTemplateData>() { // from class: com.p1.mobile.putong.data.LiveTemplateData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveTemplateData liveTemplateData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(51, liveTemplateData.f39624id);
            List<String> list = liveTemplateData.fields;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(52, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            liveTemplateData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveTemplateData parse(nc5 nc5Var) throws IOException {
            LiveTemplateData liveTemplateData = new LiveTemplateData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveTemplateData.fields != null) {
                        break;
                    }
                    liveTemplateData.fields = new ArrayList();
                    break;
                }
                if (iM162497u == 408) {
                    liveTemplateData.f39624id = nc5Var.m162486j();
                } else {
                    if (iM162497u != 418) {
                        if (liveTemplateData.fields != null) {
                            break;
                        }
                        liveTemplateData.fields = new ArrayList();
                        return liveTemplateData;
                    }
                    liveTemplateData.fields = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return liveTemplateData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveTemplateData liveTemplateData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(51, liveTemplateData.f39624id);
            List<String> list = liveTemplateData.fields;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(52, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveTemplateData> JSON_ADAPTER = new ObjectJsonAdapter<LiveTemplateData>() { // from class: com.p1.mobile.putong.data.LiveTemplateData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveTemplateData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveTemplateData newInstance() {
            return new LiveTemplateData();
        }

        public boolean parseField(LiveTemplateData liveTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("fields")) {
                liveTemplateData.fields = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            liveTemplateData.f39624id = jsonParser.getValueAsInt();
            return false;
        }

        public boolean parseFieldCheck(LiveTemplateData liveTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("fields")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(liveTemplateData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveTemplateData liveTemplateData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", liveTemplateData.f39624id);
            if (liveTemplateData.fields != null) {
                jsonGenerator.writeFieldName("fields");
                JsonAdapter.serializeArray(liveTemplateData.fields, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61026a(String str) {
        return str;
    }

    public static LiveTemplateData new_() {
        LiveTemplateData liveTemplateData = new LiveTemplateData();
        liveTemplateData.nullCheck();
        return liveTemplateData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveTemplateData mo225055clone() {
        LiveTemplateData liveTemplateData = new LiveTemplateData();
        liveTemplateData.f39624id = this.f39624id;
        List<String> list = this.fields;
        if (list != null) {
            liveTemplateData.fields = ValueObject.util_map(list, new qcj() { // from class: l.edu
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveTemplateData.m61026a((String) obj);
                }
            });
        }
        return liveTemplateData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveTemplateData)) {
            return false;
        }
        LiveTemplateData liveTemplateData = (LiveTemplateData) obj;
        return this.f39624id == liveTemplateData.f39624id && ValueObject.util_equals(this.fields, liveTemplateData.fields);
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
        int i2 = ((i * 41) + this.f39624id) * 41;
        List<String> list = this.fields;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fields == null) {
            this.fields = new ArrayList();
        }
    }

    public LiveTemplateData subtract(LiveTemplateData liveTemplateData) {
        LiveTemplateData liveTemplateData2 = new LiveTemplateData();
        if (!ValueObject.util_equals(this.fields, liveTemplateData.fields)) {
            liveTemplateData2.fields = this.fields;
        }
        if (liveTemplateData2.equals(new LiveTemplateData())) {
            return null;
        }
        return liveTemplateData2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
