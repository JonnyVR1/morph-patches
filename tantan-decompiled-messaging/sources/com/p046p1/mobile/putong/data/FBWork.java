package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes12.dex */
public class FBWork extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbwork";

    @NonNull
    @ProtobufIndex(index = 4)
    public FBPage employer;

    @NonNull
    @ProtobufIndex(index = 3)
    public String end_date;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38754id;

    @NonNull
    @ProtobufIndex(index = 5)
    public FBPage position;

    @NonNull
    @ProtobufIndex(index = 2)
    public String start_date;
    public static ProtobufAdapter<FBWork> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBWork>() { // from class: com.p1.mobile.putong.data.FBWork.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBWork fBWork) {
            String str = fBWork.f38754id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = fBWork.start_date;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = fBWork.end_date;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            FBPage fBPage = fBWork.employer;
            if (fBPage != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBWork.position;
            if (fBPage2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            fBWork.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBWork parse(nb5 nb5Var) throws IOException {
            FBWork fBWork = new FBWork();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fBWork.f38754id == null) {
                        fBWork.f38754id = "";
                    }
                    if (fBWork.start_date == null) {
                        fBWork.start_date = "";
                    }
                    if (fBWork.end_date == null) {
                        fBWork.end_date = "";
                    }
                    if (fBWork.employer == null) {
                        fBWork.employer = FBPage.new_();
                    }
                    if (fBWork.position != null) {
                        break;
                    }
                    fBWork.position = FBPage.new_();
                    break;
                }
                if (iM158752u == 10) {
                    fBWork.f38754id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    fBWork.start_date = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    fBWork.end_date = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    fBWork.employer = (FBPage) nb5Var.m158743l(FBPage.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (fBWork.f38754id == null) {
                            fBWork.f38754id = "";
                        }
                        if (fBWork.start_date == null) {
                            fBWork.start_date = "";
                        }
                        if (fBWork.end_date == null) {
                            fBWork.end_date = "";
                        }
                        if (fBWork.employer == null) {
                            fBWork.employer = FBPage.new_();
                        }
                        if (fBWork.position != null) {
                            break;
                        }
                        fBWork.position = FBPage.new_();
                        return fBWork;
                    }
                    fBWork.position = (FBPage) nb5Var.m158743l(FBPage.PROTOBUF_ADAPTER);
                }
            }
            return fBWork;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBWork fBWork, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBWork.f38754id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = fBWork.start_date;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = fBWork.end_date;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            FBPage fBPage = fBWork.employer;
            if (fBPage != null) {
                codedOutputByteBufferNano.m17254K(4, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBWork.position;
            if (fBPage2 != null) {
                codedOutputByteBufferNano.m17254K(5, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBWork> JSON_ADAPTER = new ObjectJsonAdapter<FBWork>() { // from class: com.p1.mobile.putong.data.FBWork.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBWork.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBWork newInstance() {
            return new FBWork();
        }

        public boolean parseField(FBWork fBWork, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "start_date":
                    fBWork.start_date = jsonParser.getValueAsString();
                    return true;
                case "id":
                    fBWork.f38754id = jsonParser.getValueAsString();
                    return false;
                case "position":
                    fBWork.position = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "employer":
                    fBWork.employer = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "end_date":
                    fBWork.end_date = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FBWork fBWork, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "start_date":
                    return true;
                case "id":
                    return false;
                case "position":
                case "employer":
                case "end_date":
                    return true;
                default:
                    return super.parseFieldCheck(fBWork, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBWork fBWork, JsonGenerator jsonGenerator) throws IOException {
            String str = fBWork.f38754id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = fBWork.start_date;
            if (str2 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.START_DATE, str2);
            }
            String str3 = fBWork.end_date;
            if (str3 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.END_DATE, str3);
            }
            if (fBWork.employer != null) {
                jsonGenerator.writeFieldName("employer");
                FBPage.JSON_ADAPTER.serialize(fBWork.employer, jsonGenerator, true);
            }
            if (fBWork.position != null) {
                jsonGenerator.writeFieldName("position");
                FBPage.JSON_ADAPTER.serialize(fBWork.position, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBWork) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBWork) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBWork new_() {
        FBWork fBWork = new FBWork();
        fBWork.nullCheck();
        return fBWork;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBWork mo223809clone() {
        FBWork fBWork = new FBWork();
        fBWork.f38754id = this.f38754id;
        fBWork.start_date = this.start_date;
        fBWork.end_date = this.end_date;
        FBPage fBPage = this.employer;
        if (fBPage != null) {
            fBWork.employer = fBPage.mo223809clone();
        }
        FBPage fBPage2 = this.position;
        if (fBPage2 != null) {
            fBWork.position = fBPage2.mo223809clone();
        }
        return fBWork;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBWork)) {
            return false;
        }
        FBWork fBWork = (FBWork) obj;
        return ValueObject.util_equals(this.f38754id, fBWork.f38754id) && ValueObject.util_equals(this.start_date, fBWork.start_date) && ValueObject.util_equals(this.end_date, fBWork.end_date) && ValueObject.util_equals(this.employer, fBWork.employer) && ValueObject.util_equals(this.position, fBWork.position);
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
        String str = this.f38754id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.start_date;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.end_date;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        FBPage fBPage = this.employer;
        int iHashCode4 = (iHashCode3 + (fBPage != null ? fBPage.hashCode() : 0)) * 41;
        FBPage fBPage2 = this.position;
        int iHashCode5 = iHashCode4 + (fBPage2 != null ? fBPage2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38754id == null) {
            this.f38754id = "";
        }
        if (this.start_date == null) {
            this.start_date = "";
        }
        if (this.end_date == null) {
            this.end_date = "";
        }
        if (this.employer == null) {
            this.employer = FBPage.new_();
        }
        if (this.position == null) {
            this.position = FBPage.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
