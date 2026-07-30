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
public class MarryGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "marryguideconfig";

    @ProtobufIndex(index = 1)
    public int continuous_left;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int continuous_no_match;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String female_action;

    @ProtobufIndex(index = 6)
    public int guide_timeinterval;

    @NonNull
    @ProtobufIndex(index = 4)
    public String male_action;

    @ProtobufIndex(index = 7)
    public boolean scroll_pay_wall;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int totoal_guide_limit;
    public static ProtobufAdapter<MarryGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MarryGuideConfig>() { // from class: com.p1.mobile.putong.core.data.MarryGuideConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MarryGuideConfig marryGuideConfig) {
            int iH = CodedOutputByteBufferNano.h(1, marryGuideConfig.continuous_left) + CodedOutputByteBufferNano.h(2, marryGuideConfig.continuous_no_match);
            String str = marryGuideConfig.female_action;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            String str2 = marryGuideConfig.male_action;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(5, marryGuideConfig.totoal_guide_limit) + CodedOutputByteBufferNano.h(6, marryGuideConfig.guide_timeinterval) + CodedOutputByteBufferNano.b(7, marryGuideConfig.scroll_pay_wall);
            ((MessageNano) marryGuideConfig).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MarryGuideConfig m14057parse(nb5 nb5Var) throws IOException {
            MarryGuideConfig marryGuideConfig = new MarryGuideConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (marryGuideConfig.female_action == null) {
                        marryGuideConfig.female_action = "";
                    }
                    if (marryGuideConfig.male_action != null) {
                        break;
                    }
                    marryGuideConfig.male_action = "";
                    break;
                }
                if (iU == 8) {
                    marryGuideConfig.continuous_left = nb5Var.j();
                } else if (iU == 16) {
                    marryGuideConfig.continuous_no_match = nb5Var.j();
                } else if (iU == 26) {
                    marryGuideConfig.female_action = nb5Var.s();
                } else if (iU == 34) {
                    marryGuideConfig.male_action = nb5Var.s();
                } else if (iU == 40) {
                    marryGuideConfig.totoal_guide_limit = nb5Var.j();
                } else if (iU == 48) {
                    marryGuideConfig.guide_timeinterval = nb5Var.j();
                } else {
                    if (iU != 56) {
                        if (marryGuideConfig.female_action == null) {
                            marryGuideConfig.female_action = "";
                        }
                        if (marryGuideConfig.male_action != null) {
                            break;
                        }
                        marryGuideConfig.male_action = "";
                        return marryGuideConfig;
                    }
                    marryGuideConfig.scroll_pay_wall = nb5Var.g();
                }
            }
            return marryGuideConfig;
        }

        public void serialize(MarryGuideConfig marryGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, marryGuideConfig.continuous_left);
            codedOutputByteBufferNano.G(2, marryGuideConfig.continuous_no_match);
            String str = marryGuideConfig.female_action;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            String str2 = marryGuideConfig.male_action;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            codedOutputByteBufferNano.G(5, marryGuideConfig.totoal_guide_limit);
            codedOutputByteBufferNano.G(6, marryGuideConfig.guide_timeinterval);
            codedOutputByteBufferNano.A(7, marryGuideConfig.scroll_pay_wall);
        }
    };
    public static JsonAdapter<MarryGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<MarryGuideConfig>() { // from class: com.p1.mobile.putong.core.data.MarryGuideConfig.2
        public Class getDataClass() {
            return MarryGuideConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MarryGuideConfig m14058newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarryGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarryGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarryGuideConfig new_() {
        MarryGuideConfig marryGuideConfig = new MarryGuideConfig();
        marryGuideConfig.nullCheck();
        return marryGuideConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MarryGuideConfig m14056clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.continuous_left) * 41) + this.continuous_no_match) * 41;
        String str = this.female_action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.male_action;
        int iHashCode2 = ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.totoal_guide_limit) * 41) + this.guide_timeinterval) * 41) + (this.scroll_pay_wall ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.female_action == null) {
            this.female_action = "";
        }
        if (this.male_action == null) {
            this.male_action = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
