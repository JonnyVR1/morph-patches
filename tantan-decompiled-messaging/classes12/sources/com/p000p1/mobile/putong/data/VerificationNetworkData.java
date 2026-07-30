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
public class VerificationNetworkData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationnetworkdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public VerificationData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<VerificationNetworkData> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationNetworkData>() { // from class: com.p1.mobile.putong.data.VerificationNetworkData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationNetworkData verificationNetworkData) {
            Meta meta = verificationNetworkData.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            VerificationData verificationData = verificationNetworkData.data;
            if (verificationData != null) {
                iL += CodedOutputByteBufferNano.l(2, verificationData, VerificationData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) verificationNetworkData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationNetworkData m19265parse(nb5 nb5Var) throws IOException {
            VerificationNetworkData verificationNetworkData = new VerificationNetworkData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (verificationNetworkData.meta == null) {
                        verificationNetworkData.meta = Meta.new_();
                    }
                    if (verificationNetworkData.data != null) {
                        break;
                    }
                    verificationNetworkData.data = VerificationData.new_();
                    break;
                }
                if (iU == 10) {
                    verificationNetworkData.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (verificationNetworkData.meta == null) {
                            verificationNetworkData.meta = Meta.new_();
                        }
                        if (verificationNetworkData.data != null) {
                            break;
                        }
                        verificationNetworkData.data = VerificationData.new_();
                        return verificationNetworkData;
                    }
                    verificationNetworkData.data = (VerificationData) nb5Var.l(VerificationData.PROTOBUF_ADAPTER);
                }
            }
            return verificationNetworkData;
        }

        public void serialize(VerificationNetworkData verificationNetworkData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = verificationNetworkData.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            VerificationData verificationData = verificationNetworkData.data;
            if (verificationData != null) {
                codedOutputByteBufferNano.K(2, verificationData, VerificationData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationNetworkData> JSON_ADAPTER = new ObjectJsonAdapter<VerificationNetworkData>() { // from class: com.p1.mobile.putong.data.VerificationNetworkData.2
        public Class getDataClass() {
            return VerificationNetworkData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerificationNetworkData mo17830newInstance() {
            return new VerificationNetworkData();
        }

        public boolean parseField(VerificationNetworkData verificationNetworkData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                verificationNetworkData.data = (VerificationData) VerificationData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            verificationNetworkData.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VerificationNetworkData verificationNetworkData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(verificationNetworkData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationNetworkData verificationNetworkData, JsonGenerator jsonGenerator) throws IOException {
            if (verificationNetworkData.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(verificationNetworkData.meta, jsonGenerator, true);
            }
            if (verificationNetworkData.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                VerificationData.JSON_ADAPTER.serialize(verificationNetworkData.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationNetworkData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationNetworkData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationNetworkData new_() {
        VerificationNetworkData verificationNetworkData = new VerificationNetworkData();
        verificationNetworkData.nullCheck();
        return verificationNetworkData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationNetworkData m19264clone() {
        VerificationNetworkData verificationNetworkData = new VerificationNetworkData();
        Meta meta = this.meta;
        if (meta != null) {
            verificationNetworkData.meta = meta.m18461clone();
        }
        VerificationData verificationData = this.data;
        if (verificationData != null) {
            verificationNetworkData.data = verificationData.m19258clone();
        }
        return verificationNetworkData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationNetworkData)) {
            return false;
        }
        VerificationNetworkData verificationNetworkData = (VerificationNetworkData) obj;
        return ValueObject.util_equals(this.meta, verificationNetworkData.meta) && ValueObject.util_equals(this.data, verificationNetworkData.data);
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
        VerificationData verificationData = this.data;
        int iHashCode2 = iHashCode + (verificationData != null ? verificationData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = VerificationData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
