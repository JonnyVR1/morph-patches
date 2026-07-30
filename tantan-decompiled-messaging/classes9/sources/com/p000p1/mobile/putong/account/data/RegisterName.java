package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class RegisterName extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "registername";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<RegisterName> PROTOBUF_ADAPTER = new MessageNanoAdapter<RegisterName>() { // from class: com.p1.mobile.putong.account.data.RegisterName.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RegisterName registerName) {
            String str = registerName.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) registerName).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RegisterName m28935parse(nb5 nb5Var) throws IOException {
            RegisterName registerName = new RegisterName();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (registerName.name != null) {
                        break;
                    }
                    registerName.name = "";
                    break;
                }
                if (iU != 10) {
                    if (registerName.name != null) {
                        break;
                    }
                    registerName.name = "";
                    return registerName;
                }
                registerName.name = nb5Var.s();
            }
            return registerName;
        }

        public void serialize(RegisterName registerName, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = registerName.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<RegisterName> JSON_ADAPTER = new ObjectJsonAdapter<RegisterName>() { // from class: com.p1.mobile.putong.account.data.RegisterName.2
        public Class getDataClass() {
            return RegisterName.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RegisterName m28936newInstance() {
            return new RegisterName();
        }

        public boolean parseField(RegisterName registerName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("name")) {
                return false;
            }
            registerName.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RegisterName registerName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(registerName, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RegisterName registerName, JsonGenerator jsonGenerator) throws IOException {
            String str = registerName.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RegisterName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RegisterName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RegisterName new_() {
        RegisterName registerName = new RegisterName();
        registerName.nullCheck();
        return registerName;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RegisterName m28934clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.name;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
