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
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveRoomCardInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRoomCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRoomCardInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRoomCardInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRoomCardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRoomCardInfo newInstance() {
            return new BLiveRoomCardInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveRoomCardInfo bLiveRoomCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1620863922:
                    if (str.equals("exposureTimeStart")) {
                        b = 0;
                    }
                    break;
                case -1570413625:
                    if (str.equals("exposureTimeEnd")) {
                        b = 1;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 2;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 3;
                    }
                    break;
                case -611265593:
                    if (str.equals("prepareTimeEnd")) {
                        b = 4;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 5;
                    }
                    break;
                case -266464859:
                    if (str.equals("userType")) {
                        b = 6;
                    }
                    break;
                case -215819606:
                    if (str.equals("userHierarchy")) {
                        b = 7;
                    }
                    break;
                case -8227222:
                    if (str.equals("cardType")) {
                        b = 8;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 9;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        b = 10;
                    }
                    break;
                case 322451948:
                    if (str.equals("userMedal")) {
                        b = 11;
                    }
                    break;
                case 997393486:
                    if (str.equals("prepareTimeStart")) {
                        b = 12;
                    }
                    break;
                case 1343750747:
                    if (str.equals("msgType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveRoomCardInfo.exposureTimeStart = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    bLiveRoomCardInfo.exposureTimeEnd = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    bLiveRoomCardInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveRoomCardInfo.userId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveRoomCardInfo.prepareTimeEnd = jsonParser.getValueAsLong();
                    return true;
                case 5:
                    bLiveRoomCardInfo.userName = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveRoomCardInfo.userType = BLiveUserType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 7:
                    bLiveRoomCardInfo.userHierarchy = jsonParser.getValueAsLong();
                    return true;
                case 8:
                    bLiveRoomCardInfo.cardType = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveRoomCardInfo.icon = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveRoomCardInfo.text = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveRoomCardInfo.userMedal = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveRoomCardInfo.prepareTimeStart = jsonParser.getValueAsLong();
                    return true;
                case 13:
                    bLiveRoomCardInfo.msgType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRoomCardInfo bLiveRoomCardInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("prepareTimeStart", bLiveRoomCardInfo.prepareTimeStart);
            jsonGenerator.writeNumberField("prepareTimeEnd", bLiveRoomCardInfo.prepareTimeEnd);
            jsonGenerator.writeNumberField("exposureTimeStart", bLiveRoomCardInfo.exposureTimeStart);
            jsonGenerator.writeNumberField("exposureTimeEnd", bLiveRoomCardInfo.exposureTimeEnd);
            if (bLiveRoomCardInfo.userType != null) {
                jsonGenerator.writeFieldName("userType");
                BLiveUserType.JSON_ADAPTER.serialize(bLiveRoomCardInfo.userType, jsonGenerator, true);
            }
            String str = bLiveRoomCardInfo.cardType;
            if (str != null) {
                jsonGenerator.writeStringField("cardType", str);
            }
            String str2 = bLiveRoomCardInfo.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveRoomCardInfo.userName;
            if (str3 != null) {
                jsonGenerator.writeStringField("userName", str3);
            }
            jsonGenerator.writeNumberField("userHierarchy", bLiveRoomCardInfo.userHierarchy);
            String str4 = bLiveRoomCardInfo.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            String str5 = bLiveRoomCardInfo.userMedal;
            if (str5 != null) {
                jsonGenerator.writeStringField("userMedal", str5);
            }
            String str6 = bLiveRoomCardInfo.roomId;
            if (str6 != null) {
                jsonGenerator.writeStringField("roomId", str6);
            }
            String str7 = bLiveRoomCardInfo.text;
            if (str7 != null) {
                jsonGenerator.writeStringField("text", str7);
            }
            String str8 = bLiveRoomCardInfo.msgType;
            if (str8 != null) {
                jsonGenerator.writeStringField("msgType", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRoomCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveroomcardinfo";

    @NonNull
    @ProtobufIndex(index = 6)
    public String cardType;

    @ProtobufIndex(index = 4)
    public long exposureTimeEnd;

    @ProtobufIndex(index = 3)
    public long exposureTimeStart;

    @NonNull
    @ProtobufIndex(index = 10)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 14)
    public String msgType;

    @ProtobufIndex(index = 2)
    public long prepareTimeEnd;

    @ProtobufIndex(index = 1)
    public long prepareTimeStart;

    @NonNull
    @ProtobufIndex(index = 12)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 13)
    public String text;

    @ProtobufIndex(index = 9)
    public long userHierarchy;

    @NonNull
    @ProtobufIndex(index = 7)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 11)
    public String userMedal;

    @NonNull
    @ProtobufIndex(index = 8)
    public String userName;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveUserType userType;

    public static BLiveRoomCardInfo new_() {
        BLiveRoomCardInfo bLiveRoomCardInfo = new BLiveRoomCardInfo();
        bLiveRoomCardInfo.nullCheck();
        return bLiveRoomCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRoomCardInfo mo225055clone() {
        BLiveRoomCardInfo bLiveRoomCardInfo = new BLiveRoomCardInfo();
        bLiveRoomCardInfo.prepareTimeStart = this.prepareTimeStart;
        bLiveRoomCardInfo.prepareTimeEnd = this.prepareTimeEnd;
        bLiveRoomCardInfo.exposureTimeStart = this.exposureTimeStart;
        bLiveRoomCardInfo.exposureTimeEnd = this.exposureTimeEnd;
        bLiveRoomCardInfo.userType = this.userType;
        bLiveRoomCardInfo.cardType = this.cardType;
        bLiveRoomCardInfo.userId = this.userId;
        bLiveRoomCardInfo.userName = this.userName;
        bLiveRoomCardInfo.userHierarchy = this.userHierarchy;
        bLiveRoomCardInfo.icon = this.icon;
        bLiveRoomCardInfo.userMedal = this.userMedal;
        bLiveRoomCardInfo.roomId = this.roomId;
        bLiveRoomCardInfo.text = this.text;
        bLiveRoomCardInfo.msgType = this.msgType;
        return bLiveRoomCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRoomCardInfo)) {
            return false;
        }
        BLiveRoomCardInfo bLiveRoomCardInfo = (BLiveRoomCardInfo) obj;
        return this.prepareTimeStart == bLiveRoomCardInfo.prepareTimeStart && this.prepareTimeEnd == bLiveRoomCardInfo.prepareTimeEnd && this.exposureTimeStart == bLiveRoomCardInfo.exposureTimeStart && this.exposureTimeEnd == bLiveRoomCardInfo.exposureTimeEnd && ValueObject.util_equals(this.userType, bLiveRoomCardInfo.userType) && ValueObject.util_equals(this.cardType, bLiveRoomCardInfo.cardType) && ValueObject.util_equals(this.userId, bLiveRoomCardInfo.userId) && ValueObject.util_equals(this.userName, bLiveRoomCardInfo.userName) && this.userHierarchy == bLiveRoomCardInfo.userHierarchy && ValueObject.util_equals(this.icon, bLiveRoomCardInfo.icon) && ValueObject.util_equals(this.userMedal, bLiveRoomCardInfo.userMedal) && ValueObject.util_equals(this.roomId, bLiveRoomCardInfo.roomId) && ValueObject.util_equals(this.text, bLiveRoomCardInfo.text) && ValueObject.util_equals(this.msgType, bLiveRoomCardInfo.msgType);
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
        long j = this.prepareTimeStart;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.prepareTimeEnd;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.exposureTimeStart;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.exposureTimeEnd;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        BLiveUserType bLiveUserType = this.userType;
        int iHashCode = (i5 + (bLiveUserType != null ? bLiveUserType.hashCode() : 0)) * 41;
        String str = this.cardType;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userName;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long j5 = this.userHierarchy;
        int i6 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j5 ^ (j5 >>> 32)))) * 41;
        String str4 = this.icon;
        int iHashCode5 = (i6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userMedal;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.roomId;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.text;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.msgType;
        int iHashCode9 = iHashCode8 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userType == null) {
            this.userType = (BLiveUserType) BLiveUserType.JSON_ADAPTER.defaultEnum();
        }
        if (this.cardType == null) {
            this.cardType = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.userMedal == null) {
            this.userMedal = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.msgType == null) {
            this.msgType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
