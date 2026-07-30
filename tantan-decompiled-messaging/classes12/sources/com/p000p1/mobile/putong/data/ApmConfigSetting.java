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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ApmConfigSetting apmConfigSetting) {
            String str = apmConfigSetting.configName;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, apmConfigSetting.enableMemoryReport) + CodedOutputByteBufferNano.j(3, apmConfigSetting.memoryModuleStartDelay) + CodedOutputByteBufferNano.j(4, apmConfigSetting.memoryModuleInterval) + CodedOutputByteBufferNano.h(5, apmConfigSetting.memorySamplingMaxTimes) + CodedOutputByteBufferNano.b(6, apmConfigSetting.enableCpuReport) + CodedOutputByteBufferNano.j(7, apmConfigSetting.cpuModuleStartDelay) + CodedOutputByteBufferNano.j(8, apmConfigSetting.cpuModuleInterval) + CodedOutputByteBufferNano.h(9, apmConfigSetting.cpuSamplingMaxTimes);
            ((MessageNano) apmConfigSetting).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ApmConfigSetting m17707parse(nb5 nb5Var) throws IOException {
            ApmConfigSetting apmConfigSetting = new ApmConfigSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (apmConfigSetting.configName != null) {
                        break;
                    }
                    apmConfigSetting.configName = "";
                    break;
                }
                if (iU == 10) {
                    apmConfigSetting.configName = nb5Var.s();
                } else if (iU == 16) {
                    apmConfigSetting.enableMemoryReport = nb5Var.g();
                } else if (iU == 24) {
                    apmConfigSetting.memoryModuleStartDelay = nb5Var.k();
                } else if (iU == 32) {
                    apmConfigSetting.memoryModuleInterval = nb5Var.k();
                } else if (iU == 40) {
                    apmConfigSetting.memorySamplingMaxTimes = nb5Var.j();
                } else if (iU == 48) {
                    apmConfigSetting.enableCpuReport = nb5Var.g();
                } else if (iU == 56) {
                    apmConfigSetting.cpuModuleStartDelay = nb5Var.k();
                } else if (iU == 64) {
                    apmConfigSetting.cpuModuleInterval = nb5Var.k();
                } else {
                    if (iU != 72) {
                        if (apmConfigSetting.configName != null) {
                            break;
                        }
                        apmConfigSetting.configName = "";
                        return apmConfigSetting;
                    }
                    apmConfigSetting.cpuSamplingMaxTimes = nb5Var.j();
                }
            }
            return apmConfigSetting;
        }

        public void serialize(ApmConfigSetting apmConfigSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = apmConfigSetting.configName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, apmConfigSetting.enableMemoryReport);
            codedOutputByteBufferNano.I(3, apmConfigSetting.memoryModuleStartDelay);
            codedOutputByteBufferNano.I(4, apmConfigSetting.memoryModuleInterval);
            codedOutputByteBufferNano.G(5, apmConfigSetting.memorySamplingMaxTimes);
            codedOutputByteBufferNano.A(6, apmConfigSetting.enableCpuReport);
            codedOutputByteBufferNano.I(7, apmConfigSetting.cpuModuleStartDelay);
            codedOutputByteBufferNano.I(8, apmConfigSetting.cpuModuleInterval);
            codedOutputByteBufferNano.G(9, apmConfigSetting.cpuSamplingMaxTimes);
        }
    };
    public static JsonAdapter<ApmConfigSetting> JSON_ADAPTER = new ObjectJsonAdapter<ApmConfigSetting>() { // from class: com.p1.mobile.putong.data.ApmConfigSetting.2
        public Class getDataClass() {
            return ApmConfigSetting.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ApmConfigSetting mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ApmConfigSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ApmConfigSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ApmConfigSetting new_() {
        ApmConfigSetting apmConfigSetting = new ApmConfigSetting();
        apmConfigSetting.nullCheck();
        return apmConfigSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ApmConfigSetting m17706clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i7;
        return i7;
    }

    public void nullCheck() {
        if (this.configName == null) {
            this.configName = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
