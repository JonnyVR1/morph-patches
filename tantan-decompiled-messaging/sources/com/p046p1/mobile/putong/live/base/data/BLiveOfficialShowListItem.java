package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveOfficialShowListItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOfficialShowListItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOfficialShowListItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOfficialShowListItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOfficialShowListItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOfficialShowListItem newInstance() {
            return new BLiveOfficialShowListItem();
        }

        public boolean parseField(BLiveOfficialShowListItem bLiveOfficialShowListItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    bLiveOfficialShowListItem.startTime = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    bLiveOfficialShowListItem.endTime = jsonParser.getValueAsString();
                    return true;
                case "anchorAvatar":
                    bLiveOfficialShowListItem.anchorAvatar = jsonParser.getValueAsString();
                    return true;
                case "anchorName":
                    bLiveOfficialShowListItem.anchorName = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveOfficialShowListItem.anchorId = jsonParser.getValueAsString();
                    return true;
                case "isFollowed":
                    bLiveOfficialShowListItem.isFollowed = jsonParser.getValueAsBoolean();
                    return true;
                case "isOnlive":
                    bLiveOfficialShowListItem.isOnlive = jsonParser.getValueAsBoolean();
                    return true;
                case "desc":
                    bLiveOfficialShowListItem.desc = jsonParser.getValueAsString();
                    return true;
                case "liveState":
                    bLiveOfficialShowListItem.liveState = BLiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOfficialShowListItem bLiveOfficialShowListItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOfficialShowListItem.startTime;
            if (str != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.startTime, str);
            }
            String str2 = bLiveOfficialShowListItem.endTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("endTime", str2);
            }
            String str3 = bLiveOfficialShowListItem.anchorId;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorId", str3);
            }
            String str4 = bLiveOfficialShowListItem.anchorAvatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorAvatar", str4);
            }
            String str5 = bLiveOfficialShowListItem.anchorName;
            if (str5 != null) {
                jsonGenerator.writeStringField("anchorName", str5);
            }
            String str6 = bLiveOfficialShowListItem.desc;
            if (str6 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str6);
            }
            if (bLiveOfficialShowListItem.liveState != null) {
                jsonGenerator.writeFieldName("liveState");
                BLiveState.JSON_ADAPTER.serialize(bLiveOfficialShowListItem.liveState, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isFollowed", bLiveOfficialShowListItem.isFollowed);
            jsonGenerator.writeBooleanField("isOnlive", bLiveOfficialShowListItem.isOnlive);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOfficialShowListItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveofficialshowlistitem";

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorAvatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String anchorName;

    @NonNull
    @ProtobufIndex(index = 6)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 2)
    public String endTime;

    @ProtobufIndex(index = 8)
    public boolean isFollowed;

    @ProtobufIndex(index = 9)
    public boolean isOnlive;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveState liveState;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startTime;

    public static BLiveOfficialShowListItem new_() {
        BLiveOfficialShowListItem bLiveOfficialShowListItem = new BLiveOfficialShowListItem();
        bLiveOfficialShowListItem.nullCheck();
        return bLiveOfficialShowListItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOfficialShowListItem mo223809clone() {
        BLiveOfficialShowListItem bLiveOfficialShowListItem = new BLiveOfficialShowListItem();
        bLiveOfficialShowListItem.startTime = this.startTime;
        bLiveOfficialShowListItem.endTime = this.endTime;
        bLiveOfficialShowListItem.anchorId = this.anchorId;
        bLiveOfficialShowListItem.anchorAvatar = this.anchorAvatar;
        bLiveOfficialShowListItem.anchorName = this.anchorName;
        bLiveOfficialShowListItem.desc = this.desc;
        bLiveOfficialShowListItem.liveState = this.liveState;
        bLiveOfficialShowListItem.isFollowed = this.isFollowed;
        bLiveOfficialShowListItem.isOnlive = this.isOnlive;
        return bLiveOfficialShowListItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOfficialShowListItem)) {
            return false;
        }
        BLiveOfficialShowListItem bLiveOfficialShowListItem = (BLiveOfficialShowListItem) obj;
        return ValueObject.util_equals(this.startTime, bLiveOfficialShowListItem.startTime) && ValueObject.util_equals(this.endTime, bLiveOfficialShowListItem.endTime) && ValueObject.util_equals(this.anchorId, bLiveOfficialShowListItem.anchorId) && ValueObject.util_equals(this.anchorAvatar, bLiveOfficialShowListItem.anchorAvatar) && ValueObject.util_equals(this.anchorName, bLiveOfficialShowListItem.anchorName) && ValueObject.util_equals(this.desc, bLiveOfficialShowListItem.desc) && ValueObject.util_equals(this.liveState, bLiveOfficialShowListItem.liveState) && this.isFollowed == bLiveOfficialShowListItem.isFollowed && this.isOnlive == bLiveOfficialShowListItem.isOnlive;
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
        String str = this.startTime;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endTime;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorAvatar;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.anchorName;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.desc;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveState bLiveState = this.liveState;
        int iHashCode7 = ((((iHashCode6 + (bLiveState != null ? bLiveState.hashCode() : 0)) * 41) + (this.isFollowed ? 1231 : 1237)) * 41) + (this.isOnlive ? 1231 : 1237);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startTime == null) {
            this.startTime = "";
        }
        if (this.endTime == null) {
            this.endTime = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.anchorAvatar == null) {
            this.anchorAvatar = "";
        }
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.liveState == null) {
            this.liveState = (BLiveState) BLiveState.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
