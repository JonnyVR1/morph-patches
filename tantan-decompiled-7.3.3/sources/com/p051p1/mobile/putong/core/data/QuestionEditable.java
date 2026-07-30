package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.QuestionEditable;
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
public class QuestionEditable extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questioneditable";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> languages;
    public static ProtobufAdapter<QuestionEditable> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionEditable>() { // from class: com.p1.mobile.putong.core.data.QuestionEditable.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuestionEditable questionEditable) {
            List<String> list = questionEditable.languages;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            questionEditable.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuestionEditable parse(nc5 nc5Var) throws IOException {
            QuestionEditable questionEditable = new QuestionEditable();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (questionEditable.languages != null) {
                        break;
                    }
                    questionEditable.languages = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (questionEditable.languages != null) {
                        break;
                    }
                    questionEditable.languages = new ArrayList();
                    return questionEditable;
                }
                questionEditable.languages = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return questionEditable;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuestionEditable questionEditable, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = questionEditable.languages;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<QuestionEditable> JSON_ADAPTER = new ObjectJsonAdapter<QuestionEditable>() { // from class: com.p1.mobile.putong.core.data.QuestionEditable.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuestionEditable.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuestionEditable newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuestionEditable questionEditable, JsonGenerator jsonGenerator) throws IOException {
            if (questionEditable.languages != null) {
                jsonGenerator.writeFieldName("languages");
                JsonAdapter.serializeArray(questionEditable.languages, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionEditable) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionEditable) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36795a(String str) {
        return str;
    }

    public static QuestionEditable new_() {
        QuestionEditable questionEditable = new QuestionEditable();
        questionEditable.nullCheck();
        return questionEditable;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuestionEditable mo225055clone() {
        QuestionEditable questionEditable = new QuestionEditable();
        List<String> list = this.languages;
        if (list != null) {
            questionEditable.languages = ValueObject.util_map(list, new qcj() { // from class: l.gwb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return QuestionEditable.m36795a((String) obj);
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
        List<String> list = this.languages;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.languages == null) {
            this.languages = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
