package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.PayMethod;
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
public class WithdrawAccount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "withdrawaccount";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String authInfo;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public PayMethod platform;
    public static ProtobufAdapter<WithdrawAccount> PROTOBUF_ADAPTER = new MessageNanoAdapter<WithdrawAccount>() { // from class: com.p1.mobile.putong.core.data.WithdrawAccount.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WithdrawAccount withdrawAccount) {
            PayMethod payMethod = withdrawAccount.platform;
            int iH = payMethod != null ? CodedOutputByteBufferNano.h(1, payMethod.ordinal()) : 0;
            String str = withdrawAccount.name;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = withdrawAccount.authInfo;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            PayMethod payMethod2 = withdrawAccount.platform;
            if (payMethod2 != null) {
                iH += CodedOutputByteBufferNano.l(4, payMethod2, PayMethod.PROTOBUF_ADAPTER);
            }
            ((MessageNano) withdrawAccount).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WithdrawAccount m16337parse(nb5 nb5Var) throws IOException {
            WithdrawAccount withdrawAccount = new WithdrawAccount();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (withdrawAccount.platform == null && numValueOf != null) {
                        withdrawAccount.platform = PayMethod.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (withdrawAccount.platform == null) {
                        withdrawAccount.platform = PayMethod.JSON_ADAPTER.defaultEnum();
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
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    withdrawAccount.name = nb5Var.s();
                } else if (iU == 26) {
                    withdrawAccount.authInfo = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (withdrawAccount.platform == null && numValueOf != null) {
                            withdrawAccount.platform = PayMethod.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (withdrawAccount.platform == null) {
                            withdrawAccount.platform = PayMethod.JSON_ADAPTER.defaultEnum();
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
                    withdrawAccount.platform = (PayMethod) nb5Var.l(PayMethod.PROTOBUF_ADAPTER);
                }
            }
            return withdrawAccount;
        }

        public void serialize(WithdrawAccount withdrawAccount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PayMethod payMethod = withdrawAccount.platform;
            if (payMethod != null) {
                codedOutputByteBufferNano.G(1, payMethod.ordinal());
            }
            String str = withdrawAccount.name;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = withdrawAccount.authInfo;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            PayMethod payMethod2 = withdrawAccount.platform;
            if (payMethod2 != null) {
                codedOutputByteBufferNano.K(4, payMethod2, PayMethod.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<WithdrawAccount> JSON_ADAPTER = new ObjectJsonAdapter<WithdrawAccount>() { // from class: com.p1.mobile.putong.core.data.WithdrawAccount.2
        public Class getDataClass() {
            return WithdrawAccount.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WithdrawAccount m16338newInstance() {
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
                    withdrawAccount.platform = (PayMethod) PayMethod.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(WithdrawAccount withdrawAccount, JsonGenerator jsonGenerator) throws IOException {
            if (withdrawAccount.platform != null) {
                jsonGenerator.writeFieldName("platform");
                PayMethod.JSON_ADAPTER.serialize(withdrawAccount.platform, jsonGenerator, true);
            }
            String str = withdrawAccount.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = withdrawAccount.authInfo;
            if (str2 != null) {
                jsonGenerator.writeStringField("authInfo", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WithdrawAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WithdrawAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WithdrawAccount new_() {
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.nullCheck();
        return withdrawAccount;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WithdrawAccount m16336clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.platform == null) {
            this.platform = PayMethod.JSON_ADAPTER.defaultEnum();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.authInfo == null) {
            this.authInfo = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
