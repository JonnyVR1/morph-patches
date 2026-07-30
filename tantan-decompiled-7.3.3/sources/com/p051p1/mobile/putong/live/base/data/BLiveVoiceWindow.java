package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveVoiceWindow extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceWindow> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceWindow>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceWindow.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceWindow.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceWindow newInstance() {
            return new BLiveVoiceWindow();
        }

        public boolean parseField(BLiveVoiceWindow bLiveVoiceWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("openWhenSlideRight")) {
                bLiveVoiceWindow.openWhenSlideRight = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("showExit")) {
                return false;
            }
            bLiveVoiceWindow.showExit = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceWindow bLiveVoiceWindow, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("openWhenSlideRight", bLiveVoiceWindow.openWhenSlideRight);
            jsonGenerator.writeBooleanField("showExit", bLiveVoiceWindow.showExit);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicewindow";

    @ProtobufIndex(index = 1)
    public boolean openWhenSlideRight;

    @ProtobufIndex(index = 2)
    public boolean showExit;

    public static BLiveVoiceWindow new_() {
        BLiveVoiceWindow bLiveVoiceWindow = new BLiveVoiceWindow();
        bLiveVoiceWindow.nullCheck();
        return bLiveVoiceWindow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceWindow mo225055clone() {
        BLiveVoiceWindow bLiveVoiceWindow = new BLiveVoiceWindow();
        bLiveVoiceWindow.openWhenSlideRight = this.openWhenSlideRight;
        bLiveVoiceWindow.showExit = this.showExit;
        return bLiveVoiceWindow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceWindow)) {
            return false;
        }
        BLiveVoiceWindow bLiveVoiceWindow = (BLiveVoiceWindow) obj;
        return this.openWhenSlideRight == bLiveVoiceWindow.openWhenSlideRight && this.showExit == bLiveVoiceWindow.showExit;
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
        int i2 = (((i * 41) + (this.openWhenSlideRight ? 1231 : 1237)) * 41) + (this.showExit ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
