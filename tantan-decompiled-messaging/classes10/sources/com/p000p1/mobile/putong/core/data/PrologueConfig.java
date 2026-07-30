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
public class PrologueConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prologueconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int enter_conv_limit;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int unreply_daily_show_count;

    @ProtobufIndex(index = 6)
    public int unreply_show_days_count;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int untalked_daily_show_count;

    @ProtobufIndex(index = 4)
    public int untalked_show_days_count;
    public static ProtobufAdapter<PrologueConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrologueConfig>() { // from class: com.p1.mobile.putong.core.data.PrologueConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrologueConfig prologueConfig) {
            int iB = CodedOutputByteBufferNano.b(1, prologueConfig.enable) + CodedOutputByteBufferNano.h(2, prologueConfig.enter_conv_limit) + CodedOutputByteBufferNano.h(3, prologueConfig.untalked_daily_show_count) + CodedOutputByteBufferNano.h(4, prologueConfig.untalked_show_days_count) + CodedOutputByteBufferNano.h(5, prologueConfig.unreply_daily_show_count) + CodedOutputByteBufferNano.h(6, prologueConfig.unreply_show_days_count);
            ((MessageNano) prologueConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrologueConfig m15051parse(nb5 nb5Var) throws IOException {
            PrologueConfig prologueConfig = new PrologueConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    prologueConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    prologueConfig.enter_conv_limit = nb5Var.j();
                } else if (iU == 24) {
                    prologueConfig.untalked_daily_show_count = nb5Var.j();
                } else if (iU == 32) {
                    prologueConfig.untalked_show_days_count = nb5Var.j();
                } else if (iU == 40) {
                    prologueConfig.unreply_daily_show_count = nb5Var.j();
                } else {
                    if (iU != 48) {
                        return prologueConfig;
                    }
                    prologueConfig.unreply_show_days_count = nb5Var.j();
                }
            }
        }

        public void serialize(PrologueConfig prologueConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, prologueConfig.enable);
            codedOutputByteBufferNano.G(2, prologueConfig.enter_conv_limit);
            codedOutputByteBufferNano.G(3, prologueConfig.untalked_daily_show_count);
            codedOutputByteBufferNano.G(4, prologueConfig.untalked_show_days_count);
            codedOutputByteBufferNano.G(5, prologueConfig.unreply_daily_show_count);
            codedOutputByteBufferNano.G(6, prologueConfig.unreply_show_days_count);
        }
    };
    public static JsonAdapter<PrologueConfig> JSON_ADAPTER = new ObjectJsonAdapter<PrologueConfig>() { // from class: com.p1.mobile.putong.core.data.PrologueConfig.2
        public Class getDataClass() {
            return PrologueConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrologueConfig m15052newInstance() {
            return new PrologueConfig();
        }

        public boolean parseField(PrologueConfig prologueConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    prologueConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "untalked_show_days_count":
                    prologueConfig.untalked_show_days_count = jsonParser.getValueAsInt();
                    return true;
                case "untalked_daily_show_count":
                    prologueConfig.untalked_daily_show_count = jsonParser.getValueAsInt();
                    return true;
                case "unreply_show_days_count":
                    prologueConfig.unreply_show_days_count = jsonParser.getValueAsInt();
                    return true;
                case "enter_conv_limit":
                    prologueConfig.enter_conv_limit = jsonParser.getValueAsInt();
                    return true;
                case "unreply_daily_show_count":
                    prologueConfig.unreply_daily_show_count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrologueConfig prologueConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "untalked_show_days_count":
                case "untalked_daily_show_count":
                case "unreply_show_days_count":
                case "enter_conv_limit":
                case "unreply_daily_show_count":
                    return true;
                default:
                    return super.parseFieldCheck(prologueConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PrologueConfig prologueConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", prologueConfig.enable);
            jsonGenerator.writeNumberField("enter_conv_limit", prologueConfig.enter_conv_limit);
            jsonGenerator.writeNumberField("untalked_daily_show_count", prologueConfig.untalked_daily_show_count);
            jsonGenerator.writeNumberField("untalked_show_days_count", prologueConfig.untalked_show_days_count);
            jsonGenerator.writeNumberField("unreply_daily_show_count", prologueConfig.unreply_daily_show_count);
            jsonGenerator.writeNumberField("unreply_show_days_count", prologueConfig.unreply_show_days_count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrologueConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrologueConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrologueConfig new_() {
        PrologueConfig prologueConfig = new PrologueConfig();
        prologueConfig.nullCheck();
        return prologueConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrologueConfig m15050clone() {
        PrologueConfig prologueConfig = new PrologueConfig();
        prologueConfig.enable = this.enable;
        prologueConfig.enter_conv_limit = this.enter_conv_limit;
        prologueConfig.untalked_daily_show_count = this.untalked_daily_show_count;
        prologueConfig.untalked_show_days_count = this.untalked_show_days_count;
        prologueConfig.unreply_daily_show_count = this.unreply_daily_show_count;
        prologueConfig.unreply_show_days_count = this.unreply_show_days_count;
        return prologueConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrologueConfig)) {
            return false;
        }
        PrologueConfig prologueConfig = (PrologueConfig) obj;
        return this.enable == prologueConfig.enable && this.enter_conv_limit == prologueConfig.enter_conv_limit && this.untalked_daily_show_count == prologueConfig.untalked_daily_show_count && this.untalked_show_days_count == prologueConfig.untalked_show_days_count && this.unreply_daily_show_count == prologueConfig.unreply_daily_show_count && this.unreply_show_days_count == prologueConfig.unreply_show_days_count;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.enter_conv_limit) * 41) + this.untalked_daily_show_count) * 41) + this.untalked_show_days_count) * 41) + this.unreply_daily_show_count) * 41) + this.unreply_show_days_count;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
