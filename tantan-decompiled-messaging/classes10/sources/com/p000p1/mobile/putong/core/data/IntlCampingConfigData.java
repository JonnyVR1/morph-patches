package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlCampingQuestionsData;
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
public class IntlCampingConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingconfigdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<IntlCampingQuestionsData> questions;

    @NonNull
    @ProtobufIndex(index = 1)
    public IntlCampingSummaryData summary;
    public static ProtobufAdapter<IntlCampingConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingConfigData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingConfigData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlCampingConfigData intlCampingConfigData) {
            IntlCampingSummaryData intlCampingSummaryData = intlCampingConfigData.summary;
            int iL = intlCampingSummaryData != null ? CodedOutputByteBufferNano.l(1, intlCampingSummaryData, IntlCampingSummaryData.PROTOBUF_ADAPTER) : 0;
            List<IntlCampingQuestionsData> list = intlCampingConfigData.questions;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(2, list, IntlCampingQuestionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) intlCampingConfigData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlCampingConfigData m13495parse(nb5 nb5Var) throws IOException {
            IntlCampingConfigData intlCampingConfigData = new IntlCampingConfigData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlCampingConfigData.summary == null) {
                        intlCampingConfigData.summary = IntlCampingSummaryData.new_();
                    }
                    if (intlCampingConfigData.questions != null) {
                        break;
                    }
                    intlCampingConfigData.questions = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    intlCampingConfigData.summary = (IntlCampingSummaryData) nb5Var.l(IntlCampingSummaryData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlCampingConfigData.summary == null) {
                            intlCampingConfigData.summary = IntlCampingSummaryData.new_();
                        }
                        if (intlCampingConfigData.questions != null) {
                            break;
                        }
                        intlCampingConfigData.questions = new ArrayList();
                        return intlCampingConfigData;
                    }
                    intlCampingConfigData.questions = (List) nb5Var.l(IntlCampingQuestionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlCampingConfigData;
        }

        public void serialize(IntlCampingConfigData intlCampingConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlCampingSummaryData intlCampingSummaryData = intlCampingConfigData.summary;
            if (intlCampingSummaryData != null) {
                codedOutputByteBufferNano.K(1, intlCampingSummaryData, IntlCampingSummaryData.PROTOBUF_ADAPTER);
            }
            List<IntlCampingQuestionsData> list = intlCampingConfigData.questions;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, IntlCampingQuestionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlCampingConfigData> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingConfigData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingConfigData.2
        public Class getDataClass() {
            return IntlCampingConfigData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlCampingConfigData m13496newInstance() {
            return new IntlCampingConfigData();
        }

        public boolean parseField(IntlCampingConfigData intlCampingConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("summary")) {
                intlCampingConfigData.summary = (IntlCampingSummaryData) IntlCampingSummaryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Questions.TYPE)) {
                return false;
            }
            intlCampingConfigData.questions = JsonAdapter.parseArray(jsonParser, IntlCampingQuestionsData.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlCampingConfigData intlCampingConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("summary") || str.equals(Questions.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(intlCampingConfigData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlCampingConfigData intlCampingConfigData, JsonGenerator jsonGenerator) throws IOException {
            if (intlCampingConfigData.summary != null) {
                jsonGenerator.writeFieldName("summary");
                IntlCampingSummaryData.JSON_ADAPTER.serialize(intlCampingConfigData.summary, jsonGenerator, true);
            }
            if (intlCampingConfigData.questions != null) {
                jsonGenerator.writeFieldName(Questions.TYPE);
                JsonAdapter.serializeArray(intlCampingConfigData.questions, jsonGenerator, IntlCampingQuestionsData.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingConfigData new_() {
        IntlCampingConfigData intlCampingConfigData = new IntlCampingConfigData();
        intlCampingConfigData.nullCheck();
        return intlCampingConfigData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlCampingConfigData m13494clone() {
        IntlCampingConfigData intlCampingConfigData = new IntlCampingConfigData();
        IntlCampingSummaryData intlCampingSummaryData = this.summary;
        if (intlCampingSummaryData != null) {
            intlCampingConfigData.summary = intlCampingSummaryData.m13522clone();
        }
        List<IntlCampingQuestionsData> list = this.questions;
        if (list != null) {
            intlCampingConfigData.questions = ValueObject.util_map(list, new w9j() { // from class: l.v3n
                public final Object call(Object obj) {
                    return ((IntlCampingQuestionsData) obj).m13514clone();
                }
            });
        }
        return intlCampingConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingConfigData)) {
            return false;
        }
        IntlCampingConfigData intlCampingConfigData = (IntlCampingConfigData) obj;
        return ValueObject.util_equals(this.summary, intlCampingConfigData.summary) && ValueObject.util_equals(this.questions, intlCampingConfigData.questions);
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
        IntlCampingSummaryData intlCampingSummaryData = this.summary;
        int iHashCode = (i2 + (intlCampingSummaryData != null ? intlCampingSummaryData.hashCode() : 0)) * 41;
        List<IntlCampingQuestionsData> list = this.questions;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.summary == null) {
            this.summary = IntlCampingSummaryData.new_();
        }
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
