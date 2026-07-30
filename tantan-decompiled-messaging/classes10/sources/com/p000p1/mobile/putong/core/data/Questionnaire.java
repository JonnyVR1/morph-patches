package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.QuestionnaireOptions;
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
public class Questionnaire extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionnaire";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String description;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<QuestionnaireOptions> options;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<Questionnaire> PROTOBUF_ADAPTER = new MessageNanoAdapter<Questionnaire>() { // from class: com.p1.mobile.putong.core.data.Questionnaire.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Questionnaire questionnaire) {
            String str = questionnaire.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = questionnaire.description;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<QuestionnaireOptions> list = questionnaire.options;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, QuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) questionnaire).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Questionnaire m15129parse(nb5 nb5Var) throws IOException {
            Questionnaire questionnaire = new Questionnaire();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (questionnaire.title == null) {
                        questionnaire.title = "";
                    }
                    if (questionnaire.description != null) {
                        break;
                    }
                    questionnaire.description = "";
                    break;
                }
                if (iU == 10) {
                    questionnaire.title = nb5Var.s();
                } else if (iU == 18) {
                    questionnaire.description = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (questionnaire.title == null) {
                            questionnaire.title = "";
                        }
                        if (questionnaire.description != null) {
                            break;
                        }
                        questionnaire.description = "";
                        return questionnaire;
                    }
                    questionnaire.options = (List) nb5Var.l(QuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return questionnaire;
        }

        public void serialize(Questionnaire questionnaire, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questionnaire.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = questionnaire.description;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<QuestionnaireOptions> list = questionnaire.options;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, QuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Questionnaire> JSON_ADAPTER = new ObjectJsonAdapter<Questionnaire>() { // from class: com.p1.mobile.putong.core.data.Questionnaire.2
        public Class getDataClass() {
            return Questionnaire.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Questionnaire m15130newInstance() {
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

        public void serializeFields(Questionnaire questionnaire, JsonGenerator jsonGenerator) throws IOException {
            String str = questionnaire.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Questionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Questionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Questionnaire new_() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.nullCheck();
        return questionnaire;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Questionnaire m15128clone() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.title = this.title;
        questionnaire.description = this.description;
        List<QuestionnaireOptions> list = this.options;
        if (list != null) {
            questionnaire.options = ValueObject.util_map(list, new w9j() { // from class: l.rob0
                public final Object call(Object obj) {
                    return ((QuestionnaireOptions) obj).m15136clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
