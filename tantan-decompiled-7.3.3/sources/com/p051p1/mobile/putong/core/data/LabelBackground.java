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
public class LabelBackground extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labelbackground";

    @NonNull
    @ProtobufIndex(index = 4)
    public LabelBgStyle bgStyle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String imageBackground;

    @ProtobufIndex(index = 3)
    public int imageBackgroundHeight;

    @ProtobufIndex(index = 2)
    public int imageBackgroundWidth;
    public static ProtobufAdapter<LabelBackground> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelBackground>() { // from class: com.p1.mobile.putong.core.data.LabelBackground.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LabelBackground labelBackground) {
            String str = labelBackground.imageBackground;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, labelBackground.imageBackgroundWidth) + CodedOutputByteBufferNano.m17281h(3, labelBackground.imageBackgroundHeight);
            LabelBgStyle labelBgStyle = labelBackground.bgStyle;
            if (labelBgStyle != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, labelBgStyle, LabelBgStyle.PROTOBUF_ADAPTER);
            }
            labelBackground.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LabelBackground parse(nc5 nc5Var) throws IOException {
            LabelBackground labelBackground = new LabelBackground();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (labelBackground.imageBackground == null) {
                        labelBackground.imageBackground = "";
                    }
                    if (labelBackground.bgStyle != null) {
                        break;
                    }
                    labelBackground.bgStyle = LabelBgStyle.new_();
                    break;
                }
                if (iM162497u == 10) {
                    labelBackground.imageBackground = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    labelBackground.imageBackgroundWidth = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    labelBackground.imageBackgroundHeight = nc5Var.m162486j();
                } else {
                    if (iM162497u != 34) {
                        if (labelBackground.imageBackground == null) {
                            labelBackground.imageBackground = "";
                        }
                        if (labelBackground.bgStyle != null) {
                            break;
                        }
                        labelBackground.bgStyle = LabelBgStyle.new_();
                        return labelBackground;
                    }
                    labelBackground.bgStyle = (LabelBgStyle) nc5Var.m162488l(LabelBgStyle.PROTOBUF_ADAPTER);
                }
            }
            return labelBackground;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LabelBackground labelBackground, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelBackground.imageBackground;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, labelBackground.imageBackgroundWidth);
            codedOutputByteBufferNano.m17305G(3, labelBackground.imageBackgroundHeight);
            LabelBgStyle labelBgStyle = labelBackground.bgStyle;
            if (labelBgStyle != null) {
                codedOutputByteBufferNano.m17309K(4, labelBgStyle, LabelBgStyle.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LabelBackground> JSON_ADAPTER = new ObjectJsonAdapter<LabelBackground>() { // from class: com.p1.mobile.putong.core.data.LabelBackground.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LabelBackground.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LabelBackground newInstance() {
            return new LabelBackground();
        }

        public boolean parseField(LabelBackground labelBackground, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "imageBackgroundWidth":
                    labelBackground.imageBackgroundWidth = jsonParser.getValueAsInt();
                    return true;
                case "imageBackgroundHeight":
                    labelBackground.imageBackgroundHeight = jsonParser.getValueAsInt();
                    return true;
                case "bgStyle":
                    labelBackground.bgStyle = LabelBgStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "imageBackground":
                    labelBackground.imageBackground = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LabelBackground labelBackground, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "imageBackgroundWidth":
                case "imageBackgroundHeight":
                case "bgStyle":
                case "imageBackground":
                    return true;
                default:
                    return super.parseFieldCheck(labelBackground, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LabelBackground labelBackground, JsonGenerator jsonGenerator) throws IOException {
            String str = labelBackground.imageBackground;
            if (str != null) {
                jsonGenerator.writeStringField("imageBackground", str);
            }
            jsonGenerator.writeNumberField("imageBackgroundWidth", labelBackground.imageBackgroundWidth);
            jsonGenerator.writeNumberField("imageBackgroundHeight", labelBackground.imageBackgroundHeight);
            if (labelBackground.bgStyle != null) {
                jsonGenerator.writeFieldName("bgStyle");
                LabelBgStyle.JSON_ADAPTER.serialize(labelBackground.bgStyle, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelBackground) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelBackground) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelBackground new_() {
        LabelBackground labelBackground = new LabelBackground();
        labelBackground.nullCheck();
        return labelBackground;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LabelBackground mo225055clone() {
        LabelBackground labelBackground = new LabelBackground();
        labelBackground.imageBackground = this.imageBackground;
        labelBackground.imageBackgroundWidth = this.imageBackgroundWidth;
        labelBackground.imageBackgroundHeight = this.imageBackgroundHeight;
        LabelBgStyle labelBgStyle = this.bgStyle;
        if (labelBgStyle != null) {
            labelBackground.bgStyle = labelBgStyle.mo225055clone();
        }
        return labelBackground;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelBackground)) {
            return false;
        }
        LabelBackground labelBackground = (LabelBackground) obj;
        return ValueObject.util_equals(this.imageBackground, labelBackground.imageBackground) && this.imageBackgroundWidth == labelBackground.imageBackgroundWidth && this.imageBackgroundHeight == labelBackground.imageBackgroundHeight && ValueObject.util_equals(this.bgStyle, labelBackground.bgStyle);
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
        String str = this.imageBackground;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.imageBackgroundWidth) * 41) + this.imageBackgroundHeight) * 41;
        LabelBgStyle labelBgStyle = this.bgStyle;
        int iHashCode2 = iHashCode + (labelBgStyle != null ? labelBgStyle.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.imageBackground == null) {
            this.imageBackground = "";
        }
        if (this.bgStyle == null) {
            this.bgStyle = LabelBgStyle.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
