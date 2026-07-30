package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargePopupBonus;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFirstRechargeStatus extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFirstRechargeStatus> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFirstRechargeStatus>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFirstRechargeStatus.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFirstRechargeStatus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFirstRechargeStatus newInstance() {
            return new BLiveFirstRechargeStatus();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveFirstRechargeStatus bLiveFirstRechargeStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1917322321:
                    if (str.equals("showPopup")) {
                        b = 0;
                    }
                    break;
                case -1564778586:
                    if (str.equals("anchorImage")) {
                        b = 1;
                    }
                    break;
                case -1297264928:
                    if (str.equals("anchorName")) {
                        b = 2;
                    }
                    break;
                case -1231722786:
                    if (str.equals("abGroup")) {
                        b = 3;
                    }
                    break;
                case -748916528:
                    if (str.equals("isActive")) {
                        b = 4;
                    }
                    break;
                case -376221399:
                    if (str.equals("bonusEndTime")) {
                        b = 5;
                    }
                    break;
                case -291700868:
                    if (str.equals("delaySeconds")) {
                        b = 6;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 7;
                    }
                    break;
                case -233358096:
                    if (str.equals("bonusStartTime")) {
                        b = 8;
                    }
                    break;
                case -113091481:
                    if (str.equals("welcomeWords")) {
                        b = 9;
                    }
                    break;
                case 93921311:
                    if (str.equals("bonus")) {
                        b = 10;
                    }
                    break;
                case 318993488:
                    if (str.equals("userImage")) {
                        b = 11;
                    }
                    break;
                case 601235430:
                    if (str.equals("currentTime")) {
                        b = 12;
                    }
                    break;
                case 635399221:
                    if (str.equals("showNotice")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveFirstRechargeStatus.showPopup = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveFirstRechargeStatus.anchorImage = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveFirstRechargeStatus.anchorName = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveFirstRechargeStatus.abGroup = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveFirstRechargeStatus.isActive = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveFirstRechargeStatus.bonusEndTime = jsonParser.getValueAsLong();
                    return true;
                case 6:
                    bLiveFirstRechargeStatus.delaySeconds = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveFirstRechargeStatus.userName = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveFirstRechargeStatus.bonusStartTime = jsonParser.getValueAsLong();
                    return true;
                case 9:
                    bLiveFirstRechargeStatus.welcomeWords = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveFirstRechargeStatus.bonus = JsonAdapter.parseArray(jsonParser, BLiveFirstRechargePopupBonus.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveFirstRechargeStatus.userImage = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveFirstRechargeStatus.currentTime = jsonParser.getValueAsLong();
                    return true;
                case 13:
                    bLiveFirstRechargeStatus.showNotice = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFirstRechargeStatus bLiveFirstRechargeStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isActive", bLiveFirstRechargeStatus.isActive);
            jsonGenerator.writeBooleanField("showNotice", bLiveFirstRechargeStatus.showNotice);
            String str = bLiveFirstRechargeStatus.abGroup;
            if (str != null) {
                jsonGenerator.writeStringField("abGroup", str);
            }
            String str2 = bLiveFirstRechargeStatus.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveFirstRechargeStatus.userImage;
            if (str3 != null) {
                jsonGenerator.writeStringField("userImage", str3);
            }
            String str4 = bLiveFirstRechargeStatus.anchorName;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorName", str4);
            }
            String str5 = bLiveFirstRechargeStatus.anchorImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("anchorImage", str5);
            }
            String str6 = bLiveFirstRechargeStatus.welcomeWords;
            if (str6 != null) {
                jsonGenerator.writeStringField("welcomeWords", str6);
            }
            jsonGenerator.writeBooleanField("showPopup", bLiveFirstRechargeStatus.showPopup);
            jsonGenerator.writeNumberField("currentTime", bLiveFirstRechargeStatus.currentTime);
            jsonGenerator.writeNumberField("bonusStartTime", bLiveFirstRechargeStatus.bonusStartTime);
            jsonGenerator.writeNumberField("bonusEndTime", bLiveFirstRechargeStatus.bonusEndTime);
            if (bLiveFirstRechargeStatus.bonus != null) {
                jsonGenerator.writeFieldName("bonus");
                JsonAdapter.serializeArray(bLiveFirstRechargeStatus.bonus, jsonGenerator, BLiveFirstRechargePopupBonus.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("delaySeconds", bLiveFirstRechargeStatus.delaySeconds);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFirstRechargeStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefirstrechargestatus";

    @NonNull
    @ProtobufIndex(index = 3)
    public String abGroup;

    @NonNull
    @ProtobufIndex(index = 5)
    public String anchorImage;

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorName;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<BLiveFirstRechargePopupBonus> bonus;

    @ProtobufIndex(index = 10)
    public long bonusEndTime;

    @ProtobufIndex(index = 9)
    public long bonusStartTime;

    @ProtobufIndex(index = 8)
    public long currentTime;

    @ProtobufIndex(index = 14)
    public int delaySeconds;

    @ProtobufIndex(index = 1)
    public boolean isActive;

    @ProtobufIndex(index = 2)
    public boolean showNotice;

    @ProtobufIndex(index = 7)
    public boolean showPopup;

    @NonNull
    @ProtobufIndex(index = 13)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 12)
    public String userName;

    @NonNull
    @ProtobufIndex(index = 6)
    public String welcomeWords;

    public static BLiveFirstRechargeStatus new_() {
        BLiveFirstRechargeStatus bLiveFirstRechargeStatus = new BLiveFirstRechargeStatus();
        bLiveFirstRechargeStatus.nullCheck();
        return bLiveFirstRechargeStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFirstRechargeStatus mo225055clone() {
        BLiveFirstRechargeStatus bLiveFirstRechargeStatus = new BLiveFirstRechargeStatus();
        bLiveFirstRechargeStatus.isActive = this.isActive;
        bLiveFirstRechargeStatus.showNotice = this.showNotice;
        bLiveFirstRechargeStatus.abGroup = this.abGroup;
        bLiveFirstRechargeStatus.userName = this.userName;
        bLiveFirstRechargeStatus.userImage = this.userImage;
        bLiveFirstRechargeStatus.anchorName = this.anchorName;
        bLiveFirstRechargeStatus.anchorImage = this.anchorImage;
        bLiveFirstRechargeStatus.welcomeWords = this.welcomeWords;
        bLiveFirstRechargeStatus.showPopup = this.showPopup;
        bLiveFirstRechargeStatus.currentTime = this.currentTime;
        bLiveFirstRechargeStatus.bonusStartTime = this.bonusStartTime;
        bLiveFirstRechargeStatus.bonusEndTime = this.bonusEndTime;
        List<BLiveFirstRechargePopupBonus> list = this.bonus;
        if (list != null) {
            bLiveFirstRechargeStatus.bonus = ValueObject.util_map(list, new qcj() { // from class: l.e02
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFirstRechargePopupBonus) obj).mo225055clone();
                }
            });
        }
        bLiveFirstRechargeStatus.delaySeconds = this.delaySeconds;
        return bLiveFirstRechargeStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFirstRechargeStatus)) {
            return false;
        }
        BLiveFirstRechargeStatus bLiveFirstRechargeStatus = (BLiveFirstRechargeStatus) obj;
        return this.isActive == bLiveFirstRechargeStatus.isActive && this.showNotice == bLiveFirstRechargeStatus.showNotice && ValueObject.util_equals(this.abGroup, bLiveFirstRechargeStatus.abGroup) && ValueObject.util_equals(this.userName, bLiveFirstRechargeStatus.userName) && ValueObject.util_equals(this.userImage, bLiveFirstRechargeStatus.userImage) && ValueObject.util_equals(this.anchorName, bLiveFirstRechargeStatus.anchorName) && ValueObject.util_equals(this.anchorImage, bLiveFirstRechargeStatus.anchorImage) && ValueObject.util_equals(this.welcomeWords, bLiveFirstRechargeStatus.welcomeWords) && this.showPopup == bLiveFirstRechargeStatus.showPopup && this.currentTime == bLiveFirstRechargeStatus.currentTime && this.bonusStartTime == bLiveFirstRechargeStatus.bonusStartTime && this.bonusEndTime == bLiveFirstRechargeStatus.bonusEndTime && ValueObject.util_equals(this.bonus, bLiveFirstRechargeStatus.bonus) && this.delaySeconds == bLiveFirstRechargeStatus.delaySeconds;
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
        int i2 = ((((i * 41) + (this.isActive ? 1231 : 1237)) * 41) + (this.showNotice ? 1231 : 1237)) * 41;
        String str = this.abGroup;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userImage;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.anchorImage;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.welcomeWords;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        int i3 = this.showPopup ? 1231 : 1237;
        long j = this.currentTime;
        int i4 = (((iHashCode6 + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.bonusStartTime;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.bonusEndTime;
        int i6 = (i5 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        List<BLiveFirstRechargePopupBonus> list = this.bonus;
        int iHashCode7 = ((i6 + (list != null ? list.hashCode() : 0)) * 41) + this.delaySeconds;
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.abGroup == null) {
            this.abGroup = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.anchorImage == null) {
            this.anchorImage = "";
        }
        if (this.welcomeWords == null) {
            this.welcomeWords = "";
        }
        if (this.bonus == null) {
            this.bonus = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
