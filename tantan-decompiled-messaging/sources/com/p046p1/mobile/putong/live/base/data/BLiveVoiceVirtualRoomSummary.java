package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class BLiveVoiceVirtualRoomSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceVirtualRoomSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceVirtualRoomSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceVirtualRoomSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceVirtualRoomSummary newInstance() {
            return new BLiveVoiceVirtualRoomSummary();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1656559075:
                    if (str.equals("levelIcon")) {
                        b = 0;
                    }
                    break;
                case -1101330807:
                    if (str.equals("heatIcon")) {
                        b = 1;
                    }
                    break;
                case -1101014899:
                    if (str.equals("heatSvga")) {
                        b = 2;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 3;
                    }
                    break;
                case -754474244:
                    if (str.equals("levelSmallIcon")) {
                        b = 4;
                    }
                    break;
                case -351778248:
                    if (str.equals("coverUrl")) {
                        b = 5;
                    }
                    break;
                case -350106230:
                    if (str.equals("isPersonal")) {
                        b = 6;
                    }
                    break;
                case -161207671:
                    if (str.equals("coverStatus")) {
                        b = 7;
                    }
                    break;
                case 3198448:
                    if (str.equals("heat")) {
                        b = 8;
                    }
                    break;
                case 102865796:
                    if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                        b = 9;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 10;
                    }
                    break;
                case 500968223:
                    if (str.equals("publicRoomId")) {
                        b = 11;
                    }
                    break;
                case 516537450:
                    if (str.equals("titleStatus")) {
                        b = 12;
                    }
                    break;
                case 1209995278:
                    if (str.equals("managerLimit")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1940827158:
                    if (str.equals("settledCount")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceVirtualRoomSummary.levelIcon = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceVirtualRoomSummary.heatIcon = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVoiceVirtualRoomSummary.heatSvga = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceVirtualRoomSummary.roomId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceVirtualRoomSummary.levelSmallIcon = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveVoiceVirtualRoomSummary.coverUrl = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoiceVirtualRoomSummary.isPersonal = jsonParser.getValueAsBoolean();
                    return true;
                case 7:
                    bLiveVoiceVirtualRoomSummary.coverStatus = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVoiceVirtualRoomSummary.heat = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    bLiveVoiceVirtualRoomSummary.level = jsonParser.getValueAsInt();
                    return true;
                case 10:
                    bLiveVoiceVirtualRoomSummary.title = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceVirtualRoomSummary.publicRoomId = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoiceVirtualRoomSummary.titleStatus = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceVirtualRoomSummary.managerLimit = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    bLiveVoiceVirtualRoomSummary.settledCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceVirtualRoomSummary.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveVoiceVirtualRoomSummary.level);
            String str2 = bLiveVoiceVirtualRoomSummary.levelIcon;
            if (str2 != null) {
                jsonGenerator.writeStringField("levelIcon", str2);
            }
            jsonGenerator.writeNumberField("heat", bLiveVoiceVirtualRoomSummary.heat);
            String str3 = bLiveVoiceVirtualRoomSummary.heatIcon;
            if (str3 != null) {
                jsonGenerator.writeStringField("heatIcon", str3);
            }
            String str4 = bLiveVoiceVirtualRoomSummary.heatSvga;
            if (str4 != null) {
                jsonGenerator.writeStringField("heatSvga", str4);
            }
            jsonGenerator.writeNumberField("settledCount", bLiveVoiceVirtualRoomSummary.settledCount);
            jsonGenerator.writeNumberField("managerLimit", bLiveVoiceVirtualRoomSummary.managerLimit);
            jsonGenerator.writeBooleanField("isPersonal", bLiveVoiceVirtualRoomSummary.isPersonal);
            String str5 = bLiveVoiceVirtualRoomSummary.coverUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("coverUrl", str5);
            }
            String str6 = bLiveVoiceVirtualRoomSummary.coverStatus;
            if (str6 != null) {
                jsonGenerator.writeStringField("coverStatus", str6);
            }
            String str7 = bLiveVoiceVirtualRoomSummary.publicRoomId;
            if (str7 != null) {
                jsonGenerator.writeStringField("publicRoomId", str7);
            }
            String str8 = bLiveVoiceVirtualRoomSummary.levelSmallIcon;
            if (str8 != null) {
                jsonGenerator.writeStringField("levelSmallIcon", str8);
            }
            String str9 = bLiveVoiceVirtualRoomSummary.title;
            if (str9 != null) {
                jsonGenerator.writeStringField("title", str9);
            }
            String str10 = bLiveVoiceVirtualRoomSummary.titleStatus;
            if (str10 != null) {
                jsonGenerator.writeStringField("titleStatus", str10);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceVirtualRoomSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicevirtualroomsummary";

    @NonNull
    @ProtobufIndex(index = 11)
    public String coverStatus;

    @NonNull
    @ProtobufIndex(index = 10)
    public String coverUrl;

    @ProtobufIndex(index = 4)
    public int heat;

    @NonNull
    @ProtobufIndex(index = 5)
    public String heatIcon;

    @NonNull
    @ProtobufIndex(index = 6)
    public String heatSvga;

    @ProtobufIndex(index = 9)
    public boolean isPersonal;

    @ProtobufIndex(index = 2)
    public int level;

    @NonNull
    @ProtobufIndex(index = 3)
    public String levelIcon;

    @NonNull
    @ProtobufIndex(index = 13)
    public String levelSmallIcon;

    @ProtobufIndex(index = 8)
    public int managerLimit;

    @NonNull
    @ProtobufIndex(index = 12)
    public String publicRoomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @ProtobufIndex(index = 7)
    public int settledCount;

    @NonNull
    @ProtobufIndex(index = 14)
    public String title;

    @NonNull
    @ProtobufIndex(index = 15)
    public String titleStatus;

    public static BLiveVoiceVirtualRoomSummary new_() {
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = new BLiveVoiceVirtualRoomSummary();
        bLiveVoiceVirtualRoomSummary.nullCheck();
        return bLiveVoiceVirtualRoomSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceVirtualRoomSummary mo223809clone() {
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = new BLiveVoiceVirtualRoomSummary();
        bLiveVoiceVirtualRoomSummary.roomId = this.roomId;
        bLiveVoiceVirtualRoomSummary.level = this.level;
        bLiveVoiceVirtualRoomSummary.levelIcon = this.levelIcon;
        bLiveVoiceVirtualRoomSummary.heat = this.heat;
        bLiveVoiceVirtualRoomSummary.heatIcon = this.heatIcon;
        bLiveVoiceVirtualRoomSummary.heatSvga = this.heatSvga;
        bLiveVoiceVirtualRoomSummary.settledCount = this.settledCount;
        bLiveVoiceVirtualRoomSummary.managerLimit = this.managerLimit;
        bLiveVoiceVirtualRoomSummary.isPersonal = this.isPersonal;
        bLiveVoiceVirtualRoomSummary.coverUrl = this.coverUrl;
        bLiveVoiceVirtualRoomSummary.coverStatus = this.coverStatus;
        bLiveVoiceVirtualRoomSummary.publicRoomId = this.publicRoomId;
        bLiveVoiceVirtualRoomSummary.levelSmallIcon = this.levelSmallIcon;
        bLiveVoiceVirtualRoomSummary.title = this.title;
        bLiveVoiceVirtualRoomSummary.titleStatus = this.titleStatus;
        return bLiveVoiceVirtualRoomSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceVirtualRoomSummary)) {
            return false;
        }
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = (BLiveVoiceVirtualRoomSummary) obj;
        return ValueObject.util_equals(this.roomId, bLiveVoiceVirtualRoomSummary.roomId) && this.level == bLiveVoiceVirtualRoomSummary.level && ValueObject.util_equals(this.levelIcon, bLiveVoiceVirtualRoomSummary.levelIcon) && this.heat == bLiveVoiceVirtualRoomSummary.heat && ValueObject.util_equals(this.heatIcon, bLiveVoiceVirtualRoomSummary.heatIcon) && ValueObject.util_equals(this.heatSvga, bLiveVoiceVirtualRoomSummary.heatSvga) && this.settledCount == bLiveVoiceVirtualRoomSummary.settledCount && this.managerLimit == bLiveVoiceVirtualRoomSummary.managerLimit && this.isPersonal == bLiveVoiceVirtualRoomSummary.isPersonal && ValueObject.util_equals(this.coverUrl, bLiveVoiceVirtualRoomSummary.coverUrl) && ValueObject.util_equals(this.coverStatus, bLiveVoiceVirtualRoomSummary.coverStatus) && ValueObject.util_equals(this.publicRoomId, bLiveVoiceVirtualRoomSummary.publicRoomId) && ValueObject.util_equals(this.levelSmallIcon, bLiveVoiceVirtualRoomSummary.levelSmallIcon) && ValueObject.util_equals(this.title, bLiveVoiceVirtualRoomSummary.title) && ValueObject.util_equals(this.titleStatus, bLiveVoiceVirtualRoomSummary.titleStatus);
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.level) * 41;
        String str2 = this.levelIcon;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.heat) * 41;
        String str3 = this.heatIcon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.heatSvga;
        int iHashCode4 = (((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.settledCount) * 41) + this.managerLimit) * 41) + (this.isPersonal ? 1231 : 1237)) * 41;
        String str5 = this.coverUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.coverStatus;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.publicRoomId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.levelSmallIcon;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.title;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.titleStatus;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.levelIcon == null) {
            this.levelIcon = "";
        }
        if (this.heatIcon == null) {
            this.heatIcon = "";
        }
        if (this.heatSvga == null) {
            this.heatSvga = "";
        }
        if (this.coverUrl == null) {
            this.coverUrl = "";
        }
        if (this.coverStatus == null) {
            this.coverStatus = "";
        }
        if (this.publicRoomId == null) {
            this.publicRoomId = "";
        }
        if (this.levelSmallIcon == null) {
            this.levelSmallIcon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.titleStatus == null) {
            this.titleStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
