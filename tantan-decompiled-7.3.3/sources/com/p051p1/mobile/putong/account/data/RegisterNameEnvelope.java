package com.p051p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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

/* JADX INFO: loaded from: classes9.dex */
public class RegisterNameEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "registernameenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public RegisterName data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<RegisterNameEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<RegisterNameEnvelope>() { // from class: com.p1.mobile.putong.account.data.RegisterNameEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RegisterNameEnvelope registerNameEnvelope) {
            Meta meta = registerNameEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            RegisterName registerName = registerNameEnvelope.data;
            if (registerName != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, registerName, RegisterName.PROTOBUF_ADAPTER);
            }
            registerNameEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RegisterNameEnvelope parse(nc5 nc5Var) throws IOException {
            RegisterNameEnvelope registerNameEnvelope = new RegisterNameEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (registerNameEnvelope.meta == null) {
                        registerNameEnvelope.meta = Meta.new_();
                    }
                    if (registerNameEnvelope.data != null) {
                        break;
                    }
                    registerNameEnvelope.data = RegisterName.new_();
                    break;
                }
                if (iM162497u == 10) {
                    registerNameEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (registerNameEnvelope.meta == null) {
                            registerNameEnvelope.meta = Meta.new_();
                        }
                        if (registerNameEnvelope.data != null) {
                            break;
                        }
                        registerNameEnvelope.data = RegisterName.new_();
                        return registerNameEnvelope;
                    }
                    registerNameEnvelope.data = (RegisterName) nc5Var.m162488l(RegisterName.PROTOBUF_ADAPTER);
                }
            }
            return registerNameEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RegisterNameEnvelope registerNameEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = registerNameEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            RegisterName registerName = registerNameEnvelope.data;
            if (registerName != null) {
                codedOutputByteBufferNano.m17309K(2, registerName, RegisterName.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RegisterNameEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<RegisterNameEnvelope>() { // from class: com.p1.mobile.putong.account.data.RegisterNameEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RegisterNameEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RegisterNameEnvelope newInstance() {
            return new RegisterNameEnvelope();
        }

        public boolean parseField(RegisterNameEnvelope registerNameEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                registerNameEnvelope.data = RegisterName.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            registerNameEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RegisterNameEnvelope registerNameEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(registerNameEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RegisterNameEnvelope registerNameEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (registerNameEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(registerNameEnvelope.meta, jsonGenerator, true);
            }
            if (registerNameEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                RegisterName.JSON_ADAPTER.serialize(registerNameEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RegisterNameEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RegisterNameEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RegisterNameEnvelope new_() {
        RegisterNameEnvelope registerNameEnvelope = new RegisterNameEnvelope();
        registerNameEnvelope.nullCheck();
        return registerNameEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RegisterNameEnvelope mo225055clone() {
        RegisterNameEnvelope registerNameEnvelope = new RegisterNameEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            registerNameEnvelope.meta = meta.mo225055clone();
        }
        RegisterName registerName = this.data;
        if (registerName != null) {
            registerNameEnvelope.data = registerName.mo225055clone();
        }
        return registerNameEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterNameEnvelope)) {
            return false;
        }
        RegisterNameEnvelope registerNameEnvelope = (RegisterNameEnvelope) obj;
        return ValueObject.util_equals(this.meta, registerNameEnvelope.meta) && ValueObject.util_equals(this.data, registerNameEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        RegisterName registerName = this.data;
        int iHashCode2 = iHashCode + (registerName != null ? registerName.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = RegisterName.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
