package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.OOFQuestion;
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
public class ExtremeQuestions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extremequestions";

    @ProtobufIndex(index = 1)
    public int currentIndex;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<OOFQuestion> questions;
    public static ProtobufAdapter<ExtremeQuestions> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtremeQuestions>() { // from class: com.p1.mobile.putong.core.data.ExtremeQuestions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ExtremeQuestions extremeQuestions) {
            int iH = CodedOutputByteBufferNano.h(1, extremeQuestions.currentIndex);
            List<OOFQuestion> list = extremeQuestions.questions;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, OOFQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) extremeQuestions).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ExtremeQuestions m12697parse(nb5 nb5Var) throws IOException {
            ExtremeQuestions extremeQuestions = new ExtremeQuestions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (extremeQuestions.questions != null) {
                        break;
                    }
                    extremeQuestions.questions = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    extremeQuestions.currentIndex = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (extremeQuestions.questions != null) {
                            break;
                        }
                        extremeQuestions.questions = new ArrayList();
                        return extremeQuestions;
                    }
                    extremeQuestions.questions = (List) nb5Var.l(OOFQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return extremeQuestions;
        }

        public void serialize(ExtremeQuestions extremeQuestions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, extremeQuestions.currentIndex);
            List<OOFQuestion> list = extremeQuestions.questions;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, OOFQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ExtremeQuestions> JSON_ADAPTER = new ObjectJsonAdapter<ExtremeQuestions>() { // from class: com.p1.mobile.putong.core.data.ExtremeQuestions.2
        public Class getDataClass() {
            return ExtremeQuestions.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ExtremeQuestions m12698newInstance() {
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

        public void serializeFields(ExtremeQuestions extremeQuestions, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("currentIndex", extremeQuestions.currentIndex);
            if (extremeQuestions.questions != null) {
                jsonGenerator.writeFieldName(Questions.TYPE);
                JsonAdapter.serializeArray(extremeQuestions.questions, jsonGenerator, OOFQuestion.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtremeQuestions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtremeQuestions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExtremeQuestions new_() {
        ExtremeQuestions extremeQuestions = new ExtremeQuestions();
        extremeQuestions.nullCheck();
        return extremeQuestions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ExtremeQuestions m12696clone() {
        ExtremeQuestions extremeQuestions = new ExtremeQuestions();
        extremeQuestions.currentIndex = this.currentIndex;
        List<OOFQuestion> list = this.questions;
        if (list != null) {
            extremeQuestions.questions = ValueObject.util_map(list, new w9j() { // from class: l.yqf
                public final Object call(Object obj) {
                    return ((OOFQuestion) obj).m14628clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.currentIndex) * 41;
        List<OOFQuestion> list = this.questions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
