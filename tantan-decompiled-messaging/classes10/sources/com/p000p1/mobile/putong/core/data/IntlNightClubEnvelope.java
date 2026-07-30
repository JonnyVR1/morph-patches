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
public class IntlNightClubEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlnightclubenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlNightClubData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlNightClubEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlNightClubEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlNightClubEnvelope intlNightClubEnvelope) {
            Meta meta = intlNightClubEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlNightClubData intlNightClubData = intlNightClubEnvelope.data;
            if (intlNightClubData != null) {
                iL += CodedOutputByteBufferNano.l(2, intlNightClubData, IntlNightClubData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlNightClubEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlNightClubEnvelope m13657parse(nb5 nb5Var) throws IOException {
            IntlNightClubEnvelope intlNightClubEnvelope = new IntlNightClubEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlNightClubEnvelope.meta == null) {
                        intlNightClubEnvelope.meta = Meta.new_();
                    }
                    if (intlNightClubEnvelope.data != null) {
                        break;
                    }
                    intlNightClubEnvelope.data = IntlNightClubData.new_();
                    break;
                }
                if (iU == 10) {
                    intlNightClubEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlNightClubEnvelope.meta == null) {
                            intlNightClubEnvelope.meta = Meta.new_();
                        }
                        if (intlNightClubEnvelope.data != null) {
                            break;
                        }
                        intlNightClubEnvelope.data = IntlNightClubData.new_();
                        return intlNightClubEnvelope;
                    }
                    intlNightClubEnvelope.data = (IntlNightClubData) nb5Var.l(IntlNightClubData.PROTOBUF_ADAPTER);
                }
            }
            return intlNightClubEnvelope;
        }

        public void serialize(IntlNightClubEnvelope intlNightClubEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlNightClubEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlNightClubData intlNightClubData = intlNightClubEnvelope.data;
            if (intlNightClubData != null) {
                codedOutputByteBufferNano.K(2, intlNightClubData, IntlNightClubData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlNightClubEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlNightClubEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubEnvelope.2
        public Class getDataClass() {
            return IntlNightClubEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlNightClubEnvelope m13658newInstance() {
            return new IntlNightClubEnvelope();
        }

        public boolean parseField(IntlNightClubEnvelope intlNightClubEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlNightClubEnvelope.data = (IntlNightClubData) IntlNightClubData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlNightClubEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlNightClubEnvelope intlNightClubEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlNightClubEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlNightClubEnvelope intlNightClubEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlNightClubEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlNightClubEnvelope.meta, jsonGenerator, true);
            }
            if (intlNightClubEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlNightClubData.JSON_ADAPTER.serialize(intlNightClubEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlNightClubEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlNightClubEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlNightClubEnvelope new_() {
        IntlNightClubEnvelope intlNightClubEnvelope = new IntlNightClubEnvelope();
        intlNightClubEnvelope.nullCheck();
        return intlNightClubEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlNightClubEnvelope m13656clone() {
        IntlNightClubEnvelope intlNightClubEnvelope = new IntlNightClubEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlNightClubEnvelope.meta = meta.clone();
        }
        IntlNightClubData intlNightClubData = this.data;
        if (intlNightClubData != null) {
            intlNightClubEnvelope.data = intlNightClubData.m13652clone();
        }
        return intlNightClubEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlNightClubEnvelope)) {
            return false;
        }
        IntlNightClubEnvelope intlNightClubEnvelope = (IntlNightClubEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlNightClubEnvelope.meta) && ValueObject.util_equals(this.data, intlNightClubEnvelope.data);
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
        IntlNightClubData intlNightClubData = this.data;
        int iHashCode2 = iHashCode + (intlNightClubData != null ? intlNightClubData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlNightClubData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
