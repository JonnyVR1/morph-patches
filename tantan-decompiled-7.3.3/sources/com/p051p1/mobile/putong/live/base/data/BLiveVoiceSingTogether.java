package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveVoiceSingTogether extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSingTogether> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSingTogether>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSingTogether.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSingTogether.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSingTogether newInstance() {
            return new BLiveVoiceSingTogether();
        }

        public boolean parseField(BLiveVoiceSingTogether bLiveVoiceSingTogether, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    bLiveVoiceSingTogether.status = BLiveVoiceSingTogehterState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    bLiveVoiceSingTogether.f45358id = jsonParser.getValueAsString();
                    return false;
                case "currentSing":
                    bLiveVoiceSingTogether.currentSing = BLiveVoiceSing.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "nextSing":
                    bLiveVoiceSingTogether.nextSing = BLiveVoiceSing.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSingTogether bLiveVoiceSingTogether, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSingTogether.f45358id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveVoiceSingTogether.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveVoiceSingTogehterState.JSON_ADAPTER.serialize(bLiveVoiceSingTogether.status, jsonGenerator, true);
            }
            if (bLiveVoiceSingTogether.currentSing != null) {
                jsonGenerator.writeFieldName("currentSing");
                BLiveVoiceSing.JSON_ADAPTER.serialize(bLiveVoiceSingTogether.currentSing, jsonGenerator, true);
            }
            if (bLiveVoiceSingTogether.nextSing != null) {
                jsonGenerator.writeFieldName("nextSing");
                BLiveVoiceSing.JSON_ADAPTER.serialize(bLiveVoiceSingTogether.nextSing, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSingTogether) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesingtogether";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveVoiceSing currentSing;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45358id;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveVoiceSing nextSing;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceSingTogehterState status;
    public String toast = "";

    public static BLiveVoiceSingTogether new_() {
        BLiveVoiceSingTogether bLiveVoiceSingTogether = new BLiveVoiceSingTogether();
        bLiveVoiceSingTogether.nullCheck();
        return bLiveVoiceSingTogether;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSingTogether mo225055clone() {
        BLiveVoiceSingTogether bLiveVoiceSingTogether = new BLiveVoiceSingTogether();
        bLiveVoiceSingTogether.f45358id = this.f45358id;
        bLiveVoiceSingTogether.status = this.status;
        BLiveVoiceSing bLiveVoiceSing = this.currentSing;
        if (bLiveVoiceSing != null) {
            bLiveVoiceSingTogether.currentSing = bLiveVoiceSing.mo225055clone();
        }
        BLiveVoiceSing bLiveVoiceSing2 = this.nextSing;
        if (bLiveVoiceSing2 != null) {
            bLiveVoiceSingTogether.nextSing = bLiveVoiceSing2.mo225055clone();
        }
        return bLiveVoiceSingTogether;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSingTogether)) {
            return false;
        }
        BLiveVoiceSingTogether bLiveVoiceSingTogether = (BLiveVoiceSingTogether) obj;
        return ValueObject.util_equals(this.f45358id, bLiveVoiceSingTogether.f45358id) && ValueObject.util_equals(this.status, bLiveVoiceSingTogether.status) && ValueObject.util_equals(this.currentSing, bLiveVoiceSingTogether.currentSing) && ValueObject.util_equals(this.nextSing, bLiveVoiceSingTogether.nextSing);
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
        String str = this.f45358id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveVoiceSingTogehterState bLiveVoiceSingTogehterState = this.status;
        int iHashCode2 = (iHashCode + (bLiveVoiceSingTogehterState != null ? bLiveVoiceSingTogehterState.hashCode() : 0)) * 41;
        BLiveVoiceSing bLiveVoiceSing = this.currentSing;
        int iHashCode3 = (iHashCode2 + (bLiveVoiceSing != null ? bLiveVoiceSing.hashCode() : 0)) * 41;
        BLiveVoiceSing bLiveVoiceSing2 = this.nextSing;
        int iHashCode4 = iHashCode3 + (bLiveVoiceSing2 != null ? bLiveVoiceSing2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45358id == null) {
            this.f45358id = "";
        }
        if (this.status == null) {
            this.status = (BLiveVoiceSingTogehterState) BLiveVoiceSingTogehterState.JSON_ADAPTER.defaultEnum();
        }
        if (this.currentSing == null) {
            this.currentSing = BLiveVoiceSing.new_();
        }
        if (this.nextSing == null) {
            this.nextSing = BLiveVoiceSing.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
