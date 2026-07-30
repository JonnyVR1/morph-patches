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
public class SurveyData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "surveydata";

    @ProtobufIndex(index = 2)
    public boolean forceComplete;

    @NonNull
    @ProtobufIndex(index = 1)
    public String token;
    public static ProtobufAdapter<SurveyData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SurveyData>() { // from class: com.p1.mobile.putong.data.SurveyData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SurveyData surveyData) {
            String str = surveyData.token;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, surveyData.forceComplete);
            ((MessageNano) surveyData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SurveyData m19049parse(nb5 nb5Var) throws IOException {
            SurveyData surveyData = new SurveyData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (surveyData.token != null) {
                        break;
                    }
                    surveyData.token = "";
                    break;
                }
                if (iU == 10) {
                    surveyData.token = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (surveyData.token != null) {
                            break;
                        }
                        surveyData.token = "";
                        return surveyData;
                    }
                    surveyData.forceComplete = nb5Var.g();
                }
            }
            return surveyData;
        }

        public void serialize(SurveyData surveyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = surveyData.token;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, surveyData.forceComplete);
        }
    };
    public static JsonAdapter<SurveyData> JSON_ADAPTER = new ObjectJsonAdapter<SurveyData>() { // from class: com.p1.mobile.putong.data.SurveyData.2
        public Class getDataClass() {
            return SurveyData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SurveyData mo17830newInstance() {
            return new SurveyData();
        }

        public boolean parseField(SurveyData surveyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("forceComplete")) {
                surveyData.forceComplete = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals(Token.TYPE)) {
                return false;
            }
            surveyData.token = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SurveyData surveyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("forceComplete") || str.equals(Token.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(surveyData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SurveyData surveyData, JsonGenerator jsonGenerator) throws IOException {
            String str = surveyData.token;
            if (str != null) {
                jsonGenerator.writeStringField(Token.TYPE, str);
            }
            jsonGenerator.writeBooleanField("forceComplete", surveyData.forceComplete);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SurveyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SurveyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SurveyData new_() {
        SurveyData surveyData = new SurveyData();
        surveyData.nullCheck();
        return surveyData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SurveyData m19048clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.token;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.forceComplete ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.token == null) {
            this.token = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
