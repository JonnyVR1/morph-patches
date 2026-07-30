package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveScrapLiveRight extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrapLiveRight> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrapLiveRight>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrapLiveRight.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrapLiveRight.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrapLiveRight newInstance() {
            return new BLiveScrapLiveRight();
        }

        public boolean parseField(BLiveScrapLiveRight bLiveScrapLiveRight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                bLiveScrapLiveRight.status = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("expiredTime")) {
                return false;
            }
            bLiveScrapLiveRight.expiredTime = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrapLiveRight bLiveScrapLiveRight, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveScrapLiveRight.expiredTime;
            if (str != null) {
                jsonGenerator.writeStringField("expiredTime", str);
            }
            String str2 = bLiveScrapLiveRight.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrapLiveRight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescrapliveright";

    @NonNull
    @ProtobufIndex(index = 1)
    public String expiredTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;

    public static BLiveScrapLiveRight new_() {
        BLiveScrapLiveRight bLiveScrapLiveRight = new BLiveScrapLiveRight();
        bLiveScrapLiveRight.nullCheck();
        return bLiveScrapLiveRight;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrapLiveRight mo223809clone() {
        BLiveScrapLiveRight bLiveScrapLiveRight = new BLiveScrapLiveRight();
        bLiveScrapLiveRight.expiredTime = this.expiredTime;
        bLiveScrapLiveRight.status = this.status;
        return bLiveScrapLiveRight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrapLiveRight)) {
            return false;
        }
        BLiveScrapLiveRight bLiveScrapLiveRight = (BLiveScrapLiveRight) obj;
        return ValueObject.util_equals(this.expiredTime, bLiveScrapLiveRight.expiredTime) && ValueObject.util_equals(this.status, bLiveScrapLiveRight.status);
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
        String str = this.expiredTime;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.expiredTime == null) {
            this.expiredTime = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
