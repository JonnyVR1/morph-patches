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
public class ALiYunResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aliyunresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String certifyId;
    public static ProtobufAdapter<ALiYunResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<ALiYunResult>() { // from class: com.p1.mobile.putong.data.ALiYunResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ALiYunResult aLiYunResult) {
            String str = aLiYunResult.certifyId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            aLiYunResult.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ALiYunResult parse(nc5 nc5Var) throws IOException {
            ALiYunResult aLiYunResult = new ALiYunResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aLiYunResult.certifyId != null) {
                        break;
                    }
                    aLiYunResult.certifyId = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (aLiYunResult.certifyId != null) {
                        break;
                    }
                    aLiYunResult.certifyId = "";
                    return aLiYunResult;
                }
                aLiYunResult.certifyId = nc5Var.m162495s();
            }
            return aLiYunResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ALiYunResult aLiYunResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aLiYunResult.certifyId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<ALiYunResult> JSON_ADAPTER = new ObjectJsonAdapter<ALiYunResult>() { // from class: com.p1.mobile.putong.data.ALiYunResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ALiYunResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ALiYunResult newInstance() {
            return new ALiYunResult();
        }

        public boolean parseField(ALiYunResult aLiYunResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("certifyId")) {
                return false;
            }
            aLiYunResult.certifyId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ALiYunResult aLiYunResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("certifyId")) {
                return true;
            }
            return super.parseFieldCheck(aLiYunResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ALiYunResult aLiYunResult, JsonGenerator jsonGenerator) throws IOException {
            String str = aLiYunResult.certifyId;
            if (str != null) {
                jsonGenerator.writeStringField("certifyId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ALiYunResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ALiYunResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ALiYunResult new_() {
        ALiYunResult aLiYunResult = new ALiYunResult();
        aLiYunResult.nullCheck();
        return aLiYunResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ALiYunResult mo225055clone() {
        ALiYunResult aLiYunResult = new ALiYunResult();
        aLiYunResult.certifyId = this.certifyId;
        return aLiYunResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ALiYunResult) {
            return ValueObject.util_equals(this.certifyId, ((ALiYunResult) obj).certifyId);
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
        String str = this.certifyId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.certifyId == null) {
            this.certifyId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
