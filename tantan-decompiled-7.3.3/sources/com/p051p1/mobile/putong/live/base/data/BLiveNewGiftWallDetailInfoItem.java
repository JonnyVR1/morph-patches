package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
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
public class BLiveNewGiftWallDetailInfoItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallDetailInfoItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallDetailInfoItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallDetailInfoItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallDetailInfoItem newInstance() {
            return new BLiveNewGiftWallDetailInfoItem();
        }

        public boolean parseField(BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgSvgaUrl":
                    bLiveNewGiftWallDetailInfoItem.bgSvgaUrl = jsonParser.getValueAsString();
                    return true;
                case "tabs":
                    bLiveNewGiftWallDetailInfoItem.tabs = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "progresses":
                    bLiveNewGiftWallDetailInfoItem.progresses = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallProgress.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bgUrl":
                    bLiveNewGiftWallDetailInfoItem.bgUrl = jsonParser.getValueAsString();
                    return true;
                case "gifts":
                    bLiveNewGiftWallDetailInfoItem.gifts = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallGift.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveNewGiftWallDetailInfoItem.title = jsonParser.getValueAsString();
                    return true;
                case "users":
                    bLiveNewGiftWallDetailInfoItem.users = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "categories":
                    bLiveNewGiftWallDetailInfoItem.categories = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallCategory.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "hierarchy":
                    bLiveNewGiftWallDetailInfoItem.hierarchy = BLiveNewGiftWallHierarchy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallDetailInfoItem.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveNewGiftWallDetailInfoItem.bgUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("bgUrl", str2);
            }
            if (bLiveNewGiftWallDetailInfoItem.hierarchy != null) {
                jsonGenerator.writeFieldName("hierarchy");
                BLiveNewGiftWallHierarchy.JSON_ADAPTER.serialize(bLiveNewGiftWallDetailInfoItem.hierarchy, jsonGenerator, true);
            }
            if (bLiveNewGiftWallDetailInfoItem.progresses != null) {
                jsonGenerator.writeFieldName("progresses");
                JsonAdapter.serializeArray(bLiveNewGiftWallDetailInfoItem.progresses, jsonGenerator, BLiveNewGiftWallProgress.JSON_ADAPTER);
            }
            if (bLiveNewGiftWallDetailInfoItem.tabs != null) {
                jsonGenerator.writeFieldName("tabs");
                JsonAdapter.serializeArray(bLiveNewGiftWallDetailInfoItem.tabs, jsonGenerator, BLiveNewGiftWallTab.JSON_ADAPTER);
            }
            if (bLiveNewGiftWallDetailInfoItem.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bLiveNewGiftWallDetailInfoItem.users, jsonGenerator, BLiveNewGiftWallUser.JSON_ADAPTER);
            }
            if (bLiveNewGiftWallDetailInfoItem.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(bLiveNewGiftWallDetailInfoItem.categories, jsonGenerator, BLiveNewGiftWallCategory.JSON_ADAPTER);
            }
            if (bLiveNewGiftWallDetailInfoItem.gifts != null) {
                jsonGenerator.writeFieldName("gifts");
                JsonAdapter.serializeArray(bLiveNewGiftWallDetailInfoItem.gifts, jsonGenerator, BLiveNewGiftWallGift.JSON_ADAPTER);
            }
            String str3 = bLiveNewGiftWallDetailInfoItem.bgSvgaUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgSvgaUrl", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallDetailInfoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwalldetailinfoitem";

    @NonNull
    @ProtobufIndex(index = 9)
    public String bgSvgaUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String bgUrl;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveNewGiftWallCategory> categories;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveNewGiftWallGift> gifts;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveNewGiftWallHierarchy hierarchy;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveNewGiftWallProgress> progresses;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveNewGiftWallTab> tabs;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveNewGiftWallUser> users;

    public static BLiveNewGiftWallDetailInfoItem new_() {
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = new BLiveNewGiftWallDetailInfoItem();
        bLiveNewGiftWallDetailInfoItem.nullCheck();
        return bLiveNewGiftWallDetailInfoItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallDetailInfoItem mo225055clone() {
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = new BLiveNewGiftWallDetailInfoItem();
        bLiveNewGiftWallDetailInfoItem.title = this.title;
        bLiveNewGiftWallDetailInfoItem.bgUrl = this.bgUrl;
        BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy = this.hierarchy;
        if (bLiveNewGiftWallHierarchy != null) {
            bLiveNewGiftWallDetailInfoItem.hierarchy = bLiveNewGiftWallHierarchy.mo225055clone();
        }
        List<BLiveNewGiftWallProgress> list = this.progresses;
        if (list != null) {
            bLiveNewGiftWallDetailInfoItem.progresses = ValueObject.util_map(list, new qcj() { // from class: l.m32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallProgress) obj).mo225055clone();
                }
            });
        }
        List<BLiveNewGiftWallTab> list2 = this.tabs;
        if (list2 != null) {
            bLiveNewGiftWallDetailInfoItem.tabs = ValueObject.util_map(list2, new qcj() { // from class: l.n32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallTab) obj).mo225055clone();
                }
            });
        }
        List<BLiveNewGiftWallUser> list3 = this.users;
        if (list3 != null) {
            bLiveNewGiftWallDetailInfoItem.users = ValueObject.util_map(list3, new qcj() { // from class: l.o32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallUser) obj).mo225055clone();
                }
            });
        }
        List<BLiveNewGiftWallCategory> list4 = this.categories;
        if (list4 != null) {
            bLiveNewGiftWallDetailInfoItem.categories = ValueObject.util_map(list4, new qcj() { // from class: l.p32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallCategory) obj).mo225055clone();
                }
            });
        }
        List<BLiveNewGiftWallGift> list5 = this.gifts;
        if (list5 != null) {
            bLiveNewGiftWallDetailInfoItem.gifts = ValueObject.util_map(list5, new qcj() { // from class: l.q32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallGift) obj).mo225055clone();
                }
            });
        }
        bLiveNewGiftWallDetailInfoItem.bgSvgaUrl = this.bgSvgaUrl;
        return bLiveNewGiftWallDetailInfoItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallDetailInfoItem)) {
            return false;
        }
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = (BLiveNewGiftWallDetailInfoItem) obj;
        return ValueObject.util_equals(this.title, bLiveNewGiftWallDetailInfoItem.title) && ValueObject.util_equals(this.bgUrl, bLiveNewGiftWallDetailInfoItem.bgUrl) && ValueObject.util_equals(this.hierarchy, bLiveNewGiftWallDetailInfoItem.hierarchy) && ValueObject.util_equals(this.progresses, bLiveNewGiftWallDetailInfoItem.progresses) && ValueObject.util_equals(this.tabs, bLiveNewGiftWallDetailInfoItem.tabs) && ValueObject.util_equals(this.users, bLiveNewGiftWallDetailInfoItem.users) && ValueObject.util_equals(this.categories, bLiveNewGiftWallDetailInfoItem.categories) && ValueObject.util_equals(this.gifts, bLiveNewGiftWallDetailInfoItem.gifts) && ValueObject.util_equals(this.bgSvgaUrl, bLiveNewGiftWallDetailInfoItem.bgSvgaUrl);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bgUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy = this.hierarchy;
        int iHashCode3 = (iHashCode2 + (bLiveNewGiftWallHierarchy != null ? bLiveNewGiftWallHierarchy.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallProgress> list = this.progresses;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallTab> list2 = this.tabs;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallUser> list3 = this.users;
        int iHashCode6 = (iHashCode5 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallCategory> list4 = this.categories;
        int iHashCode7 = (iHashCode6 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallGift> list5 = this.gifts;
        int iHashCode8 = (iHashCode7 + (list5 != null ? list5.hashCode() : 0)) * 41;
        String str3 = this.bgSvgaUrl;
        int iHashCode9 = iHashCode8 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.bgUrl == null) {
            this.bgUrl = "";
        }
        if (this.hierarchy == null) {
            this.hierarchy = BLiveNewGiftWallHierarchy.new_();
        }
        if (this.progresses == null) {
            this.progresses = new ArrayList();
        }
        if (this.tabs == null) {
            this.tabs = new ArrayList();
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
        if (this.gifts == null) {
            this.gifts = new ArrayList();
        }
        if (this.bgSvgaUrl == null) {
            this.bgSvgaUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
