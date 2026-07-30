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
public class AccountCommonData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "accountcommondata";

    @NonNull
    @ProtobufIndex(index = 2)
    public CaptchaData captchaData;

    @ProtobufIndex(index = 1)
    public boolean success;
    public static ProtobufAdapter<AccountCommonData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountCommonData>() { // from class: com.p1.mobile.putong.account.data.AccountCommonData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AccountCommonData accountCommonData) {
            int iB = CodedOutputByteBufferNano.b(1, accountCommonData.success);
            CaptchaData captchaData = accountCommonData.captchaData;
            if (captchaData != null) {
                iB += CodedOutputByteBufferNano.l(2, captchaData, CaptchaData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) accountCommonData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AccountCommonData m28883parse(nb5 nb5Var) throws IOException {
            AccountCommonData accountCommonData = new AccountCommonData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (accountCommonData.captchaData != null) {
                        break;
                    }
                    accountCommonData.captchaData = CaptchaData.new_();
                    break;
                }
                if (iU == 8) {
                    accountCommonData.success = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (accountCommonData.captchaData != null) {
                            break;
                        }
                        accountCommonData.captchaData = CaptchaData.new_();
                        return accountCommonData;
                    }
                    accountCommonData.captchaData = (CaptchaData) nb5Var.l(CaptchaData.PROTOBUF_ADAPTER);
                }
            }
            return accountCommonData;
        }

        public void serialize(AccountCommonData accountCommonData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, accountCommonData.success);
            CaptchaData captchaData = accountCommonData.captchaData;
            if (captchaData != null) {
                codedOutputByteBufferNano.K(2, captchaData, CaptchaData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AccountCommonData> JSON_ADAPTER = new ObjectJsonAdapter<AccountCommonData>() { // from class: com.p1.mobile.putong.account.data.AccountCommonData.2
        public Class getDataClass() {
            return AccountCommonData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AccountCommonData m28884newInstance() {
            return new AccountCommonData();
        }

        public boolean parseField(AccountCommonData accountCommonData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("success")) {
                accountCommonData.success = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("captcha")) {
                return false;
            }
            accountCommonData.captchaData = (CaptchaData) CaptchaData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AccountCommonData accountCommonData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("success") || str.equals("captcha")) {
                return true;
            }
            return super.parseFieldCheck(accountCommonData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AccountCommonData accountCommonData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("success", accountCommonData.success);
            if (accountCommonData.captchaData != null) {
                jsonGenerator.writeFieldName("captcha");
                CaptchaData.JSON_ADAPTER.serialize(accountCommonData.captchaData, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountCommonData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountCommonData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountCommonData new_() {
        AccountCommonData accountCommonData = new AccountCommonData();
        accountCommonData.nullCheck();
        return accountCommonData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AccountCommonData m28882clone() {
        AccountCommonData accountCommonData = new AccountCommonData();
        accountCommonData.success = this.success;
        CaptchaData captchaData = this.captchaData;
        if (captchaData != null) {
            accountCommonData.captchaData = captchaData.m28914clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + (this.success ? 1231 : 1237)) * 41;
        CaptchaData captchaData = this.captchaData;
        int iHashCode2 = iHashCode + (captchaData != null ? captchaData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.captchaData == null) {
            this.captchaData = CaptchaData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
