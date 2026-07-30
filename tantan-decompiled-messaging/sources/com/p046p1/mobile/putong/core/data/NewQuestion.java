package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class NewQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newquestion";

    @NonNull
    @ProtobufIndex(index = 2)
    public String actorId;

    @ProtobufIndex(index = 7)
    public boolean fallback;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20455id;

    @ProtobufIndex(index = 5)
    public int index;

    @NonNull
    @ProtobufIndex(index = 4)
    public String questionId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String receiverId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String roundId;
    public static ProtobufAdapter<NewQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewQuestion>() { // from class: com.p1.mobile.putong.core.data.NewQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewQuestion newQuestion) {
            String str = newQuestion.f20455id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = newQuestion.actorId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = newQuestion.receiverId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = newQuestion.questionId;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, newQuestion.index);
            String str5 = newQuestion.roundId;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(7, newQuestion.fallback);
            newQuestion.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewQuestion parse(nb5 nb5Var) throws IOException {
            NewQuestion newQuestion = new NewQuestion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (newQuestion.f20455id == null) {
                        newQuestion.f20455id = "";
                    }
                    if (newQuestion.actorId == null) {
                        newQuestion.actorId = "";
                    }
                    if (newQuestion.receiverId == null) {
                        newQuestion.receiverId = "";
                    }
                    if (newQuestion.questionId == null) {
                        newQuestion.questionId = "";
                    }
                    if (newQuestion.roundId != null) {
                        break;
                    }
                    newQuestion.roundId = "";
                    break;
                }
                if (iM158752u == 10) {
                    newQuestion.f20455id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    newQuestion.actorId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    newQuestion.receiverId = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    newQuestion.questionId = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    newQuestion.index = nb5Var.m158741j();
                } else if (iM158752u == 50) {
                    newQuestion.roundId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 56) {
                        if (newQuestion.f20455id == null) {
                            newQuestion.f20455id = "";
                        }
                        if (newQuestion.actorId == null) {
                            newQuestion.actorId = "";
                        }
                        if (newQuestion.receiverId == null) {
                            newQuestion.receiverId = "";
                        }
                        if (newQuestion.questionId == null) {
                            newQuestion.questionId = "";
                        }
                        if (newQuestion.roundId != null) {
                            break;
                        }
                        newQuestion.roundId = "";
                        return newQuestion;
                    }
                    newQuestion.fallback = nb5Var.m158738g();
                }
            }
            return newQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewQuestion newQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newQuestion.f20455id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = newQuestion.actorId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = newQuestion.receiverId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = newQuestion.questionId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17250G(5, newQuestion.index);
            String str5 = newQuestion.roundId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            codedOutputByteBufferNano.m17244A(7, newQuestion.fallback);
        }
    };
    public static JsonAdapter<NewQuestion> JSON_ADAPTER = new ObjectJsonAdapter<NewQuestion>() { // from class: com.p1.mobile.putong.core.data.NewQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewQuestion newInstance() {
            return new NewQuestion();
        }

        public boolean parseField(NewQuestion newQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "actorId":
                    newQuestion.actorId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    newQuestion.f20455id = jsonParser.getValueAsString();
                    return false;
                case "index":
                    newQuestion.index = jsonParser.getValueAsInt();
                    return true;
                case "receiverId":
                    newQuestion.receiverId = jsonParser.getValueAsString();
                    return true;
                case "questionId":
                    newQuestion.questionId = jsonParser.getValueAsString();
                    return true;
                case "fallback":
                    newQuestion.fallback = jsonParser.getValueAsBoolean();
                    return true;
                case "roundId":
                    newQuestion.roundId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewQuestion newQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "actorId":
                    return true;
                case "id":
                    return false;
                case "index":
                case "receiverId":
                case "questionId":
                case "fallback":
                case "roundId":
                    return true;
                default:
                    return super.parseFieldCheck(newQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewQuestion newQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = newQuestion.f20455id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = newQuestion.actorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("actorId", str2);
            }
            String str3 = newQuestion.receiverId;
            if (str3 != null) {
                jsonGenerator.writeStringField("receiverId", str3);
            }
            String str4 = newQuestion.questionId;
            if (str4 != null) {
                jsonGenerator.writeStringField("questionId", str4);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, newQuestion.index);
            String str5 = newQuestion.roundId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roundId", str5);
            }
            jsonGenerator.writeBooleanField("fallback", newQuestion.fallback);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewQuestion new_() {
        NewQuestion newQuestion = new NewQuestion();
        newQuestion.nullCheck();
        return newQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewQuestion mo223809clone() {
        NewQuestion newQuestion = new NewQuestion();
        newQuestion.f20455id = this.f20455id;
        newQuestion.actorId = this.actorId;
        newQuestion.receiverId = this.receiverId;
        newQuestion.questionId = this.questionId;
        newQuestion.index = this.index;
        newQuestion.roundId = this.roundId;
        newQuestion.fallback = this.fallback;
        return newQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewQuestion)) {
            return false;
        }
        NewQuestion newQuestion = (NewQuestion) obj;
        return ValueObject.util_equals(this.f20455id, newQuestion.f20455id) && ValueObject.util_equals(this.actorId, newQuestion.actorId) && ValueObject.util_equals(this.receiverId, newQuestion.receiverId) && ValueObject.util_equals(this.questionId, newQuestion.questionId) && this.index == newQuestion.index && ValueObject.util_equals(this.roundId, newQuestion.roundId) && this.fallback == newQuestion.fallback;
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
        String str = this.f20455id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.actorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.receiverId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.questionId;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.index) * 41;
        String str5 = this.roundId;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.fallback ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20455id == null) {
            this.f20455id = "";
        }
        if (this.actorId == null) {
            this.actorId = "";
        }
        if (this.receiverId == null) {
            this.receiverId = "";
        }
        if (this.questionId == null) {
            this.questionId = "";
        }
        if (this.roundId == null) {
            this.roundId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
