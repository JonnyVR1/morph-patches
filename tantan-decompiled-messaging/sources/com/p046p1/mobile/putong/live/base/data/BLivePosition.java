package com.p046p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePosition newInstance() {
            return new BLivePosition();
        }

        public boolean parseField(BLivePosition bLivePosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BaseSei.f13930X)) {
                bLivePosition.f44430x = (float) jsonParser.getValueAsDouble();
                return true;
            }
            if (!str.equals(BaseSei.f13931Y)) {
                return false;
            }
            bLivePosition.f44431y = (float) jsonParser.getValueAsDouble();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePosition bLivePosition, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BaseSei.f13930X, bLivePosition.f44430x);
            jsonGenerator.writeNumberField(BaseSei.f13931Y, bLivePosition.f44431y);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveposition";

    /* JADX INFO: renamed from: x */
    @ProtobufIndex(index = 1)
    public float f44430x;

    /* JADX INFO: renamed from: y */
    @ProtobufIndex(index = 2)
    public float f44431y;

    public static BLivePosition new_() {
        BLivePosition bLivePosition = new BLivePosition();
        bLivePosition.nullCheck();
        return bLivePosition;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePosition mo223809clone() {
        BLivePosition bLivePosition = new BLivePosition();
        bLivePosition.f44430x = this.f44430x;
        bLivePosition.f44431y = this.f44431y;
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
        return this.f44430x == bLivePosition.f44430x && this.f44431y == bLivePosition.f44431y;
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
        int iFloatToIntBits = (((i * 41) + Float.floatToIntBits(this.f44430x)) * 41) + Float.floatToIntBits(this.f44431y);
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
