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
public class BLiveDiscover extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDiscover> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDiscover>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDiscover.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDiscover.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDiscover newInstance() {
            return new BLiveDiscover();
        }

        public boolean parseField(BLiveDiscover bLiveDiscover, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("recordOperateHistoryOn")) {
                bLiveDiscover.recordOperateHistoryOn = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("counterRefreshInterval")) {
                return false;
            }
            bLiveDiscover.counterRefreshInterval = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDiscover bLiveDiscover, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("recordOperateHistoryOn", bLiveDiscover.recordOperateHistoryOn);
            jsonGenerator.writeNumberField("counterRefreshInterval", bLiveDiscover.counterRefreshInterval);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDiscover) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivediscover";

    @ProtobufIndex(index = 2)
    public int counterRefreshInterval;

    @ProtobufIndex(index = 1)
    public boolean recordOperateHistoryOn;

    public static BLiveDiscover new_() {
        BLiveDiscover bLiveDiscover = new BLiveDiscover();
        bLiveDiscover.nullCheck();
        return bLiveDiscover;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDiscover mo225055clone() {
        BLiveDiscover bLiveDiscover = new BLiveDiscover();
        bLiveDiscover.recordOperateHistoryOn = this.recordOperateHistoryOn;
        bLiveDiscover.counterRefreshInterval = this.counterRefreshInterval;
        return bLiveDiscover;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDiscover)) {
            return false;
        }
        BLiveDiscover bLiveDiscover = (BLiveDiscover) obj;
        return this.recordOperateHistoryOn == bLiveDiscover.recordOperateHistoryOn && this.counterRefreshInterval == bLiveDiscover.counterRefreshInterval;
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
        int i2 = (((i * 41) + (this.recordOperateHistoryOn ? 1231 : 1237)) * 41) + this.counterRefreshInterval;
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
