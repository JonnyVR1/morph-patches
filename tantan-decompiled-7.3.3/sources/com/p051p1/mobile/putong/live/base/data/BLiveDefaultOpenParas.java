package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveDefaultOpenParas extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDefaultOpenParas> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDefaultOpenParas>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDefaultOpenParas.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDefaultOpenParas.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDefaultOpenParas newInstance() {
            return new BLiveDefaultOpenParas();
        }

        public boolean parseField(BLiveDefaultOpenParas bLiveDefaultOpenParas, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "effectiveWatchMinSeconds":
                    bLiveDefaultOpenParas.effectiveWatchMinSeconds = jsonParser.getValueAsLong();
                    return true;
                case "maxOpenPerDay":
                    bLiveDefaultOpenParas.maxOpenPerDay = jsonParser.getValueAsInt();
                    return true;
                case "sidebarLiveLimitCount":
                    bLiveDefaultOpenParas.sidebarLiveLimitCount = jsonParser.getValueAsInt();
                    return true;
                case "maxOpenPerNDays":
                    bLiveDefaultOpenParas.maxOpenPerNDays = BLivePerNDays.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDefaultOpenParas bLiveDefaultOpenParas, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("effectiveWatchMinSeconds", bLiveDefaultOpenParas.effectiveWatchMinSeconds);
            jsonGenerator.writeNumberField("maxOpenPerDay", bLiveDefaultOpenParas.maxOpenPerDay);
            if (bLiveDefaultOpenParas.maxOpenPerNDays != null) {
                jsonGenerator.writeFieldName("maxOpenPerNDays");
                BLivePerNDays.JSON_ADAPTER.serialize(bLiveDefaultOpenParas.maxOpenPerNDays, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("sidebarLiveLimitCount", bLiveDefaultOpenParas.sidebarLiveLimitCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDefaultOpenParas) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedefaultopenparas";

    @ProtobufIndex(index = 1)
    public long effectiveWatchMinSeconds;

    @ProtobufIndex(index = 2)
    public int maxOpenPerDay;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLivePerNDays maxOpenPerNDays;

    @ProtobufIndex(index = 4)
    public int sidebarLiveLimitCount;

    public static BLiveDefaultOpenParas new_() {
        BLiveDefaultOpenParas bLiveDefaultOpenParas = new BLiveDefaultOpenParas();
        bLiveDefaultOpenParas.nullCheck();
        return bLiveDefaultOpenParas;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDefaultOpenParas mo225055clone() {
        BLiveDefaultOpenParas bLiveDefaultOpenParas = new BLiveDefaultOpenParas();
        bLiveDefaultOpenParas.effectiveWatchMinSeconds = this.effectiveWatchMinSeconds;
        bLiveDefaultOpenParas.maxOpenPerDay = this.maxOpenPerDay;
        BLivePerNDays bLivePerNDays = this.maxOpenPerNDays;
        if (bLivePerNDays != null) {
            bLiveDefaultOpenParas.maxOpenPerNDays = bLivePerNDays.mo225055clone();
        }
        bLiveDefaultOpenParas.sidebarLiveLimitCount = this.sidebarLiveLimitCount;
        return bLiveDefaultOpenParas;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDefaultOpenParas)) {
            return false;
        }
        BLiveDefaultOpenParas bLiveDefaultOpenParas = (BLiveDefaultOpenParas) obj;
        return this.effectiveWatchMinSeconds == bLiveDefaultOpenParas.effectiveWatchMinSeconds && this.maxOpenPerDay == bLiveDefaultOpenParas.maxOpenPerDay && ValueObject.util_equals(this.maxOpenPerNDays, bLiveDefaultOpenParas.maxOpenPerNDays) && this.sidebarLiveLimitCount == bLiveDefaultOpenParas.sidebarLiveLimitCount;
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
        long j = this.effectiveWatchMinSeconds;
        int i2 = ((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.maxOpenPerDay) * 41;
        BLivePerNDays bLivePerNDays = this.maxOpenPerNDays;
        int iHashCode = ((i2 + (bLivePerNDays != null ? bLivePerNDays.hashCode() : 0)) * 41) + this.sidebarLiveLimitCount;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.maxOpenPerNDays == null) {
            this.maxOpenPerNDays = BLivePerNDays.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
