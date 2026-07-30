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
public class SeeBlindBoxEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeblindboxenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public SeeBlindBoxData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SeeBlindBoxEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeBlindBoxEnvelope>() { // from class: com.p1.mobile.putong.core.data.SeeBlindBoxEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeBlindBoxEnvelope seeBlindBoxEnvelope) {
            Meta meta = seeBlindBoxEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SeeBlindBoxData seeBlindBoxData = seeBlindBoxEnvelope.data;
            if (seeBlindBoxData != null) {
                iL += CodedOutputByteBufferNano.l(2, seeBlindBoxData, SeeBlindBoxData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) seeBlindBoxEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeBlindBoxEnvelope m15507parse(nb5 nb5Var) throws IOException {
            SeeBlindBoxEnvelope seeBlindBoxEnvelope = new SeeBlindBoxEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seeBlindBoxEnvelope.meta == null) {
                        seeBlindBoxEnvelope.meta = Meta.new_();
                    }
                    if (seeBlindBoxEnvelope.data != null) {
                        break;
                    }
                    seeBlindBoxEnvelope.data = SeeBlindBoxData.new_();
                    break;
                }
                if (iU == 10) {
                    seeBlindBoxEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (seeBlindBoxEnvelope.meta == null) {
                            seeBlindBoxEnvelope.meta = Meta.new_();
                        }
                        if (seeBlindBoxEnvelope.data != null) {
                            break;
                        }
                        seeBlindBoxEnvelope.data = SeeBlindBoxData.new_();
                        return seeBlindBoxEnvelope;
                    }
                    seeBlindBoxEnvelope.data = (SeeBlindBoxData) nb5Var.l(SeeBlindBoxData.PROTOBUF_ADAPTER);
                }
            }
            return seeBlindBoxEnvelope;
        }

        public void serialize(SeeBlindBoxEnvelope seeBlindBoxEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = seeBlindBoxEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SeeBlindBoxData seeBlindBoxData = seeBlindBoxEnvelope.data;
            if (seeBlindBoxData != null) {
                codedOutputByteBufferNano.K(2, seeBlindBoxData, SeeBlindBoxData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SeeBlindBoxEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<SeeBlindBoxEnvelope>() { // from class: com.p1.mobile.putong.core.data.SeeBlindBoxEnvelope.2
        public Class getDataClass() {
            return SeeBlindBoxEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeBlindBoxEnvelope m15508newInstance() {
            return new SeeBlindBoxEnvelope();
        }

        public boolean parseField(SeeBlindBoxEnvelope seeBlindBoxEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                seeBlindBoxEnvelope.data = (SeeBlindBoxData) SeeBlindBoxData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            seeBlindBoxEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SeeBlindBoxEnvelope seeBlindBoxEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(seeBlindBoxEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeBlindBoxEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeBlindBoxEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeBlindBoxEnvelope new_() {
        SeeBlindBoxEnvelope seeBlindBoxEnvelope = new SeeBlindBoxEnvelope();
        seeBlindBoxEnvelope.nullCheck();
        return seeBlindBoxEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeBlindBoxEnvelope m15506clone() {
        SeeBlindBoxEnvelope seeBlindBoxEnvelope = new SeeBlindBoxEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            seeBlindBoxEnvelope.meta = meta.clone();
        }
        SeeBlindBoxData seeBlindBoxData = this.data;
        if (seeBlindBoxData != null) {
            seeBlindBoxEnvelope.data = seeBlindBoxData.m15502clone();
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
        SeeBlindBoxData seeBlindBoxData = this.data;
        int iHashCode2 = iHashCode + (seeBlindBoxData != null ? seeBlindBoxData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SeeBlindBoxData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
