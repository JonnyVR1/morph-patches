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
public class QuestionnaireOptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionnaireoptions";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean checked;

    @NonNull
    @ProtobufIndex(index = 1)
    public String image;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String imageSelected;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public NextQuestionnaire nextPage;

    @NonNull
    @ProtobufIndex(index = 4)
    public String value;
    public static ProtobufAdapter<QuestionnaireOptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionnaireOptions>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireOptions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuestionnaireOptions questionnaireOptions) {
            String str = questionnaireOptions.image;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = questionnaireOptions.imageSelected;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            NextQuestionnaire nextQuestionnaire = questionnaireOptions.nextPage;
            if (nextQuestionnaire != null) {
                iO += CodedOutputByteBufferNano.l(3, nextQuestionnaire, NextQuestionnaire.PROTOBUF_ADAPTER);
            }
            String str3 = questionnaireOptions.value;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, questionnaireOptions.checked);
            ((MessageNano) questionnaireOptions).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuestionnaireOptions m15137parse(nb5 nb5Var) throws IOException {
            QuestionnaireOptions questionnaireOptions = new QuestionnaireOptions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (questionnaireOptions.value == null) {
                        questionnaireOptions.value = "";
                    }
                    if (questionnaireOptions.image == null) {
                        questionnaireOptions.image = "";
                    }
                    if (questionnaireOptions.imageSelected == null) {
                        questionnaireOptions.imageSelected = "";
                    }
                    if (questionnaireOptions.nextPage != null) {
                        break;
                    }
                    questionnaireOptions.nextPage = NextQuestionnaire.new_();
                    break;
                }
                if (iU == 10) {
                    questionnaireOptions.image = nb5Var.s();
                } else if (iU == 18) {
                    questionnaireOptions.imageSelected = nb5Var.s();
                } else if (iU == 26) {
                    questionnaireOptions.nextPage = (NextQuestionnaire) nb5Var.l(NextQuestionnaire.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    questionnaireOptions.value = nb5Var.s();
                } else {
                    if (iU != 40) {
                        if (questionnaireOptions.value == null) {
                            questionnaireOptions.value = "";
                        }
                        if (questionnaireOptions.image == null) {
                            questionnaireOptions.image = "";
                        }
                        if (questionnaireOptions.imageSelected == null) {
                            questionnaireOptions.imageSelected = "";
                        }
                        if (questionnaireOptions.nextPage != null) {
                            break;
                        }
                        questionnaireOptions.nextPage = NextQuestionnaire.new_();
                        return questionnaireOptions;
                    }
                    questionnaireOptions.checked = nb5Var.g();
                }
            }
            return questionnaireOptions;
        }

        public void serialize(QuestionnaireOptions questionnaireOptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questionnaireOptions.image;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = questionnaireOptions.imageSelected;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            NextQuestionnaire nextQuestionnaire = questionnaireOptions.nextPage;
            if (nextQuestionnaire != null) {
                codedOutputByteBufferNano.K(3, nextQuestionnaire, NextQuestionnaire.PROTOBUF_ADAPTER);
            }
            String str3 = questionnaireOptions.value;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            codedOutputByteBufferNano.A(5, questionnaireOptions.checked);
        }
    };
    public static JsonAdapter<QuestionnaireOptions> JSON_ADAPTER = new ObjectJsonAdapter<QuestionnaireOptions>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireOptions.2
        public Class getDataClass() {
            return QuestionnaireOptions.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuestionnaireOptions m15138newInstance() {
            return new QuestionnaireOptions();
        }

        public boolean parseField(QuestionnaireOptions questionnaireOptions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "imageSelected":
                    questionnaireOptions.imageSelected = jsonParser.getValueAsString();
                    return true;
                case "image":
                    questionnaireOptions.image = jsonParser.getValueAsString();
                    return true;
                case "value":
                    questionnaireOptions.value = jsonParser.getValueAsString();
                    return true;
                case "checked":
                    questionnaireOptions.checked = jsonParser.getValueAsBoolean();
                    return true;
                case "nextPage":
                    questionnaireOptions.nextPage = (NextQuestionnaire) NextQuestionnaire.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuestionnaireOptions questionnaireOptions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "imageSelected":
                case "image":
                case "value":
                case "checked":
                case "nextPage":
                    return true;
                default:
                    return super.parseFieldCheck(questionnaireOptions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(QuestionnaireOptions questionnaireOptions, JsonGenerator jsonGenerator) throws IOException {
            String str = questionnaireOptions.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeBooleanField("checked", questionnaireOptions.checked);
            String str2 = questionnaireOptions.image;
            if (str2 != null) {
                jsonGenerator.writeStringField("image", str2);
            }
            String str3 = questionnaireOptions.imageSelected;
            if (str3 != null) {
                jsonGenerator.writeStringField("imageSelected", str3);
            }
            if (questionnaireOptions.nextPage != null) {
                jsonGenerator.writeFieldName("nextPage");
                NextQuestionnaire.JSON_ADAPTER.serialize(questionnaireOptions.nextPage, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionnaireOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionnaireOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuestionnaireOptions new_() {
        QuestionnaireOptions questionnaireOptions = new QuestionnaireOptions();
        questionnaireOptions.nullCheck();
        return questionnaireOptions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuestionnaireOptions m15136clone() {
        QuestionnaireOptions questionnaireOptions = new QuestionnaireOptions();
        questionnaireOptions.value = this.value;
        questionnaireOptions.checked = this.checked;
        questionnaireOptions.image = this.image;
        questionnaireOptions.imageSelected = this.imageSelected;
        NextQuestionnaire nextQuestionnaire = this.nextPage;
        if (nextQuestionnaire != null) {
            questionnaireOptions.nextPage = nextQuestionnaire.m14554clone();
        }
        return questionnaireOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuestionnaireOptions)) {
            return false;
        }
        QuestionnaireOptions questionnaireOptions = (QuestionnaireOptions) obj;
        return ValueObject.util_equals(this.value, questionnaireOptions.value) && this.checked == questionnaireOptions.checked && ValueObject.util_equals(this.image, questionnaireOptions.image) && ValueObject.util_equals(this.imageSelected, questionnaireOptions.imageSelected) && ValueObject.util_equals(this.nextPage, questionnaireOptions.nextPage);
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
        String str = this.value;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.checked ? 1231 : 1237)) * 41;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.imageSelected;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        NextQuestionnaire nextQuestionnaire = this.nextPage;
        int iHashCode4 = iHashCode3 + (nextQuestionnaire != null ? nextQuestionnaire.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.image == null) {
            this.image = "";
        }
        if (this.imageSelected == null) {
            this.imageSelected = "";
        }
        if (this.nextPage == null) {
            this.nextPage = NextQuestionnaire.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
