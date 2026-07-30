package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class AnalysisGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "analysisguide";

    @ProtobufIndex(index = 1)
    public boolean isShow;

    @ProtobufIndex(index = 2)
    public boolean used;
    public static ProtobufAdapter<AnalysisGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnalysisGuide>() { // from class: com.p1.mobile.putong.core.data.AnalysisGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AnalysisGuide analysisGuide) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, analysisGuide.isShow) + CodedOutputByteBufferNano.m17220b(2, analysisGuide.used);
            analysisGuide.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AnalysisGuide parse(nb5 nb5Var) throws IOException {
            AnalysisGuide analysisGuide = new AnalysisGuide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    analysisGuide.isShow = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return analysisGuide;
                    }
                    analysisGuide.used = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AnalysisGuide analysisGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, analysisGuide.isShow);
            codedOutputByteBufferNano.m17244A(2, analysisGuide.used);
        }
    };
    public static JsonAdapter<AnalysisGuide> JSON_ADAPTER = new ObjectJsonAdapter<AnalysisGuide>() { // from class: com.p1.mobile.putong.core.data.AnalysisGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AnalysisGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AnalysisGuide newInstance() {
            return new AnalysisGuide();
        }

        public boolean parseField(AnalysisGuide analysisGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isShow")) {
                analysisGuide.isShow = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("used")) {
                return false;
            }
            analysisGuide.used = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(AnalysisGuide analysisGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isShow") || str.equals("used")) {
                return true;
            }
            return super.parseFieldCheck(analysisGuide, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AnalysisGuide analysisGuide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isShow", analysisGuide.isShow);
            jsonGenerator.writeBooleanField("used", analysisGuide.used);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnalysisGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnalysisGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnalysisGuide new_() {
        AnalysisGuide analysisGuide = new AnalysisGuide();
        analysisGuide.nullCheck();
        return analysisGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AnalysisGuide mo223809clone() {
        AnalysisGuide analysisGuide = new AnalysisGuide();
        analysisGuide.isShow = this.isShow;
        analysisGuide.used = this.used;
        return analysisGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnalysisGuide)) {
            return false;
        }
        AnalysisGuide analysisGuide = (AnalysisGuide) obj;
        return this.isShow == analysisGuide.isShow && this.used == analysisGuide.used;
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
        int i2 = (((i * 41) + (this.isShow ? 1231 : 1237)) * 41) + (this.used ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
