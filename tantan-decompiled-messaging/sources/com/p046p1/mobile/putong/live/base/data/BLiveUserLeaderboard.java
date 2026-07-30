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
public class BLiveUserLeaderboard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserLeaderboard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserLeaderboard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserLeaderboard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserLeaderboard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserLeaderboard newInstance() {
            return new BLiveUserLeaderboard();
        }

        public boolean parseField(BLiveUserLeaderboard bLiveUserLeaderboard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "loveLeaderboard":
                    bLiveUserLeaderboard.loveLeaderboard = BLiveLoveLeaderboard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ruleUrl":
                    bLiveUserLeaderboard.ruleUrl = jsonParser.getValueAsString();
                    return true;
                case "currentLeaderboard":
                    bLiveUserLeaderboard.currentLeaderboard = BLiveLeaderBoards.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserLeaderboard bLiveUserLeaderboard, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserLeaderboard.ruleUrl;
            if (str != null) {
                jsonGenerator.writeStringField("ruleUrl", str);
            }
            if (bLiveUserLeaderboard.loveLeaderboard != null) {
                jsonGenerator.writeFieldName("loveLeaderboard");
                BLiveLoveLeaderboard.JSON_ADAPTER.serialize(bLiveUserLeaderboard.loveLeaderboard, jsonGenerator, true);
            }
            if (bLiveUserLeaderboard.currentLeaderboard != null) {
                jsonGenerator.writeFieldName("currentLeaderboard");
                BLiveLeaderBoards.JSON_ADAPTER.serialize(bLiveUserLeaderboard.currentLeaderboard, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserLeaderboard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserleaderboard";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveLeaderBoards currentLeaderboard;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveLoveLeaderboard loveLeaderboard;

    @NonNull
    @ProtobufIndex(index = 3)
    public String ruleUrl;

    public static BLiveUserLeaderboard new_() {
        BLiveUserLeaderboard bLiveUserLeaderboard = new BLiveUserLeaderboard();
        bLiveUserLeaderboard.nullCheck();
        return bLiveUserLeaderboard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserLeaderboard mo223809clone() {
        BLiveUserLeaderboard bLiveUserLeaderboard = new BLiveUserLeaderboard();
        bLiveUserLeaderboard.ruleUrl = this.ruleUrl;
        BLiveLoveLeaderboard bLiveLoveLeaderboard = this.loveLeaderboard;
        if (bLiveLoveLeaderboard != null) {
            bLiveUserLeaderboard.loveLeaderboard = bLiveLoveLeaderboard.mo223809clone();
        }
        BLiveLeaderBoards bLiveLeaderBoards = this.currentLeaderboard;
        if (bLiveLeaderBoards != null) {
            bLiveUserLeaderboard.currentLeaderboard = bLiveLeaderBoards.mo223809clone();
        }
        return bLiveUserLeaderboard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserLeaderboard)) {
            return false;
        }
        BLiveUserLeaderboard bLiveUserLeaderboard = (BLiveUserLeaderboard) obj;
        return ValueObject.util_equals(this.ruleUrl, bLiveUserLeaderboard.ruleUrl) && ValueObject.util_equals(this.loveLeaderboard, bLiveUserLeaderboard.loveLeaderboard) && ValueObject.util_equals(this.currentLeaderboard, bLiveUserLeaderboard.currentLeaderboard);
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
        String str = this.ruleUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveLoveLeaderboard bLiveLoveLeaderboard = this.loveLeaderboard;
        int iHashCode2 = (iHashCode + (bLiveLoveLeaderboard != null ? bLiveLoveLeaderboard.hashCode() : 0)) * 41;
        BLiveLeaderBoards bLiveLeaderBoards = this.currentLeaderboard;
        int iHashCode3 = iHashCode2 + (bLiveLeaderBoards != null ? bLiveLeaderBoards.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ruleUrl == null) {
            this.ruleUrl = "";
        }
        if (this.loveLeaderboard == null) {
            this.loveLeaderboard = BLiveLoveLeaderboard.new_();
        }
        if (this.currentLeaderboard == null) {
            this.currentLeaderboard = BLiveLeaderBoards.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
