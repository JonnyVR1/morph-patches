package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

/* JADX INFO: loaded from: classes12.dex */
public class Answer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "answer";

    @Nullable
    @ProtobufIndex(index = 4)
    public OfficialAccountAction action;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 3)
    public String f39569id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String question;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<Answer> PROTOBUF_ADAPTER = new MessageNanoAdapter<Answer>() { // from class: com.p1.mobile.putong.data.Answer.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Answer answer) {
            String str = answer.value;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = answer.question;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = answer.f39569id;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            OfficialAccountAction officialAccountAction = answer.action;
            if (officialAccountAction != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            answer.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Answer parse(nc5 nc5Var) throws IOException {
            Answer answer = new Answer();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (answer.value == null) {
                        answer.value = "";
                    }
                    if (answer.question != null) {
                        break;
                    }
                    answer.question = "";
                    break;
                }
                if (iM162497u == 10) {
                    answer.value = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    answer.question = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    answer.f39569id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (answer.value == null) {
                            answer.value = "";
                        }
                        if (answer.question != null) {
                            break;
                        }
                        answer.question = "";
                        return answer;
                    }
                    answer.action = (OfficialAccountAction) nc5Var.m162488l(OfficialAccountAction.PROTOBUF_ADAPTER);
                }
            }
            return answer;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Answer answer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = answer.value;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = answer.question;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = answer.f39569id;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            OfficialAccountAction officialAccountAction = answer.action;
            if (officialAccountAction != null) {
                codedOutputByteBufferNano.m17309K(4, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Answer> JSON_ADAPTER = new ObjectJsonAdapter<Answer>() { // from class: com.p1.mobile.putong.data.Answer.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Answer.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Answer newInstance() {
            return new Answer();
        }

        public boolean parseField(Answer answer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    answer.action = OfficialAccountAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "question":
                    answer.question = Converter.QUESTION_ID.parse(jsonParser, str2);
                    return true;
                case "id":
                    answer.f39569id = jsonParser.getValueAsString();
                    return false;
                case "value":
                    answer.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Answer answer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                case "question":
                    return true;
                case "id":
                    return false;
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(answer, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Answer answer, JsonGenerator jsonGenerator) throws IOException {
            String str = answer.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            if (answer.question != null) {
                jsonGenerator.writeFieldName("question");
                Converter.QUESTION_ID.serialize(answer.question, jsonGenerator, true);
            }
            String str2 = answer.f39569id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (answer.action != null) {
                jsonGenerator.writeFieldName("action");
                OfficialAccountAction.JSON_ADAPTER.serialize(answer.action, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Answer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Answer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Answer new_() {
        Answer answer = new Answer();
        answer.nullCheck();
        return answer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Answer mo225055clone() {
        Answer answer = new Answer();
        answer.value = this.value;
        answer.question = this.question;
        answer.f39569id = this.f39569id;
        OfficialAccountAction officialAccountAction = this.action;
        if (officialAccountAction != null) {
            answer.action = officialAccountAction.mo225055clone();
        }
        return answer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Answer)) {
            return false;
        }
        Answer answer = (Answer) obj;
        return ValueObject.util_equals(this.value, answer.value) && ValueObject.util_equals(this.question, answer.question) && ValueObject.util_equals(this.f39569id, answer.f39569id) && ValueObject.util_equals(this.action, answer.action);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.question;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f39569id;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        OfficialAccountAction officialAccountAction = this.action;
        int iHashCode4 = iHashCode3 + (officialAccountAction != null ? officialAccountAction.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.question == null) {
            this.question = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
