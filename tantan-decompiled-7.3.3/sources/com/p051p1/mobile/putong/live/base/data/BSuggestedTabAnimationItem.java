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
public class BSuggestedTabAnimationItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BSuggestedTabAnimationItem> JSON_ADAPTER = new ObjectJsonAdapter<BSuggestedTabAnimationItem>() { // from class: com.p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BSuggestedTabAnimationItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BSuggestedTabAnimationItem newInstance() {
            return new BSuggestedTabAnimationItem();
        }

        public boolean parseField(BSuggestedTabAnimationItem bSuggestedTabAnimationItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bSuggestedTabAnimationItem.duration = jsonParser.getValueAsLong();
                    return true;
                case "on":
                    bSuggestedTabAnimationItem.f45365on = jsonParser.getValueAsBoolean();
                    return true;
                case "text":
                    bSuggestedTabAnimationItem.text = jsonParser.getValueAsString();
                    return true;
                case "total":
                    bSuggestedTabAnimationItem.total = jsonParser.getValueAsInt();
                    return true;
                case "nextDay":
                    bSuggestedTabAnimationItem.nextDay = jsonParser.getValueAsInt();
                    return true;
                case "dayLimit":
                    bSuggestedTabAnimationItem.dayLimit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BSuggestedTabAnimationItem bSuggestedTabAnimationItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bSuggestedTabAnimationItem.f45365on);
            jsonGenerator.writeNumberField("dayLimit", bSuggestedTabAnimationItem.dayLimit);
            jsonGenerator.writeNumberField("nextDay", bSuggestedTabAnimationItem.nextDay);
            String str = bSuggestedTabAnimationItem.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bSuggestedTabAnimationItem.duration);
            jsonGenerator.writeNumberField("total", bSuggestedTabAnimationItem.total);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BSuggestedTabAnimationItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bsuggestedtabanimationitem";

    @ProtobufIndex(index = 2)
    public int dayLimit;

    @ProtobufIndex(index = 6)
    public long duration;

    @ProtobufIndex(index = 3)
    public int nextDay;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f45365on;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;

    @ProtobufIndex(index = 5)
    public int total;

    public static BSuggestedTabAnimationItem new_() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem = new BSuggestedTabAnimationItem();
        bSuggestedTabAnimationItem.nullCheck();
        return bSuggestedTabAnimationItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BSuggestedTabAnimationItem mo225055clone() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem = new BSuggestedTabAnimationItem();
        bSuggestedTabAnimationItem.f45365on = this.f45365on;
        bSuggestedTabAnimationItem.dayLimit = this.dayLimit;
        bSuggestedTabAnimationItem.nextDay = this.nextDay;
        bSuggestedTabAnimationItem.text = this.text;
        bSuggestedTabAnimationItem.duration = this.duration;
        bSuggestedTabAnimationItem.total = this.total;
        return bSuggestedTabAnimationItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BSuggestedTabAnimationItem)) {
            return false;
        }
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem = (BSuggestedTabAnimationItem) obj;
        return this.f45365on == bSuggestedTabAnimationItem.f45365on && this.dayLimit == bSuggestedTabAnimationItem.dayLimit && this.nextDay == bSuggestedTabAnimationItem.nextDay && ValueObject.util_equals(this.text, bSuggestedTabAnimationItem.text) && this.duration == bSuggestedTabAnimationItem.duration && this.total == bSuggestedTabAnimationItem.total;
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
        int i2 = ((((((i * 41) + (this.f45365on ? 1231 : 1237)) * 41) + this.dayLimit) * 41) + this.nextDay) * 41;
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.duration;
        int i3 = ((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + this.total;
        this.hashCode = i3;
        return i3;
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
