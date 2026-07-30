package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Report;
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
public class Report extends ValueObject implements Cloneable, Serializable {
    public static String CATEGORY_DEFAULT = "default";
    public static final String TYPE = "report";

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    @Nullable
    @ProtobufIndex(index = 7)
    public List<String> chatMessages;

    @NonNull
    @ProtobufIndex(index = 5)
    public String contentId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String contentType;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<Picture> pictures;

    @Nullable
    @ProtobufIndex(index = 6)
    public String requestId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<Report> PROTOBUF_ADAPTER = new MessageNanoAdapter<Report>() { // from class: com.p1.mobile.putong.data.Report.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Report report) {
            String str = report.category;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = report.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<Picture> list = report.pictures;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = report.contentType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = report.contentId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = report.requestId;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            List<String> list2 = report.chatMessages;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(7, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) report).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Report m18911parse(nb5 nb5Var) throws IOException {
            Report report = new Report();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (report.category == null) {
                        report.category = "";
                    }
                    if (report.value == null) {
                        report.value = "";
                    }
                    if (report.contentType == null) {
                        report.contentType = "";
                    }
                    if (report.contentId != null) {
                        break;
                    }
                    report.contentId = "";
                    break;
                }
                if (iU == 10) {
                    report.category = nb5Var.s();
                } else if (iU == 18) {
                    report.value = nb5Var.s();
                } else if (iU == 26) {
                    report.pictures = (List) nb5Var.l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    report.contentType = nb5Var.s();
                } else if (iU == 42) {
                    report.contentId = nb5Var.s();
                } else if (iU == 50) {
                    report.requestId = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (report.category == null) {
                            report.category = "";
                        }
                        if (report.value == null) {
                            report.value = "";
                        }
                        if (report.contentType == null) {
                            report.contentType = "";
                        }
                        if (report.contentId != null) {
                            break;
                        }
                        report.contentId = "";
                        return report;
                    }
                    report.chatMessages = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return report;
        }

        public void serialize(Report report, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = report.category;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = report.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<Picture> list = report.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = report.contentType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = report.contentId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = report.requestId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            List<String> list2 = report.chatMessages;
            if (list2 != null) {
                codedOutputByteBufferNano.K(7, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Report> JSON_ADAPTER = new ObjectJsonAdapter<Report>() { // from class: com.p1.mobile.putong.data.Report.2
        public Class getDataClass() {
            return Report.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Report mo17830newInstance() {
            return new Report();
        }

        public boolean parseField(Report report, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pictures":
                    report.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "contentId":
                    report.contentId = jsonParser.getValueAsString();
                    return true;
                case "contentType":
                    report.contentType = jsonParser.getValueAsString();
                    return true;
                case "category":
                    report.category = jsonParser.getValueAsString();
                    return true;
                case "value":
                    report.value = jsonParser.getValueAsString();
                    return true;
                case "chatMessages":
                    report.chatMessages = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "requestId":
                    report.requestId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Report report, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "pictures":
                case "contentId":
                case "contentType":
                case "category":
                case "value":
                case "chatMessages":
                case "requestId":
                    return true;
                default:
                    return super.parseFieldCheck(report, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Report report, JsonGenerator jsonGenerator) throws IOException {
            String str = report.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            String str2 = report.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            if (report.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(report.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            String str3 = report.contentType;
            if (str3 != null) {
                jsonGenerator.writeStringField("contentType", str3);
            }
            String str4 = report.contentId;
            if (str4 != null) {
                jsonGenerator.writeStringField("contentId", str4);
            }
            String str5 = report.requestId;
            if (str5 != null) {
                jsonGenerator.writeStringField("requestId", str5);
            }
            if (report.chatMessages != null) {
                jsonGenerator.writeFieldName("chatMessages");
                JsonAdapter.serializeArray(report.chatMessages, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Report) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Report) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m994b(String str) {
        return str;
    }

    public static Report new_() {
        Report report = new Report();
        report.nullCheck();
        return report;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Report m18910clone() {
        Report report = new Report();
        report.category = this.category;
        report.value = this.value;
        List<Picture> list = this.pictures;
        if (list != null) {
            report.pictures = ValueObject.util_map(list, new w9j() { // from class: l.fsc0
                public final Object call(Object obj) {
                    return ((Picture) obj).mo17714clone();
                }
            });
        }
        report.contentType = this.contentType;
        report.contentId = this.contentId;
        report.requestId = this.requestId;
        List<String> list2 = this.chatMessages;
        if (list2 != null) {
            report.chatMessages = ValueObject.util_map(list2, new w9j() { // from class: l.gsc0
                public final Object call(Object obj) {
                    return Report.m994b((String) obj);
                }
            });
        }
        return report;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Report)) {
            return false;
        }
        Report report = (Report) obj;
        return ValueObject.util_equals(this.category, report.category) && ValueObject.util_equals(this.value, report.value) && ValueObject.util_equals(this.pictures, report.pictures) && ValueObject.util_equals(this.contentType, report.contentType) && ValueObject.util_equals(this.contentId, report.contentId) && ValueObject.util_equals(this.requestId, report.requestId) && ValueObject.util_equals(this.chatMessages, report.chatMessages);
    }

    public String getClassParseName() {
        return "report";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Picture> list = this.pictures;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.contentType;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.contentId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.requestId;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list2 = this.chatMessages;
        int iHashCode7 = iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.contentType == null) {
            this.contentType = "";
        }
        if (this.contentId == null) {
            this.contentId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
