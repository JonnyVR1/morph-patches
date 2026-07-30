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
public class BLiveVoiceLivePush extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLivePush> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLivePush>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLivePush.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLivePush.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLivePush newInstance() {
            return new BLiveVoiceLivePush();
        }

        public boolean parseField(BLiveVoiceLivePush bLiveVoiceLivePush, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("message")) {
                bLiveVoiceLivePush.message = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("sendPush")) {
                return false;
            }
            bLiveVoiceLivePush.sendPush = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLivePush bLiveVoiceLivePush, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceLivePush.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            jsonGenerator.writeBooleanField("sendPush", bLiveVoiceLivePush.sendPush);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLivePush) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicelivepush";

    @NonNull
    @ProtobufIndex(index = 1)
    public String message;

    @ProtobufIndex(index = 2)
    public boolean sendPush;

    public static BLiveVoiceLivePush new_() {
        BLiveVoiceLivePush bLiveVoiceLivePush = new BLiveVoiceLivePush();
        bLiveVoiceLivePush.nullCheck();
        return bLiveVoiceLivePush;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLivePush mo225055clone() {
        BLiveVoiceLivePush bLiveVoiceLivePush = new BLiveVoiceLivePush();
        bLiveVoiceLivePush.message = this.message;
        bLiveVoiceLivePush.sendPush = this.sendPush;
        return bLiveVoiceLivePush;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLivePush)) {
            return false;
        }
        BLiveVoiceLivePush bLiveVoiceLivePush = (BLiveVoiceLivePush) obj;
        return ValueObject.util_equals(this.message, bLiveVoiceLivePush.message) && this.sendPush == bLiveVoiceLivePush.sendPush;
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
        String str = this.message;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.sendPush ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
