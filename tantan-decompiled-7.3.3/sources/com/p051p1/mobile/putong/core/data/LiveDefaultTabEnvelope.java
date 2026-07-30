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
public class LiveDefaultTabEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livedefaulttabenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public LiveDefaultTabData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LiveDefaultTabEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveDefaultTabEnvelope>() { // from class: com.p1.mobile.putong.core.data.LiveDefaultTabEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveDefaultTabEnvelope liveDefaultTabEnvelope) {
            Meta meta = liveDefaultTabEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            LiveDefaultTabData liveDefaultTabData = liveDefaultTabEnvelope.data;
            if (liveDefaultTabData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, liveDefaultTabData, LiveDefaultTabData.PROTOBUF_ADAPTER);
            }
            liveDefaultTabEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveDefaultTabEnvelope parse(nc5 nc5Var) throws IOException {
            LiveDefaultTabEnvelope liveDefaultTabEnvelope = new LiveDefaultTabEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveDefaultTabEnvelope.meta == null) {
                        liveDefaultTabEnvelope.meta = Meta.new_();
                    }
                    if (liveDefaultTabEnvelope.data != null) {
                        break;
                    }
                    liveDefaultTabEnvelope.data = LiveDefaultTabData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    liveDefaultTabEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (liveDefaultTabEnvelope.meta == null) {
                            liveDefaultTabEnvelope.meta = Meta.new_();
                        }
                        if (liveDefaultTabEnvelope.data != null) {
                            break;
                        }
                        liveDefaultTabEnvelope.data = LiveDefaultTabData.new_();
                        return liveDefaultTabEnvelope;
                    }
                    liveDefaultTabEnvelope.data = (LiveDefaultTabData) nc5Var.m162488l(LiveDefaultTabData.PROTOBUF_ADAPTER);
                }
            }
            return liveDefaultTabEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveDefaultTabEnvelope liveDefaultTabEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = liveDefaultTabEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            LiveDefaultTabData liveDefaultTabData = liveDefaultTabEnvelope.data;
            if (liveDefaultTabData != null) {
                codedOutputByteBufferNano.m17309K(2, liveDefaultTabData, LiveDefaultTabData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveDefaultTabEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<LiveDefaultTabEnvelope>() { // from class: com.p1.mobile.putong.core.data.LiveDefaultTabEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveDefaultTabEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveDefaultTabEnvelope newInstance() {
            return new LiveDefaultTabEnvelope();
        }

        public boolean parseField(LiveDefaultTabEnvelope liveDefaultTabEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                liveDefaultTabEnvelope.data = LiveDefaultTabData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            liveDefaultTabEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LiveDefaultTabEnvelope liveDefaultTabEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(liveDefaultTabEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveDefaultTabEnvelope liveDefaultTabEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (liveDefaultTabEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(liveDefaultTabEnvelope.meta, jsonGenerator, true);
            }
            if (liveDefaultTabEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                LiveDefaultTabData.JSON_ADAPTER.serialize(liveDefaultTabEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveDefaultTabEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveDefaultTabEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveDefaultTabEnvelope new_() {
        LiveDefaultTabEnvelope liveDefaultTabEnvelope = new LiveDefaultTabEnvelope();
        liveDefaultTabEnvelope.nullCheck();
        return liveDefaultTabEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveDefaultTabEnvelope mo225055clone() {
        LiveDefaultTabEnvelope liveDefaultTabEnvelope = new LiveDefaultTabEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            liveDefaultTabEnvelope.meta = meta.mo225055clone();
        }
        LiveDefaultTabData liveDefaultTabData = this.data;
        if (liveDefaultTabData != null) {
            liveDefaultTabEnvelope.data = liveDefaultTabData.mo225055clone();
        }
        return liveDefaultTabEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveDefaultTabEnvelope)) {
            return false;
        }
        LiveDefaultTabEnvelope liveDefaultTabEnvelope = (LiveDefaultTabEnvelope) obj;
        return ValueObject.util_equals(this.meta, liveDefaultTabEnvelope.meta) && ValueObject.util_equals(this.data, liveDefaultTabEnvelope.data);
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
        LiveDefaultTabData liveDefaultTabData = this.data;
        int iHashCode2 = iHashCode + (liveDefaultTabData != null ? liveDefaultTabData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = LiveDefaultTabData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
