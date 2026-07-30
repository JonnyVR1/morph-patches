package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveBreakingLeaderboardConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBreakingLeaderboardConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBreakingLeaderboardConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBreakingLeaderboardConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBreakingLeaderboardConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBreakingLeaderboardConfig newInstance() {
            return new BLiveBreakingLeaderboardConfig();
        }

        public boolean parseField(BLiveBreakingLeaderboardConfig bLiveBreakingLeaderboardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BLiveOperationTitleShowType.duration)) {
                bLiveBreakingLeaderboardConfig.duration = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("isOpen")) {
                return false;
            }
            bLiveBreakingLeaderboardConfig.isOpen = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBreakingLeaderboardConfig bLiveBreakingLeaderboardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", bLiveBreakingLeaderboardConfig.isOpen);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveBreakingLeaderboardConfig.duration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBreakingLeaderboardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebreakingleaderboardconfig";

    @ProtobufIndex(index = 2)
    public long duration;

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    public static BLiveBreakingLeaderboardConfig new_() {
        BLiveBreakingLeaderboardConfig bLiveBreakingLeaderboardConfig = new BLiveBreakingLeaderboardConfig();
        bLiveBreakingLeaderboardConfig.nullCheck();
        return bLiveBreakingLeaderboardConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBreakingLeaderboardConfig mo223809clone() {
        BLiveBreakingLeaderboardConfig bLiveBreakingLeaderboardConfig = new BLiveBreakingLeaderboardConfig();
        bLiveBreakingLeaderboardConfig.isOpen = this.isOpen;
        bLiveBreakingLeaderboardConfig.duration = this.duration;
        return bLiveBreakingLeaderboardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBreakingLeaderboardConfig)) {
            return false;
        }
        BLiveBreakingLeaderboardConfig bLiveBreakingLeaderboardConfig = (BLiveBreakingLeaderboardConfig) obj;
        return this.isOpen == bLiveBreakingLeaderboardConfig.isOpen && this.duration == bLiveBreakingLeaderboardConfig.duration;
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
        int i2 = ((i * 41) + (this.isOpen ? 1231 : 1237)) * 41;
        long j = this.duration;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
