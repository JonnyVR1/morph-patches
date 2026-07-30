package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.OMSResourceType;
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
public class BLiveRoomInProfile extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRoomInProfile> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRoomInProfile>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRoomInProfile.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRoomInProfile.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRoomInProfile newInstance() {
            return new BLiveRoomInProfile();
        }

        public boolean parseField(BLiveRoomInProfile bLiveRoomInProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveRoomInProfile.subTitle = jsonParser.getValueAsString();
                    return true;
                case "anchorAvatar":
                    bLiveRoomInProfile.anchorAvatar = jsonParser.getValueAsString();
                    return true;
                case "background":
                    bLiveRoomInProfile.background = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveRoomInProfile.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveRoomInProfile.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveRoomInProfile.roomId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveRoomInProfile.status = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveRoomInProfile.title = jsonParser.getValueAsString();
                    return true;
                case "liveType":
                    bLiveRoomInProfile.liveType = jsonParser.getValueAsString();
                    return true;
                case "multiCallInfo":
                    bLiveRoomInProfile.multiCallInfo = BLiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRoomInProfile bLiveRoomInProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRoomInProfile.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            String str2 = bLiveRoomInProfile.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveRoomInProfile.subTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle", str3);
            }
            String str4 = bLiveRoomInProfile.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
            String str5 = bLiveRoomInProfile.roomId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomId", str5);
            }
            String str6 = bLiveRoomInProfile.liveType;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveType", str6);
            }
            String str7 = bLiveRoomInProfile.background;
            if (str7 != null) {
                jsonGenerator.writeStringField(OMSResourceType.background, str7);
            }
            String str8 = bLiveRoomInProfile.anchorAvatar;
            if (str8 != null) {
                jsonGenerator.writeStringField("anchorAvatar", str8);
            }
            String str9 = bLiveRoomInProfile.status;
            if (str9 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str9);
            }
            if (bLiveRoomInProfile.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                BLiveMultiCallInfo.JSON_ADAPTER.serialize(bLiveRoomInProfile.multiCallInfo, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRoomInProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveroominprofile";

    @NonNull
    @ProtobufIndex(index = 8)
    public String anchorAvatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String background;

    @NonNull
    @ProtobufIndex(index = 1)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String liveType;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveMultiCallInfo multiCallInfo;

    @NonNull
    @ProtobufIndex(index = 5)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String status;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveRoomInProfile new_() {
        BLiveRoomInProfile bLiveRoomInProfile = new BLiveRoomInProfile();
        bLiveRoomInProfile.nullCheck();
        return bLiveRoomInProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRoomInProfile mo225055clone() {
        BLiveRoomInProfile bLiveRoomInProfile = new BLiveRoomInProfile();
        bLiveRoomInProfile.liveId = this.liveId;
        bLiveRoomInProfile.title = this.title;
        bLiveRoomInProfile.subTitle = this.subTitle;
        bLiveRoomInProfile.anchorId = this.anchorId;
        bLiveRoomInProfile.roomId = this.roomId;
        bLiveRoomInProfile.liveType = this.liveType;
        bLiveRoomInProfile.background = this.background;
        bLiveRoomInProfile.anchorAvatar = this.anchorAvatar;
        bLiveRoomInProfile.status = this.status;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        if (bLiveMultiCallInfo != null) {
            bLiveRoomInProfile.multiCallInfo = bLiveMultiCallInfo.mo225055clone();
        }
        return bLiveRoomInProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRoomInProfile)) {
            return false;
        }
        BLiveRoomInProfile bLiveRoomInProfile = (BLiveRoomInProfile) obj;
        return ValueObject.util_equals(this.liveId, bLiveRoomInProfile.liveId) && ValueObject.util_equals(this.title, bLiveRoomInProfile.title) && ValueObject.util_equals(this.subTitle, bLiveRoomInProfile.subTitle) && ValueObject.util_equals(this.anchorId, bLiveRoomInProfile.anchorId) && ValueObject.util_equals(this.roomId, bLiveRoomInProfile.roomId) && ValueObject.util_equals(this.liveType, bLiveRoomInProfile.liveType) && ValueObject.util_equals(this.background, bLiveRoomInProfile.background) && ValueObject.util_equals(this.anchorAvatar, bLiveRoomInProfile.anchorAvatar) && ValueObject.util_equals(this.status, bLiveRoomInProfile.status) && ValueObject.util_equals(this.multiCallInfo, bLiveRoomInProfile.multiCallInfo);
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
        String str = this.liveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.roomId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.liveType;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.background;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.anchorAvatar;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.status;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        int iHashCode10 = iHashCode9 + (bLiveMultiCallInfo != null ? bLiveMultiCallInfo.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveType == null) {
            this.liveType = "";
        }
        if (this.background == null) {
            this.background = "";
        }
        if (this.anchorAvatar == null) {
            this.anchorAvatar = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.multiCallInfo == null) {
            this.multiCallInfo = BLiveMultiCallInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
