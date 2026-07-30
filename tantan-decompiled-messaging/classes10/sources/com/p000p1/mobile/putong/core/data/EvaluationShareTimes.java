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
public class EvaluationShareTimes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "evaluationsharetimes";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long leftTimes;

    @ProtobufIndex(index = 1)
    public long usedTimes;
    public static ProtobufAdapter<EvaluationShareTimes> PROTOBUF_ADAPTER = new MessageNanoAdapter<EvaluationShareTimes>() { // from class: com.p1.mobile.putong.core.data.EvaluationShareTimes.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(EvaluationShareTimes evaluationShareTimes) {
            int iJ = CodedOutputByteBufferNano.j(1, evaluationShareTimes.usedTimes) + CodedOutputByteBufferNano.j(2, evaluationShareTimes.leftTimes);
            ((MessageNano) evaluationShareTimes).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public EvaluationShareTimes m12661parse(nb5 nb5Var) throws IOException {
            EvaluationShareTimes evaluationShareTimes = new EvaluationShareTimes();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    evaluationShareTimes.usedTimes = nb5Var.k();
                } else {
                    if (iU != 16) {
                        return evaluationShareTimes;
                    }
                    evaluationShareTimes.leftTimes = nb5Var.k();
                }
            }
        }

        public void serialize(EvaluationShareTimes evaluationShareTimes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, evaluationShareTimes.usedTimes);
            codedOutputByteBufferNano.I(2, evaluationShareTimes.leftTimes);
        }
    };
    public static JsonAdapter<EvaluationShareTimes> JSON_ADAPTER = new ObjectJsonAdapter<EvaluationShareTimes>() { // from class: com.p1.mobile.putong.core.data.EvaluationShareTimes.2
        public Class getDataClass() {
            return EvaluationShareTimes.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public EvaluationShareTimes m12662newInstance() {
            return new EvaluationShareTimes();
        }

        public boolean parseField(EvaluationShareTimes evaluationShareTimes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("usedTimes")) {
                evaluationShareTimes.usedTimes = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("leftTimes")) {
                return false;
            }
            evaluationShareTimes.leftTimes = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(EvaluationShareTimes evaluationShareTimes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("usedTimes") || str.equals("leftTimes")) {
                return true;
            }
            return super.parseFieldCheck(evaluationShareTimes, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(EvaluationShareTimes evaluationShareTimes, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("usedTimes", evaluationShareTimes.usedTimes);
            jsonGenerator.writeNumberField("leftTimes", evaluationShareTimes.leftTimes);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EvaluationShareTimes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EvaluationShareTimes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EvaluationShareTimes new_() {
        EvaluationShareTimes evaluationShareTimes = new EvaluationShareTimes();
        evaluationShareTimes.nullCheck();
        return evaluationShareTimes;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EvaluationShareTimes m12660clone() {
        EvaluationShareTimes evaluationShareTimes = new EvaluationShareTimes();
        evaluationShareTimes.usedTimes = this.usedTimes;
        evaluationShareTimes.leftTimes = this.leftTimes;
        return evaluationShareTimes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EvaluationShareTimes)) {
            return false;
        }
        EvaluationShareTimes evaluationShareTimes = (EvaluationShareTimes) obj;
        return this.usedTimes == evaluationShareTimes.usedTimes && this.leftTimes == evaluationShareTimes.leftTimes;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.usedTimes;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.leftTimes;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
