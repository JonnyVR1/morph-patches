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
public class ValidationData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "validationdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String validate;
    public static ProtobufAdapter<ValidationData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ValidationData>() { // from class: com.p1.mobile.putong.data.ValidationData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ValidationData validationData) {
            String str = validationData.validate;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) validationData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ValidationData m19253parse(nb5 nb5Var) throws IOException {
            ValidationData validationData = new ValidationData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (validationData.validate != null) {
                        break;
                    }
                    validationData.validate = "";
                    break;
                }
                if (iU != 10) {
                    if (validationData.validate != null) {
                        break;
                    }
                    validationData.validate = "";
                    return validationData;
                }
                validationData.validate = nb5Var.s();
            }
            return validationData;
        }

        public void serialize(ValidationData validationData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = validationData.validate;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<ValidationData> JSON_ADAPTER = new ObjectJsonAdapter<ValidationData>() { // from class: com.p1.mobile.putong.data.ValidationData.2
        public Class getDataClass() {
            return ValidationData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ValidationData mo17830newInstance() {
            return new ValidationData();
        }

        public boolean parseField(ValidationData validationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("validate")) {
                return false;
            }
            validationData.validate = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ValidationData validationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("validate")) {
                return true;
            }
            return super.parseFieldCheck(validationData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ValidationData validationData, JsonGenerator jsonGenerator) throws IOException {
            String str = validationData.validate;
            if (str != null) {
                jsonGenerator.writeStringField("validate", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ValidationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ValidationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ValidationData new_() {
        ValidationData validationData = new ValidationData();
        validationData.nullCheck();
        return validationData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ValidationData m19252clone() {
        ValidationData validationData = new ValidationData();
        validationData.validate = this.validate;
        return validationData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValidationData) {
            return ValueObject.util_equals(this.validate, ((ValidationData) obj).validate);
        }
        return false;
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
        String str = this.validate;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.validate == null) {
            this.validate = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
