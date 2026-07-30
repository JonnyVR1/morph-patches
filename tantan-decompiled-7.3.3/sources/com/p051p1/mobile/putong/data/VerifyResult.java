package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class VerifyResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verifyresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;
    public static ProtobufAdapter<VerifyResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerifyResult>() { // from class: com.p1.mobile.putong.data.VerifyResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerifyResult verifyResult) {
            String str = verifyResult.action;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            verifyResult.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerifyResult parse(nc5 nc5Var) throws IOException {
            VerifyResult verifyResult = new VerifyResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (verifyResult.action != null) {
                        break;
                    }
                    verifyResult.action = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (verifyResult.action != null) {
                        break;
                    }
                    verifyResult.action = "";
                    return verifyResult;
                }
                verifyResult.action = nc5Var.m162495s();
            }
            return verifyResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerifyResult verifyResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = verifyResult.action;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<VerifyResult> JSON_ADAPTER = new ObjectJsonAdapter<VerifyResult>() { // from class: com.p1.mobile.putong.data.VerifyResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerifyResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerifyResult newInstance() {
            return new VerifyResult();
        }

        public boolean parseField(VerifyResult verifyResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("action")) {
                return false;
            }
            verifyResult.action = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VerifyResult verifyResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("action")) {
                return true;
            }
            return super.parseFieldCheck(verifyResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerifyResult verifyResult, JsonGenerator jsonGenerator) throws IOException {
            String str = verifyResult.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerifyResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerifyResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerifyResult new_() {
        VerifyResult verifyResult = new VerifyResult();
        verifyResult.nullCheck();
        return verifyResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerifyResult mo225055clone() {
        VerifyResult verifyResult = new VerifyResult();
        verifyResult.action = this.action;
        return verifyResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VerifyResult) {
            return ValueObject.util_equals(this.action, ((VerifyResult) obj).action);
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
        String str = this.action;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
