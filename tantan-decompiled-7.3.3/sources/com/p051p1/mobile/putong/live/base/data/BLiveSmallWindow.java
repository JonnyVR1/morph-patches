package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveSmallWindow extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSmallWindow> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSmallWindow>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSmallWindow.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSmallWindow.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSmallWindow newInstance() {
            return new BLiveSmallWindow();
        }

        public boolean parseField(BLiveSmallWindow bLiveSmallWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "closeAlert":
                    bLiveSmallWindow.closeAlert = BLiveSmallWindowCloseAlert.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "show":
                    bLiveSmallWindow.show = jsonParser.getValueAsBoolean();
                    return true;
                case "location":
                    bLiveSmallWindow.location = BLiveSmallWindowLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSmallWindow bLiveSmallWindow, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", bLiveSmallWindow.show);
            if (bLiveSmallWindow.location != null) {
                jsonGenerator.writeFieldName("location");
                BLiveSmallWindowLocation.JSON_ADAPTER.serialize(bLiveSmallWindow.location, jsonGenerator, true);
            }
            if (bLiveSmallWindow.closeAlert != null) {
                jsonGenerator.writeFieldName("closeAlert");
                BLiveSmallWindowCloseAlert.JSON_ADAPTER.serialize(bLiveSmallWindow.closeAlert, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSmallWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesmallwindow";

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveSmallWindowCloseAlert closeAlert;

    @Nullable
    @ProtobufIndex(index = 2)
    public BLiveSmallWindowLocation location;

    @ProtobufIndex(index = 1)
    public boolean show;

    public static BLiveSmallWindow new_() {
        BLiveSmallWindow bLiveSmallWindow = new BLiveSmallWindow();
        bLiveSmallWindow.nullCheck();
        return bLiveSmallWindow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSmallWindow mo225055clone() {
        BLiveSmallWindow bLiveSmallWindow = new BLiveSmallWindow();
        bLiveSmallWindow.show = this.show;
        BLiveSmallWindowLocation bLiveSmallWindowLocation = this.location;
        if (bLiveSmallWindowLocation != null) {
            bLiveSmallWindow.location = bLiveSmallWindowLocation.mo225055clone();
        }
        BLiveSmallWindowCloseAlert bLiveSmallWindowCloseAlert = this.closeAlert;
        if (bLiveSmallWindowCloseAlert != null) {
            bLiveSmallWindow.closeAlert = bLiveSmallWindowCloseAlert.mo225055clone();
        }
        return bLiveSmallWindow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSmallWindow)) {
            return false;
        }
        BLiveSmallWindow bLiveSmallWindow = (BLiveSmallWindow) obj;
        return this.show == bLiveSmallWindow.show && ValueObject.util_equals(this.location, bLiveSmallWindow.location) && ValueObject.util_equals(this.closeAlert, bLiveSmallWindow.closeAlert);
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
        int i2 = ((i * 41) + (this.show ? 1231 : 1237)) * 41;
        BLiveSmallWindowLocation bLiveSmallWindowLocation = this.location;
        int iHashCode = (i2 + (bLiveSmallWindowLocation != null ? bLiveSmallWindowLocation.hashCode() : 0)) * 41;
        BLiveSmallWindowCloseAlert bLiveSmallWindowCloseAlert = this.closeAlert;
        int iHashCode2 = iHashCode + (bLiveSmallWindowCloseAlert != null ? bLiveSmallWindowCloseAlert.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
