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
public class ApmConfigSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "apmconfigsetting";

    @NonNull
    @ProtobufIndex(index = 1)
    public String configName;

    @ProtobufIndex(index = 8)
    public long cpuModuleInterval;

    @ProtobufIndex(index = 7)
    public long cpuModuleStartDelay;

    @ProtobufIndex(index = 9)
    public int cpuSamplingMaxTimes;

    @ProtobufIndex(index = 6)
    public boolean enableCpuReport;

    @ProtobufIndex(index = 2)
    public boolean enableMemoryReport;

    @ProtobufIndex(index = 4)
    public long memoryModuleInterval;

    @ProtobufIndex(index = 3)
    public long memoryModuleStartDelay;

    @ProtobufIndex(index = 5)
    public int memorySamplingMaxTimes;
    public static ProtobufAdapter<ApmConfigSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<ApmConfigSetting>() { // from class: com.p1.mobile.putong.data.ApmConfigSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ApmConfigSetting apmConfigSetting) {
            String str = apmConfigSetting.configName;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, apmConfigSetting.enableMemoryReport) + CodedOutputByteBufferNano.m17283j(3, apmConfigSetting.memoryModuleStartDelay) + CodedOutputByteBufferNano.m17283j(4, apmConfigSetting.memoryModuleInterval) + CodedOutputByteBufferNano.m17281h(5, apmConfigSetting.memorySamplingMaxTimes) + CodedOutputByteBufferNano.m17275b(6, apmConfigSetting.enableCpuReport) + CodedOutputByteBufferNano.m17283j(7, apmConfigSetting.cpuModuleStartDelay) + CodedOutputByteBufferNano.m17283j(8, apmConfigSetting.cpuModuleInterval) + CodedOutputByteBufferNano.m17281h(9, apmConfigSetting.cpuSamplingMaxTimes);
            apmConfigSetting.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ApmConfigSetting parse(nc5 nc5Var) throws IOException {
            ApmConfigSetting apmConfigSetting = new ApmConfigSetting();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (apmConfigSetting.configName != null) {
                        break;
                    }
                    apmConfigSetting.configName = "";
                    break;
                }
                if (iM162497u == 10) {
                    apmConfigSetting.configName = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    apmConfigSetting.enableMemoryReport = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    apmConfigSetting.memoryModuleStartDelay = nc5Var.m162487k();
                } else if (iM162497u == 32) {
                    apmConfigSetting.memoryModuleInterval = nc5Var.m162487k();
                } else if (iM162497u == 40) {
                    apmConfigSetting.memorySamplingMaxTimes = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    apmConfigSetting.enableCpuReport = nc5Var.m162483g();
                } else if (iM162497u == 56) {
                    apmConfigSetting.cpuModuleStartDelay = nc5Var.m162487k();
                } else if (iM162497u == 64) {
                    apmConfigSetting.cpuModuleInterval = nc5Var.m162487k();
                } else {
                    if (iM162497u != 72) {
                        if (apmConfigSetting.configName != null) {
                            break;
                        }
                        apmConfigSetting.configName = "";
                        return apmConfigSetting;
                    }
                    apmConfigSetting.cpuSamplingMaxTimes = nc5Var.m162486j();
                }
            }
            return apmConfigSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ApmConfigSetting apmConfigSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = apmConfigSetting.configName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, apmConfigSetting.enableMemoryReport);
            codedOutputByteBufferNano.m17307I(3, apmConfigSetting.memoryModuleStartDelay);
            codedOutputByteBufferNano.m17307I(4, apmConfigSetting.memoryModuleInterval);
            codedOutputByteBufferNano.m17305G(5, apmConfigSetting.memorySamplingMaxTimes);
            codedOutputByteBufferNano.m17299A(6, apmConfigSetting.enableCpuReport);
            codedOutputByteBufferNano.m17307I(7, apmConfigSetting.cpuModuleStartDelay);
            codedOutputByteBufferNano.m17307I(8, apmConfigSetting.cpuModuleInterval);
            codedOutputByteBufferNano.m17305G(9, apmConfigSetting.cpuSamplingMaxTimes);
        }
    };
    public static JsonAdapter<ApmConfigSetting> JSON_ADAPTER = new ObjectJsonAdapter<ApmConfigSetting>() { // from class: com.p1.mobile.putong.data.ApmConfigSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ApmConfigSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ApmConfigSetting newInstance() {
            return new ApmConfigSetting();
        }

        public boolean parseField(ApmConfigSetting apmConfigSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cpuModuleStartDelay":
                    apmConfigSetting.cpuModuleStartDelay = jsonParser.getValueAsLong();
                    return true;
                case "enableMemoryReport":
                    apmConfigSetting.enableMemoryReport = jsonParser.getValueAsBoolean();
                    return true;
                case "memoryModuleStartDelay":
                    apmConfigSetting.memoryModuleStartDelay = jsonParser.getValueAsLong();
                    return true;
                case "enableCpuReport":
                    apmConfigSetting.enableCpuReport = jsonParser.getValueAsBoolean();
                    return true;
                case "cpuModuleInterval":
                    apmConfigSetting.cpuModuleInterval = jsonParser.getValueAsLong();
                    return true;
                case "cpuSamplingMaxTimes":
                    apmConfigSetting.cpuSamplingMaxTimes = jsonParser.getValueAsInt();
                    return true;
                case "configName":
                    apmConfigSetting.configName = jsonParser.getValueAsString();
                    return true;
                case "memorySamplingMaxTimes":
                    apmConfigSetting.memorySamplingMaxTimes = jsonParser.getValueAsInt();
                    return true;
                case "memoryModuleInterval":
                    apmConfigSetting.memoryModuleInterval = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ApmConfigSetting apmConfigSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cpuModuleStartDelay":
                case "enableMemoryReport":
                case "memoryModuleStartDelay":
                case "enableCpuReport":
                case "cpuModuleInterval":
                case "cpuSamplingMaxTimes":
                case "configName":
                case "memorySamplingMaxTimes":
                case "memoryModuleInterval":
                    return true;
                default:
                    return super.parseFieldCheck(apmConfigSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ApmConfigSetting apmConfigSetting, JsonGenerator jsonGenerator) throws IOException {
            String str = apmConfigSetting.configName;
            if (str != null) {
                jsonGenerator.writeStringField("configName", str);
            }
            jsonGenerator.writeBooleanField("enableMemoryReport", apmConfigSetting.enableMemoryReport);
            jsonGenerator.writeNumberField("memoryModuleStartDelay", apmConfigSetting.memoryModuleStartDelay);
            jsonGenerator.writeNumberField("memoryModuleInterval", apmConfigSetting.memoryModuleInterval);
            jsonGenerator.writeNumberField("memorySamplingMaxTimes", apmConfigSetting.memorySamplingMaxTimes);
            jsonGenerator.writeBooleanField("enableCpuReport", apmConfigSetting.enableCpuReport);
            jsonGenerator.writeNumberField("cpuModuleStartDelay", apmConfigSetting.cpuModuleStartDelay);
            jsonGenerator.writeNumberField("cpuModuleInterval", apmConfigSetting.cpuModuleInterval);
            jsonGenerator.writeNumberField("cpuSamplingMaxTimes", apmConfigSetting.cpuSamplingMaxTimes);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ApmConfigSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ApmConfigSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ApmConfigSetting new_() {
        ApmConfigSetting apmConfigSetting = new ApmConfigSetting();
        apmConfigSetting.nullCheck();
        return apmConfigSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ApmConfigSetting mo225055clone() {
        ApmConfigSetting apmConfigSetting = new ApmConfigSetting();
        apmConfigSetting.configName = this.configName;
        apmConfigSetting.enableMemoryReport = this.enableMemoryReport;
        apmConfigSetting.memoryModuleStartDelay = this.memoryModuleStartDelay;
        apmConfigSetting.memoryModuleInterval = this.memoryModuleInterval;
        apmConfigSetting.memorySamplingMaxTimes = this.memorySamplingMaxTimes;
        apmConfigSetting.enableCpuReport = this.enableCpuReport;
        apmConfigSetting.cpuModuleStartDelay = this.cpuModuleStartDelay;
        apmConfigSetting.cpuModuleInterval = this.cpuModuleInterval;
        apmConfigSetting.cpuSamplingMaxTimes = this.cpuSamplingMaxTimes;
        return apmConfigSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApmConfigSetting)) {
            return false;
        }
        ApmConfigSetting apmConfigSetting = (ApmConfigSetting) obj;
        return ValueObject.util_equals(this.configName, apmConfigSetting.configName) && this.enableMemoryReport == apmConfigSetting.enableMemoryReport && this.memoryModuleStartDelay == apmConfigSetting.memoryModuleStartDelay && this.memoryModuleInterval == apmConfigSetting.memoryModuleInterval && this.memorySamplingMaxTimes == apmConfigSetting.memorySamplingMaxTimes && this.enableCpuReport == apmConfigSetting.enableCpuReport && this.cpuModuleStartDelay == apmConfigSetting.cpuModuleStartDelay && this.cpuModuleInterval == apmConfigSetting.cpuModuleInterval && this.cpuSamplingMaxTimes == apmConfigSetting.cpuSamplingMaxTimes;
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
        int i2 = i * 41;
        String str = this.configName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        int i3 = this.enableMemoryReport ? 1231 : 1237;
        long j = this.memoryModuleStartDelay;
        int i4 = (((iHashCode + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.memoryModuleInterval;
        int i5 = (((((i4 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.memorySamplingMaxTimes) * 41) + (this.enableCpuReport ? 1231 : 1237)) * 41;
        long j3 = this.cpuModuleStartDelay;
        int i6 = (i5 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.cpuModuleInterval;
        int i7 = ((i6 + ((int) (j4 ^ (j4 >>> 32)))) * 41) + this.cpuSamplingMaxTimes;
        this.hashCode = i7;
        return i7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.configName == null) {
            this.configName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
