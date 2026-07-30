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
public class BLiveUserLevelSwitch extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserLevelSwitch> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserLevelSwitch>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserLevelSwitch.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserLevelSwitch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserLevelSwitch newInstance() {
            return new BLiveUserLevelSwitch();
        }

        public boolean parseField(BLiveUserLevelSwitch bLiveUserLevelSwitch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isOpen")) {
                return false;
            }
            bLiveUserLevelSwitch.isOpen = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserLevelSwitch bLiveUserLevelSwitch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", bLiveUserLevelSwitch.isOpen);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserLevelSwitch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserlevelswitch";

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    public static BLiveUserLevelSwitch new_() {
        BLiveUserLevelSwitch bLiveUserLevelSwitch = new BLiveUserLevelSwitch();
        bLiveUserLevelSwitch.nullCheck();
        return bLiveUserLevelSwitch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserLevelSwitch mo225055clone() {
        BLiveUserLevelSwitch bLiveUserLevelSwitch = new BLiveUserLevelSwitch();
        bLiveUserLevelSwitch.isOpen = this.isOpen;
        return bLiveUserLevelSwitch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveUserLevelSwitch) && this.isOpen == ((BLiveUserLevelSwitch) obj).isOpen;
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
        int i2 = (i * 41) + (this.isOpen ? 1231 : 1237);
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
