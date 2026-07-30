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
public class BLiveScrapItemStock extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrapItemStock> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrapItemStock>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrapItemStock.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrapItemStock.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrapItemStock newInstance() {
            return new BLiveScrapItemStock();
        }

        public boolean parseField(BLiveScrapItemStock bLiveScrapItemStock, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("count")) {
                bLiveScrapItemStock.count = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bLiveScrapItemStock.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrapItemStock bLiveScrapItemStock, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", bLiveScrapItemStock.count);
            String str = bLiveScrapItemStock.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrapItemStock) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescrapitemstock";

    @ProtobufIndex(index = 1)
    public long count;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveScrapItemStock new_() {
        BLiveScrapItemStock bLiveScrapItemStock = new BLiveScrapItemStock();
        bLiveScrapItemStock.nullCheck();
        return bLiveScrapItemStock;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrapItemStock mo225055clone() {
        BLiveScrapItemStock bLiveScrapItemStock = new BLiveScrapItemStock();
        bLiveScrapItemStock.count = this.count;
        bLiveScrapItemStock.title = this.title;
        return bLiveScrapItemStock;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrapItemStock)) {
            return false;
        }
        BLiveScrapItemStock bLiveScrapItemStock = (BLiveScrapItemStock) obj;
        return this.count == bLiveScrapItemStock.count && ValueObject.util_equals(this.title, bLiveScrapItemStock.title);
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
        long j = this.count;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.title;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
