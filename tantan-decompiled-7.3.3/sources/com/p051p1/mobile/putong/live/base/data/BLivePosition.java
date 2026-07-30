package com.p051p1.mobile.putong.live.base.data;

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
public class BLivePosition extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePosition> JSON_ADAPTER = new ObjectJsonAdapter<BLivePosition>() { // from class: com.p1.mobile.putong.live.base.data.BLivePosition.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePosition.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePosition newInstance() {
            return new BLivePosition();
        }

        public boolean parseField(BLivePosition bLivePosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BaseSei.f14624X)) {
                bLivePosition.f45278x = (float) jsonParser.getValueAsDouble();
                return true;
            }
            if (!str.equals(BaseSei.f14625Y)) {
                return false;
            }
            bLivePosition.f45279y = (float) jsonParser.getValueAsDouble();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePosition bLivePosition, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BaseSei.f14624X, bLivePosition.f45278x);
            jsonGenerator.writeNumberField(BaseSei.f14625Y, bLivePosition.f45279y);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveposition";

    /* JADX INFO: renamed from: x */
    @ProtobufIndex(index = 1)
    public float f45278x;

    /* JADX INFO: renamed from: y */
    @ProtobufIndex(index = 2)
    public float f45279y;

    public static BLivePosition new_() {
        BLivePosition bLivePosition = new BLivePosition();
        bLivePosition.nullCheck();
        return bLivePosition;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePosition mo225055clone() {
        BLivePosition bLivePosition = new BLivePosition();
        bLivePosition.f45278x = this.f45278x;
        bLivePosition.f45279y = this.f45279y;
        return bLivePosition;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePosition)) {
            return false;
        }
        BLivePosition bLivePosition = (BLivePosition) obj;
        return this.f45278x == bLivePosition.f45278x && this.f45279y == bLivePosition.f45279y;
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
        int iFloatToIntBits = (((i * 41) + Float.floatToIntBits(this.f45278x)) * 41) + Float.floatToIntBits(this.f45279y);
        this.hashCode = iFloatToIntBits;
        return iFloatToIntBits;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
