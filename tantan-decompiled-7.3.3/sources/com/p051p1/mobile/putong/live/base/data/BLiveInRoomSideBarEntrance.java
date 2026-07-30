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
import p153l.bu6;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveInRoomSideBarEntrance extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveInRoomSideBarEntrance> JSON_ADAPTER = new ObjectJsonAdapter<BLiveInRoomSideBarEntrance>() { // from class: com.p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveInRoomSideBarEntrance.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveInRoomSideBarEntrance newInstance() {
            return new BLiveInRoomSideBarEntrance();
        }

        public boolean parseField(BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "defaultOpenParas":
                    bLiveInRoomSideBarEntrance.defaultOpenParas = BLiveDefaultOpenParas.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "entrances":
                    bLiveInRoomSideBarEntrance.entrances = bu6.f78429a.parse(jsonParser, str2);
                    return true;
                case "motionEffective":
                    bLiveInRoomSideBarEntrance.motionEffective = BLiveMotionEffective.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveInRoomSideBarEntrance.motionEffective != null) {
                jsonGenerator.writeFieldName("motionEffective");
                BLiveMotionEffective.JSON_ADAPTER.serialize(bLiveInRoomSideBarEntrance.motionEffective, jsonGenerator, true);
            }
            if (bLiveInRoomSideBarEntrance.defaultOpenParas != null) {
                jsonGenerator.writeFieldName("defaultOpenParas");
                BLiveDefaultOpenParas.JSON_ADAPTER.serialize(bLiveInRoomSideBarEntrance.defaultOpenParas, jsonGenerator, true);
            }
            if (bLiveInRoomSideBarEntrance.entrances != null) {
                jsonGenerator.writeFieldName("entrances");
                bu6.f78429a.serialize(bLiveInRoomSideBarEntrance.entrances, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveInRoomSideBarEntrance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveinroomsidebarentrance";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveDefaultOpenParas defaultOpenParas;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveEntranceList entrances;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveMotionEffective motionEffective;

    public static BLiveInRoomSideBarEntrance new_() {
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance = new BLiveInRoomSideBarEntrance();
        bLiveInRoomSideBarEntrance.nullCheck();
        return bLiveInRoomSideBarEntrance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveInRoomSideBarEntrance mo225055clone() {
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance = new BLiveInRoomSideBarEntrance();
        BLiveMotionEffective bLiveMotionEffective = this.motionEffective;
        if (bLiveMotionEffective != null) {
            bLiveInRoomSideBarEntrance.motionEffective = bLiveMotionEffective.mo225055clone();
        }
        BLiveDefaultOpenParas bLiveDefaultOpenParas = this.defaultOpenParas;
        if (bLiveDefaultOpenParas != null) {
            bLiveInRoomSideBarEntrance.defaultOpenParas = bLiveDefaultOpenParas.mo225055clone();
        }
        BLiveEntranceList bLiveEntranceList = this.entrances;
        if (bLiveEntranceList != null) {
            bLiveInRoomSideBarEntrance.entrances = bLiveEntranceList.mo225055clone();
        }
        return bLiveInRoomSideBarEntrance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveInRoomSideBarEntrance)) {
            return false;
        }
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance = (BLiveInRoomSideBarEntrance) obj;
        return ValueObject.util_equals(this.motionEffective, bLiveInRoomSideBarEntrance.motionEffective) && ValueObject.util_equals(this.defaultOpenParas, bLiveInRoomSideBarEntrance.defaultOpenParas) && ValueObject.util_equals(this.entrances, bLiveInRoomSideBarEntrance.entrances);
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
        BLiveMotionEffective bLiveMotionEffective = this.motionEffective;
        int iHashCode = (i2 + (bLiveMotionEffective != null ? bLiveMotionEffective.hashCode() : 0)) * 41;
        BLiveDefaultOpenParas bLiveDefaultOpenParas = this.defaultOpenParas;
        int iHashCode2 = (iHashCode + (bLiveDefaultOpenParas != null ? bLiveDefaultOpenParas.hashCode() : 0)) * 41;
        BLiveEntranceList bLiveEntranceList = this.entrances;
        int iHashCode3 = iHashCode2 + (bLiveEntranceList != null ? bLiveEntranceList.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.motionEffective == null) {
            this.motionEffective = BLiveMotionEffective.new_();
        }
        if (this.defaultOpenParas == null) {
            this.defaultOpenParas = BLiveDefaultOpenParas.new_();
        }
        if (this.entrances == null) {
            this.entrances = BLiveEntranceList.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
