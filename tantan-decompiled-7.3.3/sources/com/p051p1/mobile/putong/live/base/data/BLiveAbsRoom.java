package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Owner;
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
public class BLiveAbsRoom extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAbsRoom> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAbsRoom>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAbsRoom.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAbsRoom.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAbsRoom newInstance() {
            return new BLiveAbsRoom();
        }

        public boolean parseField(BLiveAbsRoom bLiveAbsRoom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveAbsRoom.f45172id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveAbsRoom.type = jsonParser.getValueAsString();
                    return true;
                case "cover":
                    bLiveAbsRoom.cover = BLiveRoomCover.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    bLiveAbsRoom.owner = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveAbsRoom.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAbsRoom bLiveAbsRoom, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAbsRoom.f45172id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveAbsRoom.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                BLiveOwner.JSON_ADAPTER.serialize(bLiveAbsRoom.owner, jsonGenerator, true);
            }
            String str2 = bLiveAbsRoom.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            if (bLiveAbsRoom.cover != null) {
                jsonGenerator.writeFieldName("cover");
                BLiveRoomCover.JSON_ADAPTER.serialize(bLiveAbsRoom.cover, jsonGenerator, true);
            }
            String str3 = bLiveAbsRoom.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAbsRoom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveabsroom";

    @Nullable
    @ProtobufIndex(index = 4)
    public BLiveRoomCover cover;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45172id;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOwner owner;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    public static BLiveAbsRoom new_() {
        BLiveAbsRoom bLiveAbsRoom = new BLiveAbsRoom();
        bLiveAbsRoom.nullCheck();
        return bLiveAbsRoom;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAbsRoom mo225055clone() {
        BLiveAbsRoom bLiveAbsRoom = new BLiveAbsRoom();
        bLiveAbsRoom.f45172id = this.f45172id;
        BLiveOwner bLiveOwner = this.owner;
        if (bLiveOwner != null) {
            bLiveAbsRoom.owner = bLiveOwner.mo225055clone();
        }
        bLiveAbsRoom.title = this.title;
        BLiveRoomCover bLiveRoomCover = this.cover;
        if (bLiveRoomCover != null) {
            bLiveAbsRoom.cover = bLiveRoomCover.mo225055clone();
        }
        bLiveAbsRoom.type = this.type;
        return bLiveAbsRoom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAbsRoom)) {
            return false;
        }
        BLiveAbsRoom bLiveAbsRoom = (BLiveAbsRoom) obj;
        return ValueObject.util_equals(this.f45172id, bLiveAbsRoom.f45172id) && ValueObject.util_equals(this.owner, bLiveAbsRoom.owner) && ValueObject.util_equals(this.title, bLiveAbsRoom.title) && ValueObject.util_equals(this.cover, bLiveAbsRoom.cover) && ValueObject.util_equals(this.type, bLiveAbsRoom.type);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Nullable
    public String getCoverUrl() {
        BLiveRoomCover bLiveRoomCover = this.cover;
        if (bLiveRoomCover == null) {
            return null;
        }
        return bLiveRoomCover.media.url;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f45172id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveOwner bLiveOwner = this.owner;
        int iHashCode2 = (iHashCode + (bLiveOwner != null ? bLiveOwner.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveRoomCover bLiveRoomCover = this.cover;
        int iHashCode4 = (iHashCode3 + (bLiveRoomCover != null ? bLiveRoomCover.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    public boolean isNormalRoom() {
        return TextUtils.equals(this.type, "room") || (this instanceof BLiveRoom);
    }

    public boolean isVoiceRoom() {
        return TextUtils.equals(this.type, "voice-room") || (this instanceof BLiveVoiceRoom);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45172id == null) {
            this.f45172id = "";
        }
        if (this.owner == null) {
            this.owner = BLiveOwner.new_();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
