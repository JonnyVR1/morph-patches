package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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

/* JADX INFO: loaded from: classes12.dex */
public class PhoneNumber extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "phonenumber";

    @ProtobufIndex(index = 1)
    public int countryCode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String number;
    public static ProtobufAdapter<PhoneNumber> PROTOBUF_ADAPTER = new MessageNanoAdapter<PhoneNumber>() { // from class: com.p1.mobile.putong.data.PhoneNumber.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PhoneNumber phoneNumber) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, phoneNumber.countryCode);
            String str = phoneNumber.number;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            phoneNumber.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PhoneNumber parse(nb5 nb5Var) throws IOException {
            PhoneNumber phoneNumber = new PhoneNumber();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (phoneNumber.number != null) {
                        break;
                    }
                    phoneNumber.number = "";
                    break;
                }
                if (iM158752u == 8) {
                    phoneNumber.countryCode = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (phoneNumber.number != null) {
                            break;
                        }
                        phoneNumber.number = "";
                        return phoneNumber;
                    }
                    phoneNumber.number = nb5Var.m158750s();
                }
            }
            return phoneNumber;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PhoneNumber phoneNumber, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, phoneNumber.countryCode);
            String str = phoneNumber.number;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<PhoneNumber> JSON_ADAPTER = new ObjectJsonAdapter<PhoneNumber>() { // from class: com.p1.mobile.putong.data.PhoneNumber.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PhoneNumber.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PhoneNumber newInstance() {
            return new PhoneNumber();
        }

        public boolean parseField(PhoneNumber phoneNumber, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)) {
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
            if (str.equals(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) || str.equals("number")) {
                return true;
            }
            return super.parseFieldCheck(phoneNumber, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PhoneNumber phoneNumber, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, phoneNumber.countryCode);
            String str = phoneNumber.number;
            if (str != null) {
                jsonGenerator.writeStringField("number", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PhoneNumber) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PhoneNumber) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PhoneNumber new_() {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.nullCheck();
        return phoneNumber;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PhoneNumber mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.countryCode) * 41;
        String str = this.number;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.number == null) {
            this.number = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
