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
public class IntlThirdQuickLoginData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlthirdquicklogindata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String code;

    @NonNull
    @ProtobufIndex(index = 2)
    public String message;
    public static ProtobufAdapter<IntlThirdQuickLoginData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlThirdQuickLoginData>() { // from class: com.p1.mobile.putong.core.data.IntlThirdQuickLoginData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlThirdQuickLoginData intlThirdQuickLoginData) {
            String str = intlThirdQuickLoginData.code;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = intlThirdQuickLoginData.message;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            intlThirdQuickLoginData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlThirdQuickLoginData parse(nc5 nc5Var) throws IOException {
            IntlThirdQuickLoginData intlThirdQuickLoginData = new IntlThirdQuickLoginData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlThirdQuickLoginData.code == null) {
                        intlThirdQuickLoginData.code = "";
                    }
                    if (intlThirdQuickLoginData.message != null) {
                        break;
                    }
                    intlThirdQuickLoginData.message = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlThirdQuickLoginData.code = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (intlThirdQuickLoginData.code == null) {
                            intlThirdQuickLoginData.code = "";
                        }
                        if (intlThirdQuickLoginData.message != null) {
                            break;
                        }
                        intlThirdQuickLoginData.message = "";
                        return intlThirdQuickLoginData;
                    }
                    intlThirdQuickLoginData.message = nc5Var.m162495s();
                }
            }
            return intlThirdQuickLoginData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlThirdQuickLoginData intlThirdQuickLoginData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlThirdQuickLoginData.code;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = intlThirdQuickLoginData.message;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<IntlThirdQuickLoginData> JSON_ADAPTER = new ObjectJsonAdapter<IntlThirdQuickLoginData>() { // from class: com.p1.mobile.putong.core.data.IntlThirdQuickLoginData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlThirdQuickLoginData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlThirdQuickLoginData newInstance() {
            return new IntlThirdQuickLoginData();
        }

        public boolean parseField(IntlThirdQuickLoginData intlThirdQuickLoginData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("code")) {
                intlThirdQuickLoginData.code = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("message")) {
                return false;
            }
            intlThirdQuickLoginData.message = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlThirdQuickLoginData intlThirdQuickLoginData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("code") || str.equals("message")) {
                return true;
            }
            return super.parseFieldCheck(intlThirdQuickLoginData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlThirdQuickLoginData intlThirdQuickLoginData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlThirdQuickLoginData.code;
            if (str != null) {
                jsonGenerator.writeStringField("code", str);
            }
            String str2 = intlThirdQuickLoginData.message;
            if (str2 != null) {
                jsonGenerator.writeStringField("message", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlThirdQuickLoginData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlThirdQuickLoginData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlThirdQuickLoginData new_() {
        IntlThirdQuickLoginData intlThirdQuickLoginData = new IntlThirdQuickLoginData();
        intlThirdQuickLoginData.nullCheck();
        return intlThirdQuickLoginData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlThirdQuickLoginData mo225055clone() {
        IntlThirdQuickLoginData intlThirdQuickLoginData = new IntlThirdQuickLoginData();
        intlThirdQuickLoginData.code = this.code;
        intlThirdQuickLoginData.message = this.message;
        return intlThirdQuickLoginData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlThirdQuickLoginData)) {
            return false;
        }
        IntlThirdQuickLoginData intlThirdQuickLoginData = (IntlThirdQuickLoginData) obj;
        return ValueObject.util_equals(this.code, intlThirdQuickLoginData.code) && ValueObject.util_equals(this.message, intlThirdQuickLoginData.message);
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
        String str = this.code;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.message;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.code == null) {
            this.code = "";
        }
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
