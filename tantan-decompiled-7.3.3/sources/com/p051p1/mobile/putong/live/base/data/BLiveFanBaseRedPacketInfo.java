package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseGetRedPacketUser;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseGift;
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
public class BLiveFanBaseRedPacketInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseRedPacketInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseRedPacketInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseRedPacketInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseRedPacketInfo newInstance() {
            return new BLiveFanBaseRedPacketInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1982659909:
                    if (str.equals("hasGrabbed")) {
                        b = 0;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 1;
                    }
                    break;
                case -1474067452:
                    if (str.equals("anchorContent")) {
                        b = 2;
                    }
                    break;
                case -1319025868:
                    if (str.equals("grabbedGiftContent")) {
                        b = 3;
                    }
                    break;
                case -739265409:
                    if (str.equals("isAnchor")) {
                        b = 4;
                    }
                    break;
                case -624379078:
                    if (str.equals("isEnough")) {
                        b = 5;
                    }
                    break;
                case -614486743:
                    if (str.equals("giftContent")) {
                        b = 6;
                    }
                    break;
                case 103315:
                    if (str.equals("hit")) {
                        b = 7;
                    }
                    break;
                case 110541305:
                    if (str.equals("token")) {
                        b = 8;
                    }
                    break;
                case 997385824:
                    if (str.equals("senderName")) {
                        b = 9;
                    }
                    break;
                case 1200417463:
                    if (str.equals("limitSatisfied")) {
                        b = 10;
                    }
                    break;
                case 1247963696:
                    if (str.equals("senderId")) {
                        b = 11;
                    }
                    break;
                case 1352226353:
                    if (str.equals("countdown")) {
                        b = 12;
                    }
                    break;
                case 1725489202:
                    if (str.equals("histories")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 2073378034:
                    if (str.equals("isValid")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveFanBaseRedPacketInfo.hasGrabbed = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveFanBaseRedPacketInfo.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 2:
                    bLiveFanBaseRedPacketInfo.anchorContent = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveFanBaseRedPacketInfo.grabbedGiftContent = BLiveFanBaseGift.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveFanBaseRedPacketInfo.isAnchor = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveFanBaseRedPacketInfo.isEnough = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    bLiveFanBaseRedPacketInfo.giftContent = JsonAdapter.parseArray(jsonParser, BLiveFanBaseGift.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveFanBaseRedPacketInfo.hit = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    bLiveFanBaseRedPacketInfo.token = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveFanBaseRedPacketInfo.senderName = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveFanBaseRedPacketInfo.limitSatisfied = jsonParser.getValueAsBoolean();
                    return true;
                case 11:
                    bLiveFanBaseRedPacketInfo.senderId = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveFanBaseRedPacketInfo.countdown = jsonParser.getValueAsLong();
                    return true;
                case 13:
                    bLiveFanBaseRedPacketInfo.histories = JsonAdapter.parseArray(jsonParser, BLiveFanBaseGetRedPacketUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveFanBaseRedPacketInfo.isValid = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseRedPacketInfo.senderId;
            if (str != null) {
                jsonGenerator.writeStringField("senderId", str);
            }
            String str2 = bLiveFanBaseRedPacketInfo.senderName;
            if (str2 != null) {
                jsonGenerator.writeStringField("senderName", str2);
            }
            jsonGenerator.writeBooleanField("hasGrabbed", bLiveFanBaseRedPacketInfo.hasGrabbed);
            jsonGenerator.writeBooleanField("hit", bLiveFanBaseRedPacketInfo.hit);
            if (bLiveFanBaseRedPacketInfo.grabbedGiftContent != null) {
                jsonGenerator.writeFieldName("grabbedGiftContent");
                BLiveFanBaseGift.JSON_ADAPTER.serialize(bLiveFanBaseRedPacketInfo.grabbedGiftContent, jsonGenerator, true);
            }
            if (bLiveFanBaseRedPacketInfo.histories != null) {
                jsonGenerator.writeFieldName("histories");
                JsonAdapter.serializeArray(bLiveFanBaseRedPacketInfo.histories, jsonGenerator, BLiveFanBaseGetRedPacketUser.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("limitSatisfied", bLiveFanBaseRedPacketInfo.limitSatisfied);
            if (bLiveFanBaseRedPacketInfo.giftContent != null) {
                jsonGenerator.writeFieldName("giftContent");
                JsonAdapter.serializeArray(bLiveFanBaseRedPacketInfo.giftContent, jsonGenerator, BLiveFanBaseGift.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("countdown", bLiveFanBaseRedPacketInfo.countdown);
            String str3 = bLiveFanBaseRedPacketInfo.token;
            if (str3 != null) {
                jsonGenerator.writeStringField("token", str3);
            }
            jsonGenerator.writeBooleanField("isValid", bLiveFanBaseRedPacketInfo.isValid);
            jsonGenerator.writeBooleanField("isEnough", bLiveFanBaseRedPacketInfo.isEnough);
            jsonGenerator.writeFieldName("endTime");
            Converter.API_TIME.serialize(Double.valueOf(bLiveFanBaseRedPacketInfo.endTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("isAnchor", bLiveFanBaseRedPacketInfo.isAnchor);
            String str4 = bLiveFanBaseRedPacketInfo.anchorContent;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorContent", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseRedPacketInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbaseredpacketinfo";

    @NonNull
    @ProtobufIndex(index = 15)
    public String anchorContent;

    @ProtobufIndex(index = 9)
    public long countdown;

    @ProtobufIndex(index = 13)
    public double endTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveFanBaseGift> giftContent;

    @Nullable
    @ProtobufIndex(index = 5)
    public BLiveFanBaseGift grabbedGiftContent;

    @ProtobufIndex(index = 3)
    public boolean hasGrabbed;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveFanBaseGetRedPacketUser> histories;

    @ProtobufIndex(index = 4)
    public boolean hit;

    @ProtobufIndex(index = 14)
    public boolean isAnchor;

    @ProtobufIndex(index = 12)
    public boolean isEnough;

    @ProtobufIndex(index = 11)
    public boolean isValid;

    @ProtobufIndex(index = 7)
    public boolean limitSatisfied;

    @NonNull
    @ProtobufIndex(index = 1)
    public String senderId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String senderName;

    @NonNull
    @ProtobufIndex(index = 10)
    public String token;

    public static BLiveFanBaseRedPacketInfo new_() {
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = new BLiveFanBaseRedPacketInfo();
        bLiveFanBaseRedPacketInfo.nullCheck();
        return bLiveFanBaseRedPacketInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseRedPacketInfo mo225055clone() {
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = new BLiveFanBaseRedPacketInfo();
        bLiveFanBaseRedPacketInfo.senderId = this.senderId;
        bLiveFanBaseRedPacketInfo.senderName = this.senderName;
        bLiveFanBaseRedPacketInfo.hasGrabbed = this.hasGrabbed;
        bLiveFanBaseRedPacketInfo.hit = this.hit;
        BLiveFanBaseGift bLiveFanBaseGift = this.grabbedGiftContent;
        if (bLiveFanBaseGift != null) {
            bLiveFanBaseRedPacketInfo.grabbedGiftContent = bLiveFanBaseGift.mo225055clone();
        }
        List<BLiveFanBaseGetRedPacketUser> list = this.histories;
        if (list != null) {
            bLiveFanBaseRedPacketInfo.histories = ValueObject.util_map(list, new qcj() { // from class: l.yz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFanBaseGetRedPacketUser) obj).mo225055clone();
                }
            });
        }
        bLiveFanBaseRedPacketInfo.limitSatisfied = this.limitSatisfied;
        List<BLiveFanBaseGift> list2 = this.giftContent;
        if (list2 != null) {
            bLiveFanBaseRedPacketInfo.giftContent = ValueObject.util_map(list2, new qcj() { // from class: l.zz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFanBaseGift) obj).mo225055clone();
                }
            });
        }
        bLiveFanBaseRedPacketInfo.countdown = this.countdown;
        bLiveFanBaseRedPacketInfo.token = this.token;
        bLiveFanBaseRedPacketInfo.isValid = this.isValid;
        bLiveFanBaseRedPacketInfo.isEnough = this.isEnough;
        bLiveFanBaseRedPacketInfo.endTime = this.endTime;
        bLiveFanBaseRedPacketInfo.isAnchor = this.isAnchor;
        bLiveFanBaseRedPacketInfo.anchorContent = this.anchorContent;
        return bLiveFanBaseRedPacketInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseRedPacketInfo)) {
            return false;
        }
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = (BLiveFanBaseRedPacketInfo) obj;
        return ValueObject.util_equals(this.senderId, bLiveFanBaseRedPacketInfo.senderId) && ValueObject.util_equals(this.senderName, bLiveFanBaseRedPacketInfo.senderName) && this.hasGrabbed == bLiveFanBaseRedPacketInfo.hasGrabbed && this.hit == bLiveFanBaseRedPacketInfo.hit && ValueObject.util_equals(this.grabbedGiftContent, bLiveFanBaseRedPacketInfo.grabbedGiftContent) && ValueObject.util_equals(this.histories, bLiveFanBaseRedPacketInfo.histories) && this.limitSatisfied == bLiveFanBaseRedPacketInfo.limitSatisfied && ValueObject.util_equals(this.giftContent, bLiveFanBaseRedPacketInfo.giftContent) && this.countdown == bLiveFanBaseRedPacketInfo.countdown && ValueObject.util_equals(this.token, bLiveFanBaseRedPacketInfo.token) && this.isValid == bLiveFanBaseRedPacketInfo.isValid && this.isEnough == bLiveFanBaseRedPacketInfo.isEnough && this.endTime == bLiveFanBaseRedPacketInfo.endTime && this.isAnchor == bLiveFanBaseRedPacketInfo.isAnchor && ValueObject.util_equals(this.anchorContent, bLiveFanBaseRedPacketInfo.anchorContent);
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
        String str = this.senderId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.senderName;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.hasGrabbed ? 1231 : 1237)) * 41) + (this.hit ? 1231 : 1237)) * 41;
        BLiveFanBaseGift bLiveFanBaseGift = this.grabbedGiftContent;
        int iHashCode3 = (iHashCode2 + (bLiveFanBaseGift != null ? bLiveFanBaseGift.hashCode() : 0)) * 41;
        List<BLiveFanBaseGetRedPacketUser> list = this.histories;
        int iHashCode4 = (((iHashCode3 + (list != null ? list.hashCode() : 0)) * 41) + (this.limitSatisfied ? 1231 : 1237)) * 41;
        List<BLiveFanBaseGift> list2 = this.giftContent;
        int iHashCode5 = list2 != null ? list2.hashCode() : 0;
        long j = this.countdown;
        int i3 = (((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.token;
        int iHashCode6 = ((((i3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isValid ? 1231 : 1237)) * 41) + (this.isEnough ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.endTime);
        int i4 = ((((iHashCode6 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.isAnchor ? 1231 : 1237)) * 41;
        String str4 = this.anchorContent;
        int iHashCode7 = i4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.senderId == null) {
            this.senderId = "";
        }
        if (this.senderName == null) {
            this.senderName = "";
        }
        if (this.histories == null) {
            this.histories = new ArrayList();
        }
        if (this.giftContent == null) {
            this.giftContent = new ArrayList();
        }
        if (this.token == null) {
            this.token = "";
        }
        if (this.anchorContent == null) {
            this.anchorContent = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
