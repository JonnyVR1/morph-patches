package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItemShort;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftTabEntrance;
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
public class BLiveTabGiftItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTabGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTabGiftItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTabGiftItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTabGiftItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTabGiftItem newInstance() {
            return new BLiveTabGiftItem();
        }

        public boolean parseField(BLiveTabGiftItem bLiveTabGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tabName":
                    bLiveTabGiftItem.tabName = jsonParser.getValueAsString();
                    return true;
                case "entrances":
                    bLiveTabGiftItem.entrances = JsonAdapter.parseArray(jsonParser, BLiveGiftTabEntrance.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tabGiftItems":
                    bLiveTabGiftItem.tabGiftItems = JsonAdapter.parseArray(jsonParser, BLiveGiftItemShort.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tabId":
                    bLiveTabGiftItem.tabId = jsonParser.getValueAsInt();
                    return true;
                case "tabEntrance":
                    bLiveTabGiftItem.tabEntrance = BLiveTabEntrance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTabGiftItem bLiveTabGiftItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTabGiftItem.tabName;
            if (str != null) {
                jsonGenerator.writeStringField("tabName", str);
            }
            if (bLiveTabGiftItem.tabGiftItems != null) {
                jsonGenerator.writeFieldName("tabGiftItems");
                JsonAdapter.serializeArray(bLiveTabGiftItem.tabGiftItems, jsonGenerator, BLiveGiftItemShort.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("tabId", bLiveTabGiftItem.tabId);
            if (bLiveTabGiftItem.entrances != null) {
                jsonGenerator.writeFieldName("entrances");
                JsonAdapter.serializeArray(bLiveTabGiftItem.entrances, jsonGenerator, BLiveGiftTabEntrance.JSON_ADAPTER);
            }
            if (bLiveTabGiftItem.tabEntrance != null) {
                jsonGenerator.writeFieldName("tabEntrance");
                BLiveTabEntrance.JSON_ADAPTER.serialize(bLiveTabGiftItem.tabEntrance, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTabGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetabgiftitem";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveGiftTabEntrance> entrances;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveTabEntrance tabEntrance;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveGiftItemShort> tabGiftItems;

    @ProtobufIndex(index = 3)
    public int tabId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String tabName;

    public static BLiveTabGiftItem new_() {
        BLiveTabGiftItem bLiveTabGiftItem = new BLiveTabGiftItem();
        bLiveTabGiftItem.nullCheck();
        return bLiveTabGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTabGiftItem mo225055clone() {
        BLiveTabGiftItem bLiveTabGiftItem = new BLiveTabGiftItem();
        bLiveTabGiftItem.tabName = this.tabName;
        List<BLiveGiftItemShort> list = this.tabGiftItems;
        if (list != null) {
            bLiveTabGiftItem.tabGiftItems = ValueObject.util_map(list, new qcj() { // from class: l.w62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftItemShort) obj).mo225055clone();
                }
            });
        }
        bLiveTabGiftItem.tabId = this.tabId;
        List<BLiveGiftTabEntrance> list2 = this.entrances;
        if (list2 != null) {
            bLiveTabGiftItem.entrances = ValueObject.util_map(list2, new qcj() { // from class: l.x62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftTabEntrance) obj).mo225055clone();
                }
            });
        }
        BLiveTabEntrance bLiveTabEntrance = this.tabEntrance;
        if (bLiveTabEntrance != null) {
            bLiveTabGiftItem.tabEntrance = bLiveTabEntrance.mo225055clone();
        }
        return bLiveTabGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTabGiftItem)) {
            return false;
        }
        BLiveTabGiftItem bLiveTabGiftItem = (BLiveTabGiftItem) obj;
        return ValueObject.util_equals(this.tabName, bLiveTabGiftItem.tabName) && ValueObject.util_equals(this.tabGiftItems, bLiveTabGiftItem.tabGiftItems) && this.tabId == bLiveTabGiftItem.tabId && ValueObject.util_equals(this.entrances, bLiveTabGiftItem.entrances) && ValueObject.util_equals(this.tabEntrance, bLiveTabGiftItem.tabEntrance);
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
        String str = this.tabName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveGiftItemShort> list = this.tabGiftItems;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.tabId) * 41;
        List<BLiveGiftTabEntrance> list2 = this.entrances;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveTabEntrance bLiveTabEntrance = this.tabEntrance;
        int iHashCode4 = iHashCode3 + (bLiveTabEntrance != null ? bLiveTabEntrance.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tabName == null) {
            this.tabName = "";
        }
        if (this.tabGiftItems == null) {
            this.tabGiftItems = new ArrayList();
        }
        if (this.entrances == null) {
            this.entrances = new ArrayList();
        }
        if (this.tabEntrance == null) {
            this.tabEntrance = BLiveTabEntrance.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
