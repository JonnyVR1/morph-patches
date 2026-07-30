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
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class EmailVerifyData extends ValueObject implements Cloneable, Serializable {
    public static final String EMAIL_VERIFY = "emailVerify";
    public static final String TYPE = "emailverifydata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String email;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;
    public static ProtobufAdapter<EmailVerifyData> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmailVerifyData>() { // from class: com.p1.mobile.putong.data.EmailVerifyData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EmailVerifyData emailVerifyData) {
            String str = emailVerifyData.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = emailVerifyData.email;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = emailVerifyData.value;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            emailVerifyData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EmailVerifyData parse(nc5 nc5Var) throws IOException {
            EmailVerifyData emailVerifyData = new EmailVerifyData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (emailVerifyData.type == null) {
                        emailVerifyData.type = "";
                    }
                    if (emailVerifyData.email == null) {
                        emailVerifyData.email = "";
                    }
                    if (emailVerifyData.value != null) {
                        break;
                    }
                    emailVerifyData.value = "";
                    break;
                }
                if (iM162497u == 10) {
                    emailVerifyData.type = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    emailVerifyData.email = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (emailVerifyData.type == null) {
                            emailVerifyData.type = "";
                        }
                        if (emailVerifyData.email == null) {
                            emailVerifyData.email = "";
                        }
                        if (emailVerifyData.value != null) {
                            break;
                        }
                        emailVerifyData.value = "";
                        return emailVerifyData;
                    }
                    emailVerifyData.value = nc5Var.m162495s();
                }
            }
            return emailVerifyData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EmailVerifyData emailVerifyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = emailVerifyData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = emailVerifyData.email;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = emailVerifyData.value;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<EmailVerifyData> JSON_ADAPTER = new ObjectJsonAdapter<EmailVerifyData>() { // from class: com.p1.mobile.putong.data.EmailVerifyData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EmailVerifyData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EmailVerifyData newInstance() {
            return new EmailVerifyData();
        }

        public boolean parseField(EmailVerifyData emailVerifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "type":
                    emailVerifyData.type = jsonParser.getValueAsString();
                    return true;
                case "email":
                    emailVerifyData.email = jsonParser.getValueAsString();
                    return true;
                case "value":
                    emailVerifyData.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(EmailVerifyData emailVerifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "type":
                case "email":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(emailVerifyData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmailVerifyData emailVerifyData, JsonGenerator jsonGenerator) throws IOException {
            String str = emailVerifyData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = emailVerifyData.email;
            if (str2 != null) {
                jsonGenerator.writeStringField("email", str2);
            }
            String str3 = emailVerifyData.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmailVerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmailVerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmailVerifyData createData(String str) {
        EmailVerifyData emailVerifyDataNew_ = new_();
        emailVerifyDataNew_.email = str;
        emailVerifyDataNew_.type = EMAIL_VERIFY;
        String str2 = "";
        if (uqb0.f180400f0 != 0) {
            str2 = uqb0.f180400f0 + "";
        }
        emailVerifyDataNew_.value = str2;
        return emailVerifyDataNew_;
    }

    public static EmailVerifyData new_() {
        EmailVerifyData emailVerifyData = new EmailVerifyData();
        emailVerifyData.nullCheck();
        return emailVerifyData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EmailVerifyData mo225055clone() {
        EmailVerifyData emailVerifyData = new EmailVerifyData();
        emailVerifyData.type = this.type;
        emailVerifyData.email = this.email;
        emailVerifyData.value = this.value;
        return emailVerifyData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmailVerifyData)) {
            return false;
        }
        EmailVerifyData emailVerifyData = (EmailVerifyData) obj;
        return ValueObject.util_equals(this.type, emailVerifyData.type) && ValueObject.util_equals(this.email, emailVerifyData.email) && ValueObject.util_equals(this.value, emailVerifyData.value);
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
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.email == null) {
            this.email = "";
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
