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
public class OMSThemeBubbleInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsthemebubbleinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String color;

    @ProtobufIndex(index = 1)
    public int swipeCnt;

    @NonNull
    @ProtobufIndex(index = 2)
    public String txt;
    public static ProtobufAdapter<OMSThemeBubbleInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSThemeBubbleInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeBubbleInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSThemeBubbleInfo oMSThemeBubbleInfo) {
            int iH = CodedOutputByteBufferNano.h(1, oMSThemeBubbleInfo.swipeCnt);
            String str = oMSThemeBubbleInfo.txt;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = oMSThemeBubbleInfo.color;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = oMSThemeBubbleInfo.bgColor;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) oMSThemeBubbleInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSThemeBubbleInfo m18666parse(nb5 nb5Var) throws IOException {
            OMSThemeBubbleInfo oMSThemeBubbleInfo = new OMSThemeBubbleInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSThemeBubbleInfo.txt == null) {
                        oMSThemeBubbleInfo.txt = "";
                    }
                    if (oMSThemeBubbleInfo.color == null) {
                        oMSThemeBubbleInfo.color = "";
                    }
                    if (oMSThemeBubbleInfo.bgColor != null) {
                        break;
                    }
                    oMSThemeBubbleInfo.bgColor = "";
                    break;
                }
                if (iU == 8) {
                    oMSThemeBubbleInfo.swipeCnt = nb5Var.j();
                } else if (iU == 18) {
                    oMSThemeBubbleInfo.txt = nb5Var.s();
                } else if (iU == 26) {
                    oMSThemeBubbleInfo.color = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (oMSThemeBubbleInfo.txt == null) {
                            oMSThemeBubbleInfo.txt = "";
                        }
                        if (oMSThemeBubbleInfo.color == null) {
                            oMSThemeBubbleInfo.color = "";
                        }
                        if (oMSThemeBubbleInfo.bgColor != null) {
                            break;
                        }
                        oMSThemeBubbleInfo.bgColor = "";
                        return oMSThemeBubbleInfo;
                    }
                    oMSThemeBubbleInfo.bgColor = nb5Var.s();
                }
            }
            return oMSThemeBubbleInfo;
        }

        public void serialize(OMSThemeBubbleInfo oMSThemeBubbleInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, oMSThemeBubbleInfo.swipeCnt);
            String str = oMSThemeBubbleInfo.txt;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = oMSThemeBubbleInfo.color;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = oMSThemeBubbleInfo.bgColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<OMSThemeBubbleInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeBubbleInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeBubbleInfo.2
        public Class getDataClass() {
            return OMSThemeBubbleInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSThemeBubbleInfo mo17830newInstance() {
            return new OMSThemeBubbleInfo();
        }

        public boolean parseField(OMSThemeBubbleInfo oMSThemeBubbleInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgColor":
                    oMSThemeBubbleInfo.bgColor = jsonParser.getValueAsString();
                    return true;
                case "swipeCnt":
                    oMSThemeBubbleInfo.swipeCnt = jsonParser.getValueAsInt();
                    return true;
                case "txt":
                    oMSThemeBubbleInfo.txt = jsonParser.getValueAsString();
                    return true;
                case "color":
                    oMSThemeBubbleInfo.color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSThemeBubbleInfo oMSThemeBubbleInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bgColor":
                case "swipeCnt":
                case "txt":
                case "color":
                    return true;
                default:
                    return super.parseFieldCheck(oMSThemeBubbleInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSThemeBubbleInfo oMSThemeBubbleInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipeCnt", oMSThemeBubbleInfo.swipeCnt);
            String str = oMSThemeBubbleInfo.txt;
            if (str != null) {
                jsonGenerator.writeStringField("txt", str);
            }
            String str2 = oMSThemeBubbleInfo.color;
            if (str2 != null) {
                jsonGenerator.writeStringField("color", str2);
            }
            String str3 = oMSThemeBubbleInfo.bgColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgColor", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeBubbleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeBubbleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSThemeBubbleInfo new_() {
        OMSThemeBubbleInfo oMSThemeBubbleInfo = new OMSThemeBubbleInfo();
        oMSThemeBubbleInfo.nullCheck();
        return oMSThemeBubbleInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSThemeBubbleInfo m18665clone() {
        OMSThemeBubbleInfo oMSThemeBubbleInfo = new OMSThemeBubbleInfo();
        oMSThemeBubbleInfo.swipeCnt = this.swipeCnt;
        oMSThemeBubbleInfo.txt = this.txt;
        oMSThemeBubbleInfo.color = this.color;
        oMSThemeBubbleInfo.bgColor = this.bgColor;
        return oMSThemeBubbleInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSThemeBubbleInfo)) {
            return false;
        }
        OMSThemeBubbleInfo oMSThemeBubbleInfo = (OMSThemeBubbleInfo) obj;
        return this.swipeCnt == oMSThemeBubbleInfo.swipeCnt && ValueObject.util_equals(this.txt, oMSThemeBubbleInfo.txt) && ValueObject.util_equals(this.color, oMSThemeBubbleInfo.color) && ValueObject.util_equals(this.bgColor, oMSThemeBubbleInfo.bgColor);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.swipeCnt) * 41;
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
