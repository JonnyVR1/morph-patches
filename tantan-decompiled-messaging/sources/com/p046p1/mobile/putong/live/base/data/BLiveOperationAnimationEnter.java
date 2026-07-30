package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveOperationAnimationEnter extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationAnimationEnter> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationAnimationEnter>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationAnimationEnter.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationAnimationEnter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationAnimationEnter newInstance() {
            return new BLiveOperationAnimationEnter();
        }

        public boolean parseField(BLiveOperationAnimationEnter bLiveOperationAnimationEnter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "imageUrl":
                    bLiveOperationAnimationEnter.imageUrl = jsonParser.getValueAsString();
                    return true;
                case "isTop":
                    bLiveOperationAnimationEnter.isTop = jsonParser.getValueAsBoolean();
                    return true;
                case "animationType":
                    bLiveOperationAnimationEnter.animationType = BLiveOperationAnimationEnterType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationAnimationEnter bLiveOperationAnimationEnter, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveOperationAnimationEnter.animationType != null) {
                jsonGenerator.writeFieldName("animationType");
                BLiveOperationAnimationEnterType.JSON_ADAPTER.serialize(bLiveOperationAnimationEnter.animationType, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isTop", bLiveOperationAnimationEnter.isTop);
            String str = bLiveOperationAnimationEnter.imageUrl;
            if (str != null) {
                jsonGenerator.writeStringField("imageUrl", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationAnimationEnter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationanimationenter";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveOperationAnimationEnterType animationType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String imageUrl;

    @ProtobufIndex(index = 2)
    public boolean isTop;

    public static BLiveOperationAnimationEnter new_() {
        BLiveOperationAnimationEnter bLiveOperationAnimationEnter = new BLiveOperationAnimationEnter();
        bLiveOperationAnimationEnter.nullCheck();
        return bLiveOperationAnimationEnter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationAnimationEnter mo223809clone() {
        BLiveOperationAnimationEnter bLiveOperationAnimationEnter = new BLiveOperationAnimationEnter();
        bLiveOperationAnimationEnter.animationType = this.animationType;
        bLiveOperationAnimationEnter.isTop = this.isTop;
        bLiveOperationAnimationEnter.imageUrl = this.imageUrl;
        return bLiveOperationAnimationEnter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationAnimationEnter)) {
            return false;
        }
        BLiveOperationAnimationEnter bLiveOperationAnimationEnter = (BLiveOperationAnimationEnter) obj;
        return ValueObject.util_equals(this.animationType, bLiveOperationAnimationEnter.animationType) && this.isTop == bLiveOperationAnimationEnter.isTop && ValueObject.util_equals(this.imageUrl, bLiveOperationAnimationEnter.imageUrl);
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
        BLiveOperationAnimationEnterType bLiveOperationAnimationEnterType = this.animationType;
        int iHashCode = (((i2 + (bLiveOperationAnimationEnterType != null ? bLiveOperationAnimationEnterType.hashCode() : 0)) * 41) + (this.isTop ? 1231 : 1237)) * 41;
        String str = this.imageUrl;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.animationType == null) {
            this.animationType = (BLiveOperationAnimationEnterType) BLiveOperationAnimationEnterType.JSON_ADAPTER.defaultEnum();
        }
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
