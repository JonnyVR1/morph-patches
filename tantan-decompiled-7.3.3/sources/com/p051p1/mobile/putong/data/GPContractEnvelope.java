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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPContractEnvelope gPContractEnvelope) {
            Meta meta = gPContractEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GPContractData gPContractData = gPContractEnvelope.data;
            if (gPContractData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, gPContractData, GPContractData.PROTOBUF_ADAPTER);
            }
            gPContractEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPContractEnvelope parse(nc5 nc5Var) throws IOException {
            GPContractEnvelope gPContractEnvelope = new GPContractEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPContractEnvelope.meta == null) {
                        gPContractEnvelope.meta = Meta.new_();
                    }
                    if (gPContractEnvelope.data != null) {
                        break;
                    }
                    gPContractEnvelope.data = GPContractData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    gPContractEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (gPContractEnvelope.meta == null) {
                            gPContractEnvelope.meta = Meta.new_();
                        }
                        if (gPContractEnvelope.data != null) {
                            break;
                        }
                        gPContractEnvelope.data = GPContractData.new_();
                        return gPContractEnvelope;
                    }
                    gPContractEnvelope.data = (GPContractData) nc5Var.m162488l(GPContractData.PROTOBUF_ADAPTER);
                }
            }
            return gPContractEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPContractEnvelope gPContractEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPContractEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GPContractData gPContractData = gPContractEnvelope.data;
            if (gPContractData != null) {
                codedOutputByteBufferNano.m17309K(2, gPContractData, GPContractData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPContractEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<GPContractEnvelope>() { // from class: com.p1.mobile.putong.data.GPContractEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPContractEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPContractEnvelope newInstance() {
            return new GPContractEnvelope();
        }

        public boolean parseField(GPContractEnvelope gPContractEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                gPContractEnvelope.data = GPContractData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            gPContractEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPContractEnvelope gPContractEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(gPContractEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPContractEnvelope gPContractEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (gPContractEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(gPContractEnvelope.meta, jsonGenerator, true);
            }
            if (gPContractEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                GPContractData.JSON_ADAPTER.serialize(gPContractEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContractEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPContractEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPContractEnvelope new_() {
        GPContractEnvelope gPContractEnvelope = new GPContractEnvelope();
        gPContractEnvelope.nullCheck();
        return gPContractEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPContractEnvelope mo225055clone() {
        GPContractEnvelope gPContractEnvelope = new GPContractEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            gPContractEnvelope.meta = meta.mo225055clone();
        }
        GPContractData gPContractData = this.data;
        if (gPContractData != null) {
            gPContractEnvelope.data = gPContractData.mo225055clone();
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
        GPContractData gPContractData = this.data;
        int iHashCode2 = iHashCode + (gPContractData != null ? gPContractData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GPContractData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
