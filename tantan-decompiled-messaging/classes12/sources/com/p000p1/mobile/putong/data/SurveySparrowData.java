package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class SurveySparrowData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "surveysparrowdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public SurveyData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SurveySparrowData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SurveySparrowData>() { // from class: com.p1.mobile.putong.data.SurveySparrowData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SurveySparrowData surveySparrowData) {
            Meta meta = surveySparrowData.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SurveyData surveyData = surveySparrowData.data;
            if (surveyData != null) {
                iL += CodedOutputByteBufferNano.l(2, surveyData, SurveyData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) surveySparrowData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SurveySparrowData m19052parse(nb5 nb5Var) throws IOException {
            SurveySparrowData surveySparrowData = new SurveySparrowData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (surveySparrowData.meta == null) {
                        surveySparrowData.meta = Meta.new_();
                    }
                    if (surveySparrowData.data != null) {
                        break;
                    }
                    surveySparrowData.data = SurveyData.new_();
                    break;
                }
                if (iU == 10) {
                    surveySparrowData.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (surveySparrowData.meta == null) {
                            surveySparrowData.meta = Meta.new_();
                        }
                        if (surveySparrowData.data != null) {
                            break;
                        }
                        surveySparrowData.data = SurveyData.new_();
                        return surveySparrowData;
                    }
                    surveySparrowData.data = (SurveyData) nb5Var.l(SurveyData.PROTOBUF_ADAPTER);
                }
            }
            return surveySparrowData;
        }

        public void serialize(SurveySparrowData surveySparrowData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = surveySparrowData.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SurveyData surveyData = surveySparrowData.data;
            if (surveyData != null) {
                codedOutputByteBufferNano.K(2, surveyData, SurveyData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SurveySparrowData> JSON_ADAPTER = new ObjectJsonAdapter<SurveySparrowData>() { // from class: com.p1.mobile.putong.data.SurveySparrowData.2
        public Class getDataClass() {
            return SurveySparrowData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SurveySparrowData mo17830newInstance() {
            return new SurveySparrowData();
        }

        public boolean parseField(SurveySparrowData surveySparrowData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                surveySparrowData.data = (SurveyData) SurveyData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            surveySparrowData.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SurveySparrowData surveySparrowData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(surveySparrowData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SurveySparrowData surveySparrowData, JsonGenerator jsonGenerator) throws IOException {
            if (surveySparrowData.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(surveySparrowData.meta, jsonGenerator, true);
            }
            if (surveySparrowData.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                SurveyData.JSON_ADAPTER.serialize(surveySparrowData.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SurveySparrowData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SurveySparrowData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SurveySparrowData new_() {
        SurveySparrowData surveySparrowData = new SurveySparrowData();
        surveySparrowData.nullCheck();
        return surveySparrowData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SurveySparrowData m19051clone() {
        SurveySparrowData surveySparrowData = new SurveySparrowData();
        Meta meta = this.meta;
        if (meta != null) {
            surveySparrowData.meta = meta.m18461clone();
        }
        SurveyData surveyData = this.data;
        if (surveyData != null) {
            surveySparrowData.data = surveyData.m19048clone();
        }
        return surveySparrowData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurveySparrowData)) {
            return false;
        }
        SurveySparrowData surveySparrowData = (SurveySparrowData) obj;
        return ValueObject.util_equals(this.meta, surveySparrowData.meta) && ValueObject.util_equals(this.data, surveySparrowData.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        SurveyData surveyData = this.data;
        int iHashCode2 = iHashCode + (surveyData != null ? surveyData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SurveyData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
