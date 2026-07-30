package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionItemData;
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
public class IntlMarketQuestionData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestiondata";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlMarketQuestionOptionUIData option_ui;

    @NonNull
    @ProtobufIndex(index = 1)
    public IntlMarketQuestionUIData question_ui;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<IntlMarketQuestionItemData> questions;
    public static ProtobufAdapter<IntlMarketQuestionData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketQuestionData intlMarketQuestionData) {
            IntlMarketQuestionUIData intlMarketQuestionUIData = intlMarketQuestionData.question_ui;
            int iM17285l = intlMarketQuestionUIData != null ? CodedOutputByteBufferNano.m17285l(1, intlMarketQuestionUIData, IntlMarketQuestionUIData.PROTOBUF_ADAPTER) : 0;
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = intlMarketQuestionData.option_ui;
            if (intlMarketQuestionOptionUIData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlMarketQuestionOptionUIData, IntlMarketQuestionOptionUIData.PROTOBUF_ADAPTER);
            }
            List<IntlMarketQuestionItemData> list = intlMarketQuestionData.questions;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list, IntlMarketQuestionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            intlMarketQuestionData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketQuestionData parse(nc5 nc5Var) throws IOException {
            IntlMarketQuestionData intlMarketQuestionData = new IntlMarketQuestionData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlMarketQuestionData.question_ui == null) {
                        intlMarketQuestionData.question_ui = IntlMarketQuestionUIData.new_();
                    }
                    if (intlMarketQuestionData.option_ui == null) {
                        intlMarketQuestionData.option_ui = IntlMarketQuestionOptionUIData.new_();
                    }
                    if (intlMarketQuestionData.questions != null) {
                        break;
                    }
                    intlMarketQuestionData.questions = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    intlMarketQuestionData.question_ui = (IntlMarketQuestionUIData) nc5Var.m162488l(IntlMarketQuestionUIData.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    intlMarketQuestionData.option_ui = (IntlMarketQuestionOptionUIData) nc5Var.m162488l(IntlMarketQuestionOptionUIData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
                        if (intlMarketQuestionData.question_ui == null) {
                            intlMarketQuestionData.question_ui = IntlMarketQuestionUIData.new_();
                        }
                        if (intlMarketQuestionData.option_ui == null) {
                            intlMarketQuestionData.option_ui = IntlMarketQuestionOptionUIData.new_();
                        }
                        if (intlMarketQuestionData.questions != null) {
                            break;
                        }
                        intlMarketQuestionData.questions = new ArrayList();
                        return intlMarketQuestionData;
                    }
                    intlMarketQuestionData.questions = (List) nc5Var.m162488l(IntlMarketQuestionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlMarketQuestionData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketQuestionData intlMarketQuestionData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlMarketQuestionUIData intlMarketQuestionUIData = intlMarketQuestionData.question_ui;
            if (intlMarketQuestionUIData != null) {
                codedOutputByteBufferNano.m17309K(1, intlMarketQuestionUIData, IntlMarketQuestionUIData.PROTOBUF_ADAPTER);
            }
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = intlMarketQuestionData.option_ui;
            if (intlMarketQuestionOptionUIData != null) {
                codedOutputByteBufferNano.m17309K(2, intlMarketQuestionOptionUIData, IntlMarketQuestionOptionUIData.PROTOBUF_ADAPTER);
            }
            List<IntlMarketQuestionItemData> list = intlMarketQuestionData.questions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, IntlMarketQuestionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketQuestionData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketQuestionData newInstance() {
            return new IntlMarketQuestionData();
        }

        public boolean parseField(IntlMarketQuestionData intlMarketQuestionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "questions":
                    intlMarketQuestionData.questions = JsonAdapter.parseArray(jsonParser, IntlMarketQuestionItemData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "question_ui":
                    intlMarketQuestionData.question_ui = IntlMarketQuestionUIData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "option_ui":
                    intlMarketQuestionData.option_ui = IntlMarketQuestionOptionUIData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketQuestionData intlMarketQuestionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "questions":
                case "question_ui":
                case "option_ui":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketQuestionData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketQuestionData intlMarketQuestionData, JsonGenerator jsonGenerator) throws IOException {
            if (intlMarketQuestionData.question_ui != null) {
                jsonGenerator.writeFieldName("question_ui");
                IntlMarketQuestionUIData.JSON_ADAPTER.serialize(intlMarketQuestionData.question_ui, jsonGenerator, true);
            }
            if (intlMarketQuestionData.option_ui != null) {
                jsonGenerator.writeFieldName("option_ui");
                IntlMarketQuestionOptionUIData.JSON_ADAPTER.serialize(intlMarketQuestionData.option_ui, jsonGenerator, true);
            }
            if (intlMarketQuestionData.questions != null) {
                jsonGenerator.writeFieldName(Questions.TYPE);
                JsonAdapter.serializeArray(intlMarketQuestionData.questions, jsonGenerator, IntlMarketQuestionItemData.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionData new_() {
        IntlMarketQuestionData intlMarketQuestionData = new IntlMarketQuestionData();
        intlMarketQuestionData.nullCheck();
        return intlMarketQuestionData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketQuestionData mo225055clone() {
        IntlMarketQuestionData intlMarketQuestionData = new IntlMarketQuestionData();
        IntlMarketQuestionUIData intlMarketQuestionUIData = this.question_ui;
        if (intlMarketQuestionUIData != null) {
            intlMarketQuestionData.question_ui = intlMarketQuestionUIData.mo225055clone();
        }
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = this.option_ui;
        if (intlMarketQuestionOptionUIData != null) {
            intlMarketQuestionData.option_ui = intlMarketQuestionOptionUIData.mo225055clone();
        }
        List<IntlMarketQuestionItemData> list = this.questions;
        if (list != null) {
            intlMarketQuestionData.questions = ValueObject.util_map(list, new qcj() { // from class: l.vdo
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IntlMarketQuestionItemData) obj).mo225055clone();
                }
            });
        }
        return intlMarketQuestionData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketQuestionData)) {
            return false;
        }
        IntlMarketQuestionData intlMarketQuestionData = (IntlMarketQuestionData) obj;
        return ValueObject.util_equals(this.question_ui, intlMarketQuestionData.question_ui) && ValueObject.util_equals(this.option_ui, intlMarketQuestionData.option_ui) && ValueObject.util_equals(this.questions, intlMarketQuestionData.questions);
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
        IntlMarketQuestionUIData intlMarketQuestionUIData = this.question_ui;
        int iHashCode = (i2 + (intlMarketQuestionUIData != null ? intlMarketQuestionUIData.hashCode() : 0)) * 41;
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = this.option_ui;
        int iHashCode2 = (iHashCode + (intlMarketQuestionOptionUIData != null ? intlMarketQuestionOptionUIData.hashCode() : 0)) * 41;
        List<IntlMarketQuestionItemData> list = this.questions;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.question_ui == null) {
            this.question_ui = IntlMarketQuestionUIData.new_();
        }
        if (this.option_ui == null) {
            this.option_ui = IntlMarketQuestionOptionUIData.new_();
        }
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
