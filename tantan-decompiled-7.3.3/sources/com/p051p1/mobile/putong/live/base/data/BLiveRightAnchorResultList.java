package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorResultItem;
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
public class BLiveRightAnchorResultList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRightAnchorResultList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRightAnchorResultList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRightAnchorResultList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRightAnchorResultList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRightAnchorResultList newInstance() {
            return new BLiveRightAnchorResultList();
        }

        public boolean parseField(BLiveRightAnchorResultList bLiveRightAnchorResultList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userRightActions")) {
                return false;
            }
            bLiveRightAnchorResultList.userRightActions = JsonAdapter.parseArray(jsonParser, BLiveRightAnchorResultItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRightAnchorResultList bLiveRightAnchorResultList, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveRightAnchorResultList.userRightActions != null) {
                jsonGenerator.writeFieldName("userRightActions");
                JsonAdapter.serializeArray(bLiveRightAnchorResultList.userRightActions, jsonGenerator, BLiveRightAnchorResultItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRightAnchorResultList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverightanchorresultlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveRightAnchorResultItem> userRightActions;

    public static BLiveRightAnchorResultList new_() {
        BLiveRightAnchorResultList bLiveRightAnchorResultList = new BLiveRightAnchorResultList();
        bLiveRightAnchorResultList.nullCheck();
        return bLiveRightAnchorResultList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRightAnchorResultList mo225055clone() {
        BLiveRightAnchorResultList bLiveRightAnchorResultList = new BLiveRightAnchorResultList();
        List<BLiveRightAnchorResultItem> list = this.userRightActions;
        if (list != null) {
            bLiveRightAnchorResultList.userRightActions = ValueObject.util_map(list, new qcj() { // from class: l.f52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveRightAnchorResultItem) obj).mo225055clone();
                }
            });
        }
        return bLiveRightAnchorResultList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveRightAnchorResultList) {
            return ValueObject.util_equals(this.userRightActions, ((BLiveRightAnchorResultList) obj).userRightActions);
        }
        return false;
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
        List<BLiveRightAnchorResultItem> list = this.userRightActions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userRightActions == null) {
            this.userRightActions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
