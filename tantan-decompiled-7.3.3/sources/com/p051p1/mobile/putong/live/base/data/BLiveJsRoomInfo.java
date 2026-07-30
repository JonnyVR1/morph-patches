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
public class BLiveJsRoomInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveJsRoomInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveJsRoomInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveJsRoomInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveJsRoomInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveJsRoomInfo newInstance() {
            return new BLiveJsRoomInfo();
        }

        public boolean parseField(BLiveJsRoomInfo bLiveJsRoomInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fanBaseId":
                    bLiveJsRoomInfo.fanBaseId = jsonParser.getValueAsString();
                    return true;
                case "fakeId":
                    bLiveJsRoomInfo.fakeId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveJsRoomInfo.liveId = jsonParser.getValueAsString();
                    return true;
                case "pageId":
                    bLiveJsRoomInfo.pageId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveJsRoomInfo.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveJsRoomInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case "roomType":
                    bLiveJsRoomInfo.roomType = jsonParser.getValueAsString();
                    return true;
                case "liveMode":
                    bLiveJsRoomInfo.liveMode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveJsRoomInfo bLiveJsRoomInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveJsRoomInfo.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveJsRoomInfo.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = bLiveJsRoomInfo.anchorId;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorId", str3);
            }
            String str4 = bLiveJsRoomInfo.fanBaseId;
            if (str4 != null) {
                jsonGenerator.writeStringField("fanBaseId", str4);
            }
            String str5 = bLiveJsRoomInfo.roomType;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomType", str5);
            }
            String str6 = bLiveJsRoomInfo.pageId;
            if (str6 != null) {
                jsonGenerator.writeStringField("pageId", str6);
            }
            String str7 = bLiveJsRoomInfo.fakeId;
            if (str7 != null) {
                jsonGenerator.writeStringField("fakeId", str7);
            }
            String str8 = bLiveJsRoomInfo.liveMode;
            if (str8 != null) {
                jsonGenerator.writeStringField("liveMode", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveJsRoomInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivejsroominfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String fanBaseId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String liveMode;

    @NonNull
    @ProtobufIndex(index = 6)
    public String pageId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String roomType;

    public static BLiveJsRoomInfo new_() {
        BLiveJsRoomInfo bLiveJsRoomInfo = new BLiveJsRoomInfo();
        bLiveJsRoomInfo.nullCheck();
        return bLiveJsRoomInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveJsRoomInfo mo225055clone() {
        BLiveJsRoomInfo bLiveJsRoomInfo = new BLiveJsRoomInfo();
        bLiveJsRoomInfo.roomId = this.roomId;
        bLiveJsRoomInfo.liveId = this.liveId;
        bLiveJsRoomInfo.anchorId = this.anchorId;
        bLiveJsRoomInfo.fanBaseId = this.fanBaseId;
        bLiveJsRoomInfo.roomType = this.roomType;
        bLiveJsRoomInfo.pageId = this.pageId;
        bLiveJsRoomInfo.fakeId = this.fakeId;
        bLiveJsRoomInfo.liveMode = this.liveMode;
        return bLiveJsRoomInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveJsRoomInfo)) {
            return false;
        }
        BLiveJsRoomInfo bLiveJsRoomInfo = (BLiveJsRoomInfo) obj;
        return ValueObject.util_equals(this.roomId, bLiveJsRoomInfo.roomId) && ValueObject.util_equals(this.liveId, bLiveJsRoomInfo.liveId) && ValueObject.util_equals(this.anchorId, bLiveJsRoomInfo.anchorId) && ValueObject.util_equals(this.fanBaseId, bLiveJsRoomInfo.fanBaseId) && ValueObject.util_equals(this.roomType, bLiveJsRoomInfo.roomType) && ValueObject.util_equals(this.pageId, bLiveJsRoomInfo.pageId) && ValueObject.util_equals(this.fakeId, bLiveJsRoomInfo.fakeId) && ValueObject.util_equals(this.liveMode, bLiveJsRoomInfo.liveMode);
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.fanBaseId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.roomType;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.pageId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.fakeId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.liveMode;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.fanBaseId == null) {
            this.fanBaseId = "";
        }
        if (this.roomType == null) {
            this.roomType = "";
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
        if (this.liveMode == null) {
            this.liveMode = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
