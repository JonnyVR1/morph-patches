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
public class BoostQuery extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "boostquery";

    @NonNull
    @ProtobufIndex(index = 2)
    public BoostQueryData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<BoostQuery> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostQuery>() { // from class: com.p1.mobile.putong.core.data.BoostQuery.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostQuery boostQuery) {
            Meta meta = boostQuery.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            BoostQueryData boostQueryData = boostQuery.data;
            if (boostQueryData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, boostQueryData, BoostQueryData.PROTOBUF_ADAPTER);
            }
            boostQuery.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostQuery parse(nb5 nb5Var) throws IOException {
            BoostQuery boostQuery = new BoostQuery();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (boostQuery.meta == null) {
                        boostQuery.meta = Meta.new_();
                    }
                    if (boostQuery.data != null) {
                        break;
                    }
                    boostQuery.data = BoostQueryData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    boostQuery.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (boostQuery.meta == null) {
                            boostQuery.meta = Meta.new_();
                        }
                        if (boostQuery.data != null) {
                            break;
                        }
                        boostQuery.data = BoostQueryData.new_();
                        return boostQuery;
                    }
                    boostQuery.data = (BoostQueryData) nb5Var.m158743l(BoostQueryData.PROTOBUF_ADAPTER);
                }
            }
            return boostQuery;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostQuery boostQuery, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = boostQuery.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            BoostQueryData boostQueryData = boostQuery.data;
            if (boostQueryData != null) {
                codedOutputByteBufferNano.m17254K(2, boostQueryData, BoostQueryData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BoostQuery> JSON_ADAPTER = new ObjectJsonAdapter<BoostQuery>() { // from class: com.p1.mobile.putong.core.data.BoostQuery.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostQuery.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostQuery newInstance() {
            return new BoostQuery();
        }

        public boolean parseField(BoostQuery boostQuery, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                boostQuery.data = BoostQueryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            boostQuery.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BoostQuery boostQuery, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(boostQuery, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostQuery) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostQuery) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostQuery new_() {
        BoostQuery boostQuery = new BoostQuery();
        boostQuery.nullCheck();
        return boostQuery;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostQuery mo223809clone() {
        BoostQuery boostQuery = new BoostQuery();
        Meta meta = this.meta;
        if (meta != null) {
            boostQuery.meta = meta.mo223809clone();
        }
        BoostQueryData boostQueryData = this.data;
        if (boostQueryData != null) {
            boostQuery.data = boostQueryData.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        Meta meta = this.meta;
        int iHashCode2 = (iHashCode + (meta != null ? meta.hashCode() : 0)) * 41;
        BoostQueryData boostQueryData = this.data;
        int iHashCode3 = iHashCode2 + (boostQueryData != null ? boostQueryData.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = BoostQueryData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
