package com.p051p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.account.data.AccountAssetsSettings;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes9.dex */
public class AccountAssetsSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accountassetssettings";

    @ProtobufIndex(index = 3)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AccountAssetsSettings accountAssetsSettings) {
            String str = accountAssetsSettings.placeholder;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = accountAssetsSettings.intlOnlyPasswordCountryWhiteList;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, accountAssetsSettings.getNumberSwitch);
            accountAssetsSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AccountAssetsSettings parse(nc5 nc5Var) throws IOException {
            AccountAssetsSettings accountAssetsSettings = new AccountAssetsSettings();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (accountAssetsSettings.placeholder == null) {
                        accountAssetsSettings.placeholder = "";
                    }
                    if (accountAssetsSettings.intlOnlyPasswordCountryWhiteList != null) {
                        break;
                    }
                    accountAssetsSettings.intlOnlyPasswordCountryWhiteList = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    accountAssetsSettings.placeholder = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    accountAssetsSettings.intlOnlyPasswordCountryWhiteList = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 24) {
                        if (accountAssetsSettings.placeholder == null) {
                            accountAssetsSettings.placeholder = "";
                        }
                        if (accountAssetsSettings.intlOnlyPasswordCountryWhiteList != null) {
                            break;
                        }
                        accountAssetsSettings.intlOnlyPasswordCountryWhiteList = new ArrayList();
                        return accountAssetsSettings;
                    }
                    accountAssetsSettings.getNumberSwitch = nc5Var.m162483g();
                }
            }
            return accountAssetsSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AccountAssetsSettings accountAssetsSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accountAssetsSettings.placeholder;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = accountAssetsSettings.intlOnlyPasswordCountryWhiteList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(3, accountAssetsSettings.getNumberSwitch);
        }
    };
    public static JsonAdapter<AccountAssetsSettings> JSON_ADAPTER = new ObjectJsonAdapter<AccountAssetsSettings>() { // from class: com.p1.mobile.putong.account.data.AccountAssetsSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AccountAssetsSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AccountAssetsSettings newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m29376a(String str) {
        return str;
    }

    public static AccountAssetsSettings new_() {
        AccountAssetsSettings accountAssetsSettings = new AccountAssetsSettings();
        accountAssetsSettings.nullCheck();
        return accountAssetsSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AccountAssetsSettings mo225055clone() {
        AccountAssetsSettings accountAssetsSettings = new AccountAssetsSettings();
        accountAssetsSettings.placeholder = this.placeholder;
        List<String> list = this.intlOnlyPasswordCountryWhiteList;
        if (list != null) {
            accountAssetsSettings.intlOnlyPasswordCountryWhiteList = ValueObject.util_map(list, new qcj() { // from class: l.uf
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return AccountAssetsSettings.m29376a((String) obj);
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
        String str = this.placeholder;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.intlOnlyPasswordCountryWhiteList;
        int iHashCode2 = ((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + (this.getNumberSwitch ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.placeholder == null) {
            this.placeholder = "";
        }
        if (this.intlOnlyPasswordCountryWhiteList == null) {
            this.intlOnlyPasswordCountryWhiteList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
