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
public class MarryGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "marryguideconfig";

    @ProtobufIndex(index = 1)
    public int continuous_left;

    @ProtobufIndex(index = 2)
    public int continuous_no_match;

    @NonNull
    @ProtobufIndex(index = 3)
    public String female_action;

    @ProtobufIndex(index = 6)
    public int guide_timeinterval;

    @NonNull
    @ProtobufIndex(index = 4)
    public String male_action;

    @ProtobufIndex(index = 7)
    public boolean scroll_pay_wall;

    @ProtobufIndex(index = 5)
    public int totoal_guide_limit;
    public static ProtobufAdapter<MarryGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MarryGuideConfig>() { // from class: com.p1.mobile.putong.core.data.MarryGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MarryGuideConfig marryGuideConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, marryGuideConfig.continuous_left) + CodedOutputByteBufferNano.m17281h(2, marryGuideConfig.continuous_no_match);
            String str = marryGuideConfig.female_action;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = marryGuideConfig.male_action;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(5, marryGuideConfig.totoal_guide_limit) + CodedOutputByteBufferNano.m17281h(6, marryGuideConfig.guide_timeinterval) + CodedOutputByteBufferNano.m17275b(7, marryGuideConfig.scroll_pay_wall);
            marryGuideConfig.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MarryGuideConfig parse(nc5 nc5Var) throws IOException {
            MarryGuideConfig marryGuideConfig = new MarryGuideConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (marryGuideConfig.female_action == null) {
                        marryGuideConfig.female_action = "";
                    }
                    if (marryGuideConfig.male_action != null) {
                        break;
                    }
                    marryGuideConfig.male_action = "";
                    break;
                }
                if (iM162497u == 8) {
                    marryGuideConfig.continuous_left = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    marryGuideConfig.continuous_no_match = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    marryGuideConfig.female_action = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    marryGuideConfig.male_action = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    marryGuideConfig.totoal_guide_limit = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    marryGuideConfig.guide_timeinterval = nc5Var.m162486j();
                } else {
                    if (iM162497u != 56) {
                        if (marryGuideConfig.female_action == null) {
                            marryGuideConfig.female_action = "";
                        }
                        if (marryGuideConfig.male_action != null) {
                            break;
                        }
                        marryGuideConfig.male_action = "";
                        return marryGuideConfig;
                    }
                    marryGuideConfig.scroll_pay_wall = nc5Var.m162483g();
                }
            }
            return marryGuideConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MarryGuideConfig marryGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, marryGuideConfig.continuous_left);
            codedOutputByteBufferNano.m17305G(2, marryGuideConfig.continuous_no_match);
            String str = marryGuideConfig.female_action;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = marryGuideConfig.male_action;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            codedOutputByteBufferNano.m17305G(5, marryGuideConfig.totoal_guide_limit);
            codedOutputByteBufferNano.m17305G(6, marryGuideConfig.guide_timeinterval);
            codedOutputByteBufferNano.m17299A(7, marryGuideConfig.scroll_pay_wall);
        }
    };
    public static JsonAdapter<MarryGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<MarryGuideConfig>() { // from class: com.p1.mobile.putong.core.data.MarryGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MarryGuideConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MarryGuideConfig newInstance() {
            return new MarryGuideConfig();
        }

        public boolean parseField(MarryGuideConfig marryGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "totoal_guide_limit":
                    marryGuideConfig.totoal_guide_limit = jsonParser.getValueAsInt();
                    return true;
                case "male_action":
                    marryGuideConfig.male_action = jsonParser.getValueAsString();
                    return true;
                case "female_action":
                    marryGuideConfig.female_action = jsonParser.getValueAsString();
                    return true;
                case "continuous_no_match":
                    marryGuideConfig.continuous_no_match = jsonParser.getValueAsInt();
                    return true;
                case "guide_timeinterval":
                    marryGuideConfig.guide_timeinterval = jsonParser.getValueAsInt();
                    return true;
                case "continuous_left":
                    marryGuideConfig.continuous_left = jsonParser.getValueAsInt();
                    return true;
                case "scroll_pay_wall":
                    marryGuideConfig.scroll_pay_wall = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MarryGuideConfig marryGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "totoal_guide_limit":
                case "male_action":
                case "female_action":
                case "continuous_no_match":
                case "guide_timeinterval":
                case "continuous_left":
                case "scroll_pay_wall":
                    return true;
                default:
                    return super.parseFieldCheck(marryGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MarryGuideConfig marryGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("continuous_left", marryGuideConfig.continuous_left);
            jsonGenerator.writeNumberField("continuous_no_match", marryGuideConfig.continuous_no_match);
            String str = marryGuideConfig.female_action;
            if (str != null) {
                jsonGenerator.writeStringField("female_action", str);
            }
            String str2 = marryGuideConfig.male_action;
            if (str2 != null) {
                jsonGenerator.writeStringField("male_action", str2);
            }
            jsonGenerator.writeNumberField("totoal_guide_limit", marryGuideConfig.totoal_guide_limit);
            jsonGenerator.writeNumberField("guide_timeinterval", marryGuideConfig.guide_timeinterval);
            jsonGenerator.writeBooleanField("scroll_pay_wall", marryGuideConfig.scroll_pay_wall);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarryGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarryGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarryGuideConfig new_() {
        MarryGuideConfig marryGuideConfig = new MarryGuideConfig();
        marryGuideConfig.nullCheck();
        return marryGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MarryGuideConfig mo225055clone() {
        MarryGuideConfig marryGuideConfig = new MarryGuideConfig();
        marryGuideConfig.continuous_left = this.continuous_left;
        marryGuideConfig.continuous_no_match = this.continuous_no_match;
        marryGuideConfig.female_action = this.female_action;
        marryGuideConfig.male_action = this.male_action;
        marryGuideConfig.totoal_guide_limit = this.totoal_guide_limit;
        marryGuideConfig.guide_timeinterval = this.guide_timeinterval;
        marryGuideConfig.scroll_pay_wall = this.scroll_pay_wall;
        return marryGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarryGuideConfig)) {
            return false;
        }
        MarryGuideConfig marryGuideConfig = (MarryGuideConfig) obj;
        return this.continuous_left == marryGuideConfig.continuous_left && this.continuous_no_match == marryGuideConfig.continuous_no_match && ValueObject.util_equals(this.female_action, marryGuideConfig.female_action) && ValueObject.util_equals(this.male_action, marryGuideConfig.male_action) && this.totoal_guide_limit == marryGuideConfig.totoal_guide_limit && this.guide_timeinterval == marryGuideConfig.guide_timeinterval && this.scroll_pay_wall == marryGuideConfig.scroll_pay_wall;
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
        int i2 = ((((i * 41) + this.continuous_left) * 41) + this.continuous_no_match) * 41;
        String str = this.female_action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.male_action;
        int iHashCode2 = ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.totoal_guide_limit) * 41) + this.guide_timeinterval) * 41) + (this.scroll_pay_wall ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.female_action == null) {
            this.female_action = "";
        }
        if (this.male_action == null) {
            this.male_action = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
