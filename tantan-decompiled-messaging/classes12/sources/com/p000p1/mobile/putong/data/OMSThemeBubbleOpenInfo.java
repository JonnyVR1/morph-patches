package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class OMSThemeBubbleOpenInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsthemebubbleopeninfo";

    @NonNull
    @ProtobufIndex(index = 5)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String color;

    @ProtobufIndex(index = 2)
    public int day;

    @ProtobufIndex(index = 1)
    public int swipeCnt;

    @NonNull
    @ProtobufIndex(index = 3)
    public String txt;
    public static ProtobufAdapter<OMSThemeBubbleOpenInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSThemeBubbleOpenInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeBubbleOpenInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo) {
            int iH = CodedOutputByteBufferNano.h(1, oMSThemeBubbleOpenInfo.swipeCnt) + CodedOutputByteBufferNano.h(2, oMSThemeBubbleOpenInfo.day);
            String str = oMSThemeBubbleOpenInfo.txt;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            String str2 = oMSThemeBubbleOpenInfo.color;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = oMSThemeBubbleOpenInfo.bgColor;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) oMSThemeBubbleOpenInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSThemeBubbleOpenInfo m18669parse(nb5 nb5Var) throws IOException {
            OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = new OMSThemeBubbleOpenInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSThemeBubbleOpenInfo.txt == null) {
                        oMSThemeBubbleOpenInfo.txt = "";
                    }
                    if (oMSThemeBubbleOpenInfo.color == null) {
                        oMSThemeBubbleOpenInfo.color = "";
                    }
                    if (oMSThemeBubbleOpenInfo.bgColor != null) {
                        break;
                    }
                    oMSThemeBubbleOpenInfo.bgColor = "";
                    break;
                }
                if (iU == 8) {
                    oMSThemeBubbleOpenInfo.swipeCnt = nb5Var.j();
                } else if (iU == 16) {
                    oMSThemeBubbleOpenInfo.day = nb5Var.j();
                } else if (iU == 26) {
                    oMSThemeBubbleOpenInfo.txt = nb5Var.s();
                } else if (iU == 34) {
                    oMSThemeBubbleOpenInfo.color = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (oMSThemeBubbleOpenInfo.txt == null) {
                            oMSThemeBubbleOpenInfo.txt = "";
                        }
                        if (oMSThemeBubbleOpenInfo.color == null) {
                            oMSThemeBubbleOpenInfo.color = "";
                        }
                        if (oMSThemeBubbleOpenInfo.bgColor != null) {
                            break;
                        }
                        oMSThemeBubbleOpenInfo.bgColor = "";
                        return oMSThemeBubbleOpenInfo;
                    }
                    oMSThemeBubbleOpenInfo.bgColor = nb5Var.s();
                }
            }
            return oMSThemeBubbleOpenInfo;
        }

        public void serialize(OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, oMSThemeBubbleOpenInfo.swipeCnt);
            codedOutputByteBufferNano.G(2, oMSThemeBubbleOpenInfo.day);
            String str = oMSThemeBubbleOpenInfo.txt;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            String str2 = oMSThemeBubbleOpenInfo.color;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = oMSThemeBubbleOpenInfo.bgColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<OMSThemeBubbleOpenInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeBubbleOpenInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeBubbleOpenInfo.2
        public Class getDataClass() {
            return OMSThemeBubbleOpenInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSThemeBubbleOpenInfo mo17830newInstance() {
            return new OMSThemeBubbleOpenInfo();
        }

        public boolean parseField(OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgColor":
                    oMSThemeBubbleOpenInfo.bgColor = jsonParser.getValueAsString();
                    return true;
                case "swipeCnt":
                    oMSThemeBubbleOpenInfo.swipeCnt = jsonParser.getValueAsInt();
                    return true;
                case "day":
                    oMSThemeBubbleOpenInfo.day = jsonParser.getValueAsInt();
                    return true;
                case "txt":
                    oMSThemeBubbleOpenInfo.txt = jsonParser.getValueAsString();
                    return true;
                case "color":
                    oMSThemeBubbleOpenInfo.color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bgColor":
                case "swipeCnt":
                case "day":
                case "txt":
                case "color":
                    return true;
                default:
                    return super.parseFieldCheck(oMSThemeBubbleOpenInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipeCnt", oMSThemeBubbleOpenInfo.swipeCnt);
            jsonGenerator.writeNumberField(OmsConstraintDimension.day, oMSThemeBubbleOpenInfo.day);
            String str = oMSThemeBubbleOpenInfo.txt;
            if (str != null) {
                jsonGenerator.writeStringField("txt", str);
            }
            String str2 = oMSThemeBubbleOpenInfo.color;
            if (str2 != null) {
                jsonGenerator.writeStringField("color", str2);
            }
            String str3 = oMSThemeBubbleOpenInfo.bgColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgColor", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeBubbleOpenInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeBubbleOpenInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSThemeBubbleOpenInfo new_() {
        OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = new OMSThemeBubbleOpenInfo();
        oMSThemeBubbleOpenInfo.nullCheck();
        return oMSThemeBubbleOpenInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSThemeBubbleOpenInfo m18668clone() {
        OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = new OMSThemeBubbleOpenInfo();
        oMSThemeBubbleOpenInfo.swipeCnt = this.swipeCnt;
        oMSThemeBubbleOpenInfo.day = this.day;
        oMSThemeBubbleOpenInfo.txt = this.txt;
        oMSThemeBubbleOpenInfo.color = this.color;
        oMSThemeBubbleOpenInfo.bgColor = this.bgColor;
        return oMSThemeBubbleOpenInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSThemeBubbleOpenInfo)) {
            return false;
        }
        OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = (OMSThemeBubbleOpenInfo) obj;
        return this.swipeCnt == oMSThemeBubbleOpenInfo.swipeCnt && this.day == oMSThemeBubbleOpenInfo.day && ValueObject.util_equals(this.txt, oMSThemeBubbleOpenInfo.txt) && ValueObject.util_equals(this.color, oMSThemeBubbleOpenInfo.color) && ValueObject.util_equals(this.bgColor, oMSThemeBubbleOpenInfo.bgColor);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.swipeCnt) * 41) + this.day) * 41;
        String str = this.txt;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.color;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bgColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.txt == null) {
            this.txt = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
