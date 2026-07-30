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
public class PhoneNumber extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "phonenumber";

    @ProtobufIndex(index = 1)
    public int countryCode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String number;
    public static ProtobufAdapter<PhoneNumber> PROTOBUF_ADAPTER = new MessageNanoAdapter<PhoneNumber>() { // from class: com.p1.mobile.putong.data.PhoneNumber.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PhoneNumber phoneNumber) {
            int iH = CodedOutputByteBufferNano.h(1, phoneNumber.countryCode);
            String str = phoneNumber.number;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) phoneNumber).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PhoneNumber m18795parse(nb5 nb5Var) throws IOException {
            PhoneNumber phoneNumber = new PhoneNumber();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (phoneNumber.number != null) {
                        break;
                    }
                    phoneNumber.number = "";
                    break;
                }
                if (iU == 8) {
                    phoneNumber.countryCode = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (phoneNumber.number != null) {
                            break;
                        }
                        phoneNumber.number = "";
                        return phoneNumber;
                    }
                    phoneNumber.number = nb5Var.s();
                }
            }
            return phoneNumber;
        }

        public void serialize(PhoneNumber phoneNumber, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, phoneNumber.countryCode);
            String str = phoneNumber.number;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<PhoneNumber> JSON_ADAPTER = new ObjectJsonAdapter<PhoneNumber>() { // from class: com.p1.mobile.putong.data.PhoneNumber.2
        public Class getDataClass() {
            return PhoneNumber.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PhoneNumber mo17830newInstance() {
            return new PhoneNumber();
        }

        public boolean parseField(PhoneNumber phoneNumber, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("countryCode")) {
                phoneNumber.countryCode = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("number")) {
                return false;
            }
            phoneNumber.number = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(PhoneNumber phoneNumber, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("countryCode") || str.equals("number")) {
                return true;
            }
            return super.parseFieldCheck(phoneNumber, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PhoneNumber phoneNumber, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("countryCode", phoneNumber.countryCode);
            String str = phoneNumber.number;
            if (str != null) {
                jsonGenerator.writeStringField("number", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PhoneNumber) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PhoneNumber) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PhoneNumber new_() {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.nullCheck();
        return phoneNumber;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PhoneNumber m18794clone() {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.countryCode = this.countryCode;
        phoneNumber.number = this.number;
        return phoneNumber;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) obj;
        return this.countryCode == phoneNumber.countryCode && ValueObject.util_equals(this.number, phoneNumber.number);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.countryCode) * 41;
        String str = this.number;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.number == null) {
            this.number = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
