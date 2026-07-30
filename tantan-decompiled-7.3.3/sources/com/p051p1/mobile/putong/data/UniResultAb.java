package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class UniResultAb extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "uniresultab";

    @NonNull
    @ProtobufIndex(index = 1)
    public String accessCode;

    @ProtobufIndex(index = 3)
    public long exp;

    @NonNull
    @ProtobufIndex(index = 2)
    public String fakeMobile;

    @ProtobufIndex(index = 4)
    public int operator;
    public static ProtobufAdapter<UniResultAb> PROTOBUF_ADAPTER = new MessageNanoAdapter<UniResultAb>() { // from class: com.p1.mobile.putong.data.UniResultAb.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UniResultAb uniResultAb) {
            String str = uniResultAb.accessCode;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = uniResultAb.fakeMobile;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(3, uniResultAb.exp) + CodedOutputByteBufferNano.m17281h(4, uniResultAb.operator);
            uniResultAb.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UniResultAb parse(nc5 nc5Var) throws IOException {
            UniResultAb uniResultAb = new UniResultAb();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (uniResultAb.accessCode == null) {
                        uniResultAb.accessCode = "";
                    }
                    if (uniResultAb.fakeMobile != null) {
                        break;
                    }
                    uniResultAb.fakeMobile = "";
                    break;
                }
                if (iM162497u == 10) {
                    uniResultAb.accessCode = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    uniResultAb.fakeMobile = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    uniResultAb.exp = nc5Var.m162487k();
                } else {
                    if (iM162497u != 32) {
                        if (uniResultAb.accessCode == null) {
                            uniResultAb.accessCode = "";
                        }
                        if (uniResultAb.fakeMobile != null) {
                            break;
                        }
                        uniResultAb.fakeMobile = "";
                        return uniResultAb;
                    }
                    uniResultAb.operator = nc5Var.m162486j();
                }
            }
            return uniResultAb;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UniResultAb uniResultAb, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = uniResultAb.accessCode;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = uniResultAb.fakeMobile;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17307I(3, uniResultAb.exp);
            codedOutputByteBufferNano.m17305G(4, uniResultAb.operator);
        }
    };
    public static JsonAdapter<UniResultAb> JSON_ADAPTER = new ObjectJsonAdapter<UniResultAb>() { // from class: com.p1.mobile.putong.data.UniResultAb.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UniResultAb.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UniResultAb newInstance() {
            return new UniResultAb();
        }

        public boolean parseField(UniResultAb uniResultAb, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "accessCode":
                    uniResultAb.accessCode = jsonParser.getValueAsString();
                    return true;
                case "operator":
                    uniResultAb.operator = jsonParser.getValueAsInt();
                    return true;
                case "exp":
                    uniResultAb.exp = jsonParser.getValueAsLong();
                    return true;
                case "fakeMobile":
                    uniResultAb.fakeMobile = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UniResultAb uniResultAb, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "accessCode":
                case "operator":
                case "exp":
                case "fakeMobile":
                    return true;
                default:
                    return super.parseFieldCheck(uniResultAb, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UniResultAb uniResultAb, JsonGenerator jsonGenerator) throws IOException {
            String str = uniResultAb.accessCode;
            if (str != null) {
                jsonGenerator.writeStringField("accessCode", str);
            }
            String str2 = uniResultAb.fakeMobile;
            if (str2 != null) {
                jsonGenerator.writeStringField("fakeMobile", str2);
            }
            jsonGenerator.writeNumberField(AuthenticationTokenClaims.JSON_KEY_EXP, uniResultAb.exp);
            jsonGenerator.writeNumberField("operator", uniResultAb.operator);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UniResultAb) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UniResultAb) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UniResultAb new_() {
        UniResultAb uniResultAb = new UniResultAb();
        uniResultAb.nullCheck();
        return uniResultAb;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UniResultAb mo225055clone() {
        UniResultAb uniResultAb = new UniResultAb();
        uniResultAb.accessCode = this.accessCode;
        uniResultAb.fakeMobile = this.fakeMobile;
        uniResultAb.exp = this.exp;
        uniResultAb.operator = this.operator;
        return uniResultAb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UniResultAb)) {
            return false;
        }
        UniResultAb uniResultAb = (UniResultAb) obj;
        return ValueObject.util_equals(this.accessCode, uniResultAb.accessCode) && ValueObject.util_equals(this.fakeMobile, uniResultAb.fakeMobile) && this.exp == uniResultAb.exp && this.operator == uniResultAb.operator;
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
        String str = this.accessCode;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.fakeMobile;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.exp;
        int i3 = ((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.operator;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.accessCode == null) {
            this.accessCode = "";
        }
        if (this.fakeMobile == null) {
            this.fakeMobile = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
