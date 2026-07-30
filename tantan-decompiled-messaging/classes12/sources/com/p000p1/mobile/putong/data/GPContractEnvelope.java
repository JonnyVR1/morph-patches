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
public class GPContractEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpcontractenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public GPContractData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<GPContractEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPContractEnvelope>() { // from class: com.p1.mobile.putong.data.GPContractEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPContractEnvelope gPContractEnvelope) {
            Meta meta = gPContractEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GPContractData gPContractData = gPContractEnvelope.data;
            if (gPContractData != null) {
                iL += CodedOutputByteBufferNano.l(2, gPContractData, GPContractData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) gPContractEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPContractEnvelope m18142parse(nb5 nb5Var) throws IOException {
            GPContractEnvelope gPContractEnvelope = new GPContractEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPContractEnvelope.meta == null) {
                        gPContractEnvelope.meta = Meta.new_();
                    }
                    if (gPContractEnvelope.data != null) {
                        break;
                    }
                    gPContractEnvelope.data = GPContractData.new_();
                    break;
                }
                if (iU == 10) {
                    gPContractEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (gPContractEnvelope.meta == null) {
                            gPContractEnvelope.meta = Meta.new_();
                        }
                        if (gPContractEnvelope.data != null) {
                            break;
                        }
                        gPContractEnvelope.data = GPContractData.new_();
                        return gPContractEnvelope;
                    }
                    gPContractEnvelope.data = (GPContractData) nb5Var.l(GPContractData.PROTOBUF_ADAPTER);
                }
            }
            return gPContractEnvelope;
        }

        public void serialize(GPContractEnvelope gPContractEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPContractEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GPContractData gPContractData = gPContractEnvelope.data;
            if (gPContractData != null) {
                codedOutputByteBufferNano.K(2, gPContractData, GPContractData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPContractEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<GPContractEnvelope>() { // from class: com.p1.mobile.putong.data.GPContractEnvelope.2
        public Class getDataClass() {
            return GPContractEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GPContractEnvelope mo17830newInstance() {
            return new GPContractEnvelope();
        }

        public boolean parseField(GPContractEnvelope gPContractEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                gPContractEnvelope.data = (GPContractData) GPContractData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            gPContractEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPContractEnvelope gPContractEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(gPContractEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPContractEnvelope gPContractEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (gPContractEnvelope.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(gPContractEnvelope.meta, jsonGenerator, true);
            }
            if (gPContractEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                GPContractData.JSON_ADAPTER.serialize(gPContractEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContractEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPContractEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPContractEnvelope new_() {
        GPContractEnvelope gPContractEnvelope = new GPContractEnvelope();
        gPContractEnvelope.nullCheck();
        return gPContractEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPContractEnvelope m18141clone() {
        GPContractEnvelope gPContractEnvelope = new GPContractEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            gPContractEnvelope.meta = meta.m18461clone();
        }
        GPContractData gPContractData = this.data;
        if (gPContractData != null) {
            gPContractEnvelope.data = gPContractData.m18138clone();
        }
        return gPContractEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPContractEnvelope)) {
            return false;
        }
        GPContractEnvelope gPContractEnvelope = (GPContractEnvelope) obj;
        return ValueObject.util_equals(this.meta, gPContractEnvelope.meta) && ValueObject.util_equals(this.data, gPContractEnvelope.data);
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
        GPContractData gPContractData = this.data;
        int iHashCode2 = iHashCode + (gPContractData != null ? gPContractData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GPContractData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
