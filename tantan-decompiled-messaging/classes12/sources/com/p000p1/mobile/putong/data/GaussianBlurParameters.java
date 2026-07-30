package com.p000p1.mobile.putong.data;

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
public class GaussianBlurParameters extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gaussianblurparameters";

    @ProtobufIndex(index = 52)
    public int blurRadius;

    @ProtobufIndex(index = 51)
    public int iterations;
    public static ProtobufAdapter<GaussianBlurParameters> PROTOBUF_ADAPTER = new MessageNanoAdapter<GaussianBlurParameters>() { // from class: com.p1.mobile.putong.data.GaussianBlurParameters.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GaussianBlurParameters gaussianBlurParameters) {
            int iH = CodedOutputByteBufferNano.h(51, gaussianBlurParameters.iterations) + CodedOutputByteBufferNano.h(52, gaussianBlurParameters.blurRadius);
            ((MessageNano) gaussianBlurParameters).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GaussianBlurParameters m18172parse(nb5 nb5Var) throws IOException {
            GaussianBlurParameters gaussianBlurParameters = new GaussianBlurParameters();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 408) {
                    gaussianBlurParameters.iterations = nb5Var.j();
                } else {
                    if (iU != 416) {
                        return gaussianBlurParameters;
                    }
                    gaussianBlurParameters.blurRadius = nb5Var.j();
                }
            }
        }

        public void serialize(GaussianBlurParameters gaussianBlurParameters, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(51, gaussianBlurParameters.iterations);
            codedOutputByteBufferNano.G(52, gaussianBlurParameters.blurRadius);
        }
    };
    public static JsonAdapter<GaussianBlurParameters> JSON_ADAPTER = new ObjectJsonAdapter<GaussianBlurParameters>() { // from class: com.p1.mobile.putong.data.GaussianBlurParameters.2
        public Class getDataClass() {
            return GaussianBlurParameters.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GaussianBlurParameters mo17830newInstance() {
            return new GaussianBlurParameters();
        }

        public boolean parseField(GaussianBlurParameters gaussianBlurParameters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("iterations")) {
                gaussianBlurParameters.iterations = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("blurRadius")) {
                return false;
            }
            gaussianBlurParameters.blurRadius = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(GaussianBlurParameters gaussianBlurParameters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("iterations") || str.equals("blurRadius")) {
                return true;
            }
            return super.parseFieldCheck(gaussianBlurParameters, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GaussianBlurParameters gaussianBlurParameters, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("iterations", gaussianBlurParameters.iterations);
            jsonGenerator.writeNumberField("blurRadius", gaussianBlurParameters.blurRadius);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GaussianBlurParameters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GaussianBlurParameters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GaussianBlurParameters new_() {
        GaussianBlurParameters gaussianBlurParameters = new GaussianBlurParameters();
        gaussianBlurParameters.nullCheck();
        return gaussianBlurParameters;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GaussianBlurParameters m18171clone() {
        GaussianBlurParameters gaussianBlurParameters = new GaussianBlurParameters();
        gaussianBlurParameters.iterations = this.iterations;
        gaussianBlurParameters.blurRadius = this.blurRadius;
        return gaussianBlurParameters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GaussianBlurParameters)) {
            return false;
        }
        GaussianBlurParameters gaussianBlurParameters = (GaussianBlurParameters) obj;
        return this.iterations == gaussianBlurParameters.iterations && this.blurRadius == gaussianBlurParameters.blurRadius;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.iterations) * 41) + this.blurRadius;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public GaussianBlurParameters subtract(GaussianBlurParameters gaussianBlurParameters) {
        GaussianBlurParameters gaussianBlurParameters2 = new GaussianBlurParameters();
        if (gaussianBlurParameters2.equals(new GaussianBlurParameters())) {
            return null;
        }
        return gaussianBlurParameters2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
