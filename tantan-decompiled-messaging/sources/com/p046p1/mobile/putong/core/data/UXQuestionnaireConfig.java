package com.p046p1.mobile.putong.core.data;

import com.alibaba.fastjson.asm.Opcodes;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class UXQuestionnaireConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "uxquestionnaireconfig";

    @ProtobufIndex(index = 5)
    public int ux_questionnaire_card_interval_day;

    @ProtobufIndex(index = 4)
    public int ux_questionnaire_card_max_time_1;

    @ProtobufIndex(index = 10)
    public int ux_questionnaire_card_max_time_2;

    @ProtobufIndex(index = 3)
    public int ux_questionnaire_card_register_day_1;

    @ProtobufIndex(index = 7)
    public int ux_questionnaire_card_register_day_2;

    @ProtobufIndex(index = 2)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UXQuestionnaireConfig uXQuestionnaireConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, uXQuestionnaireConfig.ux_questionnaire_enable) + CodedOutputByteBufferNano.m17226h(2, uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1) + CodedOutputByteBufferNano.m17226h(3, uXQuestionnaireConfig.ux_questionnaire_card_register_day_1) + CodedOutputByteBufferNano.m17226h(4, uXQuestionnaireConfig.ux_questionnaire_card_max_time_1) + CodedOutputByteBufferNano.m17226h(5, uXQuestionnaireConfig.ux_questionnaire_card_interval_day) + CodedOutputByteBufferNano.m17226h(6, uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2) + CodedOutputByteBufferNano.m17226h(7, uXQuestionnaireConfig.ux_questionnaire_card_register_day_2) + CodedOutputByteBufferNano.m17226h(8, uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day) + CodedOutputByteBufferNano.m17226h(9, uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day) + CodedOutputByteBufferNano.m17226h(10, uXQuestionnaireConfig.ux_questionnaire_card_max_time_2) + CodedOutputByteBufferNano.m17226h(11, uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day) + CodedOutputByteBufferNano.m17226h(12, uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time) + CodedOutputByteBufferNano.m17226h(13, uXQuestionnaireConfig.ux_questionnaire_last_msg_day) + CodedOutputByteBufferNano.m17226h(14, uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day) + CodedOutputByteBufferNano.m17226h(15, uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time) + CodedOutputByteBufferNano.m17226h(16, uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min) + CodedOutputByteBufferNano.m17226h(17, uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max);
            uXQuestionnaireConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UXQuestionnaireConfig parse(nb5 nb5Var) throws IOException {
            UXQuestionnaireConfig uXQuestionnaireConfig = new UXQuestionnaireConfig();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 8:
                        uXQuestionnaireConfig.ux_questionnaire_enable = nb5Var.m158738g();
                        break;
                    case 16:
                        uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1 = nb5Var.m158741j();
                        break;
                    case 24:
                        uXQuestionnaireConfig.ux_questionnaire_card_register_day_1 = nb5Var.m158741j();
                        break;
                    case 32:
                        uXQuestionnaireConfig.ux_questionnaire_card_max_time_1 = nb5Var.m158741j();
                        break;
                    case 40:
                        uXQuestionnaireConfig.ux_questionnaire_card_interval_day = nb5Var.m158741j();
                        break;
                    case 48:
                        uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2 = nb5Var.m158741j();
                        break;
                    case 56:
                        uXQuestionnaireConfig.ux_questionnaire_card_register_day_2 = nb5Var.m158741j();
                        break;
                    case 64:
                        uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day = nb5Var.m158741j();
                        break;
                    case 72:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day = nb5Var.m158741j();
                        break;
                    case 80:
                        uXQuestionnaireConfig.ux_questionnaire_card_max_time_2 = nb5Var.m158741j();
                        break;
                    case 88:
                        uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day = nb5Var.m158741j();
                        break;
                    case Opcodes.IADD /* 96 */:
                        uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time = nb5Var.m158741j();
                        break;
                    case 104:
                        uXQuestionnaireConfig.ux_questionnaire_last_msg_day = nb5Var.m158741j();
                        break;
                    case 112:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day = nb5Var.m158741j();
                        break;
                    case 120:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time = nb5Var.m158741j();
                        break;
                    case 128:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min = nb5Var.m158741j();
                        break;
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                        uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max = nb5Var.m158741j();
                        break;
                    default:
                        return uXQuestionnaireConfig;
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UXQuestionnaireConfig uXQuestionnaireConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, uXQuestionnaireConfig.ux_questionnaire_enable);
            codedOutputByteBufferNano.m17250G(2, uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1);
            codedOutputByteBufferNano.m17250G(3, uXQuestionnaireConfig.ux_questionnaire_card_register_day_1);
            codedOutputByteBufferNano.m17250G(4, uXQuestionnaireConfig.ux_questionnaire_card_max_time_1);
            codedOutputByteBufferNano.m17250G(5, uXQuestionnaireConfig.ux_questionnaire_card_interval_day);
            codedOutputByteBufferNano.m17250G(6, uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2);
            codedOutputByteBufferNano.m17250G(7, uXQuestionnaireConfig.ux_questionnaire_card_register_day_2);
            codedOutputByteBufferNano.m17250G(8, uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day);
            codedOutputByteBufferNano.m17250G(9, uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day);
            codedOutputByteBufferNano.m17250G(10, uXQuestionnaireConfig.ux_questionnaire_card_max_time_2);
            codedOutputByteBufferNano.m17250G(11, uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day);
            codedOutputByteBufferNano.m17250G(12, uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time);
            codedOutputByteBufferNano.m17250G(13, uXQuestionnaireConfig.ux_questionnaire_last_msg_day);
            codedOutputByteBufferNano.m17250G(14, uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day);
            codedOutputByteBufferNano.m17250G(15, uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time);
            codedOutputByteBufferNano.m17250G(16, uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min);
            codedOutputByteBufferNano.m17250G(17, uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max);
        }
    };
    public static JsonAdapter<UXQuestionnaireConfig> JSON_ADAPTER = new ObjectJsonAdapter<UXQuestionnaireConfig>() { // from class: com.p1.mobile.putong.core.data.UXQuestionnaireConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UXQuestionnaireConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UXQuestionnaireConfig newInstance() {
            return new UXQuestionnaireConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(UXQuestionnaireConfig uXQuestionnaireConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2012758784:
                    if (str.equals("ux_questionnaire_msg_detail_max_time")) {
                        b = 0;
                    }
                    break;
                case -1825772179:
                    if (str.equals("ux_questionnaire_last_msg_day")) {
                        b = 1;
                    }
                    break;
                case -1821582453:
                    if (str.equals("ux_questionnaire_msg_list_register_day")) {
                        b = 2;
                    }
                    break;
                case -1683705683:
                    if (str.equals("ux_questionnaire_msg_list_interval_day")) {
                        b = 3;
                    }
                    break;
                case -638648251:
                    if (str.equals("ux_questionnaire_card_swipe_count_1")) {
                        b = 4;
                    }
                    break;
                case -638648250:
                    if (str.equals("ux_questionnaire_card_swipe_count_2")) {
                        b = 5;
                    }
                    break;
                case -166045571:
                    if (str.equals("ux_questionnaire_msg_detail_mm_max")) {
                        b = 6;
                    }
                    break;
                case -166045333:
                    if (str.equals("ux_questionnaire_msg_detail_mm_min")) {
                        b = 7;
                    }
                    break;
                case -70521903:
                    if (str.equals("ux_questionnaire_card_max_time_1")) {
                        b = 8;
                    }
                    break;
                case -70521902:
                    if (str.equals("ux_questionnaire_card_max_time_2")) {
                        b = 9;
                    }
                    break;
                case 497254585:
                    if (str.equals("ux_questionnaire_card_interval_day")) {
                        b = 10;
                    }
                    break;
                case 781362643:
                    if (str.equals("ux_questionnaire_msg_list_max_time")) {
                        b = 11;
                    }
                    break;
                case 1764699529:
                    if (str.equals("ux_questionnaire_card_register_day_1")) {
                        b = 12;
                    }
                    break;
                case 1764699530:
                    if (str.equals("ux_questionnaire_card_register_day_2")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1766369211:
                    if (str.equals("ux_questionnaire_enable")) {
                        b = 14;
                    }
                    break;
                case 1895339064:
                    if (str.equals("ux_questionnaire_msg_detail_register_day")) {
                        b = 15;
                    }
                    break;
                case 2033215834:
                    if (str.equals("ux_questionnaire_msg_detail_interval_day")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_max_time = jsonParser.getValueAsInt();
                    return true;
                case 1:
                    uXQuestionnaireConfig.ux_questionnaire_last_msg_day = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    uXQuestionnaireConfig.ux_questionnaire_msg_list_register_day = jsonParser.getValueAsInt();
                    return true;
                case 3:
                    uXQuestionnaireConfig.ux_questionnaire_msg_list_interval_day = jsonParser.getValueAsInt();
                    return true;
                case 4:
                    uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_1 = jsonParser.getValueAsInt();
                    return true;
                case 5:
                    uXQuestionnaireConfig.ux_questionnaire_card_swipe_count_2 = jsonParser.getValueAsInt();
                    return true;
                case 6:
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_max = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_mm_min = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    uXQuestionnaireConfig.ux_questionnaire_card_max_time_1 = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    uXQuestionnaireConfig.ux_questionnaire_card_max_time_2 = jsonParser.getValueAsInt();
                    return true;
                case 10:
                    uXQuestionnaireConfig.ux_questionnaire_card_interval_day = jsonParser.getValueAsInt();
                    return true;
                case 11:
                    uXQuestionnaireConfig.ux_questionnaire_msg_list_max_time = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    uXQuestionnaireConfig.ux_questionnaire_card_register_day_1 = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    uXQuestionnaireConfig.ux_questionnaire_card_register_day_2 = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    uXQuestionnaireConfig.ux_questionnaire_enable = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_register_day = jsonParser.getValueAsInt();
                    return true;
                case 16:
                    uXQuestionnaireConfig.ux_questionnaire_msg_detail_interval_day = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(UXQuestionnaireConfig uXQuestionnaireConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2012758784:
                    if (str.equals("ux_questionnaire_msg_detail_max_time")) {
                        b = 0;
                    }
                    break;
                case -1825772179:
                    if (str.equals("ux_questionnaire_last_msg_day")) {
                        b = 1;
                    }
                    break;
                case -1821582453:
                    if (str.equals("ux_questionnaire_msg_list_register_day")) {
                        b = 2;
                    }
                    break;
                case -1683705683:
                    if (str.equals("ux_questionnaire_msg_list_interval_day")) {
                        b = 3;
                    }
                    break;
                case -638648251:
                    if (str.equals("ux_questionnaire_card_swipe_count_1")) {
                        b = 4;
                    }
                    break;
                case -638648250:
                    if (str.equals("ux_questionnaire_card_swipe_count_2")) {
                        b = 5;
                    }
                    break;
                case -166045571:
                    if (str.equals("ux_questionnaire_msg_detail_mm_max")) {
                        b = 6;
                    }
                    break;
                case -166045333:
                    if (str.equals("ux_questionnaire_msg_detail_mm_min")) {
                        b = 7;
                    }
                    break;
                case -70521903:
                    if (str.equals("ux_questionnaire_card_max_time_1")) {
                        b = 8;
                    }
                    break;
                case -70521902:
                    if (str.equals("ux_questionnaire_card_max_time_2")) {
                        b = 9;
                    }
                    break;
                case 497254585:
                    if (str.equals("ux_questionnaire_card_interval_day")) {
                        b = 10;
                    }
                    break;
                case 781362643:
                    if (str.equals("ux_questionnaire_msg_list_max_time")) {
                        b = 11;
                    }
                    break;
                case 1764699529:
                    if (str.equals("ux_questionnaire_card_register_day_1")) {
                        b = 12;
                    }
                    break;
                case 1764699530:
                    if (str.equals("ux_questionnaire_card_register_day_2")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1766369211:
                    if (str.equals("ux_questionnaire_enable")) {
                        b = 14;
                    }
                    break;
                case 1895339064:
                    if (str.equals("ux_questionnaire_msg_detail_register_day")) {
                        b = 15;
                    }
                    break;
                case 2033215834:
                    if (str.equals("ux_questionnaire_msg_detail_interval_day")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return super.parseFieldCheck(uXQuestionnaireConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UXQuestionnaireConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UXQuestionnaireConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UXQuestionnaireConfig new_() {
        UXQuestionnaireConfig uXQuestionnaireConfig = new UXQuestionnaireConfig();
        uXQuestionnaireConfig.nullCheck();
        return uXQuestionnaireConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UXQuestionnaireConfig mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((((((((((((((((((((((i * 41) + (this.ux_questionnaire_enable ? 1231 : 1237)) * 41) + this.ux_questionnaire_card_swipe_count_1) * 41) + this.ux_questionnaire_card_register_day_1) * 41) + this.ux_questionnaire_card_max_time_1) * 41) + this.ux_questionnaire_card_interval_day) * 41) + this.ux_questionnaire_card_swipe_count_2) * 41) + this.ux_questionnaire_card_register_day_2) * 41) + this.ux_questionnaire_card_max_time_2) * 41) + this.ux_questionnaire_msg_list_interval_day) * 41) + this.ux_questionnaire_msg_list_register_day) * 41) + this.ux_questionnaire_msg_list_max_time) * 41) + this.ux_questionnaire_last_msg_day) * 41) + this.ux_questionnaire_msg_detail_interval_day) * 41) + this.ux_questionnaire_msg_detail_register_day) * 41) + this.ux_questionnaire_msg_detail_max_time) * 41) + this.ux_questionnaire_msg_detail_mm_min) * 41) + this.ux_questionnaire_msg_detail_mm_max;
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
