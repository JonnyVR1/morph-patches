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
public class IntlTabMePayGuideEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltabmepayguideenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlTabMePayGuide data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlTabMePayGuideEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTabMePayGuideEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope) {
            Meta meta = intlTabMePayGuideEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlTabMePayGuide intlTabMePayGuide = intlTabMePayGuideEnvelope.data;
            if (intlTabMePayGuide != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlTabMePayGuide, IntlTabMePayGuide.PROTOBUF_ADAPTER);
            }
            intlTabMePayGuideEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlTabMePayGuideEnvelope parse(nc5 nc5Var) throws IOException {
            IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope = new IntlTabMePayGuideEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlTabMePayGuideEnvelope.meta == null) {
                        intlTabMePayGuideEnvelope.meta = Meta.new_();
                    }
                    if (intlTabMePayGuideEnvelope.data != null) {
                        break;
                    }
                    intlTabMePayGuideEnvelope.data = IntlTabMePayGuide.new_();
                    break;
                }
                if (iM162497u == 10) {
                    intlTabMePayGuideEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (intlTabMePayGuideEnvelope.meta == null) {
                            intlTabMePayGuideEnvelope.meta = Meta.new_();
                        }
                        if (intlTabMePayGuideEnvelope.data != null) {
                            break;
                        }
                        intlTabMePayGuideEnvelope.data = IntlTabMePayGuide.new_();
                        return intlTabMePayGuideEnvelope;
                    }
                    intlTabMePayGuideEnvelope.data = (IntlTabMePayGuide) nc5Var.m162488l(IntlTabMePayGuide.PROTOBUF_ADAPTER);
                }
            }
            return intlTabMePayGuideEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlTabMePayGuideEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlTabMePayGuide intlTabMePayGuide = intlTabMePayGuideEnvelope.data;
            if (intlTabMePayGuide != null) {
                codedOutputByteBufferNano.m17309K(2, intlTabMePayGuide, IntlTabMePayGuide.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlTabMePayGuideEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlTabMePayGuideEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlTabMePayGuideEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlTabMePayGuideEnvelope newInstance() {
            return new IntlTabMePayGuideEnvelope();
        }

        public boolean parseField(IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlTabMePayGuideEnvelope.data = IntlTabMePayGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlTabMePayGuideEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlTabMePayGuideEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlTabMePayGuideEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlTabMePayGuideEnvelope.meta, jsonGenerator, true);
            }
            if (intlTabMePayGuideEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlTabMePayGuide.JSON_ADAPTER.serialize(intlTabMePayGuideEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTabMePayGuideEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTabMePayGuideEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTabMePayGuideEnvelope new_() {
        IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope = new IntlTabMePayGuideEnvelope();
        intlTabMePayGuideEnvelope.nullCheck();
        return intlTabMePayGuideEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlTabMePayGuideEnvelope mo225055clone() {
        IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope = new IntlTabMePayGuideEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlTabMePayGuideEnvelope.meta = meta.mo225055clone();
        }
        IntlTabMePayGuide intlTabMePayGuide = this.data;
        if (intlTabMePayGuide != null) {
            intlTabMePayGuideEnvelope.data = intlTabMePayGuide.mo225055clone();
        }
        return intlTabMePayGuideEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlTabMePayGuideEnvelope)) {
            return false;
        }
        IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope = (IntlTabMePayGuideEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlTabMePayGuideEnvelope.meta) && ValueObject.util_equals(this.data, intlTabMePayGuideEnvelope.data);
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
        IntlTabMePayGuide intlTabMePayGuide = this.data;
        int iHashCode2 = iHashCode + (intlTabMePayGuide != null ? intlTabMePayGuide.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlTabMePayGuide.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
