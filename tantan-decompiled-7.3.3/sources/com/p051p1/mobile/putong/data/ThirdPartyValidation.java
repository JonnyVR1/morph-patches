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
public class ThirdPartyValidation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartyvalidation";

    @NonNull
    @ProtobufIndex(index = 2)
    public ValidationData code;

    @NonNull
    @ProtobufIndex(index = 1)
    public String provider;
    public static ProtobufAdapter<ThirdPartyValidation> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartyValidation>() { // from class: com.p1.mobile.putong.data.ThirdPartyValidation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThirdPartyValidation thirdPartyValidation) {
            String str = thirdPartyValidation.provider;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            ValidationData validationData = thirdPartyValidation.code;
            if (validationData != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, validationData, ValidationData.PROTOBUF_ADAPTER);
            }
            thirdPartyValidation.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThirdPartyValidation parse(nc5 nc5Var) throws IOException {
            ThirdPartyValidation thirdPartyValidation = new ThirdPartyValidation();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (thirdPartyValidation.provider == null) {
                        thirdPartyValidation.provider = "";
                    }
                    if (thirdPartyValidation.code != null) {
                        break;
                    }
                    thirdPartyValidation.code = ValidationData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    thirdPartyValidation.provider = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (thirdPartyValidation.provider == null) {
                            thirdPartyValidation.provider = "";
                        }
                        if (thirdPartyValidation.code != null) {
                            break;
                        }
                        thirdPartyValidation.code = ValidationData.new_();
                        return thirdPartyValidation;
                    }
                    thirdPartyValidation.code = (ValidationData) nc5Var.m162488l(ValidationData.PROTOBUF_ADAPTER);
                }
            }
            return thirdPartyValidation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThirdPartyValidation thirdPartyValidation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thirdPartyValidation.provider;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            ValidationData validationData = thirdPartyValidation.code;
            if (validationData != null) {
                codedOutputByteBufferNano.m17309K(2, validationData, ValidationData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ThirdPartyValidation> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartyValidation>() { // from class: com.p1.mobile.putong.data.ThirdPartyValidation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThirdPartyValidation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThirdPartyValidation newInstance() {
            return new ThirdPartyValidation();
        }

        public boolean parseField(ThirdPartyValidation thirdPartyValidation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("provider")) {
                thirdPartyValidation.provider = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("code")) {
                return false;
            }
            thirdPartyValidation.code = ValidationData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ThirdPartyValidation thirdPartyValidation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("provider") || str.equals("code")) {
                return true;
            }
            return super.parseFieldCheck(thirdPartyValidation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThirdPartyValidation thirdPartyValidation, JsonGenerator jsonGenerator) throws IOException {
            String str = thirdPartyValidation.provider;
            if (str != null) {
                jsonGenerator.writeStringField("provider", str);
            }
            if (thirdPartyValidation.code != null) {
                jsonGenerator.writeFieldName("code");
                ValidationData.JSON_ADAPTER.serialize(thirdPartyValidation.code, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartyValidation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartyValidation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartyValidation new_() {
        ThirdPartyValidation thirdPartyValidation = new ThirdPartyValidation();
        thirdPartyValidation.nullCheck();
        return thirdPartyValidation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThirdPartyValidation mo225055clone() {
        ThirdPartyValidation thirdPartyValidation = new ThirdPartyValidation();
        thirdPartyValidation.provider = this.provider;
        ValidationData validationData = this.code;
        if (validationData != null) {
            thirdPartyValidation.code = validationData.mo225055clone();
        }
        return thirdPartyValidation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPartyValidation)) {
            return false;
        }
        ThirdPartyValidation thirdPartyValidation = (ThirdPartyValidation) obj;
        return ValueObject.util_equals(this.provider, thirdPartyValidation.provider) && ValueObject.util_equals(this.code, thirdPartyValidation.code);
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
        String str = this.provider;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ValidationData validationData = this.code;
        int iHashCode2 = iHashCode + (validationData != null ? validationData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.code == null) {
            this.code = ValidationData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
