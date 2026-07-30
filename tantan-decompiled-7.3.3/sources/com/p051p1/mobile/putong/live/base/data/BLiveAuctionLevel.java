package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveAuctionLevel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionLevel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionLevel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionLevel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionLevel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionLevel newInstance() {
            return new BLiveAuctionLevel();
        }

        public boolean parseField(BLiveAuctionLevel bLiveAuctionLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "minWorth":
                    bLiveAuctionLevel.minWorth = jsonParser.getValueAsInt();
                    return true;
                case "panelBg":
                    bLiveAuctionLevel.panelBg = jsonParser.getValueAsString();
                    return true;
                case "level":
                    bLiveAuctionLevel.level = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionLevel bLiveAuctionLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveAuctionLevel.level);
            jsonGenerator.writeNumberField("minWorth", bLiveAuctionLevel.minWorth);
            String str = bLiveAuctionLevel.panelBg;
            if (str != null) {
                jsonGenerator.writeStringField("panelBg", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionlevel";

    @ProtobufIndex(index = 1)
    public int level;

    @ProtobufIndex(index = 2)
    public int minWorth;

    @NonNull
    @ProtobufIndex(index = 3)
    public String panelBg;

    public static BLiveAuctionLevel new_() {
        BLiveAuctionLevel bLiveAuctionLevel = new BLiveAuctionLevel();
        bLiveAuctionLevel.nullCheck();
        return bLiveAuctionLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionLevel mo225055clone() {
        BLiveAuctionLevel bLiveAuctionLevel = new BLiveAuctionLevel();
        bLiveAuctionLevel.level = this.level;
        bLiveAuctionLevel.minWorth = this.minWorth;
        bLiveAuctionLevel.panelBg = this.panelBg;
        return bLiveAuctionLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionLevel)) {
            return false;
        }
        BLiveAuctionLevel bLiveAuctionLevel = (BLiveAuctionLevel) obj;
        return this.level == bLiveAuctionLevel.level && this.minWorth == bLiveAuctionLevel.minWorth && ValueObject.util_equals(this.panelBg, bLiveAuctionLevel.panelBg);
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
        int i2 = ((((i * 41) + this.level) * 41) + this.minWorth) * 41;
        String str = this.panelBg;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.panelBg == null) {
            this.panelBg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
