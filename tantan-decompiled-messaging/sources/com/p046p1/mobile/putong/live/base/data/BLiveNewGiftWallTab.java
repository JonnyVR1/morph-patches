package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallSubTab;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveNewGiftWallTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallTab> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallTab>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallTab.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallTab newInstance() {
            return new BLiveNewGiftWallTab();
        }

        public boolean parseField(BLiveNewGiftWallTab bLiveNewGiftWallTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTabs":
                    bLiveNewGiftWallTab.subTabs = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallSubTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "progress":
                    bLiveNewGiftWallTab.progress = BLiveNewGiftWallProgress.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveNewGiftWallTab.f44415id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveNewGiftWallTab.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveNewGiftWallTab.type = jsonParser.getValueAsString();
                    return true;
                case "giftIds":
                    bLiveNewGiftWallTab.giftIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "categoryId":
                    bLiveNewGiftWallTab.categoryId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallTab bLiveNewGiftWallTab, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallTab.f44415id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveNewGiftWallTab.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveNewGiftWallTab.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bLiveNewGiftWallTab.categoryId;
            if (str4 != null) {
                jsonGenerator.writeStringField("categoryId", str4);
            }
            if (bLiveNewGiftWallTab.progress != null) {
                jsonGenerator.writeFieldName("progress");
                BLiveNewGiftWallProgress.JSON_ADAPTER.serialize(bLiveNewGiftWallTab.progress, jsonGenerator, true);
            }
            if (bLiveNewGiftWallTab.giftIds != null) {
                jsonGenerator.writeFieldName("giftIds");
                JsonAdapter.serializeArray(bLiveNewGiftWallTab.giftIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveNewGiftWallTab.subTabs != null) {
                jsonGenerator.writeFieldName("subTabs");
                JsonAdapter.serializeArray(bLiveNewGiftWallTab.subTabs, jsonGenerator, BLiveNewGiftWallSubTab.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwalltab";

    @NonNull
    @ProtobufIndex(index = 4)
    public String categoryId;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> giftIds;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44415id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveNewGiftWallProgress progress;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveNewGiftWallSubTab> subTabs;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m68093b(String str) {
        return str;
    }

    public static BLiveNewGiftWallTab new_() {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = new BLiveNewGiftWallTab();
        bLiveNewGiftWallTab.nullCheck();
        return bLiveNewGiftWallTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallTab mo223809clone() {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = new BLiveNewGiftWallTab();
        bLiveNewGiftWallTab.f44415id = this.f44415id;
        bLiveNewGiftWallTab.type = this.type;
        bLiveNewGiftWallTab.name = this.name;
        bLiveNewGiftWallTab.categoryId = this.categoryId;
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = this.progress;
        if (bLiveNewGiftWallProgress != null) {
            bLiveNewGiftWallTab.progress = bLiveNewGiftWallProgress.mo223809clone();
        }
        List<String> list = this.giftIds;
        if (list != null) {
            bLiveNewGiftWallTab.giftIds = ValueObject.util_map(list, new w9j() { // from class: l.r32
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveNewGiftWallTab.m68093b((String) obj);
                }
            });
        }
        List<BLiveNewGiftWallSubTab> list2 = this.subTabs;
        if (list2 != null) {
            bLiveNewGiftWallTab.subTabs = ValueObject.util_map(list2, new w9j() { // from class: l.s32
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallSubTab) obj).mo223809clone();
                }
            });
        }
        return bLiveNewGiftWallTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallTab)) {
            return false;
        }
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) obj;
        return ValueObject.util_equals(this.f44415id, bLiveNewGiftWallTab.f44415id) && ValueObject.util_equals(this.type, bLiveNewGiftWallTab.type) && ValueObject.util_equals(this.name, bLiveNewGiftWallTab.name) && ValueObject.util_equals(this.categoryId, bLiveNewGiftWallTab.categoryId) && ValueObject.util_equals(this.progress, bLiveNewGiftWallTab.progress) && ValueObject.util_equals(this.giftIds, bLiveNewGiftWallTab.giftIds) && ValueObject.util_equals(this.subTabs, bLiveNewGiftWallTab.subTabs);
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
        String str = this.f44415id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.categoryId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = this.progress;
        int iHashCode5 = (iHashCode4 + (bLiveNewGiftWallProgress != null ? bLiveNewGiftWallProgress.hashCode() : 0)) * 41;
        List<String> list = this.giftIds;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallSubTab> list2 = this.subTabs;
        int iHashCode7 = iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44415id == null) {
            this.f44415id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.categoryId == null) {
            this.categoryId = "";
        }
        if (this.progress == null) {
            this.progress = BLiveNewGiftWallProgress.new_();
        }
        if (this.giftIds == null) {
            this.giftIds = new ArrayList();
        }
        if (this.subTabs == null) {
            this.subTabs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
