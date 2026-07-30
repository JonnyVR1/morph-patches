package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.IdentificationInfo;
import com.p051p1.mobile.putong.data.WithdrawAccount;
import com.p051p1.mobile.putong.data.WithdrawInfo;
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

/* JADX INFO: loaded from: classes10.dex */
public class Wallet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wallet";

    @Nullable
    @ProtobufIndex(index = 5)
    public IdentificationInfo identificationInfo;

    @ProtobufIndex(index = 1)
    public boolean isWithdrawFrozen;

    @ProtobufIndex(index = 4)
    public boolean needIdentified;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<WithdrawAccount> withdrawAccounts;

    @NonNull
    @ProtobufIndex(index = 2)
    public WithdrawInfo withdrawInfo;
    public static ProtobufAdapter<Wallet> PROTOBUF_ADAPTER = new MessageNanoAdapter<Wallet>() { // from class: com.p1.mobile.putong.core.data.Wallet.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Wallet wallet) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, wallet.isWithdrawFrozen);
            WithdrawInfo withdrawInfo = wallet.withdrawInfo;
            if (withdrawInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, withdrawInfo, WithdrawInfo.PROTOBUF_ADAPTER);
            }
            List<WithdrawAccount> list = wallet.withdrawAccounts;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, list, WithdrawAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(4, wallet.needIdentified);
            IdentificationInfo identificationInfo = wallet.identificationInfo;
            if (identificationInfo != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(5, identificationInfo, IdentificationInfo.PROTOBUF_ADAPTER);
            }
            wallet.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Wallet parse(nc5 nc5Var) throws IOException {
            Wallet wallet = new Wallet();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (wallet.withdrawInfo != null) {
                        break;
                    }
                    wallet.withdrawInfo = WithdrawInfo.new_();
                    break;
                }
                if (iM162497u == 8) {
                    wallet.isWithdrawFrozen = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    wallet.withdrawInfo = (WithdrawInfo) nc5Var.m162488l(WithdrawInfo.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    wallet.withdrawAccounts = (List) nc5Var.m162488l(WithdrawAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 32) {
                    wallet.needIdentified = nc5Var.m162483g();
                } else {
                    if (iM162497u != 42) {
                        if (wallet.withdrawInfo != null) {
                            break;
                        }
                        wallet.withdrawInfo = WithdrawInfo.new_();
                        return wallet;
                    }
                    wallet.identificationInfo = (IdentificationInfo) nc5Var.m162488l(IdentificationInfo.PROTOBUF_ADAPTER);
                }
            }
            return wallet;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Wallet wallet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, wallet.isWithdrawFrozen);
            WithdrawInfo withdrawInfo = wallet.withdrawInfo;
            if (withdrawInfo != null) {
                codedOutputByteBufferNano.m17309K(2, withdrawInfo, WithdrawInfo.PROTOBUF_ADAPTER);
            }
            List<WithdrawAccount> list = wallet.withdrawAccounts;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, WithdrawAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(4, wallet.needIdentified);
            IdentificationInfo identificationInfo = wallet.identificationInfo;
            if (identificationInfo != null) {
                codedOutputByteBufferNano.m17309K(5, identificationInfo, IdentificationInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Wallet> JSON_ADAPTER = new ObjectJsonAdapter<Wallet>() { // from class: com.p1.mobile.putong.core.data.Wallet.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Wallet.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Wallet newInstance() {
            return new Wallet();
        }

        public boolean parseField(Wallet wallet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identificationInfo":
                    wallet.identificationInfo = IdentificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "withdrawAccounts":
                    wallet.withdrawAccounts = JsonAdapter.parseArray(jsonParser, WithdrawAccount.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isWithdrawFrozen":
                    wallet.isWithdrawFrozen = jsonParser.getValueAsBoolean();
                    return true;
                case "withdrawInfo":
                    wallet.withdrawInfo = WithdrawInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "needIdentified":
                    wallet.needIdentified = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Wallet wallet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identificationInfo":
                case "withdrawAccounts":
                case "isWithdrawFrozen":
                case "withdrawInfo":
                case "needIdentified":
                    return true;
                default:
                    return super.parseFieldCheck(wallet, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Wallet wallet, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isWithdrawFrozen", wallet.isWithdrawFrozen);
            if (wallet.withdrawInfo != null) {
                jsonGenerator.writeFieldName("withdrawInfo");
                WithdrawInfo.JSON_ADAPTER.serialize(wallet.withdrawInfo, jsonGenerator, true);
            }
            if (wallet.withdrawAccounts != null) {
                jsonGenerator.writeFieldName("withdrawAccounts");
                JsonAdapter.serializeArray(wallet.withdrawAccounts, jsonGenerator, WithdrawAccount.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("needIdentified", wallet.needIdentified);
            if (wallet.identificationInfo != null) {
                jsonGenerator.writeFieldName("identificationInfo");
                IdentificationInfo.JSON_ADAPTER.serialize(wallet.identificationInfo, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Wallet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Wallet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Wallet new_() {
        Wallet wallet = new Wallet();
        wallet.nullCheck();
        return wallet;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Wallet mo225055clone() {
        Wallet wallet = new Wallet();
        wallet.isWithdrawFrozen = this.isWithdrawFrozen;
        WithdrawInfo withdrawInfo = this.withdrawInfo;
        if (withdrawInfo != null) {
            wallet.withdrawInfo = withdrawInfo.mo225055clone();
        }
        List<WithdrawAccount> list = this.withdrawAccounts;
        if (list != null) {
            wallet.withdrawAccounts = ValueObject.util_map(list, new qcj() { // from class: l.app0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((WithdrawAccount) obj).mo225055clone();
                }
            });
        }
        wallet.needIdentified = this.needIdentified;
        IdentificationInfo identificationInfo = this.identificationInfo;
        if (identificationInfo != null) {
            wallet.identificationInfo = identificationInfo.mo225055clone();
        }
        return wallet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Wallet)) {
            return false;
        }
        Wallet wallet = (Wallet) obj;
        return this.isWithdrawFrozen == wallet.isWithdrawFrozen && ValueObject.util_equals(this.withdrawInfo, wallet.withdrawInfo) && ValueObject.util_equals(this.withdrawAccounts, wallet.withdrawAccounts) && this.needIdentified == wallet.needIdentified && ValueObject.util_equals(this.identificationInfo, wallet.identificationInfo);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "wallet";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.isWithdrawFrozen ? 1231 : 1237)) * 41;
        WithdrawInfo withdrawInfo = this.withdrawInfo;
        int iHashCode = (i2 + (withdrawInfo != null ? withdrawInfo.hashCode() : 0)) * 41;
        List<WithdrawAccount> list = this.withdrawAccounts;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + (this.needIdentified ? 1231 : 1237)) * 41;
        IdentificationInfo identificationInfo = this.identificationInfo;
        int iHashCode3 = iHashCode2 + (identificationInfo != null ? identificationInfo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.withdrawInfo == null) {
            this.withdrawInfo = WithdrawInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
