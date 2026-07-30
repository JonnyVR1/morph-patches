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
public class BLiveGiftInteractRules extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftInteractRules> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftInteractRules>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftInteractRules.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftInteractRules.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftInteractRules newInstance() {
            return new BLiveGiftInteractRules();
        }

        public boolean parseField(BLiveGiftInteractRules bLiveGiftInteractRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("click")) {
                bLiveGiftInteractRules.click = BLiveGiftRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("longPress")) {
                return false;
            }
            bLiveGiftInteractRules.longPress = BLiveGiftRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftInteractRules bLiveGiftInteractRules, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGiftInteractRules.click != null) {
                jsonGenerator.writeFieldName("click");
                BLiveGiftRule.JSON_ADAPTER.serialize(bLiveGiftInteractRules.click, jsonGenerator, true);
            }
            if (bLiveGiftInteractRules.longPress != null) {
                jsonGenerator.writeFieldName("longPress");
                BLiveGiftRule.JSON_ADAPTER.serialize(bLiveGiftInteractRules.longPress, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftInteractRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftinteractrules";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveGiftRule click;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGiftRule longPress;

    public static BLiveGiftInteractRules new_() {
        BLiveGiftInteractRules bLiveGiftInteractRules = new BLiveGiftInteractRules();
        bLiveGiftInteractRules.nullCheck();
        return bLiveGiftInteractRules;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftInteractRules mo225055clone() {
        BLiveGiftInteractRules bLiveGiftInteractRules = new BLiveGiftInteractRules();
        BLiveGiftRule bLiveGiftRule = this.click;
        if (bLiveGiftRule != null) {
            bLiveGiftInteractRules.click = bLiveGiftRule.mo225055clone();
        }
        BLiveGiftRule bLiveGiftRule2 = this.longPress;
        if (bLiveGiftRule2 != null) {
            bLiveGiftInteractRules.longPress = bLiveGiftRule2.mo225055clone();
        }
        return bLiveGiftInteractRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftInteractRules)) {
            return false;
        }
        BLiveGiftInteractRules bLiveGiftInteractRules = (BLiveGiftInteractRules) obj;
        return ValueObject.util_equals(this.click, bLiveGiftInteractRules.click) && ValueObject.util_equals(this.longPress, bLiveGiftInteractRules.longPress);
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
        BLiveGiftRule bLiveGiftRule = this.click;
        int iHashCode = (i2 + (bLiveGiftRule != null ? bLiveGiftRule.hashCode() : 0)) * 41;
        BLiveGiftRule bLiveGiftRule2 = this.longPress;
        int iHashCode2 = iHashCode + (bLiveGiftRule2 != null ? bLiveGiftRule2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.click == null) {
            this.click = BLiveGiftRule.new_();
        }
        if (this.longPress == null) {
            this.longPress = BLiveGiftRule.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
