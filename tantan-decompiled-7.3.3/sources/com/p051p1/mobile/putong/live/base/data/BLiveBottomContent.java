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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBottomContent extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBottomContent> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBottomContent>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBottomContent.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBottomContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBottomContent newInstance() {
            return new BLiveBottomContent();
        }

        public boolean parseField(BLiveBottomContent bLiveBottomContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textColor":
                    bLiveBottomContent.textColor = jsonParser.getValueAsString();
                    return true;
                case "countDownOverAction":
                    bLiveBottomContent.countDownOverAction = BLiveBottomCountdownOverActionEnum.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "url":
                    bLiveBottomContent.url = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveBottomContent.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveBottomContent.type = BLiveBottomContentTypeEnum.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "countdownEndTime":
                    bLiveBottomContent.countdownEndTime = jsonParser.getValueAsLong();
                    return true;
                case "countdownCurrentTime":
                    bLiveBottomContent.countdownCurrentTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBottomContent bLiveBottomContent, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveBottomContent.type != null) {
                jsonGenerator.writeFieldName("type");
                BLiveBottomContentTypeEnum.JSON_ADAPTER.serialize(bLiveBottomContent.type, jsonGenerator, true);
            }
            String str = bLiveBottomContent.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = bLiveBottomContent.textColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("textColor", str2);
            }
            String str3 = bLiveBottomContent.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeNumberField("countdownEndTime", bLiveBottomContent.countdownEndTime);
            jsonGenerator.writeNumberField("countdownCurrentTime", bLiveBottomContent.countdownCurrentTime);
            if (bLiveBottomContent.countDownOverAction != null) {
                jsonGenerator.writeFieldName("countDownOverAction");
                BLiveBottomCountdownOverActionEnum.JSON_ADAPTER.serialize(bLiveBottomContent.countDownOverAction, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBottomContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebottomcontent";

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveBottomCountdownOverActionEnum countDownOverAction;

    @ProtobufIndex(index = 6)
    public long countdownCurrentTime;

    @ProtobufIndex(index = 5)
    public long countdownEndTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 3)
    public String textColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveBottomContentTypeEnum type;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;

    public static BLiveBottomContent new_() {
        BLiveBottomContent bLiveBottomContent = new BLiveBottomContent();
        bLiveBottomContent.nullCheck();
        return bLiveBottomContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBottomContent mo225055clone() {
        BLiveBottomContent bLiveBottomContent = new BLiveBottomContent();
        bLiveBottomContent.type = this.type;
        bLiveBottomContent.text = this.text;
        bLiveBottomContent.textColor = this.textColor;
        bLiveBottomContent.url = this.url;
        bLiveBottomContent.countdownEndTime = this.countdownEndTime;
        bLiveBottomContent.countdownCurrentTime = this.countdownCurrentTime;
        bLiveBottomContent.countDownOverAction = this.countDownOverAction;
        return bLiveBottomContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBottomContent)) {
            return false;
        }
        BLiveBottomContent bLiveBottomContent = (BLiveBottomContent) obj;
        return ValueObject.util_equals(this.type, bLiveBottomContent.type) && ValueObject.util_equals(this.text, bLiveBottomContent.text) && ValueObject.util_equals(this.textColor, bLiveBottomContent.textColor) && ValueObject.util_equals(this.url, bLiveBottomContent.url) && this.countdownEndTime == bLiveBottomContent.countdownEndTime && this.countdownCurrentTime == bLiveBottomContent.countdownCurrentTime && ValueObject.util_equals(this.countDownOverAction, bLiveBottomContent.countDownOverAction);
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
        BLiveBottomContentTypeEnum bLiveBottomContentTypeEnum = this.type;
        int iHashCode = (i2 + (bLiveBottomContentTypeEnum != null ? bLiveBottomContentTypeEnum.hashCode() : 0)) * 41;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.textColor;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long j = this.countdownEndTime;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.countdownCurrentTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        BLiveBottomCountdownOverActionEnum bLiveBottomCountdownOverActionEnum = this.countDownOverAction;
        int iHashCode5 = i4 + (bLiveBottomCountdownOverActionEnum != null ? bLiveBottomCountdownOverActionEnum.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (BLiveBottomContentTypeEnum) BLiveBottomContentTypeEnum.JSON_ADAPTER.defaultEnum();
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.countDownOverAction == null) {
            this.countDownOverAction = (BLiveBottomCountdownOverActionEnum) BLiveBottomCountdownOverActionEnum.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
