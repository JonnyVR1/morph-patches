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
public class BLiveLeaderBoardConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLeaderBoardConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLeaderBoardConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLeaderBoardConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLeaderBoardConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLeaderBoardConfig newInstance() {
            return new BLiveLeaderBoardConfig();
        }

        public boolean parseField(BLiveLeaderBoardConfig bLiveLeaderBoardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("weekRuleUrl")) {
                bLiveLeaderBoardConfig.weekRuleUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("dayRuleUrl")) {
                return false;
            }
            bLiveLeaderBoardConfig.dayRuleUrl = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLeaderBoardConfig bLiveLeaderBoardConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLeaderBoardConfig.dayRuleUrl;
            if (str != null) {
                jsonGenerator.writeStringField("dayRuleUrl", str);
            }
            String str2 = bLiveLeaderBoardConfig.weekRuleUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("weekRuleUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLeaderBoardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveleaderboardconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String dayRuleUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String weekRuleUrl;

    public static BLiveLeaderBoardConfig new_() {
        BLiveLeaderBoardConfig bLiveLeaderBoardConfig = new BLiveLeaderBoardConfig();
        bLiveLeaderBoardConfig.nullCheck();
        return bLiveLeaderBoardConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLeaderBoardConfig mo225055clone() {
        BLiveLeaderBoardConfig bLiveLeaderBoardConfig = new BLiveLeaderBoardConfig();
        bLiveLeaderBoardConfig.dayRuleUrl = this.dayRuleUrl;
        bLiveLeaderBoardConfig.weekRuleUrl = this.weekRuleUrl;
        return bLiveLeaderBoardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLeaderBoardConfig)) {
            return false;
        }
        BLiveLeaderBoardConfig bLiveLeaderBoardConfig = (BLiveLeaderBoardConfig) obj;
        return ValueObject.util_equals(this.dayRuleUrl, bLiveLeaderBoardConfig.dayRuleUrl) && ValueObject.util_equals(this.weekRuleUrl, bLiveLeaderBoardConfig.weekRuleUrl);
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
        String str = this.dayRuleUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.weekRuleUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.dayRuleUrl == null) {
            this.dayRuleUrl = "";
        }
        if (this.weekRuleUrl == null) {
            this.weekRuleUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
