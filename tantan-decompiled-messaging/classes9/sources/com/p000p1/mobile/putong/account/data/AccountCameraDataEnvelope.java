package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class AccountCameraDataEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accountcameradataenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public AccountCameraData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AccountCameraDataEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountCameraDataEnvelope>() { // from class: com.p1.mobile.putong.account.data.AccountCameraDataEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AccountCameraDataEnvelope accountCameraDataEnvelope) {
            Meta meta = accountCameraDataEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AccountCameraData accountCameraData = accountCameraDataEnvelope.data;
            if (accountCameraData != null) {
                iL += CodedOutputByteBufferNano.l(2, accountCameraData, AccountCameraData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) accountCameraDataEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AccountCameraDataEnvelope m28879parse(nb5 nb5Var) throws IOException {
            AccountCameraDataEnvelope accountCameraDataEnvelope = new AccountCameraDataEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (accountCameraDataEnvelope.meta == null) {
                        accountCameraDataEnvelope.meta = Meta.new_();
                    }
                    if (accountCameraDataEnvelope.data != null) {
                        break;
                    }
                    accountCameraDataEnvelope.data = AccountCameraData.new_();
                    break;
                }
                if (iU == 10) {
                    accountCameraDataEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (accountCameraDataEnvelope.meta == null) {
                            accountCameraDataEnvelope.meta = Meta.new_();
                        }
                        if (accountCameraDataEnvelope.data != null) {
                            break;
                        }
                        accountCameraDataEnvelope.data = AccountCameraData.new_();
                        return accountCameraDataEnvelope;
                    }
                    accountCameraDataEnvelope.data = (AccountCameraData) nb5Var.l(AccountCameraData.PROTOBUF_ADAPTER);
                }
            }
            return accountCameraDataEnvelope;
        }

        public void serialize(AccountCameraDataEnvelope accountCameraDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = accountCameraDataEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AccountCameraData accountCameraData = accountCameraDataEnvelope.data;
            if (accountCameraData != null) {
                codedOutputByteBufferNano.K(2, accountCameraData, AccountCameraData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AccountCameraDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AccountCameraDataEnvelope>() { // from class: com.p1.mobile.putong.account.data.AccountCameraDataEnvelope.2
        public Class getDataClass() {
            return AccountCameraDataEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AccountCameraDataEnvelope m28880newInstance() {
            return new AccountCameraDataEnvelope();
        }

        public boolean parseField(AccountCameraDataEnvelope accountCameraDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                accountCameraDataEnvelope.data = (AccountCameraData) AccountCameraData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            accountCameraDataEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AccountCameraDataEnvelope accountCameraDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(accountCameraDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AccountCameraDataEnvelope accountCameraDataEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (accountCameraDataEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(accountCameraDataEnvelope.meta, jsonGenerator, true);
            }
            if (accountCameraDataEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                AccountCameraData.JSON_ADAPTER.serialize(accountCameraDataEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountCameraDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountCameraDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountCameraDataEnvelope new_() {
        AccountCameraDataEnvelope accountCameraDataEnvelope = new AccountCameraDataEnvelope();
        accountCameraDataEnvelope.nullCheck();
        return accountCameraDataEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AccountCameraDataEnvelope m28878clone() {
        AccountCameraDataEnvelope accountCameraDataEnvelope = new AccountCameraDataEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            accountCameraDataEnvelope.meta = meta.clone();
        }
        AccountCameraData accountCameraData = this.data;
        if (accountCameraData != null) {
            accountCameraDataEnvelope.data = accountCameraData.m28874clone();
        }
        return accountCameraDataEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountCameraDataEnvelope)) {
            return false;
        }
        AccountCameraDataEnvelope accountCameraDataEnvelope = (AccountCameraDataEnvelope) obj;
        return ValueObject.util_equals(this.meta, accountCameraDataEnvelope.meta) && ValueObject.util_equals(this.data, accountCameraDataEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        AccountCameraData accountCameraData = this.data;
        int iHashCode2 = iHashCode + (accountCameraData != null ? accountCameraData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AccountCameraData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
