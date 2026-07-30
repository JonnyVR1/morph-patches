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
public class SwipeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipeconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public FemaleRule femaleRule;

    @NonNull
    @ProtobufIndex(index = 4)
    public MaleRule maleRule;

    @ProtobufIndex(index = 1)
    public boolean swipeStimulationOn;

    @ProtobufIndex(index = 2)
    public int timestamp;
    public static ProtobufAdapter<SwipeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeConfig>() { // from class: com.p1.mobile.putong.data.SwipeConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SwipeConfig swipeConfig) {
            int iB = CodedOutputByteBufferNano.b(1, swipeConfig.swipeStimulationOn) + CodedOutputByteBufferNano.h(2, swipeConfig.timestamp);
            FemaleRule femaleRule = swipeConfig.femaleRule;
            if (femaleRule != null) {
                iB += CodedOutputByteBufferNano.l(3, femaleRule, FemaleRule.PROTOBUF_ADAPTER);
            }
            MaleRule maleRule = swipeConfig.maleRule;
            if (maleRule != null) {
                iB += CodedOutputByteBufferNano.l(4, maleRule, MaleRule.PROTOBUF_ADAPTER);
            }
            ((MessageNano) swipeConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SwipeConfig m19064parse(nb5 nb5Var) throws IOException {
            SwipeConfig swipeConfig = new SwipeConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (swipeConfig.femaleRule == null) {
                        swipeConfig.femaleRule = FemaleRule.new_();
                    }
                    if (swipeConfig.maleRule != null) {
                        break;
                    }
                    swipeConfig.maleRule = MaleRule.new_();
                    break;
                }
                if (iU == 8) {
                    swipeConfig.swipeStimulationOn = nb5Var.g();
                } else if (iU == 16) {
                    swipeConfig.timestamp = nb5Var.j();
                } else if (iU == 26) {
                    swipeConfig.femaleRule = (FemaleRule) nb5Var.l(FemaleRule.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (swipeConfig.femaleRule == null) {
                            swipeConfig.femaleRule = FemaleRule.new_();
                        }
                        if (swipeConfig.maleRule != null) {
                            break;
                        }
                        swipeConfig.maleRule = MaleRule.new_();
                        return swipeConfig;
                    }
                    swipeConfig.maleRule = (MaleRule) nb5Var.l(MaleRule.PROTOBUF_ADAPTER);
                }
            }
            return swipeConfig;
        }

        public void serialize(SwipeConfig swipeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, swipeConfig.swipeStimulationOn);
            codedOutputByteBufferNano.G(2, swipeConfig.timestamp);
            FemaleRule femaleRule = swipeConfig.femaleRule;
            if (femaleRule != null) {
                codedOutputByteBufferNano.K(3, femaleRule, FemaleRule.PROTOBUF_ADAPTER);
            }
            MaleRule maleRule = swipeConfig.maleRule;
            if (maleRule != null) {
                codedOutputByteBufferNano.K(4, maleRule, MaleRule.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SwipeConfig> JSON_ADAPTER = new ObjectJsonAdapter<SwipeConfig>() { // from class: com.p1.mobile.putong.data.SwipeConfig.2
        public Class getDataClass() {
            return SwipeConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SwipeConfig mo17830newInstance() {
            return new SwipeConfig();
        }

        public boolean parseField(SwipeConfig swipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "femaleRule":
                    swipeConfig.femaleRule = (FemaleRule) FemaleRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "timestamp":
                    swipeConfig.timestamp = jsonParser.getValueAsInt();
                    return true;
                case "maleRule":
                    swipeConfig.maleRule = (MaleRule) MaleRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "swipeStimulationOn":
                    swipeConfig.swipeStimulationOn = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SwipeConfig swipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "femaleRule":
                case "timestamp":
                case "maleRule":
                case "swipeStimulationOn":
                    return true;
                default:
                    return super.parseFieldCheck(swipeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeConfig swipeConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("swipeStimulationOn", swipeConfig.swipeStimulationOn);
            jsonGenerator.writeNumberField("timestamp", swipeConfig.timestamp);
            if (swipeConfig.femaleRule != null) {
                jsonGenerator.writeFieldName("femaleRule");
                FemaleRule.JSON_ADAPTER.serialize(swipeConfig.femaleRule, jsonGenerator, true);
            }
            if (swipeConfig.maleRule != null) {
                jsonGenerator.writeFieldName("maleRule");
                MaleRule.JSON_ADAPTER.serialize(swipeConfig.maleRule, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeConfig new_() {
        SwipeConfig swipeConfig = new SwipeConfig();
        swipeConfig.nullCheck();
        return swipeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SwipeConfig m19063clone() {
        SwipeConfig swipeConfig = new SwipeConfig();
        swipeConfig.swipeStimulationOn = this.swipeStimulationOn;
        swipeConfig.timestamp = this.timestamp;
        FemaleRule femaleRule = this.femaleRule;
        if (femaleRule != null) {
            swipeConfig.femaleRule = femaleRule.m18096clone();
        }
        MaleRule maleRule = this.maleRule;
        if (maleRule != null) {
            swipeConfig.maleRule = maleRule.m18423clone();
        }
        return swipeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwipeConfig)) {
            return false;
        }
        SwipeConfig swipeConfig = (SwipeConfig) obj;
        return this.swipeStimulationOn == swipeConfig.swipeStimulationOn && this.timestamp == swipeConfig.timestamp && ValueObject.util_equals(this.femaleRule, swipeConfig.femaleRule) && ValueObject.util_equals(this.maleRule, swipeConfig.maleRule);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.swipeStimulationOn ? 1231 : 1237)) * 41) + this.timestamp) * 41;
        FemaleRule femaleRule = this.femaleRule;
        int iHashCode = (i2 + (femaleRule != null ? femaleRule.hashCode() : 0)) * 41;
        MaleRule maleRule = this.maleRule;
        int iHashCode2 = iHashCode + (maleRule != null ? maleRule.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.femaleRule == null) {
            this.femaleRule = FemaleRule.new_();
        }
        if (this.maleRule == null) {
            this.maleRule = MaleRule.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
