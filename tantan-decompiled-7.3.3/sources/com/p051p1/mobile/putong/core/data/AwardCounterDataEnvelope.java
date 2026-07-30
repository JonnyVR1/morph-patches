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
public class AwardCounterDataEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "awardcounterdataenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public AwardCounter data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AwardCounterDataEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AwardCounterDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.AwardCounterDataEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AwardCounterDataEnvelope awardCounterDataEnvelope) {
            Meta meta = awardCounterDataEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AwardCounter awardCounter = awardCounterDataEnvelope.data;
            if (awardCounter != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, awardCounter, AwardCounter.PROTOBUF_ADAPTER);
            }
            awardCounterDataEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AwardCounterDataEnvelope parse(nc5 nc5Var) throws IOException {
            AwardCounterDataEnvelope awardCounterDataEnvelope = new AwardCounterDataEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (awardCounterDataEnvelope.meta == null) {
                        awardCounterDataEnvelope.meta = Meta.new_();
                    }
                    if (awardCounterDataEnvelope.data != null) {
                        break;
                    }
                    awardCounterDataEnvelope.data = AwardCounter.new_();
                    break;
                }
                if (iM162497u == 10) {
                    awardCounterDataEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (awardCounterDataEnvelope.meta == null) {
                            awardCounterDataEnvelope.meta = Meta.new_();
                        }
                        if (awardCounterDataEnvelope.data != null) {
                            break;
                        }
                        awardCounterDataEnvelope.data = AwardCounter.new_();
                        return awardCounterDataEnvelope;
                    }
                    awardCounterDataEnvelope.data = (AwardCounter) nc5Var.m162488l(AwardCounter.PROTOBUF_ADAPTER);
                }
            }
            return awardCounterDataEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AwardCounterDataEnvelope awardCounterDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = awardCounterDataEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AwardCounter awardCounter = awardCounterDataEnvelope.data;
            if (awardCounter != null) {
                codedOutputByteBufferNano.m17309K(2, awardCounter, AwardCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AwardCounterDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AwardCounterDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.AwardCounterDataEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AwardCounterDataEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AwardCounterDataEnvelope newInstance() {
            return new AwardCounterDataEnvelope();
        }

        public boolean parseField(AwardCounterDataEnvelope awardCounterDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                awardCounterDataEnvelope.data = AwardCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            awardCounterDataEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AwardCounterDataEnvelope awardCounterDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(awardCounterDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AwardCounterDataEnvelope awardCounterDataEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (awardCounterDataEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(awardCounterDataEnvelope.meta, jsonGenerator, true);
            }
            if (awardCounterDataEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                AwardCounter.JSON_ADAPTER.serialize(awardCounterDataEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AwardCounterDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AwardCounterDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AwardCounterDataEnvelope new_() {
        AwardCounterDataEnvelope awardCounterDataEnvelope = new AwardCounterDataEnvelope();
        awardCounterDataEnvelope.nullCheck();
        return awardCounterDataEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AwardCounterDataEnvelope mo225055clone() {
        AwardCounterDataEnvelope awardCounterDataEnvelope = new AwardCounterDataEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            awardCounterDataEnvelope.meta = meta.mo225055clone();
        }
        AwardCounter awardCounter = this.data;
        if (awardCounter != null) {
            awardCounterDataEnvelope.data = awardCounter.mo225055clone();
        }
        return awardCounterDataEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwardCounterDataEnvelope)) {
            return false;
        }
        AwardCounterDataEnvelope awardCounterDataEnvelope = (AwardCounterDataEnvelope) obj;
        return ValueObject.util_equals(this.meta, awardCounterDataEnvelope.meta) && ValueObject.util_equals(this.data, awardCounterDataEnvelope.data);
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
        AwardCounter awardCounter = this.data;
        int iHashCode2 = iHashCode + (awardCounter != null ? awardCounter.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AwardCounter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
