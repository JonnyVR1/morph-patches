package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.StateOption;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class StateQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "statequestion";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String f165id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String question;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<StateOption> stateOptions;
    public static ProtobufAdapter<StateQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateQuestion>() { // from class: com.p1.mobile.putong.core.data.StateQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StateQuestion stateQuestion) {
            String str = stateQuestion.question;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<StateOption> list = stateQuestion.stateOptions;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = stateQuestion.f165id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) stateQuestion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StateQuestion m15762parse(nb5 nb5Var) throws IOException {
            StateQuestion stateQuestion = new StateQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stateQuestion.question == null) {
                        stateQuestion.question = "";
                    }
                    if (stateQuestion.stateOptions == null) {
                        stateQuestion.stateOptions = new ArrayList();
                    }
                    if (stateQuestion.f165id != null) {
                        break;
                    }
                    stateQuestion.f165id = "";
                    break;
                }
                if (iU == 10) {
                    stateQuestion.question = nb5Var.s();
                } else if (iU == 18) {
                    stateQuestion.stateOptions = (List) nb5Var.l(StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (stateQuestion.question == null) {
                            stateQuestion.question = "";
                        }
                        if (stateQuestion.stateOptions == null) {
                            stateQuestion.stateOptions = new ArrayList();
                        }
                        if (stateQuestion.f165id != null) {
                            break;
                        }
                        stateQuestion.f165id = "";
                        return stateQuestion;
                    }
                    stateQuestion.f165id = nb5Var.s();
                }
            }
            return stateQuestion;
        }

        public void serialize(StateQuestion stateQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateQuestion.question;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<StateOption> list = stateQuestion.stateOptions;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, StateOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = stateQuestion.f165id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<StateQuestion> JSON_ADAPTER = new ObjectJsonAdapter<StateQuestion>() { // from class: com.p1.mobile.putong.core.data.StateQuestion.2
        public Class getDataClass() {
            return StateQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public StateQuestion m15763newInstance() {
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
                    stateQuestion.f165id = jsonParser.getValueAsString();
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

        public void serializeFields(StateQuestion stateQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = stateQuestion.question;
            if (str != null) {
                jsonGenerator.writeStringField("question", str);
            }
            if (stateQuestion.stateOptions != null) {
                jsonGenerator.writeFieldName("stateOptions");
                JsonAdapter.serializeArray(stateQuestion.stateOptions, jsonGenerator, StateOption.JSON_ADAPTER);
            }
            String str2 = stateQuestion.f165id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateQuestion new_() {
        StateQuestion stateQuestion = new StateQuestion();
        stateQuestion.nullCheck();
        return stateQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StateQuestion m15761clone() {
        StateQuestion stateQuestion = new StateQuestion();
        stateQuestion.question = this.question;
        List<StateOption> list = this.stateOptions;
        if (list != null) {
            stateQuestion.stateOptions = ValueObject.util_map(list, new w9j() { // from class: l.lvf0
                public final Object call(Object obj) {
                    return ((StateOption) obj).m15757clone();
                }
            });
        }
        stateQuestion.f165id = this.f165id;
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
        return ValueObject.util_equals(this.question, stateQuestion.question) && ValueObject.util_equals(this.stateOptions, stateQuestion.stateOptions) && ValueObject.util_equals(this.f165id, stateQuestion.f165id);
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
        String str = this.question;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<StateOption> list = this.stateOptions;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.f165id;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.question == null) {
            this.question = "";
        }
        if (this.stateOptions == null) {
            this.stateOptions = new ArrayList();
        }
        if (this.f165id == null) {
            this.f165id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
