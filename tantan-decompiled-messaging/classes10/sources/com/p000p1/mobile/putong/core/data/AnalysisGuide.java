package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AnalysisGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "analysisguide";

    @ProtobufIndex(index = 1)
    public boolean isShow;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean used;
    public static ProtobufAdapter<AnalysisGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnalysisGuide>() { // from class: com.p1.mobile.putong.core.data.AnalysisGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AnalysisGuide analysisGuide) {
            int iB = CodedOutputByteBufferNano.b(1, analysisGuide.isShow) + CodedOutputByteBufferNano.b(2, analysisGuide.used);
            ((MessageNano) analysisGuide).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AnalysisGuide m11621parse(nb5 nb5Var) throws IOException {
            AnalysisGuide analysisGuide = new AnalysisGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    analysisGuide.isShow = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return analysisGuide;
                    }
                    analysisGuide.used = nb5Var.g();
                }
            }
        }

        public void serialize(AnalysisGuide analysisGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, analysisGuide.isShow);
            codedOutputByteBufferNano.A(2, analysisGuide.used);
        }
    };
    public static JsonAdapter<AnalysisGuide> JSON_ADAPTER = new ObjectJsonAdapter<AnalysisGuide>() { // from class: com.p1.mobile.putong.core.data.AnalysisGuide.2
        public Class getDataClass() {
            return AnalysisGuide.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AnalysisGuide m11622newInstance() {
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

        public void serializeFields(AnalysisGuide analysisGuide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isShow", analysisGuide.isShow);
            jsonGenerator.writeBooleanField("used", analysisGuide.used);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnalysisGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnalysisGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnalysisGuide new_() {
        AnalysisGuide analysisGuide = new AnalysisGuide();
        analysisGuide.nullCheck();
        return analysisGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AnalysisGuide m11620clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.isShow ? 1231 : 1237)) * 41) + (this.used ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
