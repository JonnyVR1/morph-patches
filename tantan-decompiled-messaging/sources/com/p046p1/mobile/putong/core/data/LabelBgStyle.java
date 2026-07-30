package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class LabelBgStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labelbgstyle";

    @ProtobufIndex(index = 4)
    public int angle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String centerColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String endColor;

    @ProtobufIndex(index = 5)
    public int radius;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;
    public static ProtobufAdapter<LabelBgStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelBgStyle>() { // from class: com.p1.mobile.putong.core.data.LabelBgStyle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LabelBgStyle labelBgStyle) {
            String str = labelBgStyle.startColor;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = labelBgStyle.centerColor;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = labelBgStyle.endColor;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(4, labelBgStyle.angle) + CodedOutputByteBufferNano.m17226h(5, labelBgStyle.radius);
            labelBgStyle.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LabelBgStyle parse(nb5 nb5Var) throws IOException {
            LabelBgStyle labelBgStyle = new LabelBgStyle();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (labelBgStyle.startColor == null) {
                        labelBgStyle.startColor = "";
                    }
                    if (labelBgStyle.centerColor == null) {
                        labelBgStyle.centerColor = "";
                    }
                    if (labelBgStyle.endColor != null) {
                        break;
                    }
                    labelBgStyle.endColor = "";
                    break;
                }
                if (iM158752u == 10) {
                    labelBgStyle.startColor = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    labelBgStyle.centerColor = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    labelBgStyle.endColor = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    labelBgStyle.angle = nb5Var.m158741j();
                } else {
                    if (iM158752u != 40) {
                        if (labelBgStyle.startColor == null) {
                            labelBgStyle.startColor = "";
                        }
                        if (labelBgStyle.centerColor == null) {
                            labelBgStyle.centerColor = "";
                        }
                        if (labelBgStyle.endColor != null) {
                            break;
                        }
                        labelBgStyle.endColor = "";
                        return labelBgStyle;
                    }
                    labelBgStyle.radius = nb5Var.m158741j();
                }
            }
            return labelBgStyle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LabelBgStyle labelBgStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelBgStyle.startColor;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = labelBgStyle.centerColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = labelBgStyle.endColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17250G(4, labelBgStyle.angle);
            codedOutputByteBufferNano.m17250G(5, labelBgStyle.radius);
        }
    };
    public static JsonAdapter<LabelBgStyle> JSON_ADAPTER = new ObjectJsonAdapter<LabelBgStyle>() { // from class: com.p1.mobile.putong.core.data.LabelBgStyle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LabelBgStyle.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LabelBgStyle newInstance() {
            return new LabelBgStyle();
        }

        public boolean parseField(LabelBgStyle labelBgStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    labelBgStyle.startColor = jsonParser.getValueAsString();
                    return true;
                case "radius":
                    labelBgStyle.radius = jsonParser.getValueAsInt();
                    return true;
                case "angle":
                    labelBgStyle.angle = jsonParser.getValueAsInt();
                    return true;
                case "centerColor":
                    labelBgStyle.centerColor = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    labelBgStyle.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LabelBgStyle labelBgStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startColor":
                case "radius":
                case "angle":
                case "centerColor":
                case "endColor":
                    return true;
                default:
                    return super.parseFieldCheck(labelBgStyle, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LabelBgStyle labelBgStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = labelBgStyle.startColor;
            if (str != null) {
                jsonGenerator.writeStringField("startColor", str);
            }
            String str2 = labelBgStyle.centerColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("centerColor", str2);
            }
            String str3 = labelBgStyle.endColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("endColor", str3);
            }
            jsonGenerator.writeNumberField("angle", labelBgStyle.angle);
            jsonGenerator.writeNumberField(Constants.KEY_RADIUS, labelBgStyle.radius);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelBgStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelBgStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelBgStyle new_() {
        LabelBgStyle labelBgStyle = new LabelBgStyle();
        labelBgStyle.nullCheck();
        return labelBgStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LabelBgStyle mo223809clone() {
        LabelBgStyle labelBgStyle = new LabelBgStyle();
        labelBgStyle.startColor = this.startColor;
        labelBgStyle.centerColor = this.centerColor;
        labelBgStyle.endColor = this.endColor;
        labelBgStyle.angle = this.angle;
        labelBgStyle.radius = this.radius;
        return labelBgStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelBgStyle)) {
            return false;
        }
        LabelBgStyle labelBgStyle = (LabelBgStyle) obj;
        return ValueObject.util_equals(this.startColor, labelBgStyle.startColor) && ValueObject.util_equals(this.centerColor, labelBgStyle.centerColor) && ValueObject.util_equals(this.endColor, labelBgStyle.endColor) && this.angle == labelBgStyle.angle && this.radius == labelBgStyle.radius;
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
        String str = this.startColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.centerColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.endColor;
        int iHashCode3 = ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.angle) * 41) + this.radius;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.centerColor == null) {
            this.centerColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
