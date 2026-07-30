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
public class BLiveFollowGuide extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFollowGuide> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFollowGuide>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFollowGuide.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFollowGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFollowGuide newInstance() {
            return new BLiveFollowGuide();
        }

        public boolean parseField(BLiveFollowGuide bLiveFollowGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "alsoFollow":
                    bLiveFollowGuide.alsoFollow = BLiveFollowGuideConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatMsgWatchTime":
                    bLiveFollowGuide.chatMsgWatchTime = jsonParser.getValueAsInt();
                    return true;
                case "showNoticeTimes":
                    bLiveFollowGuide.showNoticeTimes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFollowGuide bLiveFollowGuide, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveFollowGuide.alsoFollow != null) {
                jsonGenerator.writeFieldName("alsoFollow");
                BLiveFollowGuideConfig.JSON_ADAPTER.serialize(bLiveFollowGuide.alsoFollow, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("showNoticeTimes", bLiveFollowGuide.showNoticeTimes);
            jsonGenerator.writeNumberField("chatMsgWatchTime", bLiveFollowGuide.chatMsgWatchTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFollowGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefollowguide";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveFollowGuideConfig alsoFollow;

    @ProtobufIndex(index = 3)
    public int chatMsgWatchTime;

    @ProtobufIndex(index = 2)
    public int showNoticeTimes;

    public static BLiveFollowGuide new_() {
        BLiveFollowGuide bLiveFollowGuide = new BLiveFollowGuide();
        bLiveFollowGuide.nullCheck();
        return bLiveFollowGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFollowGuide mo223809clone() {
        BLiveFollowGuide bLiveFollowGuide = new BLiveFollowGuide();
        BLiveFollowGuideConfig bLiveFollowGuideConfig = this.alsoFollow;
        if (bLiveFollowGuideConfig != null) {
            bLiveFollowGuide.alsoFollow = bLiveFollowGuideConfig.mo223809clone();
        }
        bLiveFollowGuide.showNoticeTimes = this.showNoticeTimes;
        bLiveFollowGuide.chatMsgWatchTime = this.chatMsgWatchTime;
        return bLiveFollowGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFollowGuide)) {
            return false;
        }
        BLiveFollowGuide bLiveFollowGuide = (BLiveFollowGuide) obj;
        return ValueObject.util_equals(this.alsoFollow, bLiveFollowGuide.alsoFollow) && this.showNoticeTimes == bLiveFollowGuide.showNoticeTimes && this.chatMsgWatchTime == bLiveFollowGuide.chatMsgWatchTime;
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
        BLiveFollowGuideConfig bLiveFollowGuideConfig = this.alsoFollow;
        int iHashCode = ((((i2 + (bLiveFollowGuideConfig != null ? bLiveFollowGuideConfig.hashCode() : 0)) * 41) + this.showNoticeTimes) * 41) + this.chatMsgWatchTime;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.alsoFollow == null) {
            this.alsoFollow = BLiveFollowGuideConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
