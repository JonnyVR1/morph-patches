package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AlipayAuthData alipayAuthData) {
            String str = alipayAuthData.alipayAuthRequest;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = alipayAuthData.alipayCertificationRequest;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) alipayAuthData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AlipayAuthData m17683parse(nb5 nb5Var) throws IOException {
            AlipayAuthData alipayAuthData = new AlipayAuthData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (alipayAuthData.alipayAuthRequest == null) {
                        alipayAuthData.alipayAuthRequest = "";
                    }
                    if (alipayAuthData.alipayCertificationRequest != null) {
                        break;
                    }
                    alipayAuthData.alipayCertificationRequest = "";
                    break;
                }
                if (iU == 10) {
                    alipayAuthData.alipayAuthRequest = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (alipayAuthData.alipayAuthRequest == null) {
                            alipayAuthData.alipayAuthRequest = "";
                        }
                        if (alipayAuthData.alipayCertificationRequest != null) {
                            break;
                        }
                        alipayAuthData.alipayCertificationRequest = "";
                        return alipayAuthData;
                    }
                    alipayAuthData.alipayCertificationRequest = nb5Var.s();
                }
            }
            return alipayAuthData;
        }

        public void serialize(AlipayAuthData alipayAuthData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = alipayAuthData.alipayAuthRequest;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = alipayAuthData.alipayCertificationRequest;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AlipayAuthData> JSON_ADAPTER = new ObjectJsonAdapter<AlipayAuthData>() { // from class: com.p1.mobile.putong.data.AlipayAuthData.2
        public Class getDataClass() {
            return AlipayAuthData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AlipayAuthData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AlipayAuthData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AlipayAuthData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AlipayAuthData new_() {
        AlipayAuthData alipayAuthData = new AlipayAuthData();
        alipayAuthData.nullCheck();
        return alipayAuthData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AlipayAuthData m17682clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.alipayAuthRequest;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.alipayCertificationRequest;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.alipayAuthRequest == null) {
            this.alipayAuthRequest = "";
        }
        if (this.alipayCertificationRequest == null) {
            this.alipayCertificationRequest = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
