package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SurveySparrowData surveySparrowData) {
            Meta meta = surveySparrowData.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SurveyData surveyData = surveySparrowData.data;
            if (surveyData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, surveyData, SurveyData.PROTOBUF_ADAPTER);
            }
            surveySparrowData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SurveySparrowData parse(nc5 nc5Var) throws IOException {
            SurveySparrowData surveySparrowData = new SurveySparrowData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (surveySparrowData.meta == null) {
                        surveySparrowData.meta = Meta.new_();
                    }
                    if (surveySparrowData.data != null) {
                        break;
                    }
                    surveySparrowData.data = SurveyData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    surveySparrowData.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (surveySparrowData.meta == null) {
                            surveySparrowData.meta = Meta.new_();
                        }
                        if (surveySparrowData.data != null) {
                            break;
                        }
                        surveySparrowData.data = SurveyData.new_();
                        return surveySparrowData;
                    }
                    surveySparrowData.data = (SurveyData) nc5Var.m162488l(SurveyData.PROTOBUF_ADAPTER);
                }
            }
            return surveySparrowData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SurveySparrowData surveySparrowData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = surveySparrowData.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SurveyData surveyData = surveySparrowData.data;
            if (surveyData != null) {
                codedOutputByteBufferNano.m17309K(2, surveyData, SurveyData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SurveySparrowData> JSON_ADAPTER = new ObjectJsonAdapter<SurveySparrowData>() { // from class: com.p1.mobile.putong.data.SurveySparrowData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SurveySparrowData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SurveySparrowData newInstance() {
            return new SurveySparrowData();
        }

        public boolean parseField(SurveySparrowData surveySparrowData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                surveySparrowData.data = SurveyData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            surveySparrowData.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SurveySparrowData surveySparrowData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(surveySparrowData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SurveySparrowData surveySparrowData, JsonGenerator jsonGenerator) throws IOException {
            if (surveySparrowData.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(surveySparrowData.meta, jsonGenerator, true);
            }
            if (surveySparrowData.data != null) {
                jsonGenerator.writeFieldName("data");
                SurveyData.JSON_ADAPTER.serialize(surveySparrowData.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SurveySparrowData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SurveySparrowData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SurveySparrowData new_() {
        SurveySparrowData surveySparrowData = new SurveySparrowData();
        surveySparrowData.nullCheck();
        return surveySparrowData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SurveySparrowData mo225055clone() {
        SurveySparrowData surveySparrowData = new SurveySparrowData();
        Meta meta = this.meta;
        if (meta != null) {
            surveySparrowData.meta = meta.mo225055clone();
        }
        SurveyData surveyData = this.data;
        if (surveyData != null) {
            surveySparrowData.data = surveyData.mo225055clone();
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        SurveyData surveyData = this.data;
        int iHashCode2 = iHashCode + (surveyData != null ? surveyData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SurveyData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
