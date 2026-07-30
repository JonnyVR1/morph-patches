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
public class AccountUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accountuserinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public PhoneNumber phoneNumber;

    @NonNull
    @ProtobufIndex(index = 3)
    public String pictureUrl;

    @ProtobufIndex(index = 1)
    public boolean registed;

    @NonNull
    @ProtobufIndex(index = 4)
    public SignInGrantType source;
    public static ProtobufAdapter<AccountUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountUserInfo>() { // from class: com.p1.mobile.putong.data.AccountUserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AccountUserInfo accountUserInfo) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, accountUserInfo.registed);
            String str = accountUserInfo.name;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = accountUserInfo.pictureUrl;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            SignInGrantType signInGrantType = accountUserInfo.source;
            if (signInGrantType != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(4, signInGrantType.ordinal());
            }
            PhoneNumber phoneNumber = accountUserInfo.phoneNumber;
            if (phoneNumber != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            SignInGrantType signInGrantType2 = accountUserInfo.source;
            if (signInGrantType2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(6, signInGrantType2, SignInGrantType.PROTOBUF_ADAPTER);
            }
            accountUserInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AccountUserInfo parse(nc5 nc5Var) throws IOException {
            AccountUserInfo accountUserInfo = new AccountUserInfo();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (accountUserInfo.source == null && numValueOf != null) {
                        accountUserInfo.source = (SignInGrantType) SignInGrantType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (accountUserInfo.name == null) {
                        accountUserInfo.name = "";
                    }
                    if (accountUserInfo.pictureUrl == null) {
                        accountUserInfo.pictureUrl = "";
                    }
                    if (accountUserInfo.source == null) {
                        accountUserInfo.source = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
                    }
                    if (accountUserInfo.phoneNumber != null) {
                        break;
                    }
                    accountUserInfo.phoneNumber = PhoneNumber.new_();
                    break;
                }
                if (iM162497u == 8) {
                    accountUserInfo.registed = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    accountUserInfo.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    accountUserInfo.pictureUrl = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 42) {
                    accountUserInfo.phoneNumber = (PhoneNumber) nc5Var.m162488l(PhoneNumber.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 50) {
                        if (accountUserInfo.source == null && numValueOf != null) {
                            accountUserInfo.source = (SignInGrantType) SignInGrantType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (accountUserInfo.name == null) {
                            accountUserInfo.name = "";
                        }
                        if (accountUserInfo.pictureUrl == null) {
                            accountUserInfo.pictureUrl = "";
                        }
                        if (accountUserInfo.source == null) {
                            accountUserInfo.source = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
                        }
                        if (accountUserInfo.phoneNumber != null) {
                            break;
                        }
                        accountUserInfo.phoneNumber = PhoneNumber.new_();
                        return accountUserInfo;
                    }
                    accountUserInfo.source = (SignInGrantType) nc5Var.m162488l(SignInGrantType.PROTOBUF_ADAPTER);
                }
            }
            return accountUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AccountUserInfo accountUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, accountUserInfo.registed);
            String str = accountUserInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = accountUserInfo.pictureUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            SignInGrantType signInGrantType = accountUserInfo.source;
            if (signInGrantType != null) {
                codedOutputByteBufferNano.m17305G(4, signInGrantType.ordinal());
            }
            PhoneNumber phoneNumber = accountUserInfo.phoneNumber;
            if (phoneNumber != null) {
                codedOutputByteBufferNano.m17309K(5, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            SignInGrantType signInGrantType2 = accountUserInfo.source;
            if (signInGrantType2 != null) {
                codedOutputByteBufferNano.m17309K(6, signInGrantType2, SignInGrantType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AccountUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<AccountUserInfo>() { // from class: com.p1.mobile.putong.data.AccountUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AccountUserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AccountUserInfo newInstance() {
            return new AccountUserInfo();
        }

        public boolean parseField(AccountUserInfo accountUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pictureUrl":
                    accountUserInfo.pictureUrl = jsonParser.getValueAsString();
                    return true;
                case "phoneNumber":
                    accountUserInfo.phoneNumber = PhoneNumber.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "source":
                    accountUserInfo.source = SignInGrantType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "registed":
                    accountUserInfo.registed = jsonParser.getValueAsBoolean();
                    return true;
                case "name":
                    accountUserInfo.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AccountUserInfo accountUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "pictureUrl":
                case "phoneNumber":
                case "source":
                case "registed":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(accountUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AccountUserInfo accountUserInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("registed", accountUserInfo.registed);
            String str = accountUserInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = accountUserInfo.pictureUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("pictureUrl", str2);
            }
            if (accountUserInfo.source != null) {
                jsonGenerator.writeFieldName("source");
                SignInGrantType.JSON_ADAPTER.serialize(accountUserInfo.source, jsonGenerator, true);
            }
            if (accountUserInfo.phoneNumber != null) {
                jsonGenerator.writeFieldName("phoneNumber");
                PhoneNumber.JSON_ADAPTER.serialize(accountUserInfo.phoneNumber, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountUserInfo new_() {
        AccountUserInfo accountUserInfo = new AccountUserInfo();
        accountUserInfo.nullCheck();
        return accountUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AccountUserInfo mo225055clone() {
        AccountUserInfo accountUserInfo = new AccountUserInfo();
        accountUserInfo.registed = this.registed;
        accountUserInfo.name = this.name;
        accountUserInfo.pictureUrl = this.pictureUrl;
        accountUserInfo.source = this.source;
        PhoneNumber phoneNumber = this.phoneNumber;
        if (phoneNumber != null) {
            accountUserInfo.phoneNumber = phoneNumber.mo225055clone();
        }
        return accountUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountUserInfo)) {
            return false;
        }
        AccountUserInfo accountUserInfo = (AccountUserInfo) obj;
        return this.registed == accountUserInfo.registed && ValueObject.util_equals(this.name, accountUserInfo.name) && ValueObject.util_equals(this.pictureUrl, accountUserInfo.pictureUrl) && ValueObject.util_equals(this.source, accountUserInfo.source) && ValueObject.util_equals(this.phoneNumber, accountUserInfo.phoneNumber);
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
        int i2 = ((i * 41) + (this.registed ? 1231 : 1237)) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.pictureUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        SignInGrantType signInGrantType = this.source;
        int iHashCode3 = (iHashCode2 + (signInGrantType != null ? signInGrantType.hashCode() : 0)) * 41;
        PhoneNumber phoneNumber = this.phoneNumber;
        int iHashCode4 = iHashCode3 + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.pictureUrl == null) {
            this.pictureUrl = "";
        }
        if (this.source == null) {
            this.source = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
        }
        if (this.phoneNumber == null) {
            this.phoneNumber = PhoneNumber.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
