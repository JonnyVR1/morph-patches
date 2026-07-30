package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class DailyPaperReport extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dailypaperreport";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public long f47id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String quote;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String quoteSource;

    @NonNull
    @ProtobufIndex(index = 4)
    public String report;
    public double updateTime;
    public static ProtobufAdapter<DailyPaperReport> PROTOBUF_ADAPTER = new MessageNanoAdapter<DailyPaperReport>() { // from class: com.p1.mobile.putong.core.data.DailyPaperReport.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DailyPaperReport dailyPaperReport) {
            int iJ = CodedOutputByteBufferNano.j(1, dailyPaperReport.f47id);
            String str = dailyPaperReport.quote;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = dailyPaperReport.quoteSource;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = dailyPaperReport.report;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) dailyPaperReport).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DailyPaperReport m12571parse(nb5 nb5Var) throws IOException {
            DailyPaperReport dailyPaperReport = new DailyPaperReport();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    dailyPaperReport.f47id = nb5Var.k();
                } else if (iU == 18) {
                    dailyPaperReport.quote = nb5Var.s();
                } else if (iU == 26) {
                    dailyPaperReport.quoteSource = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    dailyPaperReport.report = nb5Var.s();
                }
            }
            return dailyPaperReport;
        }

        public void serialize(DailyPaperReport dailyPaperReport, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, dailyPaperReport.f47id);
            String str = dailyPaperReport.quote;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = dailyPaperReport.quoteSource;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = dailyPaperReport.report;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<DailyPaperReport> JSON_ADAPTER = new ObjectJsonAdapter<DailyPaperReport>() { // from class: com.p1.mobile.putong.core.data.DailyPaperReport.2
        public Class getDataClass() {
            return DailyPaperReport.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DailyPaperReport m12572newInstance() {
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
                    dailyPaperReport.f47id = jsonParser.getValueAsLong();
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

        public void serializeFields(DailyPaperReport dailyPaperReport, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", dailyPaperReport.f47id);
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
                jsonGenerator.writeStringField(KnowMyselfShareParams.TYPE_REPORT, str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DailyPaperReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DailyPaperReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DailyPaperReport new_() {
        DailyPaperReport dailyPaperReport = new DailyPaperReport();
        dailyPaperReport.nullCheck();
        return dailyPaperReport;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DailyPaperReport m12570clone() {
        DailyPaperReport dailyPaperReport = new DailyPaperReport();
        dailyPaperReport.f47id = this.f47id;
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
        return this.f47id == dailyPaperReport.f47id && ValueObject.util_equals(this.quote, dailyPaperReport.quote) && ValueObject.util_equals(this.quoteSource, dailyPaperReport.quoteSource) && ValueObject.util_equals(this.report, dailyPaperReport.report);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.f47id;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.quote;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.quoteSource;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.report;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
