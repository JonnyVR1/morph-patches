package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class AccountRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accountrecord";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String amount;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String content;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public double createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f2id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String recordType;
    public static ProtobufAdapter<AccountRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountRecord>() { // from class: com.p1.mobile.putong.core.data.AccountRecord.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AccountRecord accountRecord) {
            String str = accountRecord.f2id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = accountRecord.amount;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = accountRecord.content;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = accountRecord.recordType;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iD = iO + CodedOutputByteBufferNano.d(5, accountRecord.createdTime);
            ((MessageNano) accountRecord).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AccountRecord m11487parse(nb5 nb5Var) throws IOException {
            AccountRecord accountRecord = new AccountRecord();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (accountRecord.f2id == null) {
                        accountRecord.f2id = "";
                    }
                    if (accountRecord.amount == null) {
                        accountRecord.amount = "";
                    }
                    if (accountRecord.content == null) {
                        accountRecord.content = "";
                    }
                    if (accountRecord.recordType != null) {
                        break;
                    }
                    accountRecord.recordType = "";
                    break;
                }
                if (iU == 10) {
                    accountRecord.f2id = nb5Var.s();
                } else if (iU == 18) {
                    accountRecord.amount = nb5Var.s();
                } else if (iU == 26) {
                    accountRecord.content = nb5Var.s();
                } else if (iU == 34) {
                    accountRecord.recordType = nb5Var.s();
                } else {
                    if (iU != 41) {
                        if (accountRecord.f2id == null) {
                            accountRecord.f2id = "";
                        }
                        if (accountRecord.amount == null) {
                            accountRecord.amount = "";
                        }
                        if (accountRecord.content == null) {
                            accountRecord.content = "";
                        }
                        if (accountRecord.recordType != null) {
                            break;
                        }
                        accountRecord.recordType = "";
                        return accountRecord;
                    }
                    accountRecord.createdTime = nb5Var.h();
                }
            }
            return accountRecord;
        }

        public void serialize(AccountRecord accountRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accountRecord.f2id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = accountRecord.amount;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = accountRecord.content;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = accountRecord.recordType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.C(5, accountRecord.createdTime);
        }
    };
    public static JsonAdapter<AccountRecord> JSON_ADAPTER = new ObjectJsonAdapter<AccountRecord>() { // from class: com.p1.mobile.putong.core.data.AccountRecord.2
        public Class getDataClass() {
            return AccountRecord.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AccountRecord m11488newInstance() {
            return new AccountRecord();
        }

        public boolean parseField(AccountRecord accountRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    accountRecord.amount = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    accountRecord.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    accountRecord.f2id = jsonParser.getValueAsString();
                    return false;
                case "recordType":
                    accountRecord.recordType = jsonParser.getValueAsString();
                    return true;
                case "content":
                    accountRecord.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AccountRecord accountRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "amount":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "recordType":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(accountRecord, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AccountRecord accountRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = accountRecord.f2id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = accountRecord.amount;
            if (str2 != null) {
                jsonGenerator.writeStringField("amount", str2);
            }
            String str3 = accountRecord.content;
            if (str3 != null) {
                jsonGenerator.writeStringField(Content.TYPE, str3);
            }
            String str4 = accountRecord.recordType;
            if (str4 != null) {
                jsonGenerator.writeStringField("recordType", str4);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(accountRecord.createdTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountRecord new_() {
        AccountRecord accountRecord = new AccountRecord();
        accountRecord.nullCheck();
        return accountRecord;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AccountRecord m11486clone() {
        AccountRecord accountRecord = new AccountRecord();
        accountRecord.f2id = this.f2id;
        accountRecord.amount = this.amount;
        accountRecord.content = this.content;
        accountRecord.recordType = this.recordType;
        accountRecord.createdTime = this.createdTime;
        return accountRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountRecord)) {
            return false;
        }
        AccountRecord accountRecord = (AccountRecord) obj;
        return ValueObject.util_equals(this.f2id, accountRecord.f2id) && ValueObject.util_equals(this.amount, accountRecord.amount) && ValueObject.util_equals(this.content, accountRecord.content) && ValueObject.util_equals(this.recordType, accountRecord.recordType) && this.createdTime == accountRecord.createdTime;
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
        String str = this.f2id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.recordType;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f2id == null) {
            this.f2id = "";
        }
        if (this.amount == null) {
            this.amount = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.recordType == null) {
            this.recordType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
