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
public class BLiveNewGiftWallGiftDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallGiftDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallGiftDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallGiftDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallGiftDetail newInstance() {
            return new BLiveNewGiftWallGiftDetail();
        }

        public boolean parseField(BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gift":
                    bLiveNewGiftWallGiftDetail.gift = BLiveNewGiftWallGift.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "user":
                    bLiveNewGiftWallGiftDetail.user = BLiveNewGiftWallUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    bLiveNewGiftWallGiftDetail.category = BLiveNewGiftWallCategory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveNewGiftWallGiftDetail.gift != null) {
                jsonGenerator.writeFieldName("gift");
                BLiveNewGiftWallGift.JSON_ADAPTER.serialize(bLiveNewGiftWallGiftDetail.gift, jsonGenerator, true);
            }
            if (bLiveNewGiftWallGiftDetail.user != null) {
                jsonGenerator.writeFieldName("user");
                BLiveNewGiftWallUser.JSON_ADAPTER.serialize(bLiveNewGiftWallGiftDetail.user, jsonGenerator, true);
            }
            if (bLiveNewGiftWallGiftDetail.category != null) {
                jsonGenerator.writeFieldName("category");
                BLiveNewGiftWallCategory.JSON_ADAPTER.serialize(bLiveNewGiftWallGiftDetail.category, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallGiftDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallgiftdetail";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveNewGiftWallCategory category;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveNewGiftWallGift gift;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveNewGiftWallUser user;

    public static BLiveNewGiftWallGiftDetail new_() {
        BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail = new BLiveNewGiftWallGiftDetail();
        bLiveNewGiftWallGiftDetail.nullCheck();
        return bLiveNewGiftWallGiftDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallGiftDetail mo225055clone() {
        BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail = new BLiveNewGiftWallGiftDetail();
        BLiveNewGiftWallGift bLiveNewGiftWallGift = this.gift;
        if (bLiveNewGiftWallGift != null) {
            bLiveNewGiftWallGiftDetail.gift = bLiveNewGiftWallGift.mo225055clone();
        }
        BLiveNewGiftWallUser bLiveNewGiftWallUser = this.user;
        if (bLiveNewGiftWallUser != null) {
            bLiveNewGiftWallGiftDetail.user = bLiveNewGiftWallUser.mo225055clone();
        }
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory = this.category;
        if (bLiveNewGiftWallCategory != null) {
            bLiveNewGiftWallGiftDetail.category = bLiveNewGiftWallCategory.mo225055clone();
        }
        return bLiveNewGiftWallGiftDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallGiftDetail)) {
            return false;
        }
        BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail = (BLiveNewGiftWallGiftDetail) obj;
        return ValueObject.util_equals(this.gift, bLiveNewGiftWallGiftDetail.gift) && ValueObject.util_equals(this.user, bLiveNewGiftWallGiftDetail.user) && ValueObject.util_equals(this.category, bLiveNewGiftWallGiftDetail.category);
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
        BLiveNewGiftWallGift bLiveNewGiftWallGift = this.gift;
        int iHashCode = (i2 + (bLiveNewGiftWallGift != null ? bLiveNewGiftWallGift.hashCode() : 0)) * 41;
        BLiveNewGiftWallUser bLiveNewGiftWallUser = this.user;
        int iHashCode2 = (iHashCode + (bLiveNewGiftWallUser != null ? bLiveNewGiftWallUser.hashCode() : 0)) * 41;
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory = this.category;
        int iHashCode3 = iHashCode2 + (bLiveNewGiftWallCategory != null ? bLiveNewGiftWallCategory.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gift == null) {
            this.gift = BLiveNewGiftWallGift.new_();
        }
        if (this.user == null) {
            this.user = BLiveNewGiftWallUser.new_();
        }
        if (this.category == null) {
            this.category = BLiveNewGiftWallCategory.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
