package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.StateOption;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class StateQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "statequestion";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f39245id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String question;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<StateOption> stateOptions;
    public static ProtobufAdapter<StateQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateQuestion>() { // from class: com.p1.mobile.putong.feed.data.StateQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StateQuestion stateQuestion) {
            String str = stateQuestion.question;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<StateOption> list = stateQuestion.stateOptions;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = stateQuestion.f39245id;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            stateQuestion.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StateQuestion parse(nb5 nb5Var) throws IOException {
            StateQuestion stateQuestion = new StateQuestion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (stateQuestion.question == null) {
                        stateQuestion.question = "";
                    }
                    if (stateQuestion.stateOptions == null) {
                        stateQuestion.stateOptions = new ArrayList();
                    }
                    if (stateQuestion.f39245id != null) {
                        break;
                    }
                    stateQuestion.f39245id = "";
                    break;
                }
                if (iM158752u == 10) {
                    stateQuestion.question = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    stateQuestion.stateOptions = (List) nb5Var.m158743l(StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (stateQuestion.question == null) {
                            stateQuestion.question = "";
                        }
                        if (stateQuestion.stateOptions == null) {
                            stateQuestion.stateOptions = new ArrayList();
                        }
                        if (stateQuestion.f39245id != null) {
                            break;
                        }
                        stateQuestion.f39245id = "";
                        return stateQuestion;
                    }
                    stateQuestion.f39245id = nb5Var.m158750s();
                }
            }
            return stateQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StateQuestion stateQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateQuestion.question;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<StateOption> list = stateQuestion.stateOptions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = stateQuestion.f39245id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<StateQuestion> JSON_ADAPTER = new ObjectJsonAdapter<StateQuestion>() { // from class: com.p1.mobile.putong.feed.data.StateQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StateQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StateQuestion newInstance() {
            return new StateQuestion();
        }

        public boolean parseField(StateQuestion stateQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "question":
                    stateQuestion.question = jsonParser.getValueAsString();
                    return true;
                case "stateOptions":
                    stateQuestion.stateOptions = JsonAdapter.parseArray(jsonParser, StateOption.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    stateQuestion.f39245id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StateQuestion stateQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "question":
                case "stateOptions":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(stateQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StateQuestion stateQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = stateQuestion.question;
            if (str != null) {
                jsonGenerator.writeStringField("question", str);
            }
            if (stateQuestion.stateOptions != null) {
                jsonGenerator.writeFieldName("stateOptions");
                JsonAdapter.serializeArray(stateQuestion.stateOptions, jsonGenerator, StateOption.JSON_ADAPTER);
            }
            String str2 = stateQuestion.f39245id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateQuestion new_() {
        StateQuestion stateQuestion = new StateQuestion();
        stateQuestion.nullCheck();
        return stateQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StateQuestion mo223809clone() {
        StateQuestion stateQuestion = new StateQuestion();
        stateQuestion.question = this.question;
        List<StateOption> list = this.stateOptions;
        if (list != null) {
            stateQuestion.stateOptions = ValueObject.util_map(list, new w9j() { // from class: l.kvf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((StateOption) obj).mo223809clone();
                }
            });
        }
        stateQuestion.f39245id = this.f39245id;
        return stateQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateQuestion)) {
            return false;
        }
        StateQuestion stateQuestion = (StateQuestion) obj;
        return ValueObject.util_equals(this.question, stateQuestion.question) && ValueObject.util_equals(this.stateOptions, stateQuestion.stateOptions) && ValueObject.util_equals(this.f39245id, stateQuestion.f39245id);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "statequestion";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.question;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<StateOption> list = this.stateOptions;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.f39245id;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.question == null) {
            this.question = "";
        }
        if (this.stateOptions == null) {
            this.stateOptions = new ArrayList();
        }
        if (this.f39245id == null) {
            this.f39245id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
