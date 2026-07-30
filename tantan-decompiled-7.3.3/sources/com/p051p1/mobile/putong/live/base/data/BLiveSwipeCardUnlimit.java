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
public class BLiveSwipeCardUnlimit extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSwipeCardUnlimit> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSwipeCardUnlimit>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSwipeCardUnlimit.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSwipeCardUnlimit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSwipeCardUnlimit newInstance() {
            return new BLiveSwipeCardUnlimit();
        }

        public boolean parseField(BLiveSwipeCardUnlimit bLiveSwipeCardUnlimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("minGrade")) {
                return false;
            }
            bLiveSwipeCardUnlimit.minGrade = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSwipeCardUnlimit bLiveSwipeCardUnlimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("minGrade", bLiveSwipeCardUnlimit.minGrade);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSwipeCardUnlimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveswipecardunlimit";

    @ProtobufIndex(index = 1)
    public int minGrade;

    public static BLiveSwipeCardUnlimit new_() {
        BLiveSwipeCardUnlimit bLiveSwipeCardUnlimit = new BLiveSwipeCardUnlimit();
        bLiveSwipeCardUnlimit.nullCheck();
        return bLiveSwipeCardUnlimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSwipeCardUnlimit mo225055clone() {
        BLiveSwipeCardUnlimit bLiveSwipeCardUnlimit = new BLiveSwipeCardUnlimit();
        bLiveSwipeCardUnlimit.minGrade = this.minGrade;
        return bLiveSwipeCardUnlimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveSwipeCardUnlimit) && this.minGrade == ((BLiveSwipeCardUnlimit) obj).minGrade;
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
        int i2 = (i * 41) + this.minGrade;
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
