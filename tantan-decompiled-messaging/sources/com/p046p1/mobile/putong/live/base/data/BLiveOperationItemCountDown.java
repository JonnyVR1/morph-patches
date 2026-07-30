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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.mqi0;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveOperationItemCountDown extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemCountDown> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemCountDown>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemCountDown.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemCountDown.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemCountDown newInstance() {
            return new BLiveOperationItemCountDown();
        }

        public boolean parseField(BLiveOperationItemCountDown bLiveOperationItemCountDown, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    bLiveOperationItemCountDown.startTime = jsonParser.getValueAsLong();
                    return true;
                case "randomDelaySeconds":
                    bLiveOperationItemCountDown.randomDelaySeconds = jsonParser.getValueAsLong();
                    return true;
                case "endText":
                    bLiveOperationItemCountDown.endText = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    bLiveOperationItemCountDown.endTime = jsonParser.getValueAsLong();
                    return true;
                case "jumpScheme":
                    bLiveOperationItemCountDown.jumpScheme = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveOperationItemCountDown.type = BLiveOperationCountDownType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "actionAfterCountdown":
                    bLiveOperationItemCountDown.actionAfterCountdown = BLiveOperationActionAfterCountdown.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "currentTime":
                    bLiveOperationItemCountDown.currentTime = jsonParser.getValueAsLong();
                    return true;
                case "actionType":
                    bLiveOperationItemCountDown.actionType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemCountDown bLiveOperationItemCountDown, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("currentTime", bLiveOperationItemCountDown.currentTime);
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, bLiveOperationItemCountDown.startTime);
            jsonGenerator.writeNumberField("endTime", bLiveOperationItemCountDown.endTime);
            String str = bLiveOperationItemCountDown.endText;
            if (str != null) {
                jsonGenerator.writeStringField("endText", str);
            }
            if (bLiveOperationItemCountDown.actionAfterCountdown != null) {
                jsonGenerator.writeFieldName("actionAfterCountdown");
                BLiveOperationActionAfterCountdown.JSON_ADAPTER.serialize(bLiveOperationItemCountDown.actionAfterCountdown, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("randomDelaySeconds", bLiveOperationItemCountDown.randomDelaySeconds);
            String str2 = bLiveOperationItemCountDown.jumpScheme;
            if (str2 != null) {
                jsonGenerator.writeStringField("jumpScheme", str2);
            }
            String str3 = bLiveOperationItemCountDown.actionType;
            if (str3 != null) {
                jsonGenerator.writeStringField("actionType", str3);
            }
            if (bLiveOperationItemCountDown.type != null) {
                jsonGenerator.writeFieldName("type");
                BLiveOperationCountDownType.JSON_ADAPTER.serialize(bLiveOperationItemCountDown.type, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemCountDown) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitemcountdown";

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveOperationActionAfterCountdown actionAfterCountdown;

    @NonNull
    @ProtobufIndex(index = 8)
    public String actionType;

    @ProtobufIndex(index = 1)
    public long currentTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String endText;

    @ProtobufIndex(index = 3)
    public long endTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String jumpScheme;

    @ProtobufIndex(index = 6)
    public long randomDelaySeconds;

    @ProtobufIndex(index = 2)
    public long startTime;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLiveOperationCountDownType type;

    public static BLiveOperationItemCountDown new_() {
        BLiveOperationItemCountDown bLiveOperationItemCountDown = new BLiveOperationItemCountDown();
        bLiveOperationItemCountDown.nullCheck();
        return bLiveOperationItemCountDown;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemCountDown mo223809clone() {
        BLiveOperationItemCountDown bLiveOperationItemCountDown = new BLiveOperationItemCountDown();
        bLiveOperationItemCountDown.currentTime = this.currentTime;
        bLiveOperationItemCountDown.startTime = this.startTime;
        bLiveOperationItemCountDown.endTime = this.endTime;
        bLiveOperationItemCountDown.endText = this.endText;
        bLiveOperationItemCountDown.actionAfterCountdown = this.actionAfterCountdown;
        bLiveOperationItemCountDown.randomDelaySeconds = this.randomDelaySeconds;
        bLiveOperationItemCountDown.jumpScheme = this.jumpScheme;
        bLiveOperationItemCountDown.actionType = this.actionType;
        bLiveOperationItemCountDown.type = this.type;
        return bLiveOperationItemCountDown;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemCountDown)) {
            return false;
        }
        BLiveOperationItemCountDown bLiveOperationItemCountDown = (BLiveOperationItemCountDown) obj;
        return this.currentTime == bLiveOperationItemCountDown.currentTime && this.startTime == bLiveOperationItemCountDown.startTime && this.endTime == bLiveOperationItemCountDown.endTime && ValueObject.util_equals(this.endText, bLiveOperationItemCountDown.endText) && ValueObject.util_equals(this.actionAfterCountdown, bLiveOperationItemCountDown.actionAfterCountdown) && this.randomDelaySeconds == bLiveOperationItemCountDown.randomDelaySeconds && ValueObject.util_equals(this.jumpScheme, bLiveOperationItemCountDown.jumpScheme) && ValueObject.util_equals(this.actionType, bLiveOperationItemCountDown.actionType) && ValueObject.util_equals(this.type, bLiveOperationItemCountDown.type);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int getTheRemainingTime() {
        return (int) (this.endTime - mqi0.m155944o());
    }

    public long getTotalTime() {
        return this.endTime - this.startTime;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.currentTime;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.startTime;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.endTime;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str = this.endText;
        int iHashCode = (i4 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveOperationActionAfterCountdown bLiveOperationActionAfterCountdown = this.actionAfterCountdown;
        int iHashCode2 = bLiveOperationActionAfterCountdown != null ? bLiveOperationActionAfterCountdown.hashCode() : 0;
        long j4 = this.randomDelaySeconds;
        int i5 = (((iHashCode + iHashCode2) * 41) + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        String str2 = this.jumpScheme;
        int iHashCode3 = (i5 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.actionType;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveOperationCountDownType bLiveOperationCountDownType = this.type;
        int iHashCode5 = iHashCode4 + (bLiveOperationCountDownType != null ? bLiveOperationCountDownType.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.endText == null) {
            this.endText = "";
        }
        if (this.actionAfterCountdown == null) {
            this.actionAfterCountdown = (BLiveOperationActionAfterCountdown) BLiveOperationActionAfterCountdown.JSON_ADAPTER.defaultEnum();
        }
        if (this.jumpScheme == null) {
            this.jumpScheme = "";
        }
        if (this.actionType == null) {
            this.actionType = "";
        }
        if (this.type == null) {
            this.type = (BLiveOperationCountDownType) BLiveOperationCountDownType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
