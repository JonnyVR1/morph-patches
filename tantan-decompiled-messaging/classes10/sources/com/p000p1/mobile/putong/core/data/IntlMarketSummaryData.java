package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class IntlMarketSummaryData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketsummarydata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String bg_color;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String confirm_btn_bg_url;

    @NonNull
    @ProtobufIndex(index = 7)
    public String confirm_btn_color;

    @NonNull
    @ProtobufIndex(index = 8)
    public String confirm_btn_desc;

    @NonNull
    @ProtobufIndex(index = 9)
    public String confirm_btn_font_color;

    @NonNull
    @ProtobufIndex(index = 11)
    public String logo_url;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String main_title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String main_title_font_color;

    @NonNull
    @ProtobufIndex(index = 14)
    public String selected_circle_color;

    @NonNull
    @ProtobufIndex(index = 12)
    public String sub_confirm_button_desc;

    @NonNull
    @ProtobufIndex(index = 13)
    public String sub_confirm_button_font_color;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String sub_title;

    @NonNull
    @ProtobufIndex(index = 6)
    public String sub_title_font_color;

    @NonNull
    @ProtobufIndex(index = 16)
    public IntlMarketTransitSummaryData transit_summary;

    @NonNull
    @ProtobufIndex(index = 15)
    public String unselected_circle_color;
    public static ProtobufAdapter<IntlMarketSummaryData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketSummaryData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketSummaryData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketSummaryData intlMarketSummaryData) {
            String str = intlMarketSummaryData.bg_color;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlMarketSummaryData.bg_url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = intlMarketSummaryData.main_title;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = intlMarketSummaryData.main_title_font_color;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = intlMarketSummaryData.sub_title;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = intlMarketSummaryData.sub_title_font_color;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = intlMarketSummaryData.confirm_btn_color;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = intlMarketSummaryData.confirm_btn_desc;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            String str9 = intlMarketSummaryData.confirm_btn_font_color;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(9, str9);
            }
            String str10 = intlMarketSummaryData.confirm_btn_bg_url;
            if (str10 != null) {
                iO += CodedOutputByteBufferNano.o(10, str10);
            }
            String str11 = intlMarketSummaryData.logo_url;
            if (str11 != null) {
                iO += CodedOutputByteBufferNano.o(11, str11);
            }
            String str12 = intlMarketSummaryData.sub_confirm_button_desc;
            if (str12 != null) {
                iO += CodedOutputByteBufferNano.o(12, str12);
            }
            String str13 = intlMarketSummaryData.sub_confirm_button_font_color;
            if (str13 != null) {
                iO += CodedOutputByteBufferNano.o(13, str13);
            }
            String str14 = intlMarketSummaryData.selected_circle_color;
            if (str14 != null) {
                iO += CodedOutputByteBufferNano.o(14, str14);
            }
            String str15 = intlMarketSummaryData.unselected_circle_color;
            if (str15 != null) {
                iO += CodedOutputByteBufferNano.o(15, str15);
            }
            IntlMarketTransitSummaryData intlMarketTransitSummaryData = intlMarketSummaryData.transit_summary;
            if (intlMarketTransitSummaryData != null) {
                iO += CodedOutputByteBufferNano.l(16, intlMarketTransitSummaryData, IntlMarketTransitSummaryData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlMarketSummaryData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketSummaryData m13635parse(nb5 nb5Var) throws IOException {
            IntlMarketSummaryData intlMarketSummaryData = new IntlMarketSummaryData();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (intlMarketSummaryData.bg_color == null) {
                            intlMarketSummaryData.bg_color = "";
                        }
                        if (intlMarketSummaryData.bg_url == null) {
                            intlMarketSummaryData.bg_url = "";
                        }
                        if (intlMarketSummaryData.main_title == null) {
                            intlMarketSummaryData.main_title = "";
                        }
                        if (intlMarketSummaryData.main_title_font_color == null) {
                            intlMarketSummaryData.main_title_font_color = "";
                        }
                        if (intlMarketSummaryData.sub_title == null) {
                            intlMarketSummaryData.sub_title = "";
                        }
                        if (intlMarketSummaryData.sub_title_font_color == null) {
                            intlMarketSummaryData.sub_title_font_color = "";
                        }
                        if (intlMarketSummaryData.confirm_btn_color == null) {
                            intlMarketSummaryData.confirm_btn_color = "";
                        }
                        if (intlMarketSummaryData.confirm_btn_desc == null) {
                            intlMarketSummaryData.confirm_btn_desc = "";
                        }
                        if (intlMarketSummaryData.confirm_btn_font_color == null) {
                            intlMarketSummaryData.confirm_btn_font_color = "";
                        }
                        if (intlMarketSummaryData.confirm_btn_bg_url == null) {
                            intlMarketSummaryData.confirm_btn_bg_url = "";
                        }
                        if (intlMarketSummaryData.logo_url == null) {
                            intlMarketSummaryData.logo_url = "";
                        }
                        if (intlMarketSummaryData.sub_confirm_button_desc == null) {
                            intlMarketSummaryData.sub_confirm_button_desc = "";
                        }
                        if (intlMarketSummaryData.sub_confirm_button_font_color == null) {
                            intlMarketSummaryData.sub_confirm_button_font_color = "";
                        }
                        if (intlMarketSummaryData.selected_circle_color == null) {
                            intlMarketSummaryData.selected_circle_color = "";
                        }
                        if (intlMarketSummaryData.unselected_circle_color == null) {
                            intlMarketSummaryData.unselected_circle_color = "";
                        }
                        if (intlMarketSummaryData.transit_summary == null) {
                            intlMarketSummaryData.transit_summary = IntlMarketTransitSummaryData.new_();
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        intlMarketSummaryData.bg_color = nb5Var.s();
                        continue;
                    case 18:
                        intlMarketSummaryData.bg_url = nb5Var.s();
                        continue;
                    case 26:
                        intlMarketSummaryData.main_title = nb5Var.s();
                        continue;
                    case 34:
                        intlMarketSummaryData.main_title_font_color = nb5Var.s();
                        continue;
                    case 42:
                        intlMarketSummaryData.sub_title = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        intlMarketSummaryData.sub_title_font_color = nb5Var.s();
                        continue;
                    case 58:
                        intlMarketSummaryData.confirm_btn_color = nb5Var.s();
                        continue;
                    case 66:
                        intlMarketSummaryData.confirm_btn_desc = nb5Var.s();
                        continue;
                    case 74:
                        intlMarketSummaryData.confirm_btn_font_color = nb5Var.s();
                        continue;
                    case 82:
                        intlMarketSummaryData.confirm_btn_bg_url = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        intlMarketSummaryData.logo_url = nb5Var.s();
                        continue;
                    case 98:
                        intlMarketSummaryData.sub_confirm_button_desc = nb5Var.s();
                        continue;
                    case 106:
                        intlMarketSummaryData.sub_confirm_button_font_color = nb5Var.s();
                        continue;
                    case 114:
                        intlMarketSummaryData.selected_circle_color = nb5Var.s();
                        continue;
                    case 122:
                        intlMarketSummaryData.unselected_circle_color = nb5Var.s();
                        continue;
                    case 130:
                        intlMarketSummaryData.transit_summary = (IntlMarketTransitSummaryData) nb5Var.l(IntlMarketTransitSummaryData.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (intlMarketSummaryData.bg_color == null) {
                            intlMarketSummaryData.bg_color = "";
                        }
                        if (intlMarketSummaryData.bg_url == null) {
                            intlMarketSummaryData.bg_url = "";
                        }
                        if (intlMarketSummaryData.main_title == null) {
                            intlMarketSummaryData.main_title = "";
                        }
                        if (intlMarketSummaryData.main_title_font_color == null) {
                            intlMarketSummaryData.main_title_font_color = "";
                        }
                        if (intlMarketSummaryData.sub_title == null) {
                            intlMarketSummaryData.sub_title = "";
                        }
                        if (intlMarketSummaryData.sub_title_font_color == null) {
                            intlMarketSummaryData.sub_title_font_color = "";
                        }
                        if (intlMarketSummaryData.confirm_btn_color == null) {
                            intlMarketSummaryData.confirm_btn_color = "";
                        }
                        if (intlMarketSummaryData.confirm_btn_desc == null) {
                            intlMarketSummaryData.confirm_btn_desc = "";
                        }
                        if (intlMarketSummaryData.confirm_btn_font_color == null) {
                            intlMarketSummaryData.confirm_btn_font_color = "";
                        }
                        if (intlMarketSummaryData.confirm_btn_bg_url == null) {
                            intlMarketSummaryData.confirm_btn_bg_url = "";
                        }
                        if (intlMarketSummaryData.logo_url == null) {
                            intlMarketSummaryData.logo_url = "";
                        }
                        if (intlMarketSummaryData.sub_confirm_button_desc == null) {
                            intlMarketSummaryData.sub_confirm_button_desc = "";
                        }
                        if (intlMarketSummaryData.sub_confirm_button_font_color == null) {
                            intlMarketSummaryData.sub_confirm_button_font_color = "";
                        }
                        if (intlMarketSummaryData.selected_circle_color == null) {
                            intlMarketSummaryData.selected_circle_color = "";
                        }
                        if (intlMarketSummaryData.unselected_circle_color == null) {
                            intlMarketSummaryData.unselected_circle_color = "";
                        }
                        if (intlMarketSummaryData.transit_summary == null) {
                            intlMarketSummaryData.transit_summary = IntlMarketTransitSummaryData.new_();
                            return intlMarketSummaryData;
                        }
                        break;
                }
            }
            return intlMarketSummaryData;
        }

        public void serialize(IntlMarketSummaryData intlMarketSummaryData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketSummaryData.bg_color;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlMarketSummaryData.bg_url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = intlMarketSummaryData.main_title;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = intlMarketSummaryData.main_title_font_color;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = intlMarketSummaryData.sub_title;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = intlMarketSummaryData.sub_title_font_color;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = intlMarketSummaryData.confirm_btn_color;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = intlMarketSummaryData.confirm_btn_desc;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            String str9 = intlMarketSummaryData.confirm_btn_font_color;
            if (str9 != null) {
                codedOutputByteBufferNano.R(9, str9);
            }
            String str10 = intlMarketSummaryData.confirm_btn_bg_url;
            if (str10 != null) {
                codedOutputByteBufferNano.R(10, str10);
            }
            String str11 = intlMarketSummaryData.logo_url;
            if (str11 != null) {
                codedOutputByteBufferNano.R(11, str11);
            }
            String str12 = intlMarketSummaryData.sub_confirm_button_desc;
            if (str12 != null) {
                codedOutputByteBufferNano.R(12, str12);
            }
            String str13 = intlMarketSummaryData.sub_confirm_button_font_color;
            if (str13 != null) {
                codedOutputByteBufferNano.R(13, str13);
            }
            String str14 = intlMarketSummaryData.selected_circle_color;
            if (str14 != null) {
                codedOutputByteBufferNano.R(14, str14);
            }
            String str15 = intlMarketSummaryData.unselected_circle_color;
            if (str15 != null) {
                codedOutputByteBufferNano.R(15, str15);
            }
            IntlMarketTransitSummaryData intlMarketTransitSummaryData = intlMarketSummaryData.transit_summary;
            if (intlMarketTransitSummaryData != null) {
                codedOutputByteBufferNano.K(16, intlMarketTransitSummaryData, IntlMarketTransitSummaryData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlMarketSummaryData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketSummaryData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketSummaryData.2
        public Class getDataClass() {
            return IntlMarketSummaryData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketSummaryData m13636newInstance() {
            return new IntlMarketSummaryData();
        }

        public boolean parseField(IntlMarketSummaryData intlMarketSummaryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bg_url":
                    intlMarketSummaryData.bg_url = jsonParser.getValueAsString();
                    return true;
                case "bg_color":
                    intlMarketSummaryData.bg_color = jsonParser.getValueAsString();
                    return true;
                case "confirm_btn_bg_url":
                    intlMarketSummaryData.confirm_btn_bg_url = jsonParser.getValueAsString();
                    return true;
                case "sub_confirm_button_font_color":
                    intlMarketSummaryData.sub_confirm_button_font_color = jsonParser.getValueAsString();
                    return true;
                case "confirm_btn_font_color":
                    intlMarketSummaryData.confirm_btn_font_color = jsonParser.getValueAsString();
                    return true;
                case "sub_title":
                    intlMarketSummaryData.sub_title = jsonParser.getValueAsString();
                    return true;
                case "main_title_font_color":
                    intlMarketSummaryData.main_title_font_color = jsonParser.getValueAsString();
                    return true;
                case "confirm_btn_color":
                    intlMarketSummaryData.confirm_btn_color = jsonParser.getValueAsString();
                    return true;
                case "unselected_circle_color":
                    intlMarketSummaryData.unselected_circle_color = jsonParser.getValueAsString();
                    return true;
                case "main_title":
                    intlMarketSummaryData.main_title = jsonParser.getValueAsString();
                    return true;
                case "confirm_btn_desc":
                    intlMarketSummaryData.confirm_btn_desc = jsonParser.getValueAsString();
                    return true;
                case "sub_confirm_button_desc":
                    intlMarketSummaryData.sub_confirm_button_desc = jsonParser.getValueAsString();
                    return true;
                case "transit_summary":
                    intlMarketSummaryData.transit_summary = (IntlMarketTransitSummaryData) IntlMarketTransitSummaryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "sub_title_font_color":
                    intlMarketSummaryData.sub_title_font_color = jsonParser.getValueAsString();
                    return true;
                case "logo_url":
                    intlMarketSummaryData.logo_url = jsonParser.getValueAsString();
                    return true;
                case "selected_circle_color":
                    intlMarketSummaryData.selected_circle_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketSummaryData intlMarketSummaryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bg_url":
                case "bg_color":
                case "confirm_btn_bg_url":
                case "sub_confirm_button_font_color":
                case "confirm_btn_font_color":
                case "sub_title":
                case "main_title_font_color":
                case "confirm_btn_color":
                case "unselected_circle_color":
                case "main_title":
                case "confirm_btn_desc":
                case "sub_confirm_button_desc":
                case "transit_summary":
                case "sub_title_font_color":
                case "logo_url":
                case "selected_circle_color":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketSummaryData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlMarketSummaryData intlMarketSummaryData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlMarketSummaryData.bg_color;
            if (str != null) {
                jsonGenerator.writeStringField("bg_color", str);
            }
            String str2 = intlMarketSummaryData.bg_url;
            if (str2 != null) {
                jsonGenerator.writeStringField("bg_url", str2);
            }
            String str3 = intlMarketSummaryData.main_title;
            if (str3 != null) {
                jsonGenerator.writeStringField("main_title", str3);
            }
            String str4 = intlMarketSummaryData.main_title_font_color;
            if (str4 != null) {
                jsonGenerator.writeStringField("main_title_font_color", str4);
            }
            String str5 = intlMarketSummaryData.sub_title;
            if (str5 != null) {
                jsonGenerator.writeStringField("sub_title", str5);
            }
            String str6 = intlMarketSummaryData.sub_title_font_color;
            if (str6 != null) {
                jsonGenerator.writeStringField("sub_title_font_color", str6);
            }
            String str7 = intlMarketSummaryData.confirm_btn_color;
            if (str7 != null) {
                jsonGenerator.writeStringField("confirm_btn_color", str7);
            }
            String str8 = intlMarketSummaryData.confirm_btn_desc;
            if (str8 != null) {
                jsonGenerator.writeStringField("confirm_btn_desc", str8);
            }
            String str9 = intlMarketSummaryData.confirm_btn_font_color;
            if (str9 != null) {
                jsonGenerator.writeStringField("confirm_btn_font_color", str9);
            }
            String str10 = intlMarketSummaryData.confirm_btn_bg_url;
            if (str10 != null) {
                jsonGenerator.writeStringField("confirm_btn_bg_url", str10);
            }
            String str11 = intlMarketSummaryData.logo_url;
            if (str11 != null) {
                jsonGenerator.writeStringField("logo_url", str11);
            }
            String str12 = intlMarketSummaryData.sub_confirm_button_desc;
            if (str12 != null) {
                jsonGenerator.writeStringField("sub_confirm_button_desc", str12);
            }
            String str13 = intlMarketSummaryData.sub_confirm_button_font_color;
            if (str13 != null) {
                jsonGenerator.writeStringField("sub_confirm_button_font_color", str13);
            }
            String str14 = intlMarketSummaryData.selected_circle_color;
            if (str14 != null) {
                jsonGenerator.writeStringField("selected_circle_color", str14);
            }
            String str15 = intlMarketSummaryData.unselected_circle_color;
            if (str15 != null) {
                jsonGenerator.writeStringField("unselected_circle_color", str15);
            }
            if (intlMarketSummaryData.transit_summary != null) {
                jsonGenerator.writeFieldName("transit_summary");
                IntlMarketTransitSummaryData.JSON_ADAPTER.serialize(intlMarketSummaryData.transit_summary, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketSummaryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketSummaryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketSummaryData new_() {
        IntlMarketSummaryData intlMarketSummaryData = new IntlMarketSummaryData();
        intlMarketSummaryData.nullCheck();
        return intlMarketSummaryData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketSummaryData m13634clone() {
        IntlMarketSummaryData intlMarketSummaryData = new IntlMarketSummaryData();
        intlMarketSummaryData.bg_color = this.bg_color;
        intlMarketSummaryData.bg_url = this.bg_url;
        intlMarketSummaryData.main_title = this.main_title;
        intlMarketSummaryData.main_title_font_color = this.main_title_font_color;
        intlMarketSummaryData.sub_title = this.sub_title;
        intlMarketSummaryData.sub_title_font_color = this.sub_title_font_color;
        intlMarketSummaryData.confirm_btn_color = this.confirm_btn_color;
        intlMarketSummaryData.confirm_btn_desc = this.confirm_btn_desc;
        intlMarketSummaryData.confirm_btn_font_color = this.confirm_btn_font_color;
        intlMarketSummaryData.confirm_btn_bg_url = this.confirm_btn_bg_url;
        intlMarketSummaryData.logo_url = this.logo_url;
        intlMarketSummaryData.sub_confirm_button_desc = this.sub_confirm_button_desc;
        intlMarketSummaryData.sub_confirm_button_font_color = this.sub_confirm_button_font_color;
        intlMarketSummaryData.selected_circle_color = this.selected_circle_color;
        intlMarketSummaryData.unselected_circle_color = this.unselected_circle_color;
        IntlMarketTransitSummaryData intlMarketTransitSummaryData = this.transit_summary;
        if (intlMarketTransitSummaryData != null) {
            intlMarketSummaryData.transit_summary = intlMarketTransitSummaryData.m13640clone();
        }
        return intlMarketSummaryData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketSummaryData)) {
            return false;
        }
        IntlMarketSummaryData intlMarketSummaryData = (IntlMarketSummaryData) obj;
        return ValueObject.util_equals(this.bg_color, intlMarketSummaryData.bg_color) && ValueObject.util_equals(this.bg_url, intlMarketSummaryData.bg_url) && ValueObject.util_equals(this.main_title, intlMarketSummaryData.main_title) && ValueObject.util_equals(this.main_title_font_color, intlMarketSummaryData.main_title_font_color) && ValueObject.util_equals(this.sub_title, intlMarketSummaryData.sub_title) && ValueObject.util_equals(this.sub_title_font_color, intlMarketSummaryData.sub_title_font_color) && ValueObject.util_equals(this.confirm_btn_color, intlMarketSummaryData.confirm_btn_color) && ValueObject.util_equals(this.confirm_btn_desc, intlMarketSummaryData.confirm_btn_desc) && ValueObject.util_equals(this.confirm_btn_font_color, intlMarketSummaryData.confirm_btn_font_color) && ValueObject.util_equals(this.confirm_btn_bg_url, intlMarketSummaryData.confirm_btn_bg_url) && ValueObject.util_equals(this.logo_url, intlMarketSummaryData.logo_url) && ValueObject.util_equals(this.sub_confirm_button_desc, intlMarketSummaryData.sub_confirm_button_desc) && ValueObject.util_equals(this.sub_confirm_button_font_color, intlMarketSummaryData.sub_confirm_button_font_color) && ValueObject.util_equals(this.selected_circle_color, intlMarketSummaryData.selected_circle_color) && ValueObject.util_equals(this.unselected_circle_color, intlMarketSummaryData.unselected_circle_color) && ValueObject.util_equals(this.transit_summary, intlMarketSummaryData.transit_summary);
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
        String str = this.bg_color;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bg_url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.main_title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.main_title_font_color;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.sub_title;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.sub_title_font_color;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.confirm_btn_color;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.confirm_btn_desc;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.confirm_btn_font_color;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.confirm_btn_bg_url;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.logo_url;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.sub_confirm_button_desc;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.sub_confirm_button_font_color;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.selected_circle_color;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.unselected_circle_color;
        int iHashCode15 = (iHashCode14 + (str15 != null ? str15.hashCode() : 0)) * 41;
        IntlMarketTransitSummaryData intlMarketTransitSummaryData = this.transit_summary;
        int iHashCode16 = iHashCode15 + (intlMarketTransitSummaryData != null ? intlMarketTransitSummaryData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode16;
        return iHashCode16;
    }

    public void nullCheck() {
        if (this.bg_color == null) {
            this.bg_color = "";
        }
        if (this.bg_url == null) {
            this.bg_url = "";
        }
        if (this.main_title == null) {
            this.main_title = "";
        }
        if (this.main_title_font_color == null) {
            this.main_title_font_color = "";
        }
        if (this.sub_title == null) {
            this.sub_title = "";
        }
        if (this.sub_title_font_color == null) {
            this.sub_title_font_color = "";
        }
        if (this.confirm_btn_color == null) {
            this.confirm_btn_color = "";
        }
        if (this.confirm_btn_desc == null) {
            this.confirm_btn_desc = "";
        }
        if (this.confirm_btn_font_color == null) {
            this.confirm_btn_font_color = "";
        }
        if (this.confirm_btn_bg_url == null) {
            this.confirm_btn_bg_url = "";
        }
        if (this.logo_url == null) {
            this.logo_url = "";
        }
        if (this.sub_confirm_button_desc == null) {
            this.sub_confirm_button_desc = "";
        }
        if (this.sub_confirm_button_font_color == null) {
            this.sub_confirm_button_font_color = "";
        }
        if (this.selected_circle_color == null) {
            this.selected_circle_color = "";
        }
        if (this.unselected_circle_color == null) {
            this.unselected_circle_color = "";
        }
        if (this.transit_summary == null) {
            this.transit_summary = IntlMarketTransitSummaryData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
