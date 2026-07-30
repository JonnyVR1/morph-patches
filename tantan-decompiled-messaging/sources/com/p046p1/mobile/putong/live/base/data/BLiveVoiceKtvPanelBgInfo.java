package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
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
public class BLiveVoiceKtvPanelBgInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceKtvPanelBgInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceKtvPanelBgInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceKtvPanelBgInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceKtvPanelBgInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceKtvPanelBgInfo newInstance() {
            return new BLiveVoiceKtvPanelBgInfo();
        }

        public boolean parseField(BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remainSeconds":
                    bLiveVoiceKtvPanelBgInfo.remainSeconds = jsonParser.getValueAsInt();
                    return true;
                case "gameId":
                    bLiveVoiceKtvPanelBgInfo.gameId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceKtvPanelBgInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    bLiveVoiceKtvPanelBgInfo.updatedTime = jsonParser.getValueAsLong();
                    return true;
                case "url":
                    bLiveVoiceKtvPanelBgInfo.url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceKtvPanelBgInfo.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeNumberField("remainSeconds", bLiveVoiceKtvPanelBgInfo.remainSeconds);
            jsonGenerator.writeNumberField(LocationInvisibleField.updatedTime, bLiveVoiceKtvPanelBgInfo.updatedTime);
            String str2 = bLiveVoiceKtvPanelBgInfo.gameId;
            if (str2 != null) {
                jsonGenerator.writeStringField("gameId", str2);
            }
            String str3 = bLiveVoiceKtvPanelBgInfo.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceKtvPanelBgInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicektvpanelbginfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String gameId;

    @ProtobufIndex(index = 2)
    public int remainSeconds;

    @ProtobufIndex(index = 3)
    public long updatedTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userId;

    public static BLiveVoiceKtvPanelBgInfo new_() {
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfo = new BLiveVoiceKtvPanelBgInfo();
        bLiveVoiceKtvPanelBgInfo.nullCheck();
        return bLiveVoiceKtvPanelBgInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceKtvPanelBgInfo mo223809clone() {
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfo = new BLiveVoiceKtvPanelBgInfo();
        bLiveVoiceKtvPanelBgInfo.url = this.url;
        bLiveVoiceKtvPanelBgInfo.remainSeconds = this.remainSeconds;
        bLiveVoiceKtvPanelBgInfo.updatedTime = this.updatedTime;
        bLiveVoiceKtvPanelBgInfo.gameId = this.gameId;
        bLiveVoiceKtvPanelBgInfo.userId = this.userId;
        return bLiveVoiceKtvPanelBgInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceKtvPanelBgInfo)) {
            return false;
        }
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfo = (BLiveVoiceKtvPanelBgInfo) obj;
        return ValueObject.util_equals(this.url, bLiveVoiceKtvPanelBgInfo.url) && this.remainSeconds == bLiveVoiceKtvPanelBgInfo.remainSeconds && this.updatedTime == bLiveVoiceKtvPanelBgInfo.updatedTime && ValueObject.util_equals(this.gameId, bLiveVoiceKtvPanelBgInfo.gameId) && ValueObject.util_equals(this.userId, bLiveVoiceKtvPanelBgInfo.userId);
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
        String str = this.url;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.remainSeconds) * 41;
        long j = this.updatedTime;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.gameId;
        int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.gameId == null) {
            this.gameId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
