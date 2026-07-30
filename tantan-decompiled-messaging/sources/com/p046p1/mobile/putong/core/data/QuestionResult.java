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
public class QuestionResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionresult";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20480id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String myAnswerId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String otherAnswerId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String questionId;
    public static ProtobufAdapter<QuestionResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionResult>() { // from class: com.p1.mobile.putong.core.data.QuestionResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuestionResult questionResult) {
            String str = questionResult.f20480id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = questionResult.questionId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = questionResult.myAnswerId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = questionResult.otherAnswerId;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            questionResult.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuestionResult parse(nb5 nb5Var) throws IOException {
            QuestionResult questionResult = new QuestionResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (questionResult.f20480id == null) {
                        questionResult.f20480id = "";
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
                if (iM158752u == 10) {
                    questionResult.f20480id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    questionResult.questionId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    questionResult.myAnswerId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (questionResult.f20480id == null) {
                            questionResult.f20480id = "";
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
                    questionResult.otherAnswerId = nb5Var.m158750s();
                }
            }
            return questionResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuestionResult questionResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questionResult.f20480id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = questionResult.questionId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = questionResult.myAnswerId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = questionResult.otherAnswerId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<QuestionResult> JSON_ADAPTER = new ObjectJsonAdapter<QuestionResult>() { // from class: com.p1.mobile.putong.core.data.QuestionResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuestionResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuestionResult newInstance() {
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
                    questionResult.f20480id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuestionResult questionResult, JsonGenerator jsonGenerator) throws IOException {
            String str = questionResult.f20480id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuestionResult new_() {
        QuestionResult questionResult = new QuestionResult();
        questionResult.nullCheck();
        return questionResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuestionResult mo223809clone() {
        QuestionResult questionResult = new QuestionResult();
        questionResult.f20480id = this.f20480id;
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
        return ValueObject.util_equals(this.f20480id, questionResult.f20480id) && ValueObject.util_equals(this.questionId, questionResult.questionId) && ValueObject.util_equals(this.myAnswerId, questionResult.myAnswerId) && ValueObject.util_equals(this.otherAnswerId, questionResult.otherAnswerId);
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
        String str = this.f20480id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.questionId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.myAnswerId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.otherAnswerId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20480id == null) {
            this.f20480id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
