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
public class OMSConfigEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsconfigenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<OMSConfigEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSConfigEnvelope>() { // from class: com.p1.mobile.putong.data.OMSConfigEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSConfigEnvelope oMSConfigEnvelope) {
            Meta meta = oMSConfigEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            OMSData oMSData = oMSConfigEnvelope.data;
            if (oMSData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, oMSData, OMSData.PROTOBUF_ADAPTER);
            }
            oMSConfigEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSConfigEnvelope parse(nb5 nb5Var) throws IOException {
            OMSConfigEnvelope oMSConfigEnvelope = new OMSConfigEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSConfigEnvelope.meta == null) {
                        oMSConfigEnvelope.meta = Meta.new_();
                    }
                    if (oMSConfigEnvelope.data != null) {
                        break;
                    }
                    oMSConfigEnvelope.data = OMSData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    oMSConfigEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (oMSConfigEnvelope.meta == null) {
                            oMSConfigEnvelope.meta = Meta.new_();
                        }
                        if (oMSConfigEnvelope.data != null) {
                            break;
                        }
                        oMSConfigEnvelope.data = OMSData.new_();
                        return oMSConfigEnvelope;
                    }
                    oMSConfigEnvelope.data = (OMSData) nb5Var.m158743l(OMSData.PROTOBUF_ADAPTER);
                }
            }
            return oMSConfigEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSConfigEnvelope oMSConfigEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = oMSConfigEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            OMSData oMSData = oMSConfigEnvelope.data;
            if (oMSData != null) {
                codedOutputByteBufferNano.m17254K(2, oMSData, OMSData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSConfigEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<OMSConfigEnvelope>() { // from class: com.p1.mobile.putong.data.OMSConfigEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSConfigEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSConfigEnvelope newInstance() {
            return new OMSConfigEnvelope();
        }

        public boolean parseField(OMSConfigEnvelope oMSConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                oMSConfigEnvelope.data = OMSData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            oMSConfigEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSConfigEnvelope oMSConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(oMSConfigEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSConfigEnvelope oMSConfigEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (oMSConfigEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(oMSConfigEnvelope.meta, jsonGenerator, true);
            }
            if (oMSConfigEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                OMSData.JSON_ADAPTER.serialize(oMSConfigEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSConfigEnvelope new_() {
        OMSConfigEnvelope oMSConfigEnvelope = new OMSConfigEnvelope();
        oMSConfigEnvelope.nullCheck();
        return oMSConfigEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSConfigEnvelope mo223809clone() {
        OMSConfigEnvelope oMSConfigEnvelope = new OMSConfigEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            oMSConfigEnvelope.meta = meta.mo223809clone();
        }
        OMSData oMSData = this.data;
        if (oMSData != null) {
            oMSConfigEnvelope.data = oMSData.mo223809clone();
        }
        return oMSConfigEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSConfigEnvelope)) {
            return false;
        }
        OMSConfigEnvelope oMSConfigEnvelope = (OMSConfigEnvelope) obj;
        return ValueObject.util_equals(this.meta, oMSConfigEnvelope.meta) && ValueObject.util_equals(this.data, oMSConfigEnvelope.data);
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
        OMSData oMSData = this.data;
        int iHashCode2 = iHashCode + (oMSData != null ? oMSData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = OMSData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
