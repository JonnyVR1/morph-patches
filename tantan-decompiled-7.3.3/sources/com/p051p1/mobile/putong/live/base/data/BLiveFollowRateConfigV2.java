package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.BannerLoc;
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
public class BLiveFollowRateConfigV2 extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFollowRateConfigV2> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFollowRateConfigV2>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFollowRateConfigV2.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFollowRateConfigV2.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFollowRateConfigV2 newInstance() {
            return new BLiveFollowRateConfigV2();
        }

        public boolean parseField(BLiveFollowRateConfigV2 bLiveFollowRateConfigV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "afterGiveGift":
                    bLiveFollowRateConfigV2.afterGiveGift = jsonParser.getValueAsInt();
                    return true;
                case "bubble":
                    bLiveFollowRateConfigV2.bubble = BLiveFollowRateBubbleV2.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "noRepeatAnchorCount":
                    bLiveFollowRateConfigV2.noRepeatAnchorCount = jsonParser.getValueAsInt();
                    return true;
                case "on":
                    bLiveFollowRateConfigV2.f45218on = jsonParser.getValueAsBoolean();
                    return true;
                case "chat":
                    bLiveFollowRateConfigV2.chat = BLiveFollowRateChatV2.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "popup":
                    bLiveFollowRateConfigV2.popup = BLiveFollowRatePopupV2.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFollowRateConfigV2 bLiveFollowRateConfigV2, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bLiveFollowRateConfigV2.f45218on);
            jsonGenerator.writeNumberField("noRepeatAnchorCount", bLiveFollowRateConfigV2.noRepeatAnchorCount);
            jsonGenerator.writeNumberField("afterGiveGift", bLiveFollowRateConfigV2.afterGiveGift);
            if (bLiveFollowRateConfigV2.bubble != null) {
                jsonGenerator.writeFieldName("bubble");
                BLiveFollowRateBubbleV2.JSON_ADAPTER.serialize(bLiveFollowRateConfigV2.bubble, jsonGenerator, true);
            }
            if (bLiveFollowRateConfigV2.popup != null) {
                jsonGenerator.writeFieldName(BannerLoc.popup);
                BLiveFollowRatePopupV2.JSON_ADAPTER.serialize(bLiveFollowRateConfigV2.popup, jsonGenerator, true);
            }
            if (bLiveFollowRateConfigV2.chat != null) {
                jsonGenerator.writeFieldName("chat");
                BLiveFollowRateChatV2.JSON_ADAPTER.serialize(bLiveFollowRateConfigV2.chat, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFollowRateConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefollowrateconfigv2";

    @ProtobufIndex(index = 3)
    public int afterGiveGift;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveFollowRateBubbleV2 bubble;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveFollowRateChatV2 chat;

    @ProtobufIndex(index = 2)
    public int noRepeatAnchorCount;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f45218on;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveFollowRatePopupV2 popup;

    public static BLiveFollowRateConfigV2 new_() {
        BLiveFollowRateConfigV2 bLiveFollowRateConfigV2 = new BLiveFollowRateConfigV2();
        bLiveFollowRateConfigV2.nullCheck();
        return bLiveFollowRateConfigV2;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFollowRateConfigV2 mo225055clone() {
        BLiveFollowRateConfigV2 bLiveFollowRateConfigV2 = new BLiveFollowRateConfigV2();
        bLiveFollowRateConfigV2.f45218on = this.f45218on;
        bLiveFollowRateConfigV2.noRepeatAnchorCount = this.noRepeatAnchorCount;
        bLiveFollowRateConfigV2.afterGiveGift = this.afterGiveGift;
        BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2 = this.bubble;
        if (bLiveFollowRateBubbleV2 != null) {
            bLiveFollowRateConfigV2.bubble = bLiveFollowRateBubbleV2.mo225055clone();
        }
        BLiveFollowRatePopupV2 bLiveFollowRatePopupV2 = this.popup;
        if (bLiveFollowRatePopupV2 != null) {
            bLiveFollowRateConfigV2.popup = bLiveFollowRatePopupV2.mo225055clone();
        }
        BLiveFollowRateChatV2 bLiveFollowRateChatV2 = this.chat;
        if (bLiveFollowRateChatV2 != null) {
            bLiveFollowRateConfigV2.chat = bLiveFollowRateChatV2.mo225055clone();
        }
        return bLiveFollowRateConfigV2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFollowRateConfigV2)) {
            return false;
        }
        BLiveFollowRateConfigV2 bLiveFollowRateConfigV2 = (BLiveFollowRateConfigV2) obj;
        return this.f45218on == bLiveFollowRateConfigV2.f45218on && this.noRepeatAnchorCount == bLiveFollowRateConfigV2.noRepeatAnchorCount && this.afterGiveGift == bLiveFollowRateConfigV2.afterGiveGift && ValueObject.util_equals(this.bubble, bLiveFollowRateConfigV2.bubble) && ValueObject.util_equals(this.popup, bLiveFollowRateConfigV2.popup) && ValueObject.util_equals(this.chat, bLiveFollowRateConfigV2.chat);
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
        int i2 = ((((((i * 41) + (this.f45218on ? 1231 : 1237)) * 41) + this.noRepeatAnchorCount) * 41) + this.afterGiveGift) * 41;
        BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2 = this.bubble;
        int iHashCode = (i2 + (bLiveFollowRateBubbleV2 != null ? bLiveFollowRateBubbleV2.hashCode() : 0)) * 41;
        BLiveFollowRatePopupV2 bLiveFollowRatePopupV2 = this.popup;
        int iHashCode2 = (iHashCode + (bLiveFollowRatePopupV2 != null ? bLiveFollowRatePopupV2.hashCode() : 0)) * 41;
        BLiveFollowRateChatV2 bLiveFollowRateChatV2 = this.chat;
        int iHashCode3 = iHashCode2 + (bLiveFollowRateChatV2 != null ? bLiveFollowRateChatV2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.bubble == null) {
            this.bubble = BLiveFollowRateBubbleV2.new_();
        }
        if (this.popup == null) {
            this.popup = BLiveFollowRatePopupV2.new_();
        }
        if (this.chat == null) {
            this.chat = BLiveFollowRateChatV2.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
