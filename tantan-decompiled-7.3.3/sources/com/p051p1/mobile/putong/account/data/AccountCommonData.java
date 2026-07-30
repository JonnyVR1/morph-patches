package com.p051p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Captcha;
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

/* JADX INFO: loaded from: classes9.dex */
public class AccountCommonData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "accountcommondata";

    @NonNull
    @ProtobufIndex(index = 2)
    public CaptchaData captchaData;

    @ProtobufIndex(index = 1)
    public boolean success;
    public static ProtobufAdapter<AccountCommonData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountCommonData>() { // from class: com.p1.mobile.putong.account.data.AccountCommonData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AccountCommonData accountCommonData) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, accountCommonData.success);
            CaptchaData captchaData = accountCommonData.captchaData;
            if (captchaData != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, captchaData, CaptchaData.PROTOBUF_ADAPTER);
            }
            accountCommonData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AccountCommonData parse(nc5 nc5Var) throws IOException {
            AccountCommonData accountCommonData = new AccountCommonData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (accountCommonData.captchaData != null) {
                        break;
                    }
                    accountCommonData.captchaData = CaptchaData.new_();
                    break;
                }
                if (iM162497u == 8) {
                    accountCommonData.success = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (accountCommonData.captchaData != null) {
                            break;
                        }
                        accountCommonData.captchaData = CaptchaData.new_();
                        return accountCommonData;
                    }
                    accountCommonData.captchaData = (CaptchaData) nc5Var.m162488l(CaptchaData.PROTOBUF_ADAPTER);
                }
            }
            return accountCommonData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AccountCommonData accountCommonData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, accountCommonData.success);
            CaptchaData captchaData = accountCommonData.captchaData;
            if (captchaData != null) {
                codedOutputByteBufferNano.m17309K(2, captchaData, CaptchaData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AccountCommonData> JSON_ADAPTER = new ObjectJsonAdapter<AccountCommonData>() { // from class: com.p1.mobile.putong.account.data.AccountCommonData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AccountCommonData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AccountCommonData newInstance() {
            return new AccountCommonData();
        }

        public boolean parseField(AccountCommonData accountCommonData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("success")) {
                accountCommonData.success = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals(Captcha.TYPE)) {
                return false;
            }
            accountCommonData.captchaData = CaptchaData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AccountCommonData accountCommonData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("success") || str.equals(Captcha.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(accountCommonData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AccountCommonData accountCommonData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("success", accountCommonData.success);
            if (accountCommonData.captchaData != null) {
                jsonGenerator.writeFieldName(Captcha.TYPE);
                CaptchaData.JSON_ADAPTER.serialize(accountCommonData.captchaData, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountCommonData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountCommonData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountCommonData new_() {
        AccountCommonData accountCommonData = new AccountCommonData();
        accountCommonData.nullCheck();
        return accountCommonData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AccountCommonData mo225055clone() {
        AccountCommonData accountCommonData = new AccountCommonData();
        accountCommonData.success = this.success;
        CaptchaData captchaData = this.captchaData;
        if (captchaData != null) {
            accountCommonData.captchaData = captchaData.mo225055clone();
        }
        return accountCommonData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountCommonData)) {
            return false;
        }
        AccountCommonData accountCommonData = (AccountCommonData) obj;
        return this == obj && this.success == accountCommonData.success && ValueObject.util_equals(this.captchaData, accountCommonData.captchaData);
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
        int iHashCode = ((super.hashCode() * 41) + (this.success ? 1231 : 1237)) * 41;
        CaptchaData captchaData = this.captchaData;
        int iHashCode2 = iHashCode + (captchaData != null ? captchaData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.captchaData == null) {
            this.captchaData = CaptchaData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
