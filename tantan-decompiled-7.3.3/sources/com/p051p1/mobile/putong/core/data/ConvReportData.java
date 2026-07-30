package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ConvReportData;
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

/* JADX INFO: loaded from: classes10.dex */
public class ConvReportData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convreportdata";

    @ProtobufIndex(index = 1)
    public int requestCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> requestList;
    public static ProtobufAdapter<ConvReportData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvReportData>() { // from class: com.p1.mobile.putong.core.data.ConvReportData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConvReportData convReportData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, convReportData.requestCount);
            List<String> list = convReportData.requestList;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            convReportData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConvReportData parse(nc5 nc5Var) throws IOException {
            ConvReportData convReportData = new ConvReportData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (convReportData.requestList != null) {
                        break;
                    }
                    convReportData.requestList = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    convReportData.requestCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (convReportData.requestList != null) {
                            break;
                        }
                        convReportData.requestList = new ArrayList();
                        return convReportData;
                    }
                    convReportData.requestList = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return convReportData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConvReportData convReportData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, convReportData.requestCount);
            List<String> list = convReportData.requestList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ConvReportData> JSON_ADAPTER = new ObjectJsonAdapter<ConvReportData>() { // from class: com.p1.mobile.putong.core.data.ConvReportData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConvReportData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConvReportData newInstance() {
            return new ConvReportData();
        }

        public boolean parseField(ConvReportData convReportData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("requestList")) {
                convReportData.requestList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("requestCount")) {
                return false;
            }
            convReportData.requestCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ConvReportData convReportData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("requestList") || str.equals("requestCount")) {
                return true;
            }
            return super.parseFieldCheck(convReportData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConvReportData convReportData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("requestCount", convReportData.requestCount);
            if (convReportData.requestList != null) {
                jsonGenerator.writeFieldName("requestList");
                JsonAdapter.serializeArray(convReportData.requestList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvReportData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvReportData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36295a(String str) {
        return str;
    }

    public static ConvReportData new_() {
        ConvReportData convReportData = new ConvReportData();
        convReportData.nullCheck();
        return convReportData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConvReportData mo225055clone() {
        ConvReportData convReportData = new ConvReportData();
        convReportData.requestCount = this.requestCount;
        List<String> list = this.requestList;
        if (list != null) {
            convReportData.requestList = ValueObject.util_map(list, new qcj() { // from class: l.q46
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ConvReportData.m36295a((String) obj);
                }
            });
        }
        return convReportData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConvReportData)) {
            return false;
        }
        ConvReportData convReportData = (ConvReportData) obj;
        return this.requestCount == convReportData.requestCount && ValueObject.util_equals(this.requestList, convReportData.requestList);
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
        int i2 = ((i * 41) + this.requestCount) * 41;
        List<String> list = this.requestList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.requestList == null) {
            this.requestList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
