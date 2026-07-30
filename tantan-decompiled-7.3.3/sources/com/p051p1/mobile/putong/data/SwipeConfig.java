package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwipeConfig swipeConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, swipeConfig.swipeStimulationOn) + CodedOutputByteBufferNano.m17281h(2, swipeConfig.timestamp);
            FemaleRule femaleRule = swipeConfig.femaleRule;
            if (femaleRule != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, femaleRule, FemaleRule.PROTOBUF_ADAPTER);
            }
            MaleRule maleRule = swipeConfig.maleRule;
            if (maleRule != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, maleRule, MaleRule.PROTOBUF_ADAPTER);
            }
            swipeConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeConfig parse(nc5 nc5Var) throws IOException {
            SwipeConfig swipeConfig = new SwipeConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (swipeConfig.femaleRule == null) {
                        swipeConfig.femaleRule = FemaleRule.new_();
                    }
                    if (swipeConfig.maleRule != null) {
                        break;
                    }
                    swipeConfig.maleRule = MaleRule.new_();
                    break;
                }
                if (iM162497u == 8) {
                    swipeConfig.swipeStimulationOn = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    swipeConfig.timestamp = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    swipeConfig.femaleRule = (FemaleRule) nc5Var.m162488l(FemaleRule.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (swipeConfig.femaleRule == null) {
                            swipeConfig.femaleRule = FemaleRule.new_();
                        }
                        if (swipeConfig.maleRule != null) {
                            break;
                        }
                        swipeConfig.maleRule = MaleRule.new_();
                        return swipeConfig;
                    }
                    swipeConfig.maleRule = (MaleRule) nc5Var.m162488l(MaleRule.PROTOBUF_ADAPTER);
                }
            }
            return swipeConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeConfig swipeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, swipeConfig.swipeStimulationOn);
            codedOutputByteBufferNano.m17305G(2, swipeConfig.timestamp);
            FemaleRule femaleRule = swipeConfig.femaleRule;
            if (femaleRule != null) {
                codedOutputByteBufferNano.m17309K(3, femaleRule, FemaleRule.PROTOBUF_ADAPTER);
            }
            MaleRule maleRule = swipeConfig.maleRule;
            if (maleRule != null) {
                codedOutputByteBufferNano.m17309K(4, maleRule, MaleRule.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SwipeConfig> JSON_ADAPTER = new ObjectJsonAdapter<SwipeConfig>() { // from class: com.p1.mobile.putong.data.SwipeConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwipeConfig newInstance() {
            return new SwipeConfig();
        }

        public boolean parseField(SwipeConfig swipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "femaleRule":
                    swipeConfig.femaleRule = FemaleRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "timestamp":
                    swipeConfig.timestamp = jsonParser.getValueAsInt();
                    return true;
                case "maleRule":
                    swipeConfig.maleRule = MaleRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeConfig new_() {
        SwipeConfig swipeConfig = new SwipeConfig();
        swipeConfig.nullCheck();
        return swipeConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwipeConfig mo225055clone() {
        SwipeConfig swipeConfig = new SwipeConfig();
        swipeConfig.swipeStimulationOn = this.swipeStimulationOn;
        swipeConfig.timestamp = this.timestamp;
        FemaleRule femaleRule = this.femaleRule;
        if (femaleRule != null) {
            swipeConfig.femaleRule = femaleRule.mo225055clone();
        }
        MaleRule maleRule = this.maleRule;
        if (maleRule != null) {
            swipeConfig.maleRule = maleRule.mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.swipeStimulationOn ? 1231 : 1237)) * 41) + this.timestamp) * 41;
        FemaleRule femaleRule = this.femaleRule;
        int iHashCode = (i2 + (femaleRule != null ? femaleRule.hashCode() : 0)) * 41;
        MaleRule maleRule = this.maleRule;
        int iHashCode2 = iHashCode + (maleRule != null ? maleRule.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.femaleRule == null) {
            this.femaleRule = FemaleRule.new_();
        }
        if (this.maleRule == null) {
            this.maleRule = MaleRule.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
