package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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

/* JADX INFO: loaded from: classes10.dex */
public class AccountRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accountrecord";

    @NonNull
    @ProtobufIndex(index = 2)
    public String amount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String content;

    @ProtobufIndex(index = 5)
    public double createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21082id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String recordType;
    public static ProtobufAdapter<AccountRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountRecord>() { // from class: com.p1.mobile.putong.core.data.AccountRecord.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AccountRecord accountRecord) {
            String str = accountRecord.f21082id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = accountRecord.amount;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = accountRecord.content;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = accountRecord.recordType;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(5, accountRecord.createdTime);
            accountRecord.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AccountRecord parse(nc5 nc5Var) throws IOException {
            AccountRecord accountRecord = new AccountRecord();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (accountRecord.f21082id == null) {
                        accountRecord.f21082id = "";
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
                if (iM162497u == 10) {
                    accountRecord.f21082id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    accountRecord.amount = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    accountRecord.content = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    accountRecord.recordType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 41) {
                        if (accountRecord.f21082id == null) {
                            accountRecord.f21082id = "";
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
                    accountRecord.createdTime = nc5Var.m162484h();
                }
            }
            return accountRecord;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AccountRecord accountRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accountRecord.f21082id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = accountRecord.amount;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = accountRecord.content;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = accountRecord.recordType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17301C(5, accountRecord.createdTime);
        }
    };
    public static JsonAdapter<AccountRecord> JSON_ADAPTER = new ObjectJsonAdapter<AccountRecord>() { // from class: com.p1.mobile.putong.core.data.AccountRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AccountRecord.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AccountRecord newInstance() {
            return new AccountRecord();
        }

        public boolean parseField(AccountRecord accountRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    accountRecord.amount = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    accountRecord.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    accountRecord.f21082id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AccountRecord accountRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = accountRecord.f21082id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = accountRecord.amount;
            if (str2 != null) {
                jsonGenerator.writeStringField("amount", str2);
            }
            String str3 = accountRecord.content;
            if (str3 != null) {
                jsonGenerator.writeStringField("content", str3);
            }
            String str4 = accountRecord.recordType;
            if (str4 != null) {
                jsonGenerator.writeStringField("recordType", str4);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(accountRecord.createdTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountRecord new_() {
        AccountRecord accountRecord = new AccountRecord();
        accountRecord.nullCheck();
        return accountRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AccountRecord mo225055clone() {
        AccountRecord accountRecord = new AccountRecord();
        accountRecord.f21082id = this.f21082id;
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
        return ValueObject.util_equals(this.f21082id, accountRecord.f21082id) && ValueObject.util_equals(this.amount, accountRecord.amount) && ValueObject.util_equals(this.content, accountRecord.content) && ValueObject.util_equals(this.recordType, accountRecord.recordType) && this.createdTime == accountRecord.createdTime;
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
        String str = this.f21082id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.recordType;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21082id == null) {
            this.f21082id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
