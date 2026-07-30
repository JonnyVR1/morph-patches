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
public class AlipayAuthData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "alipayauthdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String alipayAuthRequest;

    @NonNull
    @ProtobufIndex(index = 2)
    public String alipayCertificationRequest;
    public static ProtobufAdapter<AlipayAuthData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AlipayAuthData>() { // from class: com.p1.mobile.putong.data.AlipayAuthData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AlipayAuthData alipayAuthData) {
            String str = alipayAuthData.alipayAuthRequest;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = alipayAuthData.alipayCertificationRequest;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            alipayAuthData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AlipayAuthData parse(nc5 nc5Var) throws IOException {
            AlipayAuthData alipayAuthData = new AlipayAuthData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (alipayAuthData.alipayAuthRequest == null) {
                        alipayAuthData.alipayAuthRequest = "";
                    }
                    if (alipayAuthData.alipayCertificationRequest != null) {
                        break;
                    }
                    alipayAuthData.alipayCertificationRequest = "";
                    break;
                }
                if (iM162497u == 10) {
                    alipayAuthData.alipayAuthRequest = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (alipayAuthData.alipayAuthRequest == null) {
                            alipayAuthData.alipayAuthRequest = "";
                        }
                        if (alipayAuthData.alipayCertificationRequest != null) {
                            break;
                        }
                        alipayAuthData.alipayCertificationRequest = "";
                        return alipayAuthData;
                    }
                    alipayAuthData.alipayCertificationRequest = nc5Var.m162495s();
                }
            }
            return alipayAuthData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AlipayAuthData alipayAuthData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = alipayAuthData.alipayAuthRequest;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = alipayAuthData.alipayCertificationRequest;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<AlipayAuthData> JSON_ADAPTER = new ObjectJsonAdapter<AlipayAuthData>() { // from class: com.p1.mobile.putong.data.AlipayAuthData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AlipayAuthData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AlipayAuthData newInstance() {
            return new AlipayAuthData();
        }

        public boolean parseField(AlipayAuthData alipayAuthData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("alipayAuthRequest")) {
                alipayAuthData.alipayAuthRequest = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("alipayCertificationRequest")) {
                return false;
            }
            alipayAuthData.alipayCertificationRequest = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AlipayAuthData alipayAuthData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("alipayAuthRequest") || str.equals("alipayCertificationRequest")) {
                return true;
            }
            return super.parseFieldCheck(alipayAuthData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AlipayAuthData alipayAuthData, JsonGenerator jsonGenerator) throws IOException {
            String str = alipayAuthData.alipayAuthRequest;
            if (str != null) {
                jsonGenerator.writeStringField("alipayAuthRequest", str);
            }
            String str2 = alipayAuthData.alipayCertificationRequest;
            if (str2 != null) {
                jsonGenerator.writeStringField("alipayCertificationRequest", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AlipayAuthData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AlipayAuthData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AlipayAuthData new_() {
        AlipayAuthData alipayAuthData = new AlipayAuthData();
        alipayAuthData.nullCheck();
        return alipayAuthData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AlipayAuthData mo225055clone() {
        AlipayAuthData alipayAuthData = new AlipayAuthData();
        alipayAuthData.alipayAuthRequest = this.alipayAuthRequest;
        alipayAuthData.alipayCertificationRequest = this.alipayCertificationRequest;
        return alipayAuthData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlipayAuthData)) {
            return false;
        }
        AlipayAuthData alipayAuthData = (AlipayAuthData) obj;
        return ValueObject.util_equals(this.alipayAuthRequest, alipayAuthData.alipayAuthRequest) && ValueObject.util_equals(this.alipayCertificationRequest, alipayAuthData.alipayCertificationRequest);
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
        String str = this.alipayAuthRequest;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.alipayCertificationRequest;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.alipayAuthRequest == null) {
            this.alipayAuthRequest = "";
        }
        if (this.alipayCertificationRequest == null) {
            this.alipayCertificationRequest = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
