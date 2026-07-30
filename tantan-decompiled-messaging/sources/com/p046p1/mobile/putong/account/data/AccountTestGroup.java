package com.p046p1.mobile.putong.account.data;

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
import p149l.nb5;

/* JADX INFO: loaded from: classes9.dex */
public class AccountTestGroup extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accounttestgroup";

    @ProtobufIndex(index = 3)
    public boolean accountKitEntry;

    @ProtobufIndex(index = 4)
    public boolean chinaUnicomEntry;

    @ProtobufIndex(index = 2)
    public boolean facebookEntry;

    @ProtobufIndex(index = 5)
    public boolean googleEntry;

    @NonNull
    @ProtobufIndex(index = 1)
    public String thirdPartyValidation;
    public static ProtobufAdapter<AccountTestGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountTestGroup>() { // from class: com.p1.mobile.putong.account.data.AccountTestGroup.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AccountTestGroup accountTestGroup) {
            String str = accountTestGroup.thirdPartyValidation;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, accountTestGroup.facebookEntry) + CodedOutputByteBufferNano.m17220b(3, accountTestGroup.accountKitEntry) + CodedOutputByteBufferNano.m17220b(4, accountTestGroup.chinaUnicomEntry) + CodedOutputByteBufferNano.m17220b(5, accountTestGroup.googleEntry);
            accountTestGroup.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AccountTestGroup parse(nb5 nb5Var) throws IOException {
            AccountTestGroup accountTestGroup = new AccountTestGroup();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (accountTestGroup.thirdPartyValidation != null) {
                        break;
                    }
                    accountTestGroup.thirdPartyValidation = "";
                    break;
                }
                if (iM158752u == 10) {
                    accountTestGroup.thirdPartyValidation = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    accountTestGroup.facebookEntry = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    accountTestGroup.accountKitEntry = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    accountTestGroup.chinaUnicomEntry = nb5Var.m158738g();
                } else {
                    if (iM158752u != 40) {
                        if (accountTestGroup.thirdPartyValidation != null) {
                            break;
                        }
                        accountTestGroup.thirdPartyValidation = "";
                        return accountTestGroup;
                    }
                    accountTestGroup.googleEntry = nb5Var.m158738g();
                }
            }
            return accountTestGroup;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AccountTestGroup accountTestGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accountTestGroup.thirdPartyValidation;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, accountTestGroup.facebookEntry);
            codedOutputByteBufferNano.m17244A(3, accountTestGroup.accountKitEntry);
            codedOutputByteBufferNano.m17244A(4, accountTestGroup.chinaUnicomEntry);
            codedOutputByteBufferNano.m17244A(5, accountTestGroup.googleEntry);
        }
    };
    public static JsonAdapter<AccountTestGroup> JSON_ADAPTER = new ObjectJsonAdapter<AccountTestGroup>() { // from class: com.p1.mobile.putong.account.data.AccountTestGroup.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AccountTestGroup.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AccountTestGroup newInstance() {
            return new AccountTestGroup();
        }

        public boolean parseField(AccountTestGroup accountTestGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "google_entry":
                    accountTestGroup.googleEntry = jsonParser.getValueAsBoolean();
                    return true;
                case "third_party_validation":
                    accountTestGroup.thirdPartyValidation = jsonParser.getValueAsString();
                    return true;
                case "facebook_entry":
                    accountTestGroup.facebookEntry = jsonParser.getValueAsBoolean();
                    return true;
                case "accountKit_entry":
                    accountTestGroup.accountKitEntry = jsonParser.getValueAsBoolean();
                    return true;
                case "china_unicom_entry":
                    accountTestGroup.chinaUnicomEntry = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AccountTestGroup accountTestGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "google_entry":
                case "third_party_validation":
                case "facebook_entry":
                case "accountKit_entry":
                case "china_unicom_entry":
                    return true;
                default:
                    return super.parseFieldCheck(accountTestGroup, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AccountTestGroup accountTestGroup, JsonGenerator jsonGenerator) throws IOException {
            String str = accountTestGroup.thirdPartyValidation;
            if (str != null) {
                jsonGenerator.writeStringField("third_party_validation", str);
            }
            jsonGenerator.writeBooleanField("facebook_entry", accountTestGroup.facebookEntry);
            jsonGenerator.writeBooleanField("accountKit_entry", accountTestGroup.accountKitEntry);
            jsonGenerator.writeBooleanField("china_unicom_entry", accountTestGroup.chinaUnicomEntry);
            jsonGenerator.writeBooleanField("google_entry", accountTestGroup.googleEntry);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountTestGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountTestGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountTestGroup new_() {
        AccountTestGroup accountTestGroup = new AccountTestGroup();
        accountTestGroup.nullCheck();
        return accountTestGroup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AccountTestGroup mo223809clone() {
        AccountTestGroup accountTestGroup = new AccountTestGroup();
        accountTestGroup.thirdPartyValidation = this.thirdPartyValidation;
        accountTestGroup.facebookEntry = this.facebookEntry;
        accountTestGroup.accountKitEntry = this.accountKitEntry;
        accountTestGroup.chinaUnicomEntry = this.chinaUnicomEntry;
        accountTestGroup.googleEntry = this.googleEntry;
        return accountTestGroup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountTestGroup)) {
            return false;
        }
        AccountTestGroup accountTestGroup = (AccountTestGroup) obj;
        return ValueObject.util_equals(this.thirdPartyValidation, accountTestGroup.thirdPartyValidation) && this.facebookEntry == accountTestGroup.facebookEntry && this.accountKitEntry == accountTestGroup.accountKitEntry && this.chinaUnicomEntry == accountTestGroup.chinaUnicomEntry && this.googleEntry == accountTestGroup.googleEntry;
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
        String str = this.thirdPartyValidation;
        int iHashCode = ((((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.facebookEntry ? 1231 : 1237)) * 41) + (this.accountKitEntry ? 1231 : 1237)) * 41) + (this.chinaUnicomEntry ? 1231 : 1237)) * 41) + (this.googleEntry ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.thirdPartyValidation == null) {
            this.thirdPartyValidation = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
