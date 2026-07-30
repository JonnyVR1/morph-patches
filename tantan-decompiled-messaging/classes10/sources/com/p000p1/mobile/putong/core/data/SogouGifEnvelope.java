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
public class SogouGifEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sogougifenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public SogouGifData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SogouGifEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<SogouGifEnvelope>() { // from class: com.p1.mobile.putong.core.data.SogouGifEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SogouGifEnvelope sogouGifEnvelope) {
            Meta meta = sogouGifEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SogouGifData sogouGifData = sogouGifEnvelope.data;
            if (sogouGifData != null) {
                iL += CodedOutputByteBufferNano.l(2, sogouGifData, SogouGifData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) sogouGifEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SogouGifEnvelope m15680parse(nb5 nb5Var) throws IOException {
            SogouGifEnvelope sogouGifEnvelope = new SogouGifEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (sogouGifEnvelope.meta == null) {
                        sogouGifEnvelope.meta = Meta.new_();
                    }
                    if (sogouGifEnvelope.data != null) {
                        break;
                    }
                    sogouGifEnvelope.data = SogouGifData.new_();
                    break;
                }
                if (iU == 10) {
                    sogouGifEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (sogouGifEnvelope.meta == null) {
                            sogouGifEnvelope.meta = Meta.new_();
                        }
                        if (sogouGifEnvelope.data != null) {
                            break;
                        }
                        sogouGifEnvelope.data = SogouGifData.new_();
                        return sogouGifEnvelope;
                    }
                    sogouGifEnvelope.data = (SogouGifData) nb5Var.l(SogouGifData.PROTOBUF_ADAPTER);
                }
            }
            return sogouGifEnvelope;
        }

        public void serialize(SogouGifEnvelope sogouGifEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = sogouGifEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SogouGifData sogouGifData = sogouGifEnvelope.data;
            if (sogouGifData != null) {
                codedOutputByteBufferNano.K(2, sogouGifData, SogouGifData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SogouGifEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<SogouGifEnvelope>() { // from class: com.p1.mobile.putong.core.data.SogouGifEnvelope.2
        public Class getDataClass() {
            return SogouGifEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SogouGifEnvelope m15681newInstance() {
            return new SogouGifEnvelope();
        }

        public boolean parseField(SogouGifEnvelope sogouGifEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                sogouGifEnvelope.data = (SogouGifData) SogouGifData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            sogouGifEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SogouGifEnvelope sogouGifEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(sogouGifEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SogouGifEnvelope sogouGifEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (sogouGifEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(sogouGifEnvelope.meta, jsonGenerator, true);
            }
            if (sogouGifEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                SogouGifData.JSON_ADAPTER.serialize(sogouGifEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SogouGifEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SogouGifEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SogouGifEnvelope new_() {
        SogouGifEnvelope sogouGifEnvelope = new SogouGifEnvelope();
        sogouGifEnvelope.nullCheck();
        return sogouGifEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SogouGifEnvelope m15679clone() {
        SogouGifEnvelope sogouGifEnvelope = new SogouGifEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            sogouGifEnvelope.meta = meta.clone();
        }
        SogouGifData sogouGifData = this.data;
        if (sogouGifData != null) {
            sogouGifEnvelope.data = sogouGifData.m15675clone();
        }
        return sogouGifEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SogouGifEnvelope)) {
            return false;
        }
        SogouGifEnvelope sogouGifEnvelope = (SogouGifEnvelope) obj;
        return ValueObject.util_equals(this.meta, sogouGifEnvelope.meta) && ValueObject.util_equals(this.data, sogouGifEnvelope.data);
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
        SogouGifData sogouGifData = this.data;
        int iHashCode2 = iHashCode + (sogouGifData != null ? sogouGifData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SogouGifData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
