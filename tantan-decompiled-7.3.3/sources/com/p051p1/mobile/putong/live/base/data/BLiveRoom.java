package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveRoom extends BLiveAbsRoom implements Cloneable, Serializable {
    public static final BLiveRoom EMPTY = new_();
    public static JsonAdapter<BLiveRoom> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRoom>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRoom.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRoom.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRoom newInstance() {
            return new BLiveRoom();
        }

        public boolean parseField(BLiveRoom bLiveRoom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveStickerIds":
                    bLiveRoom.liveStickerIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveRoom.f45172id = jsonParser.getValueAsString();
                    return false;
                case "sign":
                    bLiveRoom.sign = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveRoom.type = jsonParser.getValueAsString();
                    return true;
                case "cover":
                    bLiveRoom.cover = BLiveRoomCover.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    bLiveRoom.owner = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveRoom.title = jsonParser.getValueAsString();
                    return true;
                case "callSwitch":
                    bLiveRoom.callSwitch = BLiveCallSwitch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRoom bLiveRoom, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRoom.f45172id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveRoom.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                BLiveOwner.JSON_ADAPTER.serialize(bLiveRoom.owner, jsonGenerator, true);
            }
            String str2 = bLiveRoom.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            if (bLiveRoom.cover != null) {
                jsonGenerator.writeFieldName("cover");
                BLiveRoomCover.JSON_ADAPTER.serialize(bLiveRoom.cover, jsonGenerator, true);
            }
            String str3 = bLiveRoom.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            if (bLiveRoom.liveStickerIds != null) {
                jsonGenerator.writeFieldName("liveStickerIds");
                JsonAdapter.serializeArray(bLiveRoom.liveStickerIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveRoom.callSwitch != null) {
                jsonGenerator.writeFieldName("callSwitch");
                BLiveCallSwitch.JSON_ADAPTER.serialize(bLiveRoom.callSwitch, jsonGenerator, true);
            }
            String str4 = bLiveRoom.sign;
            if (str4 != null) {
                jsonGenerator.writeStringField("sign", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRoom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveroom";

    @NonNull
    @ProtobufIndex(index = 52)
    public BLiveCallSwitch callSwitch;

    @Nullable
    @ProtobufIndex(index = 51)
    public List<String> liveStickerIds;
    public String mTempTitle;

    @Nullable
    @ProtobufIndex(index = 53)
    public String sign;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69383a(String str) {
        return str;
    }

    public static BLiveRoom new_() {
        BLiveRoom bLiveRoom = new BLiveRoom();
        bLiveRoom.nullCheck();
        return bLiveRoom;
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRoom mo225055clone() {
        BLiveRoom bLiveRoom = new BLiveRoom();
        bLiveRoom.f45172id = this.f45172id;
        BLiveOwner bLiveOwner = this.owner;
        if (bLiveOwner != null) {
            bLiveRoom.owner = bLiveOwner.mo225055clone();
        }
        bLiveRoom.title = this.title;
        BLiveRoomCover bLiveRoomCover = this.cover;
        if (bLiveRoomCover != null) {
            bLiveRoom.cover = bLiveRoomCover.mo225055clone();
        }
        bLiveRoom.type = this.type;
        List<String> list = this.liveStickerIds;
        if (list != null) {
            bLiveRoom.liveStickerIds = ValueObject.util_map(list, new qcj() { // from class: l.i52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveRoom.m69383a((String) obj);
                }
            });
        }
        BLiveCallSwitch bLiveCallSwitch = this.callSwitch;
        if (bLiveCallSwitch != null) {
            bLiveRoom.callSwitch = bLiveCallSwitch.mo225055clone();
        }
        bLiveRoom.sign = this.sign;
        return bLiveRoom;
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRoom)) {
            return false;
        }
        BLiveRoom bLiveRoom = (BLiveRoom) obj;
        return super.equals(obj) && ValueObject.util_equals(this.liveStickerIds, bLiveRoom.liveStickerIds) && ValueObject.util_equals(this.callSwitch, bLiveRoom.callSwitch) && ValueObject.util_equals(this.sign, bLiveRoom.sign);
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<String> list = this.liveStickerIds;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        BLiveCallSwitch bLiveCallSwitch = this.callSwitch;
        int iHashCode3 = (iHashCode2 + (bLiveCallSwitch != null ? bLiveCallSwitch.hashCode() : 0)) * 41;
        String str = this.sign;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.callSwitch == null) {
            this.callSwitch = BLiveCallSwitch.new_();
        }
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom, com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
