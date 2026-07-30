package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePopUp extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePopUp> JSON_ADAPTER = new ObjectJsonAdapter<BLivePopUp>() { // from class: com.p1.mobile.putong.live.base.data.BLivePopUp.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePopUp.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePopUp newInstance() {
            return new BLivePopUp();
        }

        public boolean parseField(BLivePopUp bLivePopUp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorAvatar":
                    bLivePopUp.anchorAvatar = jsonParser.getValueAsString();
                    return true;
                case "anchorName":
                    bLivePopUp.anchorName = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLivePopUp.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLivePopUp.anchorId = jsonParser.getValueAsString();
                    return true;
                case "source":
                    bLivePopUp.source = jsonParser.getValueAsString();
                    return true;
                case "contentText":
                    bLivePopUp.contentText = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLivePopUp.type = jsonParser.getValueAsString();
                    return true;
                case "liveRoomId":
                    bLivePopUp.liveRoomId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePopUp bLivePopUp, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePopUp.anchorId;
            if (str != null) {
                jsonGenerator.writeStringField("anchorId", str);
            }
            String str2 = bLivePopUp.anchorName;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorName", str2);
            }
            String str3 = bLivePopUp.anchorAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorAvatar", str3);
            }
            String str4 = bLivePopUp.liveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveId", str4);
            }
            String str5 = bLivePopUp.liveRoomId;
            if (str5 != null) {
                jsonGenerator.writeStringField("liveRoomId", str5);
            }
            String str6 = bLivePopUp.contentText;
            if (str6 != null) {
                jsonGenerator.writeStringField(RXScreenCaptureService.KEY_CONTENT_TEXT, str6);
            }
            String str7 = bLivePopUp.type;
            if (str7 != null) {
                jsonGenerator.writeStringField("type", str7);
            }
            String str8 = bLivePopUp.source;
            if (str8 != null) {
                jsonGenerator.writeStringField("source", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepopup";

    @NonNull
    @ProtobufIndex(index = 3)
    public String anchorAvatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorName;

    @NonNull
    @ProtobufIndex(index = 6)
    public String contentText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String liveRoomId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String source;

    @NonNull
    @ProtobufIndex(index = 7)
    public String type;

    public static BLivePopUp new_() {
        BLivePopUp bLivePopUp = new BLivePopUp();
        bLivePopUp.nullCheck();
        return bLivePopUp;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePopUp mo225055clone() {
        BLivePopUp bLivePopUp = new BLivePopUp();
        bLivePopUp.anchorId = this.anchorId;
        bLivePopUp.anchorName = this.anchorName;
        bLivePopUp.anchorAvatar = this.anchorAvatar;
        bLivePopUp.liveId = this.liveId;
        bLivePopUp.liveRoomId = this.liveRoomId;
        bLivePopUp.contentText = this.contentText;
        bLivePopUp.type = this.type;
        bLivePopUp.source = this.source;
        return bLivePopUp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePopUp)) {
            return false;
        }
        BLivePopUp bLivePopUp = (BLivePopUp) obj;
        return ValueObject.util_equals(this.anchorId, bLivePopUp.anchorId) && ValueObject.util_equals(this.anchorName, bLivePopUp.anchorName) && ValueObject.util_equals(this.anchorAvatar, bLivePopUp.anchorAvatar) && ValueObject.util_equals(this.liveId, bLivePopUp.liveId) && ValueObject.util_equals(this.liveRoomId, bLivePopUp.liveRoomId) && ValueObject.util_equals(this.contentText, bLivePopUp.contentText) && ValueObject.util_equals(this.type, bLivePopUp.type) && ValueObject.util_equals(this.source, bLivePopUp.source);
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
        String str = this.anchorId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.liveRoomId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.contentText;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.type;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.source;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.anchorAvatar == null) {
            this.anchorAvatar = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.liveRoomId == null) {
            this.liveRoomId = "";
        }
        if (this.contentText == null) {
            this.contentText = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
