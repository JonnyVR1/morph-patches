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
public class BLiveSquareDetailCounters extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSquareDetailCounters> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSquareDetailCounters>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSquareDetailCounters.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSquareDetailCounters.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSquareDetailCounters newInstance() {
            return new BLiveSquareDetailCounters();
        }

        public boolean parseField(BLiveSquareDetailCounters bLiveSquareDetailCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("currentSeq")) {
                bLiveSquareDetailCounters.currentSeq = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("unreadCount")) {
                return false;
            }
            bLiveSquareDetailCounters.unreadCount = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSquareDetailCounters bLiveSquareDetailCounters, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", bLiveSquareDetailCounters.unreadCount);
            jsonGenerator.writeNumberField("currentSeq", bLiveSquareDetailCounters.currentSeq);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSquareDetailCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesquaredetailcounters";

    @ProtobufIndex(index = 2)
    public long currentSeq;

    @ProtobufIndex(index = 1)
    public int unreadCount;

    public static BLiveSquareDetailCounters new_() {
        BLiveSquareDetailCounters bLiveSquareDetailCounters = new BLiveSquareDetailCounters();
        bLiveSquareDetailCounters.nullCheck();
        return bLiveSquareDetailCounters;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSquareDetailCounters mo225055clone() {
        BLiveSquareDetailCounters bLiveSquareDetailCounters = new BLiveSquareDetailCounters();
        bLiveSquareDetailCounters.unreadCount = this.unreadCount;
        bLiveSquareDetailCounters.currentSeq = this.currentSeq;
        return bLiveSquareDetailCounters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSquareDetailCounters)) {
            return false;
        }
        BLiveSquareDetailCounters bLiveSquareDetailCounters = (BLiveSquareDetailCounters) obj;
        return this.unreadCount == bLiveSquareDetailCounters.unreadCount && this.currentSeq == bLiveSquareDetailCounters.currentSeq;
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
        int i2 = ((i * 41) + this.unreadCount) * 41;
        long j = this.currentSeq;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
