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
public class SwitchConvNextConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "switchconvnextconfig";

    @ProtobufIndex(index = 3)
    public int exp_dismiss_count;

    @ProtobufIndex(index = 2)
    public int exp_limit_count;

    @ProtobufIndex(index = 1)
    public int exp_limit_hours;
    public static ProtobufAdapter<SwitchConvNextConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwitchConvNextConfig>() { // from class: com.p1.mobile.putong.core.data.SwitchConvNextConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwitchConvNextConfig switchConvNextConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, switchConvNextConfig.exp_limit_hours) + CodedOutputByteBufferNano.m17226h(2, switchConvNextConfig.exp_limit_count) + CodedOutputByteBufferNano.m17226h(3, switchConvNextConfig.exp_dismiss_count);
            switchConvNextConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwitchConvNextConfig parse(nb5 nb5Var) throws IOException {
            SwitchConvNextConfig switchConvNextConfig = new SwitchConvNextConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    switchConvNextConfig.exp_limit_hours = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    switchConvNextConfig.exp_limit_count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return switchConvNextConfig;
                    }
                    switchConvNextConfig.exp_dismiss_count = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwitchConvNextConfig switchConvNextConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, switchConvNextConfig.exp_limit_hours);
            codedOutputByteBufferNano.m17250G(2, switchConvNextConfig.exp_limit_count);
            codedOutputByteBufferNano.m17250G(3, switchConvNextConfig.exp_dismiss_count);
        }
    };
    public static JsonAdapter<SwitchConvNextConfig> JSON_ADAPTER = new ObjectJsonAdapter<SwitchConvNextConfig>() { // from class: com.p1.mobile.putong.core.data.SwitchConvNextConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwitchConvNextConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwitchConvNextConfig newInstance() {
            return new SwitchConvNextConfig();
        }

        public boolean parseField(SwitchConvNextConfig switchConvNextConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "exp_dismiss_count":
                    switchConvNextConfig.exp_dismiss_count = jsonParser.getValueAsInt();
                    return true;
                case "exp_limit_count":
                    switchConvNextConfig.exp_limit_count = jsonParser.getValueAsInt();
                    return true;
                case "exp_limit_hours":
                    switchConvNextConfig.exp_limit_hours = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SwitchConvNextConfig switchConvNextConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "exp_dismiss_count":
                case "exp_limit_count":
                case "exp_limit_hours":
                    return true;
                default:
                    return super.parseFieldCheck(switchConvNextConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwitchConvNextConfig switchConvNextConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("exp_limit_hours", switchConvNextConfig.exp_limit_hours);
            jsonGenerator.writeNumberField("exp_limit_count", switchConvNextConfig.exp_limit_count);
            jsonGenerator.writeNumberField("exp_dismiss_count", switchConvNextConfig.exp_dismiss_count);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwitchConvNextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwitchConvNextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwitchConvNextConfig new_() {
        SwitchConvNextConfig switchConvNextConfig = new SwitchConvNextConfig();
        switchConvNextConfig.nullCheck();
        return switchConvNextConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwitchConvNextConfig mo223809clone() {
        SwitchConvNextConfig switchConvNextConfig = new SwitchConvNextConfig();
        switchConvNextConfig.exp_limit_hours = this.exp_limit_hours;
        switchConvNextConfig.exp_limit_count = this.exp_limit_count;
        switchConvNextConfig.exp_dismiss_count = this.exp_dismiss_count;
        return switchConvNextConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwitchConvNextConfig)) {
            return false;
        }
        SwitchConvNextConfig switchConvNextConfig = (SwitchConvNextConfig) obj;
        return this.exp_limit_hours == switchConvNextConfig.exp_limit_hours && this.exp_limit_count == switchConvNextConfig.exp_limit_count && this.exp_dismiss_count == switchConvNextConfig.exp_dismiss_count;
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
        int i2 = (((((i * 41) + this.exp_limit_hours) * 41) + this.exp_limit_count) * 41) + this.exp_dismiss_count;
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
