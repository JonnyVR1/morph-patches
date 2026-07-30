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
public class BLiveVoiceUserFeedInfos extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserFeedInfos> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserFeedInfos>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserFeedInfos.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserFeedInfos.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserFeedInfos newInstance() {
            return new BLiveVoiceUserFeedInfos();
        }

        public boolean parseField(BLiveVoiceUserFeedInfos bLiveVoiceUserFeedInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveVoiceUserFeedInfos.userId = jsonParser.getValueAsString();
                    return true;
                case "doing":
                    bLiveVoiceUserFeedInfos.doing = jsonParser.getValueAsString();
                    return true;
                case "matchingRate":
                    bLiveVoiceUserFeedInfos.matchingRate = jsonParser.getValueAsInt();
                    return true;
                case "doingIcon":
                    bLiveVoiceUserFeedInfos.doingIcon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserFeedInfos bLiveVoiceUserFeedInfos, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceUserFeedInfos.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("matchingRate", bLiveVoiceUserFeedInfos.matchingRate);
            String str2 = bLiveVoiceUserFeedInfos.doing;
            if (str2 != null) {
                jsonGenerator.writeStringField("doing", str2);
            }
            String str3 = bLiveVoiceUserFeedInfos.doingIcon;
            if (str3 != null) {
                jsonGenerator.writeStringField("doingIcon", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserFeedInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceuserfeedinfos";

    @NonNull
    @ProtobufIndex(index = 3)
    public String doing;

    @NonNull
    @ProtobufIndex(index = 4)
    public String doingIcon;

    @ProtobufIndex(index = 2)
    public int matchingRate;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveVoiceUserFeedInfos new_() {
        BLiveVoiceUserFeedInfos bLiveVoiceUserFeedInfos = new BLiveVoiceUserFeedInfos();
        bLiveVoiceUserFeedInfos.nullCheck();
        return bLiveVoiceUserFeedInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserFeedInfos mo225055clone() {
        BLiveVoiceUserFeedInfos bLiveVoiceUserFeedInfos = new BLiveVoiceUserFeedInfos();
        bLiveVoiceUserFeedInfos.userId = this.userId;
        bLiveVoiceUserFeedInfos.matchingRate = this.matchingRate;
        bLiveVoiceUserFeedInfos.doing = this.doing;
        bLiveVoiceUserFeedInfos.doingIcon = this.doingIcon;
        return bLiveVoiceUserFeedInfos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserFeedInfos)) {
            return false;
        }
        BLiveVoiceUserFeedInfos bLiveVoiceUserFeedInfos = (BLiveVoiceUserFeedInfos) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceUserFeedInfos.userId) && this.matchingRate == bLiveVoiceUserFeedInfos.matchingRate && ValueObject.util_equals(this.doing, bLiveVoiceUserFeedInfos.doing) && ValueObject.util_equals(this.doingIcon, bLiveVoiceUserFeedInfos.doingIcon);
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.matchingRate) * 41;
        String str2 = this.doing;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.doingIcon;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.doing == null) {
            this.doing = "";
        }
        if (this.doingIcon == null) {
            this.doingIcon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
