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
            int iM17222d = CodedOutputByteBufferNano.m17222d(1, swipeThreshold.slowMinScale) + CodedOutputByteBufferNano.m17222d(2, swipeThreshold.fastMinScale) + CodedOutputByteBufferNano.m17222d(3, swipeThreshold.speedFactor) + CodedOutputByteBufferNano.m17222d(4, swipeThreshold.swipeFactor);
            swipeThreshold.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeThreshold parse(nb5 nb5Var) throws IOException {
            SwipeThreshold swipeThreshold = new SwipeThreshold();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 9) {
                    swipeThreshold.slowMinScale = nb5Var.m158739h();
                } else if (iM158752u == 17) {
                    swipeThreshold.fastMinScale = nb5Var.m158739h();
                } else if (iM158752u == 25) {
                    swipeThreshold.speedFactor = nb5Var.m158739h();
                } else {
                    if (iM158752u != 33) {
                        return swipeThreshold;
                    }
                    swipeThreshold.swipeFactor = nb5Var.m158739h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeThreshold swipeThreshold, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17246C(1, swipeThreshold.slowMinScale);
            codedOutputByteBufferNano.m17246C(2, swipeThreshold.fastMinScale);
            codedOutputByteBufferNano.m17246C(3, swipeThreshold.speedFactor);
            codedOutputByteBufferNano.m17246C(4, swipeThreshold.swipeFactor);
        }
    };
    public static JsonAdapter<SwipeThreshold> JSON_ADAPTER = new ObjectJsonAdapter<SwipeThreshold>() { // from class: com.p1.mobile.putong.core.data.SwipeThreshold.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeThreshold.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeThreshold swipeThreshold, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("slowMinScale", swipeThreshold.slowMinScale);
            jsonGenerator.writeNumberField("fastMinScale", swipeThreshold.fastMinScale);
            jsonGenerator.writeNumberField("speedFactor", swipeThreshold.speedFactor);
            jsonGenerator.writeNumberField("swipeFactor", swipeThreshold.swipeFactor);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeThreshold) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public SwipeThreshold mo223809clone() {
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
