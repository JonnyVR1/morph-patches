package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class BLiveOperationItemPopUp extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemPopUp> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemPopUp>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUp.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemPopUp.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemPopUp newInstance() {
            return new BLiveOperationItemPopUp();
        }

        public boolean parseField(BLiveOperationItemPopUp bLiveOperationItemPopUp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "h5Drawer":
                    bLiveOperationItemPopUp.h5Drawer = BLiveOperationItemPopUpDrawer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "fadingSeconds":
                    bLiveOperationItemPopUp.fadingSeconds = jsonParser.getValueAsLong();
                    return true;
                case "popupType":
                    bLiveOperationItemPopUp.popupType = BLiveOperationPopupType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "h5PopUp":
                    bLiveOperationItemPopUp.h5PopUp = BLiveOperationItemPopUpDrawer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isOpened":
                    bLiveOperationItemPopUp.isOpened = jsonParser.getValueAsBoolean();
                    return true;
                case "textDrawer":
                    bLiveOperationItemPopUp.textDrawer = BLiveOperationItemPopUpTextDrawer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemPopUp bLiveOperationItemPopUp, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveOperationItemPopUp.popupType != null) {
                jsonGenerator.writeFieldName("popupType");
                BLiveOperationPopupType.JSON_ADAPTER.serialize(bLiveOperationItemPopUp.popupType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("fadingSeconds", bLiveOperationItemPopUp.fadingSeconds);
            jsonGenerator.writeBooleanField("isOpened", bLiveOperationItemPopUp.isOpened);
            if (bLiveOperationItemPopUp.textDrawer != null) {
                jsonGenerator.writeFieldName(BLiveOperationActionAfterCountdown.textDrawer);
                BLiveOperationItemPopUpTextDrawer.JSON_ADAPTER.serialize(bLiveOperationItemPopUp.textDrawer, jsonGenerator, true);
            }
            if (bLiveOperationItemPopUp.h5Drawer != null) {
                jsonGenerator.writeFieldName("h5Drawer");
                BLiveOperationItemPopUpDrawer.JSON_ADAPTER.serialize(bLiveOperationItemPopUp.h5Drawer, jsonGenerator, true);
            }
            if (bLiveOperationItemPopUp.h5PopUp != null) {
                jsonGenerator.writeFieldName("h5PopUp");
                BLiveOperationItemPopUpDrawer.JSON_ADAPTER.serialize(bLiveOperationItemPopUp.h5PopUp, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemPopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitempopup";

    @ProtobufIndex(index = 2)
    public long fadingSeconds;

    @Nullable
    @ProtobufIndex(index = 5)
    public BLiveOperationItemPopUpDrawer h5Drawer;

    @Nullable
    @ProtobufIndex(index = 6)
    public BLiveOperationItemPopUpDrawer h5PopUp;
    public boolean isFirstPriority;

    @ProtobufIndex(index = 3)
    public boolean isOpened;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveOperationPopupType popupType;

    @Nullable
    @ProtobufIndex(index = 4)
    public BLiveOperationItemPopUpTextDrawer textDrawer;

    public static BLiveOperationItemPopUp new_() {
        BLiveOperationItemPopUp bLiveOperationItemPopUp = new BLiveOperationItemPopUp();
        bLiveOperationItemPopUp.nullCheck();
        return bLiveOperationItemPopUp;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemPopUp mo223809clone() {
        BLiveOperationItemPopUp bLiveOperationItemPopUp = new BLiveOperationItemPopUp();
        bLiveOperationItemPopUp.popupType = this.popupType;
        bLiveOperationItemPopUp.fadingSeconds = this.fadingSeconds;
        bLiveOperationItemPopUp.isOpened = this.isOpened;
        BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer = this.textDrawer;
        if (bLiveOperationItemPopUpTextDrawer != null) {
            bLiveOperationItemPopUp.textDrawer = bLiveOperationItemPopUpTextDrawer.mo223809clone();
        }
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer = this.h5Drawer;
        if (bLiveOperationItemPopUpDrawer != null) {
            bLiveOperationItemPopUp.h5Drawer = bLiveOperationItemPopUpDrawer.mo223809clone();
        }
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer2 = this.h5PopUp;
        if (bLiveOperationItemPopUpDrawer2 != null) {
            bLiveOperationItemPopUp.h5PopUp = bLiveOperationItemPopUpDrawer2.mo223809clone();
        }
        return bLiveOperationItemPopUp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemPopUp)) {
            return false;
        }
        BLiveOperationItemPopUp bLiveOperationItemPopUp = (BLiveOperationItemPopUp) obj;
        return ValueObject.util_equals(this.popupType, bLiveOperationItemPopUp.popupType) && this.fadingSeconds == bLiveOperationItemPopUp.fadingSeconds && this.isOpened == bLiveOperationItemPopUp.isOpened && ValueObject.util_equals(this.textDrawer, bLiveOperationItemPopUp.textDrawer) && ValueObject.util_equals(this.h5Drawer, bLiveOperationItemPopUp.h5Drawer) && ValueObject.util_equals(this.h5PopUp, bLiveOperationItemPopUp.h5PopUp);
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
        BLiveOperationPopupType bLiveOperationPopupType = this.popupType;
        int iHashCode = bLiveOperationPopupType != null ? bLiveOperationPopupType.hashCode() : 0;
        long j = this.fadingSeconds;
        int i3 = (((((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.isOpened ? 1231 : 1237)) * 41;
        BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer = this.textDrawer;
        int iHashCode2 = (i3 + (bLiveOperationItemPopUpTextDrawer != null ? bLiveOperationItemPopUpTextDrawer.hashCode() : 0)) * 41;
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer = this.h5Drawer;
        int iHashCode3 = (iHashCode2 + (bLiveOperationItemPopUpDrawer != null ? bLiveOperationItemPopUpDrawer.hashCode() : 0)) * 41;
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer2 = this.h5PopUp;
        int iHashCode4 = iHashCode3 + (bLiveOperationItemPopUpDrawer2 != null ? bLiveOperationItemPopUpDrawer2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.popupType == null) {
            this.popupType = (BLiveOperationPopupType) BLiveOperationPopupType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
