package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveTeenAccumulation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTeenAccumulation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTeenAccumulation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTeenAccumulation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTeenAccumulation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTeenAccumulation newInstance() {
            return new BLiveTeenAccumulation();
        }

        public boolean parseField(BLiveTeenAccumulation bLiveTeenAccumulation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                bLiveTeenAccumulation.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("time")) {
                return false;
            }
            bLiveTeenAccumulation.time = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTeenAccumulation bLiveTeenAccumulation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("time", bLiveTeenAccumulation.time);
            String str = bLiveTeenAccumulation.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTeenAccumulation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveteenaccumulation";

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @ProtobufIndex(index = 1)
    public int time;

    public static BLiveTeenAccumulation new_() {
        BLiveTeenAccumulation bLiveTeenAccumulation = new BLiveTeenAccumulation();
        bLiveTeenAccumulation.nullCheck();
        return bLiveTeenAccumulation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTeenAccumulation mo225055clone() {
        BLiveTeenAccumulation bLiveTeenAccumulation = new BLiveTeenAccumulation();
        bLiveTeenAccumulation.time = this.time;
        bLiveTeenAccumulation.text = this.text;
        return bLiveTeenAccumulation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTeenAccumulation)) {
            return false;
        }
        BLiveTeenAccumulation bLiveTeenAccumulation = (BLiveTeenAccumulation) obj;
        return this.time == bLiveTeenAccumulation.time && ValueObject.util_equals(this.text, bLiveTeenAccumulation.text);
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
        int i2 = ((i * 41) + this.time) * 41;
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
