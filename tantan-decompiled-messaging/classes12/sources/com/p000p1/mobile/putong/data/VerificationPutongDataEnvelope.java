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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationPutongDataEnvelope verificationPutongDataEnvelope) {
            Meta meta = verificationPutongDataEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            CommonData commonData = verificationPutongDataEnvelope.data;
            if (commonData != null) {
                iL += CodedOutputByteBufferNano.l(2, commonData, CommonData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) verificationPutongDataEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationPutongDataEnvelope m19277parse(nb5 nb5Var) throws IOException {
            VerificationPutongDataEnvelope verificationPutongDataEnvelope = new VerificationPutongDataEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (verificationPutongDataEnvelope.meta == null) {
                        verificationPutongDataEnvelope.meta = Meta.new_();
                    }
                    if (verificationPutongDataEnvelope.data != null) {
                        break;
                    }
                    verificationPutongDataEnvelope.data = CommonData.new_();
                    break;
                }
                if (iU == 10) {
                    verificationPutongDataEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (verificationPutongDataEnvelope.meta == null) {
                            verificationPutongDataEnvelope.meta = Meta.new_();
                        }
                        if (verificationPutongDataEnvelope.data != null) {
                            break;
                        }
                        verificationPutongDataEnvelope.data = CommonData.new_();
                        return verificationPutongDataEnvelope;
                    }
                    verificationPutongDataEnvelope.data = (CommonData) nb5Var.l(CommonData.PROTOBUF_ADAPTER);
                }
            }
            return verificationPutongDataEnvelope;
        }

        public void serialize(VerificationPutongDataEnvelope verificationPutongDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = verificationPutongDataEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            CommonData commonData = verificationPutongDataEnvelope.data;
            if (commonData != null) {
                codedOutputByteBufferNano.K(2, commonData, CommonData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationPutongDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<VerificationPutongDataEnvelope>() { // from class: com.p1.mobile.putong.data.VerificationPutongDataEnvelope.2
        public Class getDataClass() {
            return VerificationPutongDataEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerificationPutongDataEnvelope mo17830newInstance() {
            return new VerificationPutongDataEnvelope();
        }

        public boolean parseField(VerificationPutongDataEnvelope verificationPutongDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                verificationPutongDataEnvelope.data = (CommonData) CommonData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            verificationPutongDataEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VerificationPutongDataEnvelope verificationPutongDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(verificationPutongDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationPutongDataEnvelope verificationPutongDataEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (verificationPutongDataEnvelope.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(verificationPutongDataEnvelope.meta, jsonGenerator, true);
            }
            if (verificationPutongDataEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                CommonData.JSON_ADAPTER.serialize(verificationPutongDataEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationPutongDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationPutongDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationPutongDataEnvelope new_() {
        VerificationPutongDataEnvelope verificationPutongDataEnvelope = new VerificationPutongDataEnvelope();
        verificationPutongDataEnvelope.nullCheck();
        return verificationPutongDataEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationPutongDataEnvelope m19276clone() {
        VerificationPutongDataEnvelope verificationPutongDataEnvelope = new VerificationPutongDataEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            verificationPutongDataEnvelope.meta = meta.m18461clone();
        }
        CommonData commonData = this.data;
        if (commonData != null) {
            verificationPutongDataEnvelope.data = commonData.m17828clone();
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
        CommonData commonData = this.data;
        int iHashCode2 = iHashCode + (commonData != null ? commonData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = CommonData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
