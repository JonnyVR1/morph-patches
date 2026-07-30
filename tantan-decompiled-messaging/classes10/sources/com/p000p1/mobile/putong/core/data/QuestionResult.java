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
public class QuestionResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionresult";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f142id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String myAnswerId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String otherAnswerId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String questionId;
    public static ProtobufAdapter<QuestionResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionResult>() { // from class: com.p1.mobile.putong.core.data.QuestionResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuestionResult questionResult) {
            String str = questionResult.f142id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = questionResult.questionId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = questionResult.myAnswerId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = questionResult.otherAnswerId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) questionResult).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuestionResult m15125parse(nb5 nb5Var) throws IOException {
            QuestionResult questionResult = new QuestionResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (questionResult.f142id == null) {
                        questionResult.f142id = "";
                    }
                    if (questionResult.questionId == null) {
                        questionResult.questionId = "";
                    }
                    if (questionResult.myAnswerId == null) {
                        questionResult.myAnswerId = "";
                    }
                    if (questionResult.otherAnswerId != null) {
                        break;
                    }
                    questionResult.otherAnswerId = "";
                    break;
                }
                if (iU == 10) {
                    questionResult.f142id = nb5Var.s();
                } else if (iU == 18) {
                    questionResult.questionId = nb5Var.s();
                } else if (iU == 26) {
                    questionResult.myAnswerId = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (questionResult.f142id == null) {
                            questionResult.f142id = "";
                        }
                        if (questionResult.questionId == null) {
                            questionResult.questionId = "";
                        }
                        if (questionResult.myAnswerId == null) {
                            questionResult.myAnswerId = "";
                        }
                        if (questionResult.otherAnswerId != null) {
                            break;
                        }
                        questionResult.otherAnswerId = "";
                        return questionResult;
                    }
                    questionResult.otherAnswerId = nb5Var.s();
                }
            }
            return questionResult;
        }

        public void serialize(QuestionResult questionResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questionResult.f142id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = questionResult.questionId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = questionResult.myAnswerId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = questionResult.otherAnswerId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<QuestionResult> JSON_ADAPTER = new ObjectJsonAdapter<QuestionResult>() { // from class: com.p1.mobile.putong.core.data.QuestionResult.2
        public Class getDataClass() {
            return QuestionResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuestionResult m15126newInstance() {
            return new QuestionResult();
        }

        public boolean parseField(QuestionResult questionResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherAnswerId":
                    questionResult.otherAnswerId = jsonParser.getValueAsString();
                    return true;
                case "myAnswerId":
                    questionResult.myAnswerId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    questionResult.f142id = jsonParser.getValueAsString();
                    return false;
                case "questionId":
                    questionResult.questionId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuestionResult questionResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherAnswerId":
                case "myAnswerId":
                    return true;
                case "id":
                    return false;
                case "questionId":
                    return true;
                default:
                    return super.parseFieldCheck(questionResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(QuestionResult questionResult, JsonGenerator jsonGenerator) throws IOException {
            String str = questionResult.f142id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = questionResult.questionId;
            if (str2 != null) {
                jsonGenerator.writeStringField("questionId", str2);
            }
            String str3 = questionResult.myAnswerId;
            if (str3 != null) {
                jsonGenerator.writeStringField("myAnswerId", str3);
            }
            String str4 = questionResult.otherAnswerId;
            if (str4 != null) {
                jsonGenerator.writeStringField("otherAnswerId", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuestionResult new_() {
        QuestionResult questionResult = new QuestionResult();
        questionResult.nullCheck();
        return questionResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuestionResult m15124clone() {
        QuestionResult questionResult = new QuestionResult();
        questionResult.f142id = this.f142id;
        questionResult.questionId = this.questionId;
        questionResult.myAnswerId = this.myAnswerId;
        questionResult.otherAnswerId = this.otherAnswerId;
        return questionResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuestionResult)) {
            return false;
        }
        QuestionResult questionResult = (QuestionResult) obj;
        return ValueObject.util_equals(this.f142id, questionResult.f142id) && ValueObject.util_equals(this.questionId, questionResult.questionId) && ValueObject.util_equals(this.myAnswerId, questionResult.myAnswerId) && ValueObject.util_equals(this.otherAnswerId, questionResult.otherAnswerId);
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
        String str = this.f142id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.questionId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.myAnswerId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.otherAnswerId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f142id == null) {
            this.f142id = "";
        }
        if (this.questionId == null) {
            this.questionId = "";
        }
        if (this.myAnswerId == null) {
            this.myAnswerId = "";
        }
        if (this.otherAnswerId == null) {
            this.otherAnswerId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
