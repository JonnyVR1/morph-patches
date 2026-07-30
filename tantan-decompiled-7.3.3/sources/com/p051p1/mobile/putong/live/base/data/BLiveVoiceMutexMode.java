package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class BLiveVoiceMutexMode extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceMutexMode> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceMutexMode>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceMutexMode.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceMutexMode.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceMutexMode newInstance() {
            return new BLiveVoiceMutexMode();
        }

        public boolean parseField(BLiveVoiceMutexMode bLiveVoiceMutexMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Constants.KEY_KEY)) {
                return false;
            }
            bLiveVoiceMutexMode.key = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceMutexMode bLiveVoiceMutexMode, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceMutexMode.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceMutexMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicemutexmode";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    public static BLiveVoiceMutexMode new_() {
        BLiveVoiceMutexMode bLiveVoiceMutexMode = new BLiveVoiceMutexMode();
        bLiveVoiceMutexMode.nullCheck();
        return bLiveVoiceMutexMode;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceMutexMode mo225055clone() {
        BLiveVoiceMutexMode bLiveVoiceMutexMode = new BLiveVoiceMutexMode();
        bLiveVoiceMutexMode.key = this.key;
        return bLiveVoiceMutexMode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceMutexMode) {
            return ValueObject.util_equals(this.key, ((BLiveVoiceMutexMode) obj).key);
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
        String str = this.key;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
