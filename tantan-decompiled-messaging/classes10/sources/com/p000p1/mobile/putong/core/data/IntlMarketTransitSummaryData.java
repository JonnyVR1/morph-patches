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
public class IntlMarketTransitSummaryData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarkettransitsummarydata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String bg_color;

    @NonNull
    @ProtobufIndex(index = 8)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = 7)
    public String bottom_font_color;

    @NonNull
    @ProtobufIndex(index = 4)
    public String count_down_font_color;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String main_title;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String main_title_font_color;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String passed_progress_bar_color;

    @NonNull
    @ProtobufIndex(index = 6)
    public String remain_progress_bar_color;
    public static ProtobufAdapter<IntlMarketTransitSummaryData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketTransitSummaryData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketTransitSummaryData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketTransitSummaryData intlMarketTransitSummaryData) {
            String str = intlMarketTransitSummaryData.bg_color;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlMarketTransitSummaryData.main_title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = intlMarketTransitSummaryData.main_title_font_color;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = intlMarketTransitSummaryData.count_down_font_color;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = intlMarketTransitSummaryData.passed_progress_bar_color;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = intlMarketTransitSummaryData.remain_progress_bar_color;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = intlMarketTransitSummaryData.bottom_font_color;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = intlMarketTransitSummaryData.bg_url;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            ((MessageNano) intlMarketTransitSummaryData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketTransitSummaryData m13641parse(nb5 nb5Var) throws IOException {
            IntlMarketTransitSummaryData intlMarketTransitSummaryData = new IntlMarketTransitSummaryData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketTransitSummaryData.bg_color == null) {
                        intlMarketTransitSummaryData.bg_color = "";
                    }
                    if (intlMarketTransitSummaryData.main_title == null) {
                        intlMarketTransitSummaryData.main_title = "";
                    }
                    if (intlMarketTransitSummaryData.main_title_font_color == null) {
                        intlMarketTransitSummaryData.main_title_font_color = "";
                    }
                    if (intlMarketTransitSummaryData.count_down_font_color == null) {
                        intlMarketTransitSummaryData.count_down_font_color = "";
                    }
                    if (intlMarketTransitSummaryData.passed_progress_bar_color == null) {
                        intlMarketTransitSummaryData.passed_progress_bar_color = "";
                    }
                    if (intlMarketTransitSummaryData.remain_progress_bar_color == null) {
                        intlMarketTransitSummaryData.remain_progress_bar_color = "";
                    }
                    if (intlMarketTransitSummaryData.bottom_font_color == null) {
                        intlMarketTransitSummaryData.bottom_font_color = "";
                    }
                    if (intlMarketTransitSummaryData.bg_url != null) {
                        break;
                    }
                    intlMarketTransitSummaryData.bg_url = "";
                    break;
                }
                if (iU == 10) {
                    intlMarketTransitSummaryData.bg_color = nb5Var.s();
                } else if (iU == 18) {
                    intlMarketTransitSummaryData.main_title = nb5Var.s();
                } else if (iU == 26) {
                    intlMarketTransitSummaryData.main_title_font_color = nb5Var.s();
                } else if (iU == 34) {
                    intlMarketTransitSummaryData.count_down_font_color = nb5Var.s();
                } else if (iU == 42) {
                    intlMarketTransitSummaryData.passed_progress_bar_color = nb5Var.s();
                } else if (iU == 50) {
                    intlMarketTransitSummaryData.remain_progress_bar_color = nb5Var.s();
                } else if (iU == 58) {
                    intlMarketTransitSummaryData.bottom_font_color = nb5Var.s();
                } else {
                    if (iU != 66) {
                        if (intlMarketTransitSummaryData.bg_color == null) {
                            intlMarketTransitSummaryData.bg_color = "";
                        }
                        if (intlMarketTransitSummaryData.main_title == null) {
                            intlMarketTransitSummaryData.main_title = "";
                        }
                        if (intlMarketTransitSummaryData.main_title_font_color == null) {
                            intlMarketTransitSummaryData.main_title_font_color = "";
                        }
                        if (intlMarketTransitSummaryData.count_down_font_color == null) {
                            intlMarketTransitSummaryData.count_down_font_color = "";
                        }
                        if (intlMarketTransitSummaryData.passed_progress_bar_color == null) {
                            intlMarketTransitSummaryData.passed_progress_bar_color = "";
                        }
                        if (intlMarketTransitSummaryData.remain_progress_bar_color == null) {
                            intlMarketTransitSummaryData.remain_progress_bar_color = "";
                        }
                        if (intlMarketTransitSummaryData.bottom_font_color == null) {
                            intlMarketTransitSummaryData.bottom_font_color = "";
                        }
                        if (intlMarketTransitSummaryData.bg_url != null) {
                            break;
                        }
                        intlMarketTransitSummaryData.bg_url = "";
                        return intlMarketTransitSummaryData;
                    }
                    intlMarketTransitSummaryData.bg_url = nb5Var.s();
                }
            }
            return intlMarketTransitSummaryData;
        }

        public void serialize(IntlMarketTransitSummaryData intlMarketTransitSummaryData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketTransitSummaryData.bg_color;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlMarketTransitSummaryData.main_title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = intlMarketTransitSummaryData.main_title_font_color;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = intlMarketTransitSummaryData.count_down_font_color;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = intlMarketTransitSummaryData.passed_progress_bar_color;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = intlMarketTransitSummaryData.remain_progress_bar_color;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = intlMarketTransitSummaryData.bottom_font_color;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = intlMarketTransitSummaryData.bg_url;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
        }
    };
    public static JsonAdapter<IntlMarketTransitSummaryData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketTransitSummaryData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketTransitSummaryData.2
        public Class getDataClass() {
            return IntlMarketTransitSummaryData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketTransitSummaryData m13642newInstance() {
            return new IntlMarketTransitSummaryData();
        }

        public boolean parseField(IntlMarketTransitSummaryData intlMarketTransitSummaryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bottom_font_color":
                    intlMarketTransitSummaryData.bottom_font_color = jsonParser.getValueAsString();
                    return true;
                case "bg_url":
                    intlMarketTransitSummaryData.bg_url = jsonParser.getValueAsString();
                    return true;
                case "bg_color":
                    intlMarketTransitSummaryData.bg_color = jsonParser.getValueAsString();
                    return true;
                case "passed_progress_bar_color":
                    intlMarketTransitSummaryData.passed_progress_bar_color = jsonParser.getValueAsString();
                    return true;
                case "remain_progress_bar_color":
                    intlMarketTransitSummaryData.remain_progress_bar_color = jsonParser.getValueAsString();
                    return true;
                case "main_title_font_color":
                    intlMarketTransitSummaryData.main_title_font_color = jsonParser.getValueAsString();
                    return true;
                case "main_title":
                    intlMarketTransitSummaryData.main_title = jsonParser.getValueAsString();
                    return true;
                case "count_down_font_color":
                    intlMarketTransitSummaryData.count_down_font_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketTransitSummaryData intlMarketTransitSummaryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bottom_font_color":
                case "bg_url":
                case "bg_color":
                case "passed_progress_bar_color":
                case "remain_progress_bar_color":
                case "main_title_font_color":
                case "main_title":
                case "count_down_font_color":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketTransitSummaryData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlMarketTransitSummaryData intlMarketTransitSummaryData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlMarketTransitSummaryData.bg_color;
            if (str != null) {
                jsonGenerator.writeStringField("bg_color", str);
            }
            String str2 = intlMarketTransitSummaryData.main_title;
            if (str2 != null) {
                jsonGenerator.writeStringField("main_title", str2);
            }
            String str3 = intlMarketTransitSummaryData.main_title_font_color;
            if (str3 != null) {
                jsonGenerator.writeStringField("main_title_font_color", str3);
            }
            String str4 = intlMarketTransitSummaryData.count_down_font_color;
            if (str4 != null) {
                jsonGenerator.writeStringField("count_down_font_color", str4);
            }
            String str5 = intlMarketTransitSummaryData.passed_progress_bar_color;
            if (str5 != null) {
                jsonGenerator.writeStringField("passed_progress_bar_color", str5);
            }
            String str6 = intlMarketTransitSummaryData.remain_progress_bar_color;
            if (str6 != null) {
                jsonGenerator.writeStringField("remain_progress_bar_color", str6);
            }
            String str7 = intlMarketTransitSummaryData.bottom_font_color;
            if (str7 != null) {
                jsonGenerator.writeStringField("bottom_font_color", str7);
            }
            String str8 = intlMarketTransitSummaryData.bg_url;
            if (str8 != null) {
                jsonGenerator.writeStringField("bg_url", str8);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketTransitSummaryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketTransitSummaryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketTransitSummaryData new_() {
        IntlMarketTransitSummaryData intlMarketTransitSummaryData = new IntlMarketTransitSummaryData();
        intlMarketTransitSummaryData.nullCheck();
        return intlMarketTransitSummaryData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketTransitSummaryData m13640clone() {
        IntlMarketTransitSummaryData intlMarketTransitSummaryData = new IntlMarketTransitSummaryData();
        intlMarketTransitSummaryData.bg_color = this.bg_color;
        intlMarketTransitSummaryData.main_title = this.main_title;
        intlMarketTransitSummaryData.main_title_font_color = this.main_title_font_color;
        intlMarketTransitSummaryData.count_down_font_color = this.count_down_font_color;
        intlMarketTransitSummaryData.passed_progress_bar_color = this.passed_progress_bar_color;
        intlMarketTransitSummaryData.remain_progress_bar_color = this.remain_progress_bar_color;
        intlMarketTransitSummaryData.bottom_font_color = this.bottom_font_color;
        intlMarketTransitSummaryData.bg_url = this.bg_url;
        return intlMarketTransitSummaryData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketTransitSummaryData)) {
            return false;
        }
        IntlMarketTransitSummaryData intlMarketTransitSummaryData = (IntlMarketTransitSummaryData) obj;
        return ValueObject.util_equals(this.bg_color, intlMarketTransitSummaryData.bg_color) && ValueObject.util_equals(this.main_title, intlMarketTransitSummaryData.main_title) && ValueObject.util_equals(this.main_title_font_color, intlMarketTransitSummaryData.main_title_font_color) && ValueObject.util_equals(this.count_down_font_color, intlMarketTransitSummaryData.count_down_font_color) && ValueObject.util_equals(this.passed_progress_bar_color, intlMarketTransitSummaryData.passed_progress_bar_color) && ValueObject.util_equals(this.remain_progress_bar_color, intlMarketTransitSummaryData.remain_progress_bar_color) && ValueObject.util_equals(this.bottom_font_color, intlMarketTransitSummaryData.bottom_font_color) && ValueObject.util_equals(this.bg_url, intlMarketTransitSummaryData.bg_url);
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
        String str2 = this.main_title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.main_title_font_color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.count_down_font_color;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.passed_progress_bar_color;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.remain_progress_bar_color;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.bottom_font_color;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.bg_url;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.bg_color == null) {
            this.bg_color = "";
        }
        if (this.main_title == null) {
            this.main_title = "";
        }
        if (this.main_title_font_color == null) {
            this.main_title_font_color = "";
        }
        if (this.count_down_font_color == null) {
            this.count_down_font_color = "";
        }
        if (this.passed_progress_bar_color == null) {
            this.passed_progress_bar_color = "";
        }
        if (this.remain_progress_bar_color == null) {
            this.remain_progress_bar_color = "";
        }
        if (this.bottom_font_color == null) {
            this.bottom_font_color = "";
        }
        if (this.bg_url == null) {
            this.bg_url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
