package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class ConstellationDataEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "constellationdataenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<User> data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<ConstellationDataEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConstellationDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.ConstellationDataEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConstellationDataEnvelope constellationDataEnvelope) {
            Meta meta = constellationDataEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            List<User> list = constellationDataEnvelope.data;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            constellationDataEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConstellationDataEnvelope parse(nb5 nb5Var) throws IOException {
            ConstellationDataEnvelope constellationDataEnvelope = new ConstellationDataEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (constellationDataEnvelope.meta == null) {
                        constellationDataEnvelope.meta = Meta.new_();
                    }
                    if (constellationDataEnvelope.data != null) {
                        break;
                    }
                    constellationDataEnvelope.data = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    constellationDataEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (constellationDataEnvelope.meta == null) {
                            constellationDataEnvelope.meta = Meta.new_();
                        }
                        if (constellationDataEnvelope.data != null) {
                            break;
                        }
                        constellationDataEnvelope.data = new ArrayList();
                        return constellationDataEnvelope;
                    }
                    constellationDataEnvelope.data = (List) nb5Var.m158743l(User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return constellationDataEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConstellationDataEnvelope constellationDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = constellationDataEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            List<User> list = constellationDataEnvelope.data;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ConstellationDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<ConstellationDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.ConstellationDataEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConstellationDataEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConstellationDataEnvelope newInstance() {
            return new ConstellationDataEnvelope();
        }

        public boolean parseField(ConstellationDataEnvelope constellationDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                constellationDataEnvelope.data = JsonAdapter.parseArray(jsonParser, User.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            constellationDataEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ConstellationDataEnvelope constellationDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(constellationDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConstellationDataEnvelope constellationDataEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (constellationDataEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(constellationDataEnvelope.meta, jsonGenerator, true);
            }
            if (constellationDataEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(constellationDataEnvelope.data, jsonGenerator, User.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConstellationDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConstellationDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConstellationDataEnvelope new_() {
        ConstellationDataEnvelope constellationDataEnvelope = new ConstellationDataEnvelope();
        constellationDataEnvelope.nullCheck();
        return constellationDataEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConstellationDataEnvelope mo223809clone() {
        ConstellationDataEnvelope constellationDataEnvelope = new ConstellationDataEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            constellationDataEnvelope.meta = meta.mo223809clone();
        }
        List<User> list = this.data;
        if (list != null) {
            constellationDataEnvelope.data = ValueObject.util_map(list, new w9j() { // from class: l.fx5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).mo223809clone();
                }
            });
        }
        return constellationDataEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConstellationDataEnvelope)) {
            return false;
        }
        ConstellationDataEnvelope constellationDataEnvelope = (ConstellationDataEnvelope) obj;
        return ValueObject.util_equals(this.meta, constellationDataEnvelope.meta) && ValueObject.util_equals(this.data, constellationDataEnvelope.data);
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
