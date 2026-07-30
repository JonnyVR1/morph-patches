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
public class BSuggestedTabAnimation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BSuggestedTabAnimation> JSON_ADAPTER = new ObjectJsonAdapter<BSuggestedTabAnimation>() { // from class: com.p1.mobile.putong.live.base.data.BSuggestedTabAnimation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BSuggestedTabAnimation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BSuggestedTabAnimation newInstance() {
            return new BSuggestedTabAnimation();
        }

        public boolean parseField(BSuggestedTabAnimation bSuggestedTabAnimation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bubble":
                    bSuggestedTabAnimation.bubble = BSuggestedTabAnimationItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "follow":
                    bSuggestedTabAnimation.follow = BSuggestedTabAnimationItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "card":
                    bSuggestedTabAnimation.card = BSuggestedTabAnimationItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "guide":
                    bSuggestedTabAnimation.guide = BSuggestedTabAnimationItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BSuggestedTabAnimation bSuggestedTabAnimation, JsonGenerator jsonGenerator) throws IOException {
            if (bSuggestedTabAnimation.card != null) {
                jsonGenerator.writeFieldName("card");
                BSuggestedTabAnimationItem.JSON_ADAPTER.serialize(bSuggestedTabAnimation.card, jsonGenerator, true);
            }
            if (bSuggestedTabAnimation.bubble != null) {
                jsonGenerator.writeFieldName("bubble");
                BSuggestedTabAnimationItem.JSON_ADAPTER.serialize(bSuggestedTabAnimation.bubble, jsonGenerator, true);
            }
            if (bSuggestedTabAnimation.follow != null) {
                jsonGenerator.writeFieldName("follow");
                BSuggestedTabAnimationItem.JSON_ADAPTER.serialize(bSuggestedTabAnimation.follow, jsonGenerator, true);
            }
            if (bSuggestedTabAnimation.guide != null) {
                jsonGenerator.writeFieldName("guide");
                BSuggestedTabAnimationItem.JSON_ADAPTER.serialize(bSuggestedTabAnimation.guide, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BSuggestedTabAnimation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bsuggestedtabanimation";

    @NonNull
    @ProtobufIndex(index = 2)
    public BSuggestedTabAnimationItem bubble;

    @NonNull
    @ProtobufIndex(index = 1)
    public BSuggestedTabAnimationItem card;

    @NonNull
    @ProtobufIndex(index = 3)
    public BSuggestedTabAnimationItem follow;

    @NonNull
    @ProtobufIndex(index = 4)
    public BSuggestedTabAnimationItem guide;

    public static BSuggestedTabAnimation new_() {
        BSuggestedTabAnimation bSuggestedTabAnimation = new BSuggestedTabAnimation();
        bSuggestedTabAnimation.nullCheck();
        return bSuggestedTabAnimation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BSuggestedTabAnimation mo223809clone() {
        BSuggestedTabAnimation bSuggestedTabAnimation = new BSuggestedTabAnimation();
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem = this.card;
        if (bSuggestedTabAnimationItem != null) {
            bSuggestedTabAnimation.card = bSuggestedTabAnimationItem.mo223809clone();
        }
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem2 = this.bubble;
        if (bSuggestedTabAnimationItem2 != null) {
            bSuggestedTabAnimation.bubble = bSuggestedTabAnimationItem2.mo223809clone();
        }
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem3 = this.follow;
        if (bSuggestedTabAnimationItem3 != null) {
            bSuggestedTabAnimation.follow = bSuggestedTabAnimationItem3.mo223809clone();
        }
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem4 = this.guide;
        if (bSuggestedTabAnimationItem4 != null) {
            bSuggestedTabAnimation.guide = bSuggestedTabAnimationItem4.mo223809clone();
        }
        return bSuggestedTabAnimation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BSuggestedTabAnimation)) {
            return false;
        }
        BSuggestedTabAnimation bSuggestedTabAnimation = (BSuggestedTabAnimation) obj;
        return ValueObject.util_equals(this.card, bSuggestedTabAnimation.card) && ValueObject.util_equals(this.bubble, bSuggestedTabAnimation.bubble) && ValueObject.util_equals(this.follow, bSuggestedTabAnimation.follow) && ValueObject.util_equals(this.guide, bSuggestedTabAnimation.guide);
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
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem = this.card;
        int iHashCode = (i2 + (bSuggestedTabAnimationItem != null ? bSuggestedTabAnimationItem.hashCode() : 0)) * 41;
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem2 = this.bubble;
        int iHashCode2 = (iHashCode + (bSuggestedTabAnimationItem2 != null ? bSuggestedTabAnimationItem2.hashCode() : 0)) * 41;
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem3 = this.follow;
        int iHashCode3 = (iHashCode2 + (bSuggestedTabAnimationItem3 != null ? bSuggestedTabAnimationItem3.hashCode() : 0)) * 41;
        BSuggestedTabAnimationItem bSuggestedTabAnimationItem4 = this.guide;
        int iHashCode4 = iHashCode3 + (bSuggestedTabAnimationItem4 != null ? bSuggestedTabAnimationItem4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.card == null) {
            this.card = BSuggestedTabAnimationItem.new_();
        }
        if (this.bubble == null) {
            this.bubble = BSuggestedTabAnimationItem.new_();
        }
        if (this.follow == null) {
            this.follow = BSuggestedTabAnimationItem.new_();
        }
        if (this.guide == null) {
            this.guide = BSuggestedTabAnimationItem.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
