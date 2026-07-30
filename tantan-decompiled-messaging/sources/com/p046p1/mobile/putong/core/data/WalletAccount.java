package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class WalletAccount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "walletaccount";

    @NonNull
    @ProtobufIndex(index = 2)
    public String balance;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20532id;
    public static ProtobufAdapter<WalletAccount> PROTOBUF_ADAPTER = new MessageNanoAdapter<WalletAccount>() { // from class: com.p1.mobile.putong.core.data.WalletAccount.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WalletAccount walletAccount) {
            String str = walletAccount.f20532id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = walletAccount.balance;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            walletAccount.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WalletAccount parse(nb5 nb5Var) throws IOException {
            WalletAccount walletAccount = new WalletAccount();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (walletAccount.f20532id == null) {
                        walletAccount.f20532id = "";
                    }
                    if (walletAccount.balance != null) {
                        break;
                    }
                    walletAccount.balance = "";
                    break;
                }
                if (iM158752u == 10) {
                    walletAccount.f20532id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (walletAccount.f20532id == null) {
                            walletAccount.f20532id = "";
                        }
                        if (walletAccount.balance != null) {
                            break;
                        }
                        walletAccount.balance = "";
                        return walletAccount;
                    }
                    walletAccount.balance = nb5Var.m158750s();
                }
            }
            return walletAccount;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WalletAccount walletAccount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = walletAccount.f20532id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = walletAccount.balance;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<WalletAccount> JSON_ADAPTER = new ObjectJsonAdapter<WalletAccount>() { // from class: com.p1.mobile.putong.core.data.WalletAccount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WalletAccount.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WalletAccount newInstance() {
            return new WalletAccount();
        }

        public boolean parseField(WalletAccount walletAccount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Balance.TYPE)) {
                walletAccount.balance = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            walletAccount.f20532id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(WalletAccount walletAccount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Balance.TYPE)) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(walletAccount, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WalletAccount walletAccount, JsonGenerator jsonGenerator) throws IOException {
            String str = walletAccount.f20532id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = walletAccount.balance;
            if (str2 != null) {
                jsonGenerator.writeStringField(Balance.TYPE, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WalletAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WalletAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WalletAccount new_() {
        WalletAccount walletAccount = new WalletAccount();
        walletAccount.nullCheck();
        return walletAccount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WalletAccount mo223809clone() {
        WalletAccount walletAccount = new WalletAccount();
        walletAccount.f20532id = this.f20532id;
        walletAccount.balance = this.balance;
        return walletAccount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WalletAccount)) {
            return false;
        }
        WalletAccount walletAccount = (WalletAccount) obj;
        return ValueObject.util_equals(this.f20532id, walletAccount.f20532id) && ValueObject.util_equals(this.balance, walletAccount.balance);
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
        String str = this.f20532id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.balance;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20532id == null) {
            this.f20532id = "";
        }
        if (this.balance == null) {
            this.balance = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
