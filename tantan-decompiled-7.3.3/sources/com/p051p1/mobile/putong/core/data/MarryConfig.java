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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class MarryConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "marryconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String card_border_color;

    @NonNull
    @ProtobufIndex(index = 3)
    public String card_head_bg;

    @NonNull
    @ProtobufIndex(index = 4)
    public String card_label_bg_color;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 9)
    public boolean enable_pay_wall;

    @NonNull
    @ProtobufIndex(index = 8)
    public String pre_profile_head_bg;

    @NonNull
    @ProtobufIndex(index = 5)
    public String profile_head_bg_android;

    @NonNull
    @ProtobufIndex(index = 7)
    public String profile_head_bg_ios;

    @NonNull
    @ProtobufIndex(index = 6)
    public String profile_head_state_color;
    public static ProtobufAdapter<MarryConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MarryConfig>() { // from class: com.p1.mobile.putong.core.data.MarryConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MarryConfig marryConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, marryConfig.enable);
            String str = marryConfig.card_border_color;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = marryConfig.card_head_bg;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = marryConfig.card_label_bg_color;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = marryConfig.profile_head_bg_android;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = marryConfig.profile_head_state_color;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            String str6 = marryConfig.profile_head_bg_ios;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            String str7 = marryConfig.pre_profile_head_bg;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str7);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(9, marryConfig.enable_pay_wall);
            marryConfig.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MarryConfig parse(nc5 nc5Var) throws IOException {
            MarryConfig marryConfig = new MarryConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (marryConfig.card_border_color == null) {
                        marryConfig.card_border_color = "";
                    }
                    if (marryConfig.card_head_bg == null) {
                        marryConfig.card_head_bg = "";
                    }
                    if (marryConfig.card_label_bg_color == null) {
                        marryConfig.card_label_bg_color = "";
                    }
                    if (marryConfig.profile_head_bg_android == null) {
                        marryConfig.profile_head_bg_android = "";
                    }
                    if (marryConfig.profile_head_state_color == null) {
                        marryConfig.profile_head_state_color = "";
                    }
                    if (marryConfig.profile_head_bg_ios == null) {
                        marryConfig.profile_head_bg_ios = "";
                    }
                    if (marryConfig.pre_profile_head_bg != null) {
                        break;
                    }
                    marryConfig.pre_profile_head_bg = "";
                    break;
                }
                if (iM162497u == 8) {
                    marryConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    marryConfig.card_border_color = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    marryConfig.card_head_bg = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    marryConfig.card_label_bg_color = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    marryConfig.profile_head_bg_android = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    marryConfig.profile_head_state_color = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    marryConfig.profile_head_bg_ios = nc5Var.m162495s();
                } else if (iM162497u == 66) {
                    marryConfig.pre_profile_head_bg = nc5Var.m162495s();
                } else {
                    if (iM162497u != 72) {
                        if (marryConfig.card_border_color == null) {
                            marryConfig.card_border_color = "";
                        }
                        if (marryConfig.card_head_bg == null) {
                            marryConfig.card_head_bg = "";
                        }
                        if (marryConfig.card_label_bg_color == null) {
                            marryConfig.card_label_bg_color = "";
                        }
                        if (marryConfig.profile_head_bg_android == null) {
                            marryConfig.profile_head_bg_android = "";
                        }
                        if (marryConfig.profile_head_state_color == null) {
                            marryConfig.profile_head_state_color = "";
                        }
                        if (marryConfig.profile_head_bg_ios == null) {
                            marryConfig.profile_head_bg_ios = "";
                        }
                        if (marryConfig.pre_profile_head_bg != null) {
                            break;
                        }
                        marryConfig.pre_profile_head_bg = "";
                        return marryConfig;
                    }
                    marryConfig.enable_pay_wall = nc5Var.m162483g();
                }
            }
            return marryConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MarryConfig marryConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, marryConfig.enable);
            String str = marryConfig.card_border_color;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = marryConfig.card_head_bg;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = marryConfig.card_label_bg_color;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = marryConfig.profile_head_bg_android;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = marryConfig.profile_head_state_color;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            String str6 = marryConfig.profile_head_bg_ios;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
            String str7 = marryConfig.pre_profile_head_bg;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(8, str7);
            }
            codedOutputByteBufferNano.m17299A(9, marryConfig.enable_pay_wall);
        }
    };
    public static JsonAdapter<MarryConfig> JSON_ADAPTER = new ObjectJsonAdapter<MarryConfig>() { // from class: com.p1.mobile.putong.core.data.MarryConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MarryConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MarryConfig newInstance() {
            return new MarryConfig();
        }

        public boolean parseField(MarryConfig marryConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "card_label_bg_color":
                    marryConfig.card_label_bg_color = jsonParser.getValueAsString();
                    return true;
                case "enable":
                    marryConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "profile_head_bg_android":
                    marryConfig.profile_head_bg_android = jsonParser.getValueAsString();
                    return true;
                case "pre_profile_head_bg":
                    marryConfig.pre_profile_head_bg = jsonParser.getValueAsString();
                    return true;
                case "card_border_color":
                    marryConfig.card_border_color = jsonParser.getValueAsString();
                    return true;
                case "card_head_bg":
                    marryConfig.card_head_bg = jsonParser.getValueAsString();
                    return true;
                case "profile_head_state_color":
                    marryConfig.profile_head_state_color = jsonParser.getValueAsString();
                    return true;
                case "enable_pay_wall":
                    marryConfig.enable_pay_wall = jsonParser.getValueAsBoolean();
                    return true;
                case "profile_head_bg_ios":
                    marryConfig.profile_head_bg_ios = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MarryConfig marryConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "card_label_bg_color":
                case "enable":
                case "profile_head_bg_android":
                case "pre_profile_head_bg":
                case "card_border_color":
                case "card_head_bg":
                case "profile_head_state_color":
                case "enable_pay_wall":
                case "profile_head_bg_ios":
                    return true;
                default:
                    return super.parseFieldCheck(marryConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MarryConfig marryConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", marryConfig.enable);
            String str = marryConfig.card_border_color;
            if (str != null) {
                jsonGenerator.writeStringField("card_border_color", str);
            }
            String str2 = marryConfig.card_head_bg;
            if (str2 != null) {
                jsonGenerator.writeStringField("card_head_bg", str2);
            }
            String str3 = marryConfig.card_label_bg_color;
            if (str3 != null) {
                jsonGenerator.writeStringField("card_label_bg_color", str3);
            }
            String str4 = marryConfig.profile_head_bg_android;
            if (str4 != null) {
                jsonGenerator.writeStringField("profile_head_bg_android", str4);
            }
            String str5 = marryConfig.profile_head_state_color;
            if (str5 != null) {
                jsonGenerator.writeStringField("profile_head_state_color", str5);
            }
            String str6 = marryConfig.profile_head_bg_ios;
            if (str6 != null) {
                jsonGenerator.writeStringField("profile_head_bg_ios", str6);
            }
            String str7 = marryConfig.pre_profile_head_bg;
            if (str7 != null) {
                jsonGenerator.writeStringField("pre_profile_head_bg", str7);
            }
            jsonGenerator.writeBooleanField("enable_pay_wall", marryConfig.enable_pay_wall);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarryConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarryConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarryConfig new_() {
        MarryConfig marryConfig = new MarryConfig();
        marryConfig.nullCheck();
        return marryConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MarryConfig mo225055clone() {
        MarryConfig marryConfig = new MarryConfig();
        marryConfig.enable = this.enable;
        marryConfig.card_border_color = this.card_border_color;
        marryConfig.card_head_bg = this.card_head_bg;
        marryConfig.card_label_bg_color = this.card_label_bg_color;
        marryConfig.profile_head_bg_android = this.profile_head_bg_android;
        marryConfig.profile_head_state_color = this.profile_head_state_color;
        marryConfig.profile_head_bg_ios = this.profile_head_bg_ios;
        marryConfig.pre_profile_head_bg = this.pre_profile_head_bg;
        marryConfig.enable_pay_wall = this.enable_pay_wall;
        return marryConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarryConfig)) {
            return false;
        }
        MarryConfig marryConfig = (MarryConfig) obj;
        return this.enable == marryConfig.enable && ValueObject.util_equals(this.card_border_color, marryConfig.card_border_color) && ValueObject.util_equals(this.card_head_bg, marryConfig.card_head_bg) && ValueObject.util_equals(this.card_label_bg_color, marryConfig.card_label_bg_color) && ValueObject.util_equals(this.profile_head_bg_android, marryConfig.profile_head_bg_android) && ValueObject.util_equals(this.profile_head_state_color, marryConfig.profile_head_state_color) && ValueObject.util_equals(this.profile_head_bg_ios, marryConfig.profile_head_bg_ios) && ValueObject.util_equals(this.pre_profile_head_bg, marryConfig.pre_profile_head_bg) && this.enable_pay_wall == marryConfig.enable_pay_wall;
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
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.card_border_color;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.card_head_bg;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.card_label_bg_color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.profile_head_bg_android;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.profile_head_state_color;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.profile_head_bg_ios;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.pre_profile_head_bg;
        int iHashCode7 = ((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.enable_pay_wall ? 1231 : 1237);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.card_border_color == null) {
            this.card_border_color = "";
        }
        if (this.card_head_bg == null) {
            this.card_head_bg = "";
        }
        if (this.card_label_bg_color == null) {
            this.card_label_bg_color = "";
        }
        if (this.profile_head_bg_android == null) {
            this.profile_head_bg_android = "";
        }
        if (this.profile_head_state_color == null) {
            this.profile_head_state_color = "";
        }
        if (this.profile_head_bg_ios == null) {
            this.profile_head_bg_ios = "";
        }
        if (this.pre_profile_head_bg == null) {
            this.pre_profile_head_bg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
