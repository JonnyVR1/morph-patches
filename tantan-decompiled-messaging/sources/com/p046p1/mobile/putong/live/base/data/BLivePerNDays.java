package com.p046p1.mobile.putong.live.base.data;

import com.clevertap.android.sdk.Constants;
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
public class BLivePerNDays extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePerNDays> JSON_ADAPTER = new ObjectJsonAdapter<BLivePerNDays>() { // from class: com.p1.mobile.putong.live.base.data.BLivePerNDays.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePerNDays.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePerNDays newInstance() {
            return new BLivePerNDays();
        }

        public boolean parseField(BLivePerNDays bLivePerNDays, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("n")) {
                bLivePerNDays.f44420n = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(Constants.PRIORITY_MAX)) {
                return false;
            }
            bLivePerNDays.max = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePerNDays bLivePerNDays, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("n", bLivePerNDays.f44420n);
            jsonGenerator.writeNumberField(Constants.PRIORITY_MAX, bLivePerNDays.max);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePerNDays) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveperndays";

    @ProtobufIndex(index = 2)
    public int max;

    /* JADX INFO: renamed from: n */
    @ProtobufIndex(index = 1)
    public int f44420n;

    public static BLivePerNDays new_() {
        BLivePerNDays bLivePerNDays = new BLivePerNDays();
        bLivePerNDays.nullCheck();
        return bLivePerNDays;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePerNDays mo223809clone() {
        BLivePerNDays bLivePerNDays = new BLivePerNDays();
        bLivePerNDays.f44420n = this.f44420n;
        bLivePerNDays.max = this.max;
        return bLivePerNDays;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePerNDays)) {
            return false;
        }
        BLivePerNDays bLivePerNDays = (BLivePerNDays) obj;
        return this.f44420n == bLivePerNDays.f44420n && this.max == bLivePerNDays.max;
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
        int i2 = (((i * 41) + this.f44420n) * 41) + this.max;
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
