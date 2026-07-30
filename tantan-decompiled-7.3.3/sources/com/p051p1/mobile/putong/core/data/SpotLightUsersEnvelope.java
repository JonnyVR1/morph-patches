package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.SpotLightUsers;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class SpotLightUsersEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightusersenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<SpotLightUsers> data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SpotLightUsersEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightUsersEnvelope>() { // from class: com.p1.mobile.putong.core.data.SpotLightUsersEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpotLightUsersEnvelope spotLightUsersEnvelope) {
            Meta meta = spotLightUsersEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            List<SpotLightUsers> list = spotLightUsersEnvelope.data;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list, SpotLightUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            spotLightUsersEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpotLightUsersEnvelope parse(nc5 nc5Var) throws IOException {
            SpotLightUsersEnvelope spotLightUsersEnvelope = new SpotLightUsersEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (spotLightUsersEnvelope.meta == null) {
                        spotLightUsersEnvelope.meta = Meta.new_();
                    }
                    if (spotLightUsersEnvelope.data != null) {
                        break;
                    }
                    spotLightUsersEnvelope.data = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    spotLightUsersEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (spotLightUsersEnvelope.meta == null) {
                            spotLightUsersEnvelope.meta = Meta.new_();
                        }
                        if (spotLightUsersEnvelope.data != null) {
                            break;
                        }
                        spotLightUsersEnvelope.data = new ArrayList();
                        return spotLightUsersEnvelope;
                    }
                    spotLightUsersEnvelope.data = (List) nc5Var.m162488l(SpotLightUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return spotLightUsersEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpotLightUsersEnvelope spotLightUsersEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = spotLightUsersEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            List<SpotLightUsers> list = spotLightUsersEnvelope.data;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, SpotLightUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SpotLightUsersEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightUsersEnvelope>() { // from class: com.p1.mobile.putong.core.data.SpotLightUsersEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpotLightUsersEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpotLightUsersEnvelope newInstance() {
            return new SpotLightUsersEnvelope();
        }

        public boolean parseField(SpotLightUsersEnvelope spotLightUsersEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                spotLightUsersEnvelope.data = JsonAdapter.parseArray(jsonParser, SpotLightUsers.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            spotLightUsersEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SpotLightUsersEnvelope spotLightUsersEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(spotLightUsersEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpotLightUsersEnvelope spotLightUsersEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (spotLightUsersEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(spotLightUsersEnvelope.meta, jsonGenerator, true);
            }
            if (spotLightUsersEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(spotLightUsersEnvelope.data, jsonGenerator, SpotLightUsers.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightUsersEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightUsersEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightUsersEnvelope new_() {
        SpotLightUsersEnvelope spotLightUsersEnvelope = new SpotLightUsersEnvelope();
        spotLightUsersEnvelope.nullCheck();
        return spotLightUsersEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpotLightUsersEnvelope mo225055clone() {
        SpotLightUsersEnvelope spotLightUsersEnvelope = new SpotLightUsersEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            spotLightUsersEnvelope.meta = meta.mo225055clone();
        }
        List<SpotLightUsers> list = this.data;
        if (list != null) {
            spotLightUsersEnvelope.data = ValueObject.util_map(list, new qcj() { // from class: l.wxf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((SpotLightUsers) obj).mo225055clone();
                }
            });
        }
        return spotLightUsersEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotLightUsersEnvelope)) {
            return false;
        }
        SpotLightUsersEnvelope spotLightUsersEnvelope = (SpotLightUsersEnvelope) obj;
        return ValueObject.util_equals(this.meta, spotLightUsersEnvelope.meta) && ValueObject.util_equals(this.data, spotLightUsersEnvelope.data);
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
        List<SpotLightUsers> list = this.data;
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
