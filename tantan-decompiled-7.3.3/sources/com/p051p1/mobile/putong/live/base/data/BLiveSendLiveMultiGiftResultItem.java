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
public class BLiveSendLiveMultiGiftResultItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendLiveMultiGiftResultItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendLiveMultiGiftResultItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendLiveMultiGiftResultItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendLiveMultiGiftResultItem newInstance() {
            return new BLiveSendLiveMultiGiftResultItem();
        }

        public boolean parseField(BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("toUserId")) {
                bLiveSendLiveMultiGiftResultItem.toUserId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("givenGiftRes")) {
                return false;
            }
            bLiveSendLiveMultiGiftResultItem.givenGiftRes = BLiveSendLiveGiftResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSendLiveMultiGiftResultItem.toUserId;
            if (str != null) {
                jsonGenerator.writeStringField("toUserId", str);
            }
            if (bLiveSendLiveMultiGiftResultItem.givenGiftRes != null) {
                jsonGenerator.writeFieldName("givenGiftRes");
                BLiveSendLiveGiftResult.JSON_ADAPTER.serialize(bLiveSendLiveMultiGiftResultItem.givenGiftRes, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendLiveMultiGiftResultItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendlivemultigiftresultitem";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveSendLiveGiftResult givenGiftRes;

    @NonNull
    @ProtobufIndex(index = 1)
    public String toUserId;

    public static BLiveSendLiveMultiGiftResultItem new_() {
        BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem = new BLiveSendLiveMultiGiftResultItem();
        bLiveSendLiveMultiGiftResultItem.nullCheck();
        return bLiveSendLiveMultiGiftResultItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendLiveMultiGiftResultItem mo225055clone() {
        BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem = new BLiveSendLiveMultiGiftResultItem();
        bLiveSendLiveMultiGiftResultItem.toUserId = this.toUserId;
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = this.givenGiftRes;
        if (bLiveSendLiveGiftResult != null) {
            bLiveSendLiveMultiGiftResultItem.givenGiftRes = bLiveSendLiveGiftResult.mo225055clone();
        }
        return bLiveSendLiveMultiGiftResultItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendLiveMultiGiftResultItem)) {
            return false;
        }
        BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem = (BLiveSendLiveMultiGiftResultItem) obj;
        return ValueObject.util_equals(this.toUserId, bLiveSendLiveMultiGiftResultItem.toUserId) && ValueObject.util_equals(this.givenGiftRes, bLiveSendLiveMultiGiftResultItem.givenGiftRes);
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
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = this.givenGiftRes;
        int iHashCode2 = iHashCode + (bLiveSendLiveGiftResult != null ? bLiveSendLiveGiftResult.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.toUserId == null) {
            this.toUserId = "";
        }
        if (this.givenGiftRes == null) {
            this.givenGiftRes = BLiveSendLiveGiftResult.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
