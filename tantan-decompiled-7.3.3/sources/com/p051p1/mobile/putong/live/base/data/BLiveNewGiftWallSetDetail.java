package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
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
public class BLiveNewGiftWallSetDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallSetDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallSetDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallSetDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallSetDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallSetDetail newInstance() {
            return new BLiveNewGiftWallSetDetail();
        }

        public boolean parseField(BLiveNewGiftWallSetDetail bLiveNewGiftWallSetDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subTab")) {
                bLiveNewGiftWallSetDetail.subTab = BLiveNewGiftWallSubTab.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("gifts")) {
                return false;
            }
            bLiveNewGiftWallSetDetail.gifts = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallGiftDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallSetDetail bLiveNewGiftWallSetDetail, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveNewGiftWallSetDetail.subTab != null) {
                jsonGenerator.writeFieldName("subTab");
                BLiveNewGiftWallSubTab.JSON_ADAPTER.serialize(bLiveNewGiftWallSetDetail.subTab, jsonGenerator, true);
            }
            if (bLiveNewGiftWallSetDetail.gifts != null) {
                jsonGenerator.writeFieldName("gifts");
                JsonAdapter.serializeArray(bLiveNewGiftWallSetDetail.gifts, jsonGenerator, BLiveNewGiftWallGiftDetail.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallSetDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallsetdetail";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveNewGiftWallGiftDetail> gifts;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveNewGiftWallSubTab subTab;

    public static BLiveNewGiftWallSetDetail new_() {
        BLiveNewGiftWallSetDetail bLiveNewGiftWallSetDetail = new BLiveNewGiftWallSetDetail();
        bLiveNewGiftWallSetDetail.nullCheck();
        return bLiveNewGiftWallSetDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallSetDetail mo225055clone() {
        BLiveNewGiftWallSetDetail bLiveNewGiftWallSetDetail = new BLiveNewGiftWallSetDetail();
        BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab = this.subTab;
        if (bLiveNewGiftWallSubTab != null) {
            bLiveNewGiftWallSetDetail.subTab = bLiveNewGiftWallSubTab.mo225055clone();
        }
        List<BLiveNewGiftWallGiftDetail> list = this.gifts;
        if (list != null) {
            bLiveNewGiftWallSetDetail.gifts = ValueObject.util_map(list, new qcj() { // from class: l.w32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallGiftDetail) obj).mo225055clone();
                }
            });
        }
        return bLiveNewGiftWallSetDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallSetDetail)) {
            return false;
        }
        BLiveNewGiftWallSetDetail bLiveNewGiftWallSetDetail = (BLiveNewGiftWallSetDetail) obj;
        return ValueObject.util_equals(this.subTab, bLiveNewGiftWallSetDetail.subTab) && ValueObject.util_equals(this.gifts, bLiveNewGiftWallSetDetail.gifts);
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
        BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab = this.subTab;
        int iHashCode = (i2 + (bLiveNewGiftWallSubTab != null ? bLiveNewGiftWallSubTab.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallGiftDetail> list = this.gifts;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.subTab == null) {
            this.subTab = BLiveNewGiftWallSubTab.new_();
        }
        if (this.gifts == null) {
            this.gifts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
