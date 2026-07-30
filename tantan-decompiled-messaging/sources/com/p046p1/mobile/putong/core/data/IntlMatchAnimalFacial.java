package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMatchAnimalFacial extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmatchanimalfacial";

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<IntlMatchAnimalFacial> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMatchAnimalFacial>() { // from class: com.p1.mobile.putong.core.data.IntlMatchAnimalFacial.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMatchAnimalFacial intlMatchAnimalFacial) {
            String str = intlMatchAnimalFacial.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = intlMatchAnimalFacial.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            intlMatchAnimalFacial.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMatchAnimalFacial parse(nb5 nb5Var) throws IOException {
            IntlMatchAnimalFacial intlMatchAnimalFacial = new IntlMatchAnimalFacial();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMatchAnimalFacial.type == null) {
                        intlMatchAnimalFacial.type = "";
                    }
                    if (intlMatchAnimalFacial.value != null) {
                        break;
                    }
                    intlMatchAnimalFacial.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    intlMatchAnimalFacial.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (intlMatchAnimalFacial.type == null) {
                            intlMatchAnimalFacial.type = "";
                        }
                        if (intlMatchAnimalFacial.value != null) {
                            break;
                        }
                        intlMatchAnimalFacial.value = "";
                        return intlMatchAnimalFacial;
                    }
                    intlMatchAnimalFacial.value = nb5Var.m158750s();
                }
            }
            return intlMatchAnimalFacial;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMatchAnimalFacial intlMatchAnimalFacial, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMatchAnimalFacial.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = intlMatchAnimalFacial.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<IntlMatchAnimalFacial> JSON_ADAPTER = new ObjectJsonAdapter<IntlMatchAnimalFacial>() { // from class: com.p1.mobile.putong.core.data.IntlMatchAnimalFacial.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMatchAnimalFacial.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMatchAnimalFacial newInstance() {
            return new IntlMatchAnimalFacial();
        }

        public boolean parseField(IntlMatchAnimalFacial intlMatchAnimalFacial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                intlMatchAnimalFacial.type = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            intlMatchAnimalFacial.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlMatchAnimalFacial intlMatchAnimalFacial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(intlMatchAnimalFacial, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMatchAnimalFacial intlMatchAnimalFacial, JsonGenerator jsonGenerator) throws IOException {
            String str = intlMatchAnimalFacial.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = intlMatchAnimalFacial.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMatchAnimalFacial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMatchAnimalFacial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMatchAnimalFacial new_() {
        IntlMatchAnimalFacial intlMatchAnimalFacial = new IntlMatchAnimalFacial();
        intlMatchAnimalFacial.nullCheck();
        return intlMatchAnimalFacial;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMatchAnimalFacial mo223809clone() {
        IntlMatchAnimalFacial intlMatchAnimalFacial = new IntlMatchAnimalFacial();
        intlMatchAnimalFacial.type = this.type;
        intlMatchAnimalFacial.value = this.value;
        return intlMatchAnimalFacial;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMatchAnimalFacial)) {
            return false;
        }
        IntlMatchAnimalFacial intlMatchAnimalFacial = (IntlMatchAnimalFacial) obj;
        return ValueObject.util_equals(this.type, intlMatchAnimalFacial.type) && ValueObject.util_equals(this.value, intlMatchAnimalFacial.value);
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
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
