package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class IntlMarketConfigEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketconfigenvelope";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlMarketConfigData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlMarketConfigEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
            Meta meta = intlMarketConfigEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlMarketConfigData intlMarketConfigData = intlMarketConfigEnvelope.data;
            if (intlMarketConfigData != null) {
                iL += CodedOutputByteBufferNano.l(2, intlMarketConfigData, IntlMarketConfigData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlMarketConfigEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketConfigEnvelope m13587parse(nb5 nb5Var) throws IOException {
            IntlMarketConfigEnvelope intlMarketConfigEnvelope = new IntlMarketConfigEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketConfigEnvelope.meta != null) {
                        break;
                    }
                    intlMarketConfigEnvelope.meta = Meta.new_();
                    break;
                }
                if (iU == 10) {
                    intlMarketConfigEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlMarketConfigEnvelope.meta != null) {
                            break;
                        }
                        intlMarketConfigEnvelope.meta = Meta.new_();
                        return intlMarketConfigEnvelope;
                    }
                    intlMarketConfigEnvelope.data = (IntlMarketConfigData) nb5Var.l(IntlMarketConfigData.PROTOBUF_ADAPTER);
                }
            }
            return intlMarketConfigEnvelope;
        }

        public void serialize(IntlMarketConfigEnvelope intlMarketConfigEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlMarketConfigEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlMarketConfigData intlMarketConfigData = intlMarketConfigEnvelope.data;
            if (intlMarketConfigData != null) {
                codedOutputByteBufferNano.K(2, intlMarketConfigData, IntlMarketConfigData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlMarketConfigEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope.2
        public Class getDataClass() {
            return IntlMarketConfigEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketConfigEnvelope m13588newInstance() {
            return new IntlMarketConfigEnvelope();
        }

        public boolean parseField(IntlMarketConfigEnvelope intlMarketConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlMarketConfigEnvelope.data = (IntlMarketConfigData) IntlMarketConfigData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlMarketConfigEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlMarketConfigEnvelope intlMarketConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlMarketConfigEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlMarketConfigEnvelope intlMarketConfigEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlMarketConfigEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlMarketConfigEnvelope.meta, jsonGenerator, true);
            }
            if (intlMarketConfigEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlMarketConfigData.JSON_ADAPTER.serialize(intlMarketConfigEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketConfigEnvelope new_() {
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = new IntlMarketConfigEnvelope();
        intlMarketConfigEnvelope.nullCheck();
        return intlMarketConfigEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketConfigEnvelope m13586clone() {
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = new IntlMarketConfigEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlMarketConfigEnvelope.meta = meta.clone();
        }
        IntlMarketConfigData intlMarketConfigData = this.data;
        if (intlMarketConfigData != null) {
            intlMarketConfigEnvelope.data = intlMarketConfigData.m13574clone();
        }
        return intlMarketConfigEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketConfigEnvelope)) {
            return false;
        }
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = (IntlMarketConfigEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlMarketConfigEnvelope.meta) && ValueObject.util_equals(this.data, intlMarketConfigEnvelope.data);
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
        IntlMarketConfigData intlMarketConfigData = this.data;
        int iHashCode2 = iHashCode + (intlMarketConfigData != null ? intlMarketConfigData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
