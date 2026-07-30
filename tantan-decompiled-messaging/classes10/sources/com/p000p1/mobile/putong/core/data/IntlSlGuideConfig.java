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
public class IntlSlGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlslguideconfig";

    @ProtobufIndex(index = 7)
    public int intl_card_user_last_active_limit_time;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public float intl_pop_0_20_men;

    @ProtobufIndex(index = 4)
    public float intl_pop_0_20_women;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public float intl_pop_0_30_men;

    @ProtobufIndex(index = 6)
    public float intl_pop_0_30_women;

    @ProtobufIndex(index = 1)
    public int intl_sl_card_guide_dlg_men;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int intl_sl_card_guide_dlg_women;
    public static ProtobufAdapter<IntlSlGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlSlGuideConfig>() { // from class: com.p1.mobile.putong.core.data.IntlSlGuideConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlSlGuideConfig intlSlGuideConfig) {
            int iH = CodedOutputByteBufferNano.h(1, intlSlGuideConfig.intl_sl_card_guide_dlg_men) + CodedOutputByteBufferNano.h(2, intlSlGuideConfig.intl_sl_card_guide_dlg_women) + CodedOutputByteBufferNano.f(3, intlSlGuideConfig.intl_pop_0_20_men) + CodedOutputByteBufferNano.f(4, intlSlGuideConfig.intl_pop_0_20_women) + CodedOutputByteBufferNano.f(5, intlSlGuideConfig.intl_pop_0_30_men) + CodedOutputByteBufferNano.f(6, intlSlGuideConfig.intl_pop_0_30_women) + CodedOutputByteBufferNano.h(7, intlSlGuideConfig.intl_card_user_last_active_limit_time);
            ((MessageNano) intlSlGuideConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlSlGuideConfig m13679parse(nb5 nb5Var) throws IOException {
            IntlSlGuideConfig intlSlGuideConfig = new IntlSlGuideConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    intlSlGuideConfig.intl_sl_card_guide_dlg_men = nb5Var.j();
                } else if (iU == 16) {
                    intlSlGuideConfig.intl_sl_card_guide_dlg_women = nb5Var.j();
                } else if (iU == 29) {
                    intlSlGuideConfig.intl_pop_0_20_men = nb5Var.i();
                } else if (iU == 37) {
                    intlSlGuideConfig.intl_pop_0_20_women = nb5Var.i();
                } else if (iU == 45) {
                    intlSlGuideConfig.intl_pop_0_30_men = nb5Var.i();
                } else if (iU == 53) {
                    intlSlGuideConfig.intl_pop_0_30_women = nb5Var.i();
                } else {
                    if (iU != 56) {
                        return intlSlGuideConfig;
                    }
                    intlSlGuideConfig.intl_card_user_last_active_limit_time = nb5Var.j();
                }
            }
        }

        public void serialize(IntlSlGuideConfig intlSlGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlSlGuideConfig.intl_sl_card_guide_dlg_men);
            codedOutputByteBufferNano.G(2, intlSlGuideConfig.intl_sl_card_guide_dlg_women);
            codedOutputByteBufferNano.E(3, intlSlGuideConfig.intl_pop_0_20_men);
            codedOutputByteBufferNano.E(4, intlSlGuideConfig.intl_pop_0_20_women);
            codedOutputByteBufferNano.E(5, intlSlGuideConfig.intl_pop_0_30_men);
            codedOutputByteBufferNano.E(6, intlSlGuideConfig.intl_pop_0_30_women);
            codedOutputByteBufferNano.G(7, intlSlGuideConfig.intl_card_user_last_active_limit_time);
        }
    };
    public static JsonAdapter<IntlSlGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlSlGuideConfig>() { // from class: com.p1.mobile.putong.core.data.IntlSlGuideConfig.2
        public Class getDataClass() {
            return IntlSlGuideConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlSlGuideConfig m13680newInstance() {
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

        public void serializeFields(IntlSlGuideConfig intlSlGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("intl_sl_card_guide_dlg_men", intlSlGuideConfig.intl_sl_card_guide_dlg_men);
            jsonGenerator.writeNumberField("intl_sl_card_guide_dlg_women", intlSlGuideConfig.intl_sl_card_guide_dlg_women);
            jsonGenerator.writeNumberField("intl_pop_0_20_men", intlSlGuideConfig.intl_pop_0_20_men);
            jsonGenerator.writeNumberField("intl_pop_0_20_women", intlSlGuideConfig.intl_pop_0_20_women);
            jsonGenerator.writeNumberField("intl_pop_0_30_men", intlSlGuideConfig.intl_pop_0_30_men);
            jsonGenerator.writeNumberField("intl_pop_0_30_women", intlSlGuideConfig.intl_pop_0_30_women);
            jsonGenerator.writeNumberField("intl_card_user_last_active_limit_time", intlSlGuideConfig.intl_card_user_last_active_limit_time);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlSlGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlSlGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlSlGuideConfig new_() {
        IntlSlGuideConfig intlSlGuideConfig = new IntlSlGuideConfig();
        intlSlGuideConfig.nullCheck();
        return intlSlGuideConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlSlGuideConfig m13678clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iFloatToIntBits = (((((((((((((i * 41) + this.intl_sl_card_guide_dlg_men) * 41) + this.intl_sl_card_guide_dlg_women) * 41) + Float.floatToIntBits(this.intl_pop_0_20_men)) * 41) + Float.floatToIntBits(this.intl_pop_0_20_women)) * 41) + Float.floatToIntBits(this.intl_pop_0_30_men)) * 41) + Float.floatToIntBits(this.intl_pop_0_30_women)) * 41) + this.intl_card_user_last_active_limit_time;
        ((ValueObject) this).hashCode = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
