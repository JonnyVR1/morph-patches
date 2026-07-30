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
public class BLiveVoiceSweetLimitHouse extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSweetLimitHouse> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSweetLimitHouse>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSweetLimitHouse.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSweetLimitHouse newInstance() {
            return new BLiveVoiceSweetLimitHouse();
        }

        public boolean parseField(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveVoiceSweetLimitHouse.f44512id = jsonParser.getValueAsInt();
                    return false;
                case "wore":
                    bLiveVoiceSweetLimitHouse.wore = jsonParser.getValueAsBoolean();
                    return true;
                case "image":
                    bLiveVoiceSweetLimitHouse.image = jsonParser.getValueAsString();
                    return true;
                case "remainingMill":
                    bLiveVoiceSweetLimitHouse.remainingMill = jsonParser.getValueAsLong();
                    return true;
                case "pageSchema":
                    bLiveVoiceSweetLimitHouse.pageSchema = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveVoiceSweetLimitHouse.f44512id);
            String str = bLiveVoiceSweetLimitHouse.image;
            if (str != null) {
                jsonGenerator.writeStringField("image", str);
            }
            jsonGenerator.writeNumberField("remainingMill", bLiveVoiceSweetLimitHouse.remainingMill);
            jsonGenerator.writeBooleanField("wore", bLiveVoiceSweetLimitHouse.wore);
            String str2 = bLiveVoiceSweetLimitHouse.pageSchema;
            if (str2 != null) {
                jsonGenerator.writeStringField("pageSchema", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSweetLimitHouse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesweetlimithouse";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44512id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String image;

    @NonNull
    @ProtobufIndex(index = 5)
    public String pageSchema;

    @ProtobufIndex(index = 3)
    public long remainingMill;

    @ProtobufIndex(index = 4)
    public boolean wore;

    public static BLiveVoiceSweetLimitHouse new_() {
        BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse = new BLiveVoiceSweetLimitHouse();
        bLiveVoiceSweetLimitHouse.nullCheck();
        return bLiveVoiceSweetLimitHouse;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSweetLimitHouse mo223809clone() {
        BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse = new BLiveVoiceSweetLimitHouse();
        bLiveVoiceSweetLimitHouse.f44512id = this.f44512id;
        bLiveVoiceSweetLimitHouse.image = this.image;
        bLiveVoiceSweetLimitHouse.remainingMill = this.remainingMill;
        bLiveVoiceSweetLimitHouse.wore = this.wore;
        bLiveVoiceSweetLimitHouse.pageSchema = this.pageSchema;
        return bLiveVoiceSweetLimitHouse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSweetLimitHouse)) {
            return false;
        }
        BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse = (BLiveVoiceSweetLimitHouse) obj;
        return this.f44512id == bLiveVoiceSweetLimitHouse.f44512id && ValueObject.util_equals(this.image, bLiveVoiceSweetLimitHouse.image) && this.remainingMill == bLiveVoiceSweetLimitHouse.remainingMill && this.wore == bLiveVoiceSweetLimitHouse.wore && ValueObject.util_equals(this.pageSchema, bLiveVoiceSweetLimitHouse.pageSchema);
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
        int i2 = ((i * 41) + this.f44512id) * 41;
        String str = this.image;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.remainingMill;
        int i3 = (((((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.wore ? 1231 : 1237)) * 41;
        String str2 = this.pageSchema;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.image == null) {
            this.image = "";
        }
        if (this.pageSchema == null) {
            this.pageSchema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
