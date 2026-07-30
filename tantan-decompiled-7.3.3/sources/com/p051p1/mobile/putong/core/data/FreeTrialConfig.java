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
public class FreeTrialConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialconfig";

    @ProtobufIndex(index = 2)
    public int benefitCount;

    @ProtobufIndex(index = 1)
    public int conditionCount;

    @ProtobufIndex(index = 4)
    public long durationSeconds;

    @ProtobufIndex(index = 3)
    public int remindCount;
    public static ProtobufAdapter<FreeTrialConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialConfig>() { // from class: com.p1.mobile.putong.core.data.FreeTrialConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FreeTrialConfig freeTrialConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, freeTrialConfig.conditionCount) + CodedOutputByteBufferNano.m17281h(2, freeTrialConfig.benefitCount) + CodedOutputByteBufferNano.m17281h(3, freeTrialConfig.remindCount) + CodedOutputByteBufferNano.m17283j(4, freeTrialConfig.durationSeconds);
            freeTrialConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FreeTrialConfig parse(nc5 nc5Var) throws IOException {
            FreeTrialConfig freeTrialConfig = new FreeTrialConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    freeTrialConfig.conditionCount = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    freeTrialConfig.benefitCount = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    freeTrialConfig.remindCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 32) {
                        return freeTrialConfig;
                    }
                    freeTrialConfig.durationSeconds = nc5Var.m162487k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FreeTrialConfig freeTrialConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, freeTrialConfig.conditionCount);
            codedOutputByteBufferNano.m17305G(2, freeTrialConfig.benefitCount);
            codedOutputByteBufferNano.m17305G(3, freeTrialConfig.remindCount);
            codedOutputByteBufferNano.m17307I(4, freeTrialConfig.durationSeconds);
        }
    };
    public static JsonAdapter<FreeTrialConfig> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialConfig>() { // from class: com.p1.mobile.putong.core.data.FreeTrialConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FreeTrialConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FreeTrialConfig newInstance() {
            return new FreeTrialConfig();
        }

        public boolean parseField(FreeTrialConfig freeTrialConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "DurationSeconds":
                    freeTrialConfig.durationSeconds = jsonParser.getValueAsLong();
                    return true;
                case "ConditionCount":
                    freeTrialConfig.conditionCount = jsonParser.getValueAsInt();
                    return true;
                case "BenefitCount":
                    freeTrialConfig.benefitCount = jsonParser.getValueAsInt();
                    return true;
                case "RemindCount":
                    freeTrialConfig.remindCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FreeTrialConfig freeTrialConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "DurationSeconds":
                case "ConditionCount":
                case "BenefitCount":
                case "RemindCount":
                    return true;
                default:
                    return super.parseFieldCheck(freeTrialConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FreeTrialConfig freeTrialConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("ConditionCount", freeTrialConfig.conditionCount);
            jsonGenerator.writeNumberField("BenefitCount", freeTrialConfig.benefitCount);
            jsonGenerator.writeNumberField("RemindCount", freeTrialConfig.remindCount);
            jsonGenerator.writeNumberField("DurationSeconds", freeTrialConfig.durationSeconds);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialConfig new_() {
        FreeTrialConfig freeTrialConfig = new FreeTrialConfig();
        freeTrialConfig.nullCheck();
        return freeTrialConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FreeTrialConfig mo225055clone() {
        FreeTrialConfig freeTrialConfig = new FreeTrialConfig();
        freeTrialConfig.conditionCount = this.conditionCount;
        freeTrialConfig.benefitCount = this.benefitCount;
        freeTrialConfig.remindCount = this.remindCount;
        freeTrialConfig.durationSeconds = this.durationSeconds;
        return freeTrialConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeTrialConfig)) {
            return false;
        }
        FreeTrialConfig freeTrialConfig = (FreeTrialConfig) obj;
        return this.conditionCount == freeTrialConfig.conditionCount && this.benefitCount == freeTrialConfig.benefitCount && this.remindCount == freeTrialConfig.remindCount && this.durationSeconds == freeTrialConfig.durationSeconds;
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
        int i2 = ((((((i * 41) + this.conditionCount) * 41) + this.benefitCount) * 41) + this.remindCount) * 41;
        long j = this.durationSeconds;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
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
