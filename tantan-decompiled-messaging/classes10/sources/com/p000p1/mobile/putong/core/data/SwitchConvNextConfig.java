package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SwitchConvNextConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "switchconvnextconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int exp_dismiss_count;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int exp_limit_count;

    @ProtobufIndex(index = 1)
    public int exp_limit_hours;
    public static ProtobufAdapter<SwitchConvNextConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwitchConvNextConfig>() { // from class: com.p1.mobile.putong.core.data.SwitchConvNextConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SwitchConvNextConfig switchConvNextConfig) {
            int iH = CodedOutputByteBufferNano.h(1, switchConvNextConfig.exp_limit_hours) + CodedOutputByteBufferNano.h(2, switchConvNextConfig.exp_limit_count) + CodedOutputByteBufferNano.h(3, switchConvNextConfig.exp_dismiss_count);
            ((MessageNano) switchConvNextConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SwitchConvNextConfig m15874parse(nb5 nb5Var) throws IOException {
            SwitchConvNextConfig switchConvNextConfig = new SwitchConvNextConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    switchConvNextConfig.exp_limit_hours = nb5Var.j();
                } else if (iU == 16) {
                    switchConvNextConfig.exp_limit_count = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return switchConvNextConfig;
                    }
                    switchConvNextConfig.exp_dismiss_count = nb5Var.j();
                }
            }
        }

        public void serialize(SwitchConvNextConfig switchConvNextConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, switchConvNextConfig.exp_limit_hours);
            codedOutputByteBufferNano.G(2, switchConvNextConfig.exp_limit_count);
            codedOutputByteBufferNano.G(3, switchConvNextConfig.exp_dismiss_count);
        }
    };
    public static JsonAdapter<SwitchConvNextConfig> JSON_ADAPTER = new ObjectJsonAdapter<SwitchConvNextConfig>() { // from class: com.p1.mobile.putong.core.data.SwitchConvNextConfig.2
        public Class getDataClass() {
            return SwitchConvNextConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SwitchConvNextConfig m15875newInstance() {
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

        public void serializeFields(SwitchConvNextConfig switchConvNextConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("exp_limit_hours", switchConvNextConfig.exp_limit_hours);
            jsonGenerator.writeNumberField("exp_limit_count", switchConvNextConfig.exp_limit_count);
            jsonGenerator.writeNumberField("exp_dismiss_count", switchConvNextConfig.exp_dismiss_count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwitchConvNextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwitchConvNextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwitchConvNextConfig new_() {
        SwitchConvNextConfig switchConvNextConfig = new SwitchConvNextConfig();
        switchConvNextConfig.nullCheck();
        return switchConvNextConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SwitchConvNextConfig m15873clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.exp_limit_hours) * 41) + this.exp_limit_count) * 41) + this.exp_dismiss_count;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
