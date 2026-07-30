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
public class IntlSlGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlslguideconfig";

    @ProtobufIndex(index = 7)
    public int intl_card_user_last_active_limit_time;

    @ProtobufIndex(index = 3)
    public float intl_pop_0_20_men;

    @ProtobufIndex(index = 4)
    public float intl_pop_0_20_women;

    @ProtobufIndex(index = 5)
    public float intl_pop_0_30_men;

    @ProtobufIndex(index = 6)
    public float intl_pop_0_30_women;

    @ProtobufIndex(index = 1)
    public int intl_sl_card_guide_dlg_men;

    @ProtobufIndex(index = 2)
    public int intl_sl_card_guide_dlg_women;
    public static ProtobufAdapter<IntlSlGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlSlGuideConfig>() { // from class: com.p1.mobile.putong.core.data.IntlSlGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlSlGuideConfig intlSlGuideConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, intlSlGuideConfig.intl_sl_card_guide_dlg_men) + CodedOutputByteBufferNano.m17281h(2, intlSlGuideConfig.intl_sl_card_guide_dlg_women) + CodedOutputByteBufferNano.m17279f(3, intlSlGuideConfig.intl_pop_0_20_men) + CodedOutputByteBufferNano.m17279f(4, intlSlGuideConfig.intl_pop_0_20_women) + CodedOutputByteBufferNano.m17279f(5, intlSlGuideConfig.intl_pop_0_30_men) + CodedOutputByteBufferNano.m17279f(6, intlSlGuideConfig.intl_pop_0_30_women) + CodedOutputByteBufferNano.m17281h(7, intlSlGuideConfig.intl_card_user_last_active_limit_time);
            intlSlGuideConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlSlGuideConfig parse(nc5 nc5Var) throws IOException {
            IntlSlGuideConfig intlSlGuideConfig = new IntlSlGuideConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    intlSlGuideConfig.intl_sl_card_guide_dlg_men = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    intlSlGuideConfig.intl_sl_card_guide_dlg_women = nc5Var.m162486j();
                } else if (iM162497u == 29) {
                    intlSlGuideConfig.intl_pop_0_20_men = nc5Var.m162485i();
                } else if (iM162497u == 37) {
                    intlSlGuideConfig.intl_pop_0_20_women = nc5Var.m162485i();
                } else if (iM162497u == 45) {
                    intlSlGuideConfig.intl_pop_0_30_men = nc5Var.m162485i();
                } else if (iM162497u == 53) {
                    intlSlGuideConfig.intl_pop_0_30_women = nc5Var.m162485i();
                } else {
                    if (iM162497u != 56) {
                        return intlSlGuideConfig;
                    }
                    intlSlGuideConfig.intl_card_user_last_active_limit_time = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlSlGuideConfig intlSlGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, intlSlGuideConfig.intl_sl_card_guide_dlg_men);
            codedOutputByteBufferNano.m17305G(2, intlSlGuideConfig.intl_sl_card_guide_dlg_women);
            codedOutputByteBufferNano.m17303E(3, intlSlGuideConfig.intl_pop_0_20_men);
            codedOutputByteBufferNano.m17303E(4, intlSlGuideConfig.intl_pop_0_20_women);
            codedOutputByteBufferNano.m17303E(5, intlSlGuideConfig.intl_pop_0_30_men);
            codedOutputByteBufferNano.m17303E(6, intlSlGuideConfig.intl_pop_0_30_women);
            codedOutputByteBufferNano.m17305G(7, intlSlGuideConfig.intl_card_user_last_active_limit_time);
        }
    };
    public static JsonAdapter<IntlSlGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlSlGuideConfig>() { // from class: com.p1.mobile.putong.core.data.IntlSlGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlSlGuideConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlSlGuideConfig newInstance() {
            return new IntlSlGuideConfig();
        }

        public boolean parseField(IntlSlGuideConfig intlSlGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "intl_pop_0_20_men":
                    intlSlGuideConfig.intl_pop_0_20_men = (float) jsonParser.getValueAsDouble();
                    return true;
                case "intl_pop_0_30_men":
                    intlSlGuideConfig.intl_pop_0_30_men = (float) jsonParser.getValueAsDouble();
                    return true;
                case "intl_pop_0_30_women":
                    intlSlGuideConfig.intl_pop_0_30_women = (float) jsonParser.getValueAsDouble();
                    return true;
                case "intl_sl_card_guide_dlg_women":
                    intlSlGuideConfig.intl_sl_card_guide_dlg_women = jsonParser.getValueAsInt();
                    return true;
                case "intl_sl_card_guide_dlg_men":
                    intlSlGuideConfig.intl_sl_card_guide_dlg_men = jsonParser.getValueAsInt();
                    return true;
                case "intl_card_user_last_active_limit_time":
                    intlSlGuideConfig.intl_card_user_last_active_limit_time = jsonParser.getValueAsInt();
                    return true;
                case "intl_pop_0_20_women":
                    intlSlGuideConfig.intl_pop_0_20_women = (float) jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlSlGuideConfig intlSlGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "intl_pop_0_20_men":
                case "intl_pop_0_30_men":
                case "intl_pop_0_30_women":
                case "intl_sl_card_guide_dlg_women":
                case "intl_sl_card_guide_dlg_men":
                case "intl_card_user_last_active_limit_time":
                case "intl_pop_0_20_women":
                    return true;
                default:
                    return super.parseFieldCheck(intlSlGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlSlGuideConfig intlSlGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("intl_sl_card_guide_dlg_men", intlSlGuideConfig.intl_sl_card_guide_dlg_men);
            jsonGenerator.writeNumberField("intl_sl_card_guide_dlg_women", intlSlGuideConfig.intl_sl_card_guide_dlg_women);
            jsonGenerator.writeNumberField("intl_pop_0_20_men", intlSlGuideConfig.intl_pop_0_20_men);
            jsonGenerator.writeNumberField("intl_pop_0_20_women", intlSlGuideConfig.intl_pop_0_20_women);
            jsonGenerator.writeNumberField("intl_pop_0_30_men", intlSlGuideConfig.intl_pop_0_30_men);
            jsonGenerator.writeNumberField("intl_pop_0_30_women", intlSlGuideConfig.intl_pop_0_30_women);
            jsonGenerator.writeNumberField("intl_card_user_last_active_limit_time", intlSlGuideConfig.intl_card_user_last_active_limit_time);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlSlGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlSlGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlSlGuideConfig new_() {
        IntlSlGuideConfig intlSlGuideConfig = new IntlSlGuideConfig();
        intlSlGuideConfig.nullCheck();
        return intlSlGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlSlGuideConfig mo225055clone() {
        IntlSlGuideConfig intlSlGuideConfig = new IntlSlGuideConfig();
        intlSlGuideConfig.intl_sl_card_guide_dlg_men = this.intl_sl_card_guide_dlg_men;
        intlSlGuideConfig.intl_sl_card_guide_dlg_women = this.intl_sl_card_guide_dlg_women;
        intlSlGuideConfig.intl_pop_0_20_men = this.intl_pop_0_20_men;
        intlSlGuideConfig.intl_pop_0_20_women = this.intl_pop_0_20_women;
        intlSlGuideConfig.intl_pop_0_30_men = this.intl_pop_0_30_men;
        intlSlGuideConfig.intl_pop_0_30_women = this.intl_pop_0_30_women;
        intlSlGuideConfig.intl_card_user_last_active_limit_time = this.intl_card_user_last_active_limit_time;
        return intlSlGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlSlGuideConfig)) {
            return false;
        }
        IntlSlGuideConfig intlSlGuideConfig = (IntlSlGuideConfig) obj;
        return this.intl_sl_card_guide_dlg_men == intlSlGuideConfig.intl_sl_card_guide_dlg_men && this.intl_sl_card_guide_dlg_women == intlSlGuideConfig.intl_sl_card_guide_dlg_women && this.intl_pop_0_20_men == intlSlGuideConfig.intl_pop_0_20_men && this.intl_pop_0_20_women == intlSlGuideConfig.intl_pop_0_20_women && this.intl_pop_0_30_men == intlSlGuideConfig.intl_pop_0_30_men && this.intl_pop_0_30_women == intlSlGuideConfig.intl_pop_0_30_women && this.intl_card_user_last_active_limit_time == intlSlGuideConfig.intl_card_user_last_active_limit_time;
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
        int iFloatToIntBits = (((((((((((((i * 41) + this.intl_sl_card_guide_dlg_men) * 41) + this.intl_sl_card_guide_dlg_women) * 41) + Float.floatToIntBits(this.intl_pop_0_20_men)) * 41) + Float.floatToIntBits(this.intl_pop_0_20_women)) * 41) + Float.floatToIntBits(this.intl_pop_0_30_men)) * 41) + Float.floatToIntBits(this.intl_pop_0_30_women)) * 41) + this.intl_card_user_last_active_limit_time;
        this.hashCode = iFloatToIntBits;
        return iFloatToIntBits;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
