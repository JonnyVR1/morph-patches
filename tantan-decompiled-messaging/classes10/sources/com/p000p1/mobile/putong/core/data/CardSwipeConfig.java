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
public class CardSwipeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardswipeconfig";

    @ProtobufIndex(index = 39)
    public int config_version;

    @ProtobufIndex(index = 33)
    public boolean could_double_click;

    @ProtobufIndex(index = 30)
    public double female_swipe_auto_factor;

    @ProtobufIndex(index = 32)
    public double female_swipe_auto_rotate;

    @ProtobufIndex(index = 28)
    public double female_swipe_auto_width;

    @ProtobufIndex(index = 29)
    public double male_swipe_auto_factor;

    @ProtobufIndex(index = 31)
    public double male_swipe_auto_rotate;

    @ProtobufIndex(index = 27)
    public double male_swipe_auto_width;

    @ProtobufIndex(index = 43)
    public boolean scale_alpha_opt;

    @ProtobufIndex(index = 44)
    public double scale_alpha_speed;

    @ProtobufIndex(index = 40)
    public boolean scale_opt;

    @ProtobufIndex(index = 41)
    public long scale_opt_during;

    @ProtobufIndex(index = 42)
    public boolean scale_use_opt_during;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public long swipe_auto_female_during;

    @ProtobufIndex(index = 4)
    public long swipe_auto_male_during;

    @ProtobufIndex(index = 15)
    public long swipe_back_female_during;

    @ProtobufIndex(index = 6)
    public long swipe_back_male_during;

    @ProtobufIndex(index = 35)
    public int swipe_fix_speed;

    @ProtobufIndex(index = 24)
    public int swipe_item_diff_female;

    @ProtobufIndex(index = 21)
    public int swipe_item_diff_male;

    @ProtobufIndex(index = 12)
    public long swipe_left_female_during;

    @ProtobufIndex(index = 1)
    public long swipe_left_male_during;

    @ProtobufIndex(index = 26)
    public int swipe_mine_value_female;

    @ProtobufIndex(index = 23)
    public int swipe_mine_value_male;

    @ProtobufIndex(index = 25)
    public int swipe_out_value_female;

    @ProtobufIndex(index = 22)
    public int swipe_out_value_male;

    @ProtobufIndex(index = 38)
    public int swipe_progress_value;

    @ProtobufIndex(index = 16)
    public long swipe_reset_female_during;

    @ProtobufIndex(index = 7)
    public long swipe_reset_male_during;

    @ProtobufIndex(index = 13)
    public long swipe_right_female_during;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long swipe_right_male_during;

    @ProtobufIndex(index = 17)
    public double swipe_rotation_female;

    @ProtobufIndex(index = 8)
    public double swipe_rotation_male;

    @ProtobufIndex(index = 36)
    public double swipe_scale;

    @ProtobufIndex(index = 37)
    public double swipe_scale_start_alpha;

    @ProtobufIndex(index = 20)
    public double swipe_speed_check_female;

    @ProtobufIndex(index = 11)
    public double swipe_speed_check_male;

    @ProtobufIndex(index = 19)
    public double swipe_speed_factor_female;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public double swipe_speed_factor_male;

    @ProtobufIndex(index = 18)
    public long swipe_trans_y_female;

    @ProtobufIndex(index = 9)
    public long swipe_trans_y_male;

    @ProtobufIndex(index = 34)
    public double swipe_type_factor;

    @ProtobufIndex(index = 14)
    public long swipe_up_female_during;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long swipe_up_male_during;
    public static ProtobufAdapter<CardSwipeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardSwipeConfig>() { // from class: com.p1.mobile.putong.core.data.CardSwipeConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardSwipeConfig cardSwipeConfig) {
            int iJ = CodedOutputByteBufferNano.j(1, cardSwipeConfig.swipe_left_male_during) + CodedOutputByteBufferNano.j(2, cardSwipeConfig.swipe_right_male_during) + CodedOutputByteBufferNano.j(3, cardSwipeConfig.swipe_up_male_during) + CodedOutputByteBufferNano.j(4, cardSwipeConfig.swipe_auto_male_during) + CodedOutputByteBufferNano.j(5, cardSwipeConfig.swipe_auto_female_during) + CodedOutputByteBufferNano.j(6, cardSwipeConfig.swipe_back_male_during) + CodedOutputByteBufferNano.j(7, cardSwipeConfig.swipe_reset_male_during) + CodedOutputByteBufferNano.d(8, cardSwipeConfig.swipe_rotation_male) + CodedOutputByteBufferNano.j(9, cardSwipeConfig.swipe_trans_y_male) + CodedOutputByteBufferNano.d(10, cardSwipeConfig.swipe_speed_factor_male) + CodedOutputByteBufferNano.d(11, cardSwipeConfig.swipe_speed_check_male) + CodedOutputByteBufferNano.j(12, cardSwipeConfig.swipe_left_female_during) + CodedOutputByteBufferNano.j(13, cardSwipeConfig.swipe_right_female_during) + CodedOutputByteBufferNano.j(14, cardSwipeConfig.swipe_up_female_during) + CodedOutputByteBufferNano.j(15, cardSwipeConfig.swipe_back_female_during) + CodedOutputByteBufferNano.j(16, cardSwipeConfig.swipe_reset_female_during) + CodedOutputByteBufferNano.d(17, cardSwipeConfig.swipe_rotation_female) + CodedOutputByteBufferNano.j(18, cardSwipeConfig.swipe_trans_y_female) + CodedOutputByteBufferNano.d(19, cardSwipeConfig.swipe_speed_factor_female) + CodedOutputByteBufferNano.d(20, cardSwipeConfig.swipe_speed_check_female) + CodedOutputByteBufferNano.h(21, cardSwipeConfig.swipe_item_diff_male) + CodedOutputByteBufferNano.h(22, cardSwipeConfig.swipe_out_value_male) + CodedOutputByteBufferNano.h(23, cardSwipeConfig.swipe_mine_value_male) + CodedOutputByteBufferNano.h(24, cardSwipeConfig.swipe_item_diff_female) + CodedOutputByteBufferNano.h(25, cardSwipeConfig.swipe_out_value_female) + CodedOutputByteBufferNano.h(26, cardSwipeConfig.swipe_mine_value_female) + CodedOutputByteBufferNano.d(27, cardSwipeConfig.male_swipe_auto_width) + CodedOutputByteBufferNano.d(28, cardSwipeConfig.female_swipe_auto_width) + CodedOutputByteBufferNano.d(29, cardSwipeConfig.male_swipe_auto_factor) + CodedOutputByteBufferNano.d(30, cardSwipeConfig.female_swipe_auto_factor) + CodedOutputByteBufferNano.d(31, cardSwipeConfig.male_swipe_auto_rotate) + CodedOutputByteBufferNano.d(32, cardSwipeConfig.female_swipe_auto_rotate) + CodedOutputByteBufferNano.b(33, cardSwipeConfig.could_double_click) + CodedOutputByteBufferNano.d(34, cardSwipeConfig.swipe_type_factor) + CodedOutputByteBufferNano.h(35, cardSwipeConfig.swipe_fix_speed) + CodedOutputByteBufferNano.d(36, cardSwipeConfig.swipe_scale) + CodedOutputByteBufferNano.d(37, cardSwipeConfig.swipe_scale_start_alpha) + CodedOutputByteBufferNano.h(38, cardSwipeConfig.swipe_progress_value) + CodedOutputByteBufferNano.h(39, cardSwipeConfig.config_version) + CodedOutputByteBufferNano.b(40, cardSwipeConfig.scale_opt) + CodedOutputByteBufferNano.j(41, cardSwipeConfig.scale_opt_during) + CodedOutputByteBufferNano.b(42, cardSwipeConfig.scale_use_opt_during) + CodedOutputByteBufferNano.b(43, cardSwipeConfig.scale_alpha_opt) + CodedOutputByteBufferNano.d(44, cardSwipeConfig.scale_alpha_speed);
            ((MessageNano) cardSwipeConfig).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardSwipeConfig m11919parse(nb5 nb5Var) throws IOException {
            CardSwipeConfig cardSwipeConfig = new CardSwipeConfig();
            while (true) {
                switch (nb5Var.u()) {
                    case 8:
                        cardSwipeConfig.swipe_left_male_during = nb5Var.k();
                        break;
                    case 16:
                        cardSwipeConfig.swipe_right_male_during = nb5Var.k();
                        break;
                    case 24:
                        cardSwipeConfig.swipe_up_male_during = nb5Var.k();
                        break;
                    case 32:
                        cardSwipeConfig.swipe_auto_male_during = nb5Var.k();
                        break;
                    case 40:
                        cardSwipeConfig.swipe_auto_female_during = nb5Var.k();
                        break;
                    case 48:
                        cardSwipeConfig.swipe_back_male_during = nb5Var.k();
                        break;
                    case 56:
                        cardSwipeConfig.swipe_reset_male_during = nb5Var.k();
                        break;
                    case 65:
                        cardSwipeConfig.swipe_rotation_male = nb5Var.h();
                        break;
                    case 72:
                        cardSwipeConfig.swipe_trans_y_male = nb5Var.k();
                        break;
                    case 81:
                        cardSwipeConfig.swipe_speed_factor_male = nb5Var.h();
                        break;
                    case 89:
                        cardSwipeConfig.swipe_speed_check_male = nb5Var.h();
                        break;
                    case 96:
                        cardSwipeConfig.swipe_left_female_during = nb5Var.k();
                        break;
                    case 104:
                        cardSwipeConfig.swipe_right_female_during = nb5Var.k();
                        break;
                    case 112:
                        cardSwipeConfig.swipe_up_female_during = nb5Var.k();
                        break;
                    case 120:
                        cardSwipeConfig.swipe_back_female_during = nb5Var.k();
                        break;
                    case 128:
                        cardSwipeConfig.swipe_reset_female_during = nb5Var.k();
                        break;
                    case 137:
                        cardSwipeConfig.swipe_rotation_female = nb5Var.h();
                        break;
                    case 144:
                        cardSwipeConfig.swipe_trans_y_female = nb5Var.k();
                        break;
                    case 153:
                        cardSwipeConfig.swipe_speed_factor_female = nb5Var.h();
                        break;
                    case 161:
                        cardSwipeConfig.swipe_speed_check_female = nb5Var.h();
                        break;
                    case 168:
                        cardSwipeConfig.swipe_item_diff_male = nb5Var.j();
                        break;
                    case 176:
                        cardSwipeConfig.swipe_out_value_male = nb5Var.j();
                        break;
                    case 184:
                        cardSwipeConfig.swipe_mine_value_male = nb5Var.j();
                        break;
                    case 192:
                        cardSwipeConfig.swipe_item_diff_female = nb5Var.j();
                        break;
                    case 200:
                        cardSwipeConfig.swipe_out_value_female = nb5Var.j();
                        break;
                    case 208:
                        cardSwipeConfig.swipe_mine_value_female = nb5Var.j();
                        break;
                    case 217:
                        cardSwipeConfig.male_swipe_auto_width = nb5Var.h();
                        break;
                    case 225:
                        cardSwipeConfig.female_swipe_auto_width = nb5Var.h();
                        break;
                    case 233:
                        cardSwipeConfig.male_swipe_auto_factor = nb5Var.h();
                        break;
                    case 241:
                        cardSwipeConfig.female_swipe_auto_factor = nb5Var.h();
                        break;
                    case 249:
                        cardSwipeConfig.male_swipe_auto_rotate = nb5Var.h();
                        break;
                    case 257:
                        cardSwipeConfig.female_swipe_auto_rotate = nb5Var.h();
                        break;
                    case 264:
                        cardSwipeConfig.could_double_click = nb5Var.g();
                        break;
                    case 273:
                        cardSwipeConfig.swipe_type_factor = nb5Var.h();
                        break;
                    case 280:
                        cardSwipeConfig.swipe_fix_speed = nb5Var.j();
                        break;
                    case 289:
                        cardSwipeConfig.swipe_scale = nb5Var.h();
                        break;
                    case 297:
                        cardSwipeConfig.swipe_scale_start_alpha = nb5Var.h();
                        break;
                    case 304:
                        cardSwipeConfig.swipe_progress_value = nb5Var.j();
                        break;
                    case 312:
                        cardSwipeConfig.config_version = nb5Var.j();
                        break;
                    case 320:
                        cardSwipeConfig.scale_opt = nb5Var.g();
                        break;
                    case 328:
                        cardSwipeConfig.scale_opt_during = nb5Var.k();
                        break;
                    case 336:
                        cardSwipeConfig.scale_use_opt_during = nb5Var.g();
                        break;
                    case 344:
                        cardSwipeConfig.scale_alpha_opt = nb5Var.g();
                        break;
                    case 353:
                        cardSwipeConfig.scale_alpha_speed = nb5Var.h();
                        break;
                    default:
                        return cardSwipeConfig;
                }
            }
        }

        public void serialize(CardSwipeConfig cardSwipeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, cardSwipeConfig.swipe_left_male_during);
            codedOutputByteBufferNano.I(2, cardSwipeConfig.swipe_right_male_during);
            codedOutputByteBufferNano.I(3, cardSwipeConfig.swipe_up_male_during);
            codedOutputByteBufferNano.I(4, cardSwipeConfig.swipe_auto_male_during);
            codedOutputByteBufferNano.I(5, cardSwipeConfig.swipe_auto_female_during);
            codedOutputByteBufferNano.I(6, cardSwipeConfig.swipe_back_male_during);
            codedOutputByteBufferNano.I(7, cardSwipeConfig.swipe_reset_male_during);
            codedOutputByteBufferNano.C(8, cardSwipeConfig.swipe_rotation_male);
            codedOutputByteBufferNano.I(9, cardSwipeConfig.swipe_trans_y_male);
            codedOutputByteBufferNano.C(10, cardSwipeConfig.swipe_speed_factor_male);
            codedOutputByteBufferNano.C(11, cardSwipeConfig.swipe_speed_check_male);
            codedOutputByteBufferNano.I(12, cardSwipeConfig.swipe_left_female_during);
            codedOutputByteBufferNano.I(13, cardSwipeConfig.swipe_right_female_during);
            codedOutputByteBufferNano.I(14, cardSwipeConfig.swipe_up_female_during);
            codedOutputByteBufferNano.I(15, cardSwipeConfig.swipe_back_female_during);
            codedOutputByteBufferNano.I(16, cardSwipeConfig.swipe_reset_female_during);
            codedOutputByteBufferNano.C(17, cardSwipeConfig.swipe_rotation_female);
            codedOutputByteBufferNano.I(18, cardSwipeConfig.swipe_trans_y_female);
            codedOutputByteBufferNano.C(19, cardSwipeConfig.swipe_speed_factor_female);
            codedOutputByteBufferNano.C(20, cardSwipeConfig.swipe_speed_check_female);
            codedOutputByteBufferNano.G(21, cardSwipeConfig.swipe_item_diff_male);
            codedOutputByteBufferNano.G(22, cardSwipeConfig.swipe_out_value_male);
            codedOutputByteBufferNano.G(23, cardSwipeConfig.swipe_mine_value_male);
            codedOutputByteBufferNano.G(24, cardSwipeConfig.swipe_item_diff_female);
            codedOutputByteBufferNano.G(25, cardSwipeConfig.swipe_out_value_female);
            codedOutputByteBufferNano.G(26, cardSwipeConfig.swipe_mine_value_female);
            codedOutputByteBufferNano.C(27, cardSwipeConfig.male_swipe_auto_width);
            codedOutputByteBufferNano.C(28, cardSwipeConfig.female_swipe_auto_width);
            codedOutputByteBufferNano.C(29, cardSwipeConfig.male_swipe_auto_factor);
            codedOutputByteBufferNano.C(30, cardSwipeConfig.female_swipe_auto_factor);
            codedOutputByteBufferNano.C(31, cardSwipeConfig.male_swipe_auto_rotate);
            codedOutputByteBufferNano.C(32, cardSwipeConfig.female_swipe_auto_rotate);
            codedOutputByteBufferNano.A(33, cardSwipeConfig.could_double_click);
            codedOutputByteBufferNano.C(34, cardSwipeConfig.swipe_type_factor);
            codedOutputByteBufferNano.G(35, cardSwipeConfig.swipe_fix_speed);
            codedOutputByteBufferNano.C(36, cardSwipeConfig.swipe_scale);
            codedOutputByteBufferNano.C(37, cardSwipeConfig.swipe_scale_start_alpha);
            codedOutputByteBufferNano.G(38, cardSwipeConfig.swipe_progress_value);
            codedOutputByteBufferNano.G(39, cardSwipeConfig.config_version);
            codedOutputByteBufferNano.A(40, cardSwipeConfig.scale_opt);
            codedOutputByteBufferNano.I(41, cardSwipeConfig.scale_opt_during);
            codedOutputByteBufferNano.A(42, cardSwipeConfig.scale_use_opt_during);
            codedOutputByteBufferNano.A(43, cardSwipeConfig.scale_alpha_opt);
            codedOutputByteBufferNano.C(44, cardSwipeConfig.scale_alpha_speed);
        }
    };
    public static JsonAdapter<CardSwipeConfig> JSON_ADAPTER = new ObjectJsonAdapter<CardSwipeConfig>() { // from class: com.p1.mobile.putong.core.data.CardSwipeConfig.2
        public Class getDataClass() {
            return CardSwipeConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardSwipeConfig m11920newInstance() {
            return new CardSwipeConfig();
        }

        public boolean parseField(CardSwipeConfig cardSwipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "swipe_reset_female_during":
                    cardSwipeConfig.swipe_reset_female_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_progress_value":
                    cardSwipeConfig.swipe_progress_value = jsonParser.getValueAsInt();
                    return true;
                case "swipe_right_male_during":
                    cardSwipeConfig.swipe_right_male_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_trans_y_female":
                    cardSwipeConfig.swipe_trans_y_female = jsonParser.getValueAsLong();
                    return true;
                case "scale_opt":
                    cardSwipeConfig.scale_opt = jsonParser.getValueAsBoolean();
                    return true;
                case "swipe_out_value_female":
                    cardSwipeConfig.swipe_out_value_female = jsonParser.getValueAsInt();
                    return true;
                case "scale_alpha_opt":
                    cardSwipeConfig.scale_alpha_opt = jsonParser.getValueAsBoolean();
                    return true;
                case "swipe_reset_male_during":
                    cardSwipeConfig.swipe_reset_male_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_mine_value_female":
                    cardSwipeConfig.swipe_mine_value_female = jsonParser.getValueAsInt();
                    return true;
                case "swipe_item_diff_female":
                    cardSwipeConfig.swipe_item_diff_female = jsonParser.getValueAsInt();
                    return true;
                case "swipe_auto_male_during":
                    cardSwipeConfig.swipe_auto_male_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_speed_check_male":
                    cardSwipeConfig.swipe_speed_check_male = jsonParser.getValueAsDouble();
                    return true;
                case "male_swipe_auto_width":
                    cardSwipeConfig.male_swipe_auto_width = jsonParser.getValueAsDouble();
                    return true;
                case "scale_opt_during":
                    cardSwipeConfig.scale_opt_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_speed_check_female":
                    cardSwipeConfig.swipe_speed_check_female = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_type_factor":
                    cardSwipeConfig.swipe_type_factor = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_scale_start_alpha":
                    cardSwipeConfig.swipe_scale_start_alpha = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_up_female_during":
                    cardSwipeConfig.swipe_up_female_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_back_male_during":
                    cardSwipeConfig.swipe_back_male_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_rotation_male":
                    cardSwipeConfig.swipe_rotation_male = jsonParser.getValueAsDouble();
                    return true;
                case "config_version":
                    cardSwipeConfig.config_version = jsonParser.getValueAsInt();
                    return true;
                case "female_swipe_auto_factor":
                    cardSwipeConfig.female_swipe_auto_factor = jsonParser.getValueAsDouble();
                    return true;
                case "female_swipe_auto_rotate":
                    cardSwipeConfig.female_swipe_auto_rotate = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_speed_factor_female":
                    cardSwipeConfig.swipe_speed_factor_female = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_speed_factor_male":
                    cardSwipeConfig.swipe_speed_factor_male = jsonParser.getValueAsDouble();
                    return true;
                case "scale_alpha_speed":
                    cardSwipeConfig.scale_alpha_speed = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_item_diff_male":
                    cardSwipeConfig.swipe_item_diff_male = jsonParser.getValueAsInt();
                    return true;
                case "could_double_click":
                    cardSwipeConfig.could_double_click = jsonParser.getValueAsBoolean();
                    return true;
                case "swipe_out_value_male":
                    cardSwipeConfig.swipe_out_value_male = jsonParser.getValueAsInt();
                    return true;
                case "swipe_rotation_female":
                    cardSwipeConfig.swipe_rotation_female = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_fix_speed":
                    cardSwipeConfig.swipe_fix_speed = jsonParser.getValueAsInt();
                    return true;
                case "swipe_left_male_during":
                    cardSwipeConfig.swipe_left_male_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_left_female_during":
                    cardSwipeConfig.swipe_left_female_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_up_male_during":
                    cardSwipeConfig.swipe_up_male_during = jsonParser.getValueAsLong();
                    return true;
                case "male_swipe_auto_factor":
                    cardSwipeConfig.male_swipe_auto_factor = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_scale":
                    cardSwipeConfig.swipe_scale = jsonParser.getValueAsDouble();
                    return true;
                case "male_swipe_auto_rotate":
                    cardSwipeConfig.male_swipe_auto_rotate = jsonParser.getValueAsDouble();
                    return true;
                case "scale_use_opt_during":
                    cardSwipeConfig.scale_use_opt_during = jsonParser.getValueAsBoolean();
                    return true;
                case "swipe_auto_female_during":
                    cardSwipeConfig.swipe_auto_female_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_mine_value_male":
                    cardSwipeConfig.swipe_mine_value_male = jsonParser.getValueAsInt();
                    return true;
                case "female_swipe_auto_width":
                    cardSwipeConfig.female_swipe_auto_width = jsonParser.getValueAsDouble();
                    return true;
                case "swipe_back_female_during":
                    cardSwipeConfig.swipe_back_female_during = jsonParser.getValueAsLong();
                    return true;
                case "swipe_trans_y_male":
                    cardSwipeConfig.swipe_trans_y_male = jsonParser.getValueAsLong();
                    return true;
                case "swipe_right_female_during":
                    cardSwipeConfig.swipe_right_female_during = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardSwipeConfig cardSwipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "swipe_reset_female_during":
                case "swipe_progress_value":
                case "swipe_right_male_during":
                case "swipe_trans_y_female":
                case "scale_opt":
                case "swipe_out_value_female":
                case "scale_alpha_opt":
                case "swipe_reset_male_during":
                case "swipe_mine_value_female":
                case "swipe_item_diff_female":
                case "swipe_auto_male_during":
                case "swipe_speed_check_male":
                case "male_swipe_auto_width":
                case "scale_opt_during":
                case "swipe_speed_check_female":
                case "swipe_type_factor":
                case "swipe_scale_start_alpha":
                case "swipe_up_female_during":
                case "swipe_back_male_during":
                case "swipe_rotation_male":
                case "config_version":
                case "female_swipe_auto_factor":
                case "female_swipe_auto_rotate":
                case "swipe_speed_factor_female":
                case "swipe_speed_factor_male":
                case "scale_alpha_speed":
                case "swipe_item_diff_male":
                case "could_double_click":
                case "swipe_out_value_male":
                case "swipe_rotation_female":
                case "swipe_fix_speed":
                case "swipe_left_male_during":
                case "swipe_left_female_during":
                case "swipe_up_male_during":
                case "male_swipe_auto_factor":
                case "swipe_scale":
                case "male_swipe_auto_rotate":
                case "scale_use_opt_during":
                case "swipe_auto_female_during":
                case "swipe_mine_value_male":
                case "female_swipe_auto_width":
                case "swipe_back_female_during":
                case "swipe_trans_y_male":
                case "swipe_right_female_during":
                    return true;
                default:
                    return super.parseFieldCheck(cardSwipeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CardSwipeConfig cardSwipeConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipe_left_male_during", cardSwipeConfig.swipe_left_male_during);
            jsonGenerator.writeNumberField("swipe_right_male_during", cardSwipeConfig.swipe_right_male_during);
            jsonGenerator.writeNumberField("swipe_up_male_during", cardSwipeConfig.swipe_up_male_during);
            jsonGenerator.writeNumberField("swipe_auto_male_during", cardSwipeConfig.swipe_auto_male_during);
            jsonGenerator.writeNumberField("swipe_back_male_during", cardSwipeConfig.swipe_back_male_during);
            jsonGenerator.writeNumberField("swipe_reset_male_during", cardSwipeConfig.swipe_reset_male_during);
            jsonGenerator.writeNumberField("swipe_rotation_male", cardSwipeConfig.swipe_rotation_male);
            jsonGenerator.writeNumberField("swipe_trans_y_male", cardSwipeConfig.swipe_trans_y_male);
            jsonGenerator.writeNumberField("swipe_speed_factor_male", cardSwipeConfig.swipe_speed_factor_male);
            jsonGenerator.writeNumberField("swipe_speed_check_male", cardSwipeConfig.swipe_speed_check_male);
            jsonGenerator.writeNumberField("swipe_left_female_during", cardSwipeConfig.swipe_left_female_during);
            jsonGenerator.writeNumberField("swipe_right_female_during", cardSwipeConfig.swipe_right_female_during);
            jsonGenerator.writeNumberField("swipe_up_female_during", cardSwipeConfig.swipe_up_female_during);
            jsonGenerator.writeNumberField("swipe_auto_female_during", cardSwipeConfig.swipe_auto_female_during);
            jsonGenerator.writeNumberField("swipe_back_female_during", cardSwipeConfig.swipe_back_female_during);
            jsonGenerator.writeNumberField("swipe_reset_female_during", cardSwipeConfig.swipe_reset_female_during);
            jsonGenerator.writeNumberField("swipe_rotation_female", cardSwipeConfig.swipe_rotation_female);
            jsonGenerator.writeNumberField("swipe_trans_y_female", cardSwipeConfig.swipe_trans_y_female);
            jsonGenerator.writeNumberField("swipe_speed_factor_female", cardSwipeConfig.swipe_speed_factor_female);
            jsonGenerator.writeNumberField("swipe_speed_check_female", cardSwipeConfig.swipe_speed_check_female);
            jsonGenerator.writeNumberField("swipe_item_diff_male", cardSwipeConfig.swipe_item_diff_male);
            jsonGenerator.writeNumberField("swipe_out_value_male", cardSwipeConfig.swipe_out_value_male);
            jsonGenerator.writeNumberField("swipe_mine_value_male", cardSwipeConfig.swipe_mine_value_male);
            jsonGenerator.writeNumberField("swipe_item_diff_female", cardSwipeConfig.swipe_item_diff_female);
            jsonGenerator.writeNumberField("swipe_out_value_female", cardSwipeConfig.swipe_out_value_female);
            jsonGenerator.writeNumberField("swipe_mine_value_female", cardSwipeConfig.swipe_mine_value_female);
            jsonGenerator.writeNumberField("male_swipe_auto_width", cardSwipeConfig.male_swipe_auto_width);
            jsonGenerator.writeNumberField("female_swipe_auto_width", cardSwipeConfig.female_swipe_auto_width);
            jsonGenerator.writeNumberField("male_swipe_auto_factor", cardSwipeConfig.male_swipe_auto_factor);
            jsonGenerator.writeNumberField("female_swipe_auto_factor", cardSwipeConfig.female_swipe_auto_factor);
            jsonGenerator.writeNumberField("male_swipe_auto_rotate", cardSwipeConfig.male_swipe_auto_rotate);
            jsonGenerator.writeNumberField("female_swipe_auto_rotate", cardSwipeConfig.female_swipe_auto_rotate);
            jsonGenerator.writeBooleanField("could_double_click", cardSwipeConfig.could_double_click);
            jsonGenerator.writeNumberField("swipe_type_factor", cardSwipeConfig.swipe_type_factor);
            jsonGenerator.writeNumberField("swipe_fix_speed", cardSwipeConfig.swipe_fix_speed);
            jsonGenerator.writeNumberField("swipe_scale", cardSwipeConfig.swipe_scale);
            jsonGenerator.writeNumberField("swipe_scale_start_alpha", cardSwipeConfig.swipe_scale_start_alpha);
            jsonGenerator.writeNumberField("swipe_progress_value", cardSwipeConfig.swipe_progress_value);
            jsonGenerator.writeNumberField("config_version", cardSwipeConfig.config_version);
            jsonGenerator.writeBooleanField("scale_opt", cardSwipeConfig.scale_opt);
            jsonGenerator.writeNumberField("scale_opt_during", cardSwipeConfig.scale_opt_during);
            jsonGenerator.writeBooleanField("scale_use_opt_during", cardSwipeConfig.scale_use_opt_during);
            jsonGenerator.writeBooleanField("scale_alpha_opt", cardSwipeConfig.scale_alpha_opt);
            jsonGenerator.writeNumberField("scale_alpha_speed", cardSwipeConfig.scale_alpha_speed);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardSwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardSwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardSwipeConfig new_() {
        CardSwipeConfig cardSwipeConfig = new CardSwipeConfig();
        cardSwipeConfig.nullCheck();
        return cardSwipeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardSwipeConfig m11918clone() {
        CardSwipeConfig cardSwipeConfig = new CardSwipeConfig();
        cardSwipeConfig.swipe_left_male_during = this.swipe_left_male_during;
        cardSwipeConfig.swipe_right_male_during = this.swipe_right_male_during;
        cardSwipeConfig.swipe_up_male_during = this.swipe_up_male_during;
        cardSwipeConfig.swipe_auto_male_during = this.swipe_auto_male_during;
        cardSwipeConfig.swipe_back_male_during = this.swipe_back_male_during;
        cardSwipeConfig.swipe_reset_male_during = this.swipe_reset_male_during;
        cardSwipeConfig.swipe_rotation_male = this.swipe_rotation_male;
        cardSwipeConfig.swipe_trans_y_male = this.swipe_trans_y_male;
        cardSwipeConfig.swipe_speed_factor_male = this.swipe_speed_factor_male;
        cardSwipeConfig.swipe_speed_check_male = this.swipe_speed_check_male;
        cardSwipeConfig.swipe_left_female_during = this.swipe_left_female_during;
        cardSwipeConfig.swipe_right_female_during = this.swipe_right_female_during;
        cardSwipeConfig.swipe_up_female_during = this.swipe_up_female_during;
        cardSwipeConfig.swipe_auto_female_during = this.swipe_auto_female_during;
        cardSwipeConfig.swipe_back_female_during = this.swipe_back_female_during;
        cardSwipeConfig.swipe_reset_female_during = this.swipe_reset_female_during;
        cardSwipeConfig.swipe_rotation_female = this.swipe_rotation_female;
        cardSwipeConfig.swipe_trans_y_female = this.swipe_trans_y_female;
        cardSwipeConfig.swipe_speed_factor_female = this.swipe_speed_factor_female;
        cardSwipeConfig.swipe_speed_check_female = this.swipe_speed_check_female;
        cardSwipeConfig.swipe_item_diff_male = this.swipe_item_diff_male;
        cardSwipeConfig.swipe_out_value_male = this.swipe_out_value_male;
        cardSwipeConfig.swipe_mine_value_male = this.swipe_mine_value_male;
        cardSwipeConfig.swipe_item_diff_female = this.swipe_item_diff_female;
        cardSwipeConfig.swipe_out_value_female = this.swipe_out_value_female;
        cardSwipeConfig.swipe_mine_value_female = this.swipe_mine_value_female;
        cardSwipeConfig.male_swipe_auto_width = this.male_swipe_auto_width;
        cardSwipeConfig.female_swipe_auto_width = this.female_swipe_auto_width;
        cardSwipeConfig.male_swipe_auto_factor = this.male_swipe_auto_factor;
        cardSwipeConfig.female_swipe_auto_factor = this.female_swipe_auto_factor;
        cardSwipeConfig.male_swipe_auto_rotate = this.male_swipe_auto_rotate;
        cardSwipeConfig.female_swipe_auto_rotate = this.female_swipe_auto_rotate;
        cardSwipeConfig.could_double_click = this.could_double_click;
        cardSwipeConfig.swipe_type_factor = this.swipe_type_factor;
        cardSwipeConfig.swipe_fix_speed = this.swipe_fix_speed;
        cardSwipeConfig.swipe_scale = this.swipe_scale;
        cardSwipeConfig.swipe_scale_start_alpha = this.swipe_scale_start_alpha;
        cardSwipeConfig.swipe_progress_value = this.swipe_progress_value;
        cardSwipeConfig.config_version = this.config_version;
        cardSwipeConfig.scale_opt = this.scale_opt;
        cardSwipeConfig.scale_opt_during = this.scale_opt_during;
        cardSwipeConfig.scale_use_opt_during = this.scale_use_opt_during;
        cardSwipeConfig.scale_alpha_opt = this.scale_alpha_opt;
        cardSwipeConfig.scale_alpha_speed = this.scale_alpha_speed;
        return cardSwipeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSwipeConfig)) {
            return false;
        }
        CardSwipeConfig cardSwipeConfig = (CardSwipeConfig) obj;
        return this.swipe_left_male_during == cardSwipeConfig.swipe_left_male_during && this.swipe_right_male_during == cardSwipeConfig.swipe_right_male_during && this.swipe_up_male_during == cardSwipeConfig.swipe_up_male_during && this.swipe_auto_male_during == cardSwipeConfig.swipe_auto_male_during && this.swipe_back_male_during == cardSwipeConfig.swipe_back_male_during && this.swipe_reset_male_during == cardSwipeConfig.swipe_reset_male_during && this.swipe_rotation_male == cardSwipeConfig.swipe_rotation_male && this.swipe_trans_y_male == cardSwipeConfig.swipe_trans_y_male && this.swipe_speed_factor_male == cardSwipeConfig.swipe_speed_factor_male && this.swipe_speed_check_male == cardSwipeConfig.swipe_speed_check_male && this.swipe_left_female_during == cardSwipeConfig.swipe_left_female_during && this.swipe_right_female_during == cardSwipeConfig.swipe_right_female_during && this.swipe_up_female_during == cardSwipeConfig.swipe_up_female_during && this.swipe_auto_female_during == cardSwipeConfig.swipe_auto_female_during && this.swipe_back_female_during == cardSwipeConfig.swipe_back_female_during && this.swipe_reset_female_during == cardSwipeConfig.swipe_reset_female_during && this.swipe_rotation_female == cardSwipeConfig.swipe_rotation_female && this.swipe_trans_y_female == cardSwipeConfig.swipe_trans_y_female && this.swipe_speed_factor_female == cardSwipeConfig.swipe_speed_factor_female && this.swipe_speed_check_female == cardSwipeConfig.swipe_speed_check_female && this.swipe_item_diff_male == cardSwipeConfig.swipe_item_diff_male && this.swipe_out_value_male == cardSwipeConfig.swipe_out_value_male && this.swipe_mine_value_male == cardSwipeConfig.swipe_mine_value_male && this.swipe_item_diff_female == cardSwipeConfig.swipe_item_diff_female && this.swipe_out_value_female == cardSwipeConfig.swipe_out_value_female && this.swipe_mine_value_female == cardSwipeConfig.swipe_mine_value_female && this.male_swipe_auto_width == cardSwipeConfig.male_swipe_auto_width && this.female_swipe_auto_width == cardSwipeConfig.female_swipe_auto_width && this.male_swipe_auto_factor == cardSwipeConfig.male_swipe_auto_factor && this.female_swipe_auto_factor == cardSwipeConfig.female_swipe_auto_factor && this.male_swipe_auto_rotate == cardSwipeConfig.male_swipe_auto_rotate && this.female_swipe_auto_rotate == cardSwipeConfig.female_swipe_auto_rotate && this.could_double_click == cardSwipeConfig.could_double_click && this.swipe_type_factor == cardSwipeConfig.swipe_type_factor && this.swipe_fix_speed == cardSwipeConfig.swipe_fix_speed && this.swipe_scale == cardSwipeConfig.swipe_scale && this.swipe_scale_start_alpha == cardSwipeConfig.swipe_scale_start_alpha && this.swipe_progress_value == cardSwipeConfig.swipe_progress_value && this.config_version == cardSwipeConfig.config_version && this.scale_opt == cardSwipeConfig.scale_opt && this.scale_opt_during == cardSwipeConfig.scale_opt_during && this.scale_use_opt_during == cardSwipeConfig.scale_use_opt_during && this.scale_alpha_opt == cardSwipeConfig.scale_alpha_opt && this.scale_alpha_speed == cardSwipeConfig.scale_alpha_speed;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.swipe_left_male_during;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.swipe_right_male_during;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.swipe_up_male_during;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.swipe_auto_male_during;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        long j5 = this.swipe_back_male_during;
        int i6 = (i5 + ((int) (j5 ^ (j5 >>> 32)))) * 41;
        long j6 = this.swipe_reset_male_during;
        int i7 = i6 + ((int) (j6 ^ (j6 >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.swipe_rotation_male);
        int i8 = ((i7 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        long j7 = this.swipe_trans_y_male;
        int i9 = i8 + ((int) (j7 ^ (j7 >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.swipe_speed_factor_male);
        int i10 = (i9 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.swipe_speed_check_male);
        int i11 = ((i10 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        long j8 = this.swipe_left_female_during;
        int i12 = (i11 + ((int) (j8 ^ (j8 >>> 32)))) * 41;
        long j9 = this.swipe_right_female_during;
        int i13 = (i12 + ((int) (j9 ^ (j9 >>> 32)))) * 41;
        long j10 = this.swipe_up_female_during;
        int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 41;
        long j11 = this.swipe_auto_female_during;
        int i15 = (i14 + ((int) (j11 ^ (j11 >>> 32)))) * 41;
        long j12 = this.swipe_back_female_during;
        int i16 = (i15 + ((int) (j12 ^ (j12 >>> 32)))) * 41;
        long j13 = this.swipe_reset_female_during;
        int i17 = i16 + ((int) (j13 ^ (j13 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.swipe_rotation_female);
        int i18 = ((i17 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41;
        long j14 = this.swipe_trans_y_female;
        int i19 = i18 + ((int) (j14 ^ (j14 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.swipe_speed_factor_female);
        int i20 = (i19 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.swipe_speed_check_female);
        int i21 = (((((((((((((i20 * 41) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 41) + this.swipe_item_diff_male) * 41) + this.swipe_out_value_male) * 41) + this.swipe_mine_value_male) * 41) + this.swipe_item_diff_female) * 41) + this.swipe_out_value_female) * 41) + this.swipe_mine_value_female;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.male_swipe_auto_width);
        int i22 = (i21 * 41) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.female_swipe_auto_width);
        int i23 = (i22 * 41) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.male_swipe_auto_factor);
        int i24 = (i23 * 41) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
        long jDoubleToLongBits10 = Double.doubleToLongBits(this.female_swipe_auto_factor);
        int i25 = (i24 * 41) + ((int) (jDoubleToLongBits10 ^ (jDoubleToLongBits10 >>> 32)));
        long jDoubleToLongBits11 = Double.doubleToLongBits(this.male_swipe_auto_rotate);
        int i26 = (i25 * 41) + ((int) (jDoubleToLongBits11 ^ (jDoubleToLongBits11 >>> 32)));
        long jDoubleToLongBits12 = Double.doubleToLongBits(this.female_swipe_auto_rotate);
        int i27 = ((i26 * 41) + ((int) (jDoubleToLongBits12 ^ (jDoubleToLongBits12 >>> 32)))) * 41;
        int i28 = this.could_double_click ? 1231 : 1237;
        long jDoubleToLongBits13 = Double.doubleToLongBits(this.swipe_type_factor);
        int i29 = ((((i27 + i28) * 41) + ((int) (jDoubleToLongBits13 ^ (jDoubleToLongBits13 >>> 32)))) * 41) + this.swipe_fix_speed;
        long jDoubleToLongBits14 = Double.doubleToLongBits(this.swipe_scale);
        int i30 = (i29 * 41) + ((int) (jDoubleToLongBits14 ^ (jDoubleToLongBits14 >>> 32)));
        long jDoubleToLongBits15 = Double.doubleToLongBits(this.swipe_scale_start_alpha);
        int i31 = ((((((i30 * 41) + ((int) (jDoubleToLongBits15 ^ (jDoubleToLongBits15 >>> 32)))) * 41) + this.swipe_progress_value) * 41) + this.config_version) * 41;
        int i32 = this.scale_opt ? 1231 : 1237;
        long j15 = this.scale_opt_during;
        int i33 = (((((i31 + i32) * 41) + ((int) (j15 ^ (j15 >>> 32)))) * 41) + (this.scale_use_opt_during ? 1231 : 1237)) * 41;
        int i34 = this.scale_alpha_opt ? 1231 : 1237;
        long jDoubleToLongBits16 = Double.doubleToLongBits(this.scale_alpha_speed);
        int i35 = ((i33 + i34) * 41) + ((int) (jDoubleToLongBits16 ^ (jDoubleToLongBits16 >>> 32)));
        ((ValueObject) this).hashCode = i35;
        return i35;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
