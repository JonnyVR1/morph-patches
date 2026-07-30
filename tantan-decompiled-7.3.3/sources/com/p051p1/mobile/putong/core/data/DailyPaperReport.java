package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class DailyPaperReport extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dailypaperreport";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public long f21127id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String quote;

    @NonNull
    @ProtobufIndex(index = 3)
    public String quoteSource;

    @NonNull
    @ProtobufIndex(index = 4)
    public String report;
    public double updateTime;
    public static ProtobufAdapter<DailyPaperReport> PROTOBUF_ADAPTER = new MessageNanoAdapter<DailyPaperReport>() { // from class: com.p1.mobile.putong.core.data.DailyPaperReport.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DailyPaperReport dailyPaperReport) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, dailyPaperReport.f21127id);
            String str = dailyPaperReport.quote;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = dailyPaperReport.quoteSource;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = dailyPaperReport.report;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            dailyPaperReport.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DailyPaperReport parse(nc5 nc5Var) throws IOException {
            DailyPaperReport dailyPaperReport = new DailyPaperReport();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (dailyPaperReport.quote == null) {
                        dailyPaperReport.quote = "";
                    }
                    if (dailyPaperReport.quoteSource == null) {
                        dailyPaperReport.quoteSource = "";
                    }
                    if (dailyPaperReport.report != null) {
                        break;
                    }
                    dailyPaperReport.report = "";
                    break;
                }
                if (iM162497u == 8) {
                    dailyPaperReport.f21127id = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    dailyPaperReport.quote = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    dailyPaperReport.quoteSource = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (dailyPaperReport.quote == null) {
                            dailyPaperReport.quote = "";
                        }
                        if (dailyPaperReport.quoteSource == null) {
                            dailyPaperReport.quoteSource = "";
                        }
                        if (dailyPaperReport.report != null) {
                            break;
                        }
                        dailyPaperReport.report = "";
                        return dailyPaperReport;
                    }
                    dailyPaperReport.report = nc5Var.m162495s();
                }
            }
            return dailyPaperReport;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DailyPaperReport dailyPaperReport, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, dailyPaperReport.f21127id);
            String str = dailyPaperReport.quote;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = dailyPaperReport.quoteSource;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = dailyPaperReport.report;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<DailyPaperReport> JSON_ADAPTER = new ObjectJsonAdapter<DailyPaperReport>() { // from class: com.p1.mobile.putong.core.data.DailyPaperReport.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DailyPaperReport.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DailyPaperReport newInstance() {
            return new DailyPaperReport();
        }

        public boolean parseField(DailyPaperReport dailyPaperReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "report":
                    dailyPaperReport.report = jsonParser.getValueAsString();
                    return true;
                case "quote_source":
                    dailyPaperReport.quoteSource = jsonParser.getValueAsString();
                    return true;
                case "id":
                    dailyPaperReport.f21127id = jsonParser.getValueAsLong();
                    return false;
                case "quote":
                    dailyPaperReport.quote = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DailyPaperReport dailyPaperReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "report":
                case "quote_source":
                    return true;
                case "id":
                    return false;
                case "quote":
                    return true;
                default:
                    return super.parseFieldCheck(dailyPaperReport, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DailyPaperReport dailyPaperReport, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", dailyPaperReport.f21127id);
            String str = dailyPaperReport.quote;
            if (str != null) {
                jsonGenerator.writeStringField("quote", str);
            }
            String str2 = dailyPaperReport.quoteSource;
            if (str2 != null) {
                jsonGenerator.writeStringField("quote_source", str2);
            }
            String str3 = dailyPaperReport.report;
            if (str3 != null) {
                jsonGenerator.writeStringField("report", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DailyPaperReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DailyPaperReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DailyPaperReport new_() {
        DailyPaperReport dailyPaperReport = new DailyPaperReport();
        dailyPaperReport.nullCheck();
        return dailyPaperReport;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DailyPaperReport mo225055clone() {
        DailyPaperReport dailyPaperReport = new DailyPaperReport();
        dailyPaperReport.f21127id = this.f21127id;
        dailyPaperReport.quote = this.quote;
        dailyPaperReport.quoteSource = this.quoteSource;
        dailyPaperReport.report = this.report;
        return dailyPaperReport;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DailyPaperReport)) {
            return false;
        }
        DailyPaperReport dailyPaperReport = (DailyPaperReport) obj;
        return this.f21127id == dailyPaperReport.f21127id && ValueObject.util_equals(this.quote, dailyPaperReport.quote) && ValueObject.util_equals(this.quoteSource, dailyPaperReport.quoteSource) && ValueObject.util_equals(this.report, dailyPaperReport.report);
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
        long j = this.f21127id;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.quote;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.quoteSource;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.report;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.quote == null) {
            this.quote = "";
        }
        if (this.quoteSource == null) {
            this.quoteSource = "";
        }
        if (this.report == null) {
            this.report = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
