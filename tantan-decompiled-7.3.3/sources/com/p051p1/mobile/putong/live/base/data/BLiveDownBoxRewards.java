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
public class BLiveDownBoxRewards extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDownBoxRewards> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDownBoxRewards>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDownBoxRewards.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDownBoxRewards.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDownBoxRewards newInstance() {
            return new BLiveDownBoxRewards();
        }

        public boolean parseField(BLiveDownBoxRewards bLiveDownBoxRewards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "number":
                    bLiveDownBoxRewards.number = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    bLiveDownBoxRewards.f45206id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveDownBoxRewards.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveDownBoxRewards.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDownBoxRewards bLiveDownBoxRewards, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveDownBoxRewards.f45206id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveDownBoxRewards.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            jsonGenerator.writeNumberField("number", bLiveDownBoxRewards.number);
            String str3 = bLiveDownBoxRewards.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDownBoxRewards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedownboxrewards";

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45206id;

    @ProtobufIndex(index = 3)
    public long number;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveDownBoxRewards new_() {
        BLiveDownBoxRewards bLiveDownBoxRewards = new BLiveDownBoxRewards();
        bLiveDownBoxRewards.nullCheck();
        return bLiveDownBoxRewards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDownBoxRewards mo225055clone() {
        BLiveDownBoxRewards bLiveDownBoxRewards = new BLiveDownBoxRewards();
        bLiveDownBoxRewards.f45206id = this.f45206id;
        bLiveDownBoxRewards.icon = this.icon;
        bLiveDownBoxRewards.number = this.number;
        bLiveDownBoxRewards.type = this.type;
        return bLiveDownBoxRewards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDownBoxRewards)) {
            return false;
        }
        BLiveDownBoxRewards bLiveDownBoxRewards = (BLiveDownBoxRewards) obj;
        return ValueObject.util_equals(this.f45206id, bLiveDownBoxRewards.f45206id) && ValueObject.util_equals(this.icon, bLiveDownBoxRewards.icon) && this.number == bLiveDownBoxRewards.number && ValueObject.util_equals(this.type, bLiveDownBoxRewards.type);
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
        String str = this.f45206id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.number;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.type;
        int iHashCode3 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45206id == null) {
            this.f45206id = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
