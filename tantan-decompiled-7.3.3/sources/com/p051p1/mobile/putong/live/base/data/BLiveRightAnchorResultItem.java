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
public class BLiveRightAnchorResultItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRightAnchorResultItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRightAnchorResultItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRightAnchorResultItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRightAnchorResultItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRightAnchorResultItem newInstance() {
            return new BLiveRightAnchorResultItem();
        }

        public boolean parseField(BLiveRightAnchorResultItem bLiveRightAnchorResultItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("action")) {
                bLiveRightAnchorResultItem.action = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("userRightId")) {
                return false;
            }
            bLiveRightAnchorResultItem.userRightId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRightAnchorResultItem bLiveRightAnchorResultItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRightAnchorResultItem.userRightId;
            if (str != null) {
                jsonGenerator.writeStringField("userRightId", str);
            }
            String str2 = bLiveRightAnchorResultItem.action;
            if (str2 != null) {
                jsonGenerator.writeStringField("action", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRightAnchorResultItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverightanchorresultitem";

    @NonNull
    @ProtobufIndex(index = 2)
    public String action;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userRightId;

    public static BLiveRightAnchorResultItem new_() {
        BLiveRightAnchorResultItem bLiveRightAnchorResultItem = new BLiveRightAnchorResultItem();
        bLiveRightAnchorResultItem.nullCheck();
        return bLiveRightAnchorResultItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRightAnchorResultItem mo225055clone() {
        BLiveRightAnchorResultItem bLiveRightAnchorResultItem = new BLiveRightAnchorResultItem();
        bLiveRightAnchorResultItem.userRightId = this.userRightId;
        bLiveRightAnchorResultItem.action = this.action;
        return bLiveRightAnchorResultItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRightAnchorResultItem)) {
            return false;
        }
        BLiveRightAnchorResultItem bLiveRightAnchorResultItem = (BLiveRightAnchorResultItem) obj;
        return ValueObject.util_equals(this.userRightId, bLiveRightAnchorResultItem.userRightId) && ValueObject.util_equals(this.action, bLiveRightAnchorResultItem.action);
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
        String str = this.userRightId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.action;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userRightId == null) {
            this.userRightId = "";
        }
        if (this.action == null) {
            this.action = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
