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
public class OMSAdCardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsadcardinfo";

    @NonNull
    @ProtobufIndex(index = 7)
    public String cartoonKey;

    @NonNull
    @ProtobufIndex(index = 3)
    public OMSDisplayRule constraint;

    @NonNull
    @ProtobufIndex(index = 6)
    public OMSAdCardContent content;

    @NonNull
    @ProtobufIndex(index = 5)
    public String contentType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String identifier;

    @ProtobufIndex(index = 2)
    public boolean needLanguage;

    @NonNull
    @ProtobufIndex(index = 4)
    public Position position;

    @ProtobufIndex(index = 8)
    public boolean showCartoon;
    public static ProtobufAdapter<OMSAdCardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSAdCardInfo>() { // from class: com.p1.mobile.putong.data.OMSAdCardInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSAdCardInfo oMSAdCardInfo) {
            String str = oMSAdCardInfo.identifier;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, oMSAdCardInfo.needLanguage);
            OMSDisplayRule oMSDisplayRule = oMSAdCardInfo.constraint;
            if (oMSDisplayRule != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            Position position = oMSAdCardInfo.position;
            if (position != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, position, Position.PROTOBUF_ADAPTER);
            }
            String str2 = oMSAdCardInfo.contentType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            OMSAdCardContent oMSAdCardContent = oMSAdCardInfo.content;
            if (oMSAdCardContent != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, oMSAdCardContent, OMSAdCardContent.PROTOBUF_ADAPTER);
            }
            String str3 = oMSAdCardInfo.cartoonKey;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(8, oMSAdCardInfo.showCartoon);
            oMSAdCardInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSAdCardInfo parse(nc5 nc5Var) throws IOException {
            OMSAdCardInfo oMSAdCardInfo = new OMSAdCardInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSAdCardInfo.identifier == null) {
                        oMSAdCardInfo.identifier = "";
                    }
                    if (oMSAdCardInfo.constraint == null) {
                        oMSAdCardInfo.constraint = OMSDisplayRule.new_();
                    }
                    if (oMSAdCardInfo.position == null) {
                        oMSAdCardInfo.position = Position.new_();
                    }
                    if (oMSAdCardInfo.contentType == null) {
                        oMSAdCardInfo.contentType = "";
                    }
                    if (oMSAdCardInfo.content == null) {
                        oMSAdCardInfo.content = OMSAdCardContent.new_();
                    }
                    if (oMSAdCardInfo.cartoonKey != null) {
                        break;
                    }
                    oMSAdCardInfo.cartoonKey = "";
                    break;
                }
                if (iM162497u == 10) {
                    oMSAdCardInfo.identifier = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    oMSAdCardInfo.needLanguage = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    oMSAdCardInfo.constraint = (OMSDisplayRule) nc5Var.m162488l(OMSDisplayRule.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    oMSAdCardInfo.position = (Position) nc5Var.m162488l(Position.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    oMSAdCardInfo.contentType = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    oMSAdCardInfo.content = (OMSAdCardContent) nc5Var.m162488l(OMSAdCardContent.PROTOBUF_ADAPTER);
                } else if (iM162497u == 58) {
                    oMSAdCardInfo.cartoonKey = nc5Var.m162495s();
                } else {
                    if (iM162497u != 64) {
                        if (oMSAdCardInfo.identifier == null) {
                            oMSAdCardInfo.identifier = "";
                        }
                        if (oMSAdCardInfo.constraint == null) {
                            oMSAdCardInfo.constraint = OMSDisplayRule.new_();
                        }
                        if (oMSAdCardInfo.position == null) {
                            oMSAdCardInfo.position = Position.new_();
                        }
                        if (oMSAdCardInfo.contentType == null) {
                            oMSAdCardInfo.contentType = "";
                        }
                        if (oMSAdCardInfo.content == null) {
                            oMSAdCardInfo.content = OMSAdCardContent.new_();
                        }
                        if (oMSAdCardInfo.cartoonKey != null) {
                            break;
                        }
                        oMSAdCardInfo.cartoonKey = "";
                        return oMSAdCardInfo;
                    }
                    oMSAdCardInfo.showCartoon = nc5Var.m162483g();
                }
            }
            return oMSAdCardInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSAdCardInfo oMSAdCardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSAdCardInfo.identifier;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, oMSAdCardInfo.needLanguage);
            OMSDisplayRule oMSDisplayRule = oMSAdCardInfo.constraint;
            if (oMSDisplayRule != null) {
                codedOutputByteBufferNano.m17309K(3, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            Position position = oMSAdCardInfo.position;
            if (position != null) {
                codedOutputByteBufferNano.m17309K(4, position, Position.PROTOBUF_ADAPTER);
            }
            String str2 = oMSAdCardInfo.contentType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            OMSAdCardContent oMSAdCardContent = oMSAdCardInfo.content;
            if (oMSAdCardContent != null) {
                codedOutputByteBufferNano.m17309K(6, oMSAdCardContent, OMSAdCardContent.PROTOBUF_ADAPTER);
            }
            String str3 = oMSAdCardInfo.cartoonKey;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(7, str3);
            }
            codedOutputByteBufferNano.m17299A(8, oMSAdCardInfo.showCartoon);
        }
    };
    public static JsonAdapter<OMSAdCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSAdCardInfo>() { // from class: com.p1.mobile.putong.data.OMSAdCardInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSAdCardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSAdCardInfo newInstance() {
            return new OMSAdCardInfo();
        }

        public boolean parseField(OMSAdCardInfo oMSAdCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    oMSAdCardInfo.identifier = jsonParser.getValueAsString();
                    return true;
                case "cartoonKey":
                    oMSAdCardInfo.cartoonKey = jsonParser.getValueAsString();
                    return true;
                case "contentType":
                    oMSAdCardInfo.contentType = jsonParser.getValueAsString();
                    return true;
                case "constraint":
                    oMSAdCardInfo.constraint = OMSDisplayRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "needLanguage":
                    oMSAdCardInfo.needLanguage = jsonParser.getValueAsBoolean();
                    return true;
                case "position":
                    oMSAdCardInfo.position = Position.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showCartoon":
                    oMSAdCardInfo.showCartoon = jsonParser.getValueAsBoolean();
                    return true;
                case "content":
                    oMSAdCardInfo.content = OMSAdCardContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSAdCardInfo oMSAdCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "cartoonKey":
                case "contentType":
                case "constraint":
                case "needLanguage":
                case "position":
                case "showCartoon":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(oMSAdCardInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSAdCardInfo oMSAdCardInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSAdCardInfo.identifier;
            if (str != null) {
                jsonGenerator.writeStringField("identifier", str);
            }
            jsonGenerator.writeBooleanField("needLanguage", oMSAdCardInfo.needLanguage);
            if (oMSAdCardInfo.constraint != null) {
                jsonGenerator.writeFieldName("constraint");
                OMSDisplayRule.JSON_ADAPTER.serialize(oMSAdCardInfo.constraint, jsonGenerator, true);
            }
            if (oMSAdCardInfo.position != null) {
                jsonGenerator.writeFieldName("position");
                Position.JSON_ADAPTER.serialize(oMSAdCardInfo.position, jsonGenerator, true);
            }
            String str2 = oMSAdCardInfo.contentType;
            if (str2 != null) {
                jsonGenerator.writeStringField("contentType", str2);
            }
            if (oMSAdCardInfo.content != null) {
                jsonGenerator.writeFieldName("content");
                OMSAdCardContent.JSON_ADAPTER.serialize(oMSAdCardInfo.content, jsonGenerator, true);
            }
            String str3 = oMSAdCardInfo.cartoonKey;
            if (str3 != null) {
                jsonGenerator.writeStringField("cartoonKey", str3);
            }
            jsonGenerator.writeBooleanField("showCartoon", oMSAdCardInfo.showCartoon);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSAdCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSAdCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSAdCardInfo new_() {
        OMSAdCardInfo oMSAdCardInfo = new OMSAdCardInfo();
        oMSAdCardInfo.nullCheck();
        return oMSAdCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSAdCardInfo mo225055clone() {
        OMSAdCardInfo oMSAdCardInfo = new OMSAdCardInfo();
        oMSAdCardInfo.identifier = this.identifier;
        oMSAdCardInfo.needLanguage = this.needLanguage;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        if (oMSDisplayRule != null) {
            oMSAdCardInfo.constraint = oMSDisplayRule.mo225055clone();
        }
        Position position = this.position;
        if (position != null) {
            oMSAdCardInfo.position = position.mo225055clone();
        }
        oMSAdCardInfo.contentType = this.contentType;
        OMSAdCardContent oMSAdCardContent = this.content;
        if (oMSAdCardContent != null) {
            oMSAdCardInfo.content = oMSAdCardContent.mo225055clone();
        }
        oMSAdCardInfo.cartoonKey = this.cartoonKey;
        oMSAdCardInfo.showCartoon = this.showCartoon;
        return oMSAdCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSAdCardInfo)) {
            return false;
        }
        OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj;
        return ValueObject.util_equals(this.identifier, oMSAdCardInfo.identifier) && this.needLanguage == oMSAdCardInfo.needLanguage && ValueObject.util_equals(this.constraint, oMSAdCardInfo.constraint) && ValueObject.util_equals(this.position, oMSAdCardInfo.position) && ValueObject.util_equals(this.contentType, oMSAdCardInfo.contentType) && ValueObject.util_equals(this.content, oMSAdCardInfo.content) && ValueObject.util_equals(this.cartoonKey, oMSAdCardInfo.cartoonKey) && this.showCartoon == oMSAdCardInfo.showCartoon;
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
        String str = this.identifier;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.needLanguage ? 1231 : 1237)) * 41;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        int iHashCode2 = (iHashCode + (oMSDisplayRule != null ? oMSDisplayRule.hashCode() : 0)) * 41;
        Position position = this.position;
        int iHashCode3 = (iHashCode2 + (position != null ? position.hashCode() : 0)) * 41;
        String str2 = this.contentType;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        OMSAdCardContent oMSAdCardContent = this.content;
        int iHashCode5 = (iHashCode4 + (oMSAdCardContent != null ? oMSAdCardContent.hashCode() : 0)) * 41;
        String str3 = this.cartoonKey;
        int iHashCode6 = ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.showCartoon ? 1231 : 1237);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.identifier == null) {
            this.identifier = "";
        }
        if (this.constraint == null) {
            this.constraint = OMSDisplayRule.new_();
        }
        if (this.position == null) {
            this.position = Position.new_();
        }
        if (this.contentType == null) {
            this.contentType = "";
        }
        if (this.content == null) {
            this.content = OMSAdCardContent.new_();
        }
        if (this.cartoonKey == null) {
            this.cartoonKey = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
