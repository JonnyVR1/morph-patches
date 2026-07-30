package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyIndicatorLight;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePkBountyWinIndicator extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkBountyWinIndicator> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkBountyWinIndicator>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkBountyWinIndicator.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkBountyWinIndicator.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkBountyWinIndicator newInstance() {
            return new BLivePkBountyWinIndicator();
        }

        public boolean parseField(BLivePkBountyWinIndicator bLivePkBountyWinIndicator, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("lights")) {
                bLivePkBountyWinIndicator.lights = JsonAdapter.parseArray(jsonParser, BLivePkBountyIndicatorLight.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("tip")) {
                return false;
            }
            bLivePkBountyWinIndicator.tip = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkBountyWinIndicator bLivePkBountyWinIndicator, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkBountyWinIndicator.tip;
            if (str != null) {
                jsonGenerator.writeStringField("tip", str);
            }
            if (bLivePkBountyWinIndicator.lights != null) {
                jsonGenerator.writeFieldName("lights");
                JsonAdapter.serializeArray(bLivePkBountyWinIndicator.lights, jsonGenerator, BLivePkBountyIndicatorLight.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkBountyWinIndicator) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkbountywinindicator";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLivePkBountyIndicatorLight> lights;

    @NonNull
    @ProtobufIndex(index = 1)
    public String tip;

    public static BLivePkBountyWinIndicator new_() {
        BLivePkBountyWinIndicator bLivePkBountyWinIndicator = new BLivePkBountyWinIndicator();
        bLivePkBountyWinIndicator.nullCheck();
        return bLivePkBountyWinIndicator;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkBountyWinIndicator mo225055clone() {
        BLivePkBountyWinIndicator bLivePkBountyWinIndicator = new BLivePkBountyWinIndicator();
        bLivePkBountyWinIndicator.tip = this.tip;
        List<BLivePkBountyIndicatorLight> list = this.lights;
        if (list != null) {
            bLivePkBountyWinIndicator.lights = ValueObject.util_map(list, new qcj() { // from class: l.k42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkBountyIndicatorLight) obj).mo225055clone();
                }
            });
        }
        return bLivePkBountyWinIndicator;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkBountyWinIndicator)) {
            return false;
        }
        BLivePkBountyWinIndicator bLivePkBountyWinIndicator = (BLivePkBountyWinIndicator) obj;
        return ValueObject.util_equals(this.tip, bLivePkBountyWinIndicator.tip) && ValueObject.util_equals(this.lights, bLivePkBountyWinIndicator.lights);
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
        int i2 = i * 41;
        String str = this.tip;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLivePkBountyIndicatorLight> list = this.lights;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tip == null) {
            this.tip = "";
        }
        if (this.lights == null) {
            this.lights = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
