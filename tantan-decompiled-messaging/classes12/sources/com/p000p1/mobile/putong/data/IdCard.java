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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdCard idCard) {
            String str = idCard.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = idCard.number;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) idCard).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdCard m18208parse(nb5 nb5Var) throws IOException {
            IdCard idCard = new IdCard();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (idCard.name == null) {
                        idCard.name = "";
                    }
                    if (idCard.number != null) {
                        break;
                    }
                    idCard.number = "";
                    break;
                }
                if (iU == 10) {
                    idCard.name = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (idCard.name == null) {
                            idCard.name = "";
                        }
                        if (idCard.number != null) {
                            break;
                        }
                        idCard.number = "";
                        return idCard;
                    }
                    idCard.number = nb5Var.s();
                }
            }
            return idCard;
        }

        public void serialize(IdCard idCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idCard.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = idCard.number;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<IdCard> JSON_ADAPTER = new ObjectJsonAdapter<IdCard>() { // from class: com.p1.mobile.putong.data.IdCard.2
        public Class getDataClass() {
            return IdCard.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IdCard mo17830newInstance() {
            return new IdCard();
        }

        public boolean parseField(IdCard idCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("number")) {
                idCard.number = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("name")) {
                return false;
            }
            idCard.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IdCard idCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("number") || str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(idCard, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdCard idCard, JsonGenerator jsonGenerator) throws IOException {
            String str = idCard.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = idCard.number;
            if (str2 != null) {
                jsonGenerator.writeStringField("number", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdCard new_() {
        IdCard idCard = new IdCard();
        idCard.nullCheck();
        return idCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdCard m18207clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.number;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.number == null) {
            this.number = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
