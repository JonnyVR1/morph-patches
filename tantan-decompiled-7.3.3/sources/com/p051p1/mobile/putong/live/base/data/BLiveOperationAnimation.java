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
public class BLiveOperationAnimation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationAnimation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationAnimation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationAnimation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationAnimation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationAnimation newInstance() {
            return new BLiveOperationAnimation();
        }

        public boolean parseField(BLiveOperationAnimation bLiveOperationAnimation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("enter")) {
                return false;
            }
            bLiveOperationAnimation.enter = BLiveOperationAnimationEnter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationAnimation bLiveOperationAnimation, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveOperationAnimation.enter != null) {
                jsonGenerator.writeFieldName("enter");
                BLiveOperationAnimationEnter.JSON_ADAPTER.serialize(bLiveOperationAnimation.enter, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationAnimation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationanimation";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveOperationAnimationEnter enter;

    public static BLiveOperationAnimation new_() {
        BLiveOperationAnimation bLiveOperationAnimation = new BLiveOperationAnimation();
        bLiveOperationAnimation.nullCheck();
        return bLiveOperationAnimation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationAnimation mo225055clone() {
        BLiveOperationAnimation bLiveOperationAnimation = new BLiveOperationAnimation();
        BLiveOperationAnimationEnter bLiveOperationAnimationEnter = this.enter;
        if (bLiveOperationAnimationEnter != null) {
            bLiveOperationAnimation.enter = bLiveOperationAnimationEnter.mo225055clone();
        }
        return bLiveOperationAnimation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveOperationAnimation) {
            return ValueObject.util_equals(this.enter, ((BLiveOperationAnimation) obj).enter);
        }
        return false;
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
        BLiveOperationAnimationEnter bLiveOperationAnimationEnter = this.enter;
        int iHashCode = i2 + (bLiveOperationAnimationEnter != null ? bLiveOperationAnimationEnter.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.enter == null) {
            this.enter = BLiveOperationAnimationEnter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
