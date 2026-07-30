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
public class BLiveCallSwitch extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCallSwitch> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallSwitch>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallSwitch.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallSwitch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallSwitch newInstance() {
            return new BLiveCallSwitch();
        }

        public boolean parseField(BLiveCallSwitch bLiveCallSwitch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    bLiveCallSwitch.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "on":
                    bLiveCallSwitch.f45194on = jsonParser.getValueAsBoolean();
                    return true;
                case "title":
                    bLiveCallSwitch.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallSwitch bLiveCallSwitch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", bLiveCallSwitch.enable);
            jsonGenerator.writeBooleanField("on", bLiveCallSwitch.f45194on);
            String str = bLiveCallSwitch.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallSwitch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecallswitch";

    @ProtobufIndex(index = 1)
    public boolean enable;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 2)
    public boolean f45194on;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    public static BLiveCallSwitch new_() {
        BLiveCallSwitch bLiveCallSwitch = new BLiveCallSwitch();
        bLiveCallSwitch.nullCheck();
        return bLiveCallSwitch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallSwitch mo225055clone() {
        BLiveCallSwitch bLiveCallSwitch = new BLiveCallSwitch();
        bLiveCallSwitch.enable = this.enable;
        bLiveCallSwitch.f45194on = this.f45194on;
        bLiveCallSwitch.title = this.title;
        return bLiveCallSwitch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCallSwitch)) {
            return false;
        }
        BLiveCallSwitch bLiveCallSwitch = (BLiveCallSwitch) obj;
        return this.enable == bLiveCallSwitch.enable && this.f45194on == bLiveCallSwitch.f45194on && ValueObject.util_equals(this.title, bLiveCallSwitch.title);
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
        int i2 = ((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.f45194on ? 1231 : 1237)) * 41;
        String str = this.title;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
