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
public class IntlMarketResponseEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketresponseenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlMarketResponseData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlMarketResponseEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketResponseEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
            Meta meta = intlMarketResponseEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            if (intlMarketResponseData != null) {
                iL += CodedOutputByteBufferNano.l(2, intlMarketResponseData, IntlMarketResponseData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlMarketResponseEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketResponseEnvelope m13619parse(nb5 nb5Var) throws IOException {
            IntlMarketResponseEnvelope intlMarketResponseEnvelope = new IntlMarketResponseEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketResponseEnvelope.meta == null) {
                        intlMarketResponseEnvelope.meta = Meta.new_();
                    }
                    if (intlMarketResponseEnvelope.data != null) {
                        break;
                    }
                    intlMarketResponseEnvelope.data = IntlMarketResponseData.new_();
                    break;
                }
                if (iU == 10) {
                    intlMarketResponseEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlMarketResponseEnvelope.meta == null) {
                            intlMarketResponseEnvelope.meta = Meta.new_();
                        }
                        if (intlMarketResponseEnvelope.data != null) {
                            break;
                        }
                        intlMarketResponseEnvelope.data = IntlMarketResponseData.new_();
                        return intlMarketResponseEnvelope;
                    }
                    intlMarketResponseEnvelope.data = (IntlMarketResponseData) nb5Var.l(IntlMarketResponseData.PROTOBUF_ADAPTER);
                }
            }
            return intlMarketResponseEnvelope;
        }

        public void serialize(IntlMarketResponseEnvelope intlMarketResponseEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlMarketResponseEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            if (intlMarketResponseData != null) {
                codedOutputByteBufferNano.K(2, intlMarketResponseData, IntlMarketResponseData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlMarketResponseEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketResponseEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope.2
        public Class getDataClass() {
            return IntlMarketResponseEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketResponseEnvelope m13620newInstance() {
            return new IntlMarketResponseEnvelope();
        }

        public boolean parseField(IntlMarketResponseEnvelope intlMarketResponseEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlMarketResponseEnvelope.data = (IntlMarketResponseData) IntlMarketResponseData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlMarketResponseEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlMarketResponseEnvelope intlMarketResponseEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlMarketResponseEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlMarketResponseEnvelope intlMarketResponseEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlMarketResponseEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlMarketResponseEnvelope.meta, jsonGenerator, true);
            }
            if (intlMarketResponseEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlMarketResponseData.JSON_ADAPTER.serialize(intlMarketResponseEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketResponseEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketResponseEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketResponseEnvelope new_() {
        IntlMarketResponseEnvelope intlMarketResponseEnvelope = new IntlMarketResponseEnvelope();
        intlMarketResponseEnvelope.nullCheck();
        return intlMarketResponseEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketResponseEnvelope m13618clone() {
        IntlMarketResponseEnvelope intlMarketResponseEnvelope = new IntlMarketResponseEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlMarketResponseEnvelope.meta = meta.clone();
        }
        IntlMarketResponseData intlMarketResponseData = this.data;
        if (intlMarketResponseData != null) {
            intlMarketResponseEnvelope.data = intlMarketResponseData.m13614clone();
        }
        return intlMarketResponseEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketResponseEnvelope)) {
            return false;
        }
        IntlMarketResponseEnvelope intlMarketResponseEnvelope = (IntlMarketResponseEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlMarketResponseEnvelope.meta) && ValueObject.util_equals(this.data, intlMarketResponseEnvelope.data);
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
        IntlMarketResponseData intlMarketResponseData = this.data;
        int iHashCode2 = iHashCode + (intlMarketResponseData != null ? intlMarketResponseData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlMarketResponseData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
