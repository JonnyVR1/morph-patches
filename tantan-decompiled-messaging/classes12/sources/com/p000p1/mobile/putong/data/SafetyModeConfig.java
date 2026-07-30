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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SafetyModeConfig safetyModeConfig) {
            int iB = CodedOutputByteBufferNano.b(1, safetyModeConfig.enable) + CodedOutputByteBufferNano.b(2, safetyModeConfig.protectActivity) + CodedOutputByteBufferNano.b(3, safetyModeConfig.protectEvent) + CodedOutputByteBufferNano.b(4, safetyModeConfig.resetAppData) + CodedOutputByteBufferNano.b(5, safetyModeConfig.resetUserData);
            ((MessageNano) safetyModeConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SafetyModeConfig m18926parse(nb5 nb5Var) throws IOException {
            SafetyModeConfig safetyModeConfig = new SafetyModeConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    safetyModeConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    safetyModeConfig.protectActivity = nb5Var.g();
                } else if (iU == 24) {
                    safetyModeConfig.protectEvent = nb5Var.g();
                } else if (iU == 32) {
                    safetyModeConfig.resetAppData = nb5Var.g();
                } else {
                    if (iU != 40) {
                        return safetyModeConfig;
                    }
                    safetyModeConfig.resetUserData = nb5Var.g();
                }
            }
        }

        public void serialize(SafetyModeConfig safetyModeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, safetyModeConfig.enable);
            codedOutputByteBufferNano.A(2, safetyModeConfig.protectActivity);
            codedOutputByteBufferNano.A(3, safetyModeConfig.protectEvent);
            codedOutputByteBufferNano.A(4, safetyModeConfig.resetAppData);
            codedOutputByteBufferNano.A(5, safetyModeConfig.resetUserData);
        }
    };
    public static JsonAdapter<SafetyModeConfig> JSON_ADAPTER = new ObjectJsonAdapter<SafetyModeConfig>() { // from class: com.p1.mobile.putong.data.SafetyModeConfig.2
        public Class getDataClass() {
            return SafetyModeConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SafetyModeConfig mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SafetyModeConfig safetyModeConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", safetyModeConfig.enable);
            jsonGenerator.writeBooleanField("protectActivity", safetyModeConfig.protectActivity);
            jsonGenerator.writeBooleanField("protectEvent", safetyModeConfig.protectEvent);
            jsonGenerator.writeBooleanField("resetAppData", safetyModeConfig.resetAppData);
            jsonGenerator.writeBooleanField("resetUserData", safetyModeConfig.resetUserData);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SafetyModeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SafetyModeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SafetyModeConfig new_() {
        SafetyModeConfig safetyModeConfig = new SafetyModeConfig();
        safetyModeConfig.nullCheck();
        return safetyModeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SafetyModeConfig m18925clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.protectActivity ? 1231 : 1237)) * 41) + (this.protectEvent ? 1231 : 1237)) * 41) + (this.resetAppData ? 1231 : 1237)) * 41) + (this.resetUserData ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
