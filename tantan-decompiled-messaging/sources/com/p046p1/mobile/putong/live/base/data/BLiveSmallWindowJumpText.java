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
public class BLiveSmallWindowJumpText extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSmallWindowJumpText> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSmallWindowJumpText>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSmallWindowJumpText.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSmallWindowJumpText.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSmallWindowJumpText newInstance() {
            return new BLiveSmallWindowJumpText();
        }

        public boolean parseField(BLiveSmallWindowJumpText bLiveSmallWindowJumpText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("jump")) {
                bLiveSmallWindowJumpText.jump = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("closeWindow")) {
                return false;
            }
            bLiveSmallWindowJumpText.closeWindow = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSmallWindowJumpText bLiveSmallWindowJumpText, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSmallWindowJumpText.closeWindow;
            if (str != null) {
                jsonGenerator.writeStringField("closeWindow", str);
            }
            String str2 = bLiveSmallWindowJumpText.jump;
            if (str2 != null) {
                jsonGenerator.writeStringField("jump", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSmallWindowJumpText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesmallwindowjumptext";

    @NonNull
    @ProtobufIndex(index = 1)
    public String closeWindow;

    @NonNull
    @ProtobufIndex(index = 2)
    public String jump;

    public static BLiveSmallWindowJumpText new_() {
        BLiveSmallWindowJumpText bLiveSmallWindowJumpText = new BLiveSmallWindowJumpText();
        bLiveSmallWindowJumpText.nullCheck();
        return bLiveSmallWindowJumpText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSmallWindowJumpText mo223809clone() {
        BLiveSmallWindowJumpText bLiveSmallWindowJumpText = new BLiveSmallWindowJumpText();
        bLiveSmallWindowJumpText.closeWindow = this.closeWindow;
        bLiveSmallWindowJumpText.jump = this.jump;
        return bLiveSmallWindowJumpText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSmallWindowJumpText)) {
            return false;
        }
        BLiveSmallWindowJumpText bLiveSmallWindowJumpText = (BLiveSmallWindowJumpText) obj;
        return ValueObject.util_equals(this.closeWindow, bLiveSmallWindowJumpText.closeWindow) && ValueObject.util_equals(this.jump, bLiveSmallWindowJumpText.jump);
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
        String str = this.closeWindow;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.jump;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.closeWindow == null) {
            this.closeWindow = "";
        }
        if (this.jump == null) {
            this.jump = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
