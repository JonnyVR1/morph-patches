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
public class BLiveVoiceMemberAvatar extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceMemberAvatar> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceMemberAvatar>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceMemberAvatar.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceMemberAvatar.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceMemberAvatar newInstance() {
            return new BLiveVoiceMemberAvatar();
        }

        public boolean parseField(BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveVoiceMemberAvatar.avatar = jsonParser.getValueAsString();
                    return true;
                case "isOnCall":
                    bLiveVoiceMemberAvatar.isOnCall = jsonParser.getValueAsBoolean();
                    return true;
                case "color":
                    bLiveVoiceMemberAvatar.color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceMemberAvatar.avatar;
            if (str != null) {
                jsonGenerator.writeStringField("avatar", str);
            }
            String str2 = bLiveVoiceMemberAvatar.color;
            if (str2 != null) {
                jsonGenerator.writeStringField("color", str2);
            }
            jsonGenerator.writeBooleanField("isOnCall", bLiveVoiceMemberAvatar.isOnCall);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceMemberAvatar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicememberavatar";

    @NonNull
    @ProtobufIndex(index = 1)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 2)
    public String color;

    @ProtobufIndex(index = 3)
    public boolean isOnCall;

    public static BLiveVoiceMemberAvatar new_() {
        BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = new BLiveVoiceMemberAvatar();
        bLiveVoiceMemberAvatar.nullCheck();
        return bLiveVoiceMemberAvatar;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceMemberAvatar mo223809clone() {
        BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = new BLiveVoiceMemberAvatar();
        bLiveVoiceMemberAvatar.avatar = this.avatar;
        bLiveVoiceMemberAvatar.color = this.color;
        bLiveVoiceMemberAvatar.isOnCall = this.isOnCall;
        return bLiveVoiceMemberAvatar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceMemberAvatar)) {
            return false;
        }
        BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = (BLiveVoiceMemberAvatar) obj;
        return ValueObject.util_equals(this.avatar, bLiveVoiceMemberAvatar.avatar) && ValueObject.util_equals(this.color, bLiveVoiceMemberAvatar.color) && this.isOnCall == bLiveVoiceMemberAvatar.isOnCall;
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
        String str = this.avatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.color;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isOnCall ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.color == null) {
            this.color = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
