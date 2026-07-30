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
public class BLivePkBountyIndicatorLight extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkBountyIndicatorLight> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkBountyIndicatorLight>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkBountyIndicatorLight.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkBountyIndicatorLight.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkBountyIndicatorLight newInstance() {
            return new BLivePkBountyIndicatorLight();
        }

        public boolean parseField(BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showMoney":
                    bLivePkBountyIndicatorLight.showMoney = jsonParser.getValueAsBoolean();
                    return true;
                case "lastOn":
                    bLivePkBountyIndicatorLight.lastOn = jsonParser.getValueAsBoolean();
                    return true;
                case "number":
                    bLivePkBountyIndicatorLight.number = jsonParser.getValueAsInt();
                    return true;
                case "on":
                    bLivePkBountyIndicatorLight.f45272on = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("number", bLivePkBountyIndicatorLight.number);
            jsonGenerator.writeBooleanField("showMoney", bLivePkBountyIndicatorLight.showMoney);
            jsonGenerator.writeBooleanField("on", bLivePkBountyIndicatorLight.f45272on);
            jsonGenerator.writeBooleanField("lastOn", bLivePkBountyIndicatorLight.lastOn);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkBountyIndicatorLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkbountyindicatorlight";

    @ProtobufIndex(index = 4)
    public boolean lastOn;

    @ProtobufIndex(index = 1)
    public int number;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 3)
    public boolean f45272on;

    @ProtobufIndex(index = 2)
    public boolean showMoney;

    public static BLivePkBountyIndicatorLight new_() {
        BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight = new BLivePkBountyIndicatorLight();
        bLivePkBountyIndicatorLight.nullCheck();
        return bLivePkBountyIndicatorLight;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkBountyIndicatorLight mo225055clone() {
        BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight = new BLivePkBountyIndicatorLight();
        bLivePkBountyIndicatorLight.number = this.number;
        bLivePkBountyIndicatorLight.showMoney = this.showMoney;
        bLivePkBountyIndicatorLight.f45272on = this.f45272on;
        bLivePkBountyIndicatorLight.lastOn = this.lastOn;
        return bLivePkBountyIndicatorLight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkBountyIndicatorLight)) {
            return false;
        }
        BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight = (BLivePkBountyIndicatorLight) obj;
        return this.number == bLivePkBountyIndicatorLight.number && this.showMoney == bLivePkBountyIndicatorLight.showMoney && this.f45272on == bLivePkBountyIndicatorLight.f45272on && this.lastOn == bLivePkBountyIndicatorLight.lastOn;
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
        int i2 = (((((((i * 41) + this.number) * 41) + (this.showMoney ? 1231 : 1237)) * 41) + (this.f45272on ? 1231 : 1237)) * 41) + (this.lastOn ? 1231 : 1237);
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
