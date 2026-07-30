package com.p000p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class WalletAccount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "walletaccount";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String balance;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f194id;
    public static ProtobufAdapter<WalletAccount> PROTOBUF_ADAPTER = new MessageNanoAdapter<WalletAccount>() { // from class: com.p1.mobile.putong.core.data.WalletAccount.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WalletAccount walletAccount) {
            String str = walletAccount.f194id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = walletAccount.balance;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) walletAccount).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WalletAccount m16297parse(nb5 nb5Var) throws IOException {
            WalletAccount walletAccount = new WalletAccount();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (walletAccount.f194id == null) {
                        walletAccount.f194id = "";
                    }
                    if (walletAccount.balance != null) {
                        break;
                    }
                    walletAccount.balance = "";
                    break;
                }
                if (iU == 10) {
                    walletAccount.f194id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (walletAccount.f194id == null) {
                            walletAccount.f194id = "";
                        }
                        if (walletAccount.balance != null) {
                            break;
                        }
                        walletAccount.balance = "";
                        return walletAccount;
                    }
                    walletAccount.balance = nb5Var.s();
                }
            }
            return walletAccount;
        }

        public void serialize(WalletAccount walletAccount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = walletAccount.f194id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = walletAccount.balance;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<WalletAccount> JSON_ADAPTER = new ObjectJsonAdapter<WalletAccount>() { // from class: com.p1.mobile.putong.core.data.WalletAccount.2
        public Class getDataClass() {
            return WalletAccount.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WalletAccount m16298newInstance() {
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
            walletAccount.f194id = jsonParser.getValueAsString();
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

        public void serializeFields(WalletAccount walletAccount, JsonGenerator jsonGenerator) throws IOException {
            String str = walletAccount.f194id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = walletAccount.balance;
            if (str2 != null) {
                jsonGenerator.writeStringField(Balance.TYPE, str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WalletAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WalletAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WalletAccount new_() {
        WalletAccount walletAccount = new WalletAccount();
        walletAccount.nullCheck();
        return walletAccount;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WalletAccount m16296clone() {
        WalletAccount walletAccount = new WalletAccount();
        walletAccount.f194id = this.f194id;
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
        return ValueObject.util_equals(this.f194id, walletAccount.f194id) && ValueObject.util_equals(this.balance, walletAccount.balance);
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
        String str = this.f194id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.balance;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f194id == null) {
            this.f194id = "";
        }
        if (this.balance == null) {
            this.balance = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
