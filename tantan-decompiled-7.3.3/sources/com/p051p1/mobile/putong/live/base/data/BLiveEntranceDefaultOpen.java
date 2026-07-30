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
public class BLiveEntranceDefaultOpen extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEntranceDefaultOpen> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEntranceDefaultOpen>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEntranceDefaultOpen.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEntranceDefaultOpen.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEntranceDefaultOpen newInstance() {
            return new BLiveEntranceDefaultOpen();
        }

        public boolean parseField(BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("conditions")) {
                bLiveEntranceDefaultOpen.conditions = BLiveDefaultOpenConditions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("on")) {
                return false;
            }
            bLiveEntranceDefaultOpen.f45209on = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bLiveEntranceDefaultOpen.f45209on);
            if (bLiveEntranceDefaultOpen.conditions != null) {
                jsonGenerator.writeFieldName("conditions");
                BLiveDefaultOpenConditions.JSON_ADAPTER.serialize(bLiveEntranceDefaultOpen.conditions, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEntranceDefaultOpen) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveentrancedefaultopen";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveDefaultOpenConditions conditions;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f45209on;

    public static BLiveEntranceDefaultOpen new_() {
        BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen = new BLiveEntranceDefaultOpen();
        bLiveEntranceDefaultOpen.nullCheck();
        return bLiveEntranceDefaultOpen;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEntranceDefaultOpen mo225055clone() {
        BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen = new BLiveEntranceDefaultOpen();
        bLiveEntranceDefaultOpen.f45209on = this.f45209on;
        BLiveDefaultOpenConditions bLiveDefaultOpenConditions = this.conditions;
        if (bLiveDefaultOpenConditions != null) {
            bLiveEntranceDefaultOpen.conditions = bLiveDefaultOpenConditions.mo225055clone();
        }
        return bLiveEntranceDefaultOpen;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEntranceDefaultOpen)) {
            return false;
        }
        BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen = (BLiveEntranceDefaultOpen) obj;
        return this.f45209on == bLiveEntranceDefaultOpen.f45209on && ValueObject.util_equals(this.conditions, bLiveEntranceDefaultOpen.conditions);
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
        int i2 = ((i * 41) + (this.f45209on ? 1231 : 1237)) * 41;
        BLiveDefaultOpenConditions bLiveDefaultOpenConditions = this.conditions;
        int iHashCode = i2 + (bLiveDefaultOpenConditions != null ? bLiveDefaultOpenConditions.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.conditions == null) {
            this.conditions = BLiveDefaultOpenConditions.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
