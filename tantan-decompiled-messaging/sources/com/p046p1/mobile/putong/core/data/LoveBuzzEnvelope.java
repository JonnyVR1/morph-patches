package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class LoveBuzzEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovebuzzenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public LoveBuzzData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LoveBuzzEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveBuzzEnvelope>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveBuzzEnvelope loveBuzzEnvelope) {
            Meta meta = loveBuzzEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            LoveBuzzData loveBuzzData = loveBuzzEnvelope.data;
            if (loveBuzzData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, loveBuzzData, LoveBuzzData.PROTOBUF_ADAPTER);
            }
            loveBuzzEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveBuzzEnvelope parse(nb5 nb5Var) throws IOException {
            LoveBuzzEnvelope loveBuzzEnvelope = new LoveBuzzEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (loveBuzzEnvelope.meta == null) {
                        loveBuzzEnvelope.meta = Meta.new_();
                    }
                    if (loveBuzzEnvelope.data != null) {
                        break;
                    }
                    loveBuzzEnvelope.data = LoveBuzzData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    loveBuzzEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (loveBuzzEnvelope.meta == null) {
                            loveBuzzEnvelope.meta = Meta.new_();
                        }
                        if (loveBuzzEnvelope.data != null) {
                            break;
                        }
                        loveBuzzEnvelope.data = LoveBuzzData.new_();
                        return loveBuzzEnvelope;
                    }
                    loveBuzzEnvelope.data = (LoveBuzzData) nb5Var.m158743l(LoveBuzzData.PROTOBUF_ADAPTER);
                }
            }
            return loveBuzzEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveBuzzEnvelope loveBuzzEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = loveBuzzEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            LoveBuzzData loveBuzzData = loveBuzzEnvelope.data;
            if (loveBuzzData != null) {
                codedOutputByteBufferNano.m17254K(2, loveBuzzData, LoveBuzzData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LoveBuzzEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<LoveBuzzEnvelope>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveBuzzEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveBuzzEnvelope newInstance() {
            return new LoveBuzzEnvelope();
        }

        public boolean parseField(LoveBuzzEnvelope loveBuzzEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                loveBuzzEnvelope.data = LoveBuzzData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            loveBuzzEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LoveBuzzEnvelope loveBuzzEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(loveBuzzEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LoveBuzzEnvelope loveBuzzEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (loveBuzzEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(loveBuzzEnvelope.meta, jsonGenerator, true);
            }
            if (loveBuzzEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                LoveBuzzData.JSON_ADAPTER.serialize(loveBuzzEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveBuzzEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveBuzzEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveBuzzEnvelope new_() {
        LoveBuzzEnvelope loveBuzzEnvelope = new LoveBuzzEnvelope();
        loveBuzzEnvelope.nullCheck();
        return loveBuzzEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveBuzzEnvelope mo223809clone() {
        LoveBuzzEnvelope loveBuzzEnvelope = new LoveBuzzEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            loveBuzzEnvelope.meta = meta.mo223809clone();
        }
        LoveBuzzData loveBuzzData = this.data;
        if (loveBuzzData != null) {
            loveBuzzEnvelope.data = loveBuzzData.mo223809clone();
        }
        return loveBuzzEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveBuzzEnvelope)) {
            return false;
        }
        LoveBuzzEnvelope loveBuzzEnvelope = (LoveBuzzEnvelope) obj;
        return ValueObject.util_equals(this.meta, loveBuzzEnvelope.meta) && ValueObject.util_equals(this.data, loveBuzzEnvelope.data);
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
        LoveBuzzData loveBuzzData = this.data;
        int iHashCode2 = iHashCode + (loveBuzzData != null ? loveBuzzData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = LoveBuzzData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
