package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.IdentificationInfo;
import com.p046p1.mobile.putong.data.WithdrawAccount;
import com.p046p1.mobile.putong.data.WithdrawInfo;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

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
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, wallet.isWithdrawFrozen);
            WithdrawInfo withdrawInfo = wallet.withdrawInfo;
            if (withdrawInfo != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, withdrawInfo, WithdrawInfo.PROTOBUF_ADAPTER);
            }
            List<WithdrawAccount> list = wallet.withdrawAccounts;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(3, list, WithdrawAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(4, wallet.needIdentified);
            IdentificationInfo identificationInfo = wallet.identificationInfo;
            if (identificationInfo != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(5, identificationInfo, IdentificationInfo.PROTOBUF_ADAPTER);
            }
            wallet.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Wallet parse(nb5 nb5Var) throws IOException {
            Wallet wallet = new Wallet();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (wallet.withdrawInfo != null) {
                        break;
                    }
                    wallet.withdrawInfo = WithdrawInfo.new_();
                    break;
                }
                if (iM158752u == 8) {
                    wallet.isWithdrawFrozen = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    wallet.withdrawInfo = (WithdrawInfo) nb5Var.m158743l(WithdrawInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    wallet.withdrawAccounts = (List) nb5Var.m158743l(WithdrawAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 32) {
                    wallet.needIdentified = nb5Var.m158738g();
                } else {
                    if (iM158752u != 42) {
                        if (wallet.withdrawInfo != null) {
                            break;
                        }
                        wallet.withdrawInfo = WithdrawInfo.new_();
                        return wallet;
                    }
                    wallet.identificationInfo = (IdentificationInfo) nb5Var.m158743l(IdentificationInfo.PROTOBUF_ADAPTER);
                }
            }
            return wallet;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Wallet wallet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, wallet.isWithdrawFrozen);
            WithdrawInfo withdrawInfo = wallet.withdrawInfo;
            if (withdrawInfo != null) {
                codedOutputByteBufferNano.m17254K(2, withdrawInfo, WithdrawInfo.PROTOBUF_ADAPTER);
            }
            List<WithdrawAccount> list = wallet.withdrawAccounts;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, WithdrawAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(4, wallet.needIdentified);
            IdentificationInfo identificationInfo = wallet.identificationInfo;
            if (identificationInfo != null) {
                codedOutputByteBufferNano.m17254K(5, identificationInfo, IdentificationInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Wallet> JSON_ADAPTER = new ObjectJsonAdapter<Wallet>() { // from class: com.p1.mobile.putong.core.data.Wallet.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Wallet.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Wallet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public Wallet mo223809clone() {
        Wallet wallet = new Wallet();
        wallet.isWithdrawFrozen = this.isWithdrawFrozen;
        WithdrawInfo withdrawInfo = this.withdrawInfo;
        if (withdrawInfo != null) {
            wallet.withdrawInfo = withdrawInfo.mo223809clone();
        }
        List<WithdrawAccount> list = this.withdrawAccounts;
        if (list != null) {
            wallet.withdrawAccounts = ValueObject.util_map(list, new w9j() { // from class: l.wfp0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((WithdrawAccount) obj).mo223809clone();
                }
            });
        }
        wallet.needIdentified = this.needIdentified;
        IdentificationInfo identificationInfo = this.identificationInfo;
        if (identificationInfo != null) {
            wallet.identificationInfo = identificationInfo.mo223809clone();
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
