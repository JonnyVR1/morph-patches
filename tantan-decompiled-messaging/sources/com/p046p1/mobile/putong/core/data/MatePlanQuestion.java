package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class MatePlanQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mateplanquestion";

    @NonNull
    @ProtobufIndex(index = 6)
    public MatePlanQuestionAttribute attribute;

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    @ProtobufIndex(index = 9)
    public double createdTime;

    @ProtobufIndex(index = 3)
    public int index;

    @NonNull
    @ProtobufIndex(index = 7)
    public String logo;

    @NonNull
    @ProtobufIndex(index = 1)
    public String questionId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String questionType;

    @NonNull
    @ProtobufIndex(index = 8)
    public String status;

    @ProtobufIndex(index = 10)
    public double updatedTime;
    public static ProtobufAdapter<MatePlanQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatePlanQuestion>() { // from class: com.p1.mobile.putong.core.data.MatePlanQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatePlanQuestion matePlanQuestion) {
            String str = matePlanQuestion.questionId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = matePlanQuestion.content;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, matePlanQuestion.index);
            String str3 = matePlanQuestion.category;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = matePlanQuestion.questionType;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            MatePlanQuestionAttribute matePlanQuestionAttribute = matePlanQuestion.attribute;
            if (matePlanQuestionAttribute != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, matePlanQuestionAttribute, MatePlanQuestionAttribute.PROTOBUF_ADAPTER);
            }
            String str5 = matePlanQuestion.logo;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            String str6 = matePlanQuestion.status;
            if (str6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(8, str6);
            }
            int iM17222d = iM17226h + CodedOutputByteBufferNano.m17222d(9, matePlanQuestion.createdTime) + CodedOutputByteBufferNano.m17222d(10, matePlanQuestion.updatedTime);
            matePlanQuestion.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatePlanQuestion parse(nb5 nb5Var) throws IOException {
            MatePlanQuestion matePlanQuestion = new MatePlanQuestion();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (matePlanQuestion.questionId == null) {
                            matePlanQuestion.questionId = "";
                        }
                        if (matePlanQuestion.content == null) {
                            matePlanQuestion.content = "";
                        }
                        if (matePlanQuestion.category == null) {
                            matePlanQuestion.category = "";
                        }
                        if (matePlanQuestion.questionType == null) {
                            matePlanQuestion.questionType = "";
                        }
                        if (matePlanQuestion.attribute == null) {
                            matePlanQuestion.attribute = MatePlanQuestionAttribute.new_();
                        }
                        if (matePlanQuestion.logo == null) {
                            matePlanQuestion.logo = "";
                        }
                        if (matePlanQuestion.status == null) {
                            matePlanQuestion.status = "";
                        }
                        break;
                    case 10:
                        matePlanQuestion.questionId = nb5Var.m158750s();
                        continue;
                    case 18:
                        matePlanQuestion.content = nb5Var.m158750s();
                        continue;
                    case 24:
                        matePlanQuestion.index = nb5Var.m158741j();
                        continue;
                    case 34:
                        matePlanQuestion.category = nb5Var.m158750s();
                        continue;
                    case 42:
                        matePlanQuestion.questionType = nb5Var.m158750s();
                        continue;
                    case 50:
                        matePlanQuestion.attribute = (MatePlanQuestionAttribute) nb5Var.m158743l(MatePlanQuestionAttribute.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        matePlanQuestion.logo = nb5Var.m158750s();
                        continue;
                    case 66:
                        matePlanQuestion.status = nb5Var.m158750s();
                        continue;
                    case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                        matePlanQuestion.createdTime = nb5Var.m158739h();
                        continue;
                    case EACTags.FILE_REFERENCE /* 81 */:
                        matePlanQuestion.updatedTime = nb5Var.m158739h();
                        continue;
                    default:
                        if (matePlanQuestion.questionId == null) {
                            matePlanQuestion.questionId = "";
                        }
                        if (matePlanQuestion.content == null) {
                            matePlanQuestion.content = "";
                        }
                        if (matePlanQuestion.category == null) {
                            matePlanQuestion.category = "";
                        }
                        if (matePlanQuestion.questionType == null) {
                            matePlanQuestion.questionType = "";
                        }
                        if (matePlanQuestion.attribute == null) {
                            matePlanQuestion.attribute = MatePlanQuestionAttribute.new_();
                        }
                        if (matePlanQuestion.logo == null) {
                            matePlanQuestion.logo = "";
                        }
                        if (matePlanQuestion.status == null) {
                            matePlanQuestion.status = "";
                            return matePlanQuestion;
                        }
                        break;
                }
            }
            return matePlanQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatePlanQuestion matePlanQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = matePlanQuestion.questionId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = matePlanQuestion.content;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, matePlanQuestion.index);
            String str3 = matePlanQuestion.category;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = matePlanQuestion.questionType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            MatePlanQuestionAttribute matePlanQuestionAttribute = matePlanQuestion.attribute;
            if (matePlanQuestionAttribute != null) {
                codedOutputByteBufferNano.m17254K(6, matePlanQuestionAttribute, MatePlanQuestionAttribute.PROTOBUF_ADAPTER);
            }
            String str5 = matePlanQuestion.logo;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            String str6 = matePlanQuestion.status;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(8, str6);
            }
            codedOutputByteBufferNano.m17246C(9, matePlanQuestion.createdTime);
            codedOutputByteBufferNano.m17246C(10, matePlanQuestion.updatedTime);
        }
    };
    public static JsonAdapter<MatePlanQuestion> JSON_ADAPTER = new ObjectJsonAdapter<MatePlanQuestion>() { // from class: com.p1.mobile.putong.core.data.MatePlanQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatePlanQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatePlanQuestion newInstance() {
            return new MatePlanQuestion();
        }

        public boolean parseField(MatePlanQuestion matePlanQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    matePlanQuestion.status = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    matePlanQuestion.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "createdTime":
                    matePlanQuestion.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "questionType":
                    matePlanQuestion.questionType = jsonParser.getValueAsString();
                    return true;
                case "logo":
                    matePlanQuestion.logo = jsonParser.getValueAsString();
                    return true;
                case "attribute":
                    matePlanQuestion.attribute = MatePlanQuestionAttribute.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    matePlanQuestion.category = jsonParser.getValueAsString();
                    return true;
                case "index":
                    matePlanQuestion.index = jsonParser.getValueAsInt();
                    return true;
                case "questionId":
                    matePlanQuestion.questionId = jsonParser.getValueAsString();
                    return true;
                case "content":
                    matePlanQuestion.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MatePlanQuestion matePlanQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "updatedTime":
                case "createdTime":
                case "questionType":
                case "logo":
                case "attribute":
                case "category":
                case "index":
                case "questionId":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(matePlanQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatePlanQuestion matePlanQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = matePlanQuestion.questionId;
            if (str != null) {
                jsonGenerator.writeStringField("questionId", str);
            }
            String str2 = matePlanQuestion.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, matePlanQuestion.index);
            String str3 = matePlanQuestion.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
            String str4 = matePlanQuestion.questionType;
            if (str4 != null) {
                jsonGenerator.writeStringField("questionType", str4);
            }
            if (matePlanQuestion.attribute != null) {
                jsonGenerator.writeFieldName("attribute");
                MatePlanQuestionAttribute.JSON_ADAPTER.serialize(matePlanQuestion.attribute, jsonGenerator, true);
            }
            String str5 = matePlanQuestion.logo;
            if (str5 != null) {
                jsonGenerator.writeStringField("logo", str5);
            }
            String str6 = matePlanQuestion.status;
            if (str6 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str6);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(matePlanQuestion.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            jsonAdapter.serialize(Double.valueOf(matePlanQuestion.updatedTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatePlanQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatePlanQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatePlanQuestion new_() {
        MatePlanQuestion matePlanQuestion = new MatePlanQuestion();
        matePlanQuestion.nullCheck();
        return matePlanQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatePlanQuestion mo223809clone() {
        MatePlanQuestion matePlanQuestion = new MatePlanQuestion();
        matePlanQuestion.questionId = this.questionId;
        matePlanQuestion.content = this.content;
        matePlanQuestion.index = this.index;
        matePlanQuestion.category = this.category;
        matePlanQuestion.questionType = this.questionType;
        MatePlanQuestionAttribute matePlanQuestionAttribute = this.attribute;
        if (matePlanQuestionAttribute != null) {
            matePlanQuestion.attribute = matePlanQuestionAttribute.mo223809clone();
        }
        matePlanQuestion.logo = this.logo;
        matePlanQuestion.status = this.status;
        matePlanQuestion.createdTime = this.createdTime;
        matePlanQuestion.updatedTime = this.updatedTime;
        return matePlanQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatePlanQuestion)) {
            return false;
        }
        MatePlanQuestion matePlanQuestion = (MatePlanQuestion) obj;
        return ValueObject.util_equals(this.questionId, matePlanQuestion.questionId) && ValueObject.util_equals(this.content, matePlanQuestion.content) && this.index == matePlanQuestion.index && ValueObject.util_equals(this.category, matePlanQuestion.category) && ValueObject.util_equals(this.questionType, matePlanQuestion.questionType) && ValueObject.util_equals(this.attribute, matePlanQuestion.attribute) && ValueObject.util_equals(this.logo, matePlanQuestion.logo) && ValueObject.util_equals(this.status, matePlanQuestion.status) && this.createdTime == matePlanQuestion.createdTime && this.updatedTime == matePlanQuestion.updatedTime;
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
        String str = this.questionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.index) * 41;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.questionType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        MatePlanQuestionAttribute matePlanQuestionAttribute = this.attribute;
        int iHashCode5 = (iHashCode4 + (matePlanQuestionAttribute != null ? matePlanQuestionAttribute.hashCode() : 0)) * 41;
        String str5 = this.logo;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.status;
        int iHashCode7 = str6 != null ? str6.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode6 + iHashCode7) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.updatedTime);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.questionId == null) {
            this.questionId = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.questionType == null) {
            this.questionType = "";
        }
        if (this.attribute == null) {
            this.attribute = MatePlanQuestionAttribute.new_();
        }
        if (this.logo == null) {
            this.logo = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
