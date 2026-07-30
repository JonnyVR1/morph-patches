package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ConvReportData;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ConvReportData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convreportdata";

    @ProtobufIndex(index = 1)
    public int requestCount;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> requestList;
    public static ProtobufAdapter<ConvReportData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvReportData>() { // from class: com.p1.mobile.putong.core.data.ConvReportData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConvReportData convReportData) {
            int iH = CodedOutputByteBufferNano.h(1, convReportData.requestCount);
            List<String> list = convReportData.requestList;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) convReportData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConvReportData m12309parse(nb5 nb5Var) throws IOException {
            ConvReportData convReportData = new ConvReportData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (convReportData.requestList != null) {
                        break;
                    }
                    convReportData.requestList = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    convReportData.requestCount = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (convReportData.requestList != null) {
                            break;
                        }
                        convReportData.requestList = new ArrayList();
                        return convReportData;
                    }
                    convReportData.requestList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return convReportData;
        }

        public void serialize(ConvReportData convReportData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, convReportData.requestCount);
            List<String> list = convReportData.requestList;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ConvReportData> JSON_ADAPTER = new ObjectJsonAdapter<ConvReportData>() { // from class: com.p1.mobile.putong.core.data.ConvReportData.2
        public Class getDataClass() {
            return ConvReportData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConvReportData m12310newInstance() {
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

        public void serializeFields(ConvReportData convReportData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("requestCount", convReportData.requestCount);
            if (convReportData.requestList != null) {
                jsonGenerator.writeFieldName("requestList");
                JsonAdapter.serializeArray(convReportData.requestList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvReportData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvReportData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m94a(String str) {
        return str;
    }

    public static ConvReportData new_() {
        ConvReportData convReportData = new ConvReportData();
        convReportData.nullCheck();
        return convReportData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConvReportData m12308clone() {
        ConvReportData convReportData = new ConvReportData();
        convReportData.requestCount = this.requestCount;
        List<String> list = this.requestList;
        if (list != null) {
            convReportData.requestList = ValueObject.util_map(list, new w9j() { // from class: l.l36
                public final Object call(Object obj) {
                    return ConvReportData.m94a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.requestCount) * 41;
        List<String> list = this.requestList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.requestList == null) {
            this.requestList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
