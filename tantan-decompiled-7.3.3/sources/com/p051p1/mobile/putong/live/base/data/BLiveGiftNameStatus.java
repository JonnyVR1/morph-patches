package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveGiftNameStatus extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftNameStatus> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftNameStatus>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftNameStatus.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftNameStatus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftNameStatus newInstance() {
            return new BLiveGiftNameStatus();
        }

        public boolean parseField(BLiveGiftNameStatus bLiveGiftNameStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                bLiveGiftNameStatus.status = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("userName")) {
                return false;
            }
            bLiveGiftNameStatus.userName = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftNameStatus bLiveGiftNameStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(NotificationCompat.CATEGORY_STATUS, bLiveGiftNameStatus.status);
            String str = bLiveGiftNameStatus.userName;
            if (str != null) {
                jsonGenerator.writeStringField("userName", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftNameStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftnamestatus";

    @ProtobufIndex(index = 1)
    public boolean status;

    @Nullable
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveGiftNameStatus new_() {
        BLiveGiftNameStatus bLiveGiftNameStatus = new BLiveGiftNameStatus();
        bLiveGiftNameStatus.nullCheck();
        return bLiveGiftNameStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftNameStatus mo225055clone() {
        BLiveGiftNameStatus bLiveGiftNameStatus = new BLiveGiftNameStatus();
        bLiveGiftNameStatus.status = this.status;
        bLiveGiftNameStatus.userName = this.userName;
        return bLiveGiftNameStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftNameStatus)) {
            return false;
        }
        BLiveGiftNameStatus bLiveGiftNameStatus = (BLiveGiftNameStatus) obj;
        return this.status == bLiveGiftNameStatus.status && ValueObject.util_equals(this.userName, bLiveGiftNameStatus.userName);
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
        int i2 = ((i * 41) + (this.status ? 1231 : 1237)) * 41;
        String str = this.userName;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
