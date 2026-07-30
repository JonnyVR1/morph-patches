package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
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
import org.spongycastle.math.p131ec.Tnaf;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBubbleConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBubbleConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBubbleConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBubbleConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBubbleConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBubbleConfig newInstance() {
            return new BLiveBubbleConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveBubbleConfig bLiveBubbleConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2134239906:
                    if (str.equals("bubbleTimeInterval")) {
                        b = 0;
                    }
                    break;
                case -1868521062:
                    if (str.equals("subType")) {
                        b = 1;
                    }
                    break;
                case -1497910772:
                    if (str.equals("bubbleShowNotMatchedTimes")) {
                        b = 2;
                    }
                    break;
                case -1108005907:
                    if (str.equals("buttonId")) {
                        b = 3;
                    }
                    break;
                case -1095575489:
                    if (str.equals("disAppearMod")) {
                        b = 4;
                    }
                    break;
                case -1068050409:
                    if (str.equals("bubbleTextList")) {
                        b = 5;
                    }
                    break;
                case -410152228:
                    if (str.equals("bubbleShowAfterWatch")) {
                        b = 6;
                    }
                    break;
                case -327568321:
                    if (str.equals("bubbleUserShowMaxCount")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 9;
                    }
                    break;
                case 653537269:
                    if (str.equals("bubbleEveryDayShowMaxCount")) {
                        b = 10;
                    }
                    break;
                case 869840326:
                    if (str.equals("disappearOnClick")) {
                        b = 11;
                    }
                    break;
                case 1091475313:
                    if (str.equals("bubbleShowDisappearDays")) {
                        b = 12;
                    }
                    break;
                case 1155217869:
                    if (str.equals("bubbleStartColor")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1242035978:
                    if (str.equals("bubbleTextColor")) {
                        b = 14;
                    }
                    break;
                case 1417698886:
                    if (str.equals("liveType")) {
                        b = 15;
                    }
                    break;
                case 1635374068:
                    if (str.equals("bubbleEndColor")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 2127886455:
                    if (str.equals("bubbleDisappear")) {
                        b = 17;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveBubbleConfig.bubbleTimeInterval = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    bLiveBubbleConfig.subType = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveBubbleConfig.bubbleShowNotMatchedTimes = jsonParser.getValueAsInt();
                    return true;
                case 3:
                    bLiveBubbleConfig.buttonId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveBubbleConfig.disAppearMod = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveBubbleConfig.bubbleTextList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveBubbleConfig.bubbleShowAfterWatch = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveBubbleConfig.bubbleUserShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    bLiveBubbleConfig.f44340id = jsonParser.getValueAsString();
                    return false;
                case 9:
                    bLiveBubbleConfig.type = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveBubbleConfig.bubbleEveryDayShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                case 11:
                    bLiveBubbleConfig.disappearOnClick = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    bLiveBubbleConfig.bubbleShowDisappearDays = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    bLiveBubbleConfig.bubbleStartColor = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveBubbleConfig.bubbleTextColor = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveBubbleConfig.liveType = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveBubbleConfig.bubbleEndColor = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveBubbleConfig.bubbleDisappear = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBubbleConfig bLiveBubbleConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBubbleConfig.f44340id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveBubbleConfig.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLiveBubbleConfig.bubbleTextList != null) {
                jsonGenerator.writeFieldName("bubbleTextList");
                JsonAdapter.serializeArray(bLiveBubbleConfig.bubbleTextList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = bLiveBubbleConfig.bubbleTextColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bubbleTextColor", str3);
            }
            String str4 = bLiveBubbleConfig.bubbleStartColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bubbleStartColor", str4);
            }
            String str5 = bLiveBubbleConfig.bubbleEndColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("bubbleEndColor", str5);
            }
            jsonGenerator.writeNumberField("bubbleShowAfterWatch", bLiveBubbleConfig.bubbleShowAfterWatch);
            jsonGenerator.writeNumberField("bubbleDisappear", bLiveBubbleConfig.bubbleDisappear);
            jsonGenerator.writeNumberField("bubbleEveryDayShowMaxCount", bLiveBubbleConfig.bubbleEveryDayShowMaxCount);
            jsonGenerator.writeNumberField("bubbleUserShowMaxCount", bLiveBubbleConfig.bubbleUserShowMaxCount);
            jsonGenerator.writeNumberField("bubbleTimeInterval", bLiveBubbleConfig.bubbleTimeInterval);
            String str6 = bLiveBubbleConfig.subType;
            if (str6 != null) {
                jsonGenerator.writeStringField("subType", str6);
            }
            String str7 = bLiveBubbleConfig.buttonId;
            if (str7 != null) {
                jsonGenerator.writeStringField("buttonId", str7);
            }
            String str8 = bLiveBubbleConfig.disAppearMod;
            if (str8 != null) {
                jsonGenerator.writeStringField("disAppearMod", str8);
            }
            jsonGenerator.writeNumberField("bubbleShowNotMatchedTimes", bLiveBubbleConfig.bubbleShowNotMatchedTimes);
            jsonGenerator.writeNumberField("bubbleShowDisappearDays", bLiveBubbleConfig.bubbleShowDisappearDays);
            jsonGenerator.writeBooleanField("disappearOnClick", bLiveBubbleConfig.disappearOnClick);
            String str9 = bLiveBubbleConfig.liveType;
            if (str9 != null) {
                jsonGenerator.writeStringField("liveType", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBubbleConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebubbleconfig";

    @ProtobufIndex(index = 8)
    public int bubbleDisappear;

    @NonNull
    @ProtobufIndex(index = 6)
    public String bubbleEndColor;

    @ProtobufIndex(index = 9)
    public int bubbleEveryDayShowMaxCount;

    @ProtobufIndex(index = 7)
    public int bubbleShowAfterWatch;

    @ProtobufIndex(index = 16)
    public int bubbleShowDisappearDays;

    @ProtobufIndex(index = 15)
    public int bubbleShowNotMatchedTimes;

    @NonNull
    @ProtobufIndex(index = 5)
    public String bubbleStartColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String bubbleTextColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> bubbleTextList;

    @ProtobufIndex(index = 11)
    public long bubbleTimeInterval;

    @ProtobufIndex(index = 10)
    public int bubbleUserShowMaxCount;

    @NonNull
    @ProtobufIndex(index = 13)
    public String buttonId;

    @NonNull
    @ProtobufIndex(index = 14)
    public String disAppearMod;

    @ProtobufIndex(index = 17)
    public boolean disappearOnClick;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44340id;

    @NonNull
    @ProtobufIndex(index = 18)
    public String liveType;

    @NonNull
    @ProtobufIndex(index = 12)
    public String subType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67720a(String str) {
        return str;
    }

    public static BLiveBubbleConfig new_() {
        BLiveBubbleConfig bLiveBubbleConfig = new BLiveBubbleConfig();
        bLiveBubbleConfig.nullCheck();
        return bLiveBubbleConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBubbleConfig mo223809clone() {
        BLiveBubbleConfig bLiveBubbleConfig = new BLiveBubbleConfig();
        bLiveBubbleConfig.f44340id = this.f44340id;
        bLiveBubbleConfig.type = this.type;
        List<String> list = this.bubbleTextList;
        if (list != null) {
            bLiveBubbleConfig.bubbleTextList = ValueObject.util_map(list, new w9j() { // from class: l.ds1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveBubbleConfig.m67720a((String) obj);
                }
            });
        }
        bLiveBubbleConfig.bubbleTextColor = this.bubbleTextColor;
        bLiveBubbleConfig.bubbleStartColor = this.bubbleStartColor;
        bLiveBubbleConfig.bubbleEndColor = this.bubbleEndColor;
        bLiveBubbleConfig.bubbleShowAfterWatch = this.bubbleShowAfterWatch;
        bLiveBubbleConfig.bubbleDisappear = this.bubbleDisappear;
        bLiveBubbleConfig.bubbleEveryDayShowMaxCount = this.bubbleEveryDayShowMaxCount;
        bLiveBubbleConfig.bubbleUserShowMaxCount = this.bubbleUserShowMaxCount;
        bLiveBubbleConfig.bubbleTimeInterval = this.bubbleTimeInterval;
        bLiveBubbleConfig.subType = this.subType;
        bLiveBubbleConfig.buttonId = this.buttonId;
        bLiveBubbleConfig.disAppearMod = this.disAppearMod;
        bLiveBubbleConfig.bubbleShowNotMatchedTimes = this.bubbleShowNotMatchedTimes;
        bLiveBubbleConfig.bubbleShowDisappearDays = this.bubbleShowDisappearDays;
        bLiveBubbleConfig.disappearOnClick = this.disappearOnClick;
        bLiveBubbleConfig.liveType = this.liveType;
        return bLiveBubbleConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBubbleConfig)) {
            return false;
        }
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) obj;
        return ValueObject.util_equals(this.f44340id, bLiveBubbleConfig.f44340id) && ValueObject.util_equals(this.type, bLiveBubbleConfig.type) && ValueObject.util_equals(this.bubbleTextList, bLiveBubbleConfig.bubbleTextList) && ValueObject.util_equals(this.bubbleTextColor, bLiveBubbleConfig.bubbleTextColor) && ValueObject.util_equals(this.bubbleStartColor, bLiveBubbleConfig.bubbleStartColor) && ValueObject.util_equals(this.bubbleEndColor, bLiveBubbleConfig.bubbleEndColor) && this.bubbleShowAfterWatch == bLiveBubbleConfig.bubbleShowAfterWatch && this.bubbleDisappear == bLiveBubbleConfig.bubbleDisappear && this.bubbleEveryDayShowMaxCount == bLiveBubbleConfig.bubbleEveryDayShowMaxCount && this.bubbleUserShowMaxCount == bLiveBubbleConfig.bubbleUserShowMaxCount && this.bubbleTimeInterval == bLiveBubbleConfig.bubbleTimeInterval && ValueObject.util_equals(this.subType, bLiveBubbleConfig.subType) && ValueObject.util_equals(this.buttonId, bLiveBubbleConfig.buttonId) && ValueObject.util_equals(this.disAppearMod, bLiveBubbleConfig.disAppearMod) && this.bubbleShowNotMatchedTimes == bLiveBubbleConfig.bubbleShowNotMatchedTimes && this.bubbleShowDisappearDays == bLiveBubbleConfig.bubbleShowDisappearDays && this.disappearOnClick == bLiveBubbleConfig.disappearOnClick && ValueObject.util_equals(this.liveType, bLiveBubbleConfig.liveType);
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
        String str = this.f44340id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.bubbleTextList;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.bubbleTextColor;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bubbleStartColor;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.bubbleEndColor;
        int iHashCode6 = (((((((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.bubbleShowAfterWatch) * 41) + this.bubbleDisappear) * 41) + this.bubbleEveryDayShowMaxCount) * 41) + this.bubbleUserShowMaxCount) * 41;
        long j = this.bubbleTimeInterval;
        int i3 = (iHashCode6 + ((int) (j ^ (j >>> 32)))) * 41;
        String str6 = this.subType;
        int iHashCode7 = (i3 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.buttonId;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.disAppearMod;
        int iHashCode9 = (((((((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41) + this.bubbleShowNotMatchedTimes) * 41) + this.bubbleShowDisappearDays) * 41) + (this.disappearOnClick ? 1231 : 1237)) * 41;
        String str9 = this.liveType;
        int iHashCode10 = iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44340id == null) {
            this.f44340id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.bubbleTextList == null) {
            this.bubbleTextList = new ArrayList();
        }
        if (this.bubbleTextColor == null) {
            this.bubbleTextColor = "";
        }
        if (this.bubbleStartColor == null) {
            this.bubbleStartColor = "";
        }
        if (this.bubbleEndColor == null) {
            this.bubbleEndColor = "";
        }
        if (this.subType == null) {
            this.subType = "";
        }
        if (this.buttonId == null) {
            this.buttonId = "";
        }
        if (this.disAppearMod == null) {
            this.disAppearMod = "";
        }
        if (this.liveType == null) {
            this.liveType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
