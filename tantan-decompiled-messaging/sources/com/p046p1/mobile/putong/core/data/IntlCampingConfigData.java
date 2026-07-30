package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class IntlCampingConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingconfigdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<IntlCampingQuestionsData> questions;

    @NonNull
    @ProtobufIndex(index = 1)
    public IntlCampingSummaryData summary;
    public static ProtobufAdapter<IntlCampingConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingConfigData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingConfigData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCampingConfigData intlCampingConfigData) {
            IntlCampingSummaryData intlCampingSummaryData = intlCampingConfigData.summary;
            int iM17230l = intlCampingSummaryData != null ? CodedOutputByteBufferNano.m17230l(1, intlCampingSummaryData, IntlCampingSummaryData.PROTOBUF_ADAPTER) : 0;
            List<IntlCampingQuestionsData> list = intlCampingConfigData.questions;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list, IntlCampingQuestionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            intlCampingConfigData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCampingConfigData parse(nb5 nb5Var) throws IOException {
            IntlCampingConfigData intlCampingConfigData = new IntlCampingConfigData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlCampingConfigData.summary == null) {
                        intlCampingConfigData.summary = IntlCampingSummaryData.new_();
                    }
                    if (intlCampingConfigData.questions != null) {
                        break;
                    }
                    intlCampingConfigData.questions = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    intlCampingConfigData.summary = (IntlCampingSummaryData) nb5Var.m158743l(IntlCampingSummaryData.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (intlCampingConfigData.summary == null) {
                            intlCampingConfigData.summary = IntlCampingSummaryData.new_();
                        }
                        if (intlCampingConfigData.questions != null) {
                            break;
                        }
                        intlCampingConfigData.questions = new ArrayList();
                        return intlCampingConfigData;
                    }
                    intlCampingConfigData.questions = (List) nb5Var.m158743l(IntlCampingQuestionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlCampingConfigData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCampingConfigData intlCampingConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlCampingSummaryData intlCampingSummaryData = intlCampingConfigData.summary;
            if (intlCampingSummaryData != null) {
                codedOutputByteBufferNano.m17254K(1, intlCampingSummaryData, IntlCampingSummaryData.PROTOBUF_ADAPTER);
            }
            List<IntlCampingQuestionsData> list = intlCampingConfigData.questions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, IntlCampingQuestionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlCampingConfigData> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingConfigData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingConfigData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCampingConfigData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCampingConfigData newInstance() {
            return new IntlCampingConfigData();
        }

        public boolean parseField(IntlCampingConfigData intlCampingConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("summary")) {
                intlCampingConfigData.summary = IntlCampingSummaryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingConfigData new_() {
        IntlCampingConfigData intlCampingConfigData = new IntlCampingConfigData();
        intlCampingConfigData.nullCheck();
        return intlCampingConfigData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCampingConfigData mo223809clone() {
        IntlCampingConfigData intlCampingConfigData = new IntlCampingConfigData();
        IntlCampingSummaryData intlCampingSummaryData = this.summary;
        if (intlCampingSummaryData != null) {
            intlCampingConfigData.summary = intlCampingSummaryData.mo223809clone();
        }
        List<IntlCampingQuestionsData> list = this.questions;
        if (list != null) {
            intlCampingConfigData.questions = ValueObject.util_map(list, new w9j() { // from class: l.v3n
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IntlCampingQuestionsData) obj).mo223809clone();
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
        IntlCampingSummaryData intlCampingSummaryData = this.summary;
        int iHashCode = (i2 + (intlCampingSummaryData != null ? intlCampingSummaryData.hashCode() : 0)) * 41;
        List<IntlCampingQuestionsData> list = this.questions;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.summary == null) {
            this.summary = IntlCampingSummaryData.new_();
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
