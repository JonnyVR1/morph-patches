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
public class BLiveKnightsInfosSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveKnightsInfosSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveKnightsInfosSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveKnightsInfosSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveKnightsInfosSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveKnightsInfosSummary newInstance() {
            return new BLiveKnightsInfosSummary();
        }

        public boolean parseField(BLiveKnightsInfosSummary bLiveKnightsInfosSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("knightsNumber")) {
                bLiveKnightsInfosSummary.knightsNumber = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("showEntrance")) {
                return false;
            }
            bLiveKnightsInfosSummary.showEntrance = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveKnightsInfosSummary bLiveKnightsInfosSummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showEntrance", bLiveKnightsInfosSummary.showEntrance);
            jsonGenerator.writeNumberField("knightsNumber", bLiveKnightsInfosSummary.knightsNumber);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveKnightsInfosSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveknightsinfossummary";

    @ProtobufIndex(index = 2)
    public int knightsNumber;

    @ProtobufIndex(index = 1)
    public boolean showEntrance;

    public static BLiveKnightsInfosSummary new_() {
        BLiveKnightsInfosSummary bLiveKnightsInfosSummary = new BLiveKnightsInfosSummary();
        bLiveKnightsInfosSummary.nullCheck();
        return bLiveKnightsInfosSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveKnightsInfosSummary mo223809clone() {
        BLiveKnightsInfosSummary bLiveKnightsInfosSummary = new BLiveKnightsInfosSummary();
        bLiveKnightsInfosSummary.showEntrance = this.showEntrance;
        bLiveKnightsInfosSummary.knightsNumber = this.knightsNumber;
        return bLiveKnightsInfosSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveKnightsInfosSummary)) {
            return false;
        }
        BLiveKnightsInfosSummary bLiveKnightsInfosSummary = (BLiveKnightsInfosSummary) obj;
        return this.showEntrance == bLiveKnightsInfosSummary.showEntrance && this.knightsNumber == bLiveKnightsInfosSummary.knightsNumber;
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
        int i2 = (((i * 41) + (this.showEntrance ? 1231 : 1237)) * 41) + this.knightsNumber;
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
