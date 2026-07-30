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
public class BLiveIntlGiftLeaderboardConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlGiftLeaderboardConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlGiftLeaderboardConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboardConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlGiftLeaderboardConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlGiftLeaderboardConfig newInstance() {
            return new BLiveIntlGiftLeaderboardConfig();
        }

        public boolean parseField(BLiveIntlGiftLeaderboardConfig bLiveIntlGiftLeaderboardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("pollingIntervalInSeconds")) {
                bLiveIntlGiftLeaderboardConfig.pollingIntervalInSeconds = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("scrollIntervalInSeconds")) {
                return false;
            }
            bLiveIntlGiftLeaderboardConfig.scrollIntervalInSeconds = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlGiftLeaderboardConfig bLiveIntlGiftLeaderboardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("pollingIntervalInSeconds", bLiveIntlGiftLeaderboardConfig.pollingIntervalInSeconds);
            jsonGenerator.writeNumberField("scrollIntervalInSeconds", bLiveIntlGiftLeaderboardConfig.scrollIntervalInSeconds);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlGiftLeaderboardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlgiftleaderboardconfig";

    @ProtobufIndex(index = 1)
    public long pollingIntervalInSeconds;

    @ProtobufIndex(index = 2)
    public long scrollIntervalInSeconds;

    public static BLiveIntlGiftLeaderboardConfig new_() {
        BLiveIntlGiftLeaderboardConfig bLiveIntlGiftLeaderboardConfig = new BLiveIntlGiftLeaderboardConfig();
        bLiveIntlGiftLeaderboardConfig.nullCheck();
        return bLiveIntlGiftLeaderboardConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlGiftLeaderboardConfig mo223809clone() {
        BLiveIntlGiftLeaderboardConfig bLiveIntlGiftLeaderboardConfig = new BLiveIntlGiftLeaderboardConfig();
        bLiveIntlGiftLeaderboardConfig.pollingIntervalInSeconds = this.pollingIntervalInSeconds;
        bLiveIntlGiftLeaderboardConfig.scrollIntervalInSeconds = this.scrollIntervalInSeconds;
        return bLiveIntlGiftLeaderboardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlGiftLeaderboardConfig)) {
            return false;
        }
        BLiveIntlGiftLeaderboardConfig bLiveIntlGiftLeaderboardConfig = (BLiveIntlGiftLeaderboardConfig) obj;
        return this.pollingIntervalInSeconds == bLiveIntlGiftLeaderboardConfig.pollingIntervalInSeconds && this.scrollIntervalInSeconds == bLiveIntlGiftLeaderboardConfig.scrollIntervalInSeconds;
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
        long j = this.pollingIntervalInSeconds;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.scrollIntervalInSeconds;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
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
