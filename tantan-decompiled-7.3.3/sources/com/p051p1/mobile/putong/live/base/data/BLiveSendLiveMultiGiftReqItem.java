package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.RankType;
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
public class BLiveSendLiveMultiGiftReqItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendLiveMultiGiftReqItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendLiveMultiGiftReqItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftReqItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendLiveMultiGiftReqItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendLiveMultiGiftReqItem newInstance() {
            return new BLiveSendLiveMultiGiftReqItem();
        }

        public boolean parseField(BLiveSendLiveMultiGiftReqItem bLiveSendLiveMultiGiftReqItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("toUserId")) {
                bLiveSendLiveMultiGiftReqItem.toUserId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(RankType.givenGift)) {
                return false;
            }
            bLiveSendLiveMultiGiftReqItem.givenGift = BLiveSendLiveGiftReq.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendLiveMultiGiftReqItem bLiveSendLiveMultiGiftReqItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSendLiveMultiGiftReqItem.toUserId;
            if (str != null) {
                jsonGenerator.writeStringField("toUserId", str);
            }
            if (bLiveSendLiveMultiGiftReqItem.givenGift != null) {
                jsonGenerator.writeFieldName(RankType.givenGift);
                BLiveSendLiveGiftReq.JSON_ADAPTER.serialize(bLiveSendLiveMultiGiftReqItem.givenGift, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendLiveMultiGiftReqItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendlivemultigiftreqitem";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveSendLiveGiftReq givenGift;

    @NonNull
    @ProtobufIndex(index = 1)
    public String toUserId;

    public static BLiveSendLiveMultiGiftReqItem new_() {
        BLiveSendLiveMultiGiftReqItem bLiveSendLiveMultiGiftReqItem = new BLiveSendLiveMultiGiftReqItem();
        bLiveSendLiveMultiGiftReqItem.nullCheck();
        return bLiveSendLiveMultiGiftReqItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendLiveMultiGiftReqItem mo225055clone() {
        BLiveSendLiveMultiGiftReqItem bLiveSendLiveMultiGiftReqItem = new BLiveSendLiveMultiGiftReqItem();
        bLiveSendLiveMultiGiftReqItem.toUserId = this.toUserId;
        BLiveSendLiveGiftReq bLiveSendLiveGiftReq = this.givenGift;
        if (bLiveSendLiveGiftReq != null) {
            bLiveSendLiveMultiGiftReqItem.givenGift = bLiveSendLiveGiftReq.mo225055clone();
        }
        return bLiveSendLiveMultiGiftReqItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendLiveMultiGiftReqItem)) {
            return false;
        }
        BLiveSendLiveMultiGiftReqItem bLiveSendLiveMultiGiftReqItem = (BLiveSendLiveMultiGiftReqItem) obj;
        return ValueObject.util_equals(this.toUserId, bLiveSendLiveMultiGiftReqItem.toUserId) && ValueObject.util_equals(this.givenGift, bLiveSendLiveMultiGiftReqItem.givenGift);
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
        String str = this.toUserId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveSendLiveGiftReq bLiveSendLiveGiftReq = this.givenGift;
        int iHashCode2 = iHashCode + (bLiveSendLiveGiftReq != null ? bLiveSendLiveGiftReq.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.toUserId == null) {
            this.toUserId = "";
        }
        if (this.givenGift == null) {
            this.givenGift = BLiveSendLiveGiftReq.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
