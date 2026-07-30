package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveOperationItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItem newInstance() {
            return new BLiveOperationItem();
        }

        public boolean parseField(BLiveOperationItem bLiveOperationItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "icon":
                    bLiveOperationItem.icon = BLiveOperationItemIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveOperationItem.type = jsonParser.getValueAsString();
                    return true;
                case "popup":
                    bLiveOperationItem.popup = BLiveOperationItemPopUp.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveOperationItem.title = BLiveOperationItemTitle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "animation":
                    bLiveOperationItem.animation = BLiveOperationAnimation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "countdown":
                    bLiveOperationItem.countdown = BLiveOperationItemCountDown.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItem bLiveOperationItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOperationItem.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (bLiveOperationItem.icon != null) {
                jsonGenerator.writeFieldName("icon");
                BLiveOperationItemIcon.JSON_ADAPTER.serialize(bLiveOperationItem.icon, jsonGenerator, true);
            }
            if (bLiveOperationItem.title != null) {
                jsonGenerator.writeFieldName("title");
                BLiveOperationItemTitle.JSON_ADAPTER.serialize(bLiveOperationItem.title, jsonGenerator, true);
            }
            if (bLiveOperationItem.popup != null) {
                jsonGenerator.writeFieldName(BannerLoc.popup);
                BLiveOperationItemPopUp.JSON_ADAPTER.serialize(bLiveOperationItem.popup, jsonGenerator, true);
            }
            if (bLiveOperationItem.countdown != null) {
                jsonGenerator.writeFieldName("countdown");
                BLiveOperationItemCountDown.JSON_ADAPTER.serialize(bLiveOperationItem.countdown, jsonGenerator, true);
            }
            if (bLiveOperationItem.animation != null) {
                jsonGenerator.writeFieldName("animation");
                BLiveOperationAnimation.JSON_ADAPTER.serialize(bLiveOperationItem.animation, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitem";

    @Nullable
    @ProtobufIndex(index = 6)
    public BLiveOperationAnimation animation;

    @Nullable
    @ProtobufIndex(index = 5)
    public BLiveOperationItemCountDown countdown;
    public String extraData;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOperationItemIcon icon;
    public boolean isForPrepare;

    @Nullable
    @ProtobufIndex(index = 4)
    public BLiveOperationItemPopUp popup;

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveOperationItemTitle title;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveOperationItem new_() {
        BLiveOperationItem bLiveOperationItem = new BLiveOperationItem();
        bLiveOperationItem.nullCheck();
        return bLiveOperationItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItem mo223809clone() {
        BLiveOperationItem bLiveOperationItem = new BLiveOperationItem();
        bLiveOperationItem.type = this.type;
        BLiveOperationItemIcon bLiveOperationItemIcon = this.icon;
        if (bLiveOperationItemIcon != null) {
            bLiveOperationItem.icon = bLiveOperationItemIcon.mo223809clone();
        }
        BLiveOperationItemTitle bLiveOperationItemTitle = this.title;
        if (bLiveOperationItemTitle != null) {
            bLiveOperationItem.title = bLiveOperationItemTitle.mo223809clone();
        }
        BLiveOperationItemPopUp bLiveOperationItemPopUp = this.popup;
        if (bLiveOperationItemPopUp != null) {
            bLiveOperationItem.popup = bLiveOperationItemPopUp.mo223809clone();
        }
        BLiveOperationItemCountDown bLiveOperationItemCountDown = this.countdown;
        if (bLiveOperationItemCountDown != null) {
            bLiveOperationItem.countdown = bLiveOperationItemCountDown.mo223809clone();
        }
        BLiveOperationAnimation bLiveOperationAnimation = this.animation;
        if (bLiveOperationAnimation != null) {
            bLiveOperationItem.animation = bLiveOperationAnimation.mo223809clone();
        }
        return bLiveOperationItem;
    }

    public boolean enableEntranceAnim() {
        if (!NullChecker.m81303a(this.animation)) {
            return false;
        }
        BLiveOperationAnimationEnter bLiveOperationAnimationEnter = this.animation.enter;
        return bLiveOperationAnimationEnter.isTop && TEnum.equals(bLiveOperationAnimationEnter.animationType, "image");
    }

    public boolean enableOperationTop() {
        if (!NullChecker.m81303a(this.animation)) {
            return false;
        }
        BLiveOperationAnimationEnter bLiveOperationAnimationEnter = this.animation.enter;
        return bLiveOperationAnimationEnter.isTop && !TEnum.equals(bLiveOperationAnimationEnter.animationType, "image");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItem)) {
            return false;
        }
        BLiveOperationItem bLiveOperationItem = (BLiveOperationItem) obj;
        return ValueObject.util_equals(this.type, bLiveOperationItem.type) && ValueObject.util_equals(this.icon, bLiveOperationItem.icon) && ValueObject.util_equals(this.title, bLiveOperationItem.title) && ValueObject.util_equals(this.popup, bLiveOperationItem.popup) && ValueObject.util_equals(this.countdown, bLiveOperationItem.countdown) && ValueObject.util_equals(this.animation, bLiveOperationItem.animation);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveOperationItemIcon bLiveOperationItemIcon = this.icon;
        int iHashCode2 = (iHashCode + (bLiveOperationItemIcon != null ? bLiveOperationItemIcon.hashCode() : 0)) * 41;
        BLiveOperationItemTitle bLiveOperationItemTitle = this.title;
        int iHashCode3 = (iHashCode2 + (bLiveOperationItemTitle != null ? bLiveOperationItemTitle.hashCode() : 0)) * 41;
        BLiveOperationItemPopUp bLiveOperationItemPopUp = this.popup;
        int iHashCode4 = (iHashCode3 + (bLiveOperationItemPopUp != null ? bLiveOperationItemPopUp.hashCode() : 0)) * 41;
        BLiveOperationItemCountDown bLiveOperationItemCountDown = this.countdown;
        int iHashCode5 = (iHashCode4 + (bLiveOperationItemCountDown != null ? bLiveOperationItemCountDown.hashCode() : 0)) * 41;
        BLiveOperationAnimation bLiveOperationAnimation = this.animation;
        int iHashCode6 = iHashCode5 + (bLiveOperationAnimation != null ? bLiveOperationAnimation.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    public boolean isGiftRedPacket() {
        return BLiveOperationPlaceType.get(BLiveOperationPlaceType.lotteryGiftRedPacket).name().equals(this.type);
    }

    public boolean isTurboCardEvent() {
        return BLiveOperationPlaceType.get(BLiveOperationPlaceType.turboCard).name().equals(this.type);
    }

    public boolean isTurboCoupon() {
        return BLiveOperationPlaceType.get(BLiveOperationPlaceType.turboCoupon).name().equals(this.type);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = BLiveOperationItemIcon.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
