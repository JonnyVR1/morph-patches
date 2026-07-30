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
public class IntlCampingConfigEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingconfigenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlCampingConfigData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlCampingConfigEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlCampingConfigEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
            Meta meta = intlCampingConfigEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlCampingConfigData intlCampingConfigData = intlCampingConfigEnvelope.data;
            if (intlCampingConfigData != null) {
                iL += CodedOutputByteBufferNano.l(2, intlCampingConfigData, IntlCampingConfigData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlCampingConfigEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlCampingConfigEnvelope m13499parse(nb5 nb5Var) throws IOException {
            IntlCampingConfigEnvelope intlCampingConfigEnvelope = new IntlCampingConfigEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlCampingConfigEnvelope.meta == null) {
                        intlCampingConfigEnvelope.meta = Meta.new_();
                    }
                    if (intlCampingConfigEnvelope.data != null) {
                        break;
                    }
                    intlCampingConfigEnvelope.data = IntlCampingConfigData.new_();
                    break;
                }
                if (iU == 10) {
                    intlCampingConfigEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlCampingConfigEnvelope.meta == null) {
                            intlCampingConfigEnvelope.meta = Meta.new_();
                        }
                        if (intlCampingConfigEnvelope.data != null) {
                            break;
                        }
                        intlCampingConfigEnvelope.data = IntlCampingConfigData.new_();
                        return intlCampingConfigEnvelope;
                    }
                    intlCampingConfigEnvelope.data = (IntlCampingConfigData) nb5Var.l(IntlCampingConfigData.PROTOBUF_ADAPTER);
                }
            }
            return intlCampingConfigEnvelope;
        }

        public void serialize(IntlCampingConfigEnvelope intlCampingConfigEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlCampingConfigEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlCampingConfigData intlCampingConfigData = intlCampingConfigEnvelope.data;
            if (intlCampingConfigData != null) {
                codedOutputByteBufferNano.K(2, intlCampingConfigData, IntlCampingConfigData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlCampingConfigEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlCampingConfigEnvelope.2
        public Class getDataClass() {
            return IntlCampingConfigEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlCampingConfigEnvelope m13500newInstance() {
            return new IntlCampingConfigEnvelope();
        }

        public boolean parseField(IntlCampingConfigEnvelope intlCampingConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlCampingConfigEnvelope.data = (IntlCampingConfigData) IntlCampingConfigData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlCampingConfigEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlCampingConfigEnvelope intlCampingConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlCampingConfigEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlCampingConfigEnvelope intlCampingConfigEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlCampingConfigEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlCampingConfigEnvelope.meta, jsonGenerator, true);
            }
            if (intlCampingConfigEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlCampingConfigData.JSON_ADAPTER.serialize(intlCampingConfigEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingConfigEnvelope new_() {
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = new IntlCampingConfigEnvelope();
        intlCampingConfigEnvelope.nullCheck();
        return intlCampingConfigEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlCampingConfigEnvelope m13498clone() {
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = new IntlCampingConfigEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlCampingConfigEnvelope.meta = meta.clone();
        }
        IntlCampingConfigData intlCampingConfigData = this.data;
        if (intlCampingConfigData != null) {
            intlCampingConfigEnvelope.data = intlCampingConfigData.m13494clone();
        }
        return intlCampingConfigEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingConfigEnvelope)) {
            return false;
        }
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = (IntlCampingConfigEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlCampingConfigEnvelope.meta) && ValueObject.util_equals(this.data, intlCampingConfigEnvelope.data);
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
        IntlCampingConfigData intlCampingConfigData = this.data;
        int iHashCode2 = iHashCode + (intlCampingConfigData != null ? intlCampingConfigData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlCampingConfigData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
