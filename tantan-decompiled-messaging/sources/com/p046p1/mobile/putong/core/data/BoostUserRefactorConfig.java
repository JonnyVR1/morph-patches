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
public class BoostUserRefactorConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostuserrefactorconfig";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = 2)
    public int guide_interval_days;
    public static ProtobufAdapter<BoostUserRefactorConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostUserRefactorConfig>() { // from class: com.p1.mobile.putong.core.data.BoostUserRefactorConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostUserRefactorConfig boostUserRefactorConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, boostUserRefactorConfig.enabled) + CodedOutputByteBufferNano.m17226h(2, boostUserRefactorConfig.guide_interval_days);
            boostUserRefactorConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostUserRefactorConfig parse(nb5 nb5Var) throws IOException {
            BoostUserRefactorConfig boostUserRefactorConfig = new BoostUserRefactorConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    boostUserRefactorConfig.enabled = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return boostUserRefactorConfig;
                    }
                    boostUserRefactorConfig.guide_interval_days = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostUserRefactorConfig boostUserRefactorConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, boostUserRefactorConfig.enabled);
            codedOutputByteBufferNano.m17250G(2, boostUserRefactorConfig.guide_interval_days);
        }
    };
    public static JsonAdapter<BoostUserRefactorConfig> JSON_ADAPTER = new ObjectJsonAdapter<BoostUserRefactorConfig>() { // from class: com.p1.mobile.putong.core.data.BoostUserRefactorConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostUserRefactorConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostUserRefactorConfig newInstance() {
            return new BoostUserRefactorConfig();
        }

        public boolean parseField(BoostUserRefactorConfig boostUserRefactorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enabled")) {
                boostUserRefactorConfig.enabled = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("guide_interval_days")) {
                return false;
            }
            boostUserRefactorConfig.guide_interval_days = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BoostUserRefactorConfig boostUserRefactorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enabled") || str.equals("guide_interval_days")) {
                return true;
            }
            return super.parseFieldCheck(boostUserRefactorConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostUserRefactorConfig boostUserRefactorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", boostUserRefactorConfig.enabled);
            jsonGenerator.writeNumberField("guide_interval_days", boostUserRefactorConfig.guide_interval_days);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostUserRefactorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostUserRefactorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostUserRefactorConfig new_() {
        BoostUserRefactorConfig boostUserRefactorConfig = new BoostUserRefactorConfig();
        boostUserRefactorConfig.nullCheck();
        return boostUserRefactorConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostUserRefactorConfig mo223809clone() {
        BoostUserRefactorConfig boostUserRefactorConfig = new BoostUserRefactorConfig();
        boostUserRefactorConfig.enabled = this.enabled;
        boostUserRefactorConfig.guide_interval_days = this.guide_interval_days;
        return boostUserRefactorConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostUserRefactorConfig)) {
            return false;
        }
        BoostUserRefactorConfig boostUserRefactorConfig = (BoostUserRefactorConfig) obj;
        return this.enabled == boostUserRefactorConfig.enabled && this.guide_interval_days == boostUserRefactorConfig.guide_interval_days;
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
        int i2 = (((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + this.guide_interval_days;
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
