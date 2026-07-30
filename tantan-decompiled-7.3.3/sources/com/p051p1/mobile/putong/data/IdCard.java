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
public class IdCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idcard";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String number;
    public static ProtobufAdapter<IdCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdCard>() { // from class: com.p1.mobile.putong.data.IdCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdCard idCard) {
            String str = idCard.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = idCard.number;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            idCard.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdCard parse(nc5 nc5Var) throws IOException {
            IdCard idCard = new IdCard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (idCard.name == null) {
                        idCard.name = "";
                    }
                    if (idCard.number != null) {
                        break;
                    }
                    idCard.number = "";
                    break;
                }
                if (iM162497u == 10) {
                    idCard.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (idCard.name == null) {
                            idCard.name = "";
                        }
                        if (idCard.number != null) {
                            break;
                        }
                        idCard.number = "";
                        return idCard;
                    }
                    idCard.number = nc5Var.m162495s();
                }
            }
            return idCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdCard idCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idCard.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = idCard.number;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<IdCard> JSON_ADAPTER = new ObjectJsonAdapter<IdCard>() { // from class: com.p1.mobile.putong.data.IdCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdCard newInstance() {
            return new IdCard();
        }

        public boolean parseField(IdCard idCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("number")) {
                idCard.number = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            idCard.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IdCard idCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("number") || str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(idCard, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdCard idCard, JsonGenerator jsonGenerator) throws IOException {
            String str = idCard.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = idCard.number;
            if (str2 != null) {
                jsonGenerator.writeStringField("number", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdCard new_() {
        IdCard idCard = new IdCard();
        idCard.nullCheck();
        return idCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdCard mo225055clone() {
        IdCard idCard = new IdCard();
        idCard.name = this.name;
        idCard.number = this.number;
        return idCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdCard)) {
            return false;
        }
        IdCard idCard = (IdCard) obj;
        return ValueObject.util_equals(this.name, idCard.name) && ValueObject.util_equals(this.number, idCard.number);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.number;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.number == null) {
            this.number = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
