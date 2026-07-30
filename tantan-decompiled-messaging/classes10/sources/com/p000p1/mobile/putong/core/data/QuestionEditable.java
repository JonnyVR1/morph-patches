package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.QuestionEditable;
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
public class QuestionEditable extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questioneditable";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> languages;
    public static ProtobufAdapter<QuestionEditable> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionEditable>() { // from class: com.p1.mobile.putong.core.data.QuestionEditable.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuestionEditable questionEditable) {
            List<String> list = questionEditable.languages;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) questionEditable).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuestionEditable m15121parse(nb5 nb5Var) throws IOException {
            QuestionEditable questionEditable = new QuestionEditable();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (questionEditable.languages != null) {
                        break;
                    }
                    questionEditable.languages = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (questionEditable.languages != null) {
                        break;
                    }
                    questionEditable.languages = new ArrayList();
                    return questionEditable;
                }
                questionEditable.languages = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return questionEditable;
        }

        public void serialize(QuestionEditable questionEditable, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = questionEditable.languages;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<QuestionEditable> JSON_ADAPTER = new ObjectJsonAdapter<QuestionEditable>() { // from class: com.p1.mobile.putong.core.data.QuestionEditable.2
        public Class getDataClass() {
            return QuestionEditable.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuestionEditable m15122newInstance() {
            return new QuestionEditable();
        }

        public boolean parseField(QuestionEditable questionEditable, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("languages")) {
                return false;
            }
            questionEditable.languages = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(QuestionEditable questionEditable, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("languages")) {
                return true;
            }
            return super.parseFieldCheck(questionEditable, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(QuestionEditable questionEditable, JsonGenerator jsonGenerator) throws IOException {
            if (questionEditable.languages != null) {
                jsonGenerator.writeFieldName("languages");
                JsonAdapter.serializeArray(questionEditable.languages, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionEditable) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionEditable) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m594a(String str) {
        return str;
    }

    public static QuestionEditable new_() {
        QuestionEditable questionEditable = new QuestionEditable();
        questionEditable.nullCheck();
        return questionEditable;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuestionEditable m15120clone() {
        QuestionEditable questionEditable = new QuestionEditable();
        List<String> list = this.languages;
        if (list != null) {
            questionEditable.languages = ValueObject.util_map(list, new w9j() { // from class: l.cob0
                public final Object call(Object obj) {
                    return QuestionEditable.m594a((String) obj);
                }
            });
        }
        return questionEditable;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QuestionEditable) {
            return ValueObject.util_equals(this.languages, ((QuestionEditable) obj).languages);
        }
        return false;
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
        List<String> list = this.languages;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.languages == null) {
            this.languages = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
