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
public class BLiveVoicehouseReward extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoicehouseReward> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicehouseReward>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicehouseReward.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicehouseReward.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicehouseReward newInstance() {
            return new BLiveVoicehouseReward();
        }

        public boolean parseField(BLiveVoicehouseReward bLiveVoicehouseReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("image")) {
                bLiveVoicehouseReward.image = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bLiveVoicehouseReward.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicehouseReward bLiveVoicehouseReward, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoicehouseReward.image;
            if (str != null) {
                jsonGenerator.writeStringField("image", str);
            }
            String str2 = bLiveVoicehouseReward.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicehouseReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicehousereward";

    @NonNull
    @ProtobufIndex(index = 1)
    public String image;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveVoicehouseReward new_() {
        BLiveVoicehouseReward bLiveVoicehouseReward = new BLiveVoicehouseReward();
        bLiveVoicehouseReward.nullCheck();
        return bLiveVoicehouseReward;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicehouseReward mo225055clone() {
        BLiveVoicehouseReward bLiveVoicehouseReward = new BLiveVoicehouseReward();
        bLiveVoicehouseReward.image = this.image;
        bLiveVoicehouseReward.title = this.title;
        return bLiveVoicehouseReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoicehouseReward)) {
            return false;
        }
        BLiveVoicehouseReward bLiveVoicehouseReward = (BLiveVoicehouseReward) obj;
        return ValueObject.util_equals(this.image, bLiveVoicehouseReward.image) && ValueObject.util_equals(this.title, bLiveVoicehouseReward.title);
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
        String str = this.image;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.image == null) {
            this.image = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
