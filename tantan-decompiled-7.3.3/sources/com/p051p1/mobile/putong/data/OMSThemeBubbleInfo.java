package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSThemeBubbleInfo oMSThemeBubbleInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, oMSThemeBubbleInfo.swipeCnt);
            String str = oMSThemeBubbleInfo.txt;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = oMSThemeBubbleInfo.color;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = oMSThemeBubbleInfo.bgColor;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            oMSThemeBubbleInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSThemeBubbleInfo parse(nc5 nc5Var) throws IOException {
            OMSThemeBubbleInfo oMSThemeBubbleInfo = new OMSThemeBubbleInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    oMSThemeBubbleInfo.swipeCnt = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    oMSThemeBubbleInfo.txt = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    oMSThemeBubbleInfo.color = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
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
                    oMSThemeBubbleInfo.bgColor = nc5Var.m162495s();
                }
            }
            return oMSThemeBubbleInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSThemeBubbleInfo oMSThemeBubbleInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, oMSThemeBubbleInfo.swipeCnt);
            String str = oMSThemeBubbleInfo.txt;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = oMSThemeBubbleInfo.color;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = oMSThemeBubbleInfo.bgColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<OMSThemeBubbleInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeBubbleInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeBubbleInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSThemeBubbleInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSThemeBubbleInfo newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeBubbleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeBubbleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSThemeBubbleInfo new_() {
        OMSThemeBubbleInfo oMSThemeBubbleInfo = new OMSThemeBubbleInfo();
        oMSThemeBubbleInfo.nullCheck();
        return oMSThemeBubbleInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSThemeBubbleInfo mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
