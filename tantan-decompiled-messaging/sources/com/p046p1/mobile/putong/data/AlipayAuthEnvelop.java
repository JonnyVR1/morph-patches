package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class AlipayAuthEnvelop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "alipayauthenvelop";

    @NonNull
    @ProtobufIndex(index = 2)
    public AlipayAuthData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AlipayAuthEnvelop> PROTOBUF_ADAPTER = new MessageNanoAdapter<AlipayAuthEnvelop>() { // from class: com.p1.mobile.putong.data.AlipayAuthEnvelop.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AlipayAuthEnvelop alipayAuthEnvelop) {
            Meta meta = alipayAuthEnvelop.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AlipayAuthData alipayAuthData = alipayAuthEnvelop.data;
            if (alipayAuthData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, alipayAuthData, AlipayAuthData.PROTOBUF_ADAPTER);
            }
            alipayAuthEnvelop.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AlipayAuthEnvelop parse(nb5 nb5Var) throws IOException {
            AlipayAuthEnvelop alipayAuthEnvelop = new AlipayAuthEnvelop();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (alipayAuthEnvelop.meta == null) {
                        alipayAuthEnvelop.meta = Meta.new_();
                    }
                    if (alipayAuthEnvelop.data != null) {
                        break;
                    }
                    alipayAuthEnvelop.data = AlipayAuthData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    alipayAuthEnvelop.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (alipayAuthEnvelop.meta == null) {
                            alipayAuthEnvelop.meta = Meta.new_();
                        }
                        if (alipayAuthEnvelop.data != null) {
                            break;
                        }
                        alipayAuthEnvelop.data = AlipayAuthData.new_();
                        return alipayAuthEnvelop;
                    }
                    alipayAuthEnvelop.data = (AlipayAuthData) nb5Var.m158743l(AlipayAuthData.PROTOBUF_ADAPTER);
                }
            }
            return alipayAuthEnvelop;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AlipayAuthEnvelop alipayAuthEnvelop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = alipayAuthEnvelop.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AlipayAuthData alipayAuthData = alipayAuthEnvelop.data;
            if (alipayAuthData != null) {
                codedOutputByteBufferNano.m17254K(2, alipayAuthData, AlipayAuthData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AlipayAuthEnvelop> JSON_ADAPTER = new ObjectJsonAdapter<AlipayAuthEnvelop>() { // from class: com.p1.mobile.putong.data.AlipayAuthEnvelop.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AlipayAuthEnvelop.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AlipayAuthEnvelop newInstance() {
            return new AlipayAuthEnvelop();
        }

        public boolean parseField(AlipayAuthEnvelop alipayAuthEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                alipayAuthEnvelop.data = AlipayAuthData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            alipayAuthEnvelop.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AlipayAuthEnvelop alipayAuthEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(alipayAuthEnvelop, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AlipayAuthEnvelop alipayAuthEnvelop, JsonGenerator jsonGenerator) throws IOException {
            if (alipayAuthEnvelop.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(alipayAuthEnvelop.meta, jsonGenerator, true);
            }
            if (alipayAuthEnvelop.data != null) {
                jsonGenerator.writeFieldName("data");
                AlipayAuthData.JSON_ADAPTER.serialize(alipayAuthEnvelop.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AlipayAuthEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AlipayAuthEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AlipayAuthEnvelop new_() {
        AlipayAuthEnvelop alipayAuthEnvelop = new AlipayAuthEnvelop();
        alipayAuthEnvelop.nullCheck();
        return alipayAuthEnvelop;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AlipayAuthEnvelop mo223809clone() {
        AlipayAuthEnvelop alipayAuthEnvelop = new AlipayAuthEnvelop();
        Meta meta = this.meta;
        if (meta != null) {
            alipayAuthEnvelop.meta = meta.mo223809clone();
        }
        AlipayAuthData alipayAuthData = this.data;
        if (alipayAuthData != null) {
            alipayAuthEnvelop.data = alipayAuthData.mo223809clone();
        }
        return alipayAuthEnvelop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlipayAuthEnvelop)) {
            return false;
        }
        AlipayAuthEnvelop alipayAuthEnvelop = (AlipayAuthEnvelop) obj;
        return ValueObject.util_equals(this.meta, alipayAuthEnvelop.meta) && ValueObject.util_equals(this.data, alipayAuthEnvelop.data);
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
        AlipayAuthData alipayAuthData = this.data;
        int iHashCode2 = iHashCode + (alipayAuthData != null ? alipayAuthData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AlipayAuthData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
