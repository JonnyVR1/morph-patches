package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.SvipWeeklyReportItem;
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
public class SvipWeeklyReport extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipweeklyreport";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<SvipWeeklyReportItem> statistics;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<SvipWeeklyReport> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipWeeklyReport>() { // from class: com.p1.mobile.putong.core.data.SvipWeeklyReport.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SvipWeeklyReport svipWeeklyReport) {
            String str = svipWeeklyReport.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = svipWeeklyReport.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<SvipWeeklyReportItem> list = svipWeeklyReport.statistics;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, SvipWeeklyReportItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            svipWeeklyReport.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SvipWeeklyReport parse(nc5 nc5Var) throws IOException {
            SvipWeeklyReport svipWeeklyReport = new SvipWeeklyReport();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (svipWeeklyReport.title == null) {
                        svipWeeklyReport.title = "";
                    }
                    if (svipWeeklyReport.subTitle == null) {
                        svipWeeklyReport.subTitle = "";
                    }
                    if (svipWeeklyReport.statistics != null) {
                        break;
                    }
                    svipWeeklyReport.statistics = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    svipWeeklyReport.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    svipWeeklyReport.subTitle = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (svipWeeklyReport.title == null) {
                            svipWeeklyReport.title = "";
                        }
                        if (svipWeeklyReport.subTitle == null) {
                            svipWeeklyReport.subTitle = "";
                        }
                        if (svipWeeklyReport.statistics != null) {
                            break;
                        }
                        svipWeeklyReport.statistics = new ArrayList();
                        return svipWeeklyReport;
                    }
                    svipWeeklyReport.statistics = (List) nc5Var.m162488l(SvipWeeklyReportItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return svipWeeklyReport;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SvipWeeklyReport svipWeeklyReport, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = svipWeeklyReport.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = svipWeeklyReport.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<SvipWeeklyReportItem> list = svipWeeklyReport.statistics;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, SvipWeeklyReportItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SvipWeeklyReport> JSON_ADAPTER = new ObjectJsonAdapter<SvipWeeklyReport>() { // from class: com.p1.mobile.putong.core.data.SvipWeeklyReport.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SvipWeeklyReport.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SvipWeeklyReport newInstance() {
            return new SvipWeeklyReport();
        }

        public boolean parseField(SvipWeeklyReport svipWeeklyReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    svipWeeklyReport.subTitle = jsonParser.getValueAsString();
                    return true;
                case "statistics":
                    svipWeeklyReport.statistics = JsonAdapter.parseArray(jsonParser, SvipWeeklyReportItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    svipWeeklyReport.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SvipWeeklyReport svipWeeklyReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "statistics":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(svipWeeklyReport, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SvipWeeklyReport svipWeeklyReport, JsonGenerator jsonGenerator) throws IOException {
            String str = svipWeeklyReport.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = svipWeeklyReport.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            if (svipWeeklyReport.statistics != null) {
                jsonGenerator.writeFieldName("statistics");
                JsonAdapter.serializeArray(svipWeeklyReport.statistics, jsonGenerator, SvipWeeklyReportItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipWeeklyReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipWeeklyReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipWeeklyReport new_() {
        SvipWeeklyReport svipWeeklyReport = new SvipWeeklyReport();
        svipWeeklyReport.nullCheck();
        return svipWeeklyReport;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SvipWeeklyReport mo225055clone() {
        SvipWeeklyReport svipWeeklyReport = new SvipWeeklyReport();
        svipWeeklyReport.title = this.title;
        svipWeeklyReport.subTitle = this.subTitle;
        List<SvipWeeklyReportItem> list = this.statistics;
        if (list != null) {
            svipWeeklyReport.statistics = ValueObject.util_map(list, new qcj() { // from class: l.xeh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((SvipWeeklyReportItem) obj).mo225055clone();
                }
            });
        }
        return svipWeeklyReport;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SvipWeeklyReport)) {
            return false;
        }
        SvipWeeklyReport svipWeeklyReport = (SvipWeeklyReport) obj;
        return ValueObject.util_equals(this.title, svipWeeklyReport.title) && ValueObject.util_equals(this.subTitle, svipWeeklyReport.subTitle) && ValueObject.util_equals(this.statistics, svipWeeklyReport.statistics);
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
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<SvipWeeklyReportItem> list = this.statistics;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.statistics == null) {
            this.statistics = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
