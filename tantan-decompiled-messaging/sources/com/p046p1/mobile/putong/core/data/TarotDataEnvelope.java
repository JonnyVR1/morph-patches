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
public class TarotDataEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tarotdataenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public TarotData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<TarotDataEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<TarotDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.TarotDataEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TarotDataEnvelope tarotDataEnvelope) {
            Meta meta = tarotDataEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            TarotData tarotData = tarotDataEnvelope.data;
            if (tarotData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, tarotData, TarotData.PROTOBUF_ADAPTER);
            }
            tarotDataEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TarotDataEnvelope parse(nb5 nb5Var) throws IOException {
            TarotDataEnvelope tarotDataEnvelope = new TarotDataEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (tarotDataEnvelope.meta == null) {
                        tarotDataEnvelope.meta = Meta.new_();
                    }
                    if (tarotDataEnvelope.data != null) {
                        break;
                    }
                    tarotDataEnvelope.data = TarotData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    tarotDataEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (tarotDataEnvelope.meta == null) {
                            tarotDataEnvelope.meta = Meta.new_();
                        }
                        if (tarotDataEnvelope.data != null) {
                            break;
                        }
                        tarotDataEnvelope.data = TarotData.new_();
                        return tarotDataEnvelope;
                    }
                    tarotDataEnvelope.data = (TarotData) nb5Var.m158743l(TarotData.PROTOBUF_ADAPTER);
                }
            }
            return tarotDataEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TarotDataEnvelope tarotDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = tarotDataEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            TarotData tarotData = tarotDataEnvelope.data;
            if (tarotData != null) {
                codedOutputByteBufferNano.m17254K(2, tarotData, TarotData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TarotDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<TarotDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.TarotDataEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TarotDataEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TarotDataEnvelope newInstance() {
            return new TarotDataEnvelope();
        }

        public boolean parseField(TarotDataEnvelope tarotDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                tarotDataEnvelope.data = TarotData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            tarotDataEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TarotDataEnvelope tarotDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(tarotDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TarotDataEnvelope tarotDataEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (tarotDataEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(tarotDataEnvelope.meta, jsonGenerator, true);
            }
            if (tarotDataEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                TarotData.JSON_ADAPTER.serialize(tarotDataEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TarotDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TarotDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TarotDataEnvelope new_() {
        TarotDataEnvelope tarotDataEnvelope = new TarotDataEnvelope();
        tarotDataEnvelope.nullCheck();
        return tarotDataEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TarotDataEnvelope mo223809clone() {
        TarotDataEnvelope tarotDataEnvelope = new TarotDataEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            tarotDataEnvelope.meta = meta.mo223809clone();
        }
        TarotData tarotData = this.data;
        if (tarotData != null) {
            tarotDataEnvelope.data = tarotData.mo223809clone();
        }
        return tarotDataEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TarotDataEnvelope)) {
            return false;
        }
        TarotDataEnvelope tarotDataEnvelope = (TarotDataEnvelope) obj;
        return ValueObject.util_equals(this.meta, tarotDataEnvelope.meta) && ValueObject.util_equals(this.data, tarotDataEnvelope.data);
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
        TarotData tarotData = this.data;
        int iHashCode2 = iHashCode + (tarotData != null ? tarotData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = TarotData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
