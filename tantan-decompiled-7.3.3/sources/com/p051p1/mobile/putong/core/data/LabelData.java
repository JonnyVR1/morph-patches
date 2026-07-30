package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class LabelData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labeldata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String desStr;
    public boolean highlight = true;

    @ProtobufIndex(index = 2)
    public int iconDrawableRes;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String showName;
    public static ProtobufAdapter<LabelData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelData>() { // from class: com.p1.mobile.putong.core.data.LabelData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LabelData labelData) {
            String str = labelData.name;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, labelData.iconDrawableRes);
            String str2 = labelData.showName;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = labelData.desStr;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            labelData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LabelData parse(nc5 nc5Var) throws IOException {
            LabelData labelData = new LabelData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (labelData.name == null) {
                        labelData.name = "";
                    }
                    if (labelData.showName == null) {
                        labelData.showName = "";
                    }
                    if (labelData.desStr != null) {
                        break;
                    }
                    labelData.desStr = "";
                    break;
                }
                if (iM162497u == 10) {
                    labelData.name = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    labelData.iconDrawableRes = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    labelData.showName = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (labelData.name == null) {
                            labelData.name = "";
                        }
                        if (labelData.showName == null) {
                            labelData.showName = "";
                        }
                        if (labelData.desStr != null) {
                            break;
                        }
                        labelData.desStr = "";
                        return labelData;
                    }
                    labelData.desStr = nc5Var.m162495s();
                }
            }
            return labelData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LabelData labelData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelData.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, labelData.iconDrawableRes);
            String str2 = labelData.showName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = labelData.desStr;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<LabelData> JSON_ADAPTER = new ObjectJsonAdapter<LabelData>() { // from class: com.p1.mobile.putong.core.data.LabelData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LabelData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LabelData newInstance() {
            return new LabelData();
        }

        public boolean parseField(LabelData labelData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "desStr":
                    labelData.desStr = jsonParser.getValueAsString();
                    return true;
                case "showName":
                    labelData.showName = jsonParser.getValueAsString();
                    return true;
                case "name":
                    labelData.name = jsonParser.getValueAsString();
                    return true;
                case "iconDrawableRes":
                    labelData.iconDrawableRes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LabelData labelData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "desStr":
                case "showName":
                case "name":
                case "iconDrawableRes":
                    return true;
                default:
                    return super.parseFieldCheck(labelData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LabelData labelData, JsonGenerator jsonGenerator) throws IOException {
            String str = labelData.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeNumberField("iconDrawableRes", labelData.iconDrawableRes);
            String str2 = labelData.showName;
            if (str2 != null) {
                jsonGenerator.writeStringField("showName", str2);
            }
            String str3 = labelData.desStr;
            if (str3 != null) {
                jsonGenerator.writeStringField("desStr", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelData new_() {
        LabelData labelData = new LabelData();
        labelData.nullCheck();
        return labelData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LabelData mo225055clone() {
        LabelData labelData = new LabelData();
        labelData.name = this.name;
        labelData.iconDrawableRes = this.iconDrawableRes;
        labelData.showName = this.showName;
        labelData.desStr = this.desStr;
        return labelData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelData)) {
            return false;
        }
        LabelData labelData = (LabelData) obj;
        return ValueObject.util_equals(this.name, labelData.name) && this.iconDrawableRes == labelData.iconDrawableRes && ValueObject.util_equals(this.showName, labelData.showName) && ValueObject.util_equals(this.desStr, labelData.desStr);
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
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.iconDrawableRes) * 41;
        String str2 = this.showName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.desStr;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.showName == null) {
            this.showName = "";
        }
        if (this.desStr == null) {
            this.desStr = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
