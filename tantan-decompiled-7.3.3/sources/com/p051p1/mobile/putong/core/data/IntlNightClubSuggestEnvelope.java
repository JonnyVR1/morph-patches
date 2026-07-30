package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.User;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class IntlNightClubSuggestEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlnightclubsuggestenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<User> data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlNightClubSuggestEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlNightClubSuggestEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubSuggestEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope) {
            Meta meta = intlNightClubSuggestEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            List<User> list = intlNightClubSuggestEnvelope.data;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            intlNightClubSuggestEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlNightClubSuggestEnvelope parse(nc5 nc5Var) throws IOException {
            IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope = new IntlNightClubSuggestEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlNightClubSuggestEnvelope.meta == null) {
                        intlNightClubSuggestEnvelope.meta = Meta.new_();
                    }
                    if (intlNightClubSuggestEnvelope.data != null) {
                        break;
                    }
                    intlNightClubSuggestEnvelope.data = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    intlNightClubSuggestEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (intlNightClubSuggestEnvelope.meta == null) {
                            intlNightClubSuggestEnvelope.meta = Meta.new_();
                        }
                        if (intlNightClubSuggestEnvelope.data != null) {
                            break;
                        }
                        intlNightClubSuggestEnvelope.data = new ArrayList();
                        return intlNightClubSuggestEnvelope;
                    }
                    intlNightClubSuggestEnvelope.data = (List) nc5Var.m162488l(User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlNightClubSuggestEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlNightClubSuggestEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            List<User> list = intlNightClubSuggestEnvelope.data;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlNightClubSuggestEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlNightClubSuggestEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubSuggestEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlNightClubSuggestEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlNightClubSuggestEnvelope newInstance() {
            return new IntlNightClubSuggestEnvelope();
        }

        public boolean parseField(IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlNightClubSuggestEnvelope.data = JsonAdapter.parseArray(jsonParser, User.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlNightClubSuggestEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlNightClubSuggestEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlNightClubSuggestEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlNightClubSuggestEnvelope.meta, jsonGenerator, true);
            }
            if (intlNightClubSuggestEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(intlNightClubSuggestEnvelope.data, jsonGenerator, User.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlNightClubSuggestEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlNightClubSuggestEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlNightClubSuggestEnvelope new_() {
        IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope = new IntlNightClubSuggestEnvelope();
        intlNightClubSuggestEnvelope.nullCheck();
        return intlNightClubSuggestEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlNightClubSuggestEnvelope mo225055clone() {
        IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope = new IntlNightClubSuggestEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlNightClubSuggestEnvelope.meta = meta.mo225055clone();
        }
        List<User> list = this.data;
        if (list != null) {
            intlNightClubSuggestEnvelope.data = ValueObject.util_map(list, new qcj() { // from class: l.uqo
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).mo225055clone();
                }
            });
        }
        return intlNightClubSuggestEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlNightClubSuggestEnvelope)) {
            return false;
        }
        IntlNightClubSuggestEnvelope intlNightClubSuggestEnvelope = (IntlNightClubSuggestEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlNightClubSuggestEnvelope.meta) && ValueObject.util_equals(this.data, intlNightClubSuggestEnvelope.data);
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
        List<User> list = this.data;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
