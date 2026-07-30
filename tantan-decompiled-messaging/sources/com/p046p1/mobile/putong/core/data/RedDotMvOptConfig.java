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
public class RedDotMvOptConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reddotmvoptconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int mv_max;
    public static ProtobufAdapter<RedDotMvOptConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedDotMvOptConfig>() { // from class: com.p1.mobile.putong.core.data.RedDotMvOptConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RedDotMvOptConfig redDotMvOptConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, redDotMvOptConfig.enable) + CodedOutputByteBufferNano.m17226h(2, redDotMvOptConfig.mv_max);
            redDotMvOptConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RedDotMvOptConfig parse(nb5 nb5Var) throws IOException {
            RedDotMvOptConfig redDotMvOptConfig = new RedDotMvOptConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    redDotMvOptConfig.enable = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return redDotMvOptConfig;
                    }
                    redDotMvOptConfig.mv_max = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RedDotMvOptConfig redDotMvOptConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, redDotMvOptConfig.enable);
            codedOutputByteBufferNano.m17250G(2, redDotMvOptConfig.mv_max);
        }
    };
    public static JsonAdapter<RedDotMvOptConfig> JSON_ADAPTER = new ObjectJsonAdapter<RedDotMvOptConfig>() { // from class: com.p1.mobile.putong.core.data.RedDotMvOptConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RedDotMvOptConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RedDotMvOptConfig newInstance() {
            return new RedDotMvOptConfig();
        }

        public boolean parseField(RedDotMvOptConfig redDotMvOptConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                redDotMvOptConfig.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("mv_max")) {
                return false;
            }
            redDotMvOptConfig.mv_max = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(RedDotMvOptConfig redDotMvOptConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("mv_max")) {
                return true;
            }
            return super.parseFieldCheck(redDotMvOptConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RedDotMvOptConfig redDotMvOptConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", redDotMvOptConfig.enable);
            jsonGenerator.writeNumberField("mv_max", redDotMvOptConfig.mv_max);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedDotMvOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedDotMvOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedDotMvOptConfig new_() {
        RedDotMvOptConfig redDotMvOptConfig = new RedDotMvOptConfig();
        redDotMvOptConfig.nullCheck();
        return redDotMvOptConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RedDotMvOptConfig mo223809clone() {
        RedDotMvOptConfig redDotMvOptConfig = new RedDotMvOptConfig();
        redDotMvOptConfig.enable = this.enable;
        redDotMvOptConfig.mv_max = this.mv_max;
        return redDotMvOptConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedDotMvOptConfig)) {
            return false;
        }
        RedDotMvOptConfig redDotMvOptConfig = (RedDotMvOptConfig) obj;
        return this.enable == redDotMvOptConfig.enable && this.mv_max == redDotMvOptConfig.mv_max;
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
        int i2 = (((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.mv_max;
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
