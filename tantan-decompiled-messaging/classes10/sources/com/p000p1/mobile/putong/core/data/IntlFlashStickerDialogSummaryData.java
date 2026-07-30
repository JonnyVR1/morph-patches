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
public class IntlFlashStickerDialogSummaryData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlflashstickerdialogsummarydata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String bg_color;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String count_down_font_color;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String desc_color;

    @NonNull
    @ProtobufIndex(index = 6)
    public String passed_progress_bar_color;

    @NonNull
    @ProtobufIndex(index = 7)
    public String remain_progress_bar_color;

    @NonNull
    @ProtobufIndex(index = 4)
    public String sub_desc_color;
    public static ProtobufAdapter<IntlFlashStickerDialogSummaryData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlFlashStickerDialogSummaryData>() { // from class: com.p1.mobile.putong.core.data.IntlFlashStickerDialogSummaryData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData) {
            String str = intlFlashStickerDialogSummaryData.bg_color;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlFlashStickerDialogSummaryData.bg_url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = intlFlashStickerDialogSummaryData.desc_color;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = intlFlashStickerDialogSummaryData.sub_desc_color;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = intlFlashStickerDialogSummaryData.count_down_font_color;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = intlFlashStickerDialogSummaryData.passed_progress_bar_color;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = intlFlashStickerDialogSummaryData.remain_progress_bar_color;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            ((MessageNano) intlFlashStickerDialogSummaryData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlFlashStickerDialogSummaryData m13551parse(nb5 nb5Var) throws IOException {
            IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = new IntlFlashStickerDialogSummaryData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlFlashStickerDialogSummaryData.bg_color == null) {
                        intlFlashStickerDialogSummaryData.bg_color = "";
                    }
                    if (intlFlashStickerDialogSummaryData.bg_url == null) {
                        intlFlashStickerDialogSummaryData.bg_url = "";
                    }
                    if (intlFlashStickerDialogSummaryData.desc_color == null) {
                        intlFlashStickerDialogSummaryData.desc_color = "";
                    }
                    if (intlFlashStickerDialogSummaryData.sub_desc_color == null) {
                        intlFlashStickerDialogSummaryData.sub_desc_color = "";
                    }
                    if (intlFlashStickerDialogSummaryData.count_down_font_color == null) {
                        intlFlashStickerDialogSummaryData.count_down_font_color = "";
                    }
                    if (intlFlashStickerDialogSummaryData.passed_progress_bar_color == null) {
                        intlFlashStickerDialogSummaryData.passed_progress_bar_color = "";
                    }
                    if (intlFlashStickerDialogSummaryData.remain_progress_bar_color != null) {
                        break;
                    }
                    intlFlashStickerDialogSummaryData.remain_progress_bar_color = "";
                    break;
                }
                if (iU == 10) {
                    intlFlashStickerDialogSummaryData.bg_color = nb5Var.s();
                } else if (iU == 18) {
                    intlFlashStickerDialogSummaryData.bg_url = nb5Var.s();
                } else if (iU == 26) {
                    intlFlashStickerDialogSummaryData.desc_color = nb5Var.s();
                } else if (iU == 34) {
                    intlFlashStickerDialogSummaryData.sub_desc_color = nb5Var.s();
                } else if (iU == 42) {
                    intlFlashStickerDialogSummaryData.count_down_font_color = nb5Var.s();
                } else if (iU == 50) {
                    intlFlashStickerDialogSummaryData.passed_progress_bar_color = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (intlFlashStickerDialogSummaryData.bg_color == null) {
                            intlFlashStickerDialogSummaryData.bg_color = "";
                        }
                        if (intlFlashStickerDialogSummaryData.bg_url == null) {
                            intlFlashStickerDialogSummaryData.bg_url = "";
                        }
                        if (intlFlashStickerDialogSummaryData.desc_color == null) {
                            intlFlashStickerDialogSummaryData.desc_color = "";
                        }
                        if (intlFlashStickerDialogSummaryData.sub_desc_color == null) {
                            intlFlashStickerDialogSummaryData.sub_desc_color = "";
                        }
                        if (intlFlashStickerDialogSummaryData.count_down_font_color == null) {
                            intlFlashStickerDialogSummaryData.count_down_font_color = "";
                        }
                        if (intlFlashStickerDialogSummaryData.passed_progress_bar_color == null) {
                            intlFlashStickerDialogSummaryData.passed_progress_bar_color = "";
                        }
                        if (intlFlashStickerDialogSummaryData.remain_progress_bar_color != null) {
                            break;
                        }
                        intlFlashStickerDialogSummaryData.remain_progress_bar_color = "";
                        return intlFlashStickerDialogSummaryData;
                    }
                    intlFlashStickerDialogSummaryData.remain_progress_bar_color = nb5Var.s();
                }
            }
            return intlFlashStickerDialogSummaryData;
        }

        public void serialize(IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlFlashStickerDialogSummaryData.bg_color;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlFlashStickerDialogSummaryData.bg_url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = intlFlashStickerDialogSummaryData.desc_color;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = intlFlashStickerDialogSummaryData.sub_desc_color;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = intlFlashStickerDialogSummaryData.count_down_font_color;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = intlFlashStickerDialogSummaryData.passed_progress_bar_color;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = intlFlashStickerDialogSummaryData.remain_progress_bar_color;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
        }
    };
    public static JsonAdapter<IntlFlashStickerDialogSummaryData> JSON_ADAPTER = new ObjectJsonAdapter<IntlFlashStickerDialogSummaryData>() { // from class: com.p1.mobile.putong.core.data.IntlFlashStickerDialogSummaryData.2
        public Class getDataClass() {
            return IntlFlashStickerDialogSummaryData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlFlashStickerDialogSummaryData m13552newInstance() {
            return new IntlFlashStickerDialogSummaryData();
        }

        public boolean parseField(IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bg_url":
                    intlFlashStickerDialogSummaryData.bg_url = jsonParser.getValueAsString();
                    return true;
                case "desc_color":
                    intlFlashStickerDialogSummaryData.desc_color = jsonParser.getValueAsString();
                    return true;
                case "bg_color":
                    intlFlashStickerDialogSummaryData.bg_color = jsonParser.getValueAsString();
                    return true;
                case "passed_progress_bar_color":
                    intlFlashStickerDialogSummaryData.passed_progress_bar_color = jsonParser.getValueAsString();
                    return true;
                case "remain_progress_bar_color":
                    intlFlashStickerDialogSummaryData.remain_progress_bar_color = jsonParser.getValueAsString();
                    return true;
                case "sub_desc_color":
                    intlFlashStickerDialogSummaryData.sub_desc_color = jsonParser.getValueAsString();
                    return true;
                case "count_down_font_color":
                    intlFlashStickerDialogSummaryData.count_down_font_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bg_url":
                case "desc_color":
                case "bg_color":
                case "passed_progress_bar_color":
                case "remain_progress_bar_color":
                case "sub_desc_color":
                case "count_down_font_color":
                    return true;
                default:
                    return super.parseFieldCheck(intlFlashStickerDialogSummaryData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlFlashStickerDialogSummaryData.bg_color;
            if (str != null) {
                jsonGenerator.writeStringField("bg_color", str);
            }
            String str2 = intlFlashStickerDialogSummaryData.bg_url;
            if (str2 != null) {
                jsonGenerator.writeStringField("bg_url", str2);
            }
            String str3 = intlFlashStickerDialogSummaryData.desc_color;
            if (str3 != null) {
                jsonGenerator.writeStringField("desc_color", str3);
            }
            String str4 = intlFlashStickerDialogSummaryData.sub_desc_color;
            if (str4 != null) {
                jsonGenerator.writeStringField("sub_desc_color", str4);
            }
            String str5 = intlFlashStickerDialogSummaryData.count_down_font_color;
            if (str5 != null) {
                jsonGenerator.writeStringField("count_down_font_color", str5);
            }
            String str6 = intlFlashStickerDialogSummaryData.passed_progress_bar_color;
            if (str6 != null) {
                jsonGenerator.writeStringField("passed_progress_bar_color", str6);
            }
            String str7 = intlFlashStickerDialogSummaryData.remain_progress_bar_color;
            if (str7 != null) {
                jsonGenerator.writeStringField("remain_progress_bar_color", str7);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlFlashStickerDialogSummaryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlFlashStickerDialogSummaryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlFlashStickerDialogSummaryData new_() {
        IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = new IntlFlashStickerDialogSummaryData();
        intlFlashStickerDialogSummaryData.nullCheck();
        return intlFlashStickerDialogSummaryData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlFlashStickerDialogSummaryData m13550clone() {
        IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = new IntlFlashStickerDialogSummaryData();
        intlFlashStickerDialogSummaryData.bg_color = this.bg_color;
        intlFlashStickerDialogSummaryData.bg_url = this.bg_url;
        intlFlashStickerDialogSummaryData.desc_color = this.desc_color;
        intlFlashStickerDialogSummaryData.sub_desc_color = this.sub_desc_color;
        intlFlashStickerDialogSummaryData.count_down_font_color = this.count_down_font_color;
        intlFlashStickerDialogSummaryData.passed_progress_bar_color = this.passed_progress_bar_color;
        intlFlashStickerDialogSummaryData.remain_progress_bar_color = this.remain_progress_bar_color;
        return intlFlashStickerDialogSummaryData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlFlashStickerDialogSummaryData)) {
            return false;
        }
        IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = (IntlFlashStickerDialogSummaryData) obj;
        return ValueObject.util_equals(this.bg_color, intlFlashStickerDialogSummaryData.bg_color) && ValueObject.util_equals(this.bg_url, intlFlashStickerDialogSummaryData.bg_url) && ValueObject.util_equals(this.desc_color, intlFlashStickerDialogSummaryData.desc_color) && ValueObject.util_equals(this.sub_desc_color, intlFlashStickerDialogSummaryData.sub_desc_color) && ValueObject.util_equals(this.count_down_font_color, intlFlashStickerDialogSummaryData.count_down_font_color) && ValueObject.util_equals(this.passed_progress_bar_color, intlFlashStickerDialogSummaryData.passed_progress_bar_color) && ValueObject.util_equals(this.remain_progress_bar_color, intlFlashStickerDialogSummaryData.remain_progress_bar_color);
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
        String str3 = this.desc_color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.sub_desc_color;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.count_down_font_color;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.passed_progress_bar_color;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.remain_progress_bar_color;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.bg_color == null) {
            this.bg_color = "";
        }
        if (this.bg_url == null) {
            this.bg_url = "";
        }
        if (this.desc_color == null) {
            this.desc_color = "";
        }
        if (this.sub_desc_color == null) {
            this.sub_desc_color = "";
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
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
