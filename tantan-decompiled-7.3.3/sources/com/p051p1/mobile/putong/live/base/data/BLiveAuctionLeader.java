package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.OMSResourceType;
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
public class BLiveAuctionLeader extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionLeader> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionLeader>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionLeader.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionLeader.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionLeader newInstance() {
            return new BLiveAuctionLeader();
        }

        public boolean parseField(BLiveAuctionLeader bLiveAuctionLeader, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveAuctionLeader.amount = jsonParser.getValueAsLong();
                    return true;
                case "background":
                    bLiveAuctionLeader.background = jsonParser.getValueAsString();
                    return true;
                case "amountBackgroundId":
                    bLiveAuctionLeader.amountBackgroundId = jsonParser.getValueAsInt();
                    return true;
                case "userInfo":
                    bLiveAuctionLeader.userInfo = BLiveAuctionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "rank":
                    bLiveAuctionLeader.rank = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionLeader bLiveAuctionLeader, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveAuctionLeader.rank);
            jsonGenerator.writeNumberField("amount", bLiveAuctionLeader.amount);
            String str = bLiveAuctionLeader.background;
            if (str != null) {
                jsonGenerator.writeStringField(OMSResourceType.background, str);
            }
            jsonGenerator.writeNumberField("amountBackgroundId", bLiveAuctionLeader.amountBackgroundId);
            if (bLiveAuctionLeader.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                BLiveAuctionUserInfo.JSON_ADAPTER.serialize(bLiveAuctionLeader.userInfo, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionLeader) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionleader";

    @ProtobufIndex(index = 2)
    public long amount;

    @ProtobufIndex(index = 4)
    public int amountBackgroundId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String background;

    @ProtobufIndex(index = 1)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveAuctionUserInfo userInfo;

    public static BLiveAuctionLeader new_() {
        BLiveAuctionLeader bLiveAuctionLeader = new BLiveAuctionLeader();
        bLiveAuctionLeader.nullCheck();
        return bLiveAuctionLeader;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionLeader mo225055clone() {
        BLiveAuctionLeader bLiveAuctionLeader = new BLiveAuctionLeader();
        bLiveAuctionLeader.rank = this.rank;
        bLiveAuctionLeader.amount = this.amount;
        bLiveAuctionLeader.background = this.background;
        bLiveAuctionLeader.amountBackgroundId = this.amountBackgroundId;
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.userInfo;
        if (bLiveAuctionUserInfo != null) {
            bLiveAuctionLeader.userInfo = bLiveAuctionUserInfo.mo225055clone();
        }
        return bLiveAuctionLeader;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionLeader)) {
            return false;
        }
        BLiveAuctionLeader bLiveAuctionLeader = (BLiveAuctionLeader) obj;
        return this.rank == bLiveAuctionLeader.rank && this.amount == bLiveAuctionLeader.amount && ValueObject.util_equals(this.background, bLiveAuctionLeader.background) && this.amountBackgroundId == bLiveAuctionLeader.amountBackgroundId && ValueObject.util_equals(this.userInfo, bLiveAuctionLeader.userInfo);
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
        int i2 = ((i * 41) + this.rank) * 41;
        long j = this.amount;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.background;
        int iHashCode = (((i3 + (str != null ? str.hashCode() : 0)) * 41) + this.amountBackgroundId) * 41;
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.userInfo;
        int iHashCode2 = iHashCode + (bLiveAuctionUserInfo != null ? bLiveAuctionUserInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.background == null) {
            this.background = "";
        }
        if (this.userInfo == null) {
            this.userInfo = BLiveAuctionUserInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
