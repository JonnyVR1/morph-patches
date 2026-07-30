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
public class BLiveVoiceSmallWindow extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSmallWindow> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSmallWindow>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSmallWindow.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSmallWindow.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSmallWindow newInstance() {
            return new BLiveVoiceSmallWindow();
        }

        public boolean parseField(BLiveVoiceSmallWindow bLiveVoiceSmallWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchor":
                    bLiveVoiceSmallWindow.anchor = BLiveVoiceSmallWindowSwitch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "caller":
                    bLiveVoiceSmallWindow.caller = BLiveVoiceSmallWindowSwitch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "audience":
                    bLiveVoiceSmallWindow.audience = BLiveVoiceSmallWindowSwitch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSmallWindow bLiveVoiceSmallWindow, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceSmallWindow.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveVoiceSmallWindowSwitch.JSON_ADAPTER.serialize(bLiveVoiceSmallWindow.anchor, jsonGenerator, true);
            }
            if (bLiveVoiceSmallWindow.caller != null) {
                jsonGenerator.writeFieldName(BLiveRole.caller);
                BLiveVoiceSmallWindowSwitch.JSON_ADAPTER.serialize(bLiveVoiceSmallWindow.caller, jsonGenerator, true);
            }
            if (bLiveVoiceSmallWindow.audience != null) {
                jsonGenerator.writeFieldName("audience");
                BLiveVoiceSmallWindowSwitch.JSON_ADAPTER.serialize(bLiveVoiceSmallWindow.audience, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSmallWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesmallwindow";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveVoiceSmallWindowSwitch anchor;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveVoiceSmallWindowSwitch audience;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceSmallWindowSwitch caller;

    public static BLiveVoiceSmallWindow new_() {
        BLiveVoiceSmallWindow bLiveVoiceSmallWindow = new BLiveVoiceSmallWindow();
        bLiveVoiceSmallWindow.nullCheck();
        return bLiveVoiceSmallWindow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSmallWindow mo225055clone() {
        BLiveVoiceSmallWindow bLiveVoiceSmallWindow = new BLiveVoiceSmallWindow();
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch = this.anchor;
        if (bLiveVoiceSmallWindowSwitch != null) {
            bLiveVoiceSmallWindow.anchor = bLiveVoiceSmallWindowSwitch.mo225055clone();
        }
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch2 = this.caller;
        if (bLiveVoiceSmallWindowSwitch2 != null) {
            bLiveVoiceSmallWindow.caller = bLiveVoiceSmallWindowSwitch2.mo225055clone();
        }
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch3 = this.audience;
        if (bLiveVoiceSmallWindowSwitch3 != null) {
            bLiveVoiceSmallWindow.audience = bLiveVoiceSmallWindowSwitch3.mo225055clone();
        }
        return bLiveVoiceSmallWindow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSmallWindow)) {
            return false;
        }
        BLiveVoiceSmallWindow bLiveVoiceSmallWindow = (BLiveVoiceSmallWindow) obj;
        return ValueObject.util_equals(this.anchor, bLiveVoiceSmallWindow.anchor) && ValueObject.util_equals(this.caller, bLiveVoiceSmallWindow.caller) && ValueObject.util_equals(this.audience, bLiveVoiceSmallWindow.audience);
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
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch = this.anchor;
        int iHashCode = (i2 + (bLiveVoiceSmallWindowSwitch != null ? bLiveVoiceSmallWindowSwitch.hashCode() : 0)) * 41;
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch2 = this.caller;
        int iHashCode2 = (iHashCode + (bLiveVoiceSmallWindowSwitch2 != null ? bLiveVoiceSmallWindowSwitch2.hashCode() : 0)) * 41;
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch3 = this.audience;
        int iHashCode3 = iHashCode2 + (bLiveVoiceSmallWindowSwitch3 != null ? bLiveVoiceSmallWindowSwitch3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchor == null) {
            this.anchor = BLiveVoiceSmallWindowSwitch.new_();
        }
        if (this.caller == null) {
            this.caller = BLiveVoiceSmallWindowSwitch.new_();
        }
        if (this.audience == null) {
            this.audience = BLiveVoiceSmallWindowSwitch.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
