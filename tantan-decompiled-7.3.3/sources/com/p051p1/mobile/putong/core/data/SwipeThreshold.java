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
public class SwipeThreshold extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipethreshold";

    @ProtobufIndex(index = 2)
    public double fastMinScale;

    @ProtobufIndex(index = 1)
    public double slowMinScale;

    @ProtobufIndex(index = 3)
    public double speedFactor;

    @ProtobufIndex(index = 4)
    public double swipeFactor;
    public static ProtobufAdapter<SwipeThreshold> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeThreshold>() { // from class: com.p1.mobile.putong.core.data.SwipeThreshold.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwipeThreshold swipeThreshold) {
            int iM17277d = CodedOutputByteBufferNano.m17277d(1, swipeThreshold.slowMinScale) + CodedOutputByteBufferNano.m17277d(2, swipeThreshold.fastMinScale) + CodedOutputByteBufferNano.m17277d(3, swipeThreshold.speedFactor) + CodedOutputByteBufferNano.m17277d(4, swipeThreshold.swipeFactor);
            swipeThreshold.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeThreshold parse(nc5 nc5Var) throws IOException {
            SwipeThreshold swipeThreshold = new SwipeThreshold();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 9) {
                    swipeThreshold.slowMinScale = nc5Var.m162484h();
                } else if (iM162497u == 17) {
                    swipeThreshold.fastMinScale = nc5Var.m162484h();
                } else if (iM162497u == 25) {
                    swipeThreshold.speedFactor = nc5Var.m162484h();
                } else {
                    if (iM162497u != 33) {
                        return swipeThreshold;
                    }
                    swipeThreshold.swipeFactor = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeThreshold swipeThreshold, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17301C(1, swipeThreshold.slowMinScale);
            codedOutputByteBufferNano.m17301C(2, swipeThreshold.fastMinScale);
            codedOutputByteBufferNano.m17301C(3, swipeThreshold.speedFactor);
            codedOutputByteBufferNano.m17301C(4, swipeThreshold.swipeFactor);
        }
    };
    public static JsonAdapter<SwipeThreshold> JSON_ADAPTER = new ObjectJsonAdapter<SwipeThreshold>() { // from class: com.p1.mobile.putong.core.data.SwipeThreshold.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeThreshold.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwipeThreshold newInstance() {
            return new SwipeThreshold();
        }

        public boolean parseField(SwipeThreshold swipeThreshold, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "slowMinScale":
                    swipeThreshold.slowMinScale = jsonParser.getValueAsDouble();
                    return true;
                case "swipeFactor":
                    swipeThreshold.swipeFactor = jsonParser.getValueAsDouble();
                    return true;
                case "fastMinScale":
                    swipeThreshold.fastMinScale = jsonParser.getValueAsDouble();
                    return true;
                case "speedFactor":
                    swipeThreshold.speedFactor = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SwipeThreshold swipeThreshold, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "slowMinScale":
                case "swipeFactor":
                case "fastMinScale":
                case "speedFactor":
                    return true;
                default:
                    return super.parseFieldCheck(swipeThreshold, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeThreshold swipeThreshold, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("slowMinScale", swipeThreshold.slowMinScale);
            jsonGenerator.writeNumberField("fastMinScale", swipeThreshold.fastMinScale);
            jsonGenerator.writeNumberField("speedFactor", swipeThreshold.speedFactor);
            jsonGenerator.writeNumberField("swipeFactor", swipeThreshold.swipeFactor);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeThreshold) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeThreshold) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeThreshold new_() {
        SwipeThreshold swipeThreshold = new SwipeThreshold();
        swipeThreshold.nullCheck();
        return swipeThreshold;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwipeThreshold mo225055clone() {
        SwipeThreshold swipeThreshold = new SwipeThreshold();
        swipeThreshold.slowMinScale = this.slowMinScale;
        swipeThreshold.fastMinScale = this.fastMinScale;
        swipeThreshold.speedFactor = this.speedFactor;
        swipeThreshold.swipeFactor = this.swipeFactor;
        return swipeThreshold;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwipeThreshold)) {
            return false;
        }
        SwipeThreshold swipeThreshold = (SwipeThreshold) obj;
        return this.slowMinScale == swipeThreshold.slowMinScale && this.fastMinScale == swipeThreshold.fastMinScale && this.speedFactor == swipeThreshold.speedFactor && this.swipeFactor == swipeThreshold.swipeFactor;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.slowMinScale);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.fastMinScale);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.speedFactor);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.swipeFactor);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
