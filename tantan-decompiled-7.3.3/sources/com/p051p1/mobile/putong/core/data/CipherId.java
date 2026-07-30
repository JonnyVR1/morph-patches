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
public class CipherId extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cipherid";

    @NonNull
    @ProtobufIndex(index = 2)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CipherId> PROTOBUF_ADAPTER = new MessageNanoAdapter<CipherId>() { // from class: com.p1.mobile.putong.core.data.CipherId.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CipherId cipherId) {
            String str = cipherId.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = cipherId.momentId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            cipherId.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CipherId parse(nc5 nc5Var) throws IOException {
            CipherId cipherId = new CipherId();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (cipherId.userId == null) {
                        cipherId.userId = "";
                    }
                    if (cipherId.momentId != null) {
                        break;
                    }
                    cipherId.momentId = "";
                    break;
                }
                if (iM162497u == 10) {
                    cipherId.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (cipherId.userId == null) {
                            cipherId.userId = "";
                        }
                        if (cipherId.momentId != null) {
                            break;
                        }
                        cipherId.momentId = "";
                        return cipherId;
                    }
                    cipherId.momentId = nc5Var.m162495s();
                }
            }
            return cipherId;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CipherId cipherId, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cipherId.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = cipherId.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<CipherId> JSON_ADAPTER = new ObjectJsonAdapter<CipherId>() { // from class: com.p1.mobile.putong.core.data.CipherId.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CipherId.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CipherId newInstance() {
            return new CipherId();
        }

        public boolean parseField(CipherId cipherId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                cipherId.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("momentId")) {
                return false;
            }
            cipherId.momentId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CipherId cipherId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("momentId")) {
                return true;
            }
            return super.parseFieldCheck(cipherId, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CipherId cipherId, JsonGenerator jsonGenerator) throws IOException {
            String str = cipherId.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = cipherId.momentId;
            if (str2 != null) {
                jsonGenerator.writeStringField("momentId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CipherId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CipherId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CipherId new_() {
        CipherId cipherId = new CipherId();
        cipherId.nullCheck();
        return cipherId;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CipherId mo225055clone() {
        CipherId cipherId = new CipherId();
        cipherId.userId = this.userId;
        cipherId.momentId = this.momentId;
        return cipherId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CipherId)) {
            return false;
        }
        CipherId cipherId = (CipherId) obj;
        return ValueObject.util_equals(this.userId, cipherId.userId) && ValueObject.util_equals(this.momentId, cipherId.momentId);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momentId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
