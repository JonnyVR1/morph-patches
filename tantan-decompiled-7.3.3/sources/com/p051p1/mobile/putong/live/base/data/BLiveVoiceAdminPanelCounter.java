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
public class BLiveVoiceAdminPanelCounter extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceAdminPanelCounter> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceAdminPanelCounter>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceAdminPanelCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceAdminPanelCounter newInstance() {
            return new BLiveVoiceAdminPanelCounter();
        }

        public boolean parseField(BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "adminPanelRedDot":
                    bLiveVoiceAdminPanelCounter.adminPanelRedDot = jsonParser.getValueAsInt();
                    return true;
                case "applyCallRedDot":
                    bLiveVoiceAdminPanelCounter.applyCallRedDot = jsonParser.getValueAsInt();
                    return true;
                case "applySettleRedDot":
                    bLiveVoiceAdminPanelCounter.applySettleRedDot = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("applyCallRedDot", bLiveVoiceAdminPanelCounter.applyCallRedDot);
            jsonGenerator.writeNumberField("applySettleRedDot", bLiveVoiceAdminPanelCounter.applySettleRedDot);
            jsonGenerator.writeNumberField("adminPanelRedDot", bLiveVoiceAdminPanelCounter.adminPanelRedDot);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceAdminPanelCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceadminpanelcounter";

    @ProtobufIndex(index = 3)
    public int adminPanelRedDot;

    @ProtobufIndex(index = 1)
    public int applyCallRedDot;

    @ProtobufIndex(index = 2)
    public int applySettleRedDot;

    public static BLiveVoiceAdminPanelCounter new_() {
        BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter = new BLiveVoiceAdminPanelCounter();
        bLiveVoiceAdminPanelCounter.nullCheck();
        return bLiveVoiceAdminPanelCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceAdminPanelCounter mo225055clone() {
        BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter = new BLiveVoiceAdminPanelCounter();
        bLiveVoiceAdminPanelCounter.applyCallRedDot = this.applyCallRedDot;
        bLiveVoiceAdminPanelCounter.applySettleRedDot = this.applySettleRedDot;
        bLiveVoiceAdminPanelCounter.adminPanelRedDot = this.adminPanelRedDot;
        return bLiveVoiceAdminPanelCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceAdminPanelCounter)) {
            return false;
        }
        BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter = (BLiveVoiceAdminPanelCounter) obj;
        return this.applyCallRedDot == bLiveVoiceAdminPanelCounter.applyCallRedDot && this.applySettleRedDot == bLiveVoiceAdminPanelCounter.applySettleRedDot && this.adminPanelRedDot == bLiveVoiceAdminPanelCounter.adminPanelRedDot;
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
        int i2 = (((((i * 41) + this.applyCallRedDot) * 41) + this.applySettleRedDot) * 41) + this.adminPanelRedDot;
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
