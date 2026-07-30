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
public class BLiveGiftBubblePopupRemind extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftBubblePopupRemind> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftBubblePopupRemind>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupRemind.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftBubblePopupRemind.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftBubblePopupRemind newInstance() {
            return new BLiveGiftBubblePopupRemind();
        }

        public boolean parseField(BLiveGiftBubblePopupRemind bLiveGiftBubblePopupRemind, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textColor":
                    bLiveGiftBubblePopupRemind.textColor = jsonParser.getValueAsString();
                    return true;
                case "show":
                    bLiveGiftBubblePopupRemind.show = jsonParser.getValueAsBoolean();
                    return true;
                case "click":
                    bLiveGiftBubblePopupRemind.click = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftBubblePopupRemind bLiveGiftBubblePopupRemind, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", bLiveGiftBubblePopupRemind.show);
            jsonGenerator.writeBooleanField("click", bLiveGiftBubblePopupRemind.click);
            String str = bLiveGiftBubblePopupRemind.textColor;
            if (str != null) {
                jsonGenerator.writeStringField("textColor", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftBubblePopupRemind) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftbubblepopupremind";

    @ProtobufIndex(index = 2)
    public boolean click;

    @ProtobufIndex(index = 1)
    public boolean show;

    @NonNull
    @ProtobufIndex(index = 3)
    public String textColor;

    public static BLiveGiftBubblePopupRemind new_() {
        BLiveGiftBubblePopupRemind bLiveGiftBubblePopupRemind = new BLiveGiftBubblePopupRemind();
        bLiveGiftBubblePopupRemind.nullCheck();
        return bLiveGiftBubblePopupRemind;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftBubblePopupRemind mo225055clone() {
        BLiveGiftBubblePopupRemind bLiveGiftBubblePopupRemind = new BLiveGiftBubblePopupRemind();
        bLiveGiftBubblePopupRemind.show = this.show;
        bLiveGiftBubblePopupRemind.click = this.click;
        bLiveGiftBubblePopupRemind.textColor = this.textColor;
        return bLiveGiftBubblePopupRemind;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftBubblePopupRemind)) {
            return false;
        }
        BLiveGiftBubblePopupRemind bLiveGiftBubblePopupRemind = (BLiveGiftBubblePopupRemind) obj;
        return this.show == bLiveGiftBubblePopupRemind.show && this.click == bLiveGiftBubblePopupRemind.click && ValueObject.util_equals(this.textColor, bLiveGiftBubblePopupRemind.textColor);
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
        int i2 = ((((i * 41) + (this.show ? 1231 : 1237)) * 41) + (this.click ? 1231 : 1237)) * 41;
        String str = this.textColor;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.textColor == null) {
            this.textColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
