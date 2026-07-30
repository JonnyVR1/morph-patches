package com.p051p1.mobile.putong.data;

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
public class SafetyModeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "safetymodeconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public boolean protectActivity;

    @ProtobufIndex(index = 3)
    public boolean protectEvent;

    @ProtobufIndex(index = 4)
    public boolean resetAppData;

    @ProtobufIndex(index = 5)
    public boolean resetUserData;
    public static ProtobufAdapter<SafetyModeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SafetyModeConfig>() { // from class: com.p1.mobile.putong.data.SafetyModeConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SafetyModeConfig safetyModeConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, safetyModeConfig.enable) + CodedOutputByteBufferNano.m17275b(2, safetyModeConfig.protectActivity) + CodedOutputByteBufferNano.m17275b(3, safetyModeConfig.protectEvent) + CodedOutputByteBufferNano.m17275b(4, safetyModeConfig.resetAppData) + CodedOutputByteBufferNano.m17275b(5, safetyModeConfig.resetUserData);
            safetyModeConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SafetyModeConfig parse(nc5 nc5Var) throws IOException {
            SafetyModeConfig safetyModeConfig = new SafetyModeConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    safetyModeConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    safetyModeConfig.protectActivity = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    safetyModeConfig.protectEvent = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    safetyModeConfig.resetAppData = nc5Var.m162483g();
                } else {
                    if (iM162497u != 40) {
                        return safetyModeConfig;
                    }
                    safetyModeConfig.resetUserData = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SafetyModeConfig safetyModeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, safetyModeConfig.enable);
            codedOutputByteBufferNano.m17299A(2, safetyModeConfig.protectActivity);
            codedOutputByteBufferNano.m17299A(3, safetyModeConfig.protectEvent);
            codedOutputByteBufferNano.m17299A(4, safetyModeConfig.resetAppData);
            codedOutputByteBufferNano.m17299A(5, safetyModeConfig.resetUserData);
        }
    };
    public static JsonAdapter<SafetyModeConfig> JSON_ADAPTER = new ObjectJsonAdapter<SafetyModeConfig>() { // from class: com.p1.mobile.putong.data.SafetyModeConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SafetyModeConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SafetyModeConfig newInstance() {
            return new SafetyModeConfig();
        }

        public boolean parseField(SafetyModeConfig safetyModeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resetUserData":
                    safetyModeConfig.resetUserData = jsonParser.getValueAsBoolean();
                    return true;
                case "resetAppData":
                    safetyModeConfig.resetAppData = jsonParser.getValueAsBoolean();
                    return true;
                case "enable":
                    safetyModeConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "protectActivity":
                    safetyModeConfig.protectActivity = jsonParser.getValueAsBoolean();
                    return true;
                case "protectEvent":
                    safetyModeConfig.protectEvent = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SafetyModeConfig safetyModeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "resetUserData":
                case "resetAppData":
                case "enable":
                case "protectActivity":
                case "protectEvent":
                    return true;
                default:
                    return super.parseFieldCheck(safetyModeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SafetyModeConfig safetyModeConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", safetyModeConfig.enable);
            jsonGenerator.writeBooleanField("protectActivity", safetyModeConfig.protectActivity);
            jsonGenerator.writeBooleanField("protectEvent", safetyModeConfig.protectEvent);
            jsonGenerator.writeBooleanField("resetAppData", safetyModeConfig.resetAppData);
            jsonGenerator.writeBooleanField("resetUserData", safetyModeConfig.resetUserData);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SafetyModeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SafetyModeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SafetyModeConfig new_() {
        SafetyModeConfig safetyModeConfig = new SafetyModeConfig();
        safetyModeConfig.nullCheck();
        return safetyModeConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SafetyModeConfig mo225055clone() {
        SafetyModeConfig safetyModeConfig = new SafetyModeConfig();
        safetyModeConfig.enable = this.enable;
        safetyModeConfig.protectActivity = this.protectActivity;
        safetyModeConfig.protectEvent = this.protectEvent;
        safetyModeConfig.resetAppData = this.resetAppData;
        safetyModeConfig.resetUserData = this.resetUserData;
        return safetyModeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafetyModeConfig)) {
            return false;
        }
        SafetyModeConfig safetyModeConfig = (SafetyModeConfig) obj;
        return this.enable == safetyModeConfig.enable && this.protectActivity == safetyModeConfig.protectActivity && this.protectEvent == safetyModeConfig.protectEvent && this.resetAppData == safetyModeConfig.resetAppData && this.resetUserData == safetyModeConfig.resetUserData;
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
        int i2 = (((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.protectActivity ? 1231 : 1237)) * 41) + (this.protectEvent ? 1231 : 1237)) * 41) + (this.resetAppData ? 1231 : 1237)) * 41) + (this.resetUserData ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
