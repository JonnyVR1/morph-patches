package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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

/* JADX INFO: loaded from: classes10.dex */
public class FreeTrialEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public FreeTrialData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<FreeTrialEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialEnvelope>() { // from class: com.p1.mobile.putong.core.data.FreeTrialEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FreeTrialEnvelope freeTrialEnvelope) {
            Meta meta = freeTrialEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            FreeTrialData freeTrialData = freeTrialEnvelope.data;
            if (freeTrialData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, freeTrialData, FreeTrialData.PROTOBUF_ADAPTER);
            }
            freeTrialEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FreeTrialEnvelope parse(nc5 nc5Var) throws IOException {
            FreeTrialEnvelope freeTrialEnvelope = new FreeTrialEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (freeTrialEnvelope.meta == null) {
                        freeTrialEnvelope.meta = Meta.new_();
                    }
                    if (freeTrialEnvelope.data != null) {
                        break;
                    }
                    freeTrialEnvelope.data = FreeTrialData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    freeTrialEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (freeTrialEnvelope.meta == null) {
                            freeTrialEnvelope.meta = Meta.new_();
                        }
                        if (freeTrialEnvelope.data != null) {
                            break;
                        }
                        freeTrialEnvelope.data = FreeTrialData.new_();
                        return freeTrialEnvelope;
                    }
                    freeTrialEnvelope.data = (FreeTrialData) nc5Var.m162488l(FreeTrialData.PROTOBUF_ADAPTER);
                }
            }
            return freeTrialEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FreeTrialEnvelope freeTrialEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = freeTrialEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            FreeTrialData freeTrialData = freeTrialEnvelope.data;
            if (freeTrialData != null) {
                codedOutputByteBufferNano.m17309K(2, freeTrialData, FreeTrialData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FreeTrialEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialEnvelope>() { // from class: com.p1.mobile.putong.core.data.FreeTrialEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FreeTrialEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FreeTrialEnvelope newInstance() {
            return new FreeTrialEnvelope();
        }

        public boolean parseField(FreeTrialEnvelope freeTrialEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                freeTrialEnvelope.data = FreeTrialData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            freeTrialEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FreeTrialEnvelope freeTrialEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(freeTrialEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FreeTrialEnvelope freeTrialEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (freeTrialEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(freeTrialEnvelope.meta, jsonGenerator, true);
            }
            if (freeTrialEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                FreeTrialData.JSON_ADAPTER.serialize(freeTrialEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialEnvelope new_() {
        FreeTrialEnvelope freeTrialEnvelope = new FreeTrialEnvelope();
        freeTrialEnvelope.nullCheck();
        return freeTrialEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FreeTrialEnvelope mo225055clone() {
        FreeTrialEnvelope freeTrialEnvelope = new FreeTrialEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            freeTrialEnvelope.meta = meta.mo225055clone();
        }
        FreeTrialData freeTrialData = this.data;
        if (freeTrialData != null) {
            freeTrialEnvelope.data = freeTrialData.mo225055clone();
        }
        return freeTrialEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeTrialEnvelope)) {
            return false;
        }
        FreeTrialEnvelope freeTrialEnvelope = (FreeTrialEnvelope) obj;
        return ValueObject.util_equals(this.meta, freeTrialEnvelope.meta) && ValueObject.util_equals(this.data, freeTrialEnvelope.data);
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
        FreeTrialData freeTrialData = this.data;
        int iHashCode2 = iHashCode + (freeTrialData != null ? freeTrialData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = FreeTrialData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
