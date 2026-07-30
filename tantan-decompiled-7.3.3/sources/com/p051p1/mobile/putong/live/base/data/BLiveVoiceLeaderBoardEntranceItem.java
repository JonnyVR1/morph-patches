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
public class BLiveVoiceLeaderBoardEntranceItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLeaderBoardEntranceItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLeaderBoardEntranceItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLeaderBoardEntranceItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLeaderBoardEntranceItem newInstance() {
            return new BLiveVoiceLeaderBoardEntranceItem();
        }

        public boolean parseField(BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "scheme":
                    bLiveVoiceLeaderBoardEntranceItem.scheme = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveVoiceLeaderBoardEntranceItem.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVoiceLeaderBoardEntranceItem.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceLeaderBoardEntranceItem.title = jsonParser.getValueAsString();
                    return true;
                case "trackData":
                    bLiveVoiceLeaderBoardEntranceItem.trackData = BLiveTrackData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceLeaderBoardEntranceItem.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveVoiceLeaderBoardEntranceItem.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveVoiceLeaderBoardEntranceItem.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = bLiveVoiceLeaderBoardEntranceItem.scheme;
            if (str4 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str4);
            }
            if (bLiveVoiceLeaderBoardEntranceItem.trackData != null) {
                jsonGenerator.writeFieldName("trackData");
                BLiveTrackData.JSON_ADAPTER.serialize(bLiveVoiceLeaderBoardEntranceItem.trackData, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLeaderBoardEntranceItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceleaderboardentranceitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 4)
    public String scheme;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveTrackData trackData;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    public static BLiveVoiceLeaderBoardEntranceItem new_() {
        BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem = new BLiveVoiceLeaderBoardEntranceItem();
        bLiveVoiceLeaderBoardEntranceItem.nullCheck();
        return bLiveVoiceLeaderBoardEntranceItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLeaderBoardEntranceItem mo225055clone() {
        BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem = new BLiveVoiceLeaderBoardEntranceItem();
        bLiveVoiceLeaderBoardEntranceItem.icon = this.icon;
        bLiveVoiceLeaderBoardEntranceItem.title = this.title;
        bLiveVoiceLeaderBoardEntranceItem.type = this.type;
        bLiveVoiceLeaderBoardEntranceItem.scheme = this.scheme;
        BLiveTrackData bLiveTrackData = this.trackData;
        if (bLiveTrackData != null) {
            bLiveVoiceLeaderBoardEntranceItem.trackData = bLiveTrackData.mo225055clone();
        }
        return bLiveVoiceLeaderBoardEntranceItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLeaderBoardEntranceItem)) {
            return false;
        }
        BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem = (BLiveVoiceLeaderBoardEntranceItem) obj;
        return ValueObject.util_equals(this.icon, bLiveVoiceLeaderBoardEntranceItem.icon) && ValueObject.util_equals(this.title, bLiveVoiceLeaderBoardEntranceItem.title) && ValueObject.util_equals(this.type, bLiveVoiceLeaderBoardEntranceItem.type) && ValueObject.util_equals(this.scheme, bLiveVoiceLeaderBoardEntranceItem.scheme) && ValueObject.util_equals(this.trackData, bLiveVoiceLeaderBoardEntranceItem.trackData);
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
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.scheme;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveTrackData bLiveTrackData = this.trackData;
        int iHashCode5 = iHashCode4 + (bLiveTrackData != null ? bLiveTrackData.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
        if (this.trackData == null) {
            this.trackData = BLiveTrackData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
