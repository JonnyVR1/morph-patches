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
public class BLiveCallSetting extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCallSetting> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallSetting>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallSetting.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallSetting newInstance() {
            return new BLiveCallSetting();
        }

        public boolean parseField(BLiveCallSetting bLiveCallSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "callSettingButtonText":
                    bLiveCallSetting.callSettingButtonText = jsonParser.getValueAsString();
                    return true;
                case "videoCancel":
                    bLiveCallSetting.videoCancel = BLiveCallVideoCancelSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "callGiftButtonDisplay":
                    bLiveCallSetting.callGiftButtonDisplay = jsonParser.getValueAsBoolean();
                    return true;
                case "callAnnouncementUrl":
                    bLiveCallSetting.callAnnouncementUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallSetting bLiveCallSetting, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveCallSetting.videoCancel != null) {
                jsonGenerator.writeFieldName("videoCancel");
                BLiveCallVideoCancelSetting.JSON_ADAPTER.serialize(bLiveCallSetting.videoCancel, jsonGenerator, true);
            }
            String str = bLiveCallSetting.callSettingButtonText;
            if (str != null) {
                jsonGenerator.writeStringField("callSettingButtonText", str);
            }
            jsonGenerator.writeBooleanField("callGiftButtonDisplay", bLiveCallSetting.callGiftButtonDisplay);
            String str2 = bLiveCallSetting.callAnnouncementUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("callAnnouncementUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecallsetting";

    @NonNull
    @ProtobufIndex(index = 4)
    public String callAnnouncementUrl;

    @ProtobufIndex(index = 3)
    public boolean callGiftButtonDisplay;

    @NonNull
    @ProtobufIndex(index = 2)
    public String callSettingButtonText;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveCallVideoCancelSetting videoCancel;

    public static BLiveCallSetting new_() {
        BLiveCallSetting bLiveCallSetting = new BLiveCallSetting();
        bLiveCallSetting.nullCheck();
        return bLiveCallSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallSetting mo225055clone() {
        BLiveCallSetting bLiveCallSetting = new BLiveCallSetting();
        BLiveCallVideoCancelSetting bLiveCallVideoCancelSetting = this.videoCancel;
        if (bLiveCallVideoCancelSetting != null) {
            bLiveCallSetting.videoCancel = bLiveCallVideoCancelSetting.mo225055clone();
        }
        bLiveCallSetting.callSettingButtonText = this.callSettingButtonText;
        bLiveCallSetting.callGiftButtonDisplay = this.callGiftButtonDisplay;
        bLiveCallSetting.callAnnouncementUrl = this.callAnnouncementUrl;
        return bLiveCallSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCallSetting)) {
            return false;
        }
        BLiveCallSetting bLiveCallSetting = (BLiveCallSetting) obj;
        return ValueObject.util_equals(this.videoCancel, bLiveCallSetting.videoCancel) && ValueObject.util_equals(this.callSettingButtonText, bLiveCallSetting.callSettingButtonText) && this.callGiftButtonDisplay == bLiveCallSetting.callGiftButtonDisplay && ValueObject.util_equals(this.callAnnouncementUrl, bLiveCallSetting.callAnnouncementUrl);
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
        BLiveCallVideoCancelSetting bLiveCallVideoCancelSetting = this.videoCancel;
        int iHashCode = (i2 + (bLiveCallVideoCancelSetting != null ? bLiveCallVideoCancelSetting.hashCode() : 0)) * 41;
        String str = this.callSettingButtonText;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + (this.callGiftButtonDisplay ? 1231 : 1237)) * 41;
        String str2 = this.callAnnouncementUrl;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.videoCancel == null) {
            this.videoCancel = BLiveCallVideoCancelSetting.new_();
        }
        if (this.callSettingButtonText == null) {
            this.callSettingButtonText = "";
        }
        if (this.callAnnouncementUrl == null) {
            this.callAnnouncementUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
