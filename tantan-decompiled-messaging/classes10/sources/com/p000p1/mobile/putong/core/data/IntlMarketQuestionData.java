package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlMarketQuestionItemData;
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
public class IntlMarketQuestionData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestiondata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlMarketQuestionOptionUIData option_ui;

    @NonNull
    @ProtobufIndex(index = 1)
    public IntlMarketQuestionUIData question_ui;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<IntlMarketQuestionItemData> questions;
    public static ProtobufAdapter<IntlMarketQuestionData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketQuestionData intlMarketQuestionData) {
            IntlMarketQuestionUIData intlMarketQuestionUIData = intlMarketQuestionData.question_ui;
            int iL = intlMarketQuestionUIData != null ? CodedOutputByteBufferNano.l(1, intlMarketQuestionUIData, IntlMarketQuestionUIData.PROTOBUF_ADAPTER) : 0;
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = intlMarketQuestionData.option_ui;
            if (intlMarketQuestionOptionUIData != null) {
                iL += CodedOutputByteBufferNano.l(2, intlMarketQuestionOptionUIData, IntlMarketQuestionOptionUIData.PROTOBUF_ADAPTER);
            }
            List<IntlMarketQuestionItemData> list = intlMarketQuestionData.questions;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(3, list, IntlMarketQuestionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) intlMarketQuestionData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketQuestionData m13591parse(nb5 nb5Var) throws IOException {
            IntlMarketQuestionData intlMarketQuestionData = new IntlMarketQuestionData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    intlMarketQuestionData.question_ui = (IntlMarketQuestionUIData) nb5Var.l(IntlMarketQuestionUIData.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    intlMarketQuestionData.option_ui = (IntlMarketQuestionOptionUIData) nb5Var.l(IntlMarketQuestionOptionUIData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
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
                    intlMarketQuestionData.questions = (List) nb5Var.l(IntlMarketQuestionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlMarketQuestionData;
        }

        public void serialize(IntlMarketQuestionData intlMarketQuestionData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlMarketQuestionUIData intlMarketQuestionUIData = intlMarketQuestionData.question_ui;
            if (intlMarketQuestionUIData != null) {
                codedOutputByteBufferNano.K(1, intlMarketQuestionUIData, IntlMarketQuestionUIData.PROTOBUF_ADAPTER);
            }
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = intlMarketQuestionData.option_ui;
            if (intlMarketQuestionOptionUIData != null) {
                codedOutputByteBufferNano.K(2, intlMarketQuestionOptionUIData, IntlMarketQuestionOptionUIData.PROTOBUF_ADAPTER);
            }
            List<IntlMarketQuestionItemData> list = intlMarketQuestionData.questions;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, IntlMarketQuestionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionData.2
        public Class getDataClass() {
            return IntlMarketQuestionData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketQuestionData m13592newInstance() {
            return new IntlMarketQuestionData();
        }

        public boolean parseField(IntlMarketQuestionData intlMarketQuestionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "questions":
                    intlMarketQuestionData.questions = JsonAdapter.parseArray(jsonParser, IntlMarketQuestionItemData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "question_ui":
                    intlMarketQuestionData.question_ui = (IntlMarketQuestionUIData) IntlMarketQuestionUIData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "option_ui":
                    intlMarketQuestionData.option_ui = (IntlMarketQuestionOptionUIData) IntlMarketQuestionOptionUIData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionData new_() {
        IntlMarketQuestionData intlMarketQuestionData = new IntlMarketQuestionData();
        intlMarketQuestionData.nullCheck();
        return intlMarketQuestionData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketQuestionData m13590clone() {
        IntlMarketQuestionData intlMarketQuestionData = new IntlMarketQuestionData();
        IntlMarketQuestionUIData intlMarketQuestionUIData = this.question_ui;
        if (intlMarketQuestionUIData != null) {
            intlMarketQuestionData.question_ui = intlMarketQuestionUIData.m13606clone();
        }
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = this.option_ui;
        if (intlMarketQuestionOptionUIData != null) {
            intlMarketQuestionData.option_ui = intlMarketQuestionOptionUIData.m13602clone();
        }
        List<IntlMarketQuestionItemData> list = this.questions;
        if (list != null) {
            intlMarketQuestionData.questions = ValueObject.util_map(list, new w9j() { // from class: l.vbo
                public final Object call(Object obj) {
                    return ((IntlMarketQuestionItemData) obj).m13594clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
