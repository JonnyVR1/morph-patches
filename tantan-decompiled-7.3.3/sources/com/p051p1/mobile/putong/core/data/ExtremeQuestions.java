package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.OOFQuestion;
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
public class ExtremeQuestions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extremequestions";

    @ProtobufIndex(index = 1)
    public int currentIndex;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<OOFQuestion> questions;
    public static ProtobufAdapter<ExtremeQuestions> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtremeQuestions>() { // from class: com.p1.mobile.putong.core.data.ExtremeQuestions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExtremeQuestions extremeQuestions) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, extremeQuestions.currentIndex);
            List<OOFQuestion> list = extremeQuestions.questions;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, OOFQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            extremeQuestions.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExtremeQuestions parse(nc5 nc5Var) throws IOException {
            ExtremeQuestions extremeQuestions = new ExtremeQuestions();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (extremeQuestions.questions != null) {
                        break;
                    }
                    extremeQuestions.questions = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    extremeQuestions.currentIndex = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (extremeQuestions.questions != null) {
                            break;
                        }
                        extremeQuestions.questions = new ArrayList();
                        return extremeQuestions;
                    }
                    extremeQuestions.questions = (List) nc5Var.m162488l(OOFQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return extremeQuestions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExtremeQuestions extremeQuestions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, extremeQuestions.currentIndex);
            List<OOFQuestion> list = extremeQuestions.questions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, OOFQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ExtremeQuestions> JSON_ADAPTER = new ObjectJsonAdapter<ExtremeQuestions>() { // from class: com.p1.mobile.putong.core.data.ExtremeQuestions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExtremeQuestions.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExtremeQuestions newInstance() {
            return new ExtremeQuestions();
        }

        public boolean parseField(ExtremeQuestions extremeQuestions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Questions.TYPE)) {
                extremeQuestions.questions = JsonAdapter.parseArray(jsonParser, OOFQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("currentIndex")) {
                return false;
            }
            extremeQuestions.currentIndex = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ExtremeQuestions extremeQuestions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Questions.TYPE) || str.equals("currentIndex")) {
                return true;
            }
            return super.parseFieldCheck(extremeQuestions, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExtremeQuestions extremeQuestions, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("currentIndex", extremeQuestions.currentIndex);
            if (extremeQuestions.questions != null) {
                jsonGenerator.writeFieldName(Questions.TYPE);
                JsonAdapter.serializeArray(extremeQuestions.questions, jsonGenerator, OOFQuestion.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtremeQuestions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtremeQuestions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExtremeQuestions new_() {
        ExtremeQuestions extremeQuestions = new ExtremeQuestions();
        extremeQuestions.nullCheck();
        return extremeQuestions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExtremeQuestions mo225055clone() {
        ExtremeQuestions extremeQuestions = new ExtremeQuestions();
        extremeQuestions.currentIndex = this.currentIndex;
        List<OOFQuestion> list = this.questions;
        if (list != null) {
            extremeQuestions.questions = ValueObject.util_map(list, new qcj() { // from class: l.fsf
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OOFQuestion) obj).mo225055clone();
                }
            });
        }
        return extremeQuestions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtremeQuestions)) {
            return false;
        }
        ExtremeQuestions extremeQuestions = (ExtremeQuestions) obj;
        return this.currentIndex == extremeQuestions.currentIndex && ValueObject.util_equals(this.questions, extremeQuestions.questions);
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
        int i2 = ((i * 41) + this.currentIndex) * 41;
        List<OOFQuestion> list = this.questions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
