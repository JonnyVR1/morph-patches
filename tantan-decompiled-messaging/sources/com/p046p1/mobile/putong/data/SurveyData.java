package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class SurveyData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "surveydata";

    @ProtobufIndex(index = 2)
    public boolean forceComplete;

    @NonNull
    @ProtobufIndex(index = 1)
    public String token;
    public static ProtobufAdapter<SurveyData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SurveyData>() { // from class: com.p1.mobile.putong.data.SurveyData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SurveyData surveyData) {
            String str = surveyData.token;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, surveyData.forceComplete);
            surveyData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SurveyData parse(nb5 nb5Var) throws IOException {
            SurveyData surveyData = new SurveyData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (surveyData.token != null) {
                        break;
                    }
                    surveyData.token = "";
                    break;
                }
                if (iM158752u == 10) {
                    surveyData.token = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (surveyData.token != null) {
                            break;
                        }
                        surveyData.token = "";
                        return surveyData;
                    }
                    surveyData.forceComplete = nb5Var.m158738g();
                }
            }
            return surveyData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SurveyData surveyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = surveyData.token;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, surveyData.forceComplete);
        }
    };
    public static JsonAdapter<SurveyData> JSON_ADAPTER = new ObjectJsonAdapter<SurveyData>() { // from class: com.p1.mobile.putong.data.SurveyData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SurveyData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SurveyData newInstance() {
            return new SurveyData();
        }

        public boolean parseField(SurveyData surveyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("forceComplete")) {
                surveyData.forceComplete = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("token")) {
                return false;
            }
            surveyData.token = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SurveyData surveyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("forceComplete") || str.equals("token")) {
                return true;
            }
            return super.parseFieldCheck(surveyData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SurveyData surveyData, JsonGenerator jsonGenerator) throws IOException {
            String str = surveyData.token;
            if (str != null) {
                jsonGenerator.writeStringField("token", str);
            }
            jsonGenerator.writeBooleanField("forceComplete", surveyData.forceComplete);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SurveyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SurveyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SurveyData new_() {
        SurveyData surveyData = new SurveyData();
        surveyData.nullCheck();
        return surveyData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SurveyData mo223809clone() {
        SurveyData surveyData = new SurveyData();
        surveyData.token = this.token;
        surveyData.forceComplete = this.forceComplete;
        return surveyData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurveyData)) {
            return false;
        }
        SurveyData surveyData = (SurveyData) obj;
        return ValueObject.util_equals(this.token, surveyData.token) && this.forceComplete == surveyData.forceComplete;
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
        String str = this.token;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.forceComplete ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.token == null) {
            this.token = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
