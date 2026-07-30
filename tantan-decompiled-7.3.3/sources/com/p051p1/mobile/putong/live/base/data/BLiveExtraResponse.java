package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveExtraResponse extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveExtraResponse> JSON_ADAPTER = new ObjectJsonAdapter<BLiveExtraResponse>() { // from class: com.p1.mobile.putong.live.base.data.BLiveExtraResponse.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveExtraResponse.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveExtraResponse newInstance() {
            return new BLiveExtraResponse();
        }

        public boolean parseField(BLiveExtraResponse bLiveExtraResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "data":
                    bLiveExtraResponse.data = BLiveExtraData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    bLiveExtraResponse.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pagination":
                    bLiveExtraResponse.pagination = Pagination.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveExtraResponse bLiveExtraResponse, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveExtraResponse.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(bLiveExtraResponse.meta, jsonGenerator, true);
            }
            if (bLiveExtraResponse.data != null) {
                jsonGenerator.writeFieldName("data");
                BLiveExtraData.JSON_ADAPTER.serialize(bLiveExtraResponse.data, jsonGenerator, true);
            }
            if (bLiveExtraResponse.pagination != null) {
                jsonGenerator.writeFieldName(Pagination.TYPE);
                Pagination.JSON_ADAPTER.serialize(bLiveExtraResponse.pagination, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveExtraResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveextraresponse";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveExtraData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;

    @NonNull
    @ProtobufIndex(index = 3)
    public Pagination pagination;

    public static BLiveExtraResponse new_() {
        BLiveExtraResponse bLiveExtraResponse = new BLiveExtraResponse();
        bLiveExtraResponse.nullCheck();
        return bLiveExtraResponse;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveExtraResponse mo225055clone() {
        BLiveExtraResponse bLiveExtraResponse = new BLiveExtraResponse();
        Meta meta = this.meta;
        if (meta != null) {
            bLiveExtraResponse.meta = meta.mo225055clone();
        }
        BLiveExtraData bLiveExtraData = this.data;
        if (bLiveExtraData != null) {
            bLiveExtraResponse.data = bLiveExtraData.mo225055clone();
        }
        Pagination pagination = this.pagination;
        if (pagination != null) {
            bLiveExtraResponse.pagination = pagination.mo225055clone();
        }
        return bLiveExtraResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveExtraResponse)) {
            return false;
        }
        BLiveExtraResponse bLiveExtraResponse = (BLiveExtraResponse) obj;
        return ValueObject.util_equals(this.meta, bLiveExtraResponse.meta) && ValueObject.util_equals(this.data, bLiveExtraResponse.data) && ValueObject.util_equals(this.pagination, bLiveExtraResponse.pagination);
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
        BLiveExtraData bLiveExtraData = this.data;
        int iHashCode2 = (iHashCode + (bLiveExtraData != null ? bLiveExtraData.hashCode() : 0)) * 41;
        Pagination pagination = this.pagination;
        int iHashCode3 = iHashCode2 + (pagination != null ? pagination.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = BLiveExtraData.new_();
        }
        if (this.pagination == null) {
            this.pagination = Pagination.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
