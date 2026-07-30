package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardItem;
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
public class BLivePKCardShowListWithBoth extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePKCardShowListWithBoth> JSON_ADAPTER = new ObjectJsonAdapter<BLivePKCardShowListWithBoth>() { // from class: com.p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePKCardShowListWithBoth.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePKCardShowListWithBoth newInstance() {
            return new BLivePKCardShowListWithBoth();
        }

        public boolean parseField(BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("BLiveOtherUserItemCardsList")) {
                bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList = JsonAdapter.parseArray(jsonParser, BLivePKCardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("BLiveUserItemCards")) {
                return false;
            }
            bLivePKCardShowListWithBoth.BLiveUserItemCards = JsonAdapter.parseArray(jsonParser, BLivePKCardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePKCardShowListWithBoth.BLiveUserItemCards != null) {
                jsonGenerator.writeFieldName("BLiveUserItemCards");
                JsonAdapter.serializeArray(bLivePKCardShowListWithBoth.BLiveUserItemCards, jsonGenerator, BLivePKCardItem.JSON_ADAPTER);
            }
            if (bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList != null) {
                jsonGenerator.writeFieldName("BLiveOtherUserItemCardsList");
                JsonAdapter.serializeArray(bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList, jsonGenerator, BLivePKCardItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePKCardShowListWithBoth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkcardshowlistwithboth";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLivePKCardItem> BLiveOtherUserItemCardsList;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLivePKCardItem> BLiveUserItemCards;

    public static BLivePKCardShowListWithBoth new_() {
        BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth = new BLivePKCardShowListWithBoth();
        bLivePKCardShowListWithBoth.nullCheck();
        return bLivePKCardShowListWithBoth;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePKCardShowListWithBoth mo225055clone() {
        BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth = new BLivePKCardShowListWithBoth();
        List<BLivePKCardItem> list = this.BLiveUserItemCards;
        if (list != null) {
            bLivePKCardShowListWithBoth.BLiveUserItemCards = ValueObject.util_map(list, new qcj() { // from class: l.e42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePKCardItem) obj).mo225055clone();
                }
            });
        }
        List<BLivePKCardItem> list2 = this.BLiveOtherUserItemCardsList;
        if (list2 != null) {
            bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList = ValueObject.util_map(list2, new qcj() { // from class: l.f42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePKCardItem) obj).mo225055clone();
                }
            });
        }
        return bLivePKCardShowListWithBoth;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePKCardShowListWithBoth)) {
            return false;
        }
        BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth = (BLivePKCardShowListWithBoth) obj;
        return ValueObject.util_equals(this.BLiveUserItemCards, bLivePKCardShowListWithBoth.BLiveUserItemCards) && ValueObject.util_equals(this.BLiveOtherUserItemCardsList, bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList);
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
        List<BLivePKCardItem> list = this.BLiveUserItemCards;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLivePKCardItem> list2 = this.BLiveOtherUserItemCardsList;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.BLiveUserItemCards == null) {
            this.BLiveUserItemCards = new ArrayList();
        }
        if (this.BLiveOtherUserItemCardsList == null) {
            this.BLiveOtherUserItemCardsList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
