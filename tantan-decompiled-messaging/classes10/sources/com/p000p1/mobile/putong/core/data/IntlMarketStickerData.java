package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
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
public class IntlMarketStickerData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketstickerdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String bg_border_color;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String bg_color;

    @NonNull
    @ProtobufIndex(index = 7)
    public String bg_url;

    @ProtobufIndex(index = 1)
    public int columns;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String focus_border_color;

    @NonNull
    @ProtobufIndex(index = 4)
    public String font_color;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<IntlMarketStickerOptionsData> options;

    @NonNull
    @ProtobufIndex(index = 8)
    public String sub_font_color;
    public static ProtobufAdapter<IntlMarketStickerData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketStickerData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketStickerData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketStickerData intlMarketStickerData) {
            int iH = CodedOutputByteBufferNano.h(1, intlMarketStickerData.columns);
            String str = intlMarketStickerData.bg_color;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = intlMarketStickerData.bg_border_color;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = intlMarketStickerData.font_color;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = intlMarketStickerData.focus_border_color;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(5, str4);
            }
            List<IntlMarketStickerOptionsData> list = intlMarketStickerData.options;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(6, list, IntlMarketStickerOptionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = intlMarketStickerData.bg_url;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(7, str5);
            }
            String str6 = intlMarketStickerData.sub_font_color;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(8, str6);
            }
            ((MessageNano) intlMarketStickerData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketStickerData m13627parse(nb5 nb5Var) throws IOException {
            IntlMarketStickerData intlMarketStickerData = new IntlMarketStickerData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketStickerData.bg_color == null) {
                        intlMarketStickerData.bg_color = "";
                    }
                    if (intlMarketStickerData.bg_border_color == null) {
                        intlMarketStickerData.bg_border_color = "";
                    }
                    if (intlMarketStickerData.font_color == null) {
                        intlMarketStickerData.font_color = "";
                    }
                    if (intlMarketStickerData.focus_border_color == null) {
                        intlMarketStickerData.focus_border_color = "";
                    }
                    if (intlMarketStickerData.options == null) {
                        intlMarketStickerData.options = new ArrayList();
                    }
                    if (intlMarketStickerData.bg_url == null) {
                        intlMarketStickerData.bg_url = "";
                    }
                    if (intlMarketStickerData.sub_font_color != null) {
                        break;
                    }
                    intlMarketStickerData.sub_font_color = "";
                    break;
                }
                if (iU == 8) {
                    intlMarketStickerData.columns = nb5Var.j();
                } else if (iU == 18) {
                    intlMarketStickerData.bg_color = nb5Var.s();
                } else if (iU == 26) {
                    intlMarketStickerData.bg_border_color = nb5Var.s();
                } else if (iU == 34) {
                    intlMarketStickerData.font_color = nb5Var.s();
                } else if (iU == 42) {
                    intlMarketStickerData.focus_border_color = nb5Var.s();
                } else if (iU == 50) {
                    intlMarketStickerData.options = (List) nb5Var.l(IntlMarketStickerOptionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 58) {
                    intlMarketStickerData.bg_url = nb5Var.s();
                } else {
                    if (iU != 66) {
                        if (intlMarketStickerData.bg_color == null) {
                            intlMarketStickerData.bg_color = "";
                        }
                        if (intlMarketStickerData.bg_border_color == null) {
                            intlMarketStickerData.bg_border_color = "";
                        }
                        if (intlMarketStickerData.font_color == null) {
                            intlMarketStickerData.font_color = "";
                        }
                        if (intlMarketStickerData.focus_border_color == null) {
                            intlMarketStickerData.focus_border_color = "";
                        }
                        if (intlMarketStickerData.options == null) {
                            intlMarketStickerData.options = new ArrayList();
                        }
                        if (intlMarketStickerData.bg_url == null) {
                            intlMarketStickerData.bg_url = "";
                        }
                        if (intlMarketStickerData.sub_font_color != null) {
                            break;
                        }
                        intlMarketStickerData.sub_font_color = "";
                        return intlMarketStickerData;
                    }
                    intlMarketStickerData.sub_font_color = nb5Var.s();
                }
            }
            return intlMarketStickerData;
        }

        public void serialize(IntlMarketStickerData intlMarketStickerData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlMarketStickerData.columns);
            String str = intlMarketStickerData.bg_color;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = intlMarketStickerData.bg_border_color;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = intlMarketStickerData.font_color;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = intlMarketStickerData.focus_border_color;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            List<IntlMarketStickerOptionsData> list = intlMarketStickerData.options;
            if (list != null) {
                codedOutputByteBufferNano.K(6, list, IntlMarketStickerOptionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = intlMarketStickerData.bg_url;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            String str6 = intlMarketStickerData.sub_font_color;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
        }
    };
    public static JsonAdapter<IntlMarketStickerData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketStickerData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketStickerData.2
        public Class getDataClass() {
            return IntlMarketStickerData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketStickerData m13628newInstance() {
            return new IntlMarketStickerData();
        }

        public boolean parseField(IntlMarketStickerData intlMarketStickerData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sub_font_color":
                    intlMarketStickerData.sub_font_color = jsonParser.getValueAsString();
                    return true;
                case "bg_url":
                    intlMarketStickerData.bg_url = jsonParser.getValueAsString();
                    return true;
                case "bg_color":
                    intlMarketStickerData.bg_color = jsonParser.getValueAsString();
                    return true;
                case "options":
                    intlMarketStickerData.options = JsonAdapter.parseArray(jsonParser, IntlMarketStickerOptionsData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "font_color":
                    intlMarketStickerData.font_color = jsonParser.getValueAsString();
                    return true;
                case "focus_border_color":
                    intlMarketStickerData.focus_border_color = jsonParser.getValueAsString();
                    return true;
                case "bg_border_color":
                    intlMarketStickerData.bg_border_color = jsonParser.getValueAsString();
                    return true;
                case "columns":
                    intlMarketStickerData.columns = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketStickerData intlMarketStickerData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sub_font_color":
                case "bg_url":
                case "bg_color":
                case "options":
                case "font_color":
                case "focus_border_color":
                case "bg_border_color":
                case "columns":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketStickerData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlMarketStickerData intlMarketStickerData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("columns", intlMarketStickerData.columns);
            String str = intlMarketStickerData.bg_color;
            if (str != null) {
                jsonGenerator.writeStringField("bg_color", str);
            }
            String str2 = intlMarketStickerData.bg_border_color;
            if (str2 != null) {
                jsonGenerator.writeStringField("bg_border_color", str2);
            }
            String str3 = intlMarketStickerData.font_color;
            if (str3 != null) {
                jsonGenerator.writeStringField("font_color", str3);
            }
            String str4 = intlMarketStickerData.focus_border_color;
            if (str4 != null) {
                jsonGenerator.writeStringField("focus_border_color", str4);
            }
            if (intlMarketStickerData.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(intlMarketStickerData.options, jsonGenerator, IntlMarketStickerOptionsData.JSON_ADAPTER);
            }
            String str5 = intlMarketStickerData.bg_url;
            if (str5 != null) {
                jsonGenerator.writeStringField("bg_url", str5);
            }
            String str6 = intlMarketStickerData.sub_font_color;
            if (str6 != null) {
                jsonGenerator.writeStringField("sub_font_color", str6);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketStickerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketStickerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketStickerData new_() {
        IntlMarketStickerData intlMarketStickerData = new IntlMarketStickerData();
        intlMarketStickerData.nullCheck();
        return intlMarketStickerData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketStickerData m13626clone() {
        IntlMarketStickerData intlMarketStickerData = new IntlMarketStickerData();
        intlMarketStickerData.columns = this.columns;
        intlMarketStickerData.bg_color = this.bg_color;
        intlMarketStickerData.bg_border_color = this.bg_border_color;
        intlMarketStickerData.font_color = this.font_color;
        intlMarketStickerData.focus_border_color = this.focus_border_color;
        List<IntlMarketStickerOptionsData> list = this.options;
        if (list != null) {
            intlMarketStickerData.options = ValueObject.util_map(list, new w9j() { // from class: l.ybo
                public final Object call(Object obj) {
                    return ((IntlMarketStickerOptionsData) obj).m13630clone();
                }
            });
        }
        intlMarketStickerData.bg_url = this.bg_url;
        intlMarketStickerData.sub_font_color = this.sub_font_color;
        return intlMarketStickerData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketStickerData)) {
            return false;
        }
        IntlMarketStickerData intlMarketStickerData = (IntlMarketStickerData) obj;
        return this.columns == intlMarketStickerData.columns && ValueObject.util_equals(this.bg_color, intlMarketStickerData.bg_color) && ValueObject.util_equals(this.bg_border_color, intlMarketStickerData.bg_border_color) && ValueObject.util_equals(this.font_color, intlMarketStickerData.font_color) && ValueObject.util_equals(this.focus_border_color, intlMarketStickerData.focus_border_color) && ValueObject.util_equals(this.options, intlMarketStickerData.options) && ValueObject.util_equals(this.bg_url, intlMarketStickerData.bg_url) && ValueObject.util_equals(this.sub_font_color, intlMarketStickerData.sub_font_color);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.columns) * 41;
        String str = this.bg_color;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bg_border_color;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.font_color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.focus_border_color;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<IntlMarketStickerOptionsData> list = this.options;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str5 = this.bg_url;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.sub_font_color;
        int iHashCode7 = iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.bg_color == null) {
            this.bg_color = "";
        }
        if (this.bg_border_color == null) {
            this.bg_border_color = "";
        }
        if (this.font_color == null) {
            this.font_color = "";
        }
        if (this.focus_border_color == null) {
            this.focus_border_color = "";
        }
        if (this.options == null) {
            this.options = new ArrayList();
        }
        if (this.bg_url == null) {
            this.bg_url = "";
        }
        if (this.sub_font_color == null) {
            this.sub_font_color = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
