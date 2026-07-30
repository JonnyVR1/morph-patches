package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsCounterEnvelope omsCounterEnvelope) {
            Meta meta = omsCounterEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            OmsCounter omsCounter = omsCounterEnvelope.data;
            if (omsCounter != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, omsCounter, OmsCounter.PROTOBUF_ADAPTER);
            }
            omsCounterEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsCounterEnvelope parse(nb5 nb5Var) throws IOException {
            OmsCounterEnvelope omsCounterEnvelope = new OmsCounterEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (omsCounterEnvelope.meta == null) {
                        omsCounterEnvelope.meta = Meta.new_();
                    }
                    if (omsCounterEnvelope.data != null) {
                        break;
                    }
                    omsCounterEnvelope.data = OmsCounter.new_();
                    break;
                }
                if (iM158752u == 10) {
                    omsCounterEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (omsCounterEnvelope.meta == null) {
                            omsCounterEnvelope.meta = Meta.new_();
                        }
                        if (omsCounterEnvelope.data != null) {
                            break;
                        }
                        omsCounterEnvelope.data = OmsCounter.new_();
                        return omsCounterEnvelope;
                    }
                    omsCounterEnvelope.data = (OmsCounter) nb5Var.m158743l(OmsCounter.PROTOBUF_ADAPTER);
                }
            }
            return omsCounterEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsCounterEnvelope omsCounterEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = omsCounterEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            OmsCounter omsCounter = omsCounterEnvelope.data;
            if (omsCounter != null) {
                codedOutputByteBufferNano.m17254K(2, omsCounter, OmsCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OmsCounterEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<OmsCounterEnvelope>() { // from class: com.p1.mobile.putong.data.OmsCounterEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsCounterEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsCounterEnvelope newInstance() {
            return new OmsCounterEnvelope();
        }

        public boolean parseField(OmsCounterEnvelope omsCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                omsCounterEnvelope.data = OmsCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            omsCounterEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OmsCounterEnvelope omsCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(omsCounterEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsCounterEnvelope omsCounterEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (omsCounterEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(omsCounterEnvelope.meta, jsonGenerator, true);
            }
            if (omsCounterEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                OmsCounter.JSON_ADAPTER.serialize(omsCounterEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsCounterEnvelope new_() {
        OmsCounterEnvelope omsCounterEnvelope = new OmsCounterEnvelope();
        omsCounterEnvelope.nullCheck();
        return omsCounterEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsCounterEnvelope mo223809clone() {
        OmsCounterEnvelope omsCounterEnvelope = new OmsCounterEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            omsCounterEnvelope.meta = meta.mo223809clone();
        }
        OmsCounter omsCounter = this.data;
        if (omsCounter != null) {
            omsCounterEnvelope.data = omsCounter.mo223809clone();
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
        OmsCounter omsCounter = this.data;
        int iHashCode2 = iHashCode + (omsCounter != null ? omsCounter.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = OmsCounter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
