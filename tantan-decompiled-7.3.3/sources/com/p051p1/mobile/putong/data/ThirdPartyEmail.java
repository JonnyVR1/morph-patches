package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class ThirdPartyEmail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartyemail";

    @NonNull
    @ProtobufIndex(index = 1)
    public String appleEmail;

    @NonNull
    @ProtobufIndex(index = 2)
    public String googleEmail;
    public static ProtobufAdapter<ThirdPartyEmail> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartyEmail>() { // from class: com.p1.mobile.putong.data.ThirdPartyEmail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThirdPartyEmail thirdPartyEmail) {
            String str = thirdPartyEmail.appleEmail;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = thirdPartyEmail.googleEmail;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            thirdPartyEmail.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThirdPartyEmail parse(nc5 nc5Var) throws IOException {
            ThirdPartyEmail thirdPartyEmail = new ThirdPartyEmail();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (thirdPartyEmail.appleEmail == null) {
                        thirdPartyEmail.appleEmail = "";
                    }
                    if (thirdPartyEmail.googleEmail != null) {
                        break;
                    }
                    thirdPartyEmail.googleEmail = "";
                    break;
                }
                if (iM162497u == 10) {
                    thirdPartyEmail.appleEmail = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (thirdPartyEmail.appleEmail == null) {
                            thirdPartyEmail.appleEmail = "";
                        }
                        if (thirdPartyEmail.googleEmail != null) {
                            break;
                        }
                        thirdPartyEmail.googleEmail = "";
                        return thirdPartyEmail;
                    }
                    thirdPartyEmail.googleEmail = nc5Var.m162495s();
                }
            }
            return thirdPartyEmail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThirdPartyEmail thirdPartyEmail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thirdPartyEmail.appleEmail;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = thirdPartyEmail.googleEmail;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<ThirdPartyEmail> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartyEmail>() { // from class: com.p1.mobile.putong.data.ThirdPartyEmail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThirdPartyEmail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThirdPartyEmail newInstance() {
            return new ThirdPartyEmail();
        }

        public boolean parseField(ThirdPartyEmail thirdPartyEmail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("appleEmail")) {
                thirdPartyEmail.appleEmail = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("googleEmail")) {
                return false;
            }
            thirdPartyEmail.googleEmail = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ThirdPartyEmail thirdPartyEmail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("appleEmail") || str.equals("googleEmail")) {
                return true;
            }
            return super.parseFieldCheck(thirdPartyEmail, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThirdPartyEmail thirdPartyEmail, JsonGenerator jsonGenerator) throws IOException {
            String str = thirdPartyEmail.appleEmail;
            if (str != null) {
                jsonGenerator.writeStringField("appleEmail", str);
            }
            String str2 = thirdPartyEmail.googleEmail;
            if (str2 != null) {
                jsonGenerator.writeStringField("googleEmail", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartyEmail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartyEmail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartyEmail new_() {
        ThirdPartyEmail thirdPartyEmail = new ThirdPartyEmail();
        thirdPartyEmail.nullCheck();
        return thirdPartyEmail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThirdPartyEmail mo225055clone() {
        ThirdPartyEmail thirdPartyEmail = new ThirdPartyEmail();
        thirdPartyEmail.appleEmail = this.appleEmail;
        thirdPartyEmail.googleEmail = this.googleEmail;
        return thirdPartyEmail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPartyEmail)) {
            return false;
        }
        ThirdPartyEmail thirdPartyEmail = (ThirdPartyEmail) obj;
        return ValueObject.util_equals(this.appleEmail, thirdPartyEmail.appleEmail) && ValueObject.util_equals(this.googleEmail, thirdPartyEmail.googleEmail);
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
        String str = this.appleEmail;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.googleEmail;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.appleEmail == null) {
            this.appleEmail = "";
        }
        if (this.googleEmail == null) {
            this.googleEmail = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
