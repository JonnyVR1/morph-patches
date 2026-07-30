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
public class BLiveSuggestLiveRoom extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSuggestLiveRoom> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSuggestLiveRoom>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSuggestLiveRoom.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSuggestLiveRoom newInstance() {
            return new BLiveSuggestLiveRoom();
        }

        public boolean parseField(BLiveSuggestLiveRoom bLiveSuggestLiveRoom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "coverUrl":
                    bLiveSuggestLiveRoom.coverUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveSuggestLiveRoom.f45300id = jsonParser.getValueAsString();
                    return false;
                case "title":
                    bLiveSuggestLiveRoom.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSuggestLiveRoom bLiveSuggestLiveRoom, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSuggestLiveRoom.f45300id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveSuggestLiveRoom.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveSuggestLiveRoom.coverUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("coverUrl", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSuggestLiveRoom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesuggestliveroom";

    @NonNull
    @ProtobufIndex(index = 3)
    public String coverUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45300id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveSuggestLiveRoom new_() {
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = new BLiveSuggestLiveRoom();
        bLiveSuggestLiveRoom.nullCheck();
        return bLiveSuggestLiveRoom;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSuggestLiveRoom mo225055clone() {
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = new BLiveSuggestLiveRoom();
        bLiveSuggestLiveRoom.f45300id = this.f45300id;
        bLiveSuggestLiveRoom.title = this.title;
        bLiveSuggestLiveRoom.coverUrl = this.coverUrl;
        return bLiveSuggestLiveRoom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSuggestLiveRoom)) {
            return false;
        }
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = (BLiveSuggestLiveRoom) obj;
        return ValueObject.util_equals(this.f45300id, bLiveSuggestLiveRoom.f45300id) && ValueObject.util_equals(this.title, bLiveSuggestLiveRoom.title) && ValueObject.util_equals(this.coverUrl, bLiveSuggestLiveRoom.coverUrl);
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
        String str = this.f45300id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.coverUrl;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45300id == null) {
            this.f45300id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.coverUrl == null) {
            this.coverUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
