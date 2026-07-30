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
public class FloatsCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "floatscarddata";

    @NonNull
    @ProtobufIndex(index = 6)
    public String borderColor;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String buttonColor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String buttonTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String buttonTitleColor;

    @ProtobufIndex(index = 8)
    public int gradualHeight;

    @NonNull
    @ProtobufIndex(index = 7)
    public String gradualImg;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f54id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;
    public static ProtobufAdapter<FloatsCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FloatsCardData>() { // from class: com.p1.mobile.putong.core.data.FloatsCardData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FloatsCardData floatsCardData) {
            String str = floatsCardData.f54id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = floatsCardData.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = floatsCardData.buttonTitle;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = floatsCardData.buttonTitleColor;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = floatsCardData.buttonColor;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = floatsCardData.borderColor;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = floatsCardData.gradualImg;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            int iH = iO + CodedOutputByteBufferNano.h(8, floatsCardData.gradualHeight);
            ((MessageNano) floatsCardData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FloatsCardData m12809parse(nb5 nb5Var) throws IOException {
            FloatsCardData floatsCardData = new FloatsCardData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (floatsCardData.f54id == null) {
                        floatsCardData.f54id = "";
                    }
                    if (floatsCardData.title == null) {
                        floatsCardData.title = "";
                    }
                    if (floatsCardData.buttonTitle == null) {
                        floatsCardData.buttonTitle = "";
                    }
                    if (floatsCardData.buttonTitleColor == null) {
                        floatsCardData.buttonTitleColor = "";
                    }
                    if (floatsCardData.buttonColor == null) {
                        floatsCardData.buttonColor = "";
                    }
                    if (floatsCardData.borderColor == null) {
                        floatsCardData.borderColor = "";
                    }
                    if (floatsCardData.gradualImg != null) {
                        break;
                    }
                    floatsCardData.gradualImg = "";
                    break;
                }
                if (iU == 10) {
                    floatsCardData.f54id = nb5Var.s();
                } else if (iU == 18) {
                    floatsCardData.title = nb5Var.s();
                } else if (iU == 26) {
                    floatsCardData.buttonTitle = nb5Var.s();
                } else if (iU == 34) {
                    floatsCardData.buttonTitleColor = nb5Var.s();
                } else if (iU == 42) {
                    floatsCardData.buttonColor = nb5Var.s();
                } else if (iU == 50) {
                    floatsCardData.borderColor = nb5Var.s();
                } else if (iU == 58) {
                    floatsCardData.gradualImg = nb5Var.s();
                } else {
                    if (iU != 64) {
                        if (floatsCardData.f54id == null) {
                            floatsCardData.f54id = "";
                        }
                        if (floatsCardData.title == null) {
                            floatsCardData.title = "";
                        }
                        if (floatsCardData.buttonTitle == null) {
                            floatsCardData.buttonTitle = "";
                        }
                        if (floatsCardData.buttonTitleColor == null) {
                            floatsCardData.buttonTitleColor = "";
                        }
                        if (floatsCardData.buttonColor == null) {
                            floatsCardData.buttonColor = "";
                        }
                        if (floatsCardData.borderColor == null) {
                            floatsCardData.borderColor = "";
                        }
                        if (floatsCardData.gradualImg != null) {
                            break;
                        }
                        floatsCardData.gradualImg = "";
                        return floatsCardData;
                    }
                    floatsCardData.gradualHeight = nb5Var.j();
                }
            }
            return floatsCardData;
        }

        public void serialize(FloatsCardData floatsCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = floatsCardData.f54id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = floatsCardData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = floatsCardData.buttonTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = floatsCardData.buttonTitleColor;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = floatsCardData.buttonColor;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = floatsCardData.borderColor;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = floatsCardData.gradualImg;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            codedOutputByteBufferNano.G(8, floatsCardData.gradualHeight);
        }
    };
    public static JsonAdapter<FloatsCardData> JSON_ADAPTER = new ObjectJsonAdapter<FloatsCardData>() { // from class: com.p1.mobile.putong.core.data.FloatsCardData.2
        public Class getDataClass() {
            return FloatsCardData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FloatsCardData m12810newInstance() {
            return new FloatsCardData();
        }

        public boolean parseField(FloatsCardData floatsCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "buttonColor":
                    floatsCardData.buttonColor = jsonParser.getValueAsString();
                    return true;
                case "buttonTitle":
                    floatsCardData.buttonTitle = jsonParser.getValueAsString();
                    return true;
                case "id":
                    floatsCardData.f54id = jsonParser.getValueAsString();
                    return false;
                case "title":
                    floatsCardData.title = jsonParser.getValueAsString();
                    return true;
                case "gradualImg":
                    floatsCardData.gradualImg = jsonParser.getValueAsString();
                    return true;
                case "borderColor":
                    floatsCardData.borderColor = jsonParser.getValueAsString();
                    return true;
                case "gradualHeight":
                    floatsCardData.gradualHeight = jsonParser.getValueAsInt();
                    return true;
                case "buttonTitleColor":
                    floatsCardData.buttonTitleColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FloatsCardData floatsCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "buttonColor":
                case "buttonTitle":
                    return true;
                case "id":
                    return false;
                case "title":
                case "gradualImg":
                case "borderColor":
                case "gradualHeight":
                case "buttonTitleColor":
                    return true;
                default:
                    return super.parseFieldCheck(floatsCardData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(FloatsCardData floatsCardData, JsonGenerator jsonGenerator) throws IOException {
            String str = floatsCardData.f54id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = floatsCardData.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = floatsCardData.buttonTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("buttonTitle", str3);
            }
            String str4 = floatsCardData.buttonTitleColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonTitleColor", str4);
            }
            String str5 = floatsCardData.buttonColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("buttonColor", str5);
            }
            String str6 = floatsCardData.borderColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("borderColor", str6);
            }
            String str7 = floatsCardData.gradualImg;
            if (str7 != null) {
                jsonGenerator.writeStringField("gradualImg", str7);
            }
            jsonGenerator.writeNumberField("gradualHeight", floatsCardData.gradualHeight);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FloatsCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FloatsCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FloatsCardData new_() {
        FloatsCardData floatsCardData = new FloatsCardData();
        floatsCardData.nullCheck();
        return floatsCardData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FloatsCardData m12808clone() {
        FloatsCardData floatsCardData = new FloatsCardData();
        floatsCardData.f54id = this.f54id;
        floatsCardData.title = this.title;
        floatsCardData.buttonTitle = this.buttonTitle;
        floatsCardData.buttonTitleColor = this.buttonTitleColor;
        floatsCardData.buttonColor = this.buttonColor;
        floatsCardData.borderColor = this.borderColor;
        floatsCardData.gradualImg = this.gradualImg;
        floatsCardData.gradualHeight = this.gradualHeight;
        return floatsCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatsCardData)) {
            return false;
        }
        FloatsCardData floatsCardData = (FloatsCardData) obj;
        return ValueObject.util_equals(this.f54id, floatsCardData.f54id) && ValueObject.util_equals(this.title, floatsCardData.title) && ValueObject.util_equals(this.buttonTitle, floatsCardData.buttonTitle) && ValueObject.util_equals(this.buttonTitleColor, floatsCardData.buttonTitleColor) && ValueObject.util_equals(this.buttonColor, floatsCardData.buttonColor) && ValueObject.util_equals(this.borderColor, floatsCardData.borderColor) && ValueObject.util_equals(this.gradualImg, floatsCardData.gradualImg) && this.gradualHeight == floatsCardData.gradualHeight;
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
        String str = this.f54id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.buttonTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonTitleColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.buttonColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.borderColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.gradualImg;
        int iHashCode7 = ((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41) + this.gradualHeight;
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.f54id == null) {
            this.f54id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.buttonTitle == null) {
            this.buttonTitle = "";
        }
        if (this.buttonTitleColor == null) {
            this.buttonTitleColor = "";
        }
        if (this.buttonColor == null) {
            this.buttonColor = "";
        }
        if (this.borderColor == null) {
            this.borderColor = "";
        }
        if (this.gradualImg == null) {
            this.gradualImg = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
