package com.p046p1.mobile.putong.data;

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
import java.util.Comparator;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class ContactNumber extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contactnumber";

    @NonNull
    @ProtobufIndex(index = 1)
    public String hash11;

    @NonNull
    @ProtobufIndex(index = 2)
    public String hash8;

    @NonNull
    @ProtobufIndex(index = 3)
    public String number;
    public static Comparator<ContactNumber> ORDER_BY_HASH11 = new Comparator<ContactNumber>() { // from class: com.p1.mobile.putong.data.ContactNumber.1
        @Override // java.util.Comparator
        public int compare(ContactNumber contactNumber, ContactNumber contactNumber2) {
            return contactNumber.hash11.compareTo(contactNumber2.hash11);
        }
    };
    public static ProtobufAdapter<ContactNumber> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContactNumber>() { // from class: com.p1.mobile.putong.data.ContactNumber.2
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContactNumber contactNumber) {
            String str = contactNumber.hash11;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = contactNumber.hash8;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = contactNumber.number;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            contactNumber.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContactNumber parse(nb5 nb5Var) throws IOException {
            ContactNumber contactNumber = new ContactNumber();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (contactNumber.hash11 == null) {
                        contactNumber.hash11 = "";
                    }
                    if (contactNumber.hash8 == null) {
                        contactNumber.hash8 = "";
                    }
                    if (contactNumber.number != null) {
                        break;
                    }
                    contactNumber.number = "";
                    break;
                }
                if (iM158752u == 10) {
                    contactNumber.hash11 = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    contactNumber.hash8 = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (contactNumber.hash11 == null) {
                            contactNumber.hash11 = "";
                        }
                        if (contactNumber.hash8 == null) {
                            contactNumber.hash8 = "";
                        }
                        if (contactNumber.number != null) {
                            break;
                        }
                        contactNumber.number = "";
                        return contactNumber;
                    }
                    contactNumber.number = nb5Var.m158750s();
                }
            }
            return contactNumber;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContactNumber contactNumber, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = contactNumber.hash11;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = contactNumber.hash8;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = contactNumber.number;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<ContactNumber> JSON_ADAPTER = new ObjectJsonAdapter<ContactNumber>() { // from class: com.p1.mobile.putong.data.ContactNumber.3
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContactNumber.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContactNumber newInstance() {
            return new ContactNumber();
        }

        public boolean parseField(ContactNumber contactNumber, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hash11":
                    contactNumber.hash11 = jsonParser.getValueAsString();
                    return true;
                case "number":
                    contactNumber.number = jsonParser.getValueAsString();
                    return true;
                case "hash8":
                    contactNumber.hash8 = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ContactNumber contactNumber, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hash11":
                case "number":
                case "hash8":
                    return true;
                default:
                    return super.parseFieldCheck(contactNumber, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContactNumber contactNumber, JsonGenerator jsonGenerator) throws IOException {
            String str = contactNumber.hash11;
            if (str != null) {
                jsonGenerator.writeStringField("hash11", str);
            }
            String str2 = contactNumber.hash8;
            if (str2 != null) {
                jsonGenerator.writeStringField("hash8", str2);
            }
            String str3 = contactNumber.number;
            if (str3 != null) {
                jsonGenerator.writeStringField("number", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContactNumber) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContactNumber) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContactNumber new_() {
        ContactNumber contactNumber = new ContactNumber();
        contactNumber.nullCheck();
        return contactNumber;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContactNumber mo223809clone() {
        ContactNumber contactNumber = new ContactNumber();
        contactNumber.hash11 = this.hash11;
        contactNumber.hash8 = this.hash8;
        contactNumber.number = this.number;
        return contactNumber;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContactNumber)) {
            return false;
        }
        ContactNumber contactNumber = (ContactNumber) obj;
        return ValueObject.util_equals(this.hash11, contactNumber.hash11) && ValueObject.util_equals(this.hash8, contactNumber.hash8) && ValueObject.util_equals(this.number, contactNumber.number);
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
        String str = this.hash11;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.hash8;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.number;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.hash11 == null) {
            this.hash11 = "";
        }
        if (this.hash8 == null) {
            this.hash8 = "";
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
