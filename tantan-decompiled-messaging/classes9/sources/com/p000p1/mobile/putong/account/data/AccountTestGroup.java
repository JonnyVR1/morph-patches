package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountTestGroup extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accounttestgroup";

    @ProtobufIndex(index = CameraSticker.STATE_COMPLETE)
    public boolean accountKitEntry;

    @ProtobufIndex(index = CameraSticker.STATE_ERROR)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AccountTestGroup accountTestGroup) {
            String str = accountTestGroup.thirdPartyValidation;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, accountTestGroup.facebookEntry) + CodedOutputByteBufferNano.b(3, accountTestGroup.accountKitEntry) + CodedOutputByteBufferNano.b(4, accountTestGroup.chinaUnicomEntry) + CodedOutputByteBufferNano.b(5, accountTestGroup.googleEntry);
            ((MessageNano) accountTestGroup).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AccountTestGroup m28891parse(nb5 nb5Var) throws IOException {
            AccountTestGroup accountTestGroup = new AccountTestGroup();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (accountTestGroup.thirdPartyValidation != null) {
                        break;
                    }
                    accountTestGroup.thirdPartyValidation = "";
                    break;
                }
                if (iU == 10) {
                    accountTestGroup.thirdPartyValidation = nb5Var.s();
                } else if (iU == 16) {
                    accountTestGroup.facebookEntry = nb5Var.g();
                } else if (iU == 24) {
                    accountTestGroup.accountKitEntry = nb5Var.g();
                } else if (iU == 32) {
                    accountTestGroup.chinaUnicomEntry = nb5Var.g();
                } else {
                    if (iU != 40) {
                        if (accountTestGroup.thirdPartyValidation != null) {
                            break;
                        }
                        accountTestGroup.thirdPartyValidation = "";
                        return accountTestGroup;
                    }
                    accountTestGroup.googleEntry = nb5Var.g();
                }
            }
            return accountTestGroup;
        }

        public void serialize(AccountTestGroup accountTestGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accountTestGroup.thirdPartyValidation;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, accountTestGroup.facebookEntry);
            codedOutputByteBufferNano.A(3, accountTestGroup.accountKitEntry);
            codedOutputByteBufferNano.A(4, accountTestGroup.chinaUnicomEntry);
            codedOutputByteBufferNano.A(5, accountTestGroup.googleEntry);
        }
    };
    public static JsonAdapter<AccountTestGroup> JSON_ADAPTER = new ObjectJsonAdapter<AccountTestGroup>() { // from class: com.p1.mobile.putong.account.data.AccountTestGroup.2
        public Class getDataClass() {
            return AccountTestGroup.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AccountTestGroup m28892newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountTestGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountTestGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountTestGroup new_() {
        AccountTestGroup accountTestGroup = new AccountTestGroup();
        accountTestGroup.nullCheck();
        return accountTestGroup;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AccountTestGroup m28890clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.thirdPartyValidation;
        int iHashCode = ((((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.facebookEntry ? 1231 : 1237)) * 41) + (this.accountKitEntry ? 1231 : 1237)) * 41) + (this.chinaUnicomEntry ? 1231 : 1237)) * 41) + (this.googleEntry ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.thirdPartyValidation == null) {
            this.thirdPartyValidation = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
