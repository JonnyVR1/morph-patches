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
public class QuestionnaireOptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionnaireoptions";

    @ProtobufIndex(index = 5)
    public boolean checked;

    @NonNull
    @ProtobufIndex(index = 1)
    public String image;

    @NonNull
    @ProtobufIndex(index = 2)
    public String imageSelected;

    @NonNull
    @ProtobufIndex(index = 3)
    public NextQuestionnaire nextPage;

    @NonNull
    @ProtobufIndex(index = 4)
    public String value;
    public static ProtobufAdapter<QuestionnaireOptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionnaireOptions>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireOptions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuestionnaireOptions questionnaireOptions) {
            String str = questionnaireOptions.image;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = questionnaireOptions.imageSelected;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            NextQuestionnaire nextQuestionnaire = questionnaireOptions.nextPage;
            if (nextQuestionnaire != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, nextQuestionnaire, NextQuestionnaire.PROTOBUF_ADAPTER);
            }
            String str3 = questionnaireOptions.value;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, questionnaireOptions.checked);
            questionnaireOptions.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuestionnaireOptions parse(nb5 nb5Var) throws IOException {
            QuestionnaireOptions questionnaireOptions = new QuestionnaireOptions();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    questionnaireOptions.image = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    questionnaireOptions.imageSelected = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    questionnaireOptions.nextPage = (NextQuestionnaire) nb5Var.m158743l(NextQuestionnaire.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    questionnaireOptions.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 40) {
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
                    questionnaireOptions.checked = nb5Var.m158738g();
                }
            }
            return questionnaireOptions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuestionnaireOptions questionnaireOptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questionnaireOptions.image;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = questionnaireOptions.imageSelected;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            NextQuestionnaire nextQuestionnaire = questionnaireOptions.nextPage;
            if (nextQuestionnaire != null) {
                codedOutputByteBufferNano.m17254K(3, nextQuestionnaire, NextQuestionnaire.PROTOBUF_ADAPTER);
            }
            String str3 = questionnaireOptions.value;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17244A(5, questionnaireOptions.checked);
        }
    };
    public static JsonAdapter<QuestionnaireOptions> JSON_ADAPTER = new ObjectJsonAdapter<QuestionnaireOptions>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireOptions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuestionnaireOptions.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuestionnaireOptions newInstance() {
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
                    questionnaireOptions.nextPage = NextQuestionnaire.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionnaireOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionnaireOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuestionnaireOptions new_() {
        QuestionnaireOptions questionnaireOptions = new QuestionnaireOptions();
        questionnaireOptions.nullCheck();
        return questionnaireOptions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuestionnaireOptions mo223809clone() {
        QuestionnaireOptions questionnaireOptions = new QuestionnaireOptions();
        questionnaireOptions.value = this.value;
        questionnaireOptions.checked = this.checked;
        questionnaireOptions.image = this.image;
        questionnaireOptions.imageSelected = this.imageSelected;
        NextQuestionnaire nextQuestionnaire = this.nextPage;
        if (nextQuestionnaire != null) {
            questionnaireOptions.nextPage = nextQuestionnaire.mo223809clone();
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
        String str = this.value;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.checked ? 1231 : 1237)) * 41;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.imageSelected;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        NextQuestionnaire nextQuestionnaire = this.nextPage;
        int iHashCode4 = iHashCode3 + (nextQuestionnaire != null ? nextQuestionnaire.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
