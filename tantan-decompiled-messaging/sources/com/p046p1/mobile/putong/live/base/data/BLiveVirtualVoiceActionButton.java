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
public class BLiveVirtualVoiceActionButton extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVirtualVoiceActionButton> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVirtualVoiceActionButton>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVirtualVoiceActionButton.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVirtualVoiceActionButton.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVirtualVoiceActionButton newInstance() {
            return new BLiveVirtualVoiceActionButton();
        }

        public boolean parseField(BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("jump")) {
                bLiveVirtualVoiceActionButton.jump = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bLiveVirtualVoiceActionButton.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVirtualVoiceActionButton.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVirtualVoiceActionButton.jump;
            if (str2 != null) {
                jsonGenerator.writeStringField("jump", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVirtualVoiceActionButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevirtualvoiceactionbutton";

    @NonNull
    @ProtobufIndex(index = 2)
    public String jump;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveVirtualVoiceActionButton new_() {
        BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton = new BLiveVirtualVoiceActionButton();
        bLiveVirtualVoiceActionButton.nullCheck();
        return bLiveVirtualVoiceActionButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVirtualVoiceActionButton mo223809clone() {
        BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton = new BLiveVirtualVoiceActionButton();
        bLiveVirtualVoiceActionButton.title = this.title;
        bLiveVirtualVoiceActionButton.jump = this.jump;
        return bLiveVirtualVoiceActionButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVirtualVoiceActionButton)) {
            return false;
        }
        BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton = (BLiveVirtualVoiceActionButton) obj;
        return ValueObject.util_equals(this.title, bLiveVirtualVoiceActionButton.title) && ValueObject.util_equals(this.jump, bLiveVirtualVoiceActionButton.jump);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.jump;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
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
