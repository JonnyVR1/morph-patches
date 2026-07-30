package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class StartSpotLightEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "startspotlightenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public StartSpotLightData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<StartSpotLightEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<StartSpotLightEnvelope>() { // from class: com.p1.mobile.putong.core.data.StartSpotLightEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StartSpotLightEnvelope startSpotLightEnvelope) {
            Meta meta = startSpotLightEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            StartSpotLightData startSpotLightData = startSpotLightEnvelope.data;
            if (startSpotLightData != null) {
                iL += CodedOutputByteBufferNano.l(2, startSpotLightData, StartSpotLightData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) startSpotLightEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StartSpotLightEnvelope m15750parse(nb5 nb5Var) throws IOException {
            StartSpotLightEnvelope startSpotLightEnvelope = new StartSpotLightEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (startSpotLightEnvelope.meta == null) {
                        startSpotLightEnvelope.meta = Meta.new_();
                    }
                    if (startSpotLightEnvelope.data != null) {
                        break;
                    }
                    startSpotLightEnvelope.data = StartSpotLightData.new_();
                    break;
                }
                if (iU == 10) {
                    startSpotLightEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (startSpotLightEnvelope.meta == null) {
                            startSpotLightEnvelope.meta = Meta.new_();
                        }
                        if (startSpotLightEnvelope.data != null) {
                            break;
                        }
                        startSpotLightEnvelope.data = StartSpotLightData.new_();
                        return startSpotLightEnvelope;
                    }
                    startSpotLightEnvelope.data = (StartSpotLightData) nb5Var.l(StartSpotLightData.PROTOBUF_ADAPTER);
                }
            }
            return startSpotLightEnvelope;
        }

        public void serialize(StartSpotLightEnvelope startSpotLightEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = startSpotLightEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            StartSpotLightData startSpotLightData = startSpotLightEnvelope.data;
            if (startSpotLightData != null) {
                codedOutputByteBufferNano.K(2, startSpotLightData, StartSpotLightData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<StartSpotLightEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<StartSpotLightEnvelope>() { // from class: com.p1.mobile.putong.core.data.StartSpotLightEnvelope.2
        public Class getDataClass() {
            return StartSpotLightEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public StartSpotLightEnvelope m15751newInstance() {
            return new StartSpotLightEnvelope();
        }

        public boolean parseField(StartSpotLightEnvelope startSpotLightEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                startSpotLightEnvelope.data = (StartSpotLightData) StartSpotLightData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            startSpotLightEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(StartSpotLightEnvelope startSpotLightEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(startSpotLightEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StartSpotLightEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StartSpotLightEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StartSpotLightEnvelope new_() {
        StartSpotLightEnvelope startSpotLightEnvelope = new StartSpotLightEnvelope();
        startSpotLightEnvelope.nullCheck();
        return startSpotLightEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StartSpotLightEnvelope m15749clone() {
        StartSpotLightEnvelope startSpotLightEnvelope = new StartSpotLightEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            startSpotLightEnvelope.meta = meta.clone();
        }
        StartSpotLightData startSpotLightData = this.data;
        if (startSpotLightData != null) {
            startSpotLightEnvelope.data = startSpotLightData.m15745clone();
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
        StartSpotLightData startSpotLightData = this.data;
        int iHashCode2 = iHashCode + (startSpotLightData != null ? startSpotLightData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = StartSpotLightData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
