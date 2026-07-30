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
public class RedDotMvOptConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reddotmvoptconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int mv_max;
    public static ProtobufAdapter<RedDotMvOptConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedDotMvOptConfig>() { // from class: com.p1.mobile.putong.core.data.RedDotMvOptConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RedDotMvOptConfig redDotMvOptConfig) {
            int iB = CodedOutputByteBufferNano.b(1, redDotMvOptConfig.enable) + CodedOutputByteBufferNano.h(2, redDotMvOptConfig.mv_max);
            ((MessageNano) redDotMvOptConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RedDotMvOptConfig m15329parse(nb5 nb5Var) throws IOException {
            RedDotMvOptConfig redDotMvOptConfig = new RedDotMvOptConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    redDotMvOptConfig.enable = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return redDotMvOptConfig;
                    }
                    redDotMvOptConfig.mv_max = nb5Var.j();
                }
            }
        }

        public void serialize(RedDotMvOptConfig redDotMvOptConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, redDotMvOptConfig.enable);
            codedOutputByteBufferNano.G(2, redDotMvOptConfig.mv_max);
        }
    };
    public static JsonAdapter<RedDotMvOptConfig> JSON_ADAPTER = new ObjectJsonAdapter<RedDotMvOptConfig>() { // from class: com.p1.mobile.putong.core.data.RedDotMvOptConfig.2
        public Class getDataClass() {
            return RedDotMvOptConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RedDotMvOptConfig m15330newInstance() {
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

        public void serializeFields(RedDotMvOptConfig redDotMvOptConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", redDotMvOptConfig.enable);
            jsonGenerator.writeNumberField("mv_max", redDotMvOptConfig.mv_max);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedDotMvOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedDotMvOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedDotMvOptConfig new_() {
        RedDotMvOptConfig redDotMvOptConfig = new RedDotMvOptConfig();
        redDotMvOptConfig.nullCheck();
        return redDotMvOptConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RedDotMvOptConfig m15328clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.mv_max;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
