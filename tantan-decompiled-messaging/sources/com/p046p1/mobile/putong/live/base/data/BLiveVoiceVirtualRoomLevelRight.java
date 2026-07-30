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
public class BLiveVoiceVirtualRoomLevelRight extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceVirtualRoomLevelRight> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceVirtualRoomLevelRight>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceVirtualRoomLevelRight.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceVirtualRoomLevelRight newInstance() {
            return new BLiveVoiceVirtualRoomLevelRight();
        }

        public boolean parseField(BLiveVoiceVirtualRoomLevelRight bLiveVoiceVirtualRoomLevelRight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "icon":
                    bLiveVoiceVirtualRoomLevelRight.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceVirtualRoomLevelRight.title = jsonParser.getValueAsString();
                    return true;
                case "lightUp":
                    bLiveVoiceVirtualRoomLevelRight.lightUp = jsonParser.getValueAsBoolean();
                    return true;
                case "contentImg":
                    bLiveVoiceVirtualRoomLevelRight.contentImg = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveVoiceVirtualRoomLevelRight.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceVirtualRoomLevelRight bLiveVoiceVirtualRoomLevelRight, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceVirtualRoomLevelRight.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveVoiceVirtualRoomLevelRight.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveVoiceVirtualRoomLevelRight.content;
            if (str3 != null) {
                jsonGenerator.writeStringField("content", str3);
            }
            String str4 = bLiveVoiceVirtualRoomLevelRight.contentImg;
            if (str4 != null) {
                jsonGenerator.writeStringField("contentImg", str4);
            }
            jsonGenerator.writeBooleanField("lightUp", bLiveVoiceVirtualRoomLevelRight.lightUp);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceVirtualRoomLevelRight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicevirtualroomlevelright";

    @NonNull
    @ProtobufIndex(index = 3)
    public String content;

    @NonNull
    @ProtobufIndex(index = 4)
    public String contentImg;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @ProtobufIndex(index = 5)
    public boolean lightUp;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveVoiceVirtualRoomLevelRight new_() {
        BLiveVoiceVirtualRoomLevelRight bLiveVoiceVirtualRoomLevelRight = new BLiveVoiceVirtualRoomLevelRight();
        bLiveVoiceVirtualRoomLevelRight.nullCheck();
        return bLiveVoiceVirtualRoomLevelRight;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceVirtualRoomLevelRight mo223809clone() {
        BLiveVoiceVirtualRoomLevelRight bLiveVoiceVirtualRoomLevelRight = new BLiveVoiceVirtualRoomLevelRight();
        bLiveVoiceVirtualRoomLevelRight.icon = this.icon;
        bLiveVoiceVirtualRoomLevelRight.title = this.title;
        bLiveVoiceVirtualRoomLevelRight.content = this.content;
        bLiveVoiceVirtualRoomLevelRight.contentImg = this.contentImg;
        bLiveVoiceVirtualRoomLevelRight.lightUp = this.lightUp;
        return bLiveVoiceVirtualRoomLevelRight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceVirtualRoomLevelRight)) {
            return false;
        }
        BLiveVoiceVirtualRoomLevelRight bLiveVoiceVirtualRoomLevelRight = (BLiveVoiceVirtualRoomLevelRight) obj;
        return ValueObject.util_equals(this.icon, bLiveVoiceVirtualRoomLevelRight.icon) && ValueObject.util_equals(this.title, bLiveVoiceVirtualRoomLevelRight.title) && ValueObject.util_equals(this.content, bLiveVoiceVirtualRoomLevelRight.content) && ValueObject.util_equals(this.contentImg, bLiveVoiceVirtualRoomLevelRight.contentImg) && this.lightUp == bLiveVoiceVirtualRoomLevelRight.lightUp;
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.contentImg;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.lightUp ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.contentImg == null) {
            this.contentImg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
