package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MiniWidgetEnvelope miniWidgetEnvelope) {
            Meta meta = miniWidgetEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            MiniWidgetData miniWidgetData = miniWidgetEnvelope.data;
            if (miniWidgetData != null) {
                iL += CodedOutputByteBufferNano.l(2, miniWidgetData, MiniWidgetData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) miniWidgetEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MiniWidgetEnvelope m18471parse(nb5 nb5Var) throws IOException {
            MiniWidgetEnvelope miniWidgetEnvelope = new MiniWidgetEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (miniWidgetEnvelope.meta == null) {
                        miniWidgetEnvelope.meta = Meta.new_();
                    }
                    if (miniWidgetEnvelope.data != null) {
                        break;
                    }
                    miniWidgetEnvelope.data = MiniWidgetData.new_();
                    break;
                }
                if (iU == 10) {
                    miniWidgetEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (miniWidgetEnvelope.meta == null) {
                            miniWidgetEnvelope.meta = Meta.new_();
                        }
                        if (miniWidgetEnvelope.data != null) {
                            break;
                        }
                        miniWidgetEnvelope.data = MiniWidgetData.new_();
                        return miniWidgetEnvelope;
                    }
                    miniWidgetEnvelope.data = (MiniWidgetData) nb5Var.l(MiniWidgetData.PROTOBUF_ADAPTER);
                }
            }
            return miniWidgetEnvelope;
        }

        public void serialize(MiniWidgetEnvelope miniWidgetEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = miniWidgetEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            MiniWidgetData miniWidgetData = miniWidgetEnvelope.data;
            if (miniWidgetData != null) {
                codedOutputByteBufferNano.K(2, miniWidgetData, MiniWidgetData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MiniWidgetEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<MiniWidgetEnvelope>() { // from class: com.p1.mobile.putong.data.MiniWidgetEnvelope.2
        public Class getDataClass() {
            return MiniWidgetEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MiniWidgetEnvelope mo17830newInstance() {
            return new MiniWidgetEnvelope();
        }

        public boolean parseField(MiniWidgetEnvelope miniWidgetEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                miniWidgetEnvelope.data = (MiniWidgetData) MiniWidgetData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            miniWidgetEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MiniWidgetEnvelope miniWidgetEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(miniWidgetEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MiniWidgetEnvelope miniWidgetEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (miniWidgetEnvelope.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(miniWidgetEnvelope.meta, jsonGenerator, true);
            }
            if (miniWidgetEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                MiniWidgetData.JSON_ADAPTER.serialize(miniWidgetEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MiniWidgetEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MiniWidgetEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MiniWidgetEnvelope new_() {
        MiniWidgetEnvelope miniWidgetEnvelope = new MiniWidgetEnvelope();
        miniWidgetEnvelope.nullCheck();
        return miniWidgetEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MiniWidgetEnvelope m18470clone() {
        MiniWidgetEnvelope miniWidgetEnvelope = new MiniWidgetEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            miniWidgetEnvelope.meta = meta.m18461clone();
        }
        MiniWidgetData miniWidgetData = this.data;
        if (miniWidgetData != null) {
            miniWidgetEnvelope.data = miniWidgetData.m18467clone();
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
        MiniWidgetData miniWidgetData = this.data;
        int iHashCode2 = iHashCode + (miniWidgetData != null ? miniWidgetData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = MiniWidgetData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
