package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class EvaluationShareTimes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "evaluationsharetimes";

    @ProtobufIndex(index = 2)
    public long leftTimes;

    @ProtobufIndex(index = 1)
    public long usedTimes;
    public static ProtobufAdapter<EvaluationShareTimes> PROTOBUF_ADAPTER = new MessageNanoAdapter<EvaluationShareTimes>() { // from class: com.p1.mobile.putong.core.data.EvaluationShareTimes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EvaluationShareTimes evaluationShareTimes) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, evaluationShareTimes.usedTimes) + CodedOutputByteBufferNano.m17283j(2, evaluationShareTimes.leftTimes);
            evaluationShareTimes.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EvaluationShareTimes parse(nc5 nc5Var) throws IOException {
            EvaluationShareTimes evaluationShareTimes = new EvaluationShareTimes();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    evaluationShareTimes.usedTimes = nc5Var.m162487k();
                } else {
                    if (iM162497u != 16) {
                        return evaluationShareTimes;
                    }
                    evaluationShareTimes.leftTimes = nc5Var.m162487k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EvaluationShareTimes evaluationShareTimes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, evaluationShareTimes.usedTimes);
            codedOutputByteBufferNano.m17307I(2, evaluationShareTimes.leftTimes);
        }
    };
    public static JsonAdapter<EvaluationShareTimes> JSON_ADAPTER = new ObjectJsonAdapter<EvaluationShareTimes>() { // from class: com.p1.mobile.putong.core.data.EvaluationShareTimes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EvaluationShareTimes.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EvaluationShareTimes newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EvaluationShareTimes evaluationShareTimes, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("usedTimes", evaluationShareTimes.usedTimes);
            jsonGenerator.writeNumberField("leftTimes", evaluationShareTimes.leftTimes);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EvaluationShareTimes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EvaluationShareTimes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EvaluationShareTimes new_() {
        EvaluationShareTimes evaluationShareTimes = new EvaluationShareTimes();
        evaluationShareTimes.nullCheck();
        return evaluationShareTimes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EvaluationShareTimes mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.usedTimes;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.leftTimes;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
