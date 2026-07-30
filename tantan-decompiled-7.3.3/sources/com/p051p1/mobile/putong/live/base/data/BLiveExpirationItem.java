package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.immomo.momomediaext.sei.BaseSei;
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
public class BLiveExpirationItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveExpirationItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveExpirationItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveExpirationItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveExpirationItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveExpirationItem newInstance() {
            return new BLiveExpirationItem();
        }

        public boolean parseField(BLiveExpirationItem bLiveExpirationItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("num")) {
                bLiveExpirationItem.num = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(BaseSei.INFO)) {
                return false;
            }
            bLiveExpirationItem.info = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveExpirationItem bLiveExpirationItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveExpirationItem.info;
            if (str != null) {
                jsonGenerator.writeStringField(BaseSei.INFO, str);
            }
            jsonGenerator.writeNumberField("num", bLiveExpirationItem.num);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveExpirationItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveexpirationitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String info;

    @ProtobufIndex(index = 2)
    public int num;

    public static BLiveExpirationItem new_() {
        BLiveExpirationItem bLiveExpirationItem = new BLiveExpirationItem();
        bLiveExpirationItem.nullCheck();
        return bLiveExpirationItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveExpirationItem mo225055clone() {
        BLiveExpirationItem bLiveExpirationItem = new BLiveExpirationItem();
        bLiveExpirationItem.info = this.info;
        bLiveExpirationItem.num = this.num;
        return bLiveExpirationItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveExpirationItem)) {
            return false;
        }
        BLiveExpirationItem bLiveExpirationItem = (BLiveExpirationItem) obj;
        return ValueObject.util_equals(this.info, bLiveExpirationItem.info) && this.num == bLiveExpirationItem.num;
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
        String str = this.info;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.num;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.info == null) {
            this.info = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
