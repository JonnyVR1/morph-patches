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
public class GPMemoEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpmemoenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public GPMemoData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<GPMemoEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPMemoEnvelope>() { // from class: com.p1.mobile.putong.data.GPMemoEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPMemoEnvelope gPMemoEnvelope) {
            Meta meta = gPMemoEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GPMemoData gPMemoData = gPMemoEnvelope.data;
            if (gPMemoData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, gPMemoData, GPMemoData.PROTOBUF_ADAPTER);
            }
            gPMemoEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPMemoEnvelope parse(nc5 nc5Var) throws IOException {
            GPMemoEnvelope gPMemoEnvelope = new GPMemoEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPMemoEnvelope.meta == null) {
                        gPMemoEnvelope.meta = Meta.new_();
                    }
                    if (gPMemoEnvelope.data != null) {
                        break;
                    }
                    gPMemoEnvelope.data = GPMemoData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    gPMemoEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (gPMemoEnvelope.meta == null) {
                            gPMemoEnvelope.meta = Meta.new_();
                        }
                        if (gPMemoEnvelope.data != null) {
                            break;
                        }
                        gPMemoEnvelope.data = GPMemoData.new_();
                        return gPMemoEnvelope;
                    }
                    gPMemoEnvelope.data = (GPMemoData) nc5Var.m162488l(GPMemoData.PROTOBUF_ADAPTER);
                }
            }
            return gPMemoEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPMemoEnvelope gPMemoEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPMemoEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GPMemoData gPMemoData = gPMemoEnvelope.data;
            if (gPMemoData != null) {
                codedOutputByteBufferNano.m17309K(2, gPMemoData, GPMemoData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPMemoEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<GPMemoEnvelope>() { // from class: com.p1.mobile.putong.data.GPMemoEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPMemoEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPMemoEnvelope newInstance() {
            return new GPMemoEnvelope();
        }

        public boolean parseField(GPMemoEnvelope gPMemoEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                gPMemoEnvelope.data = GPMemoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            gPMemoEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPMemoEnvelope gPMemoEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(gPMemoEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPMemoEnvelope gPMemoEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (gPMemoEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(gPMemoEnvelope.meta, jsonGenerator, true);
            }
            if (gPMemoEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                GPMemoData.JSON_ADAPTER.serialize(gPMemoEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPMemoEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPMemoEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPMemoEnvelope new_() {
        GPMemoEnvelope gPMemoEnvelope = new GPMemoEnvelope();
        gPMemoEnvelope.nullCheck();
        return gPMemoEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPMemoEnvelope mo225055clone() {
        GPMemoEnvelope gPMemoEnvelope = new GPMemoEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            gPMemoEnvelope.meta = meta.mo225055clone();
        }
        GPMemoData gPMemoData = this.data;
        if (gPMemoData != null) {
            gPMemoEnvelope.data = gPMemoData.mo225055clone();
        }
        return gPMemoEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPMemoEnvelope)) {
            return false;
        }
        GPMemoEnvelope gPMemoEnvelope = (GPMemoEnvelope) obj;
        return ValueObject.util_equals(this.meta, gPMemoEnvelope.meta) && ValueObject.util_equals(this.data, gPMemoEnvelope.data);
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
        GPMemoData gPMemoData = this.data;
        int iHashCode2 = iHashCode + (gPMemoData != null ? gPMemoData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GPMemoData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
