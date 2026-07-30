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
public class VerificationPutongDataEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationputongdataenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public CommonData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<VerificationPutongDataEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationPutongDataEnvelope>() { // from class: com.p1.mobile.putong.data.VerificationPutongDataEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationPutongDataEnvelope verificationPutongDataEnvelope) {
            Meta meta = verificationPutongDataEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            CommonData commonData = verificationPutongDataEnvelope.data;
            if (commonData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, commonData, CommonData.PROTOBUF_ADAPTER);
            }
            verificationPutongDataEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationPutongDataEnvelope parse(nb5 nb5Var) throws IOException {
            VerificationPutongDataEnvelope verificationPutongDataEnvelope = new VerificationPutongDataEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (verificationPutongDataEnvelope.meta == null) {
                        verificationPutongDataEnvelope.meta = Meta.new_();
                    }
                    if (verificationPutongDataEnvelope.data != null) {
                        break;
                    }
                    verificationPutongDataEnvelope.data = CommonData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    verificationPutongDataEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (verificationPutongDataEnvelope.meta == null) {
                            verificationPutongDataEnvelope.meta = Meta.new_();
                        }
                        if (verificationPutongDataEnvelope.data != null) {
                            break;
                        }
                        verificationPutongDataEnvelope.data = CommonData.new_();
                        return verificationPutongDataEnvelope;
                    }
                    verificationPutongDataEnvelope.data = (CommonData) nb5Var.m158743l(CommonData.PROTOBUF_ADAPTER);
                }
            }
            return verificationPutongDataEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationPutongDataEnvelope verificationPutongDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = verificationPutongDataEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            CommonData commonData = verificationPutongDataEnvelope.data;
            if (commonData != null) {
                codedOutputByteBufferNano.m17254K(2, commonData, CommonData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationPutongDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<VerificationPutongDataEnvelope>() { // from class: com.p1.mobile.putong.data.VerificationPutongDataEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationPutongDataEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationPutongDataEnvelope newInstance() {
            return new VerificationPutongDataEnvelope();
        }

        public boolean parseField(VerificationPutongDataEnvelope verificationPutongDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                verificationPutongDataEnvelope.data = CommonData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            verificationPutongDataEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VerificationPutongDataEnvelope verificationPutongDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(verificationPutongDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationPutongDataEnvelope verificationPutongDataEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (verificationPutongDataEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(verificationPutongDataEnvelope.meta, jsonGenerator, true);
            }
            if (verificationPutongDataEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                CommonData.JSON_ADAPTER.serialize(verificationPutongDataEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationPutongDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationPutongDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationPutongDataEnvelope new_() {
        VerificationPutongDataEnvelope verificationPutongDataEnvelope = new VerificationPutongDataEnvelope();
        verificationPutongDataEnvelope.nullCheck();
        return verificationPutongDataEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationPutongDataEnvelope mo223809clone() {
        VerificationPutongDataEnvelope verificationPutongDataEnvelope = new VerificationPutongDataEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            verificationPutongDataEnvelope.meta = meta.mo223809clone();
        }
        CommonData commonData = this.data;
        if (commonData != null) {
            verificationPutongDataEnvelope.data = commonData.mo223809clone();
        }
        return verificationPutongDataEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationPutongDataEnvelope)) {
            return false;
        }
        VerificationPutongDataEnvelope verificationPutongDataEnvelope = (VerificationPutongDataEnvelope) obj;
        return ValueObject.util_equals(this.meta, verificationPutongDataEnvelope.meta) && ValueObject.util_equals(this.data, verificationPutongDataEnvelope.data);
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
        CommonData commonData = this.data;
        int iHashCode2 = iHashCode + (commonData != null ? commonData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = CommonData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
