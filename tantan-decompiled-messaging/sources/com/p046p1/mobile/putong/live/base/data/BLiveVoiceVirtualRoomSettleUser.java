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
public class BLiveVoiceVirtualRoomSettleUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceVirtualRoomSettleUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceVirtualRoomSettleUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceVirtualRoomSettleUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceVirtualRoomSettleUser newInstance() {
            return new BLiveVoiceVirtualRoomSettleUser();
        }

        public boolean parseField(BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("avatar")) {
                bLiveVoiceVirtualRoomSettleUser.avatar = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("userId")) {
                return false;
            }
            bLiveVoiceVirtualRoomSettleUser.userId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceVirtualRoomSettleUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVoiceVirtualRoomSettleUser.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatar", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceVirtualRoomSettleUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicevirtualroomsettleuser";

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveVoiceVirtualRoomSettleUser new_() {
        BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser = new BLiveVoiceVirtualRoomSettleUser();
        bLiveVoiceVirtualRoomSettleUser.nullCheck();
        return bLiveVoiceVirtualRoomSettleUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceVirtualRoomSettleUser mo223809clone() {
        BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser = new BLiveVoiceVirtualRoomSettleUser();
        bLiveVoiceVirtualRoomSettleUser.userId = this.userId;
        bLiveVoiceVirtualRoomSettleUser.avatar = this.avatar;
        return bLiveVoiceVirtualRoomSettleUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceVirtualRoomSettleUser)) {
            return false;
        }
        BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser = (BLiveVoiceVirtualRoomSettleUser) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceVirtualRoomSettleUser.userId) && ValueObject.util_equals(this.avatar, bLiveVoiceVirtualRoomSettleUser.avatar);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
