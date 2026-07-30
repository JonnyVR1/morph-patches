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
public class BLiveVoicePopTotal extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoicePopTotal> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicePopTotal>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicePopTotal.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicePopTotal.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicePopTotal newInstance() {
            return new BLiveVoicePopTotal();
        }

        public boolean parseField(BLiveVoicePopTotal bLiveVoicePopTotal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("popsTotal")) {
                return false;
            }
            bLiveVoicePopTotal.popsTotal = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicePopTotal bLiveVoicePopTotal, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("popsTotal", bLiveVoicePopTotal.popsTotal);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicePopTotal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicepoptotal";

    @ProtobufIndex(index = 1)
    public long popsTotal;

    public static BLiveVoicePopTotal new_() {
        BLiveVoicePopTotal bLiveVoicePopTotal = new BLiveVoicePopTotal();
        bLiveVoicePopTotal.nullCheck();
        return bLiveVoicePopTotal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicePopTotal mo225055clone() {
        BLiveVoicePopTotal bLiveVoicePopTotal = new BLiveVoicePopTotal();
        bLiveVoicePopTotal.popsTotal = this.popsTotal;
        return bLiveVoicePopTotal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveVoicePopTotal) && this.popsTotal == ((BLiveVoicePopTotal) obj).popsTotal;
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
        long j = this.popsTotal;
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
