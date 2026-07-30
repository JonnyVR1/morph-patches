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
public class SeeBlindBoxEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeblindboxenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public SeeBlindBoxData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SeeBlindBoxEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeBlindBoxEnvelope>() { // from class: com.p1.mobile.putong.core.data.SeeBlindBoxEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeBlindBoxEnvelope seeBlindBoxEnvelope) {
            Meta meta = seeBlindBoxEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SeeBlindBoxData seeBlindBoxData = seeBlindBoxEnvelope.data;
            if (seeBlindBoxData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, seeBlindBoxData, SeeBlindBoxData.PROTOBUF_ADAPTER);
            }
            seeBlindBoxEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeBlindBoxEnvelope parse(nc5 nc5Var) throws IOException {
            SeeBlindBoxEnvelope seeBlindBoxEnvelope = new SeeBlindBoxEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (seeBlindBoxEnvelope.meta == null) {
                        seeBlindBoxEnvelope.meta = Meta.new_();
                    }
                    if (seeBlindBoxEnvelope.data != null) {
                        break;
                    }
                    seeBlindBoxEnvelope.data = SeeBlindBoxData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    seeBlindBoxEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (seeBlindBoxEnvelope.meta == null) {
                            seeBlindBoxEnvelope.meta = Meta.new_();
                        }
                        if (seeBlindBoxEnvelope.data != null) {
                            break;
                        }
                        seeBlindBoxEnvelope.data = SeeBlindBoxData.new_();
                        return seeBlindBoxEnvelope;
                    }
                    seeBlindBoxEnvelope.data = (SeeBlindBoxData) nc5Var.m162488l(SeeBlindBoxData.PROTOBUF_ADAPTER);
                }
            }
            return seeBlindBoxEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeBlindBoxEnvelope seeBlindBoxEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = seeBlindBoxEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SeeBlindBoxData seeBlindBoxData = seeBlindBoxEnvelope.data;
            if (seeBlindBoxData != null) {
                codedOutputByteBufferNano.m17309K(2, seeBlindBoxData, SeeBlindBoxData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SeeBlindBoxEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<SeeBlindBoxEnvelope>() { // from class: com.p1.mobile.putong.core.data.SeeBlindBoxEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeBlindBoxEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeBlindBoxEnvelope newInstance() {
            return new SeeBlindBoxEnvelope();
        }

        public boolean parseField(SeeBlindBoxEnvelope seeBlindBoxEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                seeBlindBoxEnvelope.data = SeeBlindBoxData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            seeBlindBoxEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SeeBlindBoxEnvelope seeBlindBoxEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(seeBlindBoxEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeBlindBoxEnvelope seeBlindBoxEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (seeBlindBoxEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(seeBlindBoxEnvelope.meta, jsonGenerator, true);
            }
            if (seeBlindBoxEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                SeeBlindBoxData.JSON_ADAPTER.serialize(seeBlindBoxEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeBlindBoxEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeBlindBoxEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeBlindBoxEnvelope new_() {
        SeeBlindBoxEnvelope seeBlindBoxEnvelope = new SeeBlindBoxEnvelope();
        seeBlindBoxEnvelope.nullCheck();
        return seeBlindBoxEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeBlindBoxEnvelope mo225055clone() {
        SeeBlindBoxEnvelope seeBlindBoxEnvelope = new SeeBlindBoxEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            seeBlindBoxEnvelope.meta = meta.mo225055clone();
        }
        SeeBlindBoxData seeBlindBoxData = this.data;
        if (seeBlindBoxData != null) {
            seeBlindBoxEnvelope.data = seeBlindBoxData.mo225055clone();
        }
        return seeBlindBoxEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeBlindBoxEnvelope)) {
            return false;
        }
        SeeBlindBoxEnvelope seeBlindBoxEnvelope = (SeeBlindBoxEnvelope) obj;
        return ValueObject.util_equals(this.meta, seeBlindBoxEnvelope.meta) && ValueObject.util_equals(this.data, seeBlindBoxEnvelope.data);
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
        SeeBlindBoxData seeBlindBoxData = this.data;
        int iHashCode2 = iHashCode + (seeBlindBoxData != null ? seeBlindBoxData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SeeBlindBoxData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
