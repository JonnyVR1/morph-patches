package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OperationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "operationconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public String buttonContent;

    @NonNull
    @ProtobufIndex(index = 3)
    public String buttonStyle;

    @ProtobufIndex(index = 2)
    public int clickType;

    @NonNull
    @ProtobufIndex(index = 11)
    public String shakeContent;

    @NonNull
    @ProtobufIndex(index = 12)
    public String shakeContentSecond;

    @NonNull
    @ProtobufIndex(index = 9)
    public String shakeSound;

    @ProtobufIndex(index = 10)
    public int shakeValue;

    @NonNull
    @ProtobufIndex(index = 1)
    public String skipContent;

    @NonNull
    @ProtobufIndex(index = 6)
    public String slideContent;

    @NonNull
    @ProtobufIndex(index = 7)
    public String slideContentSecond;

    @NonNull
    @ProtobufIndex(index = 5)
    public String slideImg;

    @ProtobufIndex(index = 8)
    public int slideValue;
    public static ProtobufAdapter<OperationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<OperationConfig>() { // from class: com.p1.mobile.putong.data.OperationConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OperationConfig operationConfig) {
            String str = operationConfig.skipContent;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, operationConfig.clickType);
            String str2 = operationConfig.buttonStyle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = operationConfig.buttonContent;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = operationConfig.slideImg;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = operationConfig.slideContent;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            String str6 = operationConfig.slideContentSecond;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(7, str6);
            }
            int iH = iO + CodedOutputByteBufferNano.h(8, operationConfig.slideValue);
            String str7 = operationConfig.shakeSound;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(9, str7);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(10, operationConfig.shakeValue);
            String str8 = operationConfig.shakeContent;
            if (str8 != null) {
                iH2 += CodedOutputByteBufferNano.o(11, str8);
            }
            String str9 = operationConfig.shakeContentSecond;
            if (str9 != null) {
                iH2 += CodedOutputByteBufferNano.o(12, str9);
            }
            ((MessageNano) operationConfig).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OperationConfig m18744parse(nb5 nb5Var) throws IOException {
            OperationConfig operationConfig = new OperationConfig();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (operationConfig.skipContent == null) {
                            operationConfig.skipContent = "";
                        }
                        if (operationConfig.buttonStyle == null) {
                            operationConfig.buttonStyle = "";
                        }
                        if (operationConfig.buttonContent == null) {
                            operationConfig.buttonContent = "";
                        }
                        if (operationConfig.slideImg == null) {
                            operationConfig.slideImg = "";
                        }
                        if (operationConfig.slideContent == null) {
                            operationConfig.slideContent = "";
                        }
                        if (operationConfig.slideContentSecond == null) {
                            operationConfig.slideContentSecond = "";
                        }
                        if (operationConfig.shakeSound == null) {
                            operationConfig.shakeSound = "";
                        }
                        if (operationConfig.shakeContent == null) {
                            operationConfig.shakeContent = "";
                        }
                        if (operationConfig.shakeContentSecond == null) {
                            operationConfig.shakeContentSecond = "";
                        }
                        break;
                    case 10:
                        operationConfig.skipContent = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        operationConfig.clickType = nb5Var.j();
                        continue;
                    case 26:
                        operationConfig.buttonStyle = nb5Var.s();
                        continue;
                    case 34:
                        operationConfig.buttonContent = nb5Var.s();
                        continue;
                    case 42:
                        operationConfig.slideImg = nb5Var.s();
                        continue;
                    case 50:
                        operationConfig.slideContent = nb5Var.s();
                        continue;
                    case 58:
                        operationConfig.slideContentSecond = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        operationConfig.slideValue = nb5Var.j();
                        continue;
                    case 74:
                        operationConfig.shakeSound = nb5Var.s();
                        continue;
                    case 80:
                        operationConfig.shakeValue = nb5Var.j();
                        continue;
                    case 90:
                        operationConfig.shakeContent = nb5Var.s();
                        continue;
                    case 98:
                        operationConfig.shakeContentSecond = nb5Var.s();
                        continue;
                    default:
                        if (operationConfig.skipContent == null) {
                            operationConfig.skipContent = "";
                        }
                        if (operationConfig.buttonStyle == null) {
                            operationConfig.buttonStyle = "";
                        }
                        if (operationConfig.buttonContent == null) {
                            operationConfig.buttonContent = "";
                        }
                        if (operationConfig.slideImg == null) {
                            operationConfig.slideImg = "";
                        }
                        if (operationConfig.slideContent == null) {
                            operationConfig.slideContent = "";
                        }
                        if (operationConfig.slideContentSecond == null) {
                            operationConfig.slideContentSecond = "";
                        }
                        if (operationConfig.shakeSound == null) {
                            operationConfig.shakeSound = "";
                        }
                        if (operationConfig.shakeContent == null) {
                            operationConfig.shakeContent = "";
                        }
                        if (operationConfig.shakeContentSecond == null) {
                            operationConfig.shakeContentSecond = "";
                            return operationConfig;
                        }
                        break;
                }
            }
            return operationConfig;
        }

        public void serialize(OperationConfig operationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = operationConfig.skipContent;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, operationConfig.clickType);
            String str2 = operationConfig.buttonStyle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = operationConfig.buttonContent;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = operationConfig.slideImg;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = operationConfig.slideContent;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            String str6 = operationConfig.slideContentSecond;
            if (str6 != null) {
                codedOutputByteBufferNano.R(7, str6);
            }
            codedOutputByteBufferNano.G(8, operationConfig.slideValue);
            String str7 = operationConfig.shakeSound;
            if (str7 != null) {
                codedOutputByteBufferNano.R(9, str7);
            }
            codedOutputByteBufferNano.G(10, operationConfig.shakeValue);
            String str8 = operationConfig.shakeContent;
            if (str8 != null) {
                codedOutputByteBufferNano.R(11, str8);
            }
            String str9 = operationConfig.shakeContentSecond;
            if (str9 != null) {
                codedOutputByteBufferNano.R(12, str9);
            }
        }
    };
    public static JsonAdapter<OperationConfig> JSON_ADAPTER = new ObjectJsonAdapter<OperationConfig>() { // from class: com.p1.mobile.putong.data.OperationConfig.2
        public Class getDataClass() {
            return OperationConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OperationConfig mo17830newInstance() {
            return new OperationConfig();
        }

        public boolean parseField(OperationConfig operationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "buttonContent":
                    operationConfig.buttonContent = jsonParser.getValueAsString();
                    return true;
                case "clickType":
                    operationConfig.clickType = jsonParser.getValueAsInt();
                    return true;
                case "buttonStyle":
                    operationConfig.buttonStyle = jsonParser.getValueAsString();
                    return true;
                case "slideImg":
                    operationConfig.slideImg = jsonParser.getValueAsString();
                    return true;
                case "skipContent":
                    operationConfig.skipContent = jsonParser.getValueAsString();
                    return true;
                case "slideContent":
                    operationConfig.slideContent = jsonParser.getValueAsString();
                    return true;
                case "shakeContent":
                    operationConfig.shakeContent = jsonParser.getValueAsString();
                    return true;
                case "shakeSound":
                    operationConfig.shakeSound = jsonParser.getValueAsString();
                    return true;
                case "shakeValue":
                    operationConfig.shakeValue = jsonParser.getValueAsInt();
                    return true;
                case "slideContentSecond":
                    operationConfig.slideContentSecond = jsonParser.getValueAsString();
                    return true;
                case "slideValue":
                    operationConfig.slideValue = jsonParser.getValueAsInt();
                    return true;
                case "shakeContentSecond":
                    operationConfig.shakeContentSecond = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OperationConfig operationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "buttonContent":
                case "clickType":
                case "buttonStyle":
                case "slideImg":
                case "skipContent":
                case "slideContent":
                case "shakeContent":
                case "shakeSound":
                case "shakeValue":
                case "slideContentSecond":
                case "slideValue":
                case "shakeContentSecond":
                    return true;
                default:
                    return super.parseFieldCheck(operationConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OperationConfig operationConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = operationConfig.skipContent;
            if (str != null) {
                jsonGenerator.writeStringField("skipContent", str);
            }
            jsonGenerator.writeNumberField("clickType", operationConfig.clickType);
            String str2 = operationConfig.buttonStyle;
            if (str2 != null) {
                jsonGenerator.writeStringField("buttonStyle", str2);
            }
            String str3 = operationConfig.buttonContent;
            if (str3 != null) {
                jsonGenerator.writeStringField("buttonContent", str3);
            }
            String str4 = operationConfig.slideImg;
            if (str4 != null) {
                jsonGenerator.writeStringField("slideImg", str4);
            }
            String str5 = operationConfig.slideContent;
            if (str5 != null) {
                jsonGenerator.writeStringField("slideContent", str5);
            }
            String str6 = operationConfig.slideContentSecond;
            if (str6 != null) {
                jsonGenerator.writeStringField("slideContentSecond", str6);
            }
            jsonGenerator.writeNumberField("slideValue", operationConfig.slideValue);
            String str7 = operationConfig.shakeSound;
            if (str7 != null) {
                jsonGenerator.writeStringField("shakeSound", str7);
            }
            jsonGenerator.writeNumberField("shakeValue", operationConfig.shakeValue);
            String str8 = operationConfig.shakeContent;
            if (str8 != null) {
                jsonGenerator.writeStringField("shakeContent", str8);
            }
            String str9 = operationConfig.shakeContentSecond;
            if (str9 != null) {
                jsonGenerator.writeStringField("shakeContentSecond", str9);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OperationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OperationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OperationConfig new_() {
        OperationConfig operationConfig = new OperationConfig();
        operationConfig.nullCheck();
        return operationConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OperationConfig m18743clone() {
        OperationConfig operationConfig = new OperationConfig();
        operationConfig.skipContent = this.skipContent;
        operationConfig.clickType = this.clickType;
        operationConfig.buttonStyle = this.buttonStyle;
        operationConfig.buttonContent = this.buttonContent;
        operationConfig.slideImg = this.slideImg;
        operationConfig.slideContent = this.slideContent;
        operationConfig.slideContentSecond = this.slideContentSecond;
        operationConfig.slideValue = this.slideValue;
        operationConfig.shakeSound = this.shakeSound;
        operationConfig.shakeValue = this.shakeValue;
        operationConfig.shakeContent = this.shakeContent;
        operationConfig.shakeContentSecond = this.shakeContentSecond;
        return operationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OperationConfig)) {
            return false;
        }
        OperationConfig operationConfig = (OperationConfig) obj;
        return ValueObject.util_equals(this.skipContent, operationConfig.skipContent) && this.clickType == operationConfig.clickType && ValueObject.util_equals(this.buttonStyle, operationConfig.buttonStyle) && ValueObject.util_equals(this.buttonContent, operationConfig.buttonContent) && ValueObject.util_equals(this.slideImg, operationConfig.slideImg) && ValueObject.util_equals(this.slideContent, operationConfig.slideContent) && ValueObject.util_equals(this.slideContentSecond, operationConfig.slideContentSecond) && this.slideValue == operationConfig.slideValue && ValueObject.util_equals(this.shakeSound, operationConfig.shakeSound) && this.shakeValue == operationConfig.shakeValue && ValueObject.util_equals(this.shakeContent, operationConfig.shakeContent) && ValueObject.util_equals(this.shakeContentSecond, operationConfig.shakeContentSecond);
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
        String str = this.skipContent;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.clickType) * 41;
        String str2 = this.buttonStyle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.buttonContent;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.slideImg;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.slideContent;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.slideContentSecond;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.slideValue) * 41;
        String str7 = this.shakeSound;
        int iHashCode7 = (((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41) + this.shakeValue) * 41;
        String str8 = this.shakeContent;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.shakeContentSecond;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.skipContent == null) {
            this.skipContent = "";
        }
        if (this.buttonStyle == null) {
            this.buttonStyle = "";
        }
        if (this.buttonContent == null) {
            this.buttonContent = "";
        }
        if (this.slideImg == null) {
            this.slideImg = "";
        }
        if (this.slideContent == null) {
            this.slideContent = "";
        }
        if (this.slideContentSecond == null) {
            this.slideContentSecond = "";
        }
        if (this.shakeSound == null) {
            this.shakeSound = "";
        }
        if (this.shakeContent == null) {
            this.shakeContent = "";
        }
        if (this.shakeContentSecond == null) {
            this.shakeContentSecond = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
