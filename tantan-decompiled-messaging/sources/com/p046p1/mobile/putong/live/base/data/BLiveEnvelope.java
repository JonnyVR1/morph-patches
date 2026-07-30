package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveEnvelope extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEnvelope>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEnvelope.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEnvelope newInstance() {
            return new BLiveEnvelope();
        }

        public boolean parseField(BLiveEnvelope bLiveEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "counters":
                    bLiveEnvelope.counters = BLiveOriginCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "data":
                    bLiveEnvelope.data = BLiveData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    bLiveEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveMagics":
                    bLiveEnvelope.liveMagics = BLiveMagic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pagination":
                    bLiveEnvelope.pagination = Pagination.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveCounters":
                    bLiveEnvelope.liveCounters = BLiveCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEnvelope bLiveEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(bLiveEnvelope.meta, jsonGenerator, true);
            }
            if (bLiveEnvelope.counters != null) {
                jsonGenerator.writeFieldName("counters");
                BLiveOriginCounter.JSON_ADAPTER.serialize(bLiveEnvelope.counters, jsonGenerator, true);
            }
            if (bLiveEnvelope.liveCounters != null) {
                jsonGenerator.writeFieldName("liveCounters");
                BLiveCounter.JSON_ADAPTER.serialize(bLiveEnvelope.liveCounters, jsonGenerator, true);
            }
            if (bLiveEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                BLiveData.JSON_ADAPTER.serialize(bLiveEnvelope.data, jsonGenerator, true);
            }
            if (bLiveEnvelope.liveMagics != null) {
                jsonGenerator.writeFieldName("liveMagics");
                BLiveMagic.JSON_ADAPTER.serialize(bLiveEnvelope.liveMagics, jsonGenerator, true);
            }
            if (bLiveEnvelope.pagination != null) {
                jsonGenerator.writeFieldName(Pagination.TYPE);
                Pagination.JSON_ADAPTER.serialize(bLiveEnvelope.pagination, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOriginCounter counters;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveData data;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveCounter liveCounters;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveMagic liveMagics;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;

    @NonNull
    @ProtobufIndex(index = 6)
    public Pagination pagination;

    public static BLiveEnvelope new_() {
        BLiveEnvelope bLiveEnvelope = new BLiveEnvelope();
        bLiveEnvelope.nullCheck();
        return bLiveEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEnvelope mo223809clone() {
        BLiveEnvelope bLiveEnvelope = new BLiveEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            bLiveEnvelope.meta = meta.mo223809clone();
        }
        BLiveOriginCounter bLiveOriginCounter = this.counters;
        if (bLiveOriginCounter != null) {
            bLiveEnvelope.counters = bLiveOriginCounter.mo223809clone();
        }
        BLiveCounter bLiveCounter = this.liveCounters;
        if (bLiveCounter != null) {
            bLiveEnvelope.liveCounters = bLiveCounter.mo223809clone();
        }
        BLiveData bLiveData = this.data;
        if (bLiveData != null) {
            bLiveEnvelope.data = bLiveData.mo223809clone();
        }
        BLiveMagic bLiveMagic = this.liveMagics;
        if (bLiveMagic != null) {
            bLiveEnvelope.liveMagics = bLiveMagic.mo223809clone();
        }
        Pagination pagination = this.pagination;
        if (pagination != null) {
            bLiveEnvelope.pagination = pagination.mo223809clone();
        }
        return bLiveEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEnvelope)) {
            return false;
        }
        BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
        return ValueObject.util_equals(this.meta, bLiveEnvelope.meta) && ValueObject.util_equals(this.counters, bLiveEnvelope.counters) && ValueObject.util_equals(this.liveCounters, bLiveEnvelope.liveCounters) && ValueObject.util_equals(this.data, bLiveEnvelope.data) && ValueObject.util_equals(this.liveMagics, bLiveEnvelope.liveMagics) && ValueObject.util_equals(this.pagination, bLiveEnvelope.pagination);
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
        BLiveOriginCounter bLiveOriginCounter = this.counters;
        int iHashCode2 = (iHashCode + (bLiveOriginCounter != null ? bLiveOriginCounter.hashCode() : 0)) * 41;
        BLiveCounter bLiveCounter = this.liveCounters;
        int iHashCode3 = (iHashCode2 + (bLiveCounter != null ? bLiveCounter.hashCode() : 0)) * 41;
        BLiveData bLiveData = this.data;
        int iHashCode4 = (iHashCode3 + (bLiveData != null ? bLiveData.hashCode() : 0)) * 41;
        BLiveMagic bLiveMagic = this.liveMagics;
        int iHashCode5 = (iHashCode4 + (bLiveMagic != null ? bLiveMagic.hashCode() : 0)) * 41;
        Pagination pagination = this.pagination;
        int iHashCode6 = iHashCode5 + (pagination != null ? pagination.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.counters == null) {
            this.counters = BLiveOriginCounter.new_();
        }
        if (this.liveCounters == null) {
            this.liveCounters = BLiveCounter.new_();
        }
        if (this.data == null) {
            this.data = BLiveData.new_();
        }
        if (this.liveMagics == null) {
            this.liveMagics = BLiveMagic.new_();
        }
        if (this.pagination == null) {
            this.pagination = Pagination.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (Relationship relationship : this.data.relationships) {
            map.put(relationship.f38806id, relationship);
        }
        for (Followship followship : this.data.followships) {
            map2.put(followship.otherUser, followship);
        }
        for (User user : this.data.users) {
            if (map.size() != 0) {
                user.localRelationship = (Relationship) map.get(user.f56011id);
            }
            if (map2.size() != 0) {
                user.localFollowship = (Followship) map2.get(user.f56011id);
            }
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
