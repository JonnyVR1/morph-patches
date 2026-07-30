package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.StateOption;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class StateQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "statequestion";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f21245id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String question;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<StateOption> stateOptions;
    public static ProtobufAdapter<StateQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateQuestion>() { // from class: com.p1.mobile.putong.core.data.StateQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StateQuestion stateQuestion) {
            String str = stateQuestion.question;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<StateOption> list = stateQuestion.stateOptions;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = stateQuestion.f21245id;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            stateQuestion.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StateQuestion parse(nc5 nc5Var) throws IOException {
            StateQuestion stateQuestion = new StateQuestion();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (stateQuestion.question == null) {
                        stateQuestion.question = "";
                    }
                    if (stateQuestion.stateOptions == null) {
                        stateQuestion.stateOptions = new ArrayList();
                    }
                    if (stateQuestion.f21245id != null) {
                        break;
                    }
                    stateQuestion.f21245id = "";
                    break;
                }
                if (iM162497u == 10) {
                    stateQuestion.question = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    stateQuestion.stateOptions = (List) nc5Var.m162488l(StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (stateQuestion.question == null) {
                            stateQuestion.question = "";
                        }
                        if (stateQuestion.stateOptions == null) {
                            stateQuestion.stateOptions = new ArrayList();
                        }
                        if (stateQuestion.f21245id != null) {
                            break;
                        }
                        stateQuestion.f21245id = "";
                        return stateQuestion;
                    }
                    stateQuestion.f21245id = nc5Var.m162495s();
                }
            }
            return stateQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StateQuestion stateQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateQuestion.question;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<StateOption> list = stateQuestion.stateOptions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = stateQuestion.f21245id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<StateQuestion> JSON_ADAPTER = new ObjectJsonAdapter<StateQuestion>() { // from class: com.p1.mobile.putong.core.data.StateQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StateQuestion.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    stateQuestion.f21245id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StateQuestion stateQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = stateQuestion.question;
            if (str != null) {
                jsonGenerator.writeStringField("question", str);
            }
            if (stateQuestion.stateOptions != null) {
                jsonGenerator.writeFieldName("stateOptions");
                JsonAdapter.serializeArray(stateQuestion.stateOptions, jsonGenerator, StateOption.JSON_ADAPTER);
            }
            String str2 = stateQuestion.f21245id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public StateQuestion mo225055clone() {
        StateQuestion stateQuestion = new StateQuestion();
        stateQuestion.question = this.question;
        List<StateOption> list = this.stateOptions;
        if (list != null) {
            stateQuestion.stateOptions = ValueObject.util_map(list, new qcj() { // from class: l.u3g0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((StateOption) obj).mo225055clone();
                }
            });
        }
        stateQuestion.f21245id = this.f21245id;
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
        return ValueObject.util_equals(this.question, stateQuestion.question) && ValueObject.util_equals(this.stateOptions, stateQuestion.stateOptions) && ValueObject.util_equals(this.f21245id, stateQuestion.f21245id);
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
        String str2 = this.f21245id;
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
        if (this.f21245id == null) {
            this.f21245id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
