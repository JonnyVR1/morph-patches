package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class DailyPaperReport extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dailypaperreport";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public long f20385id;

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
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, dailyPaperReport.f20385id);
            String str = dailyPaperReport.quote;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = dailyPaperReport.quoteSource;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = dailyPaperReport.report;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            dailyPaperReport.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DailyPaperReport parse(nb5 nb5Var) throws IOException {
            DailyPaperReport dailyPaperReport = new DailyPaperReport();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 8) {
                    dailyPaperReport.f20385id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    dailyPaperReport.quote = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    dailyPaperReport.quoteSource = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
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
                    dailyPaperReport.report = nb5Var.m158750s();
                }
            }
            return dailyPaperReport;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DailyPaperReport dailyPaperReport, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, dailyPaperReport.f20385id);
            String str = dailyPaperReport.quote;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = dailyPaperReport.quoteSource;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = dailyPaperReport.report;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<DailyPaperReport> JSON_ADAPTER = new ObjectJsonAdapter<DailyPaperReport>() { // from class: com.p1.mobile.putong.core.data.DailyPaperReport.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DailyPaperReport.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    dailyPaperReport.f20385id = jsonParser.getValueAsLong();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DailyPaperReport dailyPaperReport, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", dailyPaperReport.f20385id);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DailyPaperReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public DailyPaperReport mo223809clone() {
        DailyPaperReport dailyPaperReport = new DailyPaperReport();
        dailyPaperReport.f20385id = this.f20385id;
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
        return this.f20385id == dailyPaperReport.f20385id && ValueObject.util_equals(this.quote, dailyPaperReport.quote) && ValueObject.util_equals(this.quoteSource, dailyPaperReport.quoteSource) && ValueObject.util_equals(this.report, dailyPaperReport.report);
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
        long j = this.f20385id;
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
