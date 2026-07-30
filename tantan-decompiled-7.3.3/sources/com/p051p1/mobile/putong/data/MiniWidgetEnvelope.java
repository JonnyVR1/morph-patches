package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes12.dex */
public class MiniWidgetEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "miniwidgetenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public MiniWidgetData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<MiniWidgetEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<MiniWidgetEnvelope>() { // from class: com.p1.mobile.putong.data.MiniWidgetEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MiniWidgetEnvelope miniWidgetEnvelope) {
            Meta meta = miniWidgetEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            MiniWidgetData miniWidgetData = miniWidgetEnvelope.data;
            if (miniWidgetData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, miniWidgetData, MiniWidgetData.PROTOBUF_ADAPTER);
            }
            miniWidgetEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MiniWidgetEnvelope parse(nc5 nc5Var) throws IOException {
            MiniWidgetEnvelope miniWidgetEnvelope = new MiniWidgetEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (miniWidgetEnvelope.meta == null) {
                        miniWidgetEnvelope.meta = Meta.new_();
                    }
                    if (miniWidgetEnvelope.data != null) {
                        break;
                    }
                    miniWidgetEnvelope.data = MiniWidgetData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    miniWidgetEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (miniWidgetEnvelope.meta == null) {
                            miniWidgetEnvelope.meta = Meta.new_();
                        }
                        if (miniWidgetEnvelope.data != null) {
                            break;
                        }
                        miniWidgetEnvelope.data = MiniWidgetData.new_();
                        return miniWidgetEnvelope;
                    }
                    miniWidgetEnvelope.data = (MiniWidgetData) nc5Var.m162488l(MiniWidgetData.PROTOBUF_ADAPTER);
                }
            }
            return miniWidgetEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MiniWidgetEnvelope miniWidgetEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = miniWidgetEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            MiniWidgetData miniWidgetData = miniWidgetEnvelope.data;
            if (miniWidgetData != null) {
                codedOutputByteBufferNano.m17309K(2, miniWidgetData, MiniWidgetData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MiniWidgetEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<MiniWidgetEnvelope>() { // from class: com.p1.mobile.putong.data.MiniWidgetEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MiniWidgetEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MiniWidgetEnvelope newInstance() {
            return new MiniWidgetEnvelope();
        }

        public boolean parseField(MiniWidgetEnvelope miniWidgetEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                miniWidgetEnvelope.data = MiniWidgetData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            miniWidgetEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MiniWidgetEnvelope miniWidgetEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(miniWidgetEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MiniWidgetEnvelope miniWidgetEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (miniWidgetEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(miniWidgetEnvelope.meta, jsonGenerator, true);
            }
            if (miniWidgetEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                MiniWidgetData.JSON_ADAPTER.serialize(miniWidgetEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MiniWidgetEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MiniWidgetEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MiniWidgetEnvelope new_() {
        MiniWidgetEnvelope miniWidgetEnvelope = new MiniWidgetEnvelope();
        miniWidgetEnvelope.nullCheck();
        return miniWidgetEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MiniWidgetEnvelope mo225055clone() {
        MiniWidgetEnvelope miniWidgetEnvelope = new MiniWidgetEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            miniWidgetEnvelope.meta = meta.mo225055clone();
        }
        MiniWidgetData miniWidgetData = this.data;
        if (miniWidgetData != null) {
            miniWidgetEnvelope.data = miniWidgetData.mo225055clone();
        }
        return miniWidgetEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MiniWidgetEnvelope)) {
            return false;
        }
        MiniWidgetEnvelope miniWidgetEnvelope = (MiniWidgetEnvelope) obj;
        return ValueObject.util_equals(this.meta, miniWidgetEnvelope.meta) && ValueObject.util_equals(this.data, miniWidgetEnvelope.data);
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
        MiniWidgetData miniWidgetData = this.data;
        int iHashCode2 = iHashCode + (miniWidgetData != null ? miniWidgetData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = MiniWidgetData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
