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
public class SpotLightForceMatchEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightforcematchenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public SpotLightForceMatchData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SpotLightForceMatchEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightForceMatchEnvelope>() { // from class: com.p1.mobile.putong.core.data.SpotLightForceMatchEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpotLightForceMatchEnvelope spotLightForceMatchEnvelope) {
            Meta meta = spotLightForceMatchEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SpotLightForceMatchData spotLightForceMatchData = spotLightForceMatchEnvelope.data;
            if (spotLightForceMatchData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, spotLightForceMatchData, SpotLightForceMatchData.PROTOBUF_ADAPTER);
            }
            spotLightForceMatchEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpotLightForceMatchEnvelope parse(nc5 nc5Var) throws IOException {
            SpotLightForceMatchEnvelope spotLightForceMatchEnvelope = new SpotLightForceMatchEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (spotLightForceMatchEnvelope.meta == null) {
                        spotLightForceMatchEnvelope.meta = Meta.new_();
                    }
                    if (spotLightForceMatchEnvelope.data != null) {
                        break;
                    }
                    spotLightForceMatchEnvelope.data = SpotLightForceMatchData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    spotLightForceMatchEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (spotLightForceMatchEnvelope.meta == null) {
                            spotLightForceMatchEnvelope.meta = Meta.new_();
                        }
                        if (spotLightForceMatchEnvelope.data != null) {
                            break;
                        }
                        spotLightForceMatchEnvelope.data = SpotLightForceMatchData.new_();
                        return spotLightForceMatchEnvelope;
                    }
                    spotLightForceMatchEnvelope.data = (SpotLightForceMatchData) nc5Var.m162488l(SpotLightForceMatchData.PROTOBUF_ADAPTER);
                }
            }
            return spotLightForceMatchEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpotLightForceMatchEnvelope spotLightForceMatchEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = spotLightForceMatchEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SpotLightForceMatchData spotLightForceMatchData = spotLightForceMatchEnvelope.data;
            if (spotLightForceMatchData != null) {
                codedOutputByteBufferNano.m17309K(2, spotLightForceMatchData, SpotLightForceMatchData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SpotLightForceMatchEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightForceMatchEnvelope>() { // from class: com.p1.mobile.putong.core.data.SpotLightForceMatchEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpotLightForceMatchEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpotLightForceMatchEnvelope newInstance() {
            return new SpotLightForceMatchEnvelope();
        }

        public boolean parseField(SpotLightForceMatchEnvelope spotLightForceMatchEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                spotLightForceMatchEnvelope.data = SpotLightForceMatchData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            spotLightForceMatchEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SpotLightForceMatchEnvelope spotLightForceMatchEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(spotLightForceMatchEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpotLightForceMatchEnvelope spotLightForceMatchEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (spotLightForceMatchEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(spotLightForceMatchEnvelope.meta, jsonGenerator, true);
            }
            if (spotLightForceMatchEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                SpotLightForceMatchData.JSON_ADAPTER.serialize(spotLightForceMatchEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightForceMatchEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightForceMatchEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightForceMatchEnvelope new_() {
        SpotLightForceMatchEnvelope spotLightForceMatchEnvelope = new SpotLightForceMatchEnvelope();
        spotLightForceMatchEnvelope.nullCheck();
        return spotLightForceMatchEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpotLightForceMatchEnvelope mo225055clone() {
        SpotLightForceMatchEnvelope spotLightForceMatchEnvelope = new SpotLightForceMatchEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            spotLightForceMatchEnvelope.meta = meta.mo225055clone();
        }
        SpotLightForceMatchData spotLightForceMatchData = this.data;
        if (spotLightForceMatchData != null) {
            spotLightForceMatchEnvelope.data = spotLightForceMatchData.mo225055clone();
        }
        return spotLightForceMatchEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotLightForceMatchEnvelope)) {
            return false;
        }
        SpotLightForceMatchEnvelope spotLightForceMatchEnvelope = (SpotLightForceMatchEnvelope) obj;
        return ValueObject.util_equals(this.meta, spotLightForceMatchEnvelope.meta) && ValueObject.util_equals(this.data, spotLightForceMatchEnvelope.data);
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
        SpotLightForceMatchData spotLightForceMatchData = this.data;
        int iHashCode2 = iHashCode + (spotLightForceMatchData != null ? spotLightForceMatchData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SpotLightForceMatchData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
