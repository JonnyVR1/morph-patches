package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class MatePlanQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mateplanquestion";

    @NonNull
    @ProtobufIndex(index = 6)
    public MatePlanQuestionAttribute attribute;

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String content;

    @ProtobufIndex(index = 9)
    public double createdTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int index;

    @NonNull
    @ProtobufIndex(index = 7)
    public String logo;

    @NonNull
    @ProtobufIndex(index = 1)
    public String questionId;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String questionType;

    @NonNull
    @ProtobufIndex(index = 8)
    public String status;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public double updatedTime;
    public static ProtobufAdapter<MatePlanQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatePlanQuestion>() { // from class: com.p1.mobile.putong.core.data.MatePlanQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MatePlanQuestion matePlanQuestion) {
            String str = matePlanQuestion.questionId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = matePlanQuestion.content;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, matePlanQuestion.index);
            String str3 = matePlanQuestion.category;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = matePlanQuestion.questionType;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(5, str4);
            }
            MatePlanQuestionAttribute matePlanQuestionAttribute = matePlanQuestion.attribute;
            if (matePlanQuestionAttribute != null) {
                iH += CodedOutputByteBufferNano.l(6, matePlanQuestionAttribute, MatePlanQuestionAttribute.PROTOBUF_ADAPTER);
            }
            String str5 = matePlanQuestion.logo;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(7, str5);
            }
            String str6 = matePlanQuestion.status;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(8, str6);
            }
            int iD = iH + CodedOutputByteBufferNano.d(9, matePlanQuestion.createdTime) + CodedOutputByteBufferNano.d(10, matePlanQuestion.updatedTime);
            ((MessageNano) matePlanQuestion).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MatePlanQuestion m14081parse(nb5 nb5Var) throws IOException {
            MatePlanQuestion matePlanQuestion = new MatePlanQuestion();
            while (true) {
                switch (nb5Var.u()) {
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
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        matePlanQuestion.questionId = nb5Var.s();
                        continue;
                    case 18:
                        matePlanQuestion.content = nb5Var.s();
                        continue;
                    case 24:
                        matePlanQuestion.index = nb5Var.j();
                        continue;
                    case 34:
                        matePlanQuestion.category = nb5Var.s();
                        continue;
                    case 42:
                        matePlanQuestion.questionType = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        matePlanQuestion.attribute = (MatePlanQuestionAttribute) nb5Var.l(MatePlanQuestionAttribute.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        matePlanQuestion.logo = nb5Var.s();
                        continue;
                    case 66:
                        matePlanQuestion.status = nb5Var.s();
                        continue;
                    case 73:
                        matePlanQuestion.createdTime = nb5Var.h();
                        continue;
                    case 81:
                        matePlanQuestion.updatedTime = nb5Var.h();
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

        public void serialize(MatePlanQuestion matePlanQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = matePlanQuestion.questionId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = matePlanQuestion.content;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, matePlanQuestion.index);
            String str3 = matePlanQuestion.category;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = matePlanQuestion.questionType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            MatePlanQuestionAttribute matePlanQuestionAttribute = matePlanQuestion.attribute;
            if (matePlanQuestionAttribute != null) {
                codedOutputByteBufferNano.K(6, matePlanQuestionAttribute, MatePlanQuestionAttribute.PROTOBUF_ADAPTER);
            }
            String str5 = matePlanQuestion.logo;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            String str6 = matePlanQuestion.status;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
            codedOutputByteBufferNano.C(9, matePlanQuestion.createdTime);
            codedOutputByteBufferNano.C(10, matePlanQuestion.updatedTime);
        }
    };
    public static JsonAdapter<MatePlanQuestion> JSON_ADAPTER = new ObjectJsonAdapter<MatePlanQuestion>() { // from class: com.p1.mobile.putong.core.data.MatePlanQuestion.2
        public Class getDataClass() {
            return MatePlanQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MatePlanQuestion m14082newInstance() {
            return new MatePlanQuestion();
        }

        public boolean parseField(MatePlanQuestion matePlanQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    matePlanQuestion.status = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    matePlanQuestion.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "createdTime":
                    matePlanQuestion.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "questionType":
                    matePlanQuestion.questionType = jsonParser.getValueAsString();
                    return true;
                case "logo":
                    matePlanQuestion.logo = jsonParser.getValueAsString();
                    return true;
                case "attribute":
                    matePlanQuestion.attribute = (MatePlanQuestionAttribute) MatePlanQuestionAttribute.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(MatePlanQuestion matePlanQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = matePlanQuestion.questionId;
            if (str != null) {
                jsonGenerator.writeStringField("questionId", str);
            }
            String str2 = matePlanQuestion.content;
            if (str2 != null) {
                jsonGenerator.writeStringField(Content.TYPE, str2);
            }
            jsonGenerator.writeNumberField("index", matePlanQuestion.index);
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
                jsonGenerator.writeStringField("status", str6);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(matePlanQuestion.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("updatedTime");
            jsonAdapter.serialize(Double.valueOf(matePlanQuestion.updatedTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatePlanQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatePlanQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatePlanQuestion new_() {
        MatePlanQuestion matePlanQuestion = new MatePlanQuestion();
        matePlanQuestion.nullCheck();
        return matePlanQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MatePlanQuestion m14080clone() {
        MatePlanQuestion matePlanQuestion = new MatePlanQuestion();
        matePlanQuestion.questionId = this.questionId;
        matePlanQuestion.content = this.content;
        matePlanQuestion.index = this.index;
        matePlanQuestion.category = this.category;
        matePlanQuestion.questionType = this.questionType;
        MatePlanQuestionAttribute matePlanQuestionAttribute = this.attribute;
        if (matePlanQuestionAttribute != null) {
            matePlanQuestion.attribute = matePlanQuestionAttribute.m14084clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
