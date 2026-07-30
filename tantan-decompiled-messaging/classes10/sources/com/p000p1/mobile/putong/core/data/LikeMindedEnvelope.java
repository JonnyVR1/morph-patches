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
public class LikeMindedEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindedenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LikeMindedData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LikeMindedEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedEnvelope>() { // from class: com.p1.mobile.putong.core.data.LikeMindedEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeMindedEnvelope likeMindedEnvelope) {
            Meta meta = likeMindedEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            LikeMindedData likeMindedData = likeMindedEnvelope.data;
            if (likeMindedData != null) {
                iL += CodedOutputByteBufferNano.l(2, likeMindedData, LikeMindedData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) likeMindedEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeMindedEnvelope m13847parse(nb5 nb5Var) throws IOException {
            LikeMindedEnvelope likeMindedEnvelope = new LikeMindedEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeMindedEnvelope.meta == null) {
                        likeMindedEnvelope.meta = Meta.new_();
                    }
                    if (likeMindedEnvelope.data != null) {
                        break;
                    }
                    likeMindedEnvelope.data = LikeMindedData.new_();
                    break;
                }
                if (iU == 10) {
                    likeMindedEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (likeMindedEnvelope.meta == null) {
                            likeMindedEnvelope.meta = Meta.new_();
                        }
                        if (likeMindedEnvelope.data != null) {
                            break;
                        }
                        likeMindedEnvelope.data = LikeMindedData.new_();
                        return likeMindedEnvelope;
                    }
                    likeMindedEnvelope.data = (LikeMindedData) nb5Var.l(LikeMindedData.PROTOBUF_ADAPTER);
                }
            }
            return likeMindedEnvelope;
        }

        public void serialize(LikeMindedEnvelope likeMindedEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = likeMindedEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            LikeMindedData likeMindedData = likeMindedEnvelope.data;
            if (likeMindedData != null) {
                codedOutputByteBufferNano.K(2, likeMindedData, LikeMindedData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LikeMindedEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedEnvelope>() { // from class: com.p1.mobile.putong.core.data.LikeMindedEnvelope.2
        public Class getDataClass() {
            return LikeMindedEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikeMindedEnvelope m13848newInstance() {
            return new LikeMindedEnvelope();
        }

        public boolean parseField(LikeMindedEnvelope likeMindedEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                likeMindedEnvelope.data = (LikeMindedData) LikeMindedData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            likeMindedEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LikeMindedEnvelope likeMindedEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(likeMindedEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LikeMindedEnvelope likeMindedEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (likeMindedEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(likeMindedEnvelope.meta, jsonGenerator, true);
            }
            if (likeMindedEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                LikeMindedData.JSON_ADAPTER.serialize(likeMindedEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedEnvelope new_() {
        LikeMindedEnvelope likeMindedEnvelope = new LikeMindedEnvelope();
        likeMindedEnvelope.nullCheck();
        return likeMindedEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeMindedEnvelope m13846clone() {
        LikeMindedEnvelope likeMindedEnvelope = new LikeMindedEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            likeMindedEnvelope.meta = meta.clone();
        }
        LikeMindedData likeMindedData = this.data;
        if (likeMindedData != null) {
            likeMindedEnvelope.data = likeMindedData.m13842clone();
        }
        return likeMindedEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedEnvelope)) {
            return false;
        }
        LikeMindedEnvelope likeMindedEnvelope = (LikeMindedEnvelope) obj;
        return ValueObject.util_equals(this.meta, likeMindedEnvelope.meta) && ValueObject.util_equals(this.data, likeMindedEnvelope.data);
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
        LikeMindedData likeMindedData = this.data;
        int iHashCode2 = iHashCode + (likeMindedData != null ? likeMindedData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = LikeMindedData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
