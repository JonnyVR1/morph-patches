package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftOfficialShowExtraInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftOfficialShowExtraInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftOfficialShowExtraInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftOfficialShowExtraInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftOfficialShowExtraInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftOfficialShowExtraInfo newInstance() {
            return new BLiveGiftOfficialShowExtraInfo();
        }

        public boolean parseField(BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    bLiveGiftOfficialShowExtraInfo.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveGiftOfficialShowExtraInfo.anchorId = jsonParser.getValueAsString();
                    return true;
                case "programId":
                    bLiveGiftOfficialShowExtraInfo.programId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveGiftOfficialShowExtraInfo.roomId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftOfficialShowExtraInfo.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveGiftOfficialShowExtraInfo.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = bLiveGiftOfficialShowExtraInfo.anchorId;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorId", str3);
            }
            String str4 = bLiveGiftOfficialShowExtraInfo.programId;
            if (str4 != null) {
                jsonGenerator.writeStringField("programId", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftOfficialShowExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftofficialshowextrainfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String programId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    public static BLiveGiftOfficialShowExtraInfo new_() {
        BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfo = new BLiveGiftOfficialShowExtraInfo();
        bLiveGiftOfficialShowExtraInfo.nullCheck();
        return bLiveGiftOfficialShowExtraInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftOfficialShowExtraInfo mo223809clone() {
        BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfo = new BLiveGiftOfficialShowExtraInfo();
        bLiveGiftOfficialShowExtraInfo.roomId = this.roomId;
        bLiveGiftOfficialShowExtraInfo.liveId = this.liveId;
        bLiveGiftOfficialShowExtraInfo.anchorId = this.anchorId;
        bLiveGiftOfficialShowExtraInfo.programId = this.programId;
        return bLiveGiftOfficialShowExtraInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftOfficialShowExtraInfo)) {
            return false;
        }
        BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfo = (BLiveGiftOfficialShowExtraInfo) obj;
        return ValueObject.util_equals(this.roomId, bLiveGiftOfficialShowExtraInfo.roomId) && ValueObject.util_equals(this.liveId, bLiveGiftOfficialShowExtraInfo.liveId) && ValueObject.util_equals(this.anchorId, bLiveGiftOfficialShowExtraInfo.anchorId) && ValueObject.util_equals(this.programId, bLiveGiftOfficialShowExtraInfo.programId);
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
        String str4 = this.programId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
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
        if (this.programId == null) {
            this.programId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
