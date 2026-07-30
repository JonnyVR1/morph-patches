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
public class Mobile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mobile";

    @ProtobufIndex(index = 1)
    public int countryCode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mobileNumber;
    public static ProtobufAdapter<Mobile> PROTOBUF_ADAPTER = new MessageNanoAdapter<Mobile>() { // from class: com.p1.mobile.putong.data.Mobile.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Mobile mobile) {
            int iH = CodedOutputByteBufferNano.h(1, mobile.countryCode);
            String str = mobile.mobileNumber;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) mobile).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Mobile m18474parse(nb5 nb5Var) throws IOException {
            Mobile mobile = new Mobile();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (mobile.mobileNumber != null) {
                        break;
                    }
                    mobile.mobileNumber = "";
                    break;
                }
                if (iU == 8) {
                    mobile.countryCode = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (mobile.mobileNumber != null) {
                            break;
                        }
                        mobile.mobileNumber = "";
                        return mobile;
                    }
                    mobile.mobileNumber = nb5Var.s();
                }
            }
            return mobile;
        }

        public void serialize(Mobile mobile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, mobile.countryCode);
            String str = mobile.mobileNumber;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<Mobile> JSON_ADAPTER = new ObjectJsonAdapter<Mobile>() { // from class: com.p1.mobile.putong.data.Mobile.2
        public Class getDataClass() {
            return Mobile.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Mobile mo17830newInstance() {
            return new Mobile();
        }

        public boolean parseField(Mobile mobile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("countryCode")) {
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
            if (str.equals("countryCode") || str.equals("mobileNumber")) {
                return true;
            }
            return super.parseFieldCheck(mobile, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Mobile mobile, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("countryCode", mobile.countryCode);
            String str = mobile.mobileNumber;
            if (str != null) {
                jsonGenerator.writeStringField("mobileNumber", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Mobile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Mobile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Mobile new_() {
        Mobile mobile = new Mobile();
        mobile.nullCheck();
        return mobile;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Mobile m18473clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.countryCode) * 41;
        String str = this.mobileNumber;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.mobileNumber == null) {
            this.mobileNumber = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
