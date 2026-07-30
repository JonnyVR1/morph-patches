package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
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
public class BLiveMemberActivityData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMemberActivityData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMemberActivityData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMemberActivityData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMemberActivityData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMemberActivityData newInstance() {
            return new BLiveMemberActivityData();
        }

        public boolean parseField(BLiveMemberActivityData bLiveMemberActivityData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveMemberActivityData.avatar = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    bLiveMemberActivityData.schema = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveMemberActivityData.status = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveMemberActivityData.userId = jsonParser.getValueAsString();
                    return true;
                case "endTimeStamp":
                    bLiveMemberActivityData.endTimeStamp = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "voiceLiveId":
                    bLiveMemberActivityData.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "mainTitle":
                    bLiveMemberActivityData.mainTitle = jsonParser.getValueAsString();
                    return true;
                case "secondTitle":
                    bLiveMemberActivityData.secondTitle = jsonParser.getValueAsString();
                    return true;
                case "relationStatus":
                    bLiveMemberActivityData.relationStatus = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMemberActivityData bLiveMemberActivityData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMemberActivityData.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveMemberActivityData.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatar", str2);
            }
            String str3 = bLiveMemberActivityData.voiceLiveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str3);
            }
            String str4 = bLiveMemberActivityData.mainTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("mainTitle", str4);
            }
            String str5 = bLiveMemberActivityData.secondTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("secondTitle", str5);
            }
            String str6 = bLiveMemberActivityData.status;
            if (str6 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str6);
            }
            jsonGenerator.writeFieldName("endTimeStamp");
            Converter.API_TIME.serialize(Double.valueOf(bLiveMemberActivityData.endTimeStamp), jsonGenerator, true);
            String str7 = bLiveMemberActivityData.relationStatus;
            if (str7 != null) {
                jsonGenerator.writeStringField("relationStatus", str7);
            }
            String str8 = bLiveMemberActivityData.schema;
            if (str8 != null) {
                jsonGenerator.writeStringField("schema", str8);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMemberActivityData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivememberactivitydata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    @ProtobufIndex(index = 8)
    public double endTimeStamp;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mainTitle;

    @NonNull
    @ProtobufIndex(index = 7)
    public String relationStatus;

    @NonNull
    @ProtobufIndex(index = 9)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 5)
    public String secondTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceLiveId;

    public static BLiveMemberActivityData new_() {
        BLiveMemberActivityData bLiveMemberActivityData = new BLiveMemberActivityData();
        bLiveMemberActivityData.nullCheck();
        return bLiveMemberActivityData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMemberActivityData mo223809clone() {
        BLiveMemberActivityData bLiveMemberActivityData = new BLiveMemberActivityData();
        bLiveMemberActivityData.userId = this.userId;
        bLiveMemberActivityData.avatar = this.avatar;
        bLiveMemberActivityData.voiceLiveId = this.voiceLiveId;
        bLiveMemberActivityData.mainTitle = this.mainTitle;
        bLiveMemberActivityData.secondTitle = this.secondTitle;
        bLiveMemberActivityData.status = this.status;
        bLiveMemberActivityData.endTimeStamp = this.endTimeStamp;
        bLiveMemberActivityData.relationStatus = this.relationStatus;
        bLiveMemberActivityData.schema = this.schema;
        return bLiveMemberActivityData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMemberActivityData)) {
            return false;
        }
        BLiveMemberActivityData bLiveMemberActivityData = (BLiveMemberActivityData) obj;
        return ValueObject.util_equals(this.userId, bLiveMemberActivityData.userId) && ValueObject.util_equals(this.avatar, bLiveMemberActivityData.avatar) && ValueObject.util_equals(this.voiceLiveId, bLiveMemberActivityData.voiceLiveId) && ValueObject.util_equals(this.mainTitle, bLiveMemberActivityData.mainTitle) && ValueObject.util_equals(this.secondTitle, bLiveMemberActivityData.secondTitle) && ValueObject.util_equals(this.status, bLiveMemberActivityData.status) && this.endTimeStamp == bLiveMemberActivityData.endTimeStamp && ValueObject.util_equals(this.relationStatus, bLiveMemberActivityData.relationStatus) && ValueObject.util_equals(this.schema, bLiveMemberActivityData.schema);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceLiveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.mainTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.secondTitle;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.status;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.endTimeStamp);
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str7 = this.relationStatus;
        int iHashCode7 = (i3 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.schema;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.mainTitle == null) {
            this.mainTitle = "";
        }
        if (this.secondTitle == null) {
            this.secondTitle = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.relationStatus == null) {
            this.relationStatus = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
