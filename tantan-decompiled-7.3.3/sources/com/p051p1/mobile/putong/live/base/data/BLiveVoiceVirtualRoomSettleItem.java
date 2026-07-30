package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
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
public class BLiveVoiceVirtualRoomSettleItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceVirtualRoomSettleItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceVirtualRoomSettleItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceVirtualRoomSettleItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceVirtualRoomSettleItem newInstance() {
            return new BLiveVoiceVirtualRoomSettleItem();
        }

        public boolean parseField(BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roomId":
                    bLiveVoiceVirtualRoomSettleItem.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceVirtualRoomSettleItem.userId = jsonParser.getValueAsString();
                    return true;
                case "likePopUp":
                    bLiveVoiceVirtualRoomSettleItem.likePopUp = BLiveVoiceLikePopUp.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveVoiceVirtualRoomSettleItem.f45363id = jsonParser.getValueAsString();
                    return false;
                case "isRoomOwner":
                    bLiveVoiceVirtualRoomSettleItem.isRoomOwner = jsonParser.getValueAsBoolean();
                    return true;
                case "state":
                    bLiveVoiceVirtualRoomSettleItem.state = jsonParser.getValueAsString();
                    return true;
                case "toast":
                    bLiveVoiceVirtualRoomSettleItem.toast = jsonParser.getValueAsString();
                    return true;
                case "isManager":
                    bLiveVoiceVirtualRoomSettleItem.isManager = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceVirtualRoomSettleItem.f45363id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceVirtualRoomSettleItem.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveVoiceVirtualRoomSettleItem.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveVoiceVirtualRoomSettleItem.state;
            if (str4 != null) {
                jsonGenerator.writeStringField("state", str4);
            }
            jsonGenerator.writeBooleanField("isRoomOwner", bLiveVoiceVirtualRoomSettleItem.isRoomOwner);
            jsonGenerator.writeBooleanField("isManager", bLiveVoiceVirtualRoomSettleItem.isManager);
            String str5 = bLiveVoiceVirtualRoomSettleItem.toast;
            if (str5 != null) {
                jsonGenerator.writeStringField(OMSTemplateModeType.toast, str5);
            }
            if (bLiveVoiceVirtualRoomSettleItem.likePopUp != null) {
                jsonGenerator.writeFieldName("likePopUp");
                BLiveVoiceLikePopUp.JSON_ADAPTER.serialize(bLiveVoiceVirtualRoomSettleItem.likePopUp, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceVirtualRoomSettleItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String STATE_CREATED = "created";
    public static final String STATE_SETTLED = "settled";
    public static final String STATE_UNSETTLE = "unSettle";
    public static final String TYPE = "blivevoicevirtualroomsettleitem";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45363id;

    @ProtobufIndex(index = 6)
    public boolean isManager;

    @ProtobufIndex(index = 5)
    public boolean isRoomOwner;

    @Nullable
    @ProtobufIndex(index = 8)
    public BLiveVoiceLikePopUp likePopUp;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String state;

    @Nullable
    @ProtobufIndex(index = 7)
    public String toast;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    public static BLiveVoiceVirtualRoomSettleItem new_() {
        BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem = new BLiveVoiceVirtualRoomSettleItem();
        bLiveVoiceVirtualRoomSettleItem.nullCheck();
        return bLiveVoiceVirtualRoomSettleItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceVirtualRoomSettleItem mo225055clone() {
        BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem = new BLiveVoiceVirtualRoomSettleItem();
        bLiveVoiceVirtualRoomSettleItem.f45363id = this.f45363id;
        bLiveVoiceVirtualRoomSettleItem.roomId = this.roomId;
        bLiveVoiceVirtualRoomSettleItem.userId = this.userId;
        bLiveVoiceVirtualRoomSettleItem.state = this.state;
        bLiveVoiceVirtualRoomSettleItem.isRoomOwner = this.isRoomOwner;
        bLiveVoiceVirtualRoomSettleItem.isManager = this.isManager;
        bLiveVoiceVirtualRoomSettleItem.toast = this.toast;
        BLiveVoiceLikePopUp bLiveVoiceLikePopUp = this.likePopUp;
        if (bLiveVoiceLikePopUp != null) {
            bLiveVoiceVirtualRoomSettleItem.likePopUp = bLiveVoiceLikePopUp.mo225055clone();
        }
        return bLiveVoiceVirtualRoomSettleItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceVirtualRoomSettleItem)) {
            return false;
        }
        BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem = (BLiveVoiceVirtualRoomSettleItem) obj;
        return ValueObject.util_equals(this.f45363id, bLiveVoiceVirtualRoomSettleItem.f45363id) && ValueObject.util_equals(this.roomId, bLiveVoiceVirtualRoomSettleItem.roomId) && ValueObject.util_equals(this.userId, bLiveVoiceVirtualRoomSettleItem.userId) && ValueObject.util_equals(this.state, bLiveVoiceVirtualRoomSettleItem.state) && this.isRoomOwner == bLiveVoiceVirtualRoomSettleItem.isRoomOwner && this.isManager == bLiveVoiceVirtualRoomSettleItem.isManager && ValueObject.util_equals(this.toast, bLiveVoiceVirtualRoomSettleItem.toast) && ValueObject.util_equals(this.likePopUp, bLiveVoiceVirtualRoomSettleItem.likePopUp);
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
        String str = this.f45363id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.state;
        int iHashCode4 = (((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.isRoomOwner ? 1231 : 1237)) * 41) + (this.isManager ? 1231 : 1237)) * 41;
        String str5 = this.toast;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveVoiceLikePopUp bLiveVoiceLikePopUp = this.likePopUp;
        int iHashCode6 = iHashCode5 + (bLiveVoiceLikePopUp != null ? bLiveVoiceLikePopUp.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    public boolean isCreated() {
        return "created".equals(this.state);
    }

    public boolean isSettled() {
        return STATE_SETTLED.equals(this.state);
    }

    public boolean isUnSettled() {
        return STATE_UNSETTLE.equals(this.state);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45363id == null) {
            this.f45363id = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.state == null) {
            this.state = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
