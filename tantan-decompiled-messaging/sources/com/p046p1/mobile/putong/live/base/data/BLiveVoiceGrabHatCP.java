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
public class BLiveVoiceGrabHatCP extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGrabHatCP> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGrabHatCP>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGrabHatCP.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGrabHatCP newInstance() {
            return new BLiveVoiceGrabHatCP();
        }

        public boolean parseField(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    bLiveVoiceGrabHatCP.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "lovePoint":
                    bLiveVoiceGrabHatCP.lovePoint = jsonParser.getValueAsLong();
                    return true;
                case "otherUserMask":
                    bLiveVoiceGrabHatCP.otherUserMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    bLiveVoiceGrabHatCP.userId = jsonParser.getValueAsString();
                    return true;
                case "userMask":
                    bLiveVoiceGrabHatCP.userMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveVoiceGrabHatCP.f44499id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGrabHatCP.f44499id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceGrabHatCP.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveVoiceGrabHatCP.otherUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("otherUserId", str3);
            }
            if (bLiveVoiceGrabHatCP.userMask != null) {
                jsonGenerator.writeFieldName("userMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceGrabHatCP.userMask, jsonGenerator, true);
            }
            if (bLiveVoiceGrabHatCP.otherUserMask != null) {
                jsonGenerator.writeFieldName("otherUserMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceGrabHatCP.otherUserMask, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("lovePoint", bLiveVoiceGrabHatCP.lovePoint);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGrabHatCP) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegrabhatcp";
    public String hatUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44499id;

    @ProtobufIndex(index = 6)
    public long lovePoint;

    @NonNull
    @ProtobufIndex(index = 3)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveUserMask otherUserMask;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveUserMask userMask;

    public static BLiveVoiceGrabHatCP new_() {
        BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP = new BLiveVoiceGrabHatCP();
        bLiveVoiceGrabHatCP.nullCheck();
        return bLiveVoiceGrabHatCP;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGrabHatCP mo223809clone() {
        BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP = new BLiveVoiceGrabHatCP();
        bLiveVoiceGrabHatCP.f44499id = this.f44499id;
        bLiveVoiceGrabHatCP.userId = this.userId;
        bLiveVoiceGrabHatCP.otherUserId = this.otherUserId;
        BLiveUserMask bLiveUserMask = this.userMask;
        if (bLiveUserMask != null) {
            bLiveVoiceGrabHatCP.userMask = bLiveUserMask.mo223809clone();
        }
        BLiveUserMask bLiveUserMask2 = this.otherUserMask;
        if (bLiveUserMask2 != null) {
            bLiveVoiceGrabHatCP.otherUserMask = bLiveUserMask2.mo223809clone();
        }
        bLiveVoiceGrabHatCP.lovePoint = this.lovePoint;
        return bLiveVoiceGrabHatCP;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGrabHatCP)) {
            return false;
        }
        BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP = (BLiveVoiceGrabHatCP) obj;
        return ValueObject.util_equals(this.f44499id, bLiveVoiceGrabHatCP.f44499id) && ValueObject.util_equals(this.userId, bLiveVoiceGrabHatCP.userId) && ValueObject.util_equals(this.otherUserId, bLiveVoiceGrabHatCP.otherUserId) && ValueObject.util_equals(this.userMask, bLiveVoiceGrabHatCP.userMask) && ValueObject.util_equals(this.otherUserMask, bLiveVoiceGrabHatCP.otherUserMask) && this.lovePoint == bLiveVoiceGrabHatCP.lovePoint;
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
        String str = this.f44499id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.userMask;
        int iHashCode4 = (iHashCode3 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask2 = this.otherUserMask;
        int iHashCode5 = bLiveUserMask2 != null ? bLiveUserMask2.hashCode() : 0;
        long j = this.lovePoint;
        int i3 = ((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44499id == null) {
            this.f44499id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.userMask == null) {
            this.userMask = BLiveUserMask.new_();
        }
        if (this.otherUserMask == null) {
            this.otherUserMask = BLiveUserMask.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
