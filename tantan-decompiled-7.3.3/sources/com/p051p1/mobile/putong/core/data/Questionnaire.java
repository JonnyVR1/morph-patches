package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.QuestionnaireOptions;
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
public class Questionnaire extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionnaire";

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<QuestionnaireOptions> options;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<Questionnaire> PROTOBUF_ADAPTER = new MessageNanoAdapter<Questionnaire>() { // from class: com.p1.mobile.putong.core.data.Questionnaire.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Questionnaire questionnaire) {
            String str = questionnaire.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = questionnaire.description;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<QuestionnaireOptions> list = questionnaire.options;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, QuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            questionnaire.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Questionnaire parse(nc5 nc5Var) throws IOException {
            Questionnaire questionnaire = new Questionnaire();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (questionnaire.title == null) {
                        questionnaire.title = "";
                    }
                    if (questionnaire.description != null) {
                        break;
                    }
                    questionnaire.description = "";
                    break;
                }
                if (iM162497u == 10) {
                    questionnaire.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    questionnaire.description = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (questionnaire.title == null) {
                            questionnaire.title = "";
                        }
                        if (questionnaire.description != null) {
                            break;
                        }
                        questionnaire.description = "";
                        return questionnaire;
                    }
                    questionnaire.options = (List) nc5Var.m162488l(QuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return questionnaire;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Questionnaire questionnaire, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questionnaire.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = questionnaire.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<QuestionnaireOptions> list = questionnaire.options;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, QuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Questionnaire> JSON_ADAPTER = new ObjectJsonAdapter<Questionnaire>() { // from class: com.p1.mobile.putong.core.data.Questionnaire.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Questionnaire.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Questionnaire newInstance() {
            return new Questionnaire();
        }

        public boolean parseField(Questionnaire questionnaire, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    questionnaire.description = jsonParser.getValueAsString();
                    return true;
                case "options":
                    questionnaire.options = JsonAdapter.parseArray(jsonParser, QuestionnaireOptions.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    questionnaire.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Questionnaire questionnaire, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "options":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(questionnaire, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Questionnaire questionnaire, JsonGenerator jsonGenerator) throws IOException {
            String str = questionnaire.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = questionnaire.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            if (questionnaire.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(questionnaire.options, jsonGenerator, QuestionnaireOptions.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Questionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Questionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Questionnaire new_() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.nullCheck();
        return questionnaire;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Questionnaire mo225055clone() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.title = this.title;
        questionnaire.description = this.description;
        List<QuestionnaireOptions> list = this.options;
        if (list != null) {
            questionnaire.options = ValueObject.util_map(list, new qcj() { // from class: l.vwb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((QuestionnaireOptions) obj).mo225055clone();
                }
            });
        }
        return questionnaire;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Questionnaire)) {
            return false;
        }
        Questionnaire questionnaire = (Questionnaire) obj;
        return ValueObject.util_equals(this.title, questionnaire.title) && ValueObject.util_equals(this.description, questionnaire.description) && ValueObject.util_equals(this.options, questionnaire.options);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<QuestionnaireOptions> list = this.options;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
