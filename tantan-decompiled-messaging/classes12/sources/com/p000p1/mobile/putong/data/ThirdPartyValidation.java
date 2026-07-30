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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ThirdPartyValidation thirdPartyValidation) {
            String str = thirdPartyValidation.provider;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ValidationData validationData = thirdPartyValidation.code;
            if (validationData != null) {
                iO += CodedOutputByteBufferNano.l(2, validationData, ValidationData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) thirdPartyValidation).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ThirdPartyValidation m19103parse(nb5 nb5Var) throws IOException {
            ThirdPartyValidation thirdPartyValidation = new ThirdPartyValidation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (thirdPartyValidation.provider == null) {
                        thirdPartyValidation.provider = "";
                    }
                    if (thirdPartyValidation.code != null) {
                        break;
                    }
                    thirdPartyValidation.code = ValidationData.new_();
                    break;
                }
                if (iU == 10) {
                    thirdPartyValidation.provider = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (thirdPartyValidation.provider == null) {
                            thirdPartyValidation.provider = "";
                        }
                        if (thirdPartyValidation.code != null) {
                            break;
                        }
                        thirdPartyValidation.code = ValidationData.new_();
                        return thirdPartyValidation;
                    }
                    thirdPartyValidation.code = (ValidationData) nb5Var.l(ValidationData.PROTOBUF_ADAPTER);
                }
            }
            return thirdPartyValidation;
        }

        public void serialize(ThirdPartyValidation thirdPartyValidation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thirdPartyValidation.provider;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            ValidationData validationData = thirdPartyValidation.code;
            if (validationData != null) {
                codedOutputByteBufferNano.K(2, validationData, ValidationData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ThirdPartyValidation> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartyValidation>() { // from class: com.p1.mobile.putong.data.ThirdPartyValidation.2
        public Class getDataClass() {
            return ThirdPartyValidation.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ThirdPartyValidation mo17830newInstance() {
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
            thirdPartyValidation.code = (ValidationData) ValidationData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ThirdPartyValidation thirdPartyValidation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("provider") || str.equals("code")) {
                return true;
            }
            return super.parseFieldCheck(thirdPartyValidation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartyValidation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartyValidation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartyValidation new_() {
        ThirdPartyValidation thirdPartyValidation = new ThirdPartyValidation();
        thirdPartyValidation.nullCheck();
        return thirdPartyValidation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ThirdPartyValidation m19102clone() {
        ThirdPartyValidation thirdPartyValidation = new ThirdPartyValidation();
        thirdPartyValidation.provider = this.provider;
        ValidationData validationData = this.code;
        if (validationData != null) {
            thirdPartyValidation.code = validationData.m19252clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.provider;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ValidationData validationData = this.code;
        int iHashCode2 = iHashCode + (validationData != null ? validationData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.code == null) {
            this.code = ValidationData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
