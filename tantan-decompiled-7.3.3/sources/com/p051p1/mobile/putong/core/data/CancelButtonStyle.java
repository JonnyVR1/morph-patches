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
public class CancelButtonStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cancelbuttonstyle";

    @NonNull
    @ProtobufIndex(index = 2)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String titleColor;
    public static ProtobufAdapter<CancelButtonStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<CancelButtonStyle>() { // from class: com.p1.mobile.putong.core.data.CancelButtonStyle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CancelButtonStyle cancelButtonStyle) {
            String str = cancelButtonStyle.titleColor;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = cancelButtonStyle.backgroundColor;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            cancelButtonStyle.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CancelButtonStyle parse(nc5 nc5Var) throws IOException {
            CancelButtonStyle cancelButtonStyle = new CancelButtonStyle();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (cancelButtonStyle.titleColor == null) {
                        cancelButtonStyle.titleColor = "";
                    }
                    if (cancelButtonStyle.backgroundColor != null) {
                        break;
                    }
                    cancelButtonStyle.backgroundColor = "";
                    break;
                }
                if (iM162497u == 10) {
                    cancelButtonStyle.titleColor = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (cancelButtonStyle.titleColor == null) {
                            cancelButtonStyle.titleColor = "";
                        }
                        if (cancelButtonStyle.backgroundColor != null) {
                            break;
                        }
                        cancelButtonStyle.backgroundColor = "";
                        return cancelButtonStyle;
                    }
                    cancelButtonStyle.backgroundColor = nc5Var.m162495s();
                }
            }
            return cancelButtonStyle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CancelButtonStyle cancelButtonStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cancelButtonStyle.titleColor;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = cancelButtonStyle.backgroundColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<CancelButtonStyle> JSON_ADAPTER = new ObjectJsonAdapter<CancelButtonStyle>() { // from class: com.p1.mobile.putong.core.data.CancelButtonStyle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CancelButtonStyle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CancelButtonStyle newInstance() {
            return new CancelButtonStyle();
        }

        public boolean parseField(CancelButtonStyle cancelButtonStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("titleColor")) {
                cancelButtonStyle.titleColor = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("backgroundColor")) {
                return false;
            }
            cancelButtonStyle.backgroundColor = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CancelButtonStyle cancelButtonStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("titleColor") || str.equals("backgroundColor")) {
                return true;
            }
            return super.parseFieldCheck(cancelButtonStyle, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CancelButtonStyle cancelButtonStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = cancelButtonStyle.titleColor;
            if (str != null) {
                jsonGenerator.writeStringField("titleColor", str);
            }
            String str2 = cancelButtonStyle.backgroundColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundColor", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CancelButtonStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CancelButtonStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CancelButtonStyle new_() {
        CancelButtonStyle cancelButtonStyle = new CancelButtonStyle();
        cancelButtonStyle.nullCheck();
        return cancelButtonStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CancelButtonStyle mo225055clone() {
        CancelButtonStyle cancelButtonStyle = new CancelButtonStyle();
        cancelButtonStyle.titleColor = this.titleColor;
        cancelButtonStyle.backgroundColor = this.backgroundColor;
        return cancelButtonStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelButtonStyle)) {
            return false;
        }
        CancelButtonStyle cancelButtonStyle = (CancelButtonStyle) obj;
        return ValueObject.util_equals(this.titleColor, cancelButtonStyle.titleColor) && ValueObject.util_equals(this.backgroundColor, cancelButtonStyle.backgroundColor);
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
        String str = this.titleColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backgroundColor;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.titleColor == null) {
            this.titleColor = "";
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
