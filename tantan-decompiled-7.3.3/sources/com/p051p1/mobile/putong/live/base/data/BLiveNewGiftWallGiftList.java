package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
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
public class BLiveNewGiftWallGiftList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallGiftList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallGiftList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallGiftList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallGiftList newInstance() {
            return new BLiveNewGiftWallGiftList();
        }

        public boolean parseField(BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tab":
                    bLiveNewGiftWallGiftList.tab = BLiveNewGiftWallTab.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    bLiveNewGiftWallGiftList.category = BLiveNewGiftWallCategory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "gifts":
                    bLiveNewGiftWallGiftList.gifts = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallGift.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "users":
                    bLiveNewGiftWallGiftList.users = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveNewGiftWallGiftList.gifts != null) {
                jsonGenerator.writeFieldName("gifts");
                JsonAdapter.serializeArray(bLiveNewGiftWallGiftList.gifts, jsonGenerator, BLiveNewGiftWallGift.JSON_ADAPTER);
            }
            if (bLiveNewGiftWallGiftList.category != null) {
                jsonGenerator.writeFieldName("category");
                BLiveNewGiftWallCategory.JSON_ADAPTER.serialize(bLiveNewGiftWallGiftList.category, jsonGenerator, true);
            }
            if (bLiveNewGiftWallGiftList.tab != null) {
                jsonGenerator.writeFieldName("tab");
                BLiveNewGiftWallTab.JSON_ADAPTER.serialize(bLiveNewGiftWallGiftList.tab, jsonGenerator, true);
            }
            if (bLiveNewGiftWallGiftList.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bLiveNewGiftWallGiftList.users, jsonGenerator, BLiveNewGiftWallUser.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallGiftList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallgiftlist";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveNewGiftWallCategory category;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveNewGiftWallGift> gifts;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveNewGiftWallTab tab;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveNewGiftWallUser> users;

    public static BLiveNewGiftWallGiftList new_() {
        BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList = new BLiveNewGiftWallGiftList();
        bLiveNewGiftWallGiftList.nullCheck();
        return bLiveNewGiftWallGiftList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallGiftList mo225055clone() {
        BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList = new BLiveNewGiftWallGiftList();
        List<BLiveNewGiftWallGift> list = this.gifts;
        if (list != null) {
            bLiveNewGiftWallGiftList.gifts = ValueObject.util_map(list, new qcj() { // from class: l.t32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallGift) obj).mo225055clone();
                }
            });
        }
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory = this.category;
        if (bLiveNewGiftWallCategory != null) {
            bLiveNewGiftWallGiftList.category = bLiveNewGiftWallCategory.mo225055clone();
        }
        BLiveNewGiftWallTab bLiveNewGiftWallTab = this.tab;
        if (bLiveNewGiftWallTab != null) {
            bLiveNewGiftWallGiftList.tab = bLiveNewGiftWallTab.mo225055clone();
        }
        List<BLiveNewGiftWallUser> list2 = this.users;
        if (list2 != null) {
            bLiveNewGiftWallGiftList.users = ValueObject.util_map(list2, new qcj() { // from class: l.u32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallUser) obj).mo225055clone();
                }
            });
        }
        return bLiveNewGiftWallGiftList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallGiftList)) {
            return false;
        }
        BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList = (BLiveNewGiftWallGiftList) obj;
        return ValueObject.util_equals(this.gifts, bLiveNewGiftWallGiftList.gifts) && ValueObject.util_equals(this.category, bLiveNewGiftWallGiftList.category) && ValueObject.util_equals(this.tab, bLiveNewGiftWallGiftList.tab) && ValueObject.util_equals(this.users, bLiveNewGiftWallGiftList.users);
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
        List<BLiveNewGiftWallGift> list = this.gifts;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory = this.category;
        int iHashCode2 = (iHashCode + (bLiveNewGiftWallCategory != null ? bLiveNewGiftWallCategory.hashCode() : 0)) * 41;
        BLiveNewGiftWallTab bLiveNewGiftWallTab = this.tab;
        int iHashCode3 = (iHashCode2 + (bLiveNewGiftWallTab != null ? bLiveNewGiftWallTab.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallUser> list2 = this.users;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gifts == null) {
            this.gifts = new ArrayList();
        }
        if (this.category == null) {
            this.category = BLiveNewGiftWallCategory.new_();
        }
        if (this.tab == null) {
            this.tab = BLiveNewGiftWallTab.new_();
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
