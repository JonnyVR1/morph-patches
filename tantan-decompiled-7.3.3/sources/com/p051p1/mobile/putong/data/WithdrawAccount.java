package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes12.dex */
public class WithdrawAccount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "withdrawaccount";

    @NonNull
    @ProtobufIndex(index = 3)
    public String authInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public PayMethod platform;
    public static ProtobufAdapter<WithdrawAccount> PROTOBUF_ADAPTER = new MessageNanoAdapter<WithdrawAccount>() { // from class: com.p1.mobile.putong.data.WithdrawAccount.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WithdrawAccount withdrawAccount) {
            PayMethod payMethod = withdrawAccount.platform;
            int iM17281h = payMethod != null ? CodedOutputByteBufferNano.m17281h(1, payMethod.ordinal()) : 0;
            String str = withdrawAccount.name;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = withdrawAccount.authInfo;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            PayMethod payMethod2 = withdrawAccount.platform;
            if (payMethod2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, payMethod2, PayMethod.PROTOBUF_ADAPTER);
            }
            withdrawAccount.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WithdrawAccount parse(nc5 nc5Var) throws IOException {
            WithdrawAccount withdrawAccount = new WithdrawAccount();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (withdrawAccount.platform == null && numValueOf != null) {
                        withdrawAccount.platform = (PayMethod) PayMethod.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (withdrawAccount.platform == null) {
                        withdrawAccount.platform = (PayMethod) PayMethod.JSON_ADAPTER.defaultEnum();
                    }
                    if (withdrawAccount.name == null) {
                        withdrawAccount.name = "";
                    }
                    if (withdrawAccount.authInfo != null) {
                        break;
                    }
                    withdrawAccount.authInfo = "";
                    break;
                }
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 18) {
                    withdrawAccount.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    withdrawAccount.authInfo = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (withdrawAccount.platform == null && numValueOf != null) {
                            withdrawAccount.platform = (PayMethod) PayMethod.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (withdrawAccount.platform == null) {
                            withdrawAccount.platform = (PayMethod) PayMethod.JSON_ADAPTER.defaultEnum();
                        }
                        if (withdrawAccount.name == null) {
                            withdrawAccount.name = "";
                        }
                        if (withdrawAccount.authInfo != null) {
                            break;
                        }
                        withdrawAccount.authInfo = "";
                        return withdrawAccount;
                    }
                    withdrawAccount.platform = (PayMethod) nc5Var.m162488l(PayMethod.PROTOBUF_ADAPTER);
                }
            }
            return withdrawAccount;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WithdrawAccount withdrawAccount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PayMethod payMethod = withdrawAccount.platform;
            if (payMethod != null) {
                codedOutputByteBufferNano.m17305G(1, payMethod.ordinal());
            }
            String str = withdrawAccount.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = withdrawAccount.authInfo;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            PayMethod payMethod2 = withdrawAccount.platform;
            if (payMethod2 != null) {
                codedOutputByteBufferNano.m17309K(4, payMethod2, PayMethod.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<WithdrawAccount> JSON_ADAPTER = new ObjectJsonAdapter<WithdrawAccount>() { // from class: com.p1.mobile.putong.data.WithdrawAccount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WithdrawAccount.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WithdrawAccount newInstance() {
            return new WithdrawAccount();
        }

        public boolean parseField(WithdrawAccount withdrawAccount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "name":
                    withdrawAccount.name = jsonParser.getValueAsString();
                    return true;
                case "authInfo":
                    withdrawAccount.authInfo = jsonParser.getValueAsString();
                    return true;
                case "platform":
                    withdrawAccount.platform = PayMethod.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WithdrawAccount withdrawAccount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "name":
                case "authInfo":
                case "platform":
                    return true;
                default:
                    return super.parseFieldCheck(withdrawAccount, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WithdrawAccount withdrawAccount, JsonGenerator jsonGenerator) throws IOException {
            if (withdrawAccount.platform != null) {
                jsonGenerator.writeFieldName("platform");
                PayMethod.JSON_ADAPTER.serialize(withdrawAccount.platform, jsonGenerator, true);
            }
            String str = withdrawAccount.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = withdrawAccount.authInfo;
            if (str2 != null) {
                jsonGenerator.writeStringField("authInfo", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WithdrawAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WithdrawAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WithdrawAccount new_() {
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.nullCheck();
        return withdrawAccount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WithdrawAccount mo225055clone() {
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.platform = this.platform;
        withdrawAccount.name = this.name;
        withdrawAccount.authInfo = this.authInfo;
        return withdrawAccount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WithdrawAccount)) {
            return false;
        }
        WithdrawAccount withdrawAccount = (WithdrawAccount) obj;
        return ValueObject.util_equals(this.platform, withdrawAccount.platform) && ValueObject.util_equals(this.name, withdrawAccount.name) && ValueObject.util_equals(this.authInfo, withdrawAccount.authInfo);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "withdrawaccount";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        PayMethod payMethod = this.platform;
        int iHashCode = (i2 + (payMethod != null ? payMethod.hashCode() : 0)) * 41;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.authInfo;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.platform == null) {
            this.platform = (PayMethod) PayMethod.JSON_ADAPTER.defaultEnum();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.authInfo == null) {
            this.authInfo = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
