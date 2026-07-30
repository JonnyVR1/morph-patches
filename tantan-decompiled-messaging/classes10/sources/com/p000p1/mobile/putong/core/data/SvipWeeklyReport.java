package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.SvipWeeklyReportItem;
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
public class SvipWeeklyReport extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipweeklyreport";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<SvipWeeklyReportItem> statistics;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<SvipWeeklyReport> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipWeeklyReport>() { // from class: com.p1.mobile.putong.core.data.SvipWeeklyReport.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SvipWeeklyReport svipWeeklyReport) {
            String str = svipWeeklyReport.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = svipWeeklyReport.subTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<SvipWeeklyReportItem> list = svipWeeklyReport.statistics;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, SvipWeeklyReportItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) svipWeeklyReport).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SvipWeeklyReport m15850parse(nb5 nb5Var) throws IOException {
            SvipWeeklyReport svipWeeklyReport = new SvipWeeklyReport();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    svipWeeklyReport.title = nb5Var.s();
                } else if (iU == 18) {
                    svipWeeklyReport.subTitle = nb5Var.s();
                } else {
                    if (iU != 26) {
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
                    svipWeeklyReport.statistics = (List) nb5Var.l(SvipWeeklyReportItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return svipWeeklyReport;
        }

        public void serialize(SvipWeeklyReport svipWeeklyReport, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = svipWeeklyReport.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = svipWeeklyReport.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<SvipWeeklyReportItem> list = svipWeeklyReport.statistics;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, SvipWeeklyReportItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SvipWeeklyReport> JSON_ADAPTER = new ObjectJsonAdapter<SvipWeeklyReport>() { // from class: com.p1.mobile.putong.core.data.SvipWeeklyReport.2
        public Class getDataClass() {
            return SvipWeeklyReport.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SvipWeeklyReport m15851newInstance() {
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

        public void serializeFields(SvipWeeklyReport svipWeeklyReport, JsonGenerator jsonGenerator) throws IOException {
            String str = svipWeeklyReport.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipWeeklyReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipWeeklyReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipWeeklyReport new_() {
        SvipWeeklyReport svipWeeklyReport = new SvipWeeklyReport();
        svipWeeklyReport.nullCheck();
        return svipWeeklyReport;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SvipWeeklyReport m15849clone() {
        SvipWeeklyReport svipWeeklyReport = new SvipWeeklyReport();
        svipWeeklyReport.title = this.title;
        svipWeeklyReport.subTitle = this.subTitle;
        List<SvipWeeklyReportItem> list = this.statistics;
        if (list != null) {
            svipWeeklyReport.statistics = ValueObject.util_map(list, new w9j() { // from class: l.p6h0
                public final Object call(Object obj) {
                    return ((SvipWeeklyReportItem) obj).m15853clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
