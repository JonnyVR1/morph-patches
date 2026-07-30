package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallPics;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceGiftWallBrief extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftWallBrief> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftWallBrief>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftWallBrief.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftWallBrief newInstance() {
            return new BLiveVoiceGiftWallBrief();
        }

        public boolean parseField(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveVoiceGiftWallBrief.userId = jsonParser.getValueAsString();
                    return true;
                case "giftWallGrade":
                    bLiveVoiceGiftWallBrief.giftWallGrade = jsonParser.getValueAsInt();
                    return true;
                case "userName":
                    bLiveVoiceGiftWallBrief.userName = jsonParser.getValueAsString();
                    return true;
                case "lightGiftCount":
                    bLiveVoiceGiftWallBrief.lightGiftCount = jsonParser.getValueAsInt();
                    return true;
                case "pics":
                    bLiveVoiceGiftWallBrief.pics = JsonAdapter.parseArray(jsonParser, BLiveVoiceGiftWallPics.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userAvatar":
                    bLiveVoiceGiftWallBrief.userAvatar = jsonParser.getValueAsString();
                    return true;
                case "totalGiftCount":
                    bLiveVoiceGiftWallBrief.totalGiftCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("lightGiftCount", bLiveVoiceGiftWallBrief.lightGiftCount);
            jsonGenerator.writeNumberField("totalGiftCount", bLiveVoiceGiftWallBrief.totalGiftCount);
            String str = bLiveVoiceGiftWallBrief.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("giftWallGrade", bLiveVoiceGiftWallBrief.giftWallGrade);
            String str2 = bLiveVoiceGiftWallBrief.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveVoiceGiftWallBrief.userAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("userAvatar", str3);
            }
            if (bLiveVoiceGiftWallBrief.pics != null) {
                jsonGenerator.writeFieldName(SocialConstants.PARAM_IMAGE);
                JsonAdapter.serializeArray(bLiveVoiceGiftWallBrief.pics, jsonGenerator, BLiveVoiceGiftWallPics.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftWallBrief) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftwallbrief";

    @ProtobufIndex(index = 4)
    public int giftWallGrade;

    @ProtobufIndex(index = 1)
    public int lightGiftCount;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveVoiceGiftWallPics> pics;

    @ProtobufIndex(index = 2)
    public int totalGiftCount;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userName;

    public static BLiveVoiceGiftWallBrief new_() {
        BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief = new BLiveVoiceGiftWallBrief();
        bLiveVoiceGiftWallBrief.nullCheck();
        return bLiveVoiceGiftWallBrief;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftWallBrief mo223809clone() {
        BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief = new BLiveVoiceGiftWallBrief();
        bLiveVoiceGiftWallBrief.lightGiftCount = this.lightGiftCount;
        bLiveVoiceGiftWallBrief.totalGiftCount = this.totalGiftCount;
        bLiveVoiceGiftWallBrief.userId = this.userId;
        bLiveVoiceGiftWallBrief.giftWallGrade = this.giftWallGrade;
        bLiveVoiceGiftWallBrief.userName = this.userName;
        bLiveVoiceGiftWallBrief.userAvatar = this.userAvatar;
        List<BLiveVoiceGiftWallPics> list = this.pics;
        if (list != null) {
            bLiveVoiceGiftWallBrief.pics = ValueObject.util_map(list, new w9j() { // from class: l.u82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceGiftWallPics) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceGiftWallBrief;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGiftWallBrief)) {
            return false;
        }
        BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief = (BLiveVoiceGiftWallBrief) obj;
        return this.lightGiftCount == bLiveVoiceGiftWallBrief.lightGiftCount && this.totalGiftCount == bLiveVoiceGiftWallBrief.totalGiftCount && ValueObject.util_equals(this.userId, bLiveVoiceGiftWallBrief.userId) && this.giftWallGrade == bLiveVoiceGiftWallBrief.giftWallGrade && ValueObject.util_equals(this.userName, bLiveVoiceGiftWallBrief.userName) && ValueObject.util_equals(this.userAvatar, bLiveVoiceGiftWallBrief.userAvatar) && ValueObject.util_equals(this.pics, bLiveVoiceGiftWallBrief.pics);
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
        int i2 = ((((i * 41) + this.lightGiftCount) * 41) + this.totalGiftCount) * 41;
        String str = this.userId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.giftWallGrade) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveVoiceGiftWallPics> list = this.pics;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.pics == null) {
            this.pics = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
