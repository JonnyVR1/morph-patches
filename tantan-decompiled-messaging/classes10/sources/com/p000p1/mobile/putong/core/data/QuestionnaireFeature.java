package com.p000p1.mobile.putong.core.data;

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
public class QuestionnaireFeature extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionnairefeature";

    @ProtobufIndex(index = 1)
    public boolean lowLikeRatio;
    public static ProtobufAdapter<QuestionnaireFeature> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionnaireFeature>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireFeature.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuestionnaireFeature questionnaireFeature) {
            int iB = CodedOutputByteBufferNano.b(1, questionnaireFeature.lowLikeRatio);
            ((MessageNano) questionnaireFeature).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuestionnaireFeature m15133parse(nb5 nb5Var) throws IOException {
            QuestionnaireFeature questionnaireFeature = new QuestionnaireFeature();
            while (nb5Var.u() == 8) {
                questionnaireFeature.lowLikeRatio = nb5Var.g();
            }
            return questionnaireFeature;
        }

        public void serialize(QuestionnaireFeature questionnaireFeature, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, questionnaireFeature.lowLikeRatio);
        }
    };
    public static JsonAdapter<QuestionnaireFeature> JSON_ADAPTER = new ObjectJsonAdapter<QuestionnaireFeature>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireFeature.2
        public Class getDataClass() {
            return QuestionnaireFeature.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuestionnaireFeature m15134newInstance() {
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

        public void serializeFields(QuestionnaireFeature questionnaireFeature, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(QuestionnaireStrategy.lowLikeRatio, questionnaireFeature.lowLikeRatio);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionnaireFeature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionnaireFeature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuestionnaireFeature new_() {
        QuestionnaireFeature questionnaireFeature = new QuestionnaireFeature();
        questionnaireFeature.nullCheck();
        return questionnaireFeature;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuestionnaireFeature m15132clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.lowLikeRatio ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
