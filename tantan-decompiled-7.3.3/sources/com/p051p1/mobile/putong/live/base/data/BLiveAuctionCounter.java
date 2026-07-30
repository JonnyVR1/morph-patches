package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveAuctionCounter extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionCounter> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionCounter>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionCounter.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionCounter newInstance() {
            return new BLiveAuctionCounter();
        }

        public boolean parseField(BLiveAuctionCounter bLiveAuctionCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("applyUnreadCount")) {
                return false;
            }
            bLiveAuctionCounter.applyUnreadCount = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionCounter bLiveAuctionCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("applyUnreadCount", bLiveAuctionCounter.applyUnreadCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctioncounter";

    @ProtobufIndex(index = 1)
    public int applyUnreadCount;

    public static BLiveAuctionCounter new_() {
        BLiveAuctionCounter bLiveAuctionCounter = new BLiveAuctionCounter();
        bLiveAuctionCounter.nullCheck();
        return bLiveAuctionCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionCounter mo225055clone() {
        BLiveAuctionCounter bLiveAuctionCounter = new BLiveAuctionCounter();
        bLiveAuctionCounter.applyUnreadCount = this.applyUnreadCount;
        return bLiveAuctionCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveAuctionCounter) && this.applyUnreadCount == ((BLiveAuctionCounter) obj).applyUnreadCount;
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
        int i2 = (i * 41) + this.applyUnreadCount;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
