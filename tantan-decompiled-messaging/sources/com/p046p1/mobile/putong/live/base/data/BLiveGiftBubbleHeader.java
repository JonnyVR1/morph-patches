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
public class BLiveGiftBubbleHeader extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftBubbleHeader> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftBubbleHeader>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftBubbleHeader.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftBubbleHeader.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftBubbleHeader newInstance() {
            return new BLiveGiftBubbleHeader();
        }

        public boolean parseField(BLiveGiftBubbleHeader bLiveGiftBubbleHeader, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("textColor")) {
                bLiveGiftBubbleHeader.textColor = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("position")) {
                return false;
            }
            bLiveGiftBubbleHeader.position = BLiveGiftBubblePopupTitlePosition.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftBubbleHeader bLiveGiftBubbleHeader, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftBubbleHeader.textColor;
            if (str != null) {
                jsonGenerator.writeStringField("textColor", str);
            }
            if (bLiveGiftBubbleHeader.position != null) {
                jsonGenerator.writeFieldName("position");
                BLiveGiftBubblePopupTitlePosition.JSON_ADAPTER.serialize(bLiveGiftBubbleHeader.position, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftBubbleHeader) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftbubbleheader";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGiftBubblePopupTitlePosition position;

    @NonNull
    @ProtobufIndex(index = 1)
    public String textColor;

    public static BLiveGiftBubbleHeader new_() {
        BLiveGiftBubbleHeader bLiveGiftBubbleHeader = new BLiveGiftBubbleHeader();
        bLiveGiftBubbleHeader.nullCheck();
        return bLiveGiftBubbleHeader;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftBubbleHeader mo223809clone() {
        BLiveGiftBubbleHeader bLiveGiftBubbleHeader = new BLiveGiftBubbleHeader();
        bLiveGiftBubbleHeader.textColor = this.textColor;
        bLiveGiftBubbleHeader.position = this.position;
        return bLiveGiftBubbleHeader;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftBubbleHeader)) {
            return false;
        }
        BLiveGiftBubbleHeader bLiveGiftBubbleHeader = (BLiveGiftBubbleHeader) obj;
        return ValueObject.util_equals(this.textColor, bLiveGiftBubbleHeader.textColor) && ValueObject.util_equals(this.position, bLiveGiftBubbleHeader.position);
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
        String str = this.textColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveGiftBubblePopupTitlePosition bLiveGiftBubblePopupTitlePosition = this.position;
        int iHashCode2 = iHashCode + (bLiveGiftBubblePopupTitlePosition != null ? bLiveGiftBubblePopupTitlePosition.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.position == null) {
            this.position = (BLiveGiftBubblePopupTitlePosition) BLiveGiftBubblePopupTitlePosition.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
