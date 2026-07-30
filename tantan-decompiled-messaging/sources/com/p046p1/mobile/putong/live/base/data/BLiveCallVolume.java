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
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCallVolume extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCallVolume> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallVolume>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallVolume.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallVolume.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallVolume newInstance() {
            return new BLiveCallVolume();
        }

        public boolean parseField(BLiveCallVolume bLiveCallVolume, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            bLiveCallVolume.f44347id = jsonParser.getValueAsString();
            return false;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallVolume bLiveCallVolume, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCallVolume.f44347id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallVolume) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecallvolume";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44347id;
    public int mode;

    @NonNull
    public ConcurrentHashMap<String, Float> volumes = new ConcurrentHashMap<>();

    public static BLiveCallVolume new_() {
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.nullCheck();
        return bLiveCallVolume;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallVolume mo223809clone() {
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.f44347id = this.f44347id;
        return bLiveCallVolume;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveCallVolume) {
            return ValueObject.util_equals(this.f44347id, ((BLiveCallVolume) obj).f44347id);
        }
        return false;
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
        String str = this.f44347id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44347id == null) {
            this.f44347id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
