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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AccountUserInfo accountUserInfo) {
            int iB = CodedOutputByteBufferNano.b(1, accountUserInfo.registed);
            String str = accountUserInfo.name;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = accountUserInfo.pictureUrl;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            SignInGrantType signInGrantType = accountUserInfo.source;
            if (signInGrantType != null) {
                iB += CodedOutputByteBufferNano.h(4, signInGrantType.ordinal());
            }
            PhoneNumber phoneNumber = accountUserInfo.phoneNumber;
            if (phoneNumber != null) {
                iB += CodedOutputByteBufferNano.l(5, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            SignInGrantType signInGrantType2 = accountUserInfo.source;
            if (signInGrantType2 != null) {
                iB += CodedOutputByteBufferNano.l(6, signInGrantType2, SignInGrantType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) accountUserInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AccountUserInfo m17620parse(nb5 nb5Var) throws IOException {
            AccountUserInfo accountUserInfo = new AccountUserInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    accountUserInfo.registed = nb5Var.g();
                } else if (iU == 18) {
                    accountUserInfo.name = nb5Var.s();
                } else if (iU == 26) {
                    accountUserInfo.pictureUrl = nb5Var.s();
                } else if (iU == 32) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 42) {
                    accountUserInfo.phoneNumber = (PhoneNumber) nb5Var.l(PhoneNumber.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
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
                    accountUserInfo.source = (SignInGrantType) nb5Var.l(SignInGrantType.PROTOBUF_ADAPTER);
                }
            }
            return accountUserInfo;
        }

        public void serialize(AccountUserInfo accountUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, accountUserInfo.registed);
            String str = accountUserInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = accountUserInfo.pictureUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            SignInGrantType signInGrantType = accountUserInfo.source;
            if (signInGrantType != null) {
                codedOutputByteBufferNano.G(4, signInGrantType.ordinal());
            }
            PhoneNumber phoneNumber = accountUserInfo.phoneNumber;
            if (phoneNumber != null) {
                codedOutputByteBufferNano.K(5, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            SignInGrantType signInGrantType2 = accountUserInfo.source;
            if (signInGrantType2 != null) {
                codedOutputByteBufferNano.K(6, signInGrantType2, SignInGrantType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AccountUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<AccountUserInfo>() { // from class: com.p1.mobile.putong.data.AccountUserInfo.2
        public Class getDataClass() {
            return AccountUserInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AccountUserInfo mo17830newInstance() {
            return new AccountUserInfo();
        }

        public boolean parseField(AccountUserInfo accountUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pictureUrl":
                    accountUserInfo.pictureUrl = jsonParser.getValueAsString();
                    return true;
                case "phoneNumber":
                    accountUserInfo.phoneNumber = (PhoneNumber) PhoneNumber.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "source":
                    accountUserInfo.source = (SignInGrantType) SignInGrantType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AccountUserInfo accountUserInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("registed", accountUserInfo.registed);
            String str = accountUserInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountUserInfo new_() {
        AccountUserInfo accountUserInfo = new AccountUserInfo();
        accountUserInfo.nullCheck();
        return accountUserInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AccountUserInfo m17619clone() {
        AccountUserInfo accountUserInfo = new AccountUserInfo();
        accountUserInfo.registed = this.registed;
        accountUserInfo.name = this.name;
        accountUserInfo.pictureUrl = this.pictureUrl;
        accountUserInfo.source = this.source;
        PhoneNumber phoneNumber = this.phoneNumber;
        if (phoneNumber != null) {
            accountUserInfo.phoneNumber = phoneNumber.m18794clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
