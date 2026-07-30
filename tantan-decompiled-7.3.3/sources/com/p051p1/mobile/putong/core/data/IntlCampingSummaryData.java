package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlCampingSummaryData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingsummarydata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = 6)
    public String btn_bg_color;

    @NonNull
    @ProtobufIndex(index = 7)
    public String btn_font_color;

    @NonNull
    @ProtobufIndex(index = 4)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 5)
    public String desc_font_color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String heading_url;

    @NonNull
    @ProtobufIndex(index = 2)
    public String logo_url;

    @NonNull
    @ProtobufIndex(index = 10)
    public String question_bg_url;

    @NonNull
    @ProtobufIndex(index = 8)
    public String start_btn_desc;

    @NonNull
    @ProtobufIndex(index = 9)
    public String success_btn_desc;
    public static ProtobufAdapter<IntlCampingSummaryData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingSummaryData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingSummaryData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCampingSummaryData intlCampingSummaryData) {
            String str = intlCampingSummaryData.heading_url;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = intlCampingSummaryData.logo_url;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = intlCampingSummaryData.bg_url;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = intlCampingSummaryData.desc;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = intlCampingSummaryData.desc_font_color;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = intlCampingSummaryData.btn_bg_color;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = intlCampingSummaryData.btn_font_color;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            String str8 = intlCampingSummaryData.start_btn_desc;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str8);
            }
            String str9 = intlCampingSummaryData.success_btn_desc;
            if (str9 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str9);
            }
            String str10 = intlCampingSummaryData.question_bg_url;
            if (str10 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str10);
            }
            intlCampingSummaryData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCampingSummaryData parse(nc5 nc5Var) throws IOException {
            IntlCampingSummaryData intlCampingSummaryData = new IntlCampingSummaryData();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (intlCampingSummaryData.heading_url == null) {
                            intlCampingSummaryData.heading_url = "";
                        }
                        if (intlCampingSummaryData.logo_url == null) {
                            intlCampingSummaryData.logo_url = "";
                        }
                        if (intlCampingSummaryData.bg_url == null) {
                            intlCampingSummaryData.bg_url = "";
                        }
                        if (intlCampingSummaryData.desc == null) {
                            intlCampingSummaryData.desc = "";
                        }
                        if (intlCampingSummaryData.question_bg_url == null) {
                            intlCampingSummaryData.question_bg_url = "";
                        }
                        if (intlCampingSummaryData.desc_font_color == null) {
                            intlCampingSummaryData.desc_font_color = "";
                        }
                        if (intlCampingSummaryData.btn_bg_color == null) {
                            intlCampingSummaryData.btn_bg_color = "";
                        }
                        if (intlCampingSummaryData.btn_font_color == null) {
                            intlCampingSummaryData.btn_font_color = "";
                        }
                        if (intlCampingSummaryData.start_btn_desc == null) {
                            intlCampingSummaryData.start_btn_desc = "";
                        }
                        if (intlCampingSummaryData.success_btn_desc == null) {
                            intlCampingSummaryData.success_btn_desc = "";
                        }
                        break;
                    case 10:
                        intlCampingSummaryData.heading_url = nc5Var.m162495s();
                        continue;
                    case 18:
                        intlCampingSummaryData.logo_url = nc5Var.m162495s();
                        continue;
                    case 26:
                        intlCampingSummaryData.bg_url = nc5Var.m162495s();
                        continue;
                    case 34:
                        intlCampingSummaryData.desc = nc5Var.m162495s();
                        continue;
                    case 42:
                        intlCampingSummaryData.desc_font_color = nc5Var.m162495s();
                        continue;
                    case 50:
                        intlCampingSummaryData.btn_bg_color = nc5Var.m162495s();
                        continue;
                    case 58:
                        intlCampingSummaryData.btn_font_color = nc5Var.m162495s();
                        continue;
                    case 66:
                        intlCampingSummaryData.start_btn_desc = nc5Var.m162495s();
                        continue;
                    case 74:
                        intlCampingSummaryData.success_btn_desc = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        intlCampingSummaryData.question_bg_url = nc5Var.m162495s();
                        continue;
                    default:
                        if (intlCampingSummaryData.heading_url == null) {
                            intlCampingSummaryData.heading_url = "";
                        }
                        if (intlCampingSummaryData.logo_url == null) {
                            intlCampingSummaryData.logo_url = "";
                        }
                        if (intlCampingSummaryData.bg_url == null) {
                            intlCampingSummaryData.bg_url = "";
                        }
                        if (intlCampingSummaryData.desc == null) {
                            intlCampingSummaryData.desc = "";
                        }
                        if (intlCampingSummaryData.question_bg_url == null) {
                            intlCampingSummaryData.question_bg_url = "";
                        }
                        if (intlCampingSummaryData.desc_font_color == null) {
                            intlCampingSummaryData.desc_font_color = "";
                        }
                        if (intlCampingSummaryData.btn_bg_color == null) {
                            intlCampingSummaryData.btn_bg_color = "";
                        }
                        if (intlCampingSummaryData.btn_font_color == null) {
                            intlCampingSummaryData.btn_font_color = "";
                        }
                        if (intlCampingSummaryData.start_btn_desc == null) {
                            intlCampingSummaryData.start_btn_desc = "";
                        }
                        if (intlCampingSummaryData.success_btn_desc == null) {
                            intlCampingSummaryData.success_btn_desc = "";
                            return intlCampingSummaryData;
                        }
                        break;
                }
            }
            return intlCampingSummaryData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCampingSummaryData intlCampingSummaryData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlCampingSummaryData.heading_url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = intlCampingSummaryData.logo_url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = intlCampingSummaryData.bg_url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = intlCampingSummaryData.desc;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = intlCampingSummaryData.desc_font_color;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = intlCampingSummaryData.btn_bg_color;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = intlCampingSummaryData.btn_font_color;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            String str8 = intlCampingSummaryData.start_btn_desc;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(8, str8);
            }
            String str9 = intlCampingSummaryData.success_btn_desc;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(9, str9);
            }
            String str10 = intlCampingSummaryData.question_bg_url;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(10, str10);
            }
        }
    };
    public static JsonAdapter<IntlCampingSummaryData> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingSummaryData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingSummaryData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCampingSummaryData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCampingSummaryData newInstance() {
            return new IntlCampingSummaryData();
        }

        public boolean parseField(IntlCampingSummaryData intlCampingSummaryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bg_url":
                    intlCampingSummaryData.bg_url = jsonParser.getValueAsString();
                    return true;
                case "start_btn_desc":
                    intlCampingSummaryData.start_btn_desc = jsonParser.getValueAsString();
                    return true;
                case "btn_font_color":
                    intlCampingSummaryData.btn_font_color = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    intlCampingSummaryData.desc = jsonParser.getValueAsString();
                    return true;
                case "heading_url":
                    intlCampingSummaryData.heading_url = jsonParser.getValueAsString();
                    return true;
                case "btn_bg_color":
                    intlCampingSummaryData.btn_bg_color = jsonParser.getValueAsString();
                    return true;
                case "success_btn_desc":
                    intlCampingSummaryData.success_btn_desc = jsonParser.getValueAsString();
                    return true;
                case "question_bg_url":
                    intlCampingSummaryData.question_bg_url = jsonParser.getValueAsString();
                    return true;
                case "desc_font_color":
                    intlCampingSummaryData.desc_font_color = jsonParser.getValueAsString();
                    return true;
                case "logo_url":
                    intlCampingSummaryData.logo_url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlCampingSummaryData intlCampingSummaryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bg_url":
                case "start_btn_desc":
                case "btn_font_color":
                case "desc":
                case "heading_url":
                case "btn_bg_color":
                case "success_btn_desc":
                case "question_bg_url":
                case "desc_font_color":
                case "logo_url":
                    return true;
                default:
                    return super.parseFieldCheck(intlCampingSummaryData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlCampingSummaryData intlCampingSummaryData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlCampingSummaryData.heading_url;
            if (str != null) {
                jsonGenerator.writeStringField("heading_url", str);
            }
            String str2 = intlCampingSummaryData.logo_url;
            if (str2 != null) {
                jsonGenerator.writeStringField("logo_url", str2);
            }
            String str3 = intlCampingSummaryData.bg_url;
            if (str3 != null) {
                jsonGenerator.writeStringField("bg_url", str3);
            }
            String str4 = intlCampingSummaryData.desc;
            if (str4 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str4);
            }
            String str5 = intlCampingSummaryData.question_bg_url;
            if (str5 != null) {
                jsonGenerator.writeStringField("question_bg_url", str5);
            }
            String str6 = intlCampingSummaryData.desc_font_color;
            if (str6 != null) {
                jsonGenerator.writeStringField("desc_font_color", str6);
            }
            String str7 = intlCampingSummaryData.btn_bg_color;
            if (str7 != null) {
                jsonGenerator.writeStringField("btn_bg_color", str7);
            }
            String str8 = intlCampingSummaryData.btn_font_color;
            if (str8 != null) {
                jsonGenerator.writeStringField("btn_font_color", str8);
            }
            String str9 = intlCampingSummaryData.start_btn_desc;
            if (str9 != null) {
                jsonGenerator.writeStringField("start_btn_desc", str9);
            }
            String str10 = intlCampingSummaryData.success_btn_desc;
            if (str10 != null) {
                jsonGenerator.writeStringField("success_btn_desc", str10);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingSummaryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingSummaryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingSummaryData new_() {
        IntlCampingSummaryData intlCampingSummaryData = new IntlCampingSummaryData();
        intlCampingSummaryData.nullCheck();
        return intlCampingSummaryData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCampingSummaryData mo225055clone() {
        IntlCampingSummaryData intlCampingSummaryData = new IntlCampingSummaryData();
        intlCampingSummaryData.heading_url = this.heading_url;
        intlCampingSummaryData.logo_url = this.logo_url;
        intlCampingSummaryData.bg_url = this.bg_url;
        intlCampingSummaryData.desc = this.desc;
        intlCampingSummaryData.question_bg_url = this.question_bg_url;
        intlCampingSummaryData.desc_font_color = this.desc_font_color;
        intlCampingSummaryData.btn_bg_color = this.btn_bg_color;
        intlCampingSummaryData.btn_font_color = this.btn_font_color;
        intlCampingSummaryData.start_btn_desc = this.start_btn_desc;
        intlCampingSummaryData.success_btn_desc = this.success_btn_desc;
        return intlCampingSummaryData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingSummaryData)) {
            return false;
        }
        IntlCampingSummaryData intlCampingSummaryData = (IntlCampingSummaryData) obj;
        return ValueObject.util_equals(this.heading_url, intlCampingSummaryData.heading_url) && ValueObject.util_equals(this.logo_url, intlCampingSummaryData.logo_url) && ValueObject.util_equals(this.bg_url, intlCampingSummaryData.bg_url) && ValueObject.util_equals(this.desc, intlCampingSummaryData.desc) && ValueObject.util_equals(this.question_bg_url, intlCampingSummaryData.question_bg_url) && ValueObject.util_equals(this.desc_font_color, intlCampingSummaryData.desc_font_color) && ValueObject.util_equals(this.btn_bg_color, intlCampingSummaryData.btn_bg_color) && ValueObject.util_equals(this.btn_font_color, intlCampingSummaryData.btn_font_color) && ValueObject.util_equals(this.start_btn_desc, intlCampingSummaryData.start_btn_desc) && ValueObject.util_equals(this.success_btn_desc, intlCampingSummaryData.success_btn_desc);
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
        String str = this.heading_url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.logo_url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bg_url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.question_bg_url;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.desc_font_color;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.btn_bg_color;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.btn_font_color;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.start_btn_desc;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.success_btn_desc;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.heading_url == null) {
            this.heading_url = "";
        }
        if (this.logo_url == null) {
            this.logo_url = "";
        }
        if (this.bg_url == null) {
            this.bg_url = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.question_bg_url == null) {
            this.question_bg_url = "";
        }
        if (this.desc_font_color == null) {
            this.desc_font_color = "";
        }
        if (this.btn_bg_color == null) {
            this.btn_bg_color = "";
        }
        if (this.btn_font_color == null) {
            this.btn_font_color = "";
        }
        if (this.start_btn_desc == null) {
            this.start_btn_desc = "";
        }
        if (this.success_btn_desc == null) {
            this.success_btn_desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
