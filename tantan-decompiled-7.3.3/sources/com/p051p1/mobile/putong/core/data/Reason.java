package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class Reason extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reason";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21230id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<Reason> PROTOBUF_ADAPTER = new MessageNanoAdapter<Reason>() { // from class: com.p1.mobile.putong.core.data.Reason.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Reason reason) {
            String str = reason.f21230id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = reason.value;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            reason.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Reason parse(nc5 nc5Var) throws IOException {
            Reason reason = new Reason();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (reason.f21230id == null) {
                        reason.f21230id = "";
                    }
                    if (reason.value != null) {
                        break;
                    }
                    reason.value = "";
                    break;
                }
                if (iM162497u == 10) {
                    reason.f21230id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (reason.f21230id == null) {
                            reason.f21230id = "";
                        }
                        if (reason.value != null) {
                            break;
                        }
                        reason.value = "";
                        return reason;
                    }
                    reason.value = nc5Var.m162495s();
                }
            }
            return reason;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Reason reason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reason.f21230id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = reason.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<Reason> JSON_ADAPTER = new ObjectJsonAdapter<Reason>() { // from class: com.p1.mobile.putong.core.data.Reason.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Reason.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Reason newInstance() {
            return new Reason();
        }

        public boolean parseField(Reason reason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                reason.f21230id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("value")) {
                return false;
            }
            reason.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Reason reason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(reason, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Reason reason, JsonGenerator jsonGenerator) throws IOException {
            String str = reason.f21230id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = reason.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Reason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Reason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Reason new_() {
        Reason reason = new Reason();
        reason.nullCheck();
        return reason;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Reason mo225055clone() {
        Reason reason = new Reason();
        reason.f21230id = this.f21230id;
        reason.value = this.value;
        return reason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reason)) {
            return false;
        }
        Reason reason = (Reason) obj;
        return ValueObject.util_equals(this.f21230id, reason.f21230id) && ValueObject.util_equals(this.value, reason.value);
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
        String str = this.f21230id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21230id == null) {
            this.f21230id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
