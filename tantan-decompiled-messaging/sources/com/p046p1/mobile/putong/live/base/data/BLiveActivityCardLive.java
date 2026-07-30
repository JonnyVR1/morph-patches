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
public class BLiveActivityCardLive extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveActivityCardLive> JSON_ADAPTER = new ObjectJsonAdapter<BLiveActivityCardLive>() { // from class: com.p1.mobile.putong.live.base.data.BLiveActivityCardLive.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveActivityCardLive.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveActivityCardLive newInstance() {
            return new BLiveActivityCardLive();
        }

        public boolean parseField(BLiveActivityCardLive bLiveActivityCardLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveActivityCardLive.subTitle = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveActivityCardLive.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomCoverUrl":
                    bLiveActivityCardLive.roomCoverUrl = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveActivityCardLive.title = jsonParser.getValueAsString();
                    return true;
                case "videoCaptureUrl":
                    bLiveActivityCardLive.videoCaptureUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveActivityCardLive bLiveActivityCardLive, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveActivityCardLive.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            String str2 = bLiveActivityCardLive.videoCaptureUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("videoCaptureUrl", str2);
            }
            String str3 = bLiveActivityCardLive.roomCoverUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomCoverUrl", str3);
            }
            String str4 = bLiveActivityCardLive.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            String str5 = bLiveActivityCardLive.subTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("subTitle", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveActivityCardLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveactivitycardlive";

    @NonNull
    @ProtobufIndex(index = 1)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomCoverUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 5)
    public String title;

    @NonNull
    @ProtobufIndex(index = 2)
    public String videoCaptureUrl;

    public static BLiveActivityCardLive new_() {
        BLiveActivityCardLive bLiveActivityCardLive = new BLiveActivityCardLive();
        bLiveActivityCardLive.nullCheck();
        return bLiveActivityCardLive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveActivityCardLive mo223809clone() {
        BLiveActivityCardLive bLiveActivityCardLive = new BLiveActivityCardLive();
        bLiveActivityCardLive.liveId = this.liveId;
        bLiveActivityCardLive.videoCaptureUrl = this.videoCaptureUrl;
        bLiveActivityCardLive.roomCoverUrl = this.roomCoverUrl;
        bLiveActivityCardLive.title = this.title;
        bLiveActivityCardLive.subTitle = this.subTitle;
        return bLiveActivityCardLive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveActivityCardLive)) {
            return false;
        }
        BLiveActivityCardLive bLiveActivityCardLive = (BLiveActivityCardLive) obj;
        return ValueObject.util_equals(this.liveId, bLiveActivityCardLive.liveId) && ValueObject.util_equals(this.videoCaptureUrl, bLiveActivityCardLive.videoCaptureUrl) && ValueObject.util_equals(this.roomCoverUrl, bLiveActivityCardLive.roomCoverUrl) && ValueObject.util_equals(this.title, bLiveActivityCardLive.title) && ValueObject.util_equals(this.subTitle, bLiveActivityCardLive.subTitle);
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
        String str = this.liveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.videoCaptureUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomCoverUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subTitle;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.videoCaptureUrl == null) {
            this.videoCaptureUrl = "";
        }
        if (this.roomCoverUrl == null) {
            this.roomCoverUrl = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
