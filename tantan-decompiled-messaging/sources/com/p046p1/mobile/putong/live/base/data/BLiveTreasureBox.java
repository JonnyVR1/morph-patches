package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveTreasureBox;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTreasureBox extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTreasureBox> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTreasureBox>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTreasureBox.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTreasureBox.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTreasureBox newInstance() {
            return new BLiveTreasureBox();
        }

        public boolean parseField(BLiveTreasureBox bLiveTreasureBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "detailInset":
                    bLiveTreasureBox.detailInset = JsonAdapter.parseArray(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    bLiveTreasureBox.status = BLiveTreasureBoxStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "imageUrl":
                    bLiveTreasureBox.imageUrl = jsonParser.getValueAsString();
                    return true;
                case "entranceUrl":
                    bLiveTreasureBox.entranceUrl = jsonParser.getValueAsString();
                    return true;
                case "bubbleIdsConfig":
                    bLiveTreasureBox.bubbleIdsConfig = BubbleIdsConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "countDownSeconds":
                    bLiveTreasureBox.countDownSeconds = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTreasureBox bLiveTreasureBox, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveTreasureBox.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveTreasureBoxStatus.JSON_ADAPTER.serialize(bLiveTreasureBox.status, jsonGenerator, true);
            }
            String str = bLiveTreasureBox.entranceUrl;
            if (str != null) {
                jsonGenerator.writeStringField("entranceUrl", str);
            }
            String str2 = bLiveTreasureBox.imageUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("imageUrl", str2);
            }
            if (bLiveTreasureBox.bubbleIdsConfig != null) {
                jsonGenerator.writeFieldName("bubbleIdsConfig");
                BubbleIdsConfig.JSON_ADAPTER.serialize(bLiveTreasureBox.bubbleIdsConfig, jsonGenerator, true);
            }
            if (bLiveTreasureBox.detailInset != null) {
                jsonGenerator.writeFieldName("detailInset");
                JsonAdapter.serializeArray(bLiveTreasureBox.detailInset, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("countDownSeconds", bLiveTreasureBox.countDownSeconds);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTreasureBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetreasurebox";

    @NonNull
    @ProtobufIndex(index = 4)
    public BubbleIdsConfig bubbleIdsConfig;

    @ProtobufIndex(index = 6)
    public int countDownSeconds;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<Double> detailInset;

    @NonNull
    @ProtobufIndex(index = 2)
    public String entranceUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String imageUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveTreasureBoxStatus status;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m68280a(Double d) {
        return d;
    }

    public static BLiveTreasureBox new_() {
        BLiveTreasureBox bLiveTreasureBox = new BLiveTreasureBox();
        bLiveTreasureBox.nullCheck();
        return bLiveTreasureBox;
    }

    public boolean canShowTreasureBox() {
        return TEnum.equals(this.status, "created") || TEnum.equals(this.status, "pending") || TEnum.equals(this.status, "completed");
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTreasureBox mo223809clone() {
        BLiveTreasureBox bLiveTreasureBox = new BLiveTreasureBox();
        bLiveTreasureBox.status = this.status;
        bLiveTreasureBox.entranceUrl = this.entranceUrl;
        bLiveTreasureBox.imageUrl = this.imageUrl;
        BubbleIdsConfig bubbleIdsConfig = this.bubbleIdsConfig;
        if (bubbleIdsConfig != null) {
            bLiveTreasureBox.bubbleIdsConfig = bubbleIdsConfig.mo223809clone();
        }
        List<Double> list = this.detailInset;
        if (list != null) {
            bLiveTreasureBox.detailInset = ValueObject.util_map(list, new w9j() { // from class: l.z62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveTreasureBox.m68280a((Double) obj);
                }
            });
        }
        bLiveTreasureBox.countDownSeconds = this.countDownSeconds;
        return bLiveTreasureBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTreasureBox)) {
            return false;
        }
        BLiveTreasureBox bLiveTreasureBox = (BLiveTreasureBox) obj;
        return ValueObject.util_equals(this.status, bLiveTreasureBox.status) && ValueObject.util_equals(this.entranceUrl, bLiveTreasureBox.entranceUrl) && ValueObject.util_equals(this.imageUrl, bLiveTreasureBox.imageUrl) && ValueObject.util_equals(this.bubbleIdsConfig, bLiveTreasureBox.bubbleIdsConfig) && ValueObject.util_equals(this.detailInset, bLiveTreasureBox.detailInset) && this.countDownSeconds == bLiveTreasureBox.countDownSeconds;
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
        BLiveTreasureBoxStatus bLiveTreasureBoxStatus = this.status;
        int iHashCode = (i2 + (bLiveTreasureBoxStatus != null ? bLiveTreasureBoxStatus.hashCode() : 0)) * 41;
        String str = this.entranceUrl;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BubbleIdsConfig bubbleIdsConfig = this.bubbleIdsConfig;
        int iHashCode4 = (iHashCode3 + (bubbleIdsConfig != null ? bubbleIdsConfig.hashCode() : 0)) * 41;
        List<Double> list = this.detailInset;
        int iHashCode5 = ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 41) + this.countDownSeconds;
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (BLiveTreasureBoxStatus) BLiveTreasureBoxStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.entranceUrl == null) {
            this.entranceUrl = "";
        }
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
        if (this.bubbleIdsConfig == null) {
            this.bubbleIdsConfig = BubbleIdsConfig.new_();
        }
        if (this.detailInset == null) {
            this.detailInset = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
