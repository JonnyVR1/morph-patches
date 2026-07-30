package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class TarotDataEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tarotdataenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public TarotData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<TarotDataEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<TarotDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.TarotDataEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TarotDataEnvelope tarotDataEnvelope) {
            Meta meta = tarotDataEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            TarotData tarotData = tarotDataEnvelope.data;
            if (tarotData != null) {
                iL += CodedOutputByteBufferNano.l(2, tarotData, TarotData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) tarotDataEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TarotDataEnvelope m15950parse(nb5 nb5Var) throws IOException {
            TarotDataEnvelope tarotDataEnvelope = new TarotDataEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tarotDataEnvelope.meta == null) {
                        tarotDataEnvelope.meta = Meta.new_();
                    }
                    if (tarotDataEnvelope.data != null) {
                        break;
                    }
                    tarotDataEnvelope.data = TarotData.new_();
                    break;
                }
                if (iU == 10) {
                    tarotDataEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (tarotDataEnvelope.meta == null) {
                            tarotDataEnvelope.meta = Meta.new_();
                        }
                        if (tarotDataEnvelope.data != null) {
                            break;
                        }
                        tarotDataEnvelope.data = TarotData.new_();
                        return tarotDataEnvelope;
                    }
                    tarotDataEnvelope.data = (TarotData) nb5Var.l(TarotData.PROTOBUF_ADAPTER);
                }
            }
            return tarotDataEnvelope;
        }

        public void serialize(TarotDataEnvelope tarotDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = tarotDataEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            TarotData tarotData = tarotDataEnvelope.data;
            if (tarotData != null) {
                codedOutputByteBufferNano.K(2, tarotData, TarotData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TarotDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<TarotDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.TarotDataEnvelope.2
        public Class getDataClass() {
            return TarotDataEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TarotDataEnvelope m15951newInstance() {
            return new TarotDataEnvelope();
        }

        public boolean parseField(TarotDataEnvelope tarotDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                tarotDataEnvelope.data = (TarotData) TarotData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            tarotDataEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TarotDataEnvelope tarotDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(tarotDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TarotDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TarotDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TarotDataEnvelope new_() {
        TarotDataEnvelope tarotDataEnvelope = new TarotDataEnvelope();
        tarotDataEnvelope.nullCheck();
        return tarotDataEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TarotDataEnvelope m15949clone() {
        TarotDataEnvelope tarotDataEnvelope = new TarotDataEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            tarotDataEnvelope.meta = meta.clone();
        }
        TarotData tarotData = this.data;
        if (tarotData != null) {
            tarotDataEnvelope.data = tarotData.m15945clone();
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
        TarotData tarotData = this.data;
        int iHashCode2 = iHashCode + (tarotData != null ? tarotData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = TarotData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
