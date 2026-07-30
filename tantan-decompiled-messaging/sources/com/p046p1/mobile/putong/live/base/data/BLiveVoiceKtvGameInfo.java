package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
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
public class BLiveVoiceKtvGameInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceKtvGameInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceKtvGameInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceKtvGameInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceKtvGameInfo newInstance() {
            return new BLiveVoiceKtvGameInfo();
        }

        public boolean parseField(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    bLiveVoiceKtvGameInfo.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceKtvGameInfo.f44503id = jsonParser.getValueAsString();
                    return false;
                case "toast":
                    bLiveVoiceKtvGameInfo.toast = jsonParser.getValueAsString();
                    return true;
                case "liveTemplate":
                    bLiveVoiceKtvGameInfo.liveTemplate = jsonParser.getValueAsString();
                    return true;
                case "panelBgInfo":
                    bLiveVoiceKtvGameInfo.panelBgInfo = BLiveVoiceKtvPanelBgInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "nextPlayInfo":
                    bLiveVoiceKtvGameInfo.nextPlayInfo = BLiveVoiceKtvPlayInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "playInfo":
                    bLiveVoiceKtvGameInfo.playInfo = BLiveVoiceKtvPlayInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceKtvGameInfo.f44503id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceKtvGameInfo.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
            String str3 = bLiveVoiceKtvGameInfo.liveTemplate;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveTemplate", str3);
            }
            String str4 = bLiveVoiceKtvGameInfo.toast;
            if (str4 != null) {
                jsonGenerator.writeStringField(OMSTemplateModeType.toast, str4);
            }
            if (bLiveVoiceKtvGameInfo.playInfo != null) {
                jsonGenerator.writeFieldName("playInfo");
                BLiveVoiceKtvPlayInfo.JSON_ADAPTER.serialize(bLiveVoiceKtvGameInfo.playInfo, jsonGenerator, true);
            }
            if (bLiveVoiceKtvGameInfo.nextPlayInfo != null) {
                jsonGenerator.writeFieldName("nextPlayInfo");
                BLiveVoiceKtvPlayInfo.JSON_ADAPTER.serialize(bLiveVoiceKtvGameInfo.nextPlayInfo, jsonGenerator, true);
            }
            if (bLiveVoiceKtvGameInfo.panelBgInfo != null) {
                jsonGenerator.writeFieldName("panelBgInfo");
                BLiveVoiceKtvPanelBgInfo.JSON_ADAPTER.serialize(bLiveVoiceKtvGameInfo.panelBgInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceKtvGameInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicektvgameinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44503id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveTemplate;

    @Nullable
    @ProtobufIndex(index = 5)
    public BLiveVoiceKtvPlayInfo nextPlayInfo;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveVoiceKtvPanelBgInfo panelBgInfo;

    @Nullable
    @ProtobufIndex(index = 4)
    public BLiveVoiceKtvPlayInfo playInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;

    @NonNull
    @ProtobufIndex(index = 6)
    public String toast;

    public static BLiveVoiceKtvGameInfo new_() {
        BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = new BLiveVoiceKtvGameInfo();
        bLiveVoiceKtvGameInfo.nullCheck();
        return bLiveVoiceKtvGameInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceKtvGameInfo mo223809clone() {
        BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = new BLiveVoiceKtvGameInfo();
        bLiveVoiceKtvGameInfo.f44503id = this.f44503id;
        bLiveVoiceKtvGameInfo.status = this.status;
        bLiveVoiceKtvGameInfo.liveTemplate = this.liveTemplate;
        bLiveVoiceKtvGameInfo.toast = this.toast;
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.playInfo;
        if (bLiveVoiceKtvPlayInfo != null) {
            bLiveVoiceKtvGameInfo.playInfo = bLiveVoiceKtvPlayInfo.mo223809clone();
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2 = this.nextPlayInfo;
        if (bLiveVoiceKtvPlayInfo2 != null) {
            bLiveVoiceKtvGameInfo.nextPlayInfo = bLiveVoiceKtvPlayInfo2.mo223809clone();
        }
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfo = this.panelBgInfo;
        if (bLiveVoiceKtvPanelBgInfo != null) {
            bLiveVoiceKtvGameInfo.panelBgInfo = bLiveVoiceKtvPanelBgInfo.mo223809clone();
        }
        return bLiveVoiceKtvGameInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceKtvGameInfo)) {
            return false;
        }
        BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = (BLiveVoiceKtvGameInfo) obj;
        return ValueObject.util_equals(this.f44503id, bLiveVoiceKtvGameInfo.f44503id) && ValueObject.util_equals(this.status, bLiveVoiceKtvGameInfo.status) && ValueObject.util_equals(this.liveTemplate, bLiveVoiceKtvGameInfo.liveTemplate) && ValueObject.util_equals(this.toast, bLiveVoiceKtvGameInfo.toast) && ValueObject.util_equals(this.playInfo, bLiveVoiceKtvGameInfo.playInfo) && ValueObject.util_equals(this.nextPlayInfo, bLiveVoiceKtvGameInfo.nextPlayInfo) && ValueObject.util_equals(this.panelBgInfo, bLiveVoiceKtvGameInfo.panelBgInfo);
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
        String str = this.f44503id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveTemplate;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.toast;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.playInfo;
        int iHashCode5 = (iHashCode4 + (bLiveVoiceKtvPlayInfo != null ? bLiveVoiceKtvPlayInfo.hashCode() : 0)) * 41;
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2 = this.nextPlayInfo;
        int iHashCode6 = (iHashCode5 + (bLiveVoiceKtvPlayInfo2 != null ? bLiveVoiceKtvPlayInfo2.hashCode() : 0)) * 41;
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfo = this.panelBgInfo;
        int iHashCode7 = iHashCode6 + (bLiveVoiceKtvPanelBgInfo != null ? bLiveVoiceKtvPanelBgInfo.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44503id == null) {
            this.f44503id = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.liveTemplate == null) {
            this.liveTemplate = "";
        }
        if (this.toast == null) {
            this.toast = "";
        }
        if (this.panelBgInfo == null) {
            this.panelBgInfo = BLiveVoiceKtvPanelBgInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
