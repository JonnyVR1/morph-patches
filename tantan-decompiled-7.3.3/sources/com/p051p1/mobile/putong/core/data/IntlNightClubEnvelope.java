package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlNightClubEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlnightclubenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlNightClubData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlNightClubEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlNightClubEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlNightClubEnvelope intlNightClubEnvelope) {
            Meta meta = intlNightClubEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlNightClubData intlNightClubData = intlNightClubEnvelope.data;
            if (intlNightClubData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlNightClubData, IntlNightClubData.PROTOBUF_ADAPTER);
            }
            intlNightClubEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlNightClubEnvelope parse(nc5 nc5Var) throws IOException {
            IntlNightClubEnvelope intlNightClubEnvelope = new IntlNightClubEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlNightClubEnvelope.meta == null) {
                        intlNightClubEnvelope.meta = Meta.new_();
                    }
                    if (intlNightClubEnvelope.data != null) {
                        break;
                    }
                    intlNightClubEnvelope.data = IntlNightClubData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    intlNightClubEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (intlNightClubEnvelope.meta == null) {
                            intlNightClubEnvelope.meta = Meta.new_();
                        }
                        if (intlNightClubEnvelope.data != null) {
                            break;
                        }
                        intlNightClubEnvelope.data = IntlNightClubData.new_();
                        return intlNightClubEnvelope;
                    }
                    intlNightClubEnvelope.data = (IntlNightClubData) nc5Var.m162488l(IntlNightClubData.PROTOBUF_ADAPTER);
                }
            }
            return intlNightClubEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlNightClubEnvelope intlNightClubEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlNightClubEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlNightClubData intlNightClubData = intlNightClubEnvelope.data;
            if (intlNightClubData != null) {
                codedOutputByteBufferNano.m17309K(2, intlNightClubData, IntlNightClubData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlNightClubEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlNightClubEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlNightClubEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlNightClubEnvelope newInstance() {
            return new IntlNightClubEnvelope();
        }

        public boolean parseField(IntlNightClubEnvelope intlNightClubEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlNightClubEnvelope.data = IntlNightClubData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlNightClubEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlNightClubEnvelope intlNightClubEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlNightClubEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlNightClubEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlNightClubEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlNightClubEnvelope new_() {
        IntlNightClubEnvelope intlNightClubEnvelope = new IntlNightClubEnvelope();
        intlNightClubEnvelope.nullCheck();
        return intlNightClubEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlNightClubEnvelope mo225055clone() {
        IntlNightClubEnvelope intlNightClubEnvelope = new IntlNightClubEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlNightClubEnvelope.meta = meta.mo225055clone();
        }
        IntlNightClubData intlNightClubData = this.data;
        if (intlNightClubData != null) {
            intlNightClubEnvelope.data = intlNightClubData.mo225055clone();
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
        IntlNightClubData intlNightClubData = this.data;
        int iHashCode2 = iHashCode + (intlNightClubData != null ? intlNightClubData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlNightClubData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
