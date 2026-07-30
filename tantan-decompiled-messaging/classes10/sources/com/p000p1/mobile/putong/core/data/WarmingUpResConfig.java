package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.WarmingUpEmoItem;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class WarmingUpResConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "warmingupresconfig";

    @NonNull
    @ProtobufIndex(index = 18)
    public String core_down_left_bottom_1;

    @NonNull
    @ProtobufIndex(index = 19)
    public String core_down_left_bottom_2;

    @NonNull
    @ProtobufIndex(index = 20)
    public String core_down_left_bottom_3;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String core_love_heart_1;

    @NonNull
    @ProtobufIndex(index = 11)
    public String core_love_heart_2;

    @NonNull
    @ProtobufIndex(index = 12)
    public String core_love_heart_3;

    @NonNull
    @ProtobufIndex(index = 13)
    public String core_love_heart_4;

    @NonNull
    @ProtobufIndex(index = 21)
    public String core_temp_down_rq;

    @NonNull
    @ProtobufIndex(index = 14)
    public String core_up_left_bottom_1;

    @NonNull
    @ProtobufIndex(index = 15)
    public String core_up_left_bottom_2;

    @NonNull
    @ProtobufIndex(index = 16)
    public String core_up_left_bottom_3;

    @NonNull
    @ProtobufIndex(index = 17)
    public String core_up_left_bottom_4;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String core_warming_up_rq_0;

    @NonNull
    @ProtobufIndex(index = 6)
    public String core_warming_up_rq_1;

    @NonNull
    @ProtobufIndex(index = 7)
    public String core_warming_up_rq_2;

    @NonNull
    @ProtobufIndex(index = 8)
    public String core_warming_up_rq_3;

    @NonNull
    @ProtobufIndex(index = 9)
    public String core_warming_up_rq_4;

    @NonNull
    @ProtobufIndex(index = 4)
    public String h5_url;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<WarmingUpEmoItem> restore_heat_guide_intimate_sticker;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<WarmingUpEmoItem> restore_heat_guide_poke_sticker;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<WarmingUpEmoItem> restore_heat_guide_text;
    public static ProtobufAdapter<WarmingUpResConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WarmingUpResConfig>() { // from class: com.p1.mobile.putong.core.data.WarmingUpResConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WarmingUpResConfig warmingUpResConfig) {
            List<WarmingUpEmoItem> list = warmingUpResConfig.restore_heat_guide_text;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<WarmingUpEmoItem> list2 = warmingUpResConfig.restore_heat_guide_poke_sticker;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<WarmingUpEmoItem> list3 = warmingUpResConfig.restore_heat_guide_intimate_sticker;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = warmingUpResConfig.h5_url;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(4, str);
            }
            String str2 = warmingUpResConfig.core_warming_up_rq_0;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(5, str2);
            }
            String str3 = warmingUpResConfig.core_warming_up_rq_1;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(6, str3);
            }
            String str4 = warmingUpResConfig.core_warming_up_rq_2;
            if (str4 != null) {
                iL += CodedOutputByteBufferNano.o(7, str4);
            }
            String str5 = warmingUpResConfig.core_warming_up_rq_3;
            if (str5 != null) {
                iL += CodedOutputByteBufferNano.o(8, str5);
            }
            String str6 = warmingUpResConfig.core_warming_up_rq_4;
            if (str6 != null) {
                iL += CodedOutputByteBufferNano.o(9, str6);
            }
            String str7 = warmingUpResConfig.core_love_heart_1;
            if (str7 != null) {
                iL += CodedOutputByteBufferNano.o(10, str7);
            }
            String str8 = warmingUpResConfig.core_love_heart_2;
            if (str8 != null) {
                iL += CodedOutputByteBufferNano.o(11, str8);
            }
            String str9 = warmingUpResConfig.core_love_heart_3;
            if (str9 != null) {
                iL += CodedOutputByteBufferNano.o(12, str9);
            }
            String str10 = warmingUpResConfig.core_love_heart_4;
            if (str10 != null) {
                iL += CodedOutputByteBufferNano.o(13, str10);
            }
            String str11 = warmingUpResConfig.core_up_left_bottom_1;
            if (str11 != null) {
                iL += CodedOutputByteBufferNano.o(14, str11);
            }
            String str12 = warmingUpResConfig.core_up_left_bottom_2;
            if (str12 != null) {
                iL += CodedOutputByteBufferNano.o(15, str12);
            }
            String str13 = warmingUpResConfig.core_up_left_bottom_3;
            if (str13 != null) {
                iL += CodedOutputByteBufferNano.o(16, str13);
            }
            String str14 = warmingUpResConfig.core_up_left_bottom_4;
            if (str14 != null) {
                iL += CodedOutputByteBufferNano.o(17, str14);
            }
            String str15 = warmingUpResConfig.core_down_left_bottom_1;
            if (str15 != null) {
                iL += CodedOutputByteBufferNano.o(18, str15);
            }
            String str16 = warmingUpResConfig.core_down_left_bottom_2;
            if (str16 != null) {
                iL += CodedOutputByteBufferNano.o(19, str16);
            }
            String str17 = warmingUpResConfig.core_down_left_bottom_3;
            if (str17 != null) {
                iL += CodedOutputByteBufferNano.o(20, str17);
            }
            String str18 = warmingUpResConfig.core_temp_down_rq;
            if (str18 != null) {
                iL += CodedOutputByteBufferNano.o(21, str18);
            }
            ((MessageNano) warmingUpResConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WarmingUpResConfig m16313parse(nb5 nb5Var) throws IOException {
            WarmingUpResConfig warmingUpResConfig = new WarmingUpResConfig();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (warmingUpResConfig.restore_heat_guide_text == null) {
                            warmingUpResConfig.restore_heat_guide_text = new ArrayList();
                        }
                        if (warmingUpResConfig.restore_heat_guide_poke_sticker == null) {
                            warmingUpResConfig.restore_heat_guide_poke_sticker = new ArrayList();
                        }
                        if (warmingUpResConfig.restore_heat_guide_intimate_sticker == null) {
                            warmingUpResConfig.restore_heat_guide_intimate_sticker = new ArrayList();
                        }
                        if (warmingUpResConfig.h5_url == null) {
                            warmingUpResConfig.h5_url = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_0 == null) {
                            warmingUpResConfig.core_warming_up_rq_0 = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_1 == null) {
                            warmingUpResConfig.core_warming_up_rq_1 = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_2 == null) {
                            warmingUpResConfig.core_warming_up_rq_2 = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_3 == null) {
                            warmingUpResConfig.core_warming_up_rq_3 = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_4 == null) {
                            warmingUpResConfig.core_warming_up_rq_4 = "";
                        }
                        if (warmingUpResConfig.core_love_heart_1 == null) {
                            warmingUpResConfig.core_love_heart_1 = "";
                        }
                        if (warmingUpResConfig.core_love_heart_2 == null) {
                            warmingUpResConfig.core_love_heart_2 = "";
                        }
                        if (warmingUpResConfig.core_love_heart_3 == null) {
                            warmingUpResConfig.core_love_heart_3 = "";
                        }
                        if (warmingUpResConfig.core_love_heart_4 == null) {
                            warmingUpResConfig.core_love_heart_4 = "";
                        }
                        if (warmingUpResConfig.core_up_left_bottom_1 == null) {
                            warmingUpResConfig.core_up_left_bottom_1 = "";
                        }
                        if (warmingUpResConfig.core_up_left_bottom_2 == null) {
                            warmingUpResConfig.core_up_left_bottom_2 = "";
                        }
                        if (warmingUpResConfig.core_up_left_bottom_3 == null) {
                            warmingUpResConfig.core_up_left_bottom_3 = "";
                        }
                        if (warmingUpResConfig.core_up_left_bottom_4 == null) {
                            warmingUpResConfig.core_up_left_bottom_4 = "";
                        }
                        if (warmingUpResConfig.core_down_left_bottom_1 == null) {
                            warmingUpResConfig.core_down_left_bottom_1 = "";
                        }
                        if (warmingUpResConfig.core_down_left_bottom_2 == null) {
                            warmingUpResConfig.core_down_left_bottom_2 = "";
                        }
                        if (warmingUpResConfig.core_down_left_bottom_3 == null) {
                            warmingUpResConfig.core_down_left_bottom_3 = "";
                        }
                        if (warmingUpResConfig.core_temp_down_rq == null) {
                            warmingUpResConfig.core_temp_down_rq = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        warmingUpResConfig.restore_heat_guide_text = (List) nb5Var.l(WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        warmingUpResConfig.restore_heat_guide_poke_sticker = (List) nb5Var.l(WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        warmingUpResConfig.restore_heat_guide_intimate_sticker = (List) nb5Var.l(WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        warmingUpResConfig.h5_url = nb5Var.s();
                        continue;
                    case 42:
                        warmingUpResConfig.core_warming_up_rq_0 = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        warmingUpResConfig.core_warming_up_rq_1 = nb5Var.s();
                        continue;
                    case 58:
                        warmingUpResConfig.core_warming_up_rq_2 = nb5Var.s();
                        continue;
                    case 66:
                        warmingUpResConfig.core_warming_up_rq_3 = nb5Var.s();
                        continue;
                    case 74:
                        warmingUpResConfig.core_warming_up_rq_4 = nb5Var.s();
                        continue;
                    case 82:
                        warmingUpResConfig.core_love_heart_1 = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        warmingUpResConfig.core_love_heart_2 = nb5Var.s();
                        continue;
                    case 98:
                        warmingUpResConfig.core_love_heart_3 = nb5Var.s();
                        continue;
                    case 106:
                        warmingUpResConfig.core_love_heart_4 = nb5Var.s();
                        continue;
                    case 114:
                        warmingUpResConfig.core_up_left_bottom_1 = nb5Var.s();
                        continue;
                    case 122:
                        warmingUpResConfig.core_up_left_bottom_2 = nb5Var.s();
                        continue;
                    case 130:
                        warmingUpResConfig.core_up_left_bottom_3 = nb5Var.s();
                        continue;
                    case 138:
                        warmingUpResConfig.core_up_left_bottom_4 = nb5Var.s();
                        continue;
                    case 146:
                        warmingUpResConfig.core_down_left_bottom_1 = nb5Var.s();
                        continue;
                    case 154:
                        warmingUpResConfig.core_down_left_bottom_2 = nb5Var.s();
                        continue;
                    case 162:
                        warmingUpResConfig.core_down_left_bottom_3 = nb5Var.s();
                        continue;
                    case 170:
                        warmingUpResConfig.core_temp_down_rq = nb5Var.s();
                        continue;
                    default:
                        if (warmingUpResConfig.restore_heat_guide_text == null) {
                            warmingUpResConfig.restore_heat_guide_text = new ArrayList();
                        }
                        if (warmingUpResConfig.restore_heat_guide_poke_sticker == null) {
                            warmingUpResConfig.restore_heat_guide_poke_sticker = new ArrayList();
                        }
                        if (warmingUpResConfig.restore_heat_guide_intimate_sticker == null) {
                            warmingUpResConfig.restore_heat_guide_intimate_sticker = new ArrayList();
                        }
                        if (warmingUpResConfig.h5_url == null) {
                            warmingUpResConfig.h5_url = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_0 == null) {
                            warmingUpResConfig.core_warming_up_rq_0 = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_1 == null) {
                            warmingUpResConfig.core_warming_up_rq_1 = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_2 == null) {
                            warmingUpResConfig.core_warming_up_rq_2 = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_3 == null) {
                            warmingUpResConfig.core_warming_up_rq_3 = "";
                        }
                        if (warmingUpResConfig.core_warming_up_rq_4 == null) {
                            warmingUpResConfig.core_warming_up_rq_4 = "";
                        }
                        if (warmingUpResConfig.core_love_heart_1 == null) {
                            warmingUpResConfig.core_love_heart_1 = "";
                        }
                        if (warmingUpResConfig.core_love_heart_2 == null) {
                            warmingUpResConfig.core_love_heart_2 = "";
                        }
                        if (warmingUpResConfig.core_love_heart_3 == null) {
                            warmingUpResConfig.core_love_heart_3 = "";
                        }
                        if (warmingUpResConfig.core_love_heart_4 == null) {
                            warmingUpResConfig.core_love_heart_4 = "";
                        }
                        if (warmingUpResConfig.core_up_left_bottom_1 == null) {
                            warmingUpResConfig.core_up_left_bottom_1 = "";
                        }
                        if (warmingUpResConfig.core_up_left_bottom_2 == null) {
                            warmingUpResConfig.core_up_left_bottom_2 = "";
                        }
                        if (warmingUpResConfig.core_up_left_bottom_3 == null) {
                            warmingUpResConfig.core_up_left_bottom_3 = "";
                        }
                        if (warmingUpResConfig.core_up_left_bottom_4 == null) {
                            warmingUpResConfig.core_up_left_bottom_4 = "";
                        }
                        if (warmingUpResConfig.core_down_left_bottom_1 == null) {
                            warmingUpResConfig.core_down_left_bottom_1 = "";
                        }
                        if (warmingUpResConfig.core_down_left_bottom_2 == null) {
                            warmingUpResConfig.core_down_left_bottom_2 = "";
                        }
                        if (warmingUpResConfig.core_down_left_bottom_3 == null) {
                            warmingUpResConfig.core_down_left_bottom_3 = "";
                        }
                        if (warmingUpResConfig.core_temp_down_rq == null) {
                            warmingUpResConfig.core_temp_down_rq = "";
                            return warmingUpResConfig;
                        }
                        break;
                }
            }
            return warmingUpResConfig;
        }

        public void serialize(WarmingUpResConfig warmingUpResConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<WarmingUpEmoItem> list = warmingUpResConfig.restore_heat_guide_text;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<WarmingUpEmoItem> list2 = warmingUpResConfig.restore_heat_guide_poke_sticker;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<WarmingUpEmoItem> list3 = warmingUpResConfig.restore_heat_guide_intimate_sticker;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, WarmingUpEmoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = warmingUpResConfig.h5_url;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            String str2 = warmingUpResConfig.core_warming_up_rq_0;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            String str3 = warmingUpResConfig.core_warming_up_rq_1;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            String str4 = warmingUpResConfig.core_warming_up_rq_2;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
            String str5 = warmingUpResConfig.core_warming_up_rq_3;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            String str6 = warmingUpResConfig.core_warming_up_rq_4;
            if (str6 != null) {
                codedOutputByteBufferNano.R(9, str6);
            }
            String str7 = warmingUpResConfig.core_love_heart_1;
            if (str7 != null) {
                codedOutputByteBufferNano.R(10, str7);
            }
            String str8 = warmingUpResConfig.core_love_heart_2;
            if (str8 != null) {
                codedOutputByteBufferNano.R(11, str8);
            }
            String str9 = warmingUpResConfig.core_love_heart_3;
            if (str9 != null) {
                codedOutputByteBufferNano.R(12, str9);
            }
            String str10 = warmingUpResConfig.core_love_heart_4;
            if (str10 != null) {
                codedOutputByteBufferNano.R(13, str10);
            }
            String str11 = warmingUpResConfig.core_up_left_bottom_1;
            if (str11 != null) {
                codedOutputByteBufferNano.R(14, str11);
            }
            String str12 = warmingUpResConfig.core_up_left_bottom_2;
            if (str12 != null) {
                codedOutputByteBufferNano.R(15, str12);
            }
            String str13 = warmingUpResConfig.core_up_left_bottom_3;
            if (str13 != null) {
                codedOutputByteBufferNano.R(16, str13);
            }
            String str14 = warmingUpResConfig.core_up_left_bottom_4;
            if (str14 != null) {
                codedOutputByteBufferNano.R(17, str14);
            }
            String str15 = warmingUpResConfig.core_down_left_bottom_1;
            if (str15 != null) {
                codedOutputByteBufferNano.R(18, str15);
            }
            String str16 = warmingUpResConfig.core_down_left_bottom_2;
            if (str16 != null) {
                codedOutputByteBufferNano.R(19, str16);
            }
            String str17 = warmingUpResConfig.core_down_left_bottom_3;
            if (str17 != null) {
                codedOutputByteBufferNano.R(20, str17);
            }
            String str18 = warmingUpResConfig.core_temp_down_rq;
            if (str18 != null) {
                codedOutputByteBufferNano.R(21, str18);
            }
        }
    };
    public static JsonAdapter<WarmingUpResConfig> JSON_ADAPTER = new ObjectJsonAdapter<WarmingUpResConfig>() { // from class: com.p1.mobile.putong.core.data.WarmingUpResConfig.2
        public Class getDataClass() {
            return WarmingUpResConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WarmingUpResConfig m16314newInstance() {
            return new WarmingUpResConfig();
        }

        public boolean parseField(WarmingUpResConfig warmingUpResConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "core_down_left_bottom_1":
                    warmingUpResConfig.core_down_left_bottom_1 = jsonParser.getValueAsString();
                    return true;
                case "core_down_left_bottom_2":
                    warmingUpResConfig.core_down_left_bottom_2 = jsonParser.getValueAsString();
                    return true;
                case "core_down_left_bottom_3":
                    warmingUpResConfig.core_down_left_bottom_3 = jsonParser.getValueAsString();
                    return true;
                case "restore_heat_guide_poke_sticker":
                    warmingUpResConfig.restore_heat_guide_poke_sticker = JsonAdapter.parseArray(jsonParser, WarmingUpEmoItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "h5_url":
                    warmingUpResConfig.h5_url = jsonParser.getValueAsString();
                    return true;
                case "restore_heat_guide_text":
                    warmingUpResConfig.restore_heat_guide_text = JsonAdapter.parseArray(jsonParser, WarmingUpEmoItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "core_temp_down_rq":
                    warmingUpResConfig.core_temp_down_rq = jsonParser.getValueAsString();
                    return true;
                case "core_up_left_bottom_1":
                    warmingUpResConfig.core_up_left_bottom_1 = jsonParser.getValueAsString();
                    return true;
                case "core_up_left_bottom_2":
                    warmingUpResConfig.core_up_left_bottom_2 = jsonParser.getValueAsString();
                    return true;
                case "core_up_left_bottom_3":
                    warmingUpResConfig.core_up_left_bottom_3 = jsonParser.getValueAsString();
                    return true;
                case "core_up_left_bottom_4":
                    warmingUpResConfig.core_up_left_bottom_4 = jsonParser.getValueAsString();
                    return true;
                case "core_warming_up_rq_0":
                    warmingUpResConfig.core_warming_up_rq_0 = jsonParser.getValueAsString();
                    return true;
                case "core_warming_up_rq_1":
                    warmingUpResConfig.core_warming_up_rq_1 = jsonParser.getValueAsString();
                    return true;
                case "core_warming_up_rq_2":
                    warmingUpResConfig.core_warming_up_rq_2 = jsonParser.getValueAsString();
                    return true;
                case "core_warming_up_rq_3":
                    warmingUpResConfig.core_warming_up_rq_3 = jsonParser.getValueAsString();
                    return true;
                case "core_warming_up_rq_4":
                    warmingUpResConfig.core_warming_up_rq_4 = jsonParser.getValueAsString();
                    return true;
                case "restore_heat_guide_intimate_sticker":
                    warmingUpResConfig.restore_heat_guide_intimate_sticker = JsonAdapter.parseArray(jsonParser, WarmingUpEmoItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "core_love_heart_1":
                    warmingUpResConfig.core_love_heart_1 = jsonParser.getValueAsString();
                    return true;
                case "core_love_heart_2":
                    warmingUpResConfig.core_love_heart_2 = jsonParser.getValueAsString();
                    return true;
                case "core_love_heart_3":
                    warmingUpResConfig.core_love_heart_3 = jsonParser.getValueAsString();
                    return true;
                case "core_love_heart_4":
                    warmingUpResConfig.core_love_heart_4 = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WarmingUpResConfig warmingUpResConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "core_down_left_bottom_1":
                case "core_down_left_bottom_2":
                case "core_down_left_bottom_3":
                case "restore_heat_guide_poke_sticker":
                case "h5_url":
                case "restore_heat_guide_text":
                case "core_temp_down_rq":
                case "core_up_left_bottom_1":
                case "core_up_left_bottom_2":
                case "core_up_left_bottom_3":
                case "core_up_left_bottom_4":
                case "core_warming_up_rq_0":
                case "core_warming_up_rq_1":
                case "core_warming_up_rq_2":
                case "core_warming_up_rq_3":
                case "core_warming_up_rq_4":
                case "restore_heat_guide_intimate_sticker":
                case "core_love_heart_1":
                case "core_love_heart_2":
                case "core_love_heart_3":
                case "core_love_heart_4":
                    return true;
                default:
                    return super.parseFieldCheck(warmingUpResConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(WarmingUpResConfig warmingUpResConfig, JsonGenerator jsonGenerator) throws IOException {
            if (warmingUpResConfig.restore_heat_guide_text != null) {
                jsonGenerator.writeFieldName("restore_heat_guide_text");
                JsonAdapter.serializeArray(warmingUpResConfig.restore_heat_guide_text, jsonGenerator, WarmingUpEmoItem.JSON_ADAPTER);
            }
            if (warmingUpResConfig.restore_heat_guide_poke_sticker != null) {
                jsonGenerator.writeFieldName("restore_heat_guide_poke_sticker");
                JsonAdapter.serializeArray(warmingUpResConfig.restore_heat_guide_poke_sticker, jsonGenerator, WarmingUpEmoItem.JSON_ADAPTER);
            }
            if (warmingUpResConfig.restore_heat_guide_intimate_sticker != null) {
                jsonGenerator.writeFieldName("restore_heat_guide_intimate_sticker");
                JsonAdapter.serializeArray(warmingUpResConfig.restore_heat_guide_intimate_sticker, jsonGenerator, WarmingUpEmoItem.JSON_ADAPTER);
            }
            String str = warmingUpResConfig.h5_url;
            if (str != null) {
                jsonGenerator.writeStringField("h5_url", str);
            }
            String str2 = warmingUpResConfig.core_warming_up_rq_0;
            if (str2 != null) {
                jsonGenerator.writeStringField("core_warming_up_rq_0", str2);
            }
            String str3 = warmingUpResConfig.core_warming_up_rq_1;
            if (str3 != null) {
                jsonGenerator.writeStringField("core_warming_up_rq_1", str3);
            }
            String str4 = warmingUpResConfig.core_warming_up_rq_2;
            if (str4 != null) {
                jsonGenerator.writeStringField("core_warming_up_rq_2", str4);
            }
            String str5 = warmingUpResConfig.core_warming_up_rq_3;
            if (str5 != null) {
                jsonGenerator.writeStringField("core_warming_up_rq_3", str5);
            }
            String str6 = warmingUpResConfig.core_warming_up_rq_4;
            if (str6 != null) {
                jsonGenerator.writeStringField("core_warming_up_rq_4", str6);
            }
            String str7 = warmingUpResConfig.core_love_heart_1;
            if (str7 != null) {
                jsonGenerator.writeStringField("core_love_heart_1", str7);
            }
            String str8 = warmingUpResConfig.core_love_heart_2;
            if (str8 != null) {
                jsonGenerator.writeStringField("core_love_heart_2", str8);
            }
            String str9 = warmingUpResConfig.core_love_heart_3;
            if (str9 != null) {
                jsonGenerator.writeStringField("core_love_heart_3", str9);
            }
            String str10 = warmingUpResConfig.core_love_heart_4;
            if (str10 != null) {
                jsonGenerator.writeStringField("core_love_heart_4", str10);
            }
            String str11 = warmingUpResConfig.core_up_left_bottom_1;
            if (str11 != null) {
                jsonGenerator.writeStringField("core_up_left_bottom_1", str11);
            }
            String str12 = warmingUpResConfig.core_up_left_bottom_2;
            if (str12 != null) {
                jsonGenerator.writeStringField("core_up_left_bottom_2", str12);
            }
            String str13 = warmingUpResConfig.core_up_left_bottom_3;
            if (str13 != null) {
                jsonGenerator.writeStringField("core_up_left_bottom_3", str13);
            }
            String str14 = warmingUpResConfig.core_up_left_bottom_4;
            if (str14 != null) {
                jsonGenerator.writeStringField("core_up_left_bottom_4", str14);
            }
            String str15 = warmingUpResConfig.core_down_left_bottom_1;
            if (str15 != null) {
                jsonGenerator.writeStringField("core_down_left_bottom_1", str15);
            }
            String str16 = warmingUpResConfig.core_down_left_bottom_2;
            if (str16 != null) {
                jsonGenerator.writeStringField("core_down_left_bottom_2", str16);
            }
            String str17 = warmingUpResConfig.core_down_left_bottom_3;
            if (str17 != null) {
                jsonGenerator.writeStringField("core_down_left_bottom_3", str17);
            }
            String str18 = warmingUpResConfig.core_temp_down_rq;
            if (str18 != null) {
                jsonGenerator.writeStringField("core_temp_down_rq", str18);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WarmingUpResConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WarmingUpResConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WarmingUpResConfig new_() {
        WarmingUpResConfig warmingUpResConfig = new WarmingUpResConfig();
        warmingUpResConfig.nullCheck();
        return warmingUpResConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WarmingUpResConfig m16312clone() {
        WarmingUpResConfig warmingUpResConfig = new WarmingUpResConfig();
        List<WarmingUpEmoItem> list = this.restore_heat_guide_text;
        if (list != null) {
            warmingUpResConfig.restore_heat_guide_text = ValueObject.util_map(list, new w9j() { // from class: l.yfp0
                public final Object call(Object obj) {
                    return ((WarmingUpEmoItem) obj).m16304clone();
                }
            });
        }
        List<WarmingUpEmoItem> list2 = this.restore_heat_guide_poke_sticker;
        if (list2 != null) {
            warmingUpResConfig.restore_heat_guide_poke_sticker = ValueObject.util_map(list2, new w9j() { // from class: l.zfp0
                public final Object call(Object obj) {
                    return ((WarmingUpEmoItem) obj).m16304clone();
                }
            });
        }
        List<WarmingUpEmoItem> list3 = this.restore_heat_guide_intimate_sticker;
        if (list3 != null) {
            warmingUpResConfig.restore_heat_guide_intimate_sticker = ValueObject.util_map(list3, new w9j() { // from class: l.agp0
                public final Object call(Object obj) {
                    return ((WarmingUpEmoItem) obj).m16304clone();
                }
            });
        }
        warmingUpResConfig.h5_url = this.h5_url;
        warmingUpResConfig.core_warming_up_rq_0 = this.core_warming_up_rq_0;
        warmingUpResConfig.core_warming_up_rq_1 = this.core_warming_up_rq_1;
        warmingUpResConfig.core_warming_up_rq_2 = this.core_warming_up_rq_2;
        warmingUpResConfig.core_warming_up_rq_3 = this.core_warming_up_rq_3;
        warmingUpResConfig.core_warming_up_rq_4 = this.core_warming_up_rq_4;
        warmingUpResConfig.core_love_heart_1 = this.core_love_heart_1;
        warmingUpResConfig.core_love_heart_2 = this.core_love_heart_2;
        warmingUpResConfig.core_love_heart_3 = this.core_love_heart_3;
        warmingUpResConfig.core_love_heart_4 = this.core_love_heart_4;
        warmingUpResConfig.core_up_left_bottom_1 = this.core_up_left_bottom_1;
        warmingUpResConfig.core_up_left_bottom_2 = this.core_up_left_bottom_2;
        warmingUpResConfig.core_up_left_bottom_3 = this.core_up_left_bottom_3;
        warmingUpResConfig.core_up_left_bottom_4 = this.core_up_left_bottom_4;
        warmingUpResConfig.core_down_left_bottom_1 = this.core_down_left_bottom_1;
        warmingUpResConfig.core_down_left_bottom_2 = this.core_down_left_bottom_2;
        warmingUpResConfig.core_down_left_bottom_3 = this.core_down_left_bottom_3;
        warmingUpResConfig.core_temp_down_rq = this.core_temp_down_rq;
        return warmingUpResConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WarmingUpResConfig)) {
            return false;
        }
        WarmingUpResConfig warmingUpResConfig = (WarmingUpResConfig) obj;
        return ValueObject.util_equals(this.restore_heat_guide_text, warmingUpResConfig.restore_heat_guide_text) && ValueObject.util_equals(this.restore_heat_guide_poke_sticker, warmingUpResConfig.restore_heat_guide_poke_sticker) && ValueObject.util_equals(this.restore_heat_guide_intimate_sticker, warmingUpResConfig.restore_heat_guide_intimate_sticker) && ValueObject.util_equals(this.h5_url, warmingUpResConfig.h5_url) && ValueObject.util_equals(this.core_warming_up_rq_0, warmingUpResConfig.core_warming_up_rq_0) && ValueObject.util_equals(this.core_warming_up_rq_1, warmingUpResConfig.core_warming_up_rq_1) && ValueObject.util_equals(this.core_warming_up_rq_2, warmingUpResConfig.core_warming_up_rq_2) && ValueObject.util_equals(this.core_warming_up_rq_3, warmingUpResConfig.core_warming_up_rq_3) && ValueObject.util_equals(this.core_warming_up_rq_4, warmingUpResConfig.core_warming_up_rq_4) && ValueObject.util_equals(this.core_love_heart_1, warmingUpResConfig.core_love_heart_1) && ValueObject.util_equals(this.core_love_heart_2, warmingUpResConfig.core_love_heart_2) && ValueObject.util_equals(this.core_love_heart_3, warmingUpResConfig.core_love_heart_3) && ValueObject.util_equals(this.core_love_heart_4, warmingUpResConfig.core_love_heart_4) && ValueObject.util_equals(this.core_up_left_bottom_1, warmingUpResConfig.core_up_left_bottom_1) && ValueObject.util_equals(this.core_up_left_bottom_2, warmingUpResConfig.core_up_left_bottom_2) && ValueObject.util_equals(this.core_up_left_bottom_3, warmingUpResConfig.core_up_left_bottom_3) && ValueObject.util_equals(this.core_up_left_bottom_4, warmingUpResConfig.core_up_left_bottom_4) && ValueObject.util_equals(this.core_down_left_bottom_1, warmingUpResConfig.core_down_left_bottom_1) && ValueObject.util_equals(this.core_down_left_bottom_2, warmingUpResConfig.core_down_left_bottom_2) && ValueObject.util_equals(this.core_down_left_bottom_3, warmingUpResConfig.core_down_left_bottom_3) && ValueObject.util_equals(this.core_temp_down_rq, warmingUpResConfig.core_temp_down_rq);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<WarmingUpEmoItem> list = this.restore_heat_guide_text;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<WarmingUpEmoItem> list2 = this.restore_heat_guide_poke_sticker;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<WarmingUpEmoItem> list3 = this.restore_heat_guide_intimate_sticker;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str = this.h5_url;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.core_warming_up_rq_0;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.core_warming_up_rq_1;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.core_warming_up_rq_2;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.core_warming_up_rq_3;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.core_warming_up_rq_4;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.core_love_heart_1;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.core_love_heart_2;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.core_love_heart_3;
        int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.core_love_heart_4;
        int iHashCode13 = (iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.core_up_left_bottom_1;
        int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.core_up_left_bottom_2;
        int iHashCode15 = (iHashCode14 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.core_up_left_bottom_3;
        int iHashCode16 = (iHashCode15 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.core_up_left_bottom_4;
        int iHashCode17 = (iHashCode16 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.core_down_left_bottom_1;
        int iHashCode18 = (iHashCode17 + (str15 != null ? str15.hashCode() : 0)) * 41;
        String str16 = this.core_down_left_bottom_2;
        int iHashCode19 = (iHashCode18 + (str16 != null ? str16.hashCode() : 0)) * 41;
        String str17 = this.core_down_left_bottom_3;
        int iHashCode20 = (iHashCode19 + (str17 != null ? str17.hashCode() : 0)) * 41;
        String str18 = this.core_temp_down_rq;
        int iHashCode21 = iHashCode20 + (str18 != null ? str18.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode21;
        return iHashCode21;
    }

    public void nullCheck() {
        if (this.restore_heat_guide_text == null) {
            this.restore_heat_guide_text = new ArrayList();
        }
        if (this.restore_heat_guide_poke_sticker == null) {
            this.restore_heat_guide_poke_sticker = new ArrayList();
        }
        if (this.restore_heat_guide_intimate_sticker == null) {
            this.restore_heat_guide_intimate_sticker = new ArrayList();
        }
        if (this.h5_url == null) {
            this.h5_url = "";
        }
        if (this.core_warming_up_rq_0 == null) {
            this.core_warming_up_rq_0 = "";
        }
        if (this.core_warming_up_rq_1 == null) {
            this.core_warming_up_rq_1 = "";
        }
        if (this.core_warming_up_rq_2 == null) {
            this.core_warming_up_rq_2 = "";
        }
        if (this.core_warming_up_rq_3 == null) {
            this.core_warming_up_rq_3 = "";
        }
        if (this.core_warming_up_rq_4 == null) {
            this.core_warming_up_rq_4 = "";
        }
        if (this.core_love_heart_1 == null) {
            this.core_love_heart_1 = "";
        }
        if (this.core_love_heart_2 == null) {
            this.core_love_heart_2 = "";
        }
        if (this.core_love_heart_3 == null) {
            this.core_love_heart_3 = "";
        }
        if (this.core_love_heart_4 == null) {
            this.core_love_heart_4 = "";
        }
        if (this.core_up_left_bottom_1 == null) {
            this.core_up_left_bottom_1 = "";
        }
        if (this.core_up_left_bottom_2 == null) {
            this.core_up_left_bottom_2 = "";
        }
        if (this.core_up_left_bottom_3 == null) {
            this.core_up_left_bottom_3 = "";
        }
        if (this.core_up_left_bottom_4 == null) {
            this.core_up_left_bottom_4 = "";
        }
        if (this.core_down_left_bottom_1 == null) {
            this.core_down_left_bottom_1 = "";
        }
        if (this.core_down_left_bottom_2 == null) {
            this.core_down_left_bottom_2 = "";
        }
        if (this.core_down_left_bottom_3 == null) {
            this.core_down_left_bottom_3 = "";
        }
        if (this.core_temp_down_rq == null) {
            this.core_temp_down_rq = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
