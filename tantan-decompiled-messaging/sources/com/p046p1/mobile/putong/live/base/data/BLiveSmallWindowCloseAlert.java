package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveSmallWindowCloseAlert extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSmallWindowCloseAlert> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSmallWindowCloseAlert>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSmallWindowCloseAlert.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSmallWindowCloseAlert.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSmallWindowCloseAlert newInstance() {
            return new BLiveSmallWindowCloseAlert();
        }

        public boolean parseField(BLiveSmallWindowCloseAlert bLiveSmallWindowCloseAlert, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveSmallWindowCloseAlert.subTitle = jsonParser.getValueAsString();
                    return true;
                case "tipOnlyButtonText":
                    bLiveSmallWindowCloseAlert.tipOnlyButtonText = jsonParser.getValueAsString();
                    return true;
                case "watchDurationLimit":
                    bLiveSmallWindowCloseAlert.watchDurationLimit = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    bLiveSmallWindowCloseAlert.type = BLiveCloseAlertType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "title":
                    bLiveSmallWindowCloseAlert.title = jsonParser.getValueAsString();
                    return true;
                case "maxShowCount":
                    bLiveSmallWindowCloseAlert.maxShowCount = jsonParser.getValueAsInt();
                    return true;
                case "continuousWatchCount":
                    bLiveSmallWindowCloseAlert.continuousWatchCount = jsonParser.getValueAsInt();
                    return true;
                case "withJumpButtonText":
                    bLiveSmallWindowCloseAlert.withJumpButtonText = BLiveSmallWindowJumpText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSmallWindowCloseAlert bLiveSmallWindowCloseAlert, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveSmallWindowCloseAlert.type != null) {
                jsonGenerator.writeFieldName("type");
                BLiveCloseAlertType.JSON_ADAPTER.serialize(bLiveSmallWindowCloseAlert.type, jsonGenerator, true);
            }
            String str = bLiveSmallWindowCloseAlert.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveSmallWindowCloseAlert.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = bLiveSmallWindowCloseAlert.tipOnlyButtonText;
            if (str3 != null) {
                jsonGenerator.writeStringField("tipOnlyButtonText", str3);
            }
            if (bLiveSmallWindowCloseAlert.withJumpButtonText != null) {
                jsonGenerator.writeFieldName("withJumpButtonText");
                BLiveSmallWindowJumpText.JSON_ADAPTER.serialize(bLiveSmallWindowCloseAlert.withJumpButtonText, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("watchDurationLimit", bLiveSmallWindowCloseAlert.watchDurationLimit);
            jsonGenerator.writeNumberField("maxShowCount", bLiveSmallWindowCloseAlert.maxShowCount);
            jsonGenerator.writeNumberField("continuousWatchCount", bLiveSmallWindowCloseAlert.continuousWatchCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSmallWindowCloseAlert) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesmallwindowclosealert";

    @ProtobufIndex(index = 8)
    public int continuousWatchCount;

    @ProtobufIndex(index = 7)
    public int maxShowCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String tipOnlyButtonText;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveCloseAlertType type;

    @ProtobufIndex(index = 6)
    public int watchDurationLimit;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveSmallWindowJumpText withJumpButtonText;

    public static BLiveSmallWindowCloseAlert new_() {
        BLiveSmallWindowCloseAlert bLiveSmallWindowCloseAlert = new BLiveSmallWindowCloseAlert();
        bLiveSmallWindowCloseAlert.nullCheck();
        return bLiveSmallWindowCloseAlert;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSmallWindowCloseAlert mo223809clone() {
        BLiveSmallWindowCloseAlert bLiveSmallWindowCloseAlert = new BLiveSmallWindowCloseAlert();
        bLiveSmallWindowCloseAlert.type = this.type;
        bLiveSmallWindowCloseAlert.title = this.title;
        bLiveSmallWindowCloseAlert.subTitle = this.subTitle;
        bLiveSmallWindowCloseAlert.tipOnlyButtonText = this.tipOnlyButtonText;
        BLiveSmallWindowJumpText bLiveSmallWindowJumpText = this.withJumpButtonText;
        if (bLiveSmallWindowJumpText != null) {
            bLiveSmallWindowCloseAlert.withJumpButtonText = bLiveSmallWindowJumpText.mo223809clone();
        }
        bLiveSmallWindowCloseAlert.watchDurationLimit = this.watchDurationLimit;
        bLiveSmallWindowCloseAlert.maxShowCount = this.maxShowCount;
        bLiveSmallWindowCloseAlert.continuousWatchCount = this.continuousWatchCount;
        return bLiveSmallWindowCloseAlert;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSmallWindowCloseAlert)) {
            return false;
        }
        BLiveSmallWindowCloseAlert bLiveSmallWindowCloseAlert = (BLiveSmallWindowCloseAlert) obj;
        return ValueObject.util_equals(this.type, bLiveSmallWindowCloseAlert.type) && ValueObject.util_equals(this.title, bLiveSmallWindowCloseAlert.title) && ValueObject.util_equals(this.subTitle, bLiveSmallWindowCloseAlert.subTitle) && ValueObject.util_equals(this.tipOnlyButtonText, bLiveSmallWindowCloseAlert.tipOnlyButtonText) && ValueObject.util_equals(this.withJumpButtonText, bLiveSmallWindowCloseAlert.withJumpButtonText) && this.watchDurationLimit == bLiveSmallWindowCloseAlert.watchDurationLimit && this.maxShowCount == bLiveSmallWindowCloseAlert.maxShowCount && this.continuousWatchCount == bLiveSmallWindowCloseAlert.continuousWatchCount;
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
        BLiveCloseAlertType bLiveCloseAlertType = this.type;
        int iHashCode = (i2 + (bLiveCloseAlertType != null ? bLiveCloseAlertType.hashCode() : 0)) * 41;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tipOnlyButtonText;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveSmallWindowJumpText bLiveSmallWindowJumpText = this.withJumpButtonText;
        int iHashCode5 = ((((((iHashCode4 + (bLiveSmallWindowJumpText != null ? bLiveSmallWindowJumpText.hashCode() : 0)) * 41) + this.watchDurationLimit) * 41) + this.maxShowCount) * 41) + this.continuousWatchCount;
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (BLiveCloseAlertType) BLiveCloseAlertType.JSON_ADAPTER.defaultEnum();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.tipOnlyButtonText == null) {
            this.tipOnlyButtonText = "";
        }
        if (this.withJumpButtonText == null) {
            this.withJumpButtonText = BLiveSmallWindowJumpText.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
