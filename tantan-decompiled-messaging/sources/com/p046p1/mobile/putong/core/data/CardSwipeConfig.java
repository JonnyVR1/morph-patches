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
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
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

    @ProtobufIndex(index = 5)
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

    @ProtobufIndex(index = 2)
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

    @ProtobufIndex(index = 10)
    public double swipe_speed_factor_male;

    @ProtobufIndex(index = 18)
    public long swipe_trans_y_female;

    @ProtobufIndex(index = 9)
    public long swipe_trans_y_male;

    @ProtobufIndex(index = 34)
    public double swipe_type_factor;

    @ProtobufIndex(index = 14)
    public long swipe_up_female_during;

    @ProtobufIndex(index = 3)
    public long swipe_up_male_during;
    public static ProtobufAdapter<CardSwipeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardSwipeConfig>() { // from class: com.p1.mobile.putong.core.data.CardSwipeConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardSwipeConfig cardSwipeConfig) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, cardSwipeConfig.swipe_left_male_during) + CodedOutputByteBufferNano.m17228j(2, cardSwipeConfig.swipe_right_male_during) + CodedOutputByteBufferNano.m17228j(3, cardSwipeConfig.swipe_up_male_during) + CodedOutputByteBufferNano.m17228j(4, cardSwipeConfig.swipe_auto_male_during) + CodedOutputByteBufferNano.m17228j(5, cardSwipeConfig.swipe_auto_female_during) + CodedOutputByteBufferNano.m17228j(6, cardSwipeConfig.swipe_back_male_during) + CodedOutputByteBufferNano.m17228j(7, cardSwipeConfig.swipe_reset_male_during) + CodedOutputByteBufferNano.m17222d(8, cardSwipeConfig.swipe_rotation_male) + CodedOutputByteBufferNano.m17228j(9, cardSwipeConfig.swipe_trans_y_male) + CodedOutputByteBufferNano.m17222d(10, cardSwipeConfig.swipe_speed_factor_male) + CodedOutputByteBufferNano.m17222d(11, cardSwipeConfig.swipe_speed_check_male) + CodedOutputByteBufferNano.m17228j(12, cardSwipeConfig.swipe_left_female_during) + CodedOutputByteBufferNano.m17228j(13, cardSwipeConfig.swipe_right_female_during) + CodedOutputByteBufferNano.m17228j(14, cardSwipeConfig.swipe_up_female_during) + CodedOutputByteBufferNano.m17228j(15, cardSwipeConfig.swipe_back_female_during) + CodedOutputByteBufferNano.m17228j(16, cardSwipeConfig.swipe_reset_female_during) + CodedOutputByteBufferNano.m17222d(17, cardSwipeConfig.swipe_rotation_female) + CodedOutputByteBufferNano.m17228j(18, cardSwipeConfig.swipe_trans_y_female) + CodedOutputByteBufferNano.m17222d(19, cardSwipeConfig.swipe_speed_factor_female) + CodedOutputByteBufferNano.m17222d(20, cardSwipeConfig.swipe_speed_check_female) + CodedOutputByteBufferNano.m17226h(21, cardSwipeConfig.swipe_item_diff_male) + CodedOutputByteBufferNano.m17226h(22, cardSwipeConfig.swipe_out_value_male) + CodedOutputByteBufferNano.m17226h(23, cardSwipeConfig.swipe_mine_value_male) + CodedOutputByteBufferNano.m17226h(24, cardSwipeConfig.swipe_item_diff_female) + CodedOutputByteBufferNano.m17226h(25, cardSwipeConfig.swipe_out_value_female) + CodedOutputByteBufferNano.m17226h(26, cardSwipeConfig.swipe_mine_value_female) + CodedOutputByteBufferNano.m17222d(27, cardSwipeConfig.male_swipe_auto_width) + CodedOutputByteBufferNano.m17222d(28, cardSwipeConfig.female_swipe_auto_width) + CodedOutputByteBufferNano.m17222d(29, cardSwipeConfig.male_swipe_auto_factor) + CodedOutputByteBufferNano.m17222d(30, cardSwipeConfig.female_swipe_auto_factor) + CodedOutputByteBufferNano.m17222d(31, cardSwipeConfig.male_swipe_auto_rotate) + CodedOutputByteBufferNano.m17222d(32, cardSwipeConfig.female_swipe_auto_rotate) + CodedOutputByteBufferNano.m17220b(33, cardSwipeConfig.could_double_click) + CodedOutputByteBufferNano.m17222d(34, cardSwipeConfig.swipe_type_factor) + CodedOutputByteBufferNano.m17226h(35, cardSwipeConfig.swipe_fix_speed) + CodedOutputByteBufferNano.m17222d(36, cardSwipeConfig.swipe_scale) + CodedOutputByteBufferNano.m17222d(37, cardSwipeConfig.swipe_scale_start_alpha) + CodedOutputByteBufferNano.m17226h(38, cardSwipeConfig.swipe_progress_value) + CodedOutputByteBufferNano.m17226h(39, cardSwipeConfig.config_version) + CodedOutputByteBufferNano.m17220b(40, cardSwipeConfig.scale_opt) + CodedOutputByteBufferNano.m17228j(41, cardSwipeConfig.scale_opt_during) + CodedOutputByteBufferNano.m17220b(42, cardSwipeConfig.scale_use_opt_during) + CodedOutputByteBufferNano.m17220b(43, cardSwipeConfig.scale_alpha_opt) + CodedOutputByteBufferNano.m17222d(44, cardSwipeConfig.scale_alpha_speed);
            cardSwipeConfig.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardSwipeConfig parse(nb5 nb5Var) throws IOException {
            CardSwipeConfig cardSwipeConfig = new CardSwipeConfig();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 8:
                        cardSwipeConfig.swipe_left_male_during = nb5Var.m158742k();
                        break;
                    case 16:
                        cardSwipeConfig.swipe_right_male_during = nb5Var.m158742k();
                        break;
                    case 24:
                        cardSwipeConfig.swipe_up_male_during = nb5Var.m158742k();
                        break;
                    case 32:
                        cardSwipeConfig.swipe_auto_male_during = nb5Var.m158742k();
                        break;
                    case 40:
                        cardSwipeConfig.swipe_auto_female_during = nb5Var.m158742k();
                        break;
                    case 48:
                        cardSwipeConfig.swipe_back_male_during = nb5Var.m158742k();
                        break;
                    case 56:
                        cardSwipeConfig.swipe_reset_male_during = nb5Var.m158742k();
                        break;
                    case 65:
                        cardSwipeConfig.swipe_rotation_male = nb5Var.m158739h();
                        break;
                    case 72:
                        cardSwipeConfig.swipe_trans_y_male = nb5Var.m158742k();
                        break;
                    case EACTags.FILE_REFERENCE /* 81 */:
                        cardSwipeConfig.swipe_speed_factor_male = nb5Var.m158739h();
                        break;
                    case 89:
                        cardSwipeConfig.swipe_speed_check_male = nb5Var.m158739h();
                        break;
                    case Opcodes.IADD /* 96 */:
                        cardSwipeConfig.swipe_left_female_during = nb5Var.m158742k();
                        break;
                    case 104:
                        cardSwipeConfig.swipe_right_female_during = nb5Var.m158742k();
                        break;
                    case 112:
                        cardSwipeConfig.swipe_up_female_during = nb5Var.m158742k();
                        break;
                    case 120:
                        cardSwipeConfig.swipe_back_female_during = nb5Var.m158742k();
                        break;
                    case 128:
                        cardSwipeConfig.swipe_reset_female_during = nb5Var.m158742k();
                        break;
                    case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                        cardSwipeConfig.swipe_rotation_female = nb5Var.m158739h();
                        break;
                    case 144:
                        cardSwipeConfig.swipe_trans_y_female = nb5Var.m158742k();
                        break;
                    case 153:
                        cardSwipeConfig.swipe_speed_factor_female = nb5Var.m158739h();
                        break;
                    case 161:
                        cardSwipeConfig.swipe_speed_check_female = nb5Var.m158739h();
                        break;
                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                        cardSwipeConfig.swipe_item_diff_male = nb5Var.m158741j();
                        break;
                    case 176:
                        cardSwipeConfig.swipe_out_value_male = nb5Var.m158741j();
                        break;
                    case 184:
                        cardSwipeConfig.swipe_mine_value_male = nb5Var.m158741j();
                        break;
                    case 192:
                        cardSwipeConfig.swipe_item_diff_female = nb5Var.m158741j();
                        break;
                    case 200:
                        cardSwipeConfig.swipe_out_value_female = nb5Var.m158741j();
                        break;
                    case 208:
                        cardSwipeConfig.swipe_mine_value_female = nb5Var.m158741j();
                        break;
                    case 217:
                        cardSwipeConfig.male_swipe_auto_width = nb5Var.m158739h();
                        break;
                    case 225:
                        cardSwipeConfig.female_swipe_auto_width = nb5Var.m158739h();
                        break;
                    case 233:
                        cardSwipeConfig.male_swipe_auto_factor = nb5Var.m158739h();
                        break;
                    case 241:
                        cardSwipeConfig.female_swipe_auto_factor = nb5Var.m158739h();
                        break;
                    case 249:
                        cardSwipeConfig.male_swipe_auto_rotate = nb5Var.m158739h();
                        break;
                    case 257:
                        cardSwipeConfig.female_swipe_auto_rotate = nb5Var.m158739h();
                        break;
                    case 264:
                        cardSwipeConfig.could_double_click = nb5Var.m158738g();
                        break;
                    case 273:
                        cardSwipeConfig.swipe_type_factor = nb5Var.m158739h();
                        break;
                    case 280:
                        cardSwipeConfig.swipe_fix_speed = nb5Var.m158741j();
                        break;
                    case 289:
                        cardSwipeConfig.swipe_scale = nb5Var.m158739h();
                        break;
                    case 297:
                        cardSwipeConfig.swipe_scale_start_alpha = nb5Var.m158739h();
                        break;
                    case HttpStatus.NOT_MODIFIED_304 /* 304 */:
                        cardSwipeConfig.swipe_progress_value = nb5Var.m158741j();
                        break;
                    case 312:
                        cardSwipeConfig.config_version = nb5Var.m158741j();
                        break;
                    case 320:
                        cardSwipeConfig.scale_opt = nb5Var.m158738g();
                        break;
                    case 328:
                        cardSwipeConfig.scale_opt_during = nb5Var.m158742k();
                        break;
                    case 336:
                        cardSwipeConfig.scale_use_opt_during = nb5Var.m158738g();
                        break;
                    case 344:
                        cardSwipeConfig.scale_alpha_opt = nb5Var.m158738g();
                        break;
                    case 353:
                        cardSwipeConfig.scale_alpha_speed = nb5Var.m158739h();
                        break;
                    default:
                        return cardSwipeConfig;
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardSwipeConfig cardSwipeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, cardSwipeConfig.swipe_left_male_during);
            codedOutputByteBufferNano.m17252I(2, cardSwipeConfig.swipe_right_male_during);
            codedOutputByteBufferNano.m17252I(3, cardSwipeConfig.swipe_up_male_during);
            codedOutputByteBufferNano.m17252I(4, cardSwipeConfig.swipe_auto_male_during);
            codedOutputByteBufferNano.m17252I(5, cardSwipeConfig.swipe_auto_female_during);
            codedOutputByteBufferNano.m17252I(6, cardSwipeConfig.swipe_back_male_during);
            codedOutputByteBufferNano.m17252I(7, cardSwipeConfig.swipe_reset_male_during);
            codedOutputByteBufferNano.m17246C(8, cardSwipeConfig.swipe_rotation_male);
            codedOutputByteBufferNano.m17252I(9, cardSwipeConfig.swipe_trans_y_male);
            codedOutputByteBufferNano.m17246C(10, cardSwipeConfig.swipe_speed_factor_male);
            codedOutputByteBufferNano.m17246C(11, cardSwipeConfig.swipe_speed_check_male);
            codedOutputByteBufferNano.m17252I(12, cardSwipeConfig.swipe_left_female_during);
            codedOutputByteBufferNano.m17252I(13, cardSwipeConfig.swipe_right_female_during);
            codedOutputByteBufferNano.m17252I(14, cardSwipeConfig.swipe_up_female_during);
            codedOutputByteBufferNano.m17252I(15, cardSwipeConfig.swipe_back_female_during);
            codedOutputByteBufferNano.m17252I(16, cardSwipeConfig.swipe_reset_female_during);
            codedOutputByteBufferNano.m17246C(17, cardSwipeConfig.swipe_rotation_female);
            codedOutputByteBufferNano.m17252I(18, cardSwipeConfig.swipe_trans_y_female);
            codedOutputByteBufferNano.m17246C(19, cardSwipeConfig.swipe_speed_factor_female);
            codedOutputByteBufferNano.m17246C(20, cardSwipeConfig.swipe_speed_check_female);
            codedOutputByteBufferNano.m17250G(21, cardSwipeConfig.swipe_item_diff_male);
            codedOutputByteBufferNano.m17250G(22, cardSwipeConfig.swipe_out_value_male);
            codedOutputByteBufferNano.m17250G(23, cardSwipeConfig.swipe_mine_value_male);
            codedOutputByteBufferNano.m17250G(24, cardSwipeConfig.swipe_item_diff_female);
            codedOutputByteBufferNano.m17250G(25, cardSwipeConfig.swipe_out_value_female);
            codedOutputByteBufferNano.m17250G(26, cardSwipeConfig.swipe_mine_value_female);
            codedOutputByteBufferNano.m17246C(27, cardSwipeConfig.male_swipe_auto_width);
            codedOutputByteBufferNano.m17246C(28, cardSwipeConfig.female_swipe_auto_width);
            codedOutputByteBufferNano.m17246C(29, cardSwipeConfig.male_swipe_auto_factor);
            codedOutputByteBufferNano.m17246C(30, cardSwipeConfig.female_swipe_auto_factor);
            codedOutputByteBufferNano.m17246C(31, cardSwipeConfig.male_swipe_auto_rotate);
            codedOutputByteBufferNano.m17246C(32, cardSwipeConfig.female_swipe_auto_rotate);
            codedOutputByteBufferNano.m17244A(33, cardSwipeConfig.could_double_click);
            codedOutputByteBufferNano.m17246C(34, cardSwipeConfig.swipe_type_factor);
            codedOutputByteBufferNano.m17250G(35, cardSwipeConfig.swipe_fix_speed);
            codedOutputByteBufferNano.m17246C(36, cardSwipeConfig.swipe_scale);
            codedOutputByteBufferNano.m17246C(37, cardSwipeConfig.swipe_scale_start_alpha);
            codedOutputByteBufferNano.m17250G(38, cardSwipeConfig.swipe_progress_value);
            codedOutputByteBufferNano.m17250G(39, cardSwipeConfig.config_version);
            codedOutputByteBufferNano.m17244A(40, cardSwipeConfig.scale_opt);
            codedOutputByteBufferNano.m17252I(41, cardSwipeConfig.scale_opt_during);
            codedOutputByteBufferNano.m17244A(42, cardSwipeConfig.scale_use_opt_during);
            codedOutputByteBufferNano.m17244A(43, cardSwipeConfig.scale_alpha_opt);
            codedOutputByteBufferNano.m17246C(44, cardSwipeConfig.scale_alpha_speed);
        }
    };
    public static JsonAdapter<CardSwipeConfig> JSON_ADAPTER = new ObjectJsonAdapter<CardSwipeConfig>() { // from class: com.p1.mobile.putong.core.data.CardSwipeConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardSwipeConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardSwipeConfig newInstance() {
            return new CardSwipeConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(CardSwipeConfig cardSwipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2053177569:
                    if (str.equals("swipe_reset_female_during")) {
                        b = 0;
                    }
                    break;
                case -1937558396:
                    if (str.equals("swipe_progress_value")) {
                        b = 1;
                    }
                    break;
                case -1927173813:
                    if (str.equals("swipe_right_male_during")) {
                        b = 2;
                    }
                    break;
                case -1920656082:
                    if (str.equals("swipe_trans_y_female")) {
                        b = 3;
                    }
                    break;
                case -1877593538:
                    if (str.equals("scale_opt")) {
                        b = 4;
                    }
                    break;
                case -1774617200:
                    if (str.equals("swipe_out_value_female")) {
                        b = 5;
                    }
                    break;
                case -1760878691:
                    if (str.equals("scale_alpha_opt")) {
                        b = 6;
                    }
                    break;
                case -1752576002:
                    if (str.equals("swipe_reset_male_during")) {
                        b = 7;
                    }
                    break;
                case -1496684415:
                    if (str.equals("swipe_mine_value_female")) {
                        b = 8;
                    }
                    break;
                case -1428619265:
                    if (str.equals("swipe_item_diff_female")) {
                        b = 9;
                    }
                    break;
                case -1172524920:
                    if (str.equals("swipe_auto_male_during")) {
                        b = 10;
                    }
                    break;
                case -1077792703:
                    if (str.equals("swipe_speed_check_male")) {
                        b = 11;
                    }
                    break;
                case -1065290419:
                    if (str.equals("male_swipe_auto_width")) {
                        b = 12;
                    }
                    break;
                case -1053741214:
                    if (str.equals("scale_opt_during")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -868349824:
                    if (str.equals("swipe_speed_check_female")) {
                        b = 14;
                    }
                    break;
                case -723236753:
                    if (str.equals("swipe_type_factor")) {
                        b = 15;
                    }
                    break;
                case -627974649:
                    if (str.equals("swipe_scale_start_alpha")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -594145707:
                    if (str.equals("swipe_up_female_during")) {
                        b = 17;
                    }
                    break;
                case -591150144:
                    if (str.equals("swipe_back_male_during")) {
                        b = 18;
                    }
                    break;
                case -589393431:
                    if (str.equals("swipe_rotation_male")) {
                        b = 19;
                    }
                    break;
                case -533338917:
                    if (str.equals("config_version")) {
                        b = 20;
                    }
                    break;
                case -530938329:
                    if (str.equals("female_swipe_auto_factor")) {
                        b = 21;
                    }
                    break;
                case -173970893:
                    if (str.equals("female_swipe_auto_rotate")) {
                        b = 22;
                    }
                    break;
                case -166883905:
                    if (str.equals("swipe_speed_factor_female")) {
                        b = 23;
                    }
                    break;
                case -102762176:
                    if (str.equals("swipe_speed_factor_male")) {
                        b = 24;
                    }
                    break;
                case 16375473:
                    if (str.equals("scale_alpha_speed")) {
                        b = 25;
                    }
                    break;
                case 56818560:
                    if (str.equals("swipe_item_diff_male")) {
                        b = 26;
                    }
                    break;
                case 225893976:
                    if (str.equals("could_double_click")) {
                        b = 27;
                    }
                    break;
                case 288860497:
                    if (str.equals("swipe_out_value_male")) {
                        b = 28;
                    }
                    break;
                case 331915304:
                    if (str.equals("swipe_rotation_female")) {
                        b = 29;
                    }
                    break;
                case 365675736:
                    if (str.equals("swipe_fix_speed")) {
                        b = 30;
                    }
                    break;
                case 471379680:
                    if (str.equals("swipe_left_male_during")) {
                        b = 31;
                    }
                    break;
                case 569486721:
                    if (str.equals("swipe_left_female_during")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 675755188:
                    if (str.equals("swipe_up_male_during")) {
                        b = 33;
                    }
                    break;
                case 841622184:
                    if (str.equals("male_swipe_auto_factor")) {
                        b = 34;
                    }
                    break;
                case 988403717:
                    if (str.equals("swipe_scale")) {
                        b = 35;
                    }
                    break;
                case 1198589620:
                    if (str.equals("male_swipe_auto_rotate")) {
                        b = 36;
                    }
                    break;
                case 1211744922:
                    if (str.equals("scale_use_opt_during")) {
                        b = 37;
                    }
                    break;
                case 1325131049:
                    if (str.equals("swipe_auto_female_during")) {
                        b = 38;
                    }
                    break;
                case 1580768386:
                    if (str.equals("swipe_mine_value_male")) {
                        b = 39;
                    }
                    break;
                case 1661380078:
                    if (str.equals("female_swipe_auto_width")) {
                        b = 40;
                    }
                    break;
                case 1680542305:
                    if (str.equals("swipe_back_female_during")) {
                        b = 41;
                    }
                    break;
                case 1870829679:
                    if (str.equals("swipe_trans_y_male")) {
                        b = 42;
                    }
                    break;
                case 1957017900:
                    if (str.equals("swipe_right_female_during")) {
                        b = 43;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    cardSwipeConfig.swipe_reset_female_during = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    cardSwipeConfig.swipe_progress_value = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    cardSwipeConfig.swipe_right_male_during = jsonParser.getValueAsLong();
                    return true;
                case 3:
                    cardSwipeConfig.swipe_trans_y_female = jsonParser.getValueAsLong();
                    return true;
                case 4:
                    cardSwipeConfig.scale_opt = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    cardSwipeConfig.swipe_out_value_female = jsonParser.getValueAsInt();
                    return true;
                case 6:
                    cardSwipeConfig.scale_alpha_opt = jsonParser.getValueAsBoolean();
                    return true;
                case 7:
                    cardSwipeConfig.swipe_reset_male_during = jsonParser.getValueAsLong();
                    return true;
                case 8:
                    cardSwipeConfig.swipe_mine_value_female = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    cardSwipeConfig.swipe_item_diff_female = jsonParser.getValueAsInt();
                    return true;
                case 10:
                    cardSwipeConfig.swipe_auto_male_during = jsonParser.getValueAsLong();
                    return true;
                case 11:
                    cardSwipeConfig.swipe_speed_check_male = jsonParser.getValueAsDouble();
                    return true;
                case 12:
                    cardSwipeConfig.male_swipe_auto_width = jsonParser.getValueAsDouble();
                    return true;
                case 13:
                    cardSwipeConfig.scale_opt_during = jsonParser.getValueAsLong();
                    return true;
                case 14:
                    cardSwipeConfig.swipe_speed_check_female = jsonParser.getValueAsDouble();
                    return true;
                case 15:
                    cardSwipeConfig.swipe_type_factor = jsonParser.getValueAsDouble();
                    return true;
                case 16:
                    cardSwipeConfig.swipe_scale_start_alpha = jsonParser.getValueAsDouble();
                    return true;
                case 17:
                    cardSwipeConfig.swipe_up_female_during = jsonParser.getValueAsLong();
                    return true;
                case 18:
                    cardSwipeConfig.swipe_back_male_during = jsonParser.getValueAsLong();
                    return true;
                case 19:
                    cardSwipeConfig.swipe_rotation_male = jsonParser.getValueAsDouble();
                    return true;
                case 20:
                    cardSwipeConfig.config_version = jsonParser.getValueAsInt();
                    return true;
                case 21:
                    cardSwipeConfig.female_swipe_auto_factor = jsonParser.getValueAsDouble();
                    return true;
                case 22:
                    cardSwipeConfig.female_swipe_auto_rotate = jsonParser.getValueAsDouble();
                    return true;
                case 23:
                    cardSwipeConfig.swipe_speed_factor_female = jsonParser.getValueAsDouble();
                    return true;
                case 24:
                    cardSwipeConfig.swipe_speed_factor_male = jsonParser.getValueAsDouble();
                    return true;
                case 25:
                    cardSwipeConfig.scale_alpha_speed = jsonParser.getValueAsDouble();
                    return true;
                case 26:
                    cardSwipeConfig.swipe_item_diff_male = jsonParser.getValueAsInt();
                    return true;
                case 27:
                    cardSwipeConfig.could_double_click = jsonParser.getValueAsBoolean();
                    return true;
                case 28:
                    cardSwipeConfig.swipe_out_value_male = jsonParser.getValueAsInt();
                    return true;
                case 29:
                    cardSwipeConfig.swipe_rotation_female = jsonParser.getValueAsDouble();
                    return true;
                case 30:
                    cardSwipeConfig.swipe_fix_speed = jsonParser.getValueAsInt();
                    return true;
                case 31:
                    cardSwipeConfig.swipe_left_male_during = jsonParser.getValueAsLong();
                    return true;
                case 32:
                    cardSwipeConfig.swipe_left_female_during = jsonParser.getValueAsLong();
                    return true;
                case 33:
                    cardSwipeConfig.swipe_up_male_during = jsonParser.getValueAsLong();
                    return true;
                case 34:
                    cardSwipeConfig.male_swipe_auto_factor = jsonParser.getValueAsDouble();
                    return true;
                case 35:
                    cardSwipeConfig.swipe_scale = jsonParser.getValueAsDouble();
                    return true;
                case 36:
                    cardSwipeConfig.male_swipe_auto_rotate = jsonParser.getValueAsDouble();
                    return true;
                case 37:
                    cardSwipeConfig.scale_use_opt_during = jsonParser.getValueAsBoolean();
                    return true;
                case 38:
                    cardSwipeConfig.swipe_auto_female_during = jsonParser.getValueAsLong();
                    return true;
                case 39:
                    cardSwipeConfig.swipe_mine_value_male = jsonParser.getValueAsInt();
                    return true;
                case 40:
                    cardSwipeConfig.female_swipe_auto_width = jsonParser.getValueAsDouble();
                    return true;
                case 41:
                    cardSwipeConfig.swipe_back_female_during = jsonParser.getValueAsLong();
                    return true;
                case 42:
                    cardSwipeConfig.swipe_trans_y_male = jsonParser.getValueAsLong();
                    return true;
                case 43:
                    cardSwipeConfig.swipe_right_female_during = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(CardSwipeConfig cardSwipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2053177569:
                    if (str.equals("swipe_reset_female_during")) {
                        b = 0;
                    }
                    break;
                case -1937558396:
                    if (str.equals("swipe_progress_value")) {
                        b = 1;
                    }
                    break;
                case -1927173813:
                    if (str.equals("swipe_right_male_during")) {
                        b = 2;
                    }
                    break;
                case -1920656082:
                    if (str.equals("swipe_trans_y_female")) {
                        b = 3;
                    }
                    break;
                case -1877593538:
                    if (str.equals("scale_opt")) {
                        b = 4;
                    }
                    break;
                case -1774617200:
                    if (str.equals("swipe_out_value_female")) {
                        b = 5;
                    }
                    break;
                case -1760878691:
                    if (str.equals("scale_alpha_opt")) {
                        b = 6;
                    }
                    break;
                case -1752576002:
                    if (str.equals("swipe_reset_male_during")) {
                        b = 7;
                    }
                    break;
                case -1496684415:
                    if (str.equals("swipe_mine_value_female")) {
                        b = 8;
                    }
                    break;
                case -1428619265:
                    if (str.equals("swipe_item_diff_female")) {
                        b = 9;
                    }
                    break;
                case -1172524920:
                    if (str.equals("swipe_auto_male_during")) {
                        b = 10;
                    }
                    break;
                case -1077792703:
                    if (str.equals("swipe_speed_check_male")) {
                        b = 11;
                    }
                    break;
                case -1065290419:
                    if (str.equals("male_swipe_auto_width")) {
                        b = 12;
                    }
                    break;
                case -1053741214:
                    if (str.equals("scale_opt_during")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -868349824:
                    if (str.equals("swipe_speed_check_female")) {
                        b = 14;
                    }
                    break;
                case -723236753:
                    if (str.equals("swipe_type_factor")) {
                        b = 15;
                    }
                    break;
                case -627974649:
                    if (str.equals("swipe_scale_start_alpha")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -594145707:
                    if (str.equals("swipe_up_female_during")) {
                        b = 17;
                    }
                    break;
                case -591150144:
                    if (str.equals("swipe_back_male_during")) {
                        b = 18;
                    }
                    break;
                case -589393431:
                    if (str.equals("swipe_rotation_male")) {
                        b = 19;
                    }
                    break;
                case -533338917:
                    if (str.equals("config_version")) {
                        b = 20;
                    }
                    break;
                case -530938329:
                    if (str.equals("female_swipe_auto_factor")) {
                        b = 21;
                    }
                    break;
                case -173970893:
                    if (str.equals("female_swipe_auto_rotate")) {
                        b = 22;
                    }
                    break;
                case -166883905:
                    if (str.equals("swipe_speed_factor_female")) {
                        b = 23;
                    }
                    break;
                case -102762176:
                    if (str.equals("swipe_speed_factor_male")) {
                        b = 24;
                    }
                    break;
                case 16375473:
                    if (str.equals("scale_alpha_speed")) {
                        b = 25;
                    }
                    break;
                case 56818560:
                    if (str.equals("swipe_item_diff_male")) {
                        b = 26;
                    }
                    break;
                case 225893976:
                    if (str.equals("could_double_click")) {
                        b = 27;
                    }
                    break;
                case 288860497:
                    if (str.equals("swipe_out_value_male")) {
                        b = 28;
                    }
                    break;
                case 331915304:
                    if (str.equals("swipe_rotation_female")) {
                        b = 29;
                    }
                    break;
                case 365675736:
                    if (str.equals("swipe_fix_speed")) {
                        b = 30;
                    }
                    break;
                case 471379680:
                    if (str.equals("swipe_left_male_during")) {
                        b = 31;
                    }
                    break;
                case 569486721:
                    if (str.equals("swipe_left_female_during")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 675755188:
                    if (str.equals("swipe_up_male_during")) {
                        b = 33;
                    }
                    break;
                case 841622184:
                    if (str.equals("male_swipe_auto_factor")) {
                        b = 34;
                    }
                    break;
                case 988403717:
                    if (str.equals("swipe_scale")) {
                        b = 35;
                    }
                    break;
                case 1198589620:
                    if (str.equals("male_swipe_auto_rotate")) {
                        b = 36;
                    }
                    break;
                case 1211744922:
                    if (str.equals("scale_use_opt_during")) {
                        b = 37;
                    }
                    break;
                case 1325131049:
                    if (str.equals("swipe_auto_female_during")) {
                        b = 38;
                    }
                    break;
                case 1580768386:
                    if (str.equals("swipe_mine_value_male")) {
                        b = 39;
                    }
                    break;
                case 1661380078:
                    if (str.equals("female_swipe_auto_width")) {
                        b = 40;
                    }
                    break;
                case 1680542305:
                    if (str.equals("swipe_back_female_during")) {
                        b = 41;
                    }
                    break;
                case 1870829679:
                    if (str.equals("swipe_trans_y_male")) {
                        b = 42;
                    }
                    break;
                case 1957017900:
                    if (str.equals("swipe_right_female_during")) {
                        b = 43;
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
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                    return true;
                default:
                    return super.parseFieldCheck(cardSwipeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardSwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardSwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardSwipeConfig new_() {
        CardSwipeConfig cardSwipeConfig = new CardSwipeConfig();
        cardSwipeConfig.nullCheck();
        return cardSwipeConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardSwipeConfig mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = i35;
        return i35;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
