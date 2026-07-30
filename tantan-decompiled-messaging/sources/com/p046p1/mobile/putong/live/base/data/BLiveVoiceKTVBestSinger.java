package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveVoiceKTVBestSinger extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceKTVBestSinger> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceKTVBestSinger>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceKTVBestSinger.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceKTVBestSinger.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceKTVBestSinger newInstance() {
            return new BLiveVoiceKTVBestSinger();
        }

        public boolean parseField(BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveVoiceKTVBestSinger.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveVoiceKTVBestSinger.userName = jsonParser.getValueAsString();
                    return true;
                case "score":
                    bLiveVoiceKTVBestSinger.score = jsonParser.getValueAsLong();
                    return true;
                case "userAvatar":
                    bLiveVoiceKTVBestSinger.userAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceKTVBestSinger.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVoiceKTVBestSinger.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveVoiceKTVBestSinger.userAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("userAvatar", str3);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveVoiceKTVBestSinger.score);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceKTVBestSinger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicektvbestsinger";

    @ProtobufIndex(index = 4)
    public long score;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveVoiceKTVBestSinger new_() {
        BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger = new BLiveVoiceKTVBestSinger();
        bLiveVoiceKTVBestSinger.nullCheck();
        return bLiveVoiceKTVBestSinger;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceKTVBestSinger mo223809clone() {
        BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger = new BLiveVoiceKTVBestSinger();
        bLiveVoiceKTVBestSinger.userId = this.userId;
        bLiveVoiceKTVBestSinger.userName = this.userName;
        bLiveVoiceKTVBestSinger.userAvatar = this.userAvatar;
        bLiveVoiceKTVBestSinger.score = this.score;
        return bLiveVoiceKTVBestSinger;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceKTVBestSinger)) {
            return false;
        }
        BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger = (BLiveVoiceKTVBestSinger) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceKTVBestSinger.userId) && ValueObject.util_equals(this.userName, bLiveVoiceKTVBestSinger.userName) && ValueObject.util_equals(this.userAvatar, bLiveVoiceKTVBestSinger.userAvatar) && this.score == bLiveVoiceKTVBestSinger.score;
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
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userAvatar;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.score;
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
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
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
