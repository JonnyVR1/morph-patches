package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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

/* JADX INFO: loaded from: classes10.dex */
public class StartSpotLightEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "startspotlightenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public StartSpotLightData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<StartSpotLightEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<StartSpotLightEnvelope>() { // from class: com.p1.mobile.putong.core.data.StartSpotLightEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StartSpotLightEnvelope startSpotLightEnvelope) {
            Meta meta = startSpotLightEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            StartSpotLightData startSpotLightData = startSpotLightEnvelope.data;
            if (startSpotLightData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, startSpotLightData, StartSpotLightData.PROTOBUF_ADAPTER);
            }
            startSpotLightEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StartSpotLightEnvelope parse(nb5 nb5Var) throws IOException {
            StartSpotLightEnvelope startSpotLightEnvelope = new StartSpotLightEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (startSpotLightEnvelope.meta == null) {
                        startSpotLightEnvelope.meta = Meta.new_();
                    }
                    if (startSpotLightEnvelope.data != null) {
                        break;
                    }
                    startSpotLightEnvelope.data = StartSpotLightData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    startSpotLightEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (startSpotLightEnvelope.meta == null) {
                            startSpotLightEnvelope.meta = Meta.new_();
                        }
                        if (startSpotLightEnvelope.data != null) {
                            break;
                        }
                        startSpotLightEnvelope.data = StartSpotLightData.new_();
                        return startSpotLightEnvelope;
                    }
                    startSpotLightEnvelope.data = (StartSpotLightData) nb5Var.m158743l(StartSpotLightData.PROTOBUF_ADAPTER);
                }
            }
            return startSpotLightEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StartSpotLightEnvelope startSpotLightEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = startSpotLightEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            StartSpotLightData startSpotLightData = startSpotLightEnvelope.data;
            if (startSpotLightData != null) {
                codedOutputByteBufferNano.m17254K(2, startSpotLightData, StartSpotLightData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<StartSpotLightEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<StartSpotLightEnvelope>() { // from class: com.p1.mobile.putong.core.data.StartSpotLightEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StartSpotLightEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StartSpotLightEnvelope newInstance() {
            return new StartSpotLightEnvelope();
        }

        public boolean parseField(StartSpotLightEnvelope startSpotLightEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                startSpotLightEnvelope.data = StartSpotLightData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            startSpotLightEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(StartSpotLightEnvelope startSpotLightEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(startSpotLightEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StartSpotLightEnvelope startSpotLightEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (startSpotLightEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(startSpotLightEnvelope.meta, jsonGenerator, true);
            }
            if (startSpotLightEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                StartSpotLightData.JSON_ADAPTER.serialize(startSpotLightEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StartSpotLightEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StartSpotLightEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StartSpotLightEnvelope new_() {
        StartSpotLightEnvelope startSpotLightEnvelope = new StartSpotLightEnvelope();
        startSpotLightEnvelope.nullCheck();
        return startSpotLightEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StartSpotLightEnvelope mo223809clone() {
        StartSpotLightEnvelope startSpotLightEnvelope = new StartSpotLightEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            startSpotLightEnvelope.meta = meta.mo223809clone();
        }
        StartSpotLightData startSpotLightData = this.data;
        if (startSpotLightData != null) {
            startSpotLightEnvelope.data = startSpotLightData.mo223809clone();
        }
        return startSpotLightEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartSpotLightEnvelope)) {
            return false;
        }
        StartSpotLightEnvelope startSpotLightEnvelope = (StartSpotLightEnvelope) obj;
        return ValueObject.util_equals(this.meta, startSpotLightEnvelope.meta) && ValueObject.util_equals(this.data, startSpotLightEnvelope.data);
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
        StartSpotLightData startSpotLightData = this.data;
        int iHashCode2 = iHashCode + (startSpotLightData != null ? startSpotLightData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = StartSpotLightData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
