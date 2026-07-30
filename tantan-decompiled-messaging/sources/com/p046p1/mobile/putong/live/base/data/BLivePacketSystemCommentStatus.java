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
public class BLivePacketSystemCommentStatus extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePacketSystemCommentStatus> JSON_ADAPTER = new ObjectJsonAdapter<BLivePacketSystemCommentStatus>() { // from class: com.p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePacketSystemCommentStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePacketSystemCommentStatus newInstance() {
            return new BLivePacketSystemCommentStatus();
        }

        public boolean parseField(BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ticker":
                    bLivePacketSystemCommentStatus.ticker = BLivePacketStatusTicker.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "process":
                    bLivePacketSystemCommentStatus.process = BLivePacketStatusProgress.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "show":
                    bLivePacketSystemCommentStatus.show = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", bLivePacketSystemCommentStatus.show);
            if (bLivePacketSystemCommentStatus.ticker != null) {
                jsonGenerator.writeFieldName("ticker");
                BLivePacketStatusTicker.JSON_ADAPTER.serialize(bLivePacketSystemCommentStatus.ticker, jsonGenerator, true);
            }
            if (bLivePacketSystemCommentStatus.process != null) {
                jsonGenerator.writeFieldName("process");
                BLivePacketStatusProgress.JSON_ADAPTER.serialize(bLivePacketSystemCommentStatus.process, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePacketSystemCommentStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepacketsystemcommentstatus";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLivePacketStatusProgress process;

    @ProtobufIndex(index = 1)
    public boolean show;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLivePacketStatusTicker ticker;

    public static BLivePacketSystemCommentStatus new_() {
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = new BLivePacketSystemCommentStatus();
        bLivePacketSystemCommentStatus.nullCheck();
        return bLivePacketSystemCommentStatus;
    }

    public boolean canCountdown() {
        return this.show && this.ticker.start;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePacketSystemCommentStatus mo223809clone() {
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = new BLivePacketSystemCommentStatus();
        bLivePacketSystemCommentStatus.show = this.show;
        BLivePacketStatusTicker bLivePacketStatusTicker = this.ticker;
        if (bLivePacketStatusTicker != null) {
            bLivePacketSystemCommentStatus.ticker = bLivePacketStatusTicker.mo223809clone();
        }
        BLivePacketStatusProgress bLivePacketStatusProgress = this.process;
        if (bLivePacketStatusProgress != null) {
            bLivePacketSystemCommentStatus.process = bLivePacketStatusProgress.mo223809clone();
        }
        return bLivePacketSystemCommentStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePacketSystemCommentStatus)) {
            return false;
        }
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = (BLivePacketSystemCommentStatus) obj;
        return this.show == bLivePacketSystemCommentStatus.show && ValueObject.util_equals(this.ticker, bLivePacketSystemCommentStatus.ticker) && ValueObject.util_equals(this.process, bLivePacketSystemCommentStatus.process);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public float getCountdownProgress(int i) {
        int i2 = this.ticker.totalDurationMs;
        if (i > i2) {
            return 1.0f;
        }
        if (i2 == 0) {
            return 0.0f;
        }
        return i / i2;
    }

    public String getCountdownText() {
        BLivePacketStatusTicker bLivePacketStatusTicker = this.ticker;
        if (bLivePacketStatusTicker.start) {
            return (this.ticker.durationMs / 1000) + BLiveStormDanmakuGiftResourceType.f44446s;
        }
        if (bLivePacketStatusTicker.durationMs > bLivePacketStatusTicker.totalDurationMs) {
            return "0s";
        }
        return (this.ticker.durationMs / 1000) + BLiveStormDanmakuGiftResourceType.f44446s;
    }

    public float getCurrentCountdownProgress() {
        BLivePacketStatusTicker bLivePacketStatusTicker = this.ticker;
        int i = bLivePacketStatusTicker.durationMs;
        int i2 = bLivePacketStatusTicker.totalDurationMs;
        if (i > i2) {
            return 1.0f;
        }
        if (i2 == 0) {
            return 0.0f;
        }
        return i / i2;
    }

    public float getCurrentScoreProgress() {
        BLivePacketStatusProgress bLivePacketStatusProgress = this.process;
        int i = bLivePacketStatusProgress.goal;
        if (i == 0) {
            return 0.0f;
        }
        return bLivePacketStatusProgress.current / i;
    }

    public String getCurrentScoreString() {
        return this.process.current + "/" + this.process.goal;
    }

    public String getResetCountdownText() {
        return (this.ticker.totalDurationMs / 1000) + BLiveStormDanmakuGiftResourceType.f44446s;
    }

    public String getResetScoreString() {
        return "0/" + this.process.goal;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.show ? 1231 : 1237)) * 41;
        BLivePacketStatusTicker bLivePacketStatusTicker = this.ticker;
        int iHashCode = (i2 + (bLivePacketStatusTicker != null ? bLivePacketStatusTicker.hashCode() : 0)) * 41;
        BLivePacketStatusProgress bLivePacketStatusProgress = this.process;
        int iHashCode2 = iHashCode + (bLivePacketStatusProgress != null ? bLivePacketStatusProgress.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isReachRewards() {
        BLivePacketStatusProgress bLivePacketStatusProgress = this.process;
        return bLivePacketStatusProgress.current >= bLivePacketStatusProgress.goal;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ticker == null) {
            this.ticker = BLivePacketStatusTicker.new_();
        }
        if (this.process == null) {
            this.process = BLivePacketStatusProgress.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
