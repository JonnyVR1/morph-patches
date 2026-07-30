package com.p051p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.SignInGrantType;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes9.dex */
public class AccountTestFactor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accounttestfactor";

    @NonNull
    @ProtobufIndex(index = 3)
    public String birthdate;

    @NonNull
    @ProtobufIndex(index = 10)
    public String channel;

    @NonNull
    @ProtobufIndex(index = 5)
    public String countryCode;

    @NonNull
    @ProtobufIndex(index = 2)
    public Gender gender;

    @NonNull
    @ProtobufIndex(index = 6)
    public String mobileNumber;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String password;

    @NonNull
    @ProtobufIndex(index = 9)
    public String step;

    @NonNull
    @ProtobufIndex(index = 7)
    public String thirdpartyId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String thirdpartyType;
    public static ProtobufAdapter<AccountTestFactor> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountTestFactor>() { // from class: com.p1.mobile.putong.account.data.AccountTestFactor.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AccountTestFactor accountTestFactor) {
            String str = accountTestFactor.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Gender gender = accountTestFactor.gender;
            if (gender != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, gender.ordinal());
            }
            String str2 = accountTestFactor.birthdate;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = accountTestFactor.password;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = accountTestFactor.countryCode;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = accountTestFactor.mobileNumber;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            String str6 = accountTestFactor.thirdpartyId;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            String str7 = accountTestFactor.thirdpartyType;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str7);
            }
            String str8 = accountTestFactor.step;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str8);
            }
            String str9 = accountTestFactor.channel;
            if (str9 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str9);
            }
            Gender gender2 = accountTestFactor.gender;
            if (gender2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(11, gender2, Gender.PROTOBUF_ADAPTER);
            }
            accountTestFactor.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AccountTestFactor parse(nc5 nc5Var) throws IOException {
            AccountTestFactor accountTestFactor = new AccountTestFactor();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (accountTestFactor.gender == null && numValueOf != null) {
                            accountTestFactor.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (accountTestFactor.name == null) {
                            accountTestFactor.name = "";
                        }
                        if (accountTestFactor.gender == null) {
                            accountTestFactor.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (accountTestFactor.birthdate == null) {
                            accountTestFactor.birthdate = "";
                        }
                        if (accountTestFactor.password == null) {
                            accountTestFactor.password = "";
                        }
                        if (accountTestFactor.countryCode == null) {
                            accountTestFactor.countryCode = "";
                        }
                        if (accountTestFactor.mobileNumber == null) {
                            accountTestFactor.mobileNumber = "";
                        }
                        if (accountTestFactor.thirdpartyId == null) {
                            accountTestFactor.thirdpartyId = "";
                        }
                        if (accountTestFactor.thirdpartyType == null) {
                            accountTestFactor.thirdpartyType = "";
                        }
                        if (accountTestFactor.step == null) {
                            accountTestFactor.step = "";
                        }
                        if (accountTestFactor.channel == null) {
                            accountTestFactor.channel = "";
                        }
                        break;
                    case 10:
                        accountTestFactor.name = nc5Var.m162495s();
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 26:
                        accountTestFactor.birthdate = nc5Var.m162495s();
                        continue;
                    case 34:
                        accountTestFactor.password = nc5Var.m162495s();
                        continue;
                    case 42:
                        accountTestFactor.countryCode = nc5Var.m162495s();
                        continue;
                    case 50:
                        accountTestFactor.mobileNumber = nc5Var.m162495s();
                        continue;
                    case 58:
                        accountTestFactor.thirdpartyId = nc5Var.m162495s();
                        continue;
                    case 66:
                        accountTestFactor.thirdpartyType = nc5Var.m162495s();
                        continue;
                    case 74:
                        accountTestFactor.step = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        accountTestFactor.channel = nc5Var.m162495s();
                        continue;
                    case 90:
                        accountTestFactor.gender = (Gender) nc5Var.m162488l(Gender.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (accountTestFactor.gender == null && numValueOf != null) {
                            accountTestFactor.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (accountTestFactor.name == null) {
                            accountTestFactor.name = "";
                        }
                        if (accountTestFactor.gender == null) {
                            accountTestFactor.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (accountTestFactor.birthdate == null) {
                            accountTestFactor.birthdate = "";
                        }
                        if (accountTestFactor.password == null) {
                            accountTestFactor.password = "";
                        }
                        if (accountTestFactor.countryCode == null) {
                            accountTestFactor.countryCode = "";
                        }
                        if (accountTestFactor.mobileNumber == null) {
                            accountTestFactor.mobileNumber = "";
                        }
                        if (accountTestFactor.thirdpartyId == null) {
                            accountTestFactor.thirdpartyId = "";
                        }
                        if (accountTestFactor.thirdpartyType == null) {
                            accountTestFactor.thirdpartyType = "";
                        }
                        if (accountTestFactor.step == null) {
                            accountTestFactor.step = "";
                        }
                        if (accountTestFactor.channel == null) {
                            accountTestFactor.channel = "";
                            return accountTestFactor;
                        }
                        break;
                }
            }
            return accountTestFactor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AccountTestFactor accountTestFactor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accountTestFactor.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Gender gender = accountTestFactor.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17305G(2, gender.ordinal());
            }
            String str2 = accountTestFactor.birthdate;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = accountTestFactor.password;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = accountTestFactor.countryCode;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = accountTestFactor.mobileNumber;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            String str6 = accountTestFactor.thirdpartyId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
            String str7 = accountTestFactor.thirdpartyType;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(8, str7);
            }
            String str8 = accountTestFactor.step;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(9, str8);
            }
            String str9 = accountTestFactor.channel;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(10, str9);
            }
            Gender gender2 = accountTestFactor.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.m17309K(11, gender2, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AccountTestFactor> JSON_ADAPTER = new ObjectJsonAdapter<AccountTestFactor>() { // from class: com.p1.mobile.putong.account.data.AccountTestFactor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AccountTestFactor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AccountTestFactor newInstance() {
            return new AccountTestFactor();
        }

        public boolean parseField(AccountTestFactor accountTestFactor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    accountTestFactor.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "birthdate":
                    accountTestFactor.birthdate = jsonParser.getValueAsString();
                    return true;
                case "name":
                    accountTestFactor.name = jsonParser.getValueAsString();
                    return true;
                case "step":
                    accountTestFactor.step = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_type":
                    accountTestFactor.thirdpartyType = jsonParser.getValueAsString();
                    return true;
                case "mobile_number":
                    accountTestFactor.mobileNumber = jsonParser.getValueAsString();
                    return true;
                case "channel":
                    accountTestFactor.channel = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_id":
                    accountTestFactor.thirdpartyId = jsonParser.getValueAsString();
                    return true;
                case "password":
                    accountTestFactor.password = jsonParser.getValueAsString();
                    return true;
                case "country_code":
                    accountTestFactor.countryCode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AccountTestFactor accountTestFactor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gender":
                case "birthdate":
                case "name":
                case "step":
                case "thirdparty_type":
                case "mobile_number":
                case "channel":
                case "thirdparty_id":
                case "password":
                case "country_code":
                    return true;
                default:
                    return super.parseFieldCheck(accountTestFactor, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AccountTestFactor accountTestFactor, JsonGenerator jsonGenerator) throws IOException {
            String str = accountTestFactor.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (accountTestFactor.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(accountTestFactor.gender, jsonGenerator, true);
            }
            String str2 = accountTestFactor.birthdate;
            if (str2 != null) {
                jsonGenerator.writeStringField("birthdate", str2);
            }
            String str3 = accountTestFactor.password;
            if (str3 != null) {
                jsonGenerator.writeStringField(SignInGrantType.password, str3);
            }
            String str4 = accountTestFactor.countryCode;
            if (str4 != null) {
                jsonGenerator.writeStringField("country_code", str4);
            }
            String str5 = accountTestFactor.mobileNumber;
            if (str5 != null) {
                jsonGenerator.writeStringField("mobile_number", str5);
            }
            String str6 = accountTestFactor.thirdpartyId;
            if (str6 != null) {
                jsonGenerator.writeStringField("thirdparty_id", str6);
            }
            String str7 = accountTestFactor.thirdpartyType;
            if (str7 != null) {
                jsonGenerator.writeStringField("thirdparty_type", str7);
            }
            String str8 = accountTestFactor.step;
            if (str8 != null) {
                jsonGenerator.writeStringField("step", str8);
            }
            String str9 = accountTestFactor.channel;
            if (str9 != null) {
                jsonGenerator.writeStringField("channel", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountTestFactor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountTestFactor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountTestFactor new_() {
        AccountTestFactor accountTestFactor = new AccountTestFactor();
        accountTestFactor.nullCheck();
        return accountTestFactor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AccountTestFactor mo225055clone() {
        AccountTestFactor accountTestFactor = new AccountTestFactor();
        accountTestFactor.name = this.name;
        accountTestFactor.gender = this.gender;
        accountTestFactor.birthdate = this.birthdate;
        accountTestFactor.password = this.password;
        accountTestFactor.countryCode = this.countryCode;
        accountTestFactor.mobileNumber = this.mobileNumber;
        accountTestFactor.thirdpartyId = this.thirdpartyId;
        accountTestFactor.thirdpartyType = this.thirdpartyType;
        accountTestFactor.step = this.step;
        accountTestFactor.channel = this.channel;
        return accountTestFactor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountTestFactor)) {
            return false;
        }
        AccountTestFactor accountTestFactor = (AccountTestFactor) obj;
        return ValueObject.util_equals(this.name, accountTestFactor.name) && ValueObject.util_equals(this.gender, accountTestFactor.gender) && ValueObject.util_equals(this.birthdate, accountTestFactor.birthdate) && ValueObject.util_equals(this.password, accountTestFactor.password) && ValueObject.util_equals(this.countryCode, accountTestFactor.countryCode) && ValueObject.util_equals(this.mobileNumber, accountTestFactor.mobileNumber) && ValueObject.util_equals(this.thirdpartyId, accountTestFactor.thirdpartyId) && ValueObject.util_equals(this.thirdpartyType, accountTestFactor.thirdpartyType) && ValueObject.util_equals(this.step, accountTestFactor.step) && ValueObject.util_equals(this.channel, accountTestFactor.channel);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode2 = (iHashCode + (gender != null ? gender.hashCode() : 0)) * 41;
        String str2 = this.birthdate;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.password;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.countryCode;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.mobileNumber;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.thirdpartyId;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.thirdpartyType;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.step;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.channel;
        int iHashCode10 = iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.gender == null) {
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
        if (this.birthdate == null) {
            this.birthdate = "";
        }
        if (this.password == null) {
            this.password = "";
        }
        if (this.countryCode == null) {
            this.countryCode = "";
        }
        if (this.mobileNumber == null) {
            this.mobileNumber = "";
        }
        if (this.thirdpartyId == null) {
            this.thirdpartyId = "";
        }
        if (this.thirdpartyType == null) {
            this.thirdpartyType = "";
        }
        if (this.step == null) {
            this.step = "";
        }
        if (this.channel == null) {
            this.channel = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
