package com.p046p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes9.dex */
public class RegisterName extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "registername";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<RegisterName> PROTOBUF_ADAPTER = new MessageNanoAdapter<RegisterName>() { // from class: com.p1.mobile.putong.account.data.RegisterName.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RegisterName registerName) {
            String str = registerName.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            registerName.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RegisterName parse(nb5 nb5Var) throws IOException {
            RegisterName registerName = new RegisterName();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (registerName.name != null) {
                        break;
                    }
                    registerName.name = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (registerName.name != null) {
                        break;
                    }
                    registerName.name = "";
                    return registerName;
                }
                registerName.name = nb5Var.m158750s();
            }
            return registerName;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RegisterName registerName, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = registerName.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<RegisterName> JSON_ADAPTER = new ObjectJsonAdapter<RegisterName>() { // from class: com.p1.mobile.putong.account.data.RegisterName.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RegisterName.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RegisterName newInstance() {
            return new RegisterName();
        }

        public boolean parseField(RegisterName registerName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            registerName.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RegisterName registerName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(registerName, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RegisterName registerName, JsonGenerator jsonGenerator) throws IOException {
            String str = registerName.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RegisterName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RegisterName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RegisterName new_() {
        RegisterName registerName = new RegisterName();
        registerName.nullCheck();
        return registerName;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RegisterName mo223809clone() {
        RegisterName registerName = new RegisterName();
        registerName.name = this.name;
        return registerName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegisterName) {
            return ValueObject.util_equals(this.name, ((RegisterName) obj).name);
        }
        return false;
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
        String str = this.name;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
