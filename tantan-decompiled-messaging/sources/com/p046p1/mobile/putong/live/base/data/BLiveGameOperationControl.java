package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveGameOperationControl extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGameOperationControl> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGameOperationControl>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGameOperationControl.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGameOperationControl.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGameOperationControl newInstance() {
            return new BLiveGameOperationControl();
        }

        public boolean parseField(BLiveGameOperationControl bLiveGameOperationControl, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isHideIntlLiveSquareActivity")) {
                bLiveGameOperationControl.isHideIntlLiveSquareActivity = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("isHideIntlVoiceLiveSquareActivity")) {
                return false;
            }
            bLiveGameOperationControl.isHideIntlVoiceLiveSquareActivity = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGameOperationControl bLiveGameOperationControl, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isHideIntlLiveSquareActivity", bLiveGameOperationControl.isHideIntlLiveSquareActivity);
            jsonGenerator.writeBooleanField("isHideIntlVoiceLiveSquareActivity", bLiveGameOperationControl.isHideIntlVoiceLiveSquareActivity);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGameOperationControl) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegameoperationcontrol";

    @ProtobufIndex(index = 1)
    public boolean isHideIntlLiveSquareActivity;

    @ProtobufIndex(index = 2)
    public boolean isHideIntlVoiceLiveSquareActivity;

    public static BLiveGameOperationControl new_() {
        BLiveGameOperationControl bLiveGameOperationControl = new BLiveGameOperationControl();
        bLiveGameOperationControl.nullCheck();
        return bLiveGameOperationControl;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGameOperationControl mo223809clone() {
        BLiveGameOperationControl bLiveGameOperationControl = new BLiveGameOperationControl();
        bLiveGameOperationControl.isHideIntlLiveSquareActivity = this.isHideIntlLiveSquareActivity;
        bLiveGameOperationControl.isHideIntlVoiceLiveSquareActivity = this.isHideIntlVoiceLiveSquareActivity;
        return bLiveGameOperationControl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGameOperationControl)) {
            return false;
        }
        BLiveGameOperationControl bLiveGameOperationControl = (BLiveGameOperationControl) obj;
        return this.isHideIntlLiveSquareActivity == bLiveGameOperationControl.isHideIntlLiveSquareActivity && this.isHideIntlVoiceLiveSquareActivity == bLiveGameOperationControl.isHideIntlVoiceLiveSquareActivity;
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
        int i2 = (((i * 41) + (this.isHideIntlLiveSquareActivity ? 1231 : 1237)) * 41) + (this.isHideIntlVoiceLiveSquareActivity ? 1231 : 1237);
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
