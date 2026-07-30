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
public class PrologueConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prologueconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int enter_conv_limit;

    @ProtobufIndex(index = 5)
    public int unreply_daily_show_count;

    @ProtobufIndex(index = 6)
    public int unreply_show_days_count;

    @ProtobufIndex(index = 3)
    public int untalked_daily_show_count;

    @ProtobufIndex(index = 4)
    public int untalked_show_days_count;
    public static ProtobufAdapter<PrologueConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrologueConfig>() { // from class: com.p1.mobile.putong.core.data.PrologueConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrologueConfig prologueConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, prologueConfig.enable) + CodedOutputByteBufferNano.m17281h(2, prologueConfig.enter_conv_limit) + CodedOutputByteBufferNano.m17281h(3, prologueConfig.untalked_daily_show_count) + CodedOutputByteBufferNano.m17281h(4, prologueConfig.untalked_show_days_count) + CodedOutputByteBufferNano.m17281h(5, prologueConfig.unreply_daily_show_count) + CodedOutputByteBufferNano.m17281h(6, prologueConfig.unreply_show_days_count);
            prologueConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrologueConfig parse(nc5 nc5Var) throws IOException {
            PrologueConfig prologueConfig = new PrologueConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    prologueConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    prologueConfig.enter_conv_limit = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    prologueConfig.untalked_daily_show_count = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    prologueConfig.untalked_show_days_count = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    prologueConfig.unreply_daily_show_count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 48) {
                        return prologueConfig;
                    }
                    prologueConfig.unreply_show_days_count = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrologueConfig prologueConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, prologueConfig.enable);
            codedOutputByteBufferNano.m17305G(2, prologueConfig.enter_conv_limit);
            codedOutputByteBufferNano.m17305G(3, prologueConfig.untalked_daily_show_count);
            codedOutputByteBufferNano.m17305G(4, prologueConfig.untalked_show_days_count);
            codedOutputByteBufferNano.m17305G(5, prologueConfig.unreply_daily_show_count);
            codedOutputByteBufferNano.m17305G(6, prologueConfig.unreply_show_days_count);
        }
    };
    public static JsonAdapter<PrologueConfig> JSON_ADAPTER = new ObjectJsonAdapter<PrologueConfig>() { // from class: com.p1.mobile.putong.core.data.PrologueConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrologueConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrologueConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrologueConfig prologueConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", prologueConfig.enable);
            jsonGenerator.writeNumberField("enter_conv_limit", prologueConfig.enter_conv_limit);
            jsonGenerator.writeNumberField("untalked_daily_show_count", prologueConfig.untalked_daily_show_count);
            jsonGenerator.writeNumberField("untalked_show_days_count", prologueConfig.untalked_show_days_count);
            jsonGenerator.writeNumberField("unreply_daily_show_count", prologueConfig.unreply_daily_show_count);
            jsonGenerator.writeNumberField("unreply_show_days_count", prologueConfig.unreply_show_days_count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrologueConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrologueConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrologueConfig new_() {
        PrologueConfig prologueConfig = new PrologueConfig();
        prologueConfig.nullCheck();
        return prologueConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrologueConfig mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.enter_conv_limit) * 41) + this.untalked_daily_show_count) * 41) + this.untalked_show_days_count) * 41) + this.unreply_daily_show_count) * 41) + this.unreply_show_days_count;
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
