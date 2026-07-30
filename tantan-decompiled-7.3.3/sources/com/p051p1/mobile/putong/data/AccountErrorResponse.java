package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class AccountErrorResponse extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accounterrorresponse";

    @ProtobufIndex(index = 1)
    public int code;

    @NonNull
    @ProtobufIndex(index = 2)
    public String error;

    @ProtobufIndex(index = 4)
    public boolean hasContract;

    @Nullable
    @ProtobufIndex(index = 3)
    public String message;
    public static ProtobufAdapter<AccountErrorResponse> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountErrorResponse>() { // from class: com.p1.mobile.putong.data.AccountErrorResponse.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AccountErrorResponse accountErrorResponse) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, accountErrorResponse.code);
            String str = accountErrorResponse.error;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = accountErrorResponse.message;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(4, accountErrorResponse.hasContract);
            accountErrorResponse.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AccountErrorResponse parse(nc5 nc5Var) throws IOException {
            AccountErrorResponse accountErrorResponse = new AccountErrorResponse();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (accountErrorResponse.error != null) {
                        break;
                    }
                    accountErrorResponse.error = "";
                    break;
                }
                if (iM162497u == 8) {
                    accountErrorResponse.code = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    accountErrorResponse.error = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    accountErrorResponse.message = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
                        if (accountErrorResponse.error != null) {
                            break;
                        }
                        accountErrorResponse.error = "";
                        return accountErrorResponse;
                    }
                    accountErrorResponse.hasContract = nc5Var.m162483g();
                }
            }
            return accountErrorResponse;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AccountErrorResponse accountErrorResponse, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, accountErrorResponse.code);
            String str = accountErrorResponse.error;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = accountErrorResponse.message;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17299A(4, accountErrorResponse.hasContract);
        }
    };
    public static JsonAdapter<AccountErrorResponse> JSON_ADAPTER = new ObjectJsonAdapter<AccountErrorResponse>() { // from class: com.p1.mobile.putong.data.AccountErrorResponse.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AccountErrorResponse.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AccountErrorResponse newInstance() {
            return new AccountErrorResponse();
        }

        public boolean parseField(AccountErrorResponse accountErrorResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "code":
                    accountErrorResponse.code = jsonParser.getValueAsInt();
                    return true;
                case "error":
                    accountErrorResponse.error = jsonParser.getValueAsString();
                    return true;
                case "has_contract":
                    accountErrorResponse.hasContract = jsonParser.getValueAsBoolean();
                    return true;
                case "message":
                    accountErrorResponse.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AccountErrorResponse accountErrorResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "code":
                case "error":
                case "has_contract":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(accountErrorResponse, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AccountErrorResponse accountErrorResponse, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", accountErrorResponse.code);
            String str = accountErrorResponse.error;
            if (str != null) {
                jsonGenerator.writeStringField("error", str);
            }
            String str2 = accountErrorResponse.message;
            if (str2 != null) {
                jsonGenerator.writeStringField("message", str2);
            }
            jsonGenerator.writeBooleanField("has_contract", accountErrorResponse.hasContract);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountErrorResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountErrorResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountErrorResponse new_() {
        AccountErrorResponse accountErrorResponse = new AccountErrorResponse();
        accountErrorResponse.nullCheck();
        return accountErrorResponse;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AccountErrorResponse mo225055clone() {
        AccountErrorResponse accountErrorResponse = new AccountErrorResponse();
        accountErrorResponse.code = this.code;
        accountErrorResponse.error = this.error;
        accountErrorResponse.message = this.message;
        accountErrorResponse.hasContract = this.hasContract;
        return accountErrorResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountErrorResponse)) {
            return false;
        }
        AccountErrorResponse accountErrorResponse = (AccountErrorResponse) obj;
        return this.code == accountErrorResponse.code && ValueObject.util_equals(this.error, accountErrorResponse.error) && ValueObject.util_equals(this.message, accountErrorResponse.message) && this.hasContract == accountErrorResponse.hasContract;
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
        int i2 = ((i * 41) + this.code) * 41;
        String str = this.error;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.message;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.hasContract ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.error == null) {
            this.error = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
