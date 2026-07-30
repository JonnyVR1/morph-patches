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
public class Mobile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mobile";

    @ProtobufIndex(index = 1)
    public int countryCode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mobileNumber;
    public static ProtobufAdapter<Mobile> PROTOBUF_ADAPTER = new MessageNanoAdapter<Mobile>() { // from class: com.p1.mobile.putong.data.Mobile.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Mobile mobile) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, mobile.countryCode);
            String str = mobile.mobileNumber;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            mobile.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Mobile parse(nb5 nb5Var) throws IOException {
            Mobile mobile = new Mobile();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (mobile.mobileNumber != null) {
                        break;
                    }
                    mobile.mobileNumber = "";
                    break;
                }
                if (iM158752u == 8) {
                    mobile.countryCode = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (mobile.mobileNumber != null) {
                            break;
                        }
                        mobile.mobileNumber = "";
                        return mobile;
                    }
                    mobile.mobileNumber = nb5Var.m158750s();
                }
            }
            return mobile;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Mobile mobile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, mobile.countryCode);
            String str = mobile.mobileNumber;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<Mobile> JSON_ADAPTER = new ObjectJsonAdapter<Mobile>() { // from class: com.p1.mobile.putong.data.Mobile.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Mobile.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Mobile newInstance() {
            return new Mobile();
        }

        public boolean parseField(Mobile mobile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)) {
                mobile.countryCode = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("mobileNumber")) {
                return false;
            }
            mobile.mobileNumber = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Mobile mobile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) || str.equals("mobileNumber")) {
                return true;
            }
            return super.parseFieldCheck(mobile, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Mobile mobile, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, mobile.countryCode);
            String str = mobile.mobileNumber;
            if (str != null) {
                jsonGenerator.writeStringField("mobileNumber", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Mobile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Mobile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Mobile new_() {
        Mobile mobile = new Mobile();
        mobile.nullCheck();
        return mobile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Mobile mo223809clone() {
        Mobile mobile = new Mobile();
        mobile.countryCode = this.countryCode;
        mobile.mobileNumber = this.mobileNumber;
        return mobile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Mobile)) {
            return false;
        }
        Mobile mobile = (Mobile) obj;
        return this.countryCode == mobile.countryCode && ValueObject.util_equals(this.mobileNumber, mobile.mobileNumber);
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
        String str = this.mobileNumber;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mobileNumber == null) {
            this.mobileNumber = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
