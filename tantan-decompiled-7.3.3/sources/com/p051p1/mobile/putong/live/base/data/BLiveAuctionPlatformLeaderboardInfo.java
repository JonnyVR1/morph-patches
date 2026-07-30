package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAuctionPlatformLeaderboardInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionPlatformLeaderboardInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionPlatformLeaderboardInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionPlatformLeaderboardInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionPlatformLeaderboardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionPlatformLeaderboardInfo newInstance() {
            return new BLiveAuctionPlatformLeaderboardInfo();
        }

        public boolean parseField(BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("leaderboards")) {
                bLiveAuctionPlatformLeaderboardInfo.leaderboards = JsonAdapter.parseArray(jsonParser, BLiveAuctionLeaderboardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("myLeaderboard")) {
                return false;
            }
            bLiveAuctionPlatformLeaderboardInfo.myLeaderboard = BLiveAuctionLeaderboardItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveAuctionPlatformLeaderboardInfo.leaderboards != null) {
                jsonGenerator.writeFieldName("leaderboards");
                JsonAdapter.serializeArray(bLiveAuctionPlatformLeaderboardInfo.leaderboards, jsonGenerator, BLiveAuctionLeaderboardItem.JSON_ADAPTER);
            }
            if (bLiveAuctionPlatformLeaderboardInfo.myLeaderboard != null) {
                jsonGenerator.writeFieldName("myLeaderboard");
                BLiveAuctionLeaderboardItem.JSON_ADAPTER.serialize(bLiveAuctionPlatformLeaderboardInfo.myLeaderboard, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionPlatformLeaderboardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionplatformleaderboardinfo";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<BLiveAuctionLeaderboardItem> leaderboards;

    @Nullable
    @ProtobufIndex(index = 2)
    public BLiveAuctionLeaderboardItem myLeaderboard;

    public static BLiveAuctionPlatformLeaderboardInfo new_() {
        BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo = new BLiveAuctionPlatformLeaderboardInfo();
        bLiveAuctionPlatformLeaderboardInfo.nullCheck();
        return bLiveAuctionPlatformLeaderboardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionPlatformLeaderboardInfo mo225055clone() {
        BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo = new BLiveAuctionPlatformLeaderboardInfo();
        List<BLiveAuctionLeaderboardItem> list = this.leaderboards;
        if (list != null) {
            bLiveAuctionPlatformLeaderboardInfo.leaderboards = ValueObject.util_map(list, new qcj() { // from class: l.qr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAuctionLeaderboardItem) obj).mo225055clone();
                }
            });
        }
        BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem = this.myLeaderboard;
        if (bLiveAuctionLeaderboardItem != null) {
            bLiveAuctionPlatformLeaderboardInfo.myLeaderboard = bLiveAuctionLeaderboardItem.mo225055clone();
        }
        return bLiveAuctionPlatformLeaderboardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionPlatformLeaderboardInfo)) {
            return false;
        }
        BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo = (BLiveAuctionPlatformLeaderboardInfo) obj;
        return ValueObject.util_equals(this.leaderboards, bLiveAuctionPlatformLeaderboardInfo.leaderboards) && ValueObject.util_equals(this.myLeaderboard, bLiveAuctionPlatformLeaderboardInfo.myLeaderboard);
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
        List<BLiveAuctionLeaderboardItem> list = this.leaderboards;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem = this.myLeaderboard;
        int iHashCode2 = iHashCode + (bLiveAuctionLeaderboardItem != null ? bLiveAuctionLeaderboardItem.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
