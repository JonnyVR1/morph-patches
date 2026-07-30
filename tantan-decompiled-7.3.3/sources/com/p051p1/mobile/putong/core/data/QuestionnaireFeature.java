package com.p051p1.mobile.putong.core.data;

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
public class QuestionnaireFeature extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionnairefeature";

    @ProtobufIndex(index = 1)
    public boolean lowLikeRatio;
    public static ProtobufAdapter<QuestionnaireFeature> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionnaireFeature>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireFeature.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuestionnaireFeature questionnaireFeature) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, questionnaireFeature.lowLikeRatio);
            questionnaireFeature.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuestionnaireFeature parse(nc5 nc5Var) throws IOException {
            QuestionnaireFeature questionnaireFeature = new QuestionnaireFeature();
            while (nc5Var.m162497u() == 8) {
                questionnaireFeature.lowLikeRatio = nc5Var.m162483g();
            }
            return questionnaireFeature;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuestionnaireFeature questionnaireFeature, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, questionnaireFeature.lowLikeRatio);
        }
    };
    public static JsonAdapter<QuestionnaireFeature> JSON_ADAPTER = new ObjectJsonAdapter<QuestionnaireFeature>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireFeature.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuestionnaireFeature.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuestionnaireFeature newInstance() {
            return new QuestionnaireFeature();
        }

        public boolean parseField(QuestionnaireFeature questionnaireFeature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(QuestionnaireStrategy.lowLikeRatio)) {
                return false;
            }
            questionnaireFeature.lowLikeRatio = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(QuestionnaireFeature questionnaireFeature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(QuestionnaireStrategy.lowLikeRatio)) {
                return true;
            }
            return super.parseFieldCheck(questionnaireFeature, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuestionnaireFeature questionnaireFeature, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(QuestionnaireStrategy.lowLikeRatio, questionnaireFeature.lowLikeRatio);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionnaireFeature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionnaireFeature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuestionnaireFeature new_() {
        QuestionnaireFeature questionnaireFeature = new QuestionnaireFeature();
        questionnaireFeature.nullCheck();
        return questionnaireFeature;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuestionnaireFeature mo225055clone() {
        QuestionnaireFeature questionnaireFeature = new QuestionnaireFeature();
        questionnaireFeature.lowLikeRatio = this.lowLikeRatio;
        return questionnaireFeature;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof QuestionnaireFeature) && this.lowLikeRatio == ((QuestionnaireFeature) obj).lowLikeRatio;
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
        int i2 = (i * 41) + (this.lowLikeRatio ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
