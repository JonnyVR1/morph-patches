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
public class BLiveTaskRule extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTaskRule> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTaskRule>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTaskRule.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTaskRule.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTaskRule newInstance() {
            return new BLiveTaskRule();
        }

        public boolean parseField(BLiveTaskRule bLiveTaskRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BLiveOperationTitleShowType.duration)) {
                bLiveTaskRule.duration = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            bLiveTaskRule.count = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTaskRule bLiveTaskRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveTaskRule.duration);
            jsonGenerator.writeNumberField("count", bLiveTaskRule.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTaskRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetaskrule";

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 1)
    public long duration;

    public static BLiveTaskRule new_() {
        BLiveTaskRule bLiveTaskRule = new BLiveTaskRule();
        bLiveTaskRule.nullCheck();
        return bLiveTaskRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTaskRule mo225055clone() {
        BLiveTaskRule bLiveTaskRule = new BLiveTaskRule();
        bLiveTaskRule.duration = this.duration;
        bLiveTaskRule.count = this.count;
        return bLiveTaskRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTaskRule)) {
            return false;
        }
        BLiveTaskRule bLiveTaskRule = (BLiveTaskRule) obj;
        return this.duration == bLiveTaskRule.duration && this.count == bLiveTaskRule.count;
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
        long j = this.duration;
        int i2 = (((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.count;
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
