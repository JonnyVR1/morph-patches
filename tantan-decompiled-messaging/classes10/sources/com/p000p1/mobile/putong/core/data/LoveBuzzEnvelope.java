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
public class LoveBuzzEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovebuzzenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LoveBuzzData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LoveBuzzEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveBuzzEnvelope>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LoveBuzzEnvelope loveBuzzEnvelope) {
            Meta meta = loveBuzzEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            LoveBuzzData loveBuzzData = loveBuzzEnvelope.data;
            if (loveBuzzData != null) {
                iL += CodedOutputByteBufferNano.l(2, loveBuzzData, LoveBuzzData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) loveBuzzEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LoveBuzzEnvelope m13985parse(nb5 nb5Var) throws IOException {
            LoveBuzzEnvelope loveBuzzEnvelope = new LoveBuzzEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (loveBuzzEnvelope.meta == null) {
                        loveBuzzEnvelope.meta = Meta.new_();
                    }
                    if (loveBuzzEnvelope.data != null) {
                        break;
                    }
                    loveBuzzEnvelope.data = LoveBuzzData.new_();
                    break;
                }
                if (iU == 10) {
                    loveBuzzEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (loveBuzzEnvelope.meta == null) {
                            loveBuzzEnvelope.meta = Meta.new_();
                        }
                        if (loveBuzzEnvelope.data != null) {
                            break;
                        }
                        loveBuzzEnvelope.data = LoveBuzzData.new_();
                        return loveBuzzEnvelope;
                    }
                    loveBuzzEnvelope.data = (LoveBuzzData) nb5Var.l(LoveBuzzData.PROTOBUF_ADAPTER);
                }
            }
            return loveBuzzEnvelope;
        }

        public void serialize(LoveBuzzEnvelope loveBuzzEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = loveBuzzEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            LoveBuzzData loveBuzzData = loveBuzzEnvelope.data;
            if (loveBuzzData != null) {
                codedOutputByteBufferNano.K(2, loveBuzzData, LoveBuzzData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LoveBuzzEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<LoveBuzzEnvelope>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzEnvelope.2
        public Class getDataClass() {
            return LoveBuzzEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LoveBuzzEnvelope m13986newInstance() {
            return new LoveBuzzEnvelope();
        }

        public boolean parseField(LoveBuzzEnvelope loveBuzzEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                loveBuzzEnvelope.data = (LoveBuzzData) LoveBuzzData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            loveBuzzEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LoveBuzzEnvelope loveBuzzEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(loveBuzzEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveBuzzEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveBuzzEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveBuzzEnvelope new_() {
        LoveBuzzEnvelope loveBuzzEnvelope = new LoveBuzzEnvelope();
        loveBuzzEnvelope.nullCheck();
        return loveBuzzEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LoveBuzzEnvelope m13984clone() {
        LoveBuzzEnvelope loveBuzzEnvelope = new LoveBuzzEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            loveBuzzEnvelope.meta = meta.clone();
        }
        LoveBuzzData loveBuzzData = this.data;
        if (loveBuzzData != null) {
            loveBuzzEnvelope.data = loveBuzzData.m13980clone();
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
        LoveBuzzData loveBuzzData = this.data;
        int iHashCode2 = iHashCode + (loveBuzzData != null ? loveBuzzData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = LoveBuzzData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
