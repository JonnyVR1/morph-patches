package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntlCampingQuestionOptionsData;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class IntlCampingQuestionsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingquestionsdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = 1)
    public String heading;

    @NonNull
    @ProtobufIndex(index = 2)
    public String heading_font_color;

    @NonNull
    @ProtobufIndex(index = 4)
    public String opt_bg_url;

    @NonNull
    @ProtobufIndex(index = 5)
    public String opt_focus_bg_url;

    @NonNull
    @ProtobufIndex(index = 8)
    public String opt_focus_font_color;

    @NonNull
    @ProtobufIndex(index = 6)
    public String opt_focus_logo_url;

    @NonNull
    @ProtobufIndex(index = 9)
    public String opt_font_color;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<IntlCampingQuestionOptionsData> options;
    public static ProtobufAdapter<IntlCampingQuestionsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingQuestionsData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingQuestionsData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCampingQuestionsData intlCampingQuestionsData) {
            String str = intlCampingQuestionsData.heading;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = intlCampingQuestionsData.heading_font_color;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = intlCampingQuestionsData.bg_url;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = intlCampingQuestionsData.opt_bg_url;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = intlCampingQuestionsData.opt_focus_bg_url;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = intlCampingQuestionsData.opt_focus_logo_url;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            List<IntlCampingQuestionOptionsData> list = intlCampingQuestionsData.options;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(7, list, IntlCampingQuestionOptionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str7 = intlCampingQuestionsData.opt_focus_font_color;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str7);
            }
            String str8 = intlCampingQuestionsData.opt_font_color;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str8);
            }
            intlCampingQuestionsData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCampingQuestionsData parse(nc5 nc5Var) throws IOException {
            IntlCampingQuestionsData intlCampingQuestionsData = new IntlCampingQuestionsData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlCampingQuestionsData.heading == null) {
                        intlCampingQuestionsData.heading = "";
                    }
                    if (intlCampingQuestionsData.heading_font_color == null) {
                        intlCampingQuestionsData.heading_font_color = "";
                    }
                    if (intlCampingQuestionsData.bg_url == null) {
                        intlCampingQuestionsData.bg_url = "";
                    }
                    if (intlCampingQuestionsData.opt_bg_url == null) {
                        intlCampingQuestionsData.opt_bg_url = "";
                    }
                    if (intlCampingQuestionsData.opt_focus_bg_url == null) {
                        intlCampingQuestionsData.opt_focus_bg_url = "";
                    }
                    if (intlCampingQuestionsData.opt_focus_font_color == null) {
                        intlCampingQuestionsData.opt_focus_font_color = "";
                    }
                    if (intlCampingQuestionsData.opt_font_color == null) {
                        intlCampingQuestionsData.opt_font_color = "";
                    }
                    if (intlCampingQuestionsData.opt_focus_logo_url == null) {
                        intlCampingQuestionsData.opt_focus_logo_url = "";
                    }
                    if (intlCampingQuestionsData.options != null) {
                        break;
                    }
                    intlCampingQuestionsData.options = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    intlCampingQuestionsData.heading = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    intlCampingQuestionsData.heading_font_color = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    intlCampingQuestionsData.bg_url = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    intlCampingQuestionsData.opt_bg_url = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    intlCampingQuestionsData.opt_focus_bg_url = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    intlCampingQuestionsData.opt_focus_logo_url = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    intlCampingQuestionsData.options = (List) nc5Var.m162488l(IntlCampingQuestionOptionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 66) {
                    intlCampingQuestionsData.opt_focus_font_color = nc5Var.m162495s();
                } else {
                    if (iM162497u != 74) {
                        if (intlCampingQuestionsData.heading == null) {
                            intlCampingQuestionsData.heading = "";
                        }
                        if (intlCampingQuestionsData.heading_font_color == null) {
                            intlCampingQuestionsData.heading_font_color = "";
                        }
                        if (intlCampingQuestionsData.bg_url == null) {
                            intlCampingQuestionsData.bg_url = "";
                        }
                        if (intlCampingQuestionsData.opt_bg_url == null) {
                            intlCampingQuestionsData.opt_bg_url = "";
                        }
                        if (intlCampingQuestionsData.opt_focus_bg_url == null) {
                            intlCampingQuestionsData.opt_focus_bg_url = "";
                        }
                        if (intlCampingQuestionsData.opt_focus_font_color == null) {
                            intlCampingQuestionsData.opt_focus_font_color = "";
                        }
                        if (intlCampingQuestionsData.opt_font_color == null) {
                            intlCampingQuestionsData.opt_font_color = "";
                        }
                        if (intlCampingQuestionsData.opt_focus_logo_url == null) {
                            intlCampingQuestionsData.opt_focus_logo_url = "";
                        }
                        if (intlCampingQuestionsData.options != null) {
                            break;
                        }
                        intlCampingQuestionsData.options = new ArrayList();
                        return intlCampingQuestionsData;
                    }
                    intlCampingQuestionsData.opt_font_color = nc5Var.m162495s();
                }
            }
            return intlCampingQuestionsData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCampingQuestionsData intlCampingQuestionsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlCampingQuestionsData.heading;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = intlCampingQuestionsData.heading_font_color;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = intlCampingQuestionsData.bg_url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = intlCampingQuestionsData.opt_bg_url;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = intlCampingQuestionsData.opt_focus_bg_url;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = intlCampingQuestionsData.opt_focus_logo_url;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            List<IntlCampingQuestionOptionsData> list = intlCampingQuestionsData.options;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(7, list, IntlCampingQuestionOptionsData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str7 = intlCampingQuestionsData.opt_focus_font_color;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(8, str7);
            }
            String str8 = intlCampingQuestionsData.opt_font_color;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(9, str8);
            }
        }
    };
    public static JsonAdapter<IntlCampingQuestionsData> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingQuestionsData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingQuestionsData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCampingQuestionsData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCampingQuestionsData newInstance() {
            return new IntlCampingQuestionsData();
        }

        public boolean parseField(IntlCampingQuestionsData intlCampingQuestionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "heading_font_color":
                    intlCampingQuestionsData.heading_font_color = jsonParser.getValueAsString();
                    return true;
                case "bg_url":
                    intlCampingQuestionsData.bg_url = jsonParser.getValueAsString();
                    return true;
                case "options":
                    intlCampingQuestionsData.options = JsonAdapter.parseArray(jsonParser, IntlCampingQuestionOptionsData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "opt_focus_logo_url":
                    intlCampingQuestionsData.opt_focus_logo_url = jsonParser.getValueAsString();
                    return true;
                case "opt_focus_bg_url":
                    intlCampingQuestionsData.opt_focus_bg_url = jsonParser.getValueAsString();
                    return true;
                case "opt_font_color":
                    intlCampingQuestionsData.opt_font_color = jsonParser.getValueAsString();
                    return true;
                case "opt_bg_url":
                    intlCampingQuestionsData.opt_bg_url = jsonParser.getValueAsString();
                    return true;
                case "heading":
                    intlCampingQuestionsData.heading = jsonParser.getValueAsString();
                    return true;
                case "opt_focus_font_color":
                    intlCampingQuestionsData.opt_focus_font_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlCampingQuestionsData intlCampingQuestionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "heading_font_color":
                case "bg_url":
                case "options":
                case "opt_focus_logo_url":
                case "opt_focus_bg_url":
                case "opt_font_color":
                case "opt_bg_url":
                case "heading":
                case "opt_focus_font_color":
                    return true;
                default:
                    return super.parseFieldCheck(intlCampingQuestionsData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlCampingQuestionsData intlCampingQuestionsData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlCampingQuestionsData.heading;
            if (str != null) {
                jsonGenerator.writeStringField("heading", str);
            }
            String str2 = intlCampingQuestionsData.heading_font_color;
            if (str2 != null) {
                jsonGenerator.writeStringField("heading_font_color", str2);
            }
            String str3 = intlCampingQuestionsData.bg_url;
            if (str3 != null) {
                jsonGenerator.writeStringField("bg_url", str3);
            }
            String str4 = intlCampingQuestionsData.opt_bg_url;
            if (str4 != null) {
                jsonGenerator.writeStringField("opt_bg_url", str4);
            }
            String str5 = intlCampingQuestionsData.opt_focus_bg_url;
            if (str5 != null) {
                jsonGenerator.writeStringField("opt_focus_bg_url", str5);
            }
            String str6 = intlCampingQuestionsData.opt_focus_font_color;
            if (str6 != null) {
                jsonGenerator.writeStringField("opt_focus_font_color", str6);
            }
            String str7 = intlCampingQuestionsData.opt_font_color;
            if (str7 != null) {
                jsonGenerator.writeStringField("opt_font_color", str7);
            }
            String str8 = intlCampingQuestionsData.opt_focus_logo_url;
            if (str8 != null) {
                jsonGenerator.writeStringField("opt_focus_logo_url", str8);
            }
            if (intlCampingQuestionsData.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(intlCampingQuestionsData.options, jsonGenerator, IntlCampingQuestionOptionsData.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingQuestionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingQuestionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingQuestionsData new_() {
        IntlCampingQuestionsData intlCampingQuestionsData = new IntlCampingQuestionsData();
        intlCampingQuestionsData.nullCheck();
        return intlCampingQuestionsData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCampingQuestionsData mo225055clone() {
        IntlCampingQuestionsData intlCampingQuestionsData = new IntlCampingQuestionsData();
        intlCampingQuestionsData.heading = this.heading;
        intlCampingQuestionsData.heading_font_color = this.heading_font_color;
        intlCampingQuestionsData.bg_url = this.bg_url;
        intlCampingQuestionsData.opt_bg_url = this.opt_bg_url;
        intlCampingQuestionsData.opt_focus_bg_url = this.opt_focus_bg_url;
        intlCampingQuestionsData.opt_focus_font_color = this.opt_focus_font_color;
        intlCampingQuestionsData.opt_font_color = this.opt_font_color;
        intlCampingQuestionsData.opt_focus_logo_url = this.opt_focus_logo_url;
        List<IntlCampingQuestionOptionsData> list = this.options;
        if (list != null) {
            intlCampingQuestionsData.options = ValueObject.util_map(list, new qcj() { // from class: l.y5n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IntlCampingQuestionOptionsData) obj).mo225055clone();
                }
            });
        }
        return intlCampingQuestionsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingQuestionsData)) {
            return false;
        }
        IntlCampingQuestionsData intlCampingQuestionsData = (IntlCampingQuestionsData) obj;
        return ValueObject.util_equals(this.heading, intlCampingQuestionsData.heading) && ValueObject.util_equals(this.heading_font_color, intlCampingQuestionsData.heading_font_color) && ValueObject.util_equals(this.bg_url, intlCampingQuestionsData.bg_url) && ValueObject.util_equals(this.opt_bg_url, intlCampingQuestionsData.opt_bg_url) && ValueObject.util_equals(this.opt_focus_bg_url, intlCampingQuestionsData.opt_focus_bg_url) && ValueObject.util_equals(this.opt_focus_font_color, intlCampingQuestionsData.opt_focus_font_color) && ValueObject.util_equals(this.opt_font_color, intlCampingQuestionsData.opt_font_color) && ValueObject.util_equals(this.opt_focus_logo_url, intlCampingQuestionsData.opt_focus_logo_url) && ValueObject.util_equals(this.options, intlCampingQuestionsData.options);
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
        int i2 = i * 41;
        String str = this.heading;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.heading_font_color;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bg_url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.opt_bg_url;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.opt_focus_bg_url;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.opt_focus_font_color;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.opt_font_color;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.opt_focus_logo_url;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        List<IntlCampingQuestionOptionsData> list = this.options;
        int iHashCode9 = iHashCode8 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.heading == null) {
            this.heading = "";
        }
        if (this.heading_font_color == null) {
            this.heading_font_color = "";
        }
        if (this.bg_url == null) {
            this.bg_url = "";
        }
        if (this.opt_bg_url == null) {
            this.opt_bg_url = "";
        }
        if (this.opt_focus_bg_url == null) {
            this.opt_focus_bg_url = "";
        }
        if (this.opt_focus_font_color == null) {
            this.opt_focus_font_color = "";
        }
        if (this.opt_font_color == null) {
            this.opt_font_color = "";
        }
        if (this.opt_focus_logo_url == null) {
            this.opt_focus_logo_url = "";
        }
        if (this.options == null) {
            this.options = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
