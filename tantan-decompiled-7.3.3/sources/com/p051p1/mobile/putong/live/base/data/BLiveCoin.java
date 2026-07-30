package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveCoin extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCoin> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCoin>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCoin.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCoin.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCoin newInstance() {
            return new BLiveCoin();
        }

        public boolean parseField(BLiveCoin bLiveCoin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("available")) {
                return false;
            }
            bLiveCoin.available = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCoin bLiveCoin, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("available", bLiveCoin.available);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCoin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecoin";

    @ProtobufIndex(index = 1)
    public long available;

    public static BLiveCoin new_() {
        BLiveCoin bLiveCoin = new BLiveCoin();
        bLiveCoin.nullCheck();
        return bLiveCoin;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCoin mo225055clone() {
        BLiveCoin bLiveCoin = new BLiveCoin();
        bLiveCoin.available = this.available;
        return bLiveCoin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveCoin) && this.available == ((BLiveCoin) obj).available;
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
        long j = this.available;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
