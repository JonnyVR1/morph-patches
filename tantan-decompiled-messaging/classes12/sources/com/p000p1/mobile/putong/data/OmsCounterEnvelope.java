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
public class OmsCounterEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omscounterenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public OmsCounter data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<OmsCounterEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsCounterEnvelope>() { // from class: com.p1.mobile.putong.data.OmsCounterEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OmsCounterEnvelope omsCounterEnvelope) {
            Meta meta = omsCounterEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            OmsCounter omsCounter = omsCounterEnvelope.data;
            if (omsCounter != null) {
                iL += CodedOutputByteBufferNano.l(2, omsCounter, OmsCounter.PROTOBUF_ADAPTER);
            }
            ((MessageNano) omsCounterEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OmsCounterEnvelope m18717parse(nb5 nb5Var) throws IOException {
            OmsCounterEnvelope omsCounterEnvelope = new OmsCounterEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (omsCounterEnvelope.meta == null) {
                        omsCounterEnvelope.meta = Meta.new_();
                    }
                    if (omsCounterEnvelope.data != null) {
                        break;
                    }
                    omsCounterEnvelope.data = OmsCounter.new_();
                    break;
                }
                if (iU == 10) {
                    omsCounterEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (omsCounterEnvelope.meta == null) {
                            omsCounterEnvelope.meta = Meta.new_();
                        }
                        if (omsCounterEnvelope.data != null) {
                            break;
                        }
                        omsCounterEnvelope.data = OmsCounter.new_();
                        return omsCounterEnvelope;
                    }
                    omsCounterEnvelope.data = (OmsCounter) nb5Var.l(OmsCounter.PROTOBUF_ADAPTER);
                }
            }
            return omsCounterEnvelope;
        }

        public void serialize(OmsCounterEnvelope omsCounterEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = omsCounterEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            OmsCounter omsCounter = omsCounterEnvelope.data;
            if (omsCounter != null) {
                codedOutputByteBufferNano.K(2, omsCounter, OmsCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OmsCounterEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<OmsCounterEnvelope>() { // from class: com.p1.mobile.putong.data.OmsCounterEnvelope.2
        public Class getDataClass() {
            return OmsCounterEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OmsCounterEnvelope mo17830newInstance() {
            return new OmsCounterEnvelope();
        }

        public boolean parseField(OmsCounterEnvelope omsCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                omsCounterEnvelope.data = (OmsCounter) OmsCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            omsCounterEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OmsCounterEnvelope omsCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(omsCounterEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsCounterEnvelope omsCounterEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (omsCounterEnvelope.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(omsCounterEnvelope.meta, jsonGenerator, true);
            }
            if (omsCounterEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                OmsCounter.JSON_ADAPTER.serialize(omsCounterEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsCounterEnvelope new_() {
        OmsCounterEnvelope omsCounterEnvelope = new OmsCounterEnvelope();
        omsCounterEnvelope.nullCheck();
        return omsCounterEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OmsCounterEnvelope m18716clone() {
        OmsCounterEnvelope omsCounterEnvelope = new OmsCounterEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            omsCounterEnvelope.meta = meta.m18461clone();
        }
        OmsCounter omsCounter = this.data;
        if (omsCounter != null) {
            omsCounterEnvelope.data = omsCounter.m18713clone();
        }
        return omsCounterEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsCounterEnvelope)) {
            return false;
        }
        OmsCounterEnvelope omsCounterEnvelope = (OmsCounterEnvelope) obj;
        return ValueObject.util_equals(this.meta, omsCounterEnvelope.meta) && ValueObject.util_equals(this.data, omsCounterEnvelope.data);
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
        OmsCounter omsCounter = this.data;
        int iHashCode2 = iHashCode + (omsCounter != null ? omsCounter.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = OmsCounter.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
