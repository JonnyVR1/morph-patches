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
public class BLiveUserCompliance extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserCompliance> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserCompliance>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserCompliance.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserCompliance.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserCompliance newInstance() {
            return new BLiveUserCompliance();
        }

        public boolean parseField(BLiveUserCompliance bLiveUserCompliance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isPass")) {
                return false;
            }
            bLiveUserCompliance.isPass = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserCompliance bLiveUserCompliance, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isPass", bLiveUserCompliance.isPass);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserCompliance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveusercompliance";

    @ProtobufIndex(index = 1)
    public boolean isPass;

    public static BLiveUserCompliance new_() {
        BLiveUserCompliance bLiveUserCompliance = new BLiveUserCompliance();
        bLiveUserCompliance.nullCheck();
        return bLiveUserCompliance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserCompliance mo225055clone() {
        BLiveUserCompliance bLiveUserCompliance = new BLiveUserCompliance();
        bLiveUserCompliance.isPass = this.isPass;
        return bLiveUserCompliance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveUserCompliance) && this.isPass == ((BLiveUserCompliance) obj).isPass;
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
        int i2 = (i * 41) + (this.isPass ? 1231 : 1237);
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
