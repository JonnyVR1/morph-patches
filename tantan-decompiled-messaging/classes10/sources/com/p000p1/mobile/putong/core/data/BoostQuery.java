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
public class BoostQuery extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "boostquery";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public BoostQueryData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<BoostQuery> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostQuery>() { // from class: com.p1.mobile.putong.core.data.BoostQuery.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostQuery boostQuery) {
            Meta meta = boostQuery.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            BoostQueryData boostQueryData = boostQuery.data;
            if (boostQueryData != null) {
                iL += CodedOutputByteBufferNano.l(2, boostQueryData, BoostQueryData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) boostQuery).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostQuery m11791parse(nb5 nb5Var) throws IOException {
            BoostQuery boostQuery = new BoostQuery();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (boostQuery.meta == null) {
                        boostQuery.meta = Meta.new_();
                    }
                    if (boostQuery.data != null) {
                        break;
                    }
                    boostQuery.data = BoostQueryData.new_();
                    break;
                }
                if (iU == 10) {
                    boostQuery.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (boostQuery.meta == null) {
                            boostQuery.meta = Meta.new_();
                        }
                        if (boostQuery.data != null) {
                            break;
                        }
                        boostQuery.data = BoostQueryData.new_();
                        return boostQuery;
                    }
                    boostQuery.data = (BoostQueryData) nb5Var.l(BoostQueryData.PROTOBUF_ADAPTER);
                }
            }
            return boostQuery;
        }

        public void serialize(BoostQuery boostQuery, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = boostQuery.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            BoostQueryData boostQueryData = boostQuery.data;
            if (boostQueryData != null) {
                codedOutputByteBufferNano.K(2, boostQueryData, BoostQueryData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BoostQuery> JSON_ADAPTER = new ObjectJsonAdapter<BoostQuery>() { // from class: com.p1.mobile.putong.core.data.BoostQuery.2
        public Class getDataClass() {
            return BoostQuery.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BoostQuery m11792newInstance() {
            return new BoostQuery();
        }

        public boolean parseField(BoostQuery boostQuery, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                boostQuery.data = (BoostQueryData) BoostQueryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            boostQuery.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BoostQuery boostQuery, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(boostQuery, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BoostQuery boostQuery, JsonGenerator jsonGenerator) throws IOException {
            if (boostQuery.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(boostQuery.meta, jsonGenerator, true);
            }
            if (boostQuery.data != null) {
                jsonGenerator.writeFieldName("data");
                BoostQueryData.JSON_ADAPTER.serialize(boostQuery.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostQuery) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostQuery) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostQuery new_() {
        BoostQuery boostQuery = new BoostQuery();
        boostQuery.nullCheck();
        return boostQuery;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostQuery m11790clone() {
        BoostQuery boostQuery = new BoostQuery();
        Meta meta = this.meta;
        if (meta != null) {
            boostQuery.meta = meta.clone();
        }
        BoostQueryData boostQueryData = this.data;
        if (boostQueryData != null) {
            boostQuery.data = boostQueryData.m11794clone();
        }
        return boostQuery;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostQuery)) {
            return false;
        }
        BoostQuery boostQuery = (BoostQuery) obj;
        return this == obj && ValueObject.util_equals(this.meta, boostQuery.meta) && ValueObject.util_equals(this.data, boostQuery.data);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        Meta meta = this.meta;
        int iHashCode2 = (iHashCode + (meta != null ? meta.hashCode() : 0)) * 41;
        BoostQueryData boostQueryData = this.data;
        int iHashCode3 = iHashCode2 + (boostQueryData != null ? boostQueryData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = BoostQueryData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
