package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.asm.Opcodes;
import com.facebook.AuthenticationTokenClaims;
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
public class EvaluationReport extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "evaluationreport";

    @ProtobufIndex(index = 10)
    public int coinPrice;

    @ProtobufIndex(index = 3)
    public boolean completed;

    @NonNull
    @ProtobufIndex(index = 6)
    public String description;

    @NonNull
    @ProtobufIndex(index = 9)
    public String detailUrl;

    @ProtobufIndex(index = 2)
    public long evaluationId;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public long f21131id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String name;

    @NonNull
    @ProtobufIndex(index = 7)
    public String pictureUrl;

    @ProtobufIndex(index = 12)
    public long reportTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public String reportUrl;

    @ProtobufIndex(index = 11)
    public int scaleType;

    @ProtobufIndex(index = 4)
    public long type;
    public static ProtobufAdapter<EvaluationReport> PROTOBUF_ADAPTER = new MessageNanoAdapter<EvaluationReport>() { // from class: com.p1.mobile.putong.core.data.EvaluationReport.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EvaluationReport evaluationReport) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, evaluationReport.f21131id) + CodedOutputByteBufferNano.m17283j(2, evaluationReport.evaluationId) + CodedOutputByteBufferNano.m17275b(3, evaluationReport.completed) + CodedOutputByteBufferNano.m17283j(4, evaluationReport.type);
            String str = evaluationReport.name;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(5, str);
            }
            String str2 = evaluationReport.description;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(6, str2);
            }
            String str3 = evaluationReport.pictureUrl;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(7, str3);
            }
            String str4 = evaluationReport.reportUrl;
            if (str4 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(8, str4);
            }
            String str5 = evaluationReport.detailUrl;
            if (str5 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(9, str5);
            }
            int iM17281h = iM17283j + CodedOutputByteBufferNano.m17281h(10, evaluationReport.coinPrice) + CodedOutputByteBufferNano.m17281h(11, evaluationReport.scaleType) + CodedOutputByteBufferNano.m17283j(12, evaluationReport.reportTime);
            evaluationReport.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EvaluationReport parse(nc5 nc5Var) throws IOException {
            EvaluationReport evaluationReport = new EvaluationReport();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (evaluationReport.name == null) {
                            evaluationReport.name = "";
                        }
                        if (evaluationReport.description == null) {
                            evaluationReport.description = "";
                        }
                        if (evaluationReport.pictureUrl == null) {
                            evaluationReport.pictureUrl = "";
                        }
                        if (evaluationReport.reportUrl == null) {
                            evaluationReport.reportUrl = "";
                        }
                        if (evaluationReport.detailUrl == null) {
                            evaluationReport.detailUrl = "";
                        }
                        break;
                    case 8:
                        evaluationReport.f21131id = nc5Var.m162487k();
                        continue;
                    case 16:
                        evaluationReport.evaluationId = nc5Var.m162487k();
                        continue;
                    case 24:
                        evaluationReport.completed = nc5Var.m162483g();
                        continue;
                    case 32:
                        evaluationReport.type = nc5Var.m162487k();
                        continue;
                    case 42:
                        evaluationReport.name = nc5Var.m162495s();
                        continue;
                    case 50:
                        evaluationReport.description = nc5Var.m162495s();
                        continue;
                    case 58:
                        evaluationReport.pictureUrl = nc5Var.m162495s();
                        continue;
                    case 66:
                        evaluationReport.reportUrl = nc5Var.m162495s();
                        continue;
                    case 74:
                        evaluationReport.detailUrl = nc5Var.m162495s();
                        continue;
                    case 80:
                        evaluationReport.coinPrice = nc5Var.m162486j();
                        continue;
                    case 88:
                        evaluationReport.scaleType = nc5Var.m162486j();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        evaluationReport.reportTime = nc5Var.m162487k();
                        continue;
                    default:
                        if (evaluationReport.name == null) {
                            evaluationReport.name = "";
                        }
                        if (evaluationReport.description == null) {
                            evaluationReport.description = "";
                        }
                        if (evaluationReport.pictureUrl == null) {
                            evaluationReport.pictureUrl = "";
                        }
                        if (evaluationReport.reportUrl == null) {
                            evaluationReport.reportUrl = "";
                        }
                        if (evaluationReport.detailUrl == null) {
                            evaluationReport.detailUrl = "";
                            return evaluationReport;
                        }
                        break;
                }
            }
            return evaluationReport;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EvaluationReport evaluationReport, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, evaluationReport.f21131id);
            codedOutputByteBufferNano.m17307I(2, evaluationReport.evaluationId);
            codedOutputByteBufferNano.m17299A(3, evaluationReport.completed);
            codedOutputByteBufferNano.m17307I(4, evaluationReport.type);
            String str = evaluationReport.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(5, str);
            }
            String str2 = evaluationReport.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(6, str2);
            }
            String str3 = evaluationReport.pictureUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(7, str3);
            }
            String str4 = evaluationReport.reportUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(8, str4);
            }
            String str5 = evaluationReport.detailUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(9, str5);
            }
            codedOutputByteBufferNano.m17305G(10, evaluationReport.coinPrice);
            codedOutputByteBufferNano.m17305G(11, evaluationReport.scaleType);
            codedOutputByteBufferNano.m17307I(12, evaluationReport.reportTime);
        }
    };
    public static JsonAdapter<EvaluationReport> JSON_ADAPTER = new ObjectJsonAdapter<EvaluationReport>() { // from class: com.p1.mobile.putong.core.data.EvaluationReport.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EvaluationReport.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EvaluationReport newInstance() {
            return new EvaluationReport();
        }

        public boolean parseField(EvaluationReport evaluationReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "detailUrl":
                    evaluationReport.detailUrl = jsonParser.getValueAsString();
                    return true;
                case "scaleType":
                    evaluationReport.scaleType = jsonParser.getValueAsInt();
                    return true;
                case "description":
                    evaluationReport.description = jsonParser.getValueAsString();
                    return true;
                case "pictureUrl":
                    evaluationReport.pictureUrl = jsonParser.getValueAsString();
                    return true;
                case "completed":
                    evaluationReport.completed = jsonParser.getValueAsBoolean();
                    return true;
                case "coinPrice":
                    evaluationReport.coinPrice = jsonParser.getValueAsInt();
                    return true;
                case "reportUrl":
                    evaluationReport.reportUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    evaluationReport.f21131id = jsonParser.getValueAsLong();
                    return false;
                case "name":
                    evaluationReport.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    evaluationReport.type = jsonParser.getValueAsLong();
                    return true;
                case "evaluationId":
                    evaluationReport.evaluationId = jsonParser.getValueAsLong();
                    return true;
                case "reportTime":
                    evaluationReport.reportTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(EvaluationReport evaluationReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "detailUrl":
                case "scaleType":
                case "description":
                case "pictureUrl":
                case "completed":
                case "coinPrice":
                case "reportUrl":
                    return true;
                case "id":
                    return false;
                case "name":
                case "type":
                case "evaluationId":
                case "reportTime":
                    return true;
                default:
                    return super.parseFieldCheck(evaluationReport, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EvaluationReport evaluationReport, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", evaluationReport.f21131id);
            jsonGenerator.writeNumberField("evaluationId", evaluationReport.evaluationId);
            jsonGenerator.writeBooleanField("completed", evaluationReport.completed);
            jsonGenerator.writeNumberField("type", evaluationReport.type);
            String str = evaluationReport.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = evaluationReport.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            String str3 = evaluationReport.pictureUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("pictureUrl", str3);
            }
            String str4 = evaluationReport.reportUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("reportUrl", str4);
            }
            String str5 = evaluationReport.detailUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("detailUrl", str5);
            }
            jsonGenerator.writeNumberField("coinPrice", evaluationReport.coinPrice);
            jsonGenerator.writeNumberField("scaleType", evaluationReport.scaleType);
            jsonGenerator.writeNumberField("reportTime", evaluationReport.reportTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EvaluationReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EvaluationReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EvaluationReport new_() {
        EvaluationReport evaluationReport = new EvaluationReport();
        evaluationReport.nullCheck();
        return evaluationReport;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EvaluationReport mo225055clone() {
        EvaluationReport evaluationReport = new EvaluationReport();
        evaluationReport.f21131id = this.f21131id;
        evaluationReport.evaluationId = this.evaluationId;
        evaluationReport.completed = this.completed;
        evaluationReport.type = this.type;
        evaluationReport.name = this.name;
        evaluationReport.description = this.description;
        evaluationReport.pictureUrl = this.pictureUrl;
        evaluationReport.reportUrl = this.reportUrl;
        evaluationReport.detailUrl = this.detailUrl;
        evaluationReport.coinPrice = this.coinPrice;
        evaluationReport.scaleType = this.scaleType;
        evaluationReport.reportTime = this.reportTime;
        return evaluationReport;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EvaluationReport)) {
            return false;
        }
        EvaluationReport evaluationReport = (EvaluationReport) obj;
        return this.f21131id == evaluationReport.f21131id && this.evaluationId == evaluationReport.evaluationId && this.completed == evaluationReport.completed && this.type == evaluationReport.type && ValueObject.util_equals(this.name, evaluationReport.name) && ValueObject.util_equals(this.description, evaluationReport.description) && ValueObject.util_equals(this.pictureUrl, evaluationReport.pictureUrl) && ValueObject.util_equals(this.reportUrl, evaluationReport.reportUrl) && ValueObject.util_equals(this.detailUrl, evaluationReport.detailUrl) && this.coinPrice == evaluationReport.coinPrice && this.scaleType == evaluationReport.scaleType && this.reportTime == evaluationReport.reportTime;
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
        long j = this.f21131id;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.evaluationId;
        int i3 = (((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + (this.completed ? 1231 : 1237)) * 41;
        long j3 = this.type;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str = this.name;
        int iHashCode = (i4 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pictureUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.reportUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.detailUrl;
        int iHashCode5 = (((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.coinPrice) * 41) + this.scaleType) * 41;
        long j4 = this.reportTime;
        int i5 = iHashCode5 + ((int) (j4 ^ (j4 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.pictureUrl == null) {
            this.pictureUrl = "";
        }
        if (this.reportUrl == null) {
            this.reportUrl = "";
        }
        if (this.detailUrl == null) {
            this.detailUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
