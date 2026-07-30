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
public class DynamicLable extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dynamiclable";

    @NonNull
    @ProtobufIndex(index = 6)
    public LabelBackground background;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 7)
    public LabelIconStyle iconStyle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String label;

    @NonNull
    @ProtobufIndex(index = 9)
    public LabelshowTips showTips;

    @NonNull
    @ProtobufIndex(index = 8)
    public LabelStatistics statistics;

    @ProtobufIndex(index = 4)
    public boolean textBold;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String textColor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<DynamicLable> PROTOBUF_ADAPTER = new MessageNanoAdapter<DynamicLable>() { // from class: com.p1.mobile.putong.core.data.DynamicLable.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DynamicLable dynamicLable) {
            String str = dynamicLable.label;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = dynamicLable.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = dynamicLable.textColor;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, dynamicLable.textBold);
            String str4 = dynamicLable.deeplink;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(5, str4);
            }
            LabelBackground labelBackground = dynamicLable.background;
            if (labelBackground != null) {
                iB += CodedOutputByteBufferNano.l(6, labelBackground, LabelBackground.PROTOBUF_ADAPTER);
            }
            LabelIconStyle labelIconStyle = dynamicLable.iconStyle;
            if (labelIconStyle != null) {
                iB += CodedOutputByteBufferNano.l(7, labelIconStyle, LabelIconStyle.PROTOBUF_ADAPTER);
            }
            LabelStatistics labelStatistics = dynamicLable.statistics;
            if (labelStatistics != null) {
                iB += CodedOutputByteBufferNano.l(8, labelStatistics, LabelStatistics.PROTOBUF_ADAPTER);
            }
            LabelshowTips labelshowTips = dynamicLable.showTips;
            if (labelshowTips != null) {
                iB += CodedOutputByteBufferNano.l(9, labelshowTips, LabelshowTips.PROTOBUF_ADAPTER);
            }
            ((MessageNano) dynamicLable).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DynamicLable m12629parse(nb5 nb5Var) throws IOException {
            DynamicLable dynamicLable = new DynamicLable();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (dynamicLable.label == null) {
                        dynamicLable.label = "";
                    }
                    if (dynamicLable.type == null) {
                        dynamicLable.type = "";
                    }
                    if (dynamicLable.textColor == null) {
                        dynamicLable.textColor = "";
                    }
                    if (dynamicLable.deeplink == null) {
                        dynamicLable.deeplink = "";
                    }
                    if (dynamicLable.background == null) {
                        dynamicLable.background = LabelBackground.new_();
                    }
                    if (dynamicLable.iconStyle == null) {
                        dynamicLable.iconStyle = LabelIconStyle.new_();
                    }
                    if (dynamicLable.statistics == null) {
                        dynamicLable.statistics = LabelStatistics.new_();
                    }
                    if (dynamicLable.showTips != null) {
                        break;
                    }
                    dynamicLable.showTips = LabelshowTips.new_();
                    break;
                }
                if (iU == 10) {
                    dynamicLable.label = nb5Var.s();
                } else if (iU == 18) {
                    dynamicLable.type = nb5Var.s();
                } else if (iU == 26) {
                    dynamicLable.textColor = nb5Var.s();
                } else if (iU == 32) {
                    dynamicLable.textBold = nb5Var.g();
                } else if (iU == 42) {
                    dynamicLable.deeplink = nb5Var.s();
                } else if (iU == 50) {
                    dynamicLable.background = (LabelBackground) nb5Var.l(LabelBackground.PROTOBUF_ADAPTER);
                } else if (iU == 58) {
                    dynamicLable.iconStyle = (LabelIconStyle) nb5Var.l(LabelIconStyle.PROTOBUF_ADAPTER);
                } else if (iU == 66) {
                    dynamicLable.statistics = (LabelStatistics) nb5Var.l(LabelStatistics.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 74) {
                        if (dynamicLable.label == null) {
                            dynamicLable.label = "";
                        }
                        if (dynamicLable.type == null) {
                            dynamicLable.type = "";
                        }
                        if (dynamicLable.textColor == null) {
                            dynamicLable.textColor = "";
                        }
                        if (dynamicLable.deeplink == null) {
                            dynamicLable.deeplink = "";
                        }
                        if (dynamicLable.background == null) {
                            dynamicLable.background = LabelBackground.new_();
                        }
                        if (dynamicLable.iconStyle == null) {
                            dynamicLable.iconStyle = LabelIconStyle.new_();
                        }
                        if (dynamicLable.statistics == null) {
                            dynamicLable.statistics = LabelStatistics.new_();
                        }
                        if (dynamicLable.showTips != null) {
                            break;
                        }
                        dynamicLable.showTips = LabelshowTips.new_();
                        return dynamicLable;
                    }
                    dynamicLable.showTips = (LabelshowTips) nb5Var.l(LabelshowTips.PROTOBUF_ADAPTER);
                }
            }
            return dynamicLable;
        }

        public void serialize(DynamicLable dynamicLable, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dynamicLable.label;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = dynamicLable.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = dynamicLable.textColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, dynamicLable.textBold);
            String str4 = dynamicLable.deeplink;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            LabelBackground labelBackground = dynamicLable.background;
            if (labelBackground != null) {
                codedOutputByteBufferNano.K(6, labelBackground, LabelBackground.PROTOBUF_ADAPTER);
            }
            LabelIconStyle labelIconStyle = dynamicLable.iconStyle;
            if (labelIconStyle != null) {
                codedOutputByteBufferNano.K(7, labelIconStyle, LabelIconStyle.PROTOBUF_ADAPTER);
            }
            LabelStatistics labelStatistics = dynamicLable.statistics;
            if (labelStatistics != null) {
                codedOutputByteBufferNano.K(8, labelStatistics, LabelStatistics.PROTOBUF_ADAPTER);
            }
            LabelshowTips labelshowTips = dynamicLable.showTips;
            if (labelshowTips != null) {
                codedOutputByteBufferNano.K(9, labelshowTips, LabelshowTips.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<DynamicLable> JSON_ADAPTER = new ObjectJsonAdapter<DynamicLable>() { // from class: com.p1.mobile.putong.core.data.DynamicLable.2
        public Class getDataClass() {
            return DynamicLable.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DynamicLable m12630newInstance() {
            return new DynamicLable();
        }

        public boolean parseField(DynamicLable dynamicLable, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iconStyle":
                    dynamicLable.iconStyle = (LabelIconStyle) LabelIconStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "background":
                    dynamicLable.background = (LabelBackground) LabelBackground.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "textColor":
                    dynamicLable.textColor = jsonParser.getValueAsString();
                    return true;
                case "textBold":
                    dynamicLable.textBold = jsonParser.getValueAsBoolean();
                    return true;
                case "showTips":
                    dynamicLable.showTips = (LabelshowTips) LabelshowTips.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "statistics":
                    dynamicLable.statistics = (LabelStatistics) LabelStatistics.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    dynamicLable.type = jsonParser.getValueAsString();
                    return true;
                case "label":
                    dynamicLable.label = jsonParser.getValueAsString();
                    return true;
                case "deeplink":
                    dynamicLable.deeplink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DynamicLable dynamicLable, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iconStyle":
                case "background":
                case "textColor":
                case "textBold":
                case "showTips":
                case "statistics":
                case "type":
                case "label":
                case "deeplink":
                    return true;
                default:
                    return super.parseFieldCheck(dynamicLable, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(DynamicLable dynamicLable, JsonGenerator jsonGenerator) throws IOException {
            String str = dynamicLable.label;
            if (str != null) {
                jsonGenerator.writeStringField("label", str);
            }
            String str2 = dynamicLable.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = dynamicLable.textColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("textColor", str3);
            }
            jsonGenerator.writeBooleanField("textBold", dynamicLable.textBold);
            String str4 = dynamicLable.deeplink;
            if (str4 != null) {
                jsonGenerator.writeStringField("deeplink", str4);
            }
            if (dynamicLable.background != null) {
                jsonGenerator.writeFieldName("background");
                LabelBackground.JSON_ADAPTER.serialize(dynamicLable.background, jsonGenerator, true);
            }
            if (dynamicLable.iconStyle != null) {
                jsonGenerator.writeFieldName("iconStyle");
                LabelIconStyle.JSON_ADAPTER.serialize(dynamicLable.iconStyle, jsonGenerator, true);
            }
            if (dynamicLable.statistics != null) {
                jsonGenerator.writeFieldName("statistics");
                LabelStatistics.JSON_ADAPTER.serialize(dynamicLable.statistics, jsonGenerator, true);
            }
            if (dynamicLable.showTips != null) {
                jsonGenerator.writeFieldName("showTips");
                LabelshowTips.JSON_ADAPTER.serialize(dynamicLable.showTips, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DynamicLable) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DynamicLable) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DynamicLable new_() {
        DynamicLable dynamicLable = new DynamicLable();
        dynamicLable.nullCheck();
        return dynamicLable;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DynamicLable m12628clone() {
        DynamicLable dynamicLable = new DynamicLable();
        dynamicLable.label = this.label;
        dynamicLable.type = this.type;
        dynamicLable.textColor = this.textColor;
        dynamicLable.textBold = this.textBold;
        dynamicLable.deeplink = this.deeplink;
        LabelBackground labelBackground = this.background;
        if (labelBackground != null) {
            dynamicLable.background = labelBackground.m13788clone();
        }
        LabelIconStyle labelIconStyle = this.iconStyle;
        if (labelIconStyle != null) {
            dynamicLable.iconStyle = labelIconStyle.m13800clone();
        }
        LabelStatistics labelStatistics = this.statistics;
        if (labelStatistics != null) {
            dynamicLable.statistics = labelStatistics.m13808clone();
        }
        LabelshowTips labelshowTips = this.showTips;
        if (labelshowTips != null) {
            dynamicLable.showTips = labelshowTips.m13812clone();
        }
        return dynamicLable;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicLable)) {
            return false;
        }
        DynamicLable dynamicLable = (DynamicLable) obj;
        return ValueObject.util_equals(this.label, dynamicLable.label) && ValueObject.util_equals(this.type, dynamicLable.type) && ValueObject.util_equals(this.textColor, dynamicLable.textColor) && this.textBold == dynamicLable.textBold && ValueObject.util_equals(this.deeplink, dynamicLable.deeplink) && ValueObject.util_equals(this.background, dynamicLable.background) && ValueObject.util_equals(this.iconStyle, dynamicLable.iconStyle) && ValueObject.util_equals(this.statistics, dynamicLable.statistics) && ValueObject.util_equals(this.showTips, dynamicLable.showTips);
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
        String str = this.label;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.textColor;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.textBold ? 1231 : 1237)) * 41;
        String str4 = this.deeplink;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        LabelBackground labelBackground = this.background;
        int iHashCode5 = (iHashCode4 + (labelBackground != null ? labelBackground.hashCode() : 0)) * 41;
        LabelIconStyle labelIconStyle = this.iconStyle;
        int iHashCode6 = (iHashCode5 + (labelIconStyle != null ? labelIconStyle.hashCode() : 0)) * 41;
        LabelStatistics labelStatistics = this.statistics;
        int iHashCode7 = (iHashCode6 + (labelStatistics != null ? labelStatistics.hashCode() : 0)) * 41;
        LabelshowTips labelshowTips = this.showTips;
        int iHashCode8 = iHashCode7 + (labelshowTips != null ? labelshowTips.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.label == null) {
            this.label = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.background == null) {
            this.background = LabelBackground.new_();
        }
        if (this.iconStyle == null) {
            this.iconStyle = LabelIconStyle.new_();
        }
        if (this.statistics == null) {
            this.statistics = LabelStatistics.new_();
        }
        if (this.showTips == null) {
            this.showTips = LabelshowTips.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
