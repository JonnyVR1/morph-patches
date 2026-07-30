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
public class BLiveGiftBubbleToast extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftBubbleToast> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftBubbleToast>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftBubbleToast.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftBubbleToast.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftBubbleToast newInstance() {
            return new BLiveGiftBubbleToast();
        }

        public boolean parseField(BLiveGiftBubbleToast bLiveGiftBubbleToast, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("successText")) {
                bLiveGiftBubbleToast.successText = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("failText")) {
                return false;
            }
            bLiveGiftBubbleToast.failText = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftBubbleToast bLiveGiftBubbleToast, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftBubbleToast.successText;
            if (str != null) {
                jsonGenerator.writeStringField("successText", str);
            }
            String str2 = bLiveGiftBubbleToast.failText;
            if (str2 != null) {
                jsonGenerator.writeStringField("failText", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftBubbleToast) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftbubbletoast";

    @NonNull
    @ProtobufIndex(index = 2)
    public String failText;

    @NonNull
    @ProtobufIndex(index = 1)
    public String successText;

    public static BLiveGiftBubbleToast new_() {
        BLiveGiftBubbleToast bLiveGiftBubbleToast = new BLiveGiftBubbleToast();
        bLiveGiftBubbleToast.nullCheck();
        return bLiveGiftBubbleToast;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftBubbleToast mo225055clone() {
        BLiveGiftBubbleToast bLiveGiftBubbleToast = new BLiveGiftBubbleToast();
        bLiveGiftBubbleToast.successText = this.successText;
        bLiveGiftBubbleToast.failText = this.failText;
        return bLiveGiftBubbleToast;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftBubbleToast)) {
            return false;
        }
        BLiveGiftBubbleToast bLiveGiftBubbleToast = (BLiveGiftBubbleToast) obj;
        return ValueObject.util_equals(this.successText, bLiveGiftBubbleToast.successText) && ValueObject.util_equals(this.failText, bLiveGiftBubbleToast.failText);
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
        String str = this.successText;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.failText;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.successText == null) {
            this.successText = "";
        }
        if (this.failText == null) {
            this.failText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
