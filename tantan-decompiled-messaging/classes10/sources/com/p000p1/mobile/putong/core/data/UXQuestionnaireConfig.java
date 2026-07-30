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
public class UXQuestionnaireConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "uxquestionnaireconfig";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int ux_questionnaire_card_interval_day;

    @ProtobufIndex(index = 4)
    public int ux_questionnaire_card_max_time_1;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public int ux_questionnaire_card_max_time_2;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int ux_questionnaire_card_register_day_1;

    @ProtobufIndex(index = 7)
    public int ux_questionnaire_card_register_day_2;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int ux_questionnaire_card_swipe_count_1;

    @ProtobufIndex(index = 6)
    public int ux_questionnaire_card_swipe_count_2;

    @ProtobufIndex(index = 1)
    public boolean ux_questionnaire_enable;

    @ProtobufIndex(index = 13)
    public int ux_questionnaire_last_msg_day;

    @ProtobufIndex(index = 14)
    public int ux_questionnaire_msg_detail_interval_day;

    @ProtobufIndex(index = 15)
    public int ux_questionnaire_msg_detail_max_time;

    @ProtobufIndex(index = 17)
    public int ux_questionnaire_msg_detail_mm_max;

    @ProtobufIndex(index = 16)
    public int ux_questionnaire_msg_detail_mm_min;

    @ProtobufIndex(index = 9)
    public int ux_questionnaire_msg_detail_register_day;

    @ProtobufIndex(index = 11)
    public int ux_questionnaire_msg_list_interval_day;

    @ProtobufIndex(index = 12)
    public int ux_questionnaire_msg_list_max_time;

    @ProtobufIndex(index = 8)
    public int ux_questionnaire_msg_list_register_day;
    public static ProtobufAdapter<UXQuestionnaireConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<UXQuestionnaireConfig>() { // from class: com.p1.mobile.putong.core.data.UXQuestionnaireConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UXQuestionnaireConfig uXQuestionnaireConfig) {
            int iB = CodedOutputByteBufferNano.b(1, uXQuestionnaireConfig.ux_questionnaire_enable) + CodedOutputByteBufferNano.h(2, uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1) + CodedOutputByteBufferNano.h(3, uXQuestionnaireConfig.ux_questionnaire_card_register_day_1) + CodedOutputByteBufferNano.h(4, uXQuestionnaireConfig.ux_questionnaire_card_max_time_1) + CodedOutputByteBufferNano.h(5, uXQuestionnaireConfig.ux_questionnaire_card_interval_day) + CodedOutputByteBufferNano.h(6, uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2) + CodedOutputByteBufferNano.h(7, uXQuestionnaireConfig.ux_questionnaire_card_register_day_2) + CodedOutputByteBufferNano.h(8, uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day) + CodedOutputByteBufferNano.h(9, uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day) + CodedOutputByteBufferNano.h(10, uXQuestionnaireConfig.ux_questionnaire_card_max_time_2) + CodedOutputByteBufferNano.h(11, uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day) + CodedOutputByteBufferNano.h(12, uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time) + CodedOutputByteBufferNano.h(13, uXQuestionnaireConfig.ux_questionnaire_last_msg_day) + CodedOutputByteBufferNano.h(14, uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day) + CodedOutputByteBufferNano.h(15, uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time) + CodedOutputByteBufferNano.h(16, uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min) + CodedOutputByteBufferNano.h(17, uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max);
            ((MessageNano) uXQuestionnaireConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UXQuestionnaireConfig m16076parse(nb5 nb5Var) throws IOException {
            UXQuestionnaireConfig uXQuestionnaireConfig = new UXQuestionnaireConfig();
            while (true) {
                switch (nb5Var.u()) {
                    case 8:
                        uXQuestionnaireConfig.ux_questionnaire_enable = nb5Var.g();
                        break;
                    case 16:
                        uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1 = nb5Var.j();
                        break;
                    case 24:
                        uXQuestionnaireConfig.ux_questionnaire_card_register_day_1 = nb5Var.j();
                        break;
                    case 32:
                        uXQuestionnaireConfig.ux_questionnaire_card_max_time_1 = nb5Var.j();
                        break;
                    case 40:
                        uXQuestionnaireConfig.ux_questionnaire_card_interval_day = nb5Var.j();
                        break;
                    case 48:
                        uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2 = nb5Var.j();
                        break;
                    case 56:
                        uXQuestionnaireConfig.ux_questionnaire_card_register_day_2 = nb5Var.j();
                        break;
                    case 64:
                        uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day = nb5Var.j();
                        break;
                    case 72:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day = nb5Var.j();
                        break;
                    case 80:
                        uXQuestionnaireConfig.ux_questionnaire_card_max_time_2 = nb5Var.j();
                        break;
                    case 88:
                        uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day = nb5Var.j();
                        break;
                    case 96:
                        uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time = nb5Var.j();
                        break;
                    case 104:
                        uXQuestionnaireConfig.ux_questionnaire_last_msg_day = nb5Var.j();
                        break;
                    case 112:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day = nb5Var.j();
                        break;
                    case 120:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time = nb5Var.j();
                        break;
                    case 128:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min = nb5Var.j();
                        break;
                    case 136:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max = nb5Var.j();
                        break;
                    default:
                        return uXQuestionnaireConfig;
                }
            }
        }

        public void serialize(UXQuestionnaireConfig uXQuestionnaireConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, uXQuestionnaireConfig.ux_questionnaire_enable);
            codedOutputByteBufferNano.G(2, uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1);
            codedOutputByteBufferNano.G(3, uXQuestionnaireConfig.ux_questionnaire_card_register_day_1);
            codedOutputByteBufferNano.G(4, uXQuestionnaireConfig.ux_questionnaire_card_max_time_1);
            codedOutputByteBufferNano.G(5, uXQuestionnaireConfig.ux_questionnaire_card_interval_day);
            codedOutputByteBufferNano.G(6, uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2);
            codedOutputByteBufferNano.G(7, uXQuestionnaireConfig.ux_questionnaire_card_register_day_2);
            codedOutputByteBufferNano.G(8, uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day);
            codedOutputByteBufferNano.G(9, uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day);
            codedOutputByteBufferNano.G(10, uXQuestionnaireConfig.ux_questionnaire_card_max_time_2);
            codedOutputByteBufferNano.G(11, uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day);
            codedOutputByteBufferNano.G(12, uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time);
            codedOutputByteBufferNano.G(13, uXQuestionnaireConfig.ux_questionnaire_last_msg_day);
            codedOutputByteBufferNano.G(14, uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day);
            codedOutputByteBufferNano.G(15, uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time);
            codedOutputByteBufferNano.G(16, uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min);
            codedOutputByteBufferNano.G(17, uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max);
        }
    };
    public static JsonAdapter<UXQuestionnaireConfig> JSON_ADAPTER = new ObjectJsonAdapter<UXQuestionnaireConfig>() { // from class: com.p1.mobile.putong.core.data.UXQuestionnaireConfig.2
        public Class getDataClass() {
            return UXQuestionnaireConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UXQuestionnaireConfig m16077newInstance() {
            return new UXQuestionnaireConfig();
        }

        public boolean parseField(UXQuestionnaireConfig uXQuestionnaireConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ux_questionnaire_msg_detail_max_time":
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_last_msg_day":
                    uXQuestionnaireConfig.ux_questionnaire_last_msg_day = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_msg_list_register_day":
                    uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_msg_list_interval_day":
                    uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_card_swipe_count_1":
                    uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1 = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_card_swipe_count_2":
                    uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2 = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_msg_detail_mm_max":
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_msg_detail_mm_min":
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_card_max_time_1":
                    uXQuestionnaireConfig.ux_questionnaire_card_max_time_1 = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_card_max_time_2":
                    uXQuestionnaireConfig.ux_questionnaire_card_max_time_2 = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_card_interval_day":
                    uXQuestionnaireConfig.ux_questionnaire_card_interval_day = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_msg_list_max_time":
                    uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_card_register_day_1":
                    uXQuestionnaireConfig.ux_questionnaire_card_register_day_1 = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_card_register_day_2":
                    uXQuestionnaireConfig.ux_questionnaire_card_register_day_2 = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_enable":
                    uXQuestionnaireConfig.ux_questionnaire_enable = jsonParser.getValueAsBoolean();
                    return true;
                case "ux_questionnaire_msg_detail_register_day":
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day = jsonParser.getValueAsInt();
                    return true;
                case "ux_questionnaire_msg_detail_interval_day":
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UXQuestionnaireConfig uXQuestionnaireConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "ux_questionnaire_msg_detail_max_time":
                case "ux_questionnaire_last_msg_day":
                case "ux_questionnaire_msg_list_register_day":
                case "ux_questionnaire_msg_list_interval_day":
                case "ux_questionnaire_card_swipe_count_1":
                case "ux_questionnaire_card_swipe_count_2":
                case "ux_questionnaire_msg_detail_mm_max":
                case "ux_questionnaire_msg_detail_mm_min":
                case "ux_questionnaire_card_max_time_1":
                case "ux_questionnaire_card_max_time_2":
                case "ux_questionnaire_card_interval_day":
                case "ux_questionnaire_msg_list_max_time":
                case "ux_questionnaire_card_register_day_1":
                case "ux_questionnaire_card_register_day_2":
                case "ux_questionnaire_enable":
                case "ux_questionnaire_msg_detail_register_day":
                case "ux_questionnaire_msg_detail_interval_day":
                    return true;
                default:
                    return super.parseFieldCheck(uXQuestionnaireConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(UXQuestionnaireConfig uXQuestionnaireConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("ux_questionnaire_enable", uXQuestionnaireConfig.ux_questionnaire_enable);
            jsonGenerator.writeNumberField("ux_questionnaire_card_swipe_count_1", uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1);
            jsonGenerator.writeNumberField("ux_questionnaire_card_register_day_1", uXQuestionnaireConfig.ux_questionnaire_card_register_day_1);
            jsonGenerator.writeNumberField("ux_questionnaire_card_max_time_1", uXQuestionnaireConfig.ux_questionnaire_card_max_time_1);
            jsonGenerator.writeNumberField("ux_questionnaire_card_interval_day", uXQuestionnaireConfig.ux_questionnaire_card_interval_day);
            jsonGenerator.writeNumberField("ux_questionnaire_card_swipe_count_2", uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2);
            jsonGenerator.writeNumberField("ux_questionnaire_card_register_day_2", uXQuestionnaireConfig.ux_questionnaire_card_register_day_2);
            jsonGenerator.writeNumberField("ux_questionnaire_card_max_time_2", uXQuestionnaireConfig.ux_questionnaire_card_max_time_2);
            jsonGenerator.writeNumberField("ux_questionnaire_msg_list_interval_day", uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day);
            jsonGenerator.writeNumberField("ux_questionnaire_msg_list_register_day", uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day);
            jsonGenerator.writeNumberField("ux_questionnaire_msg_list_max_time", uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time);
            jsonGenerator.writeNumberField("ux_questionnaire_last_msg_day", uXQuestionnaireConfig.ux_questionnaire_last_msg_day);
            jsonGenerator.writeNumberField("ux_questionnaire_msg_detail_interval_day", uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day);
            jsonGenerator.writeNumberField("ux_questionnaire_msg_detail_register_day", uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day);
            jsonGenerator.writeNumberField("ux_questionnaire_msg_detail_max_time", uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time);
            jsonGenerator.writeNumberField("ux_questionnaire_msg_detail_mm_min", uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min);
            jsonGenerator.writeNumberField("ux_questionnaire_msg_detail_mm_max", uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UXQuestionnaireConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UXQuestionnaireConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UXQuestionnaireConfig new_() {
        UXQuestionnaireConfig uXQuestionnaireConfig = new UXQuestionnaireConfig();
        uXQuestionnaireConfig.nullCheck();
        return uXQuestionnaireConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UXQuestionnaireConfig m16075clone() {
        UXQuestionnaireConfig uXQuestionnaireConfig = new UXQuestionnaireConfig();
        uXQuestionnaireConfig.ux_questionnaire_enable = this.ux_questionnaire_enable;
        uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1 = this.ux_questionnaire_card_swipe_count_1;
        uXQuestionnaireConfig.ux_questionnaire_card_register_day_1 = this.ux_questionnaire_card_register_day_1;
        uXQuestionnaireConfig.ux_questionnaire_card_max_time_1 = this.ux_questionnaire_card_max_time_1;
        uXQuestionnaireConfig.ux_questionnaire_card_interval_day = this.ux_questionnaire_card_interval_day;
        uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2 = this.ux_questionnaire_card_swipe_count_2;
        uXQuestionnaireConfig.ux_questionnaire_card_register_day_2 = this.ux_questionnaire_card_register_day_2;
        uXQuestionnaireConfig.ux_questionnaire_card_max_time_2 = this.ux_questionnaire_card_max_time_2;
        uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day = this.ux_questionnaire_msg_list_interval_day;
        uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day = this.ux_questionnaire_msg_list_register_day;
        uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time = this.ux_questionnaire_msg_list_max_time;
        uXQuestionnaireConfig.ux_questionnaire_last_msg_day = this.ux_questionnaire_last_msg_day;
        uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day = this.ux_questionnaire_msg_detail_interval_day;
        uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day = this.ux_questionnaire_msg_detail_register_day;
        uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time = this.ux_questionnaire_msg_detail_max_time;
        uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min = this.ux_questionnaire_msg_detail_mm_min;
        uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max = this.ux_questionnaire_msg_detail_mm_max;
        return uXQuestionnaireConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UXQuestionnaireConfig)) {
            return false;
        }
        UXQuestionnaireConfig uXQuestionnaireConfig = (UXQuestionnaireConfig) obj;
        return this.ux_questionnaire_enable == uXQuestionnaireConfig.ux_questionnaire_enable && this.ux_questionnaire_card_swipe_count_1 == uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1 && this.ux_questionnaire_card_register_day_1 == uXQuestionnaireConfig.ux_questionnaire_card_register_day_1 && this.ux_questionnaire_card_max_time_1 == uXQuestionnaireConfig.ux_questionnaire_card_max_time_1 && this.ux_questionnaire_card_interval_day == uXQuestionnaireConfig.ux_questionnaire_card_interval_day && this.ux_questionnaire_card_swipe_count_2 == uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2 && this.ux_questionnaire_card_register_day_2 == uXQuestionnaireConfig.ux_questionnaire_card_register_day_2 && this.ux_questionnaire_card_max_time_2 == uXQuestionnaireConfig.ux_questionnaire_card_max_time_2 && this.ux_questionnaire_msg_list_interval_day == uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day && this.ux_questionnaire_msg_list_register_day == uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day && this.ux_questionnaire_msg_list_max_time == uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time && this.ux_questionnaire_last_msg_day == uXQuestionnaireConfig.ux_questionnaire_last_msg_day && this.ux_questionnaire_msg_detail_interval_day == uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day && this.ux_questionnaire_msg_detail_register_day == uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day && this.ux_questionnaire_msg_detail_max_time == uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time && this.ux_questionnaire_msg_detail_mm_min == uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min && this.ux_questionnaire_msg_detail_mm_max == uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((((((((((((((((((((((i * 41) + (this.ux_questionnaire_enable ? 1231 : 1237)) * 41) + this.ux_questionnaire_card_swipe_count_1) * 41) + this.ux_questionnaire_card_register_day_1) * 41) + this.ux_questionnaire_card_max_time_1) * 41) + this.ux_questionnaire_card_interval_day) * 41) + this.ux_questionnaire_card_swipe_count_2) * 41) + this.ux_questionnaire_card_register_day_2) * 41) + this.ux_questionnaire_card_max_time_2) * 41) + this.ux_questionnaire_msg_list_interval_day) * 41) + this.ux_questionnaire_msg_list_register_day) * 41) + this.ux_questionnaire_msg_list_max_time) * 41) + this.ux_questionnaire_last_msg_day) * 41) + this.ux_questionnaire_msg_detail_interval_day) * 41) + this.ux_questionnaire_msg_detail_register_day) * 41) + this.ux_questionnaire_msg_detail_max_time) * 41) + this.ux_questionnaire_msg_detail_mm_min) * 41) + this.ux_questionnaire_msg_detail_mm_max;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
