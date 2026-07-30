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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RegisterNameEnvelope registerNameEnvelope) {
            Meta meta = registerNameEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            RegisterName registerName = registerNameEnvelope.data;
            if (registerName != null) {
                iL += CodedOutputByteBufferNano.l(2, registerName, RegisterName.PROTOBUF_ADAPTER);
            }
            ((MessageNano) registerNameEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RegisterNameEnvelope m28939parse(nb5 nb5Var) throws IOException {
            RegisterNameEnvelope registerNameEnvelope = new RegisterNameEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (registerNameEnvelope.meta == null) {
                        registerNameEnvelope.meta = Meta.new_();
                    }
                    if (registerNameEnvelope.data != null) {
                        break;
                    }
                    registerNameEnvelope.data = RegisterName.new_();
                    break;
                }
                if (iU == 10) {
                    registerNameEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (registerNameEnvelope.meta == null) {
                            registerNameEnvelope.meta = Meta.new_();
                        }
                        if (registerNameEnvelope.data != null) {
                            break;
                        }
                        registerNameEnvelope.data = RegisterName.new_();
                        return registerNameEnvelope;
                    }
                    registerNameEnvelope.data = (RegisterName) nb5Var.l(RegisterName.PROTOBUF_ADAPTER);
                }
            }
            return registerNameEnvelope;
        }

        public void serialize(RegisterNameEnvelope registerNameEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = registerNameEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            RegisterName registerName = registerNameEnvelope.data;
            if (registerName != null) {
                codedOutputByteBufferNano.K(2, registerName, RegisterName.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RegisterNameEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<RegisterNameEnvelope>() { // from class: com.p1.mobile.putong.account.data.RegisterNameEnvelope.2
        public Class getDataClass() {
            return RegisterNameEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RegisterNameEnvelope m28940newInstance() {
            return new RegisterNameEnvelope();
        }

        public boolean parseField(RegisterNameEnvelope registerNameEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                registerNameEnvelope.data = (RegisterName) RegisterName.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            registerNameEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RegisterNameEnvelope registerNameEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(registerNameEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RegisterNameEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RegisterNameEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RegisterNameEnvelope new_() {
        RegisterNameEnvelope registerNameEnvelope = new RegisterNameEnvelope();
        registerNameEnvelope.nullCheck();
        return registerNameEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RegisterNameEnvelope m28938clone() {
        RegisterNameEnvelope registerNameEnvelope = new RegisterNameEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            registerNameEnvelope.meta = meta.clone();
        }
        RegisterName registerName = this.data;
        if (registerName != null) {
            registerNameEnvelope.data = registerName.m28934clone();
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
        RegisterName registerName = this.data;
        int iHashCode2 = iHashCode + (registerName != null ? registerName.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = RegisterName.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
