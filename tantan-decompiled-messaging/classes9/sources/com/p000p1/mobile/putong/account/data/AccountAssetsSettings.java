package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.account.data.AccountAssetsSettings;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountAssetsSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accountassetssettings";

    @ProtobufIndex(index = CameraSticker.STATE_COMPLETE)
    public boolean getNumberSwitch;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> intlOnlyPasswordCountryWhiteList;

    @NonNull
    @ProtobufIndex(index = 1)
    @Deprecated
    public String placeholder;
    public static ProtobufAdapter<AccountAssetsSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountAssetsSettings>() { // from class: com.p1.mobile.putong.account.data.AccountAssetsSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AccountAssetsSettings accountAssetsSettings) {
            String str = accountAssetsSettings.placeholder;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = accountAssetsSettings.intlOnlyPasswordCountryWhiteList;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, accountAssetsSettings.getNumberSwitch);
            ((MessageNano) accountAssetsSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AccountAssetsSettings m28871parse(nb5 nb5Var) throws IOException {
            AccountAssetsSettings accountAssetsSettings = new AccountAssetsSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (accountAssetsSettings.placeholder == null) {
                        accountAssetsSettings.placeholder = "";
                    }
                    if (accountAssetsSettings.intlOnlyPasswordCountryWhiteList != null) {
                        break;
                    }
                    accountAssetsSettings.intlOnlyPasswordCountryWhiteList = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    accountAssetsSettings.placeholder = nb5Var.s();
                } else if (iU == 18) {
                    accountAssetsSettings.intlOnlyPasswordCountryWhiteList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 24) {
                        if (accountAssetsSettings.placeholder == null) {
                            accountAssetsSettings.placeholder = "";
                        }
                        if (accountAssetsSettings.intlOnlyPasswordCountryWhiteList != null) {
                            break;
                        }
                        accountAssetsSettings.intlOnlyPasswordCountryWhiteList = new ArrayList();
                        return accountAssetsSettings;
                    }
                    accountAssetsSettings.getNumberSwitch = nb5Var.g();
                }
            }
            return accountAssetsSettings;
        }

        public void serialize(AccountAssetsSettings accountAssetsSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accountAssetsSettings.placeholder;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = accountAssetsSettings.intlOnlyPasswordCountryWhiteList;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(3, accountAssetsSettings.getNumberSwitch);
        }
    };
    public static JsonAdapter<AccountAssetsSettings> JSON_ADAPTER = new ObjectJsonAdapter<AccountAssetsSettings>() { // from class: com.p1.mobile.putong.account.data.AccountAssetsSettings.2
        public Class getDataClass() {
            return AccountAssetsSettings.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AccountAssetsSettings m28872newInstance() {
            return new AccountAssetsSettings();
        }

        public boolean parseField(AccountAssetsSettings accountAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "getNumberSwitch":
                    accountAssetsSettings.getNumberSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "intlOnlyPasswordCountryWhiteList":
                    accountAssetsSettings.intlOnlyPasswordCountryWhiteList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "placeholder":
                    accountAssetsSettings.placeholder = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AccountAssetsSettings accountAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "getNumberSwitch":
                case "intlOnlyPasswordCountryWhiteList":
                case "placeholder":
                    return true;
                default:
                    return super.parseFieldCheck(accountAssetsSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AccountAssetsSettings accountAssetsSettings, JsonGenerator jsonGenerator) throws IOException {
            String str = accountAssetsSettings.placeholder;
            if (str != null) {
                jsonGenerator.writeStringField("placeholder", str);
            }
            if (accountAssetsSettings.intlOnlyPasswordCountryWhiteList != null) {
                jsonGenerator.writeFieldName("intlOnlyPasswordCountryWhiteList");
                JsonAdapter.serializeArray(accountAssetsSettings.intlOnlyPasswordCountryWhiteList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("getNumberSwitch", accountAssetsSettings.getNumberSwitch);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m272a(String str) {
        return str;
    }

    public static AccountAssetsSettings new_() {
        AccountAssetsSettings accountAssetsSettings = new AccountAssetsSettings();
        accountAssetsSettings.nullCheck();
        return accountAssetsSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AccountAssetsSettings m28870clone() {
        AccountAssetsSettings accountAssetsSettings = new AccountAssetsSettings();
        accountAssetsSettings.placeholder = this.placeholder;
        List<String> list = this.intlOnlyPasswordCountryWhiteList;
        if (list != null) {
            accountAssetsSettings.intlOnlyPasswordCountryWhiteList = ValueObject.util_map(list, new w9j() { // from class: l.zf
                public final Object call(Object obj) {
                    return AccountAssetsSettings.m272a((String) obj);
                }
            });
        }
        accountAssetsSettings.getNumberSwitch = this.getNumberSwitch;
        return accountAssetsSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountAssetsSettings)) {
            return false;
        }
        AccountAssetsSettings accountAssetsSettings = (AccountAssetsSettings) obj;
        return ValueObject.util_equals(this.placeholder, accountAssetsSettings.placeholder) && ValueObject.util_equals(this.intlOnlyPasswordCountryWhiteList, accountAssetsSettings.intlOnlyPasswordCountryWhiteList) && this.getNumberSwitch == accountAssetsSettings.getNumberSwitch;
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
        String str = this.placeholder;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.intlOnlyPasswordCountryWhiteList;
        int iHashCode2 = ((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + (this.getNumberSwitch ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.placeholder == null) {
            this.placeholder = "";
        }
        if (this.intlOnlyPasswordCountryWhiteList == null) {
            this.intlOnlyPasswordCountryWhiteList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
