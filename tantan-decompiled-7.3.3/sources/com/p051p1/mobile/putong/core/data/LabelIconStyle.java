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
public class LabelIconStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labeliconstyle";

    @NonNull
    @ProtobufIndex(index = 2)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<LabelIconStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelIconStyle>() { // from class: com.p1.mobile.putong.core.data.LabelIconStyle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LabelIconStyle labelIconStyle) {
            String str = labelIconStyle.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = labelIconStyle.iconUrl;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            labelIconStyle.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LabelIconStyle parse(nc5 nc5Var) throws IOException {
            LabelIconStyle labelIconStyle = new LabelIconStyle();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (labelIconStyle.type == null) {
                        labelIconStyle.type = "";
                    }
                    if (labelIconStyle.iconUrl != null) {
                        break;
                    }
                    labelIconStyle.iconUrl = "";
                    break;
                }
                if (iM162497u == 10) {
                    labelIconStyle.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (labelIconStyle.type == null) {
                            labelIconStyle.type = "";
                        }
                        if (labelIconStyle.iconUrl != null) {
                            break;
                        }
                        labelIconStyle.iconUrl = "";
                        return labelIconStyle;
                    }
                    labelIconStyle.iconUrl = nc5Var.m162495s();
                }
            }
            return labelIconStyle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LabelIconStyle labelIconStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelIconStyle.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = labelIconStyle.iconUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<LabelIconStyle> JSON_ADAPTER = new ObjectJsonAdapter<LabelIconStyle>() { // from class: com.p1.mobile.putong.core.data.LabelIconStyle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LabelIconStyle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LabelIconStyle newInstance() {
            return new LabelIconStyle();
        }

        public boolean parseField(LabelIconStyle labelIconStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                labelIconStyle.type = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("iconUrl")) {
                return false;
            }
            labelIconStyle.iconUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LabelIconStyle labelIconStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("iconUrl")) {
                return true;
            }
            return super.parseFieldCheck(labelIconStyle, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LabelIconStyle labelIconStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = labelIconStyle.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = labelIconStyle.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelIconStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelIconStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelIconStyle new_() {
        LabelIconStyle labelIconStyle = new LabelIconStyle();
        labelIconStyle.nullCheck();
        return labelIconStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LabelIconStyle mo225055clone() {
        LabelIconStyle labelIconStyle = new LabelIconStyle();
        labelIconStyle.type = this.type;
        labelIconStyle.iconUrl = this.iconUrl;
        return labelIconStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelIconStyle)) {
            return false;
        }
        LabelIconStyle labelIconStyle = (LabelIconStyle) obj;
        return ValueObject.util_equals(this.type, labelIconStyle.type) && ValueObject.util_equals(this.iconUrl, labelIconStyle.iconUrl);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.iconUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
